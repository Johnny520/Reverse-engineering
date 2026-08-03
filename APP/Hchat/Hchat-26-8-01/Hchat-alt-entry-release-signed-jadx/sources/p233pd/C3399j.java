package p233pd;

import java.util.Objects;
import p246qd.C3514r;
import p302ud.C4320p;
import p332wb.AbstractC4855en;
import p351xe.AbstractC5792m;
import p351xe.AbstractC5798s;

/* JADX INFO: renamed from: pd.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3399j extends C4320p {

    /* JADX INFO: renamed from: o */
    public Object f10948o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3399j(EnumC3400k enumC3400k, Object obj, int i9) {
        super(enumC3400k, i9);
        this.f10948o = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    /* JADX INFO: renamed from: O */
    public final C4320p mo7167O() {
        C3399j c3399j = new C3399j(this.f14396k, this.f10948o, this.f14398m.size());
        m8681P(c3399j);
        return c3399j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    /* JADX INFO: renamed from: Y */
    public final boolean mo7168Y(C4320p c4320p) {
        if (this == c4320p) {
            return true;
        }
        if ((c4320p instanceof C3399j) && super.mo7168Y(c4320p)) {
            return Objects.equals(this.f10948o, ((C3399j) c4320p).f10948o);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    public final String toString() {
        EnumC3400k enumC3400k = this.f14396k;
        int iOrdinal = enumC3400k.ordinal();
        if (iOrdinal != 8 && iOrdinal != 20) {
            return AbstractC4855en.m9264h(super.toString(), " ", AbstractC5792m.m10492i(this.f10948o));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractC5792m.m10487d(this.f14399n));
        sb2.append(": ");
        sb2.append(enumC3400k);
        sb2.append(' ');
        C3514r c3514r = this.f14397l;
        if (c3514r != null) {
            sb2.append(c3514r);
            sb2.append(" = ");
        }
        sb2.append('(');
        sb2.append(AbstractC5792m.m10492i(this.f10948o));
        sb2.append(") ");
        sb2.append(AbstractC5798s.m10516j(this.f14398m, ", "));
        return sb2.toString();
    }
}
