package p332wb;

import okhttp3.HttpUrl;
import p051db.C0763a;
import p051db.C0765c;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p276sf.C3967n;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: wb.yg */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5505yg implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f22169g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1231l f22170h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0765c f22171i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5505yg(int i9, C0765c c0765c, InterfaceC1231l interfaceC1231l) {
        this.f22169g = i9;
        this.f22170h = interfaceC1231l;
        this.f22171i = c0765c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f22169g) {
            case 0:
                C0765c c0765c = this.f22171i;
                this.f22170h.invoke(C0765c.m1980a(c0765c, 0, null, null, null, null, 0L, 0, null, 0, 0, false, null, 0L, 0, 0, null, 0, 0, AbstractC4166m.m8398G1(AbstractC4955ho.m9445T6(c0765c), new C0763a(0, HttpUrl.FRAGMENT_ENCODE_SET)), 0, null, 3670015));
                break;
            default:
                this.f22170h.invoke(this.f22171i);
                break;
        }
        return C3967n.f12976a;
    }
}
