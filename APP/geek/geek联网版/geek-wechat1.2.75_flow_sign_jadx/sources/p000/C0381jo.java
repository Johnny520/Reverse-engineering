package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: renamed from: jo */
/* JADX INFO: loaded from: classes.dex */
public final class C0381jo extends View {
    public C0381jo(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        C0591pc c0591pc = (C0591pc) getLayoutParams();
        c0591pc.f3668a = i;
        setLayoutParams(c0591pc);
    }

    public void setGuidelineEnd(int i) {
        C0591pc c0591pc = (C0591pc) getLayoutParams();
        c0591pc.f3670b = i;
        setLayoutParams(c0591pc);
    }

    public void setGuidelinePercent(float f) {
        C0591pc c0591pc = (C0591pc) getLayoutParams();
        c0591pc.f3672c = f;
        setLayoutParams(c0591pc);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
