import logo from './cdci.png';
import './App.css';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <h2>Welcome to devops</h2>
        <img src={logo} className="App-logo" alt="logo" />
        <p>
        Hello guys how are you.... well 
        </p>
        <a
          className="App-link"
          href="https://republicaweb.es/podcast/informe-sobre-herramientas-devops-2020/"
          target="_blank"
          rel="noopener noreferrer"
        >
          Informe sobre herramientas DevOps 2020 ..
        </a>
        <a
          className="App-link"
          href="https://mychatsanboxrepo.s3.eu-central-1.amazonaws.com/gitkraken-report-devops-tools-2020-rw.png"
          target="_blank"
          rel="noopener noreferrer"
        >
          Interesting tools for a devops profile
        </a>
      </header>
    </div>
  );
}

export default App;
