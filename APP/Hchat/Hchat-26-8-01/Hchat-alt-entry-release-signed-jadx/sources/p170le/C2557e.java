package p170le;

import be.AbstractC0283h;
import java.util.Iterator;
import java.util.List;
import md.AbstractC2828e;
import md.EnumC2824a;
import p077f8.AbstractC1089i;
import p199nd.C2969e0;
import p233pd.EnumC3400k;
import p259r9.AbstractC3754e0;
import p302ud.C4305a;
import p302ud.C4319o;
import p302ud.C4320p;
import p302ud.C4322r;
import p302ud.InterfaceC4314j;
import p302ud.InterfaceC4318n;
import p350xd.C5777d;
import p384ze.C6141c;

/* JADX INFO: renamed from: le.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2557e extends AbstractC3754e0 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC4314j f8290j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C6141c f8291k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C5777d f8292l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2557e(InterfaceC4314j interfaceC4314j, C6141c c6141c, C5777d c5777d) {
        this.f8290j = interfaceC4314j;
        this.f8291k = c6141c;
        this.f8292l = c5777d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: ud.n */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p259r9.AbstractC3754e0, ke.InterfaceC2396e
    /* JADX INFO: renamed from: b */
    public final void mo2615b(C4322r c4322r, InterfaceC4318n interfaceC4318n) {
        if (interfaceC4318n != this.f8290j) {
            InterfaceC4314j interfaceC4314j = (InterfaceC4314j) AbstractC0283h.m1126F(interfaceC4318n.mo8675u());
            if (interfaceC4314j instanceof C4305a) {
                Iterator it = ((C4305a) interfaceC4314j).f14353n.iterator();
                while (it.hasNext()) {
                    if (!this.f8291k.m10908b((C4305a) it.next())) {
                    }
                }
                return;
            }
            return;
        }
        if (((AbstractC2828e) interfaceC4318n).f9217g.mo6235a(EnumC2824a.f9135U) || AbstractC1089i.m2737L(interfaceC4318n, interfaceC4318n)) {
            return;
        }
        List listMo8675u = interfaceC4318n.mo8675u();
        C4320p c4320p = new C4320p(EnumC3400k.f10968T, 0);
        c4320p.m6231w(EnumC2824a.f9159m);
        c4320p.m6233y(new C2969e0(this.f8292l));
        listMo8675u.add(new C4319o(c4320p));
    }
}
