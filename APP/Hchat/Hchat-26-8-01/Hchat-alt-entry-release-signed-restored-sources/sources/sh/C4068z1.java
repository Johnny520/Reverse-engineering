package sh;

import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p116i.AbstractC1742d;
import p116i.C1739c;
import p116i.C1785r0;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: sh.z1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4068z1 extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f13489h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f13490i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C1739c f13491j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C1739c f13492k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4068z1(boolean z9, C1739c c1739c, C1739c c1739c2, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f13490i = z9;
        this.f13491j = c1739c;
        this.f13492k = c1739c2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        C4068z1 c4068z1 = new C4068z1(this.f13490i, this.f13491j, this.f13492k, interfaceC5557c);
        c4068z1.f13489h = obj;
        return c4068z1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        C4068z1 c4068z1 = (C4068z1) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2);
        C3967n c3967n = C3967n.f12976a;
        c4068z1.invokeSuspend(c3967n);
        return c3967n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) this.f13489h;
        AbstractC1089i.m2732I0(obj);
        C1739c c1739c = this.f13492k;
        boolean z9 = this.f13490i;
        C1739c c1739c2 = this.f13491j;
        if (z9) {
            double d10 = 6.283185307179586d / ((double) 0.3f);
            C1785r0 c1785r0M4379o = AbstractC1742d.m4379o(1.0f, (float) (d10 * d10), null, 4);
            AbstractC3603v.m7563q(interfaceC3599t, null, new C4065y1(c1739c2, c1785r0M4379o, null, 0), 3);
            AbstractC3603v.m7563q(interfaceC3599t, null, new C4065y1(c1739c, c1785r0M4379o, null, 1), 3);
        } else {
            double d11 = 6.283185307179586d / ((double) 0.15f);
            C1785r0 c1785r0M4379o2 = AbstractC1742d.m4379o(1.0f, (float) (d11 * d11), null, 4);
            AbstractC3603v.m7563q(interfaceC3599t, null, new C4065y1(c1739c2, c1785r0M4379o2, null, 2), 3);
            AbstractC3603v.m7563q(interfaceC3599t, null, new C4065y1(c1739c, c1785r0M4379o2, null, 3), 3);
        }
        return C3967n.f12976a;
    }
}
