package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class z20 {

    /* JADX INFO: renamed from: α */
    public static final p000.z20 f12945 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.atomic.AtomicBoolean f12946 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.atomic.AtomicBoolean f12947 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.concurrent.CopyOnWriteArrayList f12948 = null;

    /* JADX INFO: renamed from: ε */
    public static volatile java.lang.ClassLoader f12949;

    /* JADX INFO: renamed from: ζ */
    public static volatile java.lang.Class f12950;

    /* JADX INFO: renamed from: η */
    public static volatile java.lang.Class f12951;

    /* JADX INFO: renamed from: θ */
    public static final java.util.Map f12952 = null;

    static {
            z20 r0 = new z20
            r0.<init>()
            p000.z20.f12945 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.z20.f12946 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.z20.f12947 = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            p000.z20.f12948 = r0
            y20 r0 = new y20
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            p000.z20.f12952 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final void m7067(android.view.ViewGroup r2, java.lang.String r3) {
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L18
            u20 r0 = new u20
            r1 = 0
            r0.<init>(r2, r3, r1)
            r2.post(r0)
            return
        L18:
            u20 r0 = new u20
            r1 = 1
            r0.<init>(r2, r3, r1)
            r2.post(r0)
            return
    }

    /* JADX INFO: renamed from: β */
    public static java.util.ArrayList m7068(java.lang.Class r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            if (r2 == 0) goto L14
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L14
            java.lang.Class r2 = p000.lz1.m3684(r2, r0)
            goto L5
        L14:
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static int m7069(android.content.Context r1, float r2) {
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            r0 = 1
            float r1 = android.util.TypedValue.applyDimension(r0, r2, r1)
            int r1 = (int) r1
            return r1
    }

    /* JADX INFO: renamed from: δ */
    public static final java.lang.Object m7070(java.lang.Class r8, java.util.Set r9, java.lang.Object r10, int r11) {
            r0 = 0
            if (r10 != 0) goto L5
            goto Ld9
        L5:
            r1 = 4
            if (r11 <= r1) goto La
            goto Ld9
        La:
            boolean r1 = r8.isInstance(r10)
            if (r1 == 0) goto L11
            return r10
        L11:
            java.lang.Class r1 = r10.getClass()
            java.lang.String r2 = r1.getName()
            java.lang.String r3 = "java."
            r4 = 0
            boolean r2 = p000.x02.m6485(r2, r3, r4)
            if (r2 != 0) goto Ld9
            java.lang.String r2 = r1.getName()
            java.lang.String r3 = "android."
            boolean r2 = p000.x02.m6485(r2, r3, r4)
            if (r2 == 0) goto L34
            boolean r2 = r10 instanceof android.view.View
            if (r2 != 0) goto L34
            goto Ld9
        L34:
            boolean r2 = r9.add(r10)
            if (r2 != 0) goto L3c
            goto Ld9
        L3c:
            java.util.ArrayList r1 = m7068(r1)
            java.util.Iterator r1 = r1.iterator()
        L44:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Ld9
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.Throwable -> L59
            java.lang.Object r2 = r2.get(r10)     // Catch: java.lang.Throwable -> L59
            goto L60
        L59:
            r2 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r2)
            r2 = r5
        L60:
            boolean r5 = r2 instanceof p000.eo1
            if (r5 == 0) goto L65
            r2 = r0
        L65:
            if (r2 != 0) goto L68
            goto L44
        L68:
            boolean r5 = r8.isInstance(r2)
            if (r5 == 0) goto L6f
            return r2
        L6f:
            boolean r5 = r2 instanceof java.util.Collection
            if (r5 == 0) goto L8f
            r5 = r2
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L7a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L8b
            java.lang.Object r6 = r5.next()
            boolean r7 = r8.isInstance(r6)
            if (r7 == 0) goto L7a
            goto L8c
        L8b:
            r6 = r0
        L8c:
            if (r6 == 0) goto L8f
            return r6
        L8f:
            boolean r5 = r2 instanceof java.util.Map
            if (r5 == 0) goto Lb5
            r5 = r2
            java.util.Map r5 = (java.util.Map) r5
            java.util.Collection r5 = r5.values()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        La0:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Lb1
            java.lang.Object r6 = r5.next()
            boolean r7 = r8.isInstance(r6)
            if (r7 == 0) goto La0
            goto Lb2
        Lb1:
            r6 = r0
        Lb2:
            if (r6 == 0) goto Lb5
            return r6
        Lb5:
            java.lang.Class r5 = r2.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.String r6 = "~79F5E25B4ED201D89B6CE77FECC600ECA88AB6F7485F4A97"
            java.lang.String r6 = p000.jf0.m2957(r6)
            boolean r6 = p000.x02.m6485(r5, r6, r4)
            if (r6 != 0) goto Ld1
            java.lang.String r6 = "X."
            boolean r5 = p000.x02.m6485(r5, r6, r4)
            if (r5 == 0) goto L44
        Ld1:
            int r3 = r3 + r11
            java.lang.Object r2 = m7070(r8, r9, r2, r3)
            if (r2 == 0) goto L44
            return r2
        Ld9:
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public static final java.lang.Object m7071(p000.sm1 r5, java.lang.Class r6, android.view.View r7, int r8) {
            r0 = 0
            if (r7 != 0) goto L5
            goto L83
        L5:
            r1 = 18
            if (r8 <= r1) goto Lb
            goto L83
        Lb:
            int r1 = r5.f9967
            int r2 = r1 + 1
            r5.f9967 = r2
            r2 = 900(0x384, float:1.261E-42)
            if (r1 <= r2) goto L17
            goto L83
        L17:
            java.lang.Object r1 = r7.getTag()     // Catch: java.lang.Throwable -> L1c
            goto L23
        L1c:
            r1 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        L23:
            boolean r2 = r1 instanceof p000.eo1
            if (r2 == 0) goto L28
            r1 = r0
        L28:
            if (r1 == 0) goto L56
            boolean r2 = r6.isInstance(r1)
            if (r2 == 0) goto L31
            return r1
        L31:
            boolean r2 = r1 instanceof java.util.Map
            if (r2 == 0) goto L56
            java.util.Map r1 = (java.util.Map) r1
            java.util.Collection r1 = r1.values()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L41:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L52
            java.lang.Object r2 = r1.next()
            boolean r3 = r6.isInstance(r2)
            if (r3 == 0) goto L41
            goto L53
        L52:
            r2 = r0
        L53:
            if (r2 == 0) goto L56
            return r2
        L56:
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
            r1.<init>()
            java.util.Set r1 = java.util.Collections.newSetFromMap(r1)
            r2 = 0
            java.lang.Object r1 = m7070(r6, r1, r7, r2)
            if (r1 == 0) goto L67
            return r1
        L67:
            boolean r1 = r7 instanceof android.view.ViewGroup
            if (r1 == 0) goto L83
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            int r1 = r7.getChildCount()
        L71:
            if (r2 >= r1) goto L83
            android.view.View r3 = r7.getChildAt(r2)
            int r4 = r8 + 1
            java.lang.Object r3 = m7071(r5, r6, r3, r4)
            if (r3 == 0) goto L80
            return r3
        L80:
            int r2 = r2 + 1
            goto L71
        L83:
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public static android.view.View m7072(android.view.ViewGroup r4, java.lang.String r5) {
            java.lang.String r0 = "dyhelper_right_button:"
            java.lang.String r5 = r0.concat(r5)
            int r0 = r4.getChildCount()
            r1 = 0
        Lb:
            r2 = 0
            if (r1 >= r0) goto L22
            android.view.View r3 = r4.getChildAt(r1)
            if (r3 == 0) goto L18
            java.lang.Object r2 = r3.getTag()
        L18:
            boolean r2 = p000.ln0.m3626(r2, r5)
            if (r2 == 0) goto L1f
            return r3
        L1f:
            int r1 = r1 + 1
            goto Lb
        L22:
            return r2
    }

    /* JADX INFO: renamed from: η */
    public static android.widget.ImageView m7073(android.view.View r3) {
            boolean r0 = r3 instanceof android.widget.ImageView
            if (r0 == 0) goto L7
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            return r3
        L7:
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto L25
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r0 = r3.getChildCount()
            r1 = 0
        L12:
            if (r1 >= r0) goto L25
            android.view.View r2 = r3.getChildAt(r1)
            r2.getClass()
            android.widget.ImageView r2 = m7073(r2)
            if (r2 == 0) goto L22
            return r2
        L22:
            int r1 = r1 + 1
            goto L12
        L25:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: θ */
    public static android.widget.TextView m7074(android.view.View r3) {
            boolean r0 = r3 instanceof android.widget.TextView
            if (r0 == 0) goto L7
            android.widget.TextView r3 = (android.widget.TextView) r3
            return r3
        L7:
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto L25
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r0 = r3.getChildCount()
            r1 = 0
        L12:
            if (r1 >= r0) goto L25
            android.view.View r2 = r3.getChildAt(r1)
            r2.getClass()
            android.widget.TextView r2 = m7074(r2)
            if (r2 == 0) goto L22
            return r2
        L22:
            int r1 = r1 + 1
            goto L12
        L25:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ι */
    public static final android.widget.LinearLayout m7075(android.view.View r6, int r7) {
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            r1 = 5
            if (r7 <= r1) goto L8
            return r0
        L8:
            boolean r1 = r6 instanceof android.widget.LinearLayout
            r2 = 1
            if (r1 == 0) goto L3a
            r1 = r6
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            int r3 = r1.getVisibility()
            if (r3 != 0) goto L3a
            int r3 = r1.getOrientation()
            if (r3 != r2) goto L3a
            int r3 = r1.getWidth()
            r4 = 150(0x96, float:2.1E-43)
            if (r4 > r3) goto L3a
            r5 = 241(0xf1, float:3.38E-43)
            if (r3 >= r5) goto L3a
            int r3 = r1.getHeight()
            if (r4 > r3) goto L3a
            r4 = 261(0x105, float:3.66E-43)
            if (r3 >= r4) goto L3a
            int r3 = r1.getChildCount()
            r4 = 2
            if (r3 < r4) goto L3a
            return r1
        L3a:
            boolean r1 = r6 instanceof android.view.ViewGroup
            if (r1 == 0) goto L57
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            int r1 = r6.getChildCount()
            r3 = 0
        L45:
            if (r3 >= r1) goto L57
            android.view.View r4 = r6.getChildAt(r3)
            int r5 = r7 + 1
            android.widget.LinearLayout r4 = m7075(r4, r5)
            if (r4 == 0) goto L54
            return r4
        L54:
            int r3 = r3 + 1
            goto L45
        L57:
            return r0
    }

    /* JADX INFO: renamed from: κ */
    public static android.view.View m7076(android.view.View r3, java.lang.String r4, java.lang.Class r5) {
            boolean r0 = r5.isInstance(r3)
            if (r0 == 0) goto L17
            java.lang.Object r0 = r3.getTag()
            boolean r0 = p000.ln0.m3626(r0, r4)
            if (r0 == 0) goto L17
            java.lang.Object r3 = r5.cast(r3)
            android.view.View r3 = (android.view.View) r3
            return r3
        L17:
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto L35
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r0 = r3.getChildCount()
            r1 = 0
        L22:
            if (r1 >= r0) goto L35
            android.view.View r2 = r3.getChildAt(r1)
            r2.getClass()
            android.view.View r2 = m7076(r2, r4, r5)
            if (r2 == 0) goto L32
            return r2
        L32:
            int r1 = r1 + 1
            goto L22
        L35:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: λ */
    public static final android.view.View m7077(android.view.View r4, int r5) {
            if (r4 != 0) goto L3
            goto L4a
        L3:
            r0 = 5
            if (r5 <= r0) goto L7
            goto L4a
        L7:
            boolean r0 = r4 instanceof android.widget.TextView
            if (r0 == 0) goto Lc
            return r4
        Lc:
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "TextSwitcher"
            r2 = 0
            boolean r0 = p000.q02.m4654(r0, r1, r2)
            if (r0 != 0) goto L4b
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "DuxTextView"
            boolean r0 = p000.q02.m4654(r0, r1, r2)
            if (r0 == 0) goto L2e
            goto L4b
        L2e:
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L4a
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r4.getChildCount()
        L38:
            if (r2 >= r0) goto L4a
            android.view.View r1 = r4.getChildAt(r2)
            int r3 = r5 + 1
            android.view.View r1 = m7077(r1, r3)
            if (r1 == 0) goto L47
            return r1
        L47:
            int r2 = r2 + 1
            goto L38
        L4a:
            r4 = 0
        L4b:
            return r4
    }

    /* JADX INFO: renamed from: μ */
    public static int m7078(android.view.ViewGroup r2, java.util.Set r3) {
            int r0 = r2.getChildCount()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        La:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r3.next()
            android.view.View r1 = (android.view.View) r1
            int r1 = r2.indexOfChild(r1)
            if (r1 < 0) goto La
            if (r1 >= r0) goto La
            r0 = r1
            goto La
        L20:
            return r0
    }

    /* JADX INFO: renamed from: ν */
    public static void m7079(android.view.ViewGroup r30, java.lang.String r31) {
            r1 = r30
            s62 r2 = p000.s62.f9751
            java.lang.Class r0 = r1.getClass()
        L8:
            if (r0 == 0) goto L761
            java.lang.Class<android.view.View> r3 = android.view.View.class
            boolean r4 = r0.equals(r3)
            if (r4 != 0) goto L761
            java.lang.String r4 = r0.getName()
            java.lang.String r5 = "~7958639020ABF95155FECBEFEE807165BD4E6AA9062C97DCAC477B07F2CC5FA3D6AA2F8632C81877EA9DEE34649246A2C86F42"
            java.lang.String r5 = p000.jf0.m2957(r5)
            boolean r5 = r4.equals(r5)
            r6 = 0
            if (r5 != 0) goto L31
            java.lang.String r5 = ".FeedRightScaleView"
            boolean r4 = p000.x02.m6479(r4, r5, r6)
            if (r4 == 0) goto L2c
            goto L31
        L2c:
            java.lang.Class r0 = r0.getSuperclass()
            goto L8
        L31:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = p000.z20.f12948
            java.util.Iterator r5 = r0.iterator()
        L3c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L6f
            java.lang.Object r7 = r5.next()
            r0 = r7
            v20 r0 = (p000.v20) r0
            p70 r0 = r0.f11072     // Catch: java.lang.Throwable -> L55
            java.lang.Object r0 = r0.invoke()     // Catch: java.lang.Throwable -> L55
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L55
            r0.getClass()     // Catch: java.lang.Throwable -> L55
            goto L5c
        L55:
            r0 = move-exception
            eo1 r8 = new eo1
            r8.<init>(r0)
            r0 = r8
        L5c:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            boolean r9 = r0 instanceof p000.eo1
            if (r9 == 0) goto L63
            r0 = r8
        L63:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L3c
            r4.add(r7)
            goto L3c
        L6f:
            java.util.ArrayList r0 = new java.util.ArrayList
            r5 = 10
            int r7 = p000.AbstractC1021yh.m6889(r4, r5)
            r0.<init>(r7)
            java.util.Iterator r7 = r4.iterator()
        L7e:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L90
            java.lang.Object r8 = r7.next()
            v20 r8 = (p000.v20) r8
            java.lang.String r8 = r8.f11069
            r0.add(r8)
            goto L7e
        L90:
            java.util.Set r0 = p000.AbstractC0984xh.m6671(r0)
            int r7 = r1.getChildCount()
            r8 = 1
            int r7 = r7 - r8
        L9a:
            java.lang.String r9 = "dyhelper_right_button:"
            r10 = -1
            r11 = 0
            if (r10 >= r7) goto Lcb
            android.view.View r10 = r1.getChildAt(r7)
            if (r10 != 0) goto La7
            goto Lc8
        La7:
            java.lang.Object r10 = r10.getTag()
            boolean r12 = r10 instanceof java.lang.String
            if (r12 == 0) goto Lb2
            r11 = r10
            java.lang.String r11 = (java.lang.String) r11
        Lb2:
            if (r11 != 0) goto Lb5
            goto Lc8
        Lb5:
            boolean r10 = p000.x02.m6485(r11, r9, r6)
            if (r10 == 0) goto Lc8
            java.lang.String r9 = p000.q02.m4678(r11, r9)
            boolean r9 = r0.contains(r9)
            if (r9 != 0) goto Lc8
            r1.removeViewAt(r7)
        Lc8:
            int r7 = r7 + (-1)
            goto L9a
        Lcb:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto Ld3
            goto L761
        Ld3:
            android.content.Context r7 = r1.getContext()
            if (r7 != 0) goto Ldb
            goto L761
        Ldb:
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r0.<init>()
            java.util.Set r12 = java.util.Collections.newSetFromMap(r0)
            eh r0 = p000.C0248eh.f3550     // Catch: java.lang.Throwable -> L11b
            java.util.ArrayList r0 = p000.C0248eh.m1920()     // Catch: java.lang.Throwable -> L11b
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L11b
        Lee:
            boolean r13 = r0.hasNext()     // Catch: java.lang.Throwable -> L11b
            if (r13 == 0) goto L11d
            java.lang.Object r13 = r0.next()     // Catch: java.lang.Throwable -> L11b
            android.view.View r13 = (android.view.View) r13     // Catch: java.lang.Throwable -> L11b
            r14 = r6
        Lfb:
            if (r13 == 0) goto L114
            r15 = 24
            if (r14 >= r15) goto L114
            android.view.ViewParent r15 = r13.getParent()     // Catch: java.lang.Throwable -> L11b
            if (r15 != r1) goto L108
            goto L115
        L108:
            boolean r13 = r15 instanceof android.view.View     // Catch: java.lang.Throwable -> L11b
            if (r13 == 0) goto L110
            android.view.View r15 = (android.view.View) r15     // Catch: java.lang.Throwable -> L11b
            r13 = r15
            goto L111
        L110:
            r13 = r11
        L111:
            int r14 = r14 + 1
            goto Lfb
        L114:
            r13 = r11
        L115:
            if (r13 == 0) goto Lee
            r12.add(r13)     // Catch: java.lang.Throwable -> L11b
            goto Lee
        L11b:
            r0 = move-exception
            goto L11f
        L11d:
            r13 = r2
            goto L124
        L11f:
            eo1 r13 = new eo1
            r13.<init>(r0)
        L124:
            java.lang.Throwable r0 = p000.fo1.m2190(r13)
            r13 = 4
            java.lang.String r14 = "FeedRightButtonManager"
            if (r0 == 0) goto L13a
            java.lang.String r0 = r0.getMessage()
            java.lang.String r15 = "读取唱片尾部锚点失败，保留宿主当前顺序: "
            java.lang.String r0 = p000.lz1.m3687(r15, r0)
            p000.C0888ux.m5988(r14, r0, r11, r13, r11)
        L13a:
            int r0 = r1.getChildCount()
            r15 = r6
        L13f:
            if (r15 >= r0) goto L17f
            android.view.View r5 = r1.getChildAt(r15)
            if (r5 != 0) goto L14a
        L147:
            r19 = r8
            goto L176
        L14a:
            java.lang.Class r16 = r5.getClass()
            r11 = r16
        L150:
            if (r11 == 0) goto L147
            boolean r16 = r11.equals(r3)
            if (r16 != 0) goto L147
            java.lang.String r13 = r11.getName()
            java.lang.String r18 = "~7883762E03D36847EFF3BA0793C09F8E02F6EC9E30B4641E11171B5DA0BE514FE985D742D83AAE78638743D2BA3687C926224D31E60992AEED40D196DAE2A28FB8E8F48913"
            r19 = r8
            java.lang.String r8 = p000.jf0.m2957(r18)
            boolean r8 = r13.equals(r8)
            if (r8 == 0) goto L16e
            r12.add(r5)
            goto L176
        L16e:
            java.lang.Class r11 = r11.getSuperclass()
            r8 = r19
            r13 = 4
            goto L150
        L176:
            int r15 = r15 + 1
            r8 = r19
            r5 = 10
            r11 = 0
            r13 = 4
            goto L13f
        L17f:
            r19 = r8
            r12.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r4.iterator()
        L18d:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L1a9
            java.lang.Object r5 = r3.next()
            v20 r5 = (p000.v20) r5
            java.lang.String r8 = r5.f11069
            android.view.View r8 = m7072(r1, r8)
            if (r8 == 0) goto L1a5
            m7084(r8, r5)
            goto L18d
        L1a5:
            r0.add(r5)
            goto L18d
        L1a9:
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L2c0
            int r3 = r1.getChildCount()
            int r3 = r3 + (-1)
        L1b5:
            if (r10 >= r3) goto L2b3
            android.view.View r5 = r1.getChildAt(r3)
            if (r5 != 0) goto L1c7
        L1bd:
            r26 = r0
            r27 = r2
            r28 = r4
            r29 = r12
            goto L2a1
        L1c7:
            java.lang.Object r8 = r5.getTag()
            boolean r11 = r8 instanceof java.lang.String
            if (r11 == 0) goto L1d2
            java.lang.String r8 = (java.lang.String) r8
            goto L1d3
        L1d2:
            r8 = 0
        L1d3:
            if (r8 == 0) goto L1de
            boolean r8 = p000.x02.m6485(r8, r9, r6)
            r11 = r19
            if (r8 != r11) goto L1de
            goto L1bd
        L1de:
            boolean r8 = r12.contains(r5)
            if (r8 != 0) goto L1bd
            int r8 = r5.getVisibility()
            if (r8 != 0) goto L1bd
            int r8 = r5.getWidth()
            if (r8 <= 0) goto L1bd
            int r8 = r5.getHeight()
            if (r8 > 0) goto L1f7
            goto L1bd
        L1f7:
            boolean r8 = r5 instanceof android.view.ViewGroup
            if (r8 == 0) goto L1fe
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            goto L1ff
        L1fe:
            r5 = 0
        L1ff:
            if (r5 != 0) goto L202
            goto L1bd
        L202:
            android.widget.LinearLayout r8 = m7075(r5, r6)
            if (r8 != 0) goto L209
            goto L1bd
        L209:
            android.widget.ImageView r23 = m7073(r8)
            android.widget.TextView r24 = m7074(r8)
            android.view.View r25 = m7077(r8, r6)
            java.lang.Class r3 = r5.getClass()
            java.lang.String r3 = r3.getName()
            int r11 = r5.getWidth()
            int r13 = r5.getHeight()
            java.lang.Class r15 = r8.getClass()
            java.lang.String r15 = r15.getName()
            int r10 = r8.getWidth()
            int r6 = r8.getHeight()
            r26 = r0
            float r0 = r8.getX()
            r27 = r2
            float r2 = r8.getY()
            if (r23 == 0) goto L250
            java.lang.Class r20 = r23.getClass()
            java.lang.String r20 = r20.getName()
            r28 = r4
            r4 = r20
            goto L253
        L250:
            r28 = r4
            r4 = 0
        L253:
            if (r24 == 0) goto L264
            java.lang.Class r20 = r24.getClass()
            java.lang.String r20 = r20.getName()
            r21 = r5
            r5 = r20
        L261:
            r22 = r8
            goto L268
        L264:
            r21 = r5
            r5 = 0
            goto L261
        L268:
            java.lang.String r8 = "找到右侧按钮模板 outer="
            r29 = r12
            java.lang.String r12 = " outerSize="
            java.lang.String r1 = "x"
            java.lang.StringBuilder r3 = p000.AbstractC0602nx.m4135(r11, r8, r3, r12, r1)
            java.lang.String r8 = " inner="
            java.lang.String r11 = " innerSize="
            p000.lz1.m3671(r3, r13, r8, r15, r11)
            java.lang.String r8 = " innerX="
            p000.AbstractC0602nx.m4117(r3, r10, r1, r6, r8)
            r3.append(r0)
            java.lang.String r0 = " innerY="
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = " icon="
            r3.append(r0)
            java.lang.String r0 = " text="
            java.lang.String r0 = p000.AbstractC0602nx.m4133(r3, r4, r0, r5)
            r1 = 4
            r2 = 0
            p000.C0888ux.m5988(r14, r0, r2, r1, r2)
            x20 r20 = new x20
            r20.<init>(r21, r22, r23, r24, r25)
            goto L2bd
        L2a1:
            int r3 = r3 + (-1)
            r6 = 0
            r10 = -1
            r19 = 1
            r1 = r30
            r0 = r26
            r2 = r27
            r4 = r28
            r12 = r29
            goto L1b5
        L2b3:
            r26 = r0
            r27 = r2
            r28 = r4
            r29 = r12
            r20 = 0
        L2bd:
            r1 = r20
            goto L2c9
        L2c0:
            r26 = r0
            r27 = r2
            r28 = r4
            r29 = r12
            r1 = 0
        L2c9:
            java.util.Iterator r2 = r26.iterator()
            r2.getClass()
        L2d0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L5e3
            java.lang.Object r0 = r2.next()
            r0.getClass()
            r3 = r0
            v20 r3 = (p000.v20) r3
            java.lang.String r4 = r3.f11069
            if (r1 == 0) goto L2e7
            android.view.ViewGroup r0 = r1.f12002
            goto L2e8
        L2e7:
            r0 = 0
        L2e8:
            if (r1 == 0) goto L2ed
            android.widget.LinearLayout r5 = r1.f12003
            goto L2ee
        L2ed:
            r5 = 0
        L2ee:
            if (r1 == 0) goto L2f3
            android.widget.ImageView r6 = r1.f12004
            goto L2f4
        L2f3:
            r6 = 0
        L2f4:
            if (r1 == 0) goto L2f9
            android.widget.TextView r8 = r1.f12005
            goto L2fa
        L2f9:
            r8 = 0
        L2fa:
            r10 = 1115947008(0x42840000, float:66.0)
            if (r5 == 0) goto L311
            int r11 = r5.getWidth()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            if (r11 <= 0) goto L309
            goto L30a
        L309:
            r12 = 0
        L30a:
            if (r12 == 0) goto L311
            int r11 = r12.intValue()
            goto L315
        L311:
            int r11 = m7069(r7, r10)
        L315:
            r12 = 1112539136(0x42500000, float:52.0)
            int r13 = m7069(r7, r12)
            r15 = 1108869120(0x42180000, float:38.0)
            int r15 = m7069(r7, r15)
            android.widget.FrameLayout r12 = new android.widget.FrameLayout
            r12.<init>(r7)
            java.lang.String r10 = r3.f11070
            r22 = r0
            java.lang.String r0 = r9.concat(r4)
            r12.setTag(r0)
            r23 = r2
            r2 = 0
            r12.setClickable(r2)
            r12.setFocusable(r2)
            r12.setClipChildren(r2)
            r12.setClipToPadding(r2)
            r0 = 1086324736(0x40c00000, float:6.0)
            int r0 = m7069(r7, r0)
            float r0 = (float) r0
            float r0 = -r0
            r12.setTranslationX(r0)
            if (r22 == 0) goto L365
            int r0 = r22.getPaddingLeft()
            int r2 = r22.getPaddingTop()
            r24 = r5
            int r5 = r22.getPaddingRight()
            r25 = r6
            int r6 = r22.getPaddingBottom()
            r12.setPadding(r0, r2, r5, r6)
            goto L369
        L365:
            r24 = r5
            r25 = r6
        L369:
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r7)
            r5 = 1
            r2.setOrientation(r5)
            r2.setGravity(r5)
            r2.setClickable(r5)
            r2.setFocusable(r5)
            java.lang.String r0 = r3.f11071
            r2.setContentDescription(r0)
            r5 = 0
            r2.setClipChildren(r5)
            r2.setClipToPadding(r5)
            if (r24 == 0) goto L39b
            int r0 = r24.getMinimumWidth()
            r2.setMinimumWidth(r0)
            int r0 = r24.getPaddingLeft()
            int r6 = r24.getPaddingRight()
            r2.setPadding(r0, r5, r6, r5)
        L39b:
            android.util.TypedValue r0 = new android.util.TypedValue     // Catch: java.lang.Throwable -> L3b6
            r0.<init>()     // Catch: java.lang.Throwable -> L3b6
            android.content.res.Resources$Theme r5 = r7.getTheme()     // Catch: java.lang.Throwable -> L3b6
            r6 = 16843868(0x101045c, float:2.3696686E-38)
            r22 = r8
            r8 = 1
            r5.resolveAttribute(r6, r0, r8)     // Catch: java.lang.Throwable -> L3b4
            int r0 = r0.resourceId     // Catch: java.lang.Throwable -> L3b4
            android.graphics.drawable.Drawable r0 = r7.getDrawable(r0)     // Catch: java.lang.Throwable -> L3b4
            goto L3bf
        L3b4:
            r0 = move-exception
            goto L3b9
        L3b6:
            r0 = move-exception
            r22 = r8
        L3b9:
            eo1 r5 = new eo1
            r5.<init>(r0)
            r0 = r5
        L3bf:
            boolean r5 = r0 instanceof p000.eo1
            if (r5 == 0) goto L3c4
            r0 = 0
        L3c4:
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r2.setBackground(r0)
            android.widget.ImageView r0 = new android.widget.ImageView
            r0.<init>(r7)
            java.lang.String r5 = "icon"
            r0.setTag(r5)
            r0.setContentDescription(r10)
            if (r25 == 0) goto L3de
            android.widget.ImageView$ScaleType r5 = r25.getScaleType()
            if (r5 != 0) goto L3e0
        L3de:
            android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_INSIDE
        L3e0:
            r0.setScaleType(r5)
            r5 = 0
            r0.setAdjustViewBounds(r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r5.<init>(r15, r15)
            r8 = 1
            r5.gravity = r8
            r6 = 1073741824(0x40000000, float:2.0)
            int r6 = m7069(r7, r6)
            r5.topMargin = r6
            r2.addView(r0, r5)
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r7)
            java.lang.String r5 = "label"
            r0.setTag(r5)
            r0.setText(r10)
            r5 = 17
            r0.setGravity(r5)
            r8 = 1
            r0.setMaxLines(r8)
            r5 = 0
            r0.setIncludeFontPadding(r5)
            r6 = 1092616192(0x41200000, float:10.0)
            r8 = 2
            r0.setTextSize(r8, r6)
            if (r22 == 0) goto L421
            android.graphics.Typeface r6 = r22.getTypeface()
            goto L422
        L421:
            r6 = 0
        L422:
            r0.setTypeface(r6)
            r0.setPadding(r5, r5, r5, r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r6 = -2
            r5.<init>(r11, r6)
            r8 = 1
            r5.gravity = r8
            r10 = -1073741824(0xffffffffc0000000, float:-2.0)
            int r10 = m7069(r7, r10)
            r5.topMargin = r10
            r2.addView(r0, r5)
            c9 r0 = new c9
            r10 = 4
            r5 = r30
            r0.<init>(r5, r3, r12, r10)
            r2.setOnClickListener(r0)
            if (r1 == 0) goto L44c
            android.widget.LinearLayout r0 = r1.f12003
            goto L44d
        L44c:
            r0 = 0
        L44d:
            if (r1 == 0) goto L452
            android.view.ViewGroup r10 = r1.f12002
            goto L453
        L452:
            r10 = 0
        L453:
            if (r0 == 0) goto L46a
            int r11 = r0.getWidth()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r11)
            if (r11 <= 0) goto L460
            goto L461
        L460:
            r15 = 0
        L461:
            if (r15 == 0) goto L46a
            int r11 = r15.intValue()
        L467:
            r15 = 1112539136(0x42500000, float:52.0)
            goto L471
        L46a:
            r11 = 1115947008(0x42840000, float:66.0)
            int r11 = m7069(r7, r11)
            goto L467
        L471:
            int r8 = m7069(r7, r15)
            android.widget.FrameLayout$LayoutParams r15 = new android.widget.FrameLayout$LayoutParams
            r15.<init>(r11, r8)
            if (r0 == 0) goto L481
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            goto L482
        L481:
            r0 = 0
        L482:
            boolean r6 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r6 == 0) goto L489
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            goto L48a
        L489:
            r0 = 0
        L48a:
            if (r0 == 0) goto L499
            int r6 = r0.leftMargin
            r15.leftMargin = r6
            int r0 = r0.rightMargin
            r15.rightMargin = r0
            r6 = 0
            r15.topMargin = r6
            r15.bottomMargin = r6
        L499:
            int r0 = r15.leftMargin
            if (r0 != 0) goto L4ae
            if (r10 == 0) goto L4ae
            int r0 = r10.getWidth()
            if (r0 <= 0) goto L4ae
            if (r11 <= 0) goto L4ae
            int r0 = r10.getWidth()
            int r0 = r0 - r11
            r15.leftMargin = r0
        L4ae:
            int r0 = r15.leftMargin
            if (r0 != 0) goto L4ba
            r0 = 1109131264(0x421c0000, float:39.0)
            int r0 = m7069(r7, r0)
            r15.leftMargin = r0
        L4ba:
            r6 = 0
            r15.gravity = r6
            int r0 = r15.leftMargin
            int r6 = r15.topMargin
            int r10 = r15.rightMargin
            r22 = r9
            int r9 = r15.bottomMargin
            r24 = r4
            java.lang.String r4 = " height="
            java.lang.String r5 = " left="
            r25 = r7
            java.lang.String r7 = "右侧按钮 innerLp width="
            java.lang.StringBuilder r4 = p000.AbstractC0602nx.m4136(r7, r11, r4, r8, r5)
            java.lang.String r5 = " top="
            java.lang.String r7 = " right="
            p000.AbstractC0602nx.m4117(r4, r0, r5, r6, r7)
            r4.append(r10)
            java.lang.String r0 = " bottom="
            r4.append(r0)
            r4.append(r9)
            java.lang.String r0 = r4.toString()
            r4 = 0
            r10 = 4
            p000.C0888ux.m5988(r14, r0, r4, r10, r4)
            r15.height = r13
            r12.addView(r2, r15)
            m7084(r12, r3)
            if (r1 == 0) goto L501
            android.view.ViewGroup r0 = r1.f12002
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            goto L502
        L501:
            r0 = 0
        L502:
            boolean r2 = r0 instanceof android.widget.LinearLayout.LayoutParams
            if (r2 == 0) goto L513
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            r2.<init>(r0)
        L50d:
            r3 = r25
            r4 = -2
            r15 = 1112539136(0x42500000, float:52.0)
            goto L539
        L513:
            boolean r2 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto L51f
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            r2.<init>(r0)
            goto L50d
        L51f:
            if (r0 == 0) goto L52b
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            int r3 = r0.width
            int r0 = r0.height
            r2.<init>(r3, r0)
            goto L50d
        L52b:
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = r25
            r15 = 1112539136(0x42500000, float:52.0)
            int r0 = m7069(r3, r15)
            r4 = -2
            r2.<init>(r4, r0)
        L539:
            int r0 = r2.width
            r5 = -1
            if (r0 != r5) goto L540
            r2.width = r4
        L540:
            int r0 = m7069(r3, r15)
            r2.height = r0
            r6 = 0
            r2.topMargin = r6
            r0 = 5
            r2.bottomMargin = r0
            r2.rightMargin = r6
            r2.setMarginEnd(r6)
            r0 = 8388613(0x800005, float:1.175495E-38)
            r2.gravity = r0
            r4 = r30
            r6 = r29
            int r0 = m7078(r4, r6)     // Catch: java.lang.Throwable -> L575
            r4.addView(r12, r0, r2)     // Catch: java.lang.Throwable -> L575
            r4.requestLayout()     // Catch: java.lang.Throwable -> L575
            int r2 = r4.getChildCount()     // Catch: java.lang.Throwable -> L575
            if (r1 == 0) goto L57b
            android.view.ViewGroup r7 = r1.f12002     // Catch: java.lang.Throwable -> L575
            java.lang.Class r7 = r7.getClass()     // Catch: java.lang.Throwable -> L575
            java.lang.String r7 = r7.getName()     // Catch: java.lang.Throwable -> L575
            goto L57c
        L575:
            r0 = move-exception
            r10 = r31
            r9 = r24
            goto L5be
        L57b:
            r7 = 0
        L57c:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L575
            r8.<init>()     // Catch: java.lang.Throwable -> L575
            java.lang.String r9 = "已追加右侧按钮 id="
            r8.append(r9)     // Catch: java.lang.Throwable -> L575
            r9 = r24
            r8.append(r9)     // Catch: java.lang.Throwable -> L5bb
            java.lang.String r10 = " reason="
            r8.append(r10)     // Catch: java.lang.Throwable -> L5bb
            r10 = r31
            r8.append(r10)     // Catch: java.lang.Throwable -> L5b9
            java.lang.String r11 = " index="
            r8.append(r11)     // Catch: java.lang.Throwable -> L5b9
            r8.append(r0)     // Catch: java.lang.Throwable -> L5b9
            java.lang.String r0 = " childCount="
            r8.append(r0)     // Catch: java.lang.Throwable -> L5b9
            r8.append(r2)     // Catch: java.lang.Throwable -> L5b9
            java.lang.String r0 = " template="
            r8.append(r0)     // Catch: java.lang.Throwable -> L5b9
            r8.append(r7)     // Catch: java.lang.Throwable -> L5b9
            java.lang.String r0 = r8.toString()     // Catch: java.lang.Throwable -> L5b9
            r2 = 4
            r7 = 0
            p000.C0888ux.m5988(r14, r0, r7, r2, r7)     // Catch: java.lang.Throwable -> L5b9
            r2 = r27
            goto L5c3
        L5b9:
            r0 = move-exception
            goto L5be
        L5bb:
            r0 = move-exception
            r10 = r31
        L5be:
            eo1 r2 = new eo1
            r2.<init>(r0)
        L5c3:
            java.lang.Throwable r0 = p000.fo1.m2190(r2)
            if (r0 == 0) goto L5da
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = "追加右侧按钮失败 id="
            java.lang.String r7 = ": "
            java.lang.String r0 = p000.a12.m18(r2, r9, r7, r0)
            r2 = 4
            r7 = 0
            p000.C0888ux.m5988(r14, r0, r7, r2, r7)
        L5da:
            r7 = r3
            r29 = r6
            r9 = r22
            r2 = r23
            goto L2d0
        L5e3:
            r4 = r30
            r6 = r29
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L5ef
            goto L761
        L5ef:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r28.iterator()
        L5f8:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L610
            java.lang.Object r2 = r0.next()
            v20 r2 = (p000.v20) r2
            java.lang.String r2 = r2.f11069
            android.view.View r2 = m7072(r4, r2)
            if (r2 == 0) goto L5f8
            r1.add(r2)
            goto L5f8
        L610:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L618
            goto L761
        L618:
            int r0 = m7078(r4, r6)
            int r2 = r4.getChildCount()
            if (r0 < r2) goto L624
            goto L761
        L624:
            int r2 = r1.size()
            int r0 = r0 - r2
            if (r0 < 0) goto L65b
            xm0 r2 = p000.AbstractC1021yh.m6857(r1)
            boolean r3 = r2 instanceof java.util.Collection
            if (r3 == 0) goto L63e
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L63e
            goto L761
        L63e:
            java.util.Iterator r2 = r2.iterator()
        L642:
            r3 = r2
            wm0 r3 = (p000.wm0) r3
            boolean r5 = r3.f11765
            if (r5 == 0) goto L761
            int r3 = r3.nextInt()
            java.lang.Object r5 = r1.get(r3)
            android.view.View r5 = (android.view.View) r5
            int r5 = r4.indexOfChild(r5)
            int r3 = r3 + r0
            if (r5 != r3) goto L65b
            goto L642
        L65b:
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r0 = p000.AbstractC1021yh.m6889(r1, r3)
            r2.<init>(r0)
            java.util.Iterator r0 = r1.iterator()
        L66a:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L682
            java.lang.Object r3 = r0.next()
            android.view.View r3 = (android.view.View) r3
            int r3 = r4.indexOfChild(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.add(r3)
            goto L66a
        L682:
            java.util.ArrayList r3 = new java.util.ArrayList
            r5 = 10
            int r0 = p000.AbstractC1021yh.m6889(r1, r5)
            r3.<init>(r0)
            java.util.Iterator r0 = r1.iterator()
        L691:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L6a5
            java.lang.Object r5 = r0.next()
            android.view.View r5 = (android.view.View) r5
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            r3.add(r5)
            goto L691
        L6a5:
            java.util.Iterator r0 = r1.iterator()     // Catch: java.lang.Throwable -> L6b9
        L6a9:
            boolean r5 = r0.hasNext()     // Catch: java.lang.Throwable -> L6b9
            if (r5 == 0) goto L6bb
            java.lang.Object r5 = r0.next()     // Catch: java.lang.Throwable -> L6b9
            android.view.View r5 = (android.view.View) r5     // Catch: java.lang.Throwable -> L6b9
            r4.removeView(r5)     // Catch: java.lang.Throwable -> L6b9
            goto L6a9
        L6b9:
            r0 = move-exception
            goto L707
        L6bb:
            int r0 = m7078(r4, r6)     // Catch: java.lang.Throwable -> L6b9
            java.util.Iterator r5 = r1.iterator()     // Catch: java.lang.Throwable -> L6b9
            r6 = 0
        L6c4:
            boolean r7 = r5.hasNext()     // Catch: java.lang.Throwable -> L6b9
            if (r7 == 0) goto L6e7
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L6b9
            int r8 = r6 + 1
            if (r6 < 0) goto L6e1
            android.view.View r7 = (android.view.View) r7     // Catch: java.lang.Throwable -> L6b9
            java.lang.Object r6 = r3.get(r6)     // Catch: java.lang.Throwable -> L6b9
            android.view.ViewGroup$LayoutParams r6 = (android.view.ViewGroup.LayoutParams) r6     // Catch: java.lang.Throwable -> L6b9
            r4.addView(r7, r0, r6)     // Catch: java.lang.Throwable -> L6b9
            int r0 = r0 + 1
            r6 = r8
            goto L6c4
        L6e1:
            p000.AbstractC1021yh.m6917()     // Catch: java.lang.Throwable -> L6b9
            r17 = 0
            throw r17     // Catch: java.lang.Throwable -> L6b9
        L6e7:
            r4.requestLayout()     // Catch: java.lang.Throwable -> L6b9
            int r0 = r1.size()     // Catch: java.lang.Throwable -> L6b9
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6b9
            r5.<init>()     // Catch: java.lang.Throwable -> L6b9
            java.lang.String r6 = "已纠正右侧按钮顺序，保留唱片/听抖音尾部区域 buttons="
            r5.append(r6)     // Catch: java.lang.Throwable -> L6b9
            r5.append(r0)     // Catch: java.lang.Throwable -> L6b9
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L6b9
            r7 = 0
            r10 = 4
            p000.C0888ux.m5988(r14, r0, r7, r10, r7)     // Catch: java.lang.Throwable -> L6b9
            r5 = r27
            goto L70c
        L707:
            eo1 r5 = new eo1
            r5.<init>(r0)
        L70c:
            java.lang.Throwable r0 = p000.fo1.m2190(r5)
            if (r0 == 0) goto L761
            java.util.Iterator r1 = r1.iterator()
            r5 = 0
        L717:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L752
            java.lang.Object r6 = r1.next()
            int r7 = r5 + 1
            if (r5 < 0) goto L74d
            android.view.View r6 = (android.view.View) r6
            android.view.ViewParent r8 = r6.getParent()
            if (r8 == r4) goto L74a
            java.lang.Object r8 = r2.get(r5)     // Catch: java.lang.Throwable -> L74a
            java.lang.Number r8 = (java.lang.Number) r8     // Catch: java.lang.Throwable -> L74a
            int r8 = r8.intValue()     // Catch: java.lang.Throwable -> L74a
            int r9 = r4.getChildCount()     // Catch: java.lang.Throwable -> L74a
            r10 = 0
            int r8 = p000.j81.m2906(r8, r10, r9)     // Catch: java.lang.Throwable -> L74b
            java.lang.Object r5 = r3.get(r5)     // Catch: java.lang.Throwable -> L74b
            android.view.ViewGroup$LayoutParams r5 = (android.view.ViewGroup.LayoutParams) r5     // Catch: java.lang.Throwable -> L74b
            r4.addView(r6, r8, r5)     // Catch: java.lang.Throwable -> L74b
            goto L74b
        L74a:
            r10 = 0
        L74b:
            r5 = r7
            goto L717
        L74d:
            p000.AbstractC1021yh.m6917()
            r7 = 0
            throw r7
        L752:
            r7 = 0
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "纠正右侧按钮顺序失败，已保留宿主布局: "
            java.lang.String r0 = p000.lz1.m3687(r1, r0)
            r10 = 4
            p000.C0888ux.m5988(r14, r0, r7, r10, r7)
        L761:
            return
    }

    /* JADX INFO: renamed from: ξ */
    public static void m7080(p000.v20 r4) {
            java.util.concurrent.CopyOnWriteArrayList r0 = p000.z20.f12948
            if (r0 == 0) goto Lb
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lb
            goto L26
        Lb:
            java.util.Iterator r1 = r0.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r1.next()
            v20 r2 = (p000.v20) r2
            java.lang.String r2 = r2.f11069
            java.lang.String r3 = r4.f11069
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Lf
            return
        L26:
            r0.add(r4)
            return
    }

    /* JADX INFO: renamed from: ο */
    public static java.lang.Object m7081(android.view.ViewGroup r6) {
            java.lang.ClassLoader r0 = p000.z20.f12949
            r1 = 0
            if (r0 != 0) goto L11
            java.lang.Class r0 = r6.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            if (r0 != 0) goto L11
            goto Laa
        L11:
            java.lang.Class r2 = p000.z20.f12951
            if (r2 == 0) goto L16
            goto L37
        L16:
            java.lang.String r2 = "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"
            java.lang.String r2 = p000.jf0.m2957(r2)     // Catch: java.lang.Throwable -> L21
            java.lang.Class r0 = r0.loadClass(r2)     // Catch: java.lang.Throwable -> L21
            goto L28
        L21:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L28:
            boolean r2 = r0 instanceof p000.eo1
            if (r2 != 0) goto L31
            r3 = r0
            java.lang.Class r3 = (java.lang.Class) r3
            p000.z20.f12951 = r3
        L31:
            if (r2 == 0) goto L34
            r0 = r1
        L34:
            r2 = r0
            java.lang.Class r2 = (java.lang.Class) r2
        L37:
            if (r2 != 0) goto L3b
            goto Laa
        L3b:
            sm1 r0 = new sm1
            r0.<init>()
            r3 = 0
            java.lang.Object r0 = m7071(r0, r2, r6, r3)
            if (r0 == 0) goto L48
            return r0
        L48:
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            java.lang.Object r0 = m7070(r2, r0, r6, r3)
            if (r0 == 0) goto L58
            return r0
        L58:
            android.view.ViewParent r0 = r6.getParent()
            r4 = r3
        L5d:
            if (r0 == 0) goto L86
            r5 = 8
            if (r4 >= r5) goto L86
            java.util.IdentityHashMap r5 = new java.util.IdentityHashMap
            r5.<init>()
            java.util.Set r5 = java.util.Collections.newSetFromMap(r5)
            java.lang.Object r5 = m7070(r2, r5, r0, r3)
            if (r5 == 0) goto L73
            return r5
        L73:
            boolean r5 = r0 instanceof android.view.View
            if (r5 == 0) goto L7a
            android.view.View r0 = (android.view.View) r0
            goto L7b
        L7a:
            r0 = r1
        L7b:
            if (r0 == 0) goto L82
            android.view.ViewParent r0 = r0.getParent()
            goto L83
        L82:
            r0 = r1
        L83:
            int r4 = r4 + 1
            goto L5d
        L86:
            android.content.Context r6 = r6.getContext()
            android.app.Activity r6 = m7083(r6)
            if (r6 == 0) goto L9b
            android.view.Window r6 = r6.getWindow()
            if (r6 == 0) goto L9b
            android.view.View r6 = r6.getDecorView()
            goto L9c
        L9b:
            r6 = r1
        L9c:
            if (r6 == 0) goto Laa
            sm1 r0 = new sm1
            r0.<init>()
            java.lang.Object r6 = m7071(r0, r2, r6, r3)
            if (r6 == 0) goto Laa
            return r6
        Laa:
            return r1
    }

    /* JADX INFO: renamed from: π */
    public static android.graphics.drawable.Drawable m7082(int r5, android.content.Context r6, java.lang.String r7) {
            java.lang.String r0 = "com.example.dyhelper"
            r1 = 0
            r6.getClass()     // Catch: java.lang.Throwable -> L42
            r2 = 2
            android.content.Context r2 = r6.createPackageContext(r0, r2)     // Catch: java.lang.Throwable -> L42
            android.content.res.Resources r3 = r2.getResources()     // Catch: java.lang.Throwable -> L42
            r3.getClass()     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = r2.getPackageResourcePath()     // Catch: java.lang.Throwable -> L42
            r4.getClass()     // Catch: java.lang.Throwable -> L42
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Throwable -> L1e
            goto L25
        L1e:
            r2 = move-exception
            eo1 r4 = new eo1     // Catch: java.lang.Throwable -> L42
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L42
            r2 = r4
        L25:
            boolean r4 = r2 instanceof p000.eo1     // Catch: java.lang.Throwable -> L42
            if (r4 == 0) goto L2a
            r2 = r1
        L2a:
            java.lang.ClassLoader r2 = (java.lang.ClassLoader) r2     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto L2f
            goto L35
        L2f:
            java.lang.String r5 = "drawable"
            int r5 = r3.getIdentifier(r7, r5, r0)     // Catch: java.lang.Throwable -> L42
        L35:
            if (r5 != 0) goto L39
            r5 = r1
            goto L49
        L39:
            android.content.res.Resources$Theme r6 = r6.getTheme()     // Catch: java.lang.Throwable -> L42
            android.graphics.drawable.Drawable r5 = r3.getDrawable(r5, r6)     // Catch: java.lang.Throwable -> L42
            goto L49
        L42:
            r5 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r5)
            r5 = r6
        L49:
            java.lang.Throwable r6 = p000.fo1.m2190(r5)
            if (r6 == 0) goto L61
            java.lang.String r6 = r6.getMessage()
            java.lang.String r0 = "加载模块图标失败 name="
            java.lang.String r2 = ": "
            java.lang.String r6 = p000.a12.m18(r0, r7, r2, r6)
            r7 = 4
            java.lang.String r0 = "FeedRightButtonManager"
            p000.C0888ux.m5988(r0, r6, r1, r7, r1)
        L61:
            boolean r6 = r5 instanceof p000.eo1
            if (r6 == 0) goto L66
            goto L67
        L66:
            r1 = r5
        L67:
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            return r1
    }

    /* JADX INFO: renamed from: ρ */
    public static android.app.Activity m7083(android.content.Context r2) {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
        L5:
            if (r2 == 0) goto L1e
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 != 0) goto L1e
            boolean r1 = r2 instanceof android.content.ContextWrapper
            if (r1 != 0) goto L10
            goto L25
        L10:
            boolean r1 = r0.add(r2)
            if (r1 != 0) goto L17
            goto L25
        L17:
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            goto L5
        L1e:
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L25
            android.app.Activity r2 = (android.app.Activity) r2
            return r2
        L25:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: σ */
    public static void m7084(android.view.View r7, p000.v20 r8) {
            android.content.Context r0 = r7.getContext()
            if (r0 != 0) goto L8
            goto L96
        L8:
            java.lang.String r1 = "icon"
            java.lang.Class<android.widget.ImageView> r2 = android.widget.ImageView.class
            android.view.View r1 = m7076(r7, r1, r2)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            java.lang.String r2 = "label"
            java.lang.Class<android.widget.TextView> r3 = android.widget.TextView.class
            android.view.View r7 = m7076(r7, r2, r3)
            android.widget.TextView r7 = (android.widget.TextView) r7
            a80 r2 = r8.f11074     // Catch: java.lang.Throwable -> L25
            java.lang.Object r2 = r2.invoke(r0)     // Catch: java.lang.Throwable -> L25
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L25
            goto L2c
        L25:
            r2 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r2)
            r2 = r3
        L2c:
            boolean r3 = r2 instanceof p000.eo1
            r4 = 0
            if (r3 == 0) goto L32
            r2 = r4
        L32:
            java.lang.Integer r2 = (java.lang.Integer) r2
            r3 = -1
            if (r1 == 0) goto L86
            a80 r5 = r8.f11073     // Catch: java.lang.Throwable -> L40
            java.lang.Object r0 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L40
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0     // Catch: java.lang.Throwable -> L40
            goto L47
        L40:
            r0 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r0)
            r0 = r5
        L47:
            boolean r5 = r0 instanceof p000.eo1
            if (r5 == 0) goto L4c
            r0 = r4
        L4c:
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            if (r0 == 0) goto L64
            r1.setImageDrawable(r0)
            if (r2 == 0) goto L5d
            int r0 = r2.intValue()
            r1.setColorFilter(r0)
            goto L86
        L5d:
            r1.setImageTintList(r4)
            r1.clearColorFilter()
            goto L86
        L64:
            java.lang.String r0 = r8.f11069
            java.lang.String r5 = "右侧按钮图标为空，使用透明占位 id="
            java.lang.String r0 = r5.concat(r0)
            r5 = 4
            java.lang.String r6 = "FeedRightButtonManager"
            p000.C0888ux.m5988(r6, r0, r4, r5, r4)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r4 = 0
            r0.<init>(r4)
            r1.setImageDrawable(r0)
            if (r2 == 0) goto L82
            int r0 = r2.intValue()
            goto L83
        L82:
            r0 = r3
        L83:
            r1.setColorFilter(r0)
        L86:
            if (r7 == 0) goto L96
            java.lang.String r8 = r8.f11070
            r7.setText(r8)
            if (r2 == 0) goto L93
            int r3 = r2.intValue()
        L93:
            r7.setTextColor(r3)
        L96:
            return
    }
}
