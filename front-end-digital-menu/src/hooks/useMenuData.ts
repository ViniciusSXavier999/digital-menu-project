import axios, { AxiosPromise } from "axios"
import { MenuData } from "../interface/MenuData";
import { useQuery } from "@tanstack/react-query";

const API_URL = 'http://localhost:8080'

const fetchData = async (): AxiosPromise<MenuData[]>  => {
    const response = axios.get(API_URL + '/menu')
    return response;
}

export function useMenuData(){
    const query = useQuery({
        queryFn: fetchData,
        queryKey: ['menu-data'],
        retry: 2

    })

    return {
        ...query,
        data: query.data?.data    
    }

}