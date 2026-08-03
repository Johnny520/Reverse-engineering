package n7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends n7.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n7.c f9037b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n7.c f9038c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n7.c f9039d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n7.c f9040e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9041a;

    static {
            n7.c r0 = new n7.c
            r1 = 5
            r0.<init>(r1)
            n7.c.f9037b = r0
            n7.c r0 = new n7.c
            r1 = 9
            r0.<init>(r1)
            n7.c.f9038c = r0
            n7.c r0 = new n7.c
            r1 = 4
            r0.<init>(r1)
            n7.c.f9039d = r0
            n7.c r0 = new n7.c
            r1 = 7
            r0.<init>(r1)
            n7.c.f9040e = r0
            return
    }

    public c(int r1) {
            r0 = this;
            r0.<init>()
            r0.f9041a = r1
            return
    }

    @Override // n7.a
    public final java.lang.String a(int r6) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "#"
            r0.<init>(r1)
            int r1 = r5.f9041a
            int r1 = r1 + (-2)
            r2 = 5
            if (r1 >= r2) goto L11
            r2 = 8
            goto L12
        L11:
            r2 = 4
        L12:
            int r1 = r1 * r2
        L13:
            if (r1 < 0) goto L29
            int r3 = r6 >> r1
            r3 = r3 & 15
            r4 = 10
            if (r3 >= r4) goto L21
            int r3 = r3 + 48
        L1f:
            char r3 = (char) r3
            goto L24
        L21:
            int r3 = r3 + 87
            goto L1f
        L24:
            r0.append(r3)
            int r1 = r1 - r2
            goto L13
        L29:
            java.lang.String r6 = r0.toString()
            return r6
    }
}
