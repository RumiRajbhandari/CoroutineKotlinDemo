import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    exampleBlocking()
}

suspend fun printlndelayed(message: String) {
    delay(timeMillis = 1000)
    println(message)
}

fun exampleBlocking() = runBlocking {
    println("one - from thread ${Thread.currentThread().name}")
    printlndelayed("two - from thread ${Thread.currentThread().name}")
    println("three - from thread ${Thread.currentThread().name}")
}

