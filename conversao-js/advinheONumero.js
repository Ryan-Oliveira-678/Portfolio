const numeroSecreto = Math.floor(Math.random() * 10) + 1;
let numero = prompt("Adivinhe o número secreto entre 1 e 10:");

while (parseInt(numero) !== numeroSecreto) {
    if(numero > numeroSecreto) {
        numero = prompt("O número secreto é menor. Tente novamente:");
    } else if(numero < numeroSecreto) {
        numero = prompt("O número secreto é maior. Tente novamente:");
    }else {
        numero = prompt("Por favor, insira um número válido entre 1 e 10:");
    }
    }
    alert(`você acertou! o número secreto era: ${numeroSecreto}`);
