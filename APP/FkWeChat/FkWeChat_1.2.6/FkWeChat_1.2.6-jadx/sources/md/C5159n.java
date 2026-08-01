package md;

import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import p010a9.InterfaceC0184l;
import p185m8.AbstractC5106t;

/* JADX INFO: renamed from: md.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5159n {

    /* JADX INFO: renamed from: a */
    public static final C5159n f15754a = new C5159n();

    /* JADX INFO: renamed from: b */
    public static final ConcurrentHashMap f15755b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    public static final ConcurrentHashMap f15756c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    public static final ConcurrentHashMap f15757d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e */
    public static final WeakHashMap f15758e = new WeakHashMap();

    /* JADX INFO: renamed from: a */
    public static CharSequence m21165a(Class cls) {
        cls.getClass();
        return cls.getName();
    }

    /* JADX INFO: renamed from: b */
    public static CharSequence m21166b(Class cls) {
        cls.getClass();
        return cls.getName();
    }

    /* JADX INFO: renamed from: c */
    public final ConcurrentHashMap m21167c() {
        return f15757d;
    }

    /* JADX INFO: renamed from: d */
    public final String m21168d(Class cls, Class... clsArr) {
        cls.getClass();
        clsArr.getClass();
        return cls.getName() + "#init(" + AbstractC5106t.m20754u0(clsArr, ",", null, null, 0, null, new InterfaceC0184l() { // from class: md.m
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C5159n.m21165a((Class) obj);
            }
        }, 30, null) + ")";
    }

    /* JADX INFO: renamed from: e */
    public final ConcurrentHashMap m21169e() {
        return f15755b;
    }

    /* JADX INFO: renamed from: f */
    public final String m21170f(Class cls, String str) {
        cls.getClass();
        str.getClass();
        return cls.getName() + "#" + str;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized Map m21171g(Object obj) {
        Object concurrentHashMap;
        try {
            obj.getClass();
            WeakHashMap weakHashMap = f15758e;
            concurrentHashMap = weakHashMap.get(obj);
            if (concurrentHashMap == null) {
                concurrentHashMap = new ConcurrentHashMap();
                weakHashMap.put(obj, concurrentHashMap);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) concurrentHashMap;
    }

    /* JADX INFO: renamed from: h */
    public final ConcurrentHashMap m21172h() {
        return f15756c;
    }

    /* JADX INFO: renamed from: i */
    public final String m21173i(Class cls, String str, Class... clsArr) {
        cls.getClass();
        str.getClass();
        clsArr.getClass();
        return cls.getName() + "#" + str + "(" + AbstractC5106t.m20754u0(clsArr, ",", null, null, 0, null, new InterfaceC0184l() { // from class: md.l
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C5159n.m21166b((Class) obj);
            }
        }, 30, null) + ")";
    }
}
