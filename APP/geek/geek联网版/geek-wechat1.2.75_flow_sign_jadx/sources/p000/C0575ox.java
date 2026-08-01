package p000;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: renamed from: ox */
/* JADX INFO: loaded from: classes.dex */
public final class C0575ox extends C0124cr {

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C0612px f3547q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0575ox(C0612px c0612px, Context context) {
        super(context);
        this.f3547q = c0612px;
    }

    @Override // p000.C0124cr
    /* JADX INFO: renamed from: d */
    public final float mo773d(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // p000.C0124cr
    /* JADX INFO: renamed from: e */
    public final int mo774e(int i) {
        return Math.min(100, super.mo774e(i));
    }

    @Override // p000.C0124cr
    /* JADX INFO: renamed from: h */
    public final void mo777h(View view, d00 d00Var) {
        C0612px c0612px = this.f3547q;
        int[] iArrM2099a = c0612px.m2099a(c0612px.f3758a.getLayoutManager(), view);
        int i = iArrM2099a[0];
        int i2 = iArrM2099a[1];
        int iCeil = (int) Math.ceil(((double) mo774e(Math.max(Math.abs(i), Math.abs(i2)))) / 0.3356d);
        if (iCeil > 0) {
            d00Var.f1275a = i;
            d00Var.f1276b = i2;
            d00Var.f1277c = iCeil;
            d00Var.f1279e = this.f1245j;
            d00Var.f1280f = true;
        }
    }
}
