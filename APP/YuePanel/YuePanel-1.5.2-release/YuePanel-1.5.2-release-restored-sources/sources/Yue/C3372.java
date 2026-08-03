package Yue;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۦۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3372 extends AbstractC6623 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final float f5404 = 0.0f;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final float f5405 = 70.0f;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final float f5406 = (float) Math.tan(Math.toRadians(35.0d));

    /* JADX INFO: renamed from: ۥ */
    public float f260;

    /* JADX INFO: renamed from: ۥ۟ */
    public float f261;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public float f5407;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public float f5408;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public float f5409;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public float f5410;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3372() {
        this.f260 = 0.0f;
        this.f261 = 0.0f;
        this.f5407 = 70.0f;
        this.f5408 = 0.0f;
        this.f5409 = 0.0f;
        this.f5410 = f5406;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static float m6917(float f) {
        if (f < 0.0f || f > 90.0f) {
            throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
        }
        return (float) Math.tan(Math.toRadians(f / 2.0f));
    }

    @Override // Yue.AbstractC6623
    @InterfaceC6391
    public Path getPath(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        Path path = new Path();
        path.moveTo(f, f2);
        float f8 = f3 - f;
        float f9 = f4 - f2;
        float f10 = (f8 * f8) + (f9 * f9);
        float f11 = (f + f3) / 2.0f;
        float f12 = (f2 + f4) / 2.0f;
        float f13 = 0.25f * f10;
        boolean z = f2 > f4;
        if (Math.abs(f8) < Math.abs(f9)) {
            float fAbs = Math.abs(f10 / (f9 * 2.0f));
            if (z) {
                f6 = fAbs + f4;
                f5 = f3;
            } else {
                f6 = fAbs + f2;
                f5 = f;
            }
            f7 = this.f5409;
        } else {
            float f14 = f10 / (f8 * 2.0f);
            if (z) {
                f6 = f2;
                f5 = f14 + f;
            } else {
                f5 = f3 - f14;
                f6 = f4;
            }
            f7 = this.f5408;
        }
        float f15 = f13 * f7 * f7;
        float f16 = f11 - f5;
        float f17 = f12 - f6;
        float f18 = (f16 * f16) + (f17 * f17);
        float f19 = this.f5410;
        float f20 = f13 * f19 * f19;
        if (f18 >= f15) {
            f15 = f18 > f20 ? f20 : 0.0f;
        }
        if (f15 != 0.0f) {
            float fSqrt = (float) Math.sqrt(f15 / f18);
            f5 = ((f5 - f11) * fSqrt) + f11;
            f6 = f12 + (fSqrt * (f6 - f12));
        }
        path.cubicTo((f + f5) / 2.0f, (f2 + f6) / 2.0f, (f5 + f3) / 2.0f, (f6 + f4) / 2.0f, f3, f4);
        return path;
    }

    /* JADX INFO: renamed from: ۥ */
    public float m459() {
        return this.f5407;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public float m460() {
        return this.f260;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public float m6918() {
        return this.f261;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m6919(float f) {
        this.f5407 = f;
        this.f5410 = m6917(f);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m6920(float f) {
        this.f260 = f;
        this.f5408 = m6917(f);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m6921(float f) {
        this.f261 = f;
        this.f5409 = m6917(f);
    }

    public C3372(@InterfaceC6391 Context context, @InterfaceC6391 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f260 = 0.0f;
        this.f261 = 0.0f;
        this.f5407 = 70.0f;
        this.f5408 = 0.0f;
        this.f5409 = 0.0f;
        this.f5410 = f5406;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7652.f23049);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        m6921(C8021.m25321(typedArrayObtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f));
        m6920(C8021.m25321(typedArrayObtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, 0.0f));
        m6919(C8021.m25321(typedArrayObtainStyledAttributes, xmlPullParser, "maximumAngle", 2, 70.0f));
        typedArrayObtainStyledAttributes.recycle();
    }
}
