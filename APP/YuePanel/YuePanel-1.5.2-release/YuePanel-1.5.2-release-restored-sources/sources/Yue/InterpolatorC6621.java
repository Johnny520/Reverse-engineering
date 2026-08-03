package Yue;

import Yue.InterfaceC7144;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: Yue.ۥۣۡۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class InterpolatorC6621 implements Interpolator {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final float f16990 = 0.002f;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f16991 = 3000;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final double f16992 = 1.0E-5d;

    /* JADX INFO: renamed from: ۥ */
    public float[] f2182;

    /* JADX INFO: renamed from: ۥ۟ */
    public float[] f2183;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterpolatorC6621(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int length = this.f2182.length - 1;
        int i = 0;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f2182[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f2182;
        float f2 = fArr[length];
        float f3 = fArr[i];
        float f4 = f2 - f3;
        if (f4 == 0.0f) {
            return this.f2183[i];
        }
        float f5 = (f - f3) / f4;
        float[] fArr2 = this.f2183;
        float f6 = fArr2[i];
        return f6 + (f5 * (fArr2[length] - f6));
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m3095(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        m3096(path);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m3096(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int iMin = Math.min(f16991, ((int) (length / 0.002f)) + 1);
        if (iMin <= 0) {
            throw new IllegalArgumentException("The Path has a invalid length " + length);
        }
        this.f2182 = new float[iMin];
        this.f2183 = new float[iMin];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < iMin; i2++) {
            pathMeasure.getPosTan((i2 * length) / (iMin - 1), fArr, null);
            this.f2182[i2] = fArr[0];
            this.f2183[i2] = fArr[1];
        }
        if (Math.abs(this.f2182[0]) <= 1.0E-5d && Math.abs(this.f2183[0]) <= 1.0E-5d) {
            int i3 = iMin - 1;
            if (Math.abs(this.f2182[i3] - 1.0f) <= 1.0E-5d && Math.abs(this.f2183[i3] - 1.0f) <= 1.0E-5d) {
                float f = 0.0f;
                int i4 = 0;
                while (i < iMin) {
                    float[] fArr2 = this.f2182;
                    int i5 = i4 + 1;
                    float f2 = fArr2[i4];
                    if (f2 < f) {
                        throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f2);
                    }
                    fArr2[i] = f2;
                    i++;
                    f = f2;
                    i4 = i5;
                }
                if (pathMeasure.nextContour()) {
                    throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                }
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("The Path must start at (0,0) and end at (1,1) start: ");
        sb.append(this.f2182[0]);
        sb.append(",");
        sb.append(this.f2183[0]);
        sb.append(" end:");
        int i6 = iMin - 1;
        sb.append(this.f2182[i6]);
        sb.append(",");
        sb.append(this.f2183[i6]);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m21055(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        m3096(path);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m21056(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (C8021.m25329(xmlPullParser, "pathData")) {
            String strM25324 = C8021.m25324(typedArray, xmlPullParser, "pathData", 4);
            Path pathM21067 = C6625.m21067(strM25324);
            if (pathM21067 != null) {
                m3096(pathM21067);
                return;
            }
            throw new InflateException("The path is null, which is created from " + strM25324);
        }
        if (!C8021.m25329(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        }
        if (!C8021.m25329(xmlPullParser, "controlY1")) {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
        float fM25321 = C8021.m25321(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
        float fM253212 = C8021.m25321(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
        boolean zM25329 = C8021.m25329(xmlPullParser, "controlX2");
        if (zM25329 != C8021.m25329(xmlPullParser, "controlY2")) {
            throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
        }
        if (zM25329) {
            m3095(fM25321, fM253212, C8021.m25321(typedArray, xmlPullParser, "controlX2", 2, 0.0f), C8021.m25321(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
        } else {
            m21055(fM25321, fM253212);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public InterpolatorC6621(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray typedArrayM25330 = C8021.m25330(resources, theme, attributeSet, C3213.f4935);
        m21056(typedArrayM25330, xmlPullParser);
        typedArrayM25330.recycle();
    }
}
