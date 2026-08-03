package p001;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: ۟.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0247i0 {

    /* JADX INFO: renamed from: ۥ */
    public static final Charset f850;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        C0237h4.m1089("forName(...)", charsetForName);
        f850 = charsetForName;
        C0237h4.m1089("forName(...)", Charset.forName("UTF-16"));
        C0237h4.m1089("forName(...)", Charset.forName("UTF-16BE"));
        C0237h4.m1089("forName(...)", Charset.forName("UTF-16LE"));
        C0237h4.m1089("forName(...)", Charset.forName("US-ASCII"));
        C0237h4.m1089("forName(...)", Charset.forName("ISO-8859-1"));
    }
}
