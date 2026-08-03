package com.google.android.material.shadow;

import Yue.C3913;
import Yue.C8273;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class ShadowRenderer {
    private static final int COLOR_ALPHA_END = 0;
    private static final int COLOR_ALPHA_MIDDLE = 20;
    private static final int COLOR_ALPHA_START = 68;

    @InterfaceC6391
    private final Paint cornerShadowPaint;

    @InterfaceC6391
    private final Paint edgeShadowPaint;
    private final Path scratch;
    private int shadowEndColor;
    private int shadowMiddleColor;

    @InterfaceC6391
    private final Paint shadowPaint;
    private int shadowStartColor;
    private final Paint transparentPaint;
    private static final int[] edgeColors = new int[3];
    private static final float[] edgePositions = {0.0f, 0.5f, 1.0f};
    private static final int[] cornerColors = new int[4];
    private static final float[] cornerPositions = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ShadowRenderer() {
        this(C8273.f24692);
    }

    public void drawCornerShadow(@InterfaceC6391 Canvas canvas, @InterfaceC6490 Matrix matrix, @InterfaceC6391 RectF rectF, int i, float f, float f2) {
        boolean z = f2 < 0.0f;
        Path path = this.scratch;
        if (z) {
            int[] iArr = cornerColors;
            iArr[0] = 0;
            iArr[1] = this.shadowEndColor;
            iArr[2] = this.shadowMiddleColor;
            iArr[3] = this.shadowStartColor;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            int[] iArr2 = cornerColors;
            iArr2[0] = 0;
            iArr2[1] = this.shadowStartColor;
            iArr2[2] = this.shadowMiddleColor;
            iArr2[3] = this.shadowEndColor;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = cornerPositions;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        this.cornerShadowPaint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, cornerColors, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.transparentPaint);
        }
        canvas.drawArc(rectF, f, f2, true, this.cornerShadowPaint);
        canvas.restore();
    }

    public void drawEdgeShadow(@InterfaceC6391 Canvas canvas, @InterfaceC6490 Matrix matrix, @InterfaceC6391 RectF rectF, int i) {
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = edgeColors;
        iArr[0] = this.shadowEndColor;
        iArr[1] = this.shadowMiddleColor;
        iArr[2] = this.shadowStartColor;
        Paint paint = this.edgeShadowPaint;
        float f = rectF.left;
        paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, edgePositions, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.edgeShadowPaint);
        canvas.restore();
    }

    public void drawInnerCornerShadow(@InterfaceC6391 Canvas canvas, @InterfaceC6490 Matrix matrix, @InterfaceC6391 RectF rectF, int i, float f, float f2, @InterfaceC6391 float[] fArr) {
        if (f2 > 0.0f) {
            f += f2;
            f2 = -f2;
        }
        drawCornerShadow(canvas, matrix, rectF, i, f, f2);
        Path path = this.scratch;
        path.rewind();
        path.moveTo(fArr[0], fArr[1]);
        path.arcTo(rectF, f, f2);
        path.close();
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        canvas.drawPath(path, this.transparentPaint);
        canvas.drawPath(path, this.shadowPaint);
        canvas.restore();
    }

    @InterfaceC6391
    public Paint getShadowPaint() {
        return this.shadowPaint;
    }

    public void setShadowColor(int i) {
        this.shadowStartColor = C3913.m11173(i, 68);
        this.shadowMiddleColor = C3913.m11173(i, 20);
        this.shadowEndColor = C3913.m11173(i, 0);
        this.shadowPaint.setColor(this.shadowStartColor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ShadowRenderer(int i) {
        this.scratch = new Path();
        Paint paint = new Paint();
        this.transparentPaint = paint;
        this.shadowPaint = new Paint();
        setShadowColor(i);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.cornerShadowPaint = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.edgeShadowPaint = new Paint(paint2);
    }
}
