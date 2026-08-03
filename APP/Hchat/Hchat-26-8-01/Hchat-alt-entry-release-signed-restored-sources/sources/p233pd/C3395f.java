package p233pd;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p012ah.C0086a;
import p025bc.AbstractC0255e;
import p246qd.AbstractC3506j;
import p246qd.AbstractC3508l;
import p302ud.C4320p;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: pd.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3395f extends C4320p {

    /* JADX INFO: renamed from: o */
    public final int f10939o;

    /* JADX INFO: renamed from: p */
    public C3394e f10940p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3395f(int i9, AbstractC3508l abstractC3508l) {
        super(EnumC3400k.f10952D, 1);
        this.f10939o = i9;
        mo7178I(abstractC3508l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    /* JADX INFO: renamed from: O */
    public final C4320p mo7167O() {
        C3395f c3395f = new C3395f(this.f10939o, mo7179S(0));
        m8681P(c3395f);
        return c3395f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    /* JADX INFO: renamed from: Y */
    public final boolean mo7168Y(C4320p c4320p) {
        if (this == c4320p) {
            return true;
        }
        if ((c4320p instanceof C3395f) && super.mo7168Y(c4320p)) {
            return Objects.equals(this.f10940p, ((C3395f) c4320p).f10940p);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i0 */
    public final List m7172i0(AbstractC3506j abstractC3506j) {
        C3394e c3394e = this.f10940p;
        c3394e.getClass();
        ArrayList arrayList = new ArrayList(c3394e.f10936p);
        Object obj = c3394e.f10935o;
        int i9 = c3394e.f10937q;
        int i10 = 0;
        if (i9 == 1) {
            int length = ((byte[]) obj).length;
            while (i10 < length) {
                arrayList.add(AbstractC3508l.m7368S(r2[i10], abstractC3506j));
                i10++;
            }
        } else if (i9 == 2) {
            int length2 = ((short[]) obj).length;
            while (i10 < length2) {
                arrayList.add(AbstractC3508l.m7368S(r2[i10], abstractC3506j));
                i10++;
            }
        } else if (i9 == 4) {
            int length3 = ((int[]) obj).length;
            while (i10 < length3) {
                arrayList.add(AbstractC3508l.m7368S(r2[i10], abstractC3506j));
                i10++;
            }
        } else {
            if (i9 != 8) {
                C0086a.m452k(AbstractC0255e.m1021j("Unknown type: ", String.valueOf(obj.getClass()), ", expected: ", String.valueOf(abstractC3506j)));
                return null;
            }
            long[] jArr = (long[]) obj;
            int length4 = jArr.length;
            while (i10 < length4) {
                arrayList.add(AbstractC3508l.m7368S(jArr[i10], abstractC3506j));
                i10++;
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    public final String toString() {
        return AbstractC4855en.m9264h(super.toString(), ", data: ", String.valueOf(this.f10940p));
    }
}
