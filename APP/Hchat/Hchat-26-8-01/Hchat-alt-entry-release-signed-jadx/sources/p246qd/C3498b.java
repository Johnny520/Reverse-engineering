package p246qd;

import java.util.List;
import java.util.Objects;
import p332wb.AbstractC4855en;
import p351xe.AbstractC5798s;

/* JADX INFO: renamed from: qd.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3498b extends C3501e {

    /* JADX INFO: renamed from: L */
    public final List f11366L;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3498b(String str, List list) {
        super(str);
        Objects.requireNonNull(list);
        List list2 = list;
        this.f11366L = list2;
        this.f11410a = (list2.hashCode() * 31) + str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3506j
    /* JADX INFO: renamed from: j */
    public final List mo7346j() {
        return this.f11366L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.C3501e, p246qd.AbstractC3506j
    /* JADX INFO: renamed from: s */
    public final boolean mo7344s(Object obj) {
        if (super.mo7344s(obj)) {
            return Objects.equals(this.f11366L, ((C3498b) obj).f11366L);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.C3501e, p246qd.AbstractC3506j
    public final String toString() {
        return AbstractC4855en.m9265i(this.f11369K, "<", AbstractC5798s.m10516j(this.f11366L, ", "), ">");
    }
}
