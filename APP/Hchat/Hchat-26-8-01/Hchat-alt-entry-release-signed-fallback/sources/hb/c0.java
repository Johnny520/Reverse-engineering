package hb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5342g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f5343h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f5344i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f5345j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f5346k;

    public /* synthetic */ c0(long r2, float[] r4, gg.s r5, gg.r r6) {
            r1 = this;
            r0 = 1
            r1.f5342g = r0
            r1.<init>()
            r1.f5343h = r2
            r1.f5344i = r4
            r1.f5345j = r5
            r1.f5346k = r6
            return
    }

    public /* synthetic */ c0(c9.c0 r2, hb.i0 r3, android.app.Activity r4, long r5) {
            r1 = this;
            r0 = 0
            r1.f5342g = r0
            r1.<init>()
            r1.f5344i = r2
            r1.f5345j = r3
            r1.f5346k = r4
            r1.f5343h = r5
            return
    }

    public /* synthetic */ c0(e1.c r2, gg.u r3, long r4, f1.n r6) {
            r1 = this;
            r0 = 2
            r1.f5342g = r0
            r1.<init>()
            r1.f5344i = r2
            r1.f5345j = r3
            r1.f5343h = r4
            r1.f5346k = r6
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r25) {
            r24 = this;
            r1 = r24
            int r0 = r1.f5342g
            switch(r0) {
                case 0: goto L1b2;
                case 1: goto L55;
                default: goto L7;
            }
        L7:
            java.lang.Object r0 = r1.f5344i
            e1.c r0 = (e1.c) r0
            java.lang.Object r2 = r1.f5345j
            gg.u r2 = (gg.u) r2
            long r5 = r1.f5343h
            java.lang.Object r3 = r1.f5346k
            r10 = r3
            f1.n r10 = (f1.n) r10
            r3 = r25
            x1.h0 r3 = (x1.h0) r3
            r3.e()
            float r13 = r0.f2296a
            float r14 = r0.f2297b
            h1.b r15 = r3.f20932g
            b5.c r0 = r15.f5038h
            java.lang.Object r0 = r0.f469a
            androidx.lifecycle.x r0 = (androidx.lifecycle.x) r0
            r0.c0(r13, r14)
            java.lang.Object r0 = r2.f4564g     // Catch: java.lang.Throwable -> L48
            r4 = r0
            f1.g r4 = (f1.g) r4     // Catch: java.lang.Throwable -> L48
            r11 = 0
            r12 = 890(0x37a, float:1.247E-42)
            r7 = 0
            r9 = 0
            h1.d.U0(r3, r4, r5, r7, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L48
            b5.c r0 = r15.f5038h
            java.lang.Object r0 = r0.f469a
            androidx.lifecycle.x r0 = (androidx.lifecycle.x) r0
            float r2 = -r13
            float r3 = -r14
            r0.c0(r2, r3)
        L45:
            sf.n r0 = sf.n.f12433a
            return r0
        L48:
            r0 = move-exception
            b5.c r2 = r15.f5038h
            java.lang.Object r2 = r2.f469a
            androidx.lifecycle.x r2 = (androidx.lifecycle.x) r2
            float r3 = -r13
            float r4 = -r14
            r2.c0(r3, r4)
            throw r0
        L55:
            java.lang.Object r0 = r1.f5344i
            float[] r0 = (float[]) r0
            java.lang.Object r2 = r1.f5345j
            gg.s r2 = (gg.s) r2
            java.lang.Object r3 = r1.f5346k
            gg.r r3 = (gg.r) r3
            r4 = r25
            i2.r r4 = (i2.r) r4
            int r5 = r4.f6382b
            i2.a r6 = r4.f6381a
            int r7 = r4.f6383c
            long r8 = r1.f5343h
            int r10 = i2.m0.f(r8)
            if (r5 <= r10) goto L76
            int r5 = r4.f6382b
            goto L7a
        L76:
            int r5 = i2.m0.f(r8)
        L7a:
            int r10 = i2.m0.e(r8)
            if (r7 >= r10) goto L81
            goto L85
        L81:
            int r7 = i2.m0.e(r8)
        L85:
            int r5 = r4.d(r5)
            int r4 = r4.d(r7)
            long r4 = i2.e0.b(r5, r4)
            int r7 = r2.f4562g
            j2.k r8 = r6.f6248d
            int r9 = i2.m0.f(r4)
            int r10 = i2.m0.e(r4)
            android.text.Layout r11 = r8.f6700f
            java.lang.CharSequence r12 = r11.getText()
            int r12 = r12.length()
            if (r9 < 0) goto Laa
            goto Laf
        Laa:
            java.lang.String r13 = "startOffset must be > 0"
            o2.a.a(r13)
        Laf:
            if (r9 >= r12) goto Lb2
            goto Lb7
        Lb2:
            java.lang.String r13 = "startOffset must be less than text length"
            o2.a.a(r13)
        Lb7:
            if (r10 <= r9) goto Lba
            goto Lbf
        Lba:
            java.lang.String r13 = "endOffset must be greater than startOffset"
            o2.a.a(r13)
        Lbf:
            if (r10 > r12) goto Lc2
            goto Lc7
        Lc2:
            java.lang.String r12 = "endOffset must be smaller or equal to text length"
            o2.a.a(r12)
        Lc7:
            int r12 = r10 - r9
            int r12 = r12 * 4
            int r13 = r0.length
            int r13 = r13 - r7
            if (r13 < r12) goto Ld0
            goto Ld5
        Ld0:
            java.lang.String r12 = "array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4"
            o2.a.a(r12)
        Ld5:
            int r12 = r11.getLineForOffset(r9)
            int r13 = r10 + (-1)
            int r13 = r11.getLineForOffset(r13)
            e2.g r14 = new e2.g
            r14.<init>(r8)
            if (r12 > r13) goto L17f
        Le6:
            int r15 = r11.getLineStart(r12)
            r16 = r0
            int r0 = r8.f(r12)
            int r15 = java.lang.Math.max(r9, r15)
            int r0 = java.lang.Math.min(r10, r0)
            float r17 = r8.g(r12)
            float r18 = r8.e(r12)
            r19 = r4
            int r4 = r11.getParagraphDirection(r12)
            r5 = 1
            r25 = r6
            r6 = 0
            if (r4 != r5) goto L10e
            r4 = r5
            goto L10f
        L10e:
            r4 = r6
        L10f:
            if (r15 >= r0) goto L173
            boolean r21 = r11.isRtlCharAt(r15)
            if (r4 == 0) goto L128
            if (r21 != 0) goto L128
            float r21 = r14.a(r15, r6, r6, r5)
            int r6 = r15 + 1
            float r6 = r14.a(r6, r5, r5, r5)
            r22 = r0
            r0 = r6
        L126:
            r6 = 0
            goto L15e
        L128:
            if (r4 == 0) goto L140
            if (r21 == 0) goto L140
            r6 = 0
            float r21 = r14.a(r15, r6, r6, r6)
            r22 = r0
            int r0 = r15 + 1
            float r0 = r14.a(r0, r5, r5, r6)
            r23 = r21
            r21 = r0
            r0 = r23
            goto L15e
        L140:
            r22 = r0
            r6 = 0
            if (r4 != 0) goto L154
            if (r21 == 0) goto L154
            float r0 = r14.a(r15, r6, r6, r5)
            int r6 = r15 + 1
            float r6 = r14.a(r6, r5, r5, r5)
            r21 = r6
            goto L126
        L154:
            float r21 = r14.a(r15, r6, r6, r6)
            int r0 = r15 + 1
            float r0 = r14.a(r0, r5, r5, r6)
        L15e:
            r16[r7] = r21
            int r21 = r7 + 1
            r16[r21] = r17
            int r21 = r7 + 2
            r16[r21] = r0
            int r0 = r7 + 3
            r16[r0] = r18
            int r7 = r7 + 4
            int r15 = r15 + 1
            r0 = r22
            goto L10f
        L173:
            if (r12 == r13) goto L185
            int r12 = r12 + 1
            r6 = r25
            r0 = r16
            r4 = r19
            goto Le6
        L17f:
            r16 = r0
            r19 = r4
            r25 = r6
        L185:
            int r0 = r2.f4562g
            int r4 = i2.m0.d(r19)
            int r4 = r4 * 4
            int r4 = r4 + r0
            int r0 = r2.f4562g
        L190:
            if (r0 >= r4) goto L1a5
            int r5 = r0 + 1
            r6 = r16[r5]
            float r7 = r3.f4561g
            float r6 = r6 + r7
            r16[r5] = r6
            int r5 = r0 + 3
            r6 = r16[r5]
            float r6 = r6 + r7
            r16[r5] = r6
            int r0 = r0 + 4
            goto L190
        L1a5:
            r2.f4562g = r4
            float r0 = r3.f4561g
            float r2 = r25.b()
            float r2 = r2 + r0
            r3.f4561g = r2
            goto L45
        L1b2:
            java.lang.Object r0 = r1.f5344i
            c9.c0 r0 = (c9.c0) r0
            java.lang.Object r2 = r1.f5345j
            hb.i0 r2 = (hb.i0) r2
            java.lang.Object r3 = r1.f5346k
            r4 = r3
            android.app.Activity r4 = (android.app.Activity) r4
            r3 = r25
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r5 = 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            tf.v r7 = tf.v.f13169g
            if (r3 == r5) goto L2b5
            r5 = 2
            if (r3 == r5) goto L1dd
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.invoke(r2, r7)
            goto L2b8
        L1dd:
            r2.getClass()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            sf.e r7 = new sf.e
            java.lang.String r3 = "周一"
            r7.<init>(r2, r3)
            r2 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            sf.e r8 = new sf.e
            java.lang.String r3 = "周二"
            r8.<init>(r2, r3)
            r2 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            sf.e r9 = new sf.e
            java.lang.String r3 = "周三"
            r9.<init>(r2, r3)
            r2 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            sf.e r10 = new sf.e
            java.lang.String r3 = "周四"
            r10.<init>(r2, r3)
            r2 = 6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            sf.e r11 = new sf.e
            java.lang.String r3 = "周五"
            r11.<init>(r2, r3)
            r2 = 7
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            sf.e r12 = new sf.e
            java.lang.String r5 = "周六"
            r12.<init>(r3, r5)
            sf.e r13 = new sf.e
            java.lang.String r3 = "周日"
            r13.<init>(r6, r3)
            sf.e[] r3 = new sf.e[]{r7, r8, r9, r10, r11, r12, r13}
            java.util.List r3 = a.a.y0(r3)
            java.util.Calendar r5 = java.util.Calendar.getInstance()
            long r6 = r1.f5343h
            r5.setTimeInMillis(r6)
            int r2 = r5.get(r2)
            lg.d r5 = a.a.X(r3)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L250:
            r7 = r5
            lg.c r7 = (lg.c) r7
            boolean r8 = r7.f8047i
            if (r8 == 0) goto L276
            java.lang.Object r7 = r7.next()
            r8 = r7
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            java.lang.Object r8 = r3.get(r8)
            sf.e r8 = (sf.e) r8
            java.lang.Object r8 = r8.f12418g
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r8 != r2) goto L250
            r6.add(r7)
            goto L250
        L276:
            java.util.Set r8 = tf.m.U1(r6)
            java.util.ArrayList r7 = new java.util.ArrayList
            int r2 = tf.n.e1(r3)
            r7.<init>(r2)
            java.util.Iterator r2 = r3.iterator()
        L287:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L2a0
            java.lang.Object r5 = r2.next()
            sf.e r5 = (sf.e) r5
            java.lang.Object r5 = r5.f12419h
            sf.e r6 = new sf.e
            java.lang.String r9 = ""
            r6.<init>(r5, r9)
            r7.add(r6)
            goto L287
        L2a0:
            c9.i r9 = new c9.i
            r9.<init>(r0, r3)
            k.s1 r10 = new k.s1
            r0 = 7
            r10.<init>(r0)
            r11 = 288(0x120, float:4.04E-43)
            java.lang.String r5 = "选择重复日期"
            java.lang.String r6 = ""
            wb.y2.Z1(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L2b8
        L2b5:
            r0.invoke(r6, r7)
        L2b8:
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
