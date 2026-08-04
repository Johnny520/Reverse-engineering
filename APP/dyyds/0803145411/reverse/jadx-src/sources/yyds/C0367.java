package yyds;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: yyds.ᛲᛶᛳᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0367 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C0989 f1886;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Object f1887;

    static {
        AbstractC1090.m2298(C0367.class);
    }

    public C0367(Object obj, C0989 c0989) {
        AbstractC0902.m2010(obj, "json can not be null");
        this.f1886 = c0989;
        this.f1887 = obj;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Object m1065(String str, InterfaceC0845... interfaceC0845Arr) {
        AbstractC0902.m2008(str, "path can not be null or empty");
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1477.f7008;
        InterfaceC0499 interfaceC0499 = AbstractC0992.f4507;
        String strM2013 = interfaceC0845Arr.length == 0 ? str : AbstractC0902.m2013(str, Arrays.toString(interfaceC0845Arr));
        C0644 c0644 = (C0644) interfaceC0499;
        C0177 c0177 = (C0177) ((ConcurrentHashMap) c0644.f3102).get(strM2013);
        if (c0177 != null) {
            c0644.m1563(strM2013);
        }
        if (c0177 == null) {
            AbstractC0902.m2008(str, "json can not be null or empty");
            c0177 = new C0177(str, interfaceC0845Arr);
            C0644 c06442 = (C0644) interfaceC0499;
            LinkedList linkedList = (LinkedList) c06442.f3101;
            ReentrantLock reentrantLock = (ReentrantLock) c06442.f3099;
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c06442.f3102;
            if (((C0177) concurrentHashMap.put(strM2013, c0177)) != null) {
                c06442.m1563(strM2013);
            } else {
                reentrantLock.lock();
                try {
                    linkedList.addFirst(strM2013);
                } finally {
                }
            }
            if (concurrentHashMap.size() > 400) {
                reentrantLock.lock();
                try {
                    String str2 = (String) linkedList.removeLast();
                    reentrantLock.unlock();
                    concurrentHashMap.remove(str2);
                } finally {
                }
            }
        }
        C0989 c0989 = this.f1886;
        Set set = c0989.f4505;
        C0052 c0052 = c0989.f4503;
        EnumC0445 enumC0445 = EnumC0445.f2267;
        boolean zContains = set.contains(enumC0445);
        EnumC0445 enumC04452 = EnumC0445.f2271;
        boolean zContains2 = set.contains(enumC04452);
        boolean zContains3 = set.contains(EnumC0445.f2270);
        C2623 c2623 = c0177.f1004;
        C2771 c2771 = c2623.f12909;
        boolean z = c2771.f13520 instanceof C0281;
        Object obj = this.f1887;
        if (z) {
            if (!zContains && !zContains2) {
                C1762 c1762M4740 = c2623.m4740(obj, obj, c0989);
                if (!zContains3 || !c1762M4740.m3504().isEmpty()) {
                    return c1762M4740.m3505(true);
                }
                if (c2771.m3902()) {
                    return null;
                }
                ((C0721) c0052.f551).getClass();
                return new C2288();
            }
            if (zContains3) {
                if (c2771.m3902()) {
                    return null;
                }
                ((C0721) c0052.f551).getClass();
                return new C2288();
            }
            throw new C1738("Options " + enumC0445 + " and " + enumC04452 + " are not allowed when using path functions!");
        }
        if (zContains) {
            C1762 c1762M47402 = c2623.m4740(obj, obj, c0989);
            if (zContains3 && c1762M47402.m3504().isEmpty()) {
                ((C0721) c0052.f551).getClass();
                return new C2288();
            }
            if (c1762M47402.f8844 != 0) {
                return c1762M47402.f8849;
            }
            if (c1762M47402.f8848) {
                return null;
            }
            throw new C1553("No results for path: " + c1762M47402.f8851.f12909.toString());
        }
        C1762 c1762M47403 = c2623.m4740(obj, obj, c0989);
        if (zContains3 && c1762M47403.m3504().isEmpty()) {
            if (zContains2) {
                ((C0721) c0052.f551).getClass();
                return new C2288();
            }
            if (c2771.m3902()) {
                return null;
            }
            ((C0721) c0052.f551).getClass();
            return new C2288();
        }
        Object objM3505 = c1762M47403.m3505(false);
        if (!zContains2 || !c2771.m3902()) {
            return objM3505;
        }
        ((C0721) c0052.f551).getClass();
        C2288 c2288 = new C2288();
        c0052.m400(c2288, 0, objM3505);
        return c2288;
    }
}
