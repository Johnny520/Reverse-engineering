package p000;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: renamed from: gx */
/* JADX INFO: loaded from: classes.dex */
public final class C0277gx extends C0939yq {

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C0314hx f2169q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0277gx(C0314hx c0314hx, Context context) {
        super(context);
        this.f2169q = c0314hx;
    }

    @Override // p000.C0939yq
    /* JADX INFO: renamed from: d */
    public final float mo1330d(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // p000.C0939yq
    /* JADX INFO: renamed from: e */
    public final int mo1331e(int i) {
        return Math.min(100, super.mo1331e(i));
    }

    @Override // p000.C0939yq
    /* JADX INFO: renamed from: h */
    public final void mo1332h(View view, C0874wz c0874wz) {
        C0314hx c0314hx = this.f2169q;
        int[] iArrM1378a = c0314hx.m1378a(c0314hx.f2316a.getLayoutManager(), view);
        int i = iArrM1378a[0];
        int i2 = iArrM1378a[1];
        int iCeil = (int) Math.ceil(((double) mo1331e(Math.max(Math.abs(i), Math.abs(i2)))) / 0.3356d);
        if (iCeil > 0) {
            c0874wz.f5068a = i;
            c0874wz.f5069b = i2;
            c0874wz.f5070c = iCeil;
            c0874wz.f5072e = this.f5388j;
            c0874wz.f5073f = true;
        }
    }
}
