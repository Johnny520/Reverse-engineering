package p265s1;

import android.graphics.Rect;
import android.graphics.RectF;
import p121i3.C3187q;
import p250r1.C6457g;

/* JADX INFO: renamed from: s1.a3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7050a3 {
    /* JADX INFO: renamed from: a */
    public static final Rect m27753a(C3187q c3187q) {
        return new Rect(c3187q.m12068g(), c3187q.m12071j(), c3187q.m12069h(), c3187q.m12065d());
    }

    /* JADX INFO: renamed from: b */
    public static final Rect m27754b(C6457g c6457g) {
        return new Rect((int) c6457g.m25583l(), (int) c6457g.m25586o(), (int) c6457g.m25584m(), (int) c6457g.m25580i());
    }

    /* JADX INFO: renamed from: c */
    public static final RectF m27755c(C6457g c6457g) {
        return new RectF(c6457g.m25583l(), c6457g.m25586o(), c6457g.m25584m(), c6457g.m25580i());
    }

    /* JADX INFO: renamed from: d */
    public static final C3187q m27756d(Rect rect) {
        return new C3187q(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: renamed from: e */
    public static final C6457g m27757e(Rect rect) {
        return new C6457g(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: renamed from: f */
    public static final C6457g m27758f(RectF rectF) {
        return new C6457g(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
