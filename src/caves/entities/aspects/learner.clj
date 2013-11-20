(ns caves.entities.aspects.learner
  (:use [caves.entities.core :only [defaspect]]))

(defaspect Learner
  (gain-experience
   [{:keys [id] :as this} exp-gained world]
   (update-in this [:common-exp] + exp-gained)
   world))
