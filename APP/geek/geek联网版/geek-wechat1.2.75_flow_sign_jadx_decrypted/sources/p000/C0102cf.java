package p000;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: cf */
/* JADX INFO: loaded from: classes.dex */
public final class C0102cf extends C0350iu {

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ int f892y = 0;

    /* JADX INFO: renamed from: x */
    public C0066bf f893x;

    @Override // p000.C0350iu
    /* JADX INFO: renamed from: e */
    public final void mo632e(Canvas canvas) {
        if (this.f893x.f726q.isEmpty()) {
            super.mo632e(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.f893x.f726q);
        super.mo632e(canvas);
        canvas.restore();
    }

    @Override // p000.C0350iu, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f893x = new C0066bf(this.f893x);
        return this;
    }

    /* JADX INFO: renamed from: n */
    public final void m633n(float f, float f2, float f3, float f4) {
        RectF rectF = this.f893x.f726q;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }
}
