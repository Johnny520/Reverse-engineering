package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.C2246;
import java.util.WeakHashMap;
import p155.C7607;
import top.suzhelan.qstory.hook.item.chat.C5856;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2485 extends C2246 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final WeakHashMap f7438 = new WeakHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C2482 f7439;

    public C2485(C2482 c2482) {
        this.f7439 = c2482;
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo4195(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C2246 c2246 = (C2246) this.f7438.get(viewGroup);
        return c2246 != null ? c2246.mo4195(viewGroup, view, accessibilityEvent) : this.f6547.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo4196(View view, AccessibilityEvent accessibilityEvent) {
        C2246 c2246 = (C2246) this.f7438.get(view);
        if (c2246 != null) {
            c2246.mo4196(view, accessibilityEvent);
        } else {
            super.mo4196(view, accessibilityEvent);
        }
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo3591(View view, C7607 c7607) {
        AccessibilityNodeInfo accessibilityNodeInfo = c7607.f20630;
        C2482 c2482 = this.f7439;
        RecyclerView recyclerView = c2482.f7435;
        RecyclerView recyclerView2 = c2482.f7435;
        boolean zM4702 = recyclerView.m4702();
        View.AccessibilityDelegate accessibilityDelegate = this.f6547;
        if (zM4702 || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().m5018(view, c7607);
        C2246 c2246 = (C2246) this.f7438.get(view);
        if (c2246 != null) {
            c2246.mo3591(view, c7607);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo4197(View view, AccessibilityEvent accessibilityEvent) {
        C2246 c2246 = (C2246) this.f7438.get(view);
        if (c2246 != null) {
            c2246.mo4197(view, accessibilityEvent);
        } else {
            super.mo4197(view, accessibilityEvent);
        }
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C5856 mo3576(View view) {
        C2246 c2246 = (C2246) this.f7438.get(view);
        return c2246 != null ? c2246.mo3576(view) : super.mo3576(view);
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo4198(View view, AccessibilityEvent accessibilityEvent) {
        C2246 c2246 = (C2246) this.f7438.get(view);
        return c2246 != null ? c2246.mo4198(view, accessibilityEvent) : this.f6547.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo4199(View view, int i) {
        C2246 c2246 = (C2246) this.f7438.get(view);
        if (c2246 != null) {
            c2246.mo4199(view, i);
        } else {
            super.mo4199(view, i);
        }
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo4200(View view, int i, Bundle bundle) {
        C2482 c2482 = this.f7439;
        RecyclerView recyclerView = c2482.f7435;
        RecyclerView recyclerView2 = c2482.f7435;
        if (recyclerView.m4702() || recyclerView2.getLayoutManager() == null) {
            return super.mo4200(view, i, bundle);
        }
        C2246 c2246 = (C2246) this.f7438.get(view);
        if (c2246 != null) {
            if (c2246.mo4200(view, i, bundle)) {
                return true;
            }
        } else if (super.mo4200(view, i, bundle)) {
            return true;
        }
        C2531 c2531 = recyclerView2.getLayoutManager().f7592.f7231;
        return false;
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo4201(View view, AccessibilityEvent accessibilityEvent) {
        C2246 c2246 = (C2246) this.f7438.get(view);
        if (c2246 != null) {
            c2246.mo4201(view, accessibilityEvent);
        } else {
            super.mo4201(view, accessibilityEvent);
        }
    }
}
