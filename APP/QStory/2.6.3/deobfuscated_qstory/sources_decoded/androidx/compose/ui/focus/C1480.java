package androidx.compose.ui.focus;

import androidx.collection.AbstractC0285;
import androidx.collection.C0235;
import androidx.collection.C0244;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;

/* JADX INFO: renamed from: androidx.compose.ui.focus.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1480 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f4196;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C0235 f4197;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C0235 f4198;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC1884 f4199;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1478 f4200;

    public C1480(C1478 c1478, ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884) {
        this.f4200 = c1478;
        this.f4199 = viewTreeObserverOnGlobalLayoutListenerC1884;
        C0235 c0235 = AbstractC0285.f997;
        this.f4198 = new C0235();
        this.f4197 = new C0235();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m2649() {
        if (this.f4196) {
            return;
        }
        FocusInvalidationManager$scheduleInvalidation$1 focusInvalidationManager$scheduleInvalidation$1 = new FocusInvalidationManager$scheduleInvalidation$1(this);
        C0244 c0244 = this.f4199.f5469;
        if (c0244.m880(focusInvalidationManager$scheduleInvalidation$1) < 0) {
            c0244.m775(focusInvalidationManager$scheduleInvalidation$1);
        }
        this.f4196 = true;
    }
}
