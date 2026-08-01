package xhss;

/* JADX INFO: renamed from: xhss.ᛷᛲᛳᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0631 implements xhss.InterfaceC0038, xhss.InterfaceC0108, java.io.Serializable {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.InterfaceC0038 f2171;

    public AbstractC0631(xhss.InterfaceC0038 r1) {
            r0 = this;
            r0.<init>()
            r0.f2171 = r1
            return
    }

    public java.lang.String toString() {
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Continuation at "
            r0.<init>(r1)
            java.lang.Class r1 = r9.getClass()
            java.lang.Class<xhss.ᛷᛳᛲᲀ> r2 = xhss.InterfaceC0636.class
            java.lang.annotation.Annotation r1 = r1.getAnnotation(r2)
            xhss.ᛷᛳᛲᲀ r1 = (xhss.InterfaceC0636) r1
            r2 = 0
            if (r1 != 0) goto L18
            goto Lef
        L18:
            int r3 = r1.v()
            r4 = 1
            if (r3 >= r4) goto L21
            goto Lef
        L21:
            r3 = -1
            java.lang.Class r5 = r9.getClass()     // Catch: java.lang.Exception -> L45
            java.lang.String r6 = "label"
            java.lang.reflect.Field r5 = r5.getDeclaredField(r6)     // Catch: java.lang.Exception -> L45
            r5.setAccessible(r4)     // Catch: java.lang.Exception -> L45
            java.lang.Object r5 = r5.get(r9)     // Catch: java.lang.Exception -> L45
            boolean r6 = r5 instanceof java.lang.Integer     // Catch: java.lang.Exception -> L45
            if (r6 == 0) goto L3a
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Exception -> L45
            goto L3b
        L3a:
            r5 = r2
        L3b:
            if (r5 == 0) goto L42
            int r5 = r5.intValue()     // Catch: java.lang.Exception -> L45
            goto L43
        L42:
            r5 = 0
        L43:
            int r5 = r5 - r4
            goto L46
        L45:
            r5 = r3
        L46:
            if (r5 >= 0) goto L49
            goto L4f
        L49:
            int[] r3 = r1.l()
            r3 = r3[r5]
        L4f:
            xhss.ᛷᛱᛳᲁ r4 = xhss.AbstractC0955.f3098
            xhss.ᛷᛱᛳᲁ r5 = xhss.AbstractC0955.f3101
            if (r5 != 0) goto L91
            java.lang.Class<java.lang.Class> r5 = java.lang.Class.class
            java.lang.String r6 = "getModule"
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r6, r2)     // Catch: java.lang.Exception -> L8e
            java.lang.Class r6 = r9.getClass()     // Catch: java.lang.Exception -> L8e
            java.lang.ClassLoader r6 = r6.getClassLoader()     // Catch: java.lang.Exception -> L8e
            java.lang.String r7 = "java.lang.Module"
            java.lang.Class r6 = r6.loadClass(r7)     // Catch: java.lang.Exception -> L8e
            java.lang.String r7 = "getDescriptor"
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r7, r2)     // Catch: java.lang.Exception -> L8e
            java.lang.Class r7 = r9.getClass()     // Catch: java.lang.Exception -> L8e
            java.lang.ClassLoader r7 = r7.getClassLoader()     // Catch: java.lang.Exception -> L8e
            java.lang.String r8 = "java.lang.module.ModuleDescriptor"
            java.lang.Class r7 = r7.loadClass(r8)     // Catch: java.lang.Exception -> L8e
            java.lang.String r8 = "name"
            java.lang.reflect.Method r7 = r7.getDeclaredMethod(r8, r2)     // Catch: java.lang.Exception -> L8e
            xhss.ᛷᛱᛳᲁ r8 = new xhss.ᛷᛱᛳᲁ     // Catch: java.lang.Exception -> L8e
            r8.<init>(r5, r6, r7)     // Catch: java.lang.Exception -> L8e
            xhss.AbstractC0955.f3101 = r8     // Catch: java.lang.Exception -> L8e
            r5 = r8
            goto L91
        L8e:
            xhss.AbstractC0955.f3101 = r4
            r5 = r4
        L91:
            if (r5 != r4) goto L94
            goto Lc5
        L94:
            java.lang.Object r4 = r5.f2151
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            if (r4 == 0) goto Lc5
            java.lang.Class r6 = r9.getClass()
            java.lang.Object r4 = r4.invoke(r6, r2)
            if (r4 != 0) goto La5
            goto Lc5
        La5:
            java.lang.Object r6 = r5.f2153
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r6 == 0) goto Lc5
            java.lang.Object r4 = r6.invoke(r4, r2)
            if (r4 != 0) goto Lb2
            goto Lc5
        Lb2:
            java.lang.Object r5 = r5.f2152
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            if (r5 == 0) goto Lbd
            java.lang.Object r4 = r5.invoke(r4, r2)
            goto Lbe
        Lbd:
            r4 = r2
        Lbe:
            boolean r5 = r4 instanceof java.lang.String
            if (r5 == 0) goto Lc5
            r2 = r4
            java.lang.String r2 = (java.lang.String) r2
        Lc5:
            if (r2 != 0) goto Lcc
            java.lang.String r2 = r1.c()
            goto Le1
        Lcc:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            r2 = 47
            r4.append(r2)
            java.lang.String r2 = r1.c()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
        Le1:
            java.lang.StackTraceElement r4 = new java.lang.StackTraceElement
            java.lang.String r5 = r1.m()
            java.lang.String r1 = r1.f()
            r4.<init>(r2, r5, r1, r3)
            r2 = r4
        Lef:
            if (r2 != 0) goto Lf9
            java.lang.Class r9 = r9.getClass()
            java.lang.String r2 = r9.getName()
        Lf9:
            r0.append(r2)
            java.lang.String r9 = r0.toString()
            return r9
    }

    @Override // xhss.InterfaceC0108
    /* JADX INFO: renamed from: ᛷᛴᛷᛱ */
    public final xhss.InterfaceC0108 mo296() {
            r1 = this;
            xhss.ᛱᛴᛶᛴ r1 = r1.f2171
            boolean r0 = r1 instanceof xhss.InterfaceC0108
            if (r0 == 0) goto L9
            xhss.ᛱᲇᲀᛷ r1 = (xhss.InterfaceC0108) r1
            return r1
        L9:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ */
    public abstract java.lang.Object mo116(java.lang.Object r1);

    @Override // xhss.InterfaceC0038
    /* JADX INFO: renamed from: ᛸᛴᛶᛳ */
    public final void mo152(java.lang.Object r3) {
            r2 = this;
        L0:
            xhss.ᛷᛲᛳᛴ r2 = (xhss.AbstractC0631) r2
            xhss.ᛱᛴᛶᛴ r0 = r2.f2171
            java.lang.Object r3 = r2.mo116(r3)     // Catch: java.lang.Throwable -> Ld
            xhss.ᛸᛴᛸᲈ r1 = xhss.EnumC0757.f2533     // Catch: java.lang.Throwable -> Ld
            if (r3 != r1) goto L14
            return
        Ld:
            r3 = move-exception
            xhss.ᲈᛳᛱᲇ r1 = new xhss.ᲈᛳᛱᲇ
            r1.<init>(r3)
            r3 = r1
        L14:
            r2.mo1103()
            boolean r2 = r0 instanceof xhss.AbstractC0631
            if (r2 == 0) goto L1d
            r2 = r0
            goto L0
        L1d:
            r0.mo152(r3)
            return
    }

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public void mo1103() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ */
    public xhss.InterfaceC0038 mo117(java.lang.Object r1, xhss.InterfaceC0038 r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "create(Any?;Continuation) has not been overridden"
            r0.<init>(r1)
            throw r0
    }
}
