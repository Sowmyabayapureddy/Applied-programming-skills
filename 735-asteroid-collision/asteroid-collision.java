class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n; i++){
            boolean add = true;
            while(!stack.isEmpty() && stack.peek() > 0 && asteroids[i] < 0){
                int val1 = stack.peek();
                int val2 = asteroids[i];
                if(val1 + val2 == 0){
                    stack.pop();
                    add = false;
                    break;
                }
                else if((val1 + val2) < 0)
                stack.pop();
                else{add = false;
                break;
                }
            }
            if(add) stack.push(asteroids[i]);
        }
        int ans[] = new int[stack.size()];
        for(int i = stack.size() - 1; i>=0;i--) ans[i] = stack.pop();
        return ans;
    }
}