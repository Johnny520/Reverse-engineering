package p000;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: Nw */
/* JADX INFO: loaded from: classes.dex */
public final class C0598Nw extends Drawable {

    /* JADX INFO: renamed from: a */
    public float f1928a;

    /* JADX INFO: renamed from: b */
    public final Paint f1929b;

    /* JADX INFO: renamed from: c */
    public final RectF f1930c;

    /* JADX INFO: renamed from: d */
    public final Rect f1931d;

    /* JADX INFO: renamed from: e */
    public float f1932e;

    /* JADX INFO: renamed from: f */
    public boolean f1933f;

    /* JADX INFO: renamed from: g */
    public boolean f1934g;

    /* JADX INFO: renamed from: h */
    public ColorStateList f1935h;

    /* JADX INFO: renamed from: i */
    public PorterDuffColorFilter f1936i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f1937j;

    /* JADX INFO: renamed from: k */
    public PorterDuff.Mode f1938k;

    public C0598Nw(ColorStateList r3, float r4) {
        this.f1933f = false;
        this.f1934g = true;
        this.f1938k = PorterDuff.Mode.SRC_IN;
        this.f1928a = r4;
        Paint r42 = new Paint(5);
        this.f1929b = r42;
        if (r3 != null) goto L5;
        r3 = ColorStateList.valueOf(0);
    L5:
        this.f1935h = r3;
        r42.setColor(r3.getColorForState(getState(), this.f1935h.getDefaultColor()));
        this.f1930c = new RectF();
        this.f1931d = new Rect();
    }

    /* JADX INFO: renamed from: a */
    public final PorterDuffColorFilter m1170a(ColorStateList r3, PorterDuff.Mode r4) {
        if (r3 == null) goto L7;
        if (r4 != null) goto L6;
        return null;
    L6:
        return new PorterDuffColorFilter(r3.getColorForState(getState(), 0), r4);
    L7:
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m1171b(Rect r6) {
        if (r6 != null) goto L4;
        r6 = getBounds();
    L4:
        float r0 = r6.left;
        float r1 = r6.top;
        float r2 = r6.right;
        float r3 = r6.bottom;
        RectF r4 = this.f1930c;
        r4.set(r0, r1, r2, r3);
        Rect r02 = this.f1931d;
        r02.set(r6);
        if (this.f1933f == false) goto L8;
        r02.inset((int) Math.ceil(AbstractC0641Ow.m1263a(this.f1932e, this.f1928a, this.f1934g)), (int) Math.ceil(AbstractC0641Ow.m1264b(this.f1932e, this.f1928a, this.f1934g)));
        r4.set(r02);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas r5) {
        PorterDuffColorFilter r0 = this.f1936i;
        Paint r1 = this.f1929b;
        if (r0 != null) goto L5;
    L7:
        boolean r02 = false;
    L8:
        RectF r2 = this.f1930c;
        float r3 = this.f1928a;
        r5.drawRoundRect(r2, r3, r3, r1);
        if (r02 == false) goto L12;
        r1.setColorFilter(null);
        return;
    L12:
        return;
    L5:
        if (r1.getColorFilter() != null) goto L7;
        r1.setColorFilter(this.f1936i);
        r02 = true;
        goto L8
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline r3) {
        r3.setRoundRect(this.f1931d, this.f1928a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList r0 = this.f1937j;
        if (r0 != null) goto L5;
    L6:
        ColorStateList r02 = this.f1935h;
        if (r02 == null) goto L11;
        if (r02.isStateful() == false) goto L11;
        return true;
    L11:
        if (super.isStateful() == true) goto L17;
        return false;
    L17:
        return true;
    L5:
        if (r0.isStateful() == false) goto L6;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect r1) {
        super.onBoundsChange(r1);
        m1171b(r1);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] r4) {
        ColorStateList r0 = this.f1935h;
        int r42 = r0.getColorForState(r4, r0.getDefaultColor());
        Paint r02 = this.f1929b;
        if (r42 == r02.getColor()) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == false) goto L8;
        r02.setColor(r42);
    L8:
        ColorStateList r43 = this.f1937j;
        if (r43 == null) goto L14;
        PorterDuff.Mode r03 = this.f1938k;
        if (r03 == null) goto L14;
        this.f1936i = m1170a(r43, r03);
        return true;
    L14:
        return r1;
    L5:
        r1 = false;
        goto L6
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r2) {
        this.f1929b.setAlpha(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter r2) {
        this.f1929b.setColorFilter(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList r2) {
        this.f1937j = r2;
        this.f1936i = m1170a(r2, this.f1938k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode r2) {
        this.f1938k = r2;
        this.f1936i = m1170a(this.f1937j, r2);
        invalidateSelf();
    }
}
