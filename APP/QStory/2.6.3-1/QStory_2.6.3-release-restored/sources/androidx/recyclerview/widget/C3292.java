package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C3292 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public View f7657;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f7658;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f7659;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public AbstractC3352 f7660;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public RecyclerView f7661;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f7662 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public float f7663;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean f7664;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f7665;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f7666;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f7667;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C3356 f7668;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public PointF f7669;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final DisplayMetrics f7670;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final LinearInterpolator f7671;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final DecelerateInterpolator f7672;

    public C3292(Context context) {
        C3356 c3356 = new C3356();
        c3356.f7948 = -1;
        c3356.f7946 = false;
        c3356.f7952 = 0;
        c3356.f7951 = 0;
        c3356.f7950 = 0;
        c3356.f7949 = Integer.MIN_VALUE;
        c3356.f7947 = null;
        this.f7668 = c3356;
        this.f7671 = new LinearInterpolator();
        this.f7672 = new DecelerateInterpolator();
        this.f7664 = false;
        this.f7665 = 0;
        this.f7666 = 0;
        this.f7670 = context.getResources().getDisplayMetrics();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m5417(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            C6755.m11869("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
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
    public PointF mo5418(int i) {
        Object obj = this.f7660;
        if (obj instanceof InterfaceC3355) {
            return ((InterfaceC3355) obj).mo5230(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + InterfaceC3355.class.getCanonicalName());
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public int mo5384(int i) {
        float fAbs = Math.abs(i);
        if (!this.f7664) {
            this.f7663 = mo5385(this.f7670);
            this.f7664 = true;
        }
        return (int) Math.ceil(fAbs * this.f7663);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public float mo5385(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int mo5419(View view, int i) {
        AbstractC3352 abstractC3352 = this.f7660;
        if (abstractC3352 == null || !abstractC3352.mo5235()) {
            return 0;
        }
        C3351 c3351 = (C3351) view.getLayoutParams();
        return m5417(AbstractC3352.m5541(view) - ((ViewGroup.MarginLayoutParams) c3351).topMargin, AbstractC3352.m5546(view) + ((ViewGroup.MarginLayoutParams) c3351).bottomMargin, abstractC3352.getPaddingTop(), abstractC3352.f7925 - abstractC3352.getPaddingBottom(), i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int mo5420(View view, int i) {
        AbstractC3352 abstractC3352 = this.f7660;
        if (abstractC3352 == null || !abstractC3352.mo5236()) {
            return 0;
        }
        C3351 c3351 = (C3351) view.getLayoutParams();
        return m5417(AbstractC3352.m5548(view) - ((ViewGroup.MarginLayoutParams) c3351).leftMargin, AbstractC3352.m5545(view) + ((ViewGroup.MarginLayoutParams) c3351).rightMargin, abstractC3352.getPaddingLeft(), abstractC3352.f7926 - abstractC3352.getPaddingRight(), i);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo5386(View view, C3356 c3356) {
        int i;
        PointF pointF = this.f7669;
        int i2 = 0;
        if (pointF != null) {
            float f = pointF.x;
            i = f == 0.0f ? 0 : f > 0.0f ? 1 : -1;
        }
        int iMo5420 = mo5420(view, i);
        PointF pointF2 = this.f7669;
        if (pointF2 != null) {
            float f2 = pointF2.y;
            if (f2 != 0.0f) {
                i2 = f2 > 0.0f ? 1 : -1;
            }
        }
        int iMo5419 = mo5419(view, i2);
        int iCeil = (int) Math.ceil(((double) mo5384((int) Math.sqrt((iMo5419 * iMo5419) + (iMo5420 * iMo5420)))) / 0.3356d);
        if (iCeil > 0) {
            c3356.f7951 = -iMo5420;
            c3356.f7950 = -iMo5419;
            c3356.f7949 = iCeil;
            c3356.f7947 = this.f7672;
            c3356.f7946 = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f8  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5421(int i, int i2) {
        PointF pointFMo5418;
        RecyclerView recyclerView = this.f7661;
        if (this.f7662 == -1 || recyclerView == null) {
            m5422();
        }
        if (this.f7659 && this.f7657 == null && this.f7660 != null && (pointFMo5418 = mo5418(this.f7662)) != null) {
            float f = pointFMo5418.x;
            if (f != 0.0f || pointFMo5418.y != 0.0f) {
                recyclerView.m5307(null, (int) Math.signum(f), (int) Math.signum(pointFMo5418.y));
            }
        }
        this.f7659 = false;
        View view = this.f7657;
        C3356 c3356 = this.f7668;
        if (view != null) {
            this.f7661.getClass();
            AbstractC3317 abstractC3317M5249 = RecyclerView.m5249(view);
            if ((abstractC3317M5249 != null ? abstractC3317M5249.getLayoutPosition() : -1) == this.f7662) {
                View view2 = this.f7657;
                C3358 c3358 = recyclerView.f7586;
                mo5386(view2, c3356);
                c3356.m5584(recyclerView);
                m5422();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f7657 = null;
            }
        }
        if (this.f7658) {
            C3358 c33582 = recyclerView.f7586;
            if (this.f7661.f7538.m5557() == 0) {
                m5422();
            } else {
                int i3 = this.f7665;
                int i4 = i3 - i;
                if (i3 * i4 <= 0) {
                    i4 = 0;
                }
                this.f7665 = i4;
                int i5 = this.f7666;
                int i6 = i5 - i2;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.f7666 = i6;
                if (i4 == 0 && i6 == 0) {
                    PointF pointFMo54182 = mo5418(this.f7662);
                    if (pointFMo54182 != null) {
                        if (pointFMo54182.x == 0.0f && pointFMo54182.y == 0.0f) {
                            c3356.f7948 = this.f7662;
                            m5422();
                        } else {
                            float f2 = pointFMo54182.y;
                            float fSqrt = (float) Math.sqrt((f2 * f2) + (r10 * r10));
                            float f3 = pointFMo54182.x / fSqrt;
                            pointFMo54182.x = f3;
                            float f4 = pointFMo54182.y / fSqrt;
                            pointFMo54182.y = f4;
                            this.f7669 = pointFMo54182;
                            this.f7665 = (int) (f3 * 10000.0f);
                            this.f7666 = (int) (f4 * 10000.0f);
                            int iMo5384 = mo5384(10000);
                            c3356.f7951 = (int) (this.f7665 * 1.2f);
                            c3356.f7950 = (int) (this.f7666 * 1.2f);
                            c3356.f7949 = (int) (iMo5384 * 1.2f);
                            c3356.f7947 = this.f7671;
                            c3356.f7946 = true;
                        }
                    }
                }
            }
            boolean z = c3356.f7948 >= 0;
            c3356.m5584(recyclerView);
            if (z && this.f7658) {
                this.f7659 = true;
                recyclerView.f7585.m5456();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m5422() {
        if (this.f7658) {
            this.f7658 = false;
            this.f7666 = 0;
            this.f7665 = 0;
            this.f7669 = null;
            this.f7661.f7586.f7958 = -1;
            this.f7657 = null;
            this.f7662 = -1;
            this.f7659 = false;
            AbstractC3352 abstractC3352 = this.f7660;
            if (abstractC3352.f7931 == this) {
                abstractC3352.f7931 = null;
            }
            this.f7660 = null;
            this.f7661 = null;
        }
    }
}
