function getMinIndex(array, frm){
    let indx = frm;
    for (let i = frm+1; i < array.length; i++){
        if (array[i] < array[indx]){
            indx = i;
        }
    }
    return indx;
}

//console.log(getMinIndex([8, 3, 10, 7, 5, 20], 0));

function SelectionSort(array){
    for (let i = 0; i < array.length; i++){
        let minIndex = getMinIndex(array, i);
        if (array[i] > array[minIndex]){
            let temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
    return array;
}

console.log(SelectionSort([8, 3, 10, 7, 5, 20]));