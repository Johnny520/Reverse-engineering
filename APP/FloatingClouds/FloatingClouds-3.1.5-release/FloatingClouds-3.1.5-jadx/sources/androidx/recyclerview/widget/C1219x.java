package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import p000a.C0038C;
import p000a.C0146I;
import p000a.C0164J;

/* JADX INFO: renamed from: androidx.recyclerview.widget.x */
/* JADX INFO: loaded from: classes.dex */
public final class C1219x extends C0038C {

    /* JADX INFO: renamed from: d */
    public final RecyclerView f5199d;

    /* JADX INFO: renamed from: e */
    public final a f5200e;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.x$a */
    public static class a extends C0038C {

        /* JADX INFO: renamed from: d */
        public final C1219x f5201d;

        /* JADX INFO: renamed from: e */
        public final WeakHashMap f5202e = new WeakHashMap();

        public a(C1219x c1219x) {
            this.f5201d = c1219x;
        }

        @Override // p000a.C0038C
        /* JADX INFO: renamed from: a */
        public final boolean mo112a(View view, AccessibilityEvent accessibilityEvent) {
            C0038C c0038c = (C0038C) this.f5202e.get(view);
            return c0038c != null ? c0038c.mo112a(view, accessibilityEvent) : this.f137a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // p000a.C0038C
        /* JADX INFO: renamed from: b */
        public final C0164J mo113b(View view) {
            C0038C c0038c = (C0038C) this.f5202e.get(view);
            return c0038c != null ? c0038c.mo113b(view) : super.mo113b(view);
        }

        @Override // p000a.C0038C
        /* JADX INFO: renamed from: c */
        public final void mo114c(View view, AccessibilityEvent accessibilityEvent) {
            C0038C c0038c = (C0038C) this.f5202e.get(view);
            if (c0038c != null) {
                c0038c.mo114c(view, accessibilityEvent);
            } else {
                super.mo114c(view, accessibilityEvent);
            }
        }

        @Override // p000a.C0038C
        /* JADX INFO: renamed from: d */
        public final void mo115d(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) C0146I c0146i) {
            C1219x c1219x = this.f5201d;
            boolean zM2755N = c1219x.f5199d.m2755N();
            View.AccessibilityDelegate accessibilityDelegate = this.f137a;
            AccessibilityNodeInfo accessibilityNodeInfo = c0146i.f505a;
            if (!zM2755N) {
                RecyclerView recyclerView = c1219x.f5199d;
                if (recyclerView.getLayoutManager() != null) {
                    recyclerView.getLayoutManager().m2846W(view, c0146i);
                    C0038C c0038c = (C0038C) this.f5202e.get(view);
                    if (c0038c != null) {
                        c0038c.mo115d(view, c0146i);
                        return;
                    } else {
                        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                        return;
                    }
                }
            }
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }

        @Override // p000a.C0038C
        /* JADX INFO: renamed from: e */
        public final void mo116e(View view, AccessibilityEvent accessibilityEvent) {
            C0038C c0038c = (C0038C) this.f5202e.get(view);
            if (c0038c != null) {
                c0038c.mo116e(view, accessibilityEvent);
            } else {
                super.mo116e(view, accessibilityEvent);
            }
        }

        @Override // p000a.C0038C
        /* JADX INFO: renamed from: f */
        public final boolean mo117f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C0038C c0038c = (C0038C) this.f5202e.get(viewGroup);
            return c0038c != null ? c0038c.mo117f(viewGroup, view, accessibilityEvent) : this.f137a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // p000a.C0038C
        /* JADX INFO: renamed from: g */
        public final boolean mo118g(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
            C1219x c1219x = this.f5201d;
            if (!c1219x.f5199d.m2755N()) {
                RecyclerView recyclerView = c1219x.f5199d;
                if (recyclerView.getLayoutManager() != null) {
                    C0038C c0038c = (C0038C) this.f5202e.get(view);
                    if (c0038c != null) {
                        if (c0038c.mo118g(view, i, bundle)) {
                            return true;
                        }
                    } else if (super.mo118g(view, i, bundle)) {
                        return true;
                    }
                    RecyclerView.C1181r c1181r = recyclerView.getLayoutManager().f4927b.f4844c;
                    return false;
                }
            }
            return super.mo118g(view, i, bundle);
        }

        @Override // p000a.C0038C
        /* JADX INFO: renamed from: h */
        public final void mo119h(View view, int i) {
            C0038C c0038c = (C0038C) this.f5202e.get(view);
            if (c0038c != null) {
                c0038c.mo119h(view, i);
            } else {
                super.mo119h(view, i);
            }
        }

        @Override // p000a.C0038C
        /* JADX INFO: renamed from: i */
        public final void mo120i(View view, AccessibilityEvent accessibilityEvent) {
            C0038C c0038c = (C0038C) this.f5202e.get(view);
            if (c0038c != null) {
                c0038c.mo120i(view, accessibilityEvent);
            } else {
                super.mo120i(view, accessibilityEvent);
            }
        }
    }

    public C1219x(RecyclerView recyclerView) {
        this.f5199d = recyclerView;
        a aVar = this.f5200e;
        if (aVar != null) {
            this.f5200e = aVar;
        } else {
            this.f5200e = new a(this);
        }
    }

    @Override // p000a.C0038C
    /* JADX INFO: renamed from: c */
    public final void mo114c(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) AccessibilityEvent accessibilityEvent) {
        super.mo114c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f5199d.m2755N()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo2705U(accessibilityEvent);
        }
    }

    @Override // p000a.C0038C
    /* JADX INFO: renamed from: d */
    public final void mo115d(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) C0146I c0146i) {
        this.f137a.onInitializeAccessibilityNodeInfo(view, c0146i.f505a);
        RecyclerView recyclerView = this.f5199d;
        if (recyclerView.m2755N() || recyclerView.getLayoutManager() == null) {
            return;
        }
        RecyclerView.AbstractC1175l layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f4927b;
        layoutManager.mo2652V(recyclerView2.f4844c, recyclerView2.f4851f0, c0146i);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0079 A[PHI: r7
  0x0079: PHI (r7v8 int) = (r7v4 int), (r7v13 int) binds: [B:32:0x0096, B:24:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000a.C0038C
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo118g(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
        int iM2840G;
        int iM2838E;
        if (super.mo118g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f5199d;
        if (!recyclerView.m2755N() && recyclerView.getLayoutManager() != null) {
            RecyclerView.AbstractC1175l layoutManager = recyclerView.getLayoutManager();
            RecyclerView.C1181r c1181r = layoutManager.f4927b.f4844c;
            int iHeight = layoutManager.f4940o;
            int iWidth = layoutManager.f4939n;
            Rect rect = new Rect();
            if (layoutManager.f4927b.getMatrix().isIdentity() && layoutManager.f4927b.getGlobalVisibleRect(rect)) {
                iHeight = rect.height();
                iWidth = rect.width();
            }
            if (i == 4096) {
                iM2840G = layoutManager.f4927b.canScrollVertically(1) ? (iHeight - layoutManager.m2840G()) - layoutManager.m2837D() : 0;
                if (layoutManager.f4927b.canScrollHorizontally(1)) {
                    iM2838E = (iWidth - layoutManager.m2838E()) - layoutManager.m2839F();
                }
                if (iM2840G == 0) {
                }
                layoutManager.f4927b.m2774g0(iM2838E, iM2840G, true);
                return true;
            }
            if (i != 8192) {
                iM2840G = 0;
                iM2838E = 0;
            } else {
                iM2840G = layoutManager.f4927b.canScrollVertically(-1) ? -((iHeight - layoutManager.m2840G()) - layoutManager.m2837D()) : 0;
                iM2838E = layoutManager.f4927b.canScrollHorizontally(-1) ? -((iWidth - layoutManager.m2838E()) - layoutManager.m2839F()) : 0;
            }
            if (iM2840G == 0 || iM2838E != 0) {
                layoutManager.f4927b.m2774g0(iM2838E, iM2840G, true);
                return true;
            }
        }
        return false;
    }
}
