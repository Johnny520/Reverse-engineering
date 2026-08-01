package p237q3;

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
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p206o3.AbstractC5631a;
import p206o3.AbstractC5633c;
import p267s3.AbstractC7184a;

/* JADX INFO: renamed from: q3.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6237c {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f19367a = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static ColorStateList m24590a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m24591b(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX INFO: renamed from: b */
    public static ColorStateList m24591b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return m24594e(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    /* JADX INFO: renamed from: c */
    public static TypedValue m24592c() {
        ThreadLocal threadLocal = f19367a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* JADX INFO: renamed from: d */
    public static ColorStateList m24593d(Resources resources, int i10, Resources.Theme theme) {
        try {
            return m24590a(resources, resources.getXml(i10), theme);
        } catch (Exception e10) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static ColorStateList m24594e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        Resources resources2 = resources;
        int i10 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArrM24615a = new int[20];
        int i11 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i10 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayM24597h = m24597h(resources2, theme, attributeSet, AbstractC5633c.f17686a);
                int resourceId = typedArrayM24597h.getResourceId(AbstractC5633c.f17687b, -1);
                if (resourceId == -1 || m24595f(resources2, resourceId)) {
                    color = typedArrayM24597h.getColor(AbstractC5633c.f17687b, -65281);
                } else {
                    try {
                        color = m24590a(resources2, resources2.getXml(resourceId), theme).getDefaultColor();
                    } catch (Exception unused) {
                        color = typedArrayM24597h.getColor(AbstractC5633c.f17687b, -65281);
                    }
                }
                float f10 = 1.0f;
                if (typedArrayM24597h.hasValue(AbstractC5633c.f17688c)) {
                    f10 = typedArrayM24597h.getFloat(AbstractC5633c.f17688c, 1.0f);
                } else if (typedArrayM24597h.hasValue(AbstractC5633c.f17690e)) {
                    f10 = typedArrayM24597h.getFloat(AbstractC5633c.f17690e, 1.0f);
                }
                float f11 = (Build.VERSION.SDK_INT < 31 || !typedArrayM24597h.hasValue(AbstractC5633c.f17689d)) ? typedArrayM24597h.getFloat(AbstractC5633c.f17691f, -1.0f) : typedArrayM24597h.getFloat(AbstractC5633c.f17689d, -1.0f);
                typedArrayM24597h.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i12 = 0;
                for (int i13 = 0; i13 < attributeCount; i13++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i13);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != AbstractC5631a.f17640a && attributeNameResource != AbstractC5631a.f17641b) {
                        int i14 = i12 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i13, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i12] = attributeNameResource;
                        i12 = i14;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr2, i12);
                iArrM24615a = AbstractC6241g.m24615a(iArrM24615a, i11, m24596g(color, f10, f11));
                iArr = (int[][]) AbstractC6241g.m24616b(iArr, i11, iArrTrimStateSet);
                i11++;
            }
            i10 = 1;
            resources2 = resources;
        }
        int[] iArr3 = new int[i11];
        int[][] iArr4 = new int[i11][];
        System.arraycopy(iArrM24615a, 0, iArr3, 0, i11);
        System.arraycopy(iArr, 0, iArr4, 0, i11);
        return new ColorStateList(iArr4, iArr3);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m24595f(Resources resources, int i10) {
        TypedValue typedValueM24592c = m24592c();
        resources.getValue(i10, typedValueM24592c, true);
        int i11 = typedValueM24592c.type;
        return i11 >= 28 && i11 <= 31;
    }

    /* JADX INFO: renamed from: g */
    public static int m24596g(int i10, float f10, float f11) {
        boolean z10 = f11 >= 0.0f && f11 <= 100.0f;
        if (f10 == 1.0f && !z10) {
            return i10;
        }
        int iM28376a = AbstractC7184a.m28376a((int) ((Color.alpha(i10) * f10) + 0.5f), 0, 255);
        if (z10) {
            C6235a c6235aM24567c = C6235a.m24567c(i10);
            i10 = C6235a.m24571m(c6235aM24567c.m24577j(), c6235aM24567c.m24576i(), f11);
        }
        return (i10 & 16777215) | (iM28376a << 24);
    }

    /* JADX INFO: renamed from: h */
    public static TypedArray m24597h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
