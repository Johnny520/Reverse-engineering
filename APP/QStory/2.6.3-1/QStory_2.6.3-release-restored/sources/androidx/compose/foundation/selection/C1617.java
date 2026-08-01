package androidx.compose.foundation.selection;

import android.view.autofill.AutofillValue;
import androidx.compose.foundation.C1868;
import androidx.compose.foundation.C1897;
import androidx.compose.foundation.C1905;
import androidx.compose.foundation.interaction.InterfaceC1421;
import androidx.compose.p001ui.autofill.C2239;
import androidx.compose.p001ui.autofill.C2250;
import androidx.compose.p001ui.semantics.AbstractC2778;
import androidx.compose.p001ui.semantics.AbstractC2781;
import androidx.compose.p001ui.semantics.AbstractC2794;
import androidx.compose.p001ui.semantics.C2776;
import androidx.compose.p001ui.semantics.C2782;
import androidx.compose.p001ui.semantics.C2789;
import androidx.compose.p001ui.semantics.InterfaceC2779;
import androidx.compose.p001ui.state.ToggleableState;
import kotlin.reflect.InterfaceC5920;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.foundation.selection.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1617 extends C1897 {

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public final C1868 f2591;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public InterfaceC7387 f2592;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public boolean f2593;

    public C1617(boolean z, InterfaceC1421 interfaceC1421, boolean z2, C2789 c2789, InterfaceC7387 interfaceC7387) {
        super(interfaceC1421, null, false, z2, null, c2789, new C1618(interfaceC7387, z));
        this.f2593 = z;
        this.f2592 = interfaceC7387;
        this.f2591 = new C1868(this, 3);
    }

    @Override // androidx.compose.foundation.AbstractC1892
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final void mo2139(InterfaceC2779 interfaceC2779) {
        ToggleableState toggleableState = this.f2593 ? ToggleableState.f12On : ToggleableState.Off;
        InterfaceC5920[] interfaceC5920Arr = AbstractC2781.f6100;
        C2782 c2782 = AbstractC2778.f6059;
        InterfaceC5920[] interfaceC5920Arr2 = AbstractC2781.f6100;
        InterfaceC5920 interfaceC5920 = interfaceC5920Arr2[26];
        c2782.getClass();
        interfaceC2779.mo4150(c2782, toggleableState);
        C2782 c27822 = AbstractC2778.f6081;
        InterfaceC5920 interfaceC59202 = interfaceC5920Arr2[9];
        c27822.getClass();
        interfaceC2779.mo4150(c27822, C2250.f4424);
        C2239 c2239 = new C2239(AutofillValue.forToggle(this.f2593));
        C2782 c27823 = AbstractC2778.f6080;
        InterfaceC5920 interfaceC59203 = interfaceC5920Arr2[10];
        c27823.getClass();
        interfaceC2779.mo4150(c27823, c2239);
        interfaceC2779.mo4150(AbstractC2794.f6151, new C2776(null, new C1905(interfaceC2779, 6)));
    }
}
