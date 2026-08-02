package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zf0 implements w41 {
    public final Enum[] a;
    public final hx2 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zf0(String str, Enum[] enumArr) {
        enumArr.getClass();
        this.a = enumArr;
        this.b = new hx2(new r1(15, this, str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final Object a(y40 y40Var) {
        int iA = y40Var.A(e());
        Enum[] enumArr = this.a;
        if (iA >= 0 && iA < enumArr.length) {
            return enumArr[iA];
        }
        throw new o01(iA + " is not among valid " + e().b() + " enum values, values size is " + enumArr.length);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final void d(ve0 ve0Var, Object obj) {
        Enum r5 = (Enum) obj;
        r5.getClass();
        Enum[] enumArr = this.a;
        int iO0 = mg.o0(enumArr, r5);
        if (iO0 != -1) {
            ve0Var.q(e(), iO0);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r5);
        String strB = e().b();
        String string = Arrays.toString(enumArr);
        string.getClass();
        sb.append(" is not a valid enum ");
        sb.append(strB);
        sb.append(", must be one of ");
        sb.append(string);
        throw new o01(sb.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final yo2 e() {
        return (yo2) this.b.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + e().b() + '>';
    }
}
