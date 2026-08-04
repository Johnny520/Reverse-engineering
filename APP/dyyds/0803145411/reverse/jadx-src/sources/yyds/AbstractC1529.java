package yyds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: yyds.ᛷᛴᛳᛶ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1529 extends AbstractC0810 {
    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public static Set m3154(InterfaceC1240 interfaceC1240) {
        Iterator it = interfaceC1240.iterator();
        if (!it.hasNext()) {
            return C1422.f6715;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return Collections.singleton(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public static List m3155(InterfaceC1240 interfaceC1240) {
        Iterator it = interfaceC1240.iterator();
        if (!it.hasNext()) {
            return C1860.f9345;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return Collections.singletonList(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public static String m3156(InterfaceC1240 interfaceC1240, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (Object obj : interfaceC1240) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            AbstractC0598.m1482(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public static C0497 m3157(InterfaceC1240 interfaceC1240, InterfaceC1549 interfaceC1549) {
        return new C0497(interfaceC1240, false, interfaceC1549);
    }

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public static Object m3158(InterfaceC1240 interfaceC1240) {
        Iterator it = interfaceC1240.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public static InterfaceC1240 m3159(Object obj, InterfaceC1549 interfaceC1549) {
        return new C2722(new C1223(19, obj), interfaceC1549, 1);
    }

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public static C0378 m3160(InterfaceC1240 interfaceC1240, InterfaceC1549 interfaceC1549) {
        return new C0378(interfaceC1240, interfaceC1549, C1914.f9661);
    }

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public static Object m3161(C0497 c0497) {
        C1119 c1119 = new C1119(c0497);
        if (c1119.hasNext()) {
            return c1119.next();
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public static ArrayList m3162(InterfaceC1240 interfaceC1240) {
        ArrayList arrayList = new ArrayList();
        Iterator it = interfaceC1240.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public static C0497 m3163(InterfaceC1240 interfaceC1240, InterfaceC1549 interfaceC1549) {
        return new C0497(interfaceC1240, true, interfaceC1549);
    }

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public static C0497 m3164(InterfaceC1240 interfaceC1240, InterfaceC1549 interfaceC1549) {
        return m3157(new C1125(interfaceC1240, interfaceC1549), new C0514(16));
    }
}
