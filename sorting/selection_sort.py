def get_min_index(array, frm):
    min_index = frm
    for i in range(frm, len(array)):
        if array[i] < array[min_index]:
            min_index = i
    return min_index

def selection_sort(array):
    for i in range(len(array)):
        min_index = get_min_index(array, i)
        if array[i] > array[min_index]:
            temp = array[i]
            array[i] = array[min_index]
            array[min_index] = temp    
    return array


print(get_min_index([2, 1, 8, 7, 10], 0))
print(selection_sort([2, 1, 8, 7, 10]))