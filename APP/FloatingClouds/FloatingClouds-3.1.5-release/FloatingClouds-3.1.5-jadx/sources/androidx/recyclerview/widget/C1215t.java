package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.t */
/* JADX INFO: loaded from: classes.dex */
public final class C1215t extends C1210o {

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C1216u f5194q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1215t(C1216u c1216u, Context context) {
        super(context);
        this.f5194q = c1216u;
    }

    @Override // androidx.recyclerview.widget.C1210o, androidx.recyclerview.widget.RecyclerView.AbstractC1185v
    /* JADX INFO: renamed from: c */
    public final void mo2883c(View view, RecyclerView.AbstractC1185v.a aVar) {
        C1216u c1216u = this.f5194q;
        int[] iArrMo2632a = c1216u.mo2632a(c1216u.f4740a.getLayoutManager(), view);
        int i = iArrMo2632a[0];
        int i2 = iArrMo2632a[1];
        int iCeil = (int) Math.ceil(((double) mo2978i(Math.max(Math.abs(i), Math.abs(i2)))) / 0.3356d);
        if (iCeil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.f5183j;
            aVar.f4976a = i;
            aVar.f4977b = i2;
            aVar.f4978c = iCeil;
            aVar.f4980e = decelerateInterpolator;
            aVar.f4981f = true;
        }
    }

    @Override // androidx.recyclerview.widget.C1210o
    /* JADX INFO: renamed from: h */
    public final float mo1469h(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.C1210o
    /* JADX INFO: renamed from: i */
    public final int mo2978i(int i) {
        return Math.min(100, super.mo2978i(i));
    }
}
