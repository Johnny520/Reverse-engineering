package p000;

import android.graphics.Canvas;
import android.widget.ImageView;

/* JADX INFO: renamed from: wq */
/* JADX INFO: loaded from: classes.dex */
public final class C2684wq extends ImageView {

    /* JADX INFO: renamed from: a */
    public int f9245a;

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas r3) {
        AbstractC0295Gu.m625r(-494419455244341L);
        super.onDraw(r3);
        r3.drawColor(this.f9245a);
    }

    public final void setMaskColor(int r1) {
        this.f9245a = r1;
        invalidate();
    }
}
