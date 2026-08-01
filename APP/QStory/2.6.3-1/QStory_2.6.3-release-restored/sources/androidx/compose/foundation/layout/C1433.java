package androidx.compose.foundation.layout;

import androidx.appcompat.widget.C1041;
import androidx.compose.material3.AbstractC2030;
import androidx.compose.material3.AbstractC2032;
import androidx.compose.material3.AbstractC2048;
import androidx.compose.material3.C2027;
import androidx.compose.material3.C2045;
import androidx.compose.p001ui.C2958;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2169;
import androidx.compose.runtime.C2193;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.internal.AbstractC2089;
import androidx.compose.runtime.internal.C2077;
import kotlin.C6008;
import p068.InterfaceC7383;
import p221.C8722;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1433 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C2077 f2011;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2012;

    public /* synthetic */ C1433(C2077 c2077, int i) {
        this.f2012 = i;
        this.f2011 = c2077;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2012;
        C6008 c6008 = C6008.f15084;
        switch (i) {
            case 0:
                InterfaceC2208 interfaceC2208 = (InterfaceC2208) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C2159 c2159 = (C2159) interfaceC2208;
                if (!c2159.m2903(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c2159.m2899();
                } else {
                    this.f2011.invoke(C1428.f1993, c2159, 6);
                }
                break;
            default:
                InterfaceC2208 interfaceC22082 = (InterfaceC2208) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                "C66@2738L11,65@2691L118:QStoryTheme.kt#avp4iw";
                C2159 c21592 = (C2159) interfaceC22082;
                if (!c21592.m2903(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    c21592.m2899();
                } else {
                    C2169 c2169 = AbstractC2032.f3797;
                    long j = ((C2027) c21592.m2943(c2169)).f3781;
                    C2193 c2193 = AbstractC2048.f3841;
                    c21592.m2952(89374938);
                    C2027 c2027 = (C2027) c21592.m2943(c2169);
                    long j2 = c2027.f3774;
                    long j3 = c2027.f3745;
                    long j4 = c2027.f3748;
                    long j5 = c2027.f3756;
                    long j6 = c2027.f3783;
                    if (C2434.m3509(j, j2)) {
                        j6 = c2027.f3773;
                    } else if (C2434.m3509(j, c2027.f3769)) {
                        j6 = c2027.f3788;
                    } else if (C2434.m3509(j, c2027.f3792)) {
                        j6 = c2027.f3789;
                    } else if (C2434.m3509(j, c2027.f3781)) {
                        j6 = c2027.f3785;
                    } else if (C2434.m3509(j, c2027.f3777)) {
                        j6 = c2027.f3778;
                    } else if (C2434.m3509(j, c2027.f3772)) {
                        j6 = c2027.f3771;
                    } else if (C2434.m3509(j, c2027.f3787)) {
                        j6 = c2027.f3791;
                    } else if (C2434.m3509(j, c2027.f3790)) {
                        j6 = c2027.f3782;
                    } else if (C2434.m3509(j, c2027.f3762)) {
                        j6 = c2027.f3761;
                    } else if (C2434.m3509(j, c2027.f3779)) {
                        j6 = c2027.f3780;
                    } else if (!C2434.m3509(j, c2027.f3786)) {
                        if (C2434.m3509(j, c2027.f3784)) {
                            j6 = c2027.f3776;
                        } else if (!C2434.m3509(j, c2027.f3757) && !C2434.m3509(j, c2027.f3767) && !C2434.m3509(j, c2027.f3766) && !C2434.m3509(j, c2027.f3765) && !C2434.m3509(j, c2027.f3764) && !C2434.m3509(j, c2027.f3763) && !C2434.m3509(j, c2027.f3768)) {
                            j6 = (C2434.m3509(j, c2027.f3754) || C2434.m3509(j, c2027.f3753)) ? j5 : (C2434.m3509(j, c2027.f3751) || C2434.m3509(j, c2027.f3752)) ? j4 : (C2434.m3509(j, c2027.f3750) || C2434.m3509(j, c2027.f3749)) ? j3 : C2434.f5042;
                        }
                    }
                    if (j6 == 16) {
                        j6 = ((C2434) c21592.m2943(AbstractC2030.f3794)).f5045;
                    }
                    c21592.m2937(false);
                    C2193 c21932 = AbstractC2048.f3841;
                    float f = ((C8722) c21592.m2943(c21932)).f22204 + 0.0f;
                    AbstractC2202.m3046(new C1041[]{AbstractC2030.f3794.mo2988(new C2434(j6)), c21932.mo2988(new C8722(f))}, AbstractC2089.m2749(421772006, new C2045(C2958.f6621, AbstractC2416.f5007, j, f, this.f2011), c21592), c21592, 56);
                }
                break;
        }
        return c6008;
    }
}
