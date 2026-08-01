package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: w0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0838w0 extends Drawable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5021a = 1;

    /* JADX INFO: renamed from: b */
    public final Object f5022b;

    public C0838w0(ActionBarContainer actionBarContainer) {
        this.f5022b = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.f5021a) {
            case Base64.DEFAULT /* 0 */:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f5022b;
                if (actionBarContainer.f193g) {
                    Drawable drawable = actionBarContainer.f192f;
                    if (drawable != null) {
                        drawable.draw(canvas);
                    }
                    break;
                } else {
                    Drawable drawable2 = actionBarContainer.f190d;
                    if (drawable2 != null) {
                        drawable2.draw(canvas);
                    }
                    Drawable drawable3 = actionBarContainer.f191e;
                    if (drawable3 != null && actionBarContainer.f194h) {
                        drawable3.draw(canvas);
                        break;
                    }
                }
                break;
            default:
                AbstractC0493mp.m1857g(b50.m492a("k4a0Oh30\n", "8OfaTHyHt9g=\n"), canvas);
                float fWidth = getBounds().width();
                float fHeight = getBounds().height();
                float f = fWidth * 0.44f;
                float f2 = fHeight * 0.68f;
                Paint paint = (Paint) this.f5022b;
                canvas.drawLine(fWidth * 0.28f, fHeight * 0.52f, f, f2, paint);
                canvas.drawLine(f, f2, fWidth * 0.75f, fHeight * 0.35f, paint);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.f5021a) {
            case Base64.DEFAULT /* 0 */:
                return 0;
            default:
                return -3;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        switch (this.f5021a) {
            case Base64.DEFAULT /* 0 */:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f5022b;
                if (!actionBarContainer.f193g) {
                    Drawable drawable = actionBarContainer.f190d;
                    if (drawable != null) {
                        drawable.getOutline(outline);
                    }
                } else if (actionBarContainer.f192f != null) {
                    actionBarContainer.f190d.getOutline(outline);
                }
                break;
            default:
                super.getOutline(outline);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        int i2 = this.f5021a;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        int i = this.f5021a;
    }

    public C0838w0() {
        Paint paint = new Paint(1);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5.0f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f5022b = paint;
    }

    /* JADX INFO: renamed from: a */
    private final void m2585a(int i) {
    }

    /* JADX INFO: renamed from: b */
    private final void m2586b(int i) {
    }

    /* JADX INFO: renamed from: c */
    private final void m2587c(ColorFilter colorFilter) {
    }

    /* JADX INFO: renamed from: d */
    private final void m2588d(ColorFilter colorFilter) {
    }
}
