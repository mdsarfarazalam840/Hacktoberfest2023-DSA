# cook your dish here
def solve(X):
  
  if X > 100:
    X -= 10
  return X
  
t = int(input())


for _ in range(t):
  
  X = int(input())
  
  print(solve(X))
