package Yue;

import Yue.InterfaceC7144;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: Yue.ۥۣۢۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class C8021 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f3196 = "http://schemas.android.com/apk/res/android";

    /* JADX INFO: renamed from: ۥ */
    public static int m4037(@InterfaceC6391 Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static boolean m4038(@InterfaceC6391 TypedArray typedArray, @InterfaceC7662 int i, @InterfaceC7662 int i2, boolean z) {
        return typedArray.getBoolean(i, typedArray.getBoolean(i2, z));
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Drawable m25314(@InterfaceC6391 TypedArray typedArray, @InterfaceC7662 int i, @InterfaceC7662 int i2) {
        Drawable drawable = typedArray.getDrawable(i);
        return drawable == null ? typedArray.getDrawable(i2) : drawable;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static int m25315(@InterfaceC6391 TypedArray typedArray, @InterfaceC7662 int i, @InterfaceC7662 int i2, int i3) {
        return typedArray.getInt(i, typedArray.getInt(i2, i3));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static boolean m25316(@InterfaceC6391 TypedArray typedArray, @InterfaceC6391 XmlPullParser xmlPullParser, @InterfaceC6391 String str, @InterfaceC7662 int i, boolean z) {
        return !m25329(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    @InterfaceC3897
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static int m25317(@InterfaceC6391 TypedArray typedArray, @InterfaceC6391 XmlPullParser xmlPullParser, @InterfaceC6391 String str, @InterfaceC7662 int i, @InterfaceC3897 int i2) {
        return !m25329(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static ColorStateList m25318(@InterfaceC6391 TypedArray typedArray, @InterfaceC6391 XmlPullParser xmlPullParser, @InterfaceC6490 Resources.Theme theme, @InterfaceC6391 String str, @InterfaceC7662 int i) {
        if (!m25329(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        int i2 = typedValue.type;
        if (i2 != 2) {
            return (i2 < 28 || i2 > 31) ? C3912.m11141(typedArray.getResources(), typedArray.getResourceId(i, 0), theme) : m25319(typedValue);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i + ": " + typedValue);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static ColorStateList m25319(@InterfaceC6391 TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static C4057 m25320(@InterfaceC6391 TypedArray typedArray, @InterfaceC6391 XmlPullParser xmlPullParser, @InterfaceC6490 Resources.Theme theme, @InterfaceC6391 String str, @InterfaceC7662 int i, @InterfaceC3897 int i2) {
        if (m25329(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return C4057.m1012(typedValue.data);
            }
            C4057 c4057M11490 = C4057.m11490(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (c4057M11490 != null) {
                return c4057M11490;
            }
        }
        return C4057.m1012(i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static float m25321(@InterfaceC6391 TypedArray typedArray, @InterfaceC6391 XmlPullParser xmlPullParser, @InterfaceC6391 String str, @InterfaceC7662 int i, float f) {
        return !m25329(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static int m25322(@InterfaceC6391 TypedArray typedArray, @InterfaceC6391 XmlPullParser xmlPullParser, @InterfaceC6391 String str, @InterfaceC7662 int i, int i2) {
        return !m25329(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    @InterfaceC3261
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static int m25323(@InterfaceC6391 TypedArray typedArray, @InterfaceC6391 XmlPullParser xmlPullParser, @InterfaceC6391 String str, @InterfaceC7662 int i, @InterfaceC3261 int i2) {
        return !m25329(xmlPullParser, str) ? i2 : typedArray.getResourceId(i, i2);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static String m25324(@InterfaceC6391 TypedArray typedArray, @InterfaceC6391 XmlPullParser xmlPullParser, @InterfaceC6391 String str, @InterfaceC7662 int i) {
        if (m25329(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    @InterfaceC3261
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static int m25325(@InterfaceC6391 TypedArray typedArray, @InterfaceC7662 int i, @InterfaceC7662 int i2, @InterfaceC3261 int i3) {
        return typedArray.getResourceId(i, typedArray.getResourceId(i2, i3));
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static String m25326(@InterfaceC6391 TypedArray typedArray, @InterfaceC7662 int i, @InterfaceC7662 int i2) {
        String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static CharSequence m25327(@InterfaceC6391 TypedArray typedArray, @InterfaceC7662 int i, @InterfaceC7662 int i2) {
        CharSequence text = typedArray.getText(i);
        return text == null ? typedArray.getText(i2) : text;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static CharSequence[] m25328(@InterfaceC6391 TypedArray typedArray, @InterfaceC7662 int i, @InterfaceC7662 int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        return textArray == null ? typedArray.getTextArray(i2) : textArray;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static boolean m25329(@InterfaceC6391 XmlPullParser xmlPullParser, @InterfaceC6391 String str) {
        return xmlPullParser.getAttributeValue(f3196, str) != null;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static TypedArray m25330(@InterfaceC6391 Resources resources, @InterfaceC6490 Resources.Theme theme, @InterfaceC6391 AttributeSet attributeSet, @InterfaceC6391 int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static TypedValue m25331(@InterfaceC6391 TypedArray typedArray, @InterfaceC6391 XmlPullParser xmlPullParser, @InterfaceC6391 String str, int i) {
        if (m25329(xmlPullParser, str)) {
            return typedArray.peekValue(i);
        }
        return null;
    }
}
