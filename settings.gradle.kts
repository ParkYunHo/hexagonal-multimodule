rootProject.name = "multimodule"

include("application", "domain", "bootstrap")
include("framework:framework-mysql", "framework:framework-resttemplate")
