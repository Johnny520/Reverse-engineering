package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: renamed from: jk */
/* JADX INFO: loaded from: classes.dex */
public final class C2106jk extends View {

    /* JADX INFO: renamed from: a */
    public boolean f7405a;

    public C2106jk(Context r1) {
        super(r1);
        this.f7405a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas r1) {
    }

    @Override // android.view.View
    public final void onMeasure(int r1, int r2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean r1) {
        this.f7405a = r1;
    }

    public void setGuidelineBegin(int r3) {
        C1452gb r0 = (C1452gb) getLayoutParams();
        if (this.f7405a == true) goto L5;
    L7:
        r0.f5106a = r3;
        setLayoutParams(r0);
        return;
    L5:
        if (r0.f5106a != r3) goto L7;
    }

    public void setGuidelineEnd(int r3) {
        C1452gb r0 = (C1452gb) getLayoutParams();
        if (this.f7405a == true) goto L5;
    L7:
        r0.f5108b = r3;
        setLayoutParams(r0);
        return;
    L5:
        if (r0.f5108b != r3) goto L7;
    }

    public void setGuidelinePercent(float r3) {
        C1452gb r0 = (C1452gb) getLayoutParams();
        if (this.f7405a == true) goto L5;
    L7:
        r0.f5110c = r3;
        setLayoutParams(r0);
        return;
    L5:
        if (r0.f5110c != r3) goto L7;
    }

    @Override // android.view.View
    public void setVisibility(int r1) {
    }
}
