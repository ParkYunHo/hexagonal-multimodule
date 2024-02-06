rootProject.name = "multimodule"

// v1버전
include("v1:application")
include("v1:domain")
include("v1:bootstrap:new-alliance", "v1:bootstrap:old-alliance")
include("v1:framework:framework-mysql", "v1:framework:framework-resttemplate", "v1:framework:framework-h2")

// v2 버전
include("v2:bootstrap")
