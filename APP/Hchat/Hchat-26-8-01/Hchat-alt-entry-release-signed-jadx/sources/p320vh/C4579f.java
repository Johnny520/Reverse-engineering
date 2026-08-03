package p320vh;

import gg.AbstractC1416l;
import p085fg.InterfaceC1220a;
import p117i0.AbstractC1874r;
import p117i0.C1845j1;
import p119i2.C1941n0;
import p177m2.InterfaceC2760d;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;
import p321w.AbstractC4582a1;

/* JADX INFO: renamed from: vh.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4579f {

    /* JADX INFO: renamed from: a */
    public EnumC4243m f15082a;

    /* JADX INFO: renamed from: b */
    public long f15083b;

    /* JADX INFO: renamed from: c */
    public Object f15084c;

    /* JADX INFO: renamed from: d */
    public Object f15085d;

    /* JADX INFO: renamed from: e */
    public Object f15086e;

    /* JADX INFO: renamed from: f */
    public Object f15087f;

    /* JADX INFO: renamed from: g */
    public final Object f15088g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4579f(EnumC4243m enumC4243m, InterfaceC4233c interfaceC4233c, InterfaceC2760d interfaceC2760d, C1941n0 c1941n0, Object obj) {
        this.f15082a = enumC4243m;
        this.f15084c = interfaceC4233c;
        this.f15085d = interfaceC2760d;
        this.f15086e = c1941n0;
        this.f15087f = obj;
        this.f15088g = AbstractC1874r.m4639u(Boolean.TRUE);
        this.f15083b = AbstractC4582a1.m9025a((C1941n0) this.f15086e, (InterfaceC4233c) this.f15084c, (InterfaceC2760d) this.f15085d, AbstractC4582a1.f15098a, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m9024a(C4579f c4579f, EnumC4243m enumC4243m, InterfaceC4233c interfaceC4233c, C1941n0 c1941n0, int i9) {
        if ((i9 & 1) != 0) {
            enumC4243m = c4579f.f15082a;
        }
        if ((i9 & 2) != 0) {
            interfaceC4233c = (InterfaceC4233c) c4579f.f15084c;
        }
        InterfaceC2760d interfaceC2760d = (InterfaceC2760d) c4579f.f15085d;
        if ((i9 & 8) != 0) {
            c1941n0 = (C1941n0) c4579f.f15086e;
        }
        Object obj = c4579f.f15087f;
        EnumC4243m enumC4243m2 = c4579f.f15082a;
        C1845j1 c1845j1 = (C1845j1) c4579f.f15088g;
        if (enumC4243m == enumC4243m2 && AbstractC1416l.m3825a(interfaceC4233c, (InterfaceC4233c) c4579f.f15084c) && AbstractC1416l.m3825a(interfaceC2760d, (InterfaceC2760d) c4579f.f15085d) && AbstractC1416l.m3825a(c1941n0, (C1941n0) c4579f.f15086e)) {
            if (AbstractC1416l.m3825a(obj, c4579f.f15087f)) {
                return;
            }
            c4579f.f15087f = obj;
            c1845j1.setValue(Boolean.TRUE);
            return;
        }
        c4579f.f15082a = enumC4243m;
        c4579f.f15084c = interfaceC4233c;
        c4579f.f15085d = interfaceC2760d;
        c4579f.f15086e = c1941n0;
        c1845j1.setValue(Boolean.TRUE);
    }

    public C4579f(InterfaceC1220a interfaceC1220a) {
        interfaceC1220a.getClass();
        this.f15084c = interfaceC1220a;
        this.f15083b = 9205357640488583168L;
        this.f15088g = new C4578e(this, 0);
    }
}
