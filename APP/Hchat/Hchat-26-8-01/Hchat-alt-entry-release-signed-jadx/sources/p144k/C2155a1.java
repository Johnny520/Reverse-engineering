package p144k;

import p057e1.C0807b;
import p085fg.InterfaceC1220a;
import p276sf.C3967n;
import p308v1.InterfaceC4428t;

/* JADX INFO: renamed from: k.a1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2155a1 implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f7125g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C2158b1 f7126h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2155a1(C2158b1 c2158b1, int i9) {
        this.f7125g = i9;
        this.f7126h = c2158b1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f7125g) {
            case 0:
                this.f7126h.m5386m1();
                return C3967n.f12976a;
            case 1:
                return new C0807b(this.f7126h.f7145C);
            default:
                InterfaceC4428t interfaceC4428t = (InterfaceC4428t) this.f7126h.f7143A.getValue();
                return new C0807b(interfaceC4428t != null ? interfaceC4428t.mo8868m0(0L) : 9205357640488583168L);
        }
    }
}
