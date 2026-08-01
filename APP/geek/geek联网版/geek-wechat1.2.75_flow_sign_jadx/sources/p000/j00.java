package p000;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class j00 extends C0875x {

    /* JADX INFO: renamed from: d */
    public final k00 f2621d;

    /* JADX INFO: renamed from: e */
    public final WeakHashMap f2622e = new WeakHashMap();

    public j00(k00 k00Var) {
        this.f2621d = k00Var;
    }

    @Override // p000.C0875x
    /* JADX INFO: renamed from: a */
    public final boolean mo1553a(View view, AccessibilityEvent accessibilityEvent) {
        C0875x c0875x = (C0875x) this.f2622e.get(view);
        return c0875x != null ? c0875x.mo1553a(view, accessibilityEvent) : this.f5147a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // p000.C0875x
    /* JADX INFO: renamed from: b */
    public final C0431l0 mo1554b(View view) {
        C0875x c0875x = (C0875x) this.f2622e.get(view);
        return c0875x != null ? c0875x.mo1554b(view) : super.mo1554b(view);
    }

    @Override // p000.C0875x
    /* JADX INFO: renamed from: c */
    public final void mo1490c(View view, AccessibilityEvent accessibilityEvent) {
        C0875x c0875x = (C0875x) this.f2622e.get(view);
        if (c0875x != null) {
            c0875x.mo1490c(view, accessibilityEvent);
        } else {
            super.mo1490c(view, accessibilityEvent);
        }
    }

    @Override // p000.C0875x
    /* JADX INFO: renamed from: d */
    public final void mo760d(View view, C0357j0 c0357j0) {
        AccessibilityNodeInfo accessibilityNodeInfo = c0357j0.f2619a;
        k00 k00Var = this.f2621d;
        RecyclerView recyclerView = k00Var.f2761d;
        RecyclerView recyclerView2 = k00Var.f2761d;
        boolean zM366K = recyclerView.m366K();
        View.AccessibilityDelegate accessibilityDelegate = this.f5147a;
        if (zM366K || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().m2513T(view, c0357j0);
        C0875x c0875x = (C0875x) this.f2622e.get(view);
        if (c0875x != null) {
            c0875x.mo760d(view, c0357j0);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // p000.C0875x
    /* JADX INFO: renamed from: e */
    public final void mo1555e(View view, AccessibilityEvent accessibilityEvent) {
        C0875x c0875x = (C0875x) this.f2622e.get(view);
        if (c0875x != null) {
            c0875x.mo1555e(view, accessibilityEvent);
        } else {
            super.mo1555e(view, accessibilityEvent);
        }
    }

    @Override // p000.C0875x
    /* JADX INFO: renamed from: f */
    public final boolean mo1556f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0875x c0875x = (C0875x) this.f2622e.get(viewGroup);
        return c0875x != null ? c0875x.mo1556f(viewGroup, view, accessibilityEvent) : this.f5147a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // p000.C0875x
    /* JADX INFO: renamed from: g */
    public final boolean mo761g(View view, int i, Bundle bundle) {
        k00 k00Var = this.f2621d;
        RecyclerView recyclerView = k00Var.f2761d;
        RecyclerView recyclerView2 = k00Var.f2761d;
        if (recyclerView.m366K() || recyclerView2.getLayoutManager() == null) {
            return super.mo761g(view, i, bundle);
        }
        C0875x c0875x = (C0875x) this.f2622e.get(view);
        if (c0875x != null) {
            if (c0875x.mo761g(view, i, bundle)) {
                return true;
            }
        } else if (super.mo761g(view, i, bundle)) {
            return true;
        }
        a00 a00Var = recyclerView2.getLayoutManager().f4856b.f548b;
        return false;
    }

    @Override // p000.C0875x
    /* JADX INFO: renamed from: h */
    public final void mo1557h(View view, int i) {
        C0875x c0875x = (C0875x) this.f2622e.get(view);
        if (c0875x != null) {
            c0875x.mo1557h(view, i);
        } else {
            super.mo1557h(view, i);
        }
    }

    @Override // p000.C0875x
    /* JADX INFO: renamed from: i */
    public final void mo1558i(View view, AccessibilityEvent accessibilityEvent) {
        C0875x c0875x = (C0875x) this.f2622e.get(view);
        if (c0875x != null) {
            c0875x.mo1558i(view, accessibilityEvent);
        } else {
            super.mo1558i(view, accessibilityEvent);
        }
    }
}
