package yyds;

import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᲀᛳᛴᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1962 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C0299 f9855 = new C0299(1);

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final Map f9856 = AbstractC2366.m4385(new Pair("boolean", Boolean.TYPE), new Pair("byte", Byte.TYPE), new Pair("char", Character.TYPE), new Pair("short", Short.TYPE), new Pair("int", Integer.TYPE), new Pair("long", Long.TYPE), new Pair("float", Float.TYPE), new Pair("double", Double.TYPE), new Pair("void", Void.TYPE));

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Class m3794(ClassLoader classLoader, String str) {
        C2453 c2453;
        Object objM4494;
        Map map;
        Object objM44942;
        Object obj;
        C2453 c24532;
        Object objM44943;
        C0299 c0299 = f9855;
        ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) c0299.f1577;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            WeakHashMap weakHashMap = (WeakHashMap) c0299.f1574;
            if (weakHashMap == null) {
                WeakReference weakReference = (WeakReference) c0299.f1573;
                if ((weakReference != null ? (ClassLoader) weakReference.get() : null) != classLoader || (c24532 = (C2453) ((HashMap) c0299.f1576).get(str)) == null || (objM44943 = c24532.m4494()) == null) {
                    lock.unlock();
                    ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                    writeLock.lock();
                    try {
                        WeakHashMap weakHashMap2 = (WeakHashMap) c0299.f1574;
                        if (weakHashMap2 == null) {
                            WeakReference weakReference2 = (WeakReference) c0299.f1573;
                            ClassLoader classLoader2 = weakReference2 != null ? (ClassLoader) weakReference2.get() : null;
                            if (classLoader2 == null) {
                                c0299.f1573 = new WeakReference(classLoader);
                                ((HashMap) c0299.f1576).clear();
                            } else if (classLoader2 != classLoader) {
                                weakHashMap2 = new WeakHashMap();
                                weakHashMap2.put(classLoader2, (HashMap) c0299.f1576);
                                weakHashMap2.put(classLoader, new HashMap());
                                c0299.f1574 = weakHashMap2;
                                c0299.f1573 = null;
                                c0299.f1576 = new HashMap();
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
                            map = (HashMap) c0299.f1576;
                        }
                        C2453 c24533 = (C2453) map.get(str);
                        if (c24533 == null || (objM44942 = c24533.m4494()) == null) {
                            String strSubstring = str;
                            int i = 0;
                            while (AbstractC0692.m1600(strSubstring, "[]", false)) {
                                i++;
                                strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
                            }
                            Class<?> clsLoadClass = (Class) f9856.get(strSubstring);
                            if (clsLoadClass == null) {
                                clsLoadClass = classLoader.loadClass(strSubstring);
                            }
                            int i2 = 0;
                            Class<?> cls = clsLoadClass;
                            while (i2 < i) {
                                i2++;
                                cls = Array.newInstance(cls, 0).getClass();
                            }
                            map.put(str, new C2453(cls));
                            writeLock.unlock();
                            obj = cls;
                        } else {
                            writeLock.unlock();
                            obj = objM44942;
                        }
                    } catch (Throwable th) {
                        writeLock.unlock();
                        throw th;
                    }
                } else {
                    lock.unlock();
                    obj = objM44943;
                }
            } else {
                Map map3 = (Map) weakHashMap.get(classLoader);
                if (map3 != null && (c2453 = (C2453) map3.get(str)) != null && (objM4494 = c2453.m4494()) != null) {
                    lock.unlock();
                    obj = objM4494;
                }
            }
            return (Class) obj;
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.Serializable, java.lang.Object[]] */
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static Serializable m3795(ClassLoader classLoader, ArrayList arrayList) {
        Object c2658;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                c2658 = m3794(classLoader, (String) it.next());
            } catch (Throwable th) {
                c2658 = new C2658(th);
            }
            Throwable thM4249 = C2248.m4249(c2658);
            if (thM4249 != null) {
                return new C2658(thM4249);
            }
            arrayList2.add((Class) c2658);
        }
        return arrayList2.toArray(new Class[0]);
    }
}
