package p155k6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import p139j6.AbstractC3608e;
import p139j6.C3609f;
import p170l6.C4676o;
import p185m8.AbstractC5081g0;

/* JADX INFO: renamed from: k6.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3997e {

    /* JADX INFO: renamed from: a */
    public static final C3997e f11756a = new C3997e();

    /* JADX INFO: renamed from: a */
    public final Set m15920a(String str) {
        str.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = C3609f.f10025a.m13503c().iterator();
        while (it.hasNext()) {
            arrayList2.addAll(AbstractC3608e.m13495b(str, (String) it.next()));
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            arrayList.add(new C4676o(iIntValue, AbstractC3608e.m13499f(str, iIntValue) + iIntValue));
        }
        return AbstractC5081g0.m20564c1(arrayList);
    }
}
