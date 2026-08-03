package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۦۣ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC3421(name = "JvmClassMappingKt")
public final class C3413 {
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final <T extends java.lang.annotation.Annotation> Yue.InterfaceC3435<? extends T> m14189(@Yue.InterfaceC4418 T r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.Class r1 = r1.annotationType()
            java.lang.String r0 = "this as java.lang.annota…otation).annotationType()"
            Yue.C3329.m13905(r1, r0)
            Yue.ۥ۠ۦۢۢ r1 = m14197(r1)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>"
            Yue.C3329.m13904(r1, r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final <E extends java.lang.Enum<E>> java.lang.Class<E> m14190(java.lang.Enum<E> r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.Class r1 = r1.getDeclaringClass()
            java.lang.String r0 = "this as java.lang.Enum<E>).declaringClass"
            Yue.C3329.m13905(r1, r0)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.7")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m14191(java.lang.Enum r0) {
            return
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3421(name = "getJavaClass")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T> java.lang.Class<T> m14192(@Yue.InterfaceC4418 Yue.InterfaceC3435<T> r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            Yue.ۥ۟ۤۧ۟ r1 = (Yue.InterfaceC1144) r1
            java.lang.Class r1 = r1.mo6000()
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>"
            Yue.C3329.m13904(r1, r0)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T> java.lang.Class<T> m14193(@Yue.InterfaceC4418 T r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.Class r1 = r1.getClass()
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>"
            Yue.C3329.m13904(r1, r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ void m14194(Yue.InterfaceC3435 r0) {
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <T> java.lang.Class<T> m14195(@Yue.InterfaceC4418 Yue.InterfaceC3435<T> r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            Yue.ۥ۟ۤۧ۟ r3 = (Yue.InterfaceC1144) r3
            java.lang.Class r3 = r3.mo6000()
            boolean r0 = r3.isPrimitive()
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>"
            if (r0 != 0) goto L17
            Yue.C3329.m13904(r3, r1)
            return r3
        L17:
            java.lang.String r0 = r3.getName()
            int r2 = r0.hashCode()
            switch(r2) {
                case -1325958191: goto L86;
                case 104431: goto L7a;
                case 3039496: goto L6e;
                case 3052374: goto L62;
                case 3327612: goto L56;
                case 3625364: goto L4a;
                case 64711720: goto L3e;
                case 97526364: goto L32;
                case 109413500: goto L24;
                default: goto L22;
            }
        L22:
            goto L91
        L24:
            java.lang.String r2 = "short"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L2e
            goto L91
        L2e:
            java.lang.Class<java.lang.Short> r3 = java.lang.Short.class
            goto L91
        L32:
            java.lang.String r2 = "float"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L3b
            goto L91
        L3b:
            java.lang.Class<java.lang.Float> r3 = java.lang.Float.class
            goto L91
        L3e:
            java.lang.String r2 = "boolean"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L47
            goto L91
        L47:
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            goto L91
        L4a:
            java.lang.String r2 = "void"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L53
            goto L91
        L53:
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            goto L91
        L56:
            java.lang.String r2 = "long"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L5f
            goto L91
        L5f:
            java.lang.Class<java.lang.Long> r3 = java.lang.Long.class
            goto L91
        L62:
            java.lang.String r2 = "char"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L6b
            goto L91
        L6b:
            java.lang.Class<java.lang.Character> r3 = java.lang.Character.class
            goto L91
        L6e:
            java.lang.String r2 = "byte"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L77
            goto L91
        L77:
            java.lang.Class<java.lang.Byte> r3 = java.lang.Byte.class
            goto L91
        L7a:
            java.lang.String r2 = "int"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L83
            goto L91
        L83:
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            goto L91
        L86:
            java.lang.String r2 = "double"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L8f
            goto L91
        L8f:
            java.lang.Class<java.lang.Double> r3 = java.lang.Double.class
        L91:
            Yue.C3329.m13904(r3, r1)
            return r3
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final <T> java.lang.Class<T> m14196(@Yue.InterfaceC4418 Yue.InterfaceC3435<T> r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            Yue.ۥ۟ۤۧ۟ r1 = (Yue.InterfaceC1144) r1
            java.lang.Class r1 = r1.mo6000()
            boolean r0 = r1.isPrimitive()
            if (r0 == 0) goto L17
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaPrimitiveType>>"
            Yue.C3329.m13904(r1, r0)
            return r1
        L17:
            java.lang.String r1 = r1.getName()
            int r0 = r1.hashCode()
            switch(r0) {
                case -2056817302: goto L86;
                case -527879800: goto L7a;
                case -515992664: goto L6e;
                case 155276373: goto L62;
                case 344809556: goto L56;
                case 398507100: goto L4a;
                case 398795216: goto L3e;
                case 399092968: goto L32;
                case 761287205: goto L24;
                default: goto L22;
            }
        L22:
            goto L8e
        L24:
            java.lang.String r0 = "java.lang.Double"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L2e
            goto L8e
        L2e:
            java.lang.Class r1 = java.lang.Double.TYPE
            goto L92
        L32:
            java.lang.String r0 = "java.lang.Void"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L3b
            goto L8e
        L3b:
            java.lang.Class r1 = java.lang.Void.TYPE
            goto L92
        L3e:
            java.lang.String r0 = "java.lang.Long"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L47
            goto L8e
        L47:
            java.lang.Class r1 = java.lang.Long.TYPE
            goto L92
        L4a:
            java.lang.String r0 = "java.lang.Byte"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L53
            goto L8e
        L53:
            java.lang.Class r1 = java.lang.Byte.TYPE
            goto L92
        L56:
            java.lang.String r0 = "java.lang.Boolean"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L5f
            goto L8e
        L5f:
            java.lang.Class r1 = java.lang.Boolean.TYPE
            goto L92
        L62:
            java.lang.String r0 = "java.lang.Character"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L6b
            goto L8e
        L6b:
            java.lang.Class r1 = java.lang.Character.TYPE
            goto L92
        L6e:
            java.lang.String r0 = "java.lang.Short"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L77
            goto L8e
        L77:
            java.lang.Class r1 = java.lang.Short.TYPE
            goto L92
        L7a:
            java.lang.String r0 = "java.lang.Float"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L83
            goto L8e
        L83:
            java.lang.Class r1 = java.lang.Float.TYPE
            goto L92
        L86:
            java.lang.String r0 = "java.lang.Integer"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L90
        L8e:
            r1 = 0
            goto L92
        L90:
            java.lang.Class r1 = java.lang.Integer.TYPE
        L92:
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3421(name = "getKotlinClass")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC3435<T> m14197(@Yue.InterfaceC4418 java.lang.Class<T> r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            Yue.ۥ۠ۦۢۢ r1 = Yue.C5277.m19888(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3421(name = "getRuntimeClassOfKClassInstance")
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final <T> java.lang.Class<Yue.InterfaceC3435<T>> m14198(@Yue.InterfaceC4418 Yue.InterfaceC3435<T> r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.Class r1 = r1.getClass()
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.Class<kotlin.reflect.KClass<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>>"
            Yue.C3329.m13904(r1, r0)
            return r1
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Use 'java' property to get Java class corresponding to this Kotlin class or cast this instance to Any if you really want to get the runtime Java class of this implementation of KClass.", replaceWith = @Yue.InterfaceC5313(expression = "(this as Any).javaClass", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m14199(Yue.InterfaceC3435 r0) {
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final /* synthetic */ boolean m14200(java.lang.Object[] r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            r0 = 4
            java.lang.String r1 = "T"
            Yue.C3329.m13915(r0, r1)
            java.lang.Class r2 = r2.getClass()
            java.lang.Class r2 = r2.getComponentType()
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            boolean r2 = r0.isAssignableFrom(r2)
            return r2
    }
}
