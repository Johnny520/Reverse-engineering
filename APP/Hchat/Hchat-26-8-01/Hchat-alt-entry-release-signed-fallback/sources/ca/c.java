package ca;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f1467h;

    public /* synthetic */ c(long r1, int r3) {
            r0 = this;
            r0.f1466g = r3
            r0.f1467h = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r27) {
            r26 = this;
            r1 = r26
            int r0 = r1.f1466g
            r2 = 15000(0x3a98, double:7.411E-320)
            r4 = 2
            r5 = 600000(0x927c0, double:2.964394E-318)
            r7 = 5000(0x1388, double:2.4703E-320)
            sf.n r9 = sf.n.f12433a
            r10 = 0
            r11 = 1
            long r12 = r1.f1467h
            switch(r0) {
                case 0: goto L279;
                case 1: goto L25f;
                case 2: goto L240;
                case 3: goto L221;
                case 4: goto L1e9;
                case 5: goto L1c8;
                case 6: goto L1ae;
                case 7: goto L18d;
                case 8: goto L170;
                case 9: goto L151;
                case 10: goto L132;
                case 11: goto L11e;
                case 12: goto Lff;
                case 13: goto Le4;
                case 14: goto Ld4;
                case 15: goto Lab;
                case 16: goto L95;
                case 17: goto L81;
                case 18: goto L6a;
                case 19: goto L56;
                case 20: goto L2f;
                default: goto L15;
            }
        L15:
            r0 = r27
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r0.getClass()
            java.lang.Object r0 = r0.getValue()
            x8.i r0 = (x8.i) r0
            long r2 = r0.f21284b
            long r12 = r12 - r2
            int r0 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r0 <= 0) goto L2a
            r10 = r11
        L2a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            return r0
        L2f:
            r2 = r27
            h1.d r2 = (h1.d) r2
            r2.getClass()
            h1.g r7 = new h1.g
            float r0 = (float) r4
            float r11 = r2.x0(r0)
            r14 = 0
            r15 = 30
            r12 = 0
            r13 = 0
            r10 = r7
            r10.<init>(r11, r12, r13, r14, r15)
            r3 = 0
            long r5 = r2.a()
            long r5 = h1.d.n0(r5, r3)
            long r3 = r1.f1467h
            r2.x(r3, r5, r7)
            return r9
        L56:
            r10 = r27
            h1.d r10 = (h1.d) r10
            r10.getClass()
            r16 = 0
            r17 = 126(0x7e, float:1.77E-43)
            long r11 = r1.f1467h
            r13 = 0
            r15 = 0
            h1.d.Z(r10, r11, r13, r15, r16, r17)
            return r9
        L6a:
            r18 = r27
            h1.d r18 = (h1.d) r18
            r18.getClass()
            r24 = 0
            r25 = 126(0x7e, float:1.77E-43)
            long r2 = r1.f1467h
            r21 = 0
            r23 = 0
            r19 = r2
            h1.d.Z(r18, r19, r21, r23, r24, r25)
            return r9
        L81:
            r10 = r27
            h1.d r10 = (h1.d) r10
            r10.getClass()
            r16 = 0
            r17 = 126(0x7e, float:1.77E-43)
            long r11 = r1.f1467h
            r13 = 0
            r15 = 0
            h1.d.Z(r10, r11, r13, r15, r16, r17)
            return r9
        L95:
            r0 = r27
            f2.y r0 = (f2.y) r0
            f2.x r2 = h0.h0.f4904c
            h0.g0 r3 = new h0.g0
            h0.f0 r7 = h0.f0.f4885h
            r8 = 1
            w.g0 r4 = w.g0.f14460g
            long r5 = r1.f1467h
            r3.<init>(r4, r5, r7, r8)
            r0.a(r2, r3)
            return r9
        Lab:
            r0 = r27
            c1.d r0 = (c1.d) r0
            c1.a r2 = r0.f979g
            long r2 = r2.a()
            r5 = 32
            long r2 = r2 >> r5
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            f1.g r3 = oh.h.r(r0, r2)
            f1.n r5 = new f1.n
            r6 = 5
            r5.<init>(r12, r6)
            m.e3 r6 = new m.e3
            r6.<init>(r2, r3, r5, r4)
            androidx.lifecycle.x r0 = r0.e(r6)
            return r0
        Ld4:
            r0 = r27
            v8.g r0 = (v8.g) r0
            long r2 = r0.f14241e
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 >= 0) goto Ldf
            r10 = r11
        Ldf:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            return r0
        Le4:
            r0 = r27
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r0.getClass()
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 >= 0) goto Lfa
            r10 = r11
        Lfa:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            return r0
        Lff:
            r0 = r27
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r0.getClass()
            java.lang.Object r0 = r0.getValue()
            r0.getClass()
            java.lang.Number r0 = (java.lang.Number) r0
            long r4 = r0.longValue()
            long r12 = r12 - r4
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 <= 0) goto L119
            r10 = r11
        L119:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            return r0
        L11e:
            r10 = r27
            h1.d r10 = (h1.d) r10
            r10.getClass()
            r16 = 0
            r17 = 126(0x7e, float:1.77E-43)
            long r11 = r1.f1467h
            r13 = 0
            r15 = 0
            h1.d.Z(r10, r11, r13, r15, r16, r17)
            return r9
        L132:
            r0 = r27
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r0.getClass()
            java.lang.Object r0 = r0.getValue()
            r0.getClass()
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            long r12 = r12 - r2
            int r0 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r0 <= 0) goto L14c
            r10 = r11
        L14c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            return r0
        L151:
            r0 = r27
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r0.getClass()
            java.lang.Object r0 = r0.getValue()
            r0.getClass()
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            long r12 = r12 - r2
            int r0 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r0 <= 0) goto L16b
            r10 = r11
        L16b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            return r0
        L170:
            r0 = r27
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r0.getClass()
            java.lang.Object r0 = r0.getValue()
            o9.l r0 = (o9.l) r0
            long r2 = r0.f9645b
            long r12 = r12 - r2
            r2 = 120000(0x1d4c0, double:5.9288E-319)
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 <= 0) goto L188
            r10 = r11
        L188:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            return r0
        L18d:
            r0 = r27
            i0.b r0 = (i0.b) r0
            fg.l r2 = r0.f5848b
            if (r2 != 0) goto L196
            goto L1ad
        L196:
            qg.g r3 = r0.f5847a
            if (r3 == 0) goto L1ad
            java.lang.Long r0 = java.lang.Long.valueOf(r12)     // Catch: java.lang.Throwable -> L1a3
            java.lang.Object r0 = r2.invoke(r0)     // Catch: java.lang.Throwable -> L1a3
            goto L1aa
        L1a3:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L1aa:
            r3.resumeWith(r0)
        L1ad:
            return r9
        L1ae:
            r0 = r27
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r0.getClass()
            java.lang.Object r0 = r0.getValue()
            eb.j r0 = (eb.j) r0
            long r2 = r0.f2564e
            long r12 = r12 - r2
            int r0 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r0 <= 0) goto L1c3
            r10 = r11
        L1c3:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            return r0
        L1c8:
            r0 = r27
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r0.getClass()
            java.lang.Object r0 = r0.getValue()
            r0.getClass()
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            long r12 = r12 - r2
            r2 = 3000(0xbb8, double:1.482E-320)
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1e4
            r10 = r11
        L1e4:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            return r0
        L1e9:
            r0 = r27
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r0.getClass()
            java.lang.Object r2 = r0.getValue()
            r2.getClass()
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            long r12 = r12 - r2
            eb.f r2 = eb.f.f2540a
            java.lang.Object r0 = r0.getKey()
            r0.getClass()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "msg:"
            boolean r0 = og.t.d0(r0, r2, r10)
            if (r0 == 0) goto L215
            r2 = 60000(0xea60, double:2.9644E-319)
            goto L217
        L215:
            r2 = 1000(0x3e8, double:4.94E-321)
        L217:
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 <= 0) goto L21c
            r10 = r11
        L21c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            return r0
        L221:
            r0 = r27
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r0.getClass()
            java.lang.Object r0 = r0.getValue()
            r0.getClass()
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            long r12 = r12 - r2
            int r0 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r0 <= 0) goto L23b
            r10 = r11
        L23b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            return r0
        L240:
            r0 = r27
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r0.getClass()
            java.lang.Object r0 = r0.getValue()
            r0.getClass()
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            long r12 = r12 - r2
            int r0 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r0 <= 0) goto L25a
            r10 = r11
        L25a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            return r0
        L25f:
            r0 = r27
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r0.getClass()
            java.lang.Object r0 = r0.getValue()
            e9.i r0 = (e9.i) r0
            long r4 = r0.f2429b
            long r12 = r12 - r4
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 <= 0) goto L274
            r10 = r11
        L274:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            return r0
        L279:
            r0 = r27
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            boolean r2 = og.m.t0(r0)
            if (r2 != 0) goto L291
            java.lang.String r2 = java.lang.String.valueOf(r12)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L291
            r10 = r11
        L291:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            return r0
    }
}
