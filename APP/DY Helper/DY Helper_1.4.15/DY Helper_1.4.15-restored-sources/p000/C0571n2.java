package p000;

/* JADX INFO: renamed from: n2 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0571n2 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f7357;

    /* JADX INFO: renamed from: β */
    public int f7358;

    /* JADX INFO: renamed from: γ */
    public java.lang.Object f7359;

    /* JADX INFO: renamed from: δ */
    public java.lang.Object f7360;

    public /* synthetic */ C0571n2(int r1) {
            r0 = this;
            r0.f7357 = r1
            r0.<init>()
            return
    }

    public C0571n2(android.widget.ImageView r2) {
            r1 = this;
            r0 = 1
            r1.f7357 = r0
            r1.<init>()
            r0 = 0
            r1.f7358 = r0
            r1.f7359 = r2
            return
    }

    public C0571n2(java.util.ArrayList r2, int r3, android.view.MotionEvent r4) {
            r1 = this;
            r0 = 0
            r1.f7357 = r0
            r1.<init>()
            r1.f7359 = r2
            r1.f7358 = r3
            r1.f7360 = r4
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L13
            return
        L13:
            java.lang.String r1 = "changes cannot be empty"
            p000.C1080.m7275(r1)
            r1 = 0
            throw r1
    }

    public C0571n2(p000.zj1 r2, int r3, java.lang.String r4) {
            r1 = this;
            r0 = 4
            r1.f7357 = r0
            r1.<init>()
            r1.f7359 = r2
            r1.f7358 = r3
            r1.f7360 = r4
            return
    }

    /* JADX INFO: renamed from: γ */
    public static /* synthetic */ void m3943(p000.C0571n2 r12, int r13, int r14, int r15, int r16, int r17, int r18, boolean r19, boolean r20, boolean r21, int r22) {
            r0 = r22 & 32
            if (r0 == 0) goto L7
            r0 = -1
            r7 = r0
            goto L9
        L7:
            r7 = r18
        L9:
            r11 = -1
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r8 = r19
            r9 = r20
            r10 = r21
            r1.m3945(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public java.lang.String toString() {
            r3 = this;
            int r0 = r3.f7357
            switch(r0) {
                case 4: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r3 = super.toString()
            return r3
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r3.f7359
            zj1 r1 = (p000.zj1) r1
            zj1 r2 = p000.zj1.f13130
            if (r1 != r2) goto L1d
            java.lang.String r1 = "HTTP/1.0"
            r0.append(r1)
            goto L22
        L1d:
            java.lang.String r1 = "HTTP/1.1"
            r0.append(r1)
        L22:
            r1 = 32
            r0.append(r1)
            int r2 = r3.f7358
            r0.append(r2)
            r0.append(r1)
            java.lang.Object r3 = r3.f7360
            java.lang.String r3 = (java.lang.String) r3
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* JADX INFO: renamed from: α */
    public void m3944() {
            r2 = this;
            java.lang.Object r0 = r2.f7359
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.graphics.drawable.Drawable r1 = r0.getDrawable()
            if (r1 == 0) goto Ld
            p000.AbstractC0300fw.m2205(r1)
        Ld:
            if (r1 == 0) goto L1c
            java.lang.Object r2 = r2.f7360
            oo r2 = (p000.C0630oo) r2
            if (r2 == 0) goto L1c
            int[] r0 = r0.getDrawableState()
            p000.C0419j5.m2864(r1, r2, r0)
        L1c:
            return
    }

    /* JADX INFO: renamed from: β */
    public void m3945(int r10, int r11, int r12, int r13, int r14, int r15, boolean r16, boolean r17, boolean r18, int r19) {
            r9 = this;
            java.lang.Object r0 = r9.f7359
            long[] r0 = (long[]) r0
            int r1 = r9.f7358
            int r2 = r1 + 3
            r9.f7358 = r2
            int r3 = r0.length
            if (r3 > r2) goto L23
            int r3 = r3 * 2
            int r2 = java.lang.Math.max(r3, r2)
            long[] r0 = java.util.Arrays.copyOf(r0, r2)
            r9.f7359 = r0
            java.lang.Object r0 = r9.f7360
            long[] r0 = (long[]) r0
            long[] r0 = java.util.Arrays.copyOf(r0, r2)
            r9.f7360 = r0
        L23:
            java.lang.Object r9 = r9.f7359
            long[] r9 = (long[]) r9
            long r2 = (long) r11
            r11 = 32
            long r2 = r2 << r11
            long r4 = (long) r12
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            long r2 = r2 | r4
            r9[r1] = r2
            int r12 = r1 + 1
            long r2 = (long) r13
            long r2 = r2 << r11
            long r4 = (long) r14
            long r4 = r4 & r6
            long r2 = r2 | r4
            r9[r12] = r2
            int r11 = r1 + 2
            r12 = r18
            long r2 = (long) r12
            r12 = 63
            long r2 = r2 << r12
            r12 = r17
            long r4 = (long) r12
            r12 = 62
            long r4 = r4 << r12
            long r2 = r2 | r4
            r12 = r16
            long r4 = (long) r12
            r12 = 61
            long r4 = r4 << r12
            long r2 = r2 | r4
            r12 = 1
            long r4 = (long) r12
            r12 = 60
            long r4 = r4 << r12
            long r2 = r2 | r4
            r12 = 0
            r0 = 1023(0x3ff, float:1.434E-42)
            int r12 = java.lang.Math.min(r12, r0)
            long r4 = (long) r12
            r12 = 50
            long r4 = r4 << r12
            long r2 = r2 | r4
            r4 = 33554431(0x1ffffff, float:9.403954E-38)
            r5 = r15 & r4
            long r6 = (long) r5
            r8 = 25
            long r6 = r6 << r8
            long r2 = r2 | r6
            r10 = r10 & r4
            long r6 = (long) r10
            long r2 = r2 | r6
            r9[r11] = r2
            if (r15 >= 0) goto L78
            goto L9e
        L78:
            r10 = -1
            r11 = r19
            if (r11 == r10) goto L7f
            r10 = r11
            goto L81
        L7f:
            int r10 = r1 + (-3)
        L81:
            if (r10 < 0) goto L9e
            int r11 = r10 + 2
            r2 = r9[r11]
            int r6 = (int) r2
            r6 = r6 & r4
            if (r6 != r5) goto L9b
            int r1 = r1 - r10
            int r1 = r1 / 3
            long r4 = p000.nl1.f7667
            long r2 = r2 & r4
            int r10 = java.lang.Math.min(r1, r0)
            long r0 = (long) r10
            long r0 = r0 << r12
            long r0 = r0 | r2
            r9[r11] = r0
            return
        L9b:
            int r10 = r10 + (-3)
            goto L81
        L9e:
            return
    }

    /* JADX INFO: renamed from: δ */
    public void m3946(android.util.AttributeSet r9, int r10) {
            r8 = this;
            java.lang.Object r8 = r8.f7359
            r0 = r8
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.content.Context r8 = r0.getContext()
            int[] r2 = p000.kk1.f5973
            m6 r8 = p000.C0538m6.m3752(r8, r9, r2, r10)
            java.lang.Object r1 = r8.f6967
            r7 = r1
            android.content.res.TypedArray r7 = (android.content.res.TypedArray) r7
            android.content.Context r1 = r0.getContext()
            java.lang.Object r3 = r8.f6967
            r4 = r3
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            java.util.WeakHashMap r3 = p000.b92.f1572
            r6 = 0
            r3 = r9
            r5 = r10
            p000.y82.m6840(r0, r1, r2, r3, r4, r5, r6)
            android.graphics.drawable.Drawable r9 = r0.getDrawable()     // Catch: java.lang.Throwable -> L41
            r10 = -1
            if (r9 != 0) goto L44
            r1 = 1
            int r1 = r7.getResourceId(r1, r10)     // Catch: java.lang.Throwable -> L41
            if (r1 == r10) goto L44
            android.content.Context r9 = r0.getContext()     // Catch: java.lang.Throwable -> L41
            android.graphics.drawable.Drawable r9 = p000.ln0.m3603(r9, r1)     // Catch: java.lang.Throwable -> L41
            if (r9 == 0) goto L44
            r0.setImageDrawable(r9)     // Catch: java.lang.Throwable -> L41
            goto L44
        L41:
            r0 = move-exception
            r9 = r0
            goto L6e
        L44:
            if (r9 == 0) goto L49
            p000.AbstractC0300fw.m2205(r9)     // Catch: java.lang.Throwable -> L41
        L49:
            r9 = 2
            boolean r1 = r7.hasValue(r9)     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L57
            android.content.res.ColorStateList r9 = r8.m3790(r9)     // Catch: java.lang.Throwable -> L41
            r0.setImageTintList(r9)     // Catch: java.lang.Throwable -> L41
        L57:
            r9 = 3
            boolean r1 = r7.hasValue(r9)     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L6a
            int r9 = r7.getInt(r9, r10)     // Catch: java.lang.Throwable -> L41
            r10 = 0
            android.graphics.PorterDuff$Mode r9 = p000.AbstractC0300fw.m2207(r9, r10)     // Catch: java.lang.Throwable -> L41
            r0.setImageTintMode(r9)     // Catch: java.lang.Throwable -> L41
        L6a:
            r8.m3765()
            return
        L6e:
            r8.m3765()
            throw r9
    }

    /* JADX INFO: renamed from: ε */
    public void m3947(int r23, int r24, long r25) {
            r22 = this;
            r0 = r22
            java.lang.Object r1 = r0.f7359
            long[] r1 = (long[]) r1
            java.lang.Object r2 = r0.f7360
            long[] r2 = (long[]) r2
            r3 = 0
            r2[r3] = r25
            r3 = 1
        Le:
            if (r3 <= 0) goto Lab
            int r3 = r3 + (-1)
            r4 = r2[r3]
            int r6 = (int) r4
            r7 = 33554431(0x1ffffff, float:9.403954E-38)
            r6 = r6 & r7
            r8 = 25
            long r9 = r4 >> r8
            int r9 = (int) r9
            r9 = r9 & r7
            r10 = 50
            long r4 = r4 >> r10
            int r4 = (int) r4
            r5 = 1023(0x3ff, float:1.434E-42)
            r4 = r4 & r5
            if (r4 != r5) goto L2b
            int r4 = r0.f7358
            goto L2e
        L2b:
            int r4 = r4 * 3
            int r4 = r4 + r9
        L2e:
            if (r9 < 0) goto Lab
        L30:
            int r11 = r1.length
            int r11 = r11 + (-2)
            if (r9 >= r11) goto Le
            if (r9 >= r4) goto Le
            int r11 = r9 + 2
            r12 = r1[r11]
            long r14 = r12 >> r8
            int r14 = (int) r14
            r14 = r14 & r7
            if (r14 != r6) goto L9c
            r14 = r1[r9]
            int r16 = r9 + 1
            r25 = r7
            r26 = r8
            r7 = r1[r16]
            r17 = 32
            r18 = r10
            r19 = r11
            long r10 = r14 >> r17
            int r10 = (int) r10
            int r10 = r10 + r23
            int r11 = (int) r14
            int r11 = r11 + r24
            long r14 = (long) r10
            long r14 = r14 << r17
            long r10 = (long) r11
            r20 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r10 & r20
            long r10 = r10 | r14
            r1[r9] = r10
            long r10 = r7 >> r17
            int r10 = (int) r10
            int r10 = r10 + r23
            int r7 = (int) r7
            int r7 = r7 + r24
            long r10 = (long) r10
            long r10 = r10 << r17
            long r7 = (long) r7
            long r7 = r7 & r20
            long r7 = r7 | r10
            r1[r16] = r7
            r7 = 63
            long r7 = r12 >> r7
            r10 = 1
            long r7 = r7 & r10
            r10 = 60
            long r7 = r7 << r10
            long r7 = r7 | r12
            r1[r19] = r7
            long r7 = r12 >> r18
            int r7 = (int) r7
            r7 = r7 & r5
            if (r7 <= 0) goto La2
            int r7 = r3 + 1
            int r8 = r9 + 3
            long r10 = p000.nl1.f7668
            long r10 = r10 & r12
            r8 = r8 & r25
            long r12 = (long) r8
            long r12 = r12 << r26
            long r10 = r10 | r12
            r2[r3] = r10
            r3 = r7
            goto La2
        L9c:
            r25 = r7
            r26 = r8
            r18 = r10
        La2:
            int r9 = r9 + 3
            r7 = r25
            r8 = r26
            r10 = r18
            goto L30
        Lab:
            return
    }

    /* JADX INFO: renamed from: ζ */
    public void m3948(int r7, p000.g80 r8) {
            r6 = this;
            r0 = 33554431(0x1ffffff, float:9.403954E-38)
            r7 = r7 & r0
            java.lang.Object r1 = r6.f7359
            long[] r1 = (long[]) r1
            int r6 = r6.f7358
            r2 = 0
        Lb:
            int r3 = r1.length
            int r3 = r3 + (-2)
            if (r2 >= r3) goto L41
            if (r2 >= r6) goto L41
            int r3 = r2 + 2
            r3 = r1[r3]
            int r3 = (int) r3
            r3 = r3 & r0
            if (r3 != r7) goto L3e
            r6 = r1[r2]
            int r2 = r2 + 1
            r0 = r1[r2]
            r2 = 32
            long r3 = r6 >> r2
            int r3 = (int) r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r6 = (int) r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            long r4 = r0 >> r2
            int r7 = (int) r4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            int r0 = (int) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.mo183(r3, r6, r7, r0)
            return
        L3e:
            int r2 = r2 + 3
            goto Lb
        L41:
            return
    }
}
