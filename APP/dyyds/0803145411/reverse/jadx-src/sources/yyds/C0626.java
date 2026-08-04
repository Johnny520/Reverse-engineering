package yyds;

import android.util.Log;
import android.view.animation.BaseInterpolator;

/* JADX INFO: renamed from: yyds.ᛳᛶᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0626 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public BaseInterpolator f3015;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public int f3016;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public int f3017;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f3018;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f3019;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public boolean f3020;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f3021;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m1525(C1213 c1213) {
        int i = this.f3021;
        if (i >= 0) {
            this.f3021 = -1;
            c1213.m2428(i);
            this.f3020 = false;
            return;
        }
        if (!this.f3020) {
            this.f3018 = 0;
            return;
        }
        BaseInterpolator baseInterpolator = this.f3015;
        if (baseInterpolator != null && this.f3019 < 1) {
            C0188.m800("If you provide an interpolator, you must set a positive duration");
            return;
        }
        int i2 = this.f3019;
        if (i2 < 1) {
            C0188.m800("Scroll duration must be a positive number");
            return;
        }
        c1213.f5540.m2373(this.f3016, this.f3017, i2, baseInterpolator);
        int i3 = this.f3018 + 1;
        this.f3018 = i3;
        if (i3 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f3020 = false;
    }
}
