package j2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends android.graphics.Canvas {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public android.graphics.Canvas f6694a;

    public final android.graphics.Canvas a() {
            r1 = this;
            android.graphics.Canvas r0 = r1.f6694a
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "Text drawing wrapper is missing a Canvas!"
            o2.a.c(r0)
            okio.a.c()
            r0 = 0
            return r0
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(android.graphics.Path r2) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            boolean r2 = r0.clipOutPath(r2)
            return r2
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float r2, float r3, float r4, float r5) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            boolean r2 = r0.clipOutRect(r2, r3, r4, r5)
            return r2
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            boolean r2 = r0.clipOutRect(r2, r3, r4, r5)
            return r2
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            boolean r2 = r0.clipOutRect(r2)
            return r2
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(android.graphics.RectF r2) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            boolean r2 = r0.clipOutRect(r2)
            return r2
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(android.graphics.Path r2) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            boolean r2 = r0.clipPath(r2)
            return r2
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(android.graphics.Path r2, android.graphics.Region.Op r3) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            boolean r2 = r0.clipPath(r2, r3)
            return r2
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float r2, float r3, float r4, float r5) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            boolean r2 = r0.clipRect(r2, r3, r4, r5)
            return r2
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float r7, float r8, float r9, float r10, android.graphics.Region.Op r11) {
            r6 = this;
            android.graphics.Canvas r0 = r6.a()
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            boolean r7 = r0.clipRect(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            boolean r2 = r0.clipRect(r2, r3, r4, r5)
            return r2
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            boolean r2 = r0.clipRect(r2)
            return r2
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(android.graphics.Rect r2, android.graphics.Region.Op r3) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            boolean r2 = r0.clipRect(r2, r3)
            return r2
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(android.graphics.RectF r2) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            boolean r2 = r0.clipRect(r2)
            return r2
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(android.graphics.RectF r2, android.graphics.Region.Op r3) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            boolean r2 = r0.clipRect(r2, r3)
            return r2
    }

    @Override // android.graphics.Canvas
    public final void concat(android.graphics.Matrix r2) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            r0.concat(r2)
            return
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            f1.a.t(r0)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            r0.drawARGB(r2, r3, r4, r5)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float r10, float r11, float r12, float r13, float r14, float r15, boolean r16, android.graphics.Paint r17) {
            r9 = this;
            android.graphics.Canvas r0 = r9.a()
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r0.drawArc(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawArc(android.graphics.RectF r7, float r8, float r9, boolean r10, android.graphics.Paint r11) {
            r6 = this;
            android.graphics.Canvas r0 = r6.a()
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.drawArc(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(android.graphics.Bitmap r2, float r3, float r4, android.graphics.Paint r5) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            r0.drawBitmap(r2, r3, r4, r5)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(android.graphics.Bitmap r2, android.graphics.Matrix r3, android.graphics.Paint r4) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            r0.drawBitmap(r2, r3, r4)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(android.graphics.Bitmap r2, android.graphics.Rect r3, android.graphics.Rect r4, android.graphics.Paint r5) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            r0.drawBitmap(r2, r3, r4, r5)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(android.graphics.Bitmap r2, android.graphics.Rect r3, android.graphics.RectF r4, android.graphics.Paint r5) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            r0.drawBitmap(r2, r3, r4, r5)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] r11, int r12, int r13, float r14, float r15, int r16, int r17, boolean r18, android.graphics.Paint r19) {
            r10 = this;
            android.graphics.Canvas r0 = r10.a()
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r0.drawBitmap(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] r11, int r12, int r13, int r14, int r15, int r16, int r17, boolean r18, android.graphics.Paint r19) {
            r10 = this;
            android.graphics.Canvas r0 = r10.a()
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r0.drawBitmap(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(android.graphics.Bitmap r10, int r11, int r12, float[] r13, int r14, int[] r15, int r16, android.graphics.Paint r17) {
            r9 = this;
            android.graphics.Canvas r0 = r9.a()
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r0.drawBitmapMesh(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float r2, float r3, float r4, android.graphics.Paint r5) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            r0.drawCircle(r2, r3, r4, r5)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int r2) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            r0.drawColor(r2)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int r2, android.graphics.BlendMode r3) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            i1.f.b(r0, r2, r3)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int r2, android.graphics.PorterDuff.Mode r3) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            r0.drawColor(r2, r3)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long r2) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            j2.b.i(r0, r2)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long r2, android.graphics.BlendMode r4) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            j2.b.j(r0, r2, r4)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(android.graphics.RectF r9, float r10, float r11, android.graphics.RectF r12, float r13, float r14, android.graphics.Paint r15) {
            r8 = this;
            android.graphics.Canvas r0 = r8.a()
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            i1.f.c(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(android.graphics.RectF r7, float[] r8, android.graphics.RectF r9, float[] r10, android.graphics.Paint r11) {
            r6 = this;
            android.graphics.Canvas r0 = r6.a()
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            i1.f.d(r0, r1, r2, r3, r4, r5)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] r9, int r10, float[] r11, int r12, int r13, android.graphics.fonts.Font r14, android.graphics.Paint r15) {
            r8 = this;
            android.graphics.Canvas r0 = r8.a()
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            a1.c.w(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float r7, float r8, float r9, float r10, android.graphics.Paint r11) {
            r6 = this;
            android.graphics.Canvas r0 = r6.a()
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.drawLine(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] r2, int r3, int r4, android.graphics.Paint r5) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            r0.drawLines(r2, r3, r4, r5)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] r2, android.graphics.Paint r3) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            r0.drawLines(r2, r3)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float r7, float r8, float r9, float r10, android.graphics.Paint r11) {
            r6 = this;
            android.graphics.Canvas r0 = r6.a()
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.drawOval(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawOval(android.graphics.RectF r2, android.graphics.Paint r3) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            r0.drawOval(r2, r3)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(android.graphics.Paint r2) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            r0.drawPaint(r2)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(android.graphics.NinePatch r2, android.graphics.Rect r3, android.graphics.Paint r4) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            a1.c.u(r0, r2, r3, r4)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(android.graphics.NinePatch r2, android.graphics.RectF r3, android.graphics.Paint r4) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            a1.c.v(r0, r2, r3, r4)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawPath(android.graphics.Path r2, android.graphics.Paint r3) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            r0.drawPath(r2, r3)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(android.graphics.Picture r2) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            r0.drawPicture(r2)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(android.graphics.Picture r2, android.graphics.Rect r3) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            r0.drawPicture(r2, r3)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(android.graphics.Picture r2, android.graphics.RectF r3) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            r0.drawPicture(r2, r3)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float r2, float r3, android.graphics.Paint r4) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            r0.drawPoint(r2, r3, r4)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] r2, int r3, int r4, android.graphics.Paint r5) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            r0.drawPoints(r2, r3, r4, r5)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] r2, android.graphics.Paint r3) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            r0.drawPoints(r2, r3)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(java.lang.String r2, float[] r3, android.graphics.Paint r4) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            r0.drawPosText(r2, r3, r4)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] r7, int r8, int r9, float[] r10, android.graphics.Paint r11) {
            r6 = this;
            android.graphics.Canvas r0 = r6.a()
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.drawPosText(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int r2, int r3, int r4) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            r0.drawRGB(r2, r3, r4)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float r7, float r8, float r9, float r10, android.graphics.Paint r11) {
            r6 = this;
            android.graphics.Canvas r0 = r6.a()
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.drawRect(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawRect(android.graphics.Rect r2, android.graphics.Paint r3) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            r0.drawRect(r2, r3)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawRect(android.graphics.RectF r2, android.graphics.Paint r3) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            r0.drawRect(r2, r3)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(android.graphics.RenderNode r2) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            j2.b.k(r0, r2)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float r9, float r10, float r11, float r12, float r13, float r14, android.graphics.Paint r15) {
            r8 = this;
            android.graphics.Canvas r0 = r8.a()
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r0.drawRoundRect(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(android.graphics.RectF r2, float r3, float r4, android.graphics.Paint r5) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            r0.drawRoundRect(r2, r3, r4, r5)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawText(java.lang.CharSequence r8, int r9, int r10, float r11, float r12, android.graphics.Paint r13) {
            r7 = this;
            android.graphics.Canvas r0 = r7.a()
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.drawText(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawText(java.lang.String r2, float r3, float r4, android.graphics.Paint r5) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            r0.drawText(r2, r3, r4, r5)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawText(java.lang.String r8, int r9, int r10, float r11, float r12, android.graphics.Paint r13) {
            r7 = this;
            android.graphics.Canvas r0 = r7.a()
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.drawText(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] r8, int r9, int r10, float r11, float r12, android.graphics.Paint r13) {
            r7 = this;
            android.graphics.Canvas r0 = r7.a()
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.drawText(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(java.lang.String r7, android.graphics.Path r8, float r9, float r10, android.graphics.Paint r11) {
            r6 = this;
            android.graphics.Canvas r0 = r6.a()
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.drawTextOnPath(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] r9, int r10, int r11, android.graphics.Path r12, float r13, float r14, android.graphics.Paint r15) {
            r8 = this;
            android.graphics.Canvas r0 = r8.a()
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r0.drawTextOnPath(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(android.graphics.text.MeasuredText r11, int r12, int r13, int r14, int r15, float r16, float r17, boolean r18, android.graphics.Paint r19) {
            r10 = this;
            android.graphics.Canvas r0 = r10.a()
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            i1.f.e(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(java.lang.CharSequence r11, int r12, int r13, int r14, int r15, float r16, float r17, boolean r18, android.graphics.Paint r19) {
            r10 = this;
            android.graphics.Canvas r0 = r10.a()
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r0.drawTextRun(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] r11, int r12, int r13, int r14, int r15, float r16, float r17, boolean r18, android.graphics.Paint r19) {
            r10 = this;
            android.graphics.Canvas r0 = r10.a()
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r0.drawTextRun(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(android.graphics.Canvas.VertexMode r14, int r15, float[] r16, int r17, float[] r18, int r19, int[] r20, int r21, short[] r22, int r23, int r24, android.graphics.Paint r25) {
            r13 = this;
            android.graphics.Canvas r0 = r13.a()
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r12 = r25
            r0.drawVertices(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            f1.a.k(r0)
            return
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(android.graphics.Rect r5) {
            r4 = this;
            android.graphics.Canvas r0 = r4.a()
            boolean r0 = r0.getClipBounds(r5)
            if (r0 == 0) goto L15
            int r1 = r5.width()
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            r5.set(r3, r3, r1, r2)
        L15:
            return r0
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            int r0 = r0.getDensity()
            return r0
    }

    @Override // android.graphics.Canvas
    public final android.graphics.DrawFilter getDrawFilter() {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            android.graphics.DrawFilter r0 = r0.getDrawFilter()
            return r0
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            int r0 = r0.getHeight()
            return r0
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(android.graphics.Matrix r2) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            r0.getMatrix(r2)
            return
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            int r0 = r0.getMaximumBitmapHeight()
            return r0
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            int r0 = r0.getMaximumBitmapWidth()
            return r0
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            int r0 = r0.getSaveCount()
            return r0
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            int r0 = r0.getWidth()
            return r0
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            boolean r0 = r0.isOpaque()
            return r0
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float r2, float r3, float r4, float r5) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            boolean r2 = g3.o0.l(r0, r2, r3, r4, r5)
            return r2
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float r7, float r8, float r9, float r10, android.graphics.Canvas.EdgeType r11) {
            r6 = this;
            android.graphics.Canvas r0 = r6.a()
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            boolean r7 = r0.quickReject(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(android.graphics.Path r2) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            boolean r2 = g3.o0.m(r0, r2)
            return r2
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(android.graphics.Path r2, android.graphics.Canvas.EdgeType r3) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            boolean r2 = r0.quickReject(r2, r3)
            return r2
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(android.graphics.RectF r2) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            boolean r2 = g3.o0.n(r0, r2)
            return r2
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(android.graphics.RectF r2, android.graphics.Canvas.EdgeType r3) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            boolean r2 = r0.quickReject(r2, r3)
            return r2
    }

    @Override // android.graphics.Canvas
    public final void restore() {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            r0.restore()
            return
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int r2) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            r0.restoreToCount(r2)
            return
    }

    @Override // android.graphics.Canvas
    public final void rotate(float r2) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            r0.rotate(r2)
            return
    }

    @Override // android.graphics.Canvas
    public final int save() {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            int r0 = r0.save()
            return r0
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float r7, float r8, float r9, float r10, android.graphics.Paint r11) {
            r6 = this;
            android.graphics.Canvas r0 = r6.a()
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            int r7 = r0.saveLayer(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float r8, float r9, float r10, float r11, android.graphics.Paint r12, int r13) {
            r7 = this;
            android.graphics.Canvas r0 = r7.a()
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            int r8 = r0.saveLayer(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(android.graphics.RectF r2, android.graphics.Paint r3) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            int r2 = r0.saveLayer(r2, r3)
            return r2
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(android.graphics.RectF r2, android.graphics.Paint r3, int r4) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            int r2 = r0.saveLayer(r2, r3, r4)
            return r2
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float r7, float r8, float r9, float r10, int r11) {
            r6 = this;
            android.graphics.Canvas r0 = r6.a()
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            int r7 = r0.saveLayerAlpha(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float r8, float r9, float r10, float r11, int r12, int r13) {
            r7 = this;
            android.graphics.Canvas r0 = r7.a()
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            int r8 = r0.saveLayerAlpha(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(android.graphics.RectF r2, int r3) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            int r2 = r0.saveLayerAlpha(r2, r3)
            return r2
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(android.graphics.RectF r2, int r3, int r4) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            int r2 = r0.saveLayerAlpha(r2, r3, r4)
            return r2
    }

    @Override // android.graphics.Canvas
    public final void scale(float r2, float r3) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            r0.scale(r2, r3)
            return
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(android.graphics.Bitmap r2) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            r0.setBitmap(r2)
            return
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int r2) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            r0.setDensity(r2)
            return
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(android.graphics.DrawFilter r2) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            r0.setDrawFilter(r2)
            return
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(android.graphics.Matrix r2) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            r0.setMatrix(r2)
            return
    }

    @Override // android.graphics.Canvas
    public final void skew(float r2, float r3) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            r0.skew(r2, r3)
            return
    }

    @Override // android.graphics.Canvas
    public final void translate(float r2, float r3) {
            r1 = this;
            android.graphics.Canvas r0 = r1.a()
            r0.translate(r2, r3)
            return
    }
}
