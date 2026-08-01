package p069i;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.p055lu.wxmask272.R;

/* JADX INFO: renamed from: i.E */
/* JADX INFO: loaded from: classes.dex */
public final class C0616E extends RatingBar {

    /* JADX INFO: renamed from: b */
    public final C0612C f2124b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0616E(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        AbstractC0670d1.m1297a(this, getContext());
        C0612C c0612c = new C0612C(this);
        this.f2124b = c0612c;
        c0612c.mo1213b(attributeSet, R.attr.ratingBarStyle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        Bitmap bitmap = (Bitmap) this.f2124b.f2116c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i2, 0), getMeasuredHeight());
        }
    }
}
