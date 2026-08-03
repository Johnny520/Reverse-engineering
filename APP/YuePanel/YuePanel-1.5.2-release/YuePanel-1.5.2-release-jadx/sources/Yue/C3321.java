package Yue;

import Yue.C6898;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3321 extends RatingBar {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final C3318 f5221;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3321(@InterfaceC6391 Context context) {
        this(context, null);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmapM388 = this.f5221.m388();
        if (bitmapM388 != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapM388.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C3321(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, C6898.C1110.f18540);
    }

    public C3321(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C7772.m3866(this, getContext());
        C3318 c3318 = new C3318(this);
        this.f5221 = c3318;
        c3318.mo6781(attributeSet, i);
    }
}
