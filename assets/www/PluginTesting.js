var PluginTesting = function() { };

/**
  * @param someData The data to hand to the Java
  * @param successCallback The callback which will be called when directory listing is successful
  * @param failureCallback The callback which will be called when directory listing encouters an error
  */
PluginTesting.prototype.doIt = function(someData, successCallback, failureCallback) {
	console.log("running doIt");
 	return PhoneGap.exec(successCallback,    //Success callback from the plugin
      					 failureCallback,     //Error callback from the plugin
      					'PluginTesting',  //Tell PhoneGap to run "PluginTesting" Plugin
      					'doIt',              //Tell plugin, which action we want to perform
      					[someData]);        //Passing list of args to the plugin
};

PhoneGap.addConstructor(function() {
	console.log("PhoneGap.addConstructor");
	PhoneGap.addPlugin("PluginTesting", new PluginTesting());
});
