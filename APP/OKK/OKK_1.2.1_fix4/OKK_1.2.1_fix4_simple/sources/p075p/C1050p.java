package p075p;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: renamed from: p.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1050p extends View {
    public C1050p(Context r1) {
        super(r1);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas r1) {
    }

    @Override // android.view.View
    public final void onMeasure(int r1, int r2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int r2) {
        C1039e r02 = (C1039e) getLayoutParams();
        r02.f3903a = r2;
        setLayoutParams(r02);
    }

    public void setGuidelineEnd(int r2) {
        C1039e r02 = (C1039e) getLayoutParams();
        r02.f3905b = r2;
        setLayoutParams(r02);
    }

    public void setGuidelinePercent(float r2) {
        C1039e r02 = (C1039e) getLayoutParams();
        r02.f3907c = r2;
        setLayoutParams(r02);
    }

    @Override // android.view.View
    public void setVisibility(int r1) {
    }
}
