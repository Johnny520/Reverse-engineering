package androidx.compose.ui.semantics;

import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import androidx.appcompat.app.C0113;
import androidx.collection.AbstractC0269;
import androidx.collection.C0244;
import androidx.collection.C0245;
import androidx.collection.C0246;
import androidx.compose.ui.autofill.AbstractC1408;
import androidx.compose.ui.autofill.C1404;
import androidx.compose.ui.autofill.C1407;
import androidx.compose.ui.autofill.C1415;
import androidx.compose.ui.autofill.InterfaceC1411;
import androidx.compose.ui.autofill.InterfaceC1416;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.C2068;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.text.AbstractC5143;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1951 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C0244 f5761 = new C0244(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC0269 f5762;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1937 f5763;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1748 f5764;

    public C1951(C1748 c1748, C1937 c1937, C0246 c0246) {
        this.f5764 = c1748;
        this.f5763 = c1937;
        this.f5762 = c0246;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m3640(C1748 c1748, C1956 c1956) {
        C2068 c2068;
        C2068 c20682;
        C0244 c0244 = this.f5761;
        Object[] objArr = c0244.f1005;
        int i = c0244.f1004;
        for (int i2 = 0; i2 < i; i2++) {
            C1407 c1407 = (C1407) objArr[i2];
            C0113 c0113 = c1407.f4069;
            AutofillManager autofillManager = (AutofillManager) c0113.f357;
            ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = c1407.f4068;
            C1956 c1956M3244 = c1748.m3244();
            int i3 = c1748.f5122;
            String str = (c1956 == null || (c20682 = (C2068) AbstractC1957.m3663(c1956, AbstractC1943.f5726)) == null) ? null : c20682.f6128;
            String strM10149 = (c1956M3244 == null || (c2068 = (C2068) AbstractC1957.m3663(c1956M3244, AbstractC1943.f5726)) == null) ? null : c2068.f6128;
            if (str != strM10149) {
                if (str == null) {
                    c0113.m426(viewTreeObserverOnGlobalLayoutListenerC1884, i3, true);
                } else if (strM10149 == null) {
                    c0113.m426(viewTreeObserverOnGlobalLayoutListenerC1884, i3, false);
                } else if (AbstractC4394.m8917((InterfaceC1416) AbstractC1957.m3663(c1956M3244, AbstractC1943.f5735), C1415.f4079)) {
                    if (strM10149.length() >= 5000) {
                        strM10149 = (Character.isHighSurrogate(strM10149.charAt(4999)) && Character.isLowSurrogate(strM10149.charAt(5000))) ? AbstractC5143.m10149(4999, strM10149) : AbstractC5143.m10149(5000, strM10149);
                    }
                    autofillManager.notifyValueChanged(viewTreeObserverOnGlobalLayoutListenerC1884, i3, AutofillValue.forText(strM10149));
                }
            }
            ToggleableState toggleableState = c1956 != null ? (ToggleableState) AbstractC1957.m3663(c1956, AbstractC1943.f5713) : null;
            ToggleableState toggleableState2 = c1956M3244 != null ? (ToggleableState) AbstractC1957.m3663(c1956M3244, AbstractC1943.f5713) : null;
            if (toggleableState != toggleableState2) {
                if (toggleableState == null) {
                    c0113.m426(viewTreeObserverOnGlobalLayoutListenerC1884, i3, true);
                } else if (toggleableState2 == null) {
                    c0113.m426(viewTreeObserverOnGlobalLayoutListenerC1884, i3, false);
                } else if (AbstractC4394.m8917((InterfaceC1416) AbstractC1957.m3663(c1956M3244, AbstractC1943.f5735), C1415.f4078)) {
                    int i4 = AbstractC1408.f4070[toggleableState2.ordinal()];
                    Boolean bool = i4 != 1 ? i4 != 2 ? null : Boolean.FALSE : Boolean.TRUE;
                    if (bool != null) {
                        autofillManager.notifyValueChanged(viewTreeObserverOnGlobalLayoutListenerC1884, i3, AutofillValue.forToggle(bool.booleanValue()));
                    }
                }
            }
            InterfaceC1411 interfaceC1411 = c1956 != null ? (InterfaceC1411) AbstractC1957.m3663(c1956, AbstractC1943.f5734) : null;
            InterfaceC1411 interfaceC14112 = c1956M3244 != null ? (InterfaceC1411) AbstractC1957.m3663(c1956M3244, AbstractC1943.f5734) : null;
            if (!AbstractC4394.m8917(interfaceC1411, interfaceC14112)) {
                if (interfaceC1411 == null) {
                    c0113.m426(viewTreeObserverOnGlobalLayoutListenerC1884, i3, true);
                } else if (interfaceC14112 == null) {
                    c0113.m426(viewTreeObserverOnGlobalLayoutListenerC1884, i3, false);
                } else {
                    autofillManager.notifyValueChanged(viewTreeObserverOnGlobalLayoutListenerC1884, i3, ((C1404) interfaceC14112).f4058);
                }
            }
            boolean z = c1956 != null && c1956.f5778.m752(AbstractC1943.f5743);
            boolean z2 = c1956M3244 != null && c1956M3244.f5778.m752(AbstractC1943.f5743);
            if (z != z2) {
                C0245 c0245 = c1407.f4063;
                if (z2) {
                    c0245.m784(i3);
                } else {
                    c0245.m780(i3);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1953 m3641() {
        return new C1953(this.f5763, false, this.f5764, new C1956());
    }
}
