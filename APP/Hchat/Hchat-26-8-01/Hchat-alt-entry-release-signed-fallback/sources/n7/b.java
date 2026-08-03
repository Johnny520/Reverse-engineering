package n7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends n7.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n7.b f9031b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n7.b f9032c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n7.b f9033d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n7.b f9034e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n7.b f9035f = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9036a;

    static {
            n7.b r0 = new n7.b
            r1 = 0
            r0.<init>(r1)
            n7.b.f9031b = r0
            n7.b r0 = new n7.b
            r1 = 1
            r0.<init>(r1)
            n7.b.f9032c = r0
            n7.b r0 = new n7.b
            r1 = 2
            r0.<init>(r1)
            n7.b.f9033d = r0
            n7.b r0 = new n7.b
            r1 = 3
            r0.<init>(r1)
            n7.b.f9034e = r0
            n7.b r0 = new n7.b
            r1 = 4
            r0.<init>(r1)
            n7.b.f9035f = r0
            return
    }

    public /* synthetic */ b(int r1) {
            r0 = this;
            r0.f9036a = r1
            r0.<init>()
            return
    }

    @Override // n7.a
    public final java.lang.String a(int r2) {
            r1 = this;
            int r0 = r1.f9036a
            switch(r0) {
                case 0: goto L22;
                case 1: goto L19;
                case 2: goto L12;
                case 3: goto Ld;
                default: goto L5;
            }
        L5:
            if (r2 != 0) goto La
            java.lang.String r2 = "@null"
            goto Lc
        La:
            java.lang.String r2 = "@empty"
        Lc:
            return r2
        Ld:
            java.lang.String r2 = java.lang.Integer.toString(r2)
            return r2
        L12:
            r0 = 8
            java.lang.String r2 = y7.a.k(r2, r0)
            return r2
        L19:
            float r2 = java.lang.Float.intBitsToFloat(r2)
            java.lang.String r2 = java.lang.Float.toString(r2)
            return r2
        L22:
            if (r2 != 0) goto L27
            java.lang.String r2 = "false"
            goto L29
        L27:
            java.lang.String r2 = "true"
        L29:
            return r2
    }
}
