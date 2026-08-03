package Yue;

import android.graphics.Point;
import android.graphics.PointF;

/* JADX INFO: renamed from: Yue.ۥۣۡۤۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6698 {
    /* JADX INFO: renamed from: ۥ */
    public static final float m3176(@InterfaceC6399 PointF pointF) {
        return pointF.x;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int m3177(@InterfaceC6399 Point point) {
        return point.x;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final float m21358(@InterfaceC6399 PointF pointF) {
        return pointF.y;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int m21359(@InterfaceC6399 Point point) {
        return point.y;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final Point m21360(@InterfaceC6399 Point point, float f) {
        return new Point(Math.round(point.x / f), Math.round(point.y / f));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final PointF m21361(@InterfaceC6399 PointF pointF, float f) {
        return new PointF(pointF.x / f, pointF.y / f);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final Point m21362(@InterfaceC6399 Point point, int i) {
        Point point2 = new Point(point.x, point.y);
        int i2 = -i;
        point2.offset(i2, i2);
        return point2;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final Point m21363(@InterfaceC6399 Point point, @InterfaceC6399 Point point2) {
        Point point3 = new Point(point.x, point.y);
        point3.offset(-point2.x, -point2.y);
        return point3;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final PointF m21364(@InterfaceC6399 PointF pointF, float f) {
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        float f2 = -f;
        pointF2.offset(f2, f2);
        return pointF2;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final PointF m21365(@InterfaceC6399 PointF pointF, @InterfaceC6399 PointF pointF2) {
        PointF pointF3 = new PointF(pointF.x, pointF.y);
        pointF3.offset(-pointF2.x, -pointF2.y);
        return pointF3;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final Point m21366(@InterfaceC6399 Point point, int i) {
        Point point2 = new Point(point.x, point.y);
        point2.offset(i, i);
        return point2;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final Point m21367(@InterfaceC6399 Point point, @InterfaceC6399 Point point2) {
        Point point3 = new Point(point.x, point.y);
        point3.offset(point2.x, point2.y);
        return point3;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final PointF m21368(@InterfaceC6399 PointF pointF, float f) {
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        pointF2.offset(f, f);
        return pointF2;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final PointF m21369(@InterfaceC6399 PointF pointF, @InterfaceC6399 PointF pointF2) {
        PointF pointF3 = new PointF(pointF.x, pointF.y);
        pointF3.offset(pointF2.x, pointF2.y);
        return pointF3;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final Point m21370(@InterfaceC6399 Point point, float f) {
        return new Point(Math.round(point.x * f), Math.round(point.y * f));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final PointF m21371(@InterfaceC6399 PointF pointF, float f) {
        return new PointF(pointF.x * f, pointF.y * f);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final Point m21372(@InterfaceC6399 PointF pointF) {
        return new Point((int) pointF.x, (int) pointF.y);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final PointF m21373(@InterfaceC6399 Point point) {
        return new PointF(point);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final Point m21374(@InterfaceC6399 Point point) {
        return new Point(-point.x, -point.y);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final PointF m21375(@InterfaceC6399 PointF pointF) {
        return new PointF(-pointF.x, -pointF.y);
    }
}
