package yyds;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᛲᛶᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C0369 extends AbstractC2720 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C0369 f1893 = new C0369();

    private C0369() {
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static AbstractC0517 m1068(int i, C1942 c1942) {
        int iM4012 = AbstractC2104.m4012(i);
        if (iM4012 == 5) {
            return new C0754(c1942.m3745());
        }
        if (iM4012 == 6) {
            return new C0754(new C0234(c1942.m3745()));
        }
        if (iM4012 == 7) {
            return new C0754(Boolean.valueOf(c1942.m3760()));
        }
        if (iM4012 == 8) {
            c1942.m3767();
            return C0232.f1286;
        }
        C0188.m800("Unexpected token: ".concat(AbstractC0897.m1992(i)));
        return null;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static void m1069(C1405 c1405, AbstractC0517 abstractC0517) {
        if (abstractC0517 == null || (abstractC0517 instanceof C0232)) {
            c1405.m2857();
            return;
        }
        if (abstractC0517 instanceof C0754) {
            C0754 c0754 = (C0754) abstractC0517;
            Serializable serializable = c0754.f3466;
            if (serializable instanceof Number) {
                c1405.m2867(c0754.m1701());
                return;
            } else if (serializable instanceof Boolean) {
                c1405.m2851(serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(c0754.mo1363()));
                return;
            } else {
                c1405.m2852(c0754.mo1363());
                return;
            }
        }
        if (abstractC0517 instanceof C2438) {
            c1405.m2866();
            Iterator it = ((C2438) abstractC0517).f11998.iterator();
            while (it.hasNext()) {
                m1069(c1405, (AbstractC0517) it.next());
            }
            c1405.m2855();
            return;
        }
        if (!(abstractC0517 instanceof C0568)) {
            C1693.m3436(abstractC0517.getClass(), "Couldn't write ");
            return;
        }
        c1405.m2858();
        Iterator it2 = ((C0628) ((C0568) abstractC0517).f2744.entrySet()).iterator();
        while (((C2154) it2).hasNext()) {
            C2580 c2580M4122 = ((C2154) it2).m4122();
            c1405.m2856((String) c2580M4122.getKey());
            m1069(c1405, (AbstractC0517) c2580M4122.getValue());
        }
        c1405.m2865();
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static AbstractC0517 m1070(C1942 c1942) {
        AbstractC0517 c2438;
        AbstractC0517 c24382;
        int iM3744 = c1942.m3744();
        int iM4012 = AbstractC2104.m4012(iM3744);
        if (iM4012 == 0) {
            c1942.m3746();
            c2438 = new C2438();
        } else if (iM4012 != 2) {
            c2438 = null;
        } else {
            c1942.m3769();
            c2438 = new C0568();
        }
        if (c2438 == null) {
            return m1068(iM3744, c1942);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c1942.m3753()) {
                String strM3741 = c2438 instanceof C0568 ? c1942.m3741() : null;
                int iM37442 = c1942.m3744();
                int iM40122 = AbstractC2104.m4012(iM37442);
                if (iM40122 == 0) {
                    c1942.m3746();
                    c24382 = new C2438();
                } else if (iM40122 != 2) {
                    c24382 = null;
                } else {
                    c1942.m3769();
                    c24382 = new C0568();
                }
                boolean z = c24382 != null;
                if (c24382 == null) {
                    c24382 = m1068(iM37442, c1942);
                }
                if (c2438 instanceof C2438) {
                    ((C2438) c2438).f11998.add(c24382);
                } else {
                    ((C0568) c2438).f2744.put(strM3741, c24382);
                }
                if (z) {
                    arrayDeque.addLast(c2438);
                    c2438 = c24382;
                }
            } else {
                if (c2438 instanceof C2438) {
                    c1942.m3750();
                } else {
                    c1942.m3768();
                }
                if (arrayDeque.isEmpty()) {
                    return c2438;
                }
                c2438 = (AbstractC0517) arrayDeque.removeLast();
            }
        }
    }

    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final /* bridge */ /* synthetic */ Object mo484(C1942 c1942) {
        return m1070(c1942);
    }

    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final /* bridge */ /* synthetic */ void mo485(C1405 c1405, Object obj) {
        m1069(c1405, (AbstractC0517) obj);
    }
}
