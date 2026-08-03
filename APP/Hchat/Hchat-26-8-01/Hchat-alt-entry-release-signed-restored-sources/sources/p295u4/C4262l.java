package p295u4;

import p068eh.AbstractC0921a;
import p136j8.C2104o;
import p311v4.AbstractC4446a;
import p326w4.C4682b;
import p326w4.C4683c;
import p326w4.InterfaceC4685e;

/* JADX INFO: renamed from: u4.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4262l extends AbstractC4254d {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4262l(C4268r c4268r, C4270t c4270t, C4265o c4265o, C4266p c4266p, AbstractC4446a abstractC4446a) {
        super(c4268r, c4270t, c4265o, c4266p, abstractC4446a);
        int i9 = c4268r.f13975e;
        if (i9 == 1) {
            return;
        }
        C2104o.m5294t(AbstractC0921a.m2249l(i9, "opcode with invalid branchingness: "));
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p295u4.AbstractC4259i
    /* JADX INFO: renamed from: d */
    public final void mo8553d(InterfaceC4258h interfaceC4258h) {
        interfaceC4258h.mo4278m(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p295u4.AbstractC4259i
    /* JADX INFO: renamed from: e */
    public final InterfaceC4685e mo8554e() {
        return C4682b.f15591i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p295u4.AbstractC4259i
    /* JADX INFO: renamed from: i */
    public final AbstractC4259i mo8555i(C4683c c4683c) {
        throw new UnsupportedOperationException("unsupported");
    }
}
