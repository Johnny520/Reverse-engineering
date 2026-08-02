package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zf0 implements w41 {

    /* JADX INFO: renamed from: a */
    public final Enum[] f13868a;

    /* JADX INFO: renamed from: b */
    public final hx2 f13869b;

    public zf0(String str, Enum[] enumArr) {
        enumArr.getClass();
        this.f13868a = enumArr;
        this.f13869b = new hx2(new C0640r1(15, this, str));
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: a */
    public final Object mo165a(y40 y40Var) {
        int iMo892A = y40Var.mo892A(mo168e());
        Enum[] enumArr = this.f13868a;
        if (iMo892A >= 0 && iMo892A < enumArr.length) {
            return enumArr[iMo892A];
        }
        throw new o01(iMo892A + " is not among valid " + mo168e().mo250b() + " enum values, values size is " + enumArr.length);
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: d */
    public final void mo167d(ve0 ve0Var, Object obj) {
        Enum r5 = (Enum) obj;
        r5.getClass();
        Enum[] enumArr = this.f13868a;
        int iM3100o0 = AbstractC0460mg.m3100o0(enumArr, r5);
        if (iM3100o0 != -1) {
            ve0Var.mo1192q(mo168e(), iM3100o0);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r5);
        String strMo250b = mo168e().mo250b();
        String string = Arrays.toString(enumArr);
        string.getClass();
        sb.append(" is not a valid enum ");
        sb.append(strMo250b);
        sb.append(", must be one of ");
        sb.append(string);
        throw new o01(sb.toString());
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: e */
    public final yo2 mo168e() {
        return (yo2) this.f13869b.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + mo168e().mo250b() + '>';
    }
}
