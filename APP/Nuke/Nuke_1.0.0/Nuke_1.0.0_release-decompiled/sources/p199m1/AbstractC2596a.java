package p199m1;

import org.xmlpull.v1.XmlPullParser;
import p205n1.AbstractC2687a;

/* JADX INFO: renamed from: m1.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2596a {

    /* JADX INFO: renamed from: a */
    public static final float[][] f8257a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: b */
    public static final float[][] f8258b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: c */
    public static final float[] f8259c = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: d */
    public static final float[][] f8260d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* JADX INFO: renamed from: a */
    public static boolean m4541a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* JADX INFO: renamed from: b */
    public static int m4542b(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f5 = (f2 + 16.0f) / 116.0f;
        float f6 = f2 > 8.0f ? f5 * f5 * f5 : f2 / 903.2963f;
        float f7 = f5 * f5 * f5;
        boolean z5 = f7 > 0.008856452f;
        float f8 = z5 ? f7 : ((f5 * 116.0f) - 16.0f) / 903.2963f;
        if (!z5) {
            f7 = ((f5 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f8259c;
        return AbstractC2687a.m4665a(f8 * fArr[0], f6 * fArr[1], f7 * fArr[2]);
    }

    /* JADX INFO: renamed from: c */
    public static float m4543c(int i5) {
        float f2 = i5 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX INFO: renamed from: d */
    public static float m4544d() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }
}
