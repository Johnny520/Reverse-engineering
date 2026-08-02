package p000;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m01 {

    /* JADX INFO: renamed from: a */
    public static final kj1 f6424a = new kj1(2);

    /* JADX INFO: renamed from: b */
    public static final Map f6425b = we1.m5876q0(new ow1("boolean", Boolean.TYPE), new ow1("byte", Byte.TYPE), new ow1("char", Character.TYPE), new ow1("short", Short.TYPE), new ow1("int", Integer.TYPE), new ow1("long", Long.TYPE), new ow1("float", Float.TYPE), new ow1("double", Double.TYPE), new ow1("void", Void.TYPE));

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Class m3022a(ClassLoader classLoader, String str) {
        C0449m5 c0449m5;
        Object objM3031a;
        Map map;
        C0449m5 c0449m52;
        classLoader.getClass();
        str.getClass();
        C0723t6 c0723t6 = new C0723t6(7, str, classLoader);
        kj1 kj1Var = f6424a;
        kj1Var.getClass();
        ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) kj1Var.f5594i;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.getClass();
        lock.lock();
        try {
            WeakHashMap weakHashMap = (WeakHashMap) kj1Var.f5597l;
            if (weakHashMap == null) {
                WeakReference weakReference = (WeakReference) kj1Var.f5595j;
                if ((weakReference != null ? (ClassLoader) weakReference.get() : null) != classLoader || (c0449m52 = (C0449m5) ((HashMap) kj1Var.f5596k).get(str)) == null || (objM3031a = c0449m52.m3031a()) == null) {
                    lock.unlock();
                    ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                    writeLock.getClass();
                    writeLock.lock();
                    try {
                        WeakHashMap weakHashMap2 = (WeakHashMap) kj1Var.f5597l;
                        if (weakHashMap2 == null) {
                            WeakReference weakReference2 = (WeakReference) kj1Var.f5595j;
                            ClassLoader classLoader2 = weakReference2 != null ? (ClassLoader) weakReference2.get() : null;
                            if (classLoader2 == null) {
                                kj1Var.f5595j = new WeakReference(classLoader);
                                ((HashMap) kj1Var.f5596k).clear();
                            } else if (classLoader2 != classLoader) {
                                weakHashMap2 = new WeakHashMap();
                                weakHashMap2.put(classLoader2, (HashMap) kj1Var.f5596k);
                                weakHashMap2.put(classLoader, new HashMap());
                                kj1Var.f5597l = weakHashMap2;
                                kj1Var.f5595j = null;
                                kj1Var.f5596k = new HashMap();
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
                            map = (HashMap) kj1Var.f5596k;
                        }
                        C0449m5 c0449m53 = (C0449m5) map.get(str);
                        if (c0449m53 == null || (objM3031a = c0449m53.m3031a()) == null) {
                            objM3031a = c0723t6.mo6a();
                            map.put(str, new C0449m5(objM3031a));
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
                if (map3 != null && (c0449m5 = (C0449m5) map3.get(str)) != null && (objM3031a = c0449m5.m3031a()) != null) {
                    lock.unlock();
                }
            }
            return (Class) objM3031a;
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }
}
