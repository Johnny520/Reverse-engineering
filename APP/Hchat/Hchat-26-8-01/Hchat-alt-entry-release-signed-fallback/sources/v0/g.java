package v0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements v0.f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fg.l f13879g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f.k0 f13880h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f.k0 f13881i;

    public g(java.util.Map r3, fg.l r4) {
            r2 = this;
            r2.<init>()
            r2.f13879g = r4
            if (r3 == 0) goto L37
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto Le
            goto L37
        Le:
            f.k0 r4 = new f.k0
            int r0 = r3.size()
            r4.<init>(r0)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L1f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r4.m(r1, r0)
            goto L1f
        L37:
            r4 = 0
        L38:
            r2.f13880h = r4
            return
    }

    @Override // v0.f
    public final boolean a(java.lang.Object r2) {
            r1 = this;
            fg.l r0 = r1.f13879g
            java.lang.Object r2 = r0.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            return r2
    }

    @Override // v0.f
    public final java.util.Map c() {
            r27 = this;
            r0 = r27
            f.k0 r1 = r0.f13880h
            if (r1 != 0) goto Ld
            f.k0 r2 = r0.f13881i
            if (r2 != 0) goto Ld
            tf.u r1 = tf.u.f13168g
            return r1
        Ld:
            r2 = 0
            if (r1 == 0) goto L13
            int r3 = r1.f2852e
            goto L14
        L13:
            r3 = r2
        L14:
            f.k0 r4 = r0.f13881i
            if (r4 == 0) goto L1b
            int r4 = r4.f2852e
            goto L1c
        L1b:
            r4 = r2
        L1c:
            int r3 = r3 + r4
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>(r3)
            r3 = 7
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r11 = 8
            if (r1 == 0) goto L8e
            java.lang.Object[] r12 = r1.f2849b
            java.lang.Object[] r13 = r1.f2850c
            long[] r1 = r1.f2848a
            int r14 = r1.length
            int r14 = r14 + (-2)
            if (r14 < 0) goto L8e
            r15 = r2
            r16 = 128(0x80, double:6.3E-322)
        L3a:
            r5 = r1[r15]
            r18 = 255(0xff, double:1.26E-321)
            long r7 = ~r5
            long r7 = r7 << r3
            long r7 = r7 & r5
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L81
            int r7 = r15 - r14
            int r7 = ~r7
            int r7 = r7 >>> 31
            int r7 = 8 - r7
            r8 = r2
        L4e:
            if (r8 >= r7) goto L7a
            long r20 = r5 & r18
            int r20 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r20 >= 0) goto L6e
            int r20 = r15 << 3
            int r20 = r20 + r8
            r21 = r12[r20]
            r20 = r13[r20]
            r22 = r3
            r3 = r20
            java.util.List r3 = (java.util.List) r3
            r23 = r9
            r9 = r21
            java.lang.String r9 = (java.lang.String) r9
            r4.put(r9, r3)
            goto L72
        L6e:
            r22 = r3
            r23 = r9
        L72:
            long r5 = r5 >> r11
            int r8 = r8 + 1
            r3 = r22
            r9 = r23
            goto L4e
        L7a:
            r22 = r3
            r23 = r9
            if (r7 != r11) goto L96
            goto L85
        L81:
            r22 = r3
            r23 = r9
        L85:
            if (r15 == r14) goto L96
            int r15 = r15 + 1
            r3 = r22
            r9 = r23
            goto L3a
        L8e:
            r22 = r3
            r23 = r9
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
        L96:
            f.k0 r1 = r0.f13881i
            if (r1 == 0) goto L157
            java.lang.Object[] r3 = r1.f2849b
            java.lang.Object[] r5 = r1.f2850c
            long[] r1 = r1.f2848a
            int r6 = r1.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L157
            r7 = r2
        La6:
            r8 = r1[r7]
            long r12 = ~r8
            long r12 = r12 << r22
            long r12 = r12 & r8
            long r12 = r12 & r23
            int r10 = (r12 > r23 ? 1 : (r12 == r23 ? 0 : -1))
            if (r10 == 0) goto L14a
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            int r10 = 8 - r10
            r12 = r2
        Lba:
            if (r12 >= r10) goto L144
            long r13 = r8 & r18
            int r13 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r13 >= 0) goto L135
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r5[r13]
            java.util.List r13 = (java.util.List) r13
            java.lang.String r14 = (java.lang.String) r14
            int r15 = r13.size()
            r20 = r11
            r11 = 1
            if (r15 != r11) goto Lff
            java.lang.Object r11 = r13.get(r2)
            fg.a r11 = (fg.a) r11
            java.lang.Object r11 = r11.invoke()
            if (r11 == 0) goto Lf3
            boolean r13 = r0.a(r11)
            if (r13 == 0) goto Lf6
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            java.util.ArrayList r11 = a.a.k(r11)
            r4.put(r14, r11)
        Lf3:
            r26 = r1
            goto L139
        Lf6:
            java.lang.String r1 = v0.k.a(r11)
            ah.a.h(r1)
        Lfd:
            r1 = 0
            return r1
        Lff:
            int r11 = r13.size()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>(r11)
        L108:
            if (r2 >= r11) goto L12f
            java.lang.Object r25 = r13.get(r2)
            fg.a r25 = (fg.a) r25
            r26 = r1
            java.lang.Object r1 = r25.invoke()
            if (r1 == 0) goto L127
            boolean r25 = r0.a(r1)
            if (r25 == 0) goto L11f
            goto L127
        L11f:
            java.lang.String r1 = v0.k.a(r1)
            ah.a.h(r1)
            goto Lfd
        L127:
            r15.add(r1)
            int r2 = r2 + 1
            r1 = r26
            goto L108
        L12f:
            r26 = r1
            r4.put(r14, r15)
            goto L139
        L135:
            r26 = r1
            r20 = r11
        L139:
            long r8 = r8 >> r20
            int r12 = r12 + 1
            r11 = r20
            r1 = r26
            r2 = 0
            goto Lba
        L144:
            r26 = r1
            r1 = r11
            if (r10 != r1) goto L157
            goto L14d
        L14a:
            r26 = r1
            r1 = r11
        L14d:
            if (r7 == r6) goto L157
            int r7 = r7 + 1
            r11 = r1
            r1 = r26
            r2 = 0
            goto La6
        L157:
            return r4
    }

    @Override // v0.f
    public final java.lang.Object d(java.lang.String r7) {
            r6 = this;
            r0 = 0
            f.k0 r1 = r6.f13880h
            if (r1 == 0) goto Lc
            java.lang.Object r2 = r1.k(r7)
            java.util.List r2 = (java.util.List) r2
            goto Ld
        Lc:
            r2 = r0
        Ld:
            if (r2 == 0) goto L40
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L16
            goto L40
        L16:
            int r0 = r2.size()
            r3 = 1
            if (r0 <= r3) goto L3a
            if (r1 == 0) goto L3a
            int r0 = r2.size()
            java.util.List r0 = r2.subList(r3, r0)
            int r3 = r1.f(r7)
            if (r3 >= 0) goto L2e
            int r3 = ~r3
        L2e:
            java.lang.Object[] r4 = r1.f2850c
            r5 = r4[r3]
            java.lang.Object[] r1 = r1.f2849b
            r1[r3] = r7
            r4[r3] = r0
            java.util.List r5 = (java.util.List) r5
        L3a:
            r7 = 0
            java.lang.Object r7 = r2.get(r7)
            return r7
        L40:
            return r0
    }

    @Override // v0.f
    public final v0.e e(java.lang.String r4, fg.a r5) {
            r3 = this;
            int r0 = r4.length()
            r1 = 0
        L5:
            if (r1 >= r0) goto L3a
            char r2 = r4.charAt(r1)
            boolean r2 = a.a.v0(r2)
            if (r2 != 0) goto L37
            f.k0 r0 = r3.f13881i
            if (r0 != 0) goto L1e
            long[] r0 = f.r0.f2895a
            f.k0 r0 = new f.k0
            r0.<init>()
            r3.f13881i = r0
        L1e:
            java.lang.Object r1 = r0.g(r4)
            if (r1 != 0) goto L2c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.m(r4, r1)
        L2c:
            java.util.List r1 = (java.util.List) r1
            r1.add(r5)
            b5.c r1 = new b5.c
            r1.<init>(r0, r4, r5)
            return r1
        L37:
            int r1 = r1 + 1
            goto L5
        L3a:
            java.lang.String r4 = "Registered key is empty or blank"
            j8.o.t(r4)
            r4 = 0
            return r4
    }
}
