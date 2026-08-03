package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: renamed from: jk */
/* JADX INFO: loaded from: classes.dex */
public final class C2106jk extends View {

    /* JADX INFO: renamed from: a */
    public boolean f7405a;

    public C2106jk(Context context) {
        super(context);
        this.f7405a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.f7405a = z;
    }

    public void setGuidelineBegin(int i) {
        C1452gb c1452gb = (C1452gb) getLayoutParams();
        if (this.f7405a && c1452gb.f5106a == i) {
            return;
        }
        c1452gb.f5106a = i;
        setLayoutParams(c1452gb);
    }

    public void setGuidelineEnd(int i) {
        C1452gb c1452gb = (C1452gb) getLayoutParams();
        if (this.f7405a && c1452gb.f5108b == i) {
            return;
        }
        c1452gb.f5108b = i;
        setLayoutParams(c1452gb);
    }

    public void setGuidelinePercent(float f) {
        C1452gb c1452gb = (C1452gb) getLayoutParams();
        if (this.f7405a && c1452gb.f5110c == f) {
            return;
        }
        c1452gb.f5110c = f;
        setLayoutParams(c1452gb);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
