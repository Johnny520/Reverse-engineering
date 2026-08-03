package s1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements s1.q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12202b;

    public a(int r1) {
            r0 = this;
            r0.<init>()
            r0.f12202b = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            if (r3 == 0) goto La
            java.lang.Class r0 = r3.getClass()
            goto Lb
        La:
            r0 = 0
        Lb:
            java.lang.Class<s1.a> r1 = s1.a.class
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L14
            goto L1f
        L14:
            r3.getClass()
            s1.a r3 = (s1.a) r3
            int r0 = r2.f12202b
            int r3 = r3.f12202b
            if (r0 == r3) goto L21
        L1f:
            r3 = 0
            return r3
        L21:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.f12202b
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AndroidPointerIcon(type="
            r0.<init>(r1)
            int r1 = r3.f12202b
            r2 = 41
            java.lang.String r0 = p.a.n(r0, r1, r2)
            return r0
    }
}
