package p133j2;

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
import okio.C3193a;
import p204o2.AbstractC3042a;

/* JADX INFO: renamed from: j2.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2060j extends Canvas {

    /* JADX INFO: renamed from: a */
    public Canvas f6914a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Canvas m5108a() {
        Canvas canvas = this.f6914a;
        if (canvas != null) {
            return canvas;
        }
        AbstractC3042a.m6488c("Text drawing wrapper is missing a Canvas!");
        C3193a.m6814c();
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        return m5108a().clipOutPath(path);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rectF) {
        return m5108a().clipOutRect(rectF);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op) {
        return m5108a().clipPath(path, op);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final boolean clipRect(float f3, float f10, float f11, float f12, Region.Op op) {
        return m5108a().clipRect(f3, f10, f11, f12, op);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        m5108a().concat(matrix);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void disableZ() {
        m5108a().disableZ();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawARGB(int i9, int i10, int i11, int i12) {
        m5108a().drawARGB(i9, i10, i11, i12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawArc(float f3, float f10, float f11, float f12, float f13, float f14, boolean z9, Paint paint) {
        m5108a().drawArc(f3, f10, f11, f12, f13, f14, z9, paint);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i9, int i10, float f3, float f10, int i11, int i12, boolean z9, Paint paint) {
        m5108a().drawBitmap(iArr, i9, i10, f3, f10, i11, i12, z9, paint);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i9, int i10, float[] fArr, int i11, int[] iArr, int i12, Paint paint) {
        m5108a().drawBitmapMesh(bitmap, i9, i10, fArr, i11, iArr, i12, paint);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawCircle(float f3, float f10, float f11, Paint paint) {
        m5108a().drawCircle(f3, f10, f11, paint);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawColor(int i9) {
        m5108a().drawColor(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f3, float f10, RectF rectF2, float f11, float f12, Paint paint) {
        m5108a().drawDoubleRoundRect(rectF, f3, f10, rectF2, f11, f12, paint);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i9, float[] fArr, int i10, int i11, Font font, Paint paint) {
        m5108a().drawGlyphs(iArr, i9, fArr, i10, i11, font, paint);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawLine(float f3, float f10, float f11, float f12, Paint paint) {
        m5108a().drawLine(f3, f10, f11, f12, paint);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i9, int i10, Paint paint) {
        m5108a().drawLines(fArr, i9, i10, paint);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawOval(float f3, float f10, float f11, float f12, Paint paint) {
        m5108a().drawOval(f3, f10, f11, f12, paint);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        m5108a().drawPaint(paint);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        m5108a().drawPatch(ninePatch, rect, paint);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        m5108a().drawPath(path, paint);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        m5108a().drawPicture(picture);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawPoint(float f3, float f10, Paint paint) {
        m5108a().drawPoint(f3, f10, paint);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i9, int i10, Paint paint) {
        m5108a().drawPoints(fArr, i9, i10, paint);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i9, int i10, float[] fArr, Paint paint) {
        m5108a().drawPosText(cArr, i9, i10, fArr, paint);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawRGB(int i9, int i10, int i11) {
        m5108a().drawRGB(i9, i10, i11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawRect(float f3, float f10, float f11, float f12, Paint paint) {
        m5108a().drawRect(f3, f10, f11, f12, paint);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        m5108a().drawRenderNode(renderNode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f3, float f10, float f11, float f12, float f13, float f14, Paint paint) {
        m5108a().drawRoundRect(f3, f10, f11, f12, f13, f14, paint);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i9, int i10, float f3, float f10, Paint paint) {
        m5108a().drawText(cArr, i9, i10, f3, f10, paint);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i9, int i10, Path path, float f3, float f10, Paint paint) {
        m5108a().drawTextOnPath(cArr, i9, i10, path, f3, f10, paint);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i9, int i10, int i11, int i12, float f3, float f10, boolean z9, Paint paint) {
        m5108a().drawTextRun(cArr, i9, i10, i11, i12, f3, f10, z9, paint);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i9, float[] fArr, int i10, float[] fArr2, int i11, int[] iArr, int i12, short[] sArr, int i13, int i14, Paint paint) {
        m5108a().drawVertices(vertexMode, i9, fArr, i10, fArr2, i11, iArr, i12, sArr, i13, i14, paint);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void enableZ() {
        m5108a().enableZ();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect rect) {
        boolean clipBounds = m5108a().getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final int getDensity() {
        return m5108a().getDensity();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        return m5108a().getDrawFilter();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final int getHeight() {
        return m5108a().getHeight();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix matrix) {
        m5108a().getMatrix(matrix);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        return m5108a().getMaximumBitmapHeight();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        return m5108a().getMaximumBitmapWidth();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        return m5108a().getSaveCount();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final int getWidth() {
        return m5108a().getWidth();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        return m5108a().isOpaque();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final boolean quickReject(float f3, float f10, float f11, float f12, Canvas.EdgeType edgeType) {
        return m5108a().quickReject(f3, f10, f11, f12, edgeType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void restore() {
        m5108a().restore();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void restoreToCount(int i9) {
        m5108a().restoreToCount(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void rotate(float f3) {
        m5108a().rotate(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final int save() {
        return m5108a().save();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final int saveLayer(float f3, float f10, float f11, float f12, Paint paint, int i9) {
        return m5108a().saveLayer(f3, f10, f11, f12, paint, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f3, float f10, float f11, float f12, int i9, int i10) {
        return m5108a().saveLayerAlpha(f3, f10, f11, f12, i9, i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void scale(float f3, float f10) {
        m5108a().scale(f3, f10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        m5108a().setBitmap(bitmap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void setDensity(int i9) {
        m5108a().setDensity(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        m5108a().setDrawFilter(drawFilter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        m5108a().setMatrix(matrix);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void skew(float f3, float f10) {
        m5108a().skew(f3, f10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.Canvas
    public final void translate(float f3, float f10) {
        m5108a().translate(f3, f10);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j3) {
        m5108a().drawColor(j3);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        m5108a().drawLines(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        m5108a().drawPatch(ninePatch, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        m5108a().drawPicture(picture, rectF);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        m5108a().drawPoints(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        return m5108a().clipOutRect(rect);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        return m5108a().clipPath(path);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        m5108a().drawPicture(picture, rect);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i9, PorterDuff.Mode mode) {
        m5108a().drawColor(i9, mode);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f3, float f10, float f11, float f12) {
        return m5108a().clipOutRect(f3, f10, f11, f12);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i9, BlendMode blendMode) {
        m5108a().drawColor(i9, blendMode);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i9, int i10, int i11, int i12) {
        return m5108a().clipOutRect(i9, i10, i11, i12);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j3, BlendMode blendMode) {
        m5108a().drawColor(j3, blendMode);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        m5108a().drawOval(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        m5108a().drawPosText(str, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        m5108a().drawRect(rect, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op) {
        return m5108a().clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        m5108a().drawRect(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f3, float f10, Paint paint) {
        m5108a().drawText(str, f3, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF) {
        return m5108a().quickReject(rectF);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF) {
        return m5108a().clipRect(rectF);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        m5108a().drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f3, float f10, Paint paint) {
        m5108a().drawRoundRect(rectF, f3, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i9, int i10, float f3, float f10, Paint paint) {
        m5108a().drawText(str, i9, i10, f3, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f3, float f10, Paint paint) {
        m5108a().drawTextOnPath(str, path, f3, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        return m5108a().saveLayer(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i9) {
        return m5108a().saveLayerAlpha(rectF, i9);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        return m5108a().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i9, int i10, float f3, float f10, Paint paint) {
        m5108a().drawText(charSequence, i9, i10, f3, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        return m5108a().quickReject(path, edgeType);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i9) {
        return m5108a().saveLayer(rectF, paint, i9);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i9, int i10) {
        return m5108a().saveLayerAlpha(rectF, i9, i10);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF, Region.Op op) {
        return m5108a().clipRect(rectF, op);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        return m5108a().quickReject(path);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f3, float f10, float f11, float f12, Paint paint) {
        return m5108a().saveLayer(f3, f10, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f3, float f10, float f11, float f12, int i9) {
        return m5108a().saveLayerAlpha(f3, f10, f11, f12, i9);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f3, float f10, float f11, float f12) {
        return m5108a().clipRect(f3, f10, f11, f12);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f3, float f10, boolean z9, Paint paint) {
        m5108a().drawArc(rectF, f3, f10, z9, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i9, int i10, int i11, int i12) {
        return m5108a().clipRect(i9, i10, i11, i12);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        return m5108a().quickReject(rectF, edgeType);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f3, float f10, float f11, float f12) {
        return m5108a().quickReject(f3, f10, f11, f12);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        m5108a().drawBitmap(bitmap, rect, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i9, int i10, int i11, int i12, float f3, float f10, boolean z9, Paint paint) {
        m5108a().drawTextRun(charSequence, i9, i10, i11, i12, f3, f10, z9, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        m5108a().drawBitmap(bitmap, rect, rect2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f3, float f10, Paint paint) {
        m5108a().drawBitmap(bitmap, f3, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i9, int i10, int i11, int i12, float f3, float f10, boolean z9, Paint paint) {
        m5108a().drawTextRun(measuredText, i9, i10, i11, i12, f3, f10, z9, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i9, int i10, int i11, int i12, int i13, int i14, boolean z9, Paint paint) {
        m5108a().drawBitmap(iArr, i9, i10, i11, i12, i13, i14, z9, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        m5108a().drawBitmap(bitmap, matrix, paint);
    }
}
