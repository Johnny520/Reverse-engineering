package p335x2;

import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.fonts.Font;

/* JADX INFO: renamed from: x2.c0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9315c0 {

    /* JADX INFO: renamed from: a */
    public static final C9315c0 f31864a = new C9315c0();

    /* JADX INFO: renamed from: a */
    public final void m36289a(Canvas canvas, int[] iArr, int i10, float[] fArr, int i11, int i12, Font font, Paint paint) {
        canvas.drawGlyphs(iArr, i10, fArr, i11, i12, font, paint);
    }

    /* JADX INFO: renamed from: b */
    public final void m36290b(Canvas canvas, NinePatch ninePatch, Rect rect, Paint paint) {
        canvas.drawPatch(ninePatch, rect, paint);
    }

    /* JADX INFO: renamed from: c */
    public final void m36291c(Canvas canvas, NinePatch ninePatch, RectF rectF, Paint paint) {
        canvas.drawPatch(ninePatch, rectF, paint);
    }
}
