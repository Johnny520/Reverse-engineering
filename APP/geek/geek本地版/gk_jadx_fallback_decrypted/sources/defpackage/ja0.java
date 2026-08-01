package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ja0 {
    public static java.util.WeakHashMap a;
    public static java.lang.reflect.Field b;
    public static boolean c;
    public static final int[] d = null;
    public static final defpackage.o90 e = null;
    public static final defpackage.q90 f = null;

    static {
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 1
            r0.<init>(r1)
            r0 = 0
            defpackage.ja0.a = r0
            r0 = 0
            defpackage.ja0.c = r0
            r0 = 32
            int[] r0 = new int[r0]
            r0 = {x0024: FILL_ARRAY_DATA , data: [2131296272, 2131296273, 2131296284, 2131296295, 2131296298, 2131296299, 2131296300, 2131296301, 2131296302, 2131296303, 2131296274, 2131296275, 2131296276, 2131296277, 2131296278, 2131296279, 2131296280, 2131296281, 2131296282, 2131296283, 2131296285, 2131296286, 2131296287, 2131296288, 2131296289, 2131296290, 2131296291, 2131296292, 2131296293, 2131296294, 2131296296, 2131296297} // fill-array
            defpackage.ja0.d = r0
            o90 r0 = new o90
            r0.<init>()
            defpackage.ja0.e = r0
            q90 r0 = new q90
            r0.<init>()
            defpackage.ja0.f = r0
            return
    }

    public static defpackage.wa0 a(android.view.View r2) {
            java.util.WeakHashMap r0 = defpackage.ja0.a
            if (r0 != 0) goto Lb
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            defpackage.ja0.a = r0
        Lb:
            java.util.WeakHashMap r0 = defpackage.ja0.a
            java.lang.Object r0 = r0.get(r2)
            wa0 r0 = (defpackage.wa0) r0
            if (r0 != 0) goto L1f
            wa0 r0 = new wa0
            r0.<init>(r2)
            java.util.WeakHashMap r1 = defpackage.ja0.a
            r1.put(r2, r0)
        L1f:
            return r0
    }

    public static boolean b(android.view.View r8, android.view.KeyEvent r9) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L8
            goto Lb8
        L8:
            java.util.ArrayList r0 = defpackage.ia0.d
            r0 = 2131296651(0x7f09018b, float:1.8211225E38)
            java.lang.Object r1 = r8.getTag(r0)
            ia0 r1 = (defpackage.ia0) r1
            if (r1 != 0) goto L24
            ia0 r1 = new ia0
            r1.<init>()
            r2 = 0
            r1.a = r2
            r1.b = r2
            r1.c = r2
            r8.setTag(r0, r1)
        L24:
            int r0 = r9.getAction()
            r2 = 1
            if (r0 != 0) goto L8a
            java.util.WeakHashMap r0 = r1.a
            if (r0 == 0) goto L32
            r0.clear()
        L32:
            java.util.ArrayList r0 = defpackage.ia0.d
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L3b
            goto L8a
        L3b:
            monitor-enter(r0)
            java.util.WeakHashMap r3 = r1.a     // Catch: java.lang.Throwable -> L48
            if (r3 != 0) goto L4a
            java.util.WeakHashMap r3 = new java.util.WeakHashMap     // Catch: java.lang.Throwable -> L48
            r3.<init>()     // Catch: java.lang.Throwable -> L48
            r1.a = r3     // Catch: java.lang.Throwable -> L48
            goto L4a
        L48:
            r8 = move-exception
            goto L88
        L4a:
            int r3 = r0.size()     // Catch: java.lang.Throwable -> L48
            int r3 = r3 - r2
        L4f:
            if (r3 < 0) goto L86
            java.util.ArrayList r4 = defpackage.ia0.d     // Catch: java.lang.Throwable -> L48
            java.lang.Object r5 = r4.get(r3)     // Catch: java.lang.Throwable -> L48
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5     // Catch: java.lang.Throwable -> L48
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L48
            android.view.View r5 = (android.view.View) r5     // Catch: java.lang.Throwable -> L48
            if (r5 != 0) goto L65
            r4.remove(r3)     // Catch: java.lang.Throwable -> L48
            goto L83
        L65:
            java.util.WeakHashMap r4 = r1.a     // Catch: java.lang.Throwable -> L48
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L48
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> L48
            android.view.ViewParent r4 = r5.getParent()     // Catch: java.lang.Throwable -> L48
        L70:
            boolean r5 = r4 instanceof android.view.View     // Catch: java.lang.Throwable -> L48
            if (r5 == 0) goto L83
            java.util.WeakHashMap r5 = r1.a     // Catch: java.lang.Throwable -> L48
            r6 = r4
            android.view.View r6 = (android.view.View) r6     // Catch: java.lang.Throwable -> L48
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L48
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L48
            android.view.ViewParent r4 = r4.getParent()     // Catch: java.lang.Throwable -> L48
            goto L70
        L83:
            int r3 = r3 + (-1)
            goto L4f
        L86:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            goto L8a
        L88:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            throw r8
        L8a:
            android.view.View r8 = r1.a(r8)
            int r0 = r9.getAction()
            if (r0 != 0) goto Lb5
            int r9 = r9.getKeyCode()
            if (r8 == 0) goto Lb5
            boolean r0 = android.view.KeyEvent.isModifierKey(r9)
            if (r0 != 0) goto Lb5
            android.util.SparseArray r0 = r1.b
            if (r0 != 0) goto Lab
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.b = r0
        Lab:
            android.util.SparseArray r0 = r1.b
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r8)
            r0.put(r9, r1)
        Lb5:
            if (r8 == 0) goto Lb8
            return r2
        Lb8:
            r8 = 0
            return r8
    }

    public static android.view.View.AccessibilityDelegate c(android.view.View r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            android.view.View$AccessibilityDelegate r3 = defpackage.da0.a(r3)
            return r3
        Lb:
            boolean r0 = defpackage.ja0.c
            if (r0 == 0) goto L10
            goto L35
        L10:
            java.lang.reflect.Field r0 = defpackage.ja0.b
            r1 = 1
            if (r0 != 0) goto L26
            java.lang.Class<android.view.View> r0 = android.view.View.class
            java.lang.String r2 = "mAccessibilityDelegate"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L23
            defpackage.ja0.b = r0     // Catch: java.lang.Throwable -> L23
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L23
            goto L26
        L23:
            defpackage.ja0.c = r1
            goto L35
        L26:
            java.lang.reflect.Field r0 = defpackage.ja0.b     // Catch: java.lang.Throwable -> L33
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L33
            boolean r0 = r3 instanceof android.view.View.AccessibilityDelegate     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L35
            android.view.View$AccessibilityDelegate r3 = (android.view.View.AccessibilityDelegate) r3     // Catch: java.lang.Throwable -> L33
            return r3
        L33:
            defpackage.ja0.c = r1
        L35:
            r3 = 0
            return r3
    }

    public static java.lang.CharSequence d(android.view.View r2) {
            r0 = 28
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r0) goto Lb
            java.lang.CharSequence r2 = defpackage.ca0.b(r2)
            goto L1c
        Lb:
            r0 = 2131296644(0x7f090184, float:1.821121E38)
            java.lang.Object r2 = r2.getTag(r0)
            java.lang.Class<java.lang.CharSequence> r0 = java.lang.CharSequence.class
            boolean r0 = r0.isInstance(r2)
            if (r0 == 0) goto L1b
            goto L1c
        L1b:
            r2 = 0
        L1c:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            return r2
    }

    public static java.util.ArrayList e(android.view.View r2) {
            r0 = 2131296641(0x7f090181, float:1.8211204E38)
            java.lang.Object r1 = r2.getTag(r0)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            if (r1 != 0) goto L13
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.setTag(r0, r1)
        L13:
            return r1
    }

    public static java.lang.String[] f(defpackage.w3 r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lb
            java.lang.String[] r2 = defpackage.fa0.a(r2)
            return r2
        Lb:
            r0 = 2131296647(0x7f090187, float:1.8211217E38)
            java.lang.Object r2 = r2.getTag(r0)
            java.lang.String[] r2 = (java.lang.String[]) r2
            return r2
    }

    public static void g(android.view.View r5, int r6) {
            android.content.Context r0 = r5.getContext()
            java.lang.String r1 = "accessibility"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            boolean r1 = r0.isEnabled()
            if (r1 != 0) goto L13
            goto L7e
        L13:
            java.lang.CharSequence r1 = d(r5)
            r2 = 1
            if (r1 == 0) goto L28
            boolean r1 = r5.isShown()
            if (r1 == 0) goto L28
            int r1 = r5.getWindowVisibility()
            if (r1 != 0) goto L28
            r1 = r2
            goto L29
        L28:
            r1 = 0
        L29:
            int r3 = defpackage.v90.a(r5)
            r4 = 32
            if (r3 != 0) goto L7f
            if (r1 == 0) goto L34
            goto L7f
        L34:
            if (r6 != r4) goto L58
            android.view.accessibility.AccessibilityEvent r1 = android.view.accessibility.AccessibilityEvent.obtain()
            r5.onInitializeAccessibilityEvent(r1)
            r1.setEventType(r4)
            defpackage.v90.g(r1, r6)
            r1.setSource(r5)
            r5.onPopulateAccessibilityEvent(r1)
            java.util.List r6 = r1.getText()
            java.lang.CharSequence r5 = d(r5)
            r6.add(r5)
            r0.sendAccessibilityEvent(r1)
            return
        L58:
            android.view.ViewParent r0 = r5.getParent()
            if (r0 == 0) goto L7e
            android.view.ViewParent r0 = r5.getParent()
            defpackage.v90.e(r0, r5, r5, r6)     // Catch: java.lang.AbstractMethodError -> L66
            return
        L66:
            r6 = move-exception
            android.view.ViewParent r5 = r5.getParent()
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getSimpleName()
            java.lang.String r0 = " does not fully implement ViewParent"
            java.lang.String r5 = r5.concat(r0)
            java.lang.String r0 = "ViewCompat"
            android.util.Log.e(r0, r5, r6)
        L7e:
            return
        L7f:
            android.view.accessibility.AccessibilityEvent r0 = android.view.accessibility.AccessibilityEvent.obtain()
            if (r1 == 0) goto L86
            goto L88
        L86:
            r4 = 2048(0x800, float:2.87E-42)
        L88:
            r0.setEventType(r4)
            defpackage.v90.g(r0, r6)
            if (r1 == 0) goto Lc0
            java.util.List r6 = r0.getText()
            java.lang.CharSequence r1 = d(r5)
            r6.add(r1)
            int r6 = defpackage.s90.c(r5)
            if (r6 != 0) goto La4
            defpackage.s90.s(r5, r2)
        La4:
            android.view.ViewParent r6 = r5.getParent()
        La8:
            boolean r1 = r6 instanceof android.view.View
            if (r1 == 0) goto Lc0
            r1 = r6
            android.view.View r1 = (android.view.View) r1
            int r1 = defpackage.s90.c(r1)
            r2 = 4
            if (r1 != r2) goto Lbb
            r6 = 2
            defpackage.s90.s(r5, r6)
            goto Lc0
        Lbb:
            android.view.ViewParent r6 = r6.getParent()
            goto La8
        Lc0:
            r5.sendAccessibilityEventUnchecked(r0)
            return
    }

    public static defpackage.cd h(android.view.View r3, defpackage.cd r4) {
            r0 = 3
            java.lang.String r1 = "ViewCompat"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L3b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "performReceiveContent: "
            r0.<init>(r2)
            r0.append(r4)
            java.lang.String r2 = ", view="
            r0.append(r2)
            java.lang.Class r2 = r3.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r0.append(r2)
            java.lang.String r2 = "["
            r0.append(r2)
            int r2 = r3.getId()
            r0.append(r2)
            java.lang.String r2 = "]"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L3b:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L46
            cd r3 = defpackage.fa0.b(r3, r4)
            return r3
        L46:
            r0 = 2131296646(0x7f090186, float:1.8211215E38)
            java.lang.Object r0 = r3.getTag(r0)
            ax r0 = (defpackage.ax) r0
            o90 r1 = defpackage.ja0.e
            if (r0 == 0) goto L69
            p60 r0 = (defpackage.p60) r0
            cd r4 = r0.a(r3, r4)
            if (r4 != 0) goto L5d
            r3 = 0
            return r3
        L5d:
            boolean r0 = r3 instanceof defpackage.bx
            if (r0 == 0) goto L64
            r1 = r3
            bx r1 = (defpackage.bx) r1
        L64:
            cd r3 = r1.a(r4)
            return r3
        L69:
            boolean r0 = r3 instanceof defpackage.bx
            if (r0 == 0) goto L70
            r1 = r3
            bx r1 = (defpackage.bx) r1
        L70:
            cd r3 = r1.a(r4)
            return r3
    }

    public static void i(android.view.View r2, int r3) {
            java.util.ArrayList r2 = e(r2)
            r0 = 0
        L5:
            int r1 = r2.size()
            if (r0 >= r1) goto L1e
            java.lang.Object r1 = r2.get(r0)
            h0 r1 = (defpackage.h0) r1
            int r1 = r1.a()
            if (r1 != r3) goto L1b
            r2.remove(r0)
            return
        L1b:
            int r0 = r0 + 1
            goto L5
        L1e:
            return
    }

    public static void j(android.view.View r6, defpackage.h0 r7, defpackage.v0 r8) {
            h0 r0 = new h0
            int r2 = r7.b
            java.lang.Class r5 = r7.c
            r1 = 0
            r3 = 0
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            android.view.View$AccessibilityDelegate r7 = c(r6)
            if (r7 != 0) goto L14
            r7 = 0
            goto L23
        L14:
            boolean r8 = r7 instanceof defpackage.v
            if (r8 == 0) goto L1d
            v r7 = (defpackage.v) r7
            x r7 = r7.a
            goto L23
        L1d:
            x r8 = new x
            r8.<init>(r7)
            r7 = r8
        L23:
            if (r7 != 0) goto L2a
            x r7 = new x
            r7.<init>()
        L2a:
            l(r6, r7)
            int r7 = r0.a()
            i(r6, r7)
            java.util.ArrayList r7 = e(r6)
            r7.add(r0)
            r7 = 0
            g(r6, r7)
            return
    }

    public static void k(android.view.View r9, android.content.Context r10, int[] r11, android.util.AttributeSet r12, android.content.res.TypedArray r13, int r14) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L10
            r8 = 0
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            defpackage.da0.c(r2, r3, r4, r5, r6, r7, r8)
        L10:
            return
    }

    public static void l(android.view.View r1, defpackage.x r2) {
            if (r2 != 0) goto Lf
            android.view.View$AccessibilityDelegate r0 = c(r1)
            boolean r0 = r0 instanceof defpackage.v
            if (r0 == 0) goto Lf
            x r2 = new x
            r2.<init>()
        Lf:
            if (r2 != 0) goto L13
            r2 = 0
            goto L15
        L13:
            v r2 = r2.b
        L15:
            r1.setAccessibilityDelegate(r2)
            return
    }

    public static void m(android.view.View r6, java.lang.CharSequence r7) {
            p90 r0 = new p90
            r4 = 28
            r5 = 1
            r1 = 2131296644(0x7f090184, float:1.821121E38)
            java.lang.Class<java.lang.CharSequence> r2 = java.lang.CharSequence.class
            r3 = 8
            r0.<init>(r1, r2, r3, r4, r5)
            r0.d(r6, r7)
            q90 r0 = defpackage.ja0.f
            if (r7 == 0) goto L3f
            java.util.WeakHashMap r7 = r0.a
            boolean r1 = r6.isShown()
            if (r1 == 0) goto L26
            int r1 = r6.getWindowVisibility()
            if (r1 != 0) goto L26
            r1 = 1
            goto L27
        L26:
            r1 = 0
        L27:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r7.put(r6, r1)
            r6.addOnAttachStateChangeListener(r0)
            boolean r7 = defpackage.v90.b(r6)
            if (r7 == 0) goto L3e
            android.view.ViewTreeObserver r6 = r6.getViewTreeObserver()
            r6.addOnGlobalLayoutListener(r0)
        L3e:
            return
        L3f:
            java.util.WeakHashMap r7 = r0.a
            r7.remove(r6)
            r6.removeOnAttachStateChangeListener(r0)
            android.view.ViewTreeObserver r6 = r6.getViewTreeObserver()
            defpackage.s90.o(r6, r0)
            return
    }
}
