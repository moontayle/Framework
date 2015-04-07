package com.badlogic.androidgames.framework;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by J_westendarp on 4/7/2015.
 */
public interface FileIO {

    public InputStream readAsset(String fileName) throws IOException;

    public InputStream readFile(String fileName)  throws IOException;

    public OutputStream writeFile(String fileName) throws IOException;
}
