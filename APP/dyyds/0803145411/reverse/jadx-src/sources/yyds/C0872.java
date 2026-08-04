package yyds;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: renamed from: yyds.ᛴᛶᛳᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0872 extends View {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public boolean f3990;

    public C0872(Context context) {
        super(context);
        this.f3990 = true;
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
        this.f3990 = z;
    }

    public void setGuidelineBegin(int i) {
        C1357 c1357 = (C1357) getLayoutParams();
        if (this.f3990 && c1357.f6275 == i) {
            return;
        }
        c1357.f6275 = i;
        setLayoutParams(c1357);
    }

    public void setGuidelineEnd(int i) {
        C1357 c1357 = (C1357) getLayoutParams();
        if (this.f3990 && c1357.f6287 == i) {
            return;
        }
        c1357.f6287 = i;
        setLayoutParams(c1357);
    }

    public void setGuidelinePercent(float f) {
        C1357 c1357 = (C1357) getLayoutParams();
        if (this.f3990 && c1357.f6312 == f) {
            return;
        }
        c1357.f6312 = f;
        setLayoutParams(c1357);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
