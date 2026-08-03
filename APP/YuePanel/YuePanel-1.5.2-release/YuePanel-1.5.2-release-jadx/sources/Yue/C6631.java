package Yue;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: Yue.ۥۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6631 {

    /* JADX INFO: renamed from: Yue.ۥۡۤ$ۥ */
    @InterfaceC7113(26)
    public static class C1038 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static float[] m3114(Path path, float f) {
            return path.approximate(f);
        }
    }

    @InterfaceC6391
    @InterfaceC7113(26)
    /* JADX INFO: renamed from: ۥ */
    public static Collection<C6628> m3112(@InterfaceC6391 Path path) {
        return m3113(path, 0.5f);
    }

    @InterfaceC6391
    @InterfaceC7113(26)
    /* JADX INFO: renamed from: ۥ۟ */
    public static Collection<C6628> m3113(@InterfaceC6391 Path path, @InterfaceC4885(from = 0.0d) float f) {
        float[] fArrM3114 = C1038.m3114(path, f);
        int length = fArrM3114.length / 3;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 1; i < length; i++) {
            int i2 = i * 3;
            int i3 = (i - 1) * 3;
            float f2 = fArrM3114[i2];
            float f3 = fArrM3114[i2 + 1];
            float f4 = fArrM3114[i2 + 2];
            float f5 = fArrM3114[i3];
            float f6 = fArrM3114[i3 + 1];
            float f7 = fArrM3114[i3 + 2];
            if (f2 != f5 && (f3 != f6 || f4 != f7)) {
                arrayList.add(new C6628(new PointF(f6, f7), f5, new PointF(f3, f4), f2));
            }
        }
        return arrayList;
    }
}
