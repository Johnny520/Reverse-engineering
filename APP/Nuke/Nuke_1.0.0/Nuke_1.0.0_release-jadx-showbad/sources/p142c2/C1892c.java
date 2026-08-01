package p142c2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.ArrayList;
import p195l2.AbstractC2503g;

/* JADX INFO: renamed from: c2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1892c extends Drawable implements InterfaceC1895f, Animatable {

    /* JADX INFO: renamed from: d */
    public final C1891b f6426d;

    /* JADX INFO: renamed from: e */
    public boolean f6427e;

    /* JADX INFO: renamed from: f */
    public boolean f6428f;

    /* JADX INFO: renamed from: g */
    public boolean f6429g;

    /* JADX INFO: renamed from: i */
    public int f6431i;

    /* JADX INFO: renamed from: k */
    public boolean f6433k;

    /* JADX INFO: renamed from: l */
    public Paint f6434l;

    /* JADX INFO: renamed from: m */
    public Rect f6435m;

    /* JADX INFO: renamed from: h */
    public boolean f6430h = true;

    /* JADX INFO: renamed from: j */
    public final int f6432j = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1892c(C1891b c1891b) {
        this.f6426d = c1891b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m3376a() {
        AbstractC2503g.m4443a("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f6429g);
        C1896g c1896g = this.f6426d.f6425a;
        if (c1896g.f6444a.f3272l.f3248c == 1) {
            invalidateSelf();
            return;
        }
        if (this.f6427e) {
            return;
        }
        this.f6427e = true;
        ArrayList arrayList = c1896g.f6446c;
        if (c1896g.f6453j) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (arrayList.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !c1896g.f6449f) {
            c1896g.f6449f = true;
            c1896g.f6453j = false;
            c1896g.m3385a();
        }
        invalidateSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f6429g) {
            return;
        }
        if (this.f6433k) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f6435m == null) {
                this.f6435m = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f6435m);
            this.f6433k = false;
        }
        C1896g c1896g = this.f6426d.f6425a;
        C1894e c1894e = c1896g.f6452i;
        Bitmap bitmap = c1894e != null ? c1894e.f6443j : c1896g.f6455l;
        if (this.f6435m == null) {
            this.f6435m = new Rect();
        }
        Rect rect = this.f6435m;
        if (this.f6434l == null) {
            this.f6434l = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f6434l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f6426d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f6426d.f6425a.f6459p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f6426d.f6425a.f6458o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f6427e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f6433k = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i5) {
        if (this.f6434l == null) {
            this.f6434l = new Paint(2);
        }
        this.f6434l.setAlpha(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f6434l == null) {
            this.f6434l = new Paint(2);
        }
        this.f6434l.setColorFilter(colorFilter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z5, boolean z6) {
        AbstractC2503g.m4443a("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f6429g);
        this.f6430h = z5;
        if (!z5) {
            this.f6427e = false;
            C1896g c1896g = this.f6426d.f6425a;
            ArrayList arrayList = c1896g.f6446c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                c1896g.f6449f = false;
            }
        } else if (this.f6428f) {
            m3376a();
        }
        return super.setVisible(z5, z6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f6428f = true;
        this.f6431i = 0;
        if (this.f6430h) {
            m3376a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f6428f = false;
        this.f6427e = false;
        C1896g c1896g = this.f6426d.f6425a;
        ArrayList arrayList = c1896g.f6446c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            c1896g.f6449f = false;
        }
    }
}
