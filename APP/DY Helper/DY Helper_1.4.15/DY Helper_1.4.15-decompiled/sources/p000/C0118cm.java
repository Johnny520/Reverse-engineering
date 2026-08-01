package p000;

/* JADX INFO: renamed from: cm */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0118cm {

    /* JADX INFO: renamed from: α */
    public static final java.util.Set f2205 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.Set f2206 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.Map f2207 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.Map f2208 = null;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            p000.C0118cm.f2205 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            p000.C0118cm.f2206 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            p000.C0118cm.f2207 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            p000.C0118cm.f2208 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static boolean m1254(java.lang.ClassLoader r17, java.util.List r18, java.lang.Object r19, p000.nv0 r20) {
            r0 = r17
            r1 = r19
            r2 = r20
            java.lang.String r3 = "~797C580CA5DD249BE32348A6895C8D359F04FEB9EADB6AFF22A03FA0ED0F5F04F1F05D3531235AD5A05D9B7EE18CDAB953836F615CFDDD0787F5"
            java.lang.String r3 = p000.jf0.m2957(r3)
            r4 = 0
            java.lang.Class r3 = java.lang.Class.forName(r3, r4, r0)
            r3.getClass()
            java.lang.String r5 = "~796422A8818C0EADCA9A33DA50D2E82D10279E237AB2D2E1347FF62994D46F513F891BFB1CC7DFC3544672AE7844F927F521BCC7CC73430B3298952F"
            java.lang.String r5 = p000.jf0.m2957(r5)
            java.lang.Class r5 = java.lang.Class.forName(r5, r4, r0)
            r5.getClass()
            boolean r0 = r5.isInstance(r1)
            if (r0 != 0) goto L2b
        L27:
            r16 = r4
            goto L2d9
        L2b:
            java.lang.reflect.Method[] r0 = r3.getMethods()
            r0.getClass()
            int r6 = r0.length
            r7 = r4
        L34:
            r8 = 2
            r9 = 1
            if (r7 >= r6) goto L69
            r11 = r0[r7]
            java.lang.Class r12 = r11.getReturnType()
            boolean r12 = p000.ln0.m3626(r12, r3)
            if (r12 == 0) goto L66
            java.lang.Class[] r12 = r11.getParameterTypes()
            int r12 = r12.length
            if (r12 != r8) goto L66
            java.lang.Class[] r12 = r11.getParameterTypes()
            r12 = r12[r4]
            java.lang.Class r13 = java.lang.Integer.TYPE
            boolean r12 = p000.ln0.m3626(r12, r13)
            if (r12 == 0) goto L66
            java.lang.Class[] r12 = r11.getParameterTypes()
            r12 = r12[r9]
            boolean r12 = r12.isAssignableFrom(r5)
            if (r12 == 0) goto L66
            goto L6a
        L66:
            int r7 = r7 + 1
            goto L34
        L69:
            r11 = 0
        L6a:
            if (r11 == 0) goto L70
            r11.setAccessible(r9)
            goto L71
        L70:
            r11 = 0
        L71:
            if (r11 != 0) goto L74
            goto L27
        L74:
            java.util.Iterator r0 = r18.iterator()
        L78:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L27
            java.lang.Object r6 = r0.next()
            boolean r7 = r3.isInstance(r6)
            if (r7 == 0) goto L2d5
            if (r6 != 0) goto L8b
            goto L78
        L8b:
            java.lang.String r7 = r2.f7759
            java.lang.Class r12 = r6.getClass()
            java.util.ArrayList r12 = m1255(r12)
            f7 r13 = new f7
            r14 = 1
            r13.<init>(r14, r12)
            ul r12 = new ul
            r14 = 12
            r12.<init>(r14)
            y30 r14 = new y30
            r14.<init>(r13, r9, r12)
            ul r12 = new ul
            r13 = 13
            r12.<init>(r13)
            y30 r13 = new y30
            r13.<init>(r14, r9, r12)
            ef r12 = new ef
            r14 = 2
            r12.<init>(r14, r6)
            y30 r12 = p000.us1.m5943(r13, r12)
            x30 r13 = new x30
            r13.<init>(r12)
        Lc2:
            boolean r12 = r13.hasNext()
            if (r12 == 0) goto L10b
            java.lang.Object r12 = r13.next()
            android.util.SparseArray r12 = (android.util.SparseArray) r12
            int r14 = r12.size()
            r15 = r4
        Ld3:
            if (r15 >= r14) goto Lc2
            r16 = r4
            java.lang.Object r4 = r12.valueAt(r15)
            boolean r10 = r4 instanceof java.util.List
            if (r10 == 0) goto Le2
            java.util.List r4 = (java.util.List) r4
            goto Le3
        Le2:
            r4 = 0
        Le3:
            if (r4 != 0) goto Le6
            goto L106
        Le6:
            boolean r10 = r4.isEmpty()
            if (r10 == 0) goto Led
            goto L106
        Led:
            java.util.Iterator r4 = r4.iterator()
        Lf1:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L106
            java.lang.Object r10 = r4.next()
            java.lang.String r10 = m1256(r10)
            boolean r10 = p000.ln0.m3626(r10, r7)
            if (r10 == 0) goto Lf1
            return r9
        L106:
            int r15 = r15 + 1
            r4 = r16
            goto Ld3
        L10b:
            r16 = r4
            java.lang.Class r4 = r6.getClass()
            java.util.ArrayList r4 = m1255(r4)
            f7 r7 = new f7
            r10 = 1
            r7.<init>(r10, r4)
            ul r4 = new ul
            r10 = 14
            r4.<init>(r10)
            y30 r10 = new y30
            r10.<init>(r7, r9, r4)
            ul r4 = new ul
            r7 = 15
            r4.<init>(r7)
            y30 r7 = new y30
            r7.<init>(r10, r9, r4)
            ef r4 = new ef
            r10 = 3
            r4.<init>(r10, r6)
            y30 r4 = p000.us1.m5943(r7, r4)
            x30 r7 = new x30
            r7.<init>(r4)
        L142:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L187
            java.lang.Object r4 = r7.next()
            r10 = r4
            android.util.SparseArray r10 = (android.util.SparseArray) r10
            int r12 = r10.size()
            r13 = r16
        L155:
            if (r13 >= r12) goto L142
            java.lang.Object r14 = r10.valueAt(r13)
            boolean r15 = r14 instanceof java.util.List
            if (r15 == 0) goto L184
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            boolean r15 = r14 instanceof java.util.Collection
            if (r15 == 0) goto L16f
            r15 = r14
            java.util.Collection r15 = (java.util.Collection) r15
            boolean r15 = r15.isEmpty()
            if (r15 == 0) goto L16f
            goto L184
        L16f:
            java.util.Iterator r14 = r14.iterator()
        L173:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L184
            java.lang.Object r15 = r14.next()
            boolean r15 = r5.isInstance(r15)
            if (r15 == 0) goto L173
            goto L188
        L184:
            int r13 = r13 + 1
            goto L155
        L187:
            r4 = 0
        L188:
            android.util.SparseArray r4 = (android.util.SparseArray) r4
            if (r4 != 0) goto L18e
        L18c:
            r7 = 0
            goto L1d2
        L18e:
            int r7 = r4.size()
            r10 = r16
        L194:
            if (r10 >= r7) goto L18c
            java.lang.Object r12 = r4.valueAt(r10)
            boolean r13 = r12 instanceof java.util.List
            if (r13 == 0) goto L1cf
            r13 = r12
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            boolean r14 = r13 instanceof java.util.Collection
            if (r14 == 0) goto L1af
            r14 = r13
            java.util.Collection r14 = (java.util.Collection) r14
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto L1af
            goto L1cf
        L1af:
            java.util.Iterator r13 = r13.iterator()
        L1b3:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L1cf
            java.lang.Object r14 = r13.next()
            boolean r14 = r5.isInstance(r14)
            if (r14 == 0) goto L1b3
            am r7 = new am
            int r4 = r4.keyAt(r10)
            java.util.List r12 = (java.util.List) r12
            r7.<init>(r4, r12)
            goto L1d2
        L1cf:
            int r10 = r10 + 1
            goto L194
        L1d2:
            if (r7 != 0) goto L1d8
            r4 = r16
            goto L78
        L1d8:
            int r3 = r7.f324
            java.util.List r4 = r7.f325
            java.util.ArrayList r7 = m1264(r5)
            java.util.Iterator r10 = r4.iterator()
        L1e4:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L252
            java.lang.Object r12 = r10.next()
            boolean r0 = r5.isInstance(r12)
            if (r0 == 0) goto L1e4
            java.lang.String r0 = m1256(r12)
            if (r0 == 0) goto L1e4
            if (r12 != 0) goto L1ff
            jz r0 = p000.C0450jz.f5672
            goto L232
        L1ff:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r14 = r7.iterator()
        L208:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L231
            java.lang.Object r0 = r14.next()
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            int r0 = r0.getInt(r12)     // Catch: java.lang.Throwable -> L21d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L21d
            goto L224
        L21d:
            r0 = move-exception
            eo1 r15 = new eo1
            r15.<init>(r0)
            r0 = r15
        L224:
            boolean r15 = r0 instanceof p000.eo1
            if (r15 == 0) goto L229
            r0 = 0
        L229:
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L208
            r13.add(r0)
            goto L208
        L231:
            r0 = r13
        L232:
            boolean r13 = r0.isEmpty()
            if (r13 == 0) goto L239
            goto L1e4
        L239:
            java.util.Iterator r0 = r0.iterator()
        L23d:
            boolean r13 = r0.hasNext()
            if (r13 == 0) goto L1e4
            java.lang.Object r13 = r0.next()
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            if (r13 == r9) goto L253
            if (r13 != r8) goto L23d
            goto L253
        L252:
            r12 = 0
        L253:
            if (r12 != 0) goto L26b
            java.util.Iterator r0 = r4.iterator()
        L259:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L26a
            java.lang.Object r12 = r0.next()
            boolean r4 = r5.isInstance(r12)
            if (r4 == 0) goto L259
            goto L26b
        L26a:
            r12 = 0
        L26b:
            java.util.ArrayList r0 = m1264(r5)
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L276
            goto L2aa
        L276:
            if (r12 == 0) goto L290
            java.util.Iterator r4 = r0.iterator()
        L27c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L290
            java.lang.Object r5 = r4.next()
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            int r7 = r5.getInt(r12)     // Catch: java.lang.Throwable -> L27c
            r5.setInt(r1, r7)     // Catch: java.lang.Throwable -> L27c
            goto L27c
        L290:
            java.util.Iterator r0 = r0.iterator()
        L294:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L2aa
            java.lang.Object r4 = r0.next()
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            int r5 = r4.getInt(r1)     // Catch: java.lang.Throwable -> L294
            if (r5 != 0) goto L294
            r4.setInt(r1, r8)     // Catch: java.lang.Throwable -> L294
            goto L294
        L2aa:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            r11.invoke(r6, r0)
            java.lang.String r0 = r2.f7758
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "added comment action into panel id="
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = ", key="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            r1 = 4
            java.lang.String r2 = "rc1ad4955cc6c3a73"
            r4 = 0
            p000.C0888ux.m5988(r2, r0, r4, r1, r4)
            return r9
        L2d5:
            r16 = r4
            goto L78
        L2d9:
            return r16
    }

    /* JADX INFO: renamed from: β */
    public static java.util.ArrayList m1255(java.lang.Class r2) {
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
    public static java.lang.String m1256(java.lang.Object r7) {
            r0 = 0
            if (r7 != 0) goto L4
            goto L4f
        L4:
            java.lang.Class r1 = r7.getClass()
            java.lang.reflect.Method[] r1 = r1.getMethods()
            r1.getClass()
            int r2 = r1.length
            r3 = 0
        L11:
            if (r3 >= r2) goto L2f
            r4 = r1[r3]
            java.lang.String r5 = r4.getName()
            java.lang.String r6 = "getTitle"
            boolean r5 = p000.ln0.m3626(r5, r6)
            if (r5 == 0) goto L2c
            java.lang.Class[] r5 = r4.getParameterTypes()
            r5.getClass()
            int r5 = r5.length
            if (r5 != 0) goto L2c
            goto L30
        L2c:
            int r3 = r3 + 1
            goto L11
        L2f:
            r4 = r0
        L30:
            if (r4 == 0) goto L4f
            java.lang.Object r7 = r4.invoke(r7, r0)     // Catch: java.lang.Throwable -> L3d
            if (r7 == 0) goto L3f
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L3d
            goto L47
        L3d:
            r7 = move-exception
            goto L41
        L3f:
            r7 = r0
            goto L47
        L41:
            eo1 r1 = new eo1
            r1.<init>(r7)
            r7 = r1
        L47:
            boolean r1 = r7 instanceof p000.eo1
            if (r1 == 0) goto L4c
            goto L4d
        L4c:
            r0 = r7
        L4d:
            java.lang.String r0 = (java.lang.String) r0
        L4f:
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public static java.lang.Object m1257(java.lang.ClassLoader r18, p000.nv0 r19, java.lang.Object r20, java.lang.Object r21) {
            r1 = r19
            r2 = r20
            java.lang.String r0 = "~78D3ECFA63DB52E5A19E9BAEB1F7800A11F1EB5A04E5B7A221312F42CA326BDF84B464FE4832D738AC40A470FA237C08CA8228174BCD0BE11003D6A14F53CEC1BDE7E952FC87873CAAC51D93E24B25B15D"
            java.lang.String r0 = p000.jf0.m2957(r0)
            r3 = 0
            r4 = r18
            java.lang.Class r4 = java.lang.Class.forName(r0, r3, r4)
            r4.getClass()
            java.lang.reflect.Constructor[] r0 = r4.getConstructors()
            r0.getClass()
            int r5 = r0.length
            r6 = r3
        L1d:
            r7 = 2
            r8 = 0
            r9 = 1
            if (r6 >= r5) goto L44
            r10 = r0[r6]
            java.lang.Class[] r11 = r10.getParameterTypes()
            int r12 = r11.length
            r13 = 3
            if (r12 != r13) goto L41
            r12 = r11[r9]
            java.lang.Class r13 = r2.getClass()
            boolean r12 = r12.isAssignableFrom(r13)
            if (r12 == 0) goto L41
            r11 = r11[r7]
            boolean r11 = r11.isInterface()
            if (r11 == 0) goto L41
            goto L45
        L41:
            int r6 = r6 + 1
            goto L1d
        L44:
            r10 = r8
        L45:
            if (r10 == 0) goto L339
            r10.setAccessible(r9)
            java.lang.Class[] r0 = r10.getParameterTypes()
            r0 = r0[r3]
            r0.getClass()
            java.lang.reflect.Constructor[] r5 = r0.getConstructors()
            r5.getClass()
            ss1 r5 = p000.AbstractC0312g7.m2232(r5)
            java.util.Iterator r5 = r5.iterator()
        L62:
            boolean r6 = r5.hasNext()
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            if (r6 == 0) goto L96
            java.lang.Object r6 = r5.next()
            java.lang.reflect.Constructor r6 = (java.lang.reflect.Constructor) r6
            java.lang.Class[] r6 = r6.getParameterTypes()
            r6.getClass()
            java.util.List r6 = p000.AbstractC0312g7.m2262(r6)
            int r12 = r6.size()
            if (r12 != r7) goto L62
            java.lang.Object r12 = r6.get(r3)
            boolean r12 = p000.ln0.m3626(r12, r11)
            if (r12 == 0) goto L62
            java.lang.Object r12 = r6.get(r9)
            boolean r12 = p000.ln0.m3626(r12, r11)
            if (r12 != 0) goto L62
            goto L97
        L96:
            r6 = r8
        L97:
            if (r6 == 0) goto L332
            java.lang.Object r5 = r6.get(r9)
            java.lang.Class r5 = (java.lang.Class) r5
            if (r5 == 0) goto L332
            java.lang.reflect.Constructor r6 = r5.getDeclaredConstructor(r8)
            java.lang.Object r6 = r6.newInstance(r8)
            r6.getClass()
            java.lang.String r12 = "common_id"
            java.lang.String r13 = r1.f7758
            m1263(r12, r6, r13)
            java.lang.String r12 = "tag"
            java.lang.String r13 = r1.f7758
            m1263(r12, r6, r13)
            java.lang.String r12 = "content"
            java.lang.String r13 = r1.f7759
            m1263(r12, r6, r13)
            java.lang.Class[] r5 = new java.lang.Class[]{r11, r5}
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r5)
            java.lang.String r5 = "common"
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r6}
            java.lang.Object r5 = r0.newInstance(r5)
            java.lang.Class[] r0 = r10.getParameterTypes()
            r0 = r0[r7]
            r0.getClass()
            java.lang.reflect.Method[] r6 = r0.getMethods()
            r6.getClass()
            int r7 = r6.length
            r11 = r3
        Le5:
            if (r11 >= r7) goto Lf3
            r12 = r6[r11]
            boolean r13 = m1261(r12)
            if (r13 == 0) goto Lf0
            goto Lf4
        Lf0:
            int r11 = r11 + 1
            goto Le5
        Lf3:
            r12 = r8
        Lf4:
            if (r12 == 0) goto L103
            java.lang.Class r6 = r12.getReturnType()
            if (r6 == 0) goto L103
            boolean r7 = r6.isInterface()
            if (r7 == 0) goto L103
            goto L104
        L103:
            r6 = r8
        L104:
            if (r6 != 0) goto L109
            r6 = r21
            goto L12f
        L109:
            java.lang.ClassLoader r7 = r0.getClassLoader()
            if (r7 != 0) goto L116
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()
            r7.getClass()
        L116:
            zl r11 = new zl
            r12 = r21
            r11.<init>(r1, r6, r2, r12)
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            vv0 r6 = new vv0
            r12 = 0
            r6.<init>(r11, r12)
            java.lang.Object r0 = java.lang.reflect.Proxy.newProxyInstance(r7, r0, r6)
            r0.getClass()
            r6 = r0
        L12f:
            java.lang.String r7 = "#"
            java.lang.String r0 = r4.getName()
            java.util.Set r11 = p000.C0118cm.f2206
            boolean r12 = r11.add(r0)
            if (r12 != 0) goto L13f
            goto L316
        L13f:
            java.lang.reflect.Method[] r12 = r4.getDeclaredMethods()
            r12.getClass()
            ss1 r12 = p000.AbstractC0312g7.m2232(r12)
            ul r13 = new ul
            r14 = 16
            r13.<init>(r14)
            y30 r14 = new y30
            r14.<init>(r12, r9, r13)
            ul r12 = new ul
            r13 = 9
            r12.<init>(r13)
            y30 r13 = new y30
            r13.<init>(r14, r9, r12)
            ul r12 = new ul
            r14 = 10
            r12.<init>(r14)
            y30 r14 = new y30
            r14.<init>(r13, r9, r12)
            ul r12 = new ul
            r13 = 11
            r12.<init>(r13)
            y30 r13 = new y30
            r13.<init>(r14, r9, r12)
            java.util.List r12 = p000.us1.m5948(r13)
            java.lang.Class r13 = r4.getSuperclass()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L187:
            if (r13 == 0) goto L1a0
            java.lang.Class<java.lang.Object> r15 = java.lang.Object.class
            boolean r15 = r13.equals(r15)
            if (r15 != 0) goto L1a0
            java.lang.reflect.Method[] r15 = r13.getDeclaredMethods()
            r15.getClass()
            p000.AbstractC0984xh.m6659(r14, r15)
            java.lang.Class r13 = r13.getSuperclass()
            goto L187
        L1a0:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r14 = r14.iterator()
        L1a9:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L1c5
            java.lang.Object r15 = r14.next()
            r16 = r15
            java.lang.reflect.Method r16 = (java.lang.reflect.Method) r16
            int r16 = r16.getModifiers()
            boolean r16 = java.lang.reflect.Modifier.isStatic(r16)
            if (r16 != 0) goto L1a9
            r13.add(r15)
            goto L1a9
        L1c5:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r13 = r13.iterator()
        L1ce:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L1f1
            java.lang.Object r15 = r13.next()
            r16 = r15
            java.lang.reflect.Method r16 = (java.lang.reflect.Method) r16
            r17 = r3
            java.lang.Class r3 = r16.getReturnType()
            java.lang.Class r8 = java.lang.Void.TYPE
            boolean r3 = p000.ln0.m3626(r3, r8)
            if (r3 == 0) goto L1ed
            r14.add(r15)
        L1ed:
            r3 = r17
            r8 = 0
            goto L1ce
        L1f1:
            r17 = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r8 = r14.iterator()
        L1fc:
            boolean r13 = r8.hasNext()
            if (r13 == 0) goto L222
            java.lang.Object r13 = r8.next()
            r14 = r13
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            java.lang.Class[] r15 = r14.getParameterTypes()
            int r15 = r15.length
            if (r15 != r9) goto L1fc
            java.lang.Class[] r14 = r14.getParameterTypes()
            r14 = r14[r17]
            java.lang.Class r15 = java.lang.Integer.TYPE
            boolean r14 = p000.ln0.m3626(r14, r15)
            if (r14 == 0) goto L1fc
            r3.add(r13)
            goto L1fc
        L222:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r13 = r12.iterator()
        L22b:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L288
            java.lang.Object r14 = r13.next()
            r15 = r14
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            boolean r16 = r3.isEmpty()
            if (r16 == 0) goto L241
        L23e:
            r21 = r3
            goto L280
        L241:
            java.util.Iterator r16 = r3.iterator()
        L245:
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto L23e
            java.lang.Object r17 = r16.next()
            java.lang.reflect.Method r17 = (java.lang.reflect.Method) r17
            java.lang.String r9 = r17.getName()
            r21 = r3
            java.lang.String r3 = r15.getName()
            boolean r3 = p000.ln0.m3626(r9, r3)
            if (r3 == 0) goto L284
            java.lang.Class r3 = r17.getReturnType()
            java.lang.Class r9 = r15.getReturnType()
            boolean r3 = p000.ln0.m3626(r3, r9)
            if (r3 == 0) goto L284
            java.lang.Class[] r3 = r17.getParameterTypes()
            java.lang.Class[] r9 = r15.getParameterTypes()
            boolean r3 = java.util.Arrays.equals(r3, r9)
            if (r3 == 0) goto L284
            r8.add(r14)
        L280:
            r3 = r21
            r9 = 1
            goto L22b
        L284:
            r3 = r21
            r9 = 1
            goto L245
        L288:
            boolean r3 = r8.isEmpty()
            if (r3 == 0) goto L28f
            goto L290
        L28f:
            r12 = r8
        L290:
            boolean r3 = r12.isEmpty()
            r8 = 4
            java.lang.String r9 = "rc1ad4955cc6c3a73"
            if (r3 == 0) goto L2a7
            r11.remove(r0)
            java.lang.String r3 = "comment item click method not found in "
            java.lang.String r0 = r3.concat(r0)
            r3 = 0
            p000.C0888ux.m5988(r9, r0, r3, r8, r3)
            goto L316
        L2a7:
            java.util.Iterator r3 = r12.iterator()
        L2ab:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L316
            java.lang.Object r0 = r3.next()
            r11 = r0
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            r12 = 1
            r11.setAccessible(r12)     // Catch: java.lang.Throwable -> L2f2
            xq0 r0 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L2f2
            nh r13 = new nh     // Catch: java.lang.Throwable -> L2f2
            r13.<init>(r4)     // Catch: java.lang.Throwable -> L2f2
            r0.m6775(r11, r13)     // Catch: java.lang.Throwable -> L2f2
            java.lang.Class r0 = r11.getDeclaringClass()     // Catch: java.lang.Throwable -> L2f2
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L2f2
            java.lang.String r13 = r11.getName()     // Catch: java.lang.Throwable -> L2f2
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f2
            r14.<init>()     // Catch: java.lang.Throwable -> L2f2
            java.lang.String r15 = "hooked comment item click "
            r14.append(r15)     // Catch: java.lang.Throwable -> L2f2
            r14.append(r0)     // Catch: java.lang.Throwable -> L2f2
            r14.append(r7)     // Catch: java.lang.Throwable -> L2f2
            r14.append(r13)     // Catch: java.lang.Throwable -> L2f2
            java.lang.String r0 = r14.toString()     // Catch: java.lang.Throwable -> L2f2
            r13 = 0
            p000.C0888ux.m5988(r9, r0, r13, r8, r13)     // Catch: java.lang.Throwable -> L2f0
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L2f0
            goto L2fa
        L2f0:
            r0 = move-exception
            goto L2f4
        L2f2:
            r0 = move-exception
            r13 = 0
        L2f4:
            eo1 r14 = new eo1
            r14.<init>(r0)
            r0 = r14
        L2fa:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L2ab
            java.lang.Class r14 = r11.getDeclaringClass()
            java.lang.String r14 = r14.getName()
            java.lang.String r11 = r11.getName()
            java.lang.String r15 = "hook comment item click failed "
            java.lang.String r11 = p000.a12.m18(r15, r14, r7, r11)
            p000.C0888ux.m5977(r9, r11, r0)
            goto L2ab
        L316:
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r2, r6}
            java.lang.Object r0 = r10.newInstance(r0)
            java.util.Map r3 = p000.C0118cm.f2207
            r3.getClass()
            r3.put(r0, r1)
            java.util.Map r1 = p000.C0118cm.f2208
            r1.getClass()
            r1.put(r0, r2)
            r0.getClass()
            return r0
        L332:
            java.lang.String r0 = "custom item class not found"
            p000.C1080.m7279(r0)
            r0 = 0
            return r0
        L339:
            java.lang.String r0 = "CommonActionItem constructor not found"
            p000.C1080.m7279(r0)
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public static java.lang.Object m1258(java.lang.Class r2) {
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lb
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            return r2
        Lb:
            java.lang.Class r0 = java.lang.Byte.TYPE
            boolean r0 = r2.equals(r0)
            r1 = 0
            if (r0 == 0) goto L19
            java.lang.Byte r2 = java.lang.Byte.valueOf(r1)
            return r2
        L19:
            java.lang.Class r0 = java.lang.Short.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L26
            java.lang.Short r2 = java.lang.Short.valueOf(r1)
            return r2
        L26:
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L33
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            return r2
        L33:
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L42
            r0 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            return r2
        L42:
            java.lang.Class r0 = java.lang.Float.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L50
            r2 = 0
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            return r2
        L50:
            java.lang.Class r0 = java.lang.Double.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L5f
            r0 = 0
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
        L5f:
            java.lang.Class r0 = java.lang.Character.TYPE
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L6c
            java.lang.Character r2 = java.lang.Character.valueOf(r1)
            return r2
        L6c:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ζ */
    public static java.lang.Object m1259(java.lang.Object r3, java.lang.reflect.Method r4, java.lang.Object[] r5) {
            java.lang.Class r0 = r4.getDeclaringClass()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r0 = p000.ln0.m3626(r0, r1)
            r1 = 0
            if (r0 != 0) goto Le
            goto L67
        Le:
            java.lang.String r4 = r4.getName()
            if (r4 == 0) goto L67
            int r0 = r4.hashCode()
            r2 = -1776922004(0xffffffff9616526c, float:-1.2142911E-25)
            if (r0 == r2) goto L52
            r2 = -1295482945(0xffffffffb2c87fbf, float:-2.3341157E-8)
            if (r0 == r2) goto L3a
            r5 = 147696667(0x8cdac1b, float:1.23784505E-33)
            if (r0 == r5) goto L28
            goto L67
        L28:
            java.lang.String r5 = "hashCode"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L31
            goto L67
        L31:
            int r3 = java.lang.System.identityHashCode(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
        L3a:
            java.lang.String r0 = "equals"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L43
            goto L67
        L43:
            r4 = 0
            if (r5 == 0) goto L4a
            java.lang.Object r1 = p000.AbstractC0312g7.m2253(r4, r5)
        L4a:
            if (r1 != r3) goto L4d
            r4 = 1
        L4d:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)
            return r3
        L52:
            java.lang.String r3 = "toString"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L67
            java.lang.Class<cm> r3 = p000.C0118cm.class
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = "$Proxy"
            java.lang.String r3 = r3.concat(r4)
            return r3
        L67:
            return r1
    }

    /* JADX INFO: renamed from: η */
    public static java.lang.Object m1260(java.lang.Object r2, java.lang.reflect.Method r3, java.lang.Object[] r4) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            int r1 = r4.length     // Catch: java.lang.Throwable -> Le
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)     // Catch: java.lang.Throwable -> Le
            java.lang.Object r2 = r3.invoke(r2, r4)     // Catch: java.lang.Throwable -> Le
            goto L15
        Le:
            r2 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r2)
            r2 = r3
        L15:
            boolean r3 = r2 instanceof p000.eo1
            if (r3 == 0) goto L1a
            goto L1b
        L1a:
            r0 = r2
        L1b:
            return r0
    }

    /* JADX INFO: renamed from: θ */
    public static boolean m1261(java.lang.reflect.Method r4) {
            java.lang.Class[] r0 = r4.getParameterTypes()
            int r0 = r0.length
            r1 = 2
            r2 = 0
            if (r0 != r1) goto L2f
            java.lang.Class[] r0 = r4.getParameterTypes()
            r0 = r0[r2]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L2f
            java.lang.Class[] r0 = r4.getParameterTypes()
            r3 = 1
            r0 = r0[r3]
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L2f
            java.lang.Class r4 = r4.getReturnType()
            boolean r4 = r4.isInterface()
            if (r4 == 0) goto L2f
            return r3
        L2f:
            return r2
    }

    /* JADX INFO: renamed from: ι */
    public static boolean m1262(p000.nv0 r9, java.lang.Object r10, java.lang.ClassLoader r11, java.lang.String r12) {
            java.lang.String r0 = "comment action dismissed id="
            android.content.Context r2 = p000.h62.m2370(r10)
            java.lang.Object r6 = p000.h62.m2369(r10)
            ig r1 = new ig
            r3 = 16
            r1.<init>(r3)
            java.lang.Object r7 = p000.h62.m2373(r1, r10)
            java.lang.String r8 = p000.h62.m2375(r10)
            ov0 r1 = new ov0
            r5 = 0
            r4 = r10
            r3 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r10 = r9.f7758
            java.lang.Class r11 = r4.getClass()
            java.lang.String r11 = r11.getName()
            r3 = 0
            if (r6 == 0) goto L37
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getName()
            goto L38
        L37:
            r5 = r3
        L38:
            if (r2 == 0) goto L43
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            goto L44
        L43:
            r2 = r3
        L44:
            java.lang.String r6 = ", id="
            java.lang.String r7 = ", params="
            java.lang.String r8 = "comment action clicked source="
            java.lang.StringBuilder r12 = p000.lz1.m3695(r8, r12, r6, r10, r7)
            java.lang.String r6 = ", comment="
            java.lang.String r7 = ", host="
            p000.AbstractC0602nx.m4119(r12, r11, r6, r5, r7)
            r12.append(r2)
            java.lang.String r11 = r12.toString()
            java.lang.String r12 = "rc1ad4955cc6c3a73"
            r2 = 4
            p000.C0888ux.m5988(r12, r11, r3, r2, r3)
            a80 r9 = r9.f7765     // Catch: java.lang.Throwable -> L85
            r9.invoke(r1)     // Catch: java.lang.Throwable -> L85
            boolean r9 = p000.h62.m2365(r4)     // Catch: java.lang.Throwable -> L85
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L85
            r11.append(r10)     // Catch: java.lang.Throwable -> L85
            java.lang.String r0 = ", result="
            r11.append(r0)     // Catch: java.lang.Throwable -> L85
            r11.append(r9)     // Catch: java.lang.Throwable -> L85
            java.lang.String r9 = r11.toString()     // Catch: java.lang.Throwable -> L85
            p000.C0888ux.m5988(r12, r9, r3, r2, r3)     // Catch: java.lang.Throwable -> L85
            java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L85
            goto L8d
        L85:
            r0 = move-exception
            r9 = r0
            eo1 r11 = new eo1
            r11.<init>(r9)
            r9 = r11
        L8d:
            java.lang.Throwable r11 = p000.fo1.m2190(r9)
            if (r11 == 0) goto L98
            java.lang.String r0 = "comment action click failed id="
            p000.AbstractC0602nx.m4145(r0, r10, r12, r11)
        L98:
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            boolean r11 = r9 instanceof p000.eo1
            if (r11 == 0) goto L9f
            r9 = r10
        L9f:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            return r9
    }

    /* JADX INFO: renamed from: κ */
    public static void m1263(java.lang.String r14, java.lang.Object r15, java.lang.Object r16) {
            java.lang.Class r0 = r15.getClass()
            java.util.ArrayList r0 = m1255(r0)
            java.util.Iterator r1 = r0.iterator()
        Lc:
            boolean r0 = r1.hasNext()
            r2 = 0
            if (r0 == 0) goto L9f
            java.lang.Object r3 = r1.next()
            r0 = r3
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            java.lang.annotation.Annotation[] r4 = r0.getAnnotations()
            r4.getClass()
            int r5 = r4.length
            r6 = 0
            r7 = r6
        L24:
            if (r7 >= r5) goto Lc
            r0 = r4[r7]
            wf r8 = p000.ln0.m3599(r0)
            java.lang.Class r8 = p000.ln0.m3604(r8)
            java.lang.String r8 = r8.getName()
            java.lang.String r9 = "com.google.gson.annotations.SerializedName"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L9c
            wf r8 = p000.ln0.m3599(r0)     // Catch: java.lang.Throwable -> L68
            java.lang.Class r8 = p000.ln0.m3604(r8)     // Catch: java.lang.Throwable -> L68
            java.lang.reflect.Method[] r8 = r8.getMethods()     // Catch: java.lang.Throwable -> L68
            r8.getClass()     // Catch: java.lang.Throwable -> L68
            int r9 = r8.length     // Catch: java.lang.Throwable -> L68
            r10 = r6
        L4d:
            if (r10 >= r9) goto L6d
            r11 = r8[r10]     // Catch: java.lang.Throwable -> L68
            java.lang.String r12 = r11.getName()     // Catch: java.lang.Throwable -> L68
            java.lang.String r13 = "value"
            boolean r12 = p000.ln0.m3626(r12, r13)     // Catch: java.lang.Throwable -> L68
            if (r12 == 0) goto L6a
            java.lang.Class[] r12 = r11.getParameterTypes()     // Catch: java.lang.Throwable -> L68
            r12.getClass()     // Catch: java.lang.Throwable -> L68
            int r12 = r12.length     // Catch: java.lang.Throwable -> L68
            if (r12 != 0) goto L6a
            goto L6e
        L68:
            r0 = move-exception
            goto L85
        L6a:
            int r10 = r10 + 1
            goto L4d
        L6d:
            r11 = r2
        L6e:
            if (r11 == 0) goto L7b
            java.lang.Object r0 = r11.invoke(r0, r2)     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L7b
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L68
            goto L7c
        L7b:
            r0 = r2
        L7c:
            boolean r0 = p000.ln0.m3626(r0, r14)     // Catch: java.lang.Throwable -> L68
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L68
            goto L8b
        L85:
            eo1 r8 = new eo1
            r8.<init>(r0)
            r0 = r8
        L8b:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            boolean r9 = r0 instanceof p000.eo1
            if (r9 == 0) goto L92
            r0 = r8
        L92:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L9c
            r2 = r3
            goto L9f
        L9c:
            int r7 = r7 + 1
            goto L24
        L9f:
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            if (r2 != 0) goto La4
            goto Lad
        La4:
            r14 = 1
            r2.setAccessible(r14)     // Catch: java.lang.Throwable -> Lad
            r14 = r16
            r2.set(r15, r14)     // Catch: java.lang.Throwable -> Lad
        Lad:
            return
    }

    /* JADX INFO: renamed from: λ */
    public static java.util.ArrayList m1264(java.lang.Class r4) {
            java.util.ArrayList r4 = m1255(r4)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r4.next()
            r2 = r1
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            int r2 = r2.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isStatic(r2)
            if (r2 != 0) goto Ld
            r0.add(r1)
            goto Ld
        L28:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L31:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4c
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            int r2 = r2.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isFinal(r2)
            if (r2 != 0) goto L31
            r4.add(r1)
            goto L31
        L4c:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L55:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L72
            java.lang.Object r1 = r4.next()
            r2 = r1
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            java.lang.Class r2 = r2.getType()
            java.lang.Class r3 = java.lang.Integer.TYPE
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 == 0) goto L55
            r0.add(r1)
            goto L55
        L72:
            java.util.Iterator r4 = r0.iterator()
        L76:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L87
            java.lang.Object r1 = r4.next()
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            r2 = 1
            r1.setAccessible(r2)
            goto L76
        L87:
            return r0
    }
}
