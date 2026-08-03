package p246qd;

import java.util.List;
import p332wb.AbstractC4855en;
import p351xe.AbstractC5798s;

/* JADX INFO: renamed from: qd.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3499c extends C3501e {

    /* JADX INFO: renamed from: L */
    public List f11367L;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3499c(String str, List list) {
        super(str);
        this.f11367L = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3506j
    /* JADX INFO: renamed from: B */
    public final void mo7347B(List list) {
        this.f11367L = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3506j
    /* JADX INFO: renamed from: i */
    public final List mo7348i() {
        return this.f11367L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.C3501e, p246qd.AbstractC3506j
    /* JADX INFO: renamed from: s */
    public final boolean mo7344s(Object obj) {
        return super.mo7344s(obj) && this.f11367L.equals(((C3499c) obj).f11367L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.C3501e, p246qd.AbstractC3506j
    public final String toString() {
        List list = this.f11367L;
        boolean zIsEmpty = list.isEmpty();
        String str = this.f11369K;
        return zIsEmpty ? str : AbstractC4855en.m9264h(str, " extends ", AbstractC5798s.m10516j(list, " & "));
    }
}
