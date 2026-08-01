package p199m1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.lang.reflect.Array;
import me.dartcv.nuke.R;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p086R.C1187a;
import p188k1.AbstractC2450a;

/* JADX INFO: renamed from: m1.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2597b {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f8261a = new ThreadLocal();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static ColorStateList m4545a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m4546b(resources, xmlResourceParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:163:0x0020 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:164:0x0020 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:176:0x017a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:178:0x017a */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList m4546b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        int i5;
        int[] iArr;
        int i6;
        int iM4542b;
        float f2;
        int i7;
        float fCbrt;
        TypedValue typedValue;
        ?? r02 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r4 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr2 = new int[20];
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == r4 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr3 = AbstractC2450a.f7912a;
                ?? ObtainAttributes = theme2 == null ? r02.obtainAttributes(attributeSet2, iArr3) : theme2.obtainStyledAttributes(attributeSet2, iArr3, i8, i8);
                int resourceId = ObtainAttributes.getResourceId(i8, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f8261a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    r02.getValue(resourceId, typedValue, r4);
                    int i10 = typedValue.type;
                    if (i10 < 28 || i10 > 31) {
                        try {
                            color = m4545a(r02, r02.getXml(resourceId), theme2).getDefaultColor();
                        } catch (Exception unused) {
                            color = ObtainAttributes.getColor(i8, -65281);
                        }
                    } else {
                        color = ObtainAttributes.getColor(i8, -65281);
                    }
                    float f5 = ObtainAttributes.hasValue(r4) ? ObtainAttributes.getFloat(r4, 1.0f) : ObtainAttributes.hasValue(3) ? ObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                    ?? r16 = r4;
                    float f6 = (Build.VERSION.SDK_INT < 31 || !ObtainAttributes.hasValue(2)) ? ObtainAttributes.getFloat(4, -1.0f) : ObtainAttributes.getFloat(2, -1.0f);
                    ObtainAttributes.recycle();
                    int attributeCount = attributeSet2.getAttributeCount();
                    int[] iArr4 = new int[attributeCount];
                    int i11 = i8;
                    int i12 = i11;
                    while (i11 < attributeCount) {
                        int attributeNameResource = attributeSet2.getAttributeNameResource(i11);
                        if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                            int i13 = i12 + 1;
                            if (!attributeSet2.getAttributeBooleanValue(i11, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr4[i12] = attributeNameResource;
                            i12 = i13;
                        }
                        i11++;
                    }
                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr4, i12);
                    float f7 = 100.0f;
                    boolean z5 = (f6 < 0.0f || f6 > 100.0f) ? false : r16 == true ? 1 : 0;
                    if (f5 != 1.0f || z5) {
                        int iAlpha = (int) ((Color.alpha(color) * f5) + 0.5f);
                        if (iAlpha < 0) {
                            i5 = 0;
                        } else {
                            i5 = 255;
                            if (iAlpha <= 255) {
                                i5 = iAlpha;
                            }
                        }
                        if (z5) {
                            C1187a c1187aM2235a = C1187a.m2235a(color);
                            float f8 = c1187aM2235a.f3880a;
                            float f9 = c1187aM2235a.f3881b;
                            C2599d c2599d = C2599d.f8263k;
                            if (f9 < 1.0d || Math.round(f6) <= 0.0d || Math.round(f6) >= 100.0d) {
                                iArr = iArrTrimStateSet;
                                i6 = depth2;
                                iM4542b = AbstractC2596a.m4542b(f6);
                            } else {
                                float fMin = f8 < 0.0f ? 0.0f : Math.min(360.0f, f8);
                                float f10 = 0.0f;
                                float f11 = f9;
                                boolean z6 = r16 == true ? 1 : 0;
                                C1187a c1187a = null;
                                while (true) {
                                    if (Math.abs(f10 - f9) >= 0.4f) {
                                        float f12 = 1000.0f;
                                        float f13 = f7;
                                        float f14 = 0.0f;
                                        float f15 = 1000.0f;
                                        C1187a c1187a2 = null;
                                        while (true) {
                                            if (Math.abs(f14 - f13) <= 0.01f) {
                                                iArr = iArrTrimStateSet;
                                                i6 = depth2;
                                                f2 = f7;
                                                break;
                                            }
                                            f2 = f7;
                                            float f16 = ((f13 - f14) / 2.0f) + f14;
                                            iArr = iArrTrimStateSet;
                                            int iM2238d = C1187a.m2236b(f16, f11, fMin).m2238d(C2599d.f8263k);
                                            float fM4543c = AbstractC2596a.m4543c(Color.red(iM2238d));
                                            float fM4543c2 = AbstractC2596a.m4543c(Color.green(iM2238d));
                                            float fM4543c3 = AbstractC2596a.m4543c(Color.blue(iM2238d));
                                            float[] fArr = AbstractC2596a.f8260d[r16 == true ? 1 : 0];
                                            float f17 = ((fM4543c3 * fArr[2]) + ((fM4543c2 * fArr[r16 == true ? 1 : 0]) + (fM4543c * fArr[0]))) / f2;
                                            if (f17 <= 0.008856452f) {
                                                fCbrt = f17 * 903.2963f;
                                                i7 = iM2238d;
                                            } else {
                                                i7 = iM2238d;
                                                fCbrt = (((float) Math.cbrt(f17)) * 116.0f) - 16.0f;
                                            }
                                            float fAbs = Math.abs(f6 - fCbrt);
                                            if (fAbs < 0.2f) {
                                                C1187a c1187aM2235a2 = C1187a.m2235a(i7);
                                                C1187a c1187aM2236b = C1187a.m2236b(c1187aM2235a2.f3882c, c1187aM2235a2.f3881b, fMin);
                                                float f18 = c1187aM2235a2.f3883d - c1187aM2236b.f3883d;
                                                float f19 = c1187aM2235a2.f3884e - c1187aM2236b.f3884e;
                                                float f20 = c1187aM2235a2.f3885f - c1187aM2236b.f3885f;
                                                i6 = depth2;
                                                float fPow = (float) (Math.pow(Math.sqrt((f20 * f20) + (f19 * f19) + (f18 * f18)), 0.63d) * 1.41d);
                                                if (fPow <= 1.0f) {
                                                    f15 = fPow;
                                                    f12 = fAbs;
                                                    c1187a2 = c1187aM2235a2;
                                                }
                                            } else {
                                                i6 = depth2;
                                            }
                                            if (f12 == 0.0f && f15 == 0.0f) {
                                                break;
                                            }
                                            if (fCbrt < f6) {
                                                f14 = f16;
                                            } else {
                                                f13 = f16;
                                            }
                                            f7 = f2;
                                            iArrTrimStateSet = iArr;
                                            depth2 = i6;
                                        }
                                        C1187a c1187a3 = c1187a2;
                                        if (!z6) {
                                            if (c1187a3 == null) {
                                                f9 = f11;
                                            } else {
                                                c1187a = c1187a3;
                                                f10 = f11;
                                            }
                                            f11 = ((f9 - f10) / 2.0f) + f10;
                                            f7 = f2;
                                            iArrTrimStateSet = iArr;
                                            depth2 = i6;
                                        } else {
                                            if (c1187a3 != null) {
                                                iM4542b = c1187a3.m2238d(c2599d);
                                                break;
                                            }
                                            f11 = ((f9 - f10) / 2.0f) + f10;
                                            f7 = f2;
                                            iArrTrimStateSet = iArr;
                                            depth2 = i6;
                                            z6 = false;
                                        }
                                    } else {
                                        iArr = iArrTrimStateSet;
                                        i6 = depth2;
                                        iM4542b = c1187a == null ? AbstractC2596a.m4542b(f6) : c1187a.m2238d(c2599d);
                                    }
                                }
                            }
                            color = iM4542b;
                        } else {
                            iArr = iArrTrimStateSet;
                            i6 = depth2;
                        }
                        color = (16777215 & color) | (i5 << 24);
                    } else {
                        iArr = iArrTrimStateSet;
                        i6 = depth2;
                    }
                    int i14 = i9 + 1;
                    if (i14 > iArr2.length) {
                        int[] iArr5 = new int[i9 <= 4 ? 8 : i9 * 2];
                        System.arraycopy(iArr2, 0, iArr5, 0, i9);
                        iArr2 = iArr5;
                    }
                    iArr2[i9] = color;
                    if (i14 > objArr.length) {
                        Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i9 > 4 ? i9 * 2 : 8);
                        System.arraycopy(objArr, 0, objArr2, 0, i9);
                        objArr = objArr2;
                    }
                    objArr[i9] = iArr;
                    objArr = (int[][]) objArr;
                    attributeSet2 = attributeSet;
                    theme2 = theme;
                    i9 = i14;
                    r4 = r16 == true ? 1 : 0;
                    depth2 = i6;
                    i8 = 0;
                    r02 = resources;
                }
            } else {
                int i15 = depth2;
                r02 = resources;
                attributeSet2 = attributeSet;
                theme2 = theme;
                r4 = r4 == true ? 1 : 0;
                depth2 = i15;
                i8 = 0;
            }
        }
        int[] iArr6 = new int[i9];
        int[][] iArr7 = new int[i9][];
        System.arraycopy(iArr2, 0, iArr6, 0, i9);
        System.arraycopy(objArr, 0, iArr7, 0, i9);
        return new ColorStateList(iArr7, iArr6);
    }
}
