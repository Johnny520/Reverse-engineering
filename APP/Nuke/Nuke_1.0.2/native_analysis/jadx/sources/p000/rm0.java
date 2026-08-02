package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rm0 {

    /* JADX INFO: renamed from: d */
    public static final rm0 f9640d = new rm0("", "", false);

    /* JADX INFO: renamed from: a */
    public final String f9641a;

    /* JADX INFO: renamed from: b */
    public final String f9642b;

    /* JADX INFO: renamed from: c */
    public final boolean f9643c;

    static {
        new rm0("\n", "  ", true);
    }

    public rm0(String str, String str2, boolean z) {
        if (!str.matches("[\r\n]*")) {
            C0676s.m4651j("Only combinations of \\n and \\r are allowed in newline.");
            throw null;
        }
        if (!str2.matches("[ \t]*")) {
            C0676s.m4651j("Only combinations of spaces and tabs are allowed in indent.");
            throw null;
        }
        this.f9641a = str;
        this.f9642b = str2;
        this.f9643c = z;
    }
}
