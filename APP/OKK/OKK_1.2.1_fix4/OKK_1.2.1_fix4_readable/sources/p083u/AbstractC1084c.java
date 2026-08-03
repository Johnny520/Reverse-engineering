package p083u;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.abc.core.runtime.AbstractC0805P;
import java.lang.reflect.Array;
import org.luckypray.dexkit.C1031R;
import org.xmlpull.v1.XmlPullParserException;
import p080s.AbstractC1066a;

/* JADX INFO: renamed from: u.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1084c {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f4193a = new ThreadLocal();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList m2577a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        int depth;
        int color;
        int[] iArr;
        AttributeSet attributeSet;
        int i2;
        boolean z2;
        int iM2570d;
        float f2;
        float f3;
        float f4;
        float fCbrt;
        float f5;
        TypedValue typedValue;
        ?? r02 = resources;
        Resources.Theme theme2 = theme;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
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
        ?? r4 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr2 = new int[20];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int next2 = xmlResourceParser.next();
            if (next2 == r4 || ((depth = xmlResourceParser.getDepth()) < depth2 && next2 == 3)) {
                break;
            }
            if (next2 == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                int[] iArr3 = AbstractC1066a.f4090a;
                ?? ObtainAttributes = theme2 == null ? r02.obtainAttributes(attributeSetAsAttributeSet, iArr3) : theme2.obtainStyledAttributes(attributeSetAsAttributeSet, iArr3, i3, i3);
                int resourceId = ObtainAttributes.getResourceId(i3, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f4193a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    r02.getValue(resourceId, typedValue, r4);
                    int i5 = typedValue.type;
                    if (i5 < 28 || i5 > 31) {
                        try {
                            color = m2577a(r02, r02.getXml(resourceId), theme2).getDefaultColor();
                        } catch (Exception unused) {
                            color = ObtainAttributes.getColor(i3, -65281);
                        }
                    } else {
                        color = ObtainAttributes.getColor(i3, -65281);
                    }
                    float f6 = ObtainAttributes.hasValue(r4) ? ObtainAttributes.getFloat(r4, 1.0f) : ObtainAttributes.hasValue(3) ? ObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                    float f7 = (Build.VERSION.SDK_INT < 31 || !ObtainAttributes.hasValue(2)) ? ObtainAttributes.getFloat(4, -1.0f) : ObtainAttributes.getFloat(2, -1.0f);
                    ObtainAttributes.recycle();
                    int attributeCount = attributeSetAsAttributeSet.getAttributeCount();
                    int[] iArr4 = new int[attributeCount];
                    int i6 = i3;
                    for (int i7 = i6; i7 < attributeCount; i7++) {
                        int attributeNameResource = attributeSetAsAttributeSet.getAttributeNameResource(i7);
                        if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != C1031R.attr.alpha && attributeNameResource != C1031R.attr.lStar) {
                            int i8 = i6 + 1;
                            if (!attributeSetAsAttributeSet.getAttributeBooleanValue(i7, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr4[i6] = attributeNameResource;
                            i6 = i8;
                        }
                    }
                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr4, i6);
                    float f8 = 0.0f;
                    float f9 = 100.0f;
                    boolean z3 = f7 >= 0.0f && f7 <= 100.0f;
                    if (f6 != 1.0f || z3) {
                        int iM2043f = AbstractC0805P.m2043f((int) ((Color.alpha(color) * f6) + 0.5f), 0, 255);
                        if (z3) {
                            C1082a c1082aM2565a = C1082a.m2565a(color);
                            C1095n c1095n = C1095n.f4213k;
                            float f10 = c1082aM2565a.f4184b;
                            if (f10 < 1.0d || Math.round(f7) <= 0.0d || Math.round(f7) >= 100.0d) {
                                iArr = iArrTrimStateSet;
                                attributeSet = attributeSetAsAttributeSet;
                                i2 = depth2;
                                z2 = true;
                                iM2570d = AbstractC1083b.m2570d(f7);
                            } else {
                                float f11 = c1082aM2565a.f4183a;
                                float fMin = f11 < 0.0f ? 0.0f : Math.min(360.0f, f11);
                                float f12 = 0.0f;
                                float f13 = f10;
                                C1082a c1082a = null;
                                boolean z4 = true;
                                while (true) {
                                    if (Math.abs(f12 - f10) >= 0.4f) {
                                        float f14 = 1000.0f;
                                        float f15 = f8;
                                        float f16 = f9;
                                        float f17 = 1000.0f;
                                        C1082a c1082a2 = null;
                                        while (true) {
                                            if (Math.abs(f15 - f16) <= 0.01f) {
                                                attributeSet = attributeSetAsAttributeSet;
                                                i2 = depth2;
                                                f2 = fMin;
                                                f3 = f9;
                                                z2 = true;
                                                float f18 = f8;
                                                iArr = iArrTrimStateSet;
                                                f4 = f18;
                                                break;
                                            }
                                            float f19 = ((f16 - f15) / 2.0f) + f15;
                                            int iM2567c = C1082a.m2566b(f19, f13, fMin).m2567c(C1095n.f4213k);
                                            float fM2571e = AbstractC1083b.m2571e(Color.red(iM2567c));
                                            float fM2571e2 = AbstractC1083b.m2571e(Color.green(iM2567c));
                                            float fM2571e3 = AbstractC1083b.m2571e(Color.blue(iM2567c));
                                            z2 = true;
                                            float[] fArr = AbstractC1083b.f4192d[1];
                                            f3 = 100.0f;
                                            float f20 = ((fM2571e3 * fArr[2]) + ((fM2571e2 * fArr[1]) + (fM2571e * fArr[0]))) / 100.0f;
                                            if (f20 <= 0.008856452f) {
                                                fCbrt = f20 * 903.2963f;
                                                attributeSet = attributeSetAsAttributeSet;
                                                i2 = depth2;
                                            } else {
                                                attributeSet = attributeSetAsAttributeSet;
                                                i2 = depth2;
                                                fCbrt = (((float) Math.cbrt(f20)) * 116.0f) - 16.0f;
                                            }
                                            float fAbs = Math.abs(f7 - fCbrt);
                                            if (fAbs < 0.2f) {
                                                C1082a c1082aM2565a2 = C1082a.m2565a(iM2567c);
                                                C1082a c1082aM2566b = C1082a.m2566b(c1082aM2565a2.f4185c, c1082aM2565a2.f4184b, fMin);
                                                f5 = f19;
                                                float f21 = c1082aM2565a2.f4186d - c1082aM2566b.f4186d;
                                                f2 = fMin;
                                                float f22 = c1082aM2565a2.f4187e - c1082aM2566b.f4187e;
                                                float f23 = c1082aM2565a2.f4188f - c1082aM2566b.f4188f;
                                                double dSqrt = Math.sqrt((f23 * f23) + (f22 * f22) + (f21 * f21));
                                                iArr = iArrTrimStateSet;
                                                float fPow = (float) (Math.pow(dSqrt, 0.63d) * 1.41d);
                                                if (fPow <= 1.0f) {
                                                    f17 = fPow;
                                                    c1082a2 = c1082aM2565a2;
                                                    f14 = fAbs;
                                                }
                                            } else {
                                                f5 = f19;
                                                f2 = fMin;
                                                iArr = iArrTrimStateSet;
                                            }
                                            f4 = 0.0f;
                                            if (f14 == 0.0f && f17 == 0.0f) {
                                                break;
                                            }
                                            if (fCbrt < f7) {
                                                f15 = f5;
                                            } else {
                                                f16 = f5;
                                            }
                                            f9 = 100.0f;
                                            attributeSetAsAttributeSet = attributeSet;
                                            depth2 = i2;
                                            fMin = f2;
                                            int[] iArr5 = iArr;
                                            f8 = 0.0f;
                                            iArrTrimStateSet = iArr5;
                                        }
                                        C1082a c1082a3 = c1082a2;
                                        if (!z4) {
                                            if (c1082a3 == null) {
                                                f10 = f13;
                                            } else {
                                                c1082a = c1082a3;
                                                f12 = f13;
                                            }
                                            f13 = ((f10 - f12) / 2.0f) + f12;
                                            f9 = f3;
                                            attributeSetAsAttributeSet = attributeSet;
                                            depth2 = i2;
                                            fMin = f2;
                                        } else {
                                            if (c1082a3 != null) {
                                                iM2570d = c1082a3.m2567c(c1095n);
                                                break;
                                            }
                                            f13 = ((f10 - f12) / 2.0f) + f12;
                                            f9 = f3;
                                            attributeSetAsAttributeSet = attributeSet;
                                            depth2 = i2;
                                            fMin = f2;
                                            z4 = false;
                                        }
                                        int[] iArr6 = iArr;
                                        f8 = f4;
                                        iArrTrimStateSet = iArr6;
                                    } else {
                                        iArr = iArrTrimStateSet;
                                        attributeSet = attributeSetAsAttributeSet;
                                        i2 = depth2;
                                        z2 = true;
                                        iM2570d = c1082a == null ? AbstractC1083b.m2570d(f7) : c1082a.m2567c(c1095n);
                                    }
                                }
                            }
                            color = iM2570d;
                        } else {
                            iArr = iArrTrimStateSet;
                            attributeSet = attributeSetAsAttributeSet;
                            i2 = depth2;
                            z2 = true;
                        }
                        color = (16777215 & color) | (iM2043f << 24);
                    } else {
                        iArr = iArrTrimStateSet;
                        attributeSet = attributeSetAsAttributeSet;
                        i2 = depth2;
                        z2 = true;
                    }
                    int i9 = i4 + 1;
                    if (i9 > iArr2.length) {
                        int[] iArr7 = new int[i4 <= 4 ? 8 : i4 * 2];
                        System.arraycopy(iArr2, 0, iArr7, 0, i4);
                        iArr2 = iArr7;
                    }
                    iArr2[i4] = color;
                    if (i9 > objArr.length) {
                        Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i4 > 4 ? i4 * 2 : 8);
                        System.arraycopy(objArr, 0, objArr2, 0, i4);
                        objArr = objArr2;
                    }
                    objArr[i4] = iArr;
                    objArr = (int[][]) objArr;
                    theme2 = theme;
                    i4 = i9;
                    r4 = z2;
                    attributeSetAsAttributeSet = attributeSet;
                    depth2 = i2;
                    i3 = 0;
                    r02 = resources;
                }
            } else {
                AttributeSet attributeSet2 = attributeSetAsAttributeSet;
                int i10 = depth2;
                r02 = resources;
                theme2 = theme;
                r4 = r4 == true ? 1 : 0;
                attributeSetAsAttributeSet = attributeSet2;
                depth2 = i10;
                i3 = 0;
            }
        }
        int[] iArr8 = new int[i4];
        int[][] iArr9 = new int[i4][];
        System.arraycopy(iArr2, 0, iArr8, 0, i4);
        System.arraycopy(objArr, 0, iArr9, 0, i4);
        return new ColorStateList(iArr9, iArr8);
    }
}
