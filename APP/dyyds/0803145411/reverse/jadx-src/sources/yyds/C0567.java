package yyds;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: renamed from: yyds.ᛳᛴᛳᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0567 extends C0053 {

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final /* synthetic */ C0803 f2743;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0567(C0803 c0803, Context context) {
        super(context);
        this.f2743 = c0803;
    }

    @Override // yyds.C0053
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final float mo411(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // yyds.C0053
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final int mo413(int i) {
        return Math.min(100, super.mo413(i));
    }

    @Override // yyds.C0053
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final void mo414(View view, C0626 c0626) {
        C0803 c0803 = this.f2743;
        int[] iArrM1851 = c0803.m1851(c0803.f3683.getLayoutManager(), view);
        int i = iArrM1851[0];
        int i2 = iArrM1851[1];
        int iCeil = (int) Math.ceil(((double) mo413(Math.max(Math.abs(i), Math.abs(i2)))) / 0.3356d);
        if (iCeil > 0) {
            c0626.f3016 = i;
            c0626.f3017 = i2;
            c0626.f3019 = iCeil;
            c0626.f3015 = this.f563;
            c0626.f3020 = true;
        }
    }
}
