package yyds;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.io.IOException;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: yyds.ᛸᲈᛴᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1909 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final ThreadLocal f9648 = new ThreadLocal();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v5, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList m3690(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        ?? r4;
        int i;
        int depth;
        int color;
        int i2;
        int[] iArr;
        AttributeSet attributeSet;
        int i3;
        int i4;
        int iM3462;
        float f;
        int i5;
        float fCbrt;
        TypedValue typedValue;
        ?? r0 = resources;
        Resources.Theme theme2 = theme;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            r4 = 1;
            i = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xmlResourceParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        int depth2 = xmlResourceParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr2 = new int[20];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int next2 = xmlResourceParser.next();
            if (next2 == r4 || ((depth = xmlResourceParser.getDepth()) < depth2 && next2 == 3)) {
                break;
            }
            if (next2 == i && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                int[] iArr3 = AbstractC1030.f4684;
                ?? ObtainAttributes = theme2 == null ? r0.obtainAttributes(attributeSetAsAttributeSet, iArr3) : theme2.obtainStyledAttributes(attributeSetAsAttributeSet, iArr3, i6, i6);
                int resourceId = ObtainAttributes.getResourceId(i6, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f9648;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    r0.getValue(resourceId, typedValue, r4);
                    int i8 = typedValue.type;
                    if (i8 < 28 || i8 > 31) {
                        try {
                            color = m3690(r0, r0.getXml(resourceId), theme2).getDefaultColor();
                        } catch (Exception unused) {
                            color = ObtainAttributes.getColor(i6, -65281);
                        }
                    } else {
                        color = ObtainAttributes.getColor(i6, -65281);
                    }
                    float f2 = ObtainAttributes.hasValue(r4) ? ObtainAttributes.getFloat(r4, 1.0f) : ObtainAttributes.hasValue(3) ? ObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                    ?? r16 = r4;
                    float f3 = (Build.VERSION.SDK_INT < 31 || !ObtainAttributes.hasValue(2)) ? ObtainAttributes.getFloat(4, -1.0f) : ObtainAttributes.getFloat(2, -1.0f);
                    ObtainAttributes.recycle();
                    int attributeCount = attributeSetAsAttributeSet.getAttributeCount();
                    int[] iArr4 = new int[attributeCount];
                    int i9 = i6;
                    int i10 = i9;
                    while (i9 < attributeCount) {
                        int attributeNameResource = attributeSetAsAttributeSet.getAttributeNameResource(i9);
                        if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                            int i11 = i10 + 1;
                            if (!attributeSetAsAttributeSet.getAttributeBooleanValue(i9, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr4[i10] = attributeNameResource;
                            i10 = i11;
                        }
                        i9++;
                    }
                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr4, i10);
                    float f4 = 100.0f;
                    boolean z = (f3 < 0.0f || f3 > 100.0f) ? false : r16 == true ? 1 : 0;
                    if (f2 != 1.0f || z) {
                        int iAlpha = (int) ((Color.alpha(color) * f2) + 0.5f);
                        if (iAlpha < 0) {
                            i2 = 0;
                        } else {
                            i2 = 255;
                            if (iAlpha <= 255) {
                                i2 = iAlpha;
                            }
                        }
                        if (z) {
                            C2543 c2543M4579 = C2543.m4579(color);
                            float f5 = c2543M4579.f12529;
                            float f6 = c2543M4579.f12530;
                            C1613 c1613 = C1613.f8220;
                            if (f6 < 1.0d || Math.round(f3) <= 0.0d || Math.round(f3) >= 100.0d) {
                                iArr = iArrTrimStateSet;
                                attributeSet = attributeSetAsAttributeSet;
                                i3 = depth2;
                                i4 = 2;
                                iM3462 = AbstractC1741.m3462(f3);
                            } else {
                                float fMin = f5 < 0.0f ? 0.0f : Math.min(360.0f, f5);
                                float f7 = f6;
                                float f8 = 0.0f;
                                boolean z2 = r16 == true ? 1 : 0;
                                C2543 c2543 = null;
                                while (true) {
                                    if (Math.abs(f8 - f6) >= 0.4f) {
                                        float f9 = 1000.0f;
                                        float f10 = f4;
                                        float f11 = 0.0f;
                                        float f12 = 1000.0f;
                                        C2543 c25432 = null;
                                        while (true) {
                                            if (Math.abs(f11 - f10) <= 0.01f) {
                                                iArr = iArrTrimStateSet;
                                                attributeSet = attributeSetAsAttributeSet;
                                                i3 = depth2;
                                                f = f4;
                                                i4 = 2;
                                                break;
                                            }
                                            f = f4;
                                            float f13 = ((f10 - f11) / 2.0f) + f11;
                                            iArr = iArrTrimStateSet;
                                            int iM4581 = C2543.m4580(f13, f7, fMin).m4581(C1613.f8220);
                                            float fM3472 = AbstractC1741.m3472(Color.red(iM4581));
                                            float fM34722 = AbstractC1741.m3472(Color.green(iM4581));
                                            float fM34723 = AbstractC1741.m3472(Color.blue(iM4581));
                                            float[] fArr = AbstractC1741.f8796[r16 == true ? 1 : 0];
                                            i4 = 2;
                                            float f14 = ((fM34723 * fArr[2]) + ((fM34722 * fArr[r16 == true ? 1 : 0]) + (fM3472 * fArr[0]))) / f;
                                            if (f14 <= 0.008856452f) {
                                                fCbrt = f14 * 903.2963f;
                                                i5 = iM4581;
                                            } else {
                                                i5 = iM4581;
                                                fCbrt = (((float) Math.cbrt(f14)) * 116.0f) - 16.0f;
                                            }
                                            float fAbs = Math.abs(f3 - fCbrt);
                                            if (fAbs < 0.2f) {
                                                C2543 c2543M45792 = C2543.m4579(i5);
                                                attributeSet = attributeSetAsAttributeSet;
                                                C2543 c2543M4580 = C2543.m4580(c2543M45792.f12531, c2543M45792.f12530, fMin);
                                                float f15 = c2543M45792.f12533 - c2543M4580.f12533;
                                                float f16 = c2543M45792.f12528 - c2543M4580.f12528;
                                                float f17 = c2543M45792.f12532 - c2543M4580.f12532;
                                                i3 = depth2;
                                                float fPow = (float) (Math.pow(Math.sqrt((f17 * f17) + (f16 * f16) + (f15 * f15)), 0.63d) * 1.41d);
                                                if (fPow <= 1.0f) {
                                                    f12 = fPow;
                                                    f9 = fAbs;
                                                    c25432 = c2543M45792;
                                                }
                                            } else {
                                                attributeSet = attributeSetAsAttributeSet;
                                                i3 = depth2;
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
                                            attributeSetAsAttributeSet = attributeSet;
                                            depth2 = i3;
                                        }
                                        C2543 c25433 = c25432;
                                        if (!z2) {
                                            if (c25433 == null) {
                                                f6 = f7;
                                            } else {
                                                c2543 = c25433;
                                                f8 = f7;
                                            }
                                            f7 = ((f6 - f8) / 2.0f) + f8;
                                            f4 = f;
                                            iArrTrimStateSet = iArr;
                                            attributeSetAsAttributeSet = attributeSet;
                                            depth2 = i3;
                                        } else {
                                            if (c25433 != null) {
                                                iM3462 = c25433.m4581(c1613);
                                                break;
                                            }
                                            f7 = ((f6 - f8) / 2.0f) + f8;
                                            f4 = f;
                                            iArrTrimStateSet = iArr;
                                            attributeSetAsAttributeSet = attributeSet;
                                            depth2 = i3;
                                            z2 = false;
                                        }
                                    } else {
                                        iArr = iArrTrimStateSet;
                                        attributeSet = attributeSetAsAttributeSet;
                                        i3 = depth2;
                                        i4 = 2;
                                        iM3462 = c2543 == null ? AbstractC1741.m3462(f3) : c2543.m4581(c1613);
                                    }
                                }
                            }
                            color = iM3462;
                        } else {
                            iArr = iArrTrimStateSet;
                            attributeSet = attributeSetAsAttributeSet;
                            i3 = depth2;
                            i4 = 2;
                        }
                        color = (16777215 & color) | (i2 << 24);
                    } else {
                        iArr = iArrTrimStateSet;
                        attributeSet = attributeSetAsAttributeSet;
                        i3 = depth2;
                        i4 = 2;
                    }
                    int i12 = i7 + 1;
                    if (i12 > iArr2.length) {
                        int[] iArr5 = new int[i7 <= 4 ? 8 : i7 * 2];
                        System.arraycopy(iArr2, 0, iArr5, 0, i7);
                        iArr2 = iArr5;
                    }
                    iArr2[i7] = color;
                    if (i12 > objArr.length) {
                        Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i7 > 4 ? i7 * 2 : 8);
                        System.arraycopy(objArr, 0, objArr2, 0, i7);
                        objArr = objArr2;
                    }
                    objArr[i7] = iArr;
                    objArr = (int[][]) objArr;
                    theme2 = theme;
                    i7 = i12;
                    r4 = r16 == true ? 1 : 0;
                    i = i4;
                    attributeSetAsAttributeSet = attributeSet;
                    depth2 = i3;
                    i6 = 0;
                    r0 = resources;
                }
            } else {
                AttributeSet attributeSet2 = attributeSetAsAttributeSet;
                int i13 = depth2;
                int i14 = i;
                r0 = resources;
                theme2 = theme;
                r4 = r4 == true ? 1 : 0;
                i = i14;
                attributeSetAsAttributeSet = attributeSet2;
                depth2 = i13;
                i6 = 0;
            }
        }
        int[] iArr6 = new int[i7];
        int[][] iArr7 = new int[i7][];
        System.arraycopy(iArr2, 0, iArr6, 0, i7);
        System.arraycopy(objArr, 0, iArr7, 0, i7);
        return new ColorStateList(iArr7, iArr6);
    }
}
