package p237q3;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: q3.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6242h {
    /* JADX INFO: renamed from: a */
    public static boolean m24618a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, boolean z10) {
        return !m24625h(xmlPullParser, str) ? z10 : typedArray.getBoolean(i10, z10);
    }

    /* JADX INFO: renamed from: b */
    public static int m24619b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, int i11) {
        return !m24625h(xmlPullParser, str) ? i11 : typedArray.getColor(i10, i11);
    }

    /* JADX INFO: renamed from: c */
    public static ColorStateList m24620c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i10) {
        if (!m24625h(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i10, typedValue);
        int i11 = typedValue.type;
        if (i11 != 2) {
            return (i11 < 28 || i11 > 31) ? AbstractC6237c.m24593d(typedArray.getResources(), typedArray.getResourceId(i10, 0), theme) : m24621d(typedValue);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i10 + ": " + typedValue);
    }

    /* JADX INFO: renamed from: d */
    public static ColorStateList m24621d(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    /* JADX INFO: renamed from: e */
    public static C6238d m24622e(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i10, int i11) {
        if (m24625h(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i10, typedValue);
            int i12 = typedValue.type;
            if (i12 >= 28 && i12 <= 31) {
                return C6238d.m24599b(typedValue.data);
            }
            C6238d c6238dM24602g = C6238d.m24602g(typedArray.getResources(), typedArray.getResourceId(i10, 0), theme);
            if (c6238dM24602g != null) {
                return c6238dM24602g;
            }
        }
        return C6238d.m24599b(i11);
    }

    /* JADX INFO: renamed from: f */
    public static float m24623f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, float f10) {
        return !m24625h(xmlPullParser, str) ? f10 : typedArray.getFloat(i10, f10);
    }

    /* JADX INFO: renamed from: g */
    public static int m24624g(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, int i11) {
        return !m24625h(xmlPullParser, str) ? i11 : typedArray.getInt(i10, i11);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m24625h(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* JADX INFO: renamed from: i */
    public static TypedArray m24626i(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
