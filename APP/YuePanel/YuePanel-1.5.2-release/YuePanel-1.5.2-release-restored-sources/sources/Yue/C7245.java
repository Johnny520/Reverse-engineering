package Yue;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* JADX INFO: renamed from: Yue.ۥۡۧۥۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C7245 {

    /* JADX INFO: renamed from: ۥ */
    public OverScroller f2767;

    public C7245(Context context, Interpolator interpolator) {
        this.f2767 = interpolator != null ? new OverScroller(context, interpolator) : new OverScroller(context);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static C7245 m22696(Context context) {
        return m22697(context, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static C7245 m22697(Context context, Interpolator interpolator) {
        return new C7245(context, interpolator);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ */
    public void m3531() {
        this.f2767.abortAnimation();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟ */
    public boolean m3532() {
        return this.f2767.computeScrollOffset();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m22698(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f2767.fling(i, i2, i3, i4, i5, i6, i7, i8);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m22699(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.f2767.fling(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public float m22700() {
        return this.f2767.getCurrVelocity();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int m22701() {
        return this.f2767.getCurrX();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int m22702() {
        return this.f2767.getCurrY();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int m22703() {
        return this.f2767.getFinalX();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public int m22704() {
        return this.f2767.getFinalY();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean m22705() {
        return this.f2767.isFinished();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public boolean m22706() {
        return this.f2767.isOverScrolled();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m22707(int i, int i2, int i3) {
        this.f2767.notifyHorizontalEdgeReached(i, i2, i3);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m22708(int i, int i2, int i3) {
        this.f2767.notifyVerticalEdgeReached(i, i2, i3);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public boolean m22709(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.f2767.springBack(i, i2, i3, i4, i5, i6);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m22710(int i, int i2, int i3, int i4) {
        this.f2767.startScroll(i, i2, i3, i4);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m22711(int i, int i2, int i3, int i4, int i5) {
        this.f2767.startScroll(i, i2, i3, i4, i5);
    }
}
