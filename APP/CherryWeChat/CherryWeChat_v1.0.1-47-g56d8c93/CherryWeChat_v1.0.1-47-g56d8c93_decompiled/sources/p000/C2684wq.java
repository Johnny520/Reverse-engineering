package p000;

import android.graphics.Canvas;
import android.widget.ImageView;

/* JADX INFO: renamed from: wq */
/* JADX INFO: loaded from: classes.dex */
public final class C2684wq extends ImageView {

    /* JADX INFO: renamed from: a */
    public int f9245a;

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        AbstractC0295Gu.m625r(-494419455244341L);
        super.onDraw(canvas);
        canvas.drawColor(this.f9245a);
    }

    public final void setMaskColor(int i) {
        this.f9245a = i;
        invalidate();
    }
}
