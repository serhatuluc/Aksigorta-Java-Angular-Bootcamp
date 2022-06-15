function shift_array(array, r) {
     for (let i=0; i<array.length-r; i++){
        value = array.pop()
        array.unshift(value)
     }
 return array }