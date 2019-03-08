import io.reactivex.Observable

fun main() {
		println("Hello from project!");
		moduleAfunction()
		moduleBfunction()


	Observable.just("Hello from RxJava dependency in ModuleA!")
			.subscribe(::println)
}
