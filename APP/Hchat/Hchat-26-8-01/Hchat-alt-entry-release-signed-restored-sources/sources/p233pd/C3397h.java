package p233pd;

import p302ud.C4320p;
import p332wb.AbstractC4855en;
import p351xe.AbstractC5792m;

/* JADX INFO: renamed from: pd.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C3397h extends AbstractC3409t {

    /* JADX INFO: renamed from: o */
    public final int f10942o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3397h(int i9) {
        this(EnumC3400k.f10987q, i9, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    /* JADX INFO: renamed from: O */
    public C4320p mo7167O() {
        C3397h c3397h = new C3397h(this.f10942o);
        m8681P(c3397h);
        return c3397h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k0 */
    public int mo7173k0() {
        return this.f10942o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    public String toString() {
        return AbstractC4855en.m9264h(super.toString(), "-> ", AbstractC5792m.m10487d(this.f10942o));
    }

    public C3397h(EnumC3400k enumC3400k, int i9, int i10) {
        super(enumC3400k, i10);
        this.f10942o = i9;
    }
}
