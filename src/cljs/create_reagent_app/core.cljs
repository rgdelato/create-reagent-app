(ns create-reagent-app.core
  (:require
   [reagent.core :as reagent]))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Page

(defn page []
  [:div {:class "App"}
    [:div {:class "App-header"}
      [:img {:src "./logo.svg" :class "App-logo" :alt "logo"}]
      [:h2 "Welcome to React"]]
    [:p {:class "App-intro"}
      "To get started, edit " [:code "src/App.js"] " and save to reload."]])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Initialize App

(defn dev-setup []
  (when ^boolean js/goog.DEBUG
    (enable-console-print!)
    (println "dev mode")))


(defn reload []
  (reagent/render [page]
                  (js/document.getElementById "app")))

(defn ^:export main []
  (dev-setup)
  (reload))
