package defpackage;

/* JADX INFO: renamed from: ᛶᛵᛵᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC1074 implements android.view.View.OnTouchListener {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public int f4808;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public int f4809;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public double f4810;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public int f4811;

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public float f4812;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final android.graphics.Rect f4813;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public android.view.View f4814;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public defpackage.C0301 f4815;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public defpackage.C1876 f4816;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public int f4817;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public float f4818;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public int f4819;

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public boolean f4820;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public int f4821;

    public ViewOnTouchListenerC1074() {
            r1 = this;
            r1.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.f4813 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static android.view.View m2043(android.view.ViewGroup r10, android.view.MotionEvent r11) {
            int r0 = r10.getChildCount()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L8f
            android.view.View r3 = r10.getChildAt(r2)
            r4 = 2
            int[] r4 = new int[r4]
            r3.getLocationOnScreen(r4)
            r5 = r4[r1]
            r6 = 1
            r4 = r4[r6]
            int r6 = r3.getWidth()
            int r6 = r6 + r5
            int r7 = r3.getHeight()
            int r7 = r7 + r4
            float r8 = r11.getRawX()
            float r9 = r11.getRawY()
            float r5 = (float) r5
            int r5 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r5 < 0) goto L8b
            float r5 = (float) r6
            int r5 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r5 > 0) goto L8b
            float r4 = (float) r4
            int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r4 < 0) goto L8b
            float r4 = (float) r7
            int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r4 > 0) goto L8b
            boolean r4 = r3 instanceof android.view.ViewGroup
            if (r4 == 0) goto L4c
            boolean r5 = r3.isScrollContainer()
            if (r5 == 0) goto L4c
            boolean r5 = m2044(r3)
            goto L7f
        L4c:
            boolean r5 = r3 instanceof defpackage.InterfaceC1885
            if (r5 != 0) goto L7b
            boolean r5 = r3 instanceof defpackage.InterfaceC0752
            if (r5 != 0) goto L7b
            boolean r5 = r3 instanceof android.webkit.WebView
            if (r5 != 0) goto L7b
            boolean r5 = r3 instanceof android.widget.ScrollView
            if (r5 != 0) goto L7b
            boolean r5 = r3 instanceof android.widget.ListView
            if (r5 != 0) goto L7b
            boolean r5 = r3 instanceof android.widget.SeekBar
            if (r5 != 0) goto L7b
            java.lang.Class r5 = r3.getClass()
            java.lang.String r6 = "androidx.viewpager2.widget.ViewPager2"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.ClassNotFoundException -> L79
            boolean r5 = r5.isAssignableFrom(r6)     // Catch: java.lang.ClassNotFoundException -> L79
            if (r5 == 0) goto L79
            boolean r5 = m2044(r3)     // Catch: java.lang.ClassNotFoundException -> L79
            goto L7f
        L79:
            r5 = r1
            goto L7f
        L7b:
            boolean r5 = m2044(r3)
        L7f:
            if (r5 == 0) goto L82
            return r3
        L82:
            if (r4 == 0) goto L8b
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.View r10 = m2043(r3, r11)
            return r10
        L8b:
            int r2 = r2 + 1
            goto L6
        L8f:
            r10 = 0
            return r10
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static boolean m2044(android.view.View r2) {
            boolean r0 = r2 instanceof defpackage.C0055
            if (r0 == 0) goto L1d
            r0 = r2
            ᛱᛳᛶᛱ r0 = (defpackage.C0055) r0
            ᛷᛵᛱᲀ r0 = r0.getLayoutManager()
            if (r0 != 0) goto Le
            goto L1b
        Le:
            boolean r1 = r0.mo170()
            if (r1 != 0) goto L1d
            boolean r0 = r0.mo172()
            if (r0 == 0) goto L1b
            goto L1d
        L1b:
            r2 = 0
            return r2
        L1d:
            boolean r2 = r2.isEnabled()
            return r2
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static boolean m2045(defpackage.C0301 r2, android.view.View r3, android.view.MotionEvent r4) {
            int r0 = r2.getScrollX()
            int r1 = r3.getLeft()
            int r0 = r0 - r1
            int r2 = r2.getScrollY()
            int r1 = r3.getTop()
            int r2 = r2 - r1
            float r0 = (float) r0
            float r2 = (float) r2
            r4.offsetLocation(r0, r2)
            boolean r2 = r3.dispatchTouchEvent(r4)
            return r2
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
            r6 = this;
            ᲁᛶᲁ r7 = r6.f4816
            ᛲᛵᲈᲈ r0 = r6.f4815
            r1 = 0
            if (r7 == 0) goto Leb
            if (r0 != 0) goto Lb
            goto Leb
        Lb:
            int r7 = r8.getAction()
            r2 = 3
            r3 = 0
            r4 = 1
            if (r7 == 0) goto L31
            if (r7 == r4) goto L19
            if (r7 == r2) goto L19
            goto L28
        L19:
            android.view.View r7 = r6.f4814
            if (r7 == 0) goto L28
            boolean r7 = m2045(r0, r7, r8)     // Catch: java.lang.Throwable -> L24
            r6.f4814 = r3
            return r7
        L24:
            r7 = move-exception
            r6.f4814 = r3
            throw r7
        L28:
            android.view.View r7 = r6.f4814
            if (r7 == 0) goto L4b
            boolean r6 = m2045(r0, r7, r8)
            return r6
        L31:
            r6.m2049()
            r6.m2048()
            r6.m2046()
            r6.f4814 = r3
            android.view.View r7 = m2043(r0, r8)
            if (r7 == 0) goto L4b
            boolean r0 = m2045(r0, r7, r8)
            if (r0 == 0) goto L4b
            r6.f4814 = r7
            return r4
        L4b:
            int r7 = r8.getAction()
            if (r7 == 0) goto Lda
            if (r7 == r4) goto Ld5
            r0 = 2
            if (r7 == r0) goto L5a
            if (r7 == r2) goto Ld5
            goto Le8
        L5a:
            float r7 = r8.getRawX()
            int r0 = r6.f4808
            float r0 = (float) r0
            float r7 = r7 - r0
            float r0 = r8.getRawY()
            int r1 = r6.f4811
            float r1 = (float) r1
            float r0 = r0 - r1
            float r1 = r6.f4818
            float r7 = r7 - r1
            float r1 = r6.f4812
            float r0 = r0 - r1
            ᲁᛶᲁ r1 = r6.f4816
            if (r1 != 0) goto L75
            goto L7e
        L75:
            android.view.WindowManager$LayoutParams r1 = r1.f8140
            int r1 = r1.flags
            r1 = r1 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L7e
            goto L87
        L7e:
            r1 = 0
            float r7 = java.lang.Math.max(r7, r1)
            float r0 = java.lang.Math.max(r0, r1)
        L87:
            int r7 = (int) r7
            int r0 = (int) r0
            ᲁᛶᲁ r1 = r6.f4816
            if (r1 != 0) goto L8e
            goto Lab
        L8e:
            android.view.WindowManager$LayoutParams r2 = r1.f8140
            int r3 = r2.gravity
            r5 = 51
            if (r3 != r5) goto L9f
            int r3 = r2.x
            if (r3 != r7) goto L9f
            int r3 = r2.y
            if (r3 != r0) goto L9f
            goto Lab
        L9f:
            r2.x = r7
            r2.y = r0
            r2.gravity = r5
            r1.m3280()
            r6.m2046()
        Lab:
            boolean r7 = r6.f4820
            if (r7 == 0) goto Lb0
            goto Le8
        Lb0:
            float r7 = r6.f4818
            float r0 = r8.getX()
            float r1 = r6.f4812
            float r8 = r8.getY()
            float r2 = r6.m2047()
            float r7 = r7 - r0
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 >= 0) goto Ld2
            float r1 = r1 - r8
            float r7 = java.lang.Math.abs(r1)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 < 0) goto Le8
        Ld2:
            r6.f4820 = r4
            goto Le8
        Ld5:
            boolean r7 = r6.f4820
            r6.f4820 = r1
            return r7
        Lda:
            float r7 = r8.getX()
            r6.f4818 = r7
            float r7 = r8.getY()
            r6.f4812 = r7
            r6.f4820 = r1
        Le8:
            boolean r6 = r6.f4820
            return r6
        Leb:
            return r1
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final void m2046() {
            r2 = this;
            ᛲᛵᲈᲈ r0 = r2.f4815
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 2
            int[] r1 = new int[r1]
            r0.getLocationOnScreen(r1)
            r0 = 0
            r0 = r1[r0]
            r2.f4817 = r0
            r0 = 1
            r0 = r1[r0]
            r2.f4809 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final float m2047() {
            r5 = this;
            double r0 = r5.f4810
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r2 = 1
            if (r5 <= 0) goto L12
            r3 = 4624633867356078080(0x402e000000000000, double:15.0)
            double r0 = r0 / r3
            double r0 = java.lang.Math.ceil(r0)
            int r5 = (int) r0
            goto L13
        L12:
            r5 = r2
        L13:
            float r5 = (float) r5
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r5 = android.util.TypedValue.applyDimension(r2, r5, r0)
            return r5
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final void m2048() {
            r7 = this;
            ᲁᛶᲁ r0 = r7.f4816
            if (r0 != 0) goto L5
            goto Ld
        L5:
            android.view.WindowManager r0 = r0.f8142
            android.view.Display r0 = r0.getDefaultDisplay()
            if (r0 != 0) goto Le
        Ld:
            return
        Le:
            android.util.DisplayMetrics r1 = new android.util.DisplayMetrics
            r1.<init>()
            r0.getMetrics(r1)
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>()
            r0.getRealSize(r2)
            int r0 = r2.x
            float r0 = (float) r0
            float r3 = r1.xdpi
            float r0 = r0 / r3
            int r2 = r2.y
            float r2 = (float) r2
            float r1 = r1.ydpi
            float r2 = r2 / r1
            double r0 = (double) r0
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.pow(r0, r3)
            double r5 = (double) r2
            double r2 = java.lang.Math.pow(r5, r3)
            double r2 = r2 + r0
            double r0 = java.lang.Math.sqrt(r2)
            r7.f4810 = r0
            return
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final void m2049() {
            r4 = this;
            ᲁᛶᲁ r0 = r4.f4816
            if (r0 != 0) goto L5
            goto L18
        L5:
            android.app.Activity r0 = r0.f8146
            if (r0 != 0) goto La
            goto L18
        La:
            ᛲᛵᲈᲈ r1 = r4.f4815
            if (r1 != 0) goto L16
            android.view.Window r0 = r0.getWindow()
            android.view.View r1 = r0.getDecorView()
        L16:
            if (r1 != 0) goto L19
        L18:
            return
        L19:
            android.graphics.Rect r0 = r4.f4813
            r1.getWindowVisibleDisplayFrame(r0)
            int r1 = r0.right
            int r2 = r0.left
            int r1 = r1 - r2
            r4.f4819 = r1
            int r1 = r0.bottom
            int r3 = r0.top
            int r1 = r1 - r3
            r4.f4821 = r1
            r1 = 0
            int r2 = java.lang.Math.max(r2, r1)
            r4.f4808 = r2
            int r0 = r0.top
            int r0 = java.lang.Math.max(r0, r1)
            r4.f4811 = r0
            return
    }
}
