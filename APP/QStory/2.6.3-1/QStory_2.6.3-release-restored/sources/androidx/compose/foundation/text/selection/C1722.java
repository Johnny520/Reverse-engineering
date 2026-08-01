package androidx.compose.foundation.text.selection;

import androidx.collection.C1123;
import androidx.compose.foundation.text.C1781;
import androidx.compose.foundation.text.C1801;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.InterfaceC1851;
import androidx.compose.p001ui.text.AbstractC2882;
import androidx.compose.p001ui.text.C2869;
import androidx.compose.p001ui.text.input.InterfaceC2856;
import androidx.compose.runtime.AbstractC2182;
import p124.C8144;
import p124.InterfaceC8146;
import p128.C8158;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1722 implements InterfaceC1851 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C1720 f2856;

    public C1722(C1720 c1720) {
        this.f2856 = c1720;
    }

    @Override // androidx.compose.foundation.text.InterfaceC1851
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo2304(long j) {
        C1801 c1801M2425;
        InterfaceC8146 interfaceC8146;
        C1720 c1720 = this.f2856;
        c1720.f2844 = C8158.m13084(c1720.f2844, j);
        C1781 c1781 = c1720.f2832;
        if (c1781 == null || (c1801M2425 = c1781.m2425()) == null) {
            return;
        }
        ((AbstractC2182) c1720.f2837).setValue(new C8158(C8158.m13084(c1720.f2846, c1720.f2844)));
        InterfaceC2856 interfaceC2856 = c1720.f2834;
        C8158 c8158M2329 = c1720.m2329();
        c8158M2329.getClass();
        int iM2438 = c1801M2425.m2438(c8158M2329.f19886, true);
        interfaceC2856.mo2443(iM2438);
        long jM4330 = AbstractC2882.m4330(iM2438, iM2438);
        if (C2869.m4313(jM4330, c1720.m2319().f6291)) {
            return;
        }
        C1781 c17812 = c1720.f2832;
        if ((c17812 == null || ((Boolean) ((AbstractC2182) c17812.f3024).getValue()).booleanValue()) && (interfaceC8146 = c1720.f2850) != null) {
            ((C8144) interfaceC8146).m13068(9);
        }
        c1720.f2833.invoke(C1720.m2312(c1720.m2319().f6292, jM4330));
        c1720.f2838 = new C2869(jM4330);
    }

    @Override // androidx.compose.foundation.text.InterfaceC1851
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo2306() {
        C1720 c1720 = this.f2856;
        ((AbstractC2182) c1720.f2845).setValue(null);
        ((AbstractC2182) c1720.f2837).setValue(null);
    }

    @Override // androidx.compose.foundation.text.InterfaceC1851
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo2307(long j, C1123 c1123) {
        C1801 c1801M2425;
        C1720 c1720 = this.f2856;
        long jM2380 = AbstractC1742.m2380(c1720.m2328(true));
        C1781 c1781 = c1720.f2832;
        if (c1781 == null || (c1801M2425 = c1781.m2425()) == null) {
            return;
        }
        long jM2435 = c1801M2425.m2435(jM2380);
        c1720.f2846 = jM2435;
        ((AbstractC2182) c1720.f2837).setValue(new C8158(jM2435));
        c1720.f2844 = 0L;
        ((AbstractC2182) c1720.f2845).setValue(Handle.Cursor);
        c1720.m2313(false);
    }

    @Override // androidx.compose.foundation.text.InterfaceC1851
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2308() {
        C1720 c1720 = this.f2856;
        ((AbstractC2182) c1720.f2845).setValue(null);
        ((AbstractC2182) c1720.f2837).setValue(null);
    }

    @Override // androidx.compose.foundation.text.InterfaceC1851
    public final void onCancel() {
    }

    @Override // androidx.compose.foundation.text.InterfaceC1851
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2305() {
    }
}
