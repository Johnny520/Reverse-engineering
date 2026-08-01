package p149d3;

import java.nio.charset.Charset;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: d3.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1973a {

    /* JADX INFO: renamed from: a */
    public static final Charset f6662a;

    /* JADX INFO: renamed from: b */
    public static final Charset f6663b;

    /* JADX INFO: renamed from: c */
    public static final Charset f6664c;

    /* JADX INFO: renamed from: d */
    public static volatile Charset f6665d;

    /* JADX INFO: renamed from: e */
    public static volatile Charset f6666e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Charset charsetForName = Charset.forName("UTF-8");
        AbstractC1665j.m2984d(charsetForName, "forName(...)");
        f6662a = charsetForName;
        AbstractC1665j.m2984d(Charset.forName("UTF-16"), "forName(...)");
        Charset charsetForName2 = Charset.forName("UTF-16BE");
        AbstractC1665j.m2984d(charsetForName2, "forName(...)");
        f6663b = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16LE");
        AbstractC1665j.m2984d(charsetForName3, "forName(...)");
        f6664c = charsetForName3;
        AbstractC1665j.m2984d(Charset.forName("US-ASCII"), "forName(...)");
        AbstractC1665j.m2984d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
