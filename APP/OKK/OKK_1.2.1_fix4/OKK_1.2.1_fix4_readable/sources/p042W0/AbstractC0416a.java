package p042W0;

import java.nio.charset.Charset;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: W0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0416a {

    /* JADX INFO: renamed from: a */
    public static final Charset f921a;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        AbstractC0307g.m702d(charsetForName, "forName(...)");
        f921a = charsetForName;
        AbstractC0307g.m702d(Charset.forName("UTF-16"), "forName(...)");
        AbstractC0307g.m702d(Charset.forName("UTF-16BE"), "forName(...)");
        AbstractC0307g.m702d(Charset.forName("UTF-16LE"), "forName(...)");
        AbstractC0307g.m702d(Charset.forName("US-ASCII"), "forName(...)");
        AbstractC0307g.m702d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
