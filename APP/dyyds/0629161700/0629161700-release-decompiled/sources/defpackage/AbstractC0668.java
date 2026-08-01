package defpackage;

/* JADX INFO: renamed from: ᛴᛴᲈᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0668 implements defpackage.InterfaceC0140, defpackage.InterfaceC1735, java.io.Serializable {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC0140 f3238;

    public AbstractC0668(defpackage.InterfaceC0140 r1) {
            r0 = this;
            r0.<init>()
            r0.f3238 = r1
            return
    }

    public java.lang.String toString() {
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Continuation at "
            r0.<init>(r1)
            java.lang.Class r1 = r10.getClass()
            java.lang.Class<ᛷᲇᛶᛷ> r2 = defpackage.InterfaceC1385.class
            java.lang.annotation.Annotation r1 = r1.getAnnotation(r2)
            ᛷᲇᛶᛷ r1 = (defpackage.InterfaceC1385) r1
            r2 = 0
            if (r1 != 0) goto L18
            goto Lf1
        L18:
            int r3 = r1.v()
            r4 = 1
            if (r3 >= r4) goto L21
            goto Lf1
        L21:
            r3 = -1
            java.lang.Class r5 = r10.getClass()     // Catch: java.lang.Exception -> L45
            java.lang.String r6 = "label"
            java.lang.reflect.Field r5 = r5.getDeclaredField(r6)     // Catch: java.lang.Exception -> L45
            r5.setAccessible(r4)     // Catch: java.lang.Exception -> L45
            java.lang.Object r5 = r5.get(r10)     // Catch: java.lang.Exception -> L45
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
            ᛷᛸᛱᛸ r4 = defpackage.AbstractC0397.f2037
            ᛷᛸᛱᛸ r5 = defpackage.AbstractC0397.f2036
            if (r5 != 0) goto L93
            java.lang.Class<java.lang.Class> r5 = java.lang.Class.class
            java.lang.String r6 = "getModule"
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r6, r2)     // Catch: java.lang.Exception -> L90
            java.lang.Class r6 = r10.getClass()     // Catch: java.lang.Exception -> L90
            java.lang.ClassLoader r6 = r6.getClassLoader()     // Catch: java.lang.Exception -> L90
            java.lang.String r7 = "java.lang.Module"
            java.lang.Class r6 = r6.loadClass(r7)     // Catch: java.lang.Exception -> L90
            java.lang.String r7 = "getDescriptor"
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r7, r2)     // Catch: java.lang.Exception -> L90
            java.lang.Class r7 = r10.getClass()     // Catch: java.lang.Exception -> L90
            java.lang.ClassLoader r7 = r7.getClassLoader()     // Catch: java.lang.Exception -> L90
            java.lang.String r8 = "java.lang.module.ModuleDescriptor"
            java.lang.Class r7 = r7.loadClass(r8)     // Catch: java.lang.Exception -> L90
            java.lang.String r8 = "name"
            java.lang.reflect.Method r7 = r7.getDeclaredMethod(r8, r2)     // Catch: java.lang.Exception -> L90
            ᛷᛸᛱᛸ r8 = new ᛷᛸᛱᛸ     // Catch: java.lang.Exception -> L90
            r9 = 21
            r8.<init>(r5, r6, r7, r9)     // Catch: java.lang.Exception -> L90
            defpackage.AbstractC0397.f2036 = r8     // Catch: java.lang.Exception -> L90
            r5 = r8
            goto L93
        L90:
            defpackage.AbstractC0397.f2036 = r4
            r5 = r4
        L93:
            if (r5 != r4) goto L96
            goto Lc7
        L96:
            java.lang.Object r4 = r5.f5856
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            if (r4 == 0) goto Lc7
            java.lang.Class r6 = r10.getClass()
            java.lang.Object r4 = r4.invoke(r6, r2)
            if (r4 != 0) goto La7
            goto Lc7
        La7:
            java.lang.Object r6 = r5.f5857
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r6 == 0) goto Lc7
            java.lang.Object r4 = r6.invoke(r4, r2)
            if (r4 != 0) goto Lb4
            goto Lc7
        Lb4:
            java.lang.Object r5 = r5.f5859
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            if (r5 == 0) goto Lbf
            java.lang.Object r4 = r5.invoke(r4, r2)
            goto Lc0
        Lbf:
            r4 = r2
        Lc0:
            boolean r5 = r4 instanceof java.lang.String
            if (r5 == 0) goto Lc7
            r2 = r4
            java.lang.String r2 = (java.lang.String) r2
        Lc7:
            if (r2 != 0) goto Lce
            java.lang.String r2 = r1.c()
            goto Le3
        Lce:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            r2 = 47
            r4.append(r2)
            java.lang.String r2 = r1.c()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
        Le3:
            java.lang.StackTraceElement r4 = new java.lang.StackTraceElement
            java.lang.String r5 = r1.m()
            java.lang.String r1 = r1.f()
            r4.<init>(r2, r5, r1, r3)
            r2 = r4
        Lf1:
            if (r2 != 0) goto Lfb
            java.lang.Class r10 = r10.getClass()
            java.lang.String r2 = r10.getName()
        Lfb:
            r0.append(r2)
            java.lang.String r10 = r0.toString()
            return r10
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public defpackage.InterfaceC0140 mo389(defpackage.InterfaceC0140 r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "create(Any?;Continuation) has not been overridden"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public void mo1503() {
            r0 = this;
            return
    }

    @Override // defpackage.InterfaceC0140
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final void mo662(java.lang.Object r3) {
            r2 = this;
        L0:
            ᛴᛴᲈᛶ r2 = (defpackage.AbstractC0668) r2
            ᛱᛸᛲᲀ r0 = r2.f3238
            java.lang.Object r3 = r2.mo390(r3)     // Catch: java.lang.Throwable -> Ld
            ᛴᛵ r1 = defpackage.EnumC0670.f3246     // Catch: java.lang.Throwable -> Ld
            if (r3 != r1) goto L14
            return
        Ld:
            r3 = move-exception
            ᛴᛸᛲᲀ r1 = new ᛴᛸᛲᲀ
            r1.<init>(r3)
            r3 = r1
        L14:
            r2.mo1503()
            boolean r2 = r0 instanceof defpackage.AbstractC0668
            if (r2 == 0) goto L1d
            r2 = r0
            goto L0
        L1d:
            r0.mo662(r3)
            return
    }

    @Override // defpackage.InterfaceC1735
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC1735 mo1504() {
            r1 = this;
            ᛱᛸᛲᲀ r1 = r1.f3238
            boolean r0 = r1 instanceof defpackage.InterfaceC1735
            if (r0 == 0) goto L9
            ᲀᲀᛴ r1 = (defpackage.InterfaceC1735) r1
            return r1
        L9:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ */
    public abstract java.lang.Object mo390(java.lang.Object r1);
}
