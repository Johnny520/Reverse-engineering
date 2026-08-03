package p295u4;

import bsh.C0353j;
import p068eh.AbstractC0921a;
import p136j8.C2104o;
import p326w4.C4682b;
import p326w4.C4683c;
import p326w4.InterfaceC4685e;
import p376z4.C6093g;

/* JADX INFO: renamed from: u4.u */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4271u extends AbstractC4259i {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f14184k = 0;

    /* JADX INFO: renamed from: l */
    public final Object f14185l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4271u(C4268r c4268r, C4270t c4270t, C4266p c4266p, InterfaceC4685e interfaceC4685e) {
        super(c4268r, c4270t, null, c4266p);
        int i9 = c4268r.f13975e;
        if (i9 != 6) {
            C2104o.m5294t(AbstractC0921a.m2249l(i9, "opcode with invalid branchingness: "));
            throw null;
        }
        if (interfaceC4685e != null) {
            this.f14185l = interfaceC4685e;
        } else {
            C0353j.m1305c("catches == null");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static String m8593j(InterfaceC4685e interfaceC4685e) {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append("catch");
        int size = interfaceC4685e.size();
        for (int i9 = 0; i9 < size; i9++) {
            sb2.append(" ");
            sb2.append(interfaceC4685e.getType(i9).mo4901a());
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p295u4.AbstractC4259i
    /* JADX INFO: renamed from: d */
    public final void mo8553d(InterfaceC4258h interfaceC4258h) {
        switch (this.f14184k) {
            case 0:
                interfaceC4258h.mo4282x(this);
                break;
            default:
                interfaceC4258h.mo4277l(this);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p295u4.AbstractC4259i
    /* JADX INFO: renamed from: e */
    public final InterfaceC4685e mo8554e() {
        switch (this.f14184k) {
            case 0:
                return C4682b.f15591i;
            default:
                return (InterfaceC4685e) this.f14185l;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p295u4.AbstractC4259i
    /* JADX INFO: renamed from: h */
    public final String mo8552h() {
        switch (this.f14184k) {
            case 0:
                return ((C6093g) this.f14185l).toString();
            default:
                return m8593j((InterfaceC4685e) this.f14185l);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p295u4.AbstractC4259i
    /* JADX INFO: renamed from: i */
    public final AbstractC4259i mo8555i(C4683c c4683c) {
        switch (this.f14184k) {
            case 0:
                throw new UnsupportedOperationException("unsupported");
            default:
                return new C4271u(this.f13947g, this.f13948h, this.f13950j, ((InterfaceC4685e) this.f14185l).mo354d(c4683c));
        }
    }

    public C4271u(C4268r c4268r, C4270t c4270t, C4265o c4265o, C4266p c4266p, C6093g c6093g) {
        super(c4268r, c4270t, c4265o, c4266p);
        if (c4268r.f13975e != 5) {
            C2104o.m5294t("bogus branchingness");
            throw null;
        }
        if (c6093g != null) {
            this.f14185l = c6093g;
        } else {
            C0353j.m1305c("cases == null");
            throw null;
        }
    }
}
