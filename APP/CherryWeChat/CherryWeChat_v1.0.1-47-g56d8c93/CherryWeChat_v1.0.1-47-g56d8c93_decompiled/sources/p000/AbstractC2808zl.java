package p000;

import java.lang.reflect.Array;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import party.iroiro.luajava.util.ClassUtils;

/* JADX INFO: renamed from: zl */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2808zl {

    /* JADX INFO: renamed from: a */
    public static final C1256cF f9522a;

    /* JADX INFO: renamed from: b */
    public static final C1256cF f9523b;

    static {
        new WeakHashMap();
        new ReentrantReadWriteLock();
        new WeakHashMap();
        new ReentrantReadWriteLock();
        f9522a = new C1256cF();
        f9523b = new C1256cF();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (r2.equals("boolean") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0080, code lost:
    
        if (r2.equals("int") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0085, code lost:
    
        return java.lang.Integer.TYPE;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Class m5432a(String str, ClassLoader classLoader) {
        if (AbstractC0085Bz.m132J(str, false, ClassUtils.ARRAY_SUFFIX)) {
            return Array.newInstance((Class<?>) m5432a(str.substring(0, str.length() - 2), classLoader), 0).getClass();
        }
        switch (str.hashCode()) {
            case -1325958191:
                if (str.equals("double")) {
                    return Double.TYPE;
                }
                return classLoader.loadClass(str);
            case 104431:
                break;
            case 3039496:
                if (str.equals("byte")) {
                    return Byte.TYPE;
                }
                return classLoader.loadClass(str);
            case 3052374:
                if (str.equals("char")) {
                    return Character.TYPE;
                }
                return classLoader.loadClass(str);
            case 3327612:
                if (str.equals("long")) {
                    return Long.TYPE;
                }
                return classLoader.loadClass(str);
            case 3625364:
                if (str.equals("void")) {
                    return Void.TYPE;
                }
                return classLoader.loadClass(str);
            case 64711720:
                break;
            case 97526364:
                if (str.equals("float")) {
                    return Float.TYPE;
                }
                return classLoader.loadClass(str);
            case 109413500:
                if (str.equals("short")) {
                    return Short.TYPE;
                }
                return classLoader.loadClass(str);
            default:
                return classLoader.loadClass(str);
        }
    }
}
