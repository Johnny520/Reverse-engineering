package p000;

/* JADX INFO: renamed from: q8 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0715q8 implements p000.InterfaceC0631op, p000.InterfaceC0220dq, java.io.Serializable {

    /* JADX INFO: renamed from: ε */
    public final p000.InterfaceC0631op f8903;

    public AbstractC0715q8(p000.InterfaceC0631op r1) {
            r0 = this;
            r0.<init>()
            r0.f8903 = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Continuation at "
            r0.<init>(r1)
            java.lang.StackTraceElement r1 = r2.mo3877()
            if (r1 != 0) goto L15
            java.lang.Class r2 = r2.getClass()
            java.lang.String r1 = r2.getName()
        L15:
            r0.append(r1)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: β */
    public p000.InterfaceC0220dq mo71() {
            r1 = this;
            op r1 = r1.f8903
            boolean r0 = r1 instanceof p000.InterfaceC0220dq
            if (r0 == 0) goto L9
            dq r1 = (p000.InterfaceC0220dq) r1
            return r1
        L9:
            r1 = 0
            return r1
    }

    @Override // p000.InterfaceC0631op
    /* JADX INFO: renamed from: ζ */
    public final void mo75(java.lang.Object r3) {
            r2 = this;
        L0:
            q8 r2 = (p000.AbstractC0715q8) r2
            op r0 = r2.f8903
            r0.getClass()
            java.lang.Object r3 = r2.mo11(r3)     // Catch: java.lang.Throwable -> L10
            cq r1 = p000.EnumC0184cq.f2716     // Catch: java.lang.Throwable -> L10
            if (r3 != r1) goto L17
            return
        L10:
            r3 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r3)
            r3 = r1
        L17:
            r2.mo4562()
            boolean r2 = r0 instanceof p000.AbstractC0715q8
            if (r2 == 0) goto L20
            r2 = r0
            goto L0
        L20:
            r0.mo75(r3)
            return
    }

    /* JADX INFO: renamed from: η */
    public p000.InterfaceC0631op mo1119(p000.InterfaceC0631op r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "create(Any?;Continuation) has not been overridden"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: θ */
    public java.lang.StackTraceElement mo3877() {
            r8 = this;
            java.lang.Class r0 = r8.getClass()
            java.lang.Class<wq> r1 = p000.InterfaceC0956wq.class
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
            wq r0 = (p000.InterfaceC0956wq) r0
            r1 = 0
            if (r0 != 0) goto L10
            return r1
        L10:
            int r2 = r0.m6405v()
            r3 = 1
            if (r2 > r3) goto Le8
            r2 = -1
            java.lang.Class r4 = r8.getClass()     // Catch: java.lang.Exception -> L3b
            java.lang.String r5 = "label"
            java.lang.reflect.Field r4 = r4.getDeclaredField(r5)     // Catch: java.lang.Exception -> L3b
            r4.setAccessible(r3)     // Catch: java.lang.Exception -> L3b
            java.lang.Object r4 = r4.get(r8)     // Catch: java.lang.Exception -> L3b
            boolean r5 = r4 instanceof java.lang.Integer     // Catch: java.lang.Exception -> L3b
            if (r5 == 0) goto L30
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Exception -> L3b
            goto L31
        L30:
            r4 = r1
        L31:
            if (r4 == 0) goto L38
            int r4 = r4.intValue()     // Catch: java.lang.Exception -> L3b
            goto L39
        L38:
            r4 = 0
        L39:
            int r4 = r4 - r3
            goto L3c
        L3b:
            r4 = r2
        L3c:
            if (r4 >= 0) goto L3f
            goto L45
        L3f:
            int[] r2 = r0.m6403l()
            r2 = r2[r4]
        L45:
            m6 r3 = p000.pd2.f8521
            m6 r4 = p000.pd2.f8522
            if (r4 != 0) goto L87
            java.lang.Class<java.lang.Class> r4 = java.lang.Class.class
            java.lang.String r5 = "getModule"
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r5, r1)     // Catch: java.lang.Exception -> L84
            java.lang.Class r5 = r8.getClass()     // Catch: java.lang.Exception -> L84
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch: java.lang.Exception -> L84
            java.lang.String r6 = "java.lang.Module"
            java.lang.Class r5 = r5.loadClass(r6)     // Catch: java.lang.Exception -> L84
            java.lang.String r6 = "getDescriptor"
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r6, r1)     // Catch: java.lang.Exception -> L84
            java.lang.Class r6 = r8.getClass()     // Catch: java.lang.Exception -> L84
            java.lang.ClassLoader r6 = r6.getClassLoader()     // Catch: java.lang.Exception -> L84
            java.lang.String r7 = "java.lang.module.ModuleDescriptor"
            java.lang.Class r6 = r6.loadClass(r7)     // Catch: java.lang.Exception -> L84
            java.lang.String r7 = "name"
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r7, r1)     // Catch: java.lang.Exception -> L84
            m6 r7 = new m6     // Catch: java.lang.Exception -> L84
            r7.<init>(r4, r5, r6)     // Catch: java.lang.Exception -> L84
            p000.pd2.f8522 = r7     // Catch: java.lang.Exception -> L84
            r4 = r7
            goto L87
        L84:
            p000.pd2.f8522 = r3
            r4 = r3
        L87:
            if (r4 != r3) goto L8a
            goto Lbb
        L8a:
            java.lang.Object r3 = r4.f6967
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto Lbb
            java.lang.Class r8 = r8.getClass()
            java.lang.Object r8 = r3.invoke(r8, r1)
            if (r8 != 0) goto L9b
            goto Lbb
        L9b:
            java.lang.Object r3 = r4.f6968
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto Lbb
            java.lang.Object r8 = r3.invoke(r8, r1)
            if (r8 != 0) goto La8
            goto Lbb
        La8:
            java.lang.Object r3 = r4.f6969
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto Lb3
            java.lang.Object r8 = r3.invoke(r8, r1)
            goto Lb4
        Lb3:
            r8 = r1
        Lb4:
            boolean r3 = r8 instanceof java.lang.String
            if (r3 == 0) goto Lbb
            r1 = r8
            java.lang.String r1 = (java.lang.String) r1
        Lbb:
            if (r1 != 0) goto Lc2
            java.lang.String r8 = r0.m6401c()
            goto Lda
        Lc2:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r1)
            r1 = 47
            r8.append(r1)
            java.lang.String r1 = r0.m6401c()
            r8.append(r1)
            java.lang.String r8 = r8.toString()
        Lda:
            java.lang.StackTraceElement r1 = new java.lang.StackTraceElement
            java.lang.String r3 = r0.m6404m()
            java.lang.String r0 = r0.m6402f()
            r1.<init>(r8, r3, r0, r2)
            return r1
        Le8:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Debug metadata version mismatch. Expected: 1, got "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = ". Please update the Kotlin standard library."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
    }

    /* JADX INFO: renamed from: κ */
    public abstract java.lang.Object mo11(java.lang.Object r1);

    /* JADX INFO: renamed from: λ */
    public void mo4562() {
            r0 = this;
            return
    }
}
