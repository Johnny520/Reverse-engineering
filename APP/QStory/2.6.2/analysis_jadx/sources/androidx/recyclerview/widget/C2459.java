package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C2459 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public View f7311;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f7312;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f7313;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public AbstractC2519 f7314;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public RecyclerView f7315;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f7316 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public float f7317;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean f7318;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f7319;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f7320;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f7321;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C2523 f7322;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public PointF f7323;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final DisplayMetrics f7324;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final LinearInterpolator f7325;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final DecelerateInterpolator f7326;

    public C2459(Context context) {
        C2523 c2523 = new C2523();
        c2523.f7602 = -1;
        c2523.f7600 = false;
        c2523.f7606 = 0;
        c2523.f7605 = 0;
        c2523.f7604 = 0;
        c2523.f7603 = Integer.MIN_VALUE;
        c2523.f7601 = null;
        this.f7322 = c2523;
        this.f7325 = new LinearInterpolator();
        this.f7326 = new DecelerateInterpolator();
        this.f7318 = false;
        this.f7319 = 0;
        this.f7320 = 0;
        this.f7324 = context.getResources().getDisplayMetrics();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m4847(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            C5919.m11249("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            return 0;
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

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public PointF mo4848(int i) {
        Object obj = this.f7314;
        if (obj instanceof InterfaceC2522) {
            return ((InterfaceC2522) obj).mo4660(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + InterfaceC2522.class.getCanonicalName());
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public int mo4814(int i) {
        float fAbs = Math.abs(i);
        if (!this.f7318) {
            this.f7317 = mo4815(this.f7324);
            this.f7318 = true;
        }
        return (int) Math.ceil(fAbs * this.f7317);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public float mo4815(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int mo4849(View view, int i) {
        AbstractC2519 abstractC2519 = this.f7314;
        if (abstractC2519 == null || !abstractC2519.mo4665()) {
            return 0;
        }
        C2518 c2518 = (C2518) view.getLayoutParams();
        return m4847(AbstractC2519.m4971(view) - ((ViewGroup.MarginLayoutParams) c2518).topMargin, AbstractC2519.m4976(view) + ((ViewGroup.MarginLayoutParams) c2518).bottomMargin, abstractC2519.getPaddingTop(), abstractC2519.f7579 - abstractC2519.getPaddingBottom(), i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int mo4850(View view, int i) {
        AbstractC2519 abstractC2519 = this.f7314;
        if (abstractC2519 == null || !abstractC2519.mo4666()) {
            return 0;
        }
        C2518 c2518 = (C2518) view.getLayoutParams();
        return m4847(AbstractC2519.m4978(view) - ((ViewGroup.MarginLayoutParams) c2518).leftMargin, AbstractC2519.m4975(view) + ((ViewGroup.MarginLayoutParams) c2518).rightMargin, abstractC2519.getPaddingLeft(), abstractC2519.f7580 - abstractC2519.getPaddingRight(), i);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo4816(android.view.View r7, androidx.recyclerview.widget.C2523 r8) {
        /*
            r6 = this;
            android.graphics.PointF r0 = r6.f7323
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
            int r0 = r6.mo4850(r7, r0)
            android.graphics.PointF r5 = r6.f7323
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
            int r7 = r6.mo4849(r7, r1)
            int r1 = r0 * r0
            int r2 = r7 * r7
            int r2 = r2 + r1
            double r1 = (double) r2
            double r1 = java.lang.Math.sqrt(r1)
            int r1 = (int) r1
            int r1 = r6.mo4814(r1)
            double r1 = (double) r1
            r4 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r1 = r1 / r4
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            if (r1 <= 0) goto L59
            int r0 = -r0
            int r7 = -r7
            r8.f7605 = r0
            r8.f7604 = r7
            r8.f7603 = r1
            android.view.animation.DecelerateInterpolator r6 = r6.f7326
            r8.f7601 = r6
            r8.f7600 = r3
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C2459.mo4816(android.view.View, androidx.recyclerview.widget.飘花落叶言子苏兰世楪哲):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f8  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4851(int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C2459.m4851(int, int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m4852() {
        if (this.f7312) {
            this.f7312 = false;
            this.f7320 = 0;
            this.f7319 = 0;
            this.f7323 = null;
            this.f7315.f7240.f7612 = -1;
            this.f7311 = null;
            this.f7316 = -1;
            this.f7313 = false;
            AbstractC2519 abstractC2519 = this.f7314;
            if (abstractC2519.f7585 == this) {
                abstractC2519.f7585 = null;
            }
            this.f7314 = null;
            this.f7315 = null;
        }
    }
}
