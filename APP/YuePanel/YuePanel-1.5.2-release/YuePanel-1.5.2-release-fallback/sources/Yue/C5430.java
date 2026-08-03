package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۧ۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5430 extends android.graphics.drawable.Drawable {

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final double f20126 = 0.0d;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final float f20127 = 1.5f;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static Yue.C5430.InterfaceC5431 f20128;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final int f20129;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public android.graphics.Paint f20130;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public android.graphics.Paint f20131;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public android.graphics.Paint f20132;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final android.graphics.RectF f20133;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public float f20134;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public android.graphics.Path f20135;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public float f20136;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public float f20137;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public float f20138;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public android.content.res.ColorStateList f20139;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean f20140;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final int f20141;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final int f20142;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public boolean f20143;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public boolean f20144;

    /* JADX INFO: renamed from: Yue.ۥۡۧ۠۟$ۥ, reason: contains not printable characters */
    public interface InterfaceC5431 {
        /* JADX INFO: renamed from: ۥ */
        void mo5389(android.graphics.Canvas r1, android.graphics.RectF r2, float r3, android.graphics.Paint r4);
    }

    static {
            r0 = 4631530004285489152(0x4046800000000000, double:45.0)
            double r0 = java.lang.Math.toRadians(r0)
            double r0 = java.lang.Math.cos(r0)
            Yue.C5430.f20126 = r0
            return
    }

    public C5430(android.content.res.Resources r3, android.content.res.ColorStateList r4, float r5, float r6, float r7) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.f20140 = r0
            r2.f20143 = r0
            r0 = 0
            r2.f20144 = r0
            int r1 = Yue.C5155.C5157.f19096
            int r1 = r3.getColor(r1)
            r2.f20141 = r1
            int r1 = Yue.C5155.C5157.f19095
            int r1 = r3.getColor(r1)
            r2.f20142 = r1
            int r1 = Yue.C5155.C5158.f19097
            int r3 = r3.getDimensionPixelSize(r1)
            r2.f20129 = r3
            android.graphics.Paint r3 = new android.graphics.Paint
            r1 = 5
            r3.<init>(r1)
            r2.f20130 = r3
            r2.m20479(r4)
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>(r1)
            r2.f20131 = r3
            android.graphics.Paint$Style r4 = android.graphics.Paint.Style.FILL
            r3.setStyle(r4)
            r3 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 + r3
            int r3 = (int) r5
            float r3 = (float) r3
            r2.f20134 = r3
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            r2.f20133 = r3
            android.graphics.Paint r3 = new android.graphics.Paint
            android.graphics.Paint r4 = r2.f20131
            r3.<init>(r4)
            r2.f20132 = r3
            r3.setAntiAlias(r0)
            r2.m20484(r6, r7)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static float m20466(float r6, float r7, boolean r8) {
            if (r8 == 0) goto Lc
            double r0 = (double) r6
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = Yue.C5430.f20126
            double r2 = r2 - r4
            double r6 = (double) r7
            double r2 = r2 * r6
            double r0 = r0 + r2
            float r6 = (float) r0
        Lc:
            return r6
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static float m20467(float r6, float r7, boolean r8) {
            r0 = 1069547520(0x3fc00000, float:1.5)
            if (r8 == 0) goto L10
            float r6 = r6 * r0
            double r0 = (double) r6
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = Yue.C5430.f20126
            double r2 = r2 - r4
            double r6 = (double) r7
            double r2 = r2 * r6
            double r0 = r0 + r2
            float r6 = (float) r0
            return r6
        L10:
            float r6 = r6 * r0
            return r6
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r5) {
            r4 = this;
            boolean r0 = r4.f20140
            if (r0 == 0) goto Le
            android.graphics.Rect r0 = r4.getBounds()
            r4.m20468(r0)
            r0 = 0
            r4.f20140 = r0
        Le:
            float r0 = r4.f20138
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            r2 = 0
            r5.translate(r2, r0)
            r4.m20470(r5)
            float r0 = r4.f20138
            float r0 = -r0
            float r0 = r0 / r1
            r5.translate(r2, r0)
            Yue.ۥۡۧ۠۟$ۥ r0 = Yue.C5430.f20128
            android.graphics.RectF r1 = r4.f20133
            float r2 = r4.f20134
            android.graphics.Paint r3 = r4.f20130
            r0.mo5389(r5, r1, r2, r3)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = -3
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(android.graphics.Rect r5) {
            r4 = this;
            float r0 = r4.f20136
            float r1 = r4.f20134
            boolean r2 = r4.f20143
            float r0 = m20467(r0, r1, r2)
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            float r1 = r4.f20136
            float r2 = r4.f20134
            boolean r3 = r4.f20143
            float r1 = m20466(r1, r2, r3)
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            r5.set(r1, r0, r1, r0)
            r5 = 1
            return r5
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f20139
            if (r0 == 0) goto La
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L10
        La:
            boolean r0 = super.isStateful()
            if (r0 == 0) goto L12
        L10:
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(android.graphics.Rect r1) {
            r0 = this;
            super.onBoundsChange(r1)
            r1 = 1
            r0.f20140 = r1
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] r3) {
            r2 = this;
            android.content.res.ColorStateList r0 = r2.f20139
            int r1 = r0.getDefaultColor()
            int r3 = r0.getColorForState(r3, r1)
            android.graphics.Paint r0 = r2.f20130
            int r0 = r0.getColor()
            if (r0 != r3) goto L14
            r3 = 0
            return r3
        L14:
            android.graphics.Paint r0 = r2.f20130
            r0.setColor(r3)
            r3 = 1
            r2.f20140 = r3
            r2.invalidateSelf()
            return r3
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.f20130
            r0.setAlpha(r2)
            android.graphics.Paint r0 = r1.f20131
            r0.setAlpha(r2)
            android.graphics.Paint r0 = r1.f20132
            r0.setAlpha(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.f20130
            r0.setColorFilter(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m20468(android.graphics.Rect r7) {
            r6 = this;
            float r0 = r6.f20136
            r1 = 1069547520(0x3fc00000, float:1.5)
            float r1 = r1 * r0
            android.graphics.RectF r2 = r6.f20133
            int r3 = r7.left
            float r3 = (float) r3
            float r3 = r3 + r0
            int r4 = r7.top
            float r4 = (float) r4
            float r4 = r4 + r1
            int r5 = r7.right
            float r5 = (float) r5
            float r5 = r5 - r0
            int r7 = r7.bottom
            float r7 = (float) r7
            float r7 = r7 - r1
            r2.set(r3, r4, r5, r7)
            r6.m20469()
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m20469() {
            r22 = this;
            r0 = r22
            r1 = 3
            r2 = 0
            android.graphics.RectF r3 = new android.graphics.RectF
            float r4 = r0.f20134
            float r5 = -r4
            float r6 = -r4
            r3.<init>(r5, r6, r4, r4)
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>(r3)
            float r5 = r0.f20137
            float r6 = -r5
            float r5 = -r5
            r4.inset(r6, r5)
            android.graphics.Path r5 = r0.f20135
            if (r5 != 0) goto L25
            android.graphics.Path r5 = new android.graphics.Path
            r5.<init>()
            r0.f20135 = r5
            goto L28
        L25:
            r5.reset()
        L28:
            android.graphics.Path r5 = r0.f20135
            android.graphics.Path$FillType r6 = android.graphics.Path.FillType.EVEN_ODD
            r5.setFillType(r6)
            android.graphics.Path r5 = r0.f20135
            float r6 = r0.f20134
            float r6 = -r6
            r7 = 0
            r5.moveTo(r6, r7)
            android.graphics.Path r5 = r0.f20135
            float r6 = r0.f20137
            float r6 = -r6
            r5.rLineTo(r6, r7)
            android.graphics.Path r5 = r0.f20135
            r6 = 1127481344(0x43340000, float:180.0)
            r8 = 1119092736(0x42b40000, float:90.0)
            r5.arcTo(r4, r6, r8, r2)
            android.graphics.Path r4 = r0.f20135
            r5 = 1132920832(0x43870000, float:270.0)
            r6 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r4.arcTo(r3, r5, r6, r2)
            android.graphics.Path r3 = r0.f20135
            r3.close()
            float r3 = r0.f20134
            float r4 = r0.f20137
            float r4 = r4 + r3
            float r3 = r3 / r4
            android.graphics.Paint r4 = r0.f20131
            android.graphics.RadialGradient r5 = new android.graphics.RadialGradient
            float r6 = r0.f20134
            float r8 = r0.f20137
            float r11 = r6 + r8
            int r6 = r0.f20141
            int r8 = r0.f20142
            int[] r12 = new int[]{r6, r6, r8}
            r6 = 1065353216(0x3f800000, float:1.0)
            float[] r13 = new float[r1]
            r13[r2] = r7
            r7 = 1
            r13[r7] = r3
            r3 = 2
            r13[r3] = r6
            android.graphics.Shader$TileMode r21 = android.graphics.Shader.TileMode.CLAMP
            r9 = 0
            r10 = 0
            r8 = r5
            r14 = r21
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r4.setShader(r5)
            android.graphics.Paint r3 = r0.f20132
            android.graphics.LinearGradient r4 = new android.graphics.LinearGradient
            float r5 = r0.f20134
            float r6 = -r5
            float r7 = r0.f20137
            float r16 = r6 + r7
            float r5 = -r5
            float r18 = r5 - r7
            int r5 = r0.f20141
            int r6 = r0.f20142
            int[] r19 = new int[]{r5, r5, r6}
            float[] r1 = new float[r1]
            r1 = {x00b6: FILL_ARRAY_DATA , data: [0, 1056964608, 1065353216} // fill-array
            r15 = 0
            r17 = 0
            r14 = r4
            r20 = r1
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            r3.setShader(r4)
            android.graphics.Paint r1 = r0.f20132
            r1.setAntiAlias(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m20470(android.graphics.Canvas r13) {
            r12 = this;
            float r0 = r12.f20134
            float r1 = -r0
            float r2 = r12.f20137
            float r1 = r1 - r2
            int r2 = r12.f20129
            float r2 = (float) r2
            float r0 = r0 + r2
            float r2 = r12.f20138
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            float r0 = r0 + r2
            android.graphics.RectF r2 = r12.f20133
            float r2 = r2.width()
            float r9 = r0 * r3
            float r2 = r2 - r9
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r4 = 0
            r5 = 1
            if (r2 <= 0) goto L22
            r2 = r5
            goto L23
        L22:
            r2 = r4
        L23:
            android.graphics.RectF r6 = r12.f20133
            float r6 = r6.height()
            float r6 = r6 - r9
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 <= 0) goto L30
            r10 = r5
            goto L31
        L30:
            r10 = r4
        L31:
            int r11 = r13.save()
            android.graphics.RectF r3 = r12.f20133
            float r4 = r3.left
            float r4 = r4 + r0
            float r3 = r3.top
            float r3 = r3 + r0
            r13.translate(r4, r3)
            android.graphics.Path r3 = r12.f20135
            android.graphics.Paint r4 = r12.f20131
            r13.drawPath(r3, r4)
            if (r2 == 0) goto L5c
            android.graphics.RectF r3 = r12.f20133
            float r3 = r3.width()
            float r6 = r3 - r9
            float r3 = r12.f20134
            float r7 = -r3
            android.graphics.Paint r8 = r12.f20132
            r4 = 0
            r3 = r13
            r5 = r1
            r3.drawRect(r4, r5, r6, r7, r8)
        L5c:
            r13.restoreToCount(r11)
            int r11 = r13.save()
            android.graphics.RectF r3 = r12.f20133
            float r4 = r3.right
            float r4 = r4 - r0
            float r3 = r3.bottom
            float r3 = r3 - r0
            r13.translate(r4, r3)
            r3 = 1127481344(0x43340000, float:180.0)
            r13.rotate(r3)
            android.graphics.Path r3 = r12.f20135
            android.graphics.Paint r4 = r12.f20131
            r13.drawPath(r3, r4)
            if (r2 == 0) goto L93
            android.graphics.RectF r2 = r12.f20133
            float r2 = r2.width()
            float r6 = r2 - r9
            float r2 = r12.f20134
            float r2 = -r2
            float r3 = r12.f20137
            float r7 = r2 + r3
            android.graphics.Paint r8 = r12.f20132
            r4 = 0
            r3 = r13
            r5 = r1
            r3.drawRect(r4, r5, r6, r7, r8)
        L93:
            r13.restoreToCount(r11)
            int r2 = r13.save()
            android.graphics.RectF r3 = r12.f20133
            float r4 = r3.left
            float r4 = r4 + r0
            float r3 = r3.bottom
            float r3 = r3 - r0
            r13.translate(r4, r3)
            r3 = 1132920832(0x43870000, float:270.0)
            r13.rotate(r3)
            android.graphics.Path r3 = r12.f20135
            android.graphics.Paint r4 = r12.f20131
            r13.drawPath(r3, r4)
            if (r10 == 0) goto Lc6
            android.graphics.RectF r3 = r12.f20133
            float r3 = r3.height()
            float r6 = r3 - r9
            float r3 = r12.f20134
            float r7 = -r3
            android.graphics.Paint r8 = r12.f20132
            r4 = 0
            r3 = r13
            r5 = r1
            r3.drawRect(r4, r5, r6, r7, r8)
        Lc6:
            r13.restoreToCount(r2)
            int r2 = r13.save()
            android.graphics.RectF r3 = r12.f20133
            float r4 = r3.right
            float r4 = r4 - r0
            float r3 = r3.top
            float r3 = r3 + r0
            r13.translate(r4, r3)
            r0 = 1119092736(0x42b40000, float:90.0)
            r13.rotate(r0)
            android.graphics.Path r0 = r12.f20135
            android.graphics.Paint r3 = r12.f20131
            r13.drawPath(r0, r3)
            if (r10 == 0) goto Lf9
            android.graphics.RectF r0 = r12.f20133
            float r0 = r0.height()
            float r6 = r0 - r9
            float r0 = r12.f20134
            float r7 = -r0
            android.graphics.Paint r8 = r12.f20132
            r4 = 0
            r3 = r13
            r5 = r1
            r3.drawRect(r4, r5, r6, r7, r8)
        Lf9:
            r13.restoreToCount(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public android.content.res.ColorStateList m20471() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f20139
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public float m20472() {
            r1 = this;
            float r0 = r1.f20134
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m20473(android.graphics.Rect r1) {
            r0 = this;
            r0.getPadding(r1)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public float m20474() {
            r1 = this;
            float r0 = r1.f20136
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public float m20475() {
            r5 = this;
            float r0 = r5.f20136
            float r1 = r5.f20134
            int r2 = r5.f20129
            float r2 = (float) r2
            float r1 = r1 + r2
            r2 = 1069547520(0x3fc00000, float:1.5)
            float r3 = r0 * r2
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            float r1 = r1 + r3
            float r0 = java.lang.Math.max(r0, r1)
            float r0 = r0 * r4
            float r1 = r5.f20136
            float r1 = r1 * r2
            int r2 = r5.f20129
            float r2 = (float) r2
            float r1 = r1 + r2
            float r1 = r1 * r4
            float r0 = r0 + r1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public float m20476() {
            r4 = this;
            float r0 = r4.f20136
            float r1 = r4.f20134
            int r2 = r4.f20129
            float r2 = (float) r2
            float r1 = r1 + r2
            r2 = 1073741824(0x40000000, float:2.0)
            float r3 = r0 / r2
            float r1 = r1 + r3
            float r0 = java.lang.Math.max(r0, r1)
            float r0 = r0 * r2
            float r1 = r4.f20136
            int r3 = r4.f20129
            float r3 = (float) r3
            float r1 = r1 + r3
            float r1 = r1 * r2
            float r0 = r0 + r1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public float m20477() {
            r1 = this;
            float r0 = r1.f20138
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m20478(boolean r1) {
            r0 = this;
            r0.f20143 = r1
            r0.invalidateSelf()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m20479(android.content.res.ColorStateList r4) {
            r3 = this;
            if (r4 != 0) goto L7
            r4 = 0
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r4)
        L7:
            r3.f20139 = r4
            android.graphics.Paint r0 = r3.f20130
            int[] r1 = r3.getState()
            android.content.res.ColorStateList r2 = r3.f20139
            int r2 = r2.getDefaultColor()
            int r4 = r4.getColorForState(r1, r2)
            r0.setColor(r4)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m20480(@Yue.InterfaceC4544 android.content.res.ColorStateList r1) {
            r0 = this;
            r0.m20479(r1)
            r0.invalidateSelf()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m20481(float r4) {
            r3 = this;
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L1a
            r0 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r0
            int r4 = (int) r4
            float r4 = (float) r4
            float r0 = r3.f20134
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L11
            return
        L11:
            r3.f20134 = r4
            r4 = 1
            r3.f20140 = r4
            r3.invalidateSelf()
            return
        L1a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid radius "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ". Must be >= 0"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m20482(float r2) {
            r1 = this;
            float r0 = r1.f20138
            r1.m20484(r0, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m20483(float r2) {
            r1 = this;
            float r0 = r1.f20136
            r1.m20484(r2, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final void m20484(float r4, float r5) {
            r3 = this;
            r0 = 0
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            java.lang.String r2 = ". Must be >= 0"
            if (r1 < 0) goto L60
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L46
            int r4 = r3.m20485(r4)
            float r4 = (float) r4
            int r5 = r3.m20485(r5)
            float r5 = (float) r5
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L21
            boolean r4 = r3.f20144
            if (r4 != 0) goto L20
            r3.f20144 = r1
        L20:
            r4 = r5
        L21:
            float r0 = r3.f20138
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L2e
            float r0 = r3.f20136
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto L2e
            return
        L2e:
            r3.f20138 = r4
            r3.f20136 = r5
            r5 = 1069547520(0x3fc00000, float:1.5)
            float r4 = r4 * r5
            int r5 = r3.f20129
            float r5 = (float) r5
            float r4 = r4 + r5
            r5 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r5
            int r4 = (int) r4
            float r4 = (float) r4
            r3.f20137 = r4
            r3.f20140 = r1
            r3.invalidateSelf()
            return
        L46:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid max shadow size "
            r0.append(r1)
            r0.append(r5)
            r0.append(r2)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
        L60:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid shadow size "
            r0.append(r1)
            r0.append(r4)
            r0.append(r2)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final int m20485(float r3) {
            r2 = this;
            r0 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r0
            int r3 = (int) r3
            int r0 = r3 % 2
            r1 = 1
            if (r0 != r1) goto La
            int r3 = r3 - r1
        La:
            return r3
    }
}
