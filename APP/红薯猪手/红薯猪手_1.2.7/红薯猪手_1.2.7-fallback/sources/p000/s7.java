package p000;

/* JADX INFO: loaded from: classes.dex */
public final class s7 implements android.view.View.OnTouchListener, android.view.View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public android.view.animation.AccelerateDecelerateInterpolator f975;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int f976;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public float f977;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public float f978;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public float f979;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public boolean f980;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public boolean f981;

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public android.widget.ImageView f982;

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public android.view.GestureDetector f983;

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public p000.b1 f984;

    /* JADX INFO: renamed from: ۥ۟ۧ, reason: contains not printable characters */
    public final android.graphics.Matrix f985;

    /* JADX INFO: renamed from: ۥ۟ۨ, reason: contains not printable characters */
    public final android.graphics.Matrix f986;

    /* JADX INFO: renamed from: ۥ۠, reason: contains not printable characters */
    public final android.graphics.Matrix f987;

    /* JADX INFO: renamed from: ۥ۠۟, reason: contains not printable characters */
    public final android.graphics.RectF f988;

    /* JADX INFO: renamed from: ۥ۠۠, reason: contains not printable characters */
    public final float[] f989;

    /* JADX INFO: renamed from: ۥ۠ۡ, reason: contains not printable characters */
    public p000.f7 f990;

    /* JADX INFO: renamed from: ۥ۠ۢ, reason: contains not printable characters */
    public android.view.View.OnClickListener f991;

    /* JADX INFO: renamed from: ۥۣ۠, reason: contains not printable characters */
    public android.view.View.OnLongClickListener f992;

    /* JADX INFO: renamed from: ۥ۠ۤ, reason: contains not printable characters */
    public ۟.s7.f f993;

    /* JADX INFO: renamed from: ۥ۠ۥ, reason: contains not printable characters */
    public int f994;

    /* JADX INFO: renamed from: ۥ۠ۦ, reason: contains not printable characters */
    public int f995;

    /* JADX INFO: renamed from: ۥ۠ۧ, reason: contains not printable characters */
    public boolean f996;

    /* JADX INFO: renamed from: ۥ۠ۨ, reason: contains not printable characters */
    public android.widget.ImageView.ScaleType f997;

    /* JADX INFO: renamed from: ۥۡ, reason: contains not printable characters */
    public ۟.s7.a f998;

    public class a implements p000.y6 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ p000.s7 f999;

        public a(p000.s7 r1) {
                r0 = this;
                r0.f999 = r1
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final void m405(float r4, float r5, float r6) {
                r3 = this;
                ۟.s7 r0 = r3.f999
                float r0 = r0.m401()
                ۟.s7 r1 = r3.f999
                float r2 = r1.f979
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 < 0) goto L14
                r0 = 1065353216(0x3f800000, float:1.0)
                int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r0 >= 0) goto L23
            L14:
                r1.getClass()
                ۟.s7 r0 = r3.f999
                android.graphics.Matrix r0 = r0.f987
                r0.postScale(r4, r4, r5, r6)
                ۟.s7 r4 = r3.f999
                r4.m396()
            L23:
                return
        }
    }

    public class b extends android.view.GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ p000.s7 f1000;

        public b(p000.s7 r1) {
                r0 = this;
                r0.f1000 = r1
                r0.<init>()
                return
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onFling(android.view.MotionEvent r1, android.view.MotionEvent r2, float r3, float r4) {
                r0 = this;
                ۟.s7 r1 = r0.f1000
                r1.getClass()
                r1 = 0
                return r1
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(android.view.MotionEvent r2) {
                r1 = this;
                ۟.s7 r2 = r1.f1000
                android.view.View$OnLongClickListener r0 = r2.f992
                if (r0 == 0) goto Lb
                android.widget.ImageView r2 = r2.f982
                r0.onLongClick(r2)
            Lb:
                return
        }
    }

    public class c implements android.view.GestureDetector.OnDoubleTapListener {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ p000.s7 f1001;

        public c(p000.s7 r1) {
                r0 = this;
                r0.f1001 = r1
                r0.<init>()
                return
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(android.view.MotionEvent r7) {
                r6 = this;
                r0 = 1
                ۟.s7 r1 = r6.f1001     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2b
                float r1 = r1.m401()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2b
                float r2 = r7.getX()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2b
                float r7 = r7.getY()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2b
                ۟.s7 r3 = r6.f1001     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2b
                float r4 = r3.f978     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2b
                int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r5 >= 0) goto L1b
            L17:
                r3.m402(r4, r2, r7, r0)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2b
                goto L2b
            L1b:
                int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r4 < 0) goto L26
                float r4 = r3.f979     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2b
                int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r1 >= 0) goto L26
                goto L17
            L26:
                float r1 = r3.f977     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2b
                r3.m402(r1, r2, r7, r0)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2b
            L2b:
                return r0
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTapEvent(android.view.MotionEvent r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onSingleTapConfirmed(android.view.MotionEvent r7) {
                r6 = this;
                ۟.s7 r0 = r6.f1001
                android.view.View$OnClickListener r1 = r0.f991
                if (r1 == 0) goto Lb
                android.widget.ImageView r0 = r0.f982
                r1.onClick(r0)
            Lb:
                ۟.s7 r0 = r6.f1001
                android.graphics.RectF r0 = r0.m398()
                float r1 = r7.getX()
                float r7 = r7.getY()
                ۟.s7 r2 = r6.f1001
                ۟.f7 r3 = r2.f990
                if (r3 == 0) goto L3e
                android.widget.ImageView r2 = r2.f982
                ۟.w r3 = (p000.w) r3
                java.lang.Object r3 = r3.f1115
                ۟.t7$a r3 = (۟.t7.a) r3
                r4 = 6
                byte[] r5 = new byte[r4]
                r5 = {x005a: FILL_ARRAY_DATA , data: [42, -25, 38, 66, 92, 25} // fill-array
                byte[] r4 = new byte[r4]
                r4 = {x0062: FILL_ARRAY_DATA , data: [94, -113, 79, 49, 120, 41} // fill-array
                java.lang.String r4 = p000.oa.m332(r5, r4)
                p000.h4.m189(r4, r3)
                android.view.View$OnClickListener r3 = r3.f1048
                r3.onClick(r2)
            L3e:
                if (r0 == 0) goto L58
                boolean r7 = r0.contains(r1, r7)
                if (r7 == 0) goto L53
                r0.width()
                r0.height()
                ۟.s7 r7 = r6.f1001
                r7.getClass()
                r7 = 1
                return r7
            L53:
                ۟.s7 r7 = r6.f1001
                r7.getClass()
            L58:
                r7 = 0
                return r7
        }
    }

    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final /* synthetic */ int[] f1002 = null;

        static {
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ۟.s7.d.f1002 = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = ۟.s7.d.f1002     // Catch: java.lang.NoSuchFieldError -> L1d
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = ۟.s7.d.f1002     // Catch: java.lang.NoSuchFieldError -> L28
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = ۟.s7.d.f1002     // Catch: java.lang.NoSuchFieldError -> L33
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    public class e implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final float f1003;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final float f1004;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final long f1005;

        /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
        public final float f1006;

        /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
        public final float f1007;

        /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
        public final /* synthetic */ p000.s7 f1008;

        public e(p000.s7 r1, float r2, float r3, float r4, float r5) {
                r0 = this;
                r0.f1008 = r1
                r0.<init>()
                r0.f1003 = r4
                r0.f1004 = r5
                long r4 = java.lang.System.currentTimeMillis()
                r0.f1005 = r4
                r0.f1006 = r2
                r0.f1007 = r3
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r6 = this;
                long r0 = java.lang.System.currentTimeMillis()
                long r2 = r6.f1005
                long r0 = r0 - r2
                float r0 = (float) r0
                r1 = 1065353216(0x3f800000, float:1.0)
                float r0 = r0 * r1
                ۟.s7 r2 = r6.f1008
                int r2 = r2.f976
                float r2 = (float) r2
                float r0 = r0 / r2
                float r0 = java.lang.Math.min(r1, r0)
                ۟.s7 r2 = r6.f1008
                android.view.animation.AccelerateDecelerateInterpolator r2 = r2.f975
                float r0 = r2.getInterpolation(r0)
                float r2 = r6.f1006
                float r3 = r6.f1007
                float r3 = r3 - r2
                float r3 = r3 * r0
                float r3 = r3 + r2
                ۟.s7 r2 = r6.f1008
                float r2 = r2.m401()
                float r3 = r3 / r2
                ۟.s7 r2 = r6.f1008
                ۟.s7$a r2 = r2.f998
                float r4 = r6.f1003
                float r5 = r6.f1004
                r2.m405(r3, r4, r5)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 >= 0) goto L41
                ۟.s7 r0 = r6.f1008
                android.widget.ImageView r0 = r0.f982
                r0.postOnAnimation(r6)
            L41:
                return
        }
    }

    public class f implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.widget.OverScroller f1009;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int f1010;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f1011;

        /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
        public final /* synthetic */ p000.s7 f1012;

        public f(p000.s7 r1, android.content.Context r2) {
                r0 = this;
                r0.f1012 = r1
                r0.<init>()
                android.widget.OverScroller r1 = new android.widget.OverScroller
                r1.<init>(r2)
                r0.f1009 = r1
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r5 = this;
                android.widget.OverScroller r0 = r5.f1009
                boolean r0 = r0.isFinished()
                if (r0 == 0) goto L9
                return
            L9:
                android.widget.OverScroller r0 = r5.f1009
                boolean r0 = r0.computeScrollOffset()
                if (r0 == 0) goto L3c
                android.widget.OverScroller r0 = r5.f1009
                int r0 = r0.getCurrX()
                android.widget.OverScroller r1 = r5.f1009
                int r1 = r1.getCurrY()
                ۟.s7 r2 = r5.f1012
                android.graphics.Matrix r2 = r2.f987
                int r3 = r5.f1010
                int r3 = r3 - r0
                float r3 = (float) r3
                int r4 = r5.f1011
                int r4 = r4 - r1
                float r4 = (float) r4
                r2.postTranslate(r3, r4)
                ۟.s7 r2 = r5.f1012
                r2.m396()
                r5.f1010 = r0
                r5.f1011 = r1
                ۟.s7 r0 = r5.f1012
                android.widget.ImageView r0 = r0.f982
                r0.postOnAnimation(r5)
            L3c:
                return
        }
    }

    public s7(android.widget.ImageView r4) {
            r3 = this;
            r3.<init>()
            android.view.animation.AccelerateDecelerateInterpolator r0 = new android.view.animation.AccelerateDecelerateInterpolator
            r0.<init>()
            r3.f975 = r0
            r0 = 200(0xc8, float:2.8E-43)
            r3.f976 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.f977 = r0
            r0 = 1071644672(0x3fe00000, float:1.75)
            r3.f978 = r0
            r0 = 1077936128(0x40400000, float:3.0)
            r3.f979 = r0
            r0 = 1
            r3.f980 = r0
            r1 = 0
            r3.f981 = r1
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r3.f985 = r1
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r3.f986 = r1
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r3.f987 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r3.f988 = r1
            r1 = 9
            float[] r1 = new float[r1]
            r3.f989 = r1
            r1 = 2
            r3.f994 = r1
            r3.f995 = r1
            r3.f996 = r0
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            r3.f997 = r0
            ۟.s7$a r0 = new ۟.s7$a
            r0.<init>(r3)
            r3.f998 = r0
            r3.f982 = r4
            r4.setOnTouchListener(r3)
            r4.addOnLayoutChangeListener(r3)
            boolean r0 = r4.isInEditMode()
            if (r0 == 0) goto L63
            return
        L63:
            ۟.b1 r0 = new ۟.b1
            android.content.Context r1 = r4.getContext()
            ۟.s7$a r2 = r3.f998
            r0.<init>(r1, r2)
            r3.f984 = r0
            android.view.GestureDetector r0 = new android.view.GestureDetector
            android.content.Context r4 = r4.getContext()
            ۟.s7$b r1 = new ۟.s7$b
            r1.<init>(r3)
            r0.<init>(r4, r1)
            r3.f983 = r0
            ۟.s7$c r4 = new ۟.s7$c
            r4.<init>(r3)
            r0.setOnDoubleTapListener(r4)
            return
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            r0 = this;
            if (r2 != r6) goto L8
            if (r3 != r7) goto L8
            if (r4 != r8) goto L8
            if (r5 == r9) goto L11
        L8:
            android.widget.ImageView r1 = r0.f982
            android.graphics.drawable.Drawable r1 = r1.getDrawable()
            r0.m404(r1)
        L11:
            return
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
            r10 = this;
            boolean r0 = r10.f996
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lcb
            r0 = r11
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto L11
            r0 = r2
            goto L12
        L11:
            r0 = r1
        L12:
            if (r0 == 0) goto Lcb
            int r0 = r12.getAction()
            if (r0 == 0) goto L70
            if (r0 == r2) goto L20
            r3 = 3
            if (r0 == r3) goto L20
            goto L85
        L20:
            float r0 = r10.m401()
            float r3 = r10.f977
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L46
            android.graphics.RectF r0 = r10.m398()
            if (r0 == 0) goto L85
            ۟.s7$e r9 = new ۟.s7$e
            float r5 = r10.m401()
            float r6 = r10.f977
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            r3 = r9
            r4 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            goto L6b
        L46:
            float r0 = r10.m401()
            float r3 = r10.f979
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L85
            android.graphics.RectF r0 = r10.m398()
            if (r0 == 0) goto L85
            ۟.s7$e r9 = new ۟.s7$e
            float r5 = r10.m401()
            float r6 = r10.f979
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            r3 = r9
            r4 = r10
            r3.<init>(r4, r5, r6, r7, r8)
        L6b:
            r11.post(r9)
            r11 = r2
            goto L86
        L70:
            android.view.ViewParent r11 = r11.getParent()
            if (r11 == 0) goto L79
            r11.requestDisallowInterceptTouchEvent(r2)
        L79:
            ۟.s7$f r11 = r10.f993
            if (r11 == 0) goto L85
            android.widget.OverScroller r11 = r11.f1009
            r11.forceFinished(r2)
            r11 = 0
            r10.f993 = r11
        L85:
            r11 = r1
        L86:
            ۟.b1 r0 = r10.f984
            if (r0 == 0) goto Lbf
            android.view.ScaleGestureDetector r11 = r0.f134
            boolean r11 = r11.isInProgress()
            ۟.b1 r0 = r10.f984
            boolean r3 = r0.f136
            android.view.ScaleGestureDetector r4 = r0.f134     // Catch: java.lang.IllegalArgumentException -> L9c
            r4.onTouchEvent(r12)     // Catch: java.lang.IllegalArgumentException -> L9c
            r0.m59(r12)     // Catch: java.lang.IllegalArgumentException -> L9c
        L9c:
            if (r11 != 0) goto Laa
            ۟.b1 r11 = r10.f984
            android.view.ScaleGestureDetector r11 = r11.f134
            boolean r11 = r11.isInProgress()
            if (r11 != 0) goto Laa
            r11 = r2
            goto Lab
        Laa:
            r11 = r1
        Lab:
            if (r3 != 0) goto Lb5
            ۟.b1 r0 = r10.f984
            boolean r0 = r0.f136
            if (r0 != 0) goto Lb5
            r0 = r2
            goto Lb6
        Lb5:
            r0 = r1
        Lb6:
            if (r11 == 0) goto Lbb
            if (r0 == 0) goto Lbb
            r1 = r2
        Lbb:
            r10.f981 = r1
            r1 = r2
            goto Lc0
        Lbf:
            r1 = r11
        Lc0:
            android.view.GestureDetector r11 = r10.f983
            if (r11 == 0) goto Lcb
            boolean r11 = r11.onTouchEvent(r12)
            if (r11 == 0) goto Lcb
            r1 = r2
        Lcb:
            return r1
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m396() {
            r2 = this;
            boolean r0 = r2.m397()
            if (r0 == 0) goto Lf
            android.graphics.Matrix r0 = r2.m400()
            android.widget.ImageView r1 = r2.f982
            r1.setImageMatrix(r0)
        Lf:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final boolean m397() {
            r13 = this;
            android.graphics.Matrix r0 = r13.m400()
            android.graphics.RectF r0 = r13.m399(r0)
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            float r2 = r0.height()
            float r3 = r0.width()
            android.widget.ImageView r4 = r13.f982
            int r5 = r4.getHeight()
            int r6 = r4.getPaddingTop()
            int r5 = r5 - r6
            int r4 = r4.getPaddingBottom()
            int r5 = r5 - r4
            float r4 = (float) r5
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r6 = -1
            r7 = 1073741824(0x40000000, float:2.0)
            r8 = 3
            r9 = 1
            r10 = 2
            r11 = 0
            if (r5 > 0) goto L4a
            int[] r5 = ۟.s7.d.f1002
            android.widget.ImageView$ScaleType r12 = r13.f997
            int r12 = r12.ordinal()
            r5 = r5[r12]
            if (r5 == r10) goto L44
            float r4 = r4 - r2
            if (r5 == r8) goto L40
            float r4 = r4 / r7
        L40:
            float r2 = r0.top
            float r4 = r4 - r2
            goto L47
        L44:
            float r2 = r0.top
            float r4 = -r2
        L47:
            r13.f995 = r10
            goto L61
        L4a:
            float r2 = r0.top
            int r5 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r5 <= 0) goto L54
            r13.f995 = r1
            float r4 = -r2
            goto L61
        L54:
            float r2 = r0.bottom
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 >= 0) goto L5e
            r13.f995 = r9
            float r4 = r4 - r2
            goto L61
        L5e:
            r13.f995 = r6
            r4 = r11
        L61:
            android.widget.ImageView r2 = r13.f982
            int r5 = r2.getWidth()
            int r12 = r2.getPaddingLeft()
            int r5 = r5 - r12
            int r2 = r2.getPaddingRight()
            int r5 = r5 - r2
            float r2 = (float) r5
            int r5 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r5 > 0) goto L92
            int[] r1 = ۟.s7.d.f1002
            android.widget.ImageView$ScaleType r5 = r13.f997
            int r5 = r5.ordinal()
            r1 = r1[r5]
            if (r1 == r10) goto L8b
            float r2 = r2 - r3
            if (r1 == r8) goto L86
            float r2 = r2 / r7
        L86:
            float r0 = r0.left
            float r2 = r2 - r0
            r11 = r2
            goto L8f
        L8b:
            float r0 = r0.left
            float r0 = -r0
            r11 = r0
        L8f:
            r13.f994 = r10
            goto La9
        L92:
            float r3 = r0.left
            int r5 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r5 <= 0) goto L9c
            r13.f994 = r1
            float r11 = -r3
            goto La9
        L9c:
            float r0 = r0.right
            int r1 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r1 >= 0) goto La7
            float r11 = r2 - r0
            r13.f994 = r9
            goto La9
        La7:
            r13.f994 = r6
        La9:
            android.graphics.Matrix r0 = r13.f987
            r0.postTranslate(r11, r4)
            return r9
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final android.graphics.RectF m398() {
            r1 = this;
            r1.m397()
            android.graphics.Matrix r0 = r1.m400()
            android.graphics.RectF r0 = r1.m399(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final android.graphics.RectF m399(android.graphics.Matrix r5) {
            r4 = this;
            android.widget.ImageView r0 = r4.f982
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto L20
            android.graphics.RectF r1 = r4.f988
            int r2 = r0.getIntrinsicWidth()
            float r2 = (float) r2
            int r0 = r0.getIntrinsicHeight()
            float r0 = (float) r0
            r3 = 0
            r1.set(r3, r3, r2, r0)
            android.graphics.RectF r0 = r4.f988
            r5.mapRect(r0)
            android.graphics.RectF r5 = r4.f988
            return r5
        L20:
            r5 = 0
            return r5
    }

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public final android.graphics.Matrix m400() {
            r2 = this;
            android.graphics.Matrix r0 = r2.f986
            android.graphics.Matrix r1 = r2.f985
            r0.set(r1)
            android.graphics.Matrix r0 = r2.f986
            android.graphics.Matrix r1 = r2.f987
            r0.postConcat(r1)
            android.graphics.Matrix r0 = r2.f986
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public final float m401() {
            r6 = this;
            android.graphics.Matrix r0 = r6.f987
            float[] r1 = r6.f989
            r0.getValues(r1)
            float[] r0 = r6.f989
            r1 = 0
            r0 = r0[r1]
            double r0 = (double) r0
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.pow(r0, r2)
            float r0 = (float) r0
            android.graphics.Matrix r1 = r6.f987
            r4 = 3
            float[] r5 = r6.f989
            r1.getValues(r5)
            float[] r1 = r6.f989
            r1 = r1[r4]
            double r4 = (double) r1
            double r1 = java.lang.Math.pow(r4, r2)
            float r1 = (float) r1
            float r0 = r0 + r1
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            float r0 = (float) r0
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public final void m402(float r8, float r9, float r10, boolean r11) {
            r7 = this;
            float r0 = r7.f977
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 < 0) goto L2b
            float r0 = r7.f979
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 > 0) goto L2b
            if (r11 == 0) goto L22
            android.widget.ImageView r11 = r7.f982
            ۟.s7$e r6 = new ۟.s7$e
            float r2 = r7.m401()
            r0 = r6
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r11.post(r6)
            goto L2a
        L22:
            android.graphics.Matrix r11 = r7.f987
            r11.setScale(r8, r8, r9, r10)
            r7.m396()
        L2a:
            return
        L2b:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Scale must be within the range of minScale and maxScale"
            r8.<init>(r9)
            throw r8
    }

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public final void m403() {
            r2 = this;
            boolean r0 = r2.f996
            if (r0 == 0) goto Le
            android.widget.ImageView r0 = r2.f982
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            r2.m404(r0)
            goto L28
        Le:
            android.graphics.Matrix r0 = r2.f987
            r0.reset()
            android.graphics.Matrix r0 = r2.f987
            r1 = 0
            r0.postRotate(r1)
            r2.m396()
            android.graphics.Matrix r0 = r2.m400()
            android.widget.ImageView r1 = r2.f982
            r1.setImageMatrix(r0)
            r2.m397()
        L28:
            return
    }

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public final void m404(android.graphics.drawable.Drawable r10) {
            r9 = this;
            if (r10 != 0) goto L3
            return
        L3:
            android.widget.ImageView r0 = r9.f982
            int r1 = r0.getWidth()
            int r2 = r0.getPaddingLeft()
            int r1 = r1 - r2
            int r0 = r0.getPaddingRight()
            int r1 = r1 - r0
            float r0 = (float) r1
            android.widget.ImageView r1 = r9.f982
            int r2 = r1.getHeight()
            int r3 = r1.getPaddingTop()
            int r2 = r2 - r3
            int r1 = r1.getPaddingBottom()
            int r2 = r2 - r1
            float r1 = (float) r2
            int r2 = r10.getIntrinsicWidth()
            int r10 = r10.getIntrinsicHeight()
            android.graphics.Matrix r3 = r9.f985
            r3.reset()
            float r2 = (float) r2
            float r3 = r0 / r2
            float r10 = (float) r10
            float r4 = r1 / r10
            android.widget.ImageView$ScaleType r5 = r9.f997
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.CENTER
            r7 = 1073741824(0x40000000, float:2.0)
            r8 = 0
            if (r5 != r6) goto L4b
            android.graphics.Matrix r3 = r9.f985
            float r0 = r0 - r2
            float r0 = r0 / r7
            float r1 = r1 - r10
            float r1 = r1 / r7
            r3.postTranslate(r0, r1)
            goto Lb4
        L4b:
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.CENTER_CROP
            if (r5 != r6) goto L54
            float r3 = java.lang.Math.max(r3, r4)
            goto L62
        L54:
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            if (r5 != r6) goto L73
            r5 = 1065353216(0x3f800000, float:1.0)
            float r3 = java.lang.Math.min(r3, r4)
            float r3 = java.lang.Math.min(r5, r3)
        L62:
            android.graphics.Matrix r4 = r9.f985
            r4.postScale(r3, r3)
            android.graphics.Matrix r4 = r9.f985
            float r2 = r2 * r3
            float r0 = r0 - r2
            float r0 = r0 / r7
            float r10 = r10 * r3
            float r1 = r1 - r10
            float r1 = r1 / r7
            r4.postTranslate(r0, r1)
            goto Lb4
        L73:
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>(r8, r8, r2, r10)
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>(r8, r8, r0, r1)
            int r0 = (int) r8
            int r0 = r0 % 180
            if (r0 == 0) goto L87
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>(r8, r8, r10, r2)
        L87:
            int[] r10 = ۟.s7.d.f1002
            android.widget.ImageView$ScaleType r0 = r9.f997
            int r0 = r0.ordinal()
            r10 = r10[r0]
            r0 = 1
            if (r10 == r0) goto Lad
            r0 = 2
            if (r10 == r0) goto La8
            r0 = 3
            if (r10 == r0) goto La3
            r0 = 4
            if (r10 == r0) goto L9e
            goto Lb4
        L9e:
            android.graphics.Matrix r10 = r9.f985
            android.graphics.Matrix$ScaleToFit r0 = android.graphics.Matrix.ScaleToFit.FILL
            goto Lb1
        La3:
            android.graphics.Matrix r10 = r9.f985
            android.graphics.Matrix$ScaleToFit r0 = android.graphics.Matrix.ScaleToFit.END
            goto Lb1
        La8:
            android.graphics.Matrix r10 = r9.f985
            android.graphics.Matrix$ScaleToFit r0 = android.graphics.Matrix.ScaleToFit.START
            goto Lb1
        Lad:
            android.graphics.Matrix r10 = r9.f985
            android.graphics.Matrix$ScaleToFit r0 = android.graphics.Matrix.ScaleToFit.CENTER
        Lb1:
            r10.setRectToRect(r3, r4, r0)
        Lb4:
            android.graphics.Matrix r10 = r9.f987
            r10.reset()
            android.graphics.Matrix r10 = r9.f987
            r10.postRotate(r8)
            r9.m396()
            android.graphics.Matrix r10 = r9.m400()
            android.widget.ImageView r0 = r9.f982
            r0.setImageMatrix(r10)
            r9.m397()
            return
    }
}
