package th;

import androidx.lifecycle.C0119x;
import p020b5.C0184c;
import p085fg.InterfaceC1231l;
import p101h1.InterfaceC1567d;
import p118i1.C1902b;
import p219oh.AbstractC3165h;
import p276sf.C3967n;
import p293u2.InterfaceC4233c;

/* JADX INFO: renamed from: th.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4214f implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC4233c f13828g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ float f13829h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1902b f13830i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4214f(InterfaceC4233c interfaceC4233c, float f3, C1902b c1902b) {
        this.f13828g = interfaceC4233c;
        this.f13829h = f3;
        this.f13830i = c1902b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        InterfaceC1567d interfaceC1567d = (InterfaceC1567d) obj;
        interfaceC1567d.getClass();
        InterfaceC4233c interfaceC4233cM822s = interfaceC1567d.mo4081z0().m822s();
        interfaceC1567d.mo4081z0().m800R(this.f13828g);
        try {
            float f3 = this.f13829h;
            C0184c c0184cMo4081z0 = interfaceC1567d.mo4081z0();
            long jM825v = c0184cMo4081z0.m825v();
            c0184cMo4081z0.m819p().mo2487e();
            try {
                ((C0119x) c0184cMo4081z0.f469a).m587S(f3, f3, 0L);
                AbstractC3165h.m6794u(interfaceC1567d, this.f13830i);
                interfaceC1567d.mo4081z0().m800R(interfaceC4233cM822s);
                return C3967n.f12976a;
            } finally {
                c0184cMo4081z0.m819p().mo2497p();
                c0184cMo4081z0.m803U(jM825v);
            }
        } catch (Throwable th2) {
            interfaceC1567d.mo4081z0().m800R(interfaceC4233cM822s);
            throw th2;
        }
    }
}
