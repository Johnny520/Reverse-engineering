package defpackage;

/* JADX INFO: renamed from: ᛲᲇᛷᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0375 extends defpackage.AbstractC1430 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public float f1924;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public float f1925;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public int f1926;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public float f1927;

    /* JADX INFO: renamed from: ᛲᲈᛷᛵ, reason: contains not printable characters */
    public java.util.ArrayList f1928;

    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public android.view.VelocityTracker f1929;

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public int f1930;

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public final defpackage.RunnableC0439 f1931;

    /* JADX INFO: renamed from: ᛴᲀᲁᛴ, reason: contains not printable characters */
    public long f1932;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public float f1933;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public final defpackage.AbstractC0094 f1934;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public float f1935;

    /* JADX INFO: renamed from: ᛷᛷᲀᛴ, reason: contains not printable characters */
    public java.util.ArrayList f1936;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public defpackage.AbstractC2316 f1937;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.util.ArrayList f1938;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public float f1939;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public int f1940;

    /* JADX INFO: renamed from: ᲀᲀᛴᛳ, reason: contains not printable characters */
    public android.view.View f1941;

    /* JADX INFO: renamed from: ᲁᛴᛵᛲ, reason: contains not printable characters */
    public android.view.GestureDetector f1942;

    /* JADX INFO: renamed from: ᲁᲈᛳ, reason: contains not printable characters */
    public android.graphics.Rect f1943;

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public int f1944;

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public defpackage.C0055 f1945;

    /* JADX INFO: renamed from: ᲇᛳᛴᲈ, reason: contains not printable characters */
    public final defpackage.C0306 f1946;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final float[] f1947;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public float f1948;

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public final java.util.ArrayList f1949;

    /* JADX INFO: renamed from: ᲈᛵᲀᛱ, reason: contains not printable characters */
    public defpackage.C1358 f1950;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public float f1951;

    public C0375(defpackage.AbstractC0094 r5) {
            r4 = this;
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.f1938 = r0
            r0 = 2
            float[] r0 = new float[r0]
            r4.f1947 = r0
            r0 = 0
            r4.f1937 = r0
            r1 = -1
            r4.f1926 = r1
            r1 = 0
            r4.f1940 = r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r4.f1949 = r2
            ᛳᛳᛵᛲ r2 = new ᛳᛳᛵᛲ
            r3 = 10
            r2.<init>(r3, r4)
            r4.f1931 = r2
            r4.f1941 = r0
            ᛲᛶᛴᛶ r0 = new ᛲᛶᛴᛶ
            r0.<init>(r1, r4)
            r4.f1946 = r0
            r4.f1934 = r5
            return
    }

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public static boolean m1101(android.view.View r1, float r2, float r3, float r4, float r5) {
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L1e
            int r0 = r1.getWidth()
            float r0 = (float) r0
            float r4 = r4 + r0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L1e
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 < 0) goto L1e
            int r1 = r1.getHeight()
            float r1 = (float) r1
            float r5 = r5 + r1
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 > 0) goto L1e
            r1 = 1
            return r1
        L1e:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final int m1102(int r8) {
            r7 = this;
            r0 = r8 & 12
            if (r0 == 0) goto L67
            float r0 = r7.f1924
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 4
            r3 = 8
            if (r0 <= 0) goto L10
            r0 = r3
            goto L11
        L10:
            r0 = r2
        L11:
            android.view.VelocityTracker r4 = r7.f1929
            if (r4 == 0) goto L4f
            int r5 = r7.f1926
            r6 = -1
            if (r5 <= r6) goto L4f
            r5 = 1000(0x3e8, float:1.401E-42)
            float r6 = r7.f1951
            r4.computeCurrentVelocity(r5, r6)
            android.view.VelocityTracker r4 = r7.f1929
            int r5 = r7.f1926
            float r4 = r4.getXVelocity(r5)
            android.view.VelocityTracker r5 = r7.f1929
            int r6 = r7.f1926
            float r5 = r5.getYVelocity(r6)
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 <= 0) goto L36
            r2 = r3
        L36:
            float r1 = java.lang.Math.abs(r4)
            r3 = r2 & r8
            if (r3 == 0) goto L4f
            if (r0 != r2) goto L4f
            float r3 = r7.f1948
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L4f
            float r3 = java.lang.Math.abs(r5)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L4f
            return r2
        L4f:
            ᛱᛳᛶᛱ r1 = r7.f1945
            int r1 = r1.getWidth()
            float r1 = (float) r1
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r2
            r8 = r8 & r0
            if (r8 == 0) goto L67
            float r7 = r7.f1924
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 <= 0) goto L67
            return r0
        L67:
            r7 = 0
            return r7
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final void m1103(defpackage.AbstractC2316 r4, boolean r5) {
            r3 = this;
            java.util.ArrayList r3 = r3.f1949
            int r0 = r3.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L29
            java.lang.Object r1 = r3.get(r0)
            ᛶᛱᲁᛳ r1 = (defpackage.C1017) r1
            ᲈᛸᲈᛷ r2 = r1.f4533
            if (r2 != r4) goto L26
            boolean r4 = r1.f4529
            r4 = r4 | r5
            r1.f4529 = r4
            boolean r4 = r1.f4530
            if (r4 != 0) goto L22
            android.animation.ValueAnimator r4 = r1.f4543
            r4.cancel()
        L22:
            r3.remove(r0)
            return
        L26:
            int r0 = r0 + (-1)
            goto L8
        L29:
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final android.view.View m1104(android.view.MotionEvent r7) {
            r6 = this;
            float r0 = r7.getX()
            float r7 = r7.getY()
            ᲈᛸᲈᛷ r1 = r6.f1937
            if (r1 == 0) goto L1f
            android.view.View r1 = r1.f9791
            float r2 = r6.f1939
            float r3 = r6.f1924
            float r2 = r2 + r3
            float r3 = r6.f1925
            float r4 = r6.f1927
            float r3 = r3 + r4
            boolean r2 = m1101(r1, r0, r7, r2, r3)
            if (r2 == 0) goto L1f
            return r1
        L1f:
            java.util.ArrayList r1 = r6.f1949
            int r2 = r1.size()
            int r2 = r2 + (-1)
        L27:
            if (r2 < 0) goto L41
            java.lang.Object r3 = r1.get(r2)
            ᛶᛱᲁᛳ r3 = (defpackage.C1017) r3
            ᲈᛸᲈᛷ r4 = r3.f4533
            android.view.View r4 = r4.f9791
            float r5 = r3.f4531
            float r3 = r3.f4538
            boolean r3 = m1101(r4, r0, r7, r5, r3)
            if (r3 == 0) goto L3e
            return r4
        L3e:
            int r2 = r2 + (-1)
            goto L27
        L41:
            ᛱᛳᛶᛱ r6 = r6.f1945
            ᲈᛷᲀᲀ r1 = r6.f611
            int r1 = r1.m3713()
            int r1 = r1 + (-1)
        L4b:
            if (r1 < 0) goto L87
            ᲈᛷᲀᲀ r2 = r6.f611
            android.view.View r2 = r2.m3722(r1)
            float r3 = r2.getTranslationX()
            float r4 = r2.getTranslationY()
            int r5 = r2.getLeft()
            float r5 = (float) r5
            float r5 = r5 + r3
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 < 0) goto L84
            int r5 = r2.getRight()
            float r5 = (float) r5
            float r5 = r5 + r3
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 > 0) goto L84
            int r3 = r2.getTop()
            float r3 = (float) r3
            float r3 = r3 + r4
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 < 0) goto L84
            int r3 = r2.getBottom()
            float r3 = (float) r3
            float r3 = r3 + r4
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 > 0) goto L84
            return r2
        L84:
            int r1 = r1 + (-1)
            goto L4b
        L87:
            r6 = 0
            return r6
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final void m1105(int r9, int r10, android.view.MotionEvent r11) {
            r8 = this;
            ᲈᛸᲈᛷ r0 = r8.f1937
            if (r0 != 0) goto Lde
            r0 = 2
            if (r9 != r0) goto Lde
            int r9 = r8.f1940
            if (r9 == r0) goto Lde
            ᛱᛳᛶᛱ r9 = r8.f1945
            int r9 = r9.getScrollState()
            r1 = 1
            if (r9 != r1) goto L16
            goto Lde
        L16:
            ᛱᛳᛶᛱ r9 = r8.f1945
            ᛷᛵᛱᲀ r9 = r9.getLayoutManager()
            int r2 = r8.f1926
            r3 = -1
            r4 = 0
            if (r2 != r3) goto L23
            goto L6c
        L23:
            int r2 = r11.findPointerIndex(r2)
            float r3 = r11.getX(r2)
            float r5 = r8.f1935
            float r3 = r3 - r5
            float r2 = r11.getY(r2)
            float r5 = r8.f1933
            float r2 = r2 - r5
            float r3 = java.lang.Math.abs(r3)
            float r2 = java.lang.Math.abs(r2)
            int r5 = r8.f1944
            float r5 = (float) r5
            int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r6 >= 0) goto L49
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 >= 0) goto L49
            goto L6c
        L49:
            int r5 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r5 <= 0) goto L54
            boolean r5 = r9.mo172()
            if (r5 == 0) goto L54
            goto L6c
        L54:
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L5f
            boolean r9 = r9.mo170()
            if (r9 == 0) goto L5f
            goto L6c
        L5f:
            android.view.View r9 = r8.m1104(r11)
            if (r9 != 0) goto L66
            goto L6c
        L66:
            ᛱᛳᛶᛱ r2 = r8.f1945
            ᲈᛸᲈᛷ r4 = r2.m439(r9)
        L6c:
            if (r4 != 0) goto L70
            goto Lde
        L70:
            ᛱᛳᛶᛱ r9 = r8.f1945
            r2 = 196611(0x30003, float:2.7551E-40)
            int r9 = r9.getLayoutDirection()
            int r9 = defpackage.AbstractC0094.m586(r2, r9)
            r2 = 65280(0xff00, float:9.1477E-41)
            r9 = r9 & r2
            int r9 = r9 >> 8
            if (r9 != 0) goto L86
            goto Lde
        L86:
            float r2 = r11.getX(r10)
            float r10 = r11.getY(r10)
            float r3 = r8.f1935
            float r2 = r2 - r3
            float r3 = r8.f1933
            float r10 = r10 - r3
            float r3 = java.lang.Math.abs(r2)
            float r5 = java.lang.Math.abs(r10)
            int r6 = r8.f1944
            float r6 = (float) r6
            int r7 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r7 >= 0) goto La8
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 >= 0) goto La8
            goto Lde
        La8:
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r5 = 0
            if (r3 <= 0) goto Lbf
            int r10 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r10 >= 0) goto Lb6
            r10 = r9 & 4
            if (r10 != 0) goto Lb6
            goto Lde
        Lb6:
            int r10 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r10 <= 0) goto Ld0
            r9 = r9 & 8
            if (r9 != 0) goto Ld0
            goto Lde
        Lbf:
            int r2 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r2 >= 0) goto Lc8
            r2 = r9 & 1
            if (r2 != 0) goto Lc8
            goto Lde
        Lc8:
            int r10 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r10 <= 0) goto Ld0
            r9 = r9 & r0
            if (r9 != 0) goto Ld0
            goto Lde
        Ld0:
            r8.f1927 = r5
            r8.f1924 = r5
            r9 = 0
            int r9 = r11.getPointerId(r9)
            r8.f1926 = r9
            r8.m1113(r4, r1)
        Lde:
            return
    }

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public final void m1106(defpackage.AbstractC2316 r22) {
            r21 = this;
            r0 = r21
            r1 = r22
            ᛱᛳᛶᛱ r2 = r0.f1945
            boolean r2 = r2.isLayoutRequested()
            if (r2 == 0) goto Le
            goto L2c1
        Le:
            int r2 = r0.f1940
            r3 = 2
            if (r2 == r3) goto L15
            goto L2c1
        L15:
            float r2 = r0.f1939
            float r4 = r0.f1924
            float r2 = r2 + r4
            int r2 = (int) r2
            float r4 = r0.f1925
            float r5 = r0.f1927
            float r4 = r4 + r5
            int r4 = (int) r4
            android.view.View r5 = r1.f9791
            int r6 = r5.getTop()
            int r6 = r4 - r6
            int r6 = java.lang.Math.abs(r6)
            float r6 = (float) r6
            int r7 = r5.getHeight()
            float r7 = (float) r7
            r8 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 * r8
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L51
            int r6 = r5.getLeft()
            int r6 = r2 - r6
            int r6 = java.lang.Math.abs(r6)
            float r6 = (float) r6
            int r7 = r5.getWidth()
            float r7 = (float) r7
            float r7 = r7 * r8
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L51
            goto L2c1
        L51:
            java.util.ArrayList r6 = r0.f1928
            if (r6 != 0) goto L64
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r0.f1928 = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r0.f1936 = r6
            goto L6c
        L64:
            r6.clear()
            java.util.ArrayList r6 = r0.f1936
            r6.clear()
        L6c:
            float r6 = r0.f1939
            float r7 = r0.f1924
            float r6 = r6 + r7
            int r6 = java.lang.Math.round(r6)
            float r7 = r0.f1925
            float r8 = r0.f1927
            float r7 = r7 + r8
            int r7 = java.lang.Math.round(r7)
            int r8 = r5.getWidth()
            int r8 = r8 + r6
            int r9 = r5.getHeight()
            int r9 = r9 + r7
            int r10 = r6 + r8
            int r10 = r10 / r3
            int r11 = r7 + r9
            int r11 = r11 / r3
            ᛱᛳᛶᛱ r12 = r0.f1945
            ᛷᛵᛱᲀ r12 = r12.getLayoutManager()
            int r13 = r12.m2393()
            r15 = 0
        L99:
            if (r15 >= r13) goto L134
            r16 = r3
            android.view.View r3 = r12.m2382(r15)
            if (r3 != r5) goto Lab
        La3:
            r17 = r2
            r18 = r4
            r19 = r6
            goto L128
        Lab:
            int r14 = r3.getBottom()
            if (r14 < r7) goto La3
            int r14 = r3.getTop()
            if (r14 > r9) goto La3
            int r14 = r3.getRight()
            if (r14 < r6) goto La3
            int r14 = r3.getLeft()
            if (r14 <= r8) goto Lc4
            goto La3
        Lc4:
            ᛱᛳᛶᛱ r14 = r0.f1945
            ᲈᛸᲈᛷ r14 = r14.m439(r3)
            int r17 = r3.getLeft()
            int r18 = r3.getRight()
            int r18 = r18 + r17
            int r18 = r18 / 2
            int r17 = r10 - r18
            int r17 = java.lang.Math.abs(r17)
            int r18 = r3.getTop()
            int r3 = r3.getBottom()
            int r3 = r3 + r18
            int r3 = r3 / 2
            int r3 = r11 - r3
            int r3 = java.lang.Math.abs(r3)
            int r17 = r17 * r17
            int r3 = r3 * r3
            int r3 = r3 + r17
            r17 = r2
            java.util.ArrayList r2 = r0.f1928
            int r2 = r2.size()
            r18 = r4
            r19 = r6
            r4 = 0
            r6 = 0
        L101:
            if (r4 >= r2) goto L11a
            r20 = r2
            java.util.ArrayList r2 = r0.f1936
            java.lang.Object r2 = r2.get(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r3 <= r2) goto L11a
            int r6 = r6 + 1
            int r4 = r4 + 1
            r2 = r20
            goto L101
        L11a:
            java.util.ArrayList r2 = r0.f1928
            r2.add(r6, r14)
            java.util.ArrayList r2 = r0.f1936
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.add(r6, r3)
        L128:
            int r15 = r15 + 1
            r3 = r16
            r2 = r17
            r4 = r18
            r6 = r19
            goto L99
        L134:
            r17 = r2
            r18 = r4
            java.util.ArrayList r2 = r0.f1928
            int r3 = r2.size()
            if (r3 != 0) goto L142
            goto L2c1
        L142:
            int r3 = r5.getWidth()
            int r3 = r3 + r17
            int r4 = r5.getHeight()
            int r4 = r4 + r18
            int r6 = r5.getLeft()
            int r6 = r17 - r6
            int r7 = r5.getTop()
            int r7 = r18 - r7
            int r8 = r2.size()
            r10 = 0
            r11 = -1
            r14 = 0
        L161:
            if (r14 >= r8) goto L1eb
            java.lang.Object r12 = r2.get(r14)
            ᲈᛸᲈᛷ r12 = (defpackage.AbstractC2316) r12
            if (r6 <= 0) goto L188
            android.view.View r13 = r12.f9791
            int r13 = r13.getRight()
            int r13 = r13 - r3
            if (r13 >= 0) goto L188
            android.view.View r15 = r12.f9791
            int r15 = r15.getRight()
            int r9 = r5.getRight()
            if (r15 <= r9) goto L188
            int r9 = java.lang.Math.abs(r13)
            if (r9 <= r11) goto L188
            r11 = r9
            r10 = r12
        L188:
            if (r6 >= 0) goto L1a8
            android.view.View r9 = r12.f9791
            int r9 = r9.getLeft()
            int r9 = r9 - r17
            if (r9 <= 0) goto L1a8
            android.view.View r13 = r12.f9791
            int r13 = r13.getLeft()
            int r15 = r5.getLeft()
            if (r13 >= r15) goto L1a8
            int r9 = java.lang.Math.abs(r9)
            if (r9 <= r11) goto L1a8
            r11 = r9
            r10 = r12
        L1a8:
            if (r7 >= 0) goto L1c8
            android.view.View r9 = r12.f9791
            int r9 = r9.getTop()
            int r9 = r9 - r18
            if (r9 <= 0) goto L1c8
            android.view.View r13 = r12.f9791
            int r13 = r13.getTop()
            int r15 = r5.getTop()
            if (r13 >= r15) goto L1c8
            int r9 = java.lang.Math.abs(r9)
            if (r9 <= r11) goto L1c8
            r11 = r9
            r10 = r12
        L1c8:
            if (r7 <= 0) goto L1e7
            android.view.View r9 = r12.f9791
            int r9 = r9.getBottom()
            int r9 = r9 - r4
            if (r9 >= 0) goto L1e7
            android.view.View r13 = r12.f9791
            int r13 = r13.getBottom()
            int r15 = r5.getBottom()
            if (r13 <= r15) goto L1e7
            int r9 = java.lang.Math.abs(r9)
            if (r9 <= r11) goto L1e7
            r11 = r9
            r10 = r12
        L1e7:
            int r14 = r14 + 1
            goto L161
        L1eb:
            if (r10 != 0) goto L1f8
            java.util.ArrayList r1 = r0.f1928
            r1.clear()
            java.util.ArrayList r0 = r0.f1936
            r0.clear()
            return
        L1f8:
            android.view.View r2 = r10.f9791
            int r3 = r10.m3789()
            r1.m3789()
            ᛱᛳᛶᛱ r4 = r0.f1945
            ᛱᛵᛷᲈ r6 = r0.f1934
            boolean r1 = r6.mo589(r4, r1, r10)
            if (r1 == 0) goto L2c1
            ᛱᛳᛶᛱ r0 = r0.f1945
            ᛷᛵᛱᲀ r1 = r0.getLayoutManager()
            boolean r4 = r1 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r4 == 0) goto L277
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
            java.lang.String r0 = "Cannot drop a view during a scroll or layout calculation"
            r1.mo177(r0)
            r1.m166()
            r1.m194()
            int r0 = defpackage.AbstractC1270.m2371(r5)
            int r3 = defpackage.AbstractC1270.m2371(r2)
            r4 = 1
            if (r0 >= r3) goto L22f
            r0 = r4
            goto L230
        L22f:
            r0 = -1
        L230:
            boolean r6 = r1.f301
            ᲇᲁᛱᛱ r7 = r1.f312
            if (r6 == 0) goto L25d
            if (r0 != r4) goto L24e
            int r0 = r7.mo1933()
            ᲇᲁᛱᛱ r4 = r1.f312
            int r2 = r4.mo1943(r2)
            ᲇᲁᛱᛱ r4 = r1.f312
            int r4 = r4.mo1935(r5)
            int r4 = r4 + r2
            int r0 = r0 - r4
            r1.m190(r3, r0)
            return
        L24e:
            int r0 = r7.mo1933()
            ᲇᲁᛱᛱ r4 = r1.f312
            int r2 = r4.mo1937(r2)
            int r0 = r0 - r2
            r1.m190(r3, r0)
            return
        L25d:
            r4 = -1
            if (r0 != r4) goto L268
            int r0 = r7.mo1943(r2)
            r1.m190(r3, r0)
            return
        L268:
            int r0 = r7.mo1937(r2)
            ᲇᲁᛱᛱ r2 = r1.f312
            int r2 = r2.mo1935(r5)
            int r0 = r0 - r2
            r1.m190(r3, r0)
            return
        L277:
            boolean r4 = r1.mo172()
            if (r4 == 0) goto L29c
            int r4 = defpackage.AbstractC1270.m2375(r2)
            int r5 = r0.getPaddingLeft()
            if (r4 > r5) goto L28a
            r0.m412(r3)
        L28a:
            int r4 = defpackage.AbstractC1270.m2374(r2)
            int r5 = r0.getWidth()
            int r6 = r0.getPaddingRight()
            int r5 = r5 - r6
            if (r4 < r5) goto L29c
            r0.m412(r3)
        L29c:
            boolean r1 = r1.mo170()
            if (r1 == 0) goto L2c1
            int r1 = defpackage.AbstractC1270.m2370(r2)
            int r4 = r0.getPaddingTop()
            if (r1 > r4) goto L2af
            r0.m412(r3)
        L2af:
            int r1 = defpackage.AbstractC1270.m2377(r2)
            int r2 = r0.getHeight()
            int r4 = r0.getPaddingBottom()
            int r2 = r2 - r4
            if (r1 < r2) goto L2c1
            r0.m412(r3)
        L2c1:
            return
    }

    @Override // defpackage.AbstractC1430
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final void mo1107(android.graphics.Canvas r13, defpackage.C0055 r14) {
            r12 = this;
            ᲈᛸᲈᛷ r0 = r12.f1937
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10
            float[] r0 = r12.f1947
            r12.m1108(r0)
            r3 = r0[r2]
            r0 = r0[r1]
            goto L12
        L10:
            r3 = 0
            r0 = r3
        L12:
            ᲈᛸᲈᛷ r4 = r12.f1937
            java.util.ArrayList r12 = r12.f1949
            int r5 = r12.size()
            r6 = r2
        L1b:
            if (r6 >= r5) goto L68
            java.lang.Object r7 = r12.get(r6)
            ᛶᛱᲁᛳ r7 = (defpackage.C1017) r7
            ᲈᛸᲈᛷ r8 = r7.f4533
            float r9 = r7.f4537
            float r10 = r7.f4536
            int r11 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r11 != 0) goto L36
            android.view.View r9 = r8.f9791
            float r9 = r9.getTranslationX()
            r7.f4531 = r9
            goto L3d
        L36:
            float r11 = r7.f4534
            float r10 = r10 - r9
            float r10 = r10 * r11
            float r10 = r10 + r9
            r7.f4531 = r10
        L3d:
            float r9 = r7.f4540
            float r10 = r7.f4535
            int r11 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r11 != 0) goto L4e
            android.view.View r8 = r8.f9791
            float r8 = r8.getTranslationY()
            r7.f4538 = r8
            goto L55
        L4e:
            float r8 = r7.f4534
            float r10 = r10 - r9
            float r10 = r10 * r8
            float r10 = r10 + r9
            r7.f4538 = r10
        L55:
            int r8 = r13.save()
            ᲈᛸᲈᛷ r9 = r7.f4533
            float r10 = r7.f4531
            float r7 = r7.f4538
            defpackage.AbstractC0094.m584(r14, r9, r10, r7, r2)
            r13.restoreToCount(r8)
            int r6 = r6 + 1
            goto L1b
        L68:
            if (r4 == 0) goto L74
            int r12 = r13.save()
            defpackage.AbstractC0094.m584(r14, r4, r3, r0, r1)
            r13.restoreToCount(r12)
        L74:
            return
    }

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public final void m1108(float[] r4) {
            r3 = this;
            int r0 = r3.f1930
            r0 = r0 & 12
            r1 = 0
            if (r0 == 0) goto L19
            float r0 = r3.f1939
            float r2 = r3.f1924
            float r0 = r0 + r2
            ᲈᛸᲈᛷ r2 = r3.f1937
            android.view.View r2 = r2.f9791
            int r2 = r2.getLeft()
            float r2 = (float) r2
            float r0 = r0 - r2
            r4[r1] = r0
            goto L23
        L19:
            ᲈᛸᲈᛷ r0 = r3.f1937
            android.view.View r0 = r0.f9791
            float r0 = r0.getTranslationX()
            r4[r1] = r0
        L23:
            int r0 = r3.f1930
            r0 = r0 & 3
            r1 = 1
            if (r0 == 0) goto L3c
            float r0 = r3.f1925
            float r2 = r3.f1927
            float r0 = r0 + r2
            ᲈᛸᲈᛷ r3 = r3.f1937
            android.view.View r3 = r3.f9791
            int r3 = r3.getTop()
            float r3 = (float) r3
            float r0 = r0 - r3
            r4[r1] = r0
            return
        L3c:
            ᲈᛸᲈᛷ r3 = r3.f1937
            android.view.View r3 = r3.f9791
            float r3 = r3.getTranslationY()
            r4[r1] = r3
            return
    }

    @Override // defpackage.AbstractC1430
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final void mo1109(android.graphics.Rect r1, android.view.View r2) {
            r0 = this;
            r1.setEmpty()
            return
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final int m1110(int r8) {
            r7 = this;
            r0 = r8 & 3
            if (r0 == 0) goto L66
            float r0 = r7.f1927
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 1
            r3 = 2
            if (r0 <= 0) goto Lf
            r0 = r3
            goto L10
        Lf:
            r0 = r2
        L10:
            android.view.VelocityTracker r4 = r7.f1929
            if (r4 == 0) goto L4e
            int r5 = r7.f1926
            r6 = -1
            if (r5 <= r6) goto L4e
            r5 = 1000(0x3e8, float:1.401E-42)
            float r6 = r7.f1951
            r4.computeCurrentVelocity(r5, r6)
            android.view.VelocityTracker r4 = r7.f1929
            int r5 = r7.f1926
            float r4 = r4.getXVelocity(r5)
            android.view.VelocityTracker r5 = r7.f1929
            int r6 = r7.f1926
            float r5 = r5.getYVelocity(r6)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 <= 0) goto L35
            r2 = r3
        L35:
            float r1 = java.lang.Math.abs(r5)
            r3 = r2 & r8
            if (r3 == 0) goto L4e
            if (r2 != r0) goto L4e
            float r3 = r7.f1948
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L4e
            float r3 = java.lang.Math.abs(r4)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L4e
            return r2
        L4e:
            ᛱᛳᛶᛱ r1 = r7.f1945
            int r1 = r1.getHeight()
            float r1 = (float) r1
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r2
            r8 = r8 & r0
            if (r8 == 0) goto L66
            float r7 = r7.f1927
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 <= 0) goto L66
            return r0
        L66:
            r7 = 0
            return r7
    }

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public final void m1111(int r2, int r3, android.view.MotionEvent r4) {
            r1 = this;
            float r0 = r4.getX(r3)
            float r3 = r4.getY(r3)
            float r4 = r1.f1935
            float r0 = r0 - r4
            r1.f1924 = r0
            float r4 = r1.f1933
            float r3 = r3 - r4
            r1.f1927 = r3
            r3 = r2 & 4
            r4 = 0
            if (r3 != 0) goto L1d
            float r0 = java.lang.Math.max(r4, r0)
            r1.f1924 = r0
        L1d:
            r3 = r2 & 8
            if (r3 != 0) goto L27
            float r3 = java.lang.Math.min(r4, r0)
            r1.f1924 = r3
        L27:
            r3 = r2 & 1
            if (r3 != 0) goto L33
            float r3 = r1.f1927
            float r3 = java.lang.Math.max(r4, r3)
            r1.f1927 = r3
        L33:
            r2 = r2 & 2
            if (r2 != 0) goto L3f
            float r2 = r1.f1927
            float r2 = java.lang.Math.min(r4, r2)
            r1.f1927 = r2
        L3f:
            return
    }

    @Override // defpackage.AbstractC1430
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final void mo1112(android.graphics.Canvas r8, defpackage.C0055 r9) {
            r7 = this;
            ᲈᛸᲈᛷ r0 = r7.f1937
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Lf
            float[] r0 = r7.f1947
            r7.m1108(r0)
            r3 = r0[r2]
            r0 = r0[r1]
        Lf:
            ᲈᛸᲈᛷ r0 = r7.f1937
            java.util.ArrayList r7 = r7.f1949
            int r3 = r7.size()
            r4 = r2
        L18:
            if (r4 >= r3) goto L2e
            java.lang.Object r5 = r7.get(r4)
            ᛶᛱᲁᛳ r5 = (defpackage.C1017) r5
            int r6 = r8.save()
            ᲈᛸᲈᛷ r5 = r5.f4533
            android.view.View r5 = r5.f9791
            r8.restoreToCount(r6)
            int r4 = r4 + 1
            goto L18
        L2e:
            if (r0 == 0) goto L37
            int r0 = r8.save()
            r8.restoreToCount(r0)
        L37:
            int r3 = r3 - r1
        L38:
            if (r3 < 0) goto L52
            java.lang.Object r8 = r7.get(r3)
            ᛶᛱᲁᛳ r8 = (defpackage.C1017) r8
            boolean r0 = r8.f4530
            if (r0 == 0) goto L4c
            boolean r8 = r8.f4528
            if (r8 != 0) goto L4c
            r7.remove(r3)
            goto L4f
        L4c:
            if (r0 != 0) goto L4f
            r2 = r1
        L4f:
            int r3 = r3 + (-1)
            goto L38
        L52:
            if (r2 == 0) goto L57
            r9.invalidate()
        L57:
            return
    }

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public final void m1113(defpackage.AbstractC2316 r21, int r22) {
            r20 = this;
            r1 = r20
            r10 = r21
            r11 = r22
            ᲈᛸᲈᛷ r0 = r1.f1937
            if (r10 != r0) goto Lf
            int r0 = r1.f1940
            if (r11 != r0) goto Lf
            return
        Lf:
            r2 = -9223372036854775808
            r1.f1932 = r2
            int r3 = r1.f1940
            r12 = 1
            r1.m1103(r10, r12)
            r1.f1940 = r11
            r13 = 2
            if (r11 != r13) goto L2b
            if (r10 == 0) goto L25
            android.view.View r0 = r10.f9791
            r1.f1941 = r0
            goto L2b
        L25:
            java.lang.String r0 = "Must pass a ViewHolder when dragging"
            defpackage.C2264.m3684(r0)
            return
        L2b:
            int r0 = r11 * 8
            r14 = 8
            int r0 = r0 + r14
            int r0 = r12 << r0
            int r15 = r0 + (-1)
            ᲈᛸᲈᛷ r2 = r1.f1937
            r0 = 196611(0x30003, float:2.7551E-40)
            r4 = 0
            if (r2 == 0) goto L145
            android.view.View r5 = r2.f9791
            android.view.ViewParent r6 = r5.getParent()
            r7 = 0
            if (r6 == 0) goto L130
            if (r3 != r13) goto L49
            r8 = r4
            goto La2
        L49:
            int r5 = r1.f1940
            if (r5 != r13) goto L4f
        L4d:
            r5 = r4
            goto La1
        L4f:
            ᛱᛳᛶᛱ r5 = r1.f1945
            int r5 = r5.getLayoutDirection()
            int r5 = defpackage.AbstractC0094.m586(r0, r5)
            r6 = 65280(0xff00, float:9.1477E-41)
            r5 = r5 & r6
            int r5 = r5 >> r14
            if (r5 != 0) goto L61
            goto L4d
        L61:
            float r6 = r1.f1924
            float r6 = java.lang.Math.abs(r6)
            float r8 = r1.f1927
            float r8 = java.lang.Math.abs(r8)
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L89
            int r6 = r1.m1102(r5)
            if (r6 <= 0) goto L82
            ᛱᛳᛶᛱ r5 = r1.f1945
            int r5 = r5.getLayoutDirection()
            int r5 = defpackage.AbstractC0094.m585(r6, r5)
            goto La1
        L82:
            int r5 = r1.m1110(r5)
            if (r5 <= 0) goto L4d
            goto La1
        L89:
            int r6 = r1.m1110(r5)
            if (r6 <= 0) goto L91
            r5 = r6
            goto La1
        L91:
            int r5 = r1.m1102(r5)
            if (r5 <= 0) goto L4d
            ᛱᛳᛶᛱ r6 = r1.f1945
            int r6 = r6.getLayoutDirection()
            int r5 = defpackage.AbstractC0094.m585(r5, r6)
        La1:
            r8 = r5
        La2:
            android.view.VelocityTracker r5 = r1.f1929
            if (r5 == 0) goto Lab
            r5.recycle()
            r1.f1929 = r7
        Lab:
            r5 = 4
            r6 = 0
            if (r8 == r12) goto Ld2
            if (r8 == r13) goto Ld2
            if (r8 == r5) goto Lc0
            if (r8 == r14) goto Lc0
            r9 = 16
            if (r8 == r9) goto Lc0
            r9 = 32
            if (r8 == r9) goto Lc0
            r0 = r7
            r7 = r6
            goto Le5
        Lc0:
            float r9 = r1.f1924
            float r9 = java.lang.Math.signum(r9)
            ᛱᛳᛶᛱ r0 = r1.f1945
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r9 = r9 * r0
            r0 = r7
            r7 = r6
            r6 = r9
            goto Le5
        Ld2:
            float r0 = r1.f1927
            float r0 = java.lang.Math.signum(r0)
            ᛱᛳᛶᛱ r9 = r1.f1945
            int r9 = r9.getHeight()
            float r9 = (float) r9
            float r0 = r0 * r9
            r19 = r7
            r7 = r0
            r0 = r19
        Le5:
            if (r3 != r13) goto Le9
            r5 = r14
            goto Lec
        Le9:
            if (r8 <= 0) goto Lec
            r5 = r13
        Lec:
            float[] r9 = r1.f1947
            r1.m1108(r9)
            r16 = r4
            r4 = r9[r16]
            r9 = r9[r12]
            r17 = r0
            ᛶᛱᲁᛳ r0 = new ᛶᛱᲁᛳ
            r18 = r5
            r5 = r9
            r9 = r2
            r12 = r16
            r13 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            ᛱᛳᛶᛱ r3 = r1.f1945
            ᛱᛳᛸᛶ r3 = r3.getItemAnimator()
            if (r3 != 0) goto L116
            if (r13 != r14) goto L113
            r3 = 200(0xc8, double:9.9E-322)
            goto L11d
        L113:
            r3 = 250(0xfa, double:1.235E-321)
            goto L11d
        L116:
            if (r13 != r14) goto L11b
            long r3 = r3.f689
            goto L11d
        L11b:
            long r3 = r3.f690
        L11d:
            android.animation.ValueAnimator r5 = r0.f4543
            r5.setDuration(r3)
            java.util.ArrayList r3 = r1.f1949
            r3.add(r0)
            r2.m3791(r12)
            r5.start()
            r0 = 0
            r4 = 1
            goto L142
        L130:
            r12 = r4
            android.view.View r0 = r1.f1941
            if (r5 != r0) goto L139
            r0 = 0
            r1.f1941 = r0
            goto L13a
        L139:
            r0 = 0
        L13a:
            ᛱᛳᛶᛱ r3 = r1.f1945
            ᛱᛵᛷᲈ r4 = r1.f1934
            r4.mo588(r3, r2)
            r4 = r12
        L142:
            r1.f1937 = r0
            goto L146
        L145:
            r12 = r4
        L146:
            if (r10 == 0) goto L174
            android.view.View r0 = r10.f9791
            ᛱᛳᛶᛱ r2 = r1.f1945
            int r2 = r2.getLayoutDirection()
            r3 = 196611(0x30003, float:2.7551E-40)
            int r2 = defpackage.AbstractC0094.m586(r3, r2)
            r2 = r2 & r15
            int r3 = r1.f1940
            int r3 = r3 * r14
            int r2 = r2 >> r3
            r1.f1930 = r2
            int r2 = r0.getLeft()
            float r2 = (float) r2
            r1.f1939 = r2
            int r2 = r0.getTop()
            float r2 = (float) r2
            r1.f1925 = r2
            r1.f1937 = r10
            r2 = 2
            if (r11 != r2) goto L174
            r0.performHapticFeedback(r12)
        L174:
            ᛱᛳᛶᛱ r0 = r1.f1945
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L184
            ᲈᛸᲈᛷ r2 = r1.f1937
            if (r2 == 0) goto L181
            r12 = 1
        L181:
            r0.requestDisallowInterceptTouchEvent(r12)
        L184:
            if (r4 != 0) goto L18f
            ᛱᛳᛶᛱ r0 = r1.f1945
            ᛷᛵᛱᲀ r0 = r0.getLayoutManager()
            r2 = 1
            r0.f5692 = r2
        L18f:
            ᛱᛳᛶᛱ r0 = r1.f1945
            r0.invalidate()
            return
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final void m1114(defpackage.C0055 r8) {
            r7 = this;
            ᛱᛳᛶᛱ r0 = r7.f1945
            if (r0 != r8) goto L5
            return
        L5:
            ᛲᛶᛴᛶ r1 = r7.f1946
            if (r0 == 0) goto L62
            r0.m436(r7)
            ᛱᛳᛶᛱ r0 = r7.f1945
            java.util.ArrayList r2 = r0.f634
            r2.remove(r1)
            ᛱᛵᲀᛳ r2 = r0.f628
            r3 = 0
            if (r2 != r1) goto L1a
            r0.f628 = r3
        L1a:
            ᛱᛳᛶᛱ r0 = r7.f1945
            java.util.ArrayList r0 = r0.f616
            if (r0 != 0) goto L21
            goto L24
        L21:
            r0.remove(r7)
        L24:
            java.util.ArrayList r0 = r7.f1949
            int r2 = r0.size()
            int r2 = r2 + (-1)
        L2c:
            r4 = 0
            if (r2 < 0) goto L46
            java.lang.Object r4 = r0.get(r4)
            ᛶᛱᲁᛳ r4 = (defpackage.C1017) r4
            android.animation.ValueAnimator r5 = r4.f4543
            r5.cancel()
            ᛱᛳᛶᛱ r5 = r7.f1945
            ᲈᛸᲈᛷ r4 = r4.f4533
            ᛱᛵᛷᲈ r6 = r7.f1934
            r6.mo588(r5, r4)
            int r2 = r2 + (-1)
            goto L2c
        L46:
            r0.clear()
            r7.f1941 = r3
            android.view.VelocityTracker r0 = r7.f1929
            if (r0 == 0) goto L54
            r0.recycle()
            r7.f1929 = r3
        L54:
            ᛷᲀᲈᛱ r0 = r7.f1950
            if (r0 == 0) goto L5c
            r0.f5943 = r4
            r7.f1950 = r3
        L5c:
            android.view.GestureDetector r0 = r7.f1942
            if (r0 == 0) goto L62
            r7.f1942 = r3
        L62:
            r7.f1945 = r8
            android.content.res.Resources r8 = r8.getResources()
            r0 = 1711734944(0x660700a0, float:1.5938275E23)
            float r0 = r8.getDimension(r0)
            r7.f1948 = r0
            r0 = 1711734943(0x6607009f, float:1.5938273E23)
            float r8 = r8.getDimension(r0)
            r7.f1951 = r8
            ᛱᛳᛶᛱ r8 = r7.f1945
            android.content.Context r8 = r8.getContext()
            android.view.ViewConfiguration r8 = android.view.ViewConfiguration.get(r8)
            int r8 = r8.getScaledTouchSlop()
            r7.f1944 = r8
            ᛱᛳᛶᛱ r8 = r7.f1945
            r8.m409(r7)
            ᛱᛳᛶᛱ r8 = r7.f1945
            java.util.ArrayList r8 = r8.f634
            r8.add(r1)
            ᛱᛳᛶᛱ r8 = r7.f1945
            java.util.ArrayList r0 = r8.f616
            if (r0 != 0) goto La3
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8.f616 = r0
        La3:
            r0.add(r7)
            ᛷᲀᲈᛱ r8 = new ᛷᲀᲈᛱ
            r8.<init>(r7)
            r7.f1950 = r8
            android.view.GestureDetector r8 = new android.view.GestureDetector
            ᛱᛳᛶᛱ r0 = r7.f1945
            android.content.Context r0 = r0.getContext()
            ᛷᲀᲈᛱ r1 = r7.f1950
            r8.<init>(r0, r1)
            r7.f1942 = r8
            return
    }
}
