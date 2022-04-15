package com.applex.floatingreactions.flyingReactionsView

import java.util.*

class RandomUtil {
    /**
     * Generates the random between two given integers.
     */
    fun generateRandomBetween(start: Int, end: Int): Int {
        val random = Random()
        var rand: Int = random.nextInt(Int.MAX_VALUE - 1) % end
        if (rand < start) {
            rand = start
        }
        return rand
    }
}