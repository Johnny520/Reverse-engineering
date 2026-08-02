package p000;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: wq */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0856wq {

    /* JADX INFO: renamed from: a */
    public static final Charset f12612a;

    /* JADX INFO: renamed from: b */
    public static final Charset f12613b;

    /* JADX INFO: renamed from: c */
    public static final Charset f12614c;

    /* JADX INFO: renamed from: d */
    public static volatile Charset f12615d;

    /* JADX INFO: renamed from: e */
    public static volatile Charset f12616e;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        charsetForName.getClass();
        f12612a = charsetForName;
        Charset.forName("UTF-16").getClass();
        Charset charsetForName2 = Charset.forName("UTF-16BE");
        charsetForName2.getClass();
        f12613b = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16LE");
        charsetForName3.getClass();
        f12614c = charsetForName3;
        Charset.forName("US-ASCII").getClass();
        Charset.forName("ISO-8859-1").getClass();
    }
}
