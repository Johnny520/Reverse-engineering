package s;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0.c f11980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0.j f11981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f.k0 f11982c;

    public b0(v0.c r1, b0.j r2) {
            r0 = this;
            r0.<init>()
            r0.f11980a = r1
            r0.f11981b = r2
            long[] r1 = f.r0.f2895a
            f.k0 r1 = new f.k0
            r1.<init>()
            r0.f11982c = r1
            return
    }

    public final fg.p a(java.lang.Object r6, int r7, java.lang.Object r8) {
            r5 = this;
            f.k0 r0 = r5.f11982c
            java.lang.Object r1 = r0.g(r6)
            s.a0 r1 = (s.a0) r1
            r2 = 1
            r3 = 818252804(0x30c58c04, float:1.4373431E-9)
            if (r1 == 0) goto L2f
            int r4 = r1.f11969c
            if (r4 != r7) goto L2f
            java.lang.Object r4 = r1.f11968b
            boolean r4 = gg.l.a(r4, r8)
            if (r4 == 0) goto L2f
            s0.d r6 = r1.f11970d
            if (r6 != 0) goto L2e
            s.b0 r6 = r1.f11971e
            b0.q r7 = new b0.q
            r8 = 10
            r7.<init>(r6, r8, r1)
            s0.d r6 = new s0.d
            r6.<init>(r3, r7, r2)
            r1.f11970d = r6
        L2e:
            return r6
        L2f:
            s.a0 r1 = new s.a0
            r1.<init>(r5, r7, r6, r8)
            r0.m(r6, r1)
            s0.d r6 = r1.f11970d
            if (r6 != 0) goto L4a
            b0.q r6 = new b0.q
            r7 = 10
            r6.<init>(r5, r7, r1)
            s0.d r7 = new s0.d
            r7.<init>(r3, r6, r2)
            r1.f11970d = r7
            return r7
        L4a:
            return r6
    }

    public final java.lang.Object b(java.lang.Object r3) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L26
        L3:
            f.k0 r0 = r2.f11982c
            java.lang.Object r0 = r0.g(r3)
            s.a0 r0 = (s.a0) r0
            if (r0 == 0) goto L10
            java.lang.Object r3 = r0.f11968b
            return r3
        L10:
            b0.j r0 = r2.f11981b
            java.lang.Object r0 = r0.invoke()
            r.k r0 = (r.k) r0
            ac.k r1 = r0.f11177d
            int r3 = r1.o(r3)
            r1 = -1
            if (r3 == r1) goto L26
            java.lang.Object r3 = r0.b(r3)
            return r3
        L26:
            r3 = 0
            return r3
    }
}
