package p000;

/* JADX INFO: renamed from: zf */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1056zf {

    /* JADX INFO: renamed from: γ */
    public static final p000.C1056zf f13072 = null;

    /* JADX INFO: renamed from: α */
    public final java.util.HashMap f13073;

    /* JADX INFO: renamed from: β */
    public final java.util.HashMap f13074;

    static {
            zf r0 = new zf
            r0.<init>()
            p000.C1056zf.f13072 = r0
            return
    }

    public C1056zf() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f13073 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f13074 = r0
            return
    }

    /* JADX INFO: renamed from: β */
    public static void m7130(java.util.HashMap r3, p000.C1019yf r4, p000.br0 r5, java.lang.Class r6) {
            java.lang.Object r0 = r3.get(r4)
            br0 r0 = (p000.br0) r0
            if (r0 == 0) goto L41
            if (r5 != r0) goto Lb
            goto L41
        Lb:
            java.lang.reflect.Method r3 = r4.f12597
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.getName()
            java.lang.String r6 = r6.getName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Method "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = " in "
            r1.append(r3)
            r1.append(r6)
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

    /* JADX INFO: renamed from: α */
    public final p000.C0982xf m7131(java.lang.Class r13, java.lang.reflect.Method[] r14) {
            r12 = this;
            java.lang.Class r0 = r13.getSuperclass()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2 = 0
            java.util.HashMap r3 = r12.f13073
            if (r0 == 0) goto L20
            java.lang.Object r4 = r3.get(r0)
            xf r4 = (p000.C0982xf) r4
            if (r4 == 0) goto L17
            goto L1b
        L17:
            xf r4 = r12.m7131(r0, r2)
        L1b:
            java.util.HashMap r0 = r4.f12153
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
            xf r8 = (p000.C0982xf) r8
            if (r8 == 0) goto L34
            goto L38
        L34:
            xf r8 = r12.m7131(r7, r2)
        L38:
            java.util.HashMap r7 = r8.f12153
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L42:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L5e
            java.lang.Object r8 = r7.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r9 = r8.getKey()
            yf r9 = (p000.C1019yf) r9
            java.lang.Object r8 = r8.getValue()
            br0 r8 = (p000.br0) r8
            m7130(r1, r9, r8, r13)
            goto L42
        L5e:
            int r6 = r6 + 1
            goto L27
        L61:
            if (r14 == 0) goto L64
            goto L68
        L64:
            java.lang.reflect.Method[] r14 = r13.getDeclaredMethods()     // Catch: java.lang.NoClassDefFoundError -> Le1
        L68:
            int r0 = r14.length
            r2 = r5
            r4 = r2
        L6b:
            if (r2 >= r0) goto Lcf
            r6 = r14[r2]
            java.lang.Class<f51> r7 = p000.f51.class
            java.lang.annotation.Annotation r7 = r6.getAnnotation(r7)
            f51 r7 = (p000.f51) r7
            if (r7 != 0) goto L7a
            goto Lc6
        L7a:
            java.lang.Class[] r4 = r6.getParameterTypes()
            int r8 = r4.length
            r9 = 1
            if (r8 <= 0) goto L95
            java.lang.Class<hr0> r8 = p000.hr0.class
            r10 = r4[r5]
            boolean r8 = r8.isAssignableFrom(r10)
            if (r8 == 0) goto L8e
            r8 = r9
            goto L96
        L8e:
            java.lang.String r12 = "invalid parameter type. Must be one and instanceof LifecycleOwner"
            p000.C1080.m7275(r12)
        L93:
            r12 = 0
            return r12
        L95:
            r8 = r5
        L96:
            br0 r7 = r7.value()
            int r10 = r4.length
            r11 = 2
            if (r10 <= r9) goto Lba
            java.lang.Class<br0> r8 = p000.br0.class
            r10 = r4[r9]
            boolean r8 = r8.isAssignableFrom(r10)
            if (r8 == 0) goto Lb4
            br0 r8 = p000.br0.ON_ANY
            if (r7 != r8) goto Lae
            r8 = r11
            goto Lba
        Lae:
            java.lang.String r12 = "Second arg is supported only for ON_ANY value"
            p000.C1080.m7275(r12)
            goto L93
        Lb4:
            java.lang.String r12 = "invalid parameter type. second arg must be an event"
            p000.C1080.m7275(r12)
            goto L93
        Lba:
            int r4 = r4.length
            if (r4 > r11) goto Lc9
            yf r4 = new yf
            r4.<init>(r8, r6)
            m7130(r1, r4, r7, r13)
            r4 = r9
        Lc6:
            int r2 = r2 + 1
            goto L6b
        Lc9:
            java.lang.String r12 = "cannot have more than 2 params"
            p000.C1080.m7275(r12)
            goto L93
        Lcf:
            xf r14 = new xf
            r14.<init>(r1)
            r3.put(r13, r14)
            java.util.HashMap r12 = r12.f13074
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r12.put(r13, r0)
            return r14
        Le1:
            r12 = move-exception
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor."
            r13.<init>(r14, r12)
            throw r13
    }
}
