package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pa {
    public static final defpackage.pa c = null;
    public final java.util.HashMap a;
    public final java.util.HashMap b;

    static {
            pa r0 = new pa
            r0.<init>()
            defpackage.pa.c = r0
            return
    }

    public pa() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.b = r0
            return
    }

    public static void b(java.util.HashMap r3, defpackage.oa r4, defpackage.iq r5, java.lang.Class r6) {
            java.lang.Object r0 = r3.get(r4)
            iq r0 = (defpackage.iq) r0
            if (r0 == 0) goto L41
            if (r5 != r0) goto Lb
            goto L41
        Lb:
            java.lang.reflect.Method r3 = r4.b
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Method "
            r1.<init>(r2)
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            java.lang.String r3 = " in "
            r1.append(r3)
            java.lang.String r3 = r6.getName()
            r1.append(r3)
            java.lang.String r3 = " already declared with different @OnLifecycleEvent value: previous value "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = ", new value "
            r1.append(r3)
            r1.append(r5)
            java.lang.String r3 = r1.toString()
            r4.<init>(r3)
            throw r4
        L41:
            if (r0 != 0) goto L46
            r3.put(r4, r5)
        L46:
            return
    }

    public final defpackage.na a(java.lang.Class r13, java.lang.reflect.Method[] r14) {
            r12 = this;
            java.lang.Class r0 = r13.getSuperclass()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2 = 0
            java.util.HashMap r3 = r12.a
            if (r0 == 0) goto L20
            java.lang.Object r4 = r3.get(r0)
            na r4 = (defpackage.na) r4
            if (r4 == 0) goto L17
            goto L1b
        L17:
            na r4 = r12.a(r0, r2)
        L1b:
            java.util.HashMap r0 = r4.b
            r1.putAll(r0)
        L20:
            java.lang.Class[] r0 = r13.getInterfaces()
            int r4 = r0.length
            r5 = 0
            r6 = r5
        L27:
            if (r6 >= r4) goto L61
            r7 = r0[r6]
            java.lang.Object r8 = r3.get(r7)
            na r8 = (defpackage.na) r8
            if (r8 == 0) goto L34
            goto L38
        L34:
            na r8 = r12.a(r7, r2)
        L38:
            java.util.HashMap r7 = r8.b
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L42:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L5e
            java.lang.Object r8 = r7.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r9 = r8.getKey()
            oa r9 = (defpackage.oa) r9
            java.lang.Object r8 = r8.getValue()
            iq r8 = (defpackage.iq) r8
            b(r1, r9, r8, r13)
            goto L42
        L5e:
            int r6 = r6 + 1
            goto L27
        L61:
            if (r14 == 0) goto L64
            goto L68
        L64:
            java.lang.reflect.Method[] r14 = r13.getDeclaredMethods()     // Catch: java.lang.NoClassDefFoundError -> Le8
        L68:
            int r0 = r14.length
            r2 = r5
            r4 = r2
        L6b:
            if (r2 >= r0) goto Ld6
            r6 = r14[r2]
            java.lang.Class<zw> r7 = defpackage.zw.class
            java.lang.annotation.Annotation r7 = r6.getAnnotation(r7)
            zw r7 = (defpackage.zw) r7
            if (r7 != 0) goto L7a
            goto Lcb
        L7a:
            java.lang.Class[] r4 = r6.getParameterTypes()
            int r8 = r4.length
            r9 = 1
            if (r8 <= 0) goto L96
            java.lang.Class<oq> r8 = defpackage.oq.class
            r10 = r4[r5]
            boolean r8 = r8.isAssignableFrom(r10)
            if (r8 == 0) goto L8e
            r8 = r9
            goto L97
        L8e:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "invalid parameter type. Must be one and instanceof LifecycleOwner"
            r13.<init>(r14)
            throw r13
        L96:
            r8 = r5
        L97:
            iq r7 = r7.value()
            int r10 = r4.length
            r11 = 2
            if (r10 <= r9) goto Lbf
            java.lang.Class<iq> r8 = defpackage.iq.class
            r10 = r4[r9]
            boolean r8 = r8.isAssignableFrom(r10)
            if (r8 == 0) goto Lb7
            iq r8 = defpackage.iq.ON_ANY
            if (r7 != r8) goto Laf
            r8 = r11
            goto Lbf
        Laf:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "Second arg is supported only for ON_ANY value"
            r13.<init>(r14)
            throw r13
        Lb7:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "invalid parameter type. second arg must be an event"
            r13.<init>(r14)
            throw r13
        Lbf:
            int r4 = r4.length
            if (r4 > r11) goto Lce
            oa r4 = new oa
            r4.<init>(r8, r6)
            b(r1, r4, r7, r13)
            r4 = r9
        Lcb:
            int r2 = r2 + 1
            goto L6b
        Lce:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "cannot have more than 2 params"
            r13.<init>(r14)
            throw r13
        Ld6:
            na r14 = new na
            r14.<init>(r1)
            r3.put(r13, r14)
            java.util.HashMap r0 = r12.b
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            r0.put(r13, r1)
            return r14
        Le8:
            r13 = move-exception
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor."
            r14.<init>(r0, r13)
            throw r14
    }
}
