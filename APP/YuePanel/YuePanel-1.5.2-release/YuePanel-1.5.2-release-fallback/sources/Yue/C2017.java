package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C2017 extends android.graphics.drawable.Drawable {

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f6403 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f6404 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f6405 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int f6406 = 3;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final float f6407 = 0.0f;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.graphics.Paint f6408;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public float f6409;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public float f6410;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public float f6411;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public float f6412;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean f6413;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final android.graphics.Path f6414;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final int f6415;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean f6416;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public float f6417;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public float f6418;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int f6419;

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۡۨ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InterfaceC2018 {
    }

    static {
            r0 = 4631530004285489152(0x4046800000000000, double:45.0)
            double r0 = java.lang.Math.toRadians(r0)
            float r0 = (float) r0
            Yue.C2017.f6407 = r0
            return
    }

    public C2017(android.content.Context r7) {
            r6 = this;
            r6.<init>()
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r6.f6408 = r0
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r6.f6414 = r1
            r1 = 0
            r6.f6416 = r1
            r2 = 2
            r6.f6419 = r2
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r2)
            android.graphics.Paint$Join r2 = android.graphics.Paint.Join.MITER
            r0.setStrokeJoin(r2)
            android.graphics.Paint$Cap r2 = android.graphics.Paint.Cap.BUTT
            r0.setStrokeCap(r2)
            r2 = 1
            r0.setAntiAlias(r2)
            android.content.res.Resources$Theme r7 = r7.getTheme()
            int[] r0 = Yue.C5058.C5071.f17825
            int r3 = Yue.C5058.C5060.f16670
            int r4 = Yue.C5058.C5070.f17371
            r5 = 0
            android.content.res.TypedArray r7 = r7.obtainStyledAttributes(r5, r0, r3, r4)
            int r0 = Yue.C5058.C5071.f17829
            int r0 = r7.getColor(r0, r1)
            r6.m9326(r0)
            int r0 = Yue.C5058.C5071.f17833
            r3 = 0
            float r0 = r7.getDimension(r0, r3)
            r6.m9325(r0)
            int r0 = Yue.C5058.C5071.f17832
            boolean r0 = r7.getBoolean(r0, r2)
            r6.m9330(r0)
            int r0 = Yue.C5058.C5071.f17831
            float r0 = r7.getDimension(r0, r3)
            int r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            r6.m9328(r0)
            int r0 = Yue.C5058.C5071.f17830
            int r0 = r7.getDimensionPixelSize(r0, r1)
            r6.f6415 = r0
            int r0 = Yue.C5058.C5071.f17828
            float r0 = r7.getDimension(r0, r3)
            int r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            r6.f6410 = r0
            int r0 = Yue.C5058.C5071.f17826
            float r0 = r7.getDimension(r0, r3)
            int r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            r6.f6409 = r0
            int r0 = Yue.C5058.C5071.f17827
            float r0 = r7.getDimension(r0, r3)
            r6.f6411 = r0
            r7.recycle()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static float m9311(float r0, float r1, float r2) {
            float r1 = r1 - r0
            float r1 = r1 * r2
            float r0 = r0 + r1
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@Yue.InterfaceC4410 android.graphics.Canvas r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            android.graphics.Rect r2 = r18.getBounds()
            int r3 = r0.f6419
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L21
            if (r3 == r5) goto L20
            r6 = 3
            if (r3 == r6) goto L1a
            int r3 = Yue.C1995.m9223(r18)
            if (r3 != r5) goto L21
            goto L20
        L1a:
            int r3 = Yue.C1995.m9223(r18)
            if (r3 != 0) goto L21
        L20:
            r4 = r5
        L21:
            float r3 = r0.f6409
            float r3 = r3 * r3
            r6 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 * r6
            double r7 = (double) r3
            double r7 = java.lang.Math.sqrt(r7)
            float r3 = (float) r7
            float r7 = r0.f6410
            float r8 = r0.f6417
            float r3 = m9311(r7, r3, r8)
            float r7 = r0.f6410
            float r8 = r0.f6411
            float r9 = r0.f6417
            float r7 = m9311(r7, r8, r9)
            float r8 = r0.f6418
            float r9 = r0.f6417
            r10 = 0
            float r8 = m9311(r10, r8, r9)
            int r8 = java.lang.Math.round(r8)
            float r8 = (float) r8
            float r9 = Yue.C2017.f6407
            float r11 = r0.f6417
            float r9 = m9311(r10, r9, r11)
            if (r4 == 0) goto L59
            r11 = r10
            goto L5b
        L59:
            r11 = -1020002304(0xffffffffc3340000, float:-180.0)
        L5b:
            r12 = 1127481344(0x43340000, float:180.0)
            if (r4 == 0) goto L61
            r13 = r12
            goto L62
        L61:
            r13 = r10
        L62:
            float r14 = r0.f6417
            float r11 = m9311(r11, r13, r14)
            double r13 = (double) r3
            r15 = r11
            double r10 = (double) r9
            double r16 = java.lang.Math.cos(r10)
            double r16 = r16 * r13
            r9 = r4
            long r3 = java.lang.Math.round(r16)
            float r3 = (float) r3
            double r10 = java.lang.Math.sin(r10)
            double r13 = r13 * r10
            long r10 = java.lang.Math.round(r13)
            float r4 = (float) r10
            android.graphics.Path r10 = r0.f6414
            r10.rewind()
            float r10 = r0.f6412
            android.graphics.Paint r11 = r0.f6408
            float r11 = r11.getStrokeWidth()
            float r10 = r10 + r11
            float r11 = r0.f6418
            float r11 = -r11
            float r13 = r0.f6417
            float r10 = m9311(r10, r11, r13)
            float r11 = -r7
            float r11 = r11 / r6
            android.graphics.Path r13 = r0.f6414
            float r14 = r11 + r8
            r5 = 0
            r13.moveTo(r14, r5)
            android.graphics.Path r13 = r0.f6414
            float r8 = r8 * r6
            float r7 = r7 - r8
            r13.rLineTo(r7, r5)
            android.graphics.Path r5 = r0.f6414
            r5.moveTo(r11, r10)
            android.graphics.Path r5 = r0.f6414
            r5.rLineTo(r3, r4)
            android.graphics.Path r5 = r0.f6414
            float r7 = -r10
            r5.moveTo(r11, r7)
            android.graphics.Path r5 = r0.f6414
            float r4 = -r4
            r5.rLineTo(r3, r4)
            android.graphics.Path r3 = r0.f6414
            r3.close()
            r19.save()
            android.graphics.Paint r3 = r0.f6408
            float r3 = r3.getStrokeWidth()
            int r4 = r2.height()
            float r4 = (float) r4
            r5 = 1077936128(0x40400000, float:3.0)
            float r5 = r5 * r3
            float r4 = r4 - r5
            float r5 = r0.f6412
            float r6 = r6 * r5
            float r4 = r4 - r6
            int r4 = (int) r4
            int r4 = r4 / 4
            int r4 = r4 * 2
            float r4 = (float) r4
            r6 = 1069547520(0x3fc00000, float:1.5)
            float r3 = r3 * r6
            float r3 = r3 + r5
            float r4 = r4 + r3
            int r2 = r2.centerX()
            float r2 = (float) r2
            r1.translate(r2, r4)
            boolean r2 = r0.f6413
            if (r2 == 0) goto L100
            boolean r2 = r0.f6416
            r2 = r2 ^ r9
            if (r2 == 0) goto Lf8
            r5 = -1
            goto Lf9
        Lf8:
            r5 = 1
        Lf9:
            float r2 = (float) r5
            float r11 = r15 * r2
            r1.rotate(r11)
            goto L105
        L100:
            if (r9 == 0) goto L105
            r1.rotate(r12)
        L105:
            android.graphics.Path r2 = r0.f6414
            android.graphics.Paint r3 = r0.f6408
            r1.drawPath(r2, r3)
            r19.restore()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            int r0 = r1.f6415
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            int r0 = r1.f6415
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = -3
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.f6408
            int r0 = r0.getAlpha()
            if (r2 == r0) goto L10
            android.graphics.Paint r0 = r1.f6408
            r0.setAlpha(r2)
            r1.invalidateSelf()
        L10:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.f6408
            r0.setColorFilter(r2)
            r1.invalidateSelf()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public float m9312() {
            r1 = this;
            float r0 = r1.f6409
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public float m9313() {
            r1 = this;
            float r0 = r1.f6411
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public float m9314() {
            r1 = this;
            float r0 = r1.f6410
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public float m9315() {
            r1 = this;
            android.graphics.Paint r0 = r1.f6408
            float r0 = r0.getStrokeWidth()
            return r0
    }

    @Yue.InterfaceC1230
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m9316() {
            r1 = this;
            android.graphics.Paint r0 = r1.f6408
            int r0 = r0.getColor()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m9317() {
            r1 = this;
            int r0 = r1.f6419
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public float m9318() {
            r1 = this;
            float r0 = r1.f6412
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final android.graphics.Paint m9319() {
            r1 = this;
            android.graphics.Paint r0 = r1.f6408
            return r0
    }

    @Yue.InterfaceC2458(from = 0.0d, to = 1.0d)
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public float m9320() {
            r1 = this;
            float r0 = r1.f6417
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public boolean m9321() {
            r1 = this;
            boolean r0 = r1.f6413
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m9322(float r2) {
            r1 = this;
            float r0 = r1.f6409
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.f6409 = r2
            r1.invalidateSelf()
        Lb:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m9323(float r2) {
            r1 = this;
            float r0 = r1.f6411
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.f6411 = r2
            r1.invalidateSelf()
        Lb:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m9324(float r2) {
            r1 = this;
            float r0 = r1.f6410
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.f6410 = r2
            r1.invalidateSelf()
        Lb:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m9325(float r5) {
            r4 = this;
            android.graphics.Paint r0 = r4.f6408
            float r0 = r0.getStrokeWidth()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L21
            android.graphics.Paint r0 = r4.f6408
            r0.setStrokeWidth(r5)
            r0 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r0
            double r0 = (double) r5
            float r5 = Yue.C2017.f6407
            double r2 = (double) r5
            double r2 = java.lang.Math.cos(r2)
            double r0 = r0 * r2
            float r5 = (float) r0
            r4.f6418 = r5
            r4.invalidateSelf()
        L21:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m9326(@Yue.InterfaceC1230 int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.f6408
            int r0 = r0.getColor()
            if (r2 == r0) goto L10
            android.graphics.Paint r0 = r1.f6408
            r0.setColor(r2)
            r1.invalidateSelf()
        L10:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m9327(int r2) {
            r1 = this;
            int r0 = r1.f6419
            if (r2 == r0) goto L9
            r1.f6419 = r2
            r1.invalidateSelf()
        L9:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m9328(float r2) {
            r1 = this;
            float r0 = r1.f6412
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.f6412 = r2
            r1.invalidateSelf()
        Lb:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m9329(@Yue.InterfaceC2458(from = 0.0d, to = 1.0d) float r2) {
            r1 = this;
            float r0 = r1.f6417
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.f6417 = r2
            r1.invalidateSelf()
        Lb:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m9330(boolean r2) {
            r1 = this;
            boolean r0 = r1.f6413
            if (r0 == r2) goto L9
            r1.f6413 = r2
            r1.invalidateSelf()
        L9:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m9331(boolean r2) {
            r1 = this;
            boolean r0 = r1.f6416
            if (r0 == r2) goto L9
            r1.f6416 = r2
            r1.invalidateSelf()
        L9:
            return
    }
}
