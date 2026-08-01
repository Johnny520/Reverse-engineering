package p139j6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p024b9.AbstractC1061t;
import p139j6.AbstractC3606c;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5116y;
import p299ub.AbstractC8621f0;

/* JADX INFO: renamed from: j6.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3605b {

    /* JADX INFO: renamed from: a */
    public static final C3605b f10017a = new C3605b();

    /* JADX INFO: renamed from: a */
    public final AbstractC3606c m13486a(String str, String str2) {
        str.getClass();
        str2.getClass();
        List listM13488c = m13488c(str);
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(listM13488c, 10));
        Iterator it = listM13488c.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC8621f0.m33161r1((String) it.next()).toString());
        }
        List listM13488c2 = m13488c(str2);
        ArrayList arrayList2 = new ArrayList(AbstractC5116y.m20814z(listM13488c2, 10));
        Iterator it2 = listM13488c2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(AbstractC8621f0.m33161r1((String) it2.next()).toString());
        }
        return arrayList.size() == arrayList2.size() ? AbstractC1061t.m3842c(arrayList, arrayList2) ? AbstractC3606c.d.f10021a : AbstractC3606c.b.f10019a : arrayList.size() < arrayList2.size() ? new AbstractC3606c.c(m13487b(arrayList, arrayList2, true)) : new AbstractC3606c.a(m13487b(arrayList, arrayList2, false));
    }

    /* JADX INFO: renamed from: b */
    public final String m13487b(List list, List list2, boolean z10) {
        return AbstractC5081g0.m20585s0(z10 ? AbstractC5081g0.m20529A0(list2, list) : AbstractC5081g0.m20529A0(list, list2), " ", null, null, 0, null, null, 62, null);
    }

    /* JADX INFO: renamed from: c */
    public final List m13488c(String str) {
        List listM33112S0 = AbstractC8621f0.m33112S0(str, new String[]{"\n"}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(listM33112S0, 10));
        Iterator it = listM33112S0.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC8621f0.m33112S0((String) it.next(), new String[]{" "}, false, 0, 6, null));
        }
        return AbstractC5116y.m20813B(arrayList);
    }
}
