package b8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f522a = 0;

    static {
            java.lang.String r0 = "com.reandroid.xml.KeepCharsetEncoding"
            java.lang.System.getProperty(r0)
            return
    }

    public static java.lang.String a(java.lang.String r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            r1 = 58
            int r1 = r2.lastIndexOf(r1)
            if (r1 < 0) goto L12
            int r1 = r1 + 1
            java.lang.String r2 = r2.substring(r1)
        L12:
            java.lang.String r2 = r2.trim()
            int r1 = r2.length()
            if (r1 != 0) goto L1d
            return r0
        L1d:
            return r2
    }
}
