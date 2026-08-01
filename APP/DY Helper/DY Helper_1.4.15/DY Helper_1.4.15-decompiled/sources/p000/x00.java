package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class x00 {

    /* JADX INFO: renamed from: α */
    public static final p000.x00 f11959 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.ConcurrentHashMap.KeySetView f11960 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.ConcurrentHashMap f11961 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.concurrent.atomic.AtomicBoolean f11962 = null;

    /* JADX INFO: renamed from: ε */
    public static volatile java.lang.ClassLoader f11963;

    static {
            x00 r0 = new x00
            r0.<init>()
            p000.x00.f11959 = r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            p000.x00.f11960 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.x00.f11961 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.x00.f11962 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m6462(java.lang.Class r9, java.lang.reflect.Method r10, boolean r11, java.lang.Class r12) {
        L0:
            r0 = 0
            if (r9 == 0) goto L58
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L58
            java.lang.reflect.Method[] r1 = r9.getDeclaredMethods()
            r1.getClass()
            int r2 = r1.length
            r3 = 0
            r5 = r0
            r4 = r3
        L16:
            if (r3 >= r2) goto L4c
            r6 = r1[r3]
            java.lang.String r7 = r6.getName()
            java.lang.String r8 = r10.getName()
            boolean r7 = p000.ln0.m3626(r7, r8)
            if (r7 == 0) goto L49
            java.lang.Class[] r7 = r6.getParameterTypes()
            java.lang.Class[] r8 = r10.getParameterTypes()
            boolean r7 = java.util.Arrays.equals(r7, r8)
            if (r7 == 0) goto L49
            java.lang.Class r7 = r6.getReturnType()
            java.lang.Class r8 = r10.getReturnType()
            boolean r7 = p000.ln0.m3626(r7, r8)
            if (r7 == 0) goto L49
            if (r4 == 0) goto L47
            goto L50
        L47:
            r4 = 1
            r5 = r6
        L49:
            int r3 = r3 + 1
            goto L16
        L4c:
            if (r4 != 0) goto L4f
            goto L50
        L4f:
            r0 = r5
        L50:
            if (r0 == 0) goto L53
            goto L58
        L53:
            java.lang.Class r9 = r9.getSuperclass()
            goto L0
        L58:
            if (r0 != 0) goto L5b
            return
        L5b:
            m6464(r0, r11, r12)
            return
    }

    /* JADX INFO: renamed from: β */
    public static void m6463(java.util.List r3, java.lang.reflect.Method r4, boolean r5, java.lang.Class r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r3.next()
            r2 = r1
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            boolean r2 = m6465(r2, r4)
            if (r2 == 0) goto L9
            r0.add(r1)
            goto L9
        L20:
            java.util.Iterator r3 = r0.iterator()
        L24:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L34
            java.lang.Object r4 = r3.next()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            m6464(r4, r5, r6)
            goto L24
        L34:
            return
    }

    /* JADX INFO: renamed from: γ */
    public static void m6464(java.lang.reflect.Method r7, boolean r8, java.lang.Class r9) {
            java.lang.Class r0 = r7.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = r7.getName()
            java.lang.Class[] r2 = r7.getParameterTypes()
            r2.getClass()
            q00 r3 = new q00
            r4 = 8
            r3.<init>(r4)
            r4 = 25
            r5 = 0
            java.lang.String r6 = "("
            java.lang.String r2 = p000.AbstractC0312g7.m2256(r2, r5, r6, r3, r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "#"
            r3.append(r0)
            r3.append(r1)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            java.util.concurrent.ConcurrentHashMap$KeySetView r1 = p000.x00.f11960
            boolean r0 = r1.add(r0)
            if (r0 != 0) goto L43
            return
        L43:
            r0 = 1
            r7.setAccessible(r0)
            xq0 r0 = p000.xq0.f12253
            w00 r1 = new w00
            r1.<init>(r9, r8)
            r0.m6775(r7, r1)
            return
    }

    /* JADX INFO: renamed from: ε */
    public static boolean m6465(java.lang.reflect.Method r2, java.lang.reflect.Method r3) {
            java.lang.Class r0 = r3.getDeclaringClass()
            java.lang.Class r1 = r2.getDeclaringClass()
            boolean r1 = p000.ln0.m3626(r1, r0)
            if (r1 != 0) goto L58
            java.lang.Class r1 = r2.getDeclaringClass()
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L58
            java.lang.String r0 = r2.getName()
            java.lang.String r1 = r3.getName()
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L58
            java.lang.Class r0 = r2.getReturnType()
            java.lang.Class r1 = r3.getReturnType()
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L58
            java.lang.Class[] r0 = r2.getParameterTypes()
            java.lang.Class[] r3 = r3.getParameterTypes()
            boolean r3 = java.util.Arrays.equals(r0, r3)
            if (r3 == 0) goto L58
            int r3 = r2.getModifiers()
            boolean r3 = java.lang.reflect.Modifier.isStatic(r3)
            if (r3 != 0) goto L58
            int r2 = r2.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isAbstract(r2)
            if (r2 != 0) goto L58
            r2 = 1
            return r2
        L58:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ζ */
    public static java.lang.Object m6466(java.lang.Object r10) {
            r10.getClass()
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.u00.f10545
            java.lang.Class r0 = r10.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.String r1 = "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L16
        L13:
            r0 = r3
            goto Lb2
        L16:
            java.lang.Class r4 = r10.getClass()
            int r5 = java.lang.System.identityHashCode(r0)
            java.lang.String r6 = r4.getName()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            java.lang.String r5 = "@"
            r7.append(r5)
            r7.append(r6)
            java.lang.String r5 = r7.toString()
            java.util.concurrent.ConcurrentHashMap r6 = p000.u00.f10546
            java.lang.Object r7 = r6.get(r5)
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            if (r7 == 0) goto L41
            goto L6a
        L41:
            java.lang.Object r7 = p000.C0666ox.f8297
            kx r7 = p000.EnumC0491kx.f6204
            java.lang.reflect.Field r7 = p000.C0666ox.m4322(r7, r0)
            if (r7 == 0) goto L5c
            r7.setAccessible(r2)
            java.lang.Class r8 = r7.getDeclaringClass()
            boolean r8 = r8.isAssignableFrom(r4)
            if (r8 == 0) goto L5c
            r6.put(r5, r7)
            goto L6a
        L5c:
            java.lang.reflect.Field r7 = p000.u00.m5770(r4, r0)
            if (r7 == 0) goto L69
            r7.setAccessible(r2)
            r6.put(r5, r7)
            goto L6a
        L69:
            r7 = r3
        L6a:
            if (r7 != 0) goto L6d
            goto L13
        L6d:
            java.lang.Class r0 = r7.getDeclaringClass()
            java.lang.Class r4 = r10.getClass()
            boolean r0 = r0.isAssignableFrom(r4)
            if (r0 != 0) goto L7c
            goto L13
        L7c:
            java.lang.Object r0 = r7.get(r10)     // Catch: java.lang.Throwable -> L81
            goto L88
        L81:
            r0 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r0)
            r0 = r4
        L88:
            boolean r4 = r0 instanceof p000.eo1
            if (r4 == 0) goto L8d
            r0 = r3
        L8d:
            if (r0 == 0) goto L13
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = p000.jf0.m2957(r1)
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto Lb2
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = ".Aweme"
            r6 = 0
            boolean r4 = p000.x02.m6479(r4, r5, r6)
            if (r4 == 0) goto L13
        Lb2:
            if (r0 == 0) goto Lb5
            return r0
        Lb5:
            java.lang.Object r0 = p000.qe0.f8982     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r0 = p000.jf0.m2957(r1)     // Catch: java.lang.Throwable -> Lc8
            java.lang.Class r1 = r10.getClass()     // Catch: java.lang.Throwable -> Lc8
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> Lc8
            java.lang.Class r0 = p000.qe0.m4876(r1, r0)     // Catch: java.lang.Throwable -> Lc8
            goto Lcf
        Lc8:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        Lcf:
            boolean r1 = r0 instanceof p000.eo1
            if (r1 == 0) goto Ld4
            r0 = r3
        Ld4:
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 != 0) goto Lda
            goto L183
        Lda:
            java.lang.Class r1 = r10.getClass()
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
        Le3:
            if (r1 == 0) goto Lfc
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto Lfc
            java.lang.reflect.Method[] r5 = r1.getDeclaredMethods()
            r5.getClass()
            p000.AbstractC0984xh.m6659(r4, r5)
            java.lang.Class r1 = r1.getSuperclass()
            goto Le3
        Lfc:
            java.util.List r1 = p000.AbstractC0984xh.m6666(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
        L109:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L138
            java.lang.Object r5 = r1.next()
            r6 = r5
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            int r7 = r6.getModifiers()
            boolean r7 = java.lang.reflect.Modifier.isStatic(r7)
            if (r7 != 0) goto L109
            java.lang.Class[] r7 = r6.getParameterTypes()
            r7.getClass()
            int r7 = r7.length
            if (r7 != 0) goto L109
            java.lang.Class r6 = r6.getReturnType()
            boolean r6 = r0.isAssignableFrom(r6)
            if (r6 == 0) goto L109
            r4.add(r5)
            goto L109
        L138:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L146:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L17d
            java.lang.Object r6 = r4.next()
            r7 = r6
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.Class r8 = r7.getDeclaringClass()
            java.lang.String r8 = r8.getName()
            java.lang.String r7 = r7.getName()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r8 = "#"
            r9.append(r8)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            boolean r7 = r1.add(r7)
            if (r7 == 0) goto L146
            r5.add(r6)
            goto L146
        L17d:
            int r1 = r5.size()
            if (r1 == r2) goto L184
        L183:
            return r3
        L184:
            java.lang.Object r1 = p000.AbstractC0984xh.m6655(r5)     // Catch: java.lang.Throwable -> L195
            r4 = r1
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch: java.lang.Throwable -> L195
            r4.setAccessible(r2)     // Catch: java.lang.Throwable -> L195
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch: java.lang.Throwable -> L195
            java.lang.Object r10 = r1.invoke(r10, r3)     // Catch: java.lang.Throwable -> L195
            goto L19c
        L195:
            r10 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r10)
            r10 = r1
        L19c:
            boolean r1 = r10 instanceof p000.eo1
            if (r1 == 0) goto L1a1
            r10 = r3
        L1a1:
            if (r10 == 0) goto L1aa
            boolean r0 = r0.isInstance(r10)
            if (r0 == 0) goto L1aa
            r3 = r10
        L1aa:
            return r3
    }

    /* JADX INFO: renamed from: η */
    public static android.view.View m6467(java.lang.Object r22) {
            r1 = r22
            r1.getClass()
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto Ld
            r0 = r1
            android.view.View r0 = (android.view.View) r0
            return r0
        Ld:
            java.lang.Class r0 = r1.getClass()
            java.lang.String r2 = r0.getName()
            java.util.concurrent.ConcurrentHashMap r3 = p000.x00.f11961
            java.lang.Object r0 = r3.get(r2)
            r4 = r0
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            r5 = 0
            if (r4 == 0) goto L43
            java.lang.Object r0 = r4.get(r1)     // Catch: java.lang.Throwable -> L2c
            boolean r6 = r0 instanceof android.view.View     // Catch: java.lang.Throwable -> L2c
            if (r6 == 0) goto L2e
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> L2c
            goto L36
        L2c:
            r0 = move-exception
            goto L30
        L2e:
            r0 = r5
            goto L36
        L30:
            eo1 r6 = new eo1
            r6.<init>(r0)
            r0 = r6
        L36:
            boolean r6 = r0 instanceof p000.eo1
            if (r6 == 0) goto L3b
            r0 = r5
        L3b:
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L40
            return r0
        L40:
            r3.remove(r2, r4)
        L43:
            java.lang.Class r0 = r1.getClass()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L4c:
            r6 = 0
            if (r0 == 0) goto L84
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            boolean r7 = r0.equals(r7)
            if (r7 != 0) goto L84
            java.lang.reflect.Field[] r7 = r0.getDeclaredFields()
            r7.getClass()
            int r8 = r7.length
        L5f:
            if (r6 >= r8) goto L7f
            r9 = r7[r6]
            int r10 = r9.getModifiers()
            boolean r10 = java.lang.reflect.Modifier.isStatic(r10)
            if (r10 != 0) goto L7c
            java.lang.Class<android.view.View> r10 = android.view.View.class
            java.lang.Class r11 = r9.getType()
            boolean r10 = r10.isAssignableFrom(r11)
            if (r10 == 0) goto L7c
            r4.add(r9)
        L7c:
            int r6 = r6 + 1
            goto L5f
        L7f:
            java.lang.Class r0 = r0.getSuperclass()
            goto L4c
        L84:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L8c
            goto L182
        L8c:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r4 = r4.iterator()
        L95:
            boolean r0 = r4.hasNext()
            r8 = 1
            if (r0 == 0) goto L14e
            java.lang.Object r0 = r4.next()
            r9 = r0
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            r9.setAccessible(r8)     // Catch: java.lang.Throwable -> Lb1
            java.lang.Object r0 = r9.get(r1)     // Catch: java.lang.Throwable -> Lb1
            boolean r10 = r0 instanceof android.view.View     // Catch: java.lang.Throwable -> Lb1
            if (r10 == 0) goto Lb3
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> Lb1
            goto Lbb
        Lb1:
            r0 = move-exception
            goto Lb5
        Lb3:
            r0 = r5
            goto Lbb
        Lb5:
            eo1 r10 = new eo1
            r10.<init>(r0)
            r0 = r10
        Lbb:
            boolean r10 = r0 instanceof p000.eo1
            if (r10 == 0) goto Lc0
            r0 = r5
        Lc0:
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto Lc7
            r10 = r5
            goto L147
        Lc7:
            d62 r10 = new d62
            boolean r11 = r0.isAttachedToWindow()
            if (r11 == 0) goto Ld2
            r11 = 3000(0xbb8, float:4.204E-42)
            goto Ld3
        Ld2:
            r11 = r6
        Ld3:
            int r12 = r0.getWidth()
            if (r12 <= 0) goto Le1
            int r12 = r0.getHeight()
            if (r12 <= 0) goto Le1
            int r11 = r11 + 1000
        Le1:
            java.lang.Class r12 = r0.getClass()
            java.lang.String r12 = r12.getSimpleName()
            java.lang.String r13 = "VideoViewHolderRootView"
            boolean r12 = p000.q02.m4654(r12, r13, r8)
            if (r12 == 0) goto Lf3
            int r11 = r11 + 2500
        Lf3:
            java.lang.Class<android.widget.FrameLayout> r12 = android.widget.FrameLayout.class
            java.lang.Class r13 = r9.getType()
            boolean r12 = r12.isAssignableFrom(r13)
            if (r12 == 0) goto L101
            int r11 = r11 + 1200
        L101:
            boolean r12 = r0 instanceof android.view.ViewGroup
            if (r12 == 0) goto L107
            int r11 = r11 + 300
        L107:
            java.lang.String r12 = r9.getName()
            java.lang.String r13 = "itemView"
            boolean r12 = p000.x02.m6480(r12, r13)
            if (r12 == 0) goto L115
            int r11 = r11 + 800
        L115:
            java.lang.Class r12 = r9.getDeclaringClass()
            java.lang.String r12 = r12.getName()
            java.lang.String r13 = "ViewHolder"
            boolean r8 = p000.q02.m4654(r12, r13, r8)
            if (r8 == 0) goto L127
            int r11 = r11 + 400
        L127:
            int r8 = r0.getWidth()
            long r12 = (long) r8
            int r8 = r0.getHeight()
            long r14 = (long) r8
            long r12 = r12 * r14
            r14 = 10000(0x2710, double:4.9407E-320)
            long r16 = r12 / r14
            r18 = 0
            r20 = 1200(0x4b0, double:5.93E-321)
            long r12 = p000.j81.m2908(r16, r18, r20)
            int r8 = (int) r12
            int r11 = r11 + r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r11)
            r10.<init>(r9, r0, r8)
        L147:
            if (r10 == 0) goto L95
            r7.add(r10)
            goto L95
        L14e:
            qt r0 = new qt
            r1 = 11
            r0.<init>(r1)
            java.util.List r0 = p000.AbstractC0984xh.m6658(r7, r0)
            java.lang.Object r1 = p000.AbstractC0984xh.m6640(r0)
            d62 r1 = (p000.d62) r1
            if (r1 != 0) goto L162
            goto L182
        L162:
            java.lang.Object r4 = r1.f2927
            java.lang.Object r0 = p000.AbstractC0984xh.m6641(r8, r0)
            d62 r0 = (p000.d62) r0
            if (r0 == 0) goto L183
            java.lang.Object r6 = r0.f2928
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.lang.Object r7 = r1.f2928
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r6 != r7) goto L183
            java.lang.Object r0 = r0.f2927
            if (r0 == r4) goto L183
        L182:
            return r5
        L183:
            java.lang.Object r0 = r1.f2926
            r3.put(r2, r0)
            android.view.View r4 = (android.view.View) r4
            return r4
    }

    /* JADX INFO: renamed from: θ */
    public static void m6468() {
            r0 = 0
            r1 = 1
            java.util.concurrent.atomic.AtomicBoolean r2 = p000.x00.f11962
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.util.concurrent.ConcurrentHashMap r0 = p000.C0777rx.f9562
            q00 r0 = new q00
            r1 = 10
            r0.<init>(r1)
            java.lang.String r1 = "feed_current_playback_resolver"
            p000.C0777rx.m5178(r1, r0)
            q00 r0 = new q00
            r2 = 11
            r0.<init>(r2)
            p000.C0777rx.m5177(r1, r0)
            return
    }

    /* JADX INFO: renamed from: ι */
    public static java.util.List m6469(java.lang.ClassLoader r5, boolean r6, boolean r7) {
            if (r6 == 0) goto L5
            kx r0 = p000.EnumC0491kx.f6169
            goto L7
        L5:
            kx r0 = p000.EnumC0491kx.f6170
        L7:
            java.lang.Object r1 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "~7940193404FAD3677C47B093370E147D326D0A3396452FC2BA98B28E8B177BFB57E578480950BD40139730D1F55377227BCD8D5E99"
            java.lang.String r1 = p000.jf0.m2957(r1)     // Catch: java.lang.Throwable -> L14
            java.lang.Class r1 = p000.qe0.m4876(r5, r1)     // Catch: java.lang.Throwable -> L14
            goto L1b
        L14:
            r1 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        L1b:
            boolean r2 = r1 instanceof p000.eo1
            if (r2 == 0) goto L20
            r1 = 0
        L20:
            java.lang.Class r1 = (java.lang.Class) r1
            jz r2 = p000.C0450jz.f5672
            if (r1 != 0) goto L27
            goto L2d
        L27:
            java.lang.reflect.Method r6 = m6470(r1, r6)
            if (r6 != 0) goto L2e
        L2d:
            return r2
        L2e:
            java.lang.Object r1 = p000.C0666ox.f8297
            java.util.List r1 = p000.C0666ox.m4323(r0, r5)
            if (r1 != 0) goto L37
            goto L38
        L37:
            r2 = r1
        L38:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r2.iterator()
        L41:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L58
            java.lang.Object r3 = r2.next()
            r4 = r3
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            boolean r4 = m6465(r4, r6)
            if (r4 == 0) goto L41
            r1.add(r3)
            goto L41
        L58:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L99
            if (r7 == 0) goto L99
            java.lang.Object r7 = p000.C0666ox.f8297
            java.util.concurrent.atomic.AtomicBoolean r7 = p000.C0666ox.f8305
            boolean r7 = r7.get()
            if (r7 != 0) goto L6b
            goto L99
        L6b:
            java.lang.String r7 = r0.f6297
            wa r1 = new wa
            r2 = 11
            r1.<init>(r5, r2, r6)
            java.util.List r5 = p000.C0666ox.m4316(r0, r5, r7, r1)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r5 = r5.iterator()
        L81:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L98
            java.lang.Object r0 = r5.next()
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            boolean r1 = m6465(r1, r6)
            if (r1 == 0) goto L81
            r7.add(r0)
            goto L81
        L98:
            return r7
        L99:
            return r1
    }

    /* JADX INFO: renamed from: κ */
    public static java.lang.reflect.Method m6470(java.lang.Class r7, boolean r8) {
            java.lang.reflect.Method[] r7 = r7.getMethods()
            r7.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r7.length
            r2 = 0
        Le:
            if (r2 >= r1) goto L3f
            r3 = r7[r2]
            int r4 = r3.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
            if (r4 != 0) goto L3c
            java.lang.Class r4 = r3.getReturnType()
            java.lang.Class r5 = java.lang.Void.TYPE
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 == 0) goto L3c
            java.lang.String r4 = r3.getName()
            if (r8 == 0) goto L31
            java.lang.String r5 = "onViewHolderSelected"
            goto L33
        L31:
            java.lang.String r5 = "onViewHolderUnSelected"
        L33:
            boolean r4 = p000.x02.m6480(r4, r5)
            if (r4 == 0) goto L3c
            r0.add(r3)
        L3c:
            int r2 = r2 + 1
            goto Le
        L3f:
            java.lang.Object r7 = p000.AbstractC0984xh.m6656(r0)
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            if (r7 != 0) goto L64
            if (r8 == 0) goto L4c
            java.lang.String r8 = "selected"
            goto L4e
        L4c:
            java.lang.String r8 = "unselected"
        L4e:
            q00 r5 = new q00
            r1 = 9
            r5.<init>(r1)
            r6 = 31
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            java.lang.String r0 = p000.AbstractC0984xh.m6644(r0, r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = "r2bcbf2f53bf74f10"
            p000.AbstractC0602nx.m4121(r1, r8, r0)
        L64:
            return r7
    }

    /* JADX INFO: renamed from: δ */
    public final synchronized void m6471(java.lang.ClassLoader r9) {
            r8 = this;
            monitor-enter(r8)
            r9.getClass()     // Catch: java.lang.Throwable -> Lde
            m6468()     // Catch: java.lang.Throwable -> Lde
            java.lang.ClassLoader r0 = p000.x00.f11963     // Catch: java.lang.Throwable -> Lde
            if (r0 != r9) goto Ld
            monitor-exit(r8)
            return
        Ld:
            java.lang.Object r0 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L66
            java.lang.String r0 = "~7940193404FAD3677C47B093370E147D326D0A3396452FC2BA98B28E8B177BFB57E578480950BD40139730D1F55377227BCD8D5E99"
            java.lang.String r0 = p000.jf0.m2957(r0)     // Catch: java.lang.Throwable -> L66
            java.lang.Class r0 = p000.qe0.m4876(r9, r0)     // Catch: java.lang.Throwable -> L66
            java.lang.String r1 = "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"
            java.lang.String r1 = p000.jf0.m2957(r1)     // Catch: java.lang.Throwable -> L66
            java.lang.Class r1 = p000.qe0.m4876(r9, r1)     // Catch: java.lang.Throwable -> L66
            r2 = 1
            java.lang.reflect.Method r3 = m6470(r0, r2)     // Catch: java.lang.Throwable -> L66
            r4 = 0
            java.lang.reflect.Method r0 = m6470(r0, r4)     // Catch: java.lang.Throwable -> L66
            if (r3 == 0) goto Lb2
            if (r0 != 0) goto L33
            goto Lb2
        L33:
            java.lang.String r5 = "~7940193404FAD3677C47B093370E147D326D0A3396452FC2BA98B28E8B177BFB57E578480950A26F12973BD1F55377227BCD8D5E99"
            java.lang.String r5 = p000.jf0.m2957(r5)     // Catch: java.lang.Throwable -> L66
            java.lang.String r6 = "~7960BFBA0FA02BB4BD37AD83E4D6EDE425E18DDCF451803836376A3EBF3A7FD02D3458C1CDC0C3BF3AFA522778EA07ED64B3E62ED3B8050B19E882E0C5"
            java.lang.String r6 = p000.jf0.m2957(r6)     // Catch: java.lang.Throwable -> L66
            java.lang.String[] r5 = new java.lang.String[]{r5, r6}     // Catch: java.lang.Throwable -> L66
            java.util.List r5 = p000.AbstractC1021yh.m6897(r5)     // Catch: java.lang.Throwable -> L66
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L66
            r6.<init>()     // Catch: java.lang.Throwable -> L66
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L66
        L50:
            boolean r7 = r5.hasNext()     // Catch: java.lang.Throwable -> L66
            if (r7 == 0) goto L68
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L66
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L66
            java.lang.Class r7 = p000.qe0.m4877(r9, r7)     // Catch: java.lang.Throwable -> L66
            if (r7 == 0) goto L50
            r6.add(r7)     // Catch: java.lang.Throwable -> L66
            goto L50
        L66:
            r9 = move-exception
            goto Lb9
        L68:
            java.util.Set r5 = p000.AbstractC0984xh.m6670(r6)     // Catch: java.lang.Throwable -> L66
            java.util.List r5 = p000.AbstractC0984xh.m6666(r5)     // Catch: java.lang.Throwable -> L66
            java.util.Iterator r6 = r5.iterator()     // Catch: java.lang.Throwable -> L66
        L74:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L66
            if (r7 == 0) goto L87
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L66
            java.lang.Class r7 = (java.lang.Class) r7     // Catch: java.lang.Throwable -> L66
            m6462(r7, r3, r2, r1)     // Catch: java.lang.Throwable -> L66
            m6462(r7, r0, r4, r1)     // Catch: java.lang.Throwable -> L66
            goto L74
        L87:
            java.util.List r6 = m6469(r9, r2, r4)     // Catch: java.lang.Throwable -> L66
            m6463(r6, r3, r2, r1)     // Catch: java.lang.Throwable -> L66
            java.util.List r2 = m6469(r9, r4, r4)     // Catch: java.lang.Throwable -> L66
            m6463(r2, r0, r4, r1)     // Catch: java.lang.Throwable -> L66
            p000.x00.f11963 = r9     // Catch: java.lang.Throwable -> L66
            int r9 = r5.size()     // Catch: java.lang.Throwable -> L66
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L66
            r0.<init>()     // Catch: java.lang.Throwable -> L66
            java.lang.String r1 = "rd467e28b5da24a78"
            r0.append(r1)     // Catch: java.lang.Throwable -> L66
            r0.append(r9)     // Catch: java.lang.Throwable -> L66
            java.lang.String r9 = r0.toString()     // Catch: java.lang.Throwable -> L66
            p000.C0888ux.m5985(r9)     // Catch: java.lang.Throwable -> L66
            s62 r9 = p000.s62.f9751     // Catch: java.lang.Throwable -> L66
            goto Lbf
        Lb2:
            java.lang.String r9 = "rf4b6d90dc3e8da58"
            p000.C0888ux.m5985(r9)     // Catch: java.lang.Throwable -> L66
            monitor-exit(r8)
            return
        Lb9:
            eo1 r0 = new eo1     // Catch: java.lang.Throwable -> Lde
            r0.<init>(r9)     // Catch: java.lang.Throwable -> Lde
            r9 = r0
        Lbf:
            java.lang.Throwable r9 = p000.fo1.m2190(r9)     // Catch: java.lang.Throwable -> Lde
            if (r9 == 0) goto Le0
            java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> Lde
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lde
            r0.<init>()     // Catch: java.lang.Throwable -> Lde
            java.lang.String r1 = "reb7835ee7071e34d"
            r0.append(r1)     // Catch: java.lang.Throwable -> Lde
            r0.append(r9)     // Catch: java.lang.Throwable -> Lde
            java.lang.String r9 = r0.toString()     // Catch: java.lang.Throwable -> Lde
            p000.C0888ux.m5985(r9)     // Catch: java.lang.Throwable -> Lde
            goto Le0
        Lde:
            r9 = move-exception
            goto Le2
        Le0:
            monitor-exit(r8)
            return
        Le2:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lde
            throw r9
    }
}
