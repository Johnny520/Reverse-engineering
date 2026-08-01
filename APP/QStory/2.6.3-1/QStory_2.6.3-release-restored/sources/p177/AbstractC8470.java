package p177;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.android.p002dx.p005io.Opcodes;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.io.IOException;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p050.AbstractC7173;
import p216.AbstractC8700;

/* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8470 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ThreadLocal f21078 = new ThreadLocal();

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
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList m13455(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int color;
        int[] iArr;
        int i;
        int iM13458;
        float f;
        int i2;
        float fCbrt;
        TypedValue typedValue;
        ?? r0 = resources;
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
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == r4 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr3 = AbstractC8700.f21994;
                ?? ObtainAttributes = theme2 == null ? r0.obtainAttributes(attributeSet2, iArr3) : theme2.obtainStyledAttributes(attributeSet2, iArr3, i3, i3);
                int resourceId = ObtainAttributes.getResourceId(i3, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f21078;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    r0.getValue(resourceId, typedValue, r4);
                    int i5 = typedValue.type;
                    if (i5 < 28 || i5 > 31) {
                        try {
                            color = m13456(r0, r0.getXml(resourceId), theme2).getDefaultColor();
                        } catch (Exception unused) {
                            color = ObtainAttributes.getColor(i3, -65281);
                        }
                    } else {
                        color = ObtainAttributes.getColor(i3, -65281);
                    }
                    float f2 = ObtainAttributes.hasValue(r4) ? ObtainAttributes.getFloat(r4, 1.0f) : ObtainAttributes.hasValue(3) ? ObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                    ?? r16 = r4;
                    float f3 = (Build.VERSION.SDK_INT < 31 || !ObtainAttributes.hasValue(2)) ? ObtainAttributes.getFloat(4, -1.0f) : ObtainAttributes.getFloat(2, -1.0f);
                    ObtainAttributes.recycle();
                    int attributeCount = attributeSet2.getAttributeCount();
                    int[] iArr4 = new int[attributeCount];
                    int i6 = i3;
                    int i7 = i6;
                    while (i6 < attributeCount) {
                        int attributeNameResource = attributeSet2.getAttributeNameResource(i6);
                        if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != C0328R.attr.alpha && attributeNameResource != C0328R.attr.lStar) {
                            int i8 = i7 + 1;
                            if (!attributeSet2.getAttributeBooleanValue(i6, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr4[i7] = attributeNameResource;
                            i7 = i8;
                        }
                        i6++;
                    }
                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr4, i7);
                    float f4 = 100.0f;
                    boolean z = (f3 < 0.0f || f3 > 100.0f) ? false : r16 == true ? 1 : 0;
                    if (f2 != 1.0f || z) {
                        int iM12446 = AbstractC7173.m12446((int) ((Color.alpha(color) * f2) + 0.5f), 0, Opcodes.CONST_METHOD_TYPE);
                        if (z) {
                            C8472 c8472M13469 = C8472.m13469(color);
                            float f5 = c8472M13469.f21091;
                            float f6 = c8472M13469.f21090;
                            C8476 c8476 = C8476.f21102;
                            if (f6 < 1.0d || Math.round(f3) <= 0.0d || Math.round(f3) >= 100.0d) {
                                iArr = iArrTrimStateSet;
                                i = depth2;
                                iM13458 = AbstractC8471.m13458(f3);
                            } else {
                                float fMin = f5 < 0.0f ? 0.0f : Math.min(360.0f, f5);
                                float f7 = 0.0f;
                                float f8 = f6;
                                boolean z2 = r16 == true ? 1 : 0;
                                C8472 c8472 = null;
                                while (true) {
                                    if (Math.abs(f7 - f6) >= 0.4f) {
                                        float f9 = 1000.0f;
                                        float f10 = f4;
                                        float f11 = 0.0f;
                                        float f12 = 1000.0f;
                                        C8472 c84722 = null;
                                        while (true) {
                                            if (Math.abs(f11 - f10) <= 0.01f) {
                                                iArr = iArrTrimStateSet;
                                                i = depth2;
                                                f = f4;
                                                break;
                                            }
                                            f = f4;
                                            float f13 = ((f10 - f11) / 2.0f) + f11;
                                            iArr = iArrTrimStateSet;
                                            int iM13470 = C8472.m13468(f13, f8, fMin).m13470(C8476.f21102);
                                            float fM13457 = AbstractC8471.m13457(Color.red(iM13470));
                                            float fM134572 = AbstractC8471.m13457(Color.green(iM13470));
                                            float fM134573 = AbstractC8471.m13457(Color.blue(iM13470));
                                            float[] fArr = AbstractC8471.f21081[r16 == true ? 1 : 0];
                                            float f14 = ((fM134573 * fArr[2]) + ((fM134572 * fArr[r16 == true ? 1 : 0]) + (fM13457 * fArr[0]))) / f;
                                            if (f14 <= 0.008856452f) {
                                                fCbrt = f14 * 903.2963f;
                                                i2 = iM13470;
                                            } else {
                                                i2 = iM13470;
                                                fCbrt = (((float) Math.cbrt(f14)) * 116.0f) - 16.0f;
                                            }
                                            float fAbs = Math.abs(f3 - fCbrt);
                                            if (fAbs < 0.2f) {
                                                C8472 c8472M134692 = C8472.m13469(i2);
                                                C8472 c8472M13468 = C8472.m13468(c8472M134692.f21089, c8472M134692.f21090, fMin);
                                                float f15 = c8472M134692.f21088 - c8472M13468.f21088;
                                                float f16 = c8472M134692.f21087 - c8472M13468.f21087;
                                                float f17 = c8472M134692.f21086 - c8472M13468.f21086;
                                                i = depth2;
                                                float fPow = (float) (Math.pow(Math.sqrt((f17 * f17) + (f16 * f16) + (f15 * f15)), 0.63d) * 1.41d);
                                                if (fPow <= 1.0f) {
                                                    f12 = fPow;
                                                    f9 = fAbs;
                                                    c84722 = c8472M134692;
                                                }
                                            } else {
                                                i = depth2;
                                            }
                                            if (f9 == 0.0f && f12 == 0.0f) {
                                                break;
                                            }
                                            if (fCbrt < f3) {
                                                f11 = f13;
                                            } else {
                                                f10 = f13;
                                            }
                                            f4 = f;
                                            iArrTrimStateSet = iArr;
                                            depth2 = i;
                                        }
                                        C8472 c84723 = c84722;
                                        if (!z2) {
                                            if (c84723 == null) {
                                                f6 = f8;
                                            } else {
                                                c8472 = c84723;
                                                f7 = f8;
                                            }
                                            f8 = ((f6 - f7) / 2.0f) + f7;
                                            f4 = f;
                                            iArrTrimStateSet = iArr;
                                            depth2 = i;
                                        } else {
                                            if (c84723 != null) {
                                                iM13458 = c84723.m13470(c8476);
                                                break;
                                            }
                                            f8 = ((f6 - f7) / 2.0f) + f7;
                                            f4 = f;
                                            iArrTrimStateSet = iArr;
                                            depth2 = i;
                                            z2 = false;
                                        }
                                    } else {
                                        iArr = iArrTrimStateSet;
                                        i = depth2;
                                        iM13458 = c8472 == null ? AbstractC8471.m13458(f3) : c8472.m13470(c8476);
                                    }
                                }
                            }
                            color = iM13458;
                        } else {
                            iArr = iArrTrimStateSet;
                            i = depth2;
                        }
                        color = (16777215 & color) | (iM12446 << 24);
                    } else {
                        iArr = iArrTrimStateSet;
                        i = depth2;
                    }
                    int i9 = i4 + 1;
                    if (i9 > iArr2.length) {
                        int[] iArr5 = new int[i4 <= 4 ? 8 : i4 * 2];
                        System.arraycopy(iArr2, 0, iArr5, 0, i4);
                        iArr2 = iArr5;
                    }
                    iArr2[i4] = color;
                    if (i9 > objArr.length) {
                        Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i4 > 4 ? i4 * 2 : 8);
                        System.arraycopy(objArr, 0, objArr2, 0, i4);
                        objArr = objArr2;
                    }
                    objArr[i4] = iArr;
                    objArr = (int[][]) objArr;
                    attributeSet2 = attributeSet;
                    theme2 = theme;
                    i4 = i9;
                    r4 = r16 == true ? 1 : 0;
                    depth2 = i;
                    i3 = 0;
                    r0 = resources;
                }
            } else {
                int i10 = depth2;
                r0 = resources;
                attributeSet2 = attributeSet;
                theme2 = theme;
                r4 = r4 == true ? 1 : 0;
                depth2 = i10;
                i3 = 0;
            }
        }
        int[] iArr6 = new int[i4];
        int[][] iArr7 = new int[i4][];
        System.arraycopy(iArr2, 0, iArr6, 0, i4);
        System.arraycopy(objArr, 0, iArr7, 0, i4);
        return new ColorStateList(iArr7, iArr6);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static ColorStateList m13456(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m13455(resources, xmlResourceParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }
}
