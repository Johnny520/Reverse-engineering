package androidx.compose.foundation.text.selection;

import androidx.collection.C1123;
import androidx.compose.foundation.text.C1781;
import androidx.compose.foundation.text.C1801;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.InterfaceC1851;
import androidx.compose.p001ui.text.AbstractC2882;
import androidx.compose.p001ui.text.C2869;
import androidx.compose.p001ui.text.input.C2847;
import androidx.compose.p001ui.text.input.InterfaceC2856;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.InterfaceC2230;
import p124.C8144;
import p124.C8145;
import p124.InterfaceC8146;
import p128.C8158;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1719 implements InterfaceC1851 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ C1720 f2822;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C2869 f2824;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f2825 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C1123 f2823 = C1753.f2945;

    public C1719(C1720 c1720) {
        this.f2822 = c1720;
    }

    @Override // androidx.compose.foundation.text.InterfaceC1851
    public final void onCancel() {
        m2303();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m2303() {
        C1720 c1720 = this.f2822;
        ((AbstractC2182) c1720.f2845).setValue(null);
        ((AbstractC2182) c1720.f2837).setValue(null);
        this.f2823 = C1753.f2945;
        c1720.m2313(true);
        C2869 c2869 = this.f2824;
        boolean zM4312 = C2869.m4312(c2869 != null ? c2869.f6349 : c1720.m2319().f6291);
        c1720.m2322(zM4312 ? HandleState.Cursor : HandleState.Selection);
        C1781 c1781 = c1720.f2832;
        if (c1781 != null) {
            ((AbstractC2182) c1781.f3023).setValue(Boolean.valueOf(!zM4312 && AbstractC1733.m2373(c1720, true)));
        }
        C1781 c17812 = c1720.f2832;
        if (c17812 != null) {
            ((AbstractC2182) c17812.f3022).setValue(Boolean.valueOf(!zM4312 && AbstractC1733.m2373(c1720, false)));
        }
        C1781 c17813 = c1720.f2832;
        if (c17813 != null) {
            ((AbstractC2182) c17813.f3026).setValue(Boolean.valueOf(zM4312 && AbstractC1733.m2373(c1720, true)));
        }
        if (this.f2825) {
            C1720.m2310(c1720, c1720.f2847);
        }
        c1720.f2847 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
    @Override // androidx.compose.foundation.text.InterfaceC1851
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo2304(long j) {
        C1801 c1801M2425;
        long jM2309;
        C1720 c1720 = this.f2822;
        if (!c1720.m2327() || c1720.m2319().f6292.f6474.length() == 0) {
            return;
        }
        c1720.f2844 = C8158.m13084(c1720.f2844, j);
        C1781 c1781 = c1720.f2832;
        if (c1781 != null && (c1801M2425 = c1781.m2425()) != null) {
            ((AbstractC2182) c1720.f2837).setValue(new C8158(C8158.m13084(c1720.f2846, c1720.f2844)));
            if (c1720.f2847 == null) {
                C8158 c8158M2329 = c1720.m2329();
                c8158M2329.getClass();
                if (c1801M2425.m2437(c8158M2329.f19886)) {
                    C2869 c2869 = c1720.f2847;
                    int iM2438 = c2869 != null ? (int) (c2869.f6349 >> 32) : c1801M2425.m2438(c1720.f2846, false);
                    C8158 c8158M23292 = c1720.m2329();
                    c8158M23292.getClass();
                    int iM24382 = c1801M2425.m2438(c8158M23292.f19886, false);
                    if (c1720.f2847 == null && iM2438 == iM24382) {
                        return;
                    }
                    C2847 c2847M2319 = c1720.m2319();
                    C8158 c8158M23293 = c1720.m2329();
                    c8158M23293.getClass();
                    jM2309 = C1720.m2309(c1720, c2847M2319, c8158M23293.f19886, false, false, this.f2823, true, new C8145(9));
                } else {
                    InterfaceC2856 interfaceC2856 = c1720.f2834;
                    int iM24383 = c1801M2425.m2438(c1720.f2846, true);
                    interfaceC2856.mo2443(iM24383);
                    InterfaceC2856 interfaceC28562 = c1720.f2834;
                    C8158 c8158M23294 = c1720.m2329();
                    c8158M23294.getClass();
                    int iM24384 = c1801M2425.m2438(c8158M23294.f19886, true);
                    interfaceC28562.mo2443(iM24384);
                    C1123 c1123 = iM24383 == iM24384 ? C1753.f2945 : C1753.f2944;
                    C2847 c2847M23192 = c1720.m2319();
                    C8158 c8158M23295 = c1720.m2329();
                    c8158M23295.getClass();
                    jM2309 = C1720.m2309(c1720, c2847M23192, c8158M23295.f19886, false, false, c1123, true, new C8145(9));
                }
                this.f2824 = new C2869(jM2309);
                if (!C2869.m4314(c1720.f2847, jM2309)) {
                    this.f2825 = false;
                }
            }
        }
        c1720.m2313(false);
    }

    @Override // androidx.compose.foundation.text.InterfaceC1851
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo2307(long j, C1123 c1123) {
        long j2;
        C1801 c1801M2425;
        C1801 c1801M24252;
        C1720 c1720 = this.f2822;
        InterfaceC2230 interfaceC2230 = c1720.f2845;
        if (c1720.m2327() && ((Handle) ((AbstractC2182) interfaceC2230).getValue()) == null) {
            ((AbstractC2182) interfaceC2230).setValue(Handle.SelectionEnd);
            c1720.f2836 = -1;
            this.f2825 = true;
            this.f2823 = c1123;
            c1720.m2323();
            C1781 c1781 = c1720.f2832;
            if (c1781 == null || (c1801M24252 = c1781.m2425()) == null || !c1801M24252.m2437(j)) {
                j2 = j;
                C1781 c17812 = c1720.f2832;
                if (c17812 != null && (c1801M2425 = c17812.m2425()) != null) {
                    int iM2438 = c1801M2425.m2438(j2, true);
                    c1720.f2834.mo2443(iM2438);
                    C2847 c2847M2312 = C1720.m2312(c1720.m2319().f6292, AbstractC2882.m4330(iM2438, iM2438));
                    c1720.m2334(false);
                    InterfaceC8146 interfaceC8146 = c1720.f2850;
                    if (interfaceC8146 != null) {
                        ((C8144) interfaceC8146).m13068(0);
                    }
                    c1720.f2833.invoke(c2847M2312);
                    c1720.f2838 = new C2869(c2847M2312.f6291);
                }
                this.f2825 = false;
            } else {
                if (c1720.m2319().f6292.f6474.length() == 0) {
                    return;
                }
                c1720.m2334(false);
                long jM2309 = C1720.m2309(c1720, C2847.m4275(c1720.m2319(), null, C2869.f6348, 5), j, true, false, this.f2823, true, new C8145(0));
                j2 = j;
                c1720.f2847 = new C2869(jM2309);
                this.f2824 = new C2869(jM2309);
            }
            c1720.m2322(HandleState.None);
            c1720.f2846 = j2;
            ((AbstractC2182) c1720.f2837).setValue(new C8158(j2));
            c1720.f2844 = 0L;
        }
    }

    @Override // androidx.compose.foundation.text.InterfaceC1851
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo2308() {
        m2303();
    }

    @Override // androidx.compose.foundation.text.InterfaceC1851
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo2305() {
    }

    @Override // androidx.compose.foundation.text.InterfaceC1851
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo2306() {
    }
}
