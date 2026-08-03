package p321w;

import gg.AbstractC1416l;
import p085fg.InterfaceC1231l;
import p117i0.C1845j1;
import p117i0.C1871q;
import p117i0.C1876r1;
import p119i2.C1926g;
import p119i2.C1939m0;
import p190n2.C2874i;
import p190n2.C2884s;
import p276sf.C3967n;
import p308v1.InterfaceC4428t;

/* JADX INFO: renamed from: w.w */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4642w implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f15414g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C4629q0 f15415h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4642w(C4629q0 c4629q0, int i9) {
        this.f15414g = i9;
        this.f15415h = c4629q0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f15414g) {
            case 0:
                InterfaceC4428t interfaceC4428t = (InterfaceC4428t) obj;
                C4618m1 c4618m1M9051d = this.f15415h.m9051d();
                if (c4618m1M9051d != null) {
                    c4618m1M9051d.f15295c = interfaceC4428t;
                }
                return C3967n.f12976a;
            case 1:
                C4629q0 c4629q0 = this.f15415h;
                C1845j1 c1845j1 = c4629q0.f15345t;
                C2884s c2884s = (C2884s) obj;
                String str = c2884s.f9316a.f6529h;
                C1926g c1926g = c4629q0.f15335j;
                if (!AbstractC1416l.m3825a(str, c1926g != null ? c1926g.f6529h : null)) {
                    c4629q0.f15336k.setValue(EnumC4602h0.f15180g);
                    if (((Boolean) c1845j1.getValue()).booleanValue()) {
                        c1845j1.setValue(Boolean.FALSE);
                    } else {
                        c4629q0.f15344s.setValue(Boolean.FALSE);
                    }
                }
                long j3 = C1939m0.f6573b;
                c4629q0.m9053f(j3);
                c4629q0.m9052e(j3);
                c4629q0.f15346u.invoke(c2884s);
                C1876r1 c1876r1 = c4629q0.f15327b;
                C1871q c1871q = c1876r1.f6238a;
                if (c1871q != null) {
                    c1871q.m4606s(c1876r1, null);
                }
                return C3967n.f12976a;
            case 2:
                this.f15415h.f15343r.m795M(((C2874i) obj).f9291a);
                return C3967n.f12976a;
            case 3:
                return Boolean.valueOf(this.f15415h.f15343r.m795M(((C2874i) obj).f9291a));
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f15415h.f15342q.setValue(bool);
                return C3967n.f12976a;
        }
    }
}
