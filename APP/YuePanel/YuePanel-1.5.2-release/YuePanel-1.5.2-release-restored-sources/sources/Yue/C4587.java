package Yue;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4587 {

    /* JADX INFO: renamed from: ۥ */
    public final EdgeEffect f985;

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۤ$ۥ */
    @InterfaceC7113(21)
    public static class C0445 {
        private C0445() {
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m1547(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۤ$ۥ۟ */
    @InterfaceC7113(31)
    public static class C0446 {
        private C0446() {
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static EdgeEffect m1548(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static float m1549(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static float m13648(EdgeEffect edgeEffect, float f, float f2) {
            try {
                return edgeEffect.onPullDistance(f, f2);
            } catch (Throwable unused) {
                edgeEffect.onPull(f, f2);
                return 0.0f;
            }
        }
    }

    @Deprecated
    public C4587(Context context) {
        this.f985 = new EdgeEffect(context);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public static EdgeEffect m1545(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? C0446.m1548(context, attributeSet) : new EdgeEffect(context);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static float m13638(@InterfaceC6391 EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C0446.m1549(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m13639(@InterfaceC6391 EdgeEffect edgeEffect, float f, float f2) {
        C0445.m1547(edgeEffect, f, f2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static float m13640(@InterfaceC6391 EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C0446.m13648(edgeEffect, f, f2);
        }
        m13639(edgeEffect, f, f2);
        return f;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟ */
    public boolean m1546(Canvas canvas) {
        return this.f985.draw(canvas);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m13641() {
        this.f985.finish();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean m13642() {
        return this.f985.isFinished();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean m13643(int i) {
        this.f985.onAbsorb(i);
        return true;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean m13644(float f) {
        this.f985.onPull(f);
        return true;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean m13645(float f, float f2) {
        m13639(this.f985, f, f2);
        return true;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public boolean m13646() {
        this.f985.onRelease();
        return this.f985.isFinished();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m13647(int i, int i2) {
        this.f985.setSize(i, i2);
    }
}
