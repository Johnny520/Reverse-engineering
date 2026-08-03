package p233pd;

import java.util.Arrays;
import p012ah.C0086a;
import p068eh.AbstractC0921a;
import p246qd.C3504h;
import p246qd.EnumC3513q;
import p302ud.C4320p;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: pd.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3394e extends C4320p {

    /* JADX INFO: renamed from: s */
    public static final C3504h f10931s = new C3504h(new EnumC3513q[]{EnumC3513q.BYTE, EnumC3513q.BOOLEAN});

    /* JADX INFO: renamed from: t */
    public static final C3504h f10932t = new C3504h(new EnumC3513q[]{EnumC3513q.SHORT, EnumC3513q.CHAR});

    /* JADX INFO: renamed from: u */
    public static final C3504h f10933u = new C3504h(new EnumC3513q[]{EnumC3513q.INT, EnumC3513q.FLOAT});

    /* JADX INFO: renamed from: v */
    public static final C3504h f10934v = new C3504h(new EnumC3513q[]{EnumC3513q.LONG, EnumC3513q.DOUBLE});

    /* JADX INFO: renamed from: o */
    public final Object f10935o;

    /* JADX INFO: renamed from: p */
    public final int f10936p;

    /* JADX INFO: renamed from: q */
    public final int f10937q;

    /* JADX INFO: renamed from: r */
    public C3504h f10938r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3394e(int i9, int i10, Object obj) {
        C3504h c3504h;
        super(EnumC3400k.f10953E, 0);
        this.f10935o = obj;
        this.f10936p = i9;
        this.f10937q = i10;
        if (i10 == 0 || i10 == 1) {
            c3504h = f10931s;
        } else if (i10 == 2) {
            c3504h = f10932t;
        } else if (i10 == 4) {
            c3504h = f10933u;
        } else {
            if (i10 != 8) {
                C0086a.m452k(AbstractC0921a.m2249l(i10, "Unknown array element width: "));
                throw null;
            }
            c3504h = f10934v;
        }
        this.f10938r = c3504h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    /* JADX INFO: renamed from: O */
    public final C4320p mo7167O() {
        C3394e c3394e = new C3394e(this.f10936p, this.f10937q, this.f10935o);
        c3394e.f10938r = this.f10938r;
        m8681P(c3394e);
        return c3394e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    /* JADX INFO: renamed from: Y */
    public final boolean mo7168Y(C4320p c4320p) {
        if (this == c4320p) {
            return true;
        }
        if (!(c4320p instanceof C3394e) || !super.mo7168Y(c4320p)) {
            return false;
        }
        C3394e c3394e = (C3394e) c4320p;
        return this.f10938r.equals(c3394e.f10938r) && this.f10935o == c3394e.f10935o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    public final String toString() {
        String string = super.toString();
        Object obj = this.f10935o;
        int i9 = this.f10937q;
        return AbstractC4855en.m9264h(string, ", data: ", i9 != 1 ? i9 != 2 ? i9 != 4 ? i9 != 8 ? "?" : Arrays.toString((long[]) obj) : Arrays.toString((int[]) obj) : Arrays.toString((short[]) obj) : Arrays.toString((byte[]) obj));
    }
}
