package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۧ۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5433 extends android.graphics.drawable.Drawable {

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f20145 = 3;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.graphics.Bitmap f20146;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int f20147;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f20148;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final android.graphics.Paint f20149;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final android.graphics.BitmapShader f20150;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final android.graphics.Matrix f20151;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public float f20152;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final android.graphics.Rect f20153;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final android.graphics.RectF f20154;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public boolean f20155;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public boolean f20156;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int f20157;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public int f20158;

    public AbstractC5433(android.content.res.Resources r3, android.graphics.Bitmap r4) {
            r2 = this;
            r2.<init>()
            r0 = 160(0xa0, float:2.24E-43)
            r2.f20147 = r0
            r0 = 119(0x77, float:1.67E-43)
            r2.f20148 = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 3
            r0.<init>(r1)
            r2.f20149 = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r2.f20151 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.f20153 = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r2.f20154 = r0
            r0 = 1
            r2.f20155 = r0
            if (r3 == 0) goto L35
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            int r3 = r3.densityDpi
            r2.f20147 = r3
        L35:
            r2.f20146 = r4
            if (r4 == 0) goto L46
            r2.m20490()
            android.graphics.BitmapShader r3 = new android.graphics.BitmapShader
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.CLAMP
            r3.<init>(r4, r0, r0)
            r2.f20150 = r3
            goto L4e
        L46:
            r3 = -1
            r2.f20158 = r3
            r2.f20157 = r3
            r3 = 0
            r2.f20150 = r3
        L4e:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static boolean m20489(float r1) {
            r0 = 1028443341(0x3d4ccccd, float:0.05)
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 <= 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@Yue.InterfaceC4410 android.graphics.Canvas r5) {
            r4 = this;
            android.graphics.Bitmap r0 = r4.f20146
            if (r0 != 0) goto L5
            return
        L5:
            r4.m20505()
            android.graphics.Paint r1 = r4.f20149
            android.graphics.Shader r1 = r1.getShader()
            if (r1 != 0) goto L19
            android.graphics.Rect r1 = r4.f20153
            android.graphics.Paint r2 = r4.f20149
            r3 = 0
            r5.drawBitmap(r0, r3, r1, r2)
            goto L22
        L19:
            android.graphics.RectF r0 = r4.f20154
            float r1 = r4.f20152
            android.graphics.Paint r2 = r4.f20149
            r5.drawRoundRect(r0, r1, r1, r2)
        L22:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
            r1 = this;
            android.graphics.Paint r0 = r1.f20149
            int r0 = r0.getAlpha()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.ColorFilter getColorFilter() {
            r1 = this;
            android.graphics.Paint r0 = r1.f20149
            android.graphics.ColorFilter r0 = r0.getColorFilter()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            int r0 = r1.f20158
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            int r0 = r1.f20157
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r3 = this;
            int r0 = r3.f20148
            r1 = 119(0x77, float:1.67E-43)
            r2 = -3
            if (r0 != r1) goto L2a
            boolean r0 = r3.f20156
            if (r0 == 0) goto Lc
            goto L2a
        Lc:
            android.graphics.Bitmap r0 = r3.f20146
            if (r0 == 0) goto L2a
            boolean r0 = r0.hasAlpha()
            if (r0 != 0) goto L2a
            android.graphics.Paint r0 = r3.f20149
            int r0 = r0.getAlpha()
            r1 = 255(0xff, float:3.57E-43)
            if (r0 < r1) goto L2a
            float r0 = r3.f20152
            boolean r0 = m20489(r0)
            if (r0 == 0) goto L29
            goto L2a
        L29:
            r2 = -1
        L2a:
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@Yue.InterfaceC4410 android.graphics.Rect r1) {
            r0 = this;
            super.onBoundsChange(r1)
            boolean r1 = r0.f20156
            if (r1 == 0) goto La
            r0.m20504()
        La:
            r1 = 1
            r0.f20155 = r1
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.f20149
            int r0 = r0.getAlpha()
            if (r2 == r0) goto L10
            android.graphics.Paint r0 = r1.f20149
            r0.setAlpha(r2)
            r1.invalidateSelf()
        L10:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.f20149
            r0.setColorFilter(r2)
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.f20149
            r0.setDither(r2)
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.f20149
            r0.setFilterBitmap(r2)
            r1.invalidateSelf()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m20490() {
            r2 = this;
            android.graphics.Bitmap r0 = r2.f20146
            int r1 = r2.f20147
            int r0 = r0.getScaledWidth(r1)
            r2.f20157 = r0
            android.graphics.Bitmap r0 = r2.f20146
            int r1 = r2.f20147
            int r0 = r0.getScaledHeight(r1)
            r2.f20158 = r0
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final android.graphics.Bitmap m20491() {
            r1 = this;
            android.graphics.Bitmap r0 = r1.f20146
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public float m20492() {
            r1 = this;
            float r0 = r1.f20152
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int m20493() {
            r1 = this;
            int r0 = r1.f20148
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final android.graphics.Paint m20494() {
            r1 = this;
            android.graphics.Paint r0 = r1.f20149
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo20486(int r1, int r2, int r3, android.graphics.Rect r4, android.graphics.Rect r5) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean m20495() {
            r1 = this;
            android.graphics.Paint r0 = r1.f20149
            boolean r0 = r0.isAntiAlias()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public boolean mo20487() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean m20496() {
            r1 = this;
            boolean r0 = r1.f20156
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m20497(boolean r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.f20149
            r0.setAntiAlias(r2)
            r1.invalidateSelf()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m20498(boolean r2) {
            r1 = this;
            r1.f20156 = r2
            r0 = 1
            r1.f20155 = r0
            if (r2 == 0) goto L15
            r1.m20504()
            android.graphics.Paint r2 = r1.f20149
            android.graphics.BitmapShader r0 = r1.f20150
            r2.setShader(r0)
            r1.invalidateSelf()
            goto L19
        L15:
            r2 = 0
            r1.m20499(r2)
        L19:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m20499(float r3) {
            r2 = this;
            float r0 = r2.f20152
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 0
            r2.f20156 = r0
            boolean r0 = m20489(r3)
            if (r0 == 0) goto L18
            android.graphics.Paint r0 = r2.f20149
            android.graphics.BitmapShader r1 = r2.f20150
            r0.setShader(r1)
            goto L1e
        L18:
            android.graphics.Paint r0 = r2.f20149
            r1 = 0
            r0.setShader(r1)
        L1e:
            r2.f20152 = r3
            r2.invalidateSelf()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m20500(int r2) {
            r1 = this;
            int r0 = r1.f20148
            if (r0 == r2) goto Lc
            r1.f20148 = r2
            r2 = 1
            r1.f20155 = r2
            r1.invalidateSelf()
        Lc:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public void mo20488(boolean r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m20501(int r2) {
            r1 = this;
            int r0 = r1.f20147
            if (r0 == r2) goto L14
            if (r2 != 0) goto L8
            r2 = 160(0xa0, float:2.24E-43)
        L8:
            r1.f20147 = r2
            android.graphics.Bitmap r2 = r1.f20146
            if (r2 == 0) goto L11
            r1.m20490()
        L11:
            r1.invalidateSelf()
        L14:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m20502(@Yue.InterfaceC4410 android.graphics.Canvas r1) {
            r0 = this;
            int r1 = r1.getDensity()
            r0.m20501(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m20503(@Yue.InterfaceC4410 android.util.DisplayMetrics r1) {
            r0 = this;
            int r1 = r1.densityDpi
            r0.m20501(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final void m20504() {
            r2 = this;
            int r0 = r2.f20158
            int r1 = r2.f20157
            int r0 = java.lang.Math.min(r0, r1)
            int r0 = r0 / 2
            float r0 = (float) r0
            r2.f20152 = r0
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m20505() {
            r9 = this;
            boolean r0 = r9.f20155
            if (r0 == 0) goto Lab
            boolean r0 = r9.f20156
            r1 = 0
            if (r0 == 0) goto L54
            int r0 = r9.f20157
            int r2 = r9.f20158
            int r6 = java.lang.Math.min(r0, r2)
            int r4 = r9.f20148
            android.graphics.Rect r7 = r9.getBounds()
            android.graphics.Rect r8 = r9.f20153
            r3 = r9
            r5 = r6
            r3.mo20486(r4, r5, r6, r7, r8)
            android.graphics.Rect r0 = r9.f20153
            int r0 = r0.width()
            android.graphics.Rect r2 = r9.f20153
            int r2 = r2.height()
            int r0 = java.lang.Math.min(r0, r2)
            android.graphics.Rect r2 = r9.f20153
            int r2 = r2.width()
            int r2 = r2 - r0
            int r2 = r2 / 2
            int r2 = java.lang.Math.max(r1, r2)
            android.graphics.Rect r3 = r9.f20153
            int r3 = r3.height()
            int r3 = r3 - r0
            int r3 = r3 / 2
            int r3 = java.lang.Math.max(r1, r3)
            android.graphics.Rect r4 = r9.f20153
            r4.inset(r2, r3)
            r2 = 1056964608(0x3f000000, float:0.5)
            float r0 = (float) r0
            float r0 = r0 * r2
            r9.f20152 = r0
            goto L64
        L54:
            int r3 = r9.f20148
            int r4 = r9.f20157
            int r5 = r9.f20158
            android.graphics.Rect r6 = r9.getBounds()
            android.graphics.Rect r7 = r9.f20153
            r2 = r9
            r2.mo20486(r3, r4, r5, r6, r7)
        L64:
            android.graphics.RectF r0 = r9.f20154
            android.graphics.Rect r2 = r9.f20153
            r0.set(r2)
            android.graphics.BitmapShader r0 = r9.f20150
            if (r0 == 0) goto La9
            android.graphics.Matrix r0 = r9.f20151
            android.graphics.RectF r2 = r9.f20154
            float r3 = r2.left
            float r2 = r2.top
            r0.setTranslate(r3, r2)
            android.graphics.Matrix r0 = r9.f20151
            android.graphics.RectF r2 = r9.f20154
            float r2 = r2.width()
            android.graphics.Bitmap r3 = r9.f20146
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            android.graphics.RectF r3 = r9.f20154
            float r3 = r3.height()
            android.graphics.Bitmap r4 = r9.f20146
            int r4 = r4.getHeight()
            float r4 = (float) r4
            float r3 = r3 / r4
            r0.preScale(r2, r3)
            android.graphics.BitmapShader r0 = r9.f20150
            android.graphics.Matrix r2 = r9.f20151
            r0.setLocalMatrix(r2)
            android.graphics.Paint r0 = r9.f20149
            android.graphics.BitmapShader r2 = r9.f20150
            r0.setShader(r2)
        La9:
            r9.f20155 = r1
        Lab:
            return
    }
}
