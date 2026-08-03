package p218og;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: og.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3137a {

    /* JADX INFO: renamed from: a */
    public static final Charset f10177a;

    /* JADX INFO: renamed from: b */
    public static final Charset f10178b;

    /* JADX INFO: renamed from: c */
    public static volatile Charset f10179c;

    /* JADX INFO: renamed from: d */
    public static volatile Charset f10180d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Charset charsetForName = Charset.forName("UTF-8");
        charsetForName.getClass();
        f10177a = charsetForName;
        Charset.forName("UTF-16").getClass();
        Charset.forName("UTF-16BE").getClass();
        Charset.forName("UTF-16LE").getClass();
        Charset charsetForName2 = Charset.forName("US-ASCII");
        charsetForName2.getClass();
        f10178b = charsetForName2;
        Charset.forName("ISO-8859-1").getClass();
    }
}
