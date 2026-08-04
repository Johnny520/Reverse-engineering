package yyds;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: yyds.ᛱᛱᛴᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C0053 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public float f552;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public boolean f553;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public boolean f554;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final LinearInterpolator f555;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public boolean f556;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public int f557 = -1;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public int f558;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public C1213 f559;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final C0626 f560;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public PointF f561;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final DisplayMetrics f562;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final DecelerateInterpolator f563;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public AbstractC2551 f564;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public int f565;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public View f566;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public boolean f567;

    public C0053(Context context) {
        C0626 c0626 = new C0626();
        c0626.f3021 = -1;
        c0626.f3020 = false;
        c0626.f3018 = 0;
        c0626.f3016 = 0;
        c0626.f3017 = 0;
        c0626.f3019 = Integer.MIN_VALUE;
        c0626.f3015 = null;
        this.f560 = c0626;
        this.f555 = new LinearInterpolator();
        this.f563 = new DecelerateInterpolator();
        this.f554 = false;
        this.f558 = 0;
        this.f565 = 0;
        this.f562 = context.getResources().getDisplayMetrics();
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static int m409(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            C0188.m798("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
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

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f8  */
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m410(int i, int i2) {
        PointF pointFM415;
        C1213 c1213 = this.f559;
        if (this.f557 == -1 || c1213 == null) {
            m412();
        }
        if (this.f567 && this.f566 == null && this.f564 != null && (pointFM415 = m415(this.f557)) != null) {
            float f = pointFM415.x;
            if (f != 0.0f || pointFM415.y != 0.0f) {
                c1213.m2459((int) Math.signum(f), (int) Math.signum(pointFM415.y), null);
            }
        }
        this.f567 = false;
        View view = this.f566;
        C0626 c0626 = this.f560;
        if (view != null) {
            this.f559.getClass();
            AbstractC0185 abstractC0185M2412 = C1213.m2412(view);
            if ((abstractC0185M2412 != null ? abstractC0185M2412.m787() : -1) == this.f557) {
                View view2 = this.f566;
                C2637 c2637 = c1213.f5568;
                mo414(view2, c0626);
                c0626.m1525(c1213);
                m412();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f566 = null;
            }
        }
        if (this.f556) {
            C2637 c26372 = c1213.f5568;
            if (this.f559.f5583.m4613() == 0) {
                m412();
            } else {
                int i3 = this.f558;
                int i4 = i3 - i;
                if (i3 * i4 <= 0) {
                    i4 = 0;
                }
                this.f558 = i4;
                int i5 = this.f565;
                int i6 = i5 - i2;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.f565 = i6;
                if (i4 == 0 && i6 == 0) {
                    PointF pointFM4152 = m415(this.f557);
                    if (pointFM4152 != null) {
                        if (pointFM4152.x == 0.0f && pointFM4152.y == 0.0f) {
                            c0626.f3021 = this.f557;
                            m412();
                        } else {
                            float f2 = pointFM4152.y;
                            float fSqrt = (float) Math.sqrt((f2 * f2) + (r10 * r10));
                            float f3 = pointFM4152.x / fSqrt;
                            pointFM4152.x = f3;
                            float f4 = pointFM4152.y / fSqrt;
                            pointFM4152.y = f4;
                            this.f561 = pointFM4152;
                            this.f558 = (int) (f3 * 10000.0f);
                            this.f565 = (int) (f4 * 10000.0f);
                            int iMo413 = mo413(10000);
                            c0626.f3016 = (int) (this.f558 * 1.2f);
                            c0626.f3017 = (int) (this.f565 * 1.2f);
                            c0626.f3019 = (int) (iMo413 * 1.2f);
                            c0626.f3015 = this.f555;
                            c0626.f3020 = true;
                        }
                    }
                }
            }
            boolean z = c0626.f3021 >= 0;
            c0626.m1525(c1213);
            if (z && this.f556) {
                this.f567 = true;
                c1213.f5540.m2372();
            }
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public float mo411(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final void m412() {
        if (this.f556) {
            this.f556 = false;
            this.f565 = 0;
            this.f558 = 0;
            this.f561 = null;
            this.f559.f5568.f12975 = -1;
            this.f566 = null;
            this.f557 = -1;
            this.f567 = false;
            AbstractC2551 abstractC2551 = this.f564;
            if (abstractC2551.f12597 == this) {
                abstractC2551.f12597 = null;
            }
            this.f564 = null;
            this.f559 = null;
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int mo413(int i) {
        float fAbs = Math.abs(i);
        if (!this.f554) {
            this.f552 = mo411(this.f562);
            this.f554 = true;
        }
        return (int) Math.ceil(fAbs * this.f552);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo414(View view, C0626 c0626) {
        int i;
        int iM409;
        PointF pointF = this.f561;
        int i2 = -1;
        int iM4092 = 0;
        if (pointF != null) {
            float f = pointF.x;
            i = f == 0.0f ? 0 : f > 0.0f ? 1 : -1;
        }
        AbstractC2551 abstractC2551 = this.f564;
        if (abstractC2551 == null || !abstractC2551.mo206()) {
            iM409 = 0;
        } else {
            C2526 c2526 = (C2526) view.getLayoutParams();
            iM409 = m409(AbstractC2551.m4598(view) - ((ViewGroup.MarginLayoutParams) c2526).leftMargin, AbstractC2551.m4602(view) + ((ViewGroup.MarginLayoutParams) c2526).rightMargin, abstractC2551.m4621(), abstractC2551.f12593 - abstractC2551.m4615(), i);
        }
        PointF pointF2 = this.f561;
        if (pointF2 != null) {
            float f2 = pointF2.y;
            if (f2 == 0.0f) {
                i2 = 0;
            } else if (f2 > 0.0f) {
                i2 = 1;
            }
        }
        AbstractC2551 abstractC25512 = this.f564;
        if (abstractC25512 != null && abstractC25512.mo174()) {
            C2526 c25262 = (C2526) view.getLayoutParams();
            iM4092 = m409(AbstractC2551.m4594(view) - ((ViewGroup.MarginLayoutParams) c25262).topMargin, AbstractC2551.m4604(view) + ((ViewGroup.MarginLayoutParams) c25262).bottomMargin, abstractC25512.m4616(), abstractC25512.f12599 - abstractC25512.m4620(), i2);
        }
        int iCeil = (int) Math.ceil(((double) mo413((int) Math.sqrt((iM4092 * iM4092) + (iM409 * iM409)))) / 0.3356d);
        if (iCeil > 0) {
            c0626.f3016 = -iM409;
            c0626.f3017 = -iM4092;
            c0626.f3019 = iCeil;
            c0626.f3015 = this.f563;
            c0626.f3020 = true;
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final PointF m415(int i) {
        Object obj = this.f564;
        if (obj instanceof InterfaceC1180) {
            return ((InterfaceC1180) obj).mo176(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + InterfaceC1180.class.getCanonicalName());
        return null;
    }
}
