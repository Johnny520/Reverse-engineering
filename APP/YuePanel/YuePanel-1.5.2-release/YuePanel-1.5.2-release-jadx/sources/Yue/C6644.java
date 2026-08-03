package Yue;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: Yue.ۥۡۤ۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6644 extends AbstractC6623 {

    /* JADX INFO: renamed from: ۥ */
    public Path f2201;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6391
    public final Path f2202;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Matrix f17045;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6644() {
        Path path = new Path();
        this.f2202 = path;
        this.f17045 = new Matrix();
        path.lineTo(1.0f, 0.0f);
        this.f2201 = path;
    }

    /* JADX INFO: renamed from: ۥ */
    public static float m3118(float f, float f2) {
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    @Override // Yue.AbstractC6623
    @InterfaceC6391
    public Path getPath(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float fM3118 = m3118(f5, f6);
        double dAtan2 = Math.atan2(f6, f5);
        this.f17045.setScale(fM3118, fM3118);
        this.f17045.postRotate((float) Math.toDegrees(dAtan2));
        this.f17045.postTranslate(f, f2);
        Path path = new Path();
        this.f2202.transform(this.f17045, path);
        return path;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟ */
    public Path m3119() {
        return this.f2201;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m21245(@InterfaceC6391 Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f = fArr[0];
        float f2 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f3 = fArr[0];
        float f4 = fArr[1];
        if (f3 == f && f4 == f2) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.f17045.setTranslate(-f3, -f4);
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fM3118 = 1.0f / m3118(f5, f6);
        this.f17045.postScale(fM3118, fM3118);
        this.f17045.postRotate((float) Math.toDegrees(-Math.atan2(f6, f5)));
        path.transform(this.f17045, this.f2202);
        this.f2201 = path;
    }

    public C6644(@InterfaceC6391 Context context, @InterfaceC6391 AttributeSet attributeSet) {
        this.f2202 = new Path();
        this.f17045 = new Matrix();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7652.f23050);
        try {
            String strM25324 = C8021.m25324(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (strM25324 != null) {
                m21245(C6625.m21067(strM25324));
                return;
            }
            throw new RuntimeException("pathData must be supplied for patternPathMotion");
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public C6644(@InterfaceC6391 Path path) {
        this.f2202 = new Path();
        this.f17045 = new Matrix();
        m21245(path);
    }
}
