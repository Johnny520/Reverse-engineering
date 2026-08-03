package p265s;

import p068eh.AbstractC0921a;
import p085fg.InterfaceC1231l;
import p201o.AbstractC3026b;
import p249qg.AbstractC3603v;
import p251r.C3626k;

/* JADX INFO: renamed from: s.t0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3858t0 implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f12648g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C3864w0 f12649h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3858t0(C3864w0 c3864w0, int i9) {
        this.f12648g = i9;
        this.f12649h = c3864w0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f12648g) {
            case 0:
                C3626k c3626k = (C3626k) this.f12649h.f12659u.invoke();
                int iM7607c = c3626k.m7607c();
                int i9 = 0;
                while (true) {
                    if (i9 >= iM7607c) {
                        i9 = -1;
                    } else if (!c3626k.m7608d(i9).equals(obj)) {
                        i9++;
                    }
                }
                return Integer.valueOf(i9);
            default:
                int iIntValue = ((Integer) obj).intValue();
                C3864w0 c3864w0 = this.f12649h;
                C3626k c3626k2 = (C3626k) c3864w0.f12659u.invoke();
                if (iIntValue < 0 || iIntValue >= c3626k2.m7607c()) {
                    StringBuilder sbM2257t = AbstractC0921a.m2257t(iIntValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                    sbM2257t.append(c3626k2.m7607c());
                    sbM2257t.append(')');
                    AbstractC3026b.m6428a(sbM2257t.toString());
                }
                AbstractC3603v.m7563q(c3864w0.m10550Y0(), null, new C3862v0(c3864w0, iIntValue, null), 3);
                return Boolean.TRUE;
        }
    }
}
