package p000;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: Ev */
/* JADX INFO: loaded from: classes.dex */
public final class C0210Ev extends C0645P {

    /* JADX INFO: renamed from: d */
    public final RecyclerView f616d;

    /* JADX INFO: renamed from: e */
    public final C0167Dv f617e;

    public C0210Ev(RecyclerView recyclerView) {
        this.f616d = recyclerView;
        C0167Dv c0167Dv = this.f617e;
        if (c0167Dv != null) {
            this.f617e = c0167Dv;
        } else {
            this.f617e = new C0167Dv(this);
        }
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: c */
    public final void mo318c(View view, AccessibilityEvent accessibilityEvent) {
        super.mo318c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f616d.hasPendingAdapterUpdates()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: d */
    public final void mo319d(View view, C1118a0 c1118a0) {
        this.f2082a.onInitializeAccessibilityNodeInfo(view, c1118a0.f3530a);
        RecyclerView recyclerView = this.f616d;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView.getLayoutManager() == null) {
            return;
        }
        recyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(c1118a0);
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: g */
    public final boolean mo322g(View view, int i, Bundle bundle) {
        if (super.mo322g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f616d;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().performAccessibilityAction(i, bundle);
    }
}
