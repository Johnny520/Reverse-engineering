package b0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f387g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f388h;

    public /* synthetic */ l(i0.a1 r1, int r2) {
            r0 = this;
            r0.f387g = r2
            r0.f388h = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f387g
            switch(r0) {
                case 0: goto L21a;
                case 1: goto L210;
                case 2: goto L203;
                case 3: goto L1f7;
                case 4: goto L1ed;
                case 5: goto L1bf;
                case 6: goto L1b5;
                case 7: goto L1ab;
                case 8: goto L198;
                case 9: goto L17c;
                case 10: goto L162;
                case 11: goto L14f;
                case 12: goto L13c;
                case 13: goto L130;
                case 14: goto L125;
                case 15: goto L115;
                case 16: goto L108;
                case 17: goto Lfb;
                case 18: goto Lee;
                case 19: goto Ldb;
                case 20: goto Lcf;
                case 21: goto Lc3;
                case 22: goto Lb7;
                case 23: goto Laa;
                case 24: goto L9c;
                case 25: goto L77;
                case 26: goto L48;
                case 27: goto L1f;
                case 28: goto L12;
                default: goto L5;
            }
        L5:
            java.lang.Integer r5 = (java.lang.Integer) r5
            r5.getClass()
            i0.a1 r0 = r4.f388h
            r0.setValue(r5)
            sf.n r5 = sf.n.f12433a
            return r5
        L12:
            wb.b3 r5 = (wb.b3) r5
            r5.getClass()
            i0.a1 r0 = r4.f388h
            r0.setValue(r5)
            sf.n r5 = sf.n.f12433a
            return r5
        L1f:
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r5 < 0) goto L45
            i0.a1 r0 = r4.f388h
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            int r1 = r1.size()
            if (r5 >= r1) goto L45
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r1 = tf.m.R1(r1)
            r1.remove(r5)
            r0.setValue(r1)
        L45:
            sf.n r5 = sf.n.f12433a
            return r5
        L48:
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            i0.a1 r0 = r4.f388h
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            int r1 = a.a.b0(r1)
            if (r5 >= r1) goto L74
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r1 = tf.m.R1(r1)
            java.lang.Object r2 = r1.remove(r5)
            na.h r2 = (na.h) r2
            int r5 = r5 + 1
            r1.add(r5, r2)
            r0.setValue(r1)
        L74:
            sf.n r5 = sf.n.f12433a
            return r5
        L77:
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r5 <= 0) goto L99
            i0.a1 r0 = r4.f388h
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r1 = tf.m.R1(r1)
            java.lang.Object r2 = r1.remove(r5)
            na.h r2 = (na.h) r2
            int r5 = r5 + (-1)
            r1.add(r5, r2)
            r0.setValue(r1)
        L99:
            sf.n r5 = sf.n.f12433a
            return r5
        L9c:
            i0.a0 r5 = (i0.a0) r5
            r5.getClass()
            w.g1 r5 = new w.g1
            r0 = 1
            i0.a1 r1 = r4.f388h
            r5.<init>(r1, r0)
            return r5
        Laa:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.getClass()
            i0.a1 r0 = r4.f388h
            r0.setValue(r5)
            sf.n r5 = sf.n.f12433a
            return r5
        Lb7:
            java.lang.String r5 = (java.lang.String) r5
            r0 = 19
            i0.a1 r1 = r4.f388h
            bc.e.r(r5, r5, r0, r1)
            sf.n r5 = sf.n.f12433a
            return r5
        Lc3:
            java.lang.String r5 = (java.lang.String) r5
            r0 = 19
            i0.a1 r1 = r4.f388h
            bc.e.r(r5, r5, r0, r1)
            sf.n r5 = sf.n.f12433a
            return r5
        Lcf:
            java.lang.String r5 = (java.lang.String) r5
            r0 = 8
            i0.a1 r1 = r4.f388h
            bc.e.r(r5, r5, r0, r1)
            sf.n r5 = sf.n.f12433a
            return r5
        Ldb:
            c9.a r5 = (c9.a) r5
            r5.getClass()
            wb.x0 r0 = new wb.x0
            r1 = 1
            r0.<init>(r5, r1)
            i0.a1 r5 = r4.f388h
            r5.setValue(r0)
            sf.n r5 = sf.n.f12433a
            return r5
        Lee:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            i0.a1 r0 = r4.f388h
            r0.setValue(r5)
            sf.n r5 = sf.n.f12433a
            return r5
        Lfb:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            i0.a1 r0 = r4.f388h
            r0.setValue(r5)
            sf.n r5 = sf.n.f12433a
            return r5
        L108:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            i0.a1 r0 = r4.f388h
            r0.setValue(r5)
            sf.n r5 = sf.n.f12433a
            return r5
        L115:
            e1.b r5 = (e1.b) r5
            i0.a1 r0 = r4.f388h
            java.lang.Object r0 = r0.getValue()
            fg.l r0 = (fg.l) r0
            r0.invoke(r5)
            sf.n r5 = sf.n.f12433a
            return r5
        L125:
            i0.a0 r5 = (i0.a0) r5
            w.g1 r5 = new w.g1
            r0 = 0
            i0.a1 r1 = r4.f388h
            r5.<init>(r1, r0)
            return r5
        L130:
            java.util.List r5 = (java.util.List) r5
            i0.a1 r0 = r4.f388h
            if (r0 == 0) goto L139
            r0.setValue(r5)
        L139:
            sf.n r5 = sf.n.f12433a
            return r5
        L13c:
            g0.i r5 = (g0.i) r5
            boolean r0 = r5.f4028c
            if (r0 == 0) goto L145
            i2.g r5 = r5.f4027b
            goto L147
        L145:
            i2.g r5 = r5.f4026a
        L147:
            i0.a1 r0 = r4.f388h
            r0.setValue(r5)
            sf.n r5 = sf.n.f12433a
            return r5
        L14f:
            x1.h0 r5 = (x1.h0) r5
            r5.getClass()
            i0.a1 r0 = r4.f388h
            java.lang.Object r0 = r0.getValue()
            fg.l r0 = (fg.l) r0
            r0.invoke(r5)
            sf.n r5 = sf.n.f12433a
            return r5
        L162:
            i2.k0 r5 = (i2.k0) r5
            r5.getClass()
            long r0 = r5.f6348c
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r5 = (int) r0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            i0.a1 r0 = r4.f388h
            r0.setValue(r5)
            sf.n r5 = sf.n.f12433a
            return r5
        L17c:
            java.lang.Float r5 = (java.lang.Float) r5
            r5.getClass()
            i0.a1 r0 = r4.f388h
            java.lang.Object r0 = r0.getValue()
            fg.l r0 = (fg.l) r0
            java.lang.Object r5 = r0.invoke(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            return r5
        L198:
            java.lang.Float r5 = (java.lang.Float) r5
            r5.getClass()
            i0.a1 r0 = r4.f388h
            java.lang.Object r0 = r0.getValue()
            fg.l r0 = (fg.l) r0
            r0.invoke(r5)
            sf.n r5 = sf.n.f12433a
            return r5
        L1ab:
            i0.a1 r0 = r4.f388h
            v1.t r5 = (v1.t) r5
            r0.setValue(r5)
            sf.n r5 = sf.n.f12433a
            return r5
        L1b5:
            i0.a1 r0 = r4.f388h
            java.lang.String r5 = (java.lang.String) r5
            r0.setValue(r5)
            sf.n r5 = sf.n.f12433a
            return r5
        L1bf:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            i0.a1 r0 = r4.f388h
            java.lang.Object r1 = r0.getValue()
            java.util.Set r1 = (java.util.Set) r1
            boolean r1 = r1.contains(r5)
            if (r1 == 0) goto L1dd
            java.lang.Object r1 = r0.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.util.LinkedHashSet r5 = tf.d0.S(r1, r5)
            goto L1e7
        L1dd:
            java.lang.Object r1 = r0.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.util.LinkedHashSet r5 = tf.d0.V(r1, r5)
        L1e7:
            r0.setValue(r5)
            sf.n r5 = sf.n.f12433a
            return r5
        L1ed:
            i0.a1 r0 = r4.f388h
            java.lang.String r5 = (java.lang.String) r5
            r0.setValue(r5)
            sf.n r5 = sf.n.f12433a
            return r5
        L1f7:
            java.lang.String r5 = (java.lang.String) r5
            r0 = 50
            i0.a1 r1 = r4.f388h
            bc.e.r(r5, r5, r0, r1)
            sf.n r5 = sf.n.f12433a
            return r5
        L203:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            i0.a1 r0 = r4.f388h
            r0.setValue(r5)
            sf.n r5 = sf.n.f12433a
            return r5
        L210:
            i0.a1 r0 = r4.f388h
            v1.t r5 = (v1.t) r5
            r0.setValue(r5)
            sf.n r5 = sf.n.f12433a
            return r5
        L21a:
            i0.a1 r0 = r4.f388h
            v1.t r5 = (v1.t) r5
            r0.setValue(r5)
            sf.n r5 = sf.n.f12433a
            return r5
    }
}
