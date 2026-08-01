package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class bf extends eu {
    public static final /* synthetic */ int y = 0;
    public af x;

    @Override // defpackage.eu
    public final void e(Canvas r2) {
        if (this.x.q.isEmpty() == false) goto L6;
        super.e(r2);
        return;
    L6:
        r2.save();
        r2.clipOutRect(this.x.q);
        super.e(r2);
        r2.restore();
    }

    @Override // defpackage.eu, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.x = new af(this.x);
        return this;
    }

    public final void n(float r3, float r4, float r5, float r6) {
        RectF r0 = this.x.q;
        if (r3 == r0.left) goto L5;
    L12:
        r0.set(r3, r4, r5, r6);
        invalidateSelf();
        return;
    L5:
        if (r4 != r0.top) goto L12;
        if (r5 != r0.right) goto L12;
        if (r6 != r0.bottom) goto L12;
    }
}
