package p213o2;

/* JADX INFO: renamed from: o2.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2780i {

    /* JADX INFO: renamed from: d */
    public static final C2780i f8783d = new C2780i("", "", false);

    /* JADX INFO: renamed from: a */
    public final String f8784a;

    /* JADX INFO: renamed from: b */
    public final String f8785b;

    /* JADX INFO: renamed from: c */
    public final boolean f8786c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new C2780i("\n", "  ", true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2780i(String str, String str2, boolean z5) {
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f8784a = str;
        this.f8785b = str2;
        this.f8786c = z5;
    }
}
