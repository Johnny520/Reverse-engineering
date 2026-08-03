package p174m;

import okio.C3193a;
import p041d1.C0653b0;
import p041d1.C0670p;
import p041d1.EnumC0680z;
import p085fg.InterfaceC1220a;
import p339x1.AbstractC5618k;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;

/* JADX INFO: renamed from: m.c2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2584c2 implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f8377g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C2609h2 f8378h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2584c2(C2609h2 c2609h2, int i9) {
        this.f8377g = i9;
        this.f8378h = c2609h2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f8377g) {
            case 0:
                return Boolean.valueOf(this.f8378h.f23801t);
            default:
                C0653b0 c0653b0 = this.f8378h.f8461V;
                if (!c0653b0.f23788g.f23801t) {
                    return null;
                }
                EnumC0680z enumC0680zM1803p1 = c0653b0.m1803p1();
                int iOrdinal = enumC0680zM1803p1.ordinal();
                if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        return null;
                    }
                    C3193a.m6822k();
                    return null;
                }
                if (enumC0680zM1803p1.m1860a()) {
                    return c0653b0.m1800n1(null);
                }
                C0653b0 c0653b0M1848f = ((C0670p) ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5618k.m10168x(c0653b0)).getFocusOwner()).m1848f();
                if (c0653b0M1848f != null) {
                    return c0653b0M1848f.m1800n1(AbstractC5618k.m10166v(c0653b0));
                }
                return null;
        }
    }
}
