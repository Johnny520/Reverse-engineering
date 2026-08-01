package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class uj1 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.ConcurrentHashMap f10859 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.ConcurrentHashMap.KeySetView f10860 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.ConcurrentHashMap f10861 = null;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.uj1.f10859 = r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            p000.uj1.f10860 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.uj1.f10861 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.util.ArrayList m5905(java.lang.Class r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            if (r6 == 0) goto L35
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L35
            java.lang.reflect.Field[] r1 = r6.getDeclaredFields()
            r1.getClass()
            int r2 = r1.length
            r3 = 0
        L18:
            if (r3 >= r2) goto L30
            r4 = r1[r3]
            int r5 = r4.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)
            if (r5 != 0) goto L2d
            r5 = 1
            r4.setAccessible(r5)     // Catch: java.lang.Throwable -> L2a
        L2a:
            r0.add(r4)
        L2d:
            int r3 = r3 + 1
            goto L18
        L30:
            java.lang.Class r6 = r6.getSuperclass()
            goto L5
        L35:
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static java.lang.reflect.Method m5906(java.lang.Class r10) {
            java.util.concurrent.ConcurrentHashMap r0 = p000.uj1.f10859
            java.lang.Object r1 = r0.get(r10)
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            if (r1 == 0) goto Lb
            return r1
        Lb:
            java.util.concurrent.ConcurrentHashMap$KeySetView r1 = p000.uj1.f10860
            boolean r2 = r1.contains(r10)
            r3 = 0
            if (r2 == 0) goto L15
            return r3
        L15:
            r2 = r10
        L16:
            if (r2 == 0) goto L63
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L63
            java.lang.reflect.Method[] r4 = r2.getDeclaredMethods()
            r4.getClass()
            int r5 = r4.length
            r6 = 0
        L29:
            if (r6 >= r5) goto L4f
            r7 = r4[r6]
            java.lang.Class[] r8 = r7.getParameterTypes()
            r8.getClass()
            int r8 = r8.length
            if (r8 != 0) goto L4c
            java.lang.Class r8 = r7.getReturnType()
            java.lang.String r8 = r8.getName()
            java.lang.String r9 = "~792076A9A8C9D37392B1BEA902D394F25696F0B296E3734A64899A3BF2D3979A9BE4B6F08420571E569B93E597"
            java.lang.String r9 = p000.jf0.m2957(r9)
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L4c
            goto L50
        L4c:
            int r6 = r6 + 1
            goto L29
        L4f:
            r7 = r3
        L50:
            if (r7 == 0) goto L57
            r4 = 1
            r7.setAccessible(r4)     // Catch: java.lang.Throwable -> L58
            goto L58
        L57:
            r7 = r3
        L58:
            if (r7 == 0) goto L5e
            r0.put(r10, r7)
            return r7
        L5e:
            java.lang.Class r2 = r2.getSuperclass()
            goto L16
        L63:
            r1.add(r10)
            return r3
    }

    /* JADX INFO: renamed from: γ */
    public static boolean m5907(android.view.View r1, android.view.View r2) {
        L0:
            if (r1 == 0) goto L13
            if (r1 != r2) goto L6
            r1 = 1
            return r1
        L6:
            android.view.ViewParent r1 = r1.getParent()
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L11
            android.view.View r1 = (android.view.View) r1
            goto L0
        L11:
            r1 = 0
            goto L0
        L13:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: δ */
    public static boolean m5908(java.lang.Object r2) {
            if (r2 != 0) goto L3
            goto L24
        L3:
            java.lang.String r0 = "from"
            java.lang.String r0 = m5910(r2, r0)
            java.lang.String r1 = "eventType"
            java.lang.String r2 = m5910(r2, r1)
            java.util.Set r1 = p000.rj1.f9389
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r0 = p000.AbstractC0984xh.m6632(r1, r0)
            if (r0 != 0) goto L26
            java.util.Set r0 = p000.rj1.f9390
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r2 = p000.AbstractC0984xh.m6632(r0, r2)
            if (r2 == 0) goto L24
            goto L26
        L24:
            r2 = 0
            return r2
        L26:
            r2 = 1
            return r2
    }

    /* JADX INFO: renamed from: ε */
    public static java.lang.Object m5909(java.lang.Object r9) {
            r9.getClass()
            java.lang.Class r0 = r9.getClass()
            java.lang.reflect.Method r0 = m5906(r0)
            r1 = 0
            if (r0 == 0) goto L22
            java.lang.Object r0 = r0.invoke(r9, r1)     // Catch: java.lang.Throwable -> L13
            goto L1a
        L13:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L1a:
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto L1f
            r0 = r1
        L1f:
            if (r0 == 0) goto L22
            return r0
        L22:
            java.lang.Class r0 = r9.getClass()
            java.util.concurrent.ConcurrentHashMap r2 = p000.uj1.f10861
            java.lang.Object r0 = r2.get(r0)
            sj1 r0 = (p000.sj1) r0
            java.lang.String r3 = "~792076A9A8C9D37392B1BEA902D394F25696F0B296E3734A64899A3BF2D3979A9BE4B6F08420571E569B93E597"
            if (r0 == 0) goto L74
            java.lang.reflect.Field r4 = r0.f9936     // Catch: java.lang.Throwable -> L39
            java.lang.Object r4 = r4.get(r9)     // Catch: java.lang.Throwable -> L39
            goto L40
        L39:
            r4 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r4)
            r4 = r5
        L40:
            boolean r5 = r4 instanceof p000.eo1
            if (r5 == 0) goto L45
            r4 = r1
        L45:
            if (r4 != 0) goto L49
        L47:
            r0 = r1
            goto L71
        L49:
            java.lang.reflect.Method r0 = r0.f9937     // Catch: java.lang.Throwable -> L50
            java.lang.Object r0 = r0.invoke(r4, r1)     // Catch: java.lang.Throwable -> L50
            goto L57
        L50:
            r0 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r0)
            r0 = r4
        L57:
            boolean r4 = r0 instanceof p000.eo1
            if (r4 == 0) goto L5c
            r0 = r1
        L5c:
            if (r0 != 0) goto L5f
            goto L47
        L5f:
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = p000.jf0.m2957(r3)
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L47
        L71:
            if (r0 == 0) goto L74
            return r0
        L74:
            java.lang.Class r0 = r9.getClass()
            java.util.ArrayList r0 = m5905(r0)
            java.util.Iterator r0 = r0.iterator()
        L80:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto Le5
            java.lang.Object r4 = r0.next()
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            java.lang.Object r5 = r4.get(r9)     // Catch: java.lang.Throwable -> L91
            goto L98
        L91:
            r5 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r5)
            r5 = r6
        L98:
            boolean r6 = r5 instanceof p000.eo1
            if (r6 == 0) goto L9d
            r5 = r1
        L9d:
            if (r5 != 0) goto La0
            goto L80
        La0:
            if (r5 == r9) goto L80
            boolean r6 = r5 instanceof android.view.View
            if (r6 == 0) goto La7
            goto L80
        La7:
            java.lang.Class r6 = r5.getClass()
            java.lang.reflect.Method r6 = m5906(r6)
            if (r6 != 0) goto Lb2
            goto L80
        Lb2:
            java.lang.Object r5 = r6.invoke(r5, r1)     // Catch: java.lang.Throwable -> Lb7
            goto Lbe
        Lb7:
            r5 = move-exception
            eo1 r7 = new eo1
            r7.<init>(r5)
            r5 = r7
        Lbe:
            boolean r7 = r5 instanceof p000.eo1
            if (r7 == 0) goto Lc3
            r5 = r1
        Lc3:
            if (r5 != 0) goto Lc6
            goto L80
        Lc6:
            java.lang.Class r7 = r5.getClass()
            java.lang.String r7 = r7.getName()
            java.lang.String r8 = p000.jf0.m2957(r3)
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L80
            java.lang.Class r9 = r9.getClass()
            sj1 r0 = new sj1
            r0.<init>(r4, r6)
            r2.put(r9, r0)
            return r5
        Le5:
            return r1
    }

    /* JADX INFO: renamed from: ζ */
    public static java.lang.String m5910(java.lang.Object r4, java.lang.String r5) {
            java.lang.Class r0 = r4.getClass()
            java.util.ArrayList r0 = m5905(r0)
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            r3 = r1
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.lang.String r3 = r3.getName()
            boolean r3 = p000.ln0.m3626(r3, r5)
            if (r3 == 0) goto Lc
            goto L26
        L25:
            r1 = r2
        L26:
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            if (r1 != 0) goto L2b
            return r2
        L2b:
            java.lang.Object r4 = r1.get(r4)     // Catch: java.lang.Throwable -> L36
            boolean r5 = r4 instanceof java.lang.String     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L38
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L36
            goto L40
        L36:
            r4 = move-exception
            goto L3a
        L38:
            r4 = r2
            goto L40
        L3a:
            eo1 r5 = new eo1
            r5.<init>(r4)
            r4 = r5
        L40:
            boolean r5 = r4 instanceof p000.eo1
            if (r5 == 0) goto L45
            goto L46
        L45:
            r2 = r4
        L46:
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    /* JADX INFO: renamed from: η */
    public static android.view.View m5911(java.lang.Object r7) {
            r7.getClass()
            java.lang.Class r0 = r7.getClass()
            java.lang.reflect.Method[] r0 = r0.getMethods()
            r0.getClass()
            int r1 = r0.length
            r2 = 0
        L10:
            r3 = 0
            if (r2 >= r1) goto L3b
            r4 = r0[r2]
            java.lang.String r5 = r4.getName()
            java.lang.String r6 = "getView"
            boolean r5 = p000.ln0.m3626(r5, r6)
            if (r5 == 0) goto L38
            java.lang.Class[] r5 = r4.getParameterTypes()
            r5.getClass()
            int r5 = r5.length
            if (r5 != 0) goto L38
            java.lang.Class<android.view.View> r5 = android.view.View.class
            java.lang.Class r6 = r4.getReturnType()
            boolean r5 = r5.isAssignableFrom(r6)
            if (r5 == 0) goto L38
            goto L3c
        L38:
            int r2 = r2 + 1
            goto L10
        L3b:
            r4 = r3
        L3c:
            if (r4 != 0) goto L3f
            return r3
        L3f:
            java.lang.Object r7 = r4.invoke(r7, r3)     // Catch: java.lang.Throwable -> L4a
            boolean r0 = r7 instanceof android.view.View     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L4c
            android.view.View r7 = (android.view.View) r7     // Catch: java.lang.Throwable -> L4a
            goto L54
        L4a:
            r7 = move-exception
            goto L4e
        L4c:
            r7 = r3
            goto L54
        L4e:
            eo1 r0 = new eo1
            r0.<init>(r7)
            r7 = r0
        L54:
            boolean r0 = r7 instanceof p000.eo1
            if (r0 == 0) goto L59
            goto L5a
        L59:
            r3 = r7
        L5a:
            android.view.View r3 = (android.view.View) r3
            return r3
    }

    /* JADX INFO: renamed from: θ */
    public static android.view.View m5912(android.view.View r10, java.lang.Object r11) {
            r11.getClass()
            android.content.res.Resources r0 = r10.getResources()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = "pg_"
            java.lang.String r2 = "id"
            android.content.Context r3 = r10.getContext()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Throwable -> L1c
            int r0 = r0.getIdentifier(r1, r2, r3)     // Catch: java.lang.Throwable -> L1c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L1c
            goto L23
        L1c:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L23:
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            boolean r3 = r0 instanceof p000.eo1
            if (r3 == 0) goto L2d
            r0 = r2
        L2d:
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 == 0) goto L3c
            android.view.View r0 = r10.findViewById(r0)
            if (r0 == 0) goto L3c
            return r0
        L3c:
            java.lang.Class r0 = r11.getClass()
            java.util.ArrayList r0 = m5905(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L4d:
            boolean r3 = r0.hasNext()
            r4 = 0
            if (r3 == 0) goto L8a
            java.lang.Object r3 = r0.next()
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.lang.Class<android.view.View> r5 = android.view.View.class
            java.lang.Class r6 = r3.getType()
            boolean r5 = r5.isAssignableFrom(r6)
            if (r5 != 0) goto L67
            goto L84
        L67:
            java.lang.Object r3 = r3.get(r11)     // Catch: java.lang.Throwable -> L72
            boolean r5 = r3 instanceof android.view.View     // Catch: java.lang.Throwable -> L72
            if (r5 == 0) goto L74
            android.view.View r3 = (android.view.View) r3     // Catch: java.lang.Throwable -> L72
            goto L7c
        L72:
            r3 = move-exception
            goto L76
        L74:
            r3 = r4
            goto L7c
        L76:
            eo1 r5 = new eo1
            r5.<init>(r3)
            r3 = r5
        L7c:
            boolean r5 = r3 instanceof p000.eo1
            if (r5 == 0) goto L81
            goto L82
        L81:
            r4 = r3
        L82:
            android.view.View r4 = (android.view.View) r4
        L84:
            if (r4 == 0) goto L4d
            r2.add(r4)
            goto L4d
        L8a:
            f7 r11 = new f7
            r0 = 1
            r11.<init>(r0, r2)
            tj1 r0 = p000.tj1.f10399
            y30 r3 = new y30
            r5 = 1
            r3.<init>(r11, r5, r0)
            x30 r11 = new x30
            r11.<init>(r3)
        L9d:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Lb1
            java.lang.Object r0 = r11.next()
            r3 = r0
            android.widget.TextView r3 = (android.widget.TextView) r3
            boolean r3 = m5907(r3, r10)
            if (r3 == 0) goto L9d
            goto Lb2
        Lb1:
            r0 = r4
        Lb2:
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 != 0) goto Lb7
            return r4
        Lb7:
            f7 r11 = new f7
            r3 = 1
            r11.<init>(r3, r2)
            tj1 r2 = p000.tj1.f10400
            y30 r3 = new y30
            r3.<init>(r11, r5, r2)
            qh1 r11 = new qh1
            r2 = 2
            r11.<init>(r10, r2, r0)
            y30 r10 = new y30
            r10.<init>(r3, r5, r11)
            x30 r11 = new x30
            r11.<init>(r10)
            boolean r10 = r11.hasNext()
            if (r10 != 0) goto Ldc
            goto L12e
        Ldc:
            java.lang.Object r10 = r11.next()
            boolean r2 = r11.hasNext()
            if (r2 != 0) goto Le8
        Le6:
            r4 = r10
            goto L12e
        Le8:
            r2 = r10
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r3 = r0
            r5 = r1
        Led:
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == 0) goto L104
            if (r3 != r2) goto Lf5
            goto L105
        Lf5:
            android.view.ViewParent r3 = r3.getParent()
            boolean r6 = r3 instanceof android.view.View
            if (r6 == 0) goto L100
            android.view.View r3 = (android.view.View) r3
            goto L101
        L100:
            r3 = r4
        L101:
            int r5 = r5 + 1
            goto Led
        L104:
            r5 = r6
        L105:
            java.lang.Object r2 = r11.next()
            r3 = r2
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r7 = r0
            r8 = r1
        L10e:
            if (r7 == 0) goto L122
            if (r7 != r3) goto L113
            goto L123
        L113:
            android.view.ViewParent r7 = r7.getParent()
            boolean r9 = r7 instanceof android.view.View
            if (r9 == 0) goto L11e
            android.view.View r7 = (android.view.View) r7
            goto L11f
        L11e:
            r7 = r4
        L11f:
            int r8 = r8 + 1
            goto L10e
        L122:
            r8 = r6
        L123:
            if (r5 <= r8) goto L127
            r10 = r2
            r5 = r8
        L127:
            boolean r2 = r11.hasNext()
            if (r2 != 0) goto L105
            goto Le6
        L12e:
            android.view.View r4 = (android.view.View) r4
            return r4
    }
}
