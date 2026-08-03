package pg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f10558a = 0;

    static {
            r0 = 4
            java.lang.ThreadLocal[] r1 = new java.lang.ThreadLocal[r0]
            r2 = 0
        L4:
            if (r2 >= r0) goto L10
            java.lang.ThreadLocal r3 = new java.lang.ThreadLocal
            r3.<init>()
            r1[r2] = r3
            int r2 = r2 + 1
            goto L4
        L10:
            return
    }
}
