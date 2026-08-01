package p083q;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.p055lu.wxmask272.R;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;
import p078n.AbstractC0772a;

/* JADX INFO: renamed from: q.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0789c {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f2637a = new ThreadLocal();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:175:0x002f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:176:0x002f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:188:0x018f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:190:0x018f */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList m1463a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        int depth;
        int color;
        int i2;
        int[] iArr;
        AttributeSet attributeSet;
        int i3;
        int iM1457a;
        float f;
        int i4;
        float fCbrt;
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
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int next2 = xmlResourceParser.next();
            if (next2 == r4 || ((depth = xmlResourceParser.getDepth()) < depth2 && next2 == 3)) {
                break;
            }
            if (next2 == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                int[] iArr3 = AbstractC0772a.f2591a;
                ?? ObtainAttributes = theme2 == null ? r02.obtainAttributes(attributeSetAsAttributeSet, iArr3) : theme2.obtainStyledAttributes(attributeSetAsAttributeSet, iArr3, i5, i5);
                int resourceId = ObtainAttributes.getResourceId(i5, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f2637a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    r02.getValue(resourceId, typedValue, r4);
                    int i7 = typedValue.type;
                    if (i7 < 28 || i7 > 31) {
                        try {
                            color = m1463a(r02, r02.getXml(resourceId), theme2).getDefaultColor();
                        } catch (Exception unused) {
                            color = ObtainAttributes.getColor(i5, -65281);
                        }
                    } else {
                        color = ObtainAttributes.getColor(i5, -65281);
                    }
                    float f2 = ObtainAttributes.hasValue(r4) ? ObtainAttributes.getFloat(r4, 1.0f) : ObtainAttributes.hasValue(3) ? ObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                    ?? r16 = r4;
                    float f3 = (Build.VERSION.SDK_INT < 31 || !ObtainAttributes.hasValue(2)) ? ObtainAttributes.getFloat(4, -1.0f) : ObtainAttributes.getFloat(2, -1.0f);
                    ObtainAttributes.recycle();
                    int attributeCount = attributeSetAsAttributeSet.getAttributeCount();
                    int[] iArr4 = new int[attributeCount];
                    int i8 = i5;
                    int i9 = i8;
                    while (i8 < attributeCount) {
                        int attributeNameResource = attributeSetAsAttributeSet.getAttributeNameResource(i8);
                        if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                            int i10 = i9 + 1;
                            if (!attributeSetAsAttributeSet.getAttributeBooleanValue(i8, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr4[i9] = attributeNameResource;
                            i9 = i10;
                        }
                        i8++;
                    }
                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr4, i9);
                    float f4 = 100.0f;
                    boolean z2 = (f3 < 0.0f || f3 > 100.0f) ? false : r16 == true ? 1 : 0;
                    if (f2 != 1.0f || z2) {
                        int iAlpha = (int) ((Color.alpha(color) * f2) + 0.5f);
                        if (iAlpha < 0) {
                            i2 = 0;
                        } else {
                            i2 = 255;
                            if (iAlpha <= 255) {
                                i2 = iAlpha;
                            }
                        }
                        if (z2) {
                            C0787a c0787aM1454a = C0787a.m1454a(color);
                            C0800n c0800n = C0800n.f2657k;
                            float f5 = c0787aM1454a.f2625b;
                            if (f5 < 1.0d || Math.round(f3) <= 0.0d || Math.round(f3) >= 100.0d) {
                                iArr = iArrTrimStateSet;
                                attributeSet = attributeSetAsAttributeSet;
                                i3 = depth2;
                                iM1457a = AbstractC0788b.m1457a(f3);
                            } else {
                                float f6 = c0787aM1454a.f2624a;
                                float fMin = f6 < 0.0f ? 0.0f : Math.min(360.0f, f6);
                                float f7 = 0.0f;
                                float f8 = f5;
                                boolean z3 = r16 == true ? 1 : 0;
                                C0787a c0787a = null;
                                while (true) {
                                    if (Math.abs(f7 - f5) >= 0.4f) {
                                        float f9 = 1000.0f;
                                        float f10 = f4;
                                        float f11 = 0.0f;
                                        float f12 = 1000.0f;
                                        C0787a c0787a2 = null;
                                        while (true) {
                                            if (Math.abs(f11 - f10) <= 0.01f) {
                                                iArr = iArrTrimStateSet;
                                                attributeSet = attributeSetAsAttributeSet;
                                                i3 = depth2;
                                                f = f4;
                                                break;
                                            }
                                            f = f4;
                                            float f13 = ((f10 - f11) / 2.0f) + f11;
                                            iArr = iArrTrimStateSet;
                                            int iM1456c = C0787a.m1455b(f13, f8, fMin).m1456c(C0800n.f2657k);
                                            float fM1458b = AbstractC0788b.m1458b(Color.red(iM1456c));
                                            float fM1458b2 = AbstractC0788b.m1458b(Color.green(iM1456c));
                                            float fM1458b3 = AbstractC0788b.m1458b(Color.blue(iM1456c));
                                            float[] fArr = AbstractC0788b.f2633d[r16 == true ? 1 : 0];
                                            float f14 = ((fM1458b3 * fArr[2]) + ((fM1458b2 * fArr[r16 == true ? 1 : 0]) + (fM1458b * fArr[0]))) / f;
                                            if (f14 <= 0.008856452f) {
                                                fCbrt = f14 * 903.2963f;
                                                i4 = iM1456c;
                                            } else {
                                                i4 = iM1456c;
                                                fCbrt = (((float) Math.cbrt(f14)) * 116.0f) - 16.0f;
                                            }
                                            float fAbs = Math.abs(f3 - fCbrt);
                                            if (fAbs < 0.2f) {
                                                C0787a c0787aM1454a2 = C0787a.m1454a(i4);
                                                attributeSet = attributeSetAsAttributeSet;
                                                C0787a c0787aM1455b = C0787a.m1455b(c0787aM1454a2.f2626c, c0787aM1454a2.f2625b, fMin);
                                                float f15 = c0787aM1454a2.f2627d - c0787aM1455b.f2627d;
                                                float f16 = c0787aM1454a2.f2628e - c0787aM1455b.f2628e;
                                                float f17 = c0787aM1454a2.f2629f - c0787aM1455b.f2629f;
                                                i3 = depth2;
                                                float fPow = (float) (Math.pow(Math.sqrt((f17 * f17) + (f16 * f16) + (f15 * f15)), 0.63d) * 1.41d);
                                                if (fPow <= 1.0f) {
                                                    f12 = fPow;
                                                    f9 = fAbs;
                                                    c0787a2 = c0787aM1454a2;
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
                                        C0787a c0787a3 = c0787a2;
                                        if (!z3) {
                                            if (c0787a3 == null) {
                                                f5 = f8;
                                            } else {
                                                c0787a = c0787a3;
                                                f7 = f8;
                                            }
                                            f8 = ((f5 - f7) / 2.0f) + f7;
                                            f4 = f;
                                            iArrTrimStateSet = iArr;
                                            attributeSetAsAttributeSet = attributeSet;
                                            depth2 = i3;
                                        } else {
                                            if (c0787a3 != null) {
                                                iM1457a = c0787a3.m1456c(c0800n);
                                                break;
                                            }
                                            f8 = ((f5 - f7) / 2.0f) + f7;
                                            f4 = f;
                                            iArrTrimStateSet = iArr;
                                            attributeSetAsAttributeSet = attributeSet;
                                            depth2 = i3;
                                            z3 = false;
                                        }
                                    } else {
                                        iArr = iArrTrimStateSet;
                                        attributeSet = attributeSetAsAttributeSet;
                                        i3 = depth2;
                                        iM1457a = c0787a == null ? AbstractC0788b.m1457a(f3) : c0787a.m1456c(c0800n);
                                    }
                                }
                            }
                            color = iM1457a;
                        } else {
                            iArr = iArrTrimStateSet;
                            attributeSet = attributeSetAsAttributeSet;
                            i3 = depth2;
                        }
                        color = (16777215 & color) | (i2 << 24);
                    } else {
                        iArr = iArrTrimStateSet;
                        attributeSet = attributeSetAsAttributeSet;
                        i3 = depth2;
                    }
                    int i11 = i6 + 1;
                    if (i11 > iArr2.length) {
                        int[] iArr5 = new int[i6 <= 4 ? 8 : i6 * 2];
                        System.arraycopy(iArr2, 0, iArr5, 0, i6);
                        iArr2 = iArr5;
                    }
                    iArr2[i6] = color;
                    if (i11 > objArr.length) {
                        Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i6 > 4 ? i6 * 2 : 8);
                        System.arraycopy(objArr, 0, objArr2, 0, i6);
                        objArr = objArr2;
                    }
                    objArr[i6] = iArr;
                    objArr = (int[][]) objArr;
                    theme2 = theme;
                    i6 = i11;
                    r4 = r16 == true ? 1 : 0;
                    attributeSetAsAttributeSet = attributeSet;
                    depth2 = i3;
                    i5 = 0;
                    r02 = resources;
                }
            } else {
                AttributeSet attributeSet2 = attributeSetAsAttributeSet;
                int i12 = depth2;
                r02 = resources;
                theme2 = theme;
                r4 = r4 == true ? 1 : 0;
                attributeSetAsAttributeSet = attributeSet2;
                depth2 = i12;
                i5 = 0;
            }
        }
        int[] iArr6 = new int[i6];
        int[][] iArr7 = new int[i6][];
        System.arraycopy(iArr2, 0, iArr6, 0, i6);
        System.arraycopy(objArr, 0, iArr7, 0, i6);
        return new ColorStateList(iArr7, iArr6);
    }
}
