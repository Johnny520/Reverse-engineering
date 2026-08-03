package p000;

import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: na */
/* JADX INFO: loaded from: classes.dex */
public class C2273na extends IOException {
    public C2273na(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": ".concat(str));
        }
        super(sb.toString());
    }

    public C2273na(String str, int i, IOException iOException) {
        super(str + ", status code: " + i, iOException);
    }

    public C2273na(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    public C2273na(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
    }
}
