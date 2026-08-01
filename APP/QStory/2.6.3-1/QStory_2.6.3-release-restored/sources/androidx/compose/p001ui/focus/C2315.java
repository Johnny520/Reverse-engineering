package androidx.compose.p001ui.focus;

import androidx.collection.AbstractC1132;
import androidx.collection.C1082;
import androidx.collection.C1091;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;

/* JADX INFO: renamed from: androidx.compose.ui.focus.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2315 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f4541;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C1082 f4542;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1082 f4543;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC2719 f4544;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2313 f4545;

    public C2315(C2313 c2313, ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719) {
        this.f4545 = c2313;
        this.f4544 = viewTreeObserverOnGlobalLayoutListenerC2719;
        C1082 c1082 = AbstractC1132.f1342;
        this.f4543 = new C1082();
        this.f4542 = new C1082();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3209() {
        if (this.f4541) {
            return;
        }
        FocusInvalidationManager$scheduleInvalidation$1 focusInvalidationManager$scheduleInvalidation$1 = new FocusInvalidationManager$scheduleInvalidation$1(this);
        C1091 c1091 = this.f4544.f5814;
        if (c1091.m1440(focusInvalidationManager$scheduleInvalidation$1) < 0) {
            c1091.m1335(focusInvalidationManager$scheduleInvalidation$1);
        }
        this.f4541 = true;
    }
}
