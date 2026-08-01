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

/* JADX INFO: renamed from: yq */
/* JADX INFO: loaded from: classes.dex */
public class C0939yq {

    /* JADX INFO: renamed from: a */
    public int f5379a = -1;

    /* JADX INFO: renamed from: b */
    public RecyclerView f5380b;

    /* JADX INFO: renamed from: c */
    public AbstractC0540nz f5381c;

    /* JADX INFO: renamed from: d */
    public boolean f5382d;

    /* JADX INFO: renamed from: e */
    public boolean f5383e;

    /* JADX INFO: renamed from: f */
    public View f5384f;

    /* JADX INFO: renamed from: g */
    public final C0874wz f5385g;

    /* JADX INFO: renamed from: h */
    public boolean f5386h;

    /* JADX INFO: renamed from: i */
    public final LinearInterpolator f5387i;

    /* JADX INFO: renamed from: j */
    public final DecelerateInterpolator f5388j;

    /* JADX INFO: renamed from: k */
    public PointF f5389k;

    /* JADX INFO: renamed from: l */
    public final DisplayMetrics f5390l;

    /* JADX INFO: renamed from: m */
    public boolean f5391m;

    /* JADX INFO: renamed from: n */
    public float f5392n;

    /* JADX INFO: renamed from: o */
    public int f5393o;

    /* JADX INFO: renamed from: p */
    public int f5394p;

    public C0939yq(Context context) {
        C0874wz c0874wz = new C0874wz();
        c0874wz.f5071d = -1;
        c0874wz.f5073f = false;
        c0874wz.f5074g = 0;
        c0874wz.f5068a = 0;
        c0874wz.f5069b = 0;
        c0874wz.f5070c = Integer.MIN_VALUE;
        c0874wz.f5072e = null;
        this.f5385g = c0874wz;
        this.f5387i = new LinearInterpolator();
        this.f5388j = new DecelerateInterpolator();
        this.f5391m = false;
        this.f5393o = 0;
        this.f5394p = 0;
        this.f5390l = context.getResources().getDisplayMetrics();
    }

    /* JADX INFO: renamed from: a */
    public static int m2735a(int i, int i2, int i3, int i4, int i5) {
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
    public int mo1919b(View view, int i) {
        AbstractC0540nz abstractC0540nz = this.f5381c;
        if (abstractC0540nz == null || !abstractC0540nz.mo355d()) {
            return 0;
        }
        C0577oz c0577oz = (C0577oz) view.getLayoutParams();
        return m2735a((view.getLeft() - ((C0577oz) view.getLayoutParams()).f3622b.left) - ((ViewGroup.MarginLayoutParams) c0577oz).leftMargin, view.getRight() + ((C0577oz) view.getLayoutParams()).f3622b.right + ((ViewGroup.MarginLayoutParams) c0577oz).rightMargin, abstractC0540nz.m1961C(), abstractC0540nz.f3468n - abstractC0540nz.m1962D(), i);
    }

    /* JADX INFO: renamed from: c */
    public int mo1920c(View view, int i) {
        AbstractC0540nz abstractC0540nz = this.f5381c;
        if (abstractC0540nz == null || !abstractC0540nz.mo356e()) {
            return 0;
        }
        C0577oz c0577oz = (C0577oz) view.getLayoutParams();
        return m2735a((view.getTop() - ((C0577oz) view.getLayoutParams()).f3622b.top) - ((ViewGroup.MarginLayoutParams) c0577oz).topMargin, view.getBottom() + ((C0577oz) view.getLayoutParams()).f3622b.bottom + ((ViewGroup.MarginLayoutParams) c0577oz).bottomMargin, abstractC0540nz.m1963E(), abstractC0540nz.f3469o - abstractC0540nz.m1960B(), i);
    }

    /* JADX INFO: renamed from: d */
    public float mo1330d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* JADX INFO: renamed from: e */
    public int mo1331e(int i) {
        float fAbs = Math.abs(i);
        if (!this.f5391m) {
            this.f5392n = mo1330d(this.f5390l);
            this.f5391m = true;
        }
        return (int) Math.ceil(fAbs * this.f5392n);
    }

    /* JADX INFO: renamed from: f */
    public PointF mo1921f(int i) {
        Object obj = this.f5381c;
        if (obj instanceof InterfaceC0911xz) {
            return ((InterfaceC0911xz) obj).mo349a(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + InterfaceC0911xz.class.getCanonicalName());
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f8  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2736g(int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0939yq.m2736g(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo1332h(android.view.View r7, p000.C0874wz r8) {
        /*
            r6 = this;
            android.graphics.PointF r0 = r6.f5389k
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
            int r0 = r6.mo1919b(r7, r0)
            android.graphics.PointF r5 = r6.f5389k
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
            int r7 = r6.mo1920c(r7, r1)
            int r1 = r0 * r0
            int r2 = r7 * r7
            int r2 = r2 + r1
            double r1 = (double) r2
            double r1 = java.lang.Math.sqrt(r1)
            int r1 = (int) r1
            int r1 = r6.mo1331e(r1)
            double r1 = (double) r1
            r4 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r1 = r1 / r4
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            if (r1 <= 0) goto L59
            int r0 = -r0
            int r7 = -r7
            r8.f5068a = r0
            r8.f5069b = r7
            r8.f5070c = r1
            android.view.animation.DecelerateInterpolator r7 = r6.f5388j
            r8.f5072e = r7
            r8.f5073f = r3
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0939yq.mo1332h(android.view.View, wz):void");
    }

    /* JADX INFO: renamed from: i */
    public final void m2737i() {
        if (this.f5383e) {
            this.f5383e = false;
            this.f5394p = 0;
            this.f5393o = 0;
            this.f5389k = null;
            this.f5380b.f588c0.f5415a = -1;
            this.f5384f = null;
            this.f5379a = -1;
            this.f5382d = false;
            AbstractC0540nz abstractC0540nz = this.f5381c;
            if (abstractC0540nz.f3459e == this) {
                abstractC0540nz.f3459e = null;
            }
            this.f5381c = null;
            this.f5380b = null;
        }
    }
}
