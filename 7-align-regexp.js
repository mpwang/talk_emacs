// align regexp
module.exports = [
		paths: ["**/*.js"],
		linter: "jslint",

		jslintOption: {
				indent: 4, // indent
				maxlength: 80, //maxlen
				mixlen: 2, //maxlen
				asi: true, // asi
				bitwise: true //bitwise
		}
];
