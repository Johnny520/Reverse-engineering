package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۡۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4289 extends Yue.C4227 {

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final java.lang.String f13556 = "MotionTelltales";

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public android.graphics.Paint f13557;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public Yue.C4273 f13558;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public float[] f13559;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public android.graphics.Matrix f13560;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public int f13561;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public int f13562;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public float f13563;

    public C4289(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r1.f13557 = r0
            r0 = 2
            float[] r0 = new float[r0]
            r1.f13559 = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1.f13560 = r0
            r0 = 0
            r1.f13561 = r0
            r0 = -65281(0xffffffffffff00ff, float:NaN)
            r1.f13562 = r0
            r0 = 1048576000(0x3e800000, float:0.25)
            r1.f13563 = r0
            r0 = 0
            r1.m16864(r2, r0)
            return
    }

    public C4289(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r1.f13557 = r0
            r0 = 2
            float[] r0 = new float[r0]
            r1.f13559 = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1.f13560 = r0
            r0 = 0
            r1.f13561 = r0
            r0 = -65281(0xffffffffffff00ff, float:NaN)
            r1.f13562 = r0
            r0 = 1048576000(0x3e800000, float:0.25)
            r1.f13563 = r0
            r1.m16864(r2, r3)
            return
    }

    public C4289(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>()
            r0.f13557 = r3
            r3 = 2
            float[] r3 = new float[r3]
            r0.f13559 = r3
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            r0.f13560 = r3
            r3 = 0
            r0.f13561 = r3
            r3 = -65281(0xffffffffffff00ff, float:NaN)
            r0.f13562 = r3
            r3 = 1048576000(0x3e800000, float:0.25)
            r0.f13563 = r3
            r0.m16864(r1, r2)
            return
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            return
    }

    @Override // Yue.C4227, android.view.View
    public void onDraw(android.graphics.Canvas r24) {
            r23 = this;
            r6 = r23
            r7 = 5
            r8 = 1
            super.onDraw(r24)
            android.graphics.Matrix r0 = r23.getMatrix()
            android.graphics.Matrix r1 = r6.f13560
            r0.invert(r1)
            Yue.ۥۡۡۥۣ r0 = r6.f13558
            if (r0 != 0) goto L21
            android.view.ViewParent r0 = r23.getParent()
            boolean r1 = r0 instanceof Yue.C4273
            if (r1 == 0) goto L20
            Yue.ۥۡۡۥۣ r0 = (Yue.C4273) r0
            r6.f13558 = r0
        L20:
            return
        L21:
            int r9 = r23.getWidth()
            int r10 = r23.getHeight()
            float[] r11 = new float[r7]
            r11 = {x0076: FILL_ARRAY_DATA , data: [1036831949, 1048576000, 1056964608, 1061158912, 1063675494} // fill-array
            r12 = 0
            r13 = r12
        L30:
            if (r13 >= r7) goto L74
            r14 = r11[r13]
            r15 = r12
        L35:
            if (r15 >= r7) goto L72
            r16 = r11[r15]
            Yue.ۥۡۡۥۣ r0 = r6.f13558
            float[] r4 = r6.f13559
            int r5 = r6.f13561
            r1 = r23
            r2 = r16
            r3 = r14
            r0.m16680(r1, r2, r3, r4, r5)
            android.graphics.Matrix r0 = r6.f13560
            float[] r1 = r6.f13559
            r0.mapVectors(r1)
            float r0 = (float) r9
            float r18 = r0 * r16
            float r0 = (float) r10
            float r19 = r0 * r14
            float[] r0 = r6.f13559
            r1 = r0[r12]
            float r2 = r6.f13563
            float r1 = r1 * r2
            float r20 = r18 - r1
            r1 = r0[r8]
            float r1 = r1 * r2
            float r21 = r19 - r1
            android.graphics.Matrix r1 = r6.f13560
            r1.mapVectors(r0)
            android.graphics.Paint r0 = r6.f13557
            r17 = r24
            r22 = r0
            r17.drawLine(r18, r19, r20, r21, r22)
            int r15 = r15 + r8
            goto L35
        L72:
            int r13 = r13 + r8
            goto L30
        L74:
            return
    }

    @Override // android.view.View
    public void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            r0.postInvalidate()
            return
    }

    public void setText(java.lang.CharSequence r1) {
            r0 = this;
            java.lang.String r1 = r1.toString()
            r0.f13084 = r1
            r0.requestLayout()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m16864(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            if (r5 == 0) goto L3f
            int[] r0 = androidx.constraintlayout.widget.C7473.C7486.f28728
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r0)
            int r5 = r4.getIndexCount()
            r0 = 0
        Ld:
            if (r0 >= r5) goto L3c
            int r1 = r4.getIndex(r0)
            int r2 = androidx.constraintlayout.widget.C7473.C7486.f28729
            if (r1 != r2) goto L20
            int r2 = r3.f13562
            int r1 = r4.getColor(r1, r2)
            r3.f13562 = r1
            goto L39
        L20:
            int r2 = androidx.constraintlayout.widget.C7473.C7486.f28731
            if (r1 != r2) goto L2d
            int r2 = r3.f13561
            int r1 = r4.getInt(r1, r2)
            r3.f13561 = r1
            goto L39
        L2d:
            int r2 = androidx.constraintlayout.widget.C7473.C7486.f28730
            if (r1 != r2) goto L39
            float r2 = r3.f13563
            float r1 = r4.getFloat(r1, r2)
            r3.f13563 = r1
        L39:
            int r0 = r0 + 1
            goto Ld
        L3c:
            r4.recycle()
        L3f:
            android.graphics.Paint r4 = r3.f13557
            int r5 = r3.f13562
            r4.setColor(r5)
            android.graphics.Paint r4 = r3.f13557
            r5 = 1084227584(0x40a00000, float:5.0)
            r4.setStrokeWidth(r5)
            return
    }
}
