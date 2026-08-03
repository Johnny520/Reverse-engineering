package p075p;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: renamed from: p.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1050p extends View {
    public C1050p(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i2) {
        C1039e c1039e = (C1039e) getLayoutParams();
        c1039e.f3903a = i2;
        setLayoutParams(c1039e);
    }

    public void setGuidelineEnd(int i2) {
        C1039e c1039e = (C1039e) getLayoutParams();
        c1039e.f3905b = i2;
        setLayoutParams(c1039e);
    }

    public void setGuidelinePercent(float f2) {
        C1039e c1039e = (C1039e) getLayoutParams();
        c1039e.f3907c = f2;
        setLayoutParams(c1039e);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
    }
}
