package p361yc;

import java.util.Arrays;
import p010a9.InterfaceC0173a;
import p172l8.AbstractC4706m;
import p172l8.InterfaceC4705l;
import p185m8.AbstractC5106t;
import p300uc.C8661o;
import p300uc.InterfaceC8647b;
import p329wc.InterfaceC9218f;
import p345xc.InterfaceC9487e;
import p345xc.InterfaceC9488f;

/* JADX INFO: renamed from: yc.i0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9707i0 implements InterfaceC8647b {

    /* JADX INFO: renamed from: a */
    public final Enum[] f32954a;

    /* JADX INFO: renamed from: b */
    public InterfaceC9218f f32955b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC4705l f32956c;

    public C9707i0(final String str, Enum[] enumArr) {
        str.getClass();
        enumArr.getClass();
        this.f32954a = enumArr;
        this.f32956c = AbstractC4706m.m18787a(new InterfaceC0173a() { // from class: yc.h0
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C9707i0.m37918g(this.f32946q, str);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static InterfaceC9218f m37918g(C9707i0 c9707i0, String str) {
        InterfaceC9218f interfaceC9218f = c9707i0.f32955b;
        return interfaceC9218f == null ? c9707i0.m37919h(str) : interfaceC9218f;
    }

    @Override // p300uc.InterfaceC8647b, p300uc.InterfaceC8662p, p300uc.InterfaceC8645a
    /* JADX INFO: renamed from: a */
    public InterfaceC9218f mo15953a() {
        return (InterfaceC9218f) this.f32956c.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC9218f m37919h(String str) {
        C9697g0 c9697g0 = new C9697g0(str, this.f32954a.length);
        for (Enum r02 : this.f32954a) {
            C9714j2.m37936p(c9697g0, r02.name(), false, 2, null);
        }
        return c9697g0;
    }

    @Override // p300uc.InterfaceC8645a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Enum mo15956d(InterfaceC9487e interfaceC9487e) {
        interfaceC9487e.getClass();
        int iMo880G = interfaceC9487e.mo880G(mo15953a());
        if (iMo880G >= 0) {
            Enum[] enumArr = this.f32954a;
            if (iMo880G < enumArr.length) {
                return enumArr[iMo880G];
            }
        }
        throw new C8661o(iMo880G + " is not among valid " + mo15953a().mo35888a() + " enum values, values size is " + this.f32954a.length);
    }

    @Override // p300uc.InterfaceC8662p
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo15954b(InterfaceC9488f interfaceC9488f, Enum r52) {
        interfaceC9488f.getClass();
        r52.getClass();
        int iM20746m0 = AbstractC5106t.m20746m0(this.f32954a, r52);
        if (iM20746m0 != -1) {
            interfaceC9488f.mo649s(mo15953a(), iM20746m0);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(r52);
        String strMo35888a = mo15953a().mo35888a();
        String string = Arrays.toString(this.f32954a);
        string.getClass();
        sb2.append(" is not a valid enum ");
        sb2.append(strMo35888a);
        sb2.append(", must be one of ");
        sb2.append(string);
        throw new C8661o(sb2.toString());
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + mo15953a().mo35888a() + '>';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9707i0(String str, Enum[] enumArr, InterfaceC9218f interfaceC9218f) {
        this(str, enumArr);
        str.getClass();
        enumArr.getClass();
        interfaceC9218f.getClass();
        this.f32955b = interfaceC9218f;
    }
}
