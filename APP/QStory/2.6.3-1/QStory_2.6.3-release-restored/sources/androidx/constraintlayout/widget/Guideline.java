package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import p215.C8680;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class Guideline extends View {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f6742;

    public Guideline(Context context) {
        super(context);
        this.f6742 = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.f6742 = z;
    }

    public void setGuidelineBegin(int i) {
        C8680 c8680 = (C8680) getLayoutParams();
        if (this.f6742 && c8680.f21786 == i) {
            return;
        }
        c8680.f21786 = i;
        setLayoutParams(c8680);
    }

    public void setGuidelineEnd(int i) {
        C8680 c8680 = (C8680) getLayoutParams();
        if (this.f6742 && c8680.f21785 == i) {
            return;
        }
        c8680.f21785 = i;
        setLayoutParams(c8680);
    }

    public void setGuidelinePercent(float f) {
        C8680 c8680 = (C8680) getLayoutParams();
        if (this.f6742 && c8680.f21784 == f) {
            return;
        }
        c8680.f21784 = f;
        setLayoutParams(c8680);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6742 = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
