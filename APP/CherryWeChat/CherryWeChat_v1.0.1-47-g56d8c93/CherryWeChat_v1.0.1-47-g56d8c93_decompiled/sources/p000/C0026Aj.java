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

    /* JADX INFO: renamed from: f */
    public int f55f;

    /* JADX INFO: renamed from: h */
    public boolean f57h;

    /* JADX INFO: renamed from: i */
    public Paint f58i;

    /* JADX INFO: renamed from: j */
    public Rect f59j;

    /* JADX INFO: renamed from: e */
    public boolean f54e = true;

    /* JADX INFO: renamed from: g */
    public final int f56g = -1;

    public C0026Aj(C0476L2 c0476l2) {
        this.f50a = c0476l2;
    }

    /* JADX INFO: renamed from: a */
    public final void m35a() {
        AbstractC0714Qj.m1484f("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f53d);
        C0327Hj c0327Hj = (C0327Hj) this.f50a.f1572b;
        if (c0327Hj.f1113a.f3112l.f1287c == 1) {
            invalidateSelf();
            return;
        }
        if (this.f51b) {
            return;
        }
        this.f51b = true;
        ArrayList arrayList = c0327Hj.f1115c;
        if (c0327Hj.f1122j) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (arrayList.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !c0327Hj.f1118f) {
            c0327Hj.f1118f = true;
            c0327Hj.f1122j = false;
            c0327Hj.m712a();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f53d) {
            return;
        }
        if (this.f57h) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f59j == null) {
                this.f59j = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f59j);
            this.f57h = false;
        }
        C0327Hj c0327Hj = (C0327Hj) this.f50a.f1572b;
        C0198Ej c0198Ej = c0327Hj.f1121i;
        Bitmap bitmap = c0198Ej != null ? c0198Ej.f602g : c0327Hj.f1124l;
        if (this.f59j == null) {
            this.f59j = new Rect();
        }
        Rect rect = this.f59j;
        if (this.f58i == null) {
            this.f58i = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f58i);
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
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f57h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f58i == null) {
            this.f58i = new Paint(2);
        }
        this.f58i.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f58i == null) {
            this.f58i = new Paint(2);
        }
        this.f58i.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        AbstractC0714Qj.m1484f("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f53d);
        this.f54e = z;
        if (!z) {
            this.f51b = false;
            C0327Hj c0327Hj = (C0327Hj) this.f50a.f1572b;
            ArrayList arrayList = c0327Hj.f1115c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                c0327Hj.f1118f = false;
            }
        } else if (this.f52c) {
            m35a();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f52c = true;
        this.f55f = 0;
        if (this.f54e) {
            m35a();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f52c = false;
        this.f51b = false;
        C0327Hj c0327Hj = (C0327Hj) this.f50a.f1572b;
        ArrayList arrayList = c0327Hj.f1115c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            c0327Hj.f1118f = false;
        }
    }
}
