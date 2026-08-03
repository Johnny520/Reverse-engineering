package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1053g extends View {
    public C1053g(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.C1044a c1044a = (ConstraintLayout.C1044a) getLayoutParams();
        c1044a.f4184a = i;
        setLayoutParams(c1044a);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.C1044a c1044a = (ConstraintLayout.C1044a) getLayoutParams();
        c1044a.f4186b = i;
        setLayoutParams(c1044a);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.C1044a c1044a = (ConstraintLayout.C1044a) getLayoutParams();
        c1044a.f4188c = f;
        setLayoutParams(c1044a);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
