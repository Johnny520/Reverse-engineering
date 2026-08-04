package yyds;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: renamed from: yyds.ᛱᛵᲈᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0133 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final Set f831 = AbstractC0068.m441(AbstractC2328.m4341(-691944574059374L), AbstractC2328.m4341(-691966048895854L), AbstractC2328.m4341(-691983228765038L), AbstractC2328.m4341(-692000408634222L));

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final Set f832 = AbstractC0068.m441(AbstractC2328.m4341(-692021883470702L), AbstractC2328.m4341(-692043358307182L), AbstractC2328.m4341(-692064833143662L));

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static C2578 m579(List list) {
        AbstractC2328.m4341(-691635336414062L);
        ArrayList arrayList = new ArrayList(AbstractC0055.m419(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C0244((List) it.next(), true));
        }
        return m581(arrayList);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static C2578 m580(List list, List list2) {
        AbstractC2328.m4341(-691665401185134L);
        AbstractC2328.m4341(-691738415629166L);
        ArrayList arrayList = new ArrayList(AbstractC0055.m419(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C0244((List) it.next(), false));
        }
        ArrayList arrayList2 = new ArrayList(AbstractC0055.m419(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new C0244((List) it2.next(), true));
        }
        return m581(AbstractC1595.m3284(arrayList, arrayList2));
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static C2578 m581(ArrayList arrayList) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C2578 c2578M3296 = AbstractC0024.m3296();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0244 c0244 = (C0244) it.next();
            C0558 c0558 = new C0558(2, AbstractC1529.m3163(new C1125(new C0558(1, c0244.f1346), C0808.f3731), C1137.f5218));
            C1109 c1109 = new C1109(4, new C1300(13));
            ArrayList arrayListM3162 = AbstractC1529.m3162(c0558);
            AbstractC0405.m1162(arrayListM3162, c1109);
            Iterator it2 = arrayListM3162.iterator();
            while (it2.hasNext()) {
                String str = (String) ((C1661) it2.next()).f8464;
                if (linkedHashSet.add(str)) {
                    c2578M3296.add(new C0873(str, c0244.f1347));
                }
            }
        }
        return AbstractC0024.m3305(c2578M3296);
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static String m582(String str) {
        int iM1290 = AbstractC0473.m1290(str, '#', 0, 6);
        if (iM1290 != -1) {
            str = str.substring(0, iM1290);
        }
        int iM12902 = AbstractC0473.m1290(str, '?', 0, 6);
        if (iM12902 != -1) {
            str = str.substring(0, iM12902);
        }
        String strM1303 = AbstractC0473.m1303(str, '/');
        if (!AbstractC0473.m1295(strM1303, '.')) {
            return AbstractC2328.m4341(-691845789811566L);
        }
        String strM13032 = AbstractC0473.m1303(strM1303, '.');
        Locale locale = Locale.ROOT;
        AbstractC2328.m4341(-691850084778862L);
        String lowerCase = strM13032.toLowerCase(locale);
        AbstractC2328.m4341(-691871559615342L);
        return lowerCase;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static String m583(String str) {
        AbstractC2328.m4341(-691794250204014L);
        String strM582 = m582(str);
        return strM582.length() == 0 ? AbstractC2328.m4341(-691811430073198L) : strM582;
    }
}
