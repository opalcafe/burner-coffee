package xyz.cloudcoffee.burnerlibrary

class BurnerModule {
    companion object {
        fun createApplication(number : Int): String {
            return "App = $number"
        }
    }
}