package p246qd;

import java.util.List;
import java.util.Objects;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: qd.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3502f extends C3501e {

    /* JADX INFO: renamed from: L */
    public final C3501e f11370L;

    /* JADX INFO: renamed from: M */
    public final C3501e f11371M;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public C3502f(C3501e c3501e, C3501e c3501e2) {
        String strM9264h = AbstractC4855en.m9264h(c3501e.f11369K, "$", c3501e2.f11369K);
        super(strM9264h);
        this.f11370L = c3501e;
        this.f11371M = c3501e2;
        this.f11410a = (((c3501e2.f11410a * 31) + c3501e.f11410a) * 31) + strM9264h.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3506j
    /* JADX INFO: renamed from: j */
    public final List mo7346j() {
        return this.f11371M.mo7346j();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3506j
    /* JADX INFO: renamed from: k */
    public final AbstractC3506j mo7352k() {
        return this.f11371M;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3506j
    /* JADX INFO: renamed from: m */
    public final AbstractC3506j mo7353m() {
        return this.f11370L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.C3501e, p246qd.AbstractC3506j
    /* JADX INFO: renamed from: s */
    public final boolean mo7344s(Object obj) {
        if (!super.mo7344s(obj)) {
            return false;
        }
        C3502f c3502f = (C3502f) obj;
        return Objects.equals(this.f11370L, c3502f.f11370L) && Objects.equals(this.f11371M, c3502f.f11371M);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3506j
    /* JADX INFO: renamed from: t */
    public final boolean mo7354t() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.C3501e, p246qd.AbstractC3506j
    public final String toString() {
        return AbstractC4855en.m9264h(this.f11370L.toString(), "$", this.f11371M.toString());
    }
}
