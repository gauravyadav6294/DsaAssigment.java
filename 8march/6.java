
class Solution{



static void Even(int L,
				int R)
{

if (R < L)
{
	return;
}


if(R % 2 == 0 )
	Even(L, R - 2);
else
	Even(L, R - 1);


if (R % 2 == 0)
{
	System.out.print(R + " ");
}
}




