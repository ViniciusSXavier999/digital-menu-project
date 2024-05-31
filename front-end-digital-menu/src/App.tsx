import './App.css'
import { Card } from './components/card/card';

function App() {
  // Dados que vou pegar da minha API e fazer um get no front-end
  // esse data vai representar os dados que vão vir da api
  const data = [];
  return (
      <div className='container'>
        <h1>Cardápio</h1>
        <div className="card-grid">
          {data.map(menuData => <Card/>)}
        </div>

      </div>
        
  )
}

export default App
