Implemented following algorithms for basic **Union Find** problem:

(Don't forget the best performance belongs to the **"Weighted quick-union with path compression"**, the class WeightedQuickUnionWithPathCompression. Always use that one!)

* **Quick-Find** (EXPENSIVE!) This solution do not scale
  * Initialize: O(N)
  * union O(N)
  * Connected O(1) (find if two nodes are connected or not)
* **Quick-Union** (Lazy Approach)
  * Initialize: O(N)
  * Union O(N) + cost of finding roots
  * Connected O(N) (worst case)
* **Weighted quick-union**  
  * Initialize: O(N)
  * Union O(logN)  (+ cost of finding roots)
  * Connected O(logN)
* **Quick-union with path compression**
  * Initialize: O(N)
  * Union O(logN)  (+ cost of finding roots)
  * Connected <= O(logN)
* **Weighted quick-union with path compression**
  * Initialize: O(N)
  * Union O(log*N)  (+ cost of finding roots)
  * Connected <= O(log*N)
  
Amazing fact:
Weighted quick-union with path compression
reduces union-find operations incredibly.
  
O(lg*N) is practically linear even though theoretically not.

So, for instance for finding that for N: 2^65536, log*N equals to 5
That means even for huge components, m union or find operations
complexity O(m.log*n) which is an acceptable performance. 
