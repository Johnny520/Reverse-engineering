package com.android.dx.command.dump;

import com.android.dx.cf.direct.DirectClassFile;
import com.android.dx.cf.direct.StdAttributeFactory;
import com.android.dx.util.ByteArray;
import java.io.PrintStream;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ClassDumper extends BaseDumper {
    private ClassDumper(byte[] bArr, PrintStream printStream, String str, Args args) {
        super(bArr, printStream, str, args);
    }

    public void dump() {
        byte[] bytes = getBytes();
        ByteArray byteArray = new ByteArray(bytes);
        DirectClassFile directClassFile = new DirectClassFile(byteArray, getFilePath(), getStrictParse());
        directClassFile.setAttributeFactory(StdAttributeFactory.THE_ONE);
        directClassFile.setObserver(this);
        directClassFile.getMagic();
        int readBytes = getReadBytes();
        if (readBytes != bytes.length) {
            parsed(byteArray, readBytes, bytes.length - readBytes, "<extra data at end of file>");
        }
    }

    public static void dump(byte[] bArr, PrintStream printStream, String str, Args args) {
        new ClassDumper(bArr, printStream, str, args).dump();
    }
}
