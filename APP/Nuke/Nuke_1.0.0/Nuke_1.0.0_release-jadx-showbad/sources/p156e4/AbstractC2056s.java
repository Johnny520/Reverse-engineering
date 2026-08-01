package p156e4;

import java.io.IOException;
import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: e4.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2056s {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static int m3760a(int i5, int i6, int i7) throws IOException {
        if ((i6 & 8) != 0) {
            i5--;
        }
        if (i7 <= i5) {
            return i5 - i7;
        }
        throw new IOException(AbstractC0231b.m399j("PROTOCOL_ERROR padding ", i7, " > remaining length ", i5));
    }
}
