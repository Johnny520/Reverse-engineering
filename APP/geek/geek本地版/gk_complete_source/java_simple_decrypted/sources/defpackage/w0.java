package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* JADX INFO: loaded from: classes.dex */
public final class w0 extends Drawable {
    public final /* synthetic */ int a;
    public final Object b;

    public w0(ActionBarContainer r2) {
        this.a = 0;
        this.b = r2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas r13) {
        switch(this.a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ip.o("canvas", r13);
        float r0 = getBounds().width();
        float r1 = getBounds().height();
        float r6 = r0 * 0.44f;
        float r7 = r1 * 0.68f;
        Paint r8 = (Paint) this.b;
        r13.drawLine(r0 * 0.28f, r1 * 0.52f, r6, r7, r8);
        r13.drawLine(r6, r7, r0 * 0.75f, r1 * 0.35f, r8);
        return;
    L6:
        ActionBarContainer r132 = (ActionBarContainer) this.b;
        if (r132.g == false) goto L11;
        Drawable r133 = r132.f;
        if (r133 == null) goto L20;
        r133.draw(r13);
        return;
    L20:
        return;
    L11:
        Drawable r02 = r132.d;
        if (r02 == null) goto L14;
        r02.draw(r13);
    L14:
        Drawable r03 = r132.e;
        if (r03 != null) goto L17;
        return;
    L17:
        if (r132.h == false) goto L23;
        r03.draw(r13);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch(this.a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        return -3;
    L6:
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline r3) {
        switch(this.a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        super.getOutline(r3);
        return;
    L6:
        ActionBarContainer r0 = (ActionBarContainer) this.b;
        if (r0.g == true) goto L9;
        Drawable r02 = r0.d;
        if (r02 == null) goto L17;
        r02.getOutline(r3);
        return;
    L17:
        return;
    L9:
        if (r0.f == null) goto L15;
        r0.d.getOutline(r3);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r1) {
        int r12 = this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter r1) {
        int r12 = this.a;
    }

    public w0() {
        this.a = 1;
        Paint r0 = new Paint(1);
        r0.setColor(-1);
        r0.setStyle(Paint.Style.STROKE);
        r0.setStrokeWidth(5.0f);
        r0.setStrokeCap(Paint.Cap.ROUND);
        r0.setStrokeJoin(Paint.Join.ROUND);
        this.b = r0;
    }

    private final void a(int r1) {
    }

    private final void b(int r1) {
    }

    private final void c(ColorFilter r1) {
    }

    private final void d(ColorFilter r1) {
    }
}
