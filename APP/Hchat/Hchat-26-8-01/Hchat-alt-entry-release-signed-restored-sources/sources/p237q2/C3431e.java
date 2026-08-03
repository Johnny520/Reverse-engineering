package p237q2;

import p071f1.AbstractC1022p0;
import p071f1.AbstractC1027s;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p276sf.C3967n;

/* JADX INFO: renamed from: q2.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3431e implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f11111g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ long f11112h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f11113i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3431e(Object obj, long j3, int i9) {
        this.f11111g = i9;
        this.f11113i = obj;
        this.f11112h = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f11111g) {
            case 0:
                return ((AbstractC1022p0) ((AbstractC1027s) this.f11113i)).mo2592b(this.f11112h);
            default:
                ((InterfaceC1231l) this.f11113i).invoke(Long.valueOf(this.f11112h));
                return C3967n.f12976a;
        }
    }
}
