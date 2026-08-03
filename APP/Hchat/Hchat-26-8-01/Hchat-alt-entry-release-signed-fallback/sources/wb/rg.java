package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rg implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18876g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fg.l f18877h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ db.c f18878i;

    public /* synthetic */ rg(int r1, db.c r2, fg.l r3) {
            r0 = this;
            r0.f18876g = r1
            r0.f18877h = r3
            r0.f18878i = r2
            r0.<init>()
            return
    }

    public /* synthetic */ rg(db.c r2, fg.l r3) {
            r1 = this;
            r0 = 5
            r1.f18876g = r0
            r1.<init>()
            r1.f18878i = r2
            r1.f18877h = r3
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r31) {
            r30 = this;
            r0 = r30
            int r1 = r0.f18876g
            switch(r1) {
                case 0: goto L3ce;
                case 1: goto L384;
                case 2: goto L32d;
                case 3: goto L2c8;
                case 4: goto L268;
                case 5: goto L21e;
                case 6: goto L1e8;
                case 7: goto L19e;
                case 8: goto L154;
                case 9: goto L120;
                case 10: goto L63;
                default: goto L7;
            }
        L7:
            r1 = r31
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            r2 = 10
            java.lang.Integer r1 = og.t.e0(r2, r1)
            if (r1 == 0) goto L28
            int r2 = r1.intValue()
            if (r2 == 0) goto L21
            r3 = 1
            if (r2 != r3) goto L20
            goto L21
        L20:
            r1 = 0
        L21:
            if (r1 == 0) goto L28
            int r1 = r1.intValue()
            goto L29
        L28:
            r1 = 0
        L29:
            db.c r2 = r0.f18878i
            int r3 = r2.f2188u
            if (r1 != r3) goto L33
            java.util.List r3 = r2.f2173f
        L31:
            r7 = r3
            goto L36
        L33:
            tf.t r3 = tf.t.f13167g
            goto L31
        L36:
            r25 = 0
            r26 = 3145695(0x2fffdf, float:4.408058E-39)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = r1
            db.c r1 = db.c.a(r2, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            fg.l r2 = r0.f18877h
            r2.invoke(r1)
        L60:
            sf.n r1 = sf.n.f12433a
            return r1
        L63:
            r1 = r31
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            r2 = 10
            java.lang.Integer r1 = og.t.e0(r2, r1)
            r2 = 0
            if (r1 == 0) goto L78
            int r1 = r1.intValue()
            goto L79
        L78:
            r1 = r2
        L79:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r4 = 1
            if (r1 == 0) goto L84
            if (r1 != r4) goto L83
            goto L84
        L83:
            r3 = 0
        L84:
            if (r3 == 0) goto L8b
            int r1 = r3.intValue()
            goto L8c
        L8b:
            r1 = r2
        L8c:
            db.c r5 = r0.f18878i
            int r3 = r5.f2185r
            if (r1 != r3) goto L94
            goto L119
        L94:
            if (r1 != 0) goto Lc0
            r28 = 0
            r29 = 4063231(0x3dffff, float:5.6938E-39)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r24 = r1
            db.c r5 = db.c.a(r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            goto L119
        Lc0:
            r24 = r1
            java.lang.String r1 = wb.ho.X6(r5)
            boolean r1 = og.m.t0(r1)
            java.util.List r3 = wb.ho.W6(r5, r4)
            boolean r3 = r3.isEmpty()
            r6 = 2
            java.util.List r7 = wb.ho.W6(r5, r6)
            boolean r7 = r7.isEmpty()
            if (r1 != 0) goto Le2
            if (r3 != 0) goto Le2
            r25 = r4
            goto Lf3
        Le2:
            if (r1 != 0) goto Le9
            if (r7 != 0) goto Le9
            r25 = r6
            goto Lf3
        Le9:
            if (r3 != 0) goto Lef
            r2 = 3
        Lec:
            r25 = r2
            goto Lf3
        Lef:
            if (r7 != 0) goto Lec
            r2 = 4
            goto Lec
        Lf3:
            r28 = 0
            r29 = 2752479(0x29ffdf, float:3.857045E-39)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            tf.t r10 = tf.t.f13167g
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r26 = 0
            r27 = 0
            db.c r5 = db.c.a(r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29)
        L119:
            fg.l r1 = r0.f18877h
            r1.invoke(r5)
            goto L60
        L120:
            r20 = r31
            java.lang.String r20 = (java.lang.String) r20
            r20.getClass()
            r25 = 0
            r26 = 4128767(0x3effff, float:5.785635E-39)
            db.c r2 = r0.f18878i
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            db.c r1 = db.c.a(r2, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            fg.l r2 = r0.f18877h
            r2.invoke(r1)
            goto L60
        L154:
            r1 = r31
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            r2 = 10
            java.lang.Integer r1 = og.t.e0(r2, r1)
            r2 = 0
            if (r1 == 0) goto L16e
            int r1 = r1.intValue()
            r3 = 3600(0xe10, float:5.045E-42)
            int r2 = r9.e0.r(r1, r2, r3)
        L16e:
            r14 = r2
            r26 = 0
            r27 = 4193279(0x3ffbff, float:5.876035E-39)
            db.c r3 = r0.f18878i
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            db.c r1 = db.c.a(r3, r4, r5, r6, r7, r8, r9, r11, r12, r13, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            fg.l r2 = r0.f18877h
            r2.invoke(r1)
            goto L60
        L19e:
            r1 = r31
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            r2 = 10
            java.lang.Integer r1 = og.t.e0(r2, r1)
            r2 = 0
            if (r1 == 0) goto L1b8
            int r1 = r1.intValue()
            r3 = 3600(0xe10, float:5.045E-42)
            int r2 = r9.e0.r(r1, r2, r3)
        L1b8:
            r13 = r2
            r26 = 0
            r27 = 4193791(0x3ffdff, float:5.876753E-39)
            db.c r3 = r0.f18878i
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            db.c r1 = db.c.a(r3, r4, r5, r6, r7, r8, r9, r11, r12, r13, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            fg.l r2 = r0.f18877h
            r2.invoke(r1)
            goto L60
        L1e8:
            r1 = r31
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r14 = r1.booleanValue()
            r25 = 0
            r26 = 4192255(0x3ff7ff, float:5.8746E-39)
            db.c r2 = r0.f18878i
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            db.c r1 = db.c.a(r2, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            fg.l r2 = r0.f18877h
            r2.invoke(r1)
            goto L60
        L21e:
            r1 = r31
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            db.c r2 = r0.f18878i
            java.util.Set r3 = r2.f2176i
            boolean r3 = r3.contains(r1)
            java.util.Set r4 = r2.f2176i
            if (r3 == 0) goto L237
            java.util.LinkedHashSet r1 = tf.d0.S(r4, r1)
        L235:
            r11 = r1
            goto L23c
        L237:
            java.util.LinkedHashSet r1 = tf.d0.V(r4, r1)
            goto L235
        L23c:
            r25 = 0
            r26 = 4194047(0x3ffeff, float:5.877112E-39)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            db.c r1 = db.c.a(r2, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            fg.l r2 = r0.f18877h
            r2.invoke(r1)
            goto L60
        L268:
            r1 = r31
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            r2 = 10
            java.lang.Integer r1 = og.t.e0(r2, r1)
            if (r1 == 0) goto L27d
            int r1 = r1.intValue()
        L27b:
            r10 = r1
            goto L27f
        L27d:
            r1 = 0
            goto L27b
        L27f:
            db.c r2 = r0.f18878i
            r1 = 2
            if (r10 != r1) goto L29a
            java.util.Set r3 = r2.f2176i
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L296
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.Set r3 = ac.p.N(r1)
        L296:
            java.util.Set r3 = (java.util.Set) r3
        L298:
            r11 = r3
            goto L29d
        L29a:
            tf.v r3 = tf.v.f13169g
            goto L298
        L29d:
            r25 = 0
            r26 = 4193919(0x3ffe7f, float:5.876932E-39)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            db.c r1 = db.c.a(r2, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            fg.l r2 = r0.f18877h
            r2.invoke(r1)
            goto L60
        L2c8:
            r1 = r31
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            db.c r2 = r0.f18878i
            java.util.List r3 = r2.f2187t
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L2dc:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L2f2
            java.lang.Object r5 = r3.next()
            r6 = r5
            db.a r6 = (db.a) r6
            int r6 = r6.f2166a
            if (r6 != 0) goto L2ee
            goto L2dc
        L2ee:
            r4.add(r5)
            goto L2dc
        L2f2:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r4)
            db.a r4 = new db.a
            r5 = 0
            r4.<init>(r5, r1)
            r3.add(r5, r4)
            r25 = 0
            r26 = 3670015(0x37ffff, float:5.142786E-39)
            r23 = r3
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            db.c r1 = db.c.a(r2, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            fg.l r2 = r0.f18877h
            r2.invoke(r1)
            goto L60
        L32d:
            r1 = r31
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            r2 = 10
            java.lang.Integer r1 = og.t.e0(r2, r1)
            r2 = 0
            if (r1 == 0) goto L342
            int r1 = r1.intValue()
            goto L343
        L342:
            r1 = r2
        L343:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            if (r1 < 0) goto L34d
            r4 = 5
            if (r1 >= r4) goto L34d
            goto L34e
        L34d:
            r3 = 0
        L34e:
            if (r3 == 0) goto L354
            int r2 = r3.intValue()
        L354:
            r23 = r2
            r26 = 0
            r27 = 3932159(0x3bffff, float:5.510128E-39)
            db.c r3 = r0.f18878i
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            db.c r1 = db.c.a(r3, r4, r5, r6, r7, r8, r9, r11, r12, r13, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            fg.l r2 = r0.f18877h
            r2.invoke(r1)
            goto L60
        L384:
            r1 = r31
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            r2 = 10
            java.lang.Integer r1 = og.t.e0(r2, r1)
            r2 = 0
            if (r1 == 0) goto L39e
            int r1 = r1.intValue()
            r3 = 3600(0xe10, float:5.045E-42)
            int r2 = r9.e0.r(r1, r2, r3)
        L39e:
            r14 = r2
            r26 = 0
            r27 = 4193279(0x3ffbff, float:5.876035E-39)
            db.c r3 = r0.f18878i
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            db.c r1 = db.c.a(r3, r4, r5, r6, r7, r8, r9, r11, r12, r13, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            fg.l r2 = r0.f18877h
            r2.invoke(r1)
            goto L60
        L3ce:
            r1 = r31
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            r2 = 10
            java.lang.Integer r1 = og.t.e0(r2, r1)
            r2 = 0
            if (r1 == 0) goto L3e8
            int r1 = r1.intValue()
            r3 = 3600(0xe10, float:5.045E-42)
            int r2 = r9.e0.r(r1, r2, r3)
        L3e8:
            r13 = r2
            r26 = 0
            r27 = 4193791(0x3ffdff, float:5.876753E-39)
            db.c r3 = r0.f18878i
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            db.c r1 = db.c.a(r3, r4, r5, r6, r7, r8, r9, r11, r12, r13, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            fg.l r2 = r0.f18877h
            r2.invoke(r1)
            goto L60
    }
}
