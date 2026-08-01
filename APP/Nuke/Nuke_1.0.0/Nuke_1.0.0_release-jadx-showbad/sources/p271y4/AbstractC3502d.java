package p271y4;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p007B0.C0173F;
import p007B0.C0190d;
import p056K2.C0882h;
import p061L2.AbstractC0984x;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: y4.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3502d {

    /* JADX INFO: renamed from: a */
    public static final C0173F f10910a = new C0173F(11);

    /* JADX INFO: renamed from: b */
    public static final Object f10911b = AbstractC0984x.m2035G(new C0882h("boolean", Boolean.TYPE), new C0882h("byte", Byte.TYPE), new C0882h("char", Character.TYPE), new C0882h("short", Short.TYPE), new C0882h("int", Integer.TYPE), new C0882h("long", Long.TYPE), new C0882h("float", Float.TYPE), new C0882h("double", Double.TYPE), new C0882h("void", Void.TYPE));

    /* JADX DEBUG: Another duplicated slice has different insns count: {[GOTO]}, finally: {[GOTO, INVOKE, INVOKE] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Incorrect finally slice size: {[GOTO, INVOKE, INVOKE, INVOKE, CONST_STR, INVOKE, INVOKE] complete}, expected: {[GOTO, INVOKE, INVOKE] complete} */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Class m5758a(ClassLoader classLoader, String str) {
        C3499a c3499a;
        Object objM5752a;
        Map map;
        C3499a c3499a2;
        AbstractC1665j.m2985e(classLoader, "classLoader");
        AbstractC1665j.m2985e(str, "typeName");
        C0190d c0190d = new C0190d(11, str, classLoader);
        C0173F c0173f = f10910a;
        c0173f.getClass();
        ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) c0173f.f612e;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        AbstractC1665j.m2984d(lock, "lock.readLock()");
        lock.lock();
        try {
            WeakHashMap weakHashMap = (WeakHashMap) c0173f.f615h;
            if (weakHashMap == null) {
                WeakReference weakReference = (WeakReference) c0173f.f613f;
                if ((weakReference != null ? (ClassLoader) weakReference.get() : null) != classLoader || (c3499a2 = (C3499a) ((HashMap) c0173f.f614g).get(str)) == null || (objM5752a = c3499a2.m5752a()) == null) {
                    lock.unlock();
                    ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                    AbstractC1665j.m2984d(writeLock, "lock.writeLock()");
                    writeLock.lock();
                    try {
                        WeakHashMap weakHashMap2 = (WeakHashMap) c0173f.f615h;
                        if (weakHashMap2 == null) {
                            WeakReference weakReference2 = (WeakReference) c0173f.f613f;
                            ClassLoader classLoader2 = weakReference2 != null ? (ClassLoader) weakReference2.get() : null;
                            if (classLoader2 == null) {
                                c0173f.f613f = new WeakReference(classLoader);
                                ((HashMap) c0173f.f614g).clear();
                            } else if (classLoader2 != classLoader) {
                                weakHashMap2 = new WeakHashMap();
                                weakHashMap2.put(classLoader2, (HashMap) c0173f.f614g);
                                weakHashMap2.put(classLoader, new HashMap());
                                c0173f.f615h = weakHashMap2;
                                c0173f.f613f = null;
                                c0173f.f614g = new HashMap();
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
                            map = (HashMap) c0173f.f614g;
                        }
                        C3499a c3499a3 = (C3499a) map.get(str);
                        if (c3499a3 == null || (objM5752a = c3499a3.m5752a()) == null) {
                            objM5752a = c0190d.mo6a();
                            map.put(str, new C3499a(objM5752a));
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
                if (map3 != null && (c3499a = (C3499a) map3.get(str)) != null && (objM5752a = c3499a.m5752a()) != null) {
                    lock.unlock();
                }
            }
            return (Class) objM5752a;
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }
}
