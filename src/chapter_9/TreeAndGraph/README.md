## 트리와 그래프

### Tree - 트리
- 1개의 루트 노드를 가진다 (일반적인 프로그램에서)
- 0개 이상의 자식 노드를 가진다.
- 자식 노드는 0개 이상의 자식 노드를 가진다.
- 트리는 cycle 를 가질 수 없다.

#### 1. Binary Tree (이진 트리)
- 각 노드가 최대 2개의 자식을 갖는 트리( 0 <= 2)

#### 2. Binary Search Tree (탐색 이진 트리)
- '모든 왼쪽 자식들' <= n < '모든 오른쪽 자식들'
- 모든 노드 n 에 대해서 반드시 참이여야 한다.
<img src="/src/chapter_9/TreeAndGraph/img/img-1.png" width="500px;">

#### 3. Complete Binary Tree (완전 이진 트리)
- 트리의 모든 높이에서 노드가 꽉 차 있는 이진 트리
- 마지막 단계(level)는 꽉 차 있지 않아도 되지만 노드가 왼쪽에서 오른쪽으로 채워져야 한다.
<img src="/src/chapter_9/TreeAndGraph/img/img-2.png" width="500px;">

#### 4. Full Binary Tree (전 이진 트리)
- 모든 노드의 자식이 없거나 정확히 2개 있는 경우
- 즉, 자식이 하나만 존재해서는 안된다.
<img src="/src/chapter_9/TreeAndGraph/img/img-3.png" width="500px;">

#### 5. Perfect Binary Tree (포화 이진 트리)
- Full Binary Tree 이면서  Complete Binary Tree 인 경우
- 모든 말단 노드는 같은 높이에 있어야하고, 마지막 단계에서 노드의 개수가 최대가 되어야 한다.
<img src="/src/chapter_9/TreeAndGraph/img/img-4.png" width="500px;">

### 이진 트리 순회
- in-order traversal (중위 순회)
  - 왼쪽 가지 -> 현재 노드 -> 오른쪽 가지 , 순서로 순회
- post-order traversal (후위 순회)
  - 자식노드 보다 현재 노드를 먼저 순회 (루트 노드에 항상 먼저 방문)
- pre-order traversal (전위 순회)
  - 모든 자식노드들을 먼저 방문 후 마지막에 현재 노드를 방문 (루트 노드에 항상 마지막에 방문)
    
### Binary heaps (min-heaps, max-heaps)
> max-heaps (최대힙)은 원소가 내리차순으로 정렬되어 있다는 점만 다를 뿐 min-heaps 와 같다.
- min-heaps
  - Complete Binary Tree 이며, 각 노드의 원소가 자식들의 원소보다 작다.
  - 따라서, 루트는 트리 전체에서 가장 작은 원소가 된다.
<img src="/src/chapter_9/TreeAndGraph/img/img-5.png" width="500px;">    
- insert, extract-min 연산이 있음
  - insert (삽입)
    1. Complete Binary Tree 의 속성에 위배 되지 않게 새로운 원소는 밑바닥 가장 오른쪽 위치에 삽입
    2. 새로 삽입된 원소가 제대로된 자리를 찾을때까지 부모 노드와 교환하며 최소 원소를 위쪽으로 올려나감
  > heaps 에 있는 노드의 개수가 n 일 때 O(log n) 시간이 걸린다.
  - extract_min (최소 원소 뽑아내기)
    1. 가장 위에 있는 원소 빼기
    2. 가장 마지막 원소(밑바닥 가장 왼쪽에 위치한 노드)와 루트 노드 교체
    3. 루트 노드에 위치한 원소를 자식 노드와 비교 및 위치를 교환하며 밑으로 내려보낸다.<br>
       (min-heaps 속성을 유지하기 위해서 자식 중 더 낮은 원소와 교환해야 한다.)
  > O(log n) 시간이 걸린다.
<img src="/src/chapter_9/TreeAndGraph/img/img-6.png" width="500px;">
  
### Trie Tree (prefix tree)
  - n-차 트리(n-any Tree)의 변종으로 각 노드에 문자를 저장하는 자료구조<br>
    (따라서 트리를 아래쪽으로 순회하면 단어 하나가 나온다)
  - null node 는 단어의 끝을 나타낸다.
  - 각 노드는 1개 ~ Alphabet_size + 1개 까지의 자식을 가진다.
  - 접두사를 빠르게 찾아보기 위한 흔한 자료구조
  - K 인 문자열이 주어졌을때 O(K) 시간이 걸림 (Hash Table 과 같다)
<img src="/src/chapter_9/TreeAndGraph/img/img-7.png" width="500px;">
