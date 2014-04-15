class UrlMappings {

	static mappings = {
		"/sample"(resource: "sample")

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
