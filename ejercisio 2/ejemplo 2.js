function persistence(num){ 
    if(num.toString().length === 1){ //devolver una cadena del objeto num
        return 0;
    }
    let multiplicar = 1;
    let comb = num.toString().split(""); //dividir el objeto string a un array mediante separacion de cadenas

    for(let i=0; i<comb.length; i++){
        multiplicar *=parseFloat(comb[i]); //se convierte a flotante en caso de existir un decimal y se multiplica por el siguiente valor
    }
    return 1 + persistence(parseFloat(multiplicar)); //devuelve un valor no necesariamente en el momento de ser creada
}

console.log(
    persistence(39),
    persistence(999),
    persistence(4)
);