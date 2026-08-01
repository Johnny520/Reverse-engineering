package org.apache.commons.io;

import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class FileExistsException extends IOException {
    private static final long serialVersionUID = 1;

    public FileExistsException(File file) {
        super("File " + file + " exists");
    }

    public FileExistsException() {
    }

    public FileExistsException(String str) {
        super(str);
    }
}
