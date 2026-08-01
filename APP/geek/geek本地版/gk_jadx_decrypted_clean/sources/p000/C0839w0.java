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
public final class C0839w0 extends Drawable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4891a = 1;

    /* JADX INFO: renamed from: b */
    public final Object f4892b;

    public C0839w0(ActionBarContainer actionBarContainer) {
        this.f4892b = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.f4891a) {
            case Base64.DEFAULT /* 0 */:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f4892b;
                if (actionBarContainer.f230g) {
                    Drawable drawable = actionBarContainer.f229f;
                    if (drawable != null) {
                        drawable.draw(canvas);
                    }
                    break;
                } else {
                    Drawable drawable2 = actionBarContainer.f227d;
                    if (drawable2 != null) {
                        drawable2.draw(canvas);
                    }
                    Drawable drawable3 = actionBarContainer.f228e;
                    if (drawable3 != null && actionBarContainer.f231h) {
                        drawable3.draw(canvas);
                        break;
                    }
                }
                break;
            default:
                AbstractC0346ip.m1503o("canvas", canvas);
                float fWidth = getBounds().width();
                float fHeight = getBounds().height();
                float f = fWidth * 0.44f;
                float f2 = fHeight * 0.68f;
                Paint paint = (Paint) this.f4892b;
                canvas.drawLine(fWidth * 0.28f, fHeight * 0.52f, f, f2, paint);
                canvas.drawLine(f, f2, fWidth * 0.75f, fHeight * 0.35f, paint);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.f4891a) {
            case Base64.DEFAULT /* 0 */:
                return 0;
            default:
                return -3;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        switch (this.f4891a) {
            case Base64.DEFAULT /* 0 */:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f4892b;
                if (!actionBarContainer.f230g) {
                    Drawable drawable = actionBarContainer.f227d;
                    if (drawable != null) {
                        drawable.getOutline(outline);
                    }
                } else if (actionBarContainer.f229f != null) {
                    actionBarContainer.f227d.getOutline(outline);
                }
                break;
            default:
                super.getOutline(outline);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        int i2 = this.f4891a;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        int i = this.f4891a;
    }

    public C0839w0() {
        Paint paint = new Paint(1);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5.0f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f4892b = paint;
    }

    /* JADX INFO: renamed from: a */
    private final void m2533a(int i) {
    }

    /* JADX INFO: renamed from: b */
    private final void m2534b(int i) {
    }

    /* JADX INFO: renamed from: c */
    private final void m2535c(ColorFilter colorFilter) {
    }

    /* JADX INFO: renamed from: d */
    private final void m2536d(ColorFilter colorFilter) {
    }
}
