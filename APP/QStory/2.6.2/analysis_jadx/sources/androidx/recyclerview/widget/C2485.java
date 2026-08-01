package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.C2246;
import java.util.WeakHashMap;
import p155.C7606;
import top.suzhelan.qstory.hook.item.chat.C5851;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2485 extends C2246 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final WeakHashMap f7437 = new WeakHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C2482 f7438;

    public C2485(C2482 c2482) {
        this.f7438 = c2482;
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo4185(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C2246 c2246 = (C2246) this.f7437.get(viewGroup);
        return c2246 != null ? c2246.mo4185(viewGroup, view, accessibilityEvent) : this.f6546.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo4186(View view, AccessibilityEvent accessibilityEvent) {
        C2246 c2246 = (C2246) this.f7437.get(view);
        if (c2246 != null) {
            c2246.mo4186(view, accessibilityEvent);
        } else {
            super.mo4186(view, accessibilityEvent);
        }
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo3581(View view, C7606 c7606) {
        AccessibilityNodeInfo accessibilityNodeInfo = c7606.f20635;
        C2482 c2482 = this.f7438;
        RecyclerView recyclerView = c2482.f7434;
        RecyclerView recyclerView2 = c2482.f7434;
        boolean zM4692 = recyclerView.m4692();
        View.AccessibilityDelegate accessibilityDelegate = this.f6546;
        if (zM4692 || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().m5008(view, c7606);
        C2246 c2246 = (C2246) this.f7437.get(view);
        if (c2246 != null) {
            c2246.mo3581(view, c7606);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo4187(View view, AccessibilityEvent accessibilityEvent) {
        C2246 c2246 = (C2246) this.f7437.get(view);
        if (c2246 != null) {
            c2246.mo4187(view, accessibilityEvent);
        } else {
            super.mo4187(view, accessibilityEvent);
        }
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C5851 mo3566(View view) {
        C2246 c2246 = (C2246) this.f7437.get(view);
        return c2246 != null ? c2246.mo3566(view) : super.mo3566(view);
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo4188(View view, AccessibilityEvent accessibilityEvent) {
        C2246 c2246 = (C2246) this.f7437.get(view);
        return c2246 != null ? c2246.mo4188(view, accessibilityEvent) : this.f6546.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo4189(View view, int i) {
        C2246 c2246 = (C2246) this.f7437.get(view);
        if (c2246 != null) {
            c2246.mo4189(view, i);
        } else {
            super.mo4189(view, i);
        }
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo4190(View view, int i, Bundle bundle) {
        C2482 c2482 = this.f7438;
        RecyclerView recyclerView = c2482.f7434;
        RecyclerView recyclerView2 = c2482.f7434;
        if (recyclerView.m4692() || recyclerView2.getLayoutManager() == null) {
            return super.mo4190(view, i, bundle);
        }
        C2246 c2246 = (C2246) this.f7437.get(view);
        if (c2246 != null) {
            if (c2246.mo4190(view, i, bundle)) {
                return true;
            }
        } else if (super.mo4190(view, i, bundle)) {
            return true;
        }
        C2531 c2531 = recyclerView2.getLayoutManager().f7591.f7230;
        return false;
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo4191(View view, AccessibilityEvent accessibilityEvent) {
        C2246 c2246 = (C2246) this.f7437.get(view);
        if (c2246 != null) {
            c2246.mo4191(view, accessibilityEvent);
        } else {
            super.mo4191(view, accessibilityEvent);
        }
    }
}
