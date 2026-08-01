package p319w2;

import java.util.ArrayList;
import java.util.List;
import p030c3.AbstractC1314a;
import p319w2.C9058e;

/* JADX INFO: renamed from: w2.r */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9123r {
    /* JADX INFO: renamed from: b */
    public static final List m35408b(List list, int i10, int i11) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            C9058e.d dVar = (C9058e.d) list.get(i12);
            if (AbstractC9068g.m35266j(i10, i11, dVar.m35193h(), dVar.m35191f())) {
                if (!(i10 <= dVar.m35193h() && dVar.m35191f() <= i11)) {
                    AbstractC1314a.m5291a("placeholder can not overlap with paragraph.");
                }
                arrayList.add(new C9058e.d(dVar.m35192g(), dVar.m35193h() - i10, dVar.m35191f() - i10));
            }
        }
        return arrayList;
    }
}
