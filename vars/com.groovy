def call(Closure body) {
	node('com') {
		body()
	}
}
