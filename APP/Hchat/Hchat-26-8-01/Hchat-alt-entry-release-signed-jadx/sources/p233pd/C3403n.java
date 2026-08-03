package p233pd;

import gf.C1402a;
import mh.InterfaceC2844b;
import p215od.C3131d;
import p246qd.AbstractC3506j;
import p246qd.AbstractC3508l;
import p246qd.C3514r;
import p302ud.C4320p;

/* JADX INFO: renamed from: pd.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C3403n extends AbstractC3391b {

    /* JADX INFO: renamed from: o */
    public final int f11004o;

    /* JADX INFO: renamed from: p */
    public final C3131d f11005p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3403n(C3131d c3131d, C1402a c1402a, int i9, boolean z9, boolean z10) {
        super(EnumC3400k.f10963O, c3131d.f10152i.size() + (z9 ? 1 : 0));
        this.f11005p = c3131d;
        this.f11004o = i9;
        int iM7366p = z10 ? c1402a.f4667i[0] : 0;
        if (z9) {
            int i10 = z10 ? iM7366p : c1402a.f4667i[iM7366p];
            AbstractC3506j abstractC3506j = c3131d.f10153j.f10138g;
            InterfaceC2844b interfaceC2844b = AbstractC3508l.f11418k;
            mo7178I(new C3514r(i10, abstractC3506j));
            iM7366p++;
        }
        for (AbstractC3506j abstractC3506j2 : c3131d.f10152i) {
            int i11 = z10 ? iM7366p : c1402a.f4667i[iM7366p];
            InterfaceC2844b interfaceC2844b2 = AbstractC3508l.f11418k;
            mo7178I(new C3514r(i11, abstractC3506j2));
            iM7366p += abstractC3506j2.m7366p();
        }
        c1402a.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    /* JADX INFO: renamed from: O */
    public C4320p mo7167O() {
        C3403n c3403n = new C3403n(this.f11005p, this.f11004o, this.f14398m.size());
        m8681P(c3403n);
        return c3403n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    /* JADX INFO: renamed from: Y */
    public boolean mo7168Y(C4320p c4320p) {
        if (this == c4320p) {
            return true;
        }
        if (!(c4320p instanceof C3403n) || !super.mo7168Y(c4320p)) {
            return false;
        }
        C3403n c3403n = (C3403n) c4320p;
        return this.f11004o == c3403n.f11004o && this.f11005p.equals(c3403n.f11005p);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p233pd.AbstractC3391b
    /* JADX INFO: renamed from: i0 */
    public final C3131d mo7169i0() {
        return this.f11005p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p233pd.AbstractC3391b
    /* JADX INFO: renamed from: j0 */
    public int mo7170j0() {
        return this.f11004o == 1 ? 0 : 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p233pd.AbstractC3391b
    /* JADX INFO: renamed from: k0 */
    public AbstractC3508l mo7171k0() {
        if (this.f11004o == 1 || this.f14398m.size() <= 0) {
            return null;
        }
        return mo7179S(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    public String toString() {
        String str;
        String strM8692k = m8692k();
        switch (this.f11004o) {
            case 1:
                str = "STATIC";
                break;
            case 2:
                str = "DIRECT";
                break;
            case 3:
                str = "VIRTUAL";
                break;
            case 4:
                str = "INTERFACE";
                break;
            case 5:
                str = "SUPER";
                break;
            case 6:
                str = "POLYMORPHIC";
                break;
            case 7:
                str = "CUSTOM";
                break;
            case 8:
                str = "CUSTOM_RAW";
                break;
            default:
                str = "null";
                break;
        }
        return strM8692k + " " + str + " call: " + String.valueOf(this.f11005p) + m8679M();
    }

    public C3403n(C3131d c3131d, int i9, int i10) {
        super(EnumC3400k.f10963O, i10);
        this.f11005p = c3131d;
        this.f11004o = i9;
    }

    public C3403n(C3131d c3131d, C1402a c1402a, int i9, boolean z9) {
        this(c3131d, c1402a, i9, i9 != 1, z9);
    }
}
