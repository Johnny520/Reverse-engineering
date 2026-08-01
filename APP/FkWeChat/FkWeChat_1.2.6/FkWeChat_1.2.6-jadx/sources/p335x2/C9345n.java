package p335x2;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: renamed from: x2.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9345n {

    /* JADX INFO: renamed from: a */
    public static final C9345n f31950a = new C9345n();

    /* JADX INFO: renamed from: a */
    public final boolean m36436a(Canvas canvas, Path path) {
        return canvas.clipOutPath(path);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m36437b(Canvas canvas, float f10, float f11, float f12, float f13) {
        return canvas.clipOutRect(f10, f11, f12, f13);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m36438c(Canvas canvas, int i10, int i11, int i12, int i13) {
        return canvas.clipOutRect(i10, i11, i12, i13);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m36439d(Canvas canvas, Rect rect) {
        return canvas.clipOutRect(rect);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m36440e(Canvas canvas, RectF rectF) {
        return canvas.clipOutRect(rectF);
    }
}
