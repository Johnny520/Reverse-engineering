package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import p199.C7850;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class Guideline extends View {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f6396;

    public Guideline(Context context) {
        super(context);
        this.f6396 = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.f6396 = z;
    }

    public void setGuidelineBegin(int i) {
        C7850 c7850 = (C7850) getLayoutParams();
        if (this.f6396 && c7850.f21444 == i) {
            return;
        }
        c7850.f21444 = i;
        setLayoutParams(c7850);
    }

    public void setGuidelineEnd(int i) {
        C7850 c7850 = (C7850) getLayoutParams();
        if (this.f6396 && c7850.f21443 == i) {
            return;
        }
        c7850.f21443 = i;
        setLayoutParams(c7850);
    }

    public void setGuidelinePercent(float f) {
        C7850 c7850 = (C7850) getLayoutParams();
        if (this.f6396 && c7850.f21442 == f) {
            return;
        }
        c7850.f21442 = f;
        setLayoutParams(c7850);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6396 = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
