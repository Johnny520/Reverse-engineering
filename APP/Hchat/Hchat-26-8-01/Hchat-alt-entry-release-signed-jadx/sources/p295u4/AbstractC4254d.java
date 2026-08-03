package p295u4;

import bsh.C0353j;
import p311v4.AbstractC4446a;

/* JADX INFO: renamed from: u4.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4254d extends AbstractC4259i {

    /* JADX INFO: renamed from: k */
    public final AbstractC4446a f13935k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC4254d(C4268r c4268r, C4270t c4270t, C4265o c4265o, C4266p c4266p, AbstractC4446a abstractC4446a) {
        super(c4268r, c4270t, c4265o, c4266p);
        if (abstractC4446a != null) {
            this.f13935k = abstractC4446a;
        } else {
            C0353j.m1305c("cst == null");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p295u4.AbstractC4259i
    /* JADX INFO: renamed from: h */
    public String mo8552h() {
        return this.f13935k.mo4901a();
    }
}
