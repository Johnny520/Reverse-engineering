package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class W1 implements a.InterfaceC0042a4<java.lang.Object>, java.io.Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.InterfaceC0042a4<java.lang.Object> f313a;

    public W1(a.InterfaceC0042a4<java.lang.Object> r1) {
            r0 = this;
            r0.<init>()
            r0.f313a = r1
            return
    }

    @Override // a.InterfaceC0042a4
    public final void d(java.lang.Object r4) {
            r3 = this;
            r0 = r3
        L1:
            a.W1 r0 = (a.W1) r0
            a.a4<java.lang.Object> r1 = r0.f313a
            a.C0193i9.b(r1)
            java.lang.Object r4 = r0.h(r4)     // Catch: java.lang.Throwable -> L11
            a.y4 r2 = a.EnumC0474y4.f767a     // Catch: java.lang.Throwable -> L11
            if (r4 != r2) goto L16
            return
        L11:
            r4 = move-exception
            a.wd$a r4 = a.C0465xd.a(r4)
        L16:
            r0.i()
            boolean r0 = r1 instanceof a.W1
            if (r0 == 0) goto L1f
            r0 = r1
            goto L1
        L1f:
            r1.d(r4)
            return
    }

    public a.InterfaceC0042a4<a.Wf> g(java.lang.Object r1, a.InterfaceC0042a4<?> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "create(Any?;Continuation) has not been overridden"
            r1.<init>(r2)
            throw r1
    }

    public abstract java.lang.Object h(java.lang.Object r1);

    public void i() {
            r0 = this;
            return
    }

    public java.lang.String toString() {
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Continuation at "
            r0.<init>(r1)
            java.lang.Class r1 = r9.getClass()
            java.lang.Class<a.L4> r2 = a.L4.class
            java.lang.annotation.Annotation r1 = r1.getAnnotation(r2)
            a.L4 r1 = (a.L4) r1
            r2 = 0
            if (r1 != 0) goto L18
            goto Lea
        L18:
            int r3 = r1.v()
            r4 = 1
            if (r3 > r4) goto Lfd
            r3 = -1
            java.lang.Class r5 = r9.getClass()     // Catch: java.lang.Exception -> L43
            java.lang.String r6 = "label"
            java.lang.reflect.Field r5 = r5.getDeclaredField(r6)     // Catch: java.lang.Exception -> L43
            r5.setAccessible(r4)     // Catch: java.lang.Exception -> L43
            java.lang.Object r5 = r5.get(r9)     // Catch: java.lang.Exception -> L43
            boolean r6 = r5 instanceof java.lang.Integer     // Catch: java.lang.Exception -> L43
            if (r6 == 0) goto L38
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Exception -> L43
            goto L39
        L38:
            r5 = r2
        L39:
            if (r5 == 0) goto L40
            int r5 = r5.intValue()     // Catch: java.lang.Exception -> L43
            goto L41
        L40:
            r5 = 0
        L41:
            int r5 = r5 - r4
            goto L44
        L43:
            r5 = r3
        L44:
            if (r5 >= 0) goto L47
            goto L4d
        L47:
            int[] r3 = r1.l()
            r3 = r3[r5]
        L4d:
            a.sb$a r4 = a.C0373sb.b
            a.sb$a r5 = a.C0373sb.f685a
            if (r4 != 0) goto L8f
            java.lang.Class<java.lang.Class> r4 = java.lang.Class.class
            java.lang.String r6 = "getModule"
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r6, r2)     // Catch: java.lang.Exception -> L8c
            java.lang.Class r6 = r9.getClass()     // Catch: java.lang.Exception -> L8c
            java.lang.ClassLoader r6 = r6.getClassLoader()     // Catch: java.lang.Exception -> L8c
            java.lang.String r7 = "java.lang.Module"
            java.lang.Class r6 = r6.loadClass(r7)     // Catch: java.lang.Exception -> L8c
            java.lang.String r7 = "getDescriptor"
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r7, r2)     // Catch: java.lang.Exception -> L8c
            java.lang.Class r7 = r9.getClass()     // Catch: java.lang.Exception -> L8c
            java.lang.ClassLoader r7 = r7.getClassLoader()     // Catch: java.lang.Exception -> L8c
            java.lang.String r8 = "java.lang.module.ModuleDescriptor"
            java.lang.Class r7 = r7.loadClass(r8)     // Catch: java.lang.Exception -> L8c
            java.lang.String r8 = "name"
            java.lang.reflect.Method r7 = r7.getDeclaredMethod(r8, r2)     // Catch: java.lang.Exception -> L8c
            a.sb$a r8 = new a.sb$a     // Catch: java.lang.Exception -> L8c
            r8.<init>(r4, r6, r7)     // Catch: java.lang.Exception -> L8c
            a.C0373sb.b = r8     // Catch: java.lang.Exception -> L8c
            r4 = r8
            goto L8f
        L8c:
            a.C0373sb.b = r5
            r4 = r5
        L8f:
            if (r4 != r5) goto L92
            goto Lbd
        L92:
            java.lang.reflect.Method r5 = r4.f686a
            if (r5 == 0) goto Lbd
            java.lang.Class r6 = r9.getClass()
            java.lang.Object r5 = r5.invoke(r6, r2)
            if (r5 != 0) goto La1
            goto Lbd
        La1:
            java.lang.reflect.Method r6 = r4.b
            if (r6 == 0) goto Lbd
            java.lang.Object r5 = r6.invoke(r5, r2)
            if (r5 != 0) goto Lac
            goto Lbd
        Lac:
            java.lang.reflect.Method r4 = r4.c
            if (r4 == 0) goto Lb5
            java.lang.Object r4 = r4.invoke(r5, r2)
            goto Lb6
        Lb5:
            r4 = r2
        Lb6:
            boolean r5 = r4 instanceof java.lang.String
            if (r5 == 0) goto Lbd
            r2 = r4
            java.lang.String r2 = (java.lang.String) r2
        Lbd:
            if (r2 != 0) goto Lc4
            java.lang.String r2 = r1.c()
            goto Ldc
        Lc4:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r2 = 47
            r4.append(r2)
            java.lang.String r2 = r1.c()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
        Ldc:
            java.lang.StackTraceElement r4 = new java.lang.StackTraceElement
            java.lang.String r5 = r1.m()
            java.lang.String r1 = r1.f()
            r4.<init>(r2, r5, r1, r3)
            r2 = r4
        Lea:
            if (r2 == 0) goto Led
            goto Lf5
        Led:
            java.lang.Class r1 = r9.getClass()
            java.lang.String r2 = r1.getName()
        Lf5:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        Lfd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Debug metadata version mismatch. Expected: 1, got "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r2 = ". Please update the Kotlin standard library."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
