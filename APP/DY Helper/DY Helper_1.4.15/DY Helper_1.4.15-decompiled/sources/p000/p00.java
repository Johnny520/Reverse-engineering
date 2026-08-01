package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class p00 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.atomic.AtomicBoolean f8376 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.ConcurrentHashMap f8377 = null;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.p00.f8376 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.p00.f8377 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final int m4340(java.lang.reflect.Method r4) {
            int r0 = r4.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            r1 = 0
            if (r0 == 0) goto Le
            r0 = 300(0x12c, float:4.2E-43)
            goto Lf
        Le:
            r0 = r1
        Lf:
            java.lang.Class r2 = r4.getReturnType()
            java.lang.Class r3 = java.lang.Boolean.TYPE
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 == 0) goto L1d
            int r0 = r0 + 300
        L1d:
            java.lang.Class[] r2 = r4.getParameterTypes()
            r2.getClass()
            java.lang.Object r1 = p000.AbstractC0312g7.m2253(r1, r2)
            java.lang.Class r1 = (java.lang.Class) r1
            if (r1 == 0) goto L31
            java.lang.String r1 = r1.getName()
            goto L32
        L31:
            r1 = 0
        L32:
            java.lang.String r2 = "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"
            java.lang.String r2 = p000.jf0.m2957(r2)
            boolean r1 = p000.ln0.m3626(r1, r2)
            if (r1 == 0) goto L40
            int r0 = r0 + 400
        L40:
            java.lang.Class[] r1 = r4.getParameterTypes()
            r1.getClass()
            r2 = 1
            java.lang.Object r1 = p000.AbstractC0312g7.m2253(r2, r1)
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            boolean r1 = p000.ln0.m3626(r1, r2)
            if (r1 == 0) goto L56
            int r0 = r0 + 200
        L56:
            java.lang.Class r4 = r4.getDeclaringClass()
            java.lang.reflect.Method[] r4 = r4.getDeclaredMethods()
            int r4 = r4.length
            r1 = 12
            if (r4 > r1) goto L65
            int r0 = r0 + 100
        L65:
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static void m4341(java.lang.ClassLoader r3, boolean r4) {
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = p000.EnumC0491kx.f6207
            java.util.List r1 = p000.C0666ox.m4321(r0, r3)
            if (r1 == 0) goto L15
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L11
            goto L12
        L11:
            r1 = 0
        L12:
            if (r1 == 0) goto L15
            goto L2c
        L15:
            if (r4 == 0) goto L2c
            java.util.concurrent.atomic.AtomicBoolean r4 = p000.C0666ox.f8305
            boolean r4 = r4.get()
            if (r4 != 0) goto L20
            goto L2c
        L20:
            bb r4 = new bb
            r1 = 21
            r4.<init>(r3, r1)
            java.lang.String r1 = "定位长按面板广告判断类"
            p000.C0666ox.m4314(r0, r3, r1, r4)
        L2c:
            return
    }

    /* JADX INFO: renamed from: γ */
    public static int m4342(java.lang.Class r10) {
            java.lang.reflect.Method[] r0 = r10.getDeclaredMethods()
            r0.getClass()
            int r1 = r0.length
            r2 = 0
            r3 = r2
        La:
            if (r3 >= r1) goto L57
            r4 = r0[r3]
            java.lang.Class[] r5 = r4.getParameterTypes()
            int r5 = r5.length
            r6 = 2
            if (r5 != r6) goto L54
            java.lang.Class[] r5 = r4.getParameterTypes()
            r5 = r5[r2]
            java.lang.String r5 = r5.getName()
            java.lang.String r6 = "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"
            java.lang.String r6 = p000.jf0.m2957(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L54
            java.lang.Class[] r5 = r4.getParameterTypes()
            r6 = 1
            r5 = r5[r6]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            boolean r5 = p000.ln0.m3626(r5, r6)
            if (r5 == 0) goto L54
            java.lang.Class r5 = r4.getReturnType()
            java.lang.Class r6 = java.lang.Boolean.TYPE
            boolean r5 = p000.ln0.m3626(r5, r6)
            if (r5 == 0) goto L54
            int r4 = r4.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
            if (r4 == 0) goto L54
            r0 = 1000(0x3e8, float:1.401E-42)
            goto L58
        L54:
            int r3 = r3 + 1
            goto La
        L57:
            r0 = r2
        L58:
            java.lang.reflect.Method[] r1 = r10.getDeclaredMethods()
            r1.getClass()
            int r3 = r1.length
            r4 = r2
        L61:
            if (r4 >= r3) goto L8b
            r5 = r1[r4]
            java.lang.Class[] r5 = r5.getParameterTypes()
            r5.getClass()
            int r6 = r5.length
            r7 = r2
        L6e:
            if (r7 >= r6) goto L88
            r8 = r5[r7]
            java.lang.String r8 = r8.getName()
            java.lang.String r9 = "~78B38367CFE852F14F689594842A0085750A11DB0443EB2AFF250DFFBABD94A01BAE8D13E20B0745AD541F739E610490C00DB97E203B7A27453B359A1B6E0ACFDBE2FBAE339F5D0679"
            java.lang.String r9 = p000.jf0.m2957(r9)
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L85
            int r0 = r0 + 200
            goto L8b
        L85:
            int r7 = r7 + 1
            goto L6e
        L88:
            int r4 = r4 + 1
            goto L61
        L8b:
            java.lang.String r1 = r10.getName()
            java.lang.String r3 = "X."
            boolean r1 = p000.x02.m6485(r1, r3, r2)
            if (r1 == 0) goto L99
            int r0 = r0 + 100
        L99:
            java.lang.reflect.Method[] r10 = r10.getDeclaredMethods()
            int r10 = r10.length
            r1 = 12
            if (r10 > r1) goto La4
            int r0 = r0 + 100
        La4:
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public static java.util.ArrayList m4343(org.luckypray.dexkit.result.MethodDataList r11, java.lang.ClassLoader r12) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r11 = r11.iterator()
        L9:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L84
            java.lang.Object r1 = r11.next()
            r2 = 0
            if (r1 != 0) goto L17
            goto L6e
        L17:
            java.lang.Class r3 = r1.getClass()     // Catch: java.lang.Throwable -> L4c
            java.lang.reflect.Method[] r3 = r3.getMethods()     // Catch: java.lang.Throwable -> L4c
            r3.getClass()     // Catch: java.lang.Throwable -> L4c
            int r4 = r3.length     // Catch: java.lang.Throwable -> L4c
            r5 = 0
            r6 = r5
        L25:
            r7 = 1
            if (r6 >= r4) goto L51
            r8 = r3[r6]     // Catch: java.lang.Throwable -> L4c
            java.lang.String r9 = r8.getName()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r10 = "getMethodInstance"
            boolean r9 = p000.ln0.m3626(r9, r10)     // Catch: java.lang.Throwable -> L4c
            if (r9 == 0) goto L4e
            java.lang.Class[] r9 = r8.getParameterTypes()     // Catch: java.lang.Throwable -> L4c
            int r9 = r9.length     // Catch: java.lang.Throwable -> L4c
            if (r9 != r7) goto L4e
            java.lang.Class[] r9 = r8.getParameterTypes()     // Catch: java.lang.Throwable -> L4c
            r9 = r9[r5]     // Catch: java.lang.Throwable -> L4c
            java.lang.Class<java.lang.ClassLoader> r10 = java.lang.ClassLoader.class
            boolean r9 = p000.ln0.m3626(r9, r10)     // Catch: java.lang.Throwable -> L4c
            if (r9 == 0) goto L4e
            goto L52
        L4c:
            r1 = move-exception
            goto L70
        L4e:
            int r6 = r6 + 1
            goto L25
        L51:
            r8 = r2
        L52:
            if (r8 != 0) goto L55
            goto L6e
        L55:
            r8.setAccessible(r7)     // Catch: java.lang.Throwable -> L4c
            java.lang.Object[] r3 = new java.lang.Object[]{r12}     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r1 = r8.invoke(r1, r3)     // Catch: java.lang.Throwable -> L4c
            boolean r3 = r1 instanceof java.lang.reflect.Method     // Catch: java.lang.Throwable -> L4c
            if (r3 == 0) goto L67
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch: java.lang.Throwable -> L4c
            goto L68
        L67:
            r1 = r2
        L68:
            if (r1 == 0) goto L6e
            r1.setAccessible(r7)     // Catch: java.lang.Throwable -> L4c
            goto L76
        L6e:
            r1 = r2
            goto L76
        L70:
            eo1 r3 = new eo1
            r3.<init>(r1)
            r1 = r3
        L76:
            boolean r3 = r1 instanceof p000.eo1
            if (r3 == 0) goto L7b
            goto L7c
        L7b:
            r2 = r1
        L7c:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            if (r2 == 0) goto L9
            r0.add(r2)
            goto L9
        L84:
            return r0
    }
}
