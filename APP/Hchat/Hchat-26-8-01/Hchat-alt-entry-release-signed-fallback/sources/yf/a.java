package yf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements wf.c, yf.d, java.io.Serializable {
    private final wf.c completion;

    public a(wf.c r1) {
            r0 = this;
            r0.<init>()
            r0.completion = r1
            return
    }

    public wf.c create(java.lang.Object r1, wf.c r2) {
            r0 = this;
            r2.getClass()
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "create(Any?;Continuation) has not been overridden"
            r1.<init>(r2)
            throw r1
    }

    public wf.c create(wf.c r2) {
            r1 = this;
            r2.getClass()
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "create(Continuation) has not been overridden"
            r2.<init>(r0)
            throw r2
    }

    public yf.d getCallerFrame() {
            r2 = this;
            wf.c r0 = r2.completion
            boolean r1 = r0 instanceof yf.d
            if (r1 == 0) goto L9
            yf.d r0 = (yf.d) r0
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final wf.c getCompletion() {
            r1 = this;
            wf.c r0 = r1.completion
            return r0
    }

    public java.lang.StackTraceElement getStackTraceElement() {
            r8 = this;
            java.lang.Class r0 = r8.getClass()
            java.lang.Class<yf.e> r1 = yf.e.class
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
            yf.e r0 = (yf.e) r0
            r1 = 0
            if (r0 != 0) goto L10
            goto L17
        L10:
            int r2 = r0.v()
            r3 = 1
            if (r2 >= r3) goto L18
        L17:
            return r1
        L18:
            r2 = -1
            java.lang.Class r4 = r8.getClass()     // Catch: java.lang.Exception -> L3c
            java.lang.String r5 = "label"
            java.lang.reflect.Field r4 = r4.getDeclaredField(r5)     // Catch: java.lang.Exception -> L3c
            r4.setAccessible(r3)     // Catch: java.lang.Exception -> L3c
            java.lang.Object r4 = r4.get(r8)     // Catch: java.lang.Exception -> L3c
            boolean r5 = r4 instanceof java.lang.Integer     // Catch: java.lang.Exception -> L3c
            if (r5 == 0) goto L31
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Exception -> L3c
            goto L32
        L31:
            r4 = r1
        L32:
            if (r4 == 0) goto L39
            int r4 = r4.intValue()     // Catch: java.lang.Exception -> L3c
            goto L3a
        L39:
            r4 = 0
        L3a:
            int r4 = r4 - r3
            goto L3d
        L3c:
            r4 = r2
        L3d:
            if (r4 >= 0) goto L40
            goto L46
        L40:
            int[] r2 = r0.l()
            r2 = r2[r4]
        L46:
            xe.l r3 = yf.f.f22438b
            xe.l r4 = yf.f.f22437a
            if (r3 != 0) goto L88
            java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
            java.lang.String r5 = "getModule"
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r5, r1)     // Catch: java.lang.Exception -> L85
            java.lang.Class r5 = r8.getClass()     // Catch: java.lang.Exception -> L85
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch: java.lang.Exception -> L85
            java.lang.String r6 = "java.lang.Module"
            java.lang.Class r5 = r5.loadClass(r6)     // Catch: java.lang.Exception -> L85
            java.lang.String r6 = "getDescriptor"
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r6, r1)     // Catch: java.lang.Exception -> L85
            java.lang.Class r6 = r8.getClass()     // Catch: java.lang.Exception -> L85
            java.lang.ClassLoader r6 = r6.getClassLoader()     // Catch: java.lang.Exception -> L85
            java.lang.String r7 = "java.lang.module.ModuleDescriptor"
            java.lang.Class r6 = r6.loadClass(r7)     // Catch: java.lang.Exception -> L85
            java.lang.String r7 = "name"
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r7, r1)     // Catch: java.lang.Exception -> L85
            xe.l r7 = new xe.l     // Catch: java.lang.Exception -> L85
            r7.<init>(r3, r5, r6)     // Catch: java.lang.Exception -> L85
            yf.f.f22438b = r7     // Catch: java.lang.Exception -> L85
            r3 = r7
            goto L88
        L85:
            yf.f.f22438b = r4
            r3 = r4
        L88:
            if (r3 != r4) goto L8b
            goto Lbc
        L8b:
            java.lang.Object r4 = r3.f21569b
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            if (r4 == 0) goto Lbc
            java.lang.Class r5 = r8.getClass()
            java.lang.Object r4 = r4.invoke(r5, r1)
            if (r4 != 0) goto L9c
            goto Lbc
        L9c:
            java.lang.Object r5 = r3.f21570c
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            if (r5 == 0) goto Lbc
            java.lang.Object r4 = r5.invoke(r4, r1)
            if (r4 != 0) goto La9
            goto Lbc
        La9:
            java.lang.Object r3 = r3.f21568a
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto Lb4
            java.lang.Object r3 = r3.invoke(r4, r1)
            goto Lb5
        Lb4:
            r3 = r1
        Lb5:
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto Lbc
            r1 = r3
            java.lang.String r1 = (java.lang.String) r1
        Lbc:
            if (r1 != 0) goto Lc3
            java.lang.String r1 = r0.c()
            goto Ldb
        Lc3:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r1 = 47
            r3.append(r1)
            java.lang.String r1 = r0.c()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
        Ldb:
            java.lang.StackTraceElement r3 = new java.lang.StackTraceElement
            java.lang.String r4 = r0.m()
            java.lang.String r0 = r0.f()
            r3.<init>(r1, r4, r0, r2)
            return r3
    }

    public abstract java.lang.Object invokeSuspend(java.lang.Object r1);

    public void releaseIntercepted() {
            r0 = this;
            return
    }

    @Override // wf.c
    public final void resumeWith(java.lang.Object r4) {
            r3 = this;
            r0 = r3
        L1:
            yf.a r0 = (yf.a) r0
            wf.c r1 = r0.completion
            r1.getClass()
            java.lang.Object r4 = r0.invokeSuspend(r4)     // Catch: java.lang.Throwable -> L11
            xf.a r2 = xf.a.f21579g     // Catch: java.lang.Throwable -> L11
            if (r4 != r2) goto L18
            return
        L11:
            r4 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r4)
            r4 = r2
        L18:
            r0.releaseIntercepted()
            boolean r0 = r1 instanceof yf.a
            if (r0 == 0) goto L21
            r0 = r1
            goto L1
        L21:
            r1.resumeWith(r4)
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Continuation at "
            r0.<init>(r1)
            java.lang.StackTraceElement r1 = r2.getStackTraceElement()
            if (r1 != 0) goto L15
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getName()
        L15:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
