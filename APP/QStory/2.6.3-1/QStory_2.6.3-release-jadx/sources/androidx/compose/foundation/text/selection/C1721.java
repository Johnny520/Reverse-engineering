package androidx.compose.foundation.text.selection;

import androidx.collection.C1123;
import androidx.compose.foundation.text.C1781;
import androidx.compose.foundation.text.C1801;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.InterfaceC1851;
import androidx.compose.p001ui.text.input.C2847;
import androidx.compose.runtime.AbstractC2182;
import p124.C8145;
import p128.C8158;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1721 implements InterfaceC1851 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ boolean f2854;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C1720 f2855;

    public C1721(C1720 c1720, boolean z) {
        this.f2855 = c1720;
        this.f2854 = z;
    }

    @Override // androidx.compose.foundation.text.InterfaceC1851
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo2304(long j) {
        C1720 c1720 = this.f2855;
        long jM13084 = C8158.m13084(c1720.f2844, j);
        c1720.f2844 = jM13084;
        ((AbstractC2182) c1720.f2837).setValue(new C8158(C8158.m13084(c1720.f2846, jM13084)));
        C2847 c2847M2319 = c1720.m2319();
        C8158 c8158M2329 = c1720.m2329();
        c8158M2329.getClass();
        C1720.m2309(c1720, c2847M2319, c8158M2329.f19886, false, this.f2854, C1753.f2948, true, new C8145(9));
        c1720.m2313(false);
    }

    @Override // androidx.compose.foundation.text.InterfaceC1851
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2305() {
        C1801 c1801M2425;
        boolean z = this.f2854;
        Handle handle = z ? Handle.SelectionStart : Handle.SelectionEnd;
        C1720 c1720 = this.f2855;
        ((AbstractC2182) c1720.f2845).setValue(handle);
        long jM2380 = AbstractC1742.m2380(c1720.m2328(z));
        C1781 c1781 = c1720.f2832;
        if (c1781 == null || (c1801M2425 = c1781.m2425()) == null) {
            return;
        }
        long jM2435 = c1801M2425.m2435(jM2380);
        c1720.f2846 = jM2435;
        ((AbstractC2182) c1720.f2837).setValue(new C8158(jM2435));
        c1720.f2844 = 0L;
        c1720.f2836 = -1;
        C1781 c17812 = c1720.f2832;
        if (c17812 != null) {
            ((AbstractC2182) c17812.f3024).setValue(Boolean.TRUE);
        }
        c1720.m2313(false);
    }

    @Override // androidx.compose.foundation.text.InterfaceC1851
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo2306() {
        C1720 c1720 = this.f2855;
        ((AbstractC2182) c1720.f2845).setValue(null);
        ((AbstractC2182) c1720.f2837).setValue(null);
        c1720.m2313(true);
    }

    @Override // androidx.compose.foundation.text.InterfaceC1851
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2308() {
        C1720 c1720 = this.f2855;
        ((AbstractC2182) c1720.f2845).setValue(null);
        ((AbstractC2182) c1720.f2837).setValue(null);
        c1720.m2313(true);
    }

    @Override // androidx.compose.foundation.text.InterfaceC1851
    public final void onCancel() {
    }

    @Override // androidx.compose.foundation.text.InterfaceC1851
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo2307(long j, C1123 c1123) {
    }
}
