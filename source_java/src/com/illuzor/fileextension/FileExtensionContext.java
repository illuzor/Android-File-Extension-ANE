package com.illuzor.fileextension;

import java.util.HashMap;
import java.util.Map;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.illuzor.fileextension.functions.OpenFileFuntion;

public class FileExtensionContext extends FREContext {

        @Override
        public void dispose() {
                // TODO Auto-generated method stub
        }

        @Override
        public Map<String, FREFunction> getFunctions() {
                Map<String, FREFunction> map = new HashMap<String, FREFunction>();
                map.put("openFile", new OpenFileFuntion());
                return map;
        }

}