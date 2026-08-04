package yyds;

import android.app.Activity;
import android.view.View;
import android.widget.ScrollView;

/* JADX INFO: renamed from: yyds.ᛴᛵᲀᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0866 extends ScrollView {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f3969;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0866(Activity activity, int i) {
        super(activity);
        AbstractC2328.m4341(-910347956028270L);
        this.f3969 = i;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Integer numValueOf = Integer.valueOf(View.MeasureSpec.getSize(i2));
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        int i3 = this.f3969;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(i3, numValueOf != null ? numValueOf.intValue() : i3), Integer.MIN_VALUE));
    }
}
