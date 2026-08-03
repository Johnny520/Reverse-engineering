package p000;

import java.lang.reflect.Array;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import party.iroiro.luajava.util.ClassUtils;

/* JADX INFO: renamed from: zl */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2808zl {

    /* JADX INFO: renamed from: a */
    public static final C1256cF f9522a = null;

    /* JADX INFO: renamed from: b */
    public static final C1256cF f9523b = null;

    static {
        new WeakHashMap();
        new ReentrantReadWriteLock();
        new WeakHashMap();
        new ReentrantReadWriteLock();
        f9522a = new C1256cF();
        f9523b = new C1256cF();
    }

    /* JADX INFO: renamed from: a */
    public static Class m5432a(String r2, ClassLoader r3) {
        if (AbstractC0085Bz.m132J(r2, false, ClassUtils.ARRAY_SUFFIX) == false) goto L7;
        return Array.newInstance(m5432a(r2.substring(0, r2.length() - 2), r3), 0).getClass();
    L7:
        switch(r2.hashCode()) {
            case -1325958191: goto L48;
            case 104431: goto L43;
            case 3039496: goto L38;
            case 3052374: goto L33;
            case 3327612: goto L28;
            case 3625364: goto L23;
            case 64711720: goto L20;
            case 97526364: goto L15;
            case 109413500: goto L10;
            default: goto L50;
        };
    L10:
        if (r2.equals("short") == false) goto L50;
        return Short.TYPE;
    L15:
        if (r2.equals("float") == false) goto L50;
        return Float.TYPE;
    L20:
        if (r2.equals("boolean") == false) goto L50;
    L46:
        return Integer.TYPE;
    L23:
        if (r2.equals("void") == false) goto L50;
        return Void.TYPE;
    L28:
        if (r2.equals("long") == false) goto L50;
        return Long.TYPE;
    L33:
        if (r2.equals("char") == false) goto L50;
        return Character.TYPE;
    L38:
        if (r2.equals("byte") == false) goto L50;
        return Byte.TYPE;
    L43:
        if (r2.equals("int") == true) goto L46;
    L48:
        if (r2.equals("double") == false) goto L50;
        return Double.TYPE;
    L50:
        return r3.loadClass(r2);
    }
}
