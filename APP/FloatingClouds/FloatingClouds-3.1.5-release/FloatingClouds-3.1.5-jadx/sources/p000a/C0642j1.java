package p000a;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import androidx.appcompat.C0983R;

/* JADX INFO: renamed from: a.j1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0642j1 extends RatingBar {

    /* JADX INFO: renamed from: a */
    public final C0604h1 f2360a;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0642j1(Context context, AttributeSet attributeSet) {
        int i = C0983R.attr.ratingBarStyle;
        super(context, attributeSet, i);
        C0542df.m1311a(this, getContext());
        C0604h1 c0604h1 = new C0604h1(this);
        this.f2360a = c0604h1;
        c0604h1.mo1442a(attributeSet, i);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.f2360a.f2235b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
