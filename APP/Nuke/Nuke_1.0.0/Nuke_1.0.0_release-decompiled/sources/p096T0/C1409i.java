package p096T0;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import p027E4.C0330q;
import p120Y0.AbstractC1732a;

/* JADX INFO: renamed from: T0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1409i extends Canvas {

    /* JADX INFO: renamed from: a */
    public Canvas f5038a;

    /* JADX INFO: renamed from: a */
    public final Canvas m2704a() {
        Canvas canvas = this.f5038a;
        if (canvas != null) {
            return canvas;
        }
        AbstractC1732a.m3087c("Text drawing wrapper is missing a Canvas!");
        throw new C0330q();
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        return m2704a().clipOutPath(path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rectF) {
        return m2704a().clipOutRect(rectF);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op) {
        return m2704a().clipPath(path, op);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF, Region.Op op) {
        return m2704a().clipRect(rectF, op);
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        m2704a().concat(matrix);
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        m2704a().disableZ();
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i5, int i6, int i7, int i8) {
        m2704a().drawARGB(i5, i6, i7, i8);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f2, float f5, boolean z5, Paint paint) {
        m2704a().drawArc(rectF, f2, f5, z5, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f2, float f5, Paint paint) {
        m2704a().drawBitmap(bitmap, f2, f5, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i5, int i6, float[] fArr, int i7, int[] iArr, int i8, Paint paint) {
        m2704a().drawBitmapMesh(bitmap, i5, i6, fArr, i7, iArr, i8, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f2, float f5, float f6, Paint paint) {
        m2704a().drawCircle(f2, f5, f6, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i5) {
        m2704a().drawColor(i5);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f2, float f5, RectF rectF2, float f6, float f7, Paint paint) {
        m2704a().drawDoubleRoundRect(rectF, f2, f5, rectF2, f6, f7, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i5, float[] fArr, int i6, int i7, Font font, Paint paint) {
        m2704a().drawGlyphs(iArr, i5, fArr, i6, i7, font, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f2, float f5, float f6, float f7, Paint paint) {
        m2704a().drawLine(f2, f5, f6, f7, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i5, int i6, Paint paint) {
        m2704a().drawLines(fArr, i5, i6, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        m2704a().drawOval(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        m2704a().drawPaint(paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        m2704a().drawPatch(ninePatch, rect, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        m2704a().drawPath(path, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        m2704a().drawPicture(picture);
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f2, float f5, Paint paint) {
        m2704a().drawPoint(f2, f5, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i5, int i6, Paint paint) {
        m2704a().drawPoints(fArr, i5, i6, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i5, int i6, float[] fArr, Paint paint) {
        m2704a().drawPosText(cArr, i5, i6, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i5, int i6, int i7) {
        m2704a().drawRGB(i5, i6, i7);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        m2704a().drawRect(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        m2704a().drawRenderNode(renderNode);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f2, float f5, Paint paint) {
        m2704a().drawRoundRect(rectF, f2, f5, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i5, int i6, float f2, float f5, Paint paint) {
        m2704a().drawText(cArr, i5, i6, f2, f5, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i5, int i6, Path path, float f2, float f5, Paint paint) {
        m2704a().drawTextOnPath(cArr, i5, i6, path, f2, f5, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i5, int i6, int i7, int i8, float f2, float f5, boolean z5, Paint paint) {
        m2704a().drawTextRun(cArr, i5, i6, i7, i8, f2, f5, z5, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i5, float[] fArr, int i6, float[] fArr2, int i7, int[] iArr, int i8, short[] sArr, int i9, int i10, Paint paint) {
        m2704a().drawVertices(vertexMode, i5, fArr, i6, fArr2, i7, iArr, i8, sArr, i9, i10, paint);
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        m2704a().enableZ();
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect rect) {
        boolean clipBounds = m2704a().getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        return m2704a().getDensity();
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        return m2704a().getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        return m2704a().getHeight();
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix matrix) {
        m2704a().getMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        return m2704a().getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        return m2704a().getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        return m2704a().getSaveCount();
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        return m2704a().getWidth();
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        return m2704a().isOpaque();
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        return m2704a().quickReject(rectF, edgeType);
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        m2704a().restore();
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i5) {
        m2704a().restoreToCount(i5);
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f2) {
        m2704a().rotate(f2);
    }

    @Override // android.graphics.Canvas
    public final int save() {
        return m2704a().save();
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i5) {
        return m2704a().saveLayer(rectF, paint, i5);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i5, int i6) {
        return m2704a().saveLayerAlpha(rectF, i5, i6);
    }

    @Override // android.graphics.Canvas
    public final void scale(float f2, float f5) {
        m2704a().scale(f2, f5);
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        m2704a().setBitmap(bitmap);
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i5) {
        m2704a().setDensity(i5);
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        m2704a().setDrawFilter(drawFilter);
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        m2704a().setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final void skew(float f2, float f5) {
        m2704a().skew(f2, f5);
    }

    @Override // android.graphics.Canvas
    public final void translate(float f2, float f5) {
        m2704a().translate(f2, f5);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        return m2704a().clipPath(path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op) {
        return m2704a().clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f2, float f5, float f6, float f7, float f8, float f9, boolean z5, Paint paint) {
        m2704a().drawArc(f2, f5, f6, f7, f8, f9, z5, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        m2704a().drawBitmap(bitmap, rect, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j5) {
        m2704a().drawColor(j5);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        m2704a().drawLines(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f2, float f5, float f6, float f7, Paint paint) {
        m2704a().drawOval(f2, f5, f6, f7, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        m2704a().drawPicture(picture, rectF);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        m2704a().drawPoints(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        m2704a().drawPosText(str, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        m2704a().drawRect(rect, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f2, float f5, float f6, float f7, float f8, float f9, Paint paint) {
        m2704a().drawRoundRect(f2, f5, f6, f7, f8, f9, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f2, float f5, Paint paint) {
        m2704a().drawText(str, f2, f5, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f2, float f5, Paint paint) {
        m2704a().drawTextOnPath(str, path, f2, f5, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF) {
        return m2704a().quickReject(rectF);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        return m2704a().saveLayer(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i5) {
        return m2704a().saveLayerAlpha(rectF, i5);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        return m2704a().clipOutRect(rect);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF) {
        return m2704a().clipRect(rectF);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        m2704a().drawBitmap(bitmap, rect, rect2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        m2704a().drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        m2704a().drawPatch(ninePatch, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        m2704a().drawPicture(picture, rect);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f2, float f5, float f6, float f7, Paint paint) {
        m2704a().drawRect(f2, f5, f6, f7, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i5, int i6, float f2, float f5, Paint paint) {
        m2704a().drawText(str, i5, i6, f2, f5, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i5, int i6, int i7, int i8, float f2, float f5, boolean z5, Paint paint) {
        m2704a().drawTextRun(charSequence, i5, i6, i7, i8, f2, f5, z5, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f2, float f5, float f6, float f7, Paint paint, int i5) {
        return m2704a().saveLayer(f2, f5, f6, f7, paint, i5);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f2, float f5, float f6, float f7, int i5, int i6) {
        return m2704a().saveLayerAlpha(f2, f5, f6, f7, i5, i6);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        return m2704a().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i5, int i6, float f2, float f5, int i7, int i8, boolean z5, Paint paint) {
        m2704a().drawBitmap(iArr, i5, i6, f2, f5, i7, i8, z5, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i5, PorterDuff.Mode mode) {
        m2704a().drawColor(i5, mode);
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i5, int i6, float f2, float f5, Paint paint) {
        m2704a().drawText(charSequence, i5, i6, f2, f5, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        return m2704a().quickReject(path, edgeType);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f2, float f5, float f6, float f7, Paint paint) {
        return m2704a().saveLayer(f2, f5, f6, f7, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f2, float f5, float f6, float f7, int i5) {
        return m2704a().saveLayerAlpha(f2, f5, f6, f7, i5);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f2, float f5, float f6, float f7) {
        return m2704a().clipOutRect(f2, f5, f6, f7);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f2, float f5, float f6, float f7, Region.Op op) {
        return m2704a().clipRect(f2, f5, f6, f7, op);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i5, int i6, int i7, int i8, int i9, int i10, boolean z5, Paint paint) {
        m2704a().drawBitmap(iArr, i5, i6, i7, i8, i9, i10, z5, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i5, BlendMode blendMode) {
        m2704a().drawColor(i5, blendMode);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i5, int i6, int i7, int i8, float f2, float f5, boolean z5, Paint paint) {
        m2704a().drawTextRun(measuredText, i5, i6, i7, i8, f2, f5, z5, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        return m2704a().quickReject(path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f2, float f5, float f6, float f7) {
        return m2704a().clipRect(f2, f5, f6, f7);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        m2704a().drawBitmap(bitmap, matrix, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i5, int i6, int i7, int i8) {
        return m2704a().clipOutRect(i5, i6, i7, i8);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i5, int i6, int i7, int i8) {
        return m2704a().clipRect(i5, i6, i7, i8);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j5, BlendMode blendMode) {
        m2704a().drawColor(j5, blendMode);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f2, float f5, float f6, float f7, Canvas.EdgeType edgeType) {
        return m2704a().quickReject(f2, f5, f6, f7, edgeType);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f2, float f5, float f6, float f7) {
        return m2704a().quickReject(f2, f5, f6, f7);
    }
}
