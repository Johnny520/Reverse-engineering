package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class c9 {
    public static final Charset a = null;

    static {
        Charset r0 = Charset.forName("UTF-8");
        ip.n("forName(...)", r0);
        a = r0;
        ip.n("forName(...)", Charset.forName("UTF-16"));
        ip.n("forName(...)", Charset.forName("UTF-16BE"));
        ip.n("forName(...)", Charset.forName("UTF-16LE"));
        ip.n("forName(...)", Charset.forName("US-ASCII"));
        ip.n("forName(...)", Charset.forName("ISO-8859-1"));
    }
}
