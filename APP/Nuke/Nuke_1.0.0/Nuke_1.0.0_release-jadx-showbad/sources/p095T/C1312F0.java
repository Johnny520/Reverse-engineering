package p095T;

import p074O2.C1052j;
import p074O2.InterfaceC1051i;
import p117X2.AbstractC1665j;
import p160f3.C2117U;
import p160f3.C2155q;
import p160f3.InterfaceC2115S;
import p160f3.InterfaceC2160t;
import p163g0.C2172d;

/* JADX INFO: renamed from: T.F0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1312F0 implements InterfaceC2160t, InterfaceC1306C0 {

    /* JADX INFO: renamed from: g */
    public static final C1361g f4685g = new C1361g();

    /* JADX INFO: renamed from: d */
    public final InterfaceC1051i f4686d;

    /* JADX INFO: renamed from: e */
    public final C1312F0 f4687e = this;

    /* JADX INFO: renamed from: f */
    public volatile InterfaceC1051i f4688f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1312F0(InterfaceC1051i interfaceC1051i) {
        this.f4686d = interfaceC1051i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m2414b() {
        synchronized (this.f4687e) {
            try {
                InterfaceC1051i interfaceC1051i = this.f4688f;
                if (interfaceC1051i == null) {
                    this.f4688f = f4685g;
                } else {
                    C1321K c1321k = new C1321K(0);
                    InterfaceC2115S interfaceC2115S = (InterfaceC2115S) interfaceC1051i.mo1166C(C2155q.f7102e);
                    if (interfaceC2115S != null) {
                        interfaceC2115S.mo3905c(c1321k);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.InterfaceC1306C0
    /* JADX INFO: renamed from: d */
    public final void mo2402d() {
        m2414b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.InterfaceC1306C0
    /* JADX INFO: renamed from: e */
    public final void mo2403e() {
        m2414b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p160f3.InterfaceC2160t
    /* JADX INFO: renamed from: f */
    public final InterfaceC1051i mo1202f() {
        InterfaceC1051i interfaceC1051iMo1168m;
        InterfaceC1051i interfaceC1051i = this.f4688f;
        if (interfaceC1051i == null || interfaceC1051i == f4685g) {
            C2172d c2172d = (C2172d) this.f4686d.mo1166C(C2172d.f7131e);
            InterfaceC1051i c1310e0 = c2172d != null ? new C1310E0(c2172d, this) : C1052j.f3286d;
            synchronized (this.f4687e) {
                try {
                    InterfaceC1051i interfaceC1051i2 = this.f4688f;
                    if (interfaceC1051i2 == null) {
                        InterfaceC1051i interfaceC1051i3 = this.f4686d;
                        interfaceC1051iMo1168m = interfaceC1051i3.mo1168m(new C2117U((InterfaceC2115S) interfaceC1051i3.mo1166C(C2155q.f7102e))).mo1168m(C1052j.f3286d).mo1168m(c1310e0);
                    } else if (interfaceC1051i2 == f4685g) {
                        InterfaceC1051i interfaceC1051i4 = this.f4686d;
                        C2117U c2117u = new C2117U((InterfaceC2115S) interfaceC1051i4.mo1166C(C2155q.f7102e));
                        c2117u.m3945y(new C1321K(0));
                        interfaceC1051iMo1168m = interfaceC1051i4.mo1168m(c2117u).mo1168m(C1052j.f3286d).mo1168m(c1310e0);
                    } else {
                        interfaceC1051iMo1168m = interfaceC1051i2;
                    }
                    this.f4688f = interfaceC1051iMo1168m;
                } catch (Throwable th) {
                    throw th;
                }
            }
            interfaceC1051i = interfaceC1051iMo1168m;
        }
        AbstractC1665j.m2982b(interfaceC1051i);
        return interfaceC1051i;
    }

    @Override // p095T.InterfaceC1306C0
    /* JADX INFO: renamed from: a */
    public final void mo2401a() {
    }
}
