# Clojure Get Started Mini(mal) Project Template

This is a mini(mal) [Clojure](https://clojure.org) project that you can start hacking from. The instructions are for using [Calva](https:/calva.io), a Clojure IDE for Visual Studio Code. You can use it both in VS Code on your machine or directly in the browser, with full editor tooling.

## Usage

Depending wether you us this in the web browser or on your computer the initial steps differ:

<table>
  <colgroup>
    <col width="50%">
    <col width="50%">
  </colgroup>
   <thead>
     <tr>
       <td><h3>In the browser</h3></td>
       <td><h3>On your machine</h3></td>
     </tr>
   </thead>
   <tbody>
     <tr valign="top">
       <td>
When used in the browser all you need is a Github account, that's all.

[Open this project in Gitpod](https://gitpod.io/#https://github.com/PEZ/minimal-clojure)

You will be prompted to log in, choose to use Github login.

This will open the repository in a Gitpod workspace in the browser. (Might take a while.) You'll find VS Code and Calva running there, ready to let you edit the files in the project.
       </td>
       <td>
When used on your own machine you will need:

1. Have Java installed (procedure will vary with platform and your preferences)
1. Have [Visual Studio Code](https://code.visualstudio.com/) installed 
    1. Install Calva from VS Code's Extension pane. 
1. A copy of this repository
    1. Use the green button above to make your copy
    1. Clone your copy to your computer
1. Open the project folder in VS Code
       </td>
     </tr>
   </tbody>
</table>

### Start the minimal program

With Clojure you hack on the running program that you are developing. You start a programming session by starting the program, and it's REPL, then connect your editor to it. With Calva this can be done with a command we refer to as **Jack-in**

1. From the VS Code command palette, use the command **Start a REPL in your Project and Connect (aka Jack-in)**.
   * Choose the `deps.edn` project type.
   * This will start the Clojure REPL and connect Calva to it. **Note**: It will open the Calva Output/REPL window. This has a prompt to the REPL, but _it is not **the REPL**_. You are encourage to use the REPL directlty from the source files. Hence:
1. Open the file [src/hello/core.clj](src/hello/core.clj)
   * There are some instructions in this file for how to evaluate code.

From here you can modify the program, while it is running, to something more interesting than it is currently. A very small step from Hello World, there is Fizz Buzz. Please see this video for an example of how to use the REPL for Interactive Programming:

* [Clojure Workflow in VS Code, coding FizzBuzz](https://www.youtube.com/watch?v=d0K1oaFGvuQ)

## New to Clojure?

There is not much guidance in this repository for Clojure beginners. You might want to check out Calva's *Getting Started REPL* first:

1. Open a new VS Code Window
2. Issue the command: **Calva: Fire up the Getting Started REPL***

This will guide you to interactively pick up some basic Calva and Clojure knowledge by using the REPL.

You can read a bit about this guide here: https://calva.io/get-started-with-clojure/ 


## Where to go next?

This will depend on what your goal is. If you want to:

* Be inspired by cool videos about Clojure, see the Youtube channel [On The Code Again](https://www.youtube.com/@onthecodeagain)
* Learn Clojure in an entertaining way, go read [Clojure for the Brave and True](https://www.braveclojure.com/)
* Start a new app or library, from scratch or from templates, check out [deps-new](https://github.com/seancorfield/deps-new)
* Start a new full stack app with batteries and opinions included, try [Kit Framework](https://kit-clj.github.io/)
* Create a Single Page Application, see [Kit Framework](https://kit-clj.github.io/) (again)
* Build a cross-platform React Native app from a template, see [React Native using shadow-cljs in 3 minutes](https://github.com/PEZ/rn-rf-shadow)
* Give your Clojure app a scalable architecture, with a unified REPL experience, see [Polylith](https://polylith.gitbook.io/polylith/)
* Get your mind blown and start building _fully reactive_ full stack apps focusing almost purely on your problem domain, and _you do not mind cutting yourself on the bleeding edge_, check [Electric Clojure](https://hyperfiddle.notion.site/Electric-Clojure-progress-Dec-2022-5416dda526e24e5ab7ccb7eb48c797ed) out.
* Get help and ask questions in the friendliest programming community on the planet Earth: [The Clojurians Slack](http://clojurians.net)

## Create your own copy of this repository

_If you are using the this repository from the browser_: In order to be able to version control your edits, you will need to create your own copy of this repository. It's a template project so you can use the green **Use this Template** button above for this.

**Note** that then the URL to use the project in Gitpod changes. What you'll need to do is to prepend the URL of your Github repository copy with `https://gitpod.io/#`. (If you look at step one above, you'll see that this is what that link looks like.)

**Note** that the first time you open your copy in Gitpod, it can take quite a while.

## License

The code in this project is open and free to use as you wish. 🗽🍺 (There's not much code here, anyway. 😄)

