package p295u4;

import bsh.C0353j;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.C2104o;
import p311v4.AbstractC4446a;
import p311v4.C4451c0;
import p326w4.C4683c;
import p326w4.InterfaceC4685e;

/* JADX INFO: renamed from: u4.v */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4272v extends AbstractC4254d {

    /* JADX INFO: renamed from: l */
    public final InterfaceC4685e f14186l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4272v(C4268r c4268r, C4270t c4270t, C4266p c4266p, InterfaceC4685e interfaceC4685e, AbstractC4446a abstractC4446a) {
        super(c4268r, c4270t, null, c4266p, abstractC4446a);
        int i9 = c4268r.f13975e;
        if (i9 != 6) {
            C2104o.m5294t(AbstractC0921a.m2249l(i9, "opcode with invalid branchingness: "));
            throw null;
        }
        if (interfaceC4685e != null) {
            this.f14186l = interfaceC4685e;
        } else {
            C0353j.m1305c("catches == null");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p295u4.AbstractC4259i
    /* JADX INFO: renamed from: d */
    public final void mo8553d(InterfaceC4258h interfaceC4258h) {
        interfaceC4258h.mo4271e(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p295u4.AbstractC4259i
    /* JADX INFO: renamed from: e */
    public final InterfaceC4685e mo8554e() {
        return this.f14186l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p295u4.AbstractC4254d, p295u4.AbstractC4259i
    /* JADX INFO: renamed from: h */
    public final String mo8552h() {
        AbstractC4446a abstractC4446a = this.f13935k;
        String strMo4901a = abstractC4446a.mo4901a();
        if (abstractC4446a instanceof C4451c0) {
            strMo4901a = ((C4451c0) abstractC4446a).m8901l();
        }
        StringBuilder sbM1025n = AbstractC0255e.m1025n(strMo4901a, " ");
        sbM1025n.append(C4271u.m8593j(this.f14186l));
        return sbM1025n.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p295u4.AbstractC4259i
    /* JADX INFO: renamed from: i */
    public final AbstractC4259i mo8555i(C4683c c4683c) {
        return new C4272v(this.f13947g, this.f13948h, this.f13950j, this.f14186l.mo354d(c4683c), this.f13935k);
    }
}
