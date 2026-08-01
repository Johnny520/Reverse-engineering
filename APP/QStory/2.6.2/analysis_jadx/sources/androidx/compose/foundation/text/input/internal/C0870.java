package androidx.compose.foundation.text.input.internal;

import android.view.autofill.AutofillValue;
import androidx.compose.foundation.text.C0943;
import androidx.compose.foundation.text.C0977;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.selection.C0882;
import androidx.compose.ui.autofill.C1404;
import androidx.compose.ui.autofill.C1410;
import androidx.compose.ui.autofill.C1415;
import androidx.compose.ui.autofill.InterfaceC1409;
import androidx.compose.ui.focus.C1468;
import androidx.compose.ui.node.AbstractC1788;
import androidx.compose.ui.node.InterfaceC1761;
import androidx.compose.ui.semantics.AbstractC1943;
import androidx.compose.ui.semantics.AbstractC1946;
import androidx.compose.ui.semantics.AbstractC1959;
import androidx.compose.ui.semantics.C1941;
import androidx.compose.ui.semantics.C1947;
import androidx.compose.ui.semantics.InterfaceC1944;
import androidx.compose.ui.text.AbstractC2048;
import androidx.compose.ui.text.C2035;
import androidx.compose.ui.text.C2068;
import androidx.compose.ui.text.input.C1997;
import androidx.compose.ui.text.input.C2004;
import androidx.compose.ui.text.input.C2008;
import androidx.compose.ui.text.input.C2010;
import androidx.compose.ui.text.input.C2013;
import androidx.compose.ui.text.input.C2025;
import androidx.compose.ui.text.input.C2028;
import androidx.compose.ui.text.input.InterfaceC2022;
import java.io.IOException;
import kotlin.C5175;
import kotlin.reflect.InterfaceC5087;
import p052.InterfaceC6550;
import p253.AbstractC8189;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0870 extends AbstractC1788 implements InterfaceC1761 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public C2025 f2448;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public C0882 f2449;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public C1468 f2450;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public InterfaceC2022 f2451;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public boolean f2452;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public C0943 f2453;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public C2013 f2454;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public C2004 f2455;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public static void m1685(C0943 c0943, String str, boolean z) throws IOException {
        if (z) {
            C1997 c1997 = c0943.f2665;
            C0977 c0977 = c0943.f2675;
            if (c1997 == null) {
                int length = str.length();
                c0977.invoke(new C2013(4, AbstractC2048.m3760(length, length), str));
            } else {
                C2013 c2013M286 = c0943.f2666.m286(AbstractC8189.m13659(new C2008(), new C2010(str, 1)));
                c1997.m3699(null, c2013M286);
                c0977.invoke(c2013M286);
            }
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC1761
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public final boolean mo1686() {
        return true;
    }

    @Override // androidx.compose.ui.node.InterfaceC1761
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final void mo1284(InterfaceC1944 interfaceC1944) {
        C2068 c2068 = this.f2454.f5946;
        InterfaceC5087[] interfaceC5087Arr = AbstractC1946.f5754;
        C1947 c1947 = AbstractC1943.f5726;
        InterfaceC5087[] interfaceC5087Arr2 = AbstractC1946.f5754;
        InterfaceC5087 interfaceC5087 = interfaceC5087Arr2[18];
        c1947.getClass();
        interfaceC1944.mo3580(c1947, c2068);
        C2068 c20682 = this.f2455.f5909;
        C1947 c19472 = AbstractC1943.f5725;
        InterfaceC5087 interfaceC50872 = interfaceC5087Arr2[19];
        c19472.getClass();
        interfaceC1944.mo3580(c19472, c20682);
        long j = this.f2454.f5945;
        C1947 c19473 = AbstractC1943.f5724;
        InterfaceC5087 interfaceC50873 = interfaceC5087Arr2[20];
        C2035 c2035 = new C2035(j);
        c19473.getClass();
        interfaceC1944.mo3580(c19473, c2035);
        C1947 c19474 = AbstractC1943.f5735;
        InterfaceC5087 interfaceC50874 = interfaceC5087Arr2[9];
        c19474.getClass();
        interfaceC1944.mo3580(c19474, C1415.f4079);
        C1404 c1404 = new C1404(AutofillValue.forText(this.f2454.f5946));
        C1947 c19475 = AbstractC1943.f5734;
        InterfaceC5087 interfaceC50875 = interfaceC5087Arr2[10];
        c19475.getClass();
        interfaceC1944.mo3580(c19475, c1404);
        interfaceC1944.mo3580(AbstractC1959.f5805, new C1941(null, new C0877(this, 0)));
        int i = this.f2448.f5970;
        if (i == 6) {
            InterfaceC1409.f4071.getClass();
            AbstractC1946.m3636(interfaceC1944, C1410.f4073);
        } else if (i == 7 || i == 8) {
            InterfaceC1409.f4071.getClass();
            AbstractC1946.m3636(interfaceC1944, C1410.f4074);
        } else if (i == 4) {
            InterfaceC1409.f4071.getClass();
            AbstractC1946.m3636(interfaceC1944, C1410.f4072);
        }
        if (!this.f2452) {
            interfaceC1944.mo3580(AbstractC1943.f5751, C5175.f14739);
        }
        boolean z = this.f2452;
        C1947 c19476 = AbstractC1943.f5710;
        InterfaceC5087 interfaceC50876 = interfaceC5087Arr2[28];
        Boolean boolValueOf = Boolean.valueOf(z);
        c19476.getClass();
        interfaceC1944.mo3580(c19476, boolValueOf);
        AbstractC1946.m3637(interfaceC1944, new C0877(this, 1));
        int i2 = 2;
        if (z) {
            interfaceC1944.mo3580(AbstractC1959.f5807, new C1941(null, new C0877(this, i2)));
            interfaceC1944.mo3580(AbstractC1959.f5803, new C1941(null, new C0877(this, interfaceC1944)));
        }
        interfaceC1944.mo3580(AbstractC1959.f5810, new C1941(null, new InterfaceC6550() { // from class: androidx.compose.foundation.text.input.internal.飘花落叶言子楪苏兰哲世
            @Override // p052.InterfaceC6550
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                C0870 c0870 = this.f2465;
                if (!zBooleanValue) {
                    c0870.f2451.mo1873(iIntValue);
                }
                if (!zBooleanValue) {
                    c0870.f2451.mo1873(iIntValue2);
                }
                boolean z2 = false;
                if (c0870.f2452) {
                    long j2 = c0870.f2454.f5945;
                    int i3 = C2035.f6001;
                    if (iIntValue != ((int) (j2 >> 32)) || iIntValue2 != ((int) (j2 & 4294967295L))) {
                        if (Math.min(iIntValue, iIntValue2) < 0 || Math.max(iIntValue, iIntValue2) > c0870.f2454.f5946.f6128.length()) {
                            C0882 c0882 = c0870.f2449;
                            c0882.m1743(false);
                            c0882.m1752(HandleState.None);
                        } else {
                            if (zBooleanValue || iIntValue == iIntValue2) {
                                C0882 c08822 = c0870.f2449;
                                c08822.m1743(false);
                                c08822.m1752(HandleState.None);
                            } else {
                                c0870.f2449.m1764(true);
                            }
                            c0870.f2453.f2675.invoke(new C2013(c0870.f2454.f5946, AbstractC2048.m3760(iIntValue, iIntValue2), (C2035) null));
                            z2 = true;
                        }
                    }
                }
                return Boolean.valueOf(z2);
            }
        }));
        int i3 = this.f2448.f5969;
        C0880 c0880 = new C0880(this, 6);
        interfaceC1944.mo3580(AbstractC1943.f5723, new C2028(i3));
        interfaceC1944.mo3580(AbstractC1959.f5804, new C1941(null, c0880));
        interfaceC1944.mo3580(AbstractC1959.f5791, new C1941(null, new C0880(this, 7)));
        interfaceC1944.mo3580(AbstractC1959.f5790, new C1941(null, new C0880(this, 1)));
        if (!C2035.m3742(this.f2454.f5945)) {
            interfaceC1944.mo3580(AbstractC1959.f5801, new C1941(null, new C0880(this, 2)));
            if (this.f2452) {
                interfaceC1944.mo3580(AbstractC1959.f5802, new C1941(null, new C0880(this, 3)));
            }
        }
        if (this.f2452) {
            interfaceC1944.mo3580(AbstractC1959.f5794, new C1941(null, new C0880(this, 5)));
        }
    }
}
