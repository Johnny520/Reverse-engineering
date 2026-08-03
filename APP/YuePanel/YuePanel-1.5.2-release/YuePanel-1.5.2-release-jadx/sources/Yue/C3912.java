package Yue;

import Yue.C6989;
import Yue.InterfaceC7144;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.google.android.material.color.utilities.Contrast;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public final class C3912 {

    /* JADX INFO: renamed from: ۥ */
    public static final ThreadLocal<TypedValue> f570 = new ThreadLocal<>();

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public static ColorStateList m935(@InterfaceC6391 Resources resources, @InterfaceC6391 XmlPullParser xmlPullParser, @InterfaceC6490 Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m936(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟ */
    public static ColorStateList m936(@InterfaceC6391 Resources resources, @InterfaceC6391 XmlPullParser xmlPullParser, @InterfaceC6391 AttributeSet attributeSet, @InterfaceC6490 Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return m11142(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static TypedValue m11140() {
        ThreadLocal<TypedValue> threadLocal = f570;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static ColorStateList m11141(@InterfaceC6391 Resources resources, @InterfaceC8570 int i, @InterfaceC6490 Resources.Theme theme) {
        try {
            return m935(resources, resources.getXml(i), theme);
        } catch (Exception e) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static ColorStateList m11142(@InterfaceC6391 Resources resources, @InterfaceC6391 XmlPullParser xmlPullParser, @InterfaceC6391 AttributeSet attributeSet, @InterfaceC6490 Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        Resources resources2 = resources;
        int i = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArrM1990 = new int[20];
        int i2 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayM11145 = m11145(resources2, theme, attributeSet, C6989.C6997.f21100);
                int resourceId = typedArrayM11145.getResourceId(C6989.C6997.f21101, -1);
                if (resourceId == -1 || m11143(resources2, resourceId)) {
                    color = typedArrayM11145.getColor(C6989.C6997.f21101, -65281);
                } else {
                    try {
                        color = m935(resources2, resources2.getXml(resourceId), theme).getDefaultColor();
                    } catch (Exception unused) {
                        color = typedArrayM11145.getColor(C6989.C6997.f21101, -65281);
                    }
                }
                float f = 1.0f;
                if (typedArrayM11145.hasValue(C6989.C6997.f21102)) {
                    f = typedArrayM11145.getFloat(C6989.C6997.f21102, 1.0f);
                } else if (typedArrayM11145.hasValue(C6989.C6997.f21104)) {
                    f = typedArrayM11145.getFloat(C6989.C6997.f21104, 1.0f);
                }
                float f2 = (Build.VERSION.SDK_INT < 31 || !typedArrayM11145.hasValue(C6989.C6997.f21103)) ? typedArrayM11145.getFloat(C6989.C6997.f21105, -1.0f) : typedArrayM11145.getFloat(C6989.C6997.f21103, -1.0f);
                typedArrayM11145.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i3 = 0;
                for (int i4 = 0; i4 < attributeCount; i4++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i4);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != C6989.C1132.f2605 && attributeNameResource != C6989.C1132.f20963) {
                        int i5 = i3 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i4, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i3] = attributeNameResource;
                        i3 = i5;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr2, i3);
                iArrM1990 = C5223.m1990(iArrM1990, i2, m11144(color, f, f2));
                iArr = (int[][]) C5223.m15994(iArr, i2, iArrTrimStateSet);
                i2++;
            }
            i = 1;
            resources2 = resources;
        }
        int[] iArr3 = new int[i2];
        int[][] iArr4 = new int[i2][];
        System.arraycopy(iArrM1990, 0, iArr3, 0, i2);
        System.arraycopy(iArr, 0, iArr4, 0, i2);
        return new ColorStateList(iArr4, iArr3);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static boolean m11143(@InterfaceC6391 Resources resources, @InterfaceC3906 int i) {
        TypedValue typedValueM11140 = m11140();
        resources.getValue(i, typedValueM11140, true);
        int i2 = typedValueM11140.type;
        return i2 >= 28 && i2 <= 31;
    }

    @InterfaceC3897
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static int m11144(@InterfaceC3897 int i, @InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN) float f, @InterfaceC4885(from = 0.0d, m1796to = C3913.f572) float f2) {
        boolean z = f2 >= 0.0f && f2 <= 100.0f;
        if (f == 1.0f && !z) {
            return i;
        }
        int iM18838 = C6132.m18838((int) ((Color.alpha(i) * f) + 0.5f), 0, 255);
        if (z) {
            C3657 c3657M9987 = C3657.m9987(i);
            i = C3657.m9992(c3657M9987.m9997(), c3657M9987.m9996(), f2);
        }
        return (i & C8273.f24691) | (iM18838 << 24);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static TypedArray m11145(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
