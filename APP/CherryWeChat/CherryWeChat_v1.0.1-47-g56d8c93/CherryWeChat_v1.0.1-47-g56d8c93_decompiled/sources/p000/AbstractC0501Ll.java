package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: Ll */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0501Ll {

    /* JADX INFO: renamed from: a */
    public static final Charset f1637a;

    /* JADX INFO: renamed from: b */
    public static final byte[] f1638b;

    static {
        Charset.forName("US-ASCII");
        f1637a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f1638b = bArr;
        ByteBuffer.wrap(bArr);
        AbstractC2140ka.m4323h(bArr, 0, 0, false);
    }

    /* JADX INFO: renamed from: a */
    public static void m982a(String str, Object obj) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m983b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
