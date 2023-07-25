fun main() {
    val tvListener = MyTVListener()
    val setupBox = TVSetupBox(tvListener)
    val remote = Remote(setupBox, tvListener)

    // Simulating remote control actions
    remote.powerButtonPressed() // Power on
    remote.numberButtonPressed(5) // Change to channel 5
    remote.powerButtonPressed() // Power off
}