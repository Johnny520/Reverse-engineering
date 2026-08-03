package Yue;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* JADX INFO: renamed from: Yue.ۥۣۡۨۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6626<T> extends Property<T, Float> {

    /* JADX INFO: renamed from: ۥ */
    public final Property<T, PointF> f2191;

    /* JADX INFO: renamed from: ۥ۟ */
    public final PathMeasure f2192;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final float f16995;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final float[] f16996;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final PointF f16997;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public float f16998;

    public C6626(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f16996 = new float[2];
        this.f16997 = new PointF();
        this.f2191 = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f2192 = pathMeasure;
        this.f16995 = pathMeasure.getLength();
    }

    /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // android.util.Property
    /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
    public Float get(T t) {
        return Float.valueOf(this.f16998);
    }

    /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
    @Override // android.util.Property
    /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
    public void set(T t, Float f) {
        this.f16998 = f.floatValue();
        this.f2192.getPosTan(this.f16995 * f.floatValue(), this.f16996, null);
        PointF pointF = this.f16997;
        float[] fArr = this.f16996;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f2191.set(t, pointF);
    }
}
