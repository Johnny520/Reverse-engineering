package p000;

/* JADX INFO: renamed from: bf */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0075bf {

    /* JADX INFO: renamed from: α */
    public static final p000.C0075bf f1684 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.atomic.AtomicBoolean f1685 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.Set f1686 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.concurrent.atomic.AtomicBoolean f1687 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.util.concurrent.atomic.AtomicBoolean f1688 = null;

    /* JADX INFO: renamed from: ζ */
    public static final p000.C0210df f1689 = null;

    static {
            bf r0 = new bf
            r0.<init>()
            p000.C0075bf.f1684 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.C0075bf.f1685 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r0.getClass()
            p000.C0075bf.f1686 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.C0075bf.f1687 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.C0075bf.f1688 = r0
            df r0 = new df
            r0.<init>()
            p000.C0075bf.f1689 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final int m946(p000.C0075bf r3, java.lang.reflect.Method r4) {
            java.lang.Class r3 = r4.getDeclaringClass()
            java.lang.String r3 = r3.getName()
            java.lang.String r0 = "~7960BFBA0FA02BB4BD37AD83E4D6EDE425E18DDCF451803836376A3EBF3A7DDC2D3458C1CDC0C2B628EF60276FC030F269B1E80CD3B21C0B13E896E0C5"
            java.lang.String r0 = p000.jf0.m2957(r0)
            boolean r3 = r3.equals(r0)
            r0 = 0
            if (r3 == 0) goto L18
            r3 = 1000(0x3e8, float:1.401E-42)
            goto L19
        L18:
            r3 = r0
        L19:
            int r1 = r4.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 == 0) goto L25
            int r3 = r3 + 300
        L25:
            java.lang.Class[] r1 = r4.getParameterTypes()
            int r1 = r1.length
            r2 = 7
            if (r1 != r2) goto L2f
            int r3 = r3 + 500
        L2f:
            java.lang.String r1 = r4.getName()
            java.lang.String r2 = "LJII"
            boolean r1 = p000.ln0.m3626(r1, r2)
            if (r1 == 0) goto L3d
            int r3 = r3 + 700
        L3d:
            java.lang.Class r4 = r4.getReturnType()
            java.lang.String r4 = r4.getName()
            java.lang.String r1 = "X."
            boolean r4 = p000.x02.m6485(r4, r1, r0)
            if (r4 == 0) goto L4f
            int r3 = r3 + 100
        L4f:
            return r3
    }

    /* JADX INFO: renamed from: β */
    public static final void m947(java.util.LinkedHashMap r12, java.lang.reflect.Method r13) {
            if (r13 != 0) goto L3
            goto L9
        L3:
            boolean r0 = m949(r13)
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
    public static java.util.ArrayList m948(java.util.List r17) {
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

    /* JADX INFO: renamed from: ε */
    public static boolean m949(java.lang.reflect.Method r14) {
            r14.getClass()
            int r0 = r14.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            r1 = 0
            if (r0 != 0) goto L10
            goto L88
        L10:
            java.lang.Class r0 = r14.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r2 = "~7960BFBA0FA02BB4BD37AD83E4D6EDE425E18DDCF451803836376A3EBF3A7DDC2D3458C1CDC0C2B628EF60276FC030F269B1E80CD3B21C0B13E896E0C5"
            java.lang.String r2 = p000.jf0.m2957(r2)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L35
            java.lang.Class r0 = r14.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r2 = ".ChapterNavigationHelper"
            boolean r0 = p000.x02.m6479(r0, r2, r1)
            if (r0 != 0) goto L35
            goto L88
        L35:
            java.lang.Class[] r0 = r14.getParameterTypes()
            int r2 = r0.length
            r3 = 7
            if (r2 == r3) goto L3e
            goto L88
        L3e:
            r2 = r0[r1]
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"
            java.lang.String r3 = p000.jf0.m2957(r3)
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L51
            goto L88
        L51:
            r2 = 1
            r3 = r0[r2]
            java.lang.Class r4 = java.lang.Long.TYPE
            boolean r3 = p000.ln0.m3626(r3, r4)
            if (r3 != 0) goto L5d
            goto L88
        L5d:
            r3 = 2
            r4 = r0[r3]
            java.lang.Class r5 = java.lang.Boolean.TYPE
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L69
            goto L88
        L69:
            r4 = 3
            r4 = r0[r4]
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L73
            goto L88
        L73:
            r4 = 4
            r4 = r0[r4]
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L7d
            goto L88
        L7d:
            r4 = 5
            r4 = r0[r4]
            java.lang.Class r6 = java.lang.Integer.TYPE
            boolean r4 = p000.ln0.m3626(r4, r6)
            if (r4 != 0) goto L89
        L88:
            return r1
        L89:
            r4 = 6
            r0 = r0[r4]
            r0.getClass()
            boolean r4 = r0.isInterface()
            java.lang.Class r7 = java.lang.Void.TYPE
            if (r4 != 0) goto L9a
            r0 = r1
            goto L151
        L9a:
            java.lang.reflect.Method[] r0 = r0.getMethods()     // Catch: java.lang.Throwable -> Lc3
            r0.getClass()     // Catch: java.lang.Throwable -> Lc3
            int r4 = r0.length     // Catch: java.lang.Throwable -> Lc3
            r8 = r1
        La3:
            if (r8 >= r4) goto Lc9
            r9 = r0[r8]     // Catch: java.lang.Throwable -> Lc3
            java.lang.Class r10 = r9.getReturnType()     // Catch: java.lang.Throwable -> Lc3
            boolean r10 = p000.ln0.m3626(r10, r7)     // Catch: java.lang.Throwable -> Lc3
            if (r10 == 0) goto Lc6
            java.lang.Class[] r9 = r9.getParameterTypes()     // Catch: java.lang.Throwable -> Lc3
            java.lang.Class r10 = java.lang.Float.TYPE     // Catch: java.lang.Throwable -> Lc3
            java.lang.Class[] r10 = new java.lang.Class[]{r10}     // Catch: java.lang.Throwable -> Lc3
            boolean r9 = java.util.Arrays.equals(r9, r10)     // Catch: java.lang.Throwable -> Lc3
            if (r9 == 0) goto Lc6
            r4 = r2
            goto Lca
        Lc3:
            r0 = move-exception
            goto L13e
        Lc6:
            int r8 = r8 + 1
            goto La3
        Lc9:
            r4 = r1
        Lca:
            int r8 = r0.length     // Catch: java.lang.Throwable -> Lc3
            r9 = r1
        Lcc:
            if (r9 >= r8) goto Leb
            r10 = r0[r9]     // Catch: java.lang.Throwable -> Lc3
            java.lang.Class[] r11 = r10.getParameterTypes()     // Catch: java.lang.Throwable -> Lc3
            r11.getClass()     // Catch: java.lang.Throwable -> Lc3
            int r11 = r11.length     // Catch: java.lang.Throwable -> Lc3
            if (r11 != 0) goto Le8
            java.lang.Class<android.app.Activity> r11 = android.app.Activity.class
            java.lang.Class r10 = r10.getReturnType()     // Catch: java.lang.Throwable -> Lc3
            boolean r10 = r11.isAssignableFrom(r10)     // Catch: java.lang.Throwable -> Lc3
            if (r10 == 0) goto Le8
            r8 = r2
            goto Lec
        Le8:
            int r9 = r9 + 1
            goto Lcc
        Leb:
            r8 = r1
        Lec:
            int r9 = r0.length     // Catch: java.lang.Throwable -> Lc3
            r10 = r1
        Lee:
            if (r10 >= r9) goto L10d
            r11 = r0[r10]     // Catch: java.lang.Throwable -> Lc3
            java.lang.Class[] r12 = r11.getParameterTypes()     // Catch: java.lang.Throwable -> Lc3
            r12.getClass()     // Catch: java.lang.Throwable -> Lc3
            int r12 = r12.length     // Catch: java.lang.Throwable -> Lc3
            if (r12 != 0) goto L10a
            java.lang.Class r11 = r11.getReturnType()     // Catch: java.lang.Throwable -> Lc3
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            boolean r11 = p000.ln0.m3626(r11, r12)     // Catch: java.lang.Throwable -> Lc3
            if (r11 == 0) goto L10a
            r9 = r2
            goto L10e
        L10a:
            int r10 = r10 + 1
            goto Lee
        L10d:
            r9 = r1
        L10e:
            int r10 = r0.length     // Catch: java.lang.Throwable -> Lc3
            r11 = r1
        L110:
            if (r11 >= r10) goto L12d
            r12 = r0[r11]     // Catch: java.lang.Throwable -> Lc3
            java.lang.Class[] r13 = r12.getParameterTypes()     // Catch: java.lang.Throwable -> Lc3
            r13.getClass()     // Catch: java.lang.Throwable -> Lc3
            int r13 = r13.length     // Catch: java.lang.Throwable -> Lc3
            if (r13 != 0) goto L12a
            java.lang.Class r12 = r12.getReturnType()     // Catch: java.lang.Throwable -> Lc3
            boolean r12 = p000.ln0.m3626(r12, r5)     // Catch: java.lang.Throwable -> Lc3
            if (r12 == 0) goto L12a
            r0 = r2
            goto L12e
        L12a:
            int r11 = r11 + 1
            goto L110
        L12d:
            r0 = r1
        L12e:
            if (r4 == 0) goto L138
            if (r8 == 0) goto L138
            if (r9 == 0) goto L138
            if (r0 == 0) goto L138
            r0 = r2
            goto L139
        L138:
            r0 = r1
        L139:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> Lc3
            goto L144
        L13e:
            eo1 r4 = new eo1
            r4.<init>(r0)
            r0 = r4
        L144:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            boolean r8 = r0 instanceof p000.eo1
            if (r8 == 0) goto L14b
            r0 = r4
        L14b:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
        L151:
            if (r0 == 0) goto L20b
            java.lang.Class r14 = r14.getReturnType()
            r14.getClass()
            boolean r0 = r14.equals(r7)
            if (r0 != 0) goto L207
            boolean r0 = r14.isPrimitive()
            if (r0 == 0) goto L168
            goto L207
        L168:
            java.lang.reflect.Field[] r14 = r14.getDeclaredFields()     // Catch: java.lang.Throwable -> L188
            r14.getClass()     // Catch: java.lang.Throwable -> L188
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L188
            r0.<init>()     // Catch: java.lang.Throwable -> L188
            int r4 = r14.length     // Catch: java.lang.Throwable -> L188
            r7 = r1
        L176:
            if (r7 >= r4) goto L18e
            r8 = r14[r7]     // Catch: java.lang.Throwable -> L188
            int r9 = r8.getModifiers()     // Catch: java.lang.Throwable -> L188
            boolean r9 = java.lang.reflect.Modifier.isStatic(r9)     // Catch: java.lang.Throwable -> L188
            if (r9 != 0) goto L18b
            r0.add(r8)     // Catch: java.lang.Throwable -> L188
            goto L18b
        L188:
            r14 = move-exception
            goto L1f3
        L18b:
            int r7 = r7 + 1
            goto L176
        L18e:
            boolean r14 = r0.isEmpty()     // Catch: java.lang.Throwable -> L188
            r4 = 0
            if (r14 == 0) goto L197
            r7 = r1
            goto L1bb
        L197:
            java.util.Iterator r14 = r0.iterator()     // Catch: java.lang.Throwable -> L188
            r7 = r1
        L19c:
            boolean r8 = r14.hasNext()     // Catch: java.lang.Throwable -> L188
            if (r8 == 0) goto L1bb
            java.lang.Object r8 = r14.next()     // Catch: java.lang.Throwable -> L188
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8     // Catch: java.lang.Throwable -> L188
            java.lang.Class r8 = r8.getType()     // Catch: java.lang.Throwable -> L188
            boolean r8 = p000.ln0.m3626(r8, r5)     // Catch: java.lang.Throwable -> L188
            if (r8 == 0) goto L19c
            int r7 = r7 + 1
            if (r7 < 0) goto L1b7
            goto L19c
        L1b7:
            p000.AbstractC1021yh.m6916()     // Catch: java.lang.Throwable -> L188
            throw r4     // Catch: java.lang.Throwable -> L188
        L1bb:
            if (r7 < r3) goto L1ed
            boolean r14 = r0.isEmpty()     // Catch: java.lang.Throwable -> L188
            if (r14 == 0) goto L1c5
            r0 = r1
            goto L1e9
        L1c5:
            java.util.Iterator r14 = r0.iterator()     // Catch: java.lang.Throwable -> L188
            r0 = r1
        L1ca:
            boolean r3 = r14.hasNext()     // Catch: java.lang.Throwable -> L188
            if (r3 == 0) goto L1e9
            java.lang.Object r3 = r14.next()     // Catch: java.lang.Throwable -> L188
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3     // Catch: java.lang.Throwable -> L188
            java.lang.Class r3 = r3.getType()     // Catch: java.lang.Throwable -> L188
            boolean r3 = p000.ln0.m3626(r3, r6)     // Catch: java.lang.Throwable -> L188
            if (r3 == 0) goto L1ca
            int r0 = r0 + 1
            if (r0 < 0) goto L1e5
            goto L1ca
        L1e5:
            p000.AbstractC1021yh.m6916()     // Catch: java.lang.Throwable -> L188
            throw r4     // Catch: java.lang.Throwable -> L188
        L1e9:
            if (r0 < r2) goto L1ed
            r14 = r2
            goto L1ee
        L1ed:
            r14 = r1
        L1ee:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)     // Catch: java.lang.Throwable -> L188
            goto L1f9
        L1f3:
            eo1 r0 = new eo1
            r0.<init>(r14)
            r14 = r0
        L1f9:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r3 = r14 instanceof p000.eo1
            if (r3 == 0) goto L200
            r14 = r0
        L200:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            goto L208
        L207:
            r14 = r1
        L208:
            if (r14 == 0) goto L20b
            r1 = r2
        L20b:
            return r1
    }

    /* JADX INFO: renamed from: ζ */
    public static void m950(java.lang.String r1) {
            java.lang.String r0 = "re1ccc43159b6faec"
            p000.C0888ux.m5975(r0, r1)
            return
    }

    /* JADX INFO: renamed from: δ */
    public final void m951(java.lang.ClassLoader r15) {
            r14 = this;
            r15.getClass()
            r1 = 0
            java.util.List r15 = r14.m953(r15, r1)
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L14
            java.lang.String r14 = "no skip method resolved, allowDexKitScan=false"
            m950(r14)
            return
        L14:
            java.util.Iterator r15 = r15.iterator()
        L18:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto Le2
            java.lang.Object r0 = r15.next()
            r2 = r0
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.String r0 = p000.lz1.m3694(r2)
            java.lang.String r3 = r2.getName()
            java.lang.String r4 = p000.lz1.m3690(r3, r2)
            java.lang.Class[] r5 = r2.getParameterTypes()
            r5.getClass()
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = r5.length
            r6.<init>(r7)
            int r7 = r5.length
            r8 = r1
        L40:
            r13 = 1
            if (r8 >= r7) goto L4a
            r9 = r5[r8]
            int r8 = p000.lz1.m3679(r9, r6, r8, r13)
            goto L40
        L4a:
            int r5 = r2.getModifiers()
            java.lang.reflect.Modifier.isStatic(r5)
            r11 = 0
            r12 = 62
            java.lang.String r7 = ","
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.String r5 = p000.AbstractC0984xh.m6644(r6, r7, r8, r9, r10, r11, r12)
            java.lang.String r6 = "("
            java.lang.String r7 = "#"
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4138(r0, r7, r3, r6, r5)
            java.lang.String r3 = "):"
            java.lang.String r3 = p000.lz1.m3691(r0, r3, r4)
            java.util.Set r4 = p000.C0075bf.f1686
            boolean r0 = r4.add(r3)
            if (r0 != 0) goto L74
            goto L18
        L74:
            r2.setAccessible(r13)     // Catch: java.lang.Throwable -> L84
            xq0 r0 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L84
            xe r5 = new xe     // Catch: java.lang.Throwable -> L84
            r6 = 0
            r5.<init>(r6, r14, r2)     // Catch: java.lang.Throwable -> L84
            l01 r0 = r0.m6775(r2, r5)     // Catch: java.lang.Throwable -> L84
            goto L8b
        L84:
            r0 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r0)
            r0 = r5
        L8b:
            boolean r5 = r0 instanceof p000.eo1
            if (r5 != 0) goto Lb5
            r5 = r0
            l01 r5 = (p000.l01) r5
            java.lang.Class r5 = r2.getDeclaringClass()
            java.lang.String r5 = r5.getName()
            java.lang.String r6 = r2.getName()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "hooked "
            r8.<init>(r9)
            r8.append(r5)
            r8.append(r7)
            r8.append(r6)
            java.lang.String r5 = r8.toString()
            m950(r5)
        Lb5:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L18
            r4.remove(r3)
            java.lang.Class r3 = r2.getDeclaringClass()
            java.lang.String r3 = r3.getName()
            java.lang.String r2 = r2.getName()
            java.lang.String r0 = r0.getMessage()
            java.lang.String r4 = "hook failed "
            java.lang.String r5 = ": "
            java.lang.StringBuilder r2 = p000.lz1.m3695(r4, r3, r7, r2, r5)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            m950(r0)
            goto L18
        Le2:
            return
    }

    /* JADX INFO: renamed from: η */
    public final java.util.List m952(java.lang.ClassLoader r7) {
            r6 = this;
            java.lang.Object r0 = p000.qe0.f8982
            java.lang.String r0 = "~7960BFBA0FA02BB4BD37AD83E4D6EDE425E18DDCF451803836376A3EBF3A7DDC2D3458C1CDC0C2B628EF60276FC030F269B1E80CD3B21C0B13E896E0C5"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.Class r7 = p000.qe0.m4877(r7, r0)
            if (r7 != 0) goto L11
            jz r6 = p000.C0450jz.f5672
            return r6
        L11:
            java.lang.reflect.Method[] r7 = r7.getDeclaredMethods()
            r7.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r7.length
            r2 = 0
            r3 = r2
        L20:
            if (r3 >= r1) goto L30
            r4 = r7[r3]
            boolean r5 = m949(r4)
            if (r5 == 0) goto L2d
            r0.add(r4)
        L2d:
            int r3 = r3 + 1
            goto L20
        L30:
            ye r7 = new ye
            r7.<init>(r2, r6)
            java.util.List r6 = p000.AbstractC0984xh.m6658(r0, r7)
            java.util.ArrayList r6 = m948(r6)
            return r6
    }

    /* JADX INFO: renamed from: θ */
    public final java.util.List m953(java.lang.ClassLoader r4, boolean r5) {
            r3 = this;
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = p000.EnumC0491kx.f6247
            java.util.List r1 = p000.C0666ox.m4323(r0, r4)
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
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L34
            java.lang.Object r5 = r4.next()
            r0 = r5
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            boolean r0 = m949(r0)
            if (r0 == 0) goto L1d
            r3.add(r5)
            goto L1d
        L34:
            java.util.ArrayList r3 = m948(r3)
            return r3
        L39:
            java.util.List r3 = r3.m952(r4)
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L49
            if (r5 == 0) goto L48
            p000.C0666ox.m4327(r0, r3)
        L48:
            return r3
        L49:
            if (r5 == 0) goto L85
            java.util.concurrent.atomic.AtomicBoolean r3 = p000.C0666ox.f8305
            boolean r3 = r3.get()
            if (r3 != 0) goto L54
            goto L85
        L54:
            bb r3 = new bb
            r5 = 7
            r3.<init>(r4, r5)
            java.lang.String r5 = "定位视频章节广告自动跳过逻辑"
            java.util.List r3 = p000.C0666ox.m4316(r0, r4, r5, r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L69:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L80
            java.lang.Object r5 = r3.next()
            r0 = r5
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            boolean r0 = m949(r0)
            if (r0 == 0) goto L69
            r4.add(r5)
            goto L69
        L80:
            java.util.ArrayList r3 = m948(r4)
            return r3
        L85:
            jz r3 = p000.C0450jz.f5672
            return r3
    }
}
