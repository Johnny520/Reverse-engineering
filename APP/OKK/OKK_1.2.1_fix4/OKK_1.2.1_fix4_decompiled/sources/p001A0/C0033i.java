package p001A0;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import p089x0.C1123g;

/* JADX INFO: renamed from: A0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0033i extends C1123g {

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ int f85y = 0;

    /* JADX INFO: renamed from: x */
    public C0032h f86x;

    public C0033i(C0032h c0032h) {
        super(c0032h);
        this.f86x = c0032h;
    }

    @Override // p089x0.C1123g
    /* JADX INFO: renamed from: f */
    public final void mo69f(Canvas canvas) {
        if (this.f86x.f84v.isEmpty()) {
            super.mo69f(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.f86x.f84v);
        super.mo69f(canvas);
        canvas.restore();
    }

    @Override // p089x0.C1123g, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f86x = new C0032h(this.f86x);
        return this;
    }

    /* JADX INFO: renamed from: o */
    public final void m70o(float f2, float f3, float f4, float f5) {
        RectF rectF = this.f86x.f84v;
        if (f2 == rectF.left && f3 == rectF.top && f4 == rectF.right && f5 == rectF.bottom) {
            return;
        }
        rectF.set(f2, f3, f4, f5);
        invalidateSelf();
    }
}
