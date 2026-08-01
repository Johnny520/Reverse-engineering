package p155k6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p080f9.C2363j;
import p139j6.AbstractC3608e;
import p139j6.C3609f;
import p170l6.C4676o;
import p185m8.AbstractC5070c0;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5114x;
import p283t8.AbstractC8205c;

/* JADX INFO: renamed from: k6.u */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4013u {

    /* JADX INFO: renamed from: a */
    public static final C4013u f11767a = new C4013u();

    /* JADX INFO: renamed from: a */
    public final Set m15943a(String str, Set set) {
        int i10;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : C3609f.f10025a.m13521u()) {
            ArrayList arrayList = new ArrayList();
            AbstractC5070c0.m20492E(arrayList, AbstractC3608e.m13495b(str, str2));
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                int iIntValue = ((Number) obj).intValue();
                C2363j c2363j = new C2363j(iIntValue, iIntValue + 1);
                Set set2 = set;
                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                    Iterator it = set2.iterator();
                    while (it.hasNext()) {
                        if (AbstractC3608e.m13494a((C2363j) it.next(), c2363j)) {
                            break;
                        }
                    }
                }
                arrayList2.add(obj);
            }
            List listM20560a1 = AbstractC5081g0.m20560a1(arrayList2);
            int iM31894c = AbstractC8205c.m31894c(0, AbstractC5114x.m20802q(listM20560a1), 2);
            if (iM31894c >= 0) {
                while (true) {
                    int i11 = i10 + 1;
                    if (AbstractC5081g0.m20579m0(listM20560a1, i11) != null) {
                        C2363j c2363j2 = new C2363j(((Number) listM20560a1.get(i10)).intValue(), ((Number) listM20560a1.get(i11)).intValue());
                        Set set3 = set;
                        if ((set3 instanceof Collection) && set3.isEmpty()) {
                            linkedHashSet.add(new C4676o(((Number) listM20560a1.get(i10)).intValue(), ((Number) listM20560a1.get(i11)).intValue() + 1));
                        } else {
                            Iterator it2 = set3.iterator();
                            while (it2.hasNext()) {
                                if (AbstractC3608e.m13494a((C2363j) it2.next(), c2363j2)) {
                                    break;
                                }
                            }
                            linkedHashSet.add(new C4676o(((Number) listM20560a1.get(i10)).intValue(), ((Number) listM20560a1.get(i11)).intValue() + 1));
                        }
                    }
                    i10 = i10 != iM31894c ? i10 + 2 : 0;
                }
            }
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: b */
    public final Set m15944b(String str, Set set) {
        str.getClass();
        set.getClass();
        return m15943a(str, set);
    }
}
