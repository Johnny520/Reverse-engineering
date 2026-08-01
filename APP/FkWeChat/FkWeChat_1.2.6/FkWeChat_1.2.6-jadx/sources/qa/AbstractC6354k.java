package qa;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import p280t5.C8130u;

/* JADX INFO: renamed from: qa.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6354k {

    /* JADX INFO: renamed from: a */
    public static final byte[] f20021a;

    /* JADX INFO: renamed from: b */
    public static final ByteBuffer f20022b;

    /* JADX INFO: renamed from: qa.k$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface a {
        /* JADX INFO: renamed from: b */
        int mo14092b();
    }

    /* JADX INFO: renamed from: qa.k$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface b {
        /* JADX INFO: renamed from: a */
        a mo14093a(int i10);
    }

    static {
        byte[] bArr = new byte[0];
        f20021a = bArr;
        f20022b = ByteBuffer.wrap(bArr);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m25249a(byte[] bArr) {
        return AbstractC6368y.m25328e(bArr);
    }

    /* JADX INFO: renamed from: b */
    public static String m25250b(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            C8130u.m31512a("UTF-8 not supported?", e10);
            return null;
        }
    }
}
