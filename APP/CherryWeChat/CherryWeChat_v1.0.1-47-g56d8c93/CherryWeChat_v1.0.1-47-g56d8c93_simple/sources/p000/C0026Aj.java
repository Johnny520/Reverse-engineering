package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.ArrayList;

/* JADX INFO: renamed from: Aj */
/* JADX INFO: loaded from: classes.dex */
public final class C0026Aj extends Drawable implements InterfaceC0241Fj, Animatable {

    /* JADX INFO: renamed from: a */
    public final C0476L2 f50a;

    /* JADX INFO: renamed from: b */
    public boolean f51b;

    /* JADX INFO: renamed from: c */
    public boolean f52c;

    /* JADX INFO: renamed from: d */
    public boolean f53d;

    /* JADX INFO: renamed from: e */
    public boolean f54e;

    /* JADX INFO: renamed from: f */
    public int f55f;

    /* JADX INFO: renamed from: g */
    public final int f56g;

    /* JADX INFO: renamed from: h */
    public boolean f57h;

    /* JADX INFO: renamed from: i */
    public Paint f58i;

    /* JADX INFO: renamed from: j */
    public Rect f59j;

    public C0026Aj(C0476L2 r2) {
        this.f54e = true;
        this.f56g = -1;
        this.f50a = r2;
    }

    /* JADX INFO: renamed from: a */
    public final void m35a() {
        AbstractC0714Qj.m1484f("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f53d);
        C0327Hj r0 = (C0327Hj) this.f50a.f1572b;
        if (r0.f1113a.f3112l.f1287c != 1) goto L7;
        invalidateSelf();
        return;
    L7:
        if (this.f51b == true) goto L24;
        this.f51b = true;
        ArrayList r2 = r0.f1115c;
        if (r0.f1122j == true) goto L23;
        if (r2.contains(this) == true) goto L21;
        boolean r3 = r2.isEmpty();
        r2.add(this);
        if (r3 == true) goto L15;
    L18:
        invalidateSelf();
        return;
    L15:
        if (r0.f1118f == true) goto L18;
        r0.f1118f = true;
        r0.f1122j = false;
        r0.m712a();
        goto L18
    L21:
        throw new IllegalStateException("Cannot subscribe twice in a row");
    L23:
        throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas r6) {
        if (this.f53d == false) goto L6;
        return;
    L6:
        if (this.f57h == false) goto L11;
        int r0 = getIntrinsicWidth();
        int r1 = getIntrinsicHeight();
        Rect r2 = getBounds();
        if (this.f59j != null) goto L10;
        this.f59j = new Rect();
    L10:
        Gravity.apply(119, r0, r1, r2, this.f59j);
        this.f57h = false;
    L11:
        C0327Hj r02 = (C0327Hj) this.f50a.f1572b;
        C0198Ej r12 = r02.f1121i;
        if (r12 == null) goto L14;
        Bitmap r03 = r12.f602g;
    L16:
        if (this.f59j != null) goto L18;
        this.f59j = new Rect();
    L18:
        Rect r13 = this.f59j;
        if (this.f58i != null) goto L21;
        this.f58i = new Paint(2);
    L21:
        r6.drawBitmap(r03, null, r13, this.f58i);
        return;
    L14:
        r03 = r02.f1124l;
        goto L16
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f50a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((C0327Hj) this.f50a.f1572b).f1128p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((C0327Hj) this.f50a.f1572b).f1127o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f51b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect r1) {
        super.onBoundsChange(r1);
        this.f57h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r3) {
        if (this.f58i != null) goto L5;
        this.f58i = new Paint(2);
    L5:
        this.f58i.setAlpha(r3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter r3) {
        if (this.f58i != null) goto L5;
        this.f58i = new Paint(2);
    L5:
        this.f58i.setColorFilter(r3);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean r4, boolean r5) {
        AbstractC0714Qj.m1484f("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f53d);
        this.f54e = r4;
        if (r4 == true) goto L8;
        this.f51b = false;
        C0327Hj r1 = (C0327Hj) this.f50a.f1572b;
        ArrayList r2 = r1.f1115c;
        r2.remove(this);
        if (r2.isEmpty() == false) goto L11;
        r1.f1118f = false;
    L11:
        return super.setVisible(r4, r5);
    L8:
        if (this.f52c == false) goto L11;
        m35a();
        goto L11
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f52c = true;
        this.f55f = 0;
        if (this.f54e == false) goto L6;
        m35a();
        return;
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f52c = false;
        this.f51b = false;
        C0327Hj r1 = (C0327Hj) this.f50a.f1572b;
        ArrayList r2 = r1.f1115c;
        r2.remove(this);
        if (r2.isEmpty() == false) goto L6;
        r1.f1118f = false;
        return;
    }
}
