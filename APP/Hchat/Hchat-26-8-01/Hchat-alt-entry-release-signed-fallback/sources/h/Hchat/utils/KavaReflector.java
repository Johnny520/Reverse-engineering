package h.Hchat.utils;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class KavaReflector {
    public static final int $stable = 0;
    public static final h.Hchat.utils.KavaReflector INSTANCE = null;

    static {
            h.Hchat.utils.KavaReflector r0 = new h.Hchat.utils.KavaReflector
            r0.<init>()
            h.Hchat.utils.KavaReflector.INSTANCE = r0
            return
    }

    private KavaReflector() {
            r0 = this;
            r0.<init>()
            return
    }

    private final <T extends java.lang.reflect.AccessibleObject> T accessible(T r2) {
            r1 = this;
            r0 = 1
            r2.setAccessible(r0)
            return r2
    }

    public static final java.lang.reflect.Constructor<?> accessible(java.lang.reflect.Constructor<?> r1) {
            if (r1 == 0) goto Lb
            h.Hchat.utils.KavaReflector r0 = h.Hchat.utils.KavaReflector.INSTANCE
            java.lang.reflect.AccessibleObject r1 = r0.accessible(r1)
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public static final java.lang.reflect.Field accessible(java.lang.reflect.Field r1) {
            if (r1 == 0) goto Lb
            h.Hchat.utils.KavaReflector r0 = h.Hchat.utils.KavaReflector.INSTANCE
            java.lang.reflect.AccessibleObject r1 = r0.accessible(r1)
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public static final java.lang.reflect.Method accessible(java.lang.reflect.Method r1) {
            if (r1 == 0) goto Lb
            h.Hchat.utils.KavaReflector r0 = h.Hchat.utils.KavaReflector.INSTANCE
            java.lang.reflect.AccessibleObject r1 = r0.accessible(r1)
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            return r1
        Lb:
            r1 = 0
            return r1
    }

    private final boolean areAssignable(java.lang.Class<?>[] r7, java.lang.Object[] r8) {
            r6 = this;
            int r0 = r7.length
            int r1 = r8.length
            r2 = 0
            if (r0 == r1) goto L6
            return r2
        L6:
            lg.d r0 = tf.l.A0(r7)
            boolean r1 = r0 instanceof java.util.Collection
            r3 = 1
            if (r1 == 0) goto L19
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L19
            return r3
        L19:
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L42
            java.lang.Object r1 = r0.next()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            h.Hchat.utils.KavaReflector r4 = h.Hchat.utils.KavaReflector.INSTANCE
            r5 = r7[r1]
            r1 = r8[r1]
            boolean r1 = r4.isAssignableForCtor(r5, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L1d
            return r2
        L42:
            return r3
    }

    private final java.lang.Class<?> boxType(java.lang.Class<?> r2) {
            r1 = this;
            boolean r0 = r2.isPrimitive()
            if (r0 != 0) goto L7
            goto L5e
        L7:
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L12
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            return r2
        L12:
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L1d
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            return r2
        L1d:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L28
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            return r2
        L28:
            java.lang.Class r0 = java.lang.Double.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L33
            java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
            return r2
        L33:
            java.lang.Class r0 = java.lang.Float.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L3e
            java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
            return r2
        L3e:
            java.lang.Class r0 = java.lang.Short.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L49
            java.lang.Class<java.lang.Short> r2 = java.lang.Short.class
            return r2
        L49:
            java.lang.Class r0 = java.lang.Byte.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L54
            java.lang.Class<java.lang.Byte> r2 = java.lang.Byte.class
            return r2
        L54:
            java.lang.Class r0 = java.lang.Character.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L5e
            java.lang.Class<java.lang.Character> r2 = java.lang.Character.class
        L5e:
            return r2
    }

    public static final java.util.List<java.lang.reflect.Constructor<?>> declaredConstructors(java.lang.Class<?> r4) {
            tf.t r0 = tf.t.f13167g
            if (r4 != 0) goto L5
            return r0
        L5:
            h.Hchat.utils.KavaReflector r1 = h.Hchat.utils.KavaReflector.INSTANCE
            m.a r4 = g4.a.K(r4)     // Catch: java.lang.Throwable -> L42
            r4.s()     // Catch: java.lang.Throwable -> L42
            q6.a r2 = new q6.a     // Catch: java.lang.Throwable -> L42
            r2.<init>()     // Catch: java.lang.Throwable -> L42
            java.lang.Object r4 = r4.f8069h     // Catch: java.lang.Throwable -> L42
            r6.c r4 = (r6.c) r4     // Catch: java.lang.Throwable -> L42
            r2.f11543a = r4     // Catch: java.lang.Throwable -> L42
            java.util.List r4 = r2.b()     // Catch: java.lang.Throwable -> L42
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L42
            int r3 = tf.n.e1(r4)     // Catch: java.lang.Throwable -> L42
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L42
        L2a:
            boolean r3 = r4.hasNext()     // Catch: java.lang.Throwable -> L42
            if (r3 == 0) goto L48
            java.lang.Object r3 = r4.next()     // Catch: java.lang.Throwable -> L42
            v6.a r3 = (v6.a) r3     // Catch: java.lang.Throwable -> L42
            java.lang.reflect.Constructor r3 = r3.f14134a     // Catch: java.lang.Throwable -> L42
            java.lang.reflect.AccessibleObject r3 = r1.accessible(r3)     // Catch: java.lang.Throwable -> L42
            java.lang.reflect.Constructor r3 = (java.lang.reflect.Constructor) r3     // Catch: java.lang.Throwable -> L42
            r2.add(r3)     // Catch: java.lang.Throwable -> L42
            goto L2a
        L42:
            r4 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r4)
        L48:
            boolean r4 = r2 instanceof sf.f
            if (r4 == 0) goto L4d
            goto L4e
        L4d:
            r0 = r2
        L4e:
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    public static final java.util.List<java.lang.reflect.Field> declaredFields(java.lang.Class<?> r4) {
            tf.t r0 = tf.t.f13167g
            if (r4 != 0) goto L5
            return r0
        L5:
            h.Hchat.utils.KavaReflector r1 = h.Hchat.utils.KavaReflector.INSTANCE
            m.a r4 = g4.a.K(r4)     // Catch: java.lang.Throwable -> L42
            r4.s()     // Catch: java.lang.Throwable -> L42
            q6.b r2 = new q6.b     // Catch: java.lang.Throwable -> L42
            r2.<init>()     // Catch: java.lang.Throwable -> L42
            java.lang.Object r4 = r4.f8069h     // Catch: java.lang.Throwable -> L42
            r6.c r4 = (r6.c) r4     // Catch: java.lang.Throwable -> L42
            r2.f11543a = r4     // Catch: java.lang.Throwable -> L42
            java.util.List r4 = r2.b()     // Catch: java.lang.Throwable -> L42
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L42
            int r3 = tf.n.e1(r4)     // Catch: java.lang.Throwable -> L42
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L42
        L2a:
            boolean r3 = r4.hasNext()     // Catch: java.lang.Throwable -> L42
            if (r3 == 0) goto L48
            java.lang.Object r3 = r4.next()     // Catch: java.lang.Throwable -> L42
            v6.b r3 = (v6.b) r3     // Catch: java.lang.Throwable -> L42
            java.lang.reflect.Field r3 = r3.f14135a     // Catch: java.lang.Throwable -> L42
            java.lang.reflect.AccessibleObject r3 = r1.accessible(r3)     // Catch: java.lang.Throwable -> L42
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3     // Catch: java.lang.Throwable -> L42
            r2.add(r3)     // Catch: java.lang.Throwable -> L42
            goto L2a
        L42:
            r4 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r4)
        L48:
            boolean r4 = r2 instanceof sf.f
            if (r4 == 0) goto L4d
            goto L4e
        L4d:
            r0 = r2
        L4e:
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    public static final java.util.List<java.lang.reflect.Method> declaredMethods(java.lang.Class<?> r4) {
            tf.t r0 = tf.t.f13167g
            if (r4 != 0) goto L5
            return r0
        L5:
            h.Hchat.utils.KavaReflector r1 = h.Hchat.utils.KavaReflector.INSTANCE
            m.a r4 = g4.a.K(r4)     // Catch: java.lang.Throwable -> L42
            r4.s()     // Catch: java.lang.Throwable -> L42
            q6.c r2 = new q6.c     // Catch: java.lang.Throwable -> L42
            r2.<init>()     // Catch: java.lang.Throwable -> L42
            java.lang.Object r4 = r4.f8069h     // Catch: java.lang.Throwable -> L42
            r6.c r4 = (r6.c) r4     // Catch: java.lang.Throwable -> L42
            r2.f11543a = r4     // Catch: java.lang.Throwable -> L42
            java.util.List r4 = r2.b()     // Catch: java.lang.Throwable -> L42
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L42
            int r3 = tf.n.e1(r4)     // Catch: java.lang.Throwable -> L42
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L42
        L2a:
            boolean r3 = r4.hasNext()     // Catch: java.lang.Throwable -> L42
            if (r3 == 0) goto L48
            java.lang.Object r3 = r4.next()     // Catch: java.lang.Throwable -> L42
            v6.c r3 = (v6.c) r3     // Catch: java.lang.Throwable -> L42
            java.lang.reflect.Method r3 = r3.f14136a     // Catch: java.lang.Throwable -> L42
            java.lang.reflect.AccessibleObject r3 = r1.accessible(r3)     // Catch: java.lang.Throwable -> L42
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch: java.lang.Throwable -> L42
            r2.add(r3)     // Catch: java.lang.Throwable -> L42
            goto L2a
        L42:
            r4 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r4)
        L48:
            boolean r4 = r2 instanceof sf.f
            if (r4 == 0) goto L4d
            goto L4e
        L4d:
            r0 = r2
        L4e:
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    public static final java.lang.reflect.Method findCompatibleMethod(java.lang.Class<?> r5, java.lang.String r6, java.lang.Object... r7) {
            r7.getClass()
            r0 = 0
            if (r5 == 0) goto L60
            if (r6 == 0) goto L60
            int r1 = r6.length()
            if (r1 != 0) goto Lf
            goto L60
        Lf:
            if (r5 == 0) goto L60
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L60
            java.util.List r1 = declaredMethods(r5)
            java.util.Iterator r1 = r1.iterator()
        L21:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L55
            java.lang.Object r2 = r1.next()
            r3 = r2
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.String r4 = r3.getName()
            boolean r4 = gg.l.a(r4, r6)
            if (r4 == 0) goto L49
            h.Hchat.utils.KavaReflector r4 = h.Hchat.utils.KavaReflector.INSTANCE
            java.lang.Class[] r3 = r3.getParameterTypes()
            r3.getClass()
            boolean r3 = r4.areAssignable(r3, r7)
            if (r3 == 0) goto L49
            r3 = 1
            goto L4a
        L49:
            r3 = 0
        L4a:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L21
            goto L56
        L55:
            r2 = r0
        L56:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            if (r2 == 0) goto L5b
            return r2
        L5b:
            java.lang.Class r5 = r5.getSuperclass()
            goto Lf
        L60:
            return r0
    }

    public static final java.lang.reflect.Constructor<?> findConstructor(java.lang.Class<?> r3, java.lang.Class<?>... r4) {
            r4.getClass()
            r0 = 0
            if (r3 != 0) goto L7
            return r0
        L7:
            h.Hchat.utils.KavaReflector r1 = h.Hchat.utils.KavaReflector.INSTANCE
            m.a r3 = g4.a.K(r3)     // Catch: java.lang.Throwable -> L4b
            r3.s()     // Catch: java.lang.Throwable -> L4b
            q6.a r2 = new q6.a     // Catch: java.lang.Throwable -> L4b
            r2.<init>()     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r3 = r3.f8069h     // Catch: java.lang.Throwable -> L4b
            r6.c r3 = (r6.c) r3     // Catch: java.lang.Throwable -> L4b
            r2.f11543a = r3     // Catch: java.lang.Throwable -> L4b
            int r3 = r4.length     // Catch: java.lang.Throwable -> L4b
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r4, r3)     // Catch: java.lang.Throwable -> L4b
            int r4 = r3.length     // Catch: java.lang.Throwable -> L4b
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)     // Catch: java.lang.Throwable -> L4b
            java.util.ArrayList r4 = r2.f11517g     // Catch: java.lang.Throwable -> L4b
            r4.getClass()     // Catch: java.lang.Throwable -> L4b
            java.util.List r3 = java.util.Arrays.asList(r3)     // Catch: java.lang.Throwable -> L4b
            r3.getClass()     // Catch: java.lang.Throwable -> L4b
            r4.addAll(r3)     // Catch: java.lang.Throwable -> L4b
            java.util.List r3 = r2.b()     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r3 = tf.m.v1(r3)     // Catch: java.lang.Throwable -> L4b
            v6.a r3 = (v6.a) r3     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L4d
            java.lang.reflect.Constructor r3 = r3.f14134a     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L4d
            java.lang.reflect.AccessibleObject r3 = r1.accessible(r3)     // Catch: java.lang.Throwable -> L4b
            java.lang.reflect.Constructor r3 = (java.lang.reflect.Constructor) r3     // Catch: java.lang.Throwable -> L4b
            goto L55
        L4b:
            r3 = move-exception
            goto L4f
        L4d:
            r3 = r0
            goto L55
        L4f:
            sf.f r4 = new sf.f
            r4.<init>(r3)
            r3 = r4
        L55:
            boolean r4 = r3 instanceof sf.f
            if (r4 == 0) goto L5b
            goto L5c
        L5b:
            r0 = r3
        L5c:
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            return r0
    }

    public static final java.lang.reflect.Field findDeclaredField(java.lang.Class<?> r3, java.lang.String r4) {
            r0 = 0
            if (r3 == 0) goto L4c
            if (r4 == 0) goto L4c
            int r1 = r4.length()
            if (r1 != 0) goto Lc
            goto L4c
        Lc:
            h.Hchat.utils.KavaReflector r1 = h.Hchat.utils.KavaReflector.INSTANCE
            m.a r3 = g4.a.K(r3)     // Catch: java.lang.Throwable -> L39
            r3.s()     // Catch: java.lang.Throwable -> L39
            q6.b r2 = new q6.b     // Catch: java.lang.Throwable -> L39
            r2.<init>()     // Catch: java.lang.Throwable -> L39
            java.lang.Object r3 = r3.f8069h     // Catch: java.lang.Throwable -> L39
            r6.c r3 = (r6.c) r3     // Catch: java.lang.Throwable -> L39
            r2.f11543a = r3     // Catch: java.lang.Throwable -> L39
            r2.f11544b = r4     // Catch: java.lang.Throwable -> L39
            java.util.List r3 = r2.b()     // Catch: java.lang.Throwable -> L39
            java.lang.Object r3 = tf.m.v1(r3)     // Catch: java.lang.Throwable -> L39
            v6.b r3 = (v6.b) r3     // Catch: java.lang.Throwable -> L39
            if (r3 == 0) goto L3b
            java.lang.reflect.Field r3 = r3.f14135a     // Catch: java.lang.Throwable -> L39
            if (r3 == 0) goto L3b
            java.lang.reflect.AccessibleObject r3 = r1.accessible(r3)     // Catch: java.lang.Throwable -> L39
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3     // Catch: java.lang.Throwable -> L39
            goto L43
        L39:
            r3 = move-exception
            goto L3d
        L3b:
            r3 = r0
            goto L43
        L3d:
            sf.f r4 = new sf.f
            r4.<init>(r3)
            r3 = r4
        L43:
            boolean r4 = r3 instanceof sf.f
            if (r4 == 0) goto L49
            goto L4a
        L49:
            r0 = r3
        L4a:
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
        L4c:
            return r0
    }

    public static final java.lang.reflect.Method findDeclaredMethod(java.lang.Class<?> r3, java.lang.String r4, java.lang.Class<?>... r5) {
            r5.getClass()
            r0 = 0
            if (r3 == 0) goto L68
            if (r4 == 0) goto L68
            int r1 = r4.length()
            if (r1 != 0) goto Lf
            goto L68
        Lf:
            h.Hchat.utils.KavaReflector r1 = h.Hchat.utils.KavaReflector.INSTANCE
            m.a r3 = g4.a.K(r3)     // Catch: java.lang.Throwable -> L55
            r3.s()     // Catch: java.lang.Throwable -> L55
            q6.c r2 = new q6.c     // Catch: java.lang.Throwable -> L55
            r2.<init>()     // Catch: java.lang.Throwable -> L55
            java.lang.Object r3 = r3.f8069h     // Catch: java.lang.Throwable -> L55
            r6.c r3 = (r6.c) r3     // Catch: java.lang.Throwable -> L55
            r2.f11543a = r3     // Catch: java.lang.Throwable -> L55
            r2.f11544b = r4     // Catch: java.lang.Throwable -> L55
            int r3 = r5.length     // Catch: java.lang.Throwable -> L55
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r5, r3)     // Catch: java.lang.Throwable -> L55
            int r4 = r3.length     // Catch: java.lang.Throwable -> L55
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)     // Catch: java.lang.Throwable -> L55
            java.util.ArrayList r4 = r2.f11517g     // Catch: java.lang.Throwable -> L55
            r4.getClass()     // Catch: java.lang.Throwable -> L55
            java.util.List r3 = java.util.Arrays.asList(r3)     // Catch: java.lang.Throwable -> L55
            r3.getClass()     // Catch: java.lang.Throwable -> L55
            r4.addAll(r3)     // Catch: java.lang.Throwable -> L55
            java.util.List r3 = r2.b()     // Catch: java.lang.Throwable -> L55
            java.lang.Object r3 = tf.m.v1(r3)     // Catch: java.lang.Throwable -> L55
            v6.c r3 = (v6.c) r3     // Catch: java.lang.Throwable -> L55
            if (r3 == 0) goto L57
            java.lang.reflect.Method r3 = r3.f14136a     // Catch: java.lang.Throwable -> L55
            if (r3 == 0) goto L57
            java.lang.reflect.AccessibleObject r3 = r1.accessible(r3)     // Catch: java.lang.Throwable -> L55
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch: java.lang.Throwable -> L55
            goto L5f
        L55:
            r3 = move-exception
            goto L59
        L57:
            r3 = r0
            goto L5f
        L59:
            sf.f r4 = new sf.f
            r4.<init>(r3)
            r3 = r4
        L5f:
            boolean r4 = r3 instanceof sf.f
            if (r4 == 0) goto L65
            goto L66
        L65:
            r0 = r3
        L66:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
        L68:
            return r0
    }

    public static final java.lang.reflect.Field findField(java.lang.Class<?> r2, java.lang.String r3) {
            r0 = 0
            if (r2 == 0) goto L30
            if (r3 == 0) goto L30
            int r1 = r3.length()
            if (r1 != 0) goto Lc
            goto L30
        Lc:
            java.lang.reflect.Field r1 = findDeclaredField(r2, r3)
            if (r1 == 0) goto L13
            return r1
        L13:
            h.Hchat.utils.KavaReflector r1 = h.Hchat.utils.KavaReflector.INSTANCE
            java.lang.reflect.Field r2 = r2.getField(r3)     // Catch: java.lang.Throwable -> L20
            java.lang.reflect.AccessibleObject r2 = r1.accessible(r2)     // Catch: java.lang.Throwable -> L20
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2     // Catch: java.lang.Throwable -> L20
            goto L27
        L20:
            r2 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r2)
            r2 = r3
        L27:
            boolean r3 = r2 instanceof sf.f
            if (r3 == 0) goto L2d
            goto L2e
        L2d:
            r0 = r2
        L2e:
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
        L30:
            return r0
    }

    public static final java.lang.reflect.Field findFieldRecursive(java.lang.Class<?> r2, java.lang.String r3) {
            if (r2 == 0) goto L27
            if (r3 == 0) goto L27
            int r0 = r3.length()
            if (r0 != 0) goto Lb
            goto L27
        Lb:
            r0 = r2
        Lc:
            if (r0 == 0) goto L22
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L22
            java.lang.reflect.Field r1 = findDeclaredField(r0, r3)
            if (r1 == 0) goto L1d
            return r1
        L1d:
            java.lang.Class r0 = r0.getSuperclass()
            goto Lc
        L22:
            java.lang.reflect.Field r2 = findField(r2, r3)
            return r2
        L27:
            r2 = 0
            return r2
    }

    public static final java.lang.reflect.Method findMethod(java.lang.Class<?> r3, java.lang.String r4, java.lang.Class<?>... r5) {
            r5.getClass()
            r0 = 0
            if (r3 == 0) goto L41
            if (r4 == 0) goto L41
            int r1 = r4.length()
            if (r1 != 0) goto Lf
            goto L41
        Lf:
            int r1 = r5.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r5, r1)
            java.lang.Class[] r1 = (java.lang.Class[]) r1
            java.lang.reflect.Method r1 = findDeclaredMethod(r3, r4, r1)
            if (r1 == 0) goto L1d
            return r1
        L1d:
            h.Hchat.utils.KavaReflector r1 = h.Hchat.utils.KavaReflector.INSTANCE
            int r2 = r5.length     // Catch: java.lang.Throwable -> L31
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r2)     // Catch: java.lang.Throwable -> L31
            java.lang.Class[] r5 = (java.lang.Class[]) r5     // Catch: java.lang.Throwable -> L31
            java.lang.reflect.Method r3 = r3.getMethod(r4, r5)     // Catch: java.lang.Throwable -> L31
            java.lang.reflect.AccessibleObject r3 = r1.accessible(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch: java.lang.Throwable -> L31
            goto L38
        L31:
            r3 = move-exception
            sf.f r4 = new sf.f
            r4.<init>(r3)
            r3 = r4
        L38:
            boolean r4 = r3 instanceof sf.f
            if (r4 == 0) goto L3e
            goto L3f
        L3e:
            r0 = r3
        L3f:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
        L41:
            return r0
    }

    public static final java.lang.reflect.Method findMethodRecursive(java.lang.Class<?> r2, java.lang.String r3, java.lang.Class<?>... r4) {
            r4.getClass()
            if (r2 == 0) goto L38
            if (r3 == 0) goto L38
            int r0 = r3.length()
            if (r0 != 0) goto Le
            goto L38
        Le:
            r0 = r2
        Lf:
            if (r0 == 0) goto L2c
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L2c
            int r1 = r4.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r4, r1)
            java.lang.Class[] r1 = (java.lang.Class[]) r1
            java.lang.reflect.Method r1 = findDeclaredMethod(r0, r3, r1)
            if (r1 == 0) goto L27
            return r1
        L27:
            java.lang.Class r0 = r0.getSuperclass()
            goto Lf
        L2c:
            int r0 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            java.lang.Class[] r4 = (java.lang.Class[]) r4
            java.lang.reflect.Method r2 = findMethod(r2, r3, r4)
            return r2
        L38:
            r2 = 0
            return r2
    }

    public static final java.lang.Object invoke(java.lang.reflect.Method r2, java.lang.Object r3, java.lang.Object... r4) {
            r4.getClass()
            r0 = 0
            if (r2 != 0) goto L7
            return r0
        L7:
            h.Hchat.utils.KavaReflector r1 = h.Hchat.utils.KavaReflector.INSTANCE
            r1.accessible(r2)     // Catch: java.lang.Throwable -> L16
            int r1 = r4.length     // Catch: java.lang.Throwable -> L16
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)     // Catch: java.lang.Throwable -> L16
            java.lang.Object r2 = r2.invoke(r3, r4)     // Catch: java.lang.Throwable -> L16
            goto L1d
        L16:
            r2 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r2)
            r2 = r3
        L1d:
            boolean r3 = r2 instanceof sf.f
            if (r3 == 0) goto L23
            goto L24
        L23:
            r0 = r2
        L24:
            return r0
    }

    public static final java.lang.Object invokeMethod(java.lang.Object r2, java.lang.String r3, java.lang.Object... r4) {
            r4.getClass()
            if (r2 != 0) goto L7
            r2 = 0
            return r2
        L7:
            java.lang.Class r0 = r2.getClass()
            int r1 = r4.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r4, r1)
            java.lang.reflect.Method r3 = findCompatibleMethod(r0, r3, r1)
            int r0 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            java.lang.Object r2 = invoke(r3, r2, r4)
            return r2
    }

    public static final java.lang.Object invokeOrThrow(java.lang.reflect.Method r1, java.lang.Object r2, java.lang.Object... r3) {
            r3.getClass()
            if (r1 == 0) goto L14
            h.Hchat.utils.KavaReflector r0 = h.Hchat.utils.KavaReflector.INSTANCE
            r0.accessible(r1)
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.lang.Object r1 = r1.invoke(r2, r3)
            return r1
        L14:
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException
            java.lang.String r2 = "method is null"
            r1.<init>(r2)
            throw r1
    }

    public static final java.lang.Object invokeStaticMethod(java.lang.Class<?> r1, java.lang.String r2, java.lang.Object... r3) {
            r3.getClass()
            int r0 = r3.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r3, r0)
            java.lang.reflect.Method r1 = findCompatibleMethod(r1, r2, r0)
            int r2 = r3.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r3, r2)
            r3 = 0
            java.lang.Object r1 = invoke(r1, r3, r2)
            return r1
    }

    public static final boolean invokeSuccessfully(java.lang.reflect.Method r1, java.lang.Object r2, java.lang.Object... r3) {
            r3.getClass()
            if (r1 != 0) goto L7
            r1 = 0
            return r1
        L7:
            h.Hchat.utils.KavaReflector r0 = h.Hchat.utils.KavaReflector.INSTANCE
            r0.accessible(r1)     // Catch: java.lang.Throwable -> L17
            int r0 = r3.length     // Catch: java.lang.Throwable -> L17
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)     // Catch: java.lang.Throwable -> L17
            r1.invoke(r2, r3)     // Catch: java.lang.Throwable -> L17
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L17
            goto L1e
        L17:
            r1 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r1)
            r1 = r2
        L1e:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            boolean r3 = r1 instanceof sf.f
            if (r3 == 0) goto L25
            r1 = r2
        L25:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
    }

    public static final boolean isAbstract(int r0) {
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            return r0
    }

    public static final boolean isAbstract(java.lang.reflect.Method r0) {
            if (r0 == 0) goto Le
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    private final boolean isAssignableForCtor(java.lang.Class<?> r1, java.lang.Object r2) {
            r0 = this;
            if (r2 != 0) goto L9
            boolean r1 = r1.isPrimitive()
            r1 = r1 ^ 1
            return r1
        L9:
            java.lang.Class r1 = r0.boxType(r1)
            java.lang.Class r2 = r2.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            return r1
    }

    public static final boolean isPublic(java.lang.reflect.Method r0) {
            if (r0 == 0) goto Le
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public static final boolean isStatic(int r0) {
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            return r0
    }

    public static final boolean isStatic(java.lang.reflect.Field r0) {
            if (r0 == 0) goto Le
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public static final boolean isStatic(java.lang.reflect.Method r0) {
            if (r0 == 0) goto Le
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public static final java.lang.Class<?> loadClass(java.lang.String r2, java.lang.ClassLoader r3) {
            r0 = 0
            if (r2 == 0) goto L20
            int r1 = r2.length()
            if (r1 != 0) goto La
            goto L20
        La:
            r1 = 0
            java.lang.Class r2 = java.lang.Class.forName(r2, r1, r3)     // Catch: java.lang.Throwable -> L10
            goto L17
        L10:
            r2 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r2)
            r2 = r3
        L17:
            boolean r3 = r2 instanceof sf.f
            if (r3 == 0) goto L1d
            goto L1e
        L1d:
            r0 = r2
        L1e:
            java.lang.Class r0 = (java.lang.Class) r0
        L20:
            return r0
    }

    public static final int modifiers(java.lang.reflect.Field r0) {
            if (r0 == 0) goto L7
            int r0 = r0.getModifiers()
            return r0
        L7:
            r0 = 0
            return r0
    }

    public static final int modifiers(java.lang.reflect.Method r0) {
            if (r0 == 0) goto L7
            int r0 = r0.getModifiers()
            return r0
        L7:
            r0 = 0
            return r0
    }

    public static final java.lang.Object newInstance(java.lang.reflect.Constructor<?> r2, java.lang.Object... r3) {
            r3.getClass()
            r0 = 0
            if (r2 != 0) goto L7
            return r0
        L7:
            r1 = 1
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> L15
            int r1 = r3.length     // Catch: java.lang.Throwable -> L15
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r1)     // Catch: java.lang.Throwable -> L15
            java.lang.Object r2 = r2.newInstance(r3)     // Catch: java.lang.Throwable -> L15
            goto L1c
        L15:
            r2 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r2)
            r2 = r3
        L1c:
            boolean r3 = r2 instanceof sf.f
            if (r3 == 0) goto L22
            goto L23
        L22:
            r0 = r2
        L23:
            return r0
    }

    public static final java.lang.Object newInstanceByArgs(java.lang.Class<?> r7, java.lang.Object[] r8) {
            r8.getClass()
            r0 = 0
            if (r7 != 0) goto L7
            return r0
        L7:
            java.util.List r7 = declaredConstructors(r7)
            java.util.Iterator r7 = r7.iterator()
        Lf:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L70
            java.lang.Object r1 = r7.next()
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
            java.lang.Class[] r2 = r1.getParameterTypes()
            if (r2 == 0) goto Lf
            int r3 = r2.length
            int r4 = r8.length
            if (r3 == r4) goto L26
            goto Lf
        L26:
            lg.d r3 = tf.l.A0(r2)
            boolean r4 = r3 instanceof java.util.Collection
            if (r4 == 0) goto L38
            r4 = r3
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L38
            goto L64
        L38:
            java.util.Iterator r3 = r3.iterator()
        L3c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L64
            java.lang.Object r4 = r3.next()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            h.Hchat.utils.KavaReflector r5 = h.Hchat.utils.KavaReflector.INSTANCE
            r6 = r2[r4]
            r6.getClass()
            r4 = r8[r4]
            boolean r4 = r5.isAssignableForCtor(r6, r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L3c
            goto Lf
        L64:
            int r2 = r8.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r8, r2)
            java.lang.Object r1 = newInstance(r1, r2)
            if (r1 == 0) goto Lf
            return r1
        L70:
            return r0
    }

    public static final java.lang.Object readField(java.lang.Object r3, java.lang.String r4) {
            r0 = 0
            if (r3 == 0) goto L3d
            if (r4 == 0) goto L3d
            int r1 = r4.length()
            if (r1 != 0) goto Lc
            goto L3d
        Lc:
            java.lang.Class r1 = r3.getClass()
        L10:
            if (r1 == 0) goto L3d
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L3d
            java.lang.reflect.Field r2 = findDeclaredField(r1, r4)
            if (r2 == 0) goto L38
            r4 = 1
            r2.setAccessible(r4)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r3 = r2.get(r3)     // Catch: java.lang.Throwable -> L29
            goto L30
        L29:
            r3 = move-exception
            sf.f r4 = new sf.f
            r4.<init>(r3)
            r3 = r4
        L30:
            boolean r4 = r3 instanceof sf.f
            if (r4 == 0) goto L36
            goto L37
        L36:
            r0 = r3
        L37:
            return r0
        L38:
            java.lang.Class r1 = r1.getSuperclass()
            goto L10
        L3d:
            return r0
    }

    public static final java.lang.Object readField(java.lang.reflect.Field r2, java.lang.Object r3) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            h.Hchat.utils.KavaReflector r1 = h.Hchat.utils.KavaReflector.INSTANCE
            r1.accessible(r2)     // Catch: java.lang.Throwable -> Le
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> Le
            goto L15
        Le:
            r2 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r2)
            r2 = r3
        L15:
            boolean r3 = r2 instanceof sf.f
            if (r3 == 0) goto L1b
            goto L1c
        L1b:
            r0 = r2
        L1c:
            return r0
    }

    public static final java.lang.Object staticInstance(java.lang.Class<?> r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.util.List r1 = declaredFields(r4)
            java.util.Iterator r1 = r1.iterator()
        Lc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L32
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            boolean r3 = isStatic(r2)
            if (r3 == 0) goto L2e
            java.lang.Class r3 = r2.getType()
            boolean r3 = r4.isAssignableFrom(r3)
            if (r3 != 0) goto L29
            goto L2e
        L29:
            java.lang.Object r2 = readField(r2, r0)
            goto L2f
        L2e:
            r2 = r0
        L2f:
            if (r2 == 0) goto Lc
            return r2
        L32:
            return r0
    }

    public static final boolean writeField(java.lang.Object r1, java.lang.String r2, java.lang.Object r3) {
            if (r1 == 0) goto L18
            if (r2 == 0) goto L18
            int r0 = r2.length()
            if (r0 != 0) goto Lb
            goto L18
        Lb:
            java.lang.Class r0 = r1.getClass()
            java.lang.reflect.Field r2 = findFieldRecursive(r0, r2)
            boolean r1 = writeField(r2, r1, r3)
            return r1
        L18:
            r1 = 0
            return r1
    }

    public static final boolean writeField(java.lang.reflect.Field r1, java.lang.Object r2, java.lang.Object r3) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            h.Hchat.utils.KavaReflector r0 = h.Hchat.utils.KavaReflector.INSTANCE
            r0.accessible(r1)     // Catch: java.lang.Throwable -> Lf
            r1.set(r2, r3)     // Catch: java.lang.Throwable -> Lf
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Lf
            goto L16
        Lf:
            r1 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r1)
            r1 = r2
        L16:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            boolean r3 = r1 instanceof sf.f
            if (r3 == 0) goto L1d
            r1 = r2
        L1d:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
    }
}
