package p000a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: a.Lf */
/* JADX INFO: loaded from: classes.dex */
public final class C0216Lf {
    /* JADX INFO: renamed from: a */
    public static C0948z3 m592a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        C0948z3 c0948z3M2238a;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new C0948z3(null, null, typedValue.data);
            }
            try {
                c0948z3M2238a = C0948z3.m2238a(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                c0948z3M2238a = null;
            }
            if (c0948z3M2238a != null) {
                return c0948z3M2238a;
            }
        }
        return new C0948z3(null, null, 0);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m593b(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* JADX INFO: renamed from: c */
    public static TypedArray m594c(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
