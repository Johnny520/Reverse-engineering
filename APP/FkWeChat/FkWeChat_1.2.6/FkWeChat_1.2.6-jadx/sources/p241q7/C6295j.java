package p241q7;

import java.util.ArrayList;
import java.util.List;
import p024b9.AbstractC1061t;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5116y;
import p228p8.InterfaceC5976f;
import p241q7.AbstractC6301m;
import p376zd.C10010p0;
import p376zd.C9987e;

/* JADX INFO: renamed from: q7.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6295j extends AbstractC6299l {

    /* JADX INFO: renamed from: a */
    public final List f19748a;

    /* JADX INFO: renamed from: b */
    public final AbstractC6301m.c f19749b;

    public C6295j(String str) {
        str.getClass();
        List<C6280b0> listM24867c = C6278a0.f19679b.m24871d(str).m24867c();
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(listM24867c, 10));
        for (C6280b0 c6280b0 : listM24867c) {
            if (c6280b0.m24874c() != EnumC6282c0.f19688q) {
                C9987e.m38645a("rootPath should be constant, no wildcards supported.");
                throw null;
            }
            arrayList.add(c6280b0.m24875d());
        }
        this.f19748a = arrayList;
        this.f19749b = new AbstractC6301m.c(1.0d, null, arrayList.size(), 2, null);
    }

    @Override // p241q7.AbstractC6299l
    /* JADX INFO: renamed from: a */
    public Object mo24864a(C6294i0 c6294i0, int i10, InterfaceC5976f interfaceC5976f) {
        if (i10 != 0) {
            C10010p0.m38820a("Root selector should be evaluated first.");
            return null;
        }
        if (this.f19748a.isEmpty()) {
            return AbstractC6301m.f19755b.m24917a();
        }
        List list = this.f19748a;
        List listM24897e = c6294i0.m24897e();
        if (listM24897e.size() < list.size()) {
            return AbstractC6301m.f19755b.m24920d();
        }
        int size = list.size() + i10;
        while (i10 < size) {
            if (!AbstractC1061t.m3842c(listM24897e.get(i10), list.get(i10))) {
                return AbstractC6301m.f19755b.m24920d();
            }
            i10++;
        }
        return this.f19749b;
    }

    public String toString() {
        return AbstractC5081g0.m20585s0(this.f19748a, "/", null, null, 0, null, null, 62, null);
    }
}
