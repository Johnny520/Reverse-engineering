package androidx.compose.p001ui.platform;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.viewinterop.AbstractC2909;
import androidx.core.view.C3079;
import p171.C8436;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2728 extends C3079 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ C2583 f5903;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC2719 f5904;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC2719 f5905;

    public C2728(ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719, C2583 c2583, ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC27192) {
        this.f5904 = viewTreeObserverOnGlobalLayoutListenerC2719;
        this.f5903 = c2583;
        this.f5905 = viewTreeObserverOnGlobalLayoutListenerC27192;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    @Override // androidx.core.view.C3079
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo4151(View view, C8436 c8436) {
        AccessibilityNodeInfo accessibilityNodeInfo = c8436.f20975;
        this.f6892.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719 = this.f5904;
        ViewOnAttachStateChangeListenerC2720 viewOnAttachStateChangeListenerC2720 = viewTreeObserverOnGlobalLayoutListenerC2719.f5769;
        if (viewOnAttachStateChangeListenerC2720.m4140()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        }
        C2583 c2583 = this.f5903;
        C2583 c2583M3816 = c2583.m3816();
        while (true) {
            if (c2583M3816 == null) {
                c2583M3816 = null;
                break;
            } else if (c2583M3816.f5439.m3988(8)) {
                break;
            } else {
                c2583M3816 = c2583M3816.m3816();
            }
        }
        Integer numValueOf = c2583M3816 != null ? Integer.valueOf(c2583M3816.f5468) : null;
        if (numValueOf != null) {
            if (numValueOf.intValue() == viewTreeObserverOnGlobalLayoutListenerC2719.getSemanticsOwner().m4211().f6112) {
                numValueOf = -1;
            }
        }
        int iIntValue = numValueOf.intValue();
        c8436.f20974 = iIntValue;
        ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC27192 = this.f5905;
        accessibilityNodeInfo.setParent(viewTreeObserverOnGlobalLayoutListenerC27192, iIntValue);
        int i = c2583.f5468;
        int iM1358 = viewOnAttachStateChangeListenerC2720.f5855.m1358(i);
        if (iM1358 != -1) {
            AbstractC2909 abstractC2909M4183 = AbstractC2751.m4183(viewTreeObserverOnGlobalLayoutListenerC2719.getAndroidViewsHandler$ui(), iM1358);
            if (abstractC2909M4183 != null) {
                accessibilityNodeInfo.setTraversalBefore(abstractC2909M4183);
            } else {
                accessibilityNodeInfo.setTraversalBefore(viewTreeObserverOnGlobalLayoutListenerC27192, iM1358);
            }
            ViewTreeObserverOnGlobalLayoutListenerC2719.m4073(viewTreeObserverOnGlobalLayoutListenerC2719, i, accessibilityNodeInfo, viewOnAttachStateChangeListenerC2720.f5857);
        }
        int iM13582 = viewOnAttachStateChangeListenerC2720.f5854.m1358(i);
        if (iM13582 != -1) {
            AbstractC2909 abstractC2909M41832 = AbstractC2751.m4183(viewTreeObserverOnGlobalLayoutListenerC2719.getAndroidViewsHandler$ui(), iM13582);
            if (abstractC2909M41832 != null) {
                accessibilityNodeInfo.setTraversalAfter(abstractC2909M41832);
            } else {
                accessibilityNodeInfo.setTraversalAfter(viewTreeObserverOnGlobalLayoutListenerC27192, iM13582);
            }
            ViewTreeObserverOnGlobalLayoutListenerC2719.m4073(viewTreeObserverOnGlobalLayoutListenerC2719, i, accessibilityNodeInfo, viewOnAttachStateChangeListenerC2720.f5856);
        }
    }
}
