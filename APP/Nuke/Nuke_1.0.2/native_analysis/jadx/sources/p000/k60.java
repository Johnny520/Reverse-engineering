package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import nuke.module.wechat.p002ai.AIChatConfig;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k60 {

    /* JADX INFO: renamed from: a */
    public static final h22 f5352a = new h22(30);

    /* JADX INFO: renamed from: a */
    public static final void m2606a(cz2 cz2Var, qy2 qy2Var, InterfaceC0596px interfaceC0596px, int i) {
        Context context;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(1904307118);
        int i2 = (go0Var.m1980f(cz2Var) ? 4 : 2) | i | (go0Var.m1984h(qy2Var) ? 32 : 16);
        if (go0Var.m1958O(i2 & 1, (i2 & 19) != 18)) {
            if (Build.VERSION.SDK_INT >= 28) {
                go0Var.m1966W(-1009482584);
                context = (Context) go0Var.m1988j(AbstractC0646r7.f9411b);
                go0Var.m1994p(false);
            } else {
                go0Var.m1966W(-1009433480);
                go0Var.m1994p(false);
                context = null;
            }
            boolean zM1984h = go0Var.m1984h(qy2Var) | ((i2 & 14) == 4) | go0Var.m1984h(context);
            Object objM1956L = go0Var.m1956L();
            if (zM1984h || objM1956L == C0520nx.f7360a) {
                objM1956L = new C0444m0(qy2Var, context, cz2Var, 6);
                go0Var.m1981f0(objM1956L);
            }
            r00.m4303b(null, null, (in0) objM1956L, go0Var, 0, 3);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0016af(i, 4, cz2Var, qy2Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:269:0x0605, code lost:
    
        r2 = new p000.tx0(r21.m4625b(), r13 | r10.f13387b);
        r15.f12208a.put(r4, new java.lang.ref.WeakReference(r2));
        r0 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0500 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0602 A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2607b(final int i, long j, InterfaceC0596px interfaceC0596px, final int i2) {
        TypedValue typedValue;
        int i3;
        boolean z;
        Object obj;
        Object c0122d9;
        lw1 c0926yk;
        Object c0095cl;
        TypedArray typedArray;
        boolean z2;
        long jM4930b;
        int i4;
        int i5;
        char c;
        int i6;
        TypedArray typedArrayObtainStyledAttributes;
        int i7;
        TypedArray typedArrayObtainStyledAttributes2;
        int i8;
        int i9;
        int i10;
        ColorStateList colorStateListM5798a;
        final long j2 = j;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-1240244237);
        int i11 = (i2 & 6) == 0 ? i2 | (go0Var.m1976d(i) ? 4 : 2) : i2;
        if ((i2 & 48) == 0) {
            i11 |= go0Var.m1978e(j2) ? 32 : 16;
        }
        int i12 = i11;
        if (go0Var.m1958O(i12 & 1, (i12 & 19) != 18)) {
            tu2 tu2Var = AbstractC0646r7.f9411b;
            Context context = (Context) go0Var.m1988j(tu2Var);
            boolean zM1980f = go0Var.m1980f(context) | ((i12 & 14) == 4);
            Object objM1956L = go0Var.m1956L();
            if (zM1980f || objM1956L == C0520nx.f7360a) {
                objM1956L = Integer.valueOf(context.obtainStyledAttributes(new int[]{i}).getResourceId(0, -1));
                go0Var.m1981f0(objM1956L);
            }
            int iIntValue = ((Number) objM1956L).intValue();
            if (iIntValue == -1) {
                b62 b62VarM1996r = go0Var.m1996r();
                if (b62VarM1996r != null) {
                    final int i13 = 1;
                    b62VarM1996r.f616d = new mn0() { // from class: i60
                        @Override // p000.mn0
                        /* JADX INFO: renamed from: g */
                        public final Object mo12g(Object obj2, Object obj3) {
                            int i14 = i13;
                            a83 a83Var = a83.f116a;
                            int i15 = i2;
                            long j3 = j2;
                            int i16 = i;
                            InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj2;
                            ((Integer) obj3).getClass();
                            switch (i14) {
                                case 0:
                                    k60.m2607b(i16, j3, interfaceC0596px2, pp0.m3902N(i15 | 1));
                                    break;
                                default:
                                    k60.m2607b(i16, j3, interfaceC0596px2, pp0.m3902N(i15 | 1));
                                    break;
                            }
                            return a83Var;
                        }
                    };
                    return;
                }
                return;
            }
            Context context2 = (Context) go0Var.m1988j(tu2Var);
            Resources resources = (Resources) go0Var.m1988j(AbstractC0646r7.f9412c);
            l92 l92Var = (l92) go0Var.m1988j(AbstractC0646r7.f9414e);
            synchronized (l92Var) {
                typedValue = (TypedValue) l92Var.f5994a.m6022b(iIntValue);
                if (typedValue == null) {
                    typedValue = new TypedValue();
                    resources.getValue(iIntValue, typedValue, true);
                    zj1 zj1Var = l92Var.f5994a;
                    int iM6417d = zj1Var.m6417d(iIntValue);
                    Object[] objArr = zj1Var.f12751c;
                    Object obj2 = objArr[iM6417d];
                    zj1Var.f12750b[iM6417d] = iIntValue;
                    objArr[iM6417d] = typedValue;
                }
            }
            CharSequence charSequence = typedValue.string;
            if (charSequence == null || !pv2.m3999l0(charSequence, ".xml")) {
                i3 = i12;
                z = true;
                go0Var.m1966W(-1771643000);
                boolean zM1980f2 = go0Var.m1980f(context2.getTheme()) | go0Var.m1980f(charSequence) | go0Var.m1976d(iIntValue);
                Object objM1956L2 = go0Var.m1956L();
                if (zM1980f2 || objM1956L2 == C0520nx.f7360a) {
                    obj = null;
                    try {
                        Drawable drawable = resources.getDrawable(iIntValue, null);
                        drawable.getClass();
                        c0122d9 = new C0122d9(((BitmapDrawable) drawable).getBitmap());
                        go0Var.m1981f0(c0122d9);
                    } catch (Exception e) {
                        throw new C0594pv("Error attempting to load resource: " + ((Object) charSequence), e);
                    }
                } else {
                    c0122d9 = objM1956L2;
                    obj = null;
                }
                c0926yk = new C0926yk((C0122d9) c0122d9);
                go0Var.m1994p(false);
            } else {
                go0Var.m1966W(-1771798434);
                Resources.Theme theme = context2.getTheme();
                int i14 = typedValue.changingConfigurations;
                vx0 vx0Var = (vx0) go0Var.m1988j(AbstractC0646r7.f9413d);
                ux0 ux0Var = new ux0(theme, iIntValue);
                WeakReference weakReference = (WeakReference) vx0Var.f12208a.get(ux0Var);
                tx0 tx0Var = weakReference != null ? (tx0) weakReference.get() : null;
                if (tx0Var == null) {
                    XmlResourceParser xml = resources.getXml(iIntValue);
                    int next = xml.next();
                    while (next != 2 && next != 1) {
                        next = xml.next();
                    }
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found");
                    }
                    if (!t11.m5086l(xml.getName(), "vector")) {
                        C0676s.m4651j("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                        return;
                    }
                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                    C0917yb c0917yb = new C0917yb(xml);
                    int[] iArr = ci0.f1546b;
                    TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSetAsAttributeSet, iArr) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr, 0, 0);
                    c0917yb.m6240c(typedArrayObtainAttributes.getChangingConfigurations());
                    if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
                        typedArray = typedArrayObtainAttributes;
                        z2 = typedArray.getBoolean(5, false);
                    } else {
                        typedArray = typedArrayObtainAttributes;
                        z2 = false;
                    }
                    c0917yb.m6240c(typedArray.getChangingConfigurations());
                    float fM6239b = c0917yb.m6239b(typedArray, "viewportWidth", 7, 0.0f);
                    float fM6239b2 = c0917yb.m6239b(typedArray, "viewportHeight", 8, 0.0f);
                    if (fM6239b <= 0.0f) {
                        throw new XmlPullParserException(typedArray.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
                    }
                    if (fM6239b2 <= 0.0f) {
                        throw new XmlPullParserException(typedArray.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
                    }
                    float dimension = typedArray.getDimension(3, 0.0f);
                    c0917yb.m6240c(typedArray.getChangingConfigurations());
                    float dimension2 = typedArray.getDimension(2, 0.0f);
                    c0917yb.m6240c(typedArray.getChangingConfigurations());
                    if (typedArray.hasValue(1)) {
                        TypedValue typedValue2 = new TypedValue();
                        typedArray.getValue(1, typedValue2);
                        if (typedValue2.type == 2) {
                            jM4930b = C0363ju.f5217g;
                            i3 = i12;
                        } else {
                            if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
                                TypedValue typedValue3 = new TypedValue();
                                typedArray.getValue(1, typedValue3);
                                int i15 = typedValue3.type;
                                if (i15 == 2) {
                                    throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue3);
                                }
                                if (i15 < 28 || i15 > 31) {
                                    Resources resources2 = typedArray.getResources();
                                    i3 = i12;
                                    int resourceId = typedArray.getResourceId(1, 0);
                                    ThreadLocal threadLocal = AbstractC0823vu.f12172a;
                                    try {
                                        colorStateListM5798a = AbstractC0823vu.m5798a(resources2, resources2.getXml(resourceId), theme);
                                    } catch (Exception e2) {
                                        Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
                                        colorStateListM5798a = null;
                                    }
                                } else {
                                    colorStateListM5798a = ColorStateList.valueOf(typedValue3.data);
                                    i3 = i12;
                                }
                                c0917yb.m6240c(typedArray.getChangingConfigurations());
                                jM4930b = colorStateListM5798a == null ? sp0.m4930b(colorStateListM5798a.getDefaultColor()) : C0363ju.f5217g;
                            } else {
                                i3 = i12;
                            }
                            colorStateListM5798a = null;
                            c0917yb.m6240c(typedArray.getChangingConfigurations());
                            if (colorStateListM5798a == null) {
                            }
                        }
                    } else {
                        i3 = i12;
                        jM4930b = C0363ju.f5217g;
                    }
                    long j3 = jM4930b;
                    int i16 = typedArray.getInt(6, -1);
                    c0917yb.m6240c(typedArray.getChangingConfigurations());
                    if (i16 == -1) {
                        i4 = 5;
                        float f = dimension / resources.getDisplayMetrics().density;
                        float f2 = dimension2 / resources.getDisplayMetrics().density;
                        typedArray.recycle();
                        rx0 rx0Var = new rx0(null, f, f2, fM6239b, fM6239b2, j3, i4, z2, 1);
                        int i17 = 0;
                        while (true) {
                            if (xml.getEventType() == 1) {
                                z = (xml.getDepth() < 1 && xml.getEventType() == 3) ? true : true;
                                List listM2435a = be0.f819h;
                                XmlPullParser xmlPullParser = c0917yb.f13386a;
                                C0337j5 c0337j5 = c0917yb.f13388c;
                                int i18 = i17;
                                int eventType = xmlPullParser.getEventType();
                                XmlResourceParser xmlResourceParser = xml;
                                if (eventType != 2) {
                                    if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                                        int i19 = i18 + 1;
                                        for (int i20 = 0; i20 < i19; i20++) {
                                            ArrayList arrayList = rx0Var.f9796i;
                                            if (rx0Var.f9798k) {
                                                kz0.m2764b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                            }
                                            qx0 qx0Var = (qx0) arrayList.remove(arrayList.size() - 1);
                                            ((qx0) arrayList.get(arrayList.size() - 1)).f9282j.add(new r93(qx0Var.f9273a, qx0Var.f9274b, qx0Var.f9275c, qx0Var.f9276d, qx0Var.f9277e, qx0Var.f9278f, qx0Var.f9279g, qx0Var.f9280h, qx0Var.f9281i, qx0Var.f9282j));
                                        }
                                        i5 = i14;
                                        i17 = 0;
                                        c = '\t';
                                    }
                                    i5 = i14;
                                    c = '\t';
                                    i17 = i18;
                                } else {
                                    String name = xmlPullParser.getName();
                                    if (name != null) {
                                        int iHashCode = name.hashCode();
                                        i5 = i14;
                                        if (iHashCode == -1649314686) {
                                            c = '\t';
                                            if (name.equals("clip-path")) {
                                                int[] iArr2 = ci0.f1549e;
                                                if (theme == null) {
                                                    typedArrayObtainStyledAttributes = resources.obtainAttributes(attributeSetAsAttributeSet, iArr2);
                                                    i6 = 0;
                                                } else {
                                                    i6 = 0;
                                                    typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr2, 0, 0);
                                                }
                                                c0917yb.m6240c(typedArrayObtainStyledAttributes.getChangingConfigurations());
                                                String string = typedArrayObtainStyledAttributes.getString(i6);
                                                c0917yb.m6240c(typedArrayObtainStyledAttributes.getChangingConfigurations());
                                                String str = string == null ? "" : string;
                                                String string2 = typedArrayObtainStyledAttributes.getString(1);
                                                c0917yb.m6240c(typedArrayObtainStyledAttributes.getChangingConfigurations());
                                                if (string2 == null) {
                                                    int i21 = s93.f9998a;
                                                } else {
                                                    listM2435a = C0337j5.m2435a(c0337j5, string2);
                                                }
                                                List list = listM2435a;
                                                typedArrayObtainStyledAttributes.recycle();
                                                if (rx0Var.f9798k) {
                                                    kz0.m2764b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                                }
                                                rx0Var.f9796i.add(new qx0(str, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, list, AIChatConfig.DefaultMaxTokens));
                                                i17 = i18 + 1;
                                            } else {
                                                i17 = i18;
                                            }
                                        } else if (iHashCode != 3433509) {
                                            if (iHashCode == 98629247 && name.equals("group")) {
                                                int[] iArr3 = ci0.f1547c;
                                                TypedArray typedArrayObtainAttributes2 = theme == null ? resources.obtainAttributes(attributeSetAsAttributeSet, iArr3) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr3, 0, 0);
                                                c0917yb.m6240c(typedArrayObtainAttributes2.getChangingConfigurations());
                                                float fM6239b3 = c0917yb.m6239b(typedArrayObtainAttributes2, "rotation", 5, 0.0f);
                                                float f3 = typedArrayObtainAttributes2.getFloat(1, 0.0f);
                                                c0917yb.m6240c(typedArrayObtainAttributes2.getChangingConfigurations());
                                                float f4 = typedArrayObtainAttributes2.getFloat(2, 0.0f);
                                                c0917yb.m6240c(typedArrayObtainAttributes2.getChangingConfigurations());
                                                float fM6239b4 = c0917yb.m6239b(typedArrayObtainAttributes2, "scaleX", 3, 1.0f);
                                                float fM6239b5 = c0917yb.m6239b(typedArrayObtainAttributes2, "scaleY", 4, 1.0f);
                                                float fM6239b6 = c0917yb.m6239b(typedArrayObtainAttributes2, "translateX", 6, 0.0f);
                                                float fM6239b7 = c0917yb.m6239b(typedArrayObtainAttributes2, "translateY", 7, 0.0f);
                                                String string3 = typedArrayObtainAttributes2.getString(0);
                                                c0917yb.m6240c(typedArrayObtainAttributes2.getChangingConfigurations());
                                                String str2 = string3 == null ? "" : string3;
                                                typedArrayObtainAttributes2.recycle();
                                                int i22 = s93.f9998a;
                                                if (rx0Var.f9798k) {
                                                    kz0.m2764b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                                }
                                                rx0Var.f9796i.add(new qx0(str2, fM6239b3, f3, f4, fM6239b4, fM6239b5, fM6239b6, fM6239b7, listM2435a, AIChatConfig.DefaultMaxTokens));
                                                i17 = i18;
                                                c = '\t';
                                            }
                                        } else if (name.equals("path")) {
                                            int[] iArr4 = ci0.f1548d;
                                            if (theme == null) {
                                                typedArrayObtainStyledAttributes2 = resources.obtainAttributes(attributeSetAsAttributeSet, iArr4);
                                                i7 = 0;
                                            } else {
                                                i7 = 0;
                                                typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr4, 0, 0);
                                            }
                                            c0917yb.m6240c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) {
                                                C0676s.m4651j("No path data available");
                                                return;
                                            }
                                            String string4 = typedArrayObtainStyledAttributes2.getString(i7);
                                            c0917yb.m6240c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                            String str3 = string4 == null ? "" : string4;
                                            String string5 = typedArrayObtainStyledAttributes2.getString(2);
                                            c0917yb.m6240c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                            if (string5 == null) {
                                                int i23 = s93.f9998a;
                                            } else {
                                                listM2435a = C0337j5.m2435a(c0337j5, string5);
                                            }
                                            List list2 = listM2435a;
                                            C0133dk c0133dkM6238a = c0917yb.m6238a(typedArrayObtainStyledAttributes2, theme, "fillColor", 1);
                                            float fM6239b8 = c0917yb.m6239b(typedArrayObtainStyledAttributes2, "fillAlpha", 12, 1.0f);
                                            int i24 = !fd3.m1598a(c0917yb.f13386a, "strokeLineCap") ? -1 : typedArrayObtainStyledAttributes2.getInt(8, -1);
                                            c0917yb.m6240c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                            if (i24 == 0) {
                                                i8 = 0;
                                                i9 = fd3.m1598a(c0917yb.f13386a, "strokeLineJoin") ? -1 : typedArrayObtainStyledAttributes2.getInt(9, -1);
                                                c0917yb.m6240c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                                if (i9 != 0) {
                                                    if (i9 == 1) {
                                                        i10 = 1;
                                                    } else if (i9 == 2) {
                                                        i10 = 2;
                                                    }
                                                    float fM6239b9 = c0917yb.m6239b(typedArrayObtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                                    C0133dk c0133dkM6238a2 = c0917yb.m6238a(typedArrayObtainStyledAttributes2, theme, "strokeColor", 3);
                                                    float fM6239b10 = c0917yb.m6239b(typedArrayObtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                                    float fM6239b11 = c0917yb.m6239b(typedArrayObtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                                    float fM6239b12 = c0917yb.m6239b(typedArrayObtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                                    float fM6239b13 = c0917yb.m6239b(typedArrayObtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                                    float fM6239b14 = c0917yb.m6239b(typedArrayObtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                                    int i25 = !fd3.m1598a(c0917yb.f13386a, "fillType") ? 0 : typedArrayObtainStyledAttributes2.getInt(13, 0);
                                                    c0917yb.m6240c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                                    typedArrayObtainStyledAttributes2.recycle();
                                                    Shader shader = (Shader) c0133dkM6238a.f2082j;
                                                    int i26 = c0133dkM6238a.f2081i;
                                                    AbstractC0024an c0061bn = (shader != null && i26 == 0) ? null : shader != null ? new C0061bn(shader) : new ft2(sp0.m4930b(i26));
                                                    Shader shader2 = (Shader) c0133dkM6238a2.f2082j;
                                                    int i27 = c0133dkM6238a2.f2081i;
                                                    AbstractC0024an c0061bn2 = (shader2 == null && i27 == 0) ? null : shader2 != null ? new C0061bn(shader2) : new ft2(sp0.m4930b(i27));
                                                    int i28 = i25 != 0 ? 0 : 1;
                                                    if (rx0Var.f9798k) {
                                                        kz0.m2764b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                                    }
                                                    ((qx0) rx0Var.f9796i.get(r0.size() - 1)).f9282j.add(new w93(str3, list2, i28, c0061bn, fM6239b8, c0061bn2, fM6239b10, fM6239b11, i8, i10, fM6239b9, fM6239b14, fM6239b12, fM6239b13));
                                                    i17 = i18;
                                                    c = '\t';
                                                }
                                                i10 = 0;
                                                float fM6239b92 = c0917yb.m6239b(typedArrayObtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                                C0133dk c0133dkM6238a22 = c0917yb.m6238a(typedArrayObtainStyledAttributes2, theme, "strokeColor", 3);
                                                float fM6239b102 = c0917yb.m6239b(typedArrayObtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                                float fM6239b112 = c0917yb.m6239b(typedArrayObtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                                float fM6239b122 = c0917yb.m6239b(typedArrayObtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                                float fM6239b132 = c0917yb.m6239b(typedArrayObtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                                float fM6239b142 = c0917yb.m6239b(typedArrayObtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                                if (!fd3.m1598a(c0917yb.f13386a, "fillType")) {
                                                }
                                                c0917yb.m6240c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                                typedArrayObtainStyledAttributes2.recycle();
                                                Shader shader3 = (Shader) c0133dkM6238a.f2082j;
                                                int i262 = c0133dkM6238a.f2081i;
                                                if (shader3 != null) {
                                                    Shader shader22 = (Shader) c0133dkM6238a22.f2082j;
                                                    int i272 = c0133dkM6238a22.f2081i;
                                                    if (shader22 == null) {
                                                        if (i25 != 0) {
                                                        }
                                                        if (rx0Var.f9798k) {
                                                        }
                                                        ((qx0) rx0Var.f9796i.get(r0.size() - 1)).f9282j.add(new w93(str3, list2, i28, c0061bn, fM6239b8, c0061bn2, fM6239b102, fM6239b112, i8, i10, fM6239b92, fM6239b142, fM6239b122, fM6239b132));
                                                        i17 = i18;
                                                        c = '\t';
                                                    }
                                                }
                                            } else {
                                                if (i24 == 1) {
                                                    i8 = 1;
                                                } else if (i24 == 2) {
                                                    i8 = 2;
                                                }
                                                if (fd3.m1598a(c0917yb.f13386a, "strokeLineJoin")) {
                                                }
                                                c0917yb.m6240c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                                if (i9 != 0) {
                                                }
                                                i10 = 0;
                                                float fM6239b922 = c0917yb.m6239b(typedArrayObtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                                C0133dk c0133dkM6238a222 = c0917yb.m6238a(typedArrayObtainStyledAttributes2, theme, "strokeColor", 3);
                                                float fM6239b1022 = c0917yb.m6239b(typedArrayObtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                                float fM6239b1122 = c0917yb.m6239b(typedArrayObtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                                float fM6239b1222 = c0917yb.m6239b(typedArrayObtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                                float fM6239b1322 = c0917yb.m6239b(typedArrayObtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                                float fM6239b1422 = c0917yb.m6239b(typedArrayObtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                                if (!fd3.m1598a(c0917yb.f13386a, "fillType")) {
                                                }
                                                c0917yb.m6240c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                                typedArrayObtainStyledAttributes2.recycle();
                                                Shader shader32 = (Shader) c0133dkM6238a.f2082j;
                                                int i2622 = c0133dkM6238a.f2081i;
                                                if (shader32 != null) {
                                                }
                                            }
                                        }
                                    } else {
                                        i5 = i14;
                                    }
                                    c = '\t';
                                    i17 = i18;
                                }
                                xmlResourceParser.next();
                                xml = xmlResourceParser;
                                i14 = i5;
                            }
                        }
                    } else {
                        if (i16 == 3) {
                            i4 = 3;
                        } else if (i16 != 5) {
                            if (i16 != 9) {
                                switch (i16) {
                                    case 14:
                                        i4 = 13;
                                        break;
                                    case 15:
                                        i4 = 14;
                                        break;
                                    case 16:
                                        i4 = 12;
                                        break;
                                }
                            } else {
                                i4 = 9;
                            }
                        }
                        float f5 = dimension / resources.getDisplayMetrics().density;
                        float f22 = dimension2 / resources.getDisplayMetrics().density;
                        typedArray.recycle();
                        rx0 rx0Var2 = new rx0(null, f5, f22, fM6239b, fM6239b2, j3, i4, z2, 1);
                        int i172 = 0;
                        while (true) {
                            if (xml.getEventType() == 1) {
                            }
                            xmlResourceParser.next();
                            xml = xmlResourceParser;
                            i14 = i5;
                        }
                    }
                } else {
                    i3 = i12;
                    z = true;
                }
                c0926yk = v93.m5657c(tx0Var.f10991a, go0Var);
                go0Var.m1994p(false);
                obj = null;
            }
            boolean z3 = (i3 & 112) == 32 ? z : false;
            Object objM1956L3 = go0Var.m1956L();
            if (z3 || objM1956L3 == C0520nx.f7360a) {
                if (j == 16) {
                    c0095cl = obj;
                    j2 = j;
                } else {
                    j2 = j;
                    c0095cl = new C0095cl(j2, 5);
                }
                go0Var.m1981f0(c0095cl);
            } else {
                c0095cl = objM1956L3;
                j2 = j;
            }
            AbstractC0135dm.m1057a(xe1.m6108Z(AbstractC0731te.m5211g0(rh1.f9587a, o00.f7392e), c0926yk, (C0095cl) c0095cl), go0Var, 0);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r2 = go0Var.m1996r();
        if (b62VarM1996r2 != null) {
            final int i29 = 0;
            b62VarM1996r2.f616d = new mn0() { // from class: i60
                @Override // p000.mn0
                /* JADX INFO: renamed from: g */
                public final Object mo12g(Object obj22, Object obj3) {
                    int i142 = i29;
                    a83 a83Var = a83.f116a;
                    int i152 = i2;
                    long j32 = j2;
                    int i162 = i;
                    InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj22;
                    ((Integer) obj3).getClass();
                    switch (i142) {
                        case 0:
                            k60.m2607b(i162, j32, interfaceC0596px2, pp0.m3902N(i152 | 1));
                            break;
                        default:
                            k60.m2607b(i162, j32, interfaceC0596px2, pp0.m3902N(i152 | 1));
                            break;
                    }
                    return a83Var;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m2608c(cz2 cz2Var, ry2 ry2Var, xm0 xm0Var, InterfaceC0596px interfaceC0596px, int i) {
        int i2;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-2040393164);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? go0Var.m1980f(cz2Var) : go0Var.m1984h(cz2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? go0Var.m1980f(ry2Var) : go0Var.m1984h(ry2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= go0Var.m1984h(xm0Var) ? 256 : 128;
        }
        boolean z = false;
        if (go0Var.m1958O(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && go0Var.m1980f(ry2Var));
            Object objM1956L = go0Var.m1956L();
            C0160eb c0160eb = C0520nx.f7360a;
            if (z2 || objM1956L == c0160eb) {
                objM1956L = new je1(new C0485n4(7, new C0640r1(13, ry2Var, xm0Var)));
                go0Var.m1981f0(objM1956L);
            }
            je1 je1Var = (je1) objM1956L;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && go0Var.m1984h(cz2Var))) {
                z = true;
            }
            Object objM1956L2 = go0Var.m1956L();
            if (z || objM1956L2 == c0160eb) {
                objM1956L2 = new C0727ta(6, cz2Var);
                go0Var.m1981f0(objM1956L2);
            }
            AbstractC0573pa.m3831a(je1Var, (xm0) objM1956L2, f5352a, xe1.m6126i0(1315155414, new C0016af(3, ry2Var, cz2Var), go0Var), go0Var, 3456, 0);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0803va(cz2Var, ry2Var, xm0Var, i, 6);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m2609d(uh1 uh1Var, C0402kw c0402kw, InterfaceC0596px interfaceC0596px, int i) {
        int i2;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(1392105195);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (go0Var.m1980f(uh1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.m1984h(c0402kw) ? 32 : 16;
        }
        if (go0Var.m1958O(i2 & 1, (i2 & 19) != 18)) {
            rp0.m4523I(uh1Var, az2.f456a, c0402kw, go0Var, ((i2 << 6) & 7168) | (i2 & 14) | 432);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0537ob(uh1Var, c0402kw, i, i3);
        }
    }
}
