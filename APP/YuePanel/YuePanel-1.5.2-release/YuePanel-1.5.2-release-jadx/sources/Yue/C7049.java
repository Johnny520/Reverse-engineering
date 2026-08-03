package Yue;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;

/* JADX INFO: renamed from: Yue.ۥۡۦۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7507({"SMAP\nRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rect.kt\nandroidx/core/graphics/RectKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,365:1\n344#1,3:366\n344#1,3:369\n257#1,6:372\n122#1,3:378\n132#1,3:381\n344#1,3:384\n344#1,3:387\n344#1,3:390\n1#2:393\n*S KotlinDebug\n*F\n+ 1 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n191#1:366,3\n192#1:369,3\n251#1:372,6\n268#1:378,3\n273#1:381,3\n313#1:384,3\n314#1:387,3\n358#1:390,3\n*E\n"})
public final class C7049 {
    @InterfaceC6399
    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: ۥ */
    public static final Rect m3338(@InterfaceC6399 Rect rect, @InterfaceC6399 Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        return rect3;
    }

    @InterfaceC6399
    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: ۥ۟ */
    public static final RectF m3339(@InterfaceC6399 RectF rectF, @InterfaceC6399 RectF rectF2) {
        RectF rectF3 = new RectF(rectF);
        rectF3.intersect(rectF2);
        return rectF3;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final float m21935(@InterfaceC6399 RectF rectF) {
        return rectF.left;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int m21936(@InterfaceC6399 Rect rect) {
        return rect.left;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final float m21937(@InterfaceC6399 RectF rectF) {
        return rectF.top;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int m21938(@InterfaceC6399 Rect rect) {
        return rect.top;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final float m21939(@InterfaceC6399 RectF rectF) {
        return rectF.right;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int m21940(@InterfaceC6399 Rect rect) {
        return rect.right;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final float m21941(@InterfaceC6399 RectF rectF) {
        return rectF.bottom;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int m21942(@InterfaceC6399 Rect rect) {
        return rect.bottom;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final boolean m21943(@InterfaceC6399 Rect rect, @InterfaceC6399 Point point) {
        return rect.contains(point.x, point.y);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final boolean m21944(@InterfaceC6399 RectF rectF, @InterfaceC6399 PointF pointF) {
        return rectF.contains(pointF.x, pointF.y);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final Rect m21945(@InterfaceC6399 Rect rect, int i) {
        Rect rect2 = new Rect(rect);
        int i2 = -i;
        rect2.offset(i2, i2);
        return rect2;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final Rect m21946(@InterfaceC6399 Rect rect, @InterfaceC6399 Point point) {
        Rect rect2 = new Rect(rect);
        rect2.offset(-point.x, -point.y);
        return rect2;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final RectF m21947(@InterfaceC6399 RectF rectF, float f) {
        RectF rectF2 = new RectF(rectF);
        float f2 = -f;
        rectF2.offset(f2, f2);
        return rectF2;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final RectF m21948(@InterfaceC6399 RectF rectF, @InterfaceC6399 PointF pointF) {
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(-pointF.x, -pointF.y);
        return rectF2;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final Region m21949(@InterfaceC6399 Rect rect, @InterfaceC6399 Rect rect2) {
        Region region = new Region(rect);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final Region m21950(@InterfaceC6399 RectF rectF, @InterfaceC6399 RectF rectF2) {
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        rectF2.roundOut(rect2);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final Rect m21951(@InterfaceC6399 Rect rect, @InterfaceC6399 Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.union(rect2);
        return rect3;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final RectF m21952(@InterfaceC6399 RectF rectF, @InterfaceC6399 RectF rectF2) {
        RectF rectF3 = new RectF(rectF);
        rectF3.union(rectF2);
        return rectF3;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final Rect m21953(@InterfaceC6399 Rect rect, int i) {
        Rect rect2 = new Rect(rect);
        rect2.offset(i, i);
        return rect2;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final Rect m21954(@InterfaceC6399 Rect rect, @InterfaceC6399 Point point) {
        Rect rect2 = new Rect(rect);
        rect2.offset(point.x, point.y);
        return rect2;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final Rect m21955(@InterfaceC6399 Rect rect, @InterfaceC6399 Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.union(rect2);
        return rect3;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final RectF m21956(@InterfaceC6399 RectF rectF, float f) {
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(f, f);
        return rectF2;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final RectF m21957(@InterfaceC6399 RectF rectF, @InterfaceC6399 PointF pointF) {
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(pointF.x, pointF.y);
        return rectF2;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final RectF m21958(@InterfaceC6399 RectF rectF, @InterfaceC6399 RectF rectF2) {
        RectF rectF3 = new RectF(rectF);
        rectF3.union(rectF2);
        return rectF3;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final Rect m21959(@InterfaceC6399 Rect rect, int i) {
        Rect rect2 = new Rect(rect);
        rect2.top *= i;
        rect2.left *= i;
        rect2.right *= i;
        rect2.bottom *= i;
        return rect2;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final RectF m21960(@InterfaceC6399 RectF rectF, float f) {
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f;
        rectF2.left *= f;
        rectF2.right *= f;
        rectF2.bottom *= f;
        return rectF2;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final RectF m21961(@InterfaceC6399 RectF rectF, int i) {
        float f = i;
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f;
        rectF2.left *= f;
        rectF2.right *= f;
        rectF2.bottom *= f;
        return rectF2;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final Rect m21962(@InterfaceC6399 RectF rectF) {
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return rect;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final RectF m21963(@InterfaceC6399 Rect rect) {
        return new RectF(rect);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final Region m21964(@InterfaceC6399 Rect rect) {
        return new Region(rect);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final Region m21965(@InterfaceC6399 RectF rectF) {
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return new Region(rect);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final RectF m21966(@InterfaceC6399 RectF rectF, @InterfaceC6399 Matrix matrix) {
        matrix.mapRect(rectF);
        return rectF;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final Region m21967(@InterfaceC6399 Rect rect, @InterfaceC6399 Rect rect2) {
        Region region = new Region(rect);
        region.op(rect2, Region.Op.XOR);
        return region;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final Region m21968(@InterfaceC6399 RectF rectF, @InterfaceC6399 RectF rectF2) {
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        rectF2.roundOut(rect2);
        region.op(rect2, Region.Op.XOR);
        return region;
    }
}
