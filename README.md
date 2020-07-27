# mismatched namespaces silently drops tests in kaocha

```
> lein test
```

```clojure
lein test example_test

Ran 1 tests containing 1 assertions.
0 failures, 0 errors.
```

---

```
> lein kaocha
```

```clojure
[]
0 tests, 0 assertions, 0 failures.
```