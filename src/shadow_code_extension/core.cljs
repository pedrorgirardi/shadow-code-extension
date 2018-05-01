(ns shadow-code-extension.core
  (:require ["vscode" :refer (commands window)]))

(defn cmds [context]
  {"shadow.code.extension.welcome" #(.showInformationMessage window "VS Code Extension Development with Shadow CLJS")})


(defn activate [context]
  (doseq [[cmd f] (cmds context)]
    (.registerCommand commands cmd f))
  
  (js/console.log "Extension is active."))
