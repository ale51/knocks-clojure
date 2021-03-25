(ns knocks-clojure.core)

;map
(map #(+ % 1) [1 2 3])

;filter
(filter #(= 1 %) [1 2 3])

;every
(every? even? '(2 4 6))
(every? even? '(2 4 5))

;long
(type (long 1))

;int
(type (int 1))

;literal
(type 1)
(type 1.1)
(type "a")

;even?
(even? 2)

;assoc
(assoc {} :age 32)

;get-in
(as-> {:persons [{:age 32 :name "naoki"} {:age 31 :name "yurina"}]} person
      (get-in person [:persons 0 :name])
      )

;get-in(default value)
(as-> {:persons [{:age 32 :name "naoki"} {:age 31 :name "yurina"}]} person
      (get-in person [:persons 2 :name] "machida")
      )

;group by
(def collection
  [
   {:type "A" :point 1}
   {:type "A" :point 2}
   {:type "A" :point 2}
   {:type "B" :point 4}
   ]
  )
(group-by :type collection)
(group-by (juxt :type :point) collection)
