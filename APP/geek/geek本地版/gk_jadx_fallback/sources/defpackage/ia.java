package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ia extends defpackage.x {
    public static final android.graphics.Rect o = null;
    public static final defpackage.vh p = null;
    public static final defpackage.vh q = null;
    public final android.graphics.Rect d;
    public final android.graphics.Rect e;
    public final android.graphics.Rect f;
    public final int[] g;
    public final android.view.accessibility.AccessibilityManager h;
    public final com.google.android.material.chip.Chip i;
    public defpackage.mj j;
    public int k;
    public int l;
    public int m;
    public final /* synthetic */ com.google.android.material.chip.Chip n;

    static {
            android.graphics.Rect r0 = new android.graphics.Rect
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.<init>(r1, r1, r2, r2)
            defpackage.ia.o = r0
            vh r0 = new vh
            r1 = 20
            r0.<init>(r1)
            defpackage.ia.p = r0
            vh r0 = new vh
            r1 = 21
            r0.<init>(r1)
            defpackage.ia.q = r0
            return
    }

    public ia(com.google.android.material.chip.Chip r2, com.google.android.material.chip.Chip r3) {
            r1 = this;
            r1.n = r2
            r1.<init>()
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r1.d = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r1.e = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r1.f = r2
            r2 = 2
            int[] r2 = new int[r2]
            r1.g = r2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.k = r2
            r1.l = r2
            r1.m = r2
            r1.i = r3
            android.content.Context r2 = r3.getContext()
            java.lang.String r0 = "accessibility"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r2 = (android.view.accessibility.AccessibilityManager) r2
            r1.h = r2
            r2 = 1
            r3.setFocusable(r2)
            java.util.WeakHashMap r0 = defpackage.ja0.a
            int r0 = defpackage.s90.c(r3)
            if (r0 != 0) goto L46
            defpackage.s90.s(r3, r2)
        L46:
            return
    }

    @Override // defpackage.x
    public final defpackage.l0 b(android.view.View r1) {
            r0 = this;
            mj r1 = r0.j
            if (r1 != 0) goto Lb
            mj r1 = new mj
            r1.<init>(r0)
            r0.j = r1
        Lb:
            mj r1 = r0.j
            return r1
    }

    @Override // defpackage.x
    public final void d(android.view.View r2, defpackage.j0 r3) {
            r1 = this;
            android.view.accessibility.AccessibilityNodeInfo r3 = r3.a
            android.view.View$AccessibilityDelegate r0 = r1.a
            r0.onInitializeAccessibilityNodeInfo(r2, r3)
            com.google.android.material.chip.Chip r2 = r1.n
            ka r0 = r2.e
            if (r0 == 0) goto L13
            boolean r0 = r0.Q
            if (r0 == 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            r3.setCheckable(r0)
            boolean r0 = r2.isClickable()
            r3.setClickable(r0)
            java.lang.CharSequence r0 = r2.getAccessibilityClassName()
            r3.setClassName(r0)
            java.lang.CharSequence r2 = r2.getText()
            r3.setText(r2)
            return
    }

    public final boolean j(int r4) {
            r3 = this;
            int r0 = r3.l
            r1 = 0
            if (r0 == r4) goto L6
            return r1
        L6:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.l = r0
            r0 = 1
            if (r4 != r0) goto L14
            com.google.android.material.chip.Chip r2 = r3.n
            r2.m = r1
            r2.refreshDrawableState()
        L14:
            r1 = 8
            r3.p(r4, r1)
            return r0
    }

    public final defpackage.j0 k(int r12) {
            r11 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = android.view.accessibility.AccessibilityNodeInfo.obtain()
            j0 r1 = new j0
            r1.<init>(r0)
            r2 = 1
            r0.setEnabled(r2)
            r0.setFocusable(r2)
            java.lang.String r3 = "android.view.View"
            r0.setClassName(r3)
            android.graphics.Rect r3 = defpackage.ia.o
            r0.setBoundsInParent(r3)
            r0.setBoundsInScreen(r3)
            com.google.android.material.chip.Chip r4 = r11.i
            r0.setParent(r4)
            r5 = 1
            android.view.accessibility.AccessibilityNodeInfo r6 = r1.a
            java.lang.String r7 = ""
            if (r12 != r5) goto L6a
            com.google.android.material.chip.Chip r5 = r11.n
            java.lang.CharSequence r8 = r5.getCloseIconContentDescription()
            if (r8 == 0) goto L35
            r6.setContentDescription(r8)
            goto L56
        L35:
            java.lang.CharSequence r8 = r5.getText()
            android.content.Context r9 = r5.getContext()
            boolean r10 = android.text.TextUtils.isEmpty(r8)
            if (r10 != 0) goto L44
            r7 = r8
        L44:
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            r8 = 2131755106(0x7f100062, float:1.9141082E38)
            java.lang.String r7 = r9.getString(r8, r7)
            java.lang.String r7 = r7.trim()
            r6.setContentDescription(r7)
        L56:
            android.graphics.Rect r7 = com.google.android.material.chip.Chip.a(r5)
            r6.setBoundsInParent(r7)
            h0 r7 = defpackage.h0.e
            r1.b(r7)
            boolean r5 = r5.isEnabled()
            r6.setEnabled(r5)
            goto L72
        L6a:
            r6.setContentDescription(r7)
            android.graphics.Rect r5 = com.google.android.material.chip.Chip.w
            r6.setBoundsInParent(r5)
        L72:
            java.lang.CharSequence r5 = r1.e()
            if (r5 != 0) goto L87
            java.lang.CharSequence r5 = r0.getContentDescription()
            if (r5 == 0) goto L7f
            goto L87
        L7f:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException
            java.lang.String r0 = "Callbacks must add text or a content description in populateNodeForVirtualViewId()"
            r12.<init>(r0)
            throw r12
        L87:
            android.graphics.Rect r5 = r11.e
            r1.d(r5)
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L166
            int r5 = r0.getActions()
            r6 = r5 & 64
            if (r6 != 0) goto L15e
            r6 = 128(0x80, float:1.8E-43)
            r5 = r5 & r6
            if (r5 != 0) goto L156
            android.content.Context r5 = r4.getContext()
            java.lang.String r5 = r5.getPackageName()
            r0.setPackageName(r5)
            r1.b = r12
            r0.setSource(r4, r12)
            int r5 = r11.k
            r7 = 0
            if (r5 != r12) goto Lbb
            r0.setAccessibilityFocused(r2)
            r1.a(r6)
            goto Lc3
        Lbb:
            r0.setAccessibilityFocused(r7)
            r5 = 64
            r1.a(r5)
        Lc3:
            int r5 = r11.l
            if (r5 != r12) goto Lc9
            r12 = r2
            goto Lca
        Lc9:
            r12 = r7
        Lca:
            if (r12 == 0) goto Ld1
            r5 = 2
            r1.a(r5)
            goto Lda
        Ld1:
            boolean r5 = r0.isFocusable()
            if (r5 == 0) goto Lda
            r1.a(r2)
        Lda:
            r0.setFocused(r12)
            int[] r12 = r11.g
            r4.getLocationOnScreen(r12)
            android.graphics.Rect r5 = r11.d
            r0.getBoundsInScreen(r5)
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L101
            r1.d(r5)
            r3 = r12[r7]
            int r6 = r4.getScrollX()
            int r3 = r3 - r6
            r6 = r12[r2]
            int r8 = r4.getScrollY()
            int r6 = r6 - r8
            r5.offset(r3, r6)
        L101:
            android.graphics.Rect r3 = r11.f
            boolean r6 = r4.getLocalVisibleRect(r3)
            if (r6 == 0) goto L155
            r6 = r12[r7]
            int r7 = r4.getScrollX()
            int r6 = r6 - r7
            r12 = r12[r2]
            int r7 = r4.getScrollY()
            int r12 = r12 - r7
            r3.offset(r6, r12)
            boolean r12 = r5.intersect(r3)
            if (r12 == 0) goto L155
            r0.setBoundsInScreen(r5)
            boolean r12 = r5.isEmpty()
            if (r12 == 0) goto L12a
            goto L155
        L12a:
            int r12 = r4.getWindowVisibility()
            if (r12 == 0) goto L131
            goto L155
        L131:
            android.view.ViewParent r12 = r4.getParent()
        L135:
            boolean r3 = r12 instanceof android.view.View
            if (r3 == 0) goto L150
            android.view.View r12 = (android.view.View) r12
            float r3 = r12.getAlpha()
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L155
            int r3 = r12.getVisibility()
            if (r3 == 0) goto L14b
            goto L155
        L14b:
            android.view.ViewParent r12 = r12.getParent()
            goto L135
        L150:
            if (r12 == 0) goto L155
            r0.setVisibleToUser(r2)
        L155:
            return r1
        L156:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException
            java.lang.String r0 = "Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()"
            r12.<init>(r0)
            throw r12
        L15e:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException
            java.lang.String r0 = "Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()"
            r12.<init>(r0)
            throw r12
        L166:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException
            java.lang.String r0 = "Callbacks must set parent bounds in populateNodeForVirtualViewId()"
            r12.<init>(r0)
            throw r12
    }

    public final void l(java.util.ArrayList r3) {
            r2 = this;
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
            android.graphics.Rect r0 = com.google.android.material.chip.Chip.w
            com.google.android.material.chip.Chip r0 = r2.n
            boolean r1 = r0.c()
            if (r1 == 0) goto L26
            ka r1 = r0.e
            if (r1 == 0) goto L26
            boolean r1 = r1.K
            if (r1 == 0) goto L26
            android.view.View$OnClickListener r0 = r0.h
            if (r0 == 0) goto L26
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
        L26:
            return
    }

    public final boolean m(int r19, android.graphics.Rect r20) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.l(r3)
            e40 r4 = new e40
            r4.<init>()
            r6 = 0
        L14:
            int r7 = r3.size()
            if (r6 >= r7) goto L38
            java.lang.Object r7 = r3.get(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            j0 r7 = r0.k(r7)
            java.lang.Object r8 = r3.get(r6)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r4.c(r8, r7)
            int r6 = r6 + 1
            goto L14
        L38:
            int r3 = r0.l
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 0
            if (r3 != r6) goto L41
            r3 = r7
            goto L47
        L41:
            java.lang.Object r3 = r4.b(r3, r7)
            j0 r3 = (defpackage.j0) r3
        L47:
            vh r8 = defpackage.ia.p
            vh r9 = defpackage.ia.q
            com.google.android.material.chip.Chip r10 = r0.i
            r11 = 2
            r13 = 1
            if (r1 == r13) goto L15a
            if (r1 == r11) goto L15a
            r11 = 130(0x82, float:1.82E-43)
            r14 = 66
            r15 = 33
            r7 = 17
            if (r1 == r7) goto L63
            if (r1 == r15) goto L63
            if (r1 == r14) goto L63
            if (r1 != r11) goto L66
        L63:
            r17 = r13
            goto L6e
        L66:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r1
        L6e:
            android.graphics.Rect r13 = new android.graphics.Rect
            r13.<init>()
            int r5 = r0.l
            java.lang.String r12 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            if (r5 == r6) goto L82
            j0 r2 = r0.n(r5)
            r2.d(r13)
        L80:
            r10 = -1
            goto Lb5
        L82:
            if (r2 == 0) goto L88
            r13.set(r2)
            goto L80
        L88:
            int r2 = r10.getWidth()
            int r5 = r10.getHeight()
            if (r1 == r7) goto Lb0
            if (r1 == r15) goto Laa
            if (r1 == r14) goto La4
            if (r1 != r11) goto L9e
            r5 = 0
            r10 = -1
            r13.set(r5, r10, r2, r10)
            goto Lb5
        L9e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r12)
            throw r1
        La4:
            r2 = 0
            r10 = -1
            r13.set(r10, r2, r10, r5)
            goto Lb5
        Laa:
            r6 = 0
            r10 = -1
            r13.set(r6, r5, r2, r5)
            goto Lb5
        Lb0:
            r6 = 0
            r10 = -1
            r13.set(r2, r6, r2, r5)
        Lb5:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r13)
            if (r1 == r7) goto Leb
            if (r1 == r15) goto Le0
            if (r1 == r14) goto Ld4
            if (r1 != r11) goto Lce
            int r5 = r13.height()
            int r5 = r5 + 1
            int r5 = -r5
            r6 = 0
            r2.offset(r6, r5)
            goto Lf5
        Lce:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r12)
            throw r1
        Ld4:
            r6 = 0
            int r5 = r13.width()
            int r5 = r5 + 1
            int r5 = -r5
            r2.offset(r5, r6)
            goto Lf5
        Le0:
            r6 = 0
            int r5 = r13.height()
            int r5 = r5 + 1
            r2.offset(r6, r5)
            goto Lf5
        Leb:
            r6 = 0
            int r5 = r13.width()
            int r5 = r5 + 1
            r2.offset(r5, r6)
        Lf5:
            r9.getClass()
            int r5 = r4.c
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r9 = r6
            r16 = 0
        L102:
            if (r9 >= r5) goto L155
            java.lang.Object[] r11 = r4.b
            r11 = r11[r9]
            j0 r11 = (defpackage.j0) r11
            if (r11 != r3) goto L10d
            goto L152
        L10d:
            r8.getClass()
            r11.d(r7)
            boolean r12 = defpackage.ip.B(r1, r13, r7)
            if (r12 != 0) goto L11a
            goto L152
        L11a:
            boolean r12 = defpackage.ip.B(r1, r13, r2)
            if (r12 != 0) goto L121
            goto L14d
        L121:
            boolean r12 = defpackage.ip.j(r1, r13, r7, r2)
            if (r12 == 0) goto L128
            goto L14d
        L128:
            boolean r12 = defpackage.ip.j(r1, r13, r2, r7)
            if (r12 == 0) goto L12f
            goto L152
        L12f:
            int r12 = defpackage.ip.D(r1, r13, r7)
            int r14 = defpackage.ip.E(r1, r13, r7)
            int r15 = r12 * 13
            int r15 = r15 * r12
            int r14 = r14 * r14
            int r14 = r14 + r15
            int r12 = defpackage.ip.D(r1, r13, r2)
            int r15 = defpackage.ip.E(r1, r13, r2)
            int r17 = r12 * 13
            int r17 = r17 * r12
            int r15 = r15 * r15
            int r15 = r15 + r17
            if (r14 >= r15) goto L152
        L14d:
            r2.set(r7)
            r16 = r11
        L152:
            int r9 = r9 + 1
            goto L102
        L155:
            r2 = r10
        L156:
            r1 = r16
            goto L1ca
        L15a:
            r17 = r13
            r2 = -1
            r6 = 0
            java.util.WeakHashMap r5 = defpackage.ja0.a
            int r5 = defpackage.t90.d(r10)
            r7 = r17
            if (r5 != r7) goto L16a
            r5 = 1
            goto L16b
        L16a:
            r5 = r6
        L16b:
            r9.getClass()
            int r7 = r4.c
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r7)
            r10 = r6
        L176:
            if (r10 >= r7) goto L184
            java.lang.Object[] r12 = r4.b
            r12 = r12[r10]
            j0 r12 = (defpackage.j0) r12
            r9.add(r12)
            int r10 = r10 + 1
            goto L176
        L184:
            sk r7 = new sk
            r7.<init>(r8, r5)
            java.util.Collections.sort(r9, r7)
            r7 = 1
            if (r1 == r7) goto L1af
            if (r1 != r11) goto L1a7
            int r1 = r9.size()
            if (r3 != 0) goto L199
            r10 = r2
            goto L19d
        L199:
            int r10 = r9.lastIndexOf(r3)
        L19d:
            int r10 = r10 + r7
            if (r10 >= r1) goto L1a5
            java.lang.Object r7 = r9.get(r10)
            goto L1c5
        L1a5:
            r7 = 0
            goto L1c5
        L1a7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}."
            r1.<init>(r2)
            throw r1
        L1af:
            int r1 = r9.size()
            if (r3 != 0) goto L1b8
        L1b5:
            r17 = 1
            goto L1bd
        L1b8:
            int r1 = r9.indexOf(r3)
            goto L1b5
        L1bd:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L1a5
            java.lang.Object r7 = r9.get(r1)
        L1c5:
            r16 = r7
            j0 r16 = (defpackage.j0) r16
            goto L156
        L1ca:
            if (r1 != 0) goto L1cf
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L1e4
        L1cf:
            r5 = r6
        L1d0:
            int r3 = r4.c
            if (r5 >= r3) goto L1df
            java.lang.Object[] r3 = r4.b
            r3 = r3[r5]
            if (r3 != r1) goto L1dc
            r12 = r5
            goto L1e0
        L1dc:
            int r5 = r5 + 1
            goto L1d0
        L1df:
            r12 = r2
        L1e0:
            int[] r1 = r4.a
            r6 = r1[r12]
        L1e4:
            boolean r1 = r0.o(r6)
            return r1
    }

    public final defpackage.j0 n(int r7) {
            r6 = this;
            r0 = -1
            if (r7 != r0) goto L4a
            com.google.android.material.chip.Chip r7 = r6.i
            android.view.accessibility.AccessibilityNodeInfo r0 = android.view.accessibility.AccessibilityNodeInfo.obtain(r7)
            j0 r1 = new j0
            r1.<init>(r0)
            java.util.WeakHashMap r2 = defpackage.ja0.a
            r7.onInitializeAccessibilityNodeInfo(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r6.l(r2)
            int r0 = r0.getChildCount()
            if (r0 <= 0) goto L30
            int r0 = r2.size()
            if (r0 > 0) goto L28
            goto L30
        L28:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r0 = "Views cannot have both real and virtual children"
            r7.<init>(r0)
            throw r7
        L30:
            int r0 = r2.size()
            r3 = 0
        L35:
            if (r3 >= r0) goto L49
            java.lang.Object r4 = r2.get(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            android.view.accessibility.AccessibilityNodeInfo r5 = r1.a
            r5.addChild(r7, r4)
            int r3 = r3 + 1
            goto L35
        L49:
            return r1
        L4a:
            j0 r7 = r6.k(r7)
            return r7
    }

    public final boolean o(int r3) {
            r2 = this;
            com.google.android.material.chip.Chip r0 = r2.i
            boolean r1 = r0.isFocused()
            if (r1 != 0) goto Lf
            boolean r0 = r0.requestFocus()
            if (r0 != 0) goto Lf
            goto L1d
        Lf:
            int r0 = r2.l
            if (r0 != r3) goto L14
            goto L1d
        L14:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L1b
            r2.j(r0)
        L1b:
            if (r3 != r1) goto L1f
        L1d:
            r3 = 0
            return r3
        L1f:
            r2.l = r3
            r0 = 1
            if (r3 != r0) goto L2b
            com.google.android.material.chip.Chip r1 = r2.n
            r1.m = r0
            r1.refreshDrawableState()
        L2b:
            r1 = 8
            r2.p(r3, r1)
            return r0
    }

    public final void p(int r6, int r7) {
            r5 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == r0) goto L8b
            android.view.accessibility.AccessibilityManager r0 = r5.h
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto Le
            goto L8b
        Le:
            com.google.android.material.chip.Chip r0 = r5.i
            android.view.ViewParent r1 = r0.getParent()
            if (r1 != 0) goto L17
            goto L8b
        L17:
            r2 = -1
            if (r6 == r2) goto L81
            android.view.accessibility.AccessibilityEvent r7 = android.view.accessibility.AccessibilityEvent.obtain(r7)
            j0 r2 = r5.n(r6)
            java.util.List r3 = r7.getText()
            java.lang.CharSequence r4 = r2.e()
            r3.add(r4)
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.a
            java.lang.CharSequence r3 = r2.getContentDescription()
            r7.setContentDescription(r3)
            boolean r3 = r2.isScrollable()
            r7.setScrollable(r3)
            boolean r3 = r2.isPassword()
            r7.setPassword(r3)
            boolean r3 = r2.isEnabled()
            r7.setEnabled(r3)
            boolean r3 = r2.isChecked()
            r7.setChecked(r3)
            java.util.List r3 = r7.getText()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L6b
            java.lang.CharSequence r3 = r7.getContentDescription()
            if (r3 == 0) goto L63
            goto L6b
        L63:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r7 = "Callbacks must add text or a content description in populateEventForVirtualViewId()"
            r6.<init>(r7)
            throw r6
        L6b:
            java.lang.CharSequence r2 = r2.getClassName()
            r7.setClassName(r2)
            defpackage.n0.a(r7, r0, r6)
            android.content.Context r6 = r0.getContext()
            java.lang.String r6 = r6.getPackageName()
            r7.setPackageName(r6)
            goto L88
        L81:
            android.view.accessibility.AccessibilityEvent r7 = android.view.accessibility.AccessibilityEvent.obtain(r7)
            r0.onInitializeAccessibilityEvent(r7)
        L88:
            r1.requestSendAccessibilityEvent(r0, r7)
        L8b:
            return
    }
}
