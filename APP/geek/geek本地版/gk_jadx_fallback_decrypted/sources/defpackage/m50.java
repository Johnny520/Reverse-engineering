package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class m50 implements defpackage.an, defpackage.ld, defpackage.qe, java.io.Serializable {
    public final defpackage.ld a;
    public final defpackage.ge b;
    public transient defpackage.ld c;
    public final int d;

    public m50(defpackage.ld r2) {
            r1 = this;
            if (r2 == 0) goto L7
            ge r0 = r2.d()
            goto L8
        L7:
            r0 = 0
        L8:
            r1.<init>()
            r1.a = r2
            r1.b = r0
            r2 = 2
            r1.d = r2
            return
    }

    public abstract defpackage.ld a(defpackage.ld r1);

    @Override // defpackage.an
    public final int b() {
            r1 = this;
            int r0 = r1.d
            return r0
    }

    @Override // defpackage.qe
    public final defpackage.qe c() {
            r2 = this;
            ld r0 = r2.a
            boolean r1 = r0 instanceof defpackage.qe
            if (r1 == 0) goto L9
            qe r0 = (defpackage.qe) r0
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // defpackage.ld
    public final defpackage.ge d() {
            r1 = this;
            ge r0 = r1.b
            defpackage.ip.l(r0)
            return r0
    }

    @Override // defpackage.ld
    public final void f(java.lang.Object r7) {
            r6 = this;
            r0 = r6
        L1:
            m50 r0 = (defpackage.m50) r0
            ld r1 = r0.a
            defpackage.ip.l(r1)
            java.lang.Object r7 = r0.g(r7)     // Catch: java.lang.Throwable -> L11
            pe r2 = defpackage.pe.a     // Catch: java.lang.Throwable -> L11
            if (r7 != r2) goto L16
            return
        L11:
            r7 = move-exception
            e10 r7 = defpackage.ct.f(r7)
        L16:
            ld r2 = r0.c
            if (r2 == 0) goto L59
            if (r2 == r0) goto L59
            ge r3 = r0.b
            defpackage.ip.l(r3)
            vh r4 = defpackage.vh.b
            ee r3 = r3.b(r4)
            defpackage.ip.l(r3)
            md r3 = (defpackage.md) r3
            tg r2 = (defpackage.tg) r2
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = defpackage.tg.h
        L30:
            java.lang.Object r4 = r3.get(r2)
            l0 r5 = defpackage.a80.e
            if (r4 == r5) goto L30
            java.lang.Object r2 = r3.get(r2)
            boolean r3 = r2 instanceof defpackage.i8
            if (r3 == 0) goto L43
            i8 r2 = (defpackage.i8) r2
            goto L44
        L43:
            r2 = 0
        L44:
            if (r2 == 0) goto L59
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = defpackage.i8.h
            java.lang.Object r4 = r3.get(r2)
            zg r4 = (defpackage.zg) r4
            if (r4 != 0) goto L51
            goto L59
        L51:
            r4.b()
            nw r4 = defpackage.nw.a
            r3.set(r2, r4)
        L59:
            mb r2 = defpackage.mb.a
            r0.c = r2
            boolean r0 = r1 instanceof defpackage.m50
            if (r0 == 0) goto L63
            r0 = r1
            goto L1
        L63:
            r1.f(r7)
            return
    }

    public abstract java.lang.Object g(java.lang.Object r1);

    public final java.lang.String h() {
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Continuation at "
            r0.<init>(r1)
            java.lang.Class r1 = r9.getClass()
            java.lang.Class<ef> r2 = defpackage.ef.class
            java.lang.annotation.Annotation r1 = r1.getAnnotation(r2)
            ef r1 = (defpackage.ef) r1
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
            yv r4 = defpackage.ip.m
            yv r5 = defpackage.ip.n
            if (r5 != 0) goto L8f
            java.lang.Class<java.lang.Class> r5 = java.lang.Class.class
            java.lang.String r6 = "getModule"
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r6, r2)     // Catch: java.lang.Exception -> L8c
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
            yv r8 = new yv     // Catch: java.lang.Exception -> L8c
            r8.<init>(r5, r6, r7)     // Catch: java.lang.Exception -> L8c
            defpackage.ip.n = r8     // Catch: java.lang.Exception -> L8c
            r5 = r8
            goto L8f
        L8c:
            defpackage.ip.n = r4
            r5 = r4
        L8f:
            if (r5 != r4) goto L92
            goto Lbd
        L92:
            java.lang.reflect.Method r4 = r5.a
            if (r4 == 0) goto Lbd
            java.lang.Class r6 = r9.getClass()
            java.lang.Object r4 = r4.invoke(r6, r2)
            if (r4 != 0) goto La1
            goto Lbd
        La1:
            java.lang.reflect.Method r6 = r5.b
            if (r6 == 0) goto Lbd
            java.lang.Object r4 = r6.invoke(r4, r2)
            if (r4 != 0) goto Lac
            goto Lbd
        Lac:
            java.lang.reflect.Method r5 = r5.c
            if (r5 == 0) goto Lb5
            java.lang.Object r4 = r5.invoke(r4, r2)
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

    public final java.lang.String toString() {
            r2 = this;
            ld r0 = r2.a
            if (r0 != 0) goto L2c
            k00 r0 = defpackage.j00.a
            r0.getClass()
            java.lang.Class r0 = r2.getClass()
            java.lang.reflect.Type[] r0 = r0.getGenericInterfaces()
            r1 = 0
            r0 = r0[r1]
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "kotlin.jvm.functions."
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L26
            r1 = 21
            java.lang.String r0 = r0.substring(r1)
        L26:
            java.lang.String r1 = "renderLambdaToString(...)"
            defpackage.ip.n(r1, r0)
            return r0
        L2c:
            java.lang.String r0 = r2.h()
            return r0
    }
}
