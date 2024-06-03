import './App.css'
import { Card } from './components/card/card';
import { useMenuData } from './hooks/useMenuData';
import { MenuData } from './interface/MenuData';

function App() {
  // Dados que vou pegar da minha API e fazer um get no front-end
  // esse data vai representar os dados que vão vir da api
  const { data } = useMenuData();

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

      </div>
        
  )
}

export default App
