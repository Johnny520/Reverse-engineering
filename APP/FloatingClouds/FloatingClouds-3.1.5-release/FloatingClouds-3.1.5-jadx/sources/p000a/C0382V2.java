package p000a;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: a.V2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0382V2 {

    /* JADX INFO: renamed from: a */
    public static final Charset f1441a;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        C0631i9.m1481d(charsetForName, "forName(...)");
        f1441a = charsetForName;
        C0631i9.m1481d(Charset.forName("UTF-16"), "forName(...)");
        C0631i9.m1481d(Charset.forName("UTF-16BE"), "forName(...)");
        C0631i9.m1481d(Charset.forName("UTF-16LE"), "forName(...)");
        C0631i9.m1481d(Charset.forName("US-ASCII"), "forName(...)");
        C0631i9.m1481d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
