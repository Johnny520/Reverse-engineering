package sh;

import p071f1.C1034w;
import p071f1.InterfaceC0998d0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p101h1.InterfaceC1567d;
import p116i.C1739c;
import p117i0.C1829f1;
import p276sf.C3967n;

/* JADX INFO: renamed from: sh.a0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3987a0 implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f13028g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ long f13029h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f13030i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f13031j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3987a0(long j3, C1829f1 c1829f1, C1739c c1739c) {
        this.f13029h = j3;
        this.f13030i = c1829f1;
        this.f13031j = c1739c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f13028g) {
            case 0:
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f13030i;
                InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) this.f13031j;
                InterfaceC0998d0 interfaceC0998d0 = (InterfaceC0998d0) obj;
                interfaceC0998d0.getClass();
                float fFloatValue = (((Number) interfaceC1220a.invoke()).floatValue() * 0.85f) + 0.15f;
                interfaceC0998d0.mo2547q(fFloatValue);
                interfaceC0998d0.mo2541i(fFloatValue);
                interfaceC0998d0.mo2544n(((Number) interfaceC1220a2.invoke()).floatValue());
                interfaceC0998d0.mo2531H0(this.f13029h);
                break;
            default:
                C1829f1 c1829f1 = (C1829f1) this.f13030i;
                C1739c c1739c = (C1739c) this.f13031j;
                InterfaceC1567d interfaceC1567d = (InterfaceC1567d) obj;
                interfaceC1567d.getClass();
                long j3 = this.f13029h;
                InterfaceC1567d.m4087Z(interfaceC1567d, C1034w.m2634b(j3, ((Number) c1739c.m4360d()).floatValue() * c1829f1.m4488g() * C1034w.m2636d(j3)), 0L, 0.0f, 0, 126);
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C3987a0(InterfaceC1220a interfaceC1220a, InterfaceC1220a interfaceC1220a2, long j3) {
        this.f13030i = interfaceC1220a;
        this.f13031j = interfaceC1220a2;
        this.f13029h = j3;
    }
}
