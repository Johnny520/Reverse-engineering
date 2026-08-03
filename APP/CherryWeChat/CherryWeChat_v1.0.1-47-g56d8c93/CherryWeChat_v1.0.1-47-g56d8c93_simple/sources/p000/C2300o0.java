package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* JADX INFO: renamed from: o0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2300o0 extends Drawable {

    /* JADX INFO: renamed from: a */
    public final ActionBarContainer f8060a;

    public C2300o0(ActionBarContainer r1) {
        this.f8060a = r1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas r3) {
        ActionBarContainer r0 = this.f8060a;
        if (r0.f3722g == false) goto L8;
        Drawable r02 = r0.f3721f;
        if (r02 == null) goto L17;
        r02.draw(r3);
        return;
    L17:
        return;
    L8:
        Drawable r1 = r0.f3719d;
        if (r1 == null) goto L11;
        r1.draw(r3);
    L11:
        Drawable r12 = r0.f3720e;
        if (r12 != null) goto L14;
        return;
    L14:
        if (r0.f3723h == false) goto L19;
        r12.draw(r3);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline r3) {
        ActionBarContainer r0 = this.f8060a;
        if (r0.f3722g == true) goto L5;
        Drawable r02 = r0.f3719d;
        if (r02 == null) goto L13;
        r02.getOutline(r3);
        return;
    L13:
        return;
    L5:
        if (r0.f3721f == null) goto L12;
        r0.f3719d.getOutline(r3);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r1) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter r1) {
    }
}
