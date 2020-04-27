(ns shadow-cljs-react.app
  (:require
   ["react" :as react]
   ["react-dom" :as react-dom]))

(defn greeter []
  (let [name "Fred"] (react/createElement "div" nil (str "Hello " name))))

(defn init []
  (react-dom/render (react/createElement "div" nil (greeter)) (js/document.getElementById "root")))