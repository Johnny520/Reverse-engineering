package androidx.compose.foundation.text.input.internal;

import android.view.autofill.AutofillValue;
import androidx.compose.foundation.text.C1781;
import androidx.compose.foundation.text.C1815;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.selection.C1720;
import androidx.compose.p001ui.autofill.C2239;
import androidx.compose.p001ui.autofill.C2245;
import androidx.compose.p001ui.autofill.C2250;
import androidx.compose.p001ui.autofill.InterfaceC2244;
import androidx.compose.p001ui.focus.C2303;
import androidx.compose.p001ui.node.AbstractC2623;
import androidx.compose.p001ui.node.InterfaceC2596;
import androidx.compose.p001ui.semantics.AbstractC2778;
import androidx.compose.p001ui.semantics.AbstractC2781;
import androidx.compose.p001ui.semantics.AbstractC2794;
import androidx.compose.p001ui.semantics.C2776;
import androidx.compose.p001ui.semantics.C2782;
import androidx.compose.p001ui.semantics.InterfaceC2779;
import androidx.compose.p001ui.text.AbstractC2882;
import androidx.compose.p001ui.text.C2869;
import androidx.compose.p001ui.text.C2902;
import androidx.compose.p001ui.text.input.C2831;
import androidx.compose.p001ui.text.input.C2838;
import androidx.compose.p001ui.text.input.C2842;
import androidx.compose.p001ui.text.input.C2844;
import androidx.compose.p001ui.text.input.C2847;
import androidx.compose.p001ui.text.input.C2859;
import androidx.compose.p001ui.text.input.C2862;
import androidx.compose.p001ui.text.input.InterfaceC2856;
import java.io.IOException;
import kotlin.C6008;
import kotlin.reflect.InterfaceC5920;
import p050.AbstractC7176;
import p068.InterfaceC7380;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1708 extends AbstractC2623 implements InterfaceC2596 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public C2859 f2794;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public C1720 f2795;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public C2303 f2796;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public InterfaceC2856 f2797;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public boolean f2798;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public C1781 f2799;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public C2847 f2800;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public C2838 f2801;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public static void m2255(C1781 c1781, String str, boolean z) throws IOException {
        if (z) {
            C2831 c2831 = c1781.f3011;
            C1815 c1815 = c1781.f3021;
            if (c2831 == null) {
                int length = str.length();
                c1815.invoke(new C2847(4, AbstractC2882.m4330(length, length), str));
            } else {
                C2847 c2847M847 = c1781.f3012.m847(AbstractC7176.m12490(new C2842(), new C2844(str, 1)));
                c2831.m4269(null, c2847M847);
                c1815.invoke(c2847M847);
            }
        }
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2596
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public final boolean mo2256() {
        return true;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2596
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final void mo1854(InterfaceC2779 interfaceC2779) {
        C2902 c2902 = this.f2800.f6292;
        InterfaceC5920[] interfaceC5920Arr = AbstractC2781.f6100;
        C2782 c2782 = AbstractC2778.f6072;
        InterfaceC5920[] interfaceC5920Arr2 = AbstractC2781.f6100;
        InterfaceC5920 interfaceC5920 = interfaceC5920Arr2[18];
        c2782.getClass();
        interfaceC2779.mo4150(c2782, c2902);
        C2902 c29022 = this.f2801.f6255;
        C2782 c27822 = AbstractC2778.f6071;
        InterfaceC5920 interfaceC59202 = interfaceC5920Arr2[19];
        c27822.getClass();
        interfaceC2779.mo4150(c27822, c29022);
        long j = this.f2800.f6291;
        C2782 c27823 = AbstractC2778.f6070;
        InterfaceC5920 interfaceC59203 = interfaceC5920Arr2[20];
        C2869 c2869 = new C2869(j);
        c27823.getClass();
        interfaceC2779.mo4150(c27823, c2869);
        C2782 c27824 = AbstractC2778.f6081;
        InterfaceC5920 interfaceC59204 = interfaceC5920Arr2[9];
        c27824.getClass();
        interfaceC2779.mo4150(c27824, C2250.f4425);
        C2239 c2239 = new C2239(AutofillValue.forText(this.f2800.f6292));
        C2782 c27825 = AbstractC2778.f6080;
        InterfaceC5920 interfaceC59205 = interfaceC5920Arr2[10];
        c27825.getClass();
        interfaceC2779.mo4150(c27825, c2239);
        interfaceC2779.mo4150(AbstractC2794.f6151, new C2776(null, new C1715(this, 0)));
        int i = this.f2794.f6316;
        if (i == 6) {
            InterfaceC2244.f4417.getClass();
            AbstractC2781.m4206(interfaceC2779, C2245.f4419);
        } else if (i == 7 || i == 8) {
            InterfaceC2244.f4417.getClass();
            AbstractC2781.m4206(interfaceC2779, C2245.f4420);
        } else if (i == 4) {
            InterfaceC2244.f4417.getClass();
            AbstractC2781.m4206(interfaceC2779, C2245.f4418);
        }
        if (!this.f2798) {
            interfaceC2779.mo4150(AbstractC2778.f6097, C6008.f15084);
        }
        boolean z = this.f2798;
        C2782 c27826 = AbstractC2778.f6056;
        InterfaceC5920 interfaceC59206 = interfaceC5920Arr2[28];
        Boolean boolValueOf = Boolean.valueOf(z);
        c27826.getClass();
        interfaceC2779.mo4150(c27826, boolValueOf);
        AbstractC2781.m4207(interfaceC2779, new C1715(this, 1));
        int i2 = 2;
        if (z) {
            interfaceC2779.mo4150(AbstractC2794.f6153, new C2776(null, new C1715(this, i2)));
            interfaceC2779.mo4150(AbstractC2794.f6149, new C2776(null, new C1715(this, interfaceC2779)));
        }
        interfaceC2779.mo4150(AbstractC2794.f6156, new C2776(null, new InterfaceC7380() { // from class: androidx.compose.foundation.text.input.internal.飘花落叶言子楪苏兰哲世
            @Override // p068.InterfaceC7380
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                C1708 c1708 = this.f2811;
                if (!zBooleanValue) {
                    c1708.f2797.mo2443(iIntValue);
                }
                if (!zBooleanValue) {
                    c1708.f2797.mo2443(iIntValue2);
                }
                boolean z2 = false;
                if (c1708.f2798) {
                    long j2 = c1708.f2800.f6291;
                    int i3 = C2869.f6347;
                    if (iIntValue != ((int) (j2 >> 32)) || iIntValue2 != ((int) (j2 & 4294967295L))) {
                        if (Math.min(iIntValue, iIntValue2) < 0 || Math.max(iIntValue, iIntValue2) > c1708.f2800.f6292.f6474.length()) {
                            C1720 c1720 = c1708.f2795;
                            c1720.m2313(false);
                            c1720.m2322(HandleState.None);
                        } else {
                            if (zBooleanValue || iIntValue == iIntValue2) {
                                C1720 c17202 = c1708.f2795;
                                c17202.m2313(false);
                                c17202.m2322(HandleState.None);
                            } else {
                                c1708.f2795.m2334(true);
                            }
                            c1708.f2799.f3021.invoke(new C2847(c1708.f2800.f6292, AbstractC2882.m4330(iIntValue, iIntValue2), (C2869) null));
                            z2 = true;
                        }
                    }
                }
                return Boolean.valueOf(z2);
            }
        }));
        int i3 = this.f2794.f6315;
        C1718 c1718 = new C1718(this, 6);
        interfaceC2779.mo4150(AbstractC2778.f6069, new C2862(i3));
        interfaceC2779.mo4150(AbstractC2794.f6150, new C2776(null, c1718));
        interfaceC2779.mo4150(AbstractC2794.f6137, new C2776(null, new C1718(this, 7)));
        interfaceC2779.mo4150(AbstractC2794.f6136, new C2776(null, new C1718(this, 1)));
        if (!C2869.m4312(this.f2800.f6291)) {
            interfaceC2779.mo4150(AbstractC2794.f6147, new C2776(null, new C1718(this, 2)));
            if (this.f2798) {
                interfaceC2779.mo4150(AbstractC2794.f6148, new C2776(null, new C1718(this, 3)));
            }
        }
        if (this.f2798) {
            interfaceC2779.mo4150(AbstractC2794.f6140, new C2776(null, new C1718(this, 5)));
        }
    }
}
