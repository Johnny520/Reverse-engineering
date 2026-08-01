package p063e1;

import java.lang.reflect.Array;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: e1.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0554b {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f1862a = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new WeakHashMap();
        new ReentrantReadWriteLock();
        new WeakHashMap();
        new ReentrantReadWriteLock();
        new WeakHashMap();
        new ReentrantReadWriteLock();
        new WeakHashMap();
        new ReentrantReadWriteLock();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009d  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Class m1129a(ClassLoader classLoader, String str) throws ClassNotFoundException {
        AbstractC0223g.m418e(classLoader, "classLoader");
        AbstractC0223g.m418e(str, "typeName");
        if (str.endsWith("[]")) {
            String strSubstring = str.substring(0, str.length() - 2);
            AbstractC0223g.m417d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return Array.newInstance((Class<?>) m1129a(classLoader, strSubstring), 0).getClass();
        }
        int iHashCode = str.hashCode();
        Class<?> clsLoadClass = Integer.TYPE;
        switch (iHashCode) {
            case -1325958191:
                clsLoadClass = !str.equals("double") ? classLoader.loadClass(str) : Double.TYPE;
                break;
            case 104431:
                if (!str.equals("int")) {
                }
                break;
            case 3039496:
                if (str.equals("byte")) {
                    clsLoadClass = Byte.TYPE;
                    break;
                }
                break;
            case 3052374:
                if (str.equals("char")) {
                    clsLoadClass = Character.TYPE;
                    break;
                }
                break;
            case 3327612:
                if (str.equals("long")) {
                    clsLoadClass = Long.TYPE;
                    break;
                }
                break;
            case 3625364:
                if (str.equals("void")) {
                    clsLoadClass = Void.TYPE;
                    break;
                }
                break;
            case 64711720:
                if (!str.equals("boolean")) {
                }
                break;
            case 97526364:
                if (str.equals("float")) {
                    clsLoadClass = Float.TYPE;
                    break;
                }
                break;
            case 109413500:
                if (str.equals("short")) {
                    clsLoadClass = Short.TYPE;
                    break;
                }
                break;
        }
        AbstractC0223g.m415b(clsLoadClass);
        return clsLoadClass;
    }
}
