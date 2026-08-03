package g0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4055g;

    public /* synthetic */ o(int r1) {
            r0 = this;
            r0.f4055g = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.f4055g
            sf.n r1 = sf.n.f12433a
            r2 = 0
            r3 = 1
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r6 = 32
            switch(r0) {
                case 0: goto L2a5;
                case 1: goto L28a;
                case 2: goto L25f;
                case 3: goto L246;
                case 4: goto L237;
                case 5: goto L228;
                case 6: goto L219;
                case 7: goto L20c;
                case 8: goto L175;
                case 9: goto L172;
                case 10: goto L166;
                case 11: goto L159;
                case 12: goto L14f;
                case 13: goto L145;
                case 14: goto L13b;
                case 15: goto L123;
                case 16: goto L10a;
                case 17: goto Lf2;
                case 18: goto Ld9;
                case 19: goto Lc1;
                case 20: goto La8;
                case 21: goto L97;
                case 22: goto L7e;
                case 23: goto L6d;
                case 24: goto L4d;
                case 25: goto L3d;
                case 26: goto L2d;
                case 27: goto L24;
                case 28: goto L1a;
                default: goto L10;
            }
        L10:
            i2.b r10 = (i2.b) r10
            boolean r10 = r10 instanceof i2.u
            r10 = r10 ^ r3
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            return r10
        L1a:
            i0.c1 r10 = (i0.c1) r10
            d1.c0 r10 = r10.f5854a
            if (r10 == 0) goto L23
            r10.invoke()
        L23:
            return r1
        L24:
            i.m r10 = (i.m) r10
            float r10 = r10.f5728a
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
            return r10
        L2d:
            i.p r10 = (i.p) r10
            e1.c r0 = new e1.c
            float r1 = r10.f5742a
            float r2 = r10.f5743b
            float r3 = r10.f5744c
            float r10 = r10.f5745d
            r0.<init>(r1, r2, r3, r10)
            return r0
        L3d:
            e1.c r10 = (e1.c) r10
            i.p r0 = new i.p
            float r1 = r10.f2296a
            float r2 = r10.f2297b
            float r3 = r10.f2298c
            float r10 = r10.f2299d
            r0.<init>(r1, r2, r3, r10)
            return r0
        L4d:
            i.n r10 = (i.n) r10
            float r0 = r10.f5732a
            int r0 = java.lang.Math.round(r0)
            if (r0 >= 0) goto L58
            r0 = r2
        L58:
            float r10 = r10.f5733b
            int r10 = java.lang.Math.round(r10)
            if (r10 >= 0) goto L61
            goto L62
        L61:
            r2 = r10
        L62:
            long r0 = (long) r0
            long r0 = r0 << r6
            long r2 = (long) r2
            long r2 = r2 & r4
            long r0 = r0 | r2
            u2.l r10 = new u2.l
            r10.<init>(r0)
            return r10
        L6d:
            u2.l r10 = (u2.l) r10
            i.n r0 = new i.n
            long r1 = r10.f13353a
            long r6 = r1 >> r6
            int r10 = (int) r6
            float r10 = (float) r10
            long r1 = r1 & r4
            int r1 = (int) r1
            float r1 = (float) r1
            r0.<init>(r10, r1)
            return r0
        L7e:
            i.n r10 = (i.n) r10
            float r0 = r10.f5732a
            int r0 = java.lang.Math.round(r0)
            float r10 = r10.f5733b
            int r10 = java.lang.Math.round(r10)
            long r0 = (long) r0
            long r0 = r0 << r6
            long r2 = (long) r10
            long r2 = r2 & r4
            long r0 = r0 | r2
            u2.j r10 = new u2.j
            r10.<init>(r0)
            return r10
        L97:
            u2.j r10 = (u2.j) r10
            i.n r0 = new i.n
            long r1 = r10.f13347a
            long r6 = r1 >> r6
            int r10 = (int) r6
            float r10 = (float) r10
            long r1 = r1 & r4
            int r1 = (int) r1
            float r1 = (float) r1
            r0.<init>(r10, r1)
            return r0
        La8:
            i.n r10 = (i.n) r10
            float r0 = r10.f5732a
            float r10 = r10.f5733b
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r0 = (long) r0
            int r10 = java.lang.Float.floatToRawIntBits(r10)
            long r2 = (long) r10
            long r0 = r0 << r6
            long r2 = r2 & r4
            long r0 = r0 | r2
            e1.b r10 = new e1.b
            r10.<init>(r0)
            return r10
        Lc1:
            e1.b r10 = (e1.b) r10
            i.n r0 = new i.n
            long r1 = r10.f2294a
            long r1 = r1 >> r6
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            long r2 = r10.f2294a
            long r2 = r2 & r4
            int r10 = (int) r2
            float r10 = java.lang.Float.intBitsToFloat(r10)
            r0.<init>(r1, r10)
            return r0
        Ld9:
            i.n r10 = (i.n) r10
            float r0 = r10.f5732a
            float r10 = r10.f5733b
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r0 = (long) r0
            int r10 = java.lang.Float.floatToRawIntBits(r10)
            long r2 = (long) r10
            long r0 = r0 << r6
            long r2 = r2 & r4
            long r0 = r0 | r2
            e1.e r10 = new e1.e
            r10.<init>(r0)
            return r10
        Lf2:
            e1.e r10 = (e1.e) r10
            i.n r0 = new i.n
            long r1 = r10.f2308a
            long r1 = r1 >> r6
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            long r2 = r10.f2308a
            long r2 = r2 & r4
            int r10 = (int) r2
            float r10 = java.lang.Float.intBitsToFloat(r10)
            r0.<init>(r1, r10)
            return r0
        L10a:
            i.n r10 = (i.n) r10
            float r0 = r10.f5732a
            float r10 = r10.f5733b
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r0 = (long) r0
            int r10 = java.lang.Float.floatToRawIntBits(r10)
            long r2 = (long) r10
            long r0 = r0 << r6
            long r2 = r2 & r4
            long r0 = r0 | r2
            u2.g r10 = new u2.g
            r10.<init>(r0)
            return r10
        L123:
            u2.g r10 = (u2.g) r10
            i.n r0 = new i.n
            long r1 = r10.f13345a
            long r1 = r1 >> r6
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            long r2 = r10.f13345a
            long r2 = r2 & r4
            int r10 = (int) r2
            float r10 = java.lang.Float.intBitsToFloat(r10)
            r0.<init>(r1, r10)
            return r0
        L13b:
            i.m r10 = (i.m) r10
            float r10 = r10.f5728a
            u2.f r0 = new u2.f
            r0.<init>(r10)
            return r0
        L145:
            u2.f r10 = (u2.f) r10
            i.m r0 = new i.m
            float r10 = r10.f13344g
            r0.<init>(r10)
            return r0
        L14f:
            i.m r10 = (i.m) r10
            float r10 = r10.f5728a
            int r10 = (int) r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            return r10
        L159:
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            i.m r0 = new i.m
            float r10 = (float) r10
            r0.<init>(r10)
            return r0
        L166:
            java.lang.Float r10 = (java.lang.Float) r10
            float r10 = r10.floatValue()
            i.m r0 = new i.m
            r0.<init>(r10)
            return r0
        L172:
            i.j r10 = (i.j) r10
            return r1
        L175:
            og.f r10 = (og.f) r10
            r10.getClass()
            og.i r10 = (og.i) r10
            java.util.List r0 = r10.a()
            og.g r0 = (og.g) r0
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            java.util.List r1 = r10.a()
            og.g r1 = (og.g) r1
            r4 = 2
            java.lang.Object r1 = r1.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            char[] r3 = new char[r3]
            r5 = 44
            r3[r2] = r5
            r5 = 6
            java.util.List r3 = og.m.F0(r1, r3, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r3 = r3.iterator()
        L1b1:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L1cf
            java.lang.Object r6 = r3.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.CharSequence r6 = og.m.R0(r6)
            java.lang.String r6 = r6.toString()
            java.lang.Integer r6 = og.t.f0(r6)
            if (r6 == 0) goto L1b1
            r5.add(r6)
            goto L1b1
        L1cf:
            java.util.Set r3 = tf.m.U1(r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L1ec
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L1ec
            java.lang.String r10 = r10.c()
            goto L20b
        L1ec:
            boolean r10 = og.m.t0(r1)
            r2 = 0
            if (r10 != 0) goto L1f4
            goto L1f5
        L1f4:
            r1 = r2
        L1f5:
            if (r1 == 0) goto L1fd
            java.lang.String r10 = ","
            java.lang.String r2 = r10.concat(r1)
        L1fd:
            if (r2 != 0) goto L201
            java.lang.String r2 = ""
        L201:
            java.lang.String r10 = " in (0,2"
            java.lang.String r1 = "))"
            java.lang.String r3 = "("
            java.lang.String r10 = bc.e.k(r3, r0, r10, r2, r1)
        L20b:
            return r10
        L20c:
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            r10.getClass()
            java.lang.String r10 = r10.toGenericString()
            r10.getClass()
            return r10
        L219:
            java.lang.String r10 = (java.lang.String) r10
            r10.getClass()
            boolean r10 = og.m.t0(r10)
            r10 = r10 ^ r3
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            return r10
        L228:
            java.lang.String r10 = (java.lang.String) r10
            r10.getClass()
            boolean r10 = og.m.t0(r10)
            r10 = r10 ^ r3
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            return r10
        L237:
            java.lang.String r10 = (java.lang.String) r10
            r10.getClass()
            boolean r10 = og.m.t0(r10)
            r10 = r10 ^ r3
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            return r10
        L246:
            i.n r10 = (i.n) r10
            float r0 = r10.f5732a
            float r10 = r10.f5733b
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r0 = (long) r0
            int r10 = java.lang.Float.floatToRawIntBits(r10)
            long r2 = (long) r10
            long r0 = r0 << r6
            long r2 = r2 & r4
            long r0 = r0 | r2
            e1.b r10 = new e1.b
            r10.<init>(r0)
            return r10
        L25f:
            e1.b r10 = (e1.b) r10
            long r0 = r10.f2294a
            r2 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r2 = r2 & r0
            r7 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 == 0) goto L287
            i.n r2 = new i.n
            long r0 = r0 >> r6
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            long r6 = r10.f2294a
            long r3 = r6 & r4
            int r10 = (int) r3
            float r10 = java.lang.Float.intBitsToFloat(r10)
            r2.<init>(r0, r10)
            goto L289
        L287:
            i.n r2 = h0.m0.f4942a
        L289:
            return r2
        L28a:
            java.lang.Byte r10 = (java.lang.Byte) r10
            byte r10 = r10.byteValue()
            r10 = r10 & 255(0xff, float:3.57E-43)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r3)
            java.lang.String r0 = "%02x"
            java.lang.String r10 = java.lang.String.format(r0, r10)
            return r10
        L2a5:
            x1.e2 r10 = (x1.e2) r10
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            return r10
    }
}
