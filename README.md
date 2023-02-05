# Minimal Clojure project for web based development

This is a mini(mal) [Clojure](https://clojure.org) project that you can hack on, with full editor tooling, in the browser. It's VS Code with [Calva](https:/calva.io) running in [GitPod](https://gitpod.io). You'll need a Github account, that's all.

You can of course also hack on it locally on your machine. Then you need to have Java installed.

## Usage

To use this in the browser.

1. Click this link: https://gitpod.io/#https://github.com/PEZ/minimal-clojure
   * You will be prompted to log in, choose to use Github login
   * This will open the repository in a Gitpod workspace in the browser. (Might take a while.)
   * You'll find VS Code running there, ready to let you edit the files in the project.
   * VS Code will have Calva installed, so it's basically a Clojure IDE in the browser.
1. In the VS Code instance open the VS Code command palette and use the command **Start a REPL in your Project and Connect (aka Jack-in)**.
   * Choose the `deps.edn` project type.
   * This will start the Clojure REPL and connect Calva to it.
1. Open the file [src/hello/core.clj](src/hello/core.clj)
1. Run the VS Code command **Calva: Load/Evaluate Current File**
   * This will load/evaluate the Clojure code in the file in the Clojure REPL

Hack away.

## New to Clojure?

There is not much guidance in this repository for Clojure beginners. You might want to check out this guide first: https://calva.io/get-started-with-clojure/ (It also runs in the browser)

## License

The code in this project is open and free to use as you wish. 🗽🍺 (There's not much code here, anyway. 😄)

