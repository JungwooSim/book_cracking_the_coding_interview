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
<img src="/src/me/study/collection_framework/img/7.jpeg" width="500px;">

#### 3. Complete Binary Tree (완전 이진 트리)
- 트리의 모든 높이에서 노드가 꽉 차 있는 이진 트리
- 마지막 단계(level)는 꽉 차 있지 않아도 되지만 노드가 왼쪽에서 오른쪽으로 채워져야 한다.
<img src="/src/me/study/collection_framework/img/7.jpeg" width="500px;">

#### 4. Full Binary Tree (전 이진 트리)
- 모든 노드의 자식이 없거나 정확히 2개 있는 경우
- 즉, 자식이 하나만 존재해서는 안된다.
<img src="/src/me/study/collection_framework/img/7.jpeg" width="500px;">

#### 5. Perfect Binary Tree (포화 이진 트리)
- Full Binary Tree 이면서  Complete Binary Tree 인 경우
- 모든 말단 노드는 같은 높이에 있어야하고, 마지막 단계에서 노드의 개수가 최대가 되어야 한다.
<img src="/src/me/study/collection_framework/img/7.jpeg" width="500px;">
