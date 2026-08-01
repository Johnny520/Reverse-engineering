package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class fo extends View {
    public fo(Context r1) {
        super(r1);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int r1, int r2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int r2) {
        gc r0 = (gc) getLayoutParams();
        r0.a = r2;
        setLayoutParams(r0);
    }

    public void setGuidelineEnd(int r2) {
        gc r0 = (gc) getLayoutParams();
        r0.b = r2;
        setLayoutParams(r0);
    }

    public void setGuidelinePercent(float r2) {
        gc r0 = (gc) getLayoutParams();
        r0.c = r2;
        setLayoutParams(r0);
    }

    @Override // android.view.View
    public final void draw(Canvas r1) {
    }

    @Override // android.view.View
    public void setVisibility(int r1) {
    }
}
