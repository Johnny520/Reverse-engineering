package p247qe;

import java.util.Objects;
import p025bc.AbstractC0255e;
import p246qd.AbstractC3506j;
import p281t3.AbstractC4106c;

/* JADX INFO: renamed from: qe.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3524g implements InterfaceC3521d {

    /* JADX INFO: renamed from: a */
    public final int f11464a;

    /* JADX INFO: renamed from: b */
    public final AbstractC3506j f11465b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3524g(int i9, int i10, AbstractC3506j abstractC3506j) {
        this.f11464a = i9;
        this.f11465b = abstractC3506j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p247qe.InterfaceC3521d
    /* JADX INFO: renamed from: b */
    public final int mo7424b() {
        return this.f11464a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3524g.class != obj.getClass()) {
            return false;
        }
        C3524g c3524g = (C3524g) obj;
        return this.f11464a == c3524g.f11464a && Objects.equals(this.f11465b, c3524g.f11465b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p247qe.InterfaceC3521d
    public final AbstractC3506j getType() {
        return this.f11465b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Objects.hash(AbstractC4106c.m8278a(this.f11464a), this.f11465b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int i9 = this.f11464a;
        return AbstractC0255e.m1022k("{", i9 != 1 ? i9 != 2 ? "null" : "USE" : "ASSIGN", ": ", String.valueOf(this.f11465b), "}");
    }
}
