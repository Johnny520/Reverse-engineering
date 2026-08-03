package n7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends n7.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n7.d f9042b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n7.d f9043c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9044a;

    static {
            n7.d r0 = new n7.d
            r1 = 0
            r0.<init>(r1)
            n7.d.f9042b = r0
            n7.d r0 = new n7.d
            r1 = 1
            r0.<init>(r1)
            n7.d.f9043c = r0
            return
    }

    public /* synthetic */ d(int r1) {
            r0 = this;
            r0.f9044a = r1
            r0.<init>()
            return
    }

    @Override // n7.a
    public final java.lang.String a(int r2) {
            r1 = this;
            int r0 = r1.f9044a
            switch(r0) {
                case 0: goto Lb;
                default: goto L5;
            }
        L5:
            r0 = 1
            java.lang.String r2 = r9.e0.z(r2, r0)
            return r2
        Lb:
            r0 = 0
            java.lang.String r2 = r9.e0.z(r2, r0)
            return r2
    }
}
