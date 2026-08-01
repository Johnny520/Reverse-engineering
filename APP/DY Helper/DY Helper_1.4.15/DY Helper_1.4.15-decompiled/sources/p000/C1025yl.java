package p000;

/* JADX INFO: renamed from: yl */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1025yl {

    /* JADX INFO: renamed from: α */
    public static final p000.C1025yl f12669 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.atomic.AtomicBoolean f12670 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.atomic.AtomicBoolean f12671 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.concurrent.atomic.AtomicBoolean f12672 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.util.concurrent.atomic.AtomicBoolean f12673 = null;

    /* JADX INFO: renamed from: ζ */
    public static final java.util.Set f12674 = null;

    /* JADX INFO: renamed from: η */
    public static final java.util.Set f12675 = null;

    /* JADX INFO: renamed from: θ */
    public static final java.util.Map f12676 = null;

    /* JADX INFO: renamed from: ι */
    public static final java.lang.ThreadLocal f12677 = null;

    static {
            yl r0 = new yl
            r0.<init>()
            p000.C1025yl.f12669 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.C1025yl.f12670 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.C1025yl.f12671 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.C1025yl.f12672 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.C1025yl.f12673 = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r0.getClass()
            p000.C1025yl.f12674 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r0.getClass()
            p000.C1025yl.f12675 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r0.getClass()
            p000.C1025yl.f12676 = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            p000.C1025yl.f12677 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final void m6923(android.view.View r7, java.lang.String r8) {
            um1 r0 = new um1
            r0.<init>()
            vl r4 = new vl
            r1 = 0
            r4.<init>(r0, r1)
            sm1 r1 = new sm1
            r1.<init>()
            r6 = 0
            r2 = 512(0x200, float:7.17E-43)
            r3 = 12
            r5 = r7
            m6936(r1, r2, r3, r4, r5, r6)
            java.lang.Object r7 = r0.f10912
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 != 0) goto L20
            goto L56
        L20:
            android.view.ViewParent r7 = r7.getParent()
            r0 = 0
        L25:
            boolean r1 = r7 instanceof android.view.View
            if (r1 == 0) goto L52
            r1 = 8
            if (r0 >= r1) goto L52
            boolean r1 = r7 instanceof android.widget.LinearLayout
            if (r1 == 0) goto L49
            java.lang.Class r1 = r7.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.Class<android.widget.LinearLayout> r2 = android.widget.LinearLayout.class
            java.lang.String r2 = r2.getName()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L49
            android.view.View r7 = (android.view.View) r7
        L47:
            r4 = r7
            goto L54
        L49:
            android.view.View r7 = (android.view.View) r7
            android.view.ViewParent r7 = r7.getParent()
            int r0 = r0 + 1
            goto L25
        L52:
            r7 = 0
            goto L47
        L54:
            if (r4 != 0) goto L57
        L56:
            return
        L57:
            ul r3 = new ul
            r7 = 3
            r3.<init>(r7)
            sm1 r0 = new sm1
            r0.<init>()
            r5 = 0
            r1 = 64
            r2 = 4
            m6936(r0, r1, r2, r3, r4, r5)
            m6926(r4, r8)
            return
    }

    /* JADX INFO: renamed from: β */
    public static final void m6924(java.util.LinkedHashMap r12, java.lang.reflect.Method r13) {
            if (r13 != 0) goto L3
            goto L9
        L3:
            boolean r0 = m6928(r13)
            if (r0 != 0) goto La
        L9:
            return
        La:
            r0 = 1
            r13.setAccessible(r0)
            java.lang.Class r1 = r13.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = r13.getName()
            java.lang.String r3 = p000.lz1.m3690(r2, r13)
            java.lang.Class[] r4 = r13.getParameterTypes()
            r4.getClass()
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = r4.length
            r5.<init>(r6)
            int r6 = r4.length
            r7 = 0
        L2d:
            if (r7 >= r6) goto L36
            r8 = r4[r7]
            int r7 = p000.lz1.m3679(r8, r5, r7, r0)
            goto L2d
        L36:
            int r0 = r13.getModifiers()
            java.lang.reflect.Modifier.isStatic(r0)
            r10 = 0
            r11 = 62
            java.lang.String r6 = ","
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r0 = p000.AbstractC0984xh.m6644(r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r4 = "#"
            java.lang.String r5 = "("
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4138(r1, r4, r2, r5, r0)
            java.lang.String r1 = "):"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r12.put(r0, r13)
            return
    }

    /* JADX INFO: renamed from: γ */
    public static java.util.ArrayList m6925(java.util.ArrayList r17) {
            java.util.Iterator r0 = r17.iterator()
        L4:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L15
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            r1.setAccessible(r2)
            goto L4
        L15:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r3 = r17.iterator()
        L23:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L7b
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            java.lang.String r6 = p000.lz1.m3694(r5)
            java.lang.String r7 = r5.getName()
            java.lang.String r8 = p000.lz1.m3690(r7, r5)
            java.lang.Class[] r9 = r5.getParameterTypes()
            r9.getClass()
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = r9.length
            r10.<init>(r11)
            int r11 = r9.length
            r12 = 0
        L4b:
            if (r12 >= r11) goto L54
            r13 = r9[r12]
            int r12 = p000.lz1.m3679(r13, r10, r12, r2)
            goto L4b
        L54:
            int r5 = r5.getModifiers()
            java.lang.reflect.Modifier.isStatic(r5)
            r15 = 0
            r16 = 62
            java.lang.String r11 = ","
            r12 = 0
            r13 = 0
            r14 = 0
            java.lang.String r5 = p000.AbstractC0984xh.m6644(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r9 = "#"
            java.lang.String r10 = "("
            java.lang.StringBuilder r5 = p000.AbstractC0602nx.m4138(r6, r9, r7, r10, r5)
            java.lang.String r6 = "):"
            boolean r5 = p000.lz1.m3673(r5, r6, r8, r0)
            if (r5 == 0) goto L23
            r1.add(r4)
            goto L23
        L7b:
            return r1
    }

    /* JADX INFO: renamed from: δ */
    public static void m6926(android.view.View r11, java.lang.String r12) {
            java.lang.ThreadLocal r1 = p000.C1025yl.f12677
            java.lang.Object r0 = r1.get()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r0 = p000.ln0.m3626(r0, r2)
            if (r0 == 0) goto Lf
            return
        Lf:
            java.util.Map r0 = p000.C1025yl.f12676
            java.lang.Object r3 = r0.get(r11)
            if (r3 != 0) goto L37
            wl r4 = new wl
            int r5 = r11.getVisibility()
            float r6 = r11.getAlpha()
            boolean r7 = r11.isEnabled()
            boolean r8 = r11.isClickable()
            boolean r9 = r11.isFocusable()
            int r10 = r11.getImportantForAccessibility()
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.put(r11, r4)
        L37:
            r1.set(r2)
            r0 = 8
            r11.setVisibility(r0)     // Catch: java.lang.Throwable -> L6a
            r0 = 0
            r11.setAlpha(r0)     // Catch: java.lang.Throwable -> L6a
            r0 = 0
            r11.setEnabled(r0)     // Catch: java.lang.Throwable -> L6a
            r11.setClickable(r0)     // Catch: java.lang.Throwable -> L6a
            r11.setFocusable(r0)     // Catch: java.lang.Throwable -> L6a
            r0 = 0
            r11.setOnClickListener(r0)     // Catch: java.lang.Throwable -> L6a
            r0 = 4
            r11.setImportantForAccessibility(r0)     // Catch: java.lang.Throwable -> L6a
            r1.remove()
            java.lang.Class r11 = r11.getClass()
            java.lang.String r11 = r11.getName()
            java.lang.String r0 = "hidden comment keyboard entrance container, reason="
            java.lang.String r1 = ", view="
            java.lang.String r2 = "r931d7e30ef229d29"
            p000.AbstractC0602nx.m4144(r0, r12, r1, r11, r2)
            return
        L6a:
            r0 = move-exception
            r11 = r0
            r1.remove()
            throw r11
    }

    /* JADX INFO: renamed from: ζ */
    public static boolean m6927() {
            java.lang.String r0 = "hide_comment_keyboard_entrance_enabled"
            r1 = 0
            boolean r0 = p000.ui1.m5887(r0, r1)     // Catch: java.lang.Throwable -> Lc
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> Lc
            goto L13
        Lc:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L13:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto L1a
            r0 = r1
        L1a:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    /* JADX INFO: renamed from: η */
    public static boolean m6928(java.lang.reflect.Method r4) {
            int r0 = r4.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            r1 = 0
            if (r0 == 0) goto Lc
            goto L62
        Lc:
            java.lang.Class r0 = r4.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            boolean r0 = p000.ln0.m3626(r0, r2)
            if (r0 != 0) goto L19
            goto L62
        L19:
            java.lang.Class[] r0 = r4.getParameterTypes()
            int r0 = r0.length
            r2 = 2
            if (r0 == r2) goto L22
            goto L62
        L22:
            java.lang.Class[] r0 = r4.getParameterTypes()
            r0 = r0[r1]
            java.lang.Class<android.view.View> r2 = android.view.View.class
            boolean r0 = p000.ln0.m3626(r0, r2)
            if (r0 != 0) goto L31
            goto L62
        L31:
            java.lang.Class[] r0 = r4.getParameterTypes()
            r2 = 1
            r0 = r0[r2]
            java.lang.Class<android.os.Bundle> r3 = android.os.Bundle.class
            boolean r0 = p000.ln0.m3626(r0, r3)
            if (r0 != 0) goto L41
            goto L62
        L41:
            java.lang.Class r4 = r4.getDeclaringClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r0 = "~78BF3716A2F49FBB709742322D9206C6AF9F18144C2A2123893F917FD9A67DE75E87F835F5066DD2C20FA2028DA408323F4FAF162C0F9F8650E8E7270A57AFBA395C73DBE2F9D1A4C5B8"
            java.lang.String r0 = p000.jf0.m2957(r0)
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L63
            java.lang.String r0 = "~78DF588B0EC79FAF9E614C08184F8649CB64E2954C8C7DAB572EB9CAA062808381972FC64C3DABAEB2071701EBE921AE26D62D7F00E3C85643E31111547B42BE1A7D660631EA17BD042F86CB05D259E1A595"
            java.lang.String r0 = p000.jf0.m2957(r0)
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L62
            goto L63
        L62:
            return r1
        L63:
            return r2
    }

    /* JADX INFO: renamed from: θ */
    public static boolean m6929(android.view.View r2) {
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "~79044D353CB554BD2E6921EC694522A26B913DAA69168678EA59C385DC1D8578FBBACD15"
            java.lang.String r1 = p000.jf0.m2957(r1)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L27
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r0 = ".DuxCheckBox"
            r1 = 0
            boolean r2 = p000.x02.m6479(r2, r0, r1)
            if (r2 == 0) goto L26
            goto L27
        L26:
            return r1
        L27:
            r2 = 1
            return r2
    }

    /* JADX INFO: renamed from: ι */
    public static boolean m6930(java.lang.reflect.Method r9) {
            int r0 = r9.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            r1 = 0
            if (r0 == 0) goto Ld
            goto L9f
        Ld:
            java.lang.Class r0 = r9.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            boolean r0 = p000.ln0.m3626(r0, r2)
            if (r0 != 0) goto L1b
            goto L9f
        L1b:
            java.lang.Class[] r0 = r9.getParameterTypes()
            int r0 = r0.length
            r2 = 1
            if (r0 == r2) goto L25
            goto L9f
        L25:
            java.lang.Class[] r0 = r9.getParameterTypes()
            r0 = r0[r1]
            java.lang.Class<android.view.View> r3 = android.view.View.class
            boolean r0 = p000.ln0.m3626(r0, r3)
            if (r0 != 0) goto L35
            goto L9f
        L35:
            java.lang.Class r9 = r9.getDeclaringClass()
            java.lang.reflect.Field[] r9 = r9.getDeclaredFields()
            r9.getClass()
            int r0 = r9.length
            r3 = r1
        L42:
            if (r3 >= r0) goto L5f
            r4 = r9[r3]
            java.lang.Class r4 = r4.getType()
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = "~79044D353CB554BD2E6921EC694522A26B913DAA69168678EA59C385DC1D8578FBBACD15"
            java.lang.String r5 = p000.jf0.m2957(r5)
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L5c
            r0 = r2
            goto L60
        L5c:
            int r3 = r3 + 1
            goto L42
        L5f:
            r0 = r1
        L60:
            int r3 = r9.length
            r4 = r1
            r5 = r4
        L63:
            if (r4 >= r3) goto L80
            r6 = r9[r4]
            java.lang.Class r6 = r6.getType()
            java.lang.String r6 = r6.getName()
            java.lang.String r7 = "~791C379118E47E8B07D05A90B0CB47BAE4B25E3CE56C7556A7BA2B119EDA86273BF6"
            java.lang.String r7 = p000.jf0.m2957(r7)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L7d
            int r5 = r5 + 1
        L7d:
            int r4 = r4 + 1
            goto L63
        L80:
            int r3 = r9.length
            r4 = r1
            r6 = r4
        L83:
            if (r4 >= r3) goto L98
            r7 = r9[r4]
            java.lang.Class r7 = r7.getType()
            java.lang.Class<android.widget.LinearLayout> r8 = android.widget.LinearLayout.class
            boolean r7 = p000.ln0.m3626(r7, r8)
            if (r7 == 0) goto L95
            int r6 = r6 + 1
        L95:
            int r4 = r4 + 1
            goto L83
        L98:
            if (r0 == 0) goto L9f
            if (r5 < r2) goto L9f
            if (r6 < r2) goto L9f
            return r2
        L9f:
            return r1
    }

    /* JADX INFO: renamed from: κ */
    public static java.util.ArrayList m6931(java.lang.ClassLoader r3) {
            java.lang.String r0 = "~78BF3716A2F49FBB709742322D9206C6AF9F18144C2A2123893F917FD9A67DE75E87F835F5066DD2C20FA2028DA408323F4FAF162C0F9F8650E8E7270A57AFBA395C73DBE2F9D1A4C5B8"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.String r1 = "~78DF588B0EC79FAF9E614C08184F8649CB64E2954C8C7DAB572EB9CAA062808381972FC64C3DABAEB2071701EBE921AE26D62D7F00E3C85643E31111547B42BE1A7D660631EA17BD042F86CB05D259E1A595"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Class r2 = p000.qe0.m4877(r3, r2)
            if (r2 == 0) goto L1d
            r1.add(r2)
            goto L1d
        L33:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r1.iterator()
        L3c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5a
            java.lang.Object r1 = r0.next()
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.reflect.Method[] r1 = r1.getDeclaredMethods()
            r1.getClass()
            java.util.List r1 = java.util.Arrays.asList(r1)
            r1.getClass()
            p000.AbstractC0984xh.m6660(r3, r1)
            goto L3c
        L5a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L63:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L7a
            java.lang.Object r1 = r3.next()
            r2 = r1
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            boolean r2 = m6928(r2)
            if (r2 == 0) goto L63
            r0.add(r1)
            goto L63
        L7a:
            java.util.ArrayList r3 = m6925(r0)
            return r3
    }

    /* JADX INFO: renamed from: λ */
    public static java.util.List m6932(java.lang.ClassLoader r5) {
            java.lang.String r0 = "X.C11ER"
            java.lang.Class r5 = p000.qe0.m4877(r5, r0)
            if (r5 != 0) goto Lb
            jz r5 = p000.C0450jz.f5672
            return r5
        Lb:
            java.lang.reflect.Method[] r5 = r5.getDeclaredMethods()
            r5.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r5.length
            r2 = 0
        L19:
            if (r2 >= r1) goto L29
            r3 = r5[r2]
            boolean r4 = m6930(r3)
            if (r4 == 0) goto L26
            r0.add(r3)
        L26:
            int r2 = r2 + 1
            goto L19
        L29:
            java.util.Iterator r5 = r0.iterator()
        L2d:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r5.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            r2 = 1
            r1.setAccessible(r2)
            goto L2d
        L3e:
            return r0
    }

    /* JADX INFO: renamed from: μ */
    public static java.util.List m6933(java.lang.ClassLoader r3, boolean r4) {
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = p000.EnumC0491kx.f6245
            java.util.List r1 = p000.C0666ox.m4323(r0, r3)
            if (r1 == 0) goto L39
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L11
            goto L12
        L11:
            r1 = 0
        L12:
            if (r1 == 0) goto L39
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r1.iterator()
        L1d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r4.next()
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            boolean r1 = m6928(r1)
            if (r1 == 0) goto L1d
            r3.add(r0)
            goto L1d
        L34:
            java.util.ArrayList r3 = m6925(r3)
            return r3
        L39:
            java.util.ArrayList r1 = m6931(r3)
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L49
            if (r4 == 0) goto L48
            p000.C0666ox.m4327(r0, r1)
        L48:
            return r1
        L49:
            if (r4 == 0) goto L86
            java.util.concurrent.atomic.AtomicBoolean r4 = p000.C0666ox.f8305
            boolean r4 = r4.get()
            if (r4 != 0) goto L54
            goto L86
        L54:
            bb r4 = new bb
            r1 = 18
            r4.<init>(r3, r1)
            java.lang.String r1 = "定位评论键盘面板视图初始化入口"
            java.util.List r3 = p000.C0666ox.m4316(r0, r3, r1, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L6a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L81
            java.lang.Object r0 = r3.next()
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            boolean r1 = m6928(r1)
            if (r1 == 0) goto L6a
            r4.add(r0)
            goto L6a
        L81:
            java.util.ArrayList r3 = m6925(r4)
            return r3
        L86:
            jz r3 = p000.C0450jz.f5672
            return r3
    }

    /* JADX INFO: renamed from: ν */
    public static java.util.List m6934(java.lang.ClassLoader r21, boolean r22) {
            r0 = r21
            java.lang.Object r1 = p000.C0666ox.f8297
            kx r1 = p000.EnumC0491kx.f6244
            java.util.List r2 = p000.C0666ox.m4323(r1, r0)
            java.lang.String r3 = "):"
            java.lang.String r4 = "("
            java.lang.String r5 = "#"
            r7 = 1
            if (r2 == 0) goto Lbe
            boolean r8 = r2.isEmpty()
            if (r8 != 0) goto L1a
            goto L1b
        L1a:
            r2 = 0
        L1b:
            if (r2 == 0) goto Lbe
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r2.iterator()
        L26:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r1.next()
            r8 = r2
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            boolean r8 = m6930(r8)
            if (r8 == 0) goto L26
            r0.add(r2)
            goto L26
        L3d:
            java.util.Iterator r1 = r0.iterator()
        L41:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L51
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            r2.setAccessible(r7)
            goto L41
        L51:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L5f:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto Lbd
            java.lang.Object r8 = r0.next()
            r9 = r8
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            java.lang.String r10 = p000.lz1.m3694(r9)
            java.lang.String r11 = r9.getName()
            java.lang.String r12 = p000.lz1.m3690(r11, r9)
            java.lang.Class[] r13 = r9.getParameterTypes()
            r13.getClass()
            java.util.ArrayList r14 = new java.util.ArrayList
            int r15 = r13.length
            r14.<init>(r15)
            int r15 = r13.length
            r6 = 0
        L87:
            if (r6 >= r15) goto L94
            r21 = r0
            r0 = r13[r6]
            int r6 = p000.lz1.m3679(r0, r14, r6, r7)
            r0 = r21
            goto L87
        L94:
            r21 = r0
            int r0 = r9.getModifiers()
            java.lang.reflect.Modifier.isStatic(r0)
            r19 = 0
            r20 = 62
            java.lang.String r15 = ","
            r16 = 0
            r17 = 0
            r18 = 0
            java.lang.String r0 = p000.AbstractC0984xh.m6644(r14, r15, r16, r17, r18, r19, r20)
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4138(r10, r5, r11, r4, r0)
            boolean r0 = p000.lz1.m3673(r0, r3, r12, r1)
            if (r0 == 0) goto Lba
            r2.add(r8)
        Lba:
            r0 = r21
            goto L5f
        Lbd:
            return r2
        Lbe:
            if (r22 == 0) goto L177
            java.util.concurrent.atomic.AtomicBoolean r2 = p000.C0666ox.f8305
            boolean r2 = r2.get()
            if (r2 != 0) goto Lca
            goto L177
        Lca:
            bb r2 = new bb
            r6 = 19
            r2.<init>(r0, r6)
            java.lang.String r6 = "定位评论输入框发布作品预览控件初始化"
            java.util.List r0 = p000.C0666ox.m4316(r1, r0, r6, r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        Le0:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lf7
            java.lang.Object r2 = r0.next()
            r6 = r2
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            boolean r6 = m6930(r6)
            if (r6 == 0) goto Le0
            r1.add(r2)
            goto Le0
        Lf7:
            java.util.Iterator r0 = r1.iterator()
        Lfb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L10b
            java.lang.Object r2 = r0.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            r2.setAccessible(r7)
            goto Lfb
        L10b:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L119:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L176
            java.lang.Object r6 = r1.next()
            r8 = r6
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            java.lang.String r9 = p000.lz1.m3694(r8)
            java.lang.String r10 = r8.getName()
            java.lang.String r11 = p000.lz1.m3690(r10, r8)
            java.lang.Class[] r12 = r8.getParameterTypes()
            r12.getClass()
            java.util.ArrayList r13 = new java.util.ArrayList
            int r14 = r12.length
            r13.<init>(r14)
            int r14 = r12.length
            r15 = 0
        L141:
            if (r15 >= r14) goto L14e
            r21 = r1
            r1 = r12[r15]
            int r15 = p000.lz1.m3679(r1, r13, r15, r7)
            r1 = r21
            goto L141
        L14e:
            r21 = r1
            int r1 = r8.getModifiers()
            java.lang.reflect.Modifier.isStatic(r1)
            r18 = 0
            r19 = 62
            java.lang.String r14 = ","
            r15 = 0
            r16 = 0
            r17 = 0
            java.lang.String r1 = p000.AbstractC0984xh.m6644(r13, r14, r15, r16, r17, r18, r19)
            java.lang.StringBuilder r1 = p000.AbstractC0602nx.m4138(r9, r5, r10, r4, r1)
            boolean r1 = p000.lz1.m3673(r1, r3, r11, r0)
            if (r1 == 0) goto L173
            r2.add(r6)
        L173:
            r1 = r21
            goto L119
        L176:
            return r2
        L177:
            java.util.List r0 = m6932(r0)
            return r0
    }

    /* JADX INFO: renamed from: ξ */
    public static void m6935() {
            java.util.Map r0 = p000.C1025yl.f12676
            monitor-enter(r0)
            java.util.Set r1 = r0.entrySet()     // Catch: java.lang.Throwable -> L35
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L35
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L35
            r3 = 10
            int r3 = p000.AbstractC1021yh.m6889(r1, r3)     // Catch: java.lang.Throwable -> L35
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L35
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L35
        L18:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L35
            if (r3 == 0) goto L37
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L35
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L35
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L35
            l91 r5 = new l91     // Catch: java.lang.Throwable -> L35
            r5.<init>(r4, r3)     // Catch: java.lang.Throwable -> L35
            r2.add(r5)     // Catch: java.lang.Throwable -> L35
            goto L18
        L35:
            r1 = move-exception
            goto L8d
        L37:
            monitor-exit(r0)
            java.lang.ThreadLocal r0 = p000.C1025yl.f12677
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.set(r1)
            java.util.Iterator r0 = r2.iterator()     // Catch: java.lang.Throwable -> L86
        L43:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L86
            if (r1 == 0) goto L76
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L86
            l91 r1 = (p000.l91) r1     // Catch: java.lang.Throwable -> L86
            java.lang.Object r2 = r1.f6502     // Catch: java.lang.Throwable -> L86
            android.view.View r2 = (android.view.View) r2     // Catch: java.lang.Throwable -> L86
            java.lang.Object r1 = r1.f6503     // Catch: java.lang.Throwable -> L86
            wl r1 = (p000.C0951wl) r1     // Catch: java.lang.Throwable -> L86
            int r3 = r1.f11750     // Catch: java.lang.Throwable -> L86
            r2.setVisibility(r3)     // Catch: java.lang.Throwable -> L86
            float r3 = r1.f11751     // Catch: java.lang.Throwable -> L86
            r2.setAlpha(r3)     // Catch: java.lang.Throwable -> L86
            boolean r3 = r1.f11752     // Catch: java.lang.Throwable -> L86
            r2.setEnabled(r3)     // Catch: java.lang.Throwable -> L86
            boolean r3 = r1.f11753     // Catch: java.lang.Throwable -> L86
            r2.setClickable(r3)     // Catch: java.lang.Throwable -> L86
            boolean r3 = r1.f11754     // Catch: java.lang.Throwable -> L86
            r2.setFocusable(r3)     // Catch: java.lang.Throwable -> L86
            int r1 = r1.f11755     // Catch: java.lang.Throwable -> L86
            r2.setImportantForAccessibility(r1)     // Catch: java.lang.Throwable -> L86
            goto L43
        L76:
            java.lang.ThreadLocal r0 = p000.C1025yl.f12677
            r0.remove()
            java.util.Map r0 = p000.C1025yl.f12676
            monitor-enter(r0)
            r0.clear()     // Catch: java.lang.Throwable -> L83
            monitor-exit(r0)
            return
        L83:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L86:
            r0 = move-exception
            java.lang.ThreadLocal r1 = p000.C1025yl.f12677
            r1.remove()
            throw r0
        L8d:
            monitor-exit(r0)
            throw r1
    }

    /* JADX INFO: renamed from: ο */
    public static final void m6936(p000.sm1 r8, int r9, int r10, p000.a80 r11, android.view.View r12, int r13) {
            int r0 = r8.f9967
            if (r0 >= r9) goto L3b
            if (r13 <= r10) goto L7
            goto L3b
        L7:
            int r0 = r0 + 1
            r8.f9967 = r0
            r11.invoke(r12)
            boolean r0 = r12 instanceof android.view.ViewGroup
            if (r0 == 0) goto L3b
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            int r0 = r12.getChildCount()
            r1 = 0
        L19:
            if (r1 >= r0) goto L3b
            android.view.View r6 = r12.getChildAt(r1)
            if (r6 != 0) goto L26
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            goto L34
        L26:
            int r7 = r13 + 1
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            m6936(r2, r3, r4, r5, r6, r7)
            int r8 = r2.f9967
            if (r8 < r3) goto L34
            goto L3b
        L34:
            int r1 = r1 + 1
            r8 = r2
            r9 = r3
            r10 = r4
            r11 = r5
            goto L19
        L3b:
            return
    }

    /* JADX INFO: renamed from: ε */
    public final void m6937(java.lang.ClassLoader r26) {
            r25 = this;
            r1 = r26
            r1.getClass()
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.C1025yl.f12673
            r2 = 0
            r3 = 1
            boolean r0 = r0.compareAndSet(r2, r3)
            java.lang.String r4 = "r931d7e30ef229d29"
            if (r0 != 0) goto L12
            goto L37
        L12:
            ul r0 = new ul     // Catch: java.lang.Throwable -> L21
            r5 = r25
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L21
            java.util.concurrent.CopyOnWriteArrayList r5 = p000.ui1.f10853     // Catch: java.lang.Throwable -> L21
            r5.add(r0)     // Catch: java.lang.Throwable -> L21
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L21
            goto L28
        L21:
            r0 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r0)
            r0 = r5
        L28:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L37
            java.lang.String r0 = r0.getMessage()
            java.lang.String r5 = "config listener skipped: "
            p000.AbstractC0602nx.m4143(r5, r0, r4)
        L37:
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.C1025yl.f12671
            boolean r0 = r0.compareAndSet(r2, r3)
            if (r0 != 0) goto L40
            goto L55
        L40:
            xq0 r0 = p000.xq0.f12253
            xl r5 = new xl
            r6 = 1
            r7 = 0
            r5.<init>(r6, r7)
            java.lang.Class<android.view.ViewStub> r6 = android.view.ViewStub.class
            java.lang.String r7 = "inflate"
            r0.m6774(r6, r7, r5)
            java.lang.String r0 = "hooked ViewStub.inflate"
            p000.C0888ux.m5975(r4, r0)
        L55:
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.C1025yl.f12672
            boolean r0 = r0.compareAndSet(r2, r3)
            java.lang.Class r5 = java.lang.Integer.TYPE
            java.lang.Class<android.view.View> r6 = android.view.View.class
            if (r0 != 0) goto L62
            goto L72
        L62:
            xl r0 = new xl
            r7 = 2
            r8 = 0
            r0.<init>(r7, r8)
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r0}
            java.lang.String r7 = "setVisibility"
            p000.qe0.m4873(r6, r7, r0)
        L72:
            java.util.List r0 = m6934(r1, r2)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r0.iterator()
        L7f:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L1c1
            java.lang.Object r9 = r8.next()
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            java.lang.Class r9 = r9.getDeclaringClass()
            r9.getClass()
            java.lang.reflect.Method[] r10 = r9.getDeclaredMethods()
            r10.getClass()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            int r12 = r10.length
            r13 = r2
        La0:
            if (r13 >= r12) goto Lda
            r14 = r10[r13]
            int r15 = r14.getModifiers()
            boolean r15 = java.lang.reflect.Modifier.isStatic(r15)
            if (r15 != 0) goto Ld3
            java.lang.Class r15 = r14.getReturnType()
            r16 = r2
            java.lang.Class r2 = java.lang.Void.TYPE
            boolean r2 = p000.ln0.m3626(r15, r2)
            if (r2 == 0) goto Ld5
            java.lang.Class[] r2 = r14.getParameterTypes()
            int r2 = r2.length
            if (r2 != r3) goto Ld5
            java.lang.Class[] r2 = r14.getParameterTypes()
            r2 = r2[r16]
            boolean r2 = p000.ln0.m3626(r2, r6)
            if (r2 != 0) goto Ld5
            r11.add(r14)
            goto Ld5
        Ld3:
            r16 = r2
        Ld5:
            int r13 = r13 + 1
            r2 = r16
            goto La0
        Lda:
            r16 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r10 = r11.iterator()
        Le5:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L19c
            java.lang.Object r11 = r10.next()
            r12 = r11
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            java.lang.reflect.Field[] r13 = r9.getDeclaredFields()
            r13.getClass()
            int r14 = r13.length
            r15 = r16
        Lfc:
            if (r15 >= r14) goto L197
            r17 = r13[r15]
            java.lang.Class r17 = r17.getType()
            java.lang.String r3 = r17.getName()
            java.lang.String r17 = "~79044D353CB554BD2E6921EC694522A26B913DAA69168678EA59C385DC1D8578FBBACD15"
            r25 = r6
            java.lang.String r6 = p000.jf0.m2957(r17)
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L18e
            java.lang.Class[] r3 = r12.getParameterTypes()
            r3 = r3[r16]
            r3.getClass()
            java.lang.reflect.Field[] r6 = r3.getDeclaredFields()
            r6.getClass()
            int r12 = r6.length
            r13 = r16
            r14 = r13
        L12a:
            if (r13 >= r12) goto L13d
            r15 = r6[r13]
            java.lang.Class r15 = r15.getType()
            boolean r15 = p000.ln0.m3626(r15, r5)
            if (r15 == 0) goto L13a
            int r14 = r14 + 1
        L13a:
            int r13 = r13 + 1
            goto L12a
        L13d:
            int r12 = r6.length
            r13 = r16
            r15 = r13
        L141:
            if (r13 >= r12) goto L15e
            r17 = r6[r13]
            r18 = r3
            java.lang.Class r3 = r17.getType()
            r17 = r5
            java.lang.Class r5 = java.lang.Boolean.TYPE
            boolean r3 = p000.ln0.m3626(r3, r5)
            if (r3 == 0) goto L157
            int r15 = r15 + 1
        L157:
            int r13 = r13 + 1
            r5 = r17
            r3 = r18
            goto L141
        L15e:
            r18 = r3
            r17 = r5
            java.lang.Class[] r3 = r18.getInterfaces()
            r3.getClass()
            int r5 = r3.length
            r6 = r16
        L16c:
            if (r6 >= r5) goto L184
            r12 = r3[r6]
            java.lang.String r12 = r12.getName()
            java.lang.String r13 = "X.InterfaceC902340ZJl"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L18b
            r12 = 1
            if (r14 < r12) goto L184
            if (r15 < r12) goto L184
            r2.add(r11)
        L184:
            r6 = r25
            r5 = r17
            r3 = 1
            goto Le5
        L18b:
            int r6 = r6 + 1
            goto L16c
        L18e:
            r17 = r5
            int r15 = r15 + 1
            r6 = r25
            r3 = 1
            goto Lfc
        L197:
            r17 = r5
            r25 = r6
            goto L184
        L19c:
            r17 = r5
            r25 = r6
            java.util.Iterator r3 = r2.iterator()
        L1a4:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L1b5
            java.lang.Object r5 = r3.next()
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            r12 = 1
            r5.setAccessible(r12)
            goto L1a4
        L1b5:
            p000.AbstractC0984xh.m6660(r7, r2)
            r6 = r25
            r2 = r16
            r5 = r17
            r3 = 1
            goto L7f
        L1c1:
            r16 = r2
            java.util.ArrayList r0 = p000.AbstractC0984xh.m6651(r0, r7)
            java.util.Iterator r0 = r0.iterator()
        L1cb:
            boolean r2 = r0.hasNext()
            java.lang.String r3 = "):"
            java.lang.String r5 = "("
            java.lang.String r6 = "#"
            if (r2 == 0) goto L24f
            java.lang.Object r2 = r0.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.String r7 = p000.lz1.m3694(r2)
            java.lang.String r8 = r2.getName()
            java.lang.String r9 = p000.lz1.m3690(r8, r2)
            java.lang.Class[] r10 = r2.getParameterTypes()
            r10.getClass()
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = r10.length
            r11.<init>(r12)
            int r12 = r10.length
            r13 = r16
        L1f9:
            if (r13 >= r12) goto L203
            r14 = r10[r13]
            r15 = 1
            int r13 = p000.lz1.m3679(r14, r11, r13, r15)
            goto L1f9
        L203:
            int r10 = r2.getModifiers()
            java.lang.reflect.Modifier.isStatic(r10)
            r23 = 0
            r24 = 62
            java.lang.String r19 = ","
            r20 = 0
            r21 = 0
            r22 = 0
            r18 = r11
            java.lang.String r10 = p000.AbstractC0984xh.m6644(r18, r19, r20, r21, r22, r23, r24)
            java.lang.StringBuilder r5 = p000.AbstractC0602nx.m4138(r7, r6, r8, r5, r10)
            java.lang.String r3 = p000.lz1.m3691(r5, r3, r9)
            java.util.Set r5 = p000.C1025yl.f12675
            boolean r3 = r5.add(r3)
            if (r3 == 0) goto L1cb
            r12 = 1
            r2.setAccessible(r12)
            xq0 r3 = p000.xq0.f12253
            xl r5 = new xl
            r7 = 0
            r8 = 0
            r5.<init>(r7, r8)
            r3.m6775(r2, r5)
            java.lang.Class r3 = r2.getDeclaringClass()
            java.lang.String r3 = r3.getName()
            java.lang.String r2 = r2.getName()
            java.lang.String r5 = "hooked publish preview "
            p000.AbstractC0602nx.m4144(r5, r3, r6, r2, r4)
            goto L1cb
        L24f:
            r2 = r16
            java.util.List r0 = m6933(r1, r2)
            java.util.Iterator r0 = r0.iterator()
        L259:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2d1
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.String r7 = p000.lz1.m3694(r1)
            java.lang.String r8 = r1.getName()
            java.lang.String r9 = p000.lz1.m3690(r8, r1)
            java.lang.Class[] r10 = r1.getParameterTypes()
            r10.getClass()
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = r10.length
            r11.<init>(r12)
            int r12 = r10.length
            r13 = r2
        L280:
            if (r13 >= r12) goto L28a
            r14 = r10[r13]
            r15 = 1
            int r13 = p000.lz1.m3679(r14, r11, r13, r15)
            goto L280
        L28a:
            int r10 = r1.getModifiers()
            java.lang.reflect.Modifier.isStatic(r10)
            r16 = 0
            r17 = 62
            java.lang.String r12 = ","
            r13 = 0
            r14 = 0
            r15 = 0
            java.lang.String r10 = p000.AbstractC0984xh.m6644(r11, r12, r13, r14, r15, r16, r17)
            java.lang.StringBuilder r7 = p000.AbstractC0602nx.m4138(r7, r6, r8, r5, r10)
            java.lang.String r7 = p000.lz1.m3691(r7, r3, r9)
            java.util.Set r8 = p000.C1025yl.f12674
            boolean r7 = r8.add(r7)
            if (r7 != 0) goto L2b0
            r12 = 1
            goto L259
        L2b0:
            r12 = 1
            r1.setAccessible(r12)
            xq0 r7 = p000.xq0.f12253
            fb2 r8 = new fb2
            r9 = 1
            r8.<init>(r9)
            r7.m6775(r1, r8)
            java.lang.Class r7 = r1.getDeclaringClass()
            java.lang.String r7 = r7.getName()
            java.lang.String r1 = r1.getName()
            java.lang.String r8 = "hooked "
            p000.AbstractC0602nx.m4144(r8, r7, r6, r1, r4)
            goto L259
        L2d1:
            return
    }
}
