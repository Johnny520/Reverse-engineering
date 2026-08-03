package v4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends v4.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f14114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v4.z f14115h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w4.a f14116i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public v4.d0 f14117j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public v4.h f14118k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.util.ArrayList f14119l;

    public q(int r1, v4.z r2) {
            r0 = this;
            r0.<init>()
            r0.f14114g = r1
            r0.f14115h = r2
            v4.c0 r1 = r2.f14132h
            java.lang.String r1 = r1.a()
            w4.a r1 = w4.a.b(r1)
            r0.f14116i = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f14119l = r1
            return
    }

    @Override // z4.k
    public final java.lang.String a() {
            r3 = this;
            v4.d0 r0 = r3.f14117j
            if (r0 == 0) goto Lb
            w4.c r0 = r0.f14088g
            java.lang.String r0 = r0.a()
            goto Ld
        Lb:
            java.lang.String r0 = "Unknown"
        Ld:
            java.lang.String r1 = "InvokeDynamic("
            java.lang.String r2 = ":"
            java.lang.StringBuilder r0 = bc.e.o(r1, r0, r2)
            int r1 = r3.f14114g
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            v4.z r1 = r3.f14115h
            java.lang.String r1 = r1.a()
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // v4.a
    public final int e(v4.a r3) {
            r2 = this;
            v4.q r3 = (v4.q) r3
            int r0 = r2.f14114g
            int r1 = r3.f14114g
            int r0 = java.lang.Integer.compare(r0, r1)
            if (r0 == 0) goto Ld
            return r0
        Ld:
            v4.z r0 = r2.f14115h
            v4.z r1 = r3.f14115h
            int r0 = r0.d(r1)
            if (r0 == 0) goto L18
            return r0
        L18:
            v4.d0 r0 = r2.f14117j
            v4.d0 r1 = r3.f14117j
            int r0 = r0.d(r1)
            if (r0 == 0) goto L23
            return r0
        L23:
            v4.h r0 = r2.f14118k
            v4.h r3 = r3.f14118k
            int r3 = r0.d(r3)
            return r3
    }

    @Override // v4.a
    public final boolean i() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // v4.a
    public final java.lang.String j() {
            r1 = this;
            java.lang.String r0 = "InvokeDynamic"
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.a()
            return r0
    }
}
