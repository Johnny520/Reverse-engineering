package p000;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0096c9 {

    /* JADX INFO: renamed from: a */
    public static final Charset f928a;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        AbstractC0346ip.m1502n("forName(...)", charsetForName);
        f928a = charsetForName;
        AbstractC0346ip.m1502n("forName(...)", Charset.forName("UTF-16"));
        AbstractC0346ip.m1502n("forName(...)", Charset.forName("UTF-16BE"));
        AbstractC0346ip.m1502n("forName(...)", Charset.forName("UTF-16LE"));
        AbstractC0346ip.m1502n("forName(...)", Charset.forName("US-ASCII"));
        AbstractC0346ip.m1502n("forName(...)", Charset.forName("ISO-8859-1"));
    }
}
