package ng;

import java.util.Iterator;
import p068eh.AbstractC0921a;
import p069f.C0939i0;
import p136j8.C2104o;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: ng.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3020r implements InterfaceC3012j, InterfaceC3008f {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3012j f9817a;

    /* JADX INFO: renamed from: b */
    public final int f9818b;

    /* JADX INFO: renamed from: c */
    public final int f9819c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3020r(InterfaceC3012j interfaceC3012j, int i9, int i10) {
        interfaceC3012j.getClass();
        this.f9817a = interfaceC3012j;
        this.f9818b = i9;
        this.f9819c = i10;
        if (i9 < 0) {
            C2104o.m5291q(AbstractC0921a.m2249l(i9, "startIndex should be non-negative, but is "));
            throw null;
        }
        if (i10 < 0) {
            C2104o.m5291q(AbstractC0921a.m2249l(i10, "endIndex should be non-negative, but is "));
            throw null;
        }
        if (i10 >= i9) {
            return;
        }
        C2104o.m5291q(AbstractC3199a.m6837j(i10, "endIndex should be not less than startIndex, but was ", " < ", i9));
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // ng.InterfaceC3008f
    /* JADX INFO: renamed from: a */
    public final InterfaceC3012j mo6402a(int i9) {
        int i10 = this.f9819c;
        int i11 = this.f9818b;
        return i9 >= i10 - i11 ? this : new C3020r(this.f9817a, i11, i9 + i11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // ng.InterfaceC3008f
    /* JADX INFO: renamed from: b */
    public final InterfaceC3012j mo6403b(int i9) {
        int i10 = this.f9819c;
        int i11 = this.f9818b;
        return i9 >= i10 - i11 ? C3009g.f9799a : new C3020r(this.f9817a, i11 + i9, i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // ng.InterfaceC3012j
    public final Iterator iterator() {
        return new C0939i0(this);
    }
}
