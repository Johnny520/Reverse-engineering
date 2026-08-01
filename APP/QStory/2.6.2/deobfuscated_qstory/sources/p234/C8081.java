package p234;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.ArrayList;
import p129.C7486;
import p222.AbstractC7988;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言楪世苏哲兰子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8081 extends Drawable implements Animatable {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public Rect f22277;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f22279;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f22280;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public Paint f22281;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f22282;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f22284;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f22285;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C7486 f22286;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f22278 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int f22283 = -1;

    public C8081(C7486 c7486) {
        this.f22286 = c7486;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f22279) {
            return;
        }
        if (this.f22280) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f22277 == null) {
                this.f22277 = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f22277);
            this.f22280 = false;
        }
        C8083 c8083 = (C8083) this.f22286.f20287;
        C8078 c8078 = c8083.f22308;
        Bitmap bitmap = c8078 != null ? c8078.f22273 : c8083.f22307;
        if (this.f22277 == null) {
            this.f22277 = new Rect();
        }
        Rect rect = this.f22277;
        if (this.f22281 == null) {
            this.f22281 = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f22281);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f22286;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((C8083) this.f22286.f20287).f22303;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((C8083) this.f22286.f20287).f22302;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f22284;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f22280 = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f22281 == null) {
            this.f22281 = new Paint(2);
        }
        this.f22281.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f22281 == null) {
            this.f22281 = new Paint(2);
        }
        this.f22281.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        AbstractC7988.m13443("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f22279);
        this.f22278 = z;
        if (!z) {
            this.f22284 = false;
            C8083 c8083 = (C8083) this.f22286.f20287;
            ArrayList arrayList = c8083.f22297;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                c8083.f22294 = false;
            }
        } else if (this.f22285) {
            m13531();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f22285 = true;
        this.f22282 = 0;
        if (this.f22278) {
            m13531();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f22285 = false;
        this.f22284 = false;
        C8083 c8083 = (C8083) this.f22286.f20287;
        ArrayList arrayList = c8083.f22297;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            c8083.f22294 = false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13531() {
        AbstractC7988.m13443("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f22279);
        C8083 c8083 = (C8083) this.f22286.f20287;
        if (c8083.f22299.f23241.f23251 == 1) {
            invalidateSelf();
            return;
        }
        if (this.f22284) {
            return;
        }
        this.f22284 = true;
        ArrayList arrayList = c8083.f22297;
        if (c8083.f22309) {
            C5919.m11250("Cannot subscribe to a cleared frame loader");
            return;
        }
        if (arrayList.contains(this)) {
            C5919.m11250("Cannot subscribe twice in a row");
            return;
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !c8083.f22294) {
            c8083.f22294 = true;
            c8083.f22309 = false;
            c8083.m13536();
        }
        invalidateSelf();
    }
}
