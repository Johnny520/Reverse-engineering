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
import p129.C7487;
import p222.AbstractC7989;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言楪世苏哲兰子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8082 extends Drawable implements Animatable {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public Rect f22275;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f22277;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f22278;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public Paint f22279;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f22280;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f22282;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f22283;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C7487 f22284;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f22276 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int f22281 = -1;

    public C8082(C7487 c7487) {
        this.f22284 = c7487;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f22277) {
            return;
        }
        if (this.f22278) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f22275 == null) {
                this.f22275 = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f22275);
            this.f22278 = false;
        }
        C8084 c8084 = (C8084) this.f22284.f20282;
        C8079 c8079 = c8084.f22306;
        Bitmap bitmap = c8079 != null ? c8079.f22271 : c8084.f22305;
        if (this.f22275 == null) {
            this.f22275 = new Rect();
        }
        Rect rect = this.f22275;
        if (this.f22279 == null) {
            this.f22279 = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f22279);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f22284;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((C8084) this.f22284.f20282).f22301;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((C8084) this.f22284.f20282).f22300;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f22282;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f22278 = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f22279 == null) {
            this.f22279 = new Paint(2);
        }
        this.f22279.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f22279 == null) {
            this.f22279 = new Paint(2);
        }
        this.f22279.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        AbstractC7989.m13471("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f22277);
        this.f22276 = z;
        if (!z) {
            this.f22282 = false;
            C8084 c8084 = (C8084) this.f22284.f20282;
            ArrayList arrayList = c8084.f22295;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                c8084.f22292 = false;
            }
        } else if (this.f22283) {
            m13560();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f22283 = true;
        this.f22280 = 0;
        if (this.f22276) {
            m13560();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f22283 = false;
        this.f22282 = false;
        C8084 c8084 = (C8084) this.f22284.f20282;
        ArrayList arrayList = c8084.f22295;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            c8084.f22292 = false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13560() {
        AbstractC7989.m13471("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f22277);
        C8084 c8084 = (C8084) this.f22284.f20282;
        if (c8084.f22297.f23240.f23250 == 1) {
            invalidateSelf();
            return;
        }
        if (this.f22282) {
            return;
        }
        this.f22282 = true;
        ArrayList arrayList = c8084.f22295;
        if (c8084.f22307) {
            C5925.m11311("Cannot subscribe to a cleared frame loader");
            return;
        }
        if (arrayList.contains(this)) {
            C5925.m11311("Cannot subscribe twice in a row");
            return;
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !c8084.f22292) {
            c8084.f22292 = true;
            c8084.f22307 = false;
            c8084.m13565();
        }
        invalidateSelf();
    }
}
