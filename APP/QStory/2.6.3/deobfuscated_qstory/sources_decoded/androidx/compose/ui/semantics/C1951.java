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
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5144;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1951 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C0244 f5762 = new C0244(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC0269 f5763;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1937 f5764;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1748 f5765;

    public C1951(C1748 c1748, C1937 c1937, C0246 c0246) {
        this.f5765 = c1748;
        this.f5764 = c1937;
        this.f5763 = c0246;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m3650(C1748 c1748, C1956 c1956) {
        C2068 c2068;
        C2068 c20682;
        C0244 c0244 = this.f5762;
        Object[] objArr = c0244.f1005;
        int i = c0244.f1004;
        for (int i2 = 0; i2 < i; i2++) {
            C1407 c1407 = (C1407) objArr[i2];
            C0113 c0113 = c1407.f4070;
            AutofillManager autofillManager = (AutofillManager) c0113.f357;
            ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = c1407.f4069;
            C1956 c1956M3254 = c1748.m3254();
            int i3 = c1748.f5123;
            String str = (c1956 == null || (c20682 = (C2068) AbstractC1957.m3673(c1956, AbstractC1943.f5727)) == null) ? null : c20682.f6129;
            String strM10153 = (c1956M3254 == null || (c2068 = (C2068) AbstractC1957.m3673(c1956M3254, AbstractC1943.f5727)) == null) ? null : c2068.f6129;
            if (str != strM10153) {
                if (str == null) {
                    c0113.m427(viewTreeObserverOnGlobalLayoutListenerC1884, i3, true);
                } else if (strM10153 == null) {
                    c0113.m427(viewTreeObserverOnGlobalLayoutListenerC1884, i3, false);
                } else if (AbstractC4395.m8907((InterfaceC1416) AbstractC1957.m3673(c1956M3254, AbstractC1943.f5736), C1415.f4080)) {
                    if (strM10153.length() >= 5000) {
                        strM10153 = (Character.isHighSurrogate(strM10153.charAt(4999)) && Character.isLowSurrogate(strM10153.charAt(5000))) ? AbstractC5144.m10153(4999, strM10153) : AbstractC5144.m10153(5000, strM10153);
                    }
                    autofillManager.notifyValueChanged(viewTreeObserverOnGlobalLayoutListenerC1884, i3, AutofillValue.forText(strM10153));
                }
            }
            ToggleableState toggleableState = c1956 != null ? (ToggleableState) AbstractC1957.m3673(c1956, AbstractC1943.f5714) : null;
            ToggleableState toggleableState2 = c1956M3254 != null ? (ToggleableState) AbstractC1957.m3673(c1956M3254, AbstractC1943.f5714) : null;
            if (toggleableState != toggleableState2) {
                if (toggleableState == null) {
                    c0113.m427(viewTreeObserverOnGlobalLayoutListenerC1884, i3, true);
                } else if (toggleableState2 == null) {
                    c0113.m427(viewTreeObserverOnGlobalLayoutListenerC1884, i3, false);
                } else if (AbstractC4395.m8907((InterfaceC1416) AbstractC1957.m3673(c1956M3254, AbstractC1943.f5736), C1415.f4079)) {
                    int i4 = AbstractC1408.f4071[toggleableState2.ordinal()];
                    Boolean bool = i4 != 1 ? i4 != 2 ? null : Boolean.FALSE : Boolean.TRUE;
                    if (bool != null) {
                        autofillManager.notifyValueChanged(viewTreeObserverOnGlobalLayoutListenerC1884, i3, AutofillValue.forToggle(bool.booleanValue()));
                    }
                }
            }
            InterfaceC1411 interfaceC1411 = c1956 != null ? (InterfaceC1411) AbstractC1957.m3673(c1956, AbstractC1943.f5735) : null;
            InterfaceC1411 interfaceC14112 = c1956M3254 != null ? (InterfaceC1411) AbstractC1957.m3673(c1956M3254, AbstractC1943.f5735) : null;
            if (!AbstractC4395.m8907(interfaceC1411, interfaceC14112)) {
                if (interfaceC1411 == null) {
                    c0113.m427(viewTreeObserverOnGlobalLayoutListenerC1884, i3, true);
                } else if (interfaceC14112 == null) {
                    c0113.m427(viewTreeObserverOnGlobalLayoutListenerC1884, i3, false);
                } else {
                    autofillManager.notifyValueChanged(viewTreeObserverOnGlobalLayoutListenerC1884, i3, ((C1404) interfaceC14112).f4059);
                }
            }
            boolean z = c1956 != null && c1956.f5779.m753(AbstractC1943.f5744);
            boolean z2 = c1956M3254 != null && c1956M3254.f5779.m753(AbstractC1943.f5744);
            if (z != z2) {
                C0245 c0245 = c1407.f4064;
                if (z2) {
                    c0245.m785(i3);
                } else {
                    c0245.m781(i3);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1953 m3651() {
        return new C1953(this.f5764, false, this.f5765, new C1956());
    }
}
