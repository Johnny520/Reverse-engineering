package t2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t2.s f13028c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t2.s f13029d = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13031b;

    static {
            t2.s r0 = new t2.s
            r1 = 2
            r2 = 0
            r0.<init>(r1, r2)
            t2.s.f13028c = r0
            t2.s r0 = new t2.s
            r1 = 1
            r0.<init>(r1, r1)
            t2.s.f13029d = r0
            return
    }

    public s(int r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f13030a = r1
            r0.f13031b = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof t2.s
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            t2.s r5 = (t2.s) r5
            int r1 = r5.f13030a
            int r3 = r4.f13030a
            if (r3 != r1) goto L1a
            boolean r1 = r4.f13031b
            boolean r5 = r5.f13031b
            if (r1 == r5) goto L19
            return r2
        L19:
            return r0
        L1a:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f13030a
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 * 31
            boolean r1 = r2.f13031b
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r1 = this;
            t2.s r0 = t2.s.f13028c
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb
            java.lang.String r0 = "TextMotion.Static"
            return r0
        Lb:
            t2.s r0 = t2.s.f13029d
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L16
            java.lang.String r0 = "TextMotion.Animated"
            return r0
        L16:
            java.lang.String r0 = "Invalid"
            return r0
    }
}
