package a;

/* JADX INFO: loaded from: classes.dex */
public final class Pc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.Pc f211a = null;

    static {
            a.Pc r0 = new a.Pc
            r0.<init>()
            a.Pc.f211a = r0
            return
    }

    public static java.util.List a(java.lang.ClassLoader r5) {
            java.lang.String r0 = "classLoader"
            a.C0193i9.e(r5, r0)
            a.Y5 r0 = a.Y5.f351a
            r1 = 1
            java.lang.String r2 = "com.tencent.mm.ui.chatting.BaseChattingUIFragment"
            r3 = 0
            java.lang.Class r2 = java.lang.Class.forName(r2, r3, r5)     // Catch: java.lang.Throwable -> L25
            if (r2 != 0) goto L13
        L11:
            r2 = r0
            goto L2a
        L13:
            java.lang.String r3 = "onPause"
            r4 = 0
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch: java.lang.Throwable -> L25
            if (r2 != 0) goto L1d
            goto L11
        L1d:
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> L25
            java.util.List r2 = a.C0435w1.K(r2)     // Catch: java.lang.Throwable -> L25
            goto L2a
        L25:
            r2 = move-exception
            a.wd$a r2 = a.C0465xd.a(r2)
        L2a:
            java.lang.Throwable r3 = a.C0447wd.a(r2)
            if (r3 != 0) goto L32
            r0 = r2
            goto L47
        L32:
            java.lang.String r2 = r3.getMessage()
            java.lang.String r3 = "ReadReport: fragment locate failed: "
            java.lang.String r2 = a.C0487z.k(r3, r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r1)
            a.C0453x1.b(r2)
        L47:
            java.util.List r0 = (java.util.List) r0
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L5d
            java.lang.String r5 = "ReadReport: located read-report trigger via fragment lifecycle: com.tencent.mm.ui.chatting.BaseChattingUIFragment.onPause"
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r1)
            a.C0453x1.b(r5)
            return r0
        L5d:
            java.util.List r5 = b(r5)
            return r5
    }

    public static java.util.List b(java.lang.ClassLoader r16) {
            r1 = r16
            r2 = 1
            java.lang.String r0 = "updateUnreadByTalker"
            java.lang.String r3 = "classLoader"
            a.C0193i9.e(r1, r3)
            long r3 = java.lang.System.currentTimeMillis()
            r5 = 5000(0x1388, double:2.4703E-320)
            long r3 = r3 + r5
        L11:
            boolean r5 = a.C0435w1.H()
            a.Y5 r6 = a.Y5.f351a
            if (r5 != 0) goto L27
            long r7 = java.lang.System.currentTimeMillis()
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 >= 0) goto L27
            r7 = 50
            java.lang.Thread.sleep(r7)     // Catch: java.lang.InterruptedException -> L64
            goto L11
        L27:
            boolean r3 = a.C0435w1.H()
            if (r3 != 0) goto L3b
            java.lang.String r0 = "ReadReport: DkBridge not ready after 5000ms, storage-locate skipped"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            a.C0453x1.b(r0)
            return r6
        L3b:
            r3 = 0
            java.util.List r0 = a.C0435w1.r(r0, r3)     // Catch: java.lang.Throwable -> L41
            goto L46
        L41:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        L46:
            java.lang.Throwable r4 = a.C0447wd.a(r0)
            if (r4 != 0) goto L4d
            goto L4e
        L4d:
            r0 = r6
        L4e:
            r4 = r0
            java.util.List r4 = (java.util.List) r4
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L65
            java.lang.String r0 = "ReadReport: no class references updateUnreadByTalker (class-level match missed)"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            a.C0453x1.b(r0)
        L64:
            return r6
        L65:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r4.iterator()
        L6e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L133
            java.lang.Object r0 = r6.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r7 = "com.tencent.mm.storage"
            r8 = 0
            boolean r7 = a.Ae.H(r0, r7, r8)
            if (r7 == 0) goto L6e
            java.lang.Class r7 = java.lang.Class.forName(r0, r8, r1)     // Catch: java.lang.Throwable -> Lec
            if (r7 != 0) goto L8b
            goto L12a
        L8b:
            java.util.List r9 = a.C0435w1.y(r0)     // Catch: java.lang.Throwable -> Lec
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> Lec
        L93:
            boolean r10 = r9.hasNext()     // Catch: java.lang.Throwable -> Lec
            if (r10 == 0) goto L12a
            java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> Lec
            a.lb r10 = (a.C0248lb) r10     // Catch: java.lang.Throwable -> Lec
            java.lang.reflect.Method[] r11 = r7.getDeclaredMethods()     // Catch: java.lang.Throwable -> Lec
            java.lang.String r12 = "getDeclaredMethods(...)"
            a.C0193i9.d(r11, r12)     // Catch: java.lang.Throwable -> Lec
            int r12 = r11.length     // Catch: java.lang.Throwable -> Lec
            r13 = r8
        Laa:
            if (r13 >= r12) goto Lf1
            r14 = r11[r13]     // Catch: java.lang.Throwable -> Lec
            java.lang.String r15 = r14.getName()     // Catch: java.lang.Throwable -> Lec
            a.f5 r3 = r10.b()     // Catch: java.lang.Throwable -> Lec
            java.lang.String r3 = r3.b     // Catch: java.lang.Throwable -> Lec
            boolean r3 = a.C0193i9.a(r15, r3)     // Catch: java.lang.Throwable -> Lec
            if (r3 == 0) goto Lee
            java.lang.Class[] r3 = r14.getParameterTypes()     // Catch: java.lang.Throwable -> Lec
            int r3 = r3.length     // Catch: java.lang.Throwable -> Lec
            if (r3 != r2) goto Lee
            java.lang.Class[] r3 = r14.getParameterTypes()     // Catch: java.lang.Throwable -> Lec
            r3 = r3[r8]     // Catch: java.lang.Throwable -> Lec
            java.lang.Class<java.lang.String> r15 = java.lang.String.class
            boolean r3 = a.C0193i9.a(r3, r15)     // Catch: java.lang.Throwable -> Lec
            if (r3 == 0) goto Lee
            java.lang.Class r3 = r14.getReturnType()     // Catch: java.lang.Throwable -> Lec
            java.lang.Class r15 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> Lec
            boolean r3 = a.C0193i9.a(r3, r15)     // Catch: java.lang.Throwable -> Lec
            if (r3 != 0) goto Lf2
            java.lang.Class r3 = r14.getReturnType()     // Catch: java.lang.Throwable -> Lec
            java.lang.Class r15 = java.lang.Void.TYPE     // Catch: java.lang.Throwable -> Lec
            boolean r3 = a.C0193i9.a(r3, r15)     // Catch: java.lang.Throwable -> Lec
            if (r3 == 0) goto Lee
            goto Lf2
        Lec:
            r0 = move-exception
            goto L12f
        Lee:
            int r13 = r13 + r2
            r3 = 0
            goto Laa
        Lf1:
            r14 = 0
        Lf2:
            if (r14 != 0) goto Lf6
        Lf4:
            r3 = 0
            goto L93
        Lf6:
            r14.setAccessible(r2)     // Catch: java.lang.Throwable -> Lec
            r5.add(r14)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r3 = r14.getName()     // Catch: java.lang.Throwable -> Lec
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lec
            r10.<init>()     // Catch: java.lang.Throwable -> Lec
            java.lang.String r11 = "ReadReport: located clear-unread trigger "
            r10.append(r11)     // Catch: java.lang.Throwable -> Lec
            r10.append(r0)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r11 = "."
            r10.append(r11)     // Catch: java.lang.Throwable -> Lec
            r10.append(r3)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r3 = "(String)"
            r10.append(r3)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r3 = r10.toString()     // Catch: java.lang.Throwable -> Lec
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> Lec
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r2)     // Catch: java.lang.Throwable -> Lec
            a.C0453x1.b(r3)     // Catch: java.lang.Throwable -> Lec
            goto Lf4
        L12a:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> Lec
        L12c:
            r3 = 0
            goto L6e
        L12f:
            a.C0465xd.a(r0)
            goto L12c
        L133:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L150
            int r0 = r4.size()
            java.lang.String r1 = "ReadReport: no clear-unread trigger found ("
            java.lang.String r3 = " class hits rejected)"
            java.lang.String r0 = a.C0487z.c(r0, r1, r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            a.C0453x1.b(r0)
        L150:
            return r5
    }
}
