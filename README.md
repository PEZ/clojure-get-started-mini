# Clojure Get Started Mini(mal) Project

This is a mini(mal) [Clojure](https://clojure.org) project that you can start hacking from. The instructions are for using [Calva](https:/calva.io), a Clojure IDE for Visual Studio Code. You can use it both in VS Code on your machine or directly in the browser, with full editor tooling.

NB: This is not a meant as *Your First Clojure App* project. It is meant as an easy way to take Clojure for a spin in the development environment it is designed to be used: *the Editor*.

Use this project to learn just enough about how a Clojure program is developed, and to check if Clojure might be for you. Then head to the [Where to go Next?](#where-to-go-next) section below for pointers on how you might continue your Clojure journey.

## Usage

Depending wether you will use this in the web browser or on your computer the initial steps differ:

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

[![Open in Gitpod](https://gitpod.io/button/open-in-gitpod.svg)](https://gitpod.io/#https://github.com/PEZ/minimal-clojure)

You will be prompted to log in, choose to use Github login.

This will open the repository in a Gitpod workspace in the browser. (Might take a while.) You'll find VS Code and Calva running there, ready to let you edit the files in the project.
       </td>
       <td>
When used on your own machine you will need:

1. Have Java installed (procedure will vary with platform and your preferences)
1. Have [Visual Studio Code](https://code.visualstudio.com/) installed 
    1. Install Calva from VS Code's Extension pane. 
1. A copy of this repository
    1. Fork it or make a hard copy 
    1. Clone your copy to your computer
1. Open the project folder in VS Code
       </td>
     </tr>
   </tbody>
</table>

### Start the minimal program

With Clojure you hack on the running program that you are developing. We call this **Interactive Programming** (some refer to it as REPL Driven Development, but it is rather a Developer Driven REPL). You start a programming session by starting the program, and it's REPL, then connect your editor to it. With Calva this can be done with a command we refer to as **Jack-in**

1. From the VS Code command palette, use the command **Start a REPL in your Project and Connect (aka Jack-in)**.
   * Choose the `deps.edn` project type.
   * This will start a minimal Clojure program and connect Calva to it.
   * In fact it will be so minimal that it is _only the Clojure REPL_. To build a larger program ...
1. Open the file [src/mini/hello.clj](src/mini/hello.clj) and load it in the REPL
   * (There are instructions in this file for how to do this.)
   * This will define the function `hello` in the `mini.hello` namespace. Your app now has function! You added it without restating the program.

From here you can modify the program further, while it is running, to something more interesting than it is currently with its only function. A very small step from Hello World, there is Fizz Buzz. Please see this video for an example of how to use the REPL for Interactive Programming:

* [Clojure Workflow in VS Code, coding FizzBuzz](https://www.youtube.com/watch?v=d0K1oaFGvuQ)

## New to Clojure?

There is not much guidance in this repository for Clojure beginners. You might want to check out Calva's *Getting Started REPL* first:

1. Open a new VS Code Window
2. Issue the command: **Calva: Fire up the Getting Started REPL***

This will guide you to interactively pick up some basic Calva and Clojure knowledge by using the REPL.

You can read a bit about this guide here: https://calva.io/get-started-with-clojure/ 


## Where to go next?

This will depend on what your goal is. If you want to:

| If you want to...                                            | Check out                                                                                                                                                          |
| ------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| Get help and ask questions in the **friendliest programming community** on the planet Earth | [The Clojurians Slack](http://clojurians.net)                                                                                                                   |
| Be **inspired** by cool videos about Clojure                 | [On The Code Again Youtube channel](https://www.youtube.com/@onthecodeagain)                                                                                                       |
| Learn Clojure in an **entertaining** way                      | [Clojure for the Brave and True](https://www.braveclojure.com/)                                                                                                    |
| Start a **new app** or library, from scratch or from templates | [deps-new](https://github.com/seancorfield/deps-new)                                                                                                             |
| Beginner friendly **app creation**, that stays with your project as it grows | [neil](https://blog.michielborkent.nl/new-clojure-project-quickstart.html) (uses **deps-new**)                                                                                                             |
| Start a new full stack app with **batteries and opinions included** | [Kit Framework](https://kit-clj.github.io/)                                                                                                                     |
| Try a **lean and flexible**, full stack framework, aimed at tiny teams (solo devs even) | [Biff](https://biffweb.com/)                                                                                                                     |
| Get introduced to a **beginner friendly** full stack development | [Donut](https://www.youtube.com/watch?v=PMat9Wdt-pk)                                                                                                                     |
| Spin up a small, yet complete **RESTful API app template** | [startrek](https://github.com/dharrigan/startrek) (uses **Donut**)                                                                                                                    |
| Create a **Single Page Application**                          | [Kit Framework](https://kit-clj.github.io/) (again)                                                                                                               |
| Give your Clojure app a scalable **architecture**             | [Polylith](https://polylith.gitbook.io/polylith/)                                                                                                                 |
| Build a **mobile** (and desktop) app from a template            | [React Native using shadow-cljs in 3 minutes](https://github.com/PEZ/rn-rf-shadow)                                                                               |
| Get your **mind blown** and start building _fully reactive_ full stack apps. _You do not mind cutting yourself on the bleeding edge_ | [Electric Clojure](https://hyperfiddle.notion.site/Electric-Clojure-progress-Dec-2022-5416dda526e24e5ab7ccb7eb48c797ed) |

## Create your own copy of this repository

**If you are using this project from the browser**: In order to be able to version control your edits, you will need to create your own copy of the repository. It's a template project so you can use the green **Use this Template** button above for this.

* **Note**: The URL to use the project in Gitpod changes. What you'll need to do is to prepend the URL of your Github repository copy with `https://gitpod.io/#`. (If you look at the link for the **Open in Gitpod** button above, you'll see that this is how it is constructed.)
* **Note**: The first time you open your copy in Gitpod, it can take quite a while.

## License

The code in this project is open and free to use as you wish. 🗽🍺 (There's not much code here, anyway. 😄)

