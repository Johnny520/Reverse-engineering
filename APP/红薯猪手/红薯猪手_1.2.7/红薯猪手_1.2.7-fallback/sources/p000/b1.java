package p000;

/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public int f132;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int f133;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final android.view.ScaleGestureDetector f134;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public android.view.VelocityTracker f135;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public boolean f136;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public float f137;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public float f138;

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public final float f139;

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public final float f140;

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public p000.y6 f141;

    public class a implements android.view.ScaleGestureDetector.OnScaleGestureListener {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ p000.b1 f142;

        public a(p000.b1 r1) {
                r0 = this;
                r0.f142 = r1
                r0.<init>()
                return
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScale(android.view.ScaleGestureDetector r4) {
                r3 = this;
                float r0 = r4.getScaleFactor()
                boolean r1 = java.lang.Float.isNaN(r0)
                if (r1 != 0) goto L29
                boolean r1 = java.lang.Float.isInfinite(r0)
                if (r1 == 0) goto L11
                goto L29
            L11:
                r1 = 0
                int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r1 < 0) goto L27
                ۟.b1 r1 = r3.f142
                ۟.y6 r1 = r1.f141
                float r2 = r4.getFocusX()
                float r4 = r4.getFocusY()
                ۟.s7$a r1 = (۟.s7.a) r1
                r1.m405(r0, r2, r4)
            L27:
                r4 = 1
                return r4
            L29:
                r4 = 0
                return r4
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScaleBegin(android.view.ScaleGestureDetector r1) {
                r0 = this;
                r1 = 1
                return r1
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final void onScaleEnd(android.view.ScaleGestureDetector r1) {
                r0 = this;
                return
        }
    }

    public b1(android.content.Context r3, p000.y6 r4) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.f132 = r0
            r0 = 0
            r2.f133 = r0
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r3)
            int r1 = r0.getScaledMinimumFlingVelocity()
            float r1 = (float) r1
            r2.f140 = r1
            int r0 = r0.getScaledTouchSlop()
            float r0 = (float) r0
            r2.f139 = r0
            r2.f141 = r4
            ۟.b1$a r4 = new ۟.b1$a
            r4.<init>(r2)
            android.view.ScaleGestureDetector r0 = new android.view.ScaleGestureDetector
            r0.<init>(r3, r4)
            r2.f134 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m59(android.view.MotionEvent r24) {
            r23 = this;
            r0 = r23
            r1 = r24
            int r2 = r24.getAction()
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = -1
            r4 = 0
            if (r2 == 0) goto L201
            r5 = 0
            r6 = 1
            if (r2 == r6) goto L105
            r7 = 2
            if (r2 == r7) goto L4f
            r7 = 3
            if (r2 == r7) goto L47
            r5 = 6
            if (r2 == r5) goto L1d
            goto L22e
        L1d:
            int r2 = r24.getAction()
            r5 = 65280(0xff00, float:9.1477E-41)
            r2 = r2 & r5
            int r2 = r2 >> 8
            int r5 = r1.getPointerId(r2)
            int r7 = r0.f132
            if (r5 != r7) goto L22e
            if (r2 != 0) goto L32
            goto L33
        L32:
            r6 = r4
        L33:
            int r2 = r1.getPointerId(r6)
            r0.f132 = r2
            float r2 = r1.getX(r6)
            r0.f137 = r2
            float r2 = r1.getY(r6)
            r0.f138 = r2
            goto L22e
        L47:
            r0.f132 = r3
            android.view.VelocityTracker r2 = r0.f135
            if (r2 == 0) goto L22e
            goto L1fb
        L4f:
            int r2 = r0.f133     // Catch: java.lang.Exception -> L56
            float r2 = r1.getX(r2)     // Catch: java.lang.Exception -> L56
            goto L5a
        L56:
            float r2 = r24.getX()
        L5a:
            int r5 = r0.f133     // Catch: java.lang.Exception -> L61
            float r5 = r1.getY(r5)     // Catch: java.lang.Exception -> L61
            goto L65
        L61:
            float r5 = r24.getY()
        L65:
            float r8 = r0.f137
            float r8 = r2 - r8
            float r9 = r0.f138
            float r9 = r5 - r9
            boolean r10 = r0.f136
            if (r10 != 0) goto L87
            float r10 = r8 * r8
            float r11 = r9 * r9
            float r11 = r11 + r10
            double r10 = (double) r11
            double r10 = java.lang.Math.sqrt(r10)
            float r12 = r0.f139
            double r12 = (double) r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 < 0) goto L84
            r10 = r6
            goto L85
        L84:
            r10 = r4
        L85:
            r0.f136 = r10
        L87:
            boolean r10 = r0.f136
            if (r10 == 0) goto L22e
            ۟.y6 r10 = r0.f141
            ۟.s7$a r10 = (۟.s7.a) r10
            ۟.s7 r11 = r10.f999
            ۟.b1 r11 = r11.f984
            android.view.ScaleGestureDetector r11 = r11.f134
            boolean r11 = r11.isInProgress()
            if (r11 == 0) goto L9c
            goto Lf8
        L9c:
            ۟.s7 r11 = r10.f999
            r11.getClass()
            ۟.s7 r11 = r10.f999
            android.graphics.Matrix r11 = r11.f987
            r11.postTranslate(r8, r9)
            ۟.s7 r11 = r10.f999
            r11.m396()
            ۟.s7 r11 = r10.f999
            android.widget.ImageView r11 = r11.f982
            android.view.ViewParent r11 = r11.getParent()
            ۟.s7 r12 = r10.f999
            boolean r13 = r12.f980
            if (r13 == 0) goto Lf3
            ۟.b1 r12 = r12.f984
            android.view.ScaleGestureDetector r12 = r12.f134
            boolean r12 = r12.isInProgress()
            if (r12 != 0) goto Lf3
            ۟.s7 r10 = r10.f999
            boolean r12 = r10.f981
            if (r12 != 0) goto Lf3
            int r12 = r10.f994
            if (r12 == r7) goto Led
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r12 != 0) goto Ld7
            int r13 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r13 >= 0) goto Led
        Ld7:
            r13 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r12 != r6) goto Ldf
            int r8 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r8 <= 0) goto Led
        Ldf:
            int r8 = r10.f995
            if (r8 != 0) goto Le7
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 >= 0) goto Led
        Le7:
            if (r8 != r6) goto Lf8
            int r6 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r6 > 0) goto Lf8
        Led:
            if (r11 == 0) goto Lf8
            r11.requestDisallowInterceptTouchEvent(r4)
            goto Lf8
        Lf3:
            if (r11 == 0) goto Lf8
            r11.requestDisallowInterceptTouchEvent(r6)
        Lf8:
            r0.f137 = r2
            r0.f138 = r5
            android.view.VelocityTracker r2 = r0.f135
            if (r2 == 0) goto L22e
            r2.addMovement(r1)
            goto L22e
        L105:
            r0.f132 = r3
            boolean r2 = r0.f136
            if (r2 == 0) goto L1f7
            android.view.VelocityTracker r2 = r0.f135
            if (r2 == 0) goto L1f7
            int r2 = r0.f133     // Catch: java.lang.Exception -> L116
            float r2 = r1.getX(r2)     // Catch: java.lang.Exception -> L116
            goto L11a
        L116:
            float r2 = r24.getX()
        L11a:
            r0.f137 = r2
            int r2 = r0.f133     // Catch: java.lang.Exception -> L123
            float r2 = r1.getY(r2)     // Catch: java.lang.Exception -> L123
            goto L127
        L123:
            float r2 = r24.getY()
        L127:
            r0.f138 = r2
            android.view.VelocityTracker r2 = r0.f135
            r2.addMovement(r1)
            android.view.VelocityTracker r2 = r0.f135
            r6 = 1000(0x3e8, float:1.401E-42)
            r2.computeCurrentVelocity(r6)
            android.view.VelocityTracker r2 = r0.f135
            float r2 = r2.getXVelocity()
            android.view.VelocityTracker r6 = r0.f135
            float r6 = r6.getYVelocity()
            float r7 = java.lang.Math.abs(r2)
            float r8 = java.lang.Math.abs(r6)
            float r7 = java.lang.Math.max(r7, r8)
            float r8 = r0.f140
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 < 0) goto L1f7
            ۟.y6 r7 = r0.f141
            float r2 = -r2
            float r6 = -r6
            ۟.s7$a r7 = (۟.s7.a) r7
            ۟.s7 r8 = r7.f999
            ۟.s7$f r9 = new ۟.s7$f
            android.widget.ImageView r10 = r8.f982
            android.content.Context r10 = r10.getContext()
            r9.<init>(r8, r10)
            r8.f993 = r9
            ۟.s7 r8 = r7.f999
            ۟.s7$f r9 = r8.f993
            android.widget.ImageView r8 = r8.f982
            int r10 = r8.getWidth()
            int r11 = r8.getPaddingLeft()
            int r10 = r10 - r11
            int r8 = r8.getPaddingRight()
            int r10 = r10 - r8
            ۟.s7 r8 = r7.f999
            android.widget.ImageView r8 = r8.f982
            int r11 = r8.getHeight()
            int r12 = r8.getPaddingTop()
            int r11 = r11 - r12
            int r8 = r8.getPaddingBottom()
            int r11 = r11 - r8
            int r15 = (int) r2
            int r2 = (int) r6
            ۟.s7 r6 = r9.f1012
            android.graphics.RectF r6 = r6.m398()
            if (r6 != 0) goto L199
            goto L1ee
        L199:
            float r8 = r6.left
            float r8 = -r8
            int r13 = java.lang.Math.round(r8)
            float r8 = (float) r10
            float r10 = r6.width()
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 >= 0) goto L1b5
            float r10 = r6.width()
            float r10 = r10 - r8
            int r8 = java.lang.Math.round(r10)
            r17 = r4
            goto L1b8
        L1b5:
            r8 = r13
            r17 = r8
        L1b8:
            float r10 = r6.top
            float r10 = -r10
            int r14 = java.lang.Math.round(r10)
            float r10 = (float) r11
            float r11 = r6.height()
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 >= 0) goto L1d4
            float r6 = r6.height()
            float r6 = r6 - r10
            int r6 = java.lang.Math.round(r6)
            r19 = r4
            goto L1d7
        L1d4:
            r6 = r14
            r19 = r6
        L1d7:
            r9.f1010 = r13
            r9.f1011 = r14
            if (r13 != r8) goto L1df
            if (r14 == r6) goto L1ee
        L1df:
            android.widget.OverScroller r12 = r9.f1009
            r21 = 0
            r22 = 0
            r16 = r2
            r18 = r8
            r20 = r6
            r12.fling(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
        L1ee:
            ۟.s7 r2 = r7.f999
            android.widget.ImageView r6 = r2.f982
            ۟.s7$f r2 = r2.f993
            r6.post(r2)
        L1f7:
            android.view.VelocityTracker r2 = r0.f135
            if (r2 == 0) goto L22e
        L1fb:
            r2.recycle()
            r0.f135 = r5
            goto L22e
        L201:
            int r2 = r1.getPointerId(r4)
            r0.f132 = r2
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r0.f135 = r2
            if (r2 == 0) goto L212
            r2.addMovement(r1)
        L212:
            int r2 = r0.f133     // Catch: java.lang.Exception -> L219
            float r2 = r1.getX(r2)     // Catch: java.lang.Exception -> L219
            goto L21d
        L219:
            float r2 = r24.getX()
        L21d:
            r0.f137 = r2
            int r2 = r0.f133     // Catch: java.lang.Exception -> L226
            float r2 = r1.getY(r2)     // Catch: java.lang.Exception -> L226
            goto L22a
        L226:
            float r2 = r24.getY()
        L22a:
            r0.f138 = r2
            r0.f136 = r4
        L22e:
            int r2 = r0.f132
            if (r2 == r3) goto L233
            r4 = r2
        L233:
            int r1 = r1.findPointerIndex(r4)
            r0.f133 = r1
            return
    }
}
