package org.apache.commons.p014io;

import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class DirectoryWalker$CancelException extends IOException {
    private static final long serialVersionUID = 1347339620135041008L;
    private final int depth;
    private final File file;

    public DirectoryWalker$CancelException(String str, File file, int i) {
        super(str);
        this.file = file;
        this.depth = i;
    }

    public int getDepth() {
        return this.depth;
    }

    public File getFile() {
        return this.file;
    }

    public DirectoryWalker$CancelException(File file, int i) {
        this("Operation Cancelled", file, i);
    }
}
