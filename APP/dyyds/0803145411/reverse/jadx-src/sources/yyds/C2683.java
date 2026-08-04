package yyds;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: yyds.ᲈᛶᛷᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2683 extends Drawable {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Paint f13146;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public float f13147;

    public C2683(String str, String str2) {
        AbstractC2328.m4341(-797403201045358L);
        AbstractC2328.m4341(-797441855751022L);
        List listM4854 = AbstractC2725.m4854(str, str2);
        Paint paint = new Paint(1);
        paint.setColor(Color.parseColor(AbstractC2328.m4341(-797476215489390L)));
        paint.setTextSize(36.0f);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        this.f13146 = paint2;
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float fontSpacing = paint.getFontSpacing();
        Iterator it = listM4854.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fMeasureText = paint.measureText((String) it.next());
        while (it.hasNext()) {
            fMeasureText = Math.max(fMeasureText, paint.measureText((String) it.next()));
        }
        int iCeil = (int) Math.ceil(fMeasureText + 200.0f);
        int iCeil2 = (int) Math.ceil(3.0f * fontSpacing);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iCeil < 1 ? 1 : iCeil, iCeil2 >= 1 ? iCeil2 : 1, Bitmap.Config.ARGB_8888);
        AbstractC2328.m4341(-797665194050414L);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        float f = -fontMetrics.ascent;
        int i = 0;
        for (Object obj : listM4854) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC2725.m4853();
                throw null;
            }
            canvas.drawText((String) obj, 0.0f, (i * fontSpacing) + f, paint);
            i = i2;
        }
        Paint paint3 = this.f13146;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        paint3.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) throws Throwable {
        Canvas canvas2;
        AbstractC2328.m4341(-797570704769902L);
        Rect bounds = getBounds();
        AbstractC2328.m4341(-797600769540974L);
        if (bounds.width() <= 0 || bounds.height() <= 0) {
            return;
        }
        float fExactCenterX = bounds.exactCenterX();
        float fExactCenterY = bounds.exactCenterY();
        int iSave = canvas.save();
        canvas.rotate(-30.0f, fExactCenterX, fExactCenterY);
        try {
            float f = bounds.left;
            float f2 = this.f13147;
            canvas2 = canvas;
            try {
                canvas2.drawRect(f - f2, bounds.top - f2, bounds.right + f2, bounds.bottom + f2, this.f13146);
                canvas2.restoreToCount(iSave);
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                canvas2.restoreToCount(iSave);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            canvas2 = canvas;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        AbstractC2328.m4341(-797540639998830L);
        super.onBoundsChange(rect);
        float fWidth = rect.width();
        float fHeight = rect.height();
        this.f13147 = (float) Math.sqrt((fHeight * fHeight) + (fWidth * fWidth));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f13146.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f13146.setColorFilter(colorFilter);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m4781(View view) {
        AbstractC2328.m4341(-797519165162350L);
        setBounds(0, 0, view.getWidth(), view.getHeight());
        invalidateSelf();
    }
}
