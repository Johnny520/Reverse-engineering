package androidx.compose.foundation.selection;

import android.view.autofill.AutofillValue;
import androidx.compose.foundation.C1030;
import androidx.compose.foundation.C1059;
import androidx.compose.foundation.C1067;
import androidx.compose.foundation.interaction.InterfaceC0580;
import androidx.compose.ui.autofill.C1404;
import androidx.compose.ui.autofill.C1415;
import androidx.compose.ui.semantics.AbstractC1943;
import androidx.compose.ui.semantics.AbstractC1946;
import androidx.compose.ui.semantics.AbstractC1959;
import androidx.compose.ui.semantics.C1941;
import androidx.compose.ui.semantics.C1947;
import androidx.compose.ui.semantics.C1954;
import androidx.compose.ui.semantics.InterfaceC1944;
import androidx.compose.ui.state.ToggleableState;
import kotlin.reflect.InterfaceC5087;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.foundation.selection.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0777 extends C1059 {

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public final C1030 f2245;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public InterfaceC6557 f2246;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public boolean f2247;

    public C0777(boolean z, InterfaceC0580 interfaceC0580, boolean z2, C1954 c1954, InterfaceC6557 interfaceC6557) {
        super(interfaceC0580, null, false, z2, null, c1954, new C0778(interfaceC6557, z));
        this.f2247 = z;
        this.f2246 = interfaceC6557;
        this.f2245 = new C1030(this, 3);
    }

    @Override // androidx.compose.foundation.AbstractC1054
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final void mo1569(InterfaceC1944 interfaceC1944) {
        ToggleableState toggleableState = this.f2247 ? ToggleableState.On : ToggleableState.Off;
        InterfaceC5087[] interfaceC5087Arr = AbstractC1946.f5754;
        C1947 c1947 = AbstractC1943.f5713;
        InterfaceC5087[] interfaceC5087Arr2 = AbstractC1946.f5754;
        InterfaceC5087 interfaceC5087 = interfaceC5087Arr2[26];
        c1947.getClass();
        interfaceC1944.mo3580(c1947, toggleableState);
        C1947 c19472 = AbstractC1943.f5735;
        InterfaceC5087 interfaceC50872 = interfaceC5087Arr2[9];
        c19472.getClass();
        interfaceC1944.mo3580(c19472, C1415.f4078);
        C1404 c1404 = new C1404(AutofillValue.forToggle(this.f2247));
        C1947 c19473 = AbstractC1943.f5734;
        InterfaceC5087 interfaceC50873 = interfaceC5087Arr2[10];
        c19473.getClass();
        interfaceC1944.mo3580(c19473, c1404);
        interfaceC1944.mo3580(AbstractC1959.f5805, new C1941(null, new C1067(interfaceC1944, 6)));
    }
}
