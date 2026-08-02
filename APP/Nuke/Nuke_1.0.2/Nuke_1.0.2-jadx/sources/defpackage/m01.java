package defpackage;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m01 {
    public static final kj1 a = new kj1(2);
    public static final Map b = we1.q0(new ow1("boolean", Boolean.TYPE), new ow1("byte", Byte.TYPE), new ow1("char", Character.TYPE), new ow1("short", Short.TYPE), new ow1("int", Integer.TYPE), new ow1("long", Long.TYPE), new ow1("float", Float.TYPE), new ow1("double", Double.TYPE), new ow1("void", Void.TYPE));

    /* JADX DEBUG: Another duplicated slice has different insns count: {[GOTO]}, finally: {[GOTO, INVOKE, INVOKE] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Incorrect finally slice size: {[GOTO, INVOKE, INVOKE, INVOKE, INVOKE, INVOKE] complete}, expected: {[GOTO, INVOKE, INVOKE] complete} */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Class a(ClassLoader classLoader, String str) {
        m5 m5Var;
        Object objA;
        Map map;
        m5 m5Var2;
        classLoader.getClass();
        str.getClass();
        t6 t6Var = new t6(7, str, classLoader);
        kj1 kj1Var = a;
        kj1Var.getClass();
        ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) kj1Var.i;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.getClass();
        lock.lock();
        try {
            WeakHashMap weakHashMap = (WeakHashMap) kj1Var.l;
            if (weakHashMap == null) {
                WeakReference weakReference = (WeakReference) kj1Var.j;
                if ((weakReference != null ? (ClassLoader) weakReference.get() : null) != classLoader || (m5Var2 = (m5) ((HashMap) kj1Var.k).get(str)) == null || (objA = m5Var2.a()) == null) {
                    lock.unlock();
                    ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                    writeLock.getClass();
                    writeLock.lock();
                    try {
                        WeakHashMap weakHashMap2 = (WeakHashMap) kj1Var.l;
                        if (weakHashMap2 == null) {
                            WeakReference weakReference2 = (WeakReference) kj1Var.j;
                            ClassLoader classLoader2 = weakReference2 != null ? (ClassLoader) weakReference2.get() : null;
                            if (classLoader2 == null) {
                                kj1Var.j = new WeakReference(classLoader);
                                ((HashMap) kj1Var.k).clear();
                            } else if (classLoader2 != classLoader) {
                                weakHashMap2 = new WeakHashMap();
                                weakHashMap2.put(classLoader2, (HashMap) kj1Var.k);
                                weakHashMap2.put(classLoader, new HashMap());
                                kj1Var.l = weakHashMap2;
                                kj1Var.j = null;
                                kj1Var.k = new HashMap();
                            }
                        }
                        if (weakHashMap2 != null) {
                            Object map2 = weakHashMap2.get(classLoader);
                            if (map2 == null) {
                                map2 = new HashMap();
                                weakHashMap2.put(classLoader, map2);
                            }
                            map = (Map) map2;
                        } else {
                            map = (HashMap) kj1Var.k;
                        }
                        m5 m5Var3 = (m5) map.get(str);
                        if (m5Var3 == null || (objA = m5Var3.a()) == null) {
                            objA = t6Var.a();
                            map.put(str, new m5(objA));
                            writeLock.unlock();
                        } else {
                            writeLock.unlock();
                        }
                    } catch (Throwable th) {
                        writeLock.unlock();
                        throw th;
                    }
                } else {
                    lock.unlock();
                }
            } else {
                Map map3 = (Map) weakHashMap.get(classLoader);
                if (map3 != null && (m5Var = (m5) map3.get(str)) != null && (objA = m5Var.a()) != null) {
                    lock.unlock();
                }
            }
            return (Class) objA;
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }
}
