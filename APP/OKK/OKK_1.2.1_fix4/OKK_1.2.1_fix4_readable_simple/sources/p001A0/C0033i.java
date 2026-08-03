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

    public C0033i(C0032h r1) {
        super(r1);
        this.f86x = r1;
    }

    @Override // p089x0.C1123g
    /* JADX INFO: renamed from: f */
    public final void mo69f(Canvas r2) {
        if (this.f86x.f84v.isEmpty() == false) goto L5;
        super.mo69f(r2);
        return;
    L5:
        r2.save();
        r2.clipOutRect(this.f86x.f84v);
        super.mo69f(r2);
        r2.restore();
    }

    @Override // p089x0.C1123g, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f86x = new C0032h(this.f86x);
        return this;
    }

    /* JADX INFO: renamed from: o */
    public final void m70o(float r3, float r4, float r5, float r6) {
        RectF r02 = this.f86x.f84v;
        if (r3 == r02.left) goto L5;
    L10:
        r02.set(r3, r4, r5, r6);
        invalidateSelf();
        return;
    L5:
        if (r4 != r02.top) goto L10;
        if (r5 != r02.right) goto L10;
        if (r6 != r02.bottom) goto L10;
    }
}
