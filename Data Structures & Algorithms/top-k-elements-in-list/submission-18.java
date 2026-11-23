
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int elem  : nums){
            map.put(elem,map.getOrDefault(elem, 0)+1);
        }

       ArrayList<Map.Entry<Integer,Integer>>  list = new ArrayList(map.entrySet());

       list.sort(Map.Entry.<Integer,Integer>comparingByValue((a,b)-> b - a));


       int[] result = new int[k];

       
       for(int i=0;i<k;i++){
        result[i] = list.get(i).getKey();
       }
        
        return result;
        // HashMap<Integer, Integer> freq = new HashMap<>();

		// for (int num : nums) {
		// 	freq.put(num, freq.getOrDefault(num, 0) + 1);
		// }

		// int[] elems = new int[freq.size()];

		// int[] freqs = new int[freq.size()];

		// int ind = 0;

		// for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
		// 	elems[ind] = entry.getKey();
		// 	freqs[ind] = entry.getValue();
		// 	ind++;
		// }

		// for (int i = 0; i < freqs.length; i++) {
		// 	for (int j = i + 1; j < freqs.length; j++) {
		// 		if (freqs[i] < freqs[j]) {
		// 			freqs[i] += freqs[j] - (freqs[j] = freqs[i]);
		// 			elems[i] += elems[j] - (elems[j] = elems[i]);
		// 		}
		// 	}
		// }

		// int[] result = new int[k];

		// for (int i = 0; i < k; i++)
		// 	result[i] = elems[i];

		// return result;    
    }
}
