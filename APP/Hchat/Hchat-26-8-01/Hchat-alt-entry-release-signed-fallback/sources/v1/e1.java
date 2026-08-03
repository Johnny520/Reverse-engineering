package v1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends x1.c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v1.e1 f13929b = null;

    static {
            v1.e1 r0 = new v1.e1
            java.lang.String r1 = "Undefined intrinsics block and it is required"
            r0.<init>(r1)
            v1.e1.f13929b = r0
            return
    }

    @Override // v1.n0
    public final v1.o0 h(v1.p0 r9, java.util.List r10, long r11) {
            r8 = this;
            int r0 = r10.size()
            tf.u r1 = tf.u.f13168g
            if (r0 == 0) goto L6d
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L4c
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = r10.size()
            r0.<init>(r2)
            int r2 = r10.size()
            r4 = r3
            r5 = r4
        L1b:
            if (r3 >= r2) goto L39
            java.lang.Object r6 = r10.get(r3)
            v1.m0 r6 = (v1.m0) r6
            v1.b1 r6 = r6.Q(r11)
            int r7 = r6.f13900g
            int r4 = java.lang.Math.max(r7, r4)
            int r7 = r6.f13901h
            int r5 = java.lang.Math.max(r7, r5)
            r0.add(r6)
            int r3 = r3 + 1
            goto L1b
        L39:
            int r10 = u2.b.g(r4, r11)
            int r11 = u2.b.f(r5, r11)
            h.u r12 = new h.u
            r2 = 1
            r12.<init>(r2, r0)
            v1.o0 r9 = r9.z(r10, r11, r1, r12)
            return r9
        L4c:
            java.lang.Object r10 = r10.get(r3)
            v1.m0 r10 = (v1.m0) r10
            v1.b1 r10 = r10.Q(r11)
            int r0 = r10.f13900g
            int r0 = u2.b.g(r0, r11)
            int r2 = r10.f13901h
            int r11 = u2.b.f(r2, r11)
            c1.n r12 = new c1.n
            r2 = 4
            r12.<init>(r10, r2)
            v1.o0 r9 = r9.z(r0, r11, r1, r12)
            return r9
        L6d:
            int r10 = u2.a.j(r11)
            int r11 = u2.a.i(r11)
            v1.c1 r12 = v1.c1.f13915i
            v1.o0 r9 = r9.z(r10, r11, r1, r12)
            return r9
    }
}
