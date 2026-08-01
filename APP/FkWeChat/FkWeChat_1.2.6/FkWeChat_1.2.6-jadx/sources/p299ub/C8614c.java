package p299ub;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: ub.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8614c {

    /* JADX INFO: renamed from: a */
    public static final C8614c f28651a = new C8614c();

    /* JADX INFO: renamed from: b */
    public static final Charset f28652b;

    /* JADX INFO: renamed from: c */
    public static final Charset f28653c;

    /* JADX INFO: renamed from: d */
    public static final Charset f28654d;

    /* JADX INFO: renamed from: e */
    public static final Charset f28655e;

    /* JADX INFO: renamed from: f */
    public static final Charset f28656f;

    /* JADX INFO: renamed from: g */
    public static final Charset f28657g;

    /* JADX INFO: renamed from: h */
    public static volatile Charset f28658h;

    /* JADX INFO: renamed from: i */
    public static volatile Charset f28659i;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        charsetForName.getClass();
        f28652b = charsetForName;
        Charset charsetForName2 = Charset.forName("UTF-16");
        charsetForName2.getClass();
        f28653c = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16BE");
        charsetForName3.getClass();
        f28654d = charsetForName3;
        Charset charsetForName4 = Charset.forName("UTF-16LE");
        charsetForName4.getClass();
        f28655e = charsetForName4;
        Charset charsetForName5 = Charset.forName("US-ASCII");
        charsetForName5.getClass();
        f28656f = charsetForName5;
        Charset charsetForName6 = Charset.forName("ISO-8859-1");
        charsetForName6.getClass();
        f28657g = charsetForName6;
    }

    /* JADX INFO: renamed from: a */
    public final Charset m33083a() {
        Charset charset = f28659i;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32BE");
        charsetForName.getClass();
        f28659i = charsetForName;
        return charsetForName;
    }

    /* JADX INFO: renamed from: b */
    public final Charset m33084b() {
        Charset charset = f28658h;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32LE");
        charsetForName.getClass();
        f28658h = charsetForName;
        return charsetForName;
    }
}
