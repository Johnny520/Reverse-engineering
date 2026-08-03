package p000;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: Dv */
/* JADX INFO: loaded from: classes.dex */
public final class C0167Dv extends C0645P {

    /* JADX INFO: renamed from: d */
    public final C0210Ev f448d;

    /* JADX INFO: renamed from: e */
    public final WeakHashMap f449e = new WeakHashMap();

    public C0167Dv(C0210Ev c0210Ev) {
        this.f448d = c0210Ev;
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: a */
    public final boolean mo316a(View view, AccessibilityEvent accessibilityEvent) {
        C0645P c0645p = (C0645P) this.f449e.get(view);
        return c0645p != null ? c0645p.mo316a(view, accessibilityEvent) : this.f2082a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: b */
    public final C0132D2 mo317b(View view) {
        C0645P c0645p = (C0645P) this.f449e.get(view);
        return c0645p != null ? c0645p.mo317b(view) : super.mo317b(view);
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: c */
    public final void mo318c(View view, AccessibilityEvent accessibilityEvent) {
        C0645P c0645p = (C0645P) this.f449e.get(view);
        if (c0645p != null) {
            c0645p.mo318c(view, accessibilityEvent);
        } else {
            super.mo318c(view, accessibilityEvent);
        }
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: d */
    public final void mo319d(View view, C1118a0 c1118a0) {
        AccessibilityNodeInfo accessibilityNodeInfo = c1118a0.f3530a;
        C0210Ev c0210Ev = this.f448d;
        RecyclerView recyclerView = c0210Ev.f616d;
        RecyclerView recyclerView2 = c0210Ev.f616d;
        boolean zHasPendingAdapterUpdates = recyclerView.hasPendingAdapterUpdates();
        View.AccessibilityDelegate accessibilityDelegate = this.f2082a;
        if (zHasPendingAdapterUpdates || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, c1118a0);
        C0645P c0645p = (C0645P) this.f449e.get(view);
        if (c0645p != null) {
            c0645p.mo319d(view, c1118a0);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: e */
    public final void mo320e(View view, AccessibilityEvent accessibilityEvent) {
        C0645P c0645p = (C0645P) this.f449e.get(view);
        if (c0645p != null) {
            c0645p.mo320e(view, accessibilityEvent);
        } else {
            super.mo320e(view, accessibilityEvent);
        }
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: f */
    public final boolean mo321f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0645P c0645p = (C0645P) this.f449e.get(viewGroup);
        return c0645p != null ? c0645p.mo321f(viewGroup, view, accessibilityEvent) : this.f2082a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: g */
    public final boolean mo322g(View view, int i, Bundle bundle) {
        C0210Ev c0210Ev = this.f448d;
        RecyclerView recyclerView = c0210Ev.f616d;
        RecyclerView recyclerView2 = c0210Ev.f616d;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView2.getLayoutManager() == null) {
            return super.mo322g(view, i, bundle);
        }
        C0645P c0645p = (C0645P) this.f449e.get(view);
        if (c0645p != null) {
            if (c0645p.mo322g(view, i, bundle)) {
                return true;
            }
        } else if (super.mo322g(view, i, bundle)) {
            return true;
        }
        return recyclerView2.getLayoutManager().performAccessibilityActionForItem(view, i, bundle);
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: h */
    public final void mo323h(View view, int i) {
        C0645P c0645p = (C0645P) this.f449e.get(view);
        if (c0645p != null) {
            c0645p.mo323h(view, i);
        } else {
            super.mo323h(view, i);
        }
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: i */
    public final void mo324i(View view, AccessibilityEvent accessibilityEvent) {
        C0645P c0645p = (C0645P) this.f449e.get(view);
        if (c0645p != null) {
            c0645p.mo324i(view, accessibilityEvent);
        } else {
            super.mo324i(view, accessibilityEvent);
        }
    }
}
