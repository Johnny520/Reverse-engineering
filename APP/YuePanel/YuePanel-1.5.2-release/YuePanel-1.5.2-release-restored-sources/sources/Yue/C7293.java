package Yue;

import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۡۨ۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C7293 {

    /* JADX INFO: renamed from: Yue.ۥۡۨ۟ۡ$ۥ */
    public static class C1224 extends IllegalStateException {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C1224(String str) {
            super(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1224(String str, Object... objArr) {
            super(String.format(str, objArr));
        }

        public C1224(Throwable th, String str, Object... objArr) {
            super(String.format(str, objArr), th);
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static C4607 m3550(Collection<C4605> collection, Collection<C4605> collection2) {
        C4607 c4607 = new C4607();
        for (C4605 c4605 : collection) {
            Iterator<C4605> it = collection2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    c4607.add(c4605);
                    break;
                }
                if (c4605.equals(it.next())) {
                    break;
                }
            }
        }
        return c4607;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static C4607 m3551(AbstractC4662 abstractC4662, C4605 c4605) {
        C8159.m26910(abstractC4662);
        C8159.m26910(c4605);
        return C3892.m919(abstractC4662, c4605);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static C4607 m22785(String str, C4605 c4605) {
        C8159.m26907(str);
        return m3551(C6851.m21597(str), c4605);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static C4607 m22786(String str, Iterable<C4605> iterable) {
        C8159.m26907(str);
        C8159.m26910(iterable);
        AbstractC4662 abstractC4662M21597 = C6851.m21597(str);
        C4607 c4607 = new C4607();
        IdentityHashMap identityHashMap = new IdentityHashMap();
        Iterator<C4605> it = iterable.iterator();
        while (it.hasNext()) {
            for (C4605 c4605 : m3551(abstractC4662M21597, it.next())) {
                if (identityHashMap.put(c4605, Boolean.TRUE) == null) {
                    c4607.add(c4605);
                }
            }
        }
        return c4607;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static C4605 m22787(String str, C4605 c4605) {
        C8159.m26907(str);
        return C3892.m920(C6851.m21597(str), c4605);
    }
}
