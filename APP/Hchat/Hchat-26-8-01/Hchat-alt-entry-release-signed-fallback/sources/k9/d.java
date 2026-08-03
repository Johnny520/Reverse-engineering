package k9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends android.graphics.drawable.Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k9.c f7488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.graphics.Paint f7489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.graphics.Path f7490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final android.graphics.RectF f7491d;

    public d(k9.c r2, int r3) {
            r1 = this;
            r1.<init>()
            r1.f7488a = r2
            android.graphics.Paint r2 = new android.graphics.Paint
            r0 = 5
            r2.<init>(r0)
            r2.setColor(r3)
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r2.setStyle(r3)
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.ROUND
            r2.setStrokeCap(r3)
            android.graphics.Paint$Join r3 = android.graphics.Paint.Join.ROUND
            r2.setStrokeJoin(r3)
            r1.f7489b = r2
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r1.f7490c = r2
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r1.f7491d = r2
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r27) {
            r26 = this;
            r0 = r26
            r1 = r27
            r1.getClass()
            android.graphics.Rect r2 = r0.getBounds()
            int r2 = r2.width()
            android.graphics.Rect r3 = r0.getBounds()
            int r3 = r3.height()
            int r2 = java.lang.Math.min(r2, r3)
            float r7 = (float) r2
            r2 = 0
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 > 0) goto L23
            goto L340
        L23:
            android.graphics.Rect r2 = r0.getBounds()
            float r2 = r2.exactCenterX()
            r3 = 1073741824(0x40000000, float:2.0)
            float r4 = r7 / r3
            float r8 = r2 - r4
            android.graphics.Rect r2 = r0.getBounds()
            float r2 = r2.exactCenterY()
            float r9 = r2 - r4
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            android.graphics.Paint r6 = r0.f7489b
            r6.setStyle(r2)
            r4 = 1032134328(0x3d851eb8, float:0.065)
            float r4 = r4 * r7
            r6.setStrokeWidth(r4)
            android.graphics.Path r4 = r0.f7490c
            r4.reset()
            k9.c r5 = r0.f7488a
            int r5 = r5.ordinal()
            r11 = 1056964608(0x3f000000, float:0.5)
            r12 = 1059313418(0x3f23d70a, float:0.64)
            r13 = 1052266988(0x3eb851ec, float:0.36)
            r14 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            r16 = 1031127695(0x3d75c28f, float:0.06)
            r17 = 1047233823(0x3e6b851f, float:0.23)
            r18 = 1062668861(0x3f570a3d, float:0.84)
            r19 = 1041194025(0x3e0f5c29, float:0.14)
            r20 = 1054615798(0x3edc28f6, float:0.43)
            r21 = 1040522936(0x3e051eb8, float:0.13)
            r22 = 1043207291(0x3e2e147b, float:0.17)
            r23 = 1059816735(0x3f2b851f, float:0.67)
            r24 = 0
            r25 = 1049582633(0x3e8f5c29, float:0.28)
            android.graphics.RectF r10 = r0.f7491d
            switch(r5) {
                case 0: goto L314;
                case 1: goto L2b8;
                case 2: goto L26a;
                case 3: goto L1df;
                case 4: goto L1a2;
                case 5: goto L14b;
                case 6: goto Led;
                case 7: goto L87;
                default: goto L83;
            }
        L83:
            okio.a.k()
            return
        L87:
            r2 = 1057803469(0x3f0ccccd, float:0.55)
            float r2 = r2 * r7
            float r2 = r2 + r8
            r3 = 1045220557(0x3e4ccccd, float:0.2)
            float r3 = r3 * r7
            float r3 = r3 + r9
            r4.moveTo(r2, r3)
            r2 = 1061997773(0x3f4ccccd, float:0.8)
            float r2 = r2 * r7
            float r2 = r2 + r8
            r4.lineTo(r2, r3)
            r3 = 1055286886(0x3ee66666, float:0.45)
            float r3 = r3 * r7
            float r3 = r3 + r9
            r4.lineTo(r2, r3)
            r2 = 1061830001(0x3f4a3d71, float:0.79)
            float r2 = r2 * r7
            float r2 = r2 + r8
            r3 = 1045891645(0x3e570a3d, float:0.21)
            float r3 = r3 * r7
            float r3 = r3 + r9
            r4.moveTo(r2, r3)
            r2 = 1055622431(0x3eeb851f, float:0.46)
            float r2 = r2 * r7
            float r2 = r2 + r8
            r3 = 1057635697(0x3f0a3d71, float:0.54)
            float r3 = r3 * r7
            float r3 = r3 + r9
            r4.lineTo(r2, r3)
            float r23 = r23 * r7
            float r2 = r23 + r8
            r3 = 1054951342(0x3ee147ae, float:0.44)
            float r3 = r3 * r7
            float r3 = r3 + r9
            r4.moveTo(r2, r3)
            r3 = 1061158912(0x3f400000, float:0.75)
            float r3 = r3 * r7
            float r3 = r3 + r9
            r4.lineTo(r2, r3)
            r2 = 1046562734(0x3e6147ae, float:0.22)
            float r2 = r2 * r7
            float r2 = r2 + r8
            r4.lineTo(r2, r3)
            r3 = 1050253722(0x3e99999a, float:0.3)
            float r3 = r3 * r7
            float r3 = r3 + r9
            r4.lineTo(r2, r3)
            r2 = 1057467924(0x3f07ae14, float:0.53)
            float r7 = r7 * r2
            float r7 = r7 + r8
            r4.lineTo(r7, r3)
            r1.drawPath(r4, r6)
            return
        Led:
            float r19 = r19 * r7
            float r2 = r19 + r8
            r3 = 1049247089(0x3e8a3d71, float:0.27)
            float r3 = r3 * r7
            float r3 = r3 + r9
            float r18 = r18 * r7
            float r4 = r18 + r8
            r5 = 1061326684(0x3f428f5c, float:0.76)
            float r5 = r5 * r7
            float r5 = r5 + r9
            r10.set(r2, r3, r4, r5)
            r2 = 1036831949(0x3dcccccd, float:0.1)
            float r2 = r2 * r7
            r1.drawRoundRect(r10, r2, r2, r6)
            float r17 = r17 * r7
            float r2 = r17 + r8
            float r23 = r23 * r7
            float r4 = r23 + r8
            float r22 = r22 * r7
            float r5 = r22 + r9
            r1.drawLine(r2, r3, r4, r5, r6)
            r2 = 1058306785(0x3f147ae1, float:0.58)
            float r2 = r2 * r7
            float r2 = r2 + r8
            r3 = 1054280253(0x3ed70a3d, float:0.42)
            float r3 = r3 * r7
            float r3 = r3 + r9
            r4 = 1063339950(0x3f6147ae, float:0.88)
            float r4 = r4 * r7
            float r4 = r4 + r8
            r5 = 1058977874(0x3f1eb852, float:0.62)
            float r5 = r5 * r7
            float r5 = r5 + r9
            r10.set(r2, r3, r4, r5)
            float r2 = r7 * r16
            r1.drawRoundRect(r10, r2, r2, r6)
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r6.setStyle(r2)
            r2 = 1059984507(0x3f2e147b, float:0.68)
            float r2 = r2 * r7
            float r2 = r2 + r8
            r3 = 1057300152(0x3f051eb8, float:0.52)
            float r3 = r3 * r7
            float r3 = r3 + r9
            r4 = 1020054733(0x3ccccccd, float:0.025)
            float r7 = r7 * r4
            r1.drawCircle(r2, r3, r7, r6)
            return
        L14b:
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r6.setStyle(r2)
            android.graphics.Rect r2 = r0.getBounds()
            float r2 = r2.exactCenterX()
            android.graphics.Rect r3 = r0.getBounds()
            float r3 = r3.exactCenterY()
            r5 = 1017370378(0x3ca3d70a, float:0.02)
            float r5 = r5 * r7
            float r5 = r5 + r3
            r3 = r24
        L167:
            r8 = 10
            if (r3 < r8) goto L172
            r4.close()
            r1.drawPath(r4, r6)
            return
        L172:
            int r8 = r3 % 2
            if (r8 != 0) goto L17b
            r8 = 1052602532(0x3ebd70a4, float:0.37)
            float r8 = r8 * r7
            goto L17d
        L17b:
            float r8 = r7 * r22
        L17d:
            double r9 = (double) r3
            double r9 = r9 * r14
            r11 = 4617315517961601024(0x4014000000000000, double:5.0)
            double r9 = r9 / r11
            r11 = -4613618979930100456(0xbff921fb54442d18, double:-1.5707963267948966)
            double r9 = r9 + r11
            double r11 = java.lang.Math.cos(r9)
            float r11 = (float) r11
            float r11 = r11 * r8
            float r11 = r11 + r2
            double r9 = java.lang.Math.sin(r9)
            float r9 = (float) r9
            float r9 = r9 * r8
            float r9 = r9 + r5
            if (r3 != 0) goto L19c
            r4.moveTo(r11, r9)
            goto L19f
        L19c:
            r4.lineTo(r11, r9)
        L19f:
            int r3 = r3 + 1
            goto L167
        L1a2:
            float r19 = r19 * r7
            float r2 = r19 + r8
            float r17 = r17 * r7
            float r3 = r17 + r9
            r5 = 1063004406(0x3f5c28f6, float:0.86)
            float r5 = r5 * r7
            float r5 = r5 + r8
            r14 = 1061494456(0x3f451eb8, float:0.77)
            float r14 = r14 * r7
            float r14 = r14 + r9
            r10.set(r2, r3, r5, r14)
            float r2 = r7 * r21
            r1.drawRoundRect(r10, r2, r2, r6)
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r6.setStyle(r2)
            float r20 = r20 * r7
            float r2 = r20 + r8
            float r13 = r13 * r7
            float r13 = r13 + r9
            r4.moveTo(r2, r13)
            float r12 = r12 * r7
            float r12 = r12 + r9
            r4.lineTo(r2, r12)
            float r23 = r23 * r7
            float r2 = r23 + r8
            float r7 = r7 * r11
            float r7 = r7 + r9
            r4.lineTo(r2, r7)
            r4.close()
            r1.drawPath(r4, r6)
            return
        L1df:
            android.graphics.Rect r3 = r0.getBounds()
            float r14 = r3.exactCenterX()
            android.graphics.Rect r3 = r0.getBounds()
            float r15 = r3.exactCenterY()
            r3 = 1042536202(0x3e23d70a, float:0.16)
            float r3 = r3 * r7
            float r4 = r3 + r8
            float r3 = r3 + r9
            float r18 = r18 * r7
            float r8 = r18 + r8
            float r5 = r18 + r9
            r10.set(r4, r3, r8, r5)
            r6.setStyle(r2)
            r2 = 1035489772(0x3db851ec, float:0.09)
            float r2 = r2 * r7
            r6.setStrokeWidth(r2)
            r8 = r24
        L20b:
            r2 = 6
            if (r8 < r2) goto L21b
            float r2 = r7 * r16
            r6.setStrokeWidth(r2)
            r2 = 1039516303(0x3df5c28f, float:0.12)
            float r7 = r7 * r2
            r1.drawCircle(r14, r15, r7, r6)
            return
        L21b:
            float r2 = (float) r8
            r3 = 1114636288(0x42700000, float:60.0)
            float r2 = r2 * r3
            r3 = -1028784128(0xffffffffc2ae0000, float:-87.0)
            float r3 = r3 + r2
            r4 = 1113063424(0x42580000, float:54.0)
            r5 = 0
            r2 = r10
            r1.drawArc(r2, r3, r4, r5, r6)
            r1 = 1099431936(0x41880000, float:17.0)
            float r1 = r1 + r3
            double r1 = (double) r1
            double r1 = java.lang.Math.toRadians(r1)
            r4 = 1112539136(0x42500000, float:52.0)
            float r3 = r3 + r4
            double r3 = (double) r3
            double r3 = java.lang.Math.toRadians(r3)
            double r11 = java.lang.Math.cos(r1)
            float r5 = (float) r11
            float r5 = r5 * r7
            float r5 = r5 * r21
            float r5 = r5 + r14
            double r1 = java.lang.Math.sin(r1)
            float r1 = (float) r1
            float r1 = r1 * r7
            float r1 = r1 * r21
            float r1 = r1 + r15
            double r11 = java.lang.Math.cos(r3)
            float r2 = (float) r11
            float r2 = r2 * r7
            r9 = 1050589266(0x3e9eb852, float:0.31)
            float r2 = r2 * r9
            float r2 = r2 + r14
            double r3 = java.lang.Math.sin(r3)
            float r3 = (float) r3
            float r3 = r3 * r7
            float r3 = r3 * r9
            float r3 = r3 + r15
            r4 = r2
            r2 = r5
            r5 = r3
            r3 = r1
            r1 = r27
            r1.drawLine(r2, r3, r4, r5, r6)
            int r8 = r8 + 1
            goto L20b
        L26a:
            float r13 = r13 * r7
            float r2 = r13 + r8
            float r22 = r22 * r7
            float r3 = r22 + r9
            r4.moveTo(r2, r3)
            float r5 = r22 + r8
            r4.lineTo(r5, r3)
            float r13 = r13 + r9
            r4.lineTo(r5, r13)
            float r12 = r12 * r7
            float r10 = r12 + r8
            r4.moveTo(r10, r3)
            r14 = 1062501089(0x3f547ae1, float:0.83)
            float r14 = r14 * r7
            float r15 = r14 + r8
            r4.lineTo(r15, r3)
            r4.lineTo(r15, r13)
            float r12 = r12 + r9
            r4.moveTo(r5, r12)
            float r14 = r14 + r9
            r4.lineTo(r5, r14)
            r4.lineTo(r2, r14)
            r4.moveTo(r15, r12)
            r4.lineTo(r15, r14)
            r4.lineTo(r10, r14)
            r1.drawPath(r4, r6)
            float r10 = r7 * r25
            float r2 = r10 + r8
            float r11 = r11 * r7
            float r3 = r11 + r9
            r4 = 1060655596(0x3f3851ec, float:0.72)
            float r7 = r7 * r4
            float r4 = r7 + r8
            r5 = r3
            r1.drawLine(r2, r3, r4, r5, r6)
            return
        L2b8:
            android.graphics.Rect r2 = r0.getBounds()
            float r8 = r2.exactCenterX()
            android.graphics.Rect r2 = r0.getBounds()
            float r9 = r2.exactCenterY()
            r2 = 1049918177(0x3e947ae1, float:0.29)
            float r2 = r2 * r7
            r1.drawCircle(r8, r9, r2, r6)
            r2 = 1037503037(0x3dd70a3d, float:0.105)
            float r2 = r2 * r7
            r1.drawCircle(r8, r9, r2, r6)
            r10 = r24
        L2d8:
            r2 = 8
            if (r10 < r2) goto L2dd
            goto L340
        L2dd:
            double r2 = (double) r10
            double r2 = r2 * r14
            r4 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r2 = r2 / r4
            double r4 = java.lang.Math.cos(r2)
            float r4 = (float) r4
            float r4 = r4 * r7
            r5 = 1051595899(0x3eae147b, float:0.34)
            float r4 = r4 * r5
            float r4 = r4 + r8
            double r11 = java.lang.Math.sin(r2)
            float r11 = (float) r11
            float r11 = r11 * r7
            float r11 = r11 * r5
            float r11 = r11 + r9
            double r12 = java.lang.Math.cos(r2)
            float r5 = (float) r12
            float r5 = r5 * r7
            float r5 = r5 * r20
            float r5 = r5 + r8
            double r2 = java.lang.Math.sin(r2)
            float r2 = (float) r2
            float r2 = r2 * r7
            float r2 = r2 * r20
            float r2 = r2 + r9
            r3 = r5
            r5 = r2
            r2 = r4
            r4 = r3
            r3 = r11
            r1.drawLine(r2, r3, r4, r5, r6)
            int r10 = r10 + 1
            r1 = r27
            goto L2d8
        L314:
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r6.setStyle(r1)
            r1 = 1043878380(0x3e3851ec, float:0.18)
            float r9 = r7 * r1
            r1 = 1038174126(0x3de147ae, float:0.11)
            float r10 = r7 * r1
            float r1 = r9 * r3
            float r1 = r1 + r10
            android.graphics.Rect r2 = r0.getBounds()
            float r2 = r2.exactCenterX()
            float r1 = r1 / r3
            float r11 = r2 - r1
            android.graphics.Rect r2 = r0.getBounds()
            float r2 = r2.exactCenterY()
            float r12 = r2 - r1
            r13 = r24
        L33d:
            r14 = 2
            if (r13 < r14) goto L341
        L340:
            return
        L341:
            r15 = r24
        L343:
            if (r15 < r14) goto L348
            int r13 = r13 + 1
            goto L33d
        L348:
            float r1 = (float) r15
            float r2 = r9 + r10
            float r1 = r1 * r2
            float r1 = r1 + r11
            float r3 = (float) r13
            float r3 = r3 * r2
            float r3 = r3 + r12
            float r4 = r1 + r9
            float r5 = r3 + r9
            r8 = r6
            float r6 = r9 * r25
            r7 = r6
            r2 = r1
            r1 = r27
            r1.drawRoundRect(r2, r3, r4, r5, r6, r7, r8)
            r6 = r8
            int r15 = r15 + 1
            goto L343
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
            r1 = this;
            r0 = -3
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.f7489b
            r0.setAlpha(r2)
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.f7489b
            r0.setColorFilter(r2)
            r1.invalidateSelf()
            return
    }
}
