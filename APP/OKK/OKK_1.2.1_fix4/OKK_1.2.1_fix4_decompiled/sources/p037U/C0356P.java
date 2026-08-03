package p037U;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import p006D.C0091b;
import p008E.C0156j;
import p008E.C0158l;

/* JADX INFO: renamed from: U.P */
/* JADX INFO: loaded from: classes.dex */
public final class C0356P extends C0091b {

    /* JADX INFO: renamed from: d */
    public final C0357Q f717d;

    /* JADX INFO: renamed from: e */
    public final WeakHashMap f718e = new WeakHashMap();

    public C0356P(C0357Q c0357q) {
        this.f717d = c0357q;
    }

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: a */
    public final boolean mo313a(View view, AccessibilityEvent accessibilityEvent) {
        C0091b c0091b = (C0091b) this.f718e.get(view);
        return c0091b != null ? c0091b.mo313a(view, accessibilityEvent) : this.f243a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: b */
    public final C0158l mo314b(View view) {
        C0091b c0091b = (C0091b) this.f718e.get(view);
        return c0091b != null ? c0091b.mo314b(view) : super.mo314b(view);
    }

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: c */
    public final void mo315c(View view, AccessibilityEvent accessibilityEvent) {
        C0091b c0091b = (C0091b) this.f718e.get(view);
        if (c0091b != null) {
            c0091b.mo315c(view, accessibilityEvent);
        } else {
            super.mo315c(view, accessibilityEvent);
        }
    }

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: d */
    public final void mo55d(View view, C0156j c0156j) {
        C0357Q c0357q = this.f717d;
        boolean zM1330w = c0357q.f719d.m1330w();
        View.AccessibilityDelegate accessibilityDelegate = this.f243a;
        AccessibilityNodeInfo accessibilityNodeInfo = c0156j.f357a;
        if (!zM1330w) {
            RecyclerView recyclerView = c0357q.f719d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().m783O(view, c0156j);
                C0091b c0091b = (C0091b) this.f718e.get(view);
                if (c0091b != null) {
                    c0091b.mo55d(view, c0156j);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: e */
    public final void mo56e(View view, AccessibilityEvent accessibilityEvent) {
        C0091b c0091b = (C0091b) this.f718e.get(view);
        if (c0091b != null) {
            c0091b.mo56e(view, accessibilityEvent);
        } else {
            super.mo56e(view, accessibilityEvent);
        }
    }

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: f */
    public final boolean mo316f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0091b c0091b = (C0091b) this.f718e.get(viewGroup);
        return c0091b != null ? c0091b.mo316f(viewGroup, view, accessibilityEvent) : this.f243a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: g */
    public final boolean mo317g(View view, int i2, Bundle bundle) {
        C0357Q c0357q = this.f717d;
        if (!c0357q.f719d.m1330w()) {
            RecyclerView recyclerView = c0357q.f719d;
            if (recyclerView.getLayoutManager() != null) {
                C0091b c0091b = (C0091b) this.f718e.get(view);
                if (c0091b != null) {
                    if (c0091b.mo317g(view, i2, bundle)) {
                        return true;
                    }
                } else if (super.mo317g(view, i2, bundle)) {
                    return true;
                }
                C0349I c0349i = recyclerView.getLayoutManager().f668b.f1562a;
                return false;
            }
        }
        return super.mo317g(view, i2, bundle);
    }

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: h */
    public final void mo318h(View view, int i2) {
        C0091b c0091b = (C0091b) this.f718e.get(view);
        if (c0091b != null) {
            c0091b.mo318h(view, i2);
        } else {
            super.mo318h(view, i2);
        }
    }

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: i */
    public final void mo319i(View view, AccessibilityEvent accessibilityEvent) {
        C0091b c0091b = (C0091b) this.f718e.get(view);
        if (c0091b != null) {
            c0091b.mo319i(view, accessibilityEvent);
        } else {
            super.mo319i(view, accessibilityEvent);
        }
    }
}
