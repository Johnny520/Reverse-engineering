package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import p199.C7851;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class Guideline extends View {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f6397;

    public Guideline(Context context) {
        super(context);
        this.f6397 = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.f6397 = z;
    }

    public void setGuidelineBegin(int i) {
        C7851 c7851 = (C7851) getLayoutParams();
        if (this.f6397 && c7851.f21441 == i) {
            return;
        }
        c7851.f21441 = i;
        setLayoutParams(c7851);
    }

    public void setGuidelineEnd(int i) {
        C7851 c7851 = (C7851) getLayoutParams();
        if (this.f6397 && c7851.f21440 == i) {
            return;
        }
        c7851.f21440 = i;
        setLayoutParams(c7851);
    }

    public void setGuidelinePercent(float f) {
        C7851 c7851 = (C7851) getLayoutParams();
        if (this.f6397 && c7851.f21439 == f) {
            return;
        }
        c7851.f21439 = f;
        setLayoutParams(c7851);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6397 = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
