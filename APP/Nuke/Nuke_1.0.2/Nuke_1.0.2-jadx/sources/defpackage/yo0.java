package defpackage;

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
    public final xo0 h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int m;
    public boolean o;
    public Paint p;
    public Rect q;
    public boolean l = true;
    public final int n = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public yo0(xo0 xo0Var) {
        this.h = xo0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        fg1.o("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.k);
        ep0 ep0Var = this.h.a;
        if (ep0Var.a.l.c == 1) {
            invalidateSelf();
            return;
        }
        if (this.i) {
            return;
        }
        this.i = true;
        ArrayList arrayList = ep0Var.c;
        if (ep0Var.j) {
            s.l("Cannot subscribe to a cleared frame loader");
            return;
        }
        if (arrayList.contains(this)) {
            s.l("Cannot subscribe twice in a row");
            return;
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !ep0Var.f) {
            ep0Var.f = true;
            ep0Var.j = false;
            ep0Var.a();
        }
        invalidateSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.k) {
            return;
        }
        if (this.o) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.q == null) {
                this.q = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.q);
            this.o = false;
        }
        ep0 ep0Var = this.h.a;
        cp0 cp0Var = ep0Var.i;
        Bitmap bitmap = cp0Var != null ? cp0Var.n : ep0Var.l;
        if (this.q == null) {
            this.q = new Rect();
        }
        Rect rect = this.q;
        if (this.p == null) {
            this.p = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.p);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.h.a.p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.h.a.o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.o = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.p == null) {
            this.p = new Paint(2);
        }
        this.p.setAlpha(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.p == null) {
            this.p = new Paint(2);
        }
        this.p.setColorFilter(colorFilter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        fg1.o("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.k);
        this.l = z;
        if (!z) {
            this.i = false;
            ep0 ep0Var = this.h.a;
            ArrayList arrayList = ep0Var.c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                ep0Var.f = false;
            }
        } else if (this.j) {
            a();
        }
        return super.setVisible(z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.j = true;
        this.m = 0;
        if (this.l) {
            a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.j = false;
        this.i = false;
        ep0 ep0Var = this.h.a;
        ArrayList arrayList = ep0Var.c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            ep0Var.f = false;
        }
    }
}
