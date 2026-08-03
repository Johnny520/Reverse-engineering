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

    public C0734R3(Context r2, AttributeSet r3) {
        super(r2, r3, R.attr.ratingBarStyle);
        AbstractC1042YA.m1987a(getContext(), this);
        C0649P3 r22 = new C0649P3(this);
        this.f2347a = r22;
        r22.mo1279J(r3, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int r2, int r3) {
        monitor-enter(this);
        super.onMeasure(r2, r3);     // Catch: Throwable -> L7
        Bitmap r32 = (Bitmap) this.f2347a.f2090c;     // Catch: Throwable -> L7
        if (r32 == null) goto L9;
        setMeasuredDimension(View.resolveSizeAndState(r32.getWidth() * getNumStars(), r2, 0), getMeasuredHeight());     // Catch: Throwable -> L7
    L9:
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }
}
