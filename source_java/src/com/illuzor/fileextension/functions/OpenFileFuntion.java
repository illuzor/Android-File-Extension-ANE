package com.illuzor.fileextension.functions;

import java.io.File;

import android.content.Intent;
import android.net.Uri;
import android.webkit.MimeTypeMap;

import com.adobe.fre.*;

public class OpenFileFuntion implements FREFunction {

        @Override
        public FREObject call(FREContext context, FREObject[] args) {
                try {
                        String filePath = args[0].getAsString();
                        Intent fileIntent = new Intent();
                        fileIntent.setAction(Intent.ACTION_VIEW);
                        File file = new File(filePath);
                        
                        MimeTypeMap mimeMap = MimeTypeMap.getSingleton();
                        String extention = file.getName().substring(file.getName().indexOf(".")+1);
                        String type = mimeMap.getMimeTypeFromExtension(extention);
                
                        fileIntent.setDataAndType(Uri.fromFile(file), type);
                        context.getActivity().startActivity(fileIntent);
                } catch (Exception e) {
                        e.printStackTrace();
                }

                return null;
        }

}