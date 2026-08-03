package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import p000a.C0146I;
import p000a.C0181Jg;
import p000a.C0215Le;
import p000a.C0866ug;
import p000a.C0961zg;

/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.AbstractC1059c<V> {

    /* JADX INFO: renamed from: a */
    public C0961zg f5396a;

    /* JADX INFO: renamed from: b */
    public boolean f5397b;

    /* JADX INFO: renamed from: c */
    public boolean f5398c;

    /* JADX INFO: renamed from: d */
    public int f5399d = 2;

    /* JADX INFO: renamed from: e */
    public final float f5400e = 0.5f;

    /* JADX INFO: renamed from: f */
    public float f5401f = 0.0f;

    /* JADX INFO: renamed from: g */
    public float f5402g = 0.5f;

    /* JADX INFO: renamed from: h */
    public final C1255a f5403h = new C1255a();

    /* JADX INFO: renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    public class C1255a extends C0961zg.c {

        /* JADX INFO: renamed from: a */
        public int f5404a;

        /* JADX INFO: renamed from: b */
        public int f5405b = -1;

        public C1255a() {
        }

        @Override // p000a.C0961zg.c
        /* JADX INFO: renamed from: a */
        public final int mo2267a(View view, int i) {
            int width;
            int width2;
            int width3;
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            boolean z = view.getLayoutDirection() == 1;
            int i2 = SwipeDismissBehavior.this.f5399d;
            if (i2 == 0) {
                if (z) {
                    width = this.f5404a - view.getWidth();
                    width2 = this.f5404a;
                } else {
                    width = this.f5404a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i2 != 1) {
                width = this.f5404a - view.getWidth();
                width2 = view.getWidth() + this.f5404a;
            } else if (z) {
                width = this.f5404a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f5404a - view.getWidth();
                width2 = this.f5404a;
            }
            return Math.min(Math.max(width, i), width2);
        }

        @Override // p000a.C0961zg.c
        /* JADX INFO: renamed from: b */
        public final int mo2268b(View view, int i) {
            return view.getTop();
        }

        @Override // p000a.C0961zg.c
        /* JADX INFO: renamed from: c */
        public final int mo2269c(View view) {
            return view.getWidth();
        }

        @Override // p000a.C0961zg.c
        /* JADX INFO: renamed from: e */
        public final void mo2271e(View view, int i) {
            this.f5405b = i;
            this.f5404a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
                swipeDismissBehavior.f5398c = true;
                parent.requestDisallowInterceptTouchEvent(true);
                swipeDismissBehavior.f5398c = false;
            }
        }

        @Override // p000a.C0961zg.c
        /* JADX INFO: renamed from: f */
        public final void mo2272f(int i) {
        }

        @Override // p000a.C0961zg.c
        /* JADX INFO: renamed from: g */
        public final void mo2273g(View view, int i, int i2) {
            float width = view.getWidth();
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            float f = width * swipeDismissBehavior.f5401f;
            float width2 = view.getWidth() * swipeDismissBehavior.f5402g;
            float fAbs = Math.abs(i - this.f5404a);
            if (fAbs <= f) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f) / (width2 - f))), 1.0f));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
        @Override // p000a.C0961zg.c
        /* JADX INFO: renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void mo2274h(View view, float f, float f2) {
            int i;
            this.f5405b = -1;
            int width = view.getWidth();
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            boolean z = true;
            if (f != 0.0f) {
                WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                boolean z2 = view.getLayoutDirection() == 1;
                int i2 = swipeDismissBehavior.f5399d;
                if (i2 != 2 && (i2 != 0 ? i2 != 1 || (!z2 ? f < 0.0f : f > 0.0f) : !z2 ? f > 0.0f : f < 0.0f)) {
                    i = this.f5404a;
                    z = false;
                } else if (f >= 0.0f) {
                    int left = view.getLeft();
                    int i3 = this.f5404a;
                    i = left < i3 ? this.f5404a - width : i3 + width;
                }
            } else {
                if (Math.abs(view.getLeft() - this.f5404a) >= Math.round(view.getWidth() * swipeDismissBehavior.f5400e)) {
                }
            }
            if (swipeDismissBehavior.f5396a.m2264o(i, view.getTop())) {
                RunnableC1256b runnableC1256b = new RunnableC1256b(view, z);
                WeakHashMap<View, C0181Jg> weakHashMap2 = C0866ug.f3395a;
                view.postOnAnimation(runnableC1256b);
            }
        }

        @Override // p000a.C0961zg.c
        /* JADX INFO: renamed from: i */
        public final boolean mo2275i(View view, int i) {
            int i2 = this.f5405b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.mo3085s(view);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    public class RunnableC1256b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final View f5407a;

        /* JADX INFO: renamed from: b */
        public final boolean f5408b;

        public RunnableC1256b(View view, boolean z) {
            this.f5407a = view;
            this.f5408b = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C0961zg c0961zg = SwipeDismissBehavior.this.f5396a;
            View view = this.f5407a;
            if (c0961zg == null || !c0961zg.m2255f()) {
                return;
            }
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            view.postOnAnimation(this);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
    /* JADX INFO: renamed from: g */
    public boolean mo1271g(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean zM2446l = this.f5397b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zM2446l = coordinatorLayout.m2446l(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f5397b = zM2446l;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f5397b = false;
        }
        if (zM2446l) {
            if (this.f5396a == null) {
                this.f5396a = new C0961zg(coordinatorLayout.getContext(), coordinatorLayout, this.f5403h);
            }
            if (!this.f5398c && this.f5396a.m2265p(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
    /* JADX INFO: renamed from: h */
    public final boolean mo371h(CoordinatorLayout coordinatorLayout, V v, int i) {
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        if (v.getImportantForAccessibility() == 0) {
            v.setImportantForAccessibility(1);
            C0866ug.m2000g(v, 1048576);
            C0866ug.m1998e(v, 0);
            if (mo3085s(v)) {
                C0866ug.m2001h(v, C0146I.a.f512j, new C0215Le(this));
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
    /* JADX INFO: renamed from: r */
    public final boolean mo1272r(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.f5396a == null) {
            return false;
        }
        if (this.f5398c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f5396a.m2259j(motionEvent);
        return true;
    }

    /* JADX INFO: renamed from: s */
    public boolean mo3085s(View view) {
        return true;
    }
}
