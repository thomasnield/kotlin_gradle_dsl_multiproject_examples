
include(":ModuleA",":ModuleB")

project(":ModuleA").projectDir = File("../ModuleA")
project(":ModuleB").projectDir = File("../ModuleB")

