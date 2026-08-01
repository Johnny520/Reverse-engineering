package p335x2;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: renamed from: x2.y */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9367y {

    /* JADX INFO: renamed from: a */
    public static final C9367y f31954a = new C9367y();

    /* JADX INFO: renamed from: a */
    public final boolean m36473a(Canvas canvas, float f10, float f11, float f12, float f13) {
        return canvas.quickReject(f10, f11, f12, f13);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m36474b(Canvas canvas, Path path) {
        return canvas.quickReject(path);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m36475c(Canvas canvas, RectF rectF) {
        return canvas.quickReject(rectF);
    }
}
