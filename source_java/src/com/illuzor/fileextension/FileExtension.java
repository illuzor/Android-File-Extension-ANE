package com.illuzor.fileextension;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;

public class FileExtension implements FREExtension {
        
        FileExtensionContext context;

        @Override
        public FREContext createContext(String arg0) {
                context = new FileExtensionContext();
                return context;
        }

        @Override
        public void dispose() {
                context.dispose();
                context = null;
        }

        @Override
        public void initialize() {
                // TODO Auto-generated method stub

        }

}