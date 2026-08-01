package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class q10 {

    /* JADX INFO: renamed from: α */
    public static final p000.q10 f8786 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.atomic.AtomicBoolean f8787 = null;

    /* JADX INFO: renamed from: γ */
    public static final android.os.Handler f8788 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.Map f8789 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.util.Map f8790 = null;

    /* JADX INFO: renamed from: ζ */
    public static volatile java.lang.reflect.Field f8791;

    /* JADX INFO: renamed from: η */
    public static volatile java.lang.reflect.Field f8792;

    static {
            q10 r0 = new q10
            r0.<init>()
            p000.q10.f8786 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.q10.f8787 = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            p000.q10.f8788 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            p000.q10.f8789 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            p000.q10.f8790 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final void m4696(p000.q10 r3, android.view.View r4, android.view.View.OnClickListener r5) {
            r3 = 0
            r0 = r4
        L2:
            r1 = 0
            if (r0 == 0) goto L28
            r2 = 16
            if (r3 > r2) goto L28
            java.util.Map r2 = p000.q10.f8789
            java.lang.Object r2 = r2.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L19
            l91 r1 = new l91
            r1.<init>(r0, r2)
            goto L28
        L19:
            android.view.ViewParent r0 = r0.getParent()
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L24
            android.view.View r0 = (android.view.View) r0
            goto L25
        L24:
            r0 = r1
        L25:
            int r3 = r3 + 1
            goto L2
        L28:
            if (r1 != 0) goto L2b
            goto L39
        L2b:
            java.lang.Object r3 = r1.f6502
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r0 = r1.f6503
            java.lang.String r0 = (java.lang.String) r0
            o10 r0 = m4706(r0, r4, r5, r3)
            if (r0 != 0) goto L3a
        L39:
            return
        L3a:
            m4697(r4, r3, r0, r5)
            return
    }

    /* JADX INFO: renamed from: β */
    public static void m4697(android.view.View r2, android.view.View r3, p000.o10 r4, android.view.View.OnClickListener r5) {
            java.util.Map r0 = p000.q10.f8790
            r0.getClass()
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r3)
            if (r5 == 0) goto L12
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r5)
            goto L13
        L12:
            r3 = 0
        L13:
            p10 r5 = new p10
            r5.<init>(r4, r1, r3)
            r0.put(r2, r5)
            o10 r3 = p000.o10.f7863
            if (r4 != r3) goto L69
            java.lang.String r3 = "follow"
            boolean r4 = p000.ui1.m5867()
            if (r4 == 0) goto L69
            boolean r3 = p000.ui1.m5904(r3)     // Catch: java.lang.Throwable -> L30
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L30
            goto L37
        L30:
            r3 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        L37:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            boolean r5 = r3 instanceof p000.eo1
            if (r5 == 0) goto L3e
            r3 = r4
        L3e:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L69
            hb r3 = new hb
            r4 = 13
            r3.<init>(r2, r4)
            android.os.Looper r4 = android.os.Looper.myLooper()
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 == 0) goto L5f
            r3.invoke()
            goto L69
        L5f:
            ν r4 = new ν
            r5 = 12
            r4.<init>(r5, r3)
            r2.post(r4)
        L69:
            return
    }

    /* JADX INFO: renamed from: γ */
    public static final void m4698(p000.sm1 r4, java.lang.String r5, android.view.View r6, android.view.View r7, int r8) {
            r0 = 12
            if (r8 > r0) goto L47
            int r0 = r4.f9967
            r1 = 240(0xf0, float:3.36E-43)
            if (r0 < r1) goto Lb
            goto L47
        Lb:
            int r0 = r0 + 1
            r4.f9967 = r0
            android.view.View$OnClickListener r0 = m4705(r7)
            if (r0 != 0) goto L21
            boolean r1 = r7.hasOnClickListeners()
            if (r1 != 0) goto L21
            boolean r1 = r7.isClickable()
            if (r1 == 0) goto L2a
        L21:
            o10 r1 = m4706(r5, r7, r0, r6)
            if (r1 == 0) goto L2a
            m4697(r7, r6, r1, r0)
        L2a:
            boolean r0 = r7 instanceof android.view.ViewGroup
            if (r0 != 0) goto L2f
            goto L47
        L2f:
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            int r0 = r7.getChildCount()
            r1 = 0
        L36:
            if (r1 >= r0) goto L47
            android.view.View r2 = r7.getChildAt(r1)
            r2.getClass()
            int r3 = r8 + 1
            m4698(r4, r5, r6, r2, r3)
            int r1 = r1 + 1
            goto L36
        L47:
            return
    }

    /* JADX INFO: renamed from: δ */
    public static java.util.LinkedHashSet m4699(android.view.View.OnClickListener r3) {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
            r1.<init>()
            java.util.Set r1 = java.util.Collections.newSetFromMap(r1)
            r2 = 0
            m4700(r1, r0, r3, r2)
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public static final void m4700(java.util.Set r4, java.util.LinkedHashSet r5, android.view.View.OnClickListener r6, int r7) {
            r0 = 4
            if (r7 > r0) goto L84
            boolean r0 = r4.add(r6)
            if (r0 != 0) goto Lb
            goto L84
        Lb:
            java.lang.Class r0 = r6.getClass()
            java.lang.String r0 = r0.getName()
            r5.add(r0)
            java.lang.Class r0 = r6.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L1f:
            if (r0 == 0) goto L2e
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L2e
            java.lang.Class r0 = p000.lz1.m3684(r0, r1)
            goto L1f
        L2e:
            r0 = 16
            java.util.List r0 = p000.AbstractC0984xh.m6662(r1, r0)
            java.util.Iterator r0 = r0.iterator()
        L38:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L84
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r2 = r1.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isStatic(r2)
            if (r2 != 0) goto L38
            java.lang.Class r2 = r1.getType()
            boolean r2 = r2.isPrimitive()
            if (r2 == 0) goto L59
            goto L38
        L59:
            java.lang.Class r2 = r1.getType()
            java.lang.String r2 = r2.getName()
            r5.add(r2)
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L6d
            goto L74
        L6d:
            r1 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r1)
            r1 = r3
        L74:
            boolean r3 = r1 instanceof p000.eo1
            if (r3 == 0) goto L79
            r1 = 0
        L79:
            boolean r3 = r1 instanceof android.view.View.OnClickListener
            if (r3 == 0) goto L38
            int r2 = r2 + r7
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            m4700(r4, r5, r1, r2)
            goto L38
        L84:
            return
    }

    /* JADX INFO: renamed from: ζ */
    public static android.view.View m4701(android.view.View r5) {
            r0 = 0
        L1:
            r1 = 0
            if (r5 == 0) goto L4d
            r2 = 20
            if (r0 > r2) goto L4d
            java.lang.String r2 = "~7974716F46EDCCC8AB71015994E08EBF7057E4892C51F22F56F03474AEFAA0D9A94E4C21F0622A378CF61B87F8A576C81A592CCB282165A7"
            java.lang.String r2 = p000.jf0.m2957(r2)
            java.lang.Class r3 = r5.getClass()
        L12:
            if (r3 == 0) goto L2c
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L2c
            java.lang.String r4 = r3.getName()
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L27
            goto L3d
        L27:
            java.lang.Class r3 = r3.getSuperclass()
            goto L12
        L2c:
            java.lang.Class r2 = r5.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r3 = "VideoViewHolderRootView"
            r4 = 1
            boolean r2 = p000.q02.m4654(r2, r3, r4)
            if (r2 == 0) goto L3e
        L3d:
            return r5
        L3e:
            android.view.ViewParent r5 = r5.getParent()
            boolean r2 = r5 instanceof android.view.View
            if (r2 == 0) goto L49
            android.view.View r5 = (android.view.View) r5
            goto L4a
        L49:
            r5 = r1
        L4a:
            int r0 = r0 + 1
            goto L1
        L4d:
            return r1
    }

    /* JADX INFO: renamed from: η */
    public static final void m4702(p000.qm1 r5, p000.sm1 r6, android.view.View r7, int r8) {
            boolean r0 = r5.f9050
            if (r0 != 0) goto L43
            r0 = 12
            if (r8 > r0) goto L43
            int r0 = r6.f9967
            r1 = 240(0xf0, float:3.36E-43)
            if (r0 < r1) goto Lf
            goto L43
        Lf:
            r1 = 1
            int r0 = r0 + r1
            r6.f9967 = r0
            android.view.View$OnClickListener r0 = m4705(r7)
            if (r0 != 0) goto L41
            boolean r0 = r7.hasOnClickListeners()
            if (r0 == 0) goto L20
            goto L41
        L20:
            boolean r0 = r7 instanceof android.view.ViewGroup
            if (r0 == 0) goto L27
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto L28
        L27:
            r7 = 0
        L28:
            if (r7 != 0) goto L2b
            goto L43
        L2b:
            int r0 = r7.getChildCount()
            r2 = 0
        L30:
            if (r2 >= r0) goto L43
            android.view.View r3 = r7.getChildAt(r2)
            r3.getClass()
            int r4 = r8 + 1
            m4702(r5, r6, r3, r4)
            int r2 = r2 + 1
            goto L30
        L41:
            r5.f9050 = r1
        L43:
            return
    }

    /* JADX INFO: renamed from: ι */
    public static boolean m4703(android.view.View r3, android.view.View r4) {
            r0 = 0
            r1 = r0
        L2:
            if (r3 == 0) goto L1b
            r2 = 40
            if (r1 > r2) goto L1b
            if (r3 != r4) goto Lc
            r3 = 1
            return r3
        Lc:
            android.view.ViewParent r3 = r3.getParent()
            boolean r2 = r3 instanceof android.view.View
            if (r2 == 0) goto L17
            android.view.View r3 = (android.view.View) r3
            goto L18
        L17:
            r3 = 0
        L18:
            int r1 = r1 + 1
            goto L2
        L1b:
            return r0
    }

    /* JADX INFO: renamed from: κ */
    public static boolean m4704(android.app.Activity r26, p000.o10 r27) {
            r0 = r26
            r1 = r27
            android.os.Looper r2 = android.os.Looper.myLooper()
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            boolean r2 = p000.ln0.m3626(r2, r3)
            r3 = 15
            r4 = 1
            if (r2 != 0) goto L20
            android.os.Handler r2 = p000.q10.f8788
            w1 r5 = new w1
            r5.<init>(r0, r3, r1)
            r2.post(r5)
            return r4
        L20:
            java.util.Map r2 = p000.q10.f8789
            r2.getClass()
            monitor-enter(r2)
            java.util.Set r5 = r2.entrySet()     // Catch: java.lang.Throwable -> L58
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch: java.lang.Throwable -> L58
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L58
            r7 = 10
            int r8 = p000.AbstractC1021yh.m6889(r5, r7)     // Catch: java.lang.Throwable -> L58
            r6.<init>(r8)     // Catch: java.lang.Throwable -> L58
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L58
        L3b:
            boolean r8 = r5.hasNext()     // Catch: java.lang.Throwable -> L58
            if (r8 == 0) goto L5b
            java.lang.Object r8 = r5.next()     // Catch: java.lang.Throwable -> L58
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8     // Catch: java.lang.Throwable -> L58
            java.lang.Object r9 = r8.getKey()     // Catch: java.lang.Throwable -> L58
            java.lang.Object r8 = r8.getValue()     // Catch: java.lang.Throwable -> L58
            l91 r10 = new l91     // Catch: java.lang.Throwable -> L58
            r10.<init>(r9, r8)     // Catch: java.lang.Throwable -> L58
            r6.add(r10)     // Catch: java.lang.Throwable -> L58
            goto L3b
        L58:
            r0 = move-exception
            goto L41b
        L5b:
            monitor-exit(r2)
            java.util.Iterator r2 = r6.iterator()
        L60:
            boolean r5 = r2.hasNext()
            r6 = 4
            r8 = 0
            if (r5 == 0) goto Lc1
            java.lang.Object r5 = r2.next()
            l91 r5 = (p000.l91) r5
            java.lang.Object r9 = r5.f6502
            android.view.View r9 = (android.view.View) r9
            java.lang.Object r5 = r5.f6503
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            int r10 = r1.ordinal()
            if (r10 == 0) goto Lad
            if (r10 == r4) goto La6
            r11 = 2
            if (r10 == r11) goto L9f
            r11 = 3
            if (r10 == r11) goto L98
            if (r10 == r6) goto L91
            r6 = 5
            if (r10 != r6) goto L8d
            goto L91
        L8d:
            p000.C1080.m7272()
            return r8
        L91:
            java.lang.String r6 = "avatar"
            boolean r6 = r5.equals(r6)
            goto Lb3
        L98:
            java.lang.String r6 = "share"
            boolean r6 = r5.equals(r6)
            goto Lb3
        L9f:
            java.lang.String r6 = "collect"
            boolean r6 = r5.equals(r6)
            goto Lb3
        La6:
            java.lang.String r6 = "comment"
            boolean r6 = r5.equals(r6)
            goto Lb3
        Lad:
            java.lang.String r6 = "digg"
            boolean r6 = r5.equals(r6)
        Lb3:
            if (r6 == 0) goto L60
            r9.getClass()
            sm1 r6 = new sm1
            r6.<init>()
            m4698(r6, r5, r9, r9, r8)
            goto L60
        Lc1:
            pq r2 = p000.C0696pq.f8651
            kq r2 = p000.C0696pq.m4567()
            r5 = 0
            if (r2 != 0) goto Lcc
        Lca:
            r9 = r5
            goto L117
        Lcc:
            android.view.View r9 = r2.f6078
            if (r9 != 0) goto Lde
            java.lang.Object r2 = r2.f6076
            boolean r9 = r2 instanceof android.view.View
            if (r9 == 0) goto Lda
            android.view.View r2 = (android.view.View) r2
            r9 = r2
            goto Ldb
        Lda:
            r9 = r5
        Ldb:
            if (r9 != 0) goto Lde
            goto Lca
        Lde:
            android.content.Context r2 = r9.getContext()
        Le2:
            boolean r10 = r2 instanceof android.app.Activity
            if (r10 == 0) goto Le9
            android.app.Activity r2 = (android.app.Activity) r2
            goto Lf5
        Le9:
            boolean r10 = r2 instanceof android.content.ContextWrapper
            if (r10 == 0) goto Lf4
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            goto Le2
        Lf4:
            r2 = r5
        Lf5:
            if (r2 == r0) goto Lf8
            goto Lca
        Lf8:
            boolean r2 = r9.isAttachedToWindow()
            if (r2 == 0) goto Lca
            boolean r2 = r9.isShown()
            if (r2 != 0) goto L105
            goto Lca
        L105:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            boolean r10 = r9.getGlobalVisibleRect(r2)
            if (r10 == 0) goto Lca
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L117
            goto Lca
        L117:
            java.util.Map r2 = p000.q10.f8789
            r2.getClass()
            monitor-enter(r2)
            int r10 = r2.size()     // Catch: java.lang.Throwable -> L418
            monitor-exit(r2)
            java.util.Map r2 = p000.q10.f8790
            r2.getClass()
            monitor-enter(r2)
            java.util.Collection r11 = r2.values()     // Catch: java.lang.Throwable -> L13d
            java.lang.Iterable r11 = (java.lang.Iterable) r11     // Catch: java.lang.Throwable -> L13d
            boolean r12 = r11 instanceof java.util.Collection     // Catch: java.lang.Throwable -> L13d
            if (r12 == 0) goto L140
            r12 = r11
            java.util.Collection r12 = (java.util.Collection) r12     // Catch: java.lang.Throwable -> L13d
            boolean r12 = r12.isEmpty()     // Catch: java.lang.Throwable -> L13d
            if (r12 == 0) goto L140
            r12 = r8
            goto L163
        L13d:
            r0 = move-exception
            goto L416
        L140:
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L13d
            r12 = r8
        L145:
            boolean r13 = r11.hasNext()     // Catch: java.lang.Throwable -> L13d
            if (r13 == 0) goto L163
            java.lang.Object r13 = r11.next()     // Catch: java.lang.Throwable -> L13d
            p10 r13 = (p000.p10) r13     // Catch: java.lang.Throwable -> L13d
            o10 r13 = r13.f8380     // Catch: java.lang.Throwable -> L13d
            if (r13 != r1) goto L157
            r13 = r4
            goto L158
        L157:
            r13 = r8
        L158:
            if (r13 == 0) goto L145
            int r12 = r12 + 1
            if (r12 < 0) goto L15f
            goto L145
        L15f:
            p000.AbstractC1021yh.m6916()     // Catch: java.lang.Throwable -> L13d
            throw r5     // Catch: java.lang.Throwable -> L13d
        L163:
            monitor-exit(r2)
            java.util.Map r2 = p000.q10.f8790
            r2.getClass()
            monitor-enter(r2)
            java.util.Set r11 = r2.entrySet()     // Catch: java.lang.Throwable -> L19a
            java.lang.Iterable r11 = (java.lang.Iterable) r11     // Catch: java.lang.Throwable -> L19a
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L19a
            int r7 = p000.AbstractC1021yh.m6889(r11, r7)     // Catch: java.lang.Throwable -> L19a
            r13.<init>(r7)     // Catch: java.lang.Throwable -> L19a
            java.util.Iterator r7 = r11.iterator()     // Catch: java.lang.Throwable -> L19a
        L17d:
            boolean r11 = r7.hasNext()     // Catch: java.lang.Throwable -> L19a
            if (r11 == 0) goto L19d
            java.lang.Object r11 = r7.next()     // Catch: java.lang.Throwable -> L19a
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch: java.lang.Throwable -> L19a
            java.lang.Object r14 = r11.getKey()     // Catch: java.lang.Throwable -> L19a
            java.lang.Object r11 = r11.getValue()     // Catch: java.lang.Throwable -> L19a
            l91 r15 = new l91     // Catch: java.lang.Throwable -> L19a
            r15.<init>(r14, r11)     // Catch: java.lang.Throwable -> L19a
            r13.add(r15)     // Catch: java.lang.Throwable -> L19a
            goto L17d
        L19a:
            r0 = move-exception
            goto L414
        L19d:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L19a
            r7.<init>()     // Catch: java.lang.Throwable -> L19a
            java.util.Iterator r11 = r13.iterator()     // Catch: java.lang.Throwable -> L19a
        L1a6:
            boolean r13 = r11.hasNext()     // Catch: java.lang.Throwable -> L19a
            if (r13 == 0) goto L1c4
            java.lang.Object r13 = r11.next()     // Catch: java.lang.Throwable -> L19a
            r14 = r13
            l91 r14 = (p000.l91) r14     // Catch: java.lang.Throwable -> L19a
            java.lang.Object r14 = r14.f6503     // Catch: java.lang.Throwable -> L19a
            p10 r14 = (p000.p10) r14     // Catch: java.lang.Throwable -> L19a
            o10 r14 = r14.f8380     // Catch: java.lang.Throwable -> L19a
            if (r14 != r1) goto L1bd
            r14 = r4
            goto L1be
        L1bd:
            r14 = r8
        L1be:
            if (r14 == 0) goto L1a6
            r7.add(r13)     // Catch: java.lang.Throwable -> L19a
            goto L1a6
        L1c4:
            monitor-exit(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r7 = r7.iterator()
        L1ce:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L201
            java.lang.Object r11 = r7.next()
            l91 r11 = (p000.l91) r11
            java.lang.Object r13 = r11.f6502
            android.view.View r13 = (android.view.View) r13
            java.lang.Object r11 = r11.f6503
            p10 r11 = (p000.p10) r11
            r13.getClass()
            r11.getClass()
            int r14 = m4707(r0, r13, r11, r9, r1)
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r14 != r15) goto L1f2
            r15 = r5
            goto L1fb
        L1f2:
            d62 r15 = new d62
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r15.<init>(r13, r11, r14)
        L1fb:
            if (r15 == 0) goto L1ce
            r2.add(r15)
            goto L1ce
        L201:
            qt r0 = new qt
            r0.<init>(r3)
            java.util.List r2 = p000.AbstractC0984xh.m6658(r2, r0)
            java.util.Iterator r3 = r2.iterator()
            r7 = r8
        L20f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3e9
            java.lang.Object r0 = r3.next()
            int r11 = r7 + 1
            if (r7 < 0) goto L3e3
            d62 r0 = (p000.d62) r0
            java.lang.Object r13 = r0.f2926
            android.view.View r13 = (android.view.View) r13
            java.lang.Object r14 = r0.f2927
            p10 r14 = (p000.p10) r14
            java.lang.Object r0 = r0.f2928
            java.lang.Number r0 = (java.lang.Number) r0
            int r15 = r0.intValue()
            r13.getClass()
            java.lang.ref.WeakReference r0 = r14.f8382
            if (r0 == 0) goto L240
            java.lang.Object r0 = r0.get()
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r16 = r8
            r8 = r0
            goto L243
        L240:
            r16 = r8
            r8 = r5
        L243:
            java.lang.String r5 = "直接调用宿主监听失败: "
            boolean r6 = r13.isEnabled()
            if (r6 != 0) goto L252
            r13.setEnabled(r4)     // Catch: java.lang.Throwable -> L24f
            goto L252
        L24f:
            r0 = move-exception
            goto L3d9
        L252:
            boolean r0 = r13.callOnClick()     // Catch: java.lang.Throwable -> L25d
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L25d
            r18 = r4
            goto L266
        L25d:
            r0 = move-exception
            r18 = r4
            eo1 r4 = new eo1     // Catch: java.lang.Throwable -> L24f
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L24f
            r0 = r4
        L266:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L24f
            r26 = r2
            boolean r2 = r0 instanceof p000.eo1     // Catch: java.lang.Throwable -> L24f
            if (r2 == 0) goto L26f
            r0 = r4
        L26f:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L24f
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L24f
            if (r0 == 0) goto L283
            boolean r0 = r13.isEnabled()
            if (r0 == r6) goto L280
        L27d:
            r13.setEnabled(r6)
        L280:
            r0 = r18
            goto L2e5
        L283:
            boolean r0 = r13.performClick()     // Catch: java.lang.Throwable -> L28c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L28c
            goto L293
        L28c:
            r0 = move-exception
            eo1 r2 = new eo1     // Catch: java.lang.Throwable -> L24f
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L24f
            r0 = r2
        L293:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L24f
            boolean r4 = r0 instanceof p000.eo1     // Catch: java.lang.Throwable -> L24f
            if (r4 == 0) goto L29a
            r0 = r2
        L29a:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L24f
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L24f
            if (r0 == 0) goto L2a9
            boolean r0 = r13.isEnabled()
            if (r0 == r6) goto L280
            goto L27d
        L2a9:
            if (r8 == 0) goto L2da
            r8.onClick(r13)     // Catch: java.lang.Throwable -> L2b1
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L2b1
            goto L2b8
        L2b1:
            r0 = move-exception
            eo1 r2 = new eo1     // Catch: java.lang.Throwable -> L24f
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L24f
            r0 = r2
        L2b8:
            java.lang.Throwable r2 = p000.fo1.m2190(r0)     // Catch: java.lang.Throwable -> L24f
            if (r2 == 0) goto L2d5
            java.lang.String r4 = "FeedGestureActionLauncher"
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L24f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24f
            r8.<init>(r5)     // Catch: java.lang.Throwable -> L24f
            r8.append(r2)     // Catch: java.lang.Throwable -> L24f
            java.lang.String r2 = r8.toString()     // Catch: java.lang.Throwable -> L24f
            r5 = 4
            r8 = 0
            p000.C0888ux.m5988(r4, r2, r8, r5, r8)     // Catch: java.lang.Throwable -> L24f
        L2d5:
            boolean r0 = r0 instanceof p000.eo1     // Catch: java.lang.Throwable -> L24f
            r0 = r0 ^ 1
            goto L2dc
        L2da:
            r0 = r16
        L2dc:
            boolean r2 = r13.isEnabled()
            if (r2 == r6) goto L2e5
            r13.setEnabled(r6)
        L2e5:
            if (r0 == 0) goto L3ce
            android.view.View$OnClickListener r0 = m4705(r13)
            if (r0 == 0) goto L2f2
            java.util.LinkedHashSet r2 = m4699(r0)
            goto L2f3
        L2f2:
            r2 = 0
        L2f3:
            if (r2 != 0) goto L2f7
            nz r2 = p000.C0604nz.f7825
        L2f7:
            r19 = r2
            java.lang.Iterable r19 = (java.lang.Iterable) r19
            java.lang.String r20 = ","
            q00 r2 = new q00
            r3 = 22
            r2.<init>(r3)
            r25 = 30
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = r2
            java.lang.String r2 = p000.AbstractC0984xh.m6644(r19, r20, r21, r22, r23, r24, r25)
            java.lang.String r3 = "FeedGestureActionLauncher"
            java.lang.String r1 = r1.f7865
            java.lang.Class r4 = r13.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.ref.WeakReference r5 = r14.f8381
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            if (r5 == 0) goto L331
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            goto L332
        L331:
            r5 = 0
        L332:
            if (r5 != 0) goto L336
            java.lang.String r5 = ""
        L336:
            if (r9 == 0) goto L341
            java.lang.Class r6 = r9.getClass()
            java.lang.String r6 = r6.getName()
            goto L342
        L341:
            r6 = 0
        L342:
            if (r6 != 0) goto L346
            java.lang.String r6 = ""
        L346:
            if (r0 == 0) goto L351
            java.lang.Class r8 = r0.getClass()
            java.lang.String r8 = r8.getName()
            goto L352
        L351:
            r8 = 0
        L352:
            if (r8 != 0) goto L356
            java.lang.String r8 = ""
        L356:
            if (r0 == 0) goto L398
            java.util.LinkedHashSet r0 = m4699(r0)
            boolean r9 = r0.isEmpty()
            if (r9 == 0) goto L363
            goto L393
        L363:
            java.util.Iterator r0 = r0.iterator()
        L367:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L393
            java.lang.Object r9 = r0.next()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = "OnCommentClick"
            r11 = r18
            boolean r10 = p000.q02.m4654(r9, r10, r11)
            if (r10 != 0) goto L391
            java.lang.String r10 = "FeedCommentPresenter"
            boolean r10 = p000.q02.m4654(r9, r10, r11)
            if (r10 != 0) goto L391
            java.lang.String r10 = "VideoCommentCountView"
            boolean r9 = p000.q02.m4654(r9, r10, r11)
            if (r9 == 0) goto L38e
            goto L391
        L38e:
            r18 = 1
            goto L367
        L391:
            r16 = 1
        L393:
            if (r16 == 0) goto L398
            java.lang.String r0 = "comment"
            goto L39a
        L398:
            java.lang.String r0 = "generic"
        L39a:
            r9 = 240(0xf0, float:3.36E-43)
            java.lang.String r2 = p000.q02.m4693(r2, r9)
            java.lang.String r9 = "已调用 Feed 原生动作 action="
            java.lang.String r10 = " index="
            java.lang.String r11 = " score="
            java.lang.StringBuilder r1 = p000.AbstractC0602nx.m4135(r7, r9, r1, r10, r11)
            java.lang.String r7 = " target="
            java.lang.String r9 = " root="
            p000.lz1.m3671(r1, r15, r7, r4, r9)
            java.lang.String r4 = " selected="
            java.lang.String r7 = " listener="
            p000.AbstractC0602nx.m4119(r1, r5, r4, r6, r7)
            java.lang.String r4 = " listenerRole="
            java.lang.String r5 = " listenerTypes="
            p000.AbstractC0602nx.m4119(r1, r8, r4, r0, r5)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            r5 = 4
            r8 = 0
            p000.C0888ux.m5988(r3, r0, r8, r5, r8)
            r18 = 1
            return r18
        L3ce:
            r2 = r26
            r7 = r11
            r8 = r16
            r4 = r18
            r5 = 0
            r6 = 4
            goto L20f
        L3d9:
            boolean r1 = r13.isEnabled()
            if (r1 == r6) goto L3e2
            r13.setEnabled(r6)
        L3e2:
            throw r0
        L3e3:
            p000.AbstractC1021yh.m6917()
            r17 = 0
            throw r17
        L3e9:
            r26 = r2
            r16 = r8
            java.lang.String r0 = "FeedGestureActionLauncher"
            java.lang.String r1 = r1.f7865
            int r2 = r26.size()
            java.lang.String r3 = "执行 Feed 原生动作失败: 未捕获当前目标 action="
            java.lang.String r4 = " registeredRoots="
            java.lang.String r5 = " matchingBindings="
            java.lang.StringBuilder r1 = p000.AbstractC0602nx.m4135(r10, r3, r1, r4, r5)
            r1.append(r12)
            java.lang.String r3 = " visibleCandidates="
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r5 = 4
            r8 = 0
            p000.C0888ux.m5988(r0, r1, r8, r5, r8)
            return r16
        L414:
            monitor-exit(r2)
            throw r0
        L416:
            monitor-exit(r2)
            throw r0
        L418:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L41b:
            monitor-exit(r2)
            throw r0
    }

    /* JADX INFO: renamed from: λ */
    public static android.view.View.OnClickListener m4705(android.view.View r4) {
            r0 = 0
            java.lang.reflect.Field r1 = p000.q10.f8791     // Catch: java.lang.Throwable -> L14
            r2 = 1
            if (r1 != 0) goto L16
            java.lang.Class<android.view.View> r1 = android.view.View.class
            java.lang.String r3 = "mListenerInfo"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L14
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L14
            p000.q10.f8791 = r1     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r4 = move-exception
            goto L3d
        L16:
            java.lang.Object r4 = r1.get(r4)     // Catch: java.lang.Throwable -> L14
            if (r4 != 0) goto L1d
            return r0
        L1d:
            java.lang.reflect.Field r1 = p000.q10.f8792     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L30
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L14
            java.lang.String r3 = "mOnClickListener"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L14
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L14
            p000.q10.f8792 = r1     // Catch: java.lang.Throwable -> L14
        L30:
            java.lang.Object r4 = r1.get(r4)     // Catch: java.lang.Throwable -> L14
            boolean r1 = r4 instanceof android.view.View.OnClickListener     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L3b
            android.view.View$OnClickListener r4 = (android.view.View.OnClickListener) r4     // Catch: java.lang.Throwable -> L14
            goto L43
        L3b:
            r4 = r0
            goto L43
        L3d:
            eo1 r1 = new eo1
            r1.<init>(r4)
            r4 = r1
        L43:
            boolean r1 = r4 instanceof p000.eo1
            if (r1 == 0) goto L48
            goto L49
        L48:
            r0 = r4
        L49:
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            return r0
    }

    /* JADX INFO: renamed from: μ */
    public static p000.o10 m4706(java.lang.String r9, android.view.View r10, android.view.View.OnClickListener r11, android.view.View r12) {
            int r0 = r9.hashCode()
            r1 = 0
            switch(r0) {
                case -1405959847: goto L3e;
                case 3083301: goto L31;
                case 109400031: goto L24;
                case 949444906: goto L17;
                case 950398559: goto La;
                default: goto L8;
            }
        L8:
            goto L133
        La:
            java.lang.String r10 = "comment"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L14
            goto L133
        L14:
            o10 r9 = p000.o10.f7859
            return r9
        L17:
            java.lang.String r10 = "collect"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L21
            goto L133
        L21:
            o10 r9 = p000.o10.f7860
            return r9
        L24:
            java.lang.String r10 = "share"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L2e
            goto L133
        L2e:
            o10 r9 = p000.o10.f7861
            return r9
        L31:
            java.lang.String r10 = "digg"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L3b
            goto L133
        L3b:
            o10 r9 = p000.o10.f7858
            return r9
        L3e:
            java.lang.String r0 = "avatar"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L48
            goto L133
        L48:
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r0 = 0
            r2 = r10
            r3 = r0
        L50:
            if (r2 == 0) goto L71
            r4 = 6
            if (r3 > r4) goto L71
            java.lang.Class r4 = r2.getClass()
            java.lang.String r4 = r4.getName()
            r9.add(r4)
            if (r2 == r12) goto L71
            android.view.ViewParent r2 = r2.getParent()
            boolean r4 = r2 instanceof android.view.View
            if (r4 == 0) goto L6d
            android.view.View r2 = (android.view.View) r2
            goto L6e
        L6d:
            r2 = r1
        L6e:
            int r3 = r3 + 1
            goto L50
        L71:
            if (r11 == 0) goto L78
            java.util.LinkedHashSet r11 = m4699(r11)
            goto L79
        L78:
            r11 = r1
        L79:
            if (r11 != 0) goto L7d
            nz r11 = p000.C0604nz.f7825
        L7d:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.LinkedHashSet r12 = p000.g81.m2282(r9, r11)
            boolean r2 = r12.isEmpty()
            o10 r3 = p000.o10.f7863
            r4 = 1
            if (r2 == 0) goto L8d
            goto Lae
        L8d:
            java.util.Iterator r2 = r12.iterator()
        L91:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto Lae
            java.lang.Object r5 = r2.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "Follow"
            boolean r6 = p000.q02.m4654(r5, r6, r4)
            if (r6 != 0) goto Lad
            java.lang.String r6 = "Relation"
            boolean r5 = p000.q02.m4654(r5, r6, r4)
            if (r5 == 0) goto L91
        Lad:
            return r3
        Lae:
            boolean r2 = r11 instanceof java.util.Collection
            java.lang.String r5 = "FeedAvatarPresenter"
            if (r2 == 0) goto Lbf
            r2 = r11
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto Lbf
        Lbd:
            r11 = r0
            goto Ld6
        Lbf:
            java.util.Iterator r11 = r11.iterator()
        Lc3:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto Lbd
            java.lang.Object r2 = r11.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = p000.q02.m4654(r2, r5, r4)
            if (r2 == 0) goto Lc3
            r11 = r4
        Ld6:
            boolean r2 = r9.isEmpty()
            java.lang.String r6 = "AvatarBorder"
            java.lang.String r7 = "AvatarImage"
            if (r2 == 0) goto Le1
            goto Lfe
        Le1:
            java.util.Iterator r9 = r9.iterator()
        Le5:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto Lfe
            java.lang.Object r2 = r9.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r8 = p000.q02.m4654(r2, r7, r4)
            if (r8 != 0) goto Lfd
            boolean r2 = p000.q02.m4654(r2, r6, r4)
            if (r2 == 0) goto Le5
        Lfd:
            r0 = r4
        Lfe:
            if (r11 == 0) goto L107
            boolean r9 = r10 instanceof android.widget.ImageView
            if (r9 == 0) goto L107
            if (r0 != 0) goto L107
            return r3
        L107:
            boolean r9 = r12.isEmpty()
            if (r9 == 0) goto L10e
            goto L133
        L10e:
            java.util.Iterator r9 = r12.iterator()
        L112:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L133
            java.lang.Object r10 = r9.next()
            java.lang.String r10 = (java.lang.String) r10
            boolean r11 = p000.q02.m4654(r10, r5, r4)
            if (r11 != 0) goto L130
            boolean r11 = p000.q02.m4654(r10, r7, r4)
            if (r11 != 0) goto L130
            boolean r10 = p000.q02.m4654(r10, r6, r4)
            if (r10 == 0) goto L112
        L130:
            o10 r9 = p000.o10.f7862
            return r9
        L133:
            return r1
    }

    /* JADX INFO: renamed from: ν */
    public static int m4707(android.app.Activity r17, android.view.View r18, p000.p10 r19, android.view.View r20, p000.o10 r21) {
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            java.lang.ref.WeakReference r4 = r1.f8381
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 != 0) goto L14
            goto L22b
        L14:
            android.content.Context r5 = r4.getContext()
        L18:
            boolean r6 = r5 instanceof android.app.Activity
            if (r6 == 0) goto L21
            android.app.Activity r5 = (android.app.Activity) r5
        L1e:
            r6 = r17
            goto L2e
        L21:
            boolean r6 = r5 instanceof android.content.ContextWrapper
            if (r6 == 0) goto L2c
            android.content.ContextWrapper r5 = (android.content.ContextWrapper) r5
            android.content.Context r5 = r5.getBaseContext()
            goto L18
        L2c:
            r5 = 0
            goto L1e
        L2e:
            if (r5 == r6) goto L32
            goto L22b
        L32:
            boolean r5 = r4.isAttachedToWindow()
            if (r5 == 0) goto L22b
            boolean r5 = r0.isAttachedToWindow()
            if (r5 != 0) goto L40
            goto L22b
        L40:
            android.view.View r5 = m4701(r4)
            if (r2 == 0) goto L5e
            boolean r10 = m4703(r4, r2)
            if (r10 != 0) goto L5e
            boolean r10 = m4703(r2, r4)
            if (r10 == 0) goto L53
            goto L5e
        L53:
            android.view.View r10 = m4701(r2)
            if (r5 == 0) goto L5c
            if (r5 != r10) goto L5c
            goto L5e
        L5c:
            r10 = 0
            goto L5f
        L5e:
            r10 = 1
        L5f:
            android.view.View$OnClickListener r11 = m4705(r0)
            o10 r12 = p000.o10.f7859
            if (r3 != r12) goto Lf6
            if (r0 != r4) goto Lf6
            boolean r12 = r4 instanceof android.view.ViewGroup
            if (r12 == 0) goto L71
            r12 = r4
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            goto L72
        L71:
            r12 = 0
        L72:
            if (r12 != 0) goto L78
            r7 = 0
        L75:
            r15 = 1
            goto Lf0
        L78:
            java.util.Map r13 = p000.q10.f8790
            r13.getClass()
            monitor-enter(r13)
            boolean r14 = r13.isEmpty()     // Catch: java.lang.Throwable -> Lc3
            if (r14 == 0) goto L86
        L84:
            r9 = 0
            goto Lc5
        L86:
            java.util.Set r14 = r13.entrySet()     // Catch: java.lang.Throwable -> Lc3
            java.util.Iterator r14 = r14.iterator()     // Catch: java.lang.Throwable -> Lc3
        L8e:
            boolean r15 = r14.hasNext()     // Catch: java.lang.Throwable -> Lc3
            if (r15 == 0) goto L84
            java.lang.Object r15 = r14.next()     // Catch: java.lang.Throwable -> Lc3
            java.util.Map$Entry r15 = (java.util.Map.Entry) r15     // Catch: java.lang.Throwable -> Lc3
            java.lang.Object r16 = r15.getKey()     // Catch: java.lang.Throwable -> Lc3
            r9 = r16
            android.view.View r9 = (android.view.View) r9     // Catch: java.lang.Throwable -> Lc3
            java.lang.Object r15 = r15.getValue()     // Catch: java.lang.Throwable -> Lc3
            p10 r15 = (p000.p10) r15     // Catch: java.lang.Throwable -> Lc3
            o10 r7 = r15.f8380     // Catch: java.lang.Throwable -> Lc3
            o10 r8 = p000.o10.f7859     // Catch: java.lang.Throwable -> Lc3
            if (r7 != r8) goto L8e
            if (r9 == r4) goto L8e
            java.lang.ref.WeakReference r7 = r15.f8381     // Catch: java.lang.Throwable -> Lc3
            java.lang.Object r7 = r7.get()     // Catch: java.lang.Throwable -> Lc3
            if (r7 != r4) goto L8e
            r9.getClass()     // Catch: java.lang.Throwable -> Lc3
            boolean r7 = m4703(r9, r4)     // Catch: java.lang.Throwable -> Lc3
            if (r7 == 0) goto L8e
            r9 = 1
            goto Lc5
        Lc3:
            r0 = move-exception
            goto Lf4
        Lc5:
            monitor-exit(r13)
            if (r9 == 0) goto Lca
            r7 = 1
            goto L75
        Lca:
            sm1 r7 = new sm1
            r7.<init>()
            qm1 r8 = new qm1
            r8.<init>()
            int r9 = r12.getChildCount()
            r13 = 0
        Ld9:
            if (r13 >= r9) goto Led
            android.view.View r14 = r12.getChildAt(r13)
            r14.getClass()
            r15 = 1
            m4702(r8, r7, r14, r15)
            boolean r14 = r8.f9050
            if (r14 != 0) goto Lee
            int r13 = r13 + 1
            goto Ld9
        Led:
            r15 = 1
        Lee:
            boolean r7 = r8.f9050
        Lf0:
            if (r7 == 0) goto Lf7
            r7 = r15
            goto Lf8
        Lf4:
            monitor-exit(r13)
            throw r0
        Lf6:
            r15 = 1
        Lf7:
            r7 = 0
        Lf8:
            if (r7 == 0) goto L110
            java.lang.String r8 = "FeedGestureActionLauncher"
            java.lang.Class r9 = r4.getClass()
            java.lang.String r9 = r9.getName()
            java.lang.String r12 = "评论根节点候选降级: 检测到宿主评论子监听 root="
            java.lang.String r9 = r12.concat(r9)
            r12 = 4
            r13 = 0
            p000.C0888ux.m5988(r8, r9, r13, r12, r13)
            goto L111
        L110:
            r13 = 0
        L111:
            if (r2 == 0) goto L115
            r8 = r15
            goto L116
        L115:
            r8 = 0
        L116:
            if (r11 == 0) goto L11a
            r9 = r15
            goto L11b
        L11a:
            r9 = 0
        L11b:
            java.lang.ref.WeakReference r1 = r1.f8382
            if (r1 == 0) goto L126
            java.lang.Object r1 = r1.get()
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            goto L127
        L126:
            r1 = r13
        L127:
            if (r1 == 0) goto L12b
            r1 = r15
            goto L12c
        L12b:
            r1 = 0
        L12c:
            boolean r11 = r0.hasOnClickListeners()
            boolean r12 = r0.isClickable()
            if (r0 != r4) goto L138
            r14 = r15
            goto L139
        L138:
            r14 = 0
        L139:
            o10 r13 = p000.o10.f7859
            if (r3 != r13) goto L13e
            goto L13f
        L13e:
            r15 = 0
        L13f:
            r3 = 0
        L140:
            if (r0 == 0) goto L158
            r13 = 12
            if (r3 > r13) goto L158
            if (r0 != r4) goto L149
            goto L159
        L149:
            android.view.ViewParent r0 = r0.getParent()
            boolean r13 = r0 instanceof android.view.View
            if (r13 == 0) goto L154
            android.view.View r0 = (android.view.View) r0
            goto L155
        L154:
            r0 = 0
        L155:
            int r3 = r3 + 1
            goto L140
        L158:
            r3 = -1
        L159:
            r0 = 20
            if (r8 == 0) goto L161
            if (r10 != 0) goto L161
        L15f:
            r1 = 0
            goto L192
        L161:
            if (r3 >= 0) goto L164
            goto L15f
        L164:
            if (r15 == 0) goto L16b
            if (r14 == 0) goto L16b
            if (r7 == 0) goto L16b
            goto L15f
        L16b:
            if (r9 != 0) goto L172
            if (r11 != 0) goto L172
            if (r12 != 0) goto L172
            goto L15f
        L172:
            if (r9 == 0) goto L177
            r7 = 4000(0xfa0, float:5.605E-42)
            goto L178
        L177:
            r7 = 0
        L178:
            if (r1 == 0) goto L17c
            int r7 = r7 + 2000
        L17c:
            if (r11 == 0) goto L180
            int r7 = r7 + 1000
        L180:
            if (r12 == 0) goto L184
            int r7 = r7 + 400
        L184:
            if (r14 == 0) goto L188
            int r7 = r7 + 800
        L188:
            if (r3 <= r0) goto L18b
            r3 = r0
        L18b:
            int r3 = r3 * 120
            int r7 = r7 - r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
        L192:
            if (r1 == 0) goto L22b
            int r1 = r1.intValue()
            if (r5 != 0) goto L1de
            if (r2 == 0) goto L1a2
            if (r10 == 0) goto L19f
            goto L1a0
        L19f:
            r2 = 0
        L1a0:
            r5 = r2
            goto L1a3
        L1a2:
            r5 = 0
        L1a3:
            if (r5 != 0) goto L1de
            r9 = 0
        L1a6:
            if (r4 == 0) goto L1d9
            if (r9 > r0) goto L1d9
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            int r3 = r4.getVisibility()
            if (r3 != 0) goto L1c9
            boolean r3 = r4.isShown()
            if (r3 == 0) goto L1c9
            boolean r3 = r4.getGlobalVisibleRect(r2)
            if (r3 == 0) goto L1c9
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L1c9
            r7 = r4
            goto L1da
        L1c9:
            android.view.ViewParent r2 = r4.getParent()
            boolean r3 = r2 instanceof android.view.View
            if (r3 == 0) goto L1d5
            android.view.View r2 = (android.view.View) r2
            r4 = r2
            goto L1d6
        L1d5:
            r4 = 0
        L1d6:
            int r9 = r9 + 1
            goto L1a6
        L1d9:
            r7 = 0
        L1da:
            if (r7 != 0) goto L1dd
            goto L22b
        L1dd:
            r5 = r7
        L1de:
            boolean r0 = r5.isShown()
            if (r0 == 0) goto L22b
            int r0 = r5.getVisibility()
            if (r0 == 0) goto L1eb
            goto L22b
        L1eb:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            boolean r2 = r5.getGlobalVisibleRect(r0)
            if (r2 == 0) goto L22b
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L1fd
            goto L22b
        L1fd:
            android.content.res.Resources r2 = r6.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.heightPixels
            int r2 = r2 / 2
            int r3 = r0.centerY()
            int r3 = r3 - r2
            int r2 = java.lang.Math.abs(r3)
            int r3 = r0.width()
            int r0 = r0.height()
            int r0 = r0 * r3
            int r0 = r0 / 1000
            r3 = 10000(0x2710, float:1.4013E-41)
            if (r0 <= r3) goto L222
            r0 = r3
        L222:
            int r0 = r0 + r3
            r3 = 5000(0x1388, float:7.006E-42)
            if (r2 <= r3) goto L228
            r2 = r3
        L228:
            int r0 = r0 - r2
            int r0 = r0 + r1
            return r0
        L22b:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            return r0
    }

    /* JADX INFO: renamed from: θ */
    public final void m4708(java.lang.ClassLoader r10) {
            r9 = this;
            java.lang.String r0 = "FeedGestureActionLauncher"
            r10.getClass()
            r10 = 1
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.q10.f8787
            r2 = 0
            boolean r10 = r1.compareAndSet(r2, r10)
            if (r10 != 0) goto L10
            goto L46
        L10:
            r10 = 4
            r3 = 0
            xq0 r4 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L29
            java.lang.Class<android.view.View> r5 = android.view.View.class
            java.lang.String r6 = "setOnClickListener"
            nh r7 = new nh     // Catch: java.lang.Throwable -> L29
            r8 = 4
            r7.<init>(r8, r9)     // Catch: java.lang.Throwable -> L29
            r4.m6774(r5, r6, r7)     // Catch: java.lang.Throwable -> L29
            java.lang.String r9 = "Feed 原生互动监听捕获 Hook 已安装"
            p000.C0888ux.m5988(r0, r9, r3, r10, r3)     // Catch: java.lang.Throwable -> L29
            s62 r9 = p000.s62.f9751     // Catch: java.lang.Throwable -> L29
            goto L30
        L29:
            r9 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r9)
            r9 = r4
        L30:
            java.lang.Throwable r9 = p000.fo1.m2190(r9)
            if (r9 == 0) goto L46
            r1.set(r2)
            java.lang.String r9 = r9.getMessage()
            java.lang.String r1 = "Feed 原生互动监听捕获 Hook 安装失败: "
            java.lang.String r9 = p000.lz1.m3687(r1, r9)
            p000.C0888ux.m5988(r0, r9, r3, r10, r3)
        L46:
            return
    }
}
