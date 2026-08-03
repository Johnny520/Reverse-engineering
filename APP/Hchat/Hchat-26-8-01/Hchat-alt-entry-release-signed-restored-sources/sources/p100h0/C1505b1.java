package p100h0;

import p020b5.C0192k;
import p057e1.C0807b;
import p080fb.AbstractC1184v0;
import p089g1.C1275d;
import p117i0.C1845j1;
import p119i2.AbstractC1923e0;
import p119i2.C1939m0;
import p189n1.C2863b;
import p189n1.C2864c;
import p189n1.InterfaceC2862a;
import p190n2.C2884s;
import p321w.C4618m1;
import p321w.C4629q0;
import p321w.EnumC4599g0;
import p321w.EnumC4602h0;
import p321w.InterfaceC4647y0;

/* JADX INFO: renamed from: h0.b1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1505b1 implements InterfaceC4647y0 {

    /* JADX INFO: renamed from: b */
    public C1939m0 f5004b;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1511d1 f5006d;

    /* JADX INFO: renamed from: a */
    public boolean f5003a = true;

    /* JADX INFO: renamed from: c */
    public C1275d f5005c = C1556w.f5191d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1505b1(C1511d1 c1511d1) {
        this.f5006d = c1511d1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p321w.InterfaceC4647y0
    /* JADX INFO: renamed from: a */
    public final void mo4009a(long j3, C1275d c1275d) {
        long j4;
        C4618m1 c4618m1M9051d;
        C4618m1 c4618m1M9051d2;
        C1511d1 c1511d1 = this.f5006d;
        C1845j1 c1845j1 = c1511d1.f5045q;
        if (c1511d1.m4025k() && ((EnumC4599g0) c1845j1.getValue()) == null) {
            c1845j1.setValue(EnumC4599g0.f15158i);
            c1511d1.f5047s = -1;
            this.f5003a = true;
            this.f5005c = c1275d;
            c1511d1.m4029o();
            C4629q0 c4629q0 = c1511d1.f5032d;
            if (c4629q0 == null || (c4618m1M9051d2 = c4629q0.m9051d()) == null || !c4618m1M9051d2.m9038c(j3)) {
                j4 = j3;
                C4629q0 c4629q02 = c1511d1.f5032d;
                if (c4629q02 != null && (c4618m1M9051d = c4629q02.m9051d()) != null) {
                    int iM9037b = c4618m1M9051d.m9037b(j4, true);
                    c1511d1.f5030b.m861n(iM9037b);
                    C2884s c2884sM4018e = C1511d1.m4018e(c1511d1.m4028n().f9316a, AbstractC1923e0.m4784b(iM9037b, iM9037b));
                    c1511d1.m4022h(false);
                    InterfaceC2862a interfaceC2862a = c1511d1.f5038j;
                    if (interfaceC2862a != null) {
                        ((C2864c) interfaceC2862a).m6283a(0);
                    }
                    c1511d1.f5031c.invoke(c2884sM4018e);
                    c1511d1.f5050v = new C1939m0(c2884sM4018e.f9317b);
                }
                this.f5003a = false;
            } else {
                if (c1511d1.m4028n().f9316a.f6529h.length() == 0) {
                    return;
                }
                c1511d1.m4022h(false);
                long jM4017c = C1511d1.m4017c(c1511d1, C2884s.m6290a(c1511d1.m4028n(), null, C1939m0.f6573b, 5), j3, true, false, this.f5005c, true, new C2863b(0));
                j4 = j3;
                c1511d1.f5043o = new C1939m0(jM4017c);
                this.f5004b = new C1939m0(jM4017c);
            }
            c1511d1.m4031q(EnumC4602h0.f15180g);
            c1511d1.f5042n = j4;
            c1511d1.f5046r.setValue(new C0807b(j4));
            c1511d1.f5044p = 0L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p321w.InterfaceC4647y0
    /* JADX INFO: renamed from: b */
    public final void mo4010b() {
        m4014f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    @Override // p321w.InterfaceC4647y0
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo4013e(long j3) {
        C4618m1 c4618m1M9051d;
        long jM4017c;
        C1511d1 c1511d1 = this.f5006d;
        if (!c1511d1.m4025k() || c1511d1.m4028n().f9316a.f6529h.length() == 0) {
            return;
        }
        c1511d1.f5044p = C0807b.m2042e(c1511d1.f5044p, j3);
        C4629q0 c4629q0 = c1511d1.f5032d;
        if (c4629q0 != null && (c4618m1M9051d = c4629q0.m9051d()) != null) {
            c1511d1.f5046r.setValue(new C0807b(C0807b.m2042e(c1511d1.f5042n, c1511d1.f5044p)));
            if (c1511d1.f5043o == null) {
                C0807b c0807bM4023i = c1511d1.m4023i();
                c0807bM4023i.getClass();
                if (c4618m1M9051d.m9038c(c0807bM4023i.f2414a)) {
                    C1939m0 c1939m0 = c1511d1.f5043o;
                    int iM9037b = c1939m0 != null ? (int) (c1939m0.f6575a >> 32) : c4618m1M9051d.m9037b(c1511d1.f5042n, false);
                    C0807b c0807bM4023i2 = c1511d1.m4023i();
                    c0807bM4023i2.getClass();
                    int iM9037b2 = c4618m1M9051d.m9037b(c0807bM4023i2.f2414a, false);
                    if (c1511d1.f5043o == null && iM9037b == iM9037b2) {
                        return;
                    }
                    C2884s c2884sM4028n = c1511d1.m4028n();
                    C0807b c0807bM4023i3 = c1511d1.m4023i();
                    c0807bM4023i3.getClass();
                    jM4017c = C1511d1.m4017c(c1511d1, c2884sM4028n, c0807bM4023i3.f2414a, false, false, this.f5005c, true, new C2863b(9));
                } else {
                    C0192k c0192k = c1511d1.f5030b;
                    int iM9037b3 = c4618m1M9051d.m9037b(c1511d1.f5042n, true);
                    c0192k.m861n(iM9037b3);
                    C0192k c0192k2 = c1511d1.f5030b;
                    C0807b c0807bM4023i4 = c1511d1.m4023i();
                    c0807bM4023i4.getClass();
                    int iM9037b4 = c4618m1M9051d.m9037b(c0807bM4023i4.f2414a, true);
                    c0192k2.m861n(iM9037b4);
                    C1275d c1275d = iM9037b3 == iM9037b4 ? C1556w.f5191d : C1556w.f5192e;
                    C2884s c2884sM4028n2 = c1511d1.m4028n();
                    C0807b c0807bM4023i5 = c1511d1.m4023i();
                    c0807bM4023i5.getClass();
                    jM4017c = C1511d1.m4017c(c1511d1, c2884sM4028n2, c0807bM4023i5.f2414a, false, false, c1275d, true, new C2863b(9));
                }
                this.f5004b = new C1939m0(jM4017c);
                if (!C1939m0.m4811a(c1511d1.f5043o, jM4017c)) {
                    this.f5003a = false;
                }
            }
        }
        c1511d1.m4034t(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m4014f() {
        C1511d1 c1511d1 = this.f5006d;
        c1511d1.f5045q.setValue(null);
        c1511d1.f5046r.setValue(null);
        this.f5005c = C1556w.f5191d;
        c1511d1.m4034t(true);
        C1939m0 c1939m0 = this.f5004b;
        boolean zM4813c = C1939m0.m4813c(c1939m0 != null ? c1939m0.f6575a : c1511d1.m4028n().f9317b);
        c1511d1.m4031q(zM4813c ? EnumC4602h0.f15182i : EnumC4602h0.f15181h);
        C4629q0 c4629q0 = c1511d1.f5032d;
        if (c4629q0 != null) {
            c4629q0.f15338m.setValue(Boolean.valueOf(!zM4813c && AbstractC1184v0.m3216z(c1511d1, true)));
        }
        C4629q0 c4629q02 = c1511d1.f5032d;
        if (c4629q02 != null) {
            c4629q02.f15339n.setValue(Boolean.valueOf(!zM4813c && AbstractC1184v0.m3216z(c1511d1, false)));
        }
        C4629q0 c4629q03 = c1511d1.f5032d;
        if (c4629q03 != null) {
            c4629q03.f15340o.setValue(Boolean.valueOf(zM4813c && AbstractC1184v0.m3216z(c1511d1, true)));
        }
        if (this.f5003a) {
            C1511d1.m4016b(c1511d1, c1511d1.f5043o);
        }
        c1511d1.f5043o = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p321w.InterfaceC4647y0
    public final void onCancel() {
        m4014f();
    }

    @Override // p321w.InterfaceC4647y0
    /* JADX INFO: renamed from: c */
    public final void mo4011c() {
    }

    @Override // p321w.InterfaceC4647y0
    /* JADX INFO: renamed from: d */
    public final void mo4012d() {
    }
}
