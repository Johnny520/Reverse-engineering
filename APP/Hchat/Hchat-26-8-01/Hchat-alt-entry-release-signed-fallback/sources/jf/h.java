package jf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements mc.a, sc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.String f6895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.String f6896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.String f6897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.util.List f6898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6899f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ac.k f6900g;

    public final void a() {
            r6 = this;
            ac.k r0 = r6.f6900g
            if (r0 == 0) goto L5b
            int r1 = r6.f6899f
            java.lang.Object r2 = r0.f179j
            ff.e r2 = (ff.e) r2
            jf.e r2 = r2.f3934d
            int r3 = r2.f6883g
            int r1 = r1 * 8
            int r1 = r1 + r3
            r0.a(r1)
            int r1 = r0.L()
            int r3 = r0.L()
            java.lang.Object r4 = r0.f178i
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            int r5 = r4.getInt()
            int r2 = r2.f6882f
            int r3 = r3 * 12
            int r3 = r3 + r2
            r0.a(r3)
            r2 = 4
            r0.M(r2)
            int r2 = r4.getInt()
            int r3 = r4.getInt()
            if (r3 != 0) goto L3d
            java.util.List r3 = java.util.Collections.EMPTY_LIST
            goto L44
        L3d:
            r0.a(r3)
            java.util.List r3 = r0.J()
        L44:
            java.lang.String r1 = r0.y(r1)
            r6.f6896c = r1
            java.lang.String r1 = r0.v(r5)
            r6.f6895b = r1
            java.lang.String r0 = r0.y(r2)
            r6.f6897d = r0
            r6.f6898e = r3
            r0 = 0
            r6.f6900g = r0
        L5b:
            return
    }

    @Override // mc.a
    public final java.util.List c() {
            r1 = this;
            java.util.List r0 = r1.f6898e
            return r0
    }

    @Override // mc.a
    public final java.lang.String e() {
            r1 = this;
            java.lang.String r0 = r1.f6897d
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = r5.f6895b
            if (r0 != 0) goto Lb
            int r0 = r5.f6894a
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            return r0
        Lb:
            java.lang.String r1 = r5.f6896c
            java.util.List r2 = r5.f6898e
            java.lang.String r2 = ac.p.D(r2)
            java.lang.String r3 = r5.f6897d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = "->"
            r4.append(r1)
            r4.append(r0)
            java.lang.String r0 = "("
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ")"
            java.lang.String r0 = eh.a.r(r4, r0, r3)
            return r0
    }
}
