package p155k6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import p139j6.AbstractC3608e;
import p139j6.C3609f;
import p170l6.C4676o;
import p185m8.AbstractC5081g0;
import p299ub.AbstractC8625h0;
import sb.AbstractC7294t;

/* JADX INFO: renamed from: k6.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3999g {

    /* JADX INFO: renamed from: a */
    public static final C3999g f11758a = new C3999g();

    /* JADX INFO: renamed from: a */
    public final Set m15922a(String str) {
        str.getClass();
        ArrayList arrayList = new ArrayList();
        Set setM28910R = AbstractC7294t.m28910R(AbstractC8625h0.m33175u1(str));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : setM28910R) {
            if (C3609f.f10025a.m13512l().contains(String.valueOf(((Character) obj).charValue()))) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Iterator it2 = AbstractC3608e.m13495b(str, String.valueOf(((Character) it.next()).charValue())).iterator();
            while (it2.hasNext()) {
                int iIntValue = ((Number) it2.next()).intValue();
                arrayList.add(new C4676o(iIntValue, iIntValue + 1));
            }
        }
        return AbstractC5081g0.m20564c1(arrayList);
    }
}
