package p000;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: n9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0514n9 {

    /* JADX INFO: renamed from: a */
    public static final Charset f3251a;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        AbstractC0493mp.m1856f("forName(...)", charsetForName);
        f3251a = charsetForName;
        AbstractC0493mp.m1856f("forName(...)", Charset.forName("UTF-16"));
        AbstractC0493mp.m1856f("forName(...)", Charset.forName("UTF-16BE"));
        AbstractC0493mp.m1856f("forName(...)", Charset.forName("UTF-16LE"));
        AbstractC0493mp.m1856f("forName(...)", Charset.forName("US-ASCII"));
        AbstractC0493mp.m1856f("forName(...)", Charset.forName("ISO-8859-1"));
    }
}
