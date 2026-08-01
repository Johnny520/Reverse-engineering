package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.ljx.wechatmod.R;

/* JADX INFO: renamed from: f4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0211f4 extends RatingBar {

    /* JADX INFO: renamed from: a */
    public final C0138d4 f1887a;

    public C0211f4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        r60.m2247a(this, getContext());
        C0138d4 c0138d4 = new C0138d4(this);
        this.f1887a = c0138d4;
        c0138d4.mo904z(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = (Bitmap) this.f1887a.f1364c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
