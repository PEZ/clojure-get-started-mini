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
1. Evaluate the `(ns ...)` form there (instructions in the file)

Hack away.

## New to Clojure?

There is not much guidance in this repository for Clojure beginners. You might want to check out this guide first: https://calva.io/get-started-with-clojure/ (It also runs in the browser)

## Create your own copy of this repository

In order to be able to version control your edits, you will need to create your own copy of this repository. It's a template project so you can use the green **Use this Template** button above for this.

**Note** that then the URL to use the project in Gitpod changes. What you'll need to do is to prepend the URL of your Github repository copy with `https://gitpod.io/#`. (If you look at step one above, you'll see that this is what that link looks like.)

## License

The code in this project is open and free to use as you wish. 🗽🍺 (There's not much code here, anyway. 😄)

