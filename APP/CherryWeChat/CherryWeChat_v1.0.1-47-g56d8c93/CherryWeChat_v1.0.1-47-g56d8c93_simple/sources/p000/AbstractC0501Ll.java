package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: Ll */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0501Ll {

    /* JADX INFO: renamed from: a */
    public static final Charset f1637a = null;

    /* JADX INFO: renamed from: b */
    public static final byte[] f1638b = null;

    static {
        Charset.forName("US-ASCII");
        f1637a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] r1 = new byte[0];
        f1638b = r1;
        ByteBuffer.wrap(r1);
        AbstractC2140ka.m4323h(r1, 0, 0, false);
    }

    /* JADX INFO: renamed from: a */
    public static void m982a(String r0, Object r1) {
        if (r1 == null) goto L5;
        return;
    L5:
        throw new NullPointerException(r0);
    }

    /* JADX INFO: renamed from: b */
    public static int m983b(long r2) {
        return (int) (r2 ^ (r2 >>> 32));
    }
}
