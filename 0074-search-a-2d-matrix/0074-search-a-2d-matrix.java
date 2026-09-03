class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int s=0;
        int e=matrix.length-1;
             int mid=( s+e)/2;
        while(s<=e)
        {
           
                mid=( s+e)/2;
            if( matrix[mid][0]==target)return true;
            if(matrix[mid][0]> target)
            {
                e= mid-1;
            }
            else 
            {
                s= mid+1;
            }
        }

        // e is now the row whose first element is <= target

        if(e<0)
        {
            return false;
        }
        mid=e;
        s=0; e=matrix[0].length-1;
        while(s<=e)
        {
            int midd=(s+e)/2;
            if(matrix[mid][midd]== target )return true;

            else if(matrix[mid][midd]>target)e= midd-1;
            else s= midd+1;
        }
        return false;

    }
}
/*class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        
       int m = matrix.size();
       int n = matrix[0].size();

       int low = 0;
       int high = n * m - 1;

       while(low <= high){
        int mid = low + (high - low)/2;

        int row = mid / n;
        int col = mid % n;

        if(matrix[row][col] == target)
             return true;

        else if(matrix[row][col] < target)
            low = mid + 1;
        
        else
           high = mid - 1;
       }           
        return false;
    }
};*/