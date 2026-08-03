package p308v1;

import gg.AbstractC1417m;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1863o;
import p276sf.C3967n;
import p339x1.C5602f0;

/* JADX INFO: renamed from: v1.i1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4398i1 extends AbstractC1417m implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f14645g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C4401j1 f14646h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4398i1(C4401j1 c4401j1, int i9) {
        super(2);
        this.f14645g = i9;
        this.f14646h = c4401j1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14645g) {
            case 0:
                this.f14646h.m8855a().f14649h = (AbstractC1863o) obj2;
                break;
            case 1:
                C4400j0 c4400j0M8855a = this.f14646h.m8855a();
                ((C5602f0) obj).m10029c0(new C4388f0(c4400j0M8855a, (InterfaceC1235p) obj2, c4400j0M8855a.f14663v));
                break;
            default:
                C5602f0 c5602f0 = (C5602f0) obj;
                C4401j1 c4401j1 = this.f14646h;
                InterfaceC4407l1 interfaceC4407l1 = c4401j1.f14664a;
                C4400j0 c4400j0 = c5602f0.f22780N;
                if (c4400j0 == null) {
                    c4400j0 = new C4400j0(c5602f0, interfaceC4407l1);
                    c5602f0.f22780N = c4400j0;
                }
                c4401j1.f14665b = c4400j0;
                c4401j1.m8855a().m8848h();
                C4400j0 c4400j0M8855a2 = c4401j1.m8855a();
                if (c4400j0M8855a2.f14650i != interfaceC4407l1) {
                    c4400j0M8855a2.f14650i = interfaceC4407l1;
                    c4400j0M8855a2.m8849i(false);
                    C5602f0.m10001V(c4400j0M8855a2.f14648g, false, 7);
                }
                break;
        }
        return C3967n.f12976a;
    }
}
