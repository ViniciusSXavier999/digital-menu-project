/** FUNÇÃO QUE VAI MANDAR OS DADOS PARA O BACK-END, QUE VAI FAZER O POST NO BACK END */

import axios, { AxiosPromise } from "axios"
import { MenuData } from "../interface/MenuData";
import { useMutation, useQuery, useQueryClient } from "@tanstack/react-query";

const API_URL = 'http://localhost:8080'

const postData = async (data: MenuData ): AxiosPromise<any>  => {
    const response = axios.post(API_URL + '/menu', data)
    return response;
}

export function useMenuDataMutate(){
    const queryClient = useQueryClient(); 
    const mutate = useMutation({
        mutationFn: postData,
        retry: 2,
        onSuccess: () => {
            queryClient.invalidateQueries(['menu-data'])
        }
    })

    return mutate

}