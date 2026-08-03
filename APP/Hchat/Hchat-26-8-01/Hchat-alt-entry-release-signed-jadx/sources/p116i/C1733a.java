package p116i;

import gg.C1421q;
import java.util.concurrent.CancellationException;
import p036c9.C0454k;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1231l;
import p136j8.C2104o;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: i.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1733a extends AbstractC6044i implements InterfaceC1231l {

    /* JADX INFO: renamed from: h */
    public C1766l f5762h;

    /* JADX INFO: renamed from: i */
    public C1421q f5763i;

    /* JADX INFO: renamed from: j */
    public int f5764j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C1739c f5765k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f5766l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C1806z0 f5767m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ long f5768n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1231l f5769o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1733a(C1739c c1739c, Object obj, C1806z0 c1806z0, long j3, InterfaceC1231l interfaceC1231l, InterfaceC5557c interfaceC5557c) {
        super(1, interfaceC5557c);
        this.f5765k = c1739c;
        this.f5766l = obj;
        this.f5767m = c1806z0;
        this.f5768n = j3;
        this.f5769o = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(InterfaceC5557c interfaceC5557c) {
        return new C1733a(this.f5765k, this.f5766l, this.f5767m, this.f5768n, this.f5769o, interfaceC5557c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        return ((C1733a) create((InterfaceC5557c) obj)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087 A[Catch: CancellationException -> 0x008a, TryCatch #1 {CancellationException -> 0x008a, blocks: (B:21:0x0083, B:23:0x0087, B:27:0x008e, B:26:0x008c, B:16:0x006d), top: B:35:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c A[Catch: CancellationException -> 0x008a, TryCatch #1 {CancellationException -> 0x008a, blocks: (B:21:0x0083, B:23:0x0087, B:27:0x008e, B:26:0x008c, B:16:0x006d), top: B:35:0x006d }] */
    @Override // p370yf.AbstractC6036a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C1739c c1739c;
        C1766l c1766l;
        C1421q c1421q;
        C1806z0 c1806z0 = this.f5767m;
        int i9 = this.f5764j;
        C1739c c1739c2 = this.f5765k;
        if (i9 != 0) {
            if (i9 != 1) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c1421q = this.f5763i;
            c1766l = this.f5762h;
            try {
                AbstractC1089i.m2732I0(obj);
                c1739c = c1739c2;
                EnumC1754h enumC1754h = !c1421q.f4734g ? EnumC1754h.f5861g : EnumC1754h.f5862h;
                C1739c.m4358b(c1739c);
                return new C1757i(c1766l, enumC1754h);
            } catch (CancellationException e6) {
                e = e6;
                c1739c = c1739c2;
                C1739c.m4358b(c1739c);
                throw e;
            }
        }
        AbstractC1089i.m2732I0(obj);
        try {
            c1739c2.f5786c.f5902i = (AbstractC1781q) c1739c2.f5784a.f5912a.invoke(this.f5766l);
            c1739c2.f5788e.setValue(c1806z0.f6022c);
            c1739c2.f5787d.setValue(Boolean.TRUE);
            C1766l c1766l2 = c1739c2.f5786c;
            C1766l c1766l3 = new C1766l(c1766l2.f5900g, c1766l2.f5901h.getValue(), AbstractC1742d.m4373i(c1766l2.f5902i), c1766l2.f5903j, Long.MIN_VALUE, c1766l2.f5905l);
            C1421q c1421q2 = new C1421q();
            long j3 = this.f5768n;
            C0454k c0454k = new C0454k(c1739c2, c1766l3, this.f5769o, c1421q2, 5);
            c1739c = c1739c2;
            try {
                this.f5762h = c1766l3;
                this.f5763i = c1421q2;
                this.f5764j = 1;
                Object objM4368d = AbstractC1742d.m4368d(c1766l3, c1806z0, j3, c0454k, this);
                EnumC5799a enumC5799a = EnumC5799a.f23547g;
                if (objM4368d == enumC5799a) {
                    return enumC5799a;
                }
                c1766l = c1766l3;
                c1421q = c1421q2;
                if (!c1421q.f4734g) {
                }
                C1739c.m4358b(c1739c);
                return new C1757i(c1766l, enumC1754h);
            } catch (CancellationException e7) {
                e = e7;
            }
        } catch (CancellationException e10) {
            e = e10;
            c1739c = c1739c2;
            C1739c.m4358b(c1739c);
            throw e;
        }
        C1739c.m4358b(c1739c);
        throw e;
    }
}
