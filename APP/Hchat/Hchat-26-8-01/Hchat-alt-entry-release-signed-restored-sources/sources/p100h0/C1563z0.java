package p100h0;

import p057e1.C0807b;
import p089g1.C1275d;
import p189n1.C2863b;
import p190n2.C2884s;
import p321w.C4618m1;
import p321w.C4629q0;
import p321w.EnumC4599g0;
import p321w.InterfaceC4647y0;

/* JADX INFO: renamed from: h0.z0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1563z0 implements InterfaceC4647y0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1511d1 f5213a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f5214b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1563z0(C1511d1 c1511d1, boolean z9) {
        this.f5213a = c1511d1;
        this.f5214b = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p321w.InterfaceC4647y0
    /* JADX INFO: renamed from: b */
    public final void mo4010b() {
        C1511d1 c1511d1 = this.f5213a;
        c1511d1.f5045q.setValue(null);
        c1511d1.f5046r.setValue(null);
        c1511d1.m4034t(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p321w.InterfaceC4647y0
    /* JADX INFO: renamed from: c */
    public final void mo4011c() {
        C1511d1 c1511d1 = this.f5213a;
        c1511d1.f5045q.setValue(null);
        c1511d1.f5046r.setValue(null);
        c1511d1.m4034t(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p321w.InterfaceC4647y0
    /* JADX INFO: renamed from: d */
    public final void mo4012d() {
        C4618m1 c4618m1M9051d;
        boolean z9 = this.f5214b;
        EnumC4599g0 enumC4599g0 = z9 ? EnumC4599g0.f15157h : EnumC4599g0.f15158i;
        C1511d1 c1511d1 = this.f5213a;
        c1511d1.f5045q.setValue(enumC4599g0);
        long jM4037a = AbstractC1522h0.m4037a(c1511d1.m4026l(z9));
        C4629q0 c4629q0 = c1511d1.f5032d;
        if (c4629q0 == null || (c4618m1M9051d = c4629q0.m9051d()) == null) {
            return;
        }
        long jM9040e = c4618m1M9051d.m9040e(jM4037a);
        c1511d1.f5042n = jM9040e;
        c1511d1.f5046r.setValue(new C0807b(jM9040e));
        c1511d1.f5044p = 0L;
        c1511d1.f5047s = -1;
        C4629q0 c4629q02 = c1511d1.f5032d;
        if (c4629q02 != null) {
            c4629q02.f15342q.setValue(Boolean.TRUE);
        }
        c1511d1.m4034t(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p321w.InterfaceC4647y0
    /* JADX INFO: renamed from: e */
    public final void mo4013e(long j3) {
        C1511d1 c1511d1 = this.f5213a;
        long jM2042e = C0807b.m2042e(c1511d1.f5044p, j3);
        c1511d1.f5044p = jM2042e;
        c1511d1.f5046r.setValue(new C0807b(C0807b.m2042e(c1511d1.f5042n, jM2042e)));
        C2884s c2884sM4028n = c1511d1.m4028n();
        C0807b c0807bM4023i = c1511d1.m4023i();
        c0807bM4023i.getClass();
        C1511d1.m4017c(c1511d1, c2884sM4028n, c0807bM4023i.f2414a, false, this.f5214b, C1556w.f5194g, true, new C2863b(9));
        c1511d1.m4034t(false);
    }

    @Override // p321w.InterfaceC4647y0
    public final void onCancel() {
    }

    @Override // p321w.InterfaceC4647y0
    /* JADX INFO: renamed from: a */
    public final void mo4009a(long j3, C1275d c1275d) {
    }
}
