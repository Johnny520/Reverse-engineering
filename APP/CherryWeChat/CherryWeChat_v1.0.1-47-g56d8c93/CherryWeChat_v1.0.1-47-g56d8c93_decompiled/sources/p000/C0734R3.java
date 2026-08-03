package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: R3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0734R3 extends RatingBar {

    /* JADX INFO: renamed from: a */
    public final C0649P3 f2347a;

    public C0734R3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        AbstractC1042YA.m1987a(getContext(), this);
        C0649P3 c0649p3 = new C0649P3(this);
        this.f2347a = c0649p3;
        c0649p3.mo1279J(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = (Bitmap) this.f2347a.f2090c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
