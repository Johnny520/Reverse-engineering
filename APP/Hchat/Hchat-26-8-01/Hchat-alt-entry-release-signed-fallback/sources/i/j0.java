package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements i.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i.i0 f5703a;

    public j0(i.i0 r1) {
            r0 = this;
            r0.<init>()
            r0.f5703a = r1
            return
    }

    @Override // i.k
    public final i.n1 a(i.m1 r20) {
            r19 = this;
            f.v r0 = new f.v
            r1 = r19
            i.i0 r2 = r1.f5703a
            f.w r2 = r2.f5688a
            int r3 = r2.f2847e
            int r3 = r3 + 2
            r0.<init>(r3)
            f.w r3 = new f.w
            int r4 = r2.f2847e
            r3.<init>(r4)
            int[] r4 = r2.f2844b
            java.lang.Object[] r5 = r2.f2845c
            long[] r6 = r2.f2843a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L83
            r9 = 0
        L22:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L85
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L3c:
            if (r14 >= r12) goto L7d
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L6e
            int r15 = r9 << 3
            int r15 = r15 + r14
            r8 = r4[r15]
            r15 = r5[r15]
            i.h0 r15 = (i.h0) r15
            r0.a(r8)
            r17 = r13
            i.s1 r13 = new i.s1
            r1 = r20
            r18 = r4
            fg.l r4 = r1.f5730a
            java.lang.Float r1 = r15.f5682a
            java.lang.Object r1 = r4.invoke(r1)
            i.q r1 = (i.q) r1
            i.v r4 = r15.f5683b
            r13.<init>(r1, r4)
            r3.h(r8, r13)
            goto L72
        L6e:
            r18 = r4
            r17 = r13
        L72:
            long r10 = r10 >> r17
            int r14 = r14 + 1
            r1 = r19
            r13 = r17
            r4 = r18
            goto L3c
        L7d:
            r18 = r4
            r1 = r13
            if (r12 != r1) goto L83
            goto L87
        L83:
            r1 = 0
            goto L90
        L85:
            r18 = r4
        L87:
            if (r9 == r7) goto L83
            int r9 = r9 + 1
            r1 = r19
            r4 = r18
            goto L22
        L90:
            boolean r4 = r2.a(r1)
            if (r4 != 0) goto Lb7
            int r4 = r0.f2916b
            if (r4 < 0) goto Lb0
            r5 = 1
            int r4 = r4 + r5
            r0.b(r4)
            int[] r4 = r0.f2915a
            int r6 = r0.f2916b
            if (r6 == 0) goto La8
            tf.l.p0(r4, r4, r5, r1, r6)
        La8:
            r4[r1] = r1
            int r1 = r0.f2916b
            int r1 = r1 + r5
            r0.f2916b = r1
            goto Lb7
        Lb0:
            java.lang.String r0 = "Index must be between 0 and size"
            okio.a.i(r0)
            r0 = 0
            goto Ld8
        Lb7:
            r1 = 300(0x12c, float:4.2E-43)
            boolean r2 = r2.a(r1)
            if (r2 != 0) goto Lc2
            r0.a(r1)
        Lc2:
            int r1 = r0.f2916b
            if (r1 != 0) goto Lc7
            goto Ld0
        Lc7:
            int[] r2 = r0.f2915a
            r2.getClass()
            r4 = 0
            java.util.Arrays.sort(r2, r4, r1)
        Ld0:
            i.t1 r1 = new i.t1
            g1.d r2 = i.x.f5829b
            r1.<init>(r0, r3, r2)
            r0 = r1
        Ld8:
            return r0
    }
}
