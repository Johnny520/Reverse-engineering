package p339x1;

import gg.AbstractC1417m;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p276sf.C3967n;

/* JADX INFO: renamed from: x1.l0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5622l0 extends AbstractC1417m implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AbstractC5628n0 f22906g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ long f22907h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ long f22908i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C5653v1 f22909j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5622l0(AbstractC5628n0 abstractC5628n0, long j3, long j4, C5653v1 c5653v1) {
        super(0);
        this.f22906g = abstractC5628n0;
        this.f22907h = j3;
        this.f22908i = j4;
        this.f22909j = c5653v1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        AbstractC5628n0 abstractC5628n0 = this.f22906g;
        abstractC5628n0.m10178c1().f22895g = false;
        abstractC5628n0.m10178c1().f22896h = this.f22907h;
        abstractC5628n0.m10178c1().f22897i = this.f22908i;
        InterfaceC1231l interfaceC1231lMo7612i = this.f22909j.f23044g.mo7612i();
        if (interfaceC1231lMo7612i != null) {
            interfaceC1231lMo7612i.invoke(abstractC5628n0.m10178c1());
        }
        return C3967n.f12976a;
    }
}
