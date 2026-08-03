package p311v4;

import p000a.AbstractC0000a;
import p073f4.C1064a;
import p136j8.C2104o;
import p376z4.AbstractC6096j;

/* JADX INFO: renamed from: v4.e0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4455e0 extends AbstractC6096j {

    /* JADX INFO: renamed from: h */
    public final AbstractC4446a[] f14788h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4455e0(int i9) {
        super(i9 > 1);
        if (i9 >= 1) {
            this.f14788h = new AbstractC4446a[i9];
        } else {
            C2104o.m5294t("size < 1");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final AbstractC4446a m8906l(int i9) {
        try {
            AbstractC4446a abstractC4446a = this.f14788h[i9];
            if (abstractC4446a != null) {
                return abstractC4446a;
            }
            throw new C1064a("invalid constant pool index ".concat(AbstractC0000a.m46X0(i9)), null);
        } catch (IndexOutOfBoundsException unused) {
            throw new C1064a("invalid constant pool index ".concat(AbstractC0000a.m46X0(i9)), null);
        }
    }
}
