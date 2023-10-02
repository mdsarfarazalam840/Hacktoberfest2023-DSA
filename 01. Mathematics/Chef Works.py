
def solve(X, Y):
  # Calculate the difference between X and Y
  hours = Y - X
  # If Y is smaller than X, add 12 hours to the difference
  if Y < X:
    hours += 12
  return hours

t = int(input())


for _ in range(t):
  # Read the starting and ending times
  X, Y = map(int, input().split())
  # Print the number of hours that Chef works
  print(solve(X, Y))
