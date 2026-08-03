package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ad implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f14979g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f14980h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f14981i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f14982j;

    public /* synthetic */ ad(i0.a1 r1, i0.a1 r2, i0.a1 r3, int r4) {
            r0 = this;
            r0.f14979g = r4
            r0.f14980h = r1
            r0.f14981i = r2
            r0.f14982j = r3
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r12) {
            r11 = this;
            int r0 = r11.f14979g
            switch(r0) {
                case 0: goto L1fe;
                case 1: goto L1dc;
                case 2: goto L1bf;
                case 3: goto L173;
                case 4: goto L159;
                case 5: goto L13f;
                case 6: goto Lf8;
                case 7: goto Ld2;
                case 8: goto L8c;
                case 9: goto L6b;
                case 10: goto L36;
                default: goto L5;
            }
        L5:
            java.lang.Integer r12 = (java.lang.Integer) r12
            r12.getClass()
            i0.a1 r0 = r11.f14981i
            java.lang.Object r0 = r0.getValue()
            n1.a r0 = (n1.a) r0
            r1 = 16
            n1.c r0 = (n1.c) r0
            r0.a(r1)
            i0.a1 r0 = r11.f14980h
            java.lang.Object r0 = r0.getValue()
            fg.l r0 = (fg.l) r0
            if (r0 == 0) goto L26
            r0.invoke(r12)
        L26:
            i0.a1 r12 = r11.f14982j
            java.lang.Object r12 = r12.getValue()
            fg.a r12 = (fg.a) r12
            if (r12 == 0) goto L33
            r12.invoke()
        L33:
            sf.n r12 = sf.n.f12433a
            return r12
        L36:
            i0.a1 r0 = r11.f14982j
            java.lang.Float r12 = (java.lang.Float) r12
            float r12 = r12.floatValue()
            i0.a1 r1 = r11.f14980h
            java.lang.Object r1 = r1.getValue()
            android.media.MediaPlayer r1 = (android.media.MediaPlayer) r1
            if (r1 == 0) goto L68
            i0.a1 r2 = r11.f14981i
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            float r2 = (float) r2
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            float r12 = r9.e0.q(r12, r3, r4)
            float r12 = r12 * r2
            int r12 = (int) r12
            r1.seekTo(r12)     // Catch: java.lang.Throwable -> L68
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L68
            r0.setValue(r12)     // Catch: java.lang.Throwable -> L68
        L68:
            sf.n r12 = sf.n.f12433a
            return r12
        L6b:
            e1.b r12 = (e1.b) r12
            r12 = 0
            java.lang.Float r12 = java.lang.Float.valueOf(r12)
            i0.a1 r0 = r11.f14980h
            r0.setValue(r12)
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            i0.a1 r0 = r11.f14981i
            r0.setValue(r12)
            i0.a1 r0 = r11.f14982j
            java.lang.Object r0 = r0.getValue()
            fg.l r0 = (fg.l) r0
            r0.invoke(r12)
        L89:
            sf.n r12 = sf.n.f12433a
            return r12
        L8c:
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r0 = 1
            if (r12 != r0) goto L9e
            i0.a1 r1 = r11.f14980h
            java.lang.Object r1 = r1.getValue()
            java.util.Set r1 = (java.util.Set) r1
            goto La6
        L9e:
            i0.a1 r1 = r11.f14981i
            java.lang.Object r1 = r1.getValue()
            java.util.Set r1 = (java.util.Set) r1
        La6:
            wb.lo r2 = new wb.lo
            wb.v0 r3 = new wb.v0
            if (r12 != r0) goto Lb0
            java.lang.String r0 = "选择评论黑名单"
        Lae:
            r4 = r0
            goto Lb3
        Lb0:
            java.lang.String r0 = "选择评论白名单"
            goto Lae
        Lb3:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.String r7 = wb.ho.D5(r1)
            wb.jk r8 = new wb.jk
            r0 = 26
            r8.<init>(r0)
            r9 = 1
            r10 = 192(0xc0, float:2.69E-43)
            wb.u0 r5 = wb.u0.f19344g
            r6 = 1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r2.<init>(r12, r3)
            i0.a1 r12 = r11.f14982j
            r12.setValue(r2)
            goto L89
        Ld2:
            r.h r12 = (r.h) r12
            r12.getClass()
            s0.d r0 = wb.p0.B
            r1 = 0
            r2 = 3
            r.h.a(r12, r1, r0, r2)
            wb.p7 r0 = new wb.p7
            r3 = 10
            i0.a1 r4 = r11.f14980h
            i0.a1 r5 = r11.f14981i
            i0.a1 r6 = r11.f14982j
            r0.<init>(r4, r5, r6, r3)
            s0.d r3 = new s0.d
            r4 = -954467868(0xffffffffc71bf9e4, float:-39929.89)
            r5 = 1
            r3.<init>(r4, r0, r5)
            r.h.a(r12, r1, r3, r2)
            goto L89
        Lf8:
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r0 = 1
            if (r12 != r0) goto L10a
            i0.a1 r1 = r11.f14980h
            java.lang.Object r1 = r1.getValue()
            java.util.Set r1 = (java.util.Set) r1
            goto L112
        L10a:
            i0.a1 r1 = r11.f14981i
            java.lang.Object r1 = r1.getValue()
            java.util.Set r1 = (java.util.Set) r1
        L112:
            wb.ro r2 = new wb.ro
            wb.v0 r3 = new wb.v0
            if (r12 != r0) goto L11c
            java.lang.String r0 = "选择点赞黑名单"
        L11a:
            r4 = r0
            goto L11f
        L11c:
            java.lang.String r0 = "选择点赞白名单"
            goto L11a
        L11f:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.String r7 = wb.ho.D5(r1)
            wb.jk r8 = new wb.jk
            r0 = 18
            r8.<init>(r0)
            r9 = 1
            r10 = 192(0xc0, float:2.69E-43)
            wb.u0 r5 = wb.u0.f19344g
            r6 = 1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r2.<init>(r12, r3)
            i0.a1 r12 = r11.f14982j
            r12.setValue(r2)
            goto L89
        L13f:
            x8.b r12 = (x8.b) r12
            r12.getClass()
            java.lang.String r0 = r12.f21231a
            i0.a1 r1 = r11.f14980h
            r1.setValue(r0)
            i0.a1 r0 = r11.f14981i
            r0.setValue(r12)
            java.lang.String r12 = "ruleEditor"
            i0.a1 r0 = r11.f14982j
            r0.setValue(r12)
            goto L89
        L159:
            db.c r12 = (db.c) r12
            r12.getClass()
            java.lang.String r0 = r12.f2168a
            i0.a1 r1 = r11.f14980h
            r1.setValue(r0)
            i0.a1 r0 = r11.f14981i
            r0.setValue(r12)
            wb.xq r12 = wb.xq.f20251b
            i0.a1 r0 = r11.f14982j
            r0.setValue(r12)
            goto L89
        L173:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L184
            i0.a1 r0 = r11.f14980h
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            goto L18c
        L184:
            i0.a1 r0 = r11.f14981i
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
        L18c:
            wb.n4 r1 = new wb.n4
            wb.v0 r2 = new wb.v0
            if (r12 == 0) goto L195
            java.lang.String r3 = "选择仅生效聊天"
            goto L197
        L195:
            java.lang.String r3 = "选择排除聊天"
        L197:
            r4 = r0
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r8 = 0
            r9 = 62
            java.lang.String r5 = ","
            r6 = 0
            r7 = 0
            java.lang.String r6 = tf.m.A1(r4, r5, r6, r7, r8, r9)
            wb.jk r7 = new wb.jk
            r0 = 20
            r7.<init>(r0)
            r8 = 1
            r9 = 192(0xc0, float:2.69E-43)
            wb.u0 r4 = wb.u0.f19346i
            r5 = 1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r1.<init>(r2, r12)
            i0.a1 r12 = r11.f14982j
            r12.setValue(r1)
            goto L89
        L1bf:
            wb.k5 r12 = (wb.k5) r12
            r12.getClass()
            i0.a1 r0 = r11.f14980h
            r0.setValue(r12)
            wb.k5 r0 = wb.k5.f17198l
            if (r12 != r0) goto L1d3
            r12 = 0
            i0.a1 r0 = r11.f14981i
            r0.setValue(r12)
        L1d3:
            java.lang.String r12 = ""
            i0.a1 r0 = r11.f14982j
            r0.setValue(r12)
            goto L89
        L1dc:
            java.lang.String r12 = (java.lang.String) r12
            r12.getClass()
            i0.a1 r0 = r11.f14980h
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto L1f6
            i0.a1 r0 = r11.f14981i
            r0.setValue(r12)
            goto L1fb
        L1f6:
            i0.a1 r0 = r11.f14982j
            r0.setValue(r12)
        L1fb:
            sf.n r12 = sf.n.f12433a
            return r12
        L1fe:
            r.h r12 = (r.h) r12
            r12.getClass()
            s0.d r0 = wb.p0.f18230d1
            r1 = 0
            r2 = 3
            r.h.a(r12, r1, r0, r2)
            wb.p7 r0 = new wb.p7
            r3 = 8
            i0.a1 r4 = r11.f14980h
            i0.a1 r5 = r11.f14981i
            i0.a1 r6 = r11.f14982j
            r0.<init>(r4, r5, r6, r3)
            s0.d r3 = new s0.d
            r4 = 1209821612(0x481c69ac, float:160166.69)
            r5 = 1
            r3.<init>(r4, r0, r5)
            r.h.a(r12, r1, r3, r2)
            goto L89
    }
}
