package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class zl1 {

    /* JADX INFO: renamed from: α */
    public p000.C0538m6 f13152;

    /* JADX INFO: renamed from: β */
    public androidx.recyclerview.widget.RecyclerView f13153;

    /* JADX INFO: renamed from: γ */
    public final p000.cw1 f13154;

    /* JADX INFO: renamed from: δ */
    public final p000.cw1 f13155;

    /* JADX INFO: renamed from: ε */
    public p000.ds0 f13156;

    /* JADX INFO: renamed from: ζ */
    public boolean f13157;

    /* JADX INFO: renamed from: η */
    public int f13158;

    /* JADX INFO: renamed from: θ */
    public int f13159;

    /* JADX INFO: renamed from: ι */
    public int f13160;

    /* JADX INFO: renamed from: κ */
    public int f13161;

    public zl1() {
            r3 = this;
            r3.<init>()
            yl1 r0 = new yl1
            r1 = 0
            r0.<init>(r3, r1)
            yl1 r1 = new yl1
            r2 = 1
            r1.<init>(r3, r2)
            cw1 r2 = new cw1
            r2.<init>(r0)
            r3.f13154 = r2
            cw1 r0 = new cw1
            r0.<init>(r1)
            r3.f13155 = r0
            r0 = 0
            r3.f13157 = r0
            return
    }

    /* JADX INFO: renamed from: Α */
    public static p000.as0 m7164(android.content.Context r3, android.util.AttributeSet r4, int r5, int r6) {
            as0 r0 = new as0
            r1 = 1
            r0.<init>(r1)
            int[] r2 = p000.jk1.f5502
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r2, r5, r6)
            r4 = 0
            int r5 = r3.getInt(r4, r1)
            r0.f1293 = r5
            r5 = 10
            int r5 = r3.getInt(r5, r1)
            r0.f1294 = r5
            r5 = 9
            boolean r5 = r3.getBoolean(r5, r4)
            r0.f1295 = r5
            r5 = 11
            boolean r4 = r3.getBoolean(r5, r4)
            r0.f1296 = r4
            r3.recycle()
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public static int m7165(int r2, int r3, int r4) {
            int r0 = android.view.View.MeasureSpec.getMode(r2)
            int r2 = android.view.View.MeasureSpec.getSize(r2)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L15
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L14
            int r2 = java.lang.Math.max(r3, r4)
        L14:
            return r2
        L15:
            int r3 = java.lang.Math.max(r3, r4)
            int r2 = java.lang.Math.min(r2, r3)
            return r2
    }

    /* JADX INFO: renamed from: ω */
    public static void m7166(android.view.View r0) {
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            am1 r0 = (p000.am1) r0
            r0.getClass()
            r0 = 0
            throw r0
    }

    /* JADX INFO: renamed from: Β */
    public int mo465(p000.fm1 r1, p000.km1 r2) {
            r0 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r0.f13153
            if (r0 == 0) goto L7
            r0.getClass()
        L7:
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: Γ */
    public final void m7167(android.graphics.Rect r6, android.view.View r7) {
            r5 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            am1 r0 = (p000.am1) r0
            android.graphics.Rect r0 = r0.f326
            int r1 = r0.left
            int r1 = -r1
            int r2 = r0.top
            int r2 = -r2
            int r3 = r7.getWidth()
            int r4 = r0.right
            int r3 = r3 + r4
            int r4 = r7.getHeight()
            int r0 = r0.bottom
            int r4 = r4 + r0
            r6.set(r1, r2, r3, r4)
            androidx.recyclerview.widget.RecyclerView r0 = r5.f13153
            if (r0 == 0) goto L5c
            android.graphics.Matrix r0 = r7.getMatrix()
            if (r0 == 0) goto L5c
            boolean r1 = r0.isIdentity()
            if (r1 != 0) goto L5c
            androidx.recyclerview.widget.RecyclerView r5 = r5.f13153
            android.graphics.RectF r5 = r5.f1159
            r5.set(r6)
            r0.mapRect(r5)
            float r0 = r5.left
            double r0 = (double) r0
            double r0 = java.lang.Math.floor(r0)
            int r0 = (int) r0
            float r1 = r5.top
            double r1 = (double) r1
            double r1 = java.lang.Math.floor(r1)
            int r1 = (int) r1
            float r2 = r5.right
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            float r5 = r5.bottom
            double r3 = (double) r5
            double r3 = java.lang.Math.ceil(r3)
            int r5 = (int) r3
            r6.set(r0, r1, r2, r5)
        L5c:
            int r5 = r7.getLeft()
            int r7 = r7.getTop()
            r6.offset(r5, r7)
            return
    }

    /* JADX INFO: renamed from: Δ */
    public abstract boolean mo483();

    /* JADX INFO: renamed from: Ε */
    public abstract boolean mo484();

    /* JADX INFO: renamed from: Ζ */
    public void mo539(int r4) {
            r3 = this;
            androidx.recyclerview.widget.RecyclerView r3 = r3.f13153
            if (r3 == 0) goto L19
            m6 r0 = r3.f1154
            int r0 = r0.m3789()
            r1 = 0
        Lb:
            if (r1 >= r0) goto L19
            m6 r2 = r3.f1154
            android.view.View r2 = r2.m3788(r1)
            r2.offsetLeftAndRight(r4)
            int r1 = r1 + 1
            goto Lb
        L19:
            return
    }

    /* JADX INFO: renamed from: Η */
    public void mo540(int r4) {
            r3 = this;
            androidx.recyclerview.widget.RecyclerView r3 = r3.f13153
            if (r3 == 0) goto L19
            m6 r0 = r3.f1154
            int r0 = r0.m3789()
            r1 = 0
        Lb:
            if (r1 >= r0) goto L19
            m6 r2 = r3.f1154
            android.view.View r2 = r2.m3788(r1)
            r2.offsetTopAndBottom(r4)
            int r1 = r1 + 1
            goto Lb
        L19:
            return
    }

    /* JADX INFO: renamed from: Θ */
    public void mo541() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: Ι */
    public abstract void mo485(androidx.recyclerview.widget.RecyclerView r1);

    /* JADX INFO: renamed from: Κ */
    public void mo486(android.view.accessibility.AccessibilityEvent r4) {
            r3 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r3.f13153
            fm1 r1 = r0.f1151
            km1 r1 = r0.f1174
            if (r0 == 0) goto L35
            if (r4 != 0) goto Lb
            goto L35
        Lb:
            r1 = 1
            boolean r0 = r0.canScrollVertically(r1)
            if (r0 != 0) goto L2d
            androidx.recyclerview.widget.RecyclerView r0 = r3.f13153
            r2 = -1
            boolean r0 = r0.canScrollVertically(r2)
            if (r0 != 0) goto L2d
            androidx.recyclerview.widget.RecyclerView r0 = r3.f13153
            boolean r0 = r0.canScrollHorizontally(r2)
            if (r0 != 0) goto L2d
            androidx.recyclerview.widget.RecyclerView r0 = r3.f13153
            boolean r0 = r0.canScrollHorizontally(r1)
            if (r0 == 0) goto L2c
            goto L2d
        L2c:
            r1 = 0
        L2d:
            r4.setScrollable(r1)
            androidx.recyclerview.widget.RecyclerView r3 = r3.f13153
            r3.getClass()
        L35:
            return
    }

    /* JADX INFO: renamed from: Λ */
    public void mo466(p000.fm1 r9, p000.km1 r10, p000.C1128 r11) {
            r8 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r11.f13478
            androidx.recyclerview.widget.RecyclerView r1 = r8.f13153
            r2 = -1
            boolean r1 = r1.canScrollVertically(r2)
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            r4 = -67108865(0xfffffffffbffffff, float:-2.6584558E36)
            java.lang.String r5 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY"
            r6 = 0
            r7 = 1
            if (r1 != 0) goto L1c
            androidx.recyclerview.widget.RecyclerView r1 = r8.f13153
            boolean r1 = r1.canScrollHorizontally(r2)
            if (r1 == 0) goto L33
        L1c:
            r1 = 8192(0x2000, float:1.148E-41)
            r11.m7353(r1)
            r0.setScrollable(r7)
            android.os.Bundle r1 = r0.getExtras()
            if (r1 == 0) goto L33
            int r2 = r1.getInt(r5, r6)
            r2 = r2 & r4
            r2 = r2 | r3
            r1.putInt(r5, r2)
        L33:
            androidx.recyclerview.widget.RecyclerView r1 = r8.f13153
            boolean r1 = r1.canScrollVertically(r7)
            if (r1 != 0) goto L43
            androidx.recyclerview.widget.RecyclerView r1 = r8.f13153
            boolean r1 = r1.canScrollHorizontally(r7)
            if (r1 == 0) goto L5a
        L43:
            r1 = 4096(0x1000, float:5.74E-42)
            r11.m7353(r1)
            r0.setScrollable(r7)
            android.os.Bundle r11 = r0.getExtras()
            if (r11 == 0) goto L5a
            int r1 = r11.getInt(r5, r6)
            r1 = r1 & r4
            r1 = r1 | r3
            r11.putInt(r5, r1)
        L5a:
            int r11 = r8.mo465(r9, r10)
            int r8 = r8.mo478(r9, r10)
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r8 = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(r11, r8, r6, r6)
            r0.setCollectionInfo(r8)
            return
    }

    /* JADX INFO: renamed from: Μ */
    public abstract android.os.Parcelable mo487();

    /* JADX INFO: renamed from: Ν */
    public void mo542(int r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: Ξ */
    public boolean mo467(int r7, android.os.Bundle r8) {
            r6 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r6.f13153
            fm1 r0 = r0.f1151
            int r0 = r6.f13161
            int r1 = r6.f13160
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            androidx.recyclerview.widget.RecyclerView r3 = r6.f13153
            android.graphics.Matrix r3 = r3.getMatrix()
            boolean r3 = r3.isIdentity()
            if (r3 == 0) goto L29
            androidx.recyclerview.widget.RecyclerView r3 = r6.f13153
            boolean r3 = r3.getGlobalVisibleRect(r2)
            if (r3 == 0) goto L29
            int r0 = r2.height()
            int r1 = r2.width()
        L29:
            r2 = 4096(0x1000, float:5.74E-42)
            r3 = 1
            r4 = 0
            if (r7 == r2) goto L62
            r2 = 8192(0x2000, float:1.148E-41)
            if (r7 == r2) goto L36
            r7 = r4
            r0 = r7
            goto L8a
        L36:
            androidx.recyclerview.widget.RecyclerView r7 = r6.f13153
            r2 = -1
            boolean r7 = r7.canScrollVertically(r2)
            if (r7 == 0) goto L4b
            int r7 = r6.m7179()
            int r0 = r0 - r7
            int r7 = r6.m7176()
            int r0 = r0 - r7
            int r7 = -r0
            goto L4c
        L4b:
            r7 = r4
        L4c:
            androidx.recyclerview.widget.RecyclerView r0 = r6.f13153
            boolean r0 = r0.canScrollHorizontally(r2)
            if (r0 == 0) goto L60
            int r0 = r6.m7177()
            int r1 = r1 - r0
            int r0 = r6.m7178()
            int r1 = r1 - r0
            int r0 = -r1
            goto L8a
        L60:
            r0 = r4
            goto L8a
        L62:
            androidx.recyclerview.widget.RecyclerView r7 = r6.f13153
            boolean r7 = r7.canScrollVertically(r3)
            if (r7 == 0) goto L76
            int r7 = r6.m7179()
            int r0 = r0 - r7
            int r7 = r6.m7176()
            int r0 = r0 - r7
            r7 = r0
            goto L77
        L76:
            r7 = r4
        L77:
            androidx.recyclerview.widget.RecyclerView r0 = r6.f13153
            boolean r0 = r0.canScrollHorizontally(r3)
            if (r0 == 0) goto L60
            int r0 = r6.m7177()
            int r1 = r1 - r0
            int r0 = r6.m7178()
            int r0 = r1 - r0
        L8a:
            if (r7 != 0) goto L8f
            if (r0 != 0) goto L8f
            goto La2
        L8f:
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto Lbc
            java.lang.String r5 = "androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT"
            float r8 = r8.getFloat(r5, r2)
            int r5 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r5 >= 0) goto Lbd
            boolean r6 = androidx.recyclerview.widget.RecyclerView.f1118
            if (r6 != 0) goto La3
        La2:
            return r4
        La3:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value ("
            r7.<init>(r0)
            r7.append(r8)
            java.lang.String r8 = ")"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        Lbc:
            r8 = r2
        Lbd:
            r5 = 2139095040(0x7f800000, float:Infinity)
            int r5 = java.lang.Float.compare(r8, r5)
            if (r5 != 0) goto Lcb
            androidx.recyclerview.widget.RecyclerView r6 = r6.f13153
            r6.getClass()
            return r4
        Lcb:
            int r2 = java.lang.Float.compare(r2, r8)
            if (r2 == 0) goto Ldd
            int r1 = java.lang.Float.compare(r1, r8)
            if (r1 == 0) goto Ldd
            float r0 = (float) r0
            float r0 = r0 * r8
            int r0 = (int) r0
            float r7 = (float) r7
            float r7 = r7 * r8
            int r7 = (int) r7
        Ldd:
            androidx.recyclerview.widget.RecyclerView r6 = r6.f13153
            r6.m513(r0, r7, r3)
            return r3
    }

    /* JADX INFO: renamed from: Ο */
    public final void m7168() {
            r1 = this;
            int r0 = r1.m7175()
            int r0 = r0 + (-1)
            if (r0 >= 0) goto L9
            return
        L9:
            android.view.View r1 = r1.m7174(r0)
            androidx.recyclerview.widget.RecyclerView.m507(r1)
            r1 = 0
            throw r1
    }

    /* JADX INFO: renamed from: Π */
    public final void m7169(p000.fm1 r3) {
            r2 = this;
            java.util.ArrayList r0 = r3.f4020
            int r0 = r0.size()
            int r1 = r0 + (-1)
            java.util.ArrayList r3 = r3.f4020
            if (r1 >= 0) goto L17
            r3.clear()
            if (r0 <= 0) goto L16
            androidx.recyclerview.widget.RecyclerView r2 = r2.f13153
            r2.invalidate()
        L16:
            return
        L17:
            java.lang.ClassCastException r2 = p000.lz1.m3685(r1, r3)
            throw r2
    }

    /* JADX INFO: renamed from: Ρ */
    public final boolean m7170(androidx.recyclerview.widget.RecyclerView r17, android.view.View r18, android.graphics.Rect r19, boolean r20, boolean r21) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            int r3 = r0.m7177()
            int r4 = r0.m7179()
            int r5 = r0.f13160
            int r6 = r0.m7178()
            int r5 = r5 - r6
            int r6 = r0.f13161
            int r7 = r0.m7176()
            int r6 = r6 - r7
            int r7 = r18.getLeft()
            int r8 = r2.left
            int r7 = r7 + r8
            int r8 = r18.getScrollX()
            int r7 = r7 - r8
            int r8 = r18.getTop()
            int r9 = r2.top
            int r8 = r8 + r9
            int r9 = r18.getScrollY()
            int r8 = r8 - r9
            int r9 = r2.width()
            int r9 = r9 + r7
            int r2 = r2.height()
            int r2 = r2 + r8
            int r7 = r7 - r3
            r3 = 0
            int r10 = java.lang.Math.min(r3, r7)
            int r8 = r8 - r4
            int r4 = java.lang.Math.min(r3, r8)
            int r9 = r9 - r5
            int r5 = java.lang.Math.max(r3, r9)
            int r2 = r2 - r6
            int r2 = java.lang.Math.max(r3, r2)
            androidx.recyclerview.widget.RecyclerView r6 = r0.f13153
            int r6 = r6.getLayoutDirection()
            r11 = 1
            if (r6 != r11) goto L64
            if (r5 == 0) goto L5f
            goto L6c
        L5f:
            int r5 = java.lang.Math.max(r10, r9)
            goto L6c
        L64:
            if (r10 == 0) goto L67
            goto L6b
        L67:
            int r10 = java.lang.Math.min(r7, r5)
        L6b:
            r5 = r10
        L6c:
            if (r4 == 0) goto L6f
            goto L73
        L6f:
            int r4 = java.lang.Math.min(r8, r2)
        L73:
            int[] r2 = new int[]{r5, r4}
            r4 = r2[r3]
            r2 = r2[r11]
            if (r21 == 0) goto Lea
            android.view.View r5 = r1.getFocusedChild()
            if (r5 != 0) goto L84
            goto Lf1
        L84:
            int r6 = r0.m7177()
            int r7 = r0.m7179()
            int r8 = r0.f13160
            int r9 = r0.m7178()
            int r8 = r8 - r9
            int r9 = r0.f13161
            int r10 = r0.m7176()
            int r9 = r9 - r10
            androidx.recyclerview.widget.RecyclerView r0 = r0.f13153
            android.graphics.Rect r0 = r0.f1157
            boolean r10 = androidx.recyclerview.widget.RecyclerView.f1118
            android.view.ViewGroup$LayoutParams r10 = r5.getLayoutParams()
            am1 r10 = (p000.am1) r10
            android.graphics.Rect r12 = r10.f326
            int r13 = r5.getLeft()
            int r14 = r12.left
            int r13 = r13 - r14
            int r14 = r10.leftMargin
            int r13 = r13 - r14
            int r14 = r5.getTop()
            int r15 = r12.top
            int r14 = r14 - r15
            int r15 = r10.topMargin
            int r14 = r14 - r15
            int r15 = r5.getRight()
            r18 = r11
            int r11 = r12.right
            int r15 = r15 + r11
            int r11 = r10.rightMargin
            int r15 = r15 + r11
            int r5 = r5.getBottom()
            int r11 = r12.bottom
            int r5 = r5 + r11
            int r10 = r10.bottomMargin
            int r5 = r5 + r10
            r0.set(r13, r14, r15, r5)
            int r5 = r0.left
            int r5 = r5 - r4
            if (r5 >= r8) goto Lf1
            int r5 = r0.right
            int r5 = r5 - r4
            if (r5 <= r6) goto Lf1
            int r5 = r0.top
            int r5 = r5 - r2
            if (r5 >= r9) goto Lf1
            int r0 = r0.bottom
            int r0 = r0 - r2
            if (r0 > r7) goto Lec
            goto Lf1
        Lea:
            r18 = r11
        Lec:
            if (r4 != 0) goto Lf2
            if (r2 == 0) goto Lf1
            goto Lf2
        Lf1:
            return r3
        Lf2:
            if (r20 == 0) goto Lf8
            r1.scrollBy(r4, r2)
            return r18
        Lf8:
            r1.m513(r4, r2, r3)
            return r18
    }

    /* JADX INFO: renamed from: Σ */
    public final void m7171() {
            r0 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r0.f13153
            if (r0 == 0) goto L7
            r0.requestLayout()
        L7:
            return
    }

    /* JADX INFO: renamed from: Τ */
    public abstract int mo468(int r1, p000.fm1 r2, p000.km1 r3);

    /* JADX INFO: renamed from: Υ */
    public abstract void mo488(int r1);

    /* JADX INFO: renamed from: Φ */
    public abstract int mo469(int r1, p000.fm1 r2, p000.km1 r3);

    /* JADX INFO: renamed from: Χ */
    public final void m7172(androidx.recyclerview.widget.RecyclerView r2) {
            r1 = this;
            if (r2 != 0) goto Ld
            r2 = 0
            r1.f13153 = r2
            r1.f13152 = r2
            r2 = 0
            r1.f13160 = r2
            r1.f13161 = r2
            goto L1f
        Ld:
            r1.f13153 = r2
            m6 r0 = r2.f1154
            r1.f13152 = r0
            int r0 = r2.getWidth()
            r1.f13160 = r0
            int r2 = r2.getHeight()
            r1.f13161 = r2
        L1f:
            r2 = 1073741824(0x40000000, float:2.0)
            r1.f13158 = r2
            r1.f13159 = r2
            return
    }

    /* JADX INFO: renamed from: Ψ */
    public abstract void mo489(androidx.recyclerview.widget.RecyclerView r1);

    /* JADX INFO: renamed from: Ω */
    public final void m7173(p000.ds0 r5) {
            r4 = this;
            ds0 r0 = r4.f13156
            if (r0 == 0) goto Ld
            if (r5 == r0) goto Ld
            boolean r1 = r0.f3256
            if (r1 == 0) goto Ld
            r0.m1798()
        Ld:
            r4.f13156 = r5
            androidx.recyclerview.widget.RecyclerView r0 = r4.f13153
            nm1 r1 = r0.f1171
            androidx.recyclerview.widget.RecyclerView r2 = r1.f7684
            r2.removeCallbacks(r1)
            android.widget.OverScroller r1 = r1.f7680
            r1.abortAnimation()
            boolean r1 = r5.f3259
            if (r1 == 0) goto L4b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "An instance of "
            r1.<init>(r2)
            java.lang.Class<ds0> r2 = p000.ds0.class
            java.lang.String r3 = r2.getSimpleName()
            r1.append(r3)
            java.lang.String r3 = " was started more than once. Each instance of"
            r1.append(r3)
            java.lang.String r2 = r2.getSimpleName()
            r1.append(r2)
            java.lang.String r2 = " is intended to only be used once. You should create a new instance for each use."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "RecyclerView"
            android.util.Log.w(r2, r1)
        L4b:
            r5.f3253 = r0
            r5.f3254 = r4
            int r4 = r5.f3252
            r1 = -1
            if (r4 == r1) goto L6f
            km1 r1 = r0.f1174
            r1.f6027 = r4
            r4 = 1
            r5.f3256 = r4
            r5.f3255 = r4
            zl1 r0 = r0.f1160
            r0.mo496()
            r0 = 0
            r5.f3257 = r0
            androidx.recyclerview.widget.RecyclerView r0 = r5.f3253
            nm1 r0 = r0.f1171
            r0.m4084()
            r5.f3259 = r4
            return
        L6f:
            java.lang.String r4 = "Invalid target position"
            p000.C1080.m7275(r4)
            return
    }

    /* JADX INFO: renamed from: β */
    public abstract void mo491(java.lang.String r1);

    /* JADX INFO: renamed from: γ */
    public abstract boolean mo492();

    /* JADX INFO: renamed from: δ */
    public abstract boolean mo493();

    /* JADX INFO: renamed from: ε */
    public boolean mo470(p000.am1 r1) {
            r0 = this;
            if (r1 == 0) goto L4
            r0 = 1
            return r0
        L4:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: η */
    public abstract int mo494(p000.km1 r1);

    /* JADX INFO: renamed from: θ */
    public abstract void mo471(p000.km1 r1);

    /* JADX INFO: renamed from: ι */
    public abstract int mo472(p000.km1 r1);

    /* JADX INFO: renamed from: κ */
    public abstract int mo495(p000.km1 r1);

    /* JADX INFO: renamed from: λ */
    public abstract void mo473(p000.km1 r1);

    /* JADX INFO: renamed from: μ */
    public abstract int mo474(p000.km1 r1);

    /* JADX INFO: renamed from: ν */
    public void mo496() {
            r3 = this;
            int r0 = r3.m7175()
            r1 = 0
        L5:
            if (r1 >= r0) goto L11
            android.view.View r2 = r3.m7174(r1)
            androidx.recyclerview.widget.RecyclerView.m507(r2)
            int r1 = r1 + 1
            goto L5
        L11:
            return
    }

    /* JADX INFO: renamed from: ξ */
    public abstract p000.am1 mo475();

    /* JADX INFO: renamed from: ο */
    public p000.am1 mo476(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            am1 r0 = new am1
            r0.<init>(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: π */
    public p000.am1 mo477(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r0 = r1 instanceof p000.am1
            if (r0 == 0) goto Lc
            am1 r0 = new am1
            am1 r1 = (p000.am1) r1
            r0.<init>(r1)
            return r0
        Lc:
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L18
            am1 r0 = new am1
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r0.<init>(r1)
            return r0
        L18:
            am1 r0 = new am1
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ρ */
    public final android.view.View m7174(int r1) {
            r0 = this;
            m6 r0 = r0.f13152
            if (r0 == 0) goto L9
            android.view.View r0 = r0.m3788(r1)
            return r0
        L9:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: σ */
    public final int m7175() {
            r0 = this;
            m6 r0 = r0.f13152
            if (r0 == 0) goto L9
            int r0 = r0.m3789()
            return r0
        L9:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: τ */
    public int mo478(p000.fm1 r1, p000.km1 r2) {
            r0 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r0.f13153
            if (r0 == 0) goto L7
            r0.getClass()
        L7:
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: υ */
    public final int m7176() {
            r0 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r0.f13153
            if (r0 == 0) goto L9
            int r0 = r0.getPaddingBottom()
            return r0
        L9:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: φ */
    public final int m7177() {
            r0 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r0.f13153
            if (r0 == 0) goto L9
            int r0 = r0.getPaddingLeft()
            return r0
        L9:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: χ */
    public final int m7178() {
            r0 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r0.f13153
            if (r0 == 0) goto L9
            int r0 = r0.getPaddingRight()
            return r0
        L9:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ψ */
    public final int m7179() {
            r0 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r0.f13153
            if (r0 == 0) goto L9
            int r0 = r0.getPaddingTop()
            return r0
        L9:
            r0 = 0
            return r0
    }
}
