function bubbleSort(array){
    for (let i = array.length; i > 0; i--){
        for (let j = 0; j < i-1; j++){
            if (array[j] > array[j+1]){
                let temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
    }
    return array;
}

const ar1 = [4, 1, 2, 8, 20, 15];
console.log(bubbleSort(ar1));
