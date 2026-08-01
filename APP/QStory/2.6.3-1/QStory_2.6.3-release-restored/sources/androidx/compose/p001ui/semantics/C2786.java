package androidx.compose.p001ui.semantics;

import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import androidx.appcompat.app.C0960;
import androidx.collection.AbstractC1116;
import androidx.collection.C1091;
import androidx.collection.C1092;
import androidx.collection.C1093;
import androidx.compose.p001ui.autofill.AbstractC2243;
import androidx.compose.p001ui.autofill.C2239;
import androidx.compose.p001ui.autofill.C2242;
import androidx.compose.p001ui.autofill.C2250;
import androidx.compose.p001ui.autofill.InterfaceC2246;
import androidx.compose.p001ui.autofill.InterfaceC2251;
import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import androidx.compose.p001ui.state.ToggleableState;
import androidx.compose.p001ui.text.C2902;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5976;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2786 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C1091 f6107 = new C1091(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC1116 f6108;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2772 f6109;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2583 f6110;

    public C2786(C2583 c2583, C2772 c2772, C1093 c1093) {
        this.f6110 = c2583;
        this.f6109 = c2772;
        this.f6108 = c1093;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m4210(C2583 c2583, C2791 c2791) {
        C2902 c2902;
        C2902 c29022;
        C1091 c1091 = this.f6107;
        Object[] objArr = c1091.f1350;
        int i = c1091.f1349;
        for (int i2 = 0; i2 < i; i2++) {
            C2242 c2242 = (C2242) objArr[i2];
            C0960 c0960 = c2242.f4415;
            AutofillManager autofillManager = (AutofillManager) c0960.f702;
            ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719 = c2242.f4414;
            C2791 c2791M3814 = c2583.m3814();
            int i3 = c2583.f5468;
            String str = (c2791 == null || (c29022 = (C2902) AbstractC2792.m4233(c2791, AbstractC2778.f6072)) == null) ? null : c29022.f6474;
            String strM10712 = (c2791M3814 == null || (c2902 = (C2902) AbstractC2792.m4233(c2791M3814, AbstractC2778.f6072)) == null) ? null : c2902.f6474;
            if (str != strM10712) {
                if (str == null) {
                    c0960.m987(viewTreeObserverOnGlobalLayoutListenerC2719, i3, true);
                } else if (strM10712 == null) {
                    c0960.m987(viewTreeObserverOnGlobalLayoutListenerC2719, i3, false);
                } else if (AbstractC5227.m9466((InterfaceC2251) AbstractC2792.m4233(c2791M3814, AbstractC2778.f6081), C2250.f4425)) {
                    if (strM10712.length() >= 5000) {
                        strM10712 = (Character.isHighSurrogate(strM10712.charAt(4999)) && Character.isLowSurrogate(strM10712.charAt(5000))) ? AbstractC5976.m10712(4999, strM10712) : AbstractC5976.m10712(5000, strM10712);
                    }
                    autofillManager.notifyValueChanged(viewTreeObserverOnGlobalLayoutListenerC2719, i3, AutofillValue.forText(strM10712));
                }
            }
            ToggleableState toggleableState = c2791 != null ? (ToggleableState) AbstractC2792.m4233(c2791, AbstractC2778.f6059) : null;
            ToggleableState toggleableState2 = c2791M3814 != null ? (ToggleableState) AbstractC2792.m4233(c2791M3814, AbstractC2778.f6059) : null;
            if (toggleableState != toggleableState2) {
                if (toggleableState == null) {
                    c0960.m987(viewTreeObserverOnGlobalLayoutListenerC2719, i3, true);
                } else if (toggleableState2 == null) {
                    c0960.m987(viewTreeObserverOnGlobalLayoutListenerC2719, i3, false);
                } else if (AbstractC5227.m9466((InterfaceC2251) AbstractC2792.m4233(c2791M3814, AbstractC2778.f6081), C2250.f4424)) {
                    int i4 = AbstractC2243.f4416[toggleableState2.ordinal()];
                    Boolean bool = i4 != 1 ? i4 != 2 ? null : Boolean.FALSE : Boolean.TRUE;
                    if (bool != null) {
                        autofillManager.notifyValueChanged(viewTreeObserverOnGlobalLayoutListenerC2719, i3, AutofillValue.forToggle(bool.booleanValue()));
                    }
                }
            }
            InterfaceC2246 interfaceC2246 = c2791 != null ? (InterfaceC2246) AbstractC2792.m4233(c2791, AbstractC2778.f6080) : null;
            InterfaceC2246 interfaceC22462 = c2791M3814 != null ? (InterfaceC2246) AbstractC2792.m4233(c2791M3814, AbstractC2778.f6080) : null;
            if (!AbstractC5227.m9466(interfaceC2246, interfaceC22462)) {
                if (interfaceC2246 == null) {
                    c0960.m987(viewTreeObserverOnGlobalLayoutListenerC2719, i3, true);
                } else if (interfaceC22462 == null) {
                    c0960.m987(viewTreeObserverOnGlobalLayoutListenerC2719, i3, false);
                } else {
                    autofillManager.notifyValueChanged(viewTreeObserverOnGlobalLayoutListenerC2719, i3, ((C2239) interfaceC22462).f4404);
                }
            }
            boolean z = c2791 != null && c2791.f6124.m1313(AbstractC2778.f6089);
            boolean z2 = c2791M3814 != null && c2791M3814.f6124.m1313(AbstractC2778.f6089);
            if (z != z2) {
                C1092 c1092 = c2242.f4409;
                if (z2) {
                    c1092.m1345(i3);
                } else {
                    c1092.m1341(i3);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2788 m4211() {
        return new C2788(this.f6109, false, this.f6110, new C2791());
    }
}
