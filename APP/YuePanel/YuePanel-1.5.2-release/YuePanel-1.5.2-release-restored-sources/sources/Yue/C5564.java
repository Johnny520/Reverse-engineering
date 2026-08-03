package Yue;

import java.lang.annotation.Annotation;

/* JADX INFO: renamed from: Yue.ۥ۠ۦۣ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5572(name = "JvmClassMappingKt")
public final class C5564 {
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final <T extends Annotation> InterfaceC5585<? extends T> m2298(@InterfaceC6399 T t) {
        C5499.m17103(t, "<this>");
        Class<? extends Annotation> clsAnnotationType = t.annotationType();
        C5499.m17102(clsAnnotationType, "this as java.lang.annota…otation).annotationType()");
        InterfaceC5585<? extends T> interfaceC5585M17351 = m17351(clsAnnotationType);
        C5499.m17101(interfaceC5585M17351, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return interfaceC5585M17351;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final <E extends Enum<E>> Class<E> m2299(Enum<E> r1) {
        C5499.m17103(r1, "<this>");
        Class<E> declaringClass = r1.getDeclaringClass();
        C5499.m17102(declaringClass, "this as java.lang.Enum<E>).declaringClass");
        return declaringClass;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.7")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m17345(Enum r0) {
    }

    @InterfaceC6399
    @InterfaceC5572(name = "getJavaClass")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T> Class<T> m17346(@InterfaceC6399 InterfaceC5585<T> interfaceC5585) {
        C5499.m17103(interfaceC5585, "<this>");
        Class<T> cls = (Class<T>) ((InterfaceC3827) interfaceC5585).mo10566();
        C5499.m17101(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return cls;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T> Class<T> m17347(@InterfaceC6399 T t) {
        C5499.m17103(t, "<this>");
        Class<T> cls = (Class<T>) t.getClass();
        C5499.m17101(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>");
        return cls;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ void m17348(InterfaceC5585 interfaceC5585) {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <T> Class<T> m17349(@InterfaceC6399 InterfaceC5585<T> interfaceC5585) {
        C5499.m17103(interfaceC5585, "<this>");
        Class<T> cls = (Class<T>) ((InterfaceC3827) interfaceC5585).mo10566();
        if (!cls.isPrimitive()) {
            C5499.m17101(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    cls = (Class<T>) Double.class;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    cls = (Class<T>) Integer.class;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    cls = (Class<T>) Byte.class;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    cls = (Class<T>) Character.class;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    cls = (Class<T>) Long.class;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    cls = (Class<T>) Void.class;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    cls = (Class<T>) Boolean.class;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    cls = (Class<T>) Float.class;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    cls = (Class<T>) Short.class;
                }
                break;
        }
        C5499.m17101(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return cls;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final <T> Class<T> m17350(@InterfaceC6399 InterfaceC5585<T> interfaceC5585) {
        C5499.m17103(interfaceC5585, "<this>");
        Class<T> cls = (Class<T>) ((InterfaceC3827) interfaceC5585).mo10566();
        if (cls.isPrimitive()) {
            C5499.m17101(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaPrimitiveType>>");
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    @InterfaceC6399
    @InterfaceC5572(name = "getKotlinClass")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final <T> InterfaceC5585<T> m17351(@InterfaceC6399 Class<T> cls) {
        C5499.m17103(cls, "<this>");
        return C7071.m21996(cls);
    }

    @InterfaceC6399
    @InterfaceC5572(name = "getRuntimeClassOfKClassInstance")
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final <T> Class<InterfaceC5585<T>> m17352(@InterfaceC6399 InterfaceC5585<T> interfaceC5585) {
        C5499.m17103(interfaceC5585, "<this>");
        Class<InterfaceC5585<T>> cls = (Class<InterfaceC5585<T>>) interfaceC5585.getClass();
        C5499.m17101(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.reflect.KClass<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>>");
        return cls;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "Use 'java' property to get Java class corresponding to this Kotlin class or cast this instance to Any if you really want to get the runtime Java class of this implementation of KClass.", replaceWith = @InterfaceC7097(expression = "(this as Any).javaClass", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m17353(InterfaceC5585 interfaceC5585) {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final /* synthetic */ boolean m17354(Object[] objArr) {
        C5499.m17103(objArr, "<this>");
        C5499.m17112(4, C4750.f10502);
        return Object.class.isAssignableFrom(objArr.getClass().getComponentType());
    }
}
