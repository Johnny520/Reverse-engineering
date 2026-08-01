package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.ljx.wechatmod.R;

/* JADX INFO: loaded from: classes.dex */
public final class f4 extends RatingBar {
    public final d4 a;

    public f4(Context r2, AttributeSet r3) {
        super(r2, r3, R.attr.ratingBarStyle);
        r60.a(this, getContext());
        d4 r22 = new d4(this);
        this.a = r22;
        r22.z(r3, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int r2, int r3) {
        monitor-enter(this);
        super.onMeasure(r2, r3);     // Catch: Throwable -> L7
        Bitmap r32 = (Bitmap) this.a.c;     // Catch: Throwable -> L7
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
