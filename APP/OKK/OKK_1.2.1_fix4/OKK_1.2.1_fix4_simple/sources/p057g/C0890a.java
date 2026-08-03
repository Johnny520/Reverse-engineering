package p057g;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* JADX INFO: renamed from: g.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0890a extends Drawable {

    /* JADX INFO: renamed from: a */
    public final ActionBarContainer f3163a;

    public C0890a(ActionBarContainer r1) {
        this.f3163a = r1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas r3) {
        ActionBarContainer r02 = this.f3163a;
        if (r02.f1098g == false) goto L7;
        Drawable r03 = r02.f1097f;
        if (r03 == null) goto L16;
        r03.draw(r3);
        return;
    L16:
        return;
    L7:
        Drawable r1 = r02.f1095d;
        if (r1 == null) goto L10;
        r1.draw(r3);
    L10:
        Drawable r12 = r02.f1096e;
        if (r12 != null) goto L13;
        return;
    L13:
        if (r02.f1099h == false) goto L19;
        r12.draw(r3);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline r3) {
        ActionBarContainer r02 = this.f3163a;
        if (r02.f1098g == true) goto L5;
        Drawable r03 = r02.f1095d;
        if (r03 == null) goto L13;
        r03.getOutline(r3);
        return;
    L13:
        return;
    L5:
        if (r02.f1097f == null) goto L11;
        r02.f1095d.getOutline(r3);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r1) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter r1) {
    }
}
