package r7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends r7.b implements b8.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r7.v f11591m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r7.e f11592n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final r7.e f11593o;

    public w() {
            r3 = this;
            r0 = 12
            r3.<init>(r0)
            r7.v r0 = new r7.v
            r1 = 0
            r0.<init>(r3, r1)
            r1 = -1
            r0.k(r1)
            r3.f11591m = r0
            r7.e r0 = new r7.e
            r1 = 4
            r2 = 0
            r0.<init>(r3, r1, r2)
            r3.f11592n = r0
            r7.e r0 = new r7.e
            r1 = 8
            r0.<init>(r3, r1, r2)
            r3.f11593o = r0
            return
    }

    @Override // b8.b
    public final int b() {
            r1 = this;
            int r0 = r1.f7388g
            return r0
    }

    @Override // b8.b
    public final int e() {
            r1 = this;
            r7.e r0 = r1.f11593o
            int r0 = r0.get()
            return r0
    }

    @Override // b8.b
    public final int f() {
            r1 = this;
            r7.e r0 = r1.f11592n
            int r0 = r0.get()
            return r0
    }

    @Override // b8.b
    public final java.lang.String getTagName() {
            r3 = this;
            r7.v r0 = r3.f11591m
            r7.s r0 = r0.a()
            r1 = 0
            if (r0 == 0) goto Lc
            java.lang.String r0 = r0.f11578m
            goto Ld
        Lc:
            r0 = r1
        Ld:
            if (r0 != 0) goto L10
            return r1
        L10:
            r1 = 59
            int r1 = r0.indexOf(r1)
            if (r1 >= 0) goto L1e
            r1 = 32
            int r1 = r0.indexOf(r1)
        L1e:
            if (r1 >= 0) goto L21
            return r0
        L21:
            r2 = 0
            java.lang.String r0 = r0.substring(r2, r1)
            return r0
    }

    @Override // b8.b
    public final java.lang.String j() {
            r4 = this;
            r7.v r0 = r4.f11591m
            r7.s r0 = r0.a()
            r1 = 0
            if (r0 == 0) goto Lc
            java.lang.String r0 = r0.f11578m
            goto Ld
        Lc:
            r0 = r1
        Ld:
            if (r0 == 0) goto L46
            int r2 = r0.length()
            if (r2 != 0) goto L16
            goto L46
        L16:
            r2 = 0
            char r2 = r0.charAt(r2)
            r3 = 32
            if (r2 != r3) goto L23
            java.lang.String r0 = r0.trim()
        L23:
            r2 = 59
            int r2 = r0.indexOf(r2)
            int r3 = r0.indexOf(r3)
            if (r2 >= 0) goto L30
            goto L34
        L30:
            if (r3 < 0) goto L35
            if (r3 >= r2) goto L35
        L34:
            r2 = r3
        L35:
            if (r2 >= 0) goto L38
            goto L46
        L38:
            int r2 = r2 + 1
            java.lang.String r0 = r0.substring(r2)
            int r2 = r0.length()
            if (r2 != 0) goto L45
            goto L46
        L45:
            return r0
        L46:
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r7.v r1 = r2.f11591m
            r0.append(r1)
            java.lang.String r1 = " ["
            r0.append(r1)
            r7.e r1 = r2.f11592n
            int r1 = r1.get()
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            r7.e r1 = r2.f11593o
            int r1 = r1.get()
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
