public class maximum {
public static void main(String[] args) {
int [] nums={45,89,65,98,21,51};
int max= nums[0];
for (int i=1;i<nums.length;i++) {
if(max<nums[i]) {
max= nums[i];
}
}
System.out.println("maximum element is "+max);
}
} 