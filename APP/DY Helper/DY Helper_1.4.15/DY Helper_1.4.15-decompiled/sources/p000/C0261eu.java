package p000;

/* JADX INFO: renamed from: eu */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0261eu {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.atomic.AtomicBoolean f3669 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.Set f3670 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.atomic.AtomicBoolean f3671 = null;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.C0261eu.f3669 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r0.getClass()
            p000.C0261eu.f3670 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.C0261eu.f3671 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m1958(java.lang.ClassLoader r23) {
            r1 = r23
            r1.getClass()
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r2 = p000.EnumC0491kx.f6295
            java.util.List r0 = p000.C0666ox.m4323(r2, r1)
            java.lang.String r3 = "):"
            java.lang.String r4 = "("
            r5 = 0
            java.lang.String r6 = "#"
            r7 = 1
            if (r0 == 0) goto L52
            boolean r8 = r0.isEmpty()
            if (r8 == 0) goto L1e
            goto L52
        L1e:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L27:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r0.next()
            r8 = r2
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            boolean r8 = m1959(r8)
            if (r8 == 0) goto L27
            r1.add(r2)
            goto L27
        L3e:
            java.util.Iterator r0 = r1.iterator()
        L42:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L15d
            java.lang.Object r2 = r0.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            r2.setAccessible(r7)
            goto L42
        L52:
            java.lang.String r0 = "~7806780885C0804EA843C2785FE21414EFEDAD1FDA598E7F9DB79EEE7AC484663C250A1F928A67714B0CDDBA270FFB6AF2BE2FA2BE2151B2363345030242B4D0CFEF437623D1EC87FDE81353D0B4FD7E606F1024C098FBDE1889784B9D79F6C3B38F4D4D"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.String r8 = "~7806780885C0804EA843C2785FE21414EFEDAD1FDA598E7F9DB79EEE7AC484663C250A1F928A67714B0CDDBA270FFB6AF2BE2FA2BE2151B2363345030242B4D0CFEF437623D1EC87FDE81353D0B4FD7E606F1024C098FBDE1889784B9D73F6C3B38F474D"
            java.lang.String r8 = p000.jf0.m2957(r8)
            java.lang.String[] r0 = new java.lang.String[]{r0, r8}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            java.util.Iterator r9 = r0.iterator()
        L6f:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L129
            java.lang.Object r0 = r9.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Class r0 = java.lang.Class.forName(r0, r5, r1)     // Catch: java.lang.Throwable -> L80
            goto L87
        L80:
            r0 = move-exception
            eo1 r10 = new eo1
            r10.<init>(r0)
            r0 = r10
        L87:
            boolean r10 = r0 instanceof p000.eo1
            if (r10 == 0) goto L8c
            r0 = 0
        L8c:
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 != 0) goto L92
            goto L123
        L92:
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
            r0.getClass()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            int r11 = r0.length
            r12 = r5
        La0:
            if (r12 >= r11) goto Lb0
            r13 = r0[r12]
            boolean r14 = m1959(r13)
            if (r14 == 0) goto Lad
            r10.add(r13)
        Lad:
            int r12 = r12 + 1
            goto La0
        Lb0:
            java.util.Iterator r0 = r10.iterator()
        Lb4:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L123
            java.lang.Object r10 = r0.next()
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            r10.setAccessible(r7)
            java.lang.Class r11 = r10.getDeclaringClass()
            java.lang.String r11 = r11.getName()
            java.lang.String r12 = r10.getName()
            java.lang.String r13 = p000.lz1.m3690(r12, r10)
            java.lang.Class[] r14 = r10.getParameterTypes()
            r14.getClass()
            java.util.ArrayList r15 = new java.util.ArrayList
            int r5 = r14.length
            r15.<init>(r5)
            int r5 = r14.length
            r7 = 0
        Le2:
            if (r7 >= r5) goto Lf2
            r22 = r0
            r0 = r14[r7]
            r1 = 1
            int r7 = p000.lz1.m3679(r0, r15, r7, r1)
            r1 = r23
            r0 = r22
            goto Le2
        Lf2:
            r22 = r0
            int r0 = r10.getModifiers()
            java.lang.reflect.Modifier.isStatic(r0)
            r20 = 0
            r21 = 62
            java.lang.String r16 = ","
            r17 = 0
            r18 = 0
            r19 = 0
            java.lang.String r0 = p000.AbstractC0984xh.m6644(r15, r16, r17, r18, r19, r20, r21)
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4138(r11, r6, r12, r4, r0)
            r0.append(r3)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            r8.put(r0, r10)
            r1 = r23
            r0 = r22
            r5 = 0
            r7 = 1
            goto Lb4
        L123:
            r1 = r23
            r5 = 0
            r7 = 1
            goto L6f
        L129:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L144
            int r0 = r8.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "reflection fallback hit, count="
            r1.<init>(r5)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            m1960(r0)
        L144:
            java.util.Collection r0 = r8.values()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r1 = p000.AbstractC0984xh.m6666(r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L15b
            p000.C0666ox.m4327(r2, r1)
            goto L15d
        L15b:
            jz r1 = p000.C0450jz.f5672
        L15d:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L169
            java.lang.String r0 = "no target methods resolved, allowDexKitScan=false"
            m1960(r0)
            return
        L169:
            java.util.Iterator r0 = r1.iterator()
        L16d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f9
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.String r2 = p000.lz1.m3694(r1)
            java.lang.String r5 = r1.getName()
            java.lang.String r7 = p000.lz1.m3690(r5, r1)
            java.lang.Class[] r8 = r1.getParameterTypes()
            r8.getClass()
            java.util.ArrayList r9 = new java.util.ArrayList
            int r10 = r8.length
            r9.<init>(r10)
            int r10 = r8.length
            r11 = 0
        L194:
            if (r11 >= r10) goto L19e
            r12 = r8[r11]
            r13 = 1
            int r11 = p000.lz1.m3679(r12, r9, r11, r13)
            goto L194
        L19e:
            int r8 = r1.getModifiers()
            java.lang.reflect.Modifier.isStatic(r8)
            r14 = 0
            r15 = 62
            java.lang.String r10 = ","
            r11 = 0
            r12 = 0
            r13 = 0
            java.lang.String r8 = p000.AbstractC0984xh.m6644(r9, r10, r11, r12, r13, r14, r15)
            java.lang.StringBuilder r2 = p000.AbstractC0602nx.m4138(r2, r6, r5, r4, r8)
            java.lang.String r2 = p000.lz1.m3691(r2, r3, r7)
            java.util.Set r5 = p000.C0261eu.f3670
            boolean r2 = r5.add(r2)
            if (r2 != 0) goto L1c4
            r8 = 0
            r13 = 1
            goto L16d
        L1c4:
            r13 = 1
            r1.setAccessible(r13)
            xq0 r2 = p000.xq0.f12253
            xe r5 = new xe
            r7 = 4
            r8 = 0
            r5.<init>(r1, r7, r8)
            r2.m6775(r1, r5)
            java.lang.Class r2 = r1.getDeclaringClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "hooked "
            r5.<init>(r7)
            r5.append(r2)
            r5.append(r6)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            m1960(r1)
            goto L16d
        L1f9:
            return
    }

    /* JADX INFO: renamed from: β */
    public static boolean m1959(java.lang.reflect.Method r4) {
            java.lang.Class r0 = r4.getReturnType()
            java.lang.Class r1 = java.lang.Void.TYPE
            boolean r0 = p000.ln0.m3626(r0, r1)
            r1 = 0
            if (r0 != 0) goto Le
            goto L30
        Le:
            java.lang.Class[] r0 = r4.getParameterTypes()
            int r0 = r0.length
            r2 = 1
            if (r0 == r2) goto L17
            goto L30
        L17:
            java.lang.Class[] r0 = r4.getParameterTypes()
            r0 = r0[r1]
            java.lang.Class r3 = java.lang.Integer.TYPE
            boolean r0 = p000.ln0.m3626(r0, r3)
            if (r0 != 0) goto L26
            goto L30
        L26:
            int r4 = r4.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isAbstract(r4)
            if (r4 == 0) goto L31
        L30:
            return r1
        L31:
            return r2
    }

    /* JADX INFO: renamed from: γ */
    public static void m1960(java.lang.String r1) {
            java.lang.String r0 = "rfbe541a4adc09a1c"
            p000.C0888ux.m5975(r0, r1)
            return
    }
}
