def merge(ar1, ar2):
    result = []
    i = j = 0
    while (i < len(ar1) and (j < len(ar2))):
        if ar1[i] < ar2[j]:
            result.append(ar1[i])
            i += 1
        else:
            result.append(ar2[j])
            j += 1
    while (i < len(ar1)):
        result.append(ar1[i])
        i += 1
    while (j < len(ar2)):
        result.append(ar2[j])
        j += 1
    return result

def merge_sort(array):
    if len(array) <= 1:
        return array
    mid = int(len(array)/2)
    left = merge_sort(array[0:mid])
    right = merge_sort(array[mid:])
    return merge(left, right)

#print(merge([1, 3, 5, 7], [2, 4, 6, 8, 10]))
print(merge_sort([78, 34, 2, 67, 33, 21, 1]))