package gg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements gg.i, java.io.Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.Object f4537g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Class f4538h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f4539i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.lang.String f4540j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f4541k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f4542l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f4543m;

    public a(int r1, int r2, java.lang.Class r3, java.lang.Object r4, java.lang.String r5, java.lang.String r6) {
            r0 = this;
            r0.<init>()
            r0.f4537g = r4
            r0.f4538h = r3
            r0.f4539i = r5
            r0.f4540j = r6
            r3 = 0
            r0.f4541k = r3
            r0.f4542l = r1
            int r1 = r2 >> 1
            r0.f4543m = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L44
        L3:
            boolean r0 = r3 instanceof gg.a
            if (r0 != 0) goto L8
            goto L46
        L8:
            gg.a r3 = (gg.a) r3
            boolean r0 = r2.f4541k
            boolean r1 = r3.f4541k
            if (r0 != r1) goto L46
            int r0 = r2.f4542l
            int r1 = r3.f4542l
            if (r0 != r1) goto L46
            int r0 = r2.f4543m
            int r1 = r3.f4543m
            if (r0 != r1) goto L46
            java.lang.Object r0 = r2.f4537g
            java.lang.Object r1 = r3.f4537g
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L46
            java.lang.Class r0 = r2.f4538h
            java.lang.Class r1 = r3.f4538h
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L46
            java.lang.String r0 = r2.f4539i
            java.lang.String r1 = r3.f4539i
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L46
            java.lang.String r0 = r2.f4540j
            java.lang.String r3 = r3.f4540j
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L46
        L44:
            r3 = 1
            return r3
        L46:
            r3 = 0
            return r3
    }

    @Override // gg.i
    public final int getArity() {
            r1 = this;
            int r0 = r1.f4542l
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.Object r0 = r3.f4537g
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.Class r2 = r3.f4538h
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.lang.String r0 = r3.f4539i
            int r0 = eh.a.g(r2, r1, r0)
            java.lang.String r2 = r3.f4540j
            int r0 = eh.a.g(r0, r1, r2)
            boolean r2 = r3.f4541k
            if (r2 == 0) goto L24
            r2 = 1231(0x4cf, float:1.725E-42)
            goto L26
        L24:
            r2 = 1237(0x4d5, float:1.733E-42)
        L26:
            int r0 = r0 + r2
            int r0 = r0 * r1
            int r2 = r3.f4542l
            int r0 = r0 + r2
            int r0 = r0 * r1
            int r1 = r3.f4543m
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            gg.w r0 = gg.v.f4565a
            r0.getClass()
            java.lang.String r0 = gg.w.a(r1)
            return r0
    }
}
