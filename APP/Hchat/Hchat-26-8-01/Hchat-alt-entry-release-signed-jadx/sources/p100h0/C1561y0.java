package p100h0;

import p020b5.C0192k;
import p057e1.C0807b;
import p089g1.C1275d;
import p119i2.AbstractC1923e0;
import p119i2.C1939m0;
import p189n1.C2864c;
import p189n1.InterfaceC2862a;
import p321w.C4618m1;
import p321w.C4629q0;
import p321w.EnumC4599g0;
import p321w.InterfaceC4647y0;

/* JADX INFO: renamed from: h0.y0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1561y0 implements InterfaceC4647y0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1511d1 f5209a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1561y0(C1511d1 c1511d1) {
        this.f5209a = c1511d1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p321w.InterfaceC4647y0
    /* JADX INFO: renamed from: a */
    public final void mo4009a(long j3, C1275d c1275d) {
        C4618m1 c4618m1M9051d;
        C1511d1 c1511d1 = this.f5209a;
        long jM4037a = AbstractC1522h0.m4037a(c1511d1.m4026l(true));
        C4629q0 c4629q0 = c1511d1.f5032d;
        if (c4629q0 == null || (c4618m1M9051d = c4629q0.m9051d()) == null) {
            return;
        }
        long jM9040e = c4618m1M9051d.m9040e(jM4037a);
        c1511d1.f5042n = jM9040e;
        c1511d1.f5046r.setValue(new C0807b(jM9040e));
        c1511d1.f5044p = 0L;
        c1511d1.f5045q.setValue(EnumC4599g0.f15156g);
        c1511d1.m4034t(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p321w.InterfaceC4647y0
    /* JADX INFO: renamed from: b */
    public final void mo4010b() {
        C1511d1 c1511d1 = this.f5209a;
        c1511d1.f5045q.setValue(null);
        c1511d1.f5046r.setValue(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p321w.InterfaceC4647y0
    /* JADX INFO: renamed from: c */
    public final void mo4011c() {
        C1511d1 c1511d1 = this.f5209a;
        c1511d1.f5045q.setValue(null);
        c1511d1.f5046r.setValue(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p321w.InterfaceC4647y0
    /* JADX INFO: renamed from: e */
    public final void mo4013e(long j3) {
        C4618m1 c4618m1M9051d;
        InterfaceC2862a interfaceC2862a;
        C1511d1 c1511d1 = this.f5209a;
        c1511d1.f5044p = C0807b.m2042e(c1511d1.f5044p, j3);
        C4629q0 c4629q0 = c1511d1.f5032d;
        if (c4629q0 == null || (c4618m1M9051d = c4629q0.m9051d()) == null) {
            return;
        }
        c1511d1.f5046r.setValue(new C0807b(C0807b.m2042e(c1511d1.f5042n, c1511d1.f5044p)));
        C0192k c0192k = c1511d1.f5030b;
        C0807b c0807bM4023i = c1511d1.m4023i();
        c0807bM4023i.getClass();
        int iM9037b = c4618m1M9051d.m9037b(c0807bM4023i.f2414a, true);
        c0192k.m861n(iM9037b);
        long jM4784b = AbstractC1923e0.m4784b(iM9037b, iM9037b);
        if (C1939m0.m4812b(jM4784b, c1511d1.m4028n().f9317b)) {
            return;
        }
        C4629q0 c4629q02 = c1511d1.f5032d;
        if ((c4629q02 == null || ((Boolean) c4629q02.f15342q.getValue()).booleanValue()) && (interfaceC2862a = c1511d1.f5038j) != null) {
            ((C2864c) interfaceC2862a).m6283a(9);
        }
        c1511d1.f5031c.invoke(C1511d1.m4018e(c1511d1.m4028n().f9316a, jM4784b));
        c1511d1.f5050v = new C1939m0(jM4784b);
    }

    @Override // p321w.InterfaceC4647y0
    /* JADX INFO: renamed from: d */
    public final void mo4012d() {
    }

    @Override // p321w.InterfaceC4647y0
    public final void onCancel() {
    }
}
