package p155k6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import p139j6.AbstractC3608e;
import p139j6.C3609f;
import p170l6.C4676o;
import p172l8.C4711r;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5116y;

/* JADX INFO: renamed from: k6.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4000h {

    /* JADX INFO: renamed from: a */
    public static final C4000h f11759a = new C4000h();

    /* JADX INFO: renamed from: a */
    public final Set m15923a(String str) {
        str.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList<C4711r> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (C4711r c4711r : C3609f.f10025a.m13513m()) {
            String str2 = (String) c4711r.m18792a();
            String str3 = (String) c4711r.m18793b();
            arrayList3.addAll(AbstractC3608e.m13495b(str, str2));
            Set setM13495b = AbstractC3608e.m13495b(str, str3);
            ArrayList arrayList5 = new ArrayList(AbstractC5116y.m20814z(setM13495b, 10));
            Iterator it = setM13495b.iterator();
            while (it.hasNext()) {
                arrayList5.add(Integer.valueOf(((Number) it.next()).intValue() + str3.length()));
            }
            arrayList4.addAll(arrayList5);
        }
        int iMin = Math.min(arrayList3.size(), arrayList4.size()) - 1;
        if (iMin >= 0) {
            int i10 = 0;
            while (true) {
                arrayList2.add(new C4711r(arrayList3.get(i10), arrayList4.get(i10)));
                if (i10 == iMin) {
                    break;
                }
                i10++;
            }
        }
        for (C4711r c4711r2 : arrayList2) {
            arrayList.add(new C4676o(((Number) c4711r2.m18792a()).intValue(), ((Number) c4711r2.m18793b()).intValue()));
        }
        return AbstractC5081g0.m20564c1(arrayList);
    }
}
