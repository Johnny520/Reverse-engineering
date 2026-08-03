package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.o */
/* JADX INFO: loaded from: classes.dex */
public class C1210o extends RecyclerView.AbstractC1185v {

    /* JADX INFO: renamed from: k */
    @SuppressLint({"UnknownNullness"})
    public PointF f5184k;

    /* JADX INFO: renamed from: l */
    public final DisplayMetrics f5185l;

    /* JADX INFO: renamed from: n */
    public float f5187n;

    /* JADX INFO: renamed from: i */
    public final LinearInterpolator f5182i = new LinearInterpolator();

    /* JADX INFO: renamed from: j */
    public final DecelerateInterpolator f5183j = new DecelerateInterpolator();

    /* JADX INFO: renamed from: m */
    public boolean f5186m = false;

    /* JADX INFO: renamed from: o */
    public int f5188o = 0;

    /* JADX INFO: renamed from: p */
    public int f5189p = 0;

    @SuppressLint({"UnknownNullness"})
    public C1210o(Context context) {
        this.f5185l = context.getResources().getDisplayMetrics();
    }

    /* JADX INFO: renamed from: e */
    public static int m2977e(int i, int i2, int i3, int i4, int i5) {
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1185v
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo2883c(View view, RecyclerView.AbstractC1185v.a aVar) {
        int i;
        PointF pointF = this.f5184k;
        int i2 = 0;
        if (pointF != null) {
            float f = pointF.x;
            i = f == 0.0f ? 0 : f > 0.0f ? 1 : -1;
        }
        int iMo635f = mo635f(view, i);
        PointF pointF2 = this.f5184k;
        if (pointF2 != null) {
            float f2 = pointF2.y;
            if (f2 != 0.0f) {
                i2 = f2 > 0.0f ? 1 : -1;
            }
        }
        int iMo636g = mo636g(view, i2);
        int iCeil = (int) Math.ceil(((double) mo2978i((int) Math.sqrt((iMo636g * iMo636g) + (iMo635f * iMo635f)))) / 0.3356d);
        if (iCeil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.f5183j;
            aVar.f4976a = -iMo635f;
            aVar.f4977b = -iMo636g;
            aVar.f4978c = iCeil;
            aVar.f4980e = decelerateInterpolator;
            aVar.f4981f = true;
        }
    }

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: f */
    public int mo635f(View view, int i) {
        RecyclerView.AbstractC1175l abstractC1175l = this.f4970c;
        if (abstractC1175l == null || !abstractC1175l.mo2714d()) {
            return 0;
        }
        RecyclerView.C1176m c1176m = (RecyclerView.C1176m) view.getLayoutParams();
        return m2977e((view.getLeft() - ((RecyclerView.C1176m) view.getLayoutParams()).f4948b.left) - ((ViewGroup.MarginLayoutParams) c1176m).leftMargin, view.getRight() + ((RecyclerView.C1176m) view.getLayoutParams()).f4948b.right + ((ViewGroup.MarginLayoutParams) c1176m).rightMargin, abstractC1175l.m2838E(), abstractC1175l.f4939n - abstractC1175l.m2839F(), i);
    }

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: g */
    public int mo636g(View view, int i) {
        RecyclerView.AbstractC1175l abstractC1175l = this.f4970c;
        if (abstractC1175l == null || !abstractC1175l.mo2716e()) {
            return 0;
        }
        RecyclerView.C1176m c1176m = (RecyclerView.C1176m) view.getLayoutParams();
        return m2977e((view.getTop() - ((RecyclerView.C1176m) view.getLayoutParams()).f4948b.top) - ((ViewGroup.MarginLayoutParams) c1176m).topMargin, view.getBottom() + ((RecyclerView.C1176m) view.getLayoutParams()).f4948b.bottom + ((ViewGroup.MarginLayoutParams) c1176m).bottomMargin, abstractC1175l.m2840G(), abstractC1175l.f4940o - abstractC1175l.m2837D(), i);
    }

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: h */
    public float mo1469h(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* JADX INFO: renamed from: i */
    public int mo2978i(int i) {
        float fAbs = Math.abs(i);
        if (!this.f5186m) {
            this.f5187n = mo1469h(this.f5185l);
            this.f5186m = true;
        }
        return (int) Math.ceil(fAbs * this.f5187n);
    }
}
