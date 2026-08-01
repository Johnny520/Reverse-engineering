package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: renamed from: fo */
/* JADX INFO: loaded from: classes.dex */
public final class C0231fo extends View {
    public C0231fo(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        C0256gc c0256gc = (C0256gc) getLayoutParams();
        c0256gc.f2086a = i;
        setLayoutParams(c0256gc);
    }

    public void setGuidelineEnd(int i) {
        C0256gc c0256gc = (C0256gc) getLayoutParams();
        c0256gc.f2088b = i;
        setLayoutParams(c0256gc);
    }

    public void setGuidelinePercent(float f) {
        C0256gc c0256gc = (C0256gc) getLayoutParams();
        c0256gc.f2090c = f;
        setLayoutParams(c0256gc);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
