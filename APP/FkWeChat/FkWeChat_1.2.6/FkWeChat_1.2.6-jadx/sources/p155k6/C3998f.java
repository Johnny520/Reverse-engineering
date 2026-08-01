package p155k6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p080f9.C2363j;
import p139j6.AbstractC3608e;
import p170l6.C4676o;

/* JADX INFO: renamed from: k6.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3998f {

    /* JADX INFO: renamed from: a */
    public static final C3998f f11757a = new C3998f();

    /* JADX INFO: renamed from: a */
    public final Set m15921a(String str, Set set, Set set2) {
        str.getClass();
        set.getClass();
        set2.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            Set setM13495b = AbstractC3608e.m13495b(str, str2);
            ArrayList arrayList = new ArrayList();
            for (Object obj : setM13495b) {
                int iIntValue = ((Number) obj).intValue();
                Set<C2363j> set3 = set2;
                if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                    for (C2363j c2363j : set3) {
                        int iM8560o = c2363j.m8560o();
                        if (iIntValue > c2363j.m8561p() || iM8560o > iIntValue) {
                        }
                    }
                }
                arrayList.add(obj);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (AbstractC3608e.m13497d(str2, str, ((Number) obj2).intValue())) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                int iIntValue2 = ((Number) it2.next()).intValue();
                linkedHashSet.add(new C4676o(iIntValue2, str2.length() + iIntValue2));
            }
        }
        return linkedHashSet;
    }
}
