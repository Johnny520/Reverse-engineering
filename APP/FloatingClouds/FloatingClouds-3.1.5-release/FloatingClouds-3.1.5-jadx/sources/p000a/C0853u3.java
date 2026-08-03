package p000a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.core.C1066R;
import java.io.IOException;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: a.u3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0853u3 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<TypedValue> f3352a = new ThreadLocal<>();

    /* JADX INFO: renamed from: a */
    public static ColorStateList m1977a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m1978b(resources, xmlResourceParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:169:0x0189 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:171:0x0189 */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0148  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList m1978b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        float f;
        int attributeCount;
        int i;
        float f2;
        Object[] objArr;
        int[] iArr;
        int i2;
        int iM2119F;
        float f3;
        int i3;
        float fCbrt;
        int i4;
        Resources resources2 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlResourceParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        boolean z = true;
        int depth2 = xmlResourceParser.getDepth() + 1;
        Object[] objArr2 = new int[20][];
        int[] iArr2 = new int[20];
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == z || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                int[] iArr3 = C1066R.styleable.ColorStateListItem;
                TypedArray typedArrayObtainAttributes = theme2 == null ? resources2.obtainAttributes(attributeSet2, iArr3) : theme2.obtainStyledAttributes(attributeSet2, iArr3, i5, i5);
                int resourceId = typedArrayObtainAttributes.getResourceId(C1066R.styleable.ColorStateListItem_android_color, -1);
                if (resourceId == -1) {
                    color = typedArrayObtainAttributes.getColor(C1066R.styleable.ColorStateListItem_android_color, -65281);
                    float f4 = 1.0f;
                    f = !typedArrayObtainAttributes.hasValue(C1066R.styleable.ColorStateListItem_android_alpha) ? typedArrayObtainAttributes.getFloat(C1066R.styleable.ColorStateListItem_android_alpha, 1.0f) : typedArrayObtainAttributes.hasValue(C1066R.styleable.ColorStateListItem_alpha) ? typedArrayObtainAttributes.getFloat(C1066R.styleable.ColorStateListItem_alpha, 1.0f) : 1.0f;
                    boolean z2 = z;
                    float f5 = (Build.VERSION.SDK_INT >= 31 || !typedArrayObtainAttributes.hasValue(C1066R.styleable.ColorStateListItem_android_lStar)) ? typedArrayObtainAttributes.getFloat(C1066R.styleable.ColorStateListItem_lStar, -1.0f) : typedArrayObtainAttributes.getFloat(C1066R.styleable.ColorStateListItem_android_lStar, -1.0f);
                    typedArrayObtainAttributes.recycle();
                    attributeCount = attributeSet2.getAttributeCount();
                    int[] iArr4 = new int[attributeCount];
                    i = i5;
                    int i7 = i;
                    while (i < attributeCount) {
                        float f6 = f4;
                        int attributeNameResource = attributeSet2.getAttributeNameResource(i);
                        if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != C1066R.attr.alpha && attributeNameResource != C1066R.attr.lStar) {
                            int i8 = i7 + 1;
                            if (!attributeSet2.getAttributeBooleanValue(i, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr4[i7] = attributeNameResource;
                            i7 = i8;
                        }
                        i++;
                        f4 = f6;
                    }
                    f2 = f4;
                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr4, i7);
                    float f7 = 100.0f;
                    objArr = (f5 >= 0.0f || f5 > 100.0f) ? null : z2 ? 1 : 0;
                    if (f == f2 || objArr != null) {
                        int iM1667j = C0726n9.m1667j((int) ((Color.alpha(color) * f) + 0.5f), 0, 255);
                        if (objArr == null) {
                            C0149I2 c0149i2M419a = C0149I2.m419a(color);
                            C0432Xg c0432Xg = C0432Xg.f1618k;
                            float f8 = c0149i2M419a.f522b;
                            if (f8 < 1.0d || Math.round(f5) <= 0.0d || Math.round(f5) >= 100.0d) {
                                iArr = iArrTrimStateSet;
                                i2 = depth2;
                                iM2119F = C0889w1.m2119F(f5);
                            } else {
                                float f9 = c0149i2M419a.f521a;
                                float fMin = f9 < 0.0f ? 0.0f : Math.min(360.0f, f9);
                                float f10 = 0.0f;
                                float f11 = f8;
                                Object[] objArr3 = z2 ? 1 : 0;
                                C0149I2 c0149i2 = null;
                                while (true) {
                                    if (Math.abs(f10 - f8) >= 0.4f) {
                                        float f12 = 1000.0f;
                                        float f13 = f7;
                                        float f14 = 0.0f;
                                        float f15 = 1000.0f;
                                        C0149I2 c0149i22 = null;
                                        while (true) {
                                            if (Math.abs(f14 - f13) <= 0.01f) {
                                                iArr = iArrTrimStateSet;
                                                i2 = depth2;
                                                f3 = f7;
                                                break;
                                            }
                                            f3 = f7;
                                            float f16 = ((f13 - f14) / 2.0f) + f14;
                                            iArr = iArrTrimStateSet;
                                            int iM421c = C0149I2.m420b(f16, f11, fMin).m421c(C0432Xg.f1618k);
                                            float fM2123J = C0889w1.m2123J(Color.red(iM421c));
                                            float fM2123J2 = C0889w1.m2123J(Color.green(iM421c));
                                            float fM2123J3 = C0889w1.m2123J(Color.blue(iM421c));
                                            float[] fArr = C0889w1.f3477e[z2 ? 1 : 0];
                                            float f17 = ((fM2123J3 * fArr[2]) + ((fM2123J2 * fArr[z2 ? 1 : 0]) + (fM2123J * fArr[0]))) / f3;
                                            if (f17 <= 0.008856452f) {
                                                fCbrt = f17 * 903.2963f;
                                                i3 = iM421c;
                                            } else {
                                                i3 = iM421c;
                                                fCbrt = (((float) Math.cbrt(f17)) * 116.0f) - 16.0f;
                                            }
                                            float fAbs = Math.abs(f5 - fCbrt);
                                            if (fAbs < 0.2f) {
                                                C0149I2 c0149i2M419a2 = C0149I2.m419a(i3);
                                                C0149I2 c0149i2M420b = C0149I2.m420b(c0149i2M419a2.f523c, c0149i2M419a2.f522b, fMin);
                                                float f18 = c0149i2M419a2.f524d - c0149i2M420b.f524d;
                                                float f19 = c0149i2M419a2.f525e - c0149i2M420b.f525e;
                                                float f20 = c0149i2M419a2.f526f - c0149i2M420b.f526f;
                                                i2 = depth2;
                                                float fPow = (float) (Math.pow(Math.sqrt((f20 * f20) + (f19 * f19) + (f18 * f18)), 0.63d) * 1.41d);
                                                if (fPow <= f2) {
                                                    f15 = fPow;
                                                    f12 = fAbs;
                                                    c0149i22 = c0149i2M419a2;
                                                }
                                            } else {
                                                i2 = depth2;
                                            }
                                            if (f12 == 0.0f && f15 == 0.0f) {
                                                break;
                                            }
                                            if (fCbrt < f5) {
                                                f14 = f16;
                                            } else {
                                                f13 = f16;
                                            }
                                            f7 = f3;
                                            iArrTrimStateSet = iArr;
                                            depth2 = i2;
                                        }
                                        C0149I2 c0149i23 = c0149i22;
                                        if (objArr3 == null) {
                                            if (c0149i23 == null) {
                                                f8 = f11;
                                            } else {
                                                c0149i2 = c0149i23;
                                                f10 = f11;
                                            }
                                            f11 = ((f8 - f10) / 2.0f) + f10;
                                            f7 = f3;
                                            iArrTrimStateSet = iArr;
                                            depth2 = i2;
                                        } else {
                                            if (c0149i23 != null) {
                                                iM2119F = c0149i23.m421c(c0432Xg);
                                                break;
                                            }
                                            f11 = ((f8 - f10) / 2.0f) + f10;
                                            f7 = f3;
                                            iArrTrimStateSet = iArr;
                                            depth2 = i2;
                                            objArr3 = null;
                                        }
                                    } else {
                                        iArr = iArrTrimStateSet;
                                        i2 = depth2;
                                        iM2119F = c0149i2 == null ? C0889w1.m2119F(f5) : c0149i2.m421c(c0432Xg);
                                    }
                                }
                            }
                            color = iM2119F;
                        } else {
                            iArr = iArrTrimStateSet;
                            i2 = depth2;
                        }
                        color = (16777215 & color) | (iM1667j << 24);
                    } else {
                        iArr = iArrTrimStateSet;
                        i2 = depth2;
                    }
                    i4 = i6 + 1;
                    if (i4 > iArr2.length) {
                        int[] iArr5 = new int[i6 <= 4 ? 8 : i6 * 2];
                        System.arraycopy(iArr2, 0, iArr5, 0, i6);
                        iArr2 = iArr5;
                    }
                    iArr2[i6] = color;
                    if (i4 > objArr2.length) {
                        Object[] objArr4 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), i6 > 4 ? i6 * 2 : 8);
                        System.arraycopy(objArr2, 0, objArr4, 0, i6);
                        objArr2 = objArr4;
                    }
                    objArr2[i6] = iArr;
                    objArr2 = (int[][]) objArr2;
                    attributeSet2 = attributeSet;
                    theme2 = theme;
                    i6 = i4;
                    z = z2 ? 1 : 0;
                    depth2 = i2;
                    i5 = 0;
                    resources2 = resources;
                } else {
                    ThreadLocal<TypedValue> threadLocal = f3352a;
                    TypedValue typedValue = threadLocal.get();
                    if (typedValue == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    }
                    resources2.getValue(resourceId, typedValue, z);
                    int i9 = typedValue.type;
                    if (i9 < 28 || i9 > 31) {
                        try {
                            color = m1977a(resources2, resources2.getXml(resourceId), theme2).getDefaultColor();
                        } catch (Exception unused) {
                            color = typedArrayObtainAttributes.getColor(C1066R.styleable.ColorStateListItem_android_color, -65281);
                        }
                    }
                    float f42 = 1.0f;
                    if (!typedArrayObtainAttributes.hasValue(C1066R.styleable.ColorStateListItem_android_alpha)) {
                    }
                    boolean z22 = z;
                    if (Build.VERSION.SDK_INT >= 31) {
                        typedArrayObtainAttributes.recycle();
                        attributeCount = attributeSet2.getAttributeCount();
                        int[] iArr42 = new int[attributeCount];
                        i = i5;
                        int i72 = i;
                        while (i < attributeCount) {
                        }
                        f2 = f42;
                        int[] iArrTrimStateSet2 = StateSet.trimStateSet(iArr42, i72);
                        float f72 = 100.0f;
                        if (f5 >= 0.0f) {
                            if (f == f2) {
                                int iM1667j2 = C0726n9.m1667j((int) ((Color.alpha(color) * f) + 0.5f), 0, 255);
                                if (objArr == null) {
                                }
                                color = (16777215 & color) | (iM1667j2 << 24);
                                i4 = i6 + 1;
                                if (i4 > iArr2.length) {
                                }
                                iArr2[i6] = color;
                                if (i4 > objArr2.length) {
                                }
                                objArr2[i6] = iArr;
                                objArr2 = (int[][]) objArr2;
                                attributeSet2 = attributeSet;
                                theme2 = theme;
                                i6 = i4;
                                z = z22 ? 1 : 0;
                                depth2 = i2;
                                i5 = 0;
                                resources2 = resources;
                            }
                        }
                    }
                }
            } else {
                int i10 = depth2;
                resources2 = resources;
                attributeSet2 = attributeSet;
                theme2 = theme;
                z = z ? 1 : 0;
                depth2 = i10;
                i5 = 0;
            }
        }
        int[] iArr6 = new int[i6];
        int[][] iArr7 = new int[i6][];
        System.arraycopy(iArr2, 0, iArr6, 0, i6);
        System.arraycopy(objArr2, 0, iArr7, 0, i6);
        return new ColorStateList(iArr7, iArr6);
    }
}
