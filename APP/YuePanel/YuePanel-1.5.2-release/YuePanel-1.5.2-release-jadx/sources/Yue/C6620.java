package Yue;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* JADX INFO: renamed from: Yue.ۥۣۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6620 {

    /* JADX INFO: renamed from: Yue.ۥۣۡۨ$ۥ */
    @InterfaceC7113(21)
    public static class C1033 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static Interpolator m3093(float f, float f2) {
            return new PathInterpolator(f, f2);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static Interpolator m3094(float f, float f2, float f3, float f4) {
            return new PathInterpolator(f, f2, f3, f4);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static Interpolator m21054(Path path) {
            return new PathInterpolator(path);
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public static Interpolator m3091(float f, float f2) {
        return C1033.m3093(f, f2);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟ */
    public static Interpolator m3092(float f, float f2, float f3, float f4) {
        return C1033.m3094(f, f2, f3, f4);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Interpolator m21053(@InterfaceC6391 Path path) {
        return C1033.m21054(path);
    }
}
