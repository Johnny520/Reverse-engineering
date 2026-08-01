package la;

import java.util.ArrayList;
import java.util.List;
import p143ja.C3785r;
import p143ja.C3788u;
import p185m8.AbstractC5114x;
import p185m8.AbstractC5116y;

/* JADX INFO: renamed from: la.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4728h {

    /* JADX INFO: renamed from: a */
    public final List f14010a;

    public C4728h(C3788u c3788u) {
        c3788u.getClass();
        List listM14994A = c3788u.m14994A();
        if (c3788u.m14995B()) {
            int iM14998x = c3788u.m14998x();
            List listM14994A2 = c3788u.m14994A();
            listM14994A2.getClass();
            ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(listM14994A2, 10));
            int i10 = 0;
            for (Object obj : listM14994A2) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC5114x.m20810y();
                }
                C3785r c3785rM14868q = (C3785r) obj;
                if (i10 >= iM14998x) {
                    c3785rM14868q = c3785rM14868q.mo13992c().m14863G(true).build();
                }
                arrayList.add(c3785rM14868q);
                i10 = i11;
            }
            listM14994A = arrayList;
        }
        listM14994A.getClass();
        this.f14010a = listM14994A;
    }

    /* JADX INFO: renamed from: a */
    public final C3785r m18894a(int i10) {
        return (C3785r) this.f14010a.get(i10);
    }
}
