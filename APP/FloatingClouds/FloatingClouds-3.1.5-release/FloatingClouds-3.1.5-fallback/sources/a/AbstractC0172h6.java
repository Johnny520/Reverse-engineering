package a;

/* JADX INFO: renamed from: a.h6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0172h6 extends a.C {
    public static final android.graphics.Rect n = null;
    public static final a.AbstractC0172h6.a o = null;
    public static final a.AbstractC0172h6.b p = null;
    public final android.graphics.Rect d;
    public final android.graphics.Rect e;
    public final android.graphics.Rect f;
    public final int[] g;
    public final android.view.accessibility.AccessibilityManager h;
    public final com.google.android.material.chip.Chip i;
    public a.AbstractC0172h6.c j;
    public int k;
    public int l;
    public int m;

    /* JADX INFO: renamed from: a.h6$a */
    public class a {
    }

    /* JADX INFO: renamed from: a.h6$b */
    public class b {
    }

    /* JADX INFO: renamed from: a.h6$c */
    public class c extends a.J {
        public final /* synthetic */ a.AbstractC0172h6 b;

        public c(a.AbstractC0172h6 r1) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                return
        }

        @Override // a.J
        public final a.I a(int r2) {
                r1 = this;
                a.h6 r0 = r1.b
                a.I r2 = r0.n(r2)
                android.view.accessibility.AccessibilityNodeInfo r2 = r2.f118a
                android.view.accessibility.AccessibilityNodeInfo r2 = android.view.accessibility.AccessibilityNodeInfo.obtain(r2)
                a.I r0 = new a.I
                r0.<init>(r2)
                return r0
        }

        @Override // a.J
        public final a.I b(int r3) {
                r2 = this;
                r0 = 2
                a.h6 r1 = r2.b
                if (r3 != r0) goto L8
                int r3 = r1.k
                goto La
            L8:
                int r3 = r1.l
            La:
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r3 != r0) goto L10
                r3 = 0
                return r3
            L10:
                a.I r3 = r2.a(r3)
                return r3
        }

        @Override // a.J
        public final boolean c(int r7, int r8, android.os.Bundle r9) {
                r6 = this;
                a.h6 r0 = r6.b
                com.google.android.material.chip.Chip r1 = r0.i
                r2 = -1
                if (r7 == r2) goto L84
                r9 = 1
                if (r8 == r9) goto L7f
                r2 = 2
                if (r8 == r2) goto L7a
                r2 = 64
                r3 = 65536(0x10000, float:9.1835E-41)
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                r5 = 0
                if (r8 == r2) goto L4e
                r2 = 128(0x80, float:1.8E-43)
                if (r8 == r2) goto L40
                com.google.android.material.chip.Chip$b r0 = (com.google.android.material.chip.Chip.b) r0
                r1 = 16
                if (r8 != r1) goto L3f
                com.google.android.material.chip.Chip r8 = r0.q
                if (r7 != 0) goto L29
                boolean r7 = r8.performClick()
                return r7
            L29:
                if (r7 != r9) goto L3f
                r8.playSoundEffect(r5)
                android.view.View$OnClickListener r7 = r8.h
                if (r7 == 0) goto L36
                r7.onClick(r8)
                r5 = r9
            L36:
                boolean r7 = r8.s
                if (r7 == 0) goto L3f
                com.google.android.material.chip.Chip$b r7 = r8.r
                r7.q(r9, r9)
            L3f:
                return r5
            L40:
                int r8 = r0.k
                if (r8 != r7) goto L4d
                r0.k = r4
                r1.invalidate()
                r0.q(r7, r3)
                return r9
            L4d:
                return r5
            L4e:
                android.view.accessibility.AccessibilityManager r8 = r0.h
                boolean r2 = r8.isEnabled()
                if (r2 == 0) goto L79
                boolean r8 = r8.isTouchExplorationEnabled()
                if (r8 != 0) goto L5d
                goto L79
            L5d:
                int r8 = r0.k
                if (r8 == r7) goto L79
                if (r8 == r4) goto L6d
                r0.k = r4
                com.google.android.material.chip.Chip r2 = r0.i
                r2.invalidate()
                r0.q(r8, r3)
            L6d:
                r0.k = r7
                r1.invalidate()
                r8 = 32768(0x8000, float:4.5918E-41)
                r0.q(r7, r8)
                return r9
            L79:
                return r5
            L7a:
                boolean r7 = r0.j(r7)
                return r7
            L7f:
                boolean r7 = r0.p(r7)
                return r7
            L84:
                java.util.WeakHashMap<android.view.View, a.Jg> r7 = a.C0414ug.f721a
                boolean r7 = r1.performAccessibilityAction(r8, r9)
                return r7
        }
    }

    static {
            android.graphics.Rect r0 = new android.graphics.Rect
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.<init>(r1, r1, r2, r2)
            a.AbstractC0172h6.n = r0
            a.h6$a r0 = new a.h6$a
            r0.<init>()
            a.AbstractC0172h6.o = r0
            a.h6$b r0 = new a.h6$b
            r0.<init>()
            a.AbstractC0172h6.p = r0
            return
    }

    public AbstractC0172h6(com.google.android.material.chip.Chip r3) {
            r2 = this;
            r2.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.d = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.e = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.f = r0
            r0 = 2
            int[] r0 = new int[r0]
            r2.g = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.k = r0
            r2.l = r0
            r2.m = r0
            r2.i = r3
            android.content.Context r0 = r3.getContext()
            java.lang.String r1 = "accessibility"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            r2.h = r0
            r0 = 1
            r3.setFocusable(r0)
            java.util.WeakHashMap<android.view.View, a.Jg> r1 = a.C0414ug.f721a
            int r1 = r3.getImportantForAccessibility()
            if (r1 != 0) goto L44
            r3.setImportantForAccessibility(r0)
        L44:
            return
    }

    @Override // a.C
    public final a.J b(android.view.View r1) {
            r0 = this;
            a.h6$c r1 = r0.j
            if (r1 != 0) goto Lb
            a.h6$c r1 = new a.h6$c
            r1.<init>(r0)
            r0.j = r1
        Lb:
            a.h6$c r1 = r0.j
            return r1
    }

    @Override // a.C
    public final void d(android.view.View r3, a.I r4) {
            r2 = this;
            android.view.View$AccessibilityDelegate r0 = r2.f36a
            android.view.accessibility.AccessibilityNodeInfo r1 = r4.f118a
            r0.onInitializeAccessibilityNodeInfo(r3, r1)
            r3 = r2
            com.google.android.material.chip.Chip$b r3 = (com.google.android.material.chip.Chip.b) r3
            com.google.android.material.chip.Chip r3 = r3.q
            com.google.android.material.chip.a r0 = r3.e
            if (r0 == 0) goto L16
            boolean r0 = r0.R
            if (r0 == 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            r1.setCheckable(r0)
            boolean r0 = r3.isClickable()
            r1.setClickable(r0)
            java.lang.CharSequence r0 = r3.getAccessibilityClassName()
            r4.h(r0)
            java.lang.CharSequence r3 = r3.getText()
            r1.setText(r3)
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
            r0 = r3
            com.google.android.material.chip.Chip$b r0 = (com.google.android.material.chip.Chip.b) r0
            r2 = 1
            if (r4 != r2) goto L17
            com.google.android.material.chip.Chip r0 = r0.q
            r0.m = r1
            r0.refreshDrawableState()
        L17:
            r0 = 8
            r3.q(r4, r0)
            return r2
    }

    public final a.I k(int r10) {
            r9 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = android.view.accessibility.AccessibilityNodeInfo.obtain()
            a.I r1 = new a.I
            r1.<init>(r0)
            r2 = 1
            r0.setEnabled(r2)
            r0.setFocusable(r2)
            java.lang.String r3 = "android.view.View"
            r1.h(r3)
            android.graphics.Rect r3 = a.AbstractC0172h6.n
            r0.setBoundsInParent(r3)
            r0.setBoundsInScreen(r3)
            com.google.android.material.chip.Chip r4 = r9.i
            r0.setParent(r4)
            r9.o(r10, r1)
            java.lang.CharSequence r5 = r1.g()
            if (r5 != 0) goto L3a
            java.lang.CharSequence r5 = r0.getContentDescription()
            if (r5 == 0) goto L32
            goto L3a
        L32:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            java.lang.String r0 = "Callbacks must add text or a content description in populateNodeForVirtualViewId()"
            r10.<init>(r0)
            throw r10
        L3a:
            android.graphics.Rect r5 = r9.e
            r1.f(r5)
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L119
            int r5 = r0.getActions()
            r6 = r5 & 64
            if (r6 != 0) goto L111
            r6 = 128(0x80, float:1.8E-43)
            r5 = r5 & r6
            if (r5 != 0) goto L109
            android.content.Context r5 = r4.getContext()
            java.lang.String r5 = r5.getPackageName()
            r0.setPackageName(r5)
            r1.b = r10
            r0.setSource(r4, r10)
            int r5 = r9.k
            r7 = 0
            if (r5 != r10) goto L6e
            r0.setAccessibilityFocused(r2)
            r1.a(r6)
            goto L76
        L6e:
            r0.setAccessibilityFocused(r7)
            r5 = 64
            r1.a(r5)
        L76:
            int r5 = r9.l
            if (r5 != r10) goto L7c
            r10 = r2
            goto L7d
        L7c:
            r10 = r7
        L7d:
            if (r10 == 0) goto L84
            r5 = 2
            r1.a(r5)
            goto L8d
        L84:
            boolean r5 = r0.isFocusable()
            if (r5 == 0) goto L8d
            r1.a(r2)
        L8d:
            r0.setFocused(r10)
            int[] r10 = r9.g
            r4.getLocationOnScreen(r10)
            android.graphics.Rect r5 = r9.d
            r0.getBoundsInScreen(r5)
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto Lb4
            r1.f(r5)
            r3 = r10[r7]
            int r6 = r4.getScrollX()
            int r3 = r3 - r6
            r6 = r10[r2]
            int r8 = r4.getScrollY()
            int r6 = r6 - r8
            r5.offset(r3, r6)
        Lb4:
            android.graphics.Rect r3 = r9.f
            boolean r6 = r4.getLocalVisibleRect(r3)
            if (r6 == 0) goto L108
            r6 = r10[r7]
            int r7 = r4.getScrollX()
            int r6 = r6 - r7
            r10 = r10[r2]
            int r7 = r4.getScrollY()
            int r10 = r10 - r7
            r3.offset(r6, r10)
            boolean r10 = r5.intersect(r3)
            if (r10 == 0) goto L108
            r0.setBoundsInScreen(r5)
            boolean r10 = r5.isEmpty()
            if (r10 == 0) goto Ldd
            goto L108
        Ldd:
            int r10 = r4.getWindowVisibility()
            if (r10 == 0) goto Le4
            goto L108
        Le4:
            android.view.ViewParent r10 = r4.getParent()
        Le8:
            boolean r3 = r10 instanceof android.view.View
            if (r3 == 0) goto L103
            android.view.View r10 = (android.view.View) r10
            float r3 = r10.getAlpha()
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L108
            int r3 = r10.getVisibility()
            if (r3 == 0) goto Lfe
            goto L108
        Lfe:
            android.view.ViewParent r10 = r10.getParent()
            goto Le8
        L103:
            if (r10 == 0) goto L108
            r0.setVisibleToUser(r2)
        L108:
            return r1
        L109:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            java.lang.String r0 = "Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()"
            r10.<init>(r0)
            throw r10
        L111:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            java.lang.String r0 = "Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()"
            r10.<init>(r0)
            throw r10
        L119:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            java.lang.String r0 = "Callbacks must set parent bounds in populateNodeForVirtualViewId()"
            r10.<init>(r0)
            throw r10
    }

    public abstract void l(java.util.ArrayList r1);

    public final boolean m(int r21, android.graphics.Rect r22) {
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = 1
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.l(r4)
            a.oe r5 = new a.oe
            r5.<init>()
            r7 = 0
        L15:
            int r8 = r4.size()
            if (r7 >= r8) goto L38
            java.lang.Object r8 = r4.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            a.I r8 = r0.k(r8)
            java.lang.Object r9 = r4.get(r7)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r5.c(r9, r8)
            int r7 = r7 + r3
            goto L15
        L38:
            int r4 = r0.l
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 0
            if (r4 != r7) goto L41
            r4 = r8
            goto L47
        L41:
            java.lang.Object r4 = r5.b(r4, r8)
            a.I r4 = (a.I) r4
        L47:
            a.h6$a r9 = a.AbstractC0172h6.o
            a.h6$b r10 = a.AbstractC0172h6.p
            com.google.android.material.chip.Chip r11 = r0.i
            r12 = 2
            if (r1 == r3) goto L15f
            if (r1 == r12) goto L15f
            r12 = 130(0x82, float:1.82E-43)
            r14 = 66
            r15 = 33
            r8 = 17
            if (r1 == r8) goto L62
            if (r1 == r15) goto L62
            if (r1 == r14) goto L62
            if (r1 != r12) goto L65
        L62:
            r17 = r3
            goto L6d
        L65:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r1
        L6d:
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            int r6 = r0.l
            java.lang.String r13 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            if (r6 == r7) goto L82
            a.I r2 = r0.n(r6)
            r2.f(r3)
        L7f:
            r19 = -1
            goto Lbb
        L82:
            if (r2 == 0) goto L88
            r3.set(r2)
            goto L7f
        L88:
            int r2 = r11.getWidth()
            int r6 = r11.getHeight()
            if (r1 == r8) goto Lb5
            if (r1 == r15) goto Lae
            if (r1 == r14) goto La6
            if (r1 != r12) goto La0
            r6 = -1
            r11 = 0
            r3.set(r11, r6, r2, r6)
            r19 = r6
            goto Lbb
        La0:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r13)
            throw r1
        La6:
            r2 = -1
            r11 = 0
            r3.set(r2, r11, r2, r6)
            r19 = r2
            goto Lbb
        Lae:
            r11 = 0
            r19 = -1
            r3.set(r11, r6, r2, r6)
            goto Lbb
        Lb5:
            r11 = 0
            r19 = -1
            r3.set(r2, r11, r2, r6)
        Lbb:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r3)
            if (r1 == r8) goto Lf1
            if (r1 == r15) goto Le6
            if (r1 == r14) goto Lda
            if (r1 != r12) goto Ld4
            int r6 = r3.height()
            int r6 = r6 + 1
            int r6 = -r6
            r8 = 0
            r2.offset(r8, r6)
            goto Lfb
        Ld4:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r13)
            throw r1
        Lda:
            r8 = 0
            int r6 = r3.width()
            int r6 = r6 + 1
            int r6 = -r6
            r2.offset(r6, r8)
            goto Lfb
        Le6:
            r8 = 0
            int r6 = r3.height()
            int r6 = r6 + 1
            r2.offset(r8, r6)
            goto Lfb
        Lf1:
            r8 = 0
            int r6 = r3.width()
            int r6 = r6 + 1
            r2.offset(r6, r8)
        Lfb:
            r10.getClass()
            int r6 = r5.c
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>()
            r11 = r8
            r16 = 0
        L108:
            if (r11 >= r6) goto L15b
            java.lang.Object[] r12 = r5.b
            r12 = r12[r11]
            a.I r12 = (a.I) r12
            if (r12 != r4) goto L113
            goto L158
        L113:
            r9.getClass()
            r12.f(r10)
            boolean r13 = a.J6.c(r1, r3, r10)
            if (r13 != 0) goto L120
            goto L158
        L120:
            boolean r13 = a.J6.c(r1, r3, r2)
            if (r13 != 0) goto L127
            goto L153
        L127:
            boolean r13 = a.J6.a(r1, r3, r10, r2)
            if (r13 == 0) goto L12e
            goto L153
        L12e:
            boolean r13 = a.J6.a(r1, r3, r2, r10)
            if (r13 == 0) goto L135
            goto L158
        L135:
            int r13 = a.J6.d(r1, r3, r10)
            int r14 = a.J6.e(r1, r3, r10)
            int r15 = r13 * 13
            int r15 = r15 * r13
            int r14 = r14 * r14
            int r14 = r14 + r15
            int r13 = a.J6.d(r1, r3, r2)
            int r15 = a.J6.e(r1, r3, r2)
            int r18 = r13 * 13
            int r18 = r18 * r13
            int r15 = r15 * r15
            int r15 = r15 + r18
            if (r14 >= r15) goto L158
        L153:
            r2.set(r10)
            r16 = r12
        L158:
            int r11 = r11 + 1
            goto L108
        L15b:
            r1 = r16
            goto L1d3
        L15f:
            r17 = r3
            r8 = 0
            r19 = -1
            java.util.WeakHashMap<android.view.View, a.Jg> r2 = a.C0414ug.f721a
            int r2 = r11.getLayoutDirection()
            r3 = r17
            if (r2 != r3) goto L170
            r2 = 1
            goto L171
        L170:
            r2 = r8
        L171:
            r10.getClass()
            int r3 = r5.c
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r3)
            r11 = r8
        L17c:
            if (r11 >= r3) goto L18a
            java.lang.Object[] r10 = r5.b
            r10 = r10[r11]
            a.I r10 = (a.I) r10
            r6.add(r10)
            r10 = 1
            int r11 = r11 + r10
            goto L17c
        L18a:
            r10 = 1
            a.J6$a r3 = new a.J6$a
            r3.<init>(r2, r9)
            java.util.Collections.sort(r6, r3)
            if (r1 == r10) goto L1b9
            if (r1 != r12) goto L1b1
            int r1 = r6.size()
            if (r4 != 0) goto L1a0
            r2 = r19
            goto L1a4
        L1a0:
            int r2 = r6.lastIndexOf(r4)
        L1a4:
            int r2 = r2 + r10
            if (r2 >= r1) goto L1ae
            java.lang.Object r1 = r6.get(r2)
        L1ab:
            r16 = r1
            goto L1d0
        L1ae:
            r16 = 0
            goto L1d0
        L1b1:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}."
            r1.<init>(r2)
            throw r1
        L1b9:
            int r1 = r6.size()
            if (r4 != 0) goto L1c2
        L1bf:
            r17 = 1
            goto L1c7
        L1c2:
            int r1 = r6.indexOf(r4)
            goto L1bf
        L1c7:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L1ae
            java.lang.Object r1 = r6.get(r1)
            goto L1ab
        L1d0:
            a.I r16 = (a.I) r16
            goto L15b
        L1d3:
            if (r1 != 0) goto L1d6
            goto L1ee
        L1d6:
            r6 = r8
        L1d7:
            int r2 = r5.c
            if (r6 >= r2) goto L1e8
            java.lang.Object[] r2 = r5.b
            r2 = r2[r6]
            if (r2 != r1) goto L1e3
            r13 = r6
            goto L1ea
        L1e3:
            r17 = 1
            int r6 = r6 + 1
            goto L1d7
        L1e8:
            r13 = r19
        L1ea:
            int[] r1 = r5.f627a
            r7 = r1[r13]
        L1ee:
            boolean r1 = r0.p(r7)
            return r1
    }

    public final a.I n(int r7) {
            r6 = this;
            r0 = -1
            if (r7 != r0) goto L4a
            com.google.android.material.chip.Chip r7 = r6.i
            android.view.accessibility.AccessibilityNodeInfo r0 = android.view.accessibility.AccessibilityNodeInfo.obtain(r7)
            a.I r1 = new a.I
            r1.<init>(r0)
            java.util.WeakHashMap<android.view.View, a.Jg> r2 = a.C0414ug.f721a
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
            android.view.accessibility.AccessibilityNodeInfo r5 = r1.f118a
            r5.addChild(r7, r4)
            int r3 = r3 + 1
            goto L35
        L49:
            return r1
        L4a:
            a.I r7 = r6.k(r7)
            return r7
    }

    public abstract void o(int r1, a.I r2);

    public final boolean p(int r3) {
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
            r0 = r2
            com.google.android.material.chip.Chip$b r0 = (com.google.android.material.chip.Chip.b) r0
            r1 = 1
            if (r3 != r1) goto L2e
            com.google.android.material.chip.Chip r0 = r0.q
            r0.m = r1
            r0.refreshDrawableState()
        L2e:
            r0 = 8
            r2.q(r3, r0)
            return r1
    }

    public final void q(int r6, int r7) {
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
            a.I r2 = r5.n(r6)
            java.util.List r3 = r7.getText()
            java.lang.CharSequence r4 = r2.g()
            r3.add(r4)
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.f118a
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
            r7.setSource(r0, r6)
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
