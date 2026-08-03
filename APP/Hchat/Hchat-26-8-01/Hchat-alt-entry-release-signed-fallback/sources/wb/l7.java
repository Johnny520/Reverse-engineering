package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l7 implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17407g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f17408h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f17409i;

    public /* synthetic */ l7(fg.l r2, s1.x r3) {
            r1 = this;
            r0 = 20
            r1.f17407g = r0
            r1.<init>()
            r1.f17409i = r2
            r1.f17408h = r3
            return
    }

    public /* synthetic */ l7(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f17407g = r2
            r0.f17408h = r1
            r0.f17409i = r3
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.f17407g
            switch(r0) {
                case 0: goto L331;
                case 1: goto L30e;
                case 2: goto L2ce;
                case 3: goto L285;
                case 4: goto L257;
                case 5: goto L240;
                case 6: goto L223;
                case 7: goto L1f7;
                case 8: goto L1e5;
                case 9: goto L1b9;
                case 10: goto L1a7;
                case 11: goto L17b;
                case 12: goto L169;
                case 13: goto L122;
                case 14: goto L108;
                case 15: goto Ld7;
                case 16: goto La5;
                case 17: goto L92;
                case 18: goto L6d;
                case 19: goto L2b;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r8.f17409i
            fg.l r0 = (fg.l) r0
            java.lang.Object r1 = r8.f17408h
            s1.x r1 = (s1.x) r1
            e1.b r9 = (e1.b) r9
            long r2 = r9.f2294a
            r9 = 32
            long r2 = r2 >> r9
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            s1.l0 r1 = (s1.l0) r1
            long r3 = r1.E
            long r3 = r3 >> r9
            int r9 = (int) r3
            float r9 = (float) r9
            float r2 = r2 / r9
            java.lang.Float r9 = java.lang.Float.valueOf(r2)
            r0.invoke(r9)
        L28:
            sf.n r9 = sf.n.f12433a
            return r9
        L2b:
            java.lang.Object r0 = r8.f17408h
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r1 = r8.f17409i
            i0.a1 r1 = (i0.a1) r1
            r.h r9 = (r.h) r9
            r9.getClass()
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        L3d:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L6a
            java.lang.Object r3 = r0.next()
            int r4 = r2 + 1
            if (r2 < 0) goto L65
            sf.e r3 = (sf.e) r3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            wb.tu r6 = new wb.tu
            r6.<init>(r3, r2, r1)
            s0.d r2 = new s0.d
            r3 = 73361640(0x45f68e8, float:2.6261695E-36)
            r7 = 1
            r2.<init>(r3, r6, r7)
            r3 = 2
            r.h.a(r9, r5, r2, r3)
            r2 = r4
            goto L3d
        L65:
            a.a.Q0()
            r9 = 0
            throw r9
        L6a:
            sf.n r9 = sf.n.f12433a
            return r9
        L6d:
            java.lang.Object r0 = r8.f17408h
            u2.c r0 = (u2.c) r0
            java.lang.Object r1 = r8.f17409i
            fg.a r1 = (fg.a) r1
            e1.b r9 = (e1.b) r9
            long r2 = r9.f2294a
            r9 = 32
            long r2 = r2 >> r9
            int r9 = (int) r2
            float r9 = java.lang.Float.intBitsToFloat(r9)
            r2 = 38
            float r2 = (float) r2
            float r0 = r0.x0(r2)
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 <= 0) goto L8f
            r1.invoke()
        L8f:
            sf.n r9 = sf.n.f12433a
            return r9
        L92:
            java.lang.Object r0 = r8.f17408h
            fg.p r0 = (fg.p) r0
            java.lang.Object r1 = r8.f17409i
            fb.r0 r1 = (fb.r0) r1
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            r9.getClass()
            java.lang.String r1 = r1.f3744a
            r0.invoke(r1, r9)
            goto L28
        La5:
            java.lang.Object r0 = r8.f17408h
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r1 = r8.f17409i
            fb.q1 r1 = (fb.q1) r1
            java.lang.String r9 = (java.lang.String) r9
            r9.getClass()
            java.lang.String r2 = "clipboard"
            java.lang.Object r2 = r0.getSystemService(r2)
            boolean r3 = r2 instanceof android.content.ClipboardManager
            if (r3 == 0) goto Lbf
            android.content.ClipboardManager r2 = (android.content.ClipboardManager) r2
            goto Lc0
        Lbf:
            r2 = 0
        Lc0:
            if (r2 == 0) goto Lcb
            java.lang.String r1 = r1.f3723c
            android.content.ClipData r9 = android.content.ClipData.newPlainText(r1, r9)
            r2.setPrimaryClip(r9)
        Lcb:
            java.lang.String r9 = "已复制"
            r1 = 0
            android.widget.Toast r9 = android.widget.Toast.makeText(r0, r9, r1)
            r9.show()
            goto L28
        Ld7:
            java.lang.Object r0 = r8.f17408h
            wb.me r0 = (wb.me) r0
            java.lang.Object r1 = r8.f17409i
            java.util.LinkedHashSet r1 = (java.util.LinkedHashSet) r1
            java.util.List r9 = (java.util.List) r9
            r9.getClass()
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            java.util.Iterator r9 = r9.iterator()
        Led:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto Lff
            java.lang.Object r3 = r9.next()
            wb.jv r3 = (wb.jv) r3
            java.lang.String r3 = r3.f17140a
            r2.add(r3)
            goto Led
        Lff:
            java.util.LinkedHashSet r9 = tf.d0.U(r1, r2)
            r0.invoke(r9)
            goto L28
        L108:
            java.lang.Object r0 = r8.f17408h
            wb.qh r0 = (wb.qh) r0
            java.lang.Object r1 = r8.f17409i
            wb.gh r1 = (wb.gh) r1
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            if (r9 != 0) goto L11c
            r0.invoke()
            goto L11f
        L11c:
            r1.invoke()
        L11f:
            sf.n r9 = sf.n.f12433a
            return r9
        L122:
            java.lang.Object r0 = r8.f17408h
            wb.l4 r0 = (wb.l4) r0
            java.lang.Object r1 = r8.f17409i
            i0.a1 r1 = (i0.a1) r1
            java.util.List r9 = (java.util.List) r9
            r9.getClass()
            wb.i4 r0 = (wb.i4) r0
            wb.v0 r2 = r0.f16716a
            fg.l r2 = r2.f19587e
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = tf.n.e1(r9)
            r3.<init>(r4)
            java.util.Iterator r9 = r9.iterator()
        L142:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L154
            java.lang.Object r4 = r9.next()
            wb.s0 r4 = (wb.s0) r4
            java.lang.String r4 = r4.f18970a
            r3.add(r4)
            goto L142
        L154:
            java.lang.String r9 = wb.ho.D5(r3)
            r2.invoke(r9)
            boolean r9 = r0.f16717b
            if (r9 == 0) goto L162
            wb.h4 r9 = wb.h4.f16487c
            goto L164
        L162:
            wb.h4 r9 = wb.h4.f16486b
        L164:
            r1.setValue(r9)
            goto L28
        L169:
            java.lang.Object r0 = r8.f17408h
            fg.p r0 = (fg.p) r0
            java.lang.Object r1 = r8.f17409i
            x8.b r1 = (x8.b) r1
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            r9.booleanValue()
            r0.invoke(r1, r9)
            goto L28
        L17b:
            java.lang.Object r0 = r8.f17408h
            aa.h r0 = (aa.h) r0
            java.lang.String r0 = r0.f132a
            java.lang.Object r1 = r8.f17409i
            i0.a1 r1 = (i0.a1) r1
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L198
            java.lang.Object r9 = r1.getValue()
            java.util.Set r9 = (java.util.Set) r9
            java.util.LinkedHashSet r9 = tf.d0.V(r9, r0)
            goto L1a2
        L198:
            java.lang.Object r9 = r1.getValue()
            java.util.Set r9 = (java.util.Set) r9
            java.util.LinkedHashSet r9 = tf.d0.S(r9, r0)
        L1a2:
            r1.setValue(r9)
            goto L28
        L1a7:
            java.lang.Object r0 = r8.f17408h
            fg.p r0 = (fg.p) r0
            java.lang.Object r1 = r8.f17409i
            v8.a r1 = (v8.a) r1
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            r9.booleanValue()
            r0.invoke(r1, r9)
            goto L28
        L1b9:
            java.lang.Object r0 = r8.f17408h
            wb.s0 r0 = (wb.s0) r0
            java.lang.String r0 = r0.f18970a
            java.lang.Object r1 = r8.f17409i
            i0.a1 r1 = (i0.a1) r1
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L1d6
            java.lang.Object r9 = r1.getValue()
            java.util.Set r9 = (java.util.Set) r9
            java.util.LinkedHashSet r9 = tf.d0.V(r9, r0)
            goto L1e0
        L1d6:
            java.lang.Object r9 = r1.getValue()
            java.util.Set r9 = (java.util.Set) r9
            java.util.LinkedHashSet r9 = tf.d0.S(r9, r0)
        L1e0:
            r1.setValue(r9)
            goto L28
        L1e5:
            java.lang.Object r0 = r8.f17408h
            fg.p r0 = (fg.p) r0
            java.lang.Object r1 = r8.f17409i
            e9.c r1 = (e9.c) r1
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            r9.booleanValue()
            r0.invoke(r1, r9)
            goto L28
        L1f7:
            java.lang.Object r0 = r8.f17408h
            sf.j r0 = (sf.j) r0
            java.lang.Object r0 = r0.f12428g
            java.lang.Object r1 = r8.f17409i
            i0.a1 r1 = (i0.a1) r1
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L214
            java.lang.Object r9 = r1.getValue()
            java.util.Set r9 = (java.util.Set) r9
            java.util.LinkedHashSet r9 = tf.d0.V(r9, r0)
            goto L21e
        L214:
            java.lang.Object r9 = r1.getValue()
            java.util.Set r9 = (java.util.Set) r9
            java.util.LinkedHashSet r9 = tf.d0.S(r9, r0)
        L21e:
            r1.setValue(r9)
            goto L28
        L223:
            java.lang.Object r0 = r8.f17408h
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r1 = r8.f17409i
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L234
            goto L236
        L234:
            java.lang.String r1 = "缓存将在下次启动时继续清理"
        L236:
            r9 = 0
            android.widget.Toast r9 = android.widget.Toast.makeText(r0, r1, r9)
            r9.show()
            goto L28
        L240:
            java.lang.Object r0 = r8.f17408h
            j8.i r0 = (j8.i) r0
            java.lang.Object r1 = r8.f17409i
            i0.a1 r1 = (i0.a1) r1
            java.lang.String r9 = (java.lang.String) r9
            r9.getClass()
            wb.z2 r2 = new wb.z2
            r2.<init>(r0, r9)
            r1.setValue(r2)
            goto L28
        L257:
            java.lang.Object r0 = r8.f17408h
            wb.z2 r0 = (wb.z2) r0
            java.lang.Object r1 = r8.f17409i
            i0.a1 r1 = (i0.a1) r1
            android.content.Context r9 = (android.content.Context) r9
            r9.getClass()
            android.widget.VideoView r2 = new android.widget.VideoView
            r2.<init>(r9)
            android.widget.MediaController r3 = new android.widget.MediaController
            r3.<init>(r9)
            r3.setAnchorView(r2)
            r2.setMediaController(r3)
            java.lang.String r9 = r0.f20517b
            r2.setVideoPath(r9)
            wb.ag r9 = new wb.ag
            r9.<init>(r2)
            r2.setOnPreparedListener(r9)
            r1.setValue(r2)
            return r2
        L285:
            java.lang.Object r0 = r8.f17408h
            wb.s0 r0 = (wb.s0) r0
            java.lang.Object r1 = r8.f17409i
            java.util.LinkedHashSet r1 = (java.util.LinkedHashSet) r1
            wb.s0 r9 = (wb.s0) r9
            r9.getClass()
            java.lang.String r9 = r9.f18970a
            if (r0 != 0) goto L2bf
            if (r1 == 0) goto L29f
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L29f
            goto L2bd
        L29f:
            java.util.Iterator r0 = r1.iterator()
        L2a3:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2bd
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            r2 = 47
            java.lang.String r1 = og.m.M0(r1, r2)
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L2a3
            r9 = 1
            goto L2c9
        L2bd:
            r9 = 0
            goto L2c9
        L2bf:
            java.lang.String r0 = r0.f18970a
            java.lang.String r9 = wb.ho.M5(r0, r9)
            boolean r9 = r1.contains(r9)
        L2c9:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        L2ce:
            java.lang.Object r0 = r8.f17408h
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.lang.Object r1 = r8.f17409i
            fg.a r1 = (fg.a) r1
            r.h r9 = (r.h) r9
            r9.getClass()
            s0.d r2 = wb.p0.f18294m
            r3 = 0
            r4 = 3
            r.h.a(r9, r3, r2, r4)
            wb.r6 r2 = new wb.r6
            r5 = 12
            r2.<init>(r0, r5)
            s0.d r0 = new s0.d
            r5 = 1413764102(0x54445406, float:3.372893E12)
            r6 = 1
            r0.<init>(r5, r2, r6)
            r.h.a(r9, r3, r0, r4)
            s0.d r0 = wb.p0.f18302n
            r.h.a(r9, r3, r0, r4)
            wb.x6 r0 = new wb.x6
            r2 = 20
            r0.<init>(r1, r2)
            s0.d r1 = new s0.d
            r2 = 1629804424(0x6124d788, float:1.900498E20)
            r1.<init>(r2, r0, r6)
            r.h.a(r9, r3, r1, r4)
            goto L28
        L30e:
            java.lang.Object r0 = r8.f17408h
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r8.f17409i
            i0.a1 r1 = (i0.a1) r1
            r.h r9 = (r.h) r9
            r9.getClass()
            wb.qc r2 = new wb.qc
            r3 = 4
            r2.<init>(r0, r1, r3)
            s0.d r0 = new s0.d
            r1 = 783426531(0x2eb223e3, float:8.1008776E-11)
            r3 = 1
            r0.<init>(r1, r2, r3)
            r1 = 3
            r2 = 0
            r.h.a(r9, r2, r0, r1)
            goto L28
        L331:
            java.lang.Object r0 = r8.f17408h
            wb.c3 r0 = (wb.c3) r0
            java.lang.Object r1 = r8.f17409i
            fg.l r1 = (fg.l) r1
            r.h r9 = (r.h) r9
            r9.getClass()
            s0.d r2 = wb.p0.f18278k
            r3 = 0
            r4 = 3
            r.h.a(r9, r3, r2, r4)
            db.f r2 = new db.f
            r5 = 17
            r2.<init>(r0, r5, r1)
            s0.d r0 = new s0.d
            r1 = -1524833128(0xffffffffa51ce498, float:-1.3608294E-16)
            r5 = 1
            r0.<init>(r1, r2, r5)
            r.h.a(r9, r3, r0, r4)
            goto L28
    }
}
