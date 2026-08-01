package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.C3079;
import java.util.WeakHashMap;
import p171.C8436;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3318 extends C3079 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final WeakHashMap f7783 = new WeakHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C3315 f7784;

    public C3318(C3315 c3315) {
        this.f7784 = c3315;
    }

    @Override // androidx.core.view.C3079
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo4755(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C3079 c3079 = (C3079) this.f7783.get(viewGroup);
        return c3079 != null ? c3079.mo4755(viewGroup, view, accessibilityEvent) : this.f6892.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // androidx.core.view.C3079
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo4756(View view, AccessibilityEvent accessibilityEvent) {
        C3079 c3079 = (C3079) this.f7783.get(view);
        if (c3079 != null) {
            c3079.mo4756(view, accessibilityEvent);
        } else {
            super.mo4756(view, accessibilityEvent);
        }
    }

    @Override // androidx.core.view.C3079
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo4151(View view, C8436 c8436) {
        AccessibilityNodeInfo accessibilityNodeInfo = c8436.f20975;
        C3315 c3315 = this.f7784;
        RecyclerView recyclerView = c3315.f7780;
        RecyclerView recyclerView2 = c3315.f7780;
        boolean zM5262 = recyclerView.m5262();
        View.AccessibilityDelegate accessibilityDelegate = this.f6892;
        if (zM5262 || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().m5578(view, c8436);
        C3079 c3079 = (C3079) this.f7783.get(view);
        if (c3079 != null) {
            c3079.mo4151(view, c8436);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // androidx.core.view.C3079
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo4757(View view, AccessibilityEvent accessibilityEvent) {
        C3079 c3079 = (C3079) this.f7783.get(view);
        if (c3079 != null) {
            c3079.mo4757(view, accessibilityEvent);
        } else {
            super.mo4757(view, accessibilityEvent);
        }
    }

    @Override // androidx.core.view.C3079
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C6686 mo4136(View view) {
        C3079 c3079 = (C3079) this.f7783.get(view);
        return c3079 != null ? c3079.mo4136(view) : super.mo4136(view);
    }

    @Override // androidx.core.view.C3079
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo4758(View view, AccessibilityEvent accessibilityEvent) {
        C3079 c3079 = (C3079) this.f7783.get(view);
        return c3079 != null ? c3079.mo4758(view, accessibilityEvent) : this.f6892.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // androidx.core.view.C3079
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo4759(View view, int i) {
        C3079 c3079 = (C3079) this.f7783.get(view);
        if (c3079 != null) {
            c3079.mo4759(view, i);
        } else {
            super.mo4759(view, i);
        }
    }

    @Override // androidx.core.view.C3079
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo4760(View view, int i, Bundle bundle) {
        C3315 c3315 = this.f7784;
        RecyclerView recyclerView = c3315.f7780;
        RecyclerView recyclerView2 = c3315.f7780;
        if (recyclerView.m5262() || recyclerView2.getLayoutManager() == null) {
            return super.mo4760(view, i, bundle);
        }
        C3079 c3079 = (C3079) this.f7783.get(view);
        if (c3079 != null) {
            if (c3079.mo4760(view, i, bundle)) {
                return true;
            }
        } else if (super.mo4760(view, i, bundle)) {
            return true;
        }
        C3364 c3364 = recyclerView2.getLayoutManager().f7937.f7576;
        return false;
    }

    @Override // androidx.core.view.C3079
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo4761(View view, AccessibilityEvent accessibilityEvent) {
        C3079 c3079 = (C3079) this.f7783.get(view);
        if (c3079 != null) {
            c3079.mo4761(view, accessibilityEvent);
        } else {
            super.mo4761(view, accessibilityEvent);
        }
    }
}
