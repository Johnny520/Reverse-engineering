package p335x2;

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
import p030c3.AbstractC1314a;
import p215oc.C5706c;

/* JADX INFO: renamed from: x2.g1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9328g1 extends Canvas {

    /* JADX INFO: renamed from: a */
    public Canvas f31905a;

    /* JADX INFO: renamed from: a */
    public final Canvas m36331a() {
        Canvas canvas = this.f31905a;
        if (canvas != null) {
            return canvas;
        }
        AbstractC1314a.m5294d("Text drawing wrapper is missing a Canvas!");
        C5706c.m23089a();
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m36332b(Canvas canvas) {
        this.f31905a = canvas;
    }

    @Override // android.graphics.Canvas
    public boolean clipOutPath(Path path) {
        return C9345n.f31950a.m36436a(m36331a(), path);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(float f10, float f11, float f12, float f13) {
        return C9345n.f31950a.m36437b(m36331a(), f10, f11, f12, f13);
    }

    @Override // android.graphics.Canvas
    public boolean clipPath(Path path, Region.Op op) {
        return m36331a().clipPath(path, op);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(float f10, float f11, float f12, float f13, Region.Op op) {
        return m36331a().clipRect(f10, f11, f12, f13, op);
    }

    @Override // android.graphics.Canvas
    public void concat(Matrix matrix) {
        m36331a().concat(matrix);
    }

    @Override // android.graphics.Canvas
    public void disableZ() {
        C9359u.f31953a.m36457a(m36331a());
    }

    @Override // android.graphics.Canvas
    public void drawARGB(int i10, int i11, int i12, int i13) {
        m36331a().drawARGB(i10, i11, i12, i13);
    }

    @Override // android.graphics.Canvas
    public void drawArc(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, Paint paint) {
        m36331a().drawArc(f10, f11, f12, f13, f14, f15, z10, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(int[] iArr, int i10, int i11, float f10, float f11, int i12, int i13, boolean z10, Paint paint) {
        m36331a().drawBitmap(iArr, i10, i11, f10, f11, i12, i13, z10, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmapMesh(Bitmap bitmap, int i10, int i11, float[] fArr, int i12, int[] iArr, int i13, Paint paint) {
        m36331a().drawBitmapMesh(bitmap, i10, i11, fArr, i12, iArr, i13, paint);
    }

    @Override // android.graphics.Canvas
    public void drawCircle(float f10, float f11, float f12, Paint paint) {
        m36331a().drawCircle(f10, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(long j10) {
        C9359u.f31953a.m36459c(m36331a(), j10);
    }

    @Override // android.graphics.Canvas
    public void drawDoubleRoundRect(RectF rectF, float f10, float f11, RectF rectF2, float f12, float f13, Paint paint) {
        C9359u.f31953a.m36461e(m36331a(), rectF, f10, f11, rectF2, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    public void drawGlyphs(int[] iArr, int i10, float[] fArr, int i11, int i12, Font font, Paint paint) {
        C9315c0.f31864a.m36289a(m36331a(), iArr, i10, fArr, i11, i12, font, paint);
    }

    @Override // android.graphics.Canvas
    public void drawLine(float f10, float f11, float f12, float f13, Paint paint) {
        m36331a().drawLine(f10, f11, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    public void drawLines(float[] fArr, int i10, int i11, Paint paint) {
        m36331a().drawLines(fArr, i10, i11, paint);
    }

    @Override // android.graphics.Canvas
    public void drawOval(float f10, float f11, float f12, float f13, Paint paint) {
        m36331a().drawOval(f10, f11, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPaint(Paint paint) {
        m36331a().drawPaint(paint);
    }

    @Override // android.graphics.Canvas
    public void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        C9315c0.f31864a.m36290b(m36331a(), ninePatch, rect, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPath(Path path, Paint paint) {
        m36331a().drawPath(path, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture) {
        m36331a().drawPicture(picture);
    }

    @Override // android.graphics.Canvas
    public void drawPoint(float f10, float f11, Paint paint) {
        m36331a().drawPoint(f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(float[] fArr, int i10, int i11, Paint paint) {
        m36331a().drawPoints(fArr, i10, i11, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPosText(char[] cArr, int i10, int i11, float[] fArr, Paint paint) {
        m36331a().drawPosText(cArr, i10, i11, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRGB(int i10, int i11, int i12) {
        m36331a().drawRGB(i10, i11, i12);
    }

    @Override // android.graphics.Canvas
    public void drawRect(float f10, float f11, float f12, float f13, Paint paint) {
        m36331a().drawRect(f10, f11, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRenderNode(RenderNode renderNode) {
        C9359u.f31953a.m36463g(m36331a(), renderNode);
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(float f10, float f11, float f12, float f13, float f14, float f15, Paint paint) {
        m36331a().drawRoundRect(f10, f11, f12, f13, f14, f15, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(char[] cArr, int i10, int i11, float f10, float f11, Paint paint) {
        m36331a().drawText(cArr, i10, i11, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(char[] cArr, int i10, int i11, Path path, float f10, float f11, Paint paint) {
        m36331a().drawTextOnPath(cArr, i10, i11, path, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(char[] cArr, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, Paint paint) {
        C9343m.f31948a.m36434b(m36331a(), cArr, i10, i11, i12, i13, f10, f11, z10, paint);
    }

    @Override // android.graphics.Canvas
    public void drawVertices(Canvas.VertexMode vertexMode, int i10, float[] fArr, int i11, float[] fArr2, int i12, int[] iArr, int i13, short[] sArr, int i14, int i15, Paint paint) {
        m36331a().drawVertices(vertexMode, i10, fArr, i11, fArr2, i12, iArr, i13, sArr, i14, i15, paint);
    }

    @Override // android.graphics.Canvas
    public void enableZ() {
        C9359u.f31953a.m36465i(m36331a());
    }

    @Override // android.graphics.Canvas
    public boolean getClipBounds(Rect rect) {
        boolean clipBounds = m36331a().getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public int getDensity() {
        return m36331a().getDensity();
    }

    @Override // android.graphics.Canvas
    public DrawFilter getDrawFilter() {
        return m36331a().getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public int getHeight() {
        return m36331a().getHeight();
    }

    @Override // android.graphics.Canvas
    public void getMatrix(Matrix matrix) {
        m36331a().getMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapHeight() {
        return m36331a().getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapWidth() {
        return m36331a().getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public int getSaveCount() {
        return m36331a().getSaveCount();
    }

    @Override // android.graphics.Canvas
    public int getWidth() {
        return m36331a().getWidth();
    }

    @Override // android.graphics.Canvas
    public boolean isOpaque() {
        return m36331a().isOpaque();
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(float f10, float f11, float f12, float f13) {
        return C9367y.f31954a.m36473a(m36331a(), f10, f11, f12, f13);
    }

    @Override // android.graphics.Canvas
    public void restore() {
        m36331a().restore();
    }

    @Override // android.graphics.Canvas
    public void restoreToCount(int i10) {
        m36331a().restoreToCount(i10);
    }

    @Override // android.graphics.Canvas
    public void rotate(float f10) {
        m36331a().rotate(f10);
    }

    @Override // android.graphics.Canvas
    public int save() {
        return m36331a().save();
    }

    @Override // android.graphics.Canvas
    public int saveLayer(float f10, float f11, float f12, float f13, Paint paint, int i10) {
        return m36331a().saveLayer(f10, f11, f12, f13, paint, i10);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(float f10, float f11, float f12, float f13, int i10, int i11) {
        return m36331a().saveLayerAlpha(f10, f11, f12, f13, i10, i11);
    }

    @Override // android.graphics.Canvas
    public void scale(float f10, float f11) {
        m36331a().scale(f10, f11);
    }

    @Override // android.graphics.Canvas
    public void setBitmap(Bitmap bitmap) {
        m36331a().setBitmap(bitmap);
    }

    @Override // android.graphics.Canvas
    public void setDensity(int i10) {
        m36331a().setDensity(i10);
    }

    @Override // android.graphics.Canvas
    public void setDrawFilter(DrawFilter drawFilter) {
        m36331a().setDrawFilter(drawFilter);
    }

    @Override // android.graphics.Canvas
    public void setMatrix(Matrix matrix) {
        m36331a().setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public void skew(float f10, float f11) {
        m36331a().skew(f10, f11);
    }

    @Override // android.graphics.Canvas
    public void translate(float f10, float f11) {
        m36331a().translate(f10, f11);
    }

    @Override // android.graphics.Canvas
    public void drawLines(float[] fArr, Paint paint) {
        m36331a().drawLines(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture, RectF rectF) {
        m36331a().drawPicture(picture, rectF);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(float[] fArr, Paint paint) {
        m36331a().drawPoints(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public boolean clipPath(Path path) {
        return m36331a().clipPath(path);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture, Rect rect) {
        m36331a().drawPicture(picture, rect);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int i10) {
        m36331a().drawColor(i10);
    }

    @Override // android.graphics.Canvas
    public void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        C9315c0.f31864a.m36291c(m36331a(), ninePatch, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int i10, PorterDuff.Mode mode) {
        m36331a().drawColor(i10, mode);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int i10, BlendMode blendMode) {
        C9359u.f31953a.m36458b(m36331a(), i10, blendMode);
    }

    @Override // android.graphics.Canvas
    public void drawColor(long j10, BlendMode blendMode) {
        C9359u.f31953a.m36460d(m36331a(), j10, blendMode);
    }

    @Override // android.graphics.Canvas
    public void drawOval(RectF rectF, Paint paint) {
        m36331a().drawOval(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPosText(String str, float[] fArr, Paint paint) {
        m36331a().drawPosText(str, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRect(Rect rect, Paint paint) {
        m36331a().drawRect(rect, paint);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(Rect rect, Region.Op op) {
        return m36331a().clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public void drawRect(RectF rectF, Paint paint) {
        m36331a().drawRect(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(String str, float f10, float f11, Paint paint) {
        m36331a().drawText(str, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(Rect rect) {
        return C9345n.f31950a.m36439d(m36331a(), rect);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(RectF rectF) {
        return m36331a().clipRect(rectF);
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(RectF rectF, float f10, float f11, Paint paint) {
        m36331a().drawRoundRect(rectF, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(String str, int i10, int i11, float f10, float f11, Paint paint) {
        m36331a().drawText(str, i10, i11, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(String str, Path path, float f10, float f11, Paint paint) {
        m36331a().drawTextOnPath(str, path, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(RectF rectF) {
        return C9367y.f31954a.m36475c(m36331a(), rectF);
    }

    @Override // android.graphics.Canvas
    public int saveLayer(RectF rectF, Paint paint) {
        return m36331a().saveLayer(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(RectF rectF, int i10) {
        return m36331a().saveLayerAlpha(rectF, i10);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(RectF rectF) {
        return C9345n.f31950a.m36440e(m36331a(), rectF);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(Rect rect) {
        return m36331a().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public void drawText(CharSequence charSequence, int i10, int i11, float f10, float f11, Paint paint) {
        m36331a().drawText(charSequence, i10, i11, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        return m36331a().quickReject(path, edgeType);
    }

    @Override // android.graphics.Canvas
    public int saveLayer(RectF rectF, Paint paint, int i10) {
        return m36331a().saveLayer(rectF, paint, i10);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(RectF rectF, int i10, int i11) {
        return m36331a().saveLayerAlpha(rectF, i10, i11);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(int i10, int i11, int i12, int i13) {
        return C9345n.f31950a.m36438c(m36331a(), i10, i11, i12, i13);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(RectF rectF, Region.Op op) {
        return m36331a().clipRect(rectF, op);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(Path path) {
        return C9367y.f31954a.m36474b(m36331a(), path);
    }

    @Override // android.graphics.Canvas
    public int saveLayer(float f10, float f11, float f12, float f13, Paint paint) {
        return m36331a().saveLayer(f10, f11, f12, f13, paint);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(float f10, float f11, float f12, float f13, int i10) {
        return m36331a().saveLayerAlpha(f10, f11, f12, f13, i10);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(float f10, float f11, float f12, float f13) {
        return m36331a().clipRect(f10, f11, f12, f13);
    }

    @Override // android.graphics.Canvas
    public void drawArc(RectF rectF, float f10, float f11, boolean z10, Paint paint) {
        m36331a().drawArc(rectF, f10, f11, z10, paint);
    }

    @Override // android.graphics.Canvas
    public void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        C9359u.f31953a.m36462f(m36331a(), rectF, fArr, rectF2, fArr2, paint);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(float f10, float f11, float f12, float f13, Canvas.EdgeType edgeType) {
        return m36331a().quickReject(f10, f11, f12, f13, edgeType);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(int i10, int i11, int i12, int i13) {
        return m36331a().clipRect(i10, i11, i12, i13);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        return m36331a().quickReject(rectF, edgeType);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        m36331a().drawBitmap(bitmap, rect, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        m36331a().drawBitmap(bitmap, rect, rect2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, float f10, float f11, Paint paint) {
        m36331a().drawBitmap(bitmap, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(int[] iArr, int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, Paint paint) {
        m36331a().drawBitmap(iArr, i10, i11, i12, i13, i14, i15, z10, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(CharSequence charSequence, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, Paint paint) {
        C9343m.f31948a.m36433a(m36331a(), charSequence, i10, i11, i12, i13, f10, f11, z10, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        m36331a().drawBitmap(bitmap, matrix, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(MeasuredText measuredText, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, Paint paint) {
        C9359u.f31953a.m36464h(m36331a(), measuredText, i10, i11, i12, i13, f10, f11, z10, paint);
    }
}
