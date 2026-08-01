package p040U0;

import java.nio.charset.Charset;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: U0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0291a {

    /* JADX INFO: renamed from: a */
    public static final Charset f663a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Charset charsetForName = Charset.forName("UTF-8");
        AbstractC0223g.m417d(charsetForName, "forName(...)");
        f663a = charsetForName;
        AbstractC0223g.m417d(Charset.forName("UTF-16"), "forName(...)");
        AbstractC0223g.m417d(Charset.forName("UTF-16BE"), "forName(...)");
        AbstractC0223g.m417d(Charset.forName("UTF-16LE"), "forName(...)");
        AbstractC0223g.m417d(Charset.forName("US-ASCII"), "forName(...)");
        AbstractC0223g.m417d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
