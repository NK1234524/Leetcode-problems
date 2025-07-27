class Leetcode_12{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int size =m+n;
        int ms[]=new int[size];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]) ms[k++]=nums1[i++];
            else ms[k++]=nums2[j++];
        }
        while(i<m){
            ms[k++]=nums1[i++];
        }
        while(j<n){
            ms[k++]=nums2[j++];
        }
        for(int l=0;l<size;l++){
            nums1[l]=ms[l];
        }
    }
}