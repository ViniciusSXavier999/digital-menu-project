import { useState } from 'react';
import './App.css'
import { Card } from './components/card/card';
import { useMenuData } from './hooks/useMenuData';
import { CreateModal } from './components/create-modal/create-modal';

function App() {
  // Dados que vou pegar da minha API e fazer um get no front-end
  // esse data vai representar os dados que vão vir da api
  const { data } = useMenuData();

  const [isModalOpen, setIsModalOpen] = useState(false)

  const handleOpenModal = () => {
    setIsModalOpen(prev => !prev)
  }

  return (
      <div className='container'>
        <h1>Cardápio</h1>
        <div className="card-grid">
          {data?.map(menuData =>
           <Card
           price={menuData.price} 
           title={menuData.title}
           image={menuData.image}
           />
           )}
        </div>

        {isModalOpen && <CreateModal closeModal={handleOpenModal}/>}
        <button onClick={handleOpenModal}>novo</button>
      </div>
        
  )
}

export default App
