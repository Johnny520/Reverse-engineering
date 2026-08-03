package t7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends l7.l {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public java.lang.String f13080t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f13081u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f13082v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f13083w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f13084x;

    public final java.lang.String b0() {
            r2 = this;
            java.lang.String r0 = r2.f13080t
            if (r0 != 0) goto Lc
            java.lang.String r0 = "NAME"
            java.lang.String r0 = r2.e0(r0)
            r2.f13080t = r0
        Lc:
            java.lang.String r0 = r2.f13080t
            if (r0 != 0) goto L28
            l7.f r0 = r2.Z()
            if (r0 == 0) goto L28
            java.lang.String r0 = r0.V()
            if (r0 == 0) goto L28
            java.lang.String r1 = r0.trim()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L28
            r2.f13080t = r0
        L28:
            java.lang.String r0 = r2.f13080t
            return r0
    }

    public final int c0() {
            r1 = this;
            int r0 = r1.f13081u
            if (r0 != 0) goto L18
            boolean r0 = r1.d0()
            if (r0 == 0) goto L18
            java.lang.String r0 = "VERSION_CODE"
            java.lang.String r0 = r1.e0(r0)
            if (r0 == 0) goto L18
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L18
            r1.f13081u = r0     // Catch: java.lang.NumberFormatException -> L18
        L18:
            int r0 = r1.f13081u
            return r0
    }

    public final boolean d0() {
            r2 = this;
            boolean r0 = r2.f13084x
            if (r0 != 0) goto L19
            r0 = 1
            r2.f13084x = r0
            java.lang.String r1 = "VERSION_CODE"
            java.lang.String r1 = r2.e0(r1)
            if (r1 == 0) goto L19
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L19
            if (r1 == 0) goto L16
            goto L17
        L16:
            r0 = 0
        L17:
            r2.f13083w = r0     // Catch: java.lang.NumberFormatException -> L19
        L19:
            boolean r0 = r2.f13083w
            return r0
    }

    public final java.lang.String e0(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = ":"
            boolean r1 = r6.endsWith(r0)
            if (r1 != 0) goto Lc
            java.lang.String r6 = r6.concat(r0)
        Lc:
            boolean r1 = r6.endsWith(r0)
            if (r1 != 0) goto L17
            java.lang.String r0 = r6.concat(r0)
            goto L18
        L17:
            r0 = r6
        L18:
            r1 = 0
        L19:
            r2 = 0
            r3 = 10
            if (r1 >= r3) goto L3c
            u7.b r3 = r5.f7885o
            r7.s r3 = r3.V(r1)
            r7.x r3 = (r7.x) r3
            if (r3 != 0) goto L29
            goto L3c
        L29:
            java.lang.String r4 = r3.f11578m
            if (r4 != 0) goto L2e
            goto L39
        L2e:
            java.lang.String r4 = r4.trim()
            boolean r4 = r4.startsWith(r0)
            if (r4 == 0) goto L39
            goto L3d
        L39:
            int r1 = r1 + 1
            goto L19
        L3c:
            r3 = r2
        L3d:
            if (r3 != 0) goto L40
            return r2
        L40:
            java.lang.String r0 = r3.f11578m
            java.lang.String r0 = r0.trim()
            int r6 = r6.length()
            java.lang.String r6 = r0.substring(r6)
            java.lang.String r6 = r6.trim()
            return r6
    }

    @Override // l7.l, l7.a
    public final java.lang.String toString() {
            r2 = this;
            p7.a r0 = r2.f7869m
            int r0 = r0.Q()
            r1 = 3
            if (r0 == r1) goto Le
            java.lang.String r0 = super.toString()
            return r0
        Le:
            boolean r0 = r2.f13083w
            if (r0 != 0) goto L1d
            java.lang.String r0 = super.toString()
            java.lang.String r1 = "Unoptimized: "
            java.lang.String r0 = r1.concat(r0)
            return r0
        L1d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.b0()
            r0.append(r1)
            r1 = 45
            r0.append(r1)
            int r1 = r2.c0()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
