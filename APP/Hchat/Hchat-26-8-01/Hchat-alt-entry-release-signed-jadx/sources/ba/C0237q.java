package ba;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p259r9.AbstractC3754e0;
import p276sf.C3959f;

/* JADX INFO: renamed from: ba.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0237q extends Drawable {

    /* JADX INFO: renamed from: a */
    public final Bitmap f626a;

    /* JADX INFO: renamed from: b */
    public final NinePatch f627b;

    /* JADX INFO: renamed from: c */
    public final Paint f628c;

    /* JADX INFO: renamed from: d */
    public final Rect f629d;

    /* JADX INFO: renamed from: e */
    public int f630e;

    /* JADX INFO: renamed from: f */
    public boolean f631f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0237q(Bitmap bitmap, byte[] bArr, Rect rect) {
        Object c3959f;
        NinePatch ninePatch;
        this.f626a = bitmap;
        if (bArr != null) {
            try {
                c3959f = NinePatch.isNinePatchChunk(bArr) ? new NinePatch(bitmap, bArr, "HchatMessageBubble") : null;
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            ninePatch = (NinePatch) (c3959f instanceof C3959f ? null : c3959f);
        } else {
            ninePatch = null;
        }
        this.f627b = ninePatch;
        this.f628c = new Paint(3);
        this.f629d = rect != null ? new Rect(rect) : null;
        this.f630e = 255;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        boolean z9 = this.f631f;
        int i9 = this.f630e;
        if (z9) {
            i9 = (int) (i9 * 0.82f);
        }
        Paint paint = this.f628c;
        paint.setAlpha(i9);
        NinePatch ninePatch = this.f627b;
        if (ninePatch != null) {
            ninePatch.draw(canvas, getBounds(), paint);
        } else {
            canvas.drawBitmap(this.f626a, (Rect) null, getBounds(), paint);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f630e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        rect.getClass();
        Rect rect2 = this.f629d;
        if (rect2 == null) {
            return false;
        }
        rect.set(rect2);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        iArr.getClass();
        int length = iArr.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                i9 = -1;
                break;
            }
            if (16842919 == iArr[i9]) {
                break;
            }
            i9++;
        }
        boolean z9 = i9 >= 0;
        if (z9 == this.f631f) {
            return false;
        }
        this.f631f = z9;
        invalidateSelf();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        this.f630e = AbstractC3754e0.m7909r(i9, 0, 255);
        invalidateSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f628c.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
