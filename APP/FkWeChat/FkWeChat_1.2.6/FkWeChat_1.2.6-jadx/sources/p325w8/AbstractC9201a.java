package p325w8;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: w8.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9201a {
    /* JADX INFO: renamed from: a */
    public static final long m35828a(InputStream inputStream, OutputStream outputStream, int i10) throws IOException {
        inputStream.getClass();
        outputStream.getClass();
        byte[] bArr = new byte[i10];
        int i11 = inputStream.read(bArr);
        long j10 = 0;
        while (i11 >= 0) {
            outputStream.write(bArr, 0, i11);
            j10 += (long) i11;
            i11 = inputStream.read(bArr);
        }
        return j10;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ long m35829b(InputStream inputStream, OutputStream outputStream, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return m35828a(inputStream, outputStream, i10);
    }
}
