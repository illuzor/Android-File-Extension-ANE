package com.illuzor.fileextension {
	
	import flash.events.StatusEvent;
	import flash.external.ExtensionContext;
	import flash.filesystem.File;
	
	/**
	 * ...
	 * @author illuzor
	 */
	
	public class FileExtension {
		
		private static var context:ExtensionContext;
		
		private static function init():void {
			context = ExtensionContext.createExtensionContext("com.illuzor.extensions.FileExtension", null);
		}
		
		public static function openFile(file:File):void {
			if (!context) init();
			if (file.exists) {
				context.call("openFile", file.nativePath);
			} else {
				throw new Error("File " + file.url + " not exists");
			}
		}
		
		public static function dispose():void {
			if (context) {
				context.dispose();
				context = null;
			}
		}
		
	}
}