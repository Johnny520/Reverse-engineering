package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.ۥۣ۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8776 extends View {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8776(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.C1641 c1641 = (ConstraintLayout.C1641) getLayoutParams();
        c1641.f3685 = i;
        setLayoutParams(c1641);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.C1641 c1641 = (ConstraintLayout.C1641) getLayoutParams();
        c1641.f3686 = i;
        setLayoutParams(c1641);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.C1641 c1641 = (ConstraintLayout.C1641) getLayoutParams();
        c1641.f26477 = f;
        setLayoutParams(c1641);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public C8776(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public C8776(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    public C8776(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}
