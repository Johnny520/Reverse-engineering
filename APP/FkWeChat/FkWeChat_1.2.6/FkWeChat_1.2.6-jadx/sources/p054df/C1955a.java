package p054df;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p010a9.InterfaceC0173a;
import p172l8.C4700i0;

/* JADX INFO: renamed from: df.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1955a {

    /* JADX INFO: renamed from: a */
    public final boolean f5441a;

    /* JADX INFO: renamed from: c */
    public WeakReference f5443c;

    /* JADX INFO: renamed from: e */
    public WeakHashMap f5445e;

    /* JADX INFO: renamed from: b */
    public final ReentrantReadWriteLock f5442b = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: d */
    public Map f5444d = new HashMap();

    /* JADX INFO: renamed from: df.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface a {
        Object get();
    }

    /* JADX INFO: renamed from: df.a$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements a {

        /* JADX INFO: renamed from: a */
        public final Object f5446a;

        public b(Object obj) {
            obj.getClass();
            this.f5446a = obj;
        }

        @Override // p054df.C1955a.a
        public Object get() {
            return this.f5446a;
        }
    }

    /* JADX INFO: renamed from: df.a$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c implements a {

        /* JADX INFO: renamed from: a */
        public final WeakReference f5447a;

        public c(Object obj) {
            obj.getClass();
            this.f5447a = new WeakReference(obj);
        }

        @Override // p054df.C1955a.a
        public Object get() {
            return this.f5447a.get();
        }
    }

    public C1955a(boolean z10) {
        this.f5441a = z10;
    }

    /* JADX INFO: renamed from: a */
    public final Object m7077a(ClassLoader classLoader, Object obj, InterfaceC0173a interfaceC0173a) {
        a aVar;
        Object obj2;
        Map map;
        Object obj3;
        a aVar2;
        Object obj4;
        classLoader.getClass();
        obj.getClass();
        interfaceC0173a.getClass();
        ReentrantReadWriteLock.ReadLock lock = this.f5442b.readLock();
        lock.getClass();
        lock.lock();
        try {
            WeakHashMap weakHashMap = this.f5445e;
            if (weakHashMap == null) {
                WeakReference weakReference = this.f5443c;
                if ((weakReference != null ? (ClassLoader) weakReference.get() : null) == classLoader && (aVar2 = (a) this.f5444d.get(obj)) != null && (obj4 = aVar2.get()) != null) {
                    lock.unlock();
                    return obj4;
                }
            } else {
                Map map2 = (Map) weakHashMap.get(classLoader);
                if (map2 != null && (aVar = (a) map2.get(obj)) != null && (obj2 = aVar.get()) != null) {
                    lock.unlock();
                    return obj2;
                }
            }
            C4700i0 c4700i0 = C4700i0.f13910a;
            lock.unlock();
            ReentrantReadWriteLock.WriteLock writeLock = this.f5442b.writeLock();
            writeLock.getClass();
            writeLock.lock();
            try {
                WeakHashMap weakHashMap2 = this.f5445e;
                if (weakHashMap2 == null) {
                    WeakReference weakReference2 = this.f5443c;
                    ClassLoader classLoader2 = weakReference2 != null ? (ClassLoader) weakReference2.get() : null;
                    if (classLoader2 == null) {
                        this.f5443c = new WeakReference(classLoader);
                        this.f5444d.clear();
                    } else if (classLoader2 != classLoader) {
                        weakHashMap2 = new WeakHashMap();
                        weakHashMap2.put(classLoader2, this.f5444d);
                        weakHashMap2.put(classLoader, new HashMap());
                        this.f5445e = weakHashMap2;
                        this.f5443c = null;
                        this.f5444d = new HashMap();
                    }
                }
                if (weakHashMap2 != null) {
                    Object map3 = weakHashMap2.get(classLoader);
                    if (map3 == null) {
                        map3 = new HashMap();
                        weakHashMap2.put(classLoader, map3);
                    }
                    map = (Map) map3;
                } else {
                    map = this.f5444d;
                }
                a aVar3 = (a) map.get(obj);
                if (aVar3 != null && (obj3 = aVar3.get()) != null) {
                    writeLock.unlock();
                    return obj3;
                }
                Object objInvoke = interfaceC0173a.invoke();
                map.put(obj, m7078b(objInvoke));
                writeLock.unlock();
                return objInvoke;
            } catch (Throwable th) {
                writeLock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final a m7078b(Object obj) {
        return this.f5441a ? new c(obj) : new b(obj);
    }
}
