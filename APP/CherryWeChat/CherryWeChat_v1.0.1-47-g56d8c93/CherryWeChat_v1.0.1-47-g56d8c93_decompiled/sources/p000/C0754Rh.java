package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: Rh */
/* JADX INFO: loaded from: classes.dex */
public final class C0754Rh implements InterfaceC2583ub {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2390a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2391b;

    public /* synthetic */ C0754Rh(int i, Object obj) {
        this.f2390a = i;
        this.f2391b = obj;
    }

    @Override // p000.InterfaceC2583ub
    public final void accept(Object obj) {
        switch (this.f2390a) {
            case 0:
                C0797Sh c0797Sh = (C0797Sh) obj;
                if (c0797Sh == null) {
                    c0797Sh = new C0797Sh(-3);
                }
                ((C0649P3) this.f2391b).m1281L(c0797Sh);
                return;
            default:
                C0797Sh c0797Sh2 = (C0797Sh) obj;
                synchronized (AbstractC0840Th.f2671c) {
                    try {
                        C2520sy c2520sy = AbstractC0840Th.f2672d;
                        ArrayList arrayList = (ArrayList) c2520sy.get((String) this.f2391b);
                        if (arrayList == null) {
                            return;
                        }
                        c2520sy.remove((String) this.f2391b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((InterfaceC2583ub) arrayList.get(i)).accept(c0797Sh2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
