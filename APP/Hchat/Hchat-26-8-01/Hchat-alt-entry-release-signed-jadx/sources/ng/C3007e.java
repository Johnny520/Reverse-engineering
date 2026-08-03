package ng;

import java.util.Iterator;
import p136j8.C2104o;

/* JADX INFO: renamed from: ng.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3007e implements InterfaceC3012j, InterfaceC3008f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9796a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3012j f9797b;

    /* JADX INFO: renamed from: c */
    public final int f9798c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3007e(InterfaceC3012j interfaceC3012j, int i9, int i10) {
        this.f9796a = i10;
        switch (i10) {
            case 1:
                this.f9797b = interfaceC3012j;
                this.f9798c = i9;
                if (i9 >= 0) {
                    return;
                }
                C2104o.m5279d(i9, "count must be non-negative, but was ");
                throw null;
            default:
                interfaceC3012j.getClass();
                this.f9797b = interfaceC3012j;
                this.f9798c = i9;
                if (i9 >= 0) {
                    return;
                }
                C2104o.m5279d(i9, "count must be non-negative, but was ");
                throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // ng.InterfaceC3008f
    /* JADX INFO: renamed from: a */
    public final InterfaceC3012j mo6402a(int i9) {
        switch (this.f9796a) {
            case 0:
                int i10 = this.f9798c;
                int i11 = i10 + i9;
                return i11 < 0 ? new C3007e(this, i9, 1) : new C3020r(this.f9797b, i10, i11);
            default:
                return i9 >= this.f9798c ? this : new C3007e(this.f9797b, i9, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // ng.InterfaceC3008f
    /* JADX INFO: renamed from: b */
    public final InterfaceC3012j mo6403b(int i9) {
        switch (this.f9796a) {
            case 0:
                int i10 = this.f9798c + i9;
                return i10 < 0 ? new C3007e(this, i9, 0) : new C3007e(this.f9797b, i10, 0);
            default:
                int i11 = this.f9798c;
                return i9 >= i11 ? C3009g.f9799a : new C3020r(this.f9797b, i9, i11);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // ng.InterfaceC3012j
    public final Iterator iterator() {
        switch (this.f9796a) {
            case 0:
                return new C3006d(this);
            default:
                return new C3006d(this, (byte) 0);
        }
    }
}
