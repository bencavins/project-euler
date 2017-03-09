import math

primes = []

for n in range(2, 2000000):
    divisible = False
    for prime in primes:
        if n % prime == 0:
            divisible = True
            break
    if not divisible:
        print(n) # prints every prime, good for measuring progress
        primes.append(n)

print(sum(primes))