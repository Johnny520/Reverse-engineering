package p250;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.ArrayList;
import p145.C8316;
import p238.AbstractC8818;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言楪世苏哲兰子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8911 extends Drawable implements Animatable {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public Rect f22620;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f22622;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f22623;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public Paint f22624;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f22625;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f22627;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f22628;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8316 f22629;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f22621 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int f22626 = -1;

    public C8911(C8316 c8316) {
        this.f22629 = c8316;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f22622) {
            return;
        }
        if (this.f22623) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f22620 == null) {
                this.f22620 = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f22620);
            this.f22623 = false;
        }
        C8913 c8913 = (C8913) this.f22629.f20627;
        C8908 c8908 = c8913.f22651;
        Bitmap bitmap = c8908 != null ? c8908.f22616 : c8913.f22650;
        if (this.f22620 == null) {
            this.f22620 = new Rect();
        }
        Rect rect = this.f22620;
        if (this.f22624 == null) {
            this.f22624 = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f22624);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f22629;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((C8913) this.f22629.f20627).f22646;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((C8913) this.f22629.f20627).f22645;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f22627;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f22623 = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f22624 == null) {
            this.f22624 = new Paint(2);
        }
        this.f22624.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f22624 == null) {
            this.f22624 = new Paint(2);
        }
        this.f22624.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        AbstractC8818.m14030("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f22622);
        this.f22621 = z;
        if (!z) {
            this.f22627 = false;
            C8913 c8913 = (C8913) this.f22629.f20627;
            ArrayList arrayList = c8913.f22640;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                c8913.f22637 = false;
            }
        } else if (this.f22628) {
            m14119();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f22628 = true;
        this.f22625 = 0;
        if (this.f22621) {
            m14119();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f22628 = false;
        this.f22627 = false;
        C8913 c8913 = (C8913) this.f22629.f20627;
        ArrayList arrayList = c8913.f22640;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            c8913.f22637 = false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14119() {
        AbstractC8818.m14030("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f22622);
        C8913 c8913 = (C8913) this.f22629.f20627;
        if (c8913.f22642.f23585.f23595 == 1) {
            invalidateSelf();
            return;
        }
        if (this.f22627) {
            return;
        }
        this.f22627 = true;
        ArrayList arrayList = c8913.f22640;
        if (c8913.f22652) {
            C6755.m11870("Cannot subscribe to a cleared frame loader");
            return;
        }
        if (arrayList.contains(this)) {
            C6755.m11870("Cannot subscribe twice in a row");
            return;
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !c8913.f22637) {
            c8913.f22637 = true;
            c8913.f22652 = false;
            c8913.m14124();
        }
        invalidateSelf();
    }
}
