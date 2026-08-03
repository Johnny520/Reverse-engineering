package a9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends android.text.style.ReplacementSpan {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y9.f f89g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f90h;

    public e(y9.f r2, int r3) {
            r1 = this;
            r1.<init>()
            r1.f89g = r2
            r2 = 100
            r0 = 900(0x384, float:1.261E-42)
            int r2 = r9.e0.r(r3, r2, r0)
            r1.f90h = r2
            return
    }

    public final void a(android.graphics.Paint r7) {
            r6 = this;
            android.graphics.Typeface r0 = r7.getTypeface()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 1
            r3 = 0
            r4 = 28
            int r5 = r6.f90h
            if (r1 < r4) goto L23
            if (r0 == 0) goto L17
            boolean r1 = r0.isItalic()
            if (r1 != r2) goto L17
            goto L18
        L17:
            r2 = r3
        L18:
            android.graphics.Typeface r0 = h3.c.a(r0, r5, r2)
            r7.setTypeface(r0)
            r7.setFakeBoldText(r3)
            return
        L23:
            r1 = 600(0x258, float:8.41E-43)
            if (r5 < r1) goto L29
            r4 = r2
            goto L2a
        L29:
            r4 = r3
        L2a:
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r4)
            r7.setTypeface(r0)
            if (r5 < r1) goto L34
            goto L35
        L34:
            r2 = r3
        L35:
            r7.setFakeBoldText(r2)
            return
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(android.graphics.Canvas r21, java.lang.CharSequence r22, int r23, int r24, float r25, int r26, int r27, int r28, android.graphics.Paint r29) {
            r20 = this;
            r0 = r20
            r7 = r29
            r21.getClass()
            r22.getClass()
            r7.getClass()
            int r8 = r7.getColor()
            android.graphics.Shader r9 = r7.getShader()
            android.graphics.Typeface r10 = r7.getTypeface()
            boolean r11 = r7.isFakeBoldText()
            r0.a(r7)
            y9.f r1 = r0.f89g
            if (r1 == 0) goto L65
            int r2 = r1.f22342a
            int r3 = r1.f22343b
            if (r2 == r3) goto L57
            r3 = r22
            r4 = r23
            r5 = r24
            float r2 = r7.measureText(r3, r4, r5)
            r6 = 1065353216(0x3f800000, float:1.0)
            int r12 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r12 >= 0) goto L3b
            r2 = r6
        L3b:
            android.graphics.LinearGradient r12 = new android.graphics.LinearGradient
            float r15 = r25 + r2
            int r2 = r1.f22342a
            int r1 = r1.f22343b
            android.graphics.Shader$TileMode r19 = android.graphics.Shader.TileMode.CLAMP
            r14 = 0
            r16 = 0
            r13 = r25
            r18 = r1
            r17 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r7.setShader(r12)
        L54:
            r1 = r27
            goto L6c
        L57:
            r3 = r22
            r4 = r23
            r5 = r24
            r1 = 0
            r7.setShader(r1)
            r7.setColor(r2)
            goto L54
        L65:
            r3 = r22
            r4 = r23
            r5 = r24
            goto L54
        L6c:
            float r6 = (float) r1
            r1 = r21
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r25
            r1.drawText(r2, r3, r4, r5, r6, r7)
            r7.setColor(r8)
            r7.setShader(r9)
            r7.setTypeface(r10)
            r7.setFakeBoldText(r11)
            return
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(android.graphics.Paint r2, java.lang.CharSequence r3, int r4, int r5, android.graphics.Paint.FontMetricsInt r6) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            android.graphics.Typeface r6 = r2.getTypeface()
            boolean r0 = r2.isFakeBoldText()
            r1.a(r2)
            float r3 = r2.measureText(r3, r4, r5)
            int r3 = (int) r3
            r2.setTypeface(r6)
            r2.setFakeBoldText(r0)
            return r3
    }
}
