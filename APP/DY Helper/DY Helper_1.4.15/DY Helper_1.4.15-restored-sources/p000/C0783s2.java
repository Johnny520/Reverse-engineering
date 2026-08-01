package p000;

/* JADX INFO: renamed from: s2 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0783s2 {

    /* JADX INFO: renamed from: α */
    public final p000.C0932w2 f9681;

    /* JADX INFO: renamed from: β */
    public final int f9682;

    /* JADX INFO: renamed from: γ */
    public final long f9683;

    /* JADX INFO: renamed from: δ */
    public final p000.k32 f9684;

    /* JADX INFO: renamed from: ε */
    public final java.lang.CharSequence f9685;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.Object f9686;

    public C0783s2(p000.C0932w2 r21, int r22, int r23, long r24) {
            r20 = this;
            r0 = r20
            r10 = r21
            r4 = r22
            r11 = r23
            r0.<init>()
            r0.f9681 = r10
            r0.f9682 = r4
            r12 = r24
            r0.f9683 = r12
            int r1 = p000.C1028yo.m6954(r12)
            if (r1 != 0) goto L20
            int r1 = p000.C1028yo.m6955(r12)
            if (r1 != 0) goto L20
            goto L25
        L20:
            java.lang.String r1 = "Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead."
            p000.bm0.m982(r1)
        L25:
            r14 = 1
            if (r4 < r14) goto L29
            goto L2e
        L29:
            java.lang.String r1 = "maxLines should be greater than 0"
            p000.bm0.m982(r1)
        L2e:
            w32 r1 = r10.f11533
            java.lang.CharSequence r2 = r10.f11539
            r3 = 5
            r5 = 4
            r6 = 2
            if (r11 != r6) goto L96
            ux1 r8 = r1.f11556
            long r8 = r8.f11003
            r17 = 0
            long r6 = p000.u81.m5807(r17)
            boolean r6 = p000.y32.m6818(r8, r6)
            if (r6 != 0) goto L94
            ux1 r6 = r1.f11556
            long r6 = r6.f11003
            long r8 = p000.y32.f12441
            boolean r6 = p000.y32.m6818(r6, r8)
            if (r6 != 0) goto L94
            r91 r6 = r1.f11557
            int r6 = r6.f9301
            if (r6 != 0) goto L5a
            goto L94
        L5a:
            if (r6 != r3) goto L5d
            goto L94
        L5d:
            if (r6 != r5) goto L60
            goto L94
        L60:
            int r6 = r2.length()
            if (r6 != 0) goto L67
            goto L94
        L67:
            boolean r6 = r2 instanceof android.text.Spannable
            if (r6 == 0) goto L6f
            r6 = r2
            android.text.Spannable r6 = (android.text.Spannable) r6
            goto L70
        L6f:
            r6 = 0
        L70:
            if (r6 != 0) goto L77
            android.text.SpannableString r6 = new android.text.SpannableString
            r6.<init>(r2)
        L77:
            r2 = r6
            java.lang.Class<ol0> r6 = p000.ol0.class
            boolean r6 = p000.v71.m6039(r2, r6)
            if (r6 != 0) goto L94
            ol0 r6 = new ol0
            r6.<init>()
            int r7 = r2.length()
            int r7 = r7 - r14
            int r8 = r2.length()
            int r8 = r8 - r14
            r9 = 33
            r2.setSpan(r6, r7, r8, r9)
        L94:
            r9 = r2
            goto L99
        L96:
            r17 = 0
            goto L94
        L99:
            r0.f9685 = r9
            r91 r2 = r1.f11557
            ux1 r1 = r1.f11556
            int r6 = r2.f9301
            r7 = 3
            if (r6 != r14) goto La6
            r8 = r7
            goto Lb9
        La6:
            r8 = 2
            if (r6 != r8) goto Lab
            r8 = r5
            goto Lb9
        Lab:
            if (r6 != r7) goto Laf
            r8 = 2
            goto Lb9
        Laf:
            if (r6 != r3) goto Lb2
            goto Lb7
        Lb2:
            r8 = 6
            if (r6 != r8) goto Lb7
            r8 = r14
            goto Lb9
        Lb7:
            r8 = r17
        Lb9:
            if (r6 != r5) goto Lbd
            r6 = r14
            goto Lbf
        Lbd:
            r6 = r17
        Lbf:
            int r15 = r2.f9308
            r3 = 32
            r5 = 2
            if (r15 != r5) goto Lce
            int r15 = android.os.Build.VERSION.SDK_INT
            if (r15 > r3) goto Lcc
            r15 = r5
            goto Ld0
        Lcc:
            r15 = 4
            goto Ld0
        Lce:
            r15 = r17
        Ld0:
            int r2 = r2.f9307
            r3 = r2 & 255(0xff, float:3.57E-43)
            if (r3 != r14) goto Ld7
            goto Le3
        Ld7:
            if (r3 != r5) goto Ldd
            r3 = r2
            r2 = r6
            r6 = r14
            goto Le7
        Ldd:
            if (r3 != r7) goto Le3
            r3 = r2
            r2 = r6
            r6 = 2
            goto Le7
        Le3:
            r3 = r2
            r2 = r6
            r6 = r17
        Le7:
            int r5 = r3 >> 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            if (r5 != r14) goto Lee
            goto Lfe
        Lee:
            r14 = 2
            if (r5 != r14) goto Lf4
            r5 = r7
            r7 = 1
            goto L101
        Lf4:
            if (r5 != r7) goto Lf9
            r5 = r7
            r7 = 2
            goto L101
        Lf9:
            r14 = 4
            if (r5 != r14) goto Lfe
            r5 = r7
            goto L101
        Lfe:
            r5 = r7
            r7 = r17
        L101:
            int r3 = r3 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            r14 = 1
            if (r3 != r14) goto L10a
            r14 = 2
            goto L111
        L10a:
            r14 = 2
            if (r3 != r14) goto L111
            r3 = r1
            r1 = r8
            r8 = 1
            goto L115
        L111:
            r3 = r1
            r1 = r8
            r8 = r17
        L115:
            if (r11 != r14) goto L120
            android.text.TextUtils$TruncateAt r16 = android.text.TextUtils.TruncateAt.END
        L119:
            r5 = r15
            r18 = 32
            r15 = r3
            r3 = r16
            goto L131
        L120:
            r5 = 5
            if (r11 != r5) goto L126
            android.text.TextUtils$TruncateAt r16 = android.text.TextUtils.TruncateAt.MIDDLE
            goto L119
        L126:
            r5 = 4
            if (r11 != r5) goto L12c
            android.text.TextUtils$TruncateAt r16 = android.text.TextUtils.TruncateAt.START
            goto L119
        L12c:
            r5 = r15
            r18 = 32
            r15 = r3
            r3 = 0
        L131:
            k32 r14 = r0.m5352(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            android.text.Layout r0 = r14.f5738
            int r4 = android.os.Build.VERSION.SDK_INT
            r16 = r1
            r1 = 35
            if (r4 >= r1) goto L14a
            d3 r1 = r10.f11538
            float r1 = r1.getLetterSpacing()
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L152
        L14a:
            r0 = r20
            r4 = r22
            r1 = r16
            r10 = 2
            goto L192
        L152:
            r1 = 4
            if (r11 != r1) goto L157
        L155:
            r1 = 0
            goto L15b
        L157:
            r1 = 5
            if (r11 != r1) goto L14a
            goto L155
        L15b:
            int r4 = r0.getEllipsisCount(r1)
            if (r4 <= 0) goto L14a
            int r4 = r0.getEllipsisStart(r1)
            int r0 = r0.getEllipsisCount(r1)
            int r0 = r0 + r4
            java.lang.CharSequence r4 = r9.subSequence(r1, r4)
            int r10 = r9.length()
            java.lang.CharSequence r0 = r9.subSequence(r0, r10)
            r9 = 3
            java.lang.CharSequence[] r9 = new java.lang.CharSequence[r9]
            r9[r1] = r4
            java.lang.String r1 = "…"
            r19 = 1
            r9[r19] = r1
            r10 = 2
            r9[r10] = r0
            java.lang.CharSequence r9 = android.text.TextUtils.concat(r9)
            r0 = r20
            r4 = r22
            r1 = r16
            k32 r14 = r0.m5352(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L192:
            int r9 = r14.f5739
            if (r11 != r10) goto L1cd
            int r10 = r14.m3148()
            int r11 = p000.C1028yo.m6952(r12)
            if (r10 <= r11) goto L1cd
            r10 = 1
            if (r4 <= r10) goto L1cd
            int r4 = p000.C1028yo.m6952(r12)
            r10 = 0
        L1a8:
            if (r10 >= r9) goto L1b7
            float r11 = r14.m3151(r10)
            float r12 = (float) r4
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 <= 0) goto L1b4
            goto L1b8
        L1b4:
            int r10 = r10 + 1
            goto L1a8
        L1b7:
            r10 = r9
        L1b8:
            if (r10 < 0) goto L1ca
            int r4 = r0.f9682
            if (r10 == r4) goto L1ca
            r4 = 1
            if (r10 >= r4) goto L1c3
            r4 = 1
            goto L1c4
        L1c3:
            r4 = r10
        L1c4:
            java.lang.CharSequence r9 = r0.f9685
            k32 r14 = r0.m5352(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L1ca:
            r0.f9684 = r14
            goto L1cf
        L1cd:
            r0.f9684 = r14
        L1cf:
            w2 r1 = r0.f9681
            d3 r1 = r1.f11538
            f32 r2 = r15.f10996
            kn0 r2 = r2.mo2034()
            float r3 = r0.m5354()
            float r4 = r0.m5353()
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            long r5 = (long) r3
            int r3 = java.lang.Float.floatToRawIntBits(r4)
            long r3 = (long) r3
            long r5 = r5 << r18
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r7
            long r3 = r3 | r5
            f32 r5 = r15.f10996
            float r5 = r5.mo2035()
            r1.m1642(r2, r3, r5)
            k32 r1 = r0.f9684
            android.text.Layout r1 = r1.f5738
            java.lang.CharSequence r2 = r1.getText()
            boolean r2 = r2 instanceof android.text.Spanned
            if (r2 != 0) goto L20b
        L209:
            r1 = 0
            goto L23d
        L20b:
            java.lang.CharSequence r2 = r1.getText()
            r2.getClass()
            android.text.Spanned r2 = (android.text.Spanned) r2
            r3 = -1
            int r4 = r2.length()
            java.lang.Class<dv1> r5 = p000.dv1.class
            int r3 = r2.nextSpanTransition(r3, r4, r5)
            int r2 = r2.length()
            if (r3 == r2) goto L209
            java.lang.CharSequence r2 = r1.getText()
            r2.getClass()
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.CharSequence r1 = r1.getText()
            int r1 = r1.length()
            r3 = 0
            java.lang.Object[] r1 = r2.getSpans(r3, r1, r5)
            dv1[] r1 = (p000.dv1[]) r1
        L23d:
            if (r1 == 0) goto L268
            int r2 = r1.length
            r3 = 0
        L241:
            if (r3 >= r2) goto L268
            r4 = r1[r3]
            float r5 = r0.m5354()
            float r6 = r0.m5353()
            int r5 = java.lang.Float.floatToRawIntBits(r5)
            long r9 = (long) r5
            int r5 = java.lang.Float.floatToRawIntBits(r6)
            long r5 = (long) r5
            long r9 = r9 << r18
            long r5 = r5 & r7
            long r5 = r5 | r9
            x91 r4 = r4.f3302
            jw1 r9 = new jw1
            r9.<init>(r5)
            r4.setValue(r9)
            int r3 = r3 + 1
            goto L241
        L268:
            java.lang.CharSequence r1 = r0.f9685
            boolean r2 = r1 instanceof android.text.Spanned
            if (r2 != 0) goto L272
            jz r1 = p000.C0450jz.f5672
            goto L34f
        L272:
            r2 = r1
            android.text.Spanned r2 = (android.text.Spanned) r2
            int r1 = r1.length()
            java.lang.Class<fh1> r3 = p000.fh1.class
            r4 = 0
            java.lang.Object[] r1 = r2.getSpans(r4, r1, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r1.length
            r3.<init>(r4)
            int r4 = r1.length
            r7 = 0
        L288:
            if (r7 >= r4) goto L34e
            r5 = r1[r7]
            fh1 r5 = (p000.fh1) r5
            int r6 = r2.getSpanStart(r5)
            int r8 = r2.getSpanEnd(r5)
            k32 r9 = r0.f9684
            android.text.Layout r9 = r9.f5738
            int r9 = r9.getLineForOffset(r6)
            int r10 = r0.f9682
            if (r9 < r10) goto L2a4
            r10 = 1
            goto L2a5
        L2a4:
            r10 = 0
        L2a5:
            k32 r11 = r0.f9684
            android.text.Layout r11 = r11.f5738
            int r11 = r11.getEllipsisCount(r9)
            if (r11 <= 0) goto L2c4
            k32 r11 = r0.f9684
            android.text.Layout r11 = r11.f5738
            int r11 = r11.getLineStart(r9)
            k32 r12 = r0.f9684
            android.text.Layout r12 = r12.f5738
            int r12 = r12.getEllipsisStart(r9)
            int r12 = r12 + r11
            if (r8 <= r12) goto L2c4
            r11 = 1
            goto L2c5
        L2c4:
            r11 = 0
        L2c5:
            k32 r12 = r0.f9684
            int r12 = r12.m3152(r9)
            if (r8 <= r12) goto L2cf
            r8 = 1
            goto L2d0
        L2cf:
            r8 = 0
        L2d0:
            if (r11 != 0) goto L2d6
            if (r8 != 0) goto L2d6
            if (r10 == 0) goto L2da
        L2d6:
            r10 = 1
            r12 = 0
            goto L346
        L2da:
            k32 r8 = r0.f9684
            android.text.Layout r8 = r8.f5738
            int r8 = r8.getParagraphDirection(r9)
            r10 = 1
            if (r8 != r10) goto L2e7
            r8 = r10
            goto L2e8
        L2e7:
            r8 = 0
        L2e8:
            k32 r11 = r0.f9684
            android.text.Layout r11 = r11.f5738
            boolean r11 = r11.isRtlCharAt(r6)
            if (r8 == 0) goto L302
            if (r11 != 0) goto L302
            k32 r8 = r0.f9684
            r12 = 0
            float r6 = r8.m3154(r6, r12)
            int r8 = r5.m2109()
        L2ff:
            float r8 = (float) r8
            float r8 = r8 + r6
            goto L32b
        L302:
            r12 = 0
            if (r8 == 0) goto L315
            if (r11 == 0) goto L315
            k32 r8 = r0.f9684
            float r8 = r8.m3155(r6, r12)
            int r6 = r5.m2109()
        L311:
            float r6 = (float) r6
            float r6 = r8 - r6
            goto L32b
        L315:
            k32 r8 = r0.f9684
            if (r11 == 0) goto L322
            float r8 = r8.m3154(r6, r12)
            int r6 = r5.m2109()
            goto L311
        L322:
            float r6 = r8.m3155(r6, r12)
            int r8 = r5.m2109()
            goto L2ff
        L32b:
            k32 r11 = r0.f9684
            r5.getClass()
            float r9 = r11.m3150(r9)
            int r11 = r5.m2108()
            float r11 = (float) r11
            float r9 = r9 - r11
            int r5 = r5.m2108()
            float r5 = (float) r5
            float r5 = r5 + r9
            ml1 r11 = new ml1
            r11.<init>(r6, r9, r8, r5)
            goto L347
        L346:
            r11 = 0
        L347:
            r3.add(r11)
            int r7 = r7 + 1
            goto L288
        L34e:
            r1 = r3
        L34f:
            r0.f9686 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public final p000.k32 m5352(int r16, int r17, android.text.TextUtils.TruncateAt r18, int r19, int r20, int r21, int r22, int r23, java.lang.CharSequence r24) {
            r15 = this;
            float r2 = r15.m5354()
            w2 r15 = r15.f9681
            d3 r3 = r15.f11538
            int r6 = r15.f11543
            pp0 r14 = r15.f11540
            w32 r15 = r15.f11533
            t2 r0 = p000.AbstractC0857u2.f10568
            nh1 r15 = r15.f11558
            if (r15 == 0) goto L1c
            kh1 r15 = r15.f7627
            if (r15 == 0) goto L1c
            boolean r15 = r15.f5928
        L1a:
            r7 = r15
            goto L1e
        L1c:
            r15 = 0
            goto L1a
        L1e:
            k32 r0 = new k32
            r4 = r16
            r13 = r17
            r5 = r18
            r8 = r19
            r12 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r1 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
    }

    /* JADX INFO: renamed from: β */
    public final float m5353() {
            r0 = this;
            k32 r0 = r0.f9684
            int r0 = r0.m3148()
            float r0 = (float) r0
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public final float m5354() {
            r2 = this;
            long r0 = r2.f9683
            int r2 = p000.C1028yo.m6953(r0)
            float r2 = (float) r2
            return r2
    }

    /* JADX INFO: renamed from: δ */
    public final void m5355(p000.InterfaceC0209de r6) {
            r5 = this;
            android.graphics.Canvas r0 = p000.AbstractC0532m0.f6880
            r6.getClass()
            l0 r6 = (p000.C0495l0) r6
            android.graphics.Canvas r6 = r6.f6337
            k32 r0 = r5.f9684
            boolean r1 = r0.f5737
            r2 = 0
            if (r1 == 0) goto L1e
            r6.save()
            float r1 = r5.m5354()
            float r5 = r5.m5353()
            r6.clipRect(r2, r2, r1, r5)
        L1e:
            int r5 = r0.f5740
            android.graphics.Rect r1 = r0.f5748
            boolean r1 = r6.getClipBounds(r1)
            if (r1 != 0) goto L29
            goto L54
        L29:
            if (r5 == 0) goto L2f
            float r1 = (float) r5
            r6.translate(r2, r1)
        L2f:
            java.lang.ThreadLocal r1 = p000.n32.f7376
            java.lang.Object r3 = r1.get()
            if (r3 != 0) goto L3f
            b32 r3 = new b32
            r3.<init>()
            r1.set(r3)
        L3f:
            b32 r3 = (p000.b32) r3
            r3.f1447 = r6
            r1 = 0
            android.text.Layout r4 = r0.f5738     // Catch: java.lang.Throwable -> L5c
            r4.draw(r3)     // Catch: java.lang.Throwable -> L5c
            r3.f1447 = r1
            if (r5 == 0) goto L54
            r1 = -1
            float r1 = (float) r1
            float r5 = (float) r5
            float r1 = r1 * r5
            r6.translate(r2, r1)
        L54:
            boolean r5 = r0.f5737
            if (r5 == 0) goto L5b
            r6.restore()
        L5b:
            return
        L5c:
            r5 = move-exception
            r3.f1447 = r1
            throw r5
    }
}
