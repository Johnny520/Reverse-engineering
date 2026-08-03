package a9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends android.text.style.ReplacementSpan {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f91g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f92h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f93i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f94j;

    public f(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.f91g = r1
            r0.f92h = r2
            r0.f93i = r3
            r0.f94j = r4
            return
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(android.graphics.Canvas r25, java.lang.CharSequence r26, int r27, int r28, float r29, int r30, int r31, int r32, android.graphics.Paint r33) {
            r24 = this;
            r0 = r24
            r1 = r29
            r7 = r33
            r25.getClass()
            r26.getClass()
            r7.getClass()
            int r8 = r7.getColor()
            android.graphics.Shader r9 = r7.getShader()
            boolean r10 = r7.isFakeBoldText()
            float r2 = r7.getTextSize()
            r3 = 1055286886(0x3ee66666, float:0.45)
            float r2 = r2 * r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            int r2 = (int) r2
            float r2 = (float) r2
            r3 = r26
            r4 = r27
            r5 = r28
            float r6 = r7.measureText(r3, r4, r5)
            r11 = 2
            float r11 = (float) r11
            float r11 = r11 * r2
            float r11 = r11 + r6
            android.graphics.RectF r6 = new android.graphics.RectF
            r12 = r30
            float r12 = (float) r12
            float r13 = r7.getTextSize()
            r14 = 1028443341(0x3d4ccccd, float:0.05)
            float r13 = r13 * r14
            float r13 = r13 + r12
            float r11 = r11 + r1
            r12 = r32
            float r12 = (float) r12
            float r15 = r7.getTextSize()
            float r15 = r15 * r14
            float r12 = r12 - r15
            r6.<init>(r1, r13, r11, r12)
            float r11 = r7.getTextSize()
            r12 = 1049582633(0x3e8f5c29, float:0.28)
            float r11 = r11 * r12
            int r12 = r0.f92h
            int r14 = r0.f91g
            if (r14 == r12) goto L7b
            android.graphics.LinearGradient r15 = new android.graphics.LinearGradient
            float r12 = r6.left
            float r13 = r6.right
            int r1 = r0.f92h
            android.graphics.Shader$TileMode r22 = android.graphics.Shader.TileMode.CLAMP
            r17 = 0
            r19 = 0
            r21 = r1
            int r1 = r0.f91g
            r20 = r1
            r16 = r12
            r18 = r13
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            goto L7c
        L7b:
            r15 = 0
        L7c:
            r7.setShader(r15)
            r7.setColor(r14)
            r1 = r25
            r1.drawRoundRect(r6, r11, r11, r7)
            int r11 = r0.f94j
            int r12 = r0.f93i
            if (r12 == r11) goto La6
            android.graphics.LinearGradient r13 = new android.graphics.LinearGradient
            float r14 = r6.left
            float r6 = r6.right
            int r11 = r0.f94j
            android.graphics.Shader$TileMode r20 = android.graphics.Shader.TileMode.CLAMP
            r17 = 0
            int r15 = r0.f93i
            r16 = r6
            r19 = r11
            r18 = r15
            r15 = 0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            goto La7
        La6:
            r13 = 0
        La7:
            r7.setShader(r13)
            r7.setColor(r12)
            r6 = 1
            r7.setFakeBoldText(r6)
            float r2 = r29 + r2
            r6 = r31
            float r6 = (float) r6
            r23 = r5
            r5 = r2
            r2 = r3
            r3 = r4
            r4 = r23
            r1.drawText(r2, r3, r4, r5, r6, r7)
            r7.setColor(r8)
            r7.setShader(r9)
            r7.setFakeBoldText(r10)
            return
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(android.graphics.Paint r5, java.lang.CharSequence r6, int r7, int r8, android.graphics.Paint.FontMetricsInt r9) {
            r4 = this;
            r5.getClass()
            r6.getClass()
            float r0 = r5.getTextSize()
            r1 = 1055286886(0x3ee66666, float:0.45)
            float r0 = r0 * r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            float r2 = r5.getTextSize()
            r3 = 1041194025(0x3e0f5c29, float:0.14)
            float r2 = r2 * r3
            float r2 = r2 + r1
            int r1 = (int) r2
            android.graphics.Paint$FontMetricsInt r2 = r5.getFontMetricsInt()
            if (r9 == 0) goto L36
            int r3 = r2.ascent
            int r3 = r3 - r1
            r9.ascent = r3
            int r3 = r2.descent
            int r3 = r3 + r1
            r9.descent = r3
            int r3 = r2.top
            int r3 = r3 - r1
            r9.top = r3
            int r2 = r2.bottom
            int r2 = r2 + r1
            r9.bottom = r2
        L36:
            float r5 = r5.measureText(r6, r7, r8)
            int r0 = r0 * 2
            float r6 = (float) r0
            float r5 = r5 + r6
            int r5 = (int) r5
            return r5
    }
}
