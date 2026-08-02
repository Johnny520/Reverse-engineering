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

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yo0 extends Drawable implements Animatable {

    /* JADX INFO: renamed from: h */
    public final xo0 f13536h;

    /* JADX INFO: renamed from: i */
    public boolean f13537i;

    /* JADX INFO: renamed from: j */
    public boolean f13538j;

    /* JADX INFO: renamed from: k */
    public boolean f13539k;

    /* JADX INFO: renamed from: m */
    public int f13541m;

    /* JADX INFO: renamed from: o */
    public boolean f13543o;

    /* JADX INFO: renamed from: p */
    public Paint f13544p;

    /* JADX INFO: renamed from: q */
    public Rect f13545q;

    /* JADX INFO: renamed from: l */
    public boolean f13540l = true;

    /* JADX INFO: renamed from: n */
    public final int f13542n = -1;

    public yo0(xo0 xo0Var) {
        this.f13536h = xo0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m6303a() {
        fg1.m1640o("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f13539k);
        ep0 ep0Var = this.f13536h.f13087a;
        if (ep0Var.f2532a.f1031l.f3094c == 1) {
            invalidateSelf();
            return;
        }
        if (this.f13537i) {
            return;
        }
        this.f13537i = true;
        ArrayList arrayList = ep0Var.f2534c;
        if (ep0Var.f2541j) {
            C0676s.m4653l("Cannot subscribe to a cleared frame loader");
            return;
        }
        if (arrayList.contains(this)) {
            C0676s.m4653l("Cannot subscribe twice in a row");
            return;
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !ep0Var.f2537f) {
            ep0Var.f2537f = true;
            ep0Var.f2541j = false;
            ep0Var.m1400a();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f13539k) {
            return;
        }
        if (this.f13543o) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f13545q == null) {
                this.f13545q = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f13545q);
            this.f13543o = false;
        }
        ep0 ep0Var = this.f13536h.f13087a;
        cp0 cp0Var = ep0Var.f2540i;
        Bitmap bitmap = cp0Var != null ? cp0Var.f1659n : ep0Var.f2543l;
        if (this.f13545q == null) {
            this.f13545q = new Rect();
        }
        Rect rect = this.f13545q;
        if (this.f13544p == null) {
            this.f13544p = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f13544p);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f13536h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f13536h.f13087a.f2547p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f13536h.f13087a.f2546o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f13537i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f13543o = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f13544p == null) {
            this.f13544p = new Paint(2);
        }
        this.f13544p.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f13544p == null) {
            this.f13544p = new Paint(2);
        }
        this.f13544p.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        fg1.m1640o("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f13539k);
        this.f13540l = z;
        if (!z) {
            this.f13537i = false;
            ep0 ep0Var = this.f13536h.f13087a;
            ArrayList arrayList = ep0Var.f2534c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                ep0Var.f2537f = false;
            }
        } else if (this.f13538j) {
            m6303a();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f13538j = true;
        this.f13541m = 0;
        if (this.f13540l) {
            m6303a();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f13538j = false;
        this.f13537i = false;
        ep0 ep0Var = this.f13536h.f13087a;
        ArrayList arrayList = ep0Var.f2534c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            ep0Var.f2537f = false;
        }
    }
}
