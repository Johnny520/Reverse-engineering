package p000;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c00 extends C0875x {

    /* JADX INFO: renamed from: d */
    public final d00 f861d;

    /* JADX INFO: renamed from: e */
    public final WeakHashMap f862e = new WeakHashMap();

    public c00(d00 d00Var) {
        this.f861d = d00Var;
    }

    @Override // p000.C0875x
    /* JADX INFO: renamed from: a */
    public final boolean mo615a(View view, AccessibilityEvent accessibilityEvent) {
        C0875x c0875x = (C0875x) this.f862e.get(view);
        return c0875x != null ? c0875x.mo615a(view, accessibilityEvent) : this.f5076a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // p000.C0875x
    /* JADX INFO: renamed from: b */
    public final C0431l0 mo616b(View view) {
        C0875x c0875x = (C0875x) this.f862e.get(view);
        return c0875x != null ? c0875x.mo616b(view) : super.mo616b(view);
    }

    @Override // p000.C0875x
    /* JADX INFO: renamed from: c */
    public final void mo65c(View view, AccessibilityEvent accessibilityEvent) {
        C0875x c0875x = (C0875x) this.f862e.get(view);
        if (c0875x != null) {
            c0875x.mo65c(view, accessibilityEvent);
        } else {
            super.mo65c(view, accessibilityEvent);
        }
    }

    @Override // p000.C0875x
    /* JADX INFO: renamed from: d */
    public final void mo66d(View view, C0357j0 c0357j0) {
        AccessibilityNodeInfo accessibilityNodeInfo = c0357j0.f2513a;
        d00 d00Var = this.f861d;
        RecyclerView recyclerView = d00Var.f1345d;
        RecyclerView recyclerView2 = d00Var.f1345d;
        boolean zM381K = recyclerView.m381K();
        View.AccessibilityDelegate accessibilityDelegate = this.f5076a;
        if (zM381K || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().m1965T(view, c0357j0);
        C0875x c0875x = (C0875x) this.f862e.get(view);
        if (c0875x != null) {
            c0875x.mo66d(view, c0357j0);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // p000.C0875x
    /* JADX INFO: renamed from: e */
    public final void mo617e(View view, AccessibilityEvent accessibilityEvent) {
        C0875x c0875x = (C0875x) this.f862e.get(view);
        if (c0875x != null) {
            c0875x.mo617e(view, accessibilityEvent);
        } else {
            super.mo617e(view, accessibilityEvent);
        }
    }

    @Override // p000.C0875x
    /* JADX INFO: renamed from: f */
    public final boolean mo618f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0875x c0875x = (C0875x) this.f862e.get(viewGroup);
        return c0875x != null ? c0875x.mo618f(viewGroup, view, accessibilityEvent) : this.f5076a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // p000.C0875x
    /* JADX INFO: renamed from: g */
    public final boolean mo619g(View view, int i, Bundle bundle) {
        d00 d00Var = this.f861d;
        RecyclerView recyclerView = d00Var.f1345d;
        RecyclerView recyclerView2 = d00Var.f1345d;
        if (recyclerView.m381K() || recyclerView2.getLayoutManager() == null) {
            return super.mo619g(view, i, bundle);
        }
        C0875x c0875x = (C0875x) this.f862e.get(view);
        if (c0875x != null) {
            if (c0875x.mo619g(view, i, bundle)) {
                return true;
            }
        } else if (super.mo619g(view, i, bundle)) {
            return true;
        }
        C0763tz c0763tz = recyclerView2.getLayoutManager().f3456b.f585b;
        return false;
    }

    @Override // p000.C0875x
    /* JADX INFO: renamed from: h */
    public final void mo620h(View view, int i) {
        C0875x c0875x = (C0875x) this.f862e.get(view);
        if (c0875x != null) {
            c0875x.mo620h(view, i);
        } else {
            super.mo620h(view, i);
        }
    }

    @Override // p000.C0875x
    /* JADX INFO: renamed from: i */
    public final void mo621i(View view, AccessibilityEvent accessibilityEvent) {
        C0875x c0875x = (C0875x) this.f862e.get(view);
        if (c0875x != null) {
            c0875x.mo621i(view, accessibilityEvent);
        } else {
            super.mo621i(view, accessibilityEvent);
        }
    }
}
