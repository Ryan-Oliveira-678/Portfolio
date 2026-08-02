const numero = parseInt(prompt("Digite um número para ver a tabuada:"));

if(numero >= 1 && numero <= 10) {
    for(let i = 1; i <= 10; i++) {
        console.log(`${numero} x ${i} = ${numero * i}`);
    }
} else {
    console.log("Por favor, digite um número entre 1 e 10.");
}