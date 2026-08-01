package p000;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: cr */
/* JADX INFO: loaded from: classes.dex */
public class C0124cr {

    /* JADX INFO: renamed from: a */
    public int f1236a = -1;

    /* JADX INFO: renamed from: b */
    public RecyclerView f1237b;

    /* JADX INFO: renamed from: c */
    public AbstractC0799uz f1238c;

    /* JADX INFO: renamed from: d */
    public boolean f1239d;

    /* JADX INFO: renamed from: e */
    public boolean f1240e;

    /* JADX INFO: renamed from: f */
    public View f1241f;

    /* JADX INFO: renamed from: g */
    public final d00 f1242g;

    /* JADX INFO: renamed from: h */
    public boolean f1243h;

    /* JADX INFO: renamed from: i */
    public final LinearInterpolator f1244i;

    /* JADX INFO: renamed from: j */
    public final DecelerateInterpolator f1245j;

    /* JADX INFO: renamed from: k */
    public PointF f1246k;

    /* JADX INFO: renamed from: l */
    public final DisplayMetrics f1247l;

    /* JADX INFO: renamed from: m */
    public boolean f1248m;

    /* JADX INFO: renamed from: n */
    public float f1249n;

    /* JADX INFO: renamed from: o */
    public int f1250o;

    /* JADX INFO: renamed from: p */
    public int f1251p;

    public C0124cr(Context context) {
        d00 d00Var = new d00();
        d00Var.f1278d = -1;
        d00Var.f1280f = false;
        d00Var.f1281g = 0;
        d00Var.f1275a = 0;
        d00Var.f1276b = 0;
        d00Var.f1277c = Integer.MIN_VALUE;
        d00Var.f1279e = null;
        this.f1242g = d00Var;
        this.f1244i = new LinearInterpolator();
        this.f1245j = new DecelerateInterpolator();
        this.f1248m = false;
        this.f1250o = 0;
        this.f1251p = 0;
        this.f1247l = context.getResources().getDisplayMetrics();
    }

    /* JADX INFO: renamed from: a */
    public static int m770a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public int mo771b(View view, int i) {
        AbstractC0799uz abstractC0799uz = this.f1238c;
        if (abstractC0799uz == null || !abstractC0799uz.mo340d()) {
            return 0;
        }
        C0836vz c0836vz = (C0836vz) view.getLayoutParams();
        return m770a((view.getLeft() - ((C0836vz) view.getLayoutParams()).f5018b.left) - ((ViewGroup.MarginLayoutParams) c0836vz).leftMargin, view.getRight() + ((C0836vz) view.getLayoutParams()).f5018b.right + ((ViewGroup.MarginLayoutParams) c0836vz).rightMargin, abstractC0799uz.m2509C(), abstractC0799uz.f4868n - abstractC0799uz.m2510D(), i);
    }

    /* JADX INFO: renamed from: c */
    public int mo772c(View view, int i) {
        AbstractC0799uz abstractC0799uz = this.f1238c;
        if (abstractC0799uz == null || !abstractC0799uz.mo341e()) {
            return 0;
        }
        C0836vz c0836vz = (C0836vz) view.getLayoutParams();
        return m770a((view.getTop() - ((C0836vz) view.getLayoutParams()).f5018b.top) - ((ViewGroup.MarginLayoutParams) c0836vz).topMargin, view.getBottom() + ((C0836vz) view.getLayoutParams()).f5018b.bottom + ((ViewGroup.MarginLayoutParams) c0836vz).bottomMargin, abstractC0799uz.m2511E(), abstractC0799uz.f4869o - abstractC0799uz.m2508B(), i);
    }

    /* JADX INFO: renamed from: d */
    public float mo773d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* JADX INFO: renamed from: e */
    public int mo774e(int i) {
        float fAbs = Math.abs(i);
        if (!this.f1248m) {
            this.f1249n = mo773d(this.f1247l);
            this.f1248m = true;
        }
        return (int) Math.ceil(fAbs * this.f1249n);
    }

    /* JADX INFO: renamed from: f */
    public PointF mo775f(int i) {
        Object obj = this.f1238c;
        if (obj instanceof e00) {
            return ((e00) obj).mo334a(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + e00.class.getCanonicalName());
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f8  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m776g(int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0124cr.m776g(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo777h(android.view.View r7, p000.d00 r8) {
        /*
            r6 = this;
            android.graphics.PointF r0 = r6.f1246k
            r1 = 0
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L15
            float r0 = r0.x
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto Lf
            goto L15
        Lf:
            if (r0 <= 0) goto L13
            r0 = r3
            goto L16
        L13:
            r0 = r2
            goto L16
        L15:
            r0 = r1
        L16:
            int r0 = r6.mo771b(r7, r0)
            android.graphics.PointF r5 = r6.f1246k
            if (r5 == 0) goto L2a
            float r5 = r5.y
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 != 0) goto L25
            goto L2a
        L25:
            if (r4 <= 0) goto L29
            r1 = r3
            goto L2a
        L29:
            r1 = r2
        L2a:
            int r7 = r6.mo772c(r7, r1)
            int r1 = r0 * r0
            int r2 = r7 * r7
            int r2 = r2 + r1
            double r1 = (double) r2
            double r1 = java.lang.Math.sqrt(r1)
            int r1 = (int) r1
            int r1 = r6.mo774e(r1)
            double r1 = (double) r1
            r4 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r1 = r1 / r4
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            if (r1 <= 0) goto L59
            int r0 = -r0
            int r7 = -r7
            r8.f1275a = r0
            r8.f1276b = r7
            r8.f1277c = r1
            android.view.animation.DecelerateInterpolator r7 = r6.f1245j
            r8.f1279e = r7
            r8.f1280f = r3
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0124cr.mo777h(android.view.View, d00):void");
    }

    /* JADX INFO: renamed from: i */
    public final void m778i() {
        if (this.f1240e) {
            this.f1240e = false;
            this.f1251p = 0;
            this.f1250o = 0;
            this.f1246k = null;
            this.f1237b.f551c0.f1705a = -1;
            this.f1241f = null;
            this.f1236a = -1;
            this.f1239d = false;
            AbstractC0799uz abstractC0799uz = this.f1238c;
            if (abstractC0799uz.f4859e == this) {
                abstractC0799uz.f4859e = null;
            }
            this.f1238c = null;
            this.f1237b = null;
        }
    }
}
