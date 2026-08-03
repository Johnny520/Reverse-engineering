package p105h6;

import okhttp3.HttpUrl;
import p136j8.C2104o;

/* JADX INFO: renamed from: h6.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1609a {

    /* JADX INFO: renamed from: d */
    public static final C1609a f5281d = new C1609a(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, false);

    /* JADX INFO: renamed from: e */
    public static final C1609a f5282e = new C1609a("\n", "  ", true);

    /* JADX INFO: renamed from: a */
    public final String f5283a;

    /* JADX INFO: renamed from: b */
    public final String f5284b;

    /* JADX INFO: renamed from: c */
    public final boolean f5285c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1609a(String str, String str2, boolean z9) {
        if (!str.matches("[\r\n]*")) {
            C2104o.m5294t("Only combinations of \\n and \\r are allowed in newline.");
            throw null;
        }
        if (!str2.matches("[ \t]*")) {
            C2104o.m5294t("Only combinations of spaces and tabs are allowed in indent.");
            throw null;
        }
        this.f5283a = str;
        this.f5284b = str2;
        this.f5285c = z9;
    }
}
