package p372z8;

import java.lang.annotation.Annotation;
import p024b9.AbstractC1052o0;
import p024b9.InterfaceC1037h;
import p098g9.InterfaceC2549c;

/* JADX INFO: renamed from: z8.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9886a {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC2549c m38366a(Annotation annotation) {
        annotation.getClass();
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        clsAnnotationType.getClass();
        InterfaceC2549c interfaceC2549cM38370e = m38370e(clsAnnotationType);
        interfaceC2549cM38370e.getClass();
        return interfaceC2549cM38370e;
    }

    /* JADX INFO: renamed from: b */
    public static final Class m38367b(InterfaceC2549c interfaceC2549c) {
        interfaceC2549c.getClass();
        Class clsMo3775b = ((InterfaceC1037h) interfaceC2549c).mo3775b();
        clsMo3775b.getClass();
        return clsMo3775b;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: c */
    public static final Class m38368c(InterfaceC2549c interfaceC2549c) {
        interfaceC2549c.getClass();
        Class clsMo3775b = ((InterfaceC1037h) interfaceC2549c).mo3775b();
        if (!clsMo3775b.isPrimitive()) {
            return clsMo3775b;
        }
        String name = clsMo3775b.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return clsMo3775b;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: d */
    public static final Class m38369d(InterfaceC2549c interfaceC2549c) {
        interfaceC2549c.getClass();
        Class clsMo3775b = ((InterfaceC1037h) interfaceC2549c).mo3775b();
        if (clsMo3775b.isPrimitive()) {
            return clsMo3775b;
        }
        String name = clsMo3775b.getName();
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

    /* JADX INFO: renamed from: e */
    public static final InterfaceC2549c m38370e(Class cls) {
        cls.getClass();
        return AbstractC1052o0.m3807b(cls);
    }
}
