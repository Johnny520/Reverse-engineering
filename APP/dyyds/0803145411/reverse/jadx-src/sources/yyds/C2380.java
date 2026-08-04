package yyds;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᲇᛱᛴᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2380 extends Drawable implements Animatable {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f11725;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public boolean f11727;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public Paint f11729;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public Rect f11730;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public boolean f11731;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C2492 f11732;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public boolean f11733;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public boolean f11734;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public boolean f11728 = true;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final int f11726 = -1;

    public C2380(C2492 c2492) {
        this.f11732 = c2492;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f11733) {
            return;
        }
        if (this.f11731) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            Rect rect = this.f11730;
            if (rect == null) {
                rect = new Rect();
                this.f11730 = rect;
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, rect);
            this.f11731 = false;
        }
        C2445 c2445 = this.f11732.f12303;
        C1751 c1751 = c2445.f12029;
        Bitmap bitmap = c1751 != null ? c1751.f8812 : c2445.f12036;
        Rect rect2 = this.f11730;
        if (rect2 == null) {
            rect2 = new Rect();
            this.f11730 = rect2;
        }
        Paint paint = this.f11729;
        if (paint == null) {
            paint = new Paint(2);
            this.f11729 = paint;
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect2, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f11732;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f11732.f12303.f12039;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f11732.f12303.f12032;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f11734;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f11731 = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.f11729;
        if (paint == null) {
            paint = new Paint(2);
            this.f11729 = paint;
        }
        paint.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Paint paint = this.f11729;
        if (paint == null) {
            paint = new Paint(2);
            this.f11729 = paint;
        }
        paint.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        AbstractC0319.m985("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f11733);
        this.f11728 = z;
        if (!z) {
            this.f11734 = false;
            C2445 c2445 = this.f11732.f12303;
            ArrayList arrayList = c2445.f12038;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                c2445.f12040 = false;
            }
        } else if (this.f11727) {
            m4424();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f11727 = true;
        this.f11725 = 0;
        if (this.f11728) {
            m4424();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f11727 = false;
        this.f11734 = false;
        C2445 c2445 = this.f11732.f12303;
        ArrayList arrayList = c2445.f12038;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            c2445.f12040 = false;
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m4424() {
        AbstractC0319.m985("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f11733);
        C2445 c2445 = this.f11732.f12303;
        if (c2445.f12031.f7992.f616 == 1) {
            invalidateSelf();
            return;
        }
        if (this.f11734) {
            return;
        }
        this.f11734 = true;
        ArrayList arrayList = c2445.f12038;
        if (c2445.f12037) {
            C0188.m800("Cannot subscribe to a cleared frame loader");
            return;
        }
        if (arrayList.contains(this)) {
            C0188.m800("Cannot subscribe twice in a row");
            return;
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !c2445.f12040) {
            c2445.f12040 = true;
            c2445.f12037 = false;
            c2445.m4481();
        }
        invalidateSelf();
    }
}
