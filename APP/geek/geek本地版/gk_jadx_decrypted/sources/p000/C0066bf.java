package p000;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: bf */
/* JADX INFO: loaded from: classes.dex */
public final class C0066bf extends C0200eu {

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ int f810y = 0;

    /* JADX INFO: renamed from: x */
    public C0016af f811x;

    @Override // p000.C0200eu
    /* JADX INFO: renamed from: e */
    public final void mo553e(Canvas canvas) {
        if (this.f811x.f137q.isEmpty()) {
            super.mo553e(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.f811x.f137q);
        super.mo553e(canvas);
        canvas.restore();
    }

    @Override // p000.C0200eu, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f811x = new C0016af(this.f811x);
        return this;
    }

    /* JADX INFO: renamed from: n */
    public final void m554n(float f, float f2, float f3, float f4) {
        RectF rectF = this.f811x.f137q;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }
}
