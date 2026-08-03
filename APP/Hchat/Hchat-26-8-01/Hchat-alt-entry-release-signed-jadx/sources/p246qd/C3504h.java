package p246qd;

import java.util.Arrays;
import okhttp3.HttpUrl;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: qd.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3504h extends AbstractC3506j {

    /* JADX INFO: renamed from: J */
    public final EnumC3513q[] f11373J;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3504h(EnumC3513q[] enumC3513qArr) {
        this.f11373J = enumC3513qArr;
        this.f11410a = Arrays.hashCode(enumC3513qArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3506j
    /* JADX INFO: renamed from: A */
    public final AbstractC3506j mo7338A() {
        boolean zMo7349a = mo7349a(EnumC3513q.OBJECT);
        C3501e c3501e = AbstractC3506j.f11394k;
        return zMo7349a ? c3501e : mo7349a(EnumC3513q.ARRAY) ? new C3497a(c3501e) : new C3503g(this.f11373J[0]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3506j
    /* JADX INFO: renamed from: a */
    public final boolean mo7349a(EnumC3513q enumC3513q) {
        for (EnumC3513q enumC3513q2 : this.f11373J) {
            if (enumC3513q2 == enumC3513q) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3506j
    /* JADX INFO: renamed from: n */
    public final EnumC3513q[] mo7342n() {
        return this.f11373J;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3506j
    /* JADX INFO: renamed from: s */
    public final boolean mo7344s(Object obj) {
        return Arrays.equals(this.f11373J, ((C3504h) obj).f11373J);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3506j
    public final String toString() {
        String string;
        EnumC3513q[] enumC3513qArr = this.f11373J;
        if (enumC3513qArr.length == EnumC3513q.values().length) {
            return "??";
        }
        int length = enumC3513qArr == null ? 0 : enumC3513qArr.length;
        if (length == 0) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(enumC3513qArr[0]);
            for (int i9 = 1; i9 < length; i9++) {
                sb2.append(", ");
                sb2.append(enumC3513qArr[i9]);
            }
            string = sb2.toString();
        }
        return AbstractC0921a.m2251n("??[", string, "]");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p246qd.AbstractC3506j
    /* JADX INFO: renamed from: w */
    public final boolean mo7345w() {
        return false;
    }
}
