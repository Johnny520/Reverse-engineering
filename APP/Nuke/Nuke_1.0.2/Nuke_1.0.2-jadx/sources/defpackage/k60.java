package defpackage;

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
import nuke.module.wechat.ai.AIChatConfig;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k60 {
    public static final h22 a = new h22(30);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(cz2 cz2Var, qy2 qy2Var, px pxVar, int i) {
        Context context;
        go0 go0Var = (go0) pxVar;
        go0Var.X(1904307118);
        int i2 = (go0Var.f(cz2Var) ? 4 : 2) | i | (go0Var.h(qy2Var) ? 32 : 16);
        if (go0Var.O(i2 & 1, (i2 & 19) != 18)) {
            if (Build.VERSION.SDK_INT >= 28) {
                go0Var.W(-1009482584);
                context = (Context) go0Var.j(r7.b);
                go0Var.p(false);
            } else {
                go0Var.W(-1009433480);
                go0Var.p(false);
                context = null;
            }
            boolean zH = go0Var.h(qy2Var) | ((i2 & 14) == 4) | go0Var.h(context);
            Object objL = go0Var.L();
            if (zH || objL == nx.a) {
                objL = new m0(qy2Var, context, cz2Var, 6);
                go0Var.f0(objL);
            }
            r00.b(null, null, (in0) objL, go0Var, 0, 3);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new af(i, 4, cz2Var, qy2Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0605, code lost:
    
        r2 = new defpackage.tx0(r21.b(), r13 | r10.b);
        r15.a.put(r4, new java.lang.ref.WeakReference(r2));
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final int i, long j, px pxVar, final int i2) {
        TypedValue typedValue;
        int i3;
        boolean z;
        Object obj;
        Object d9Var;
        lw1 ykVar;
        Object clVar;
        TypedArray typedArray;
        boolean z2;
        long jB;
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
        ColorStateList colorStateListA;
        final long j2 = j;
        go0 go0Var = (go0) pxVar;
        go0Var.X(-1240244237);
        int i11 = (i2 & 6) == 0 ? i2 | (go0Var.d(i) ? 4 : 2) : i2;
        if ((i2 & 48) == 0) {
            i11 |= go0Var.e(j2) ? 32 : 16;
        }
        int i12 = i11;
        if (go0Var.O(i12 & 1, (i12 & 19) != 18)) {
            tu2 tu2Var = r7.b;
            Context context = (Context) go0Var.j(tu2Var);
            boolean zF = go0Var.f(context) | ((i12 & 14) == 4);
            Object objL = go0Var.L();
            if (zF || objL == nx.a) {
                objL = Integer.valueOf(context.obtainStyledAttributes(new int[]{i}).getResourceId(0, -1));
                go0Var.f0(objL);
            }
            int iIntValue = ((Number) objL).intValue();
            if (iIntValue == -1) {
                b62 b62VarR = go0Var.r();
                if (b62VarR != null) {
                    final int i13 = 1;
                    b62VarR.d = new mn0() { // from class: i60
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // defpackage.mn0
                        public final Object g(Object obj2, Object obj3) {
                            int i14 = i13;
                            a83 a83Var = a83.a;
                            int i15 = i2;
                            long j3 = j2;
                            int i16 = i;
                            px pxVar2 = (px) obj2;
                            ((Integer) obj3).getClass();
                            switch (i14) {
                                case 0:
                                    k60.b(i16, j3, pxVar2, pp0.N(i15 | 1));
                                    break;
                                default:
                                    k60.b(i16, j3, pxVar2, pp0.N(i15 | 1));
                                    break;
                            }
                            return a83Var;
                        }
                    };
                    return;
                }
                return;
            }
            Context context2 = (Context) go0Var.j(tu2Var);
            Resources resources = (Resources) go0Var.j(r7.c);
            l92 l92Var = (l92) go0Var.j(r7.e);
            synchronized (l92Var) {
                typedValue = (TypedValue) l92Var.a.b(iIntValue);
                if (typedValue == null) {
                    typedValue = new TypedValue();
                    resources.getValue(iIntValue, typedValue, true);
                    zj1 zj1Var = l92Var.a;
                    int iD = zj1Var.d(iIntValue);
                    Object[] objArr = zj1Var.c;
                    Object obj2 = objArr[iD];
                    zj1Var.b[iD] = iIntValue;
                    objArr[iD] = typedValue;
                }
            }
            CharSequence charSequence = typedValue.string;
            if (charSequence == null || !pv2.l0(charSequence, ".xml")) {
                i3 = i12;
                z = true;
                go0Var.W(-1771643000);
                boolean zF2 = go0Var.f(context2.getTheme()) | go0Var.f(charSequence) | go0Var.d(iIntValue);
                Object objL2 = go0Var.L();
                if (zF2 || objL2 == nx.a) {
                    obj = null;
                    try {
                        Drawable drawable = resources.getDrawable(iIntValue, null);
                        drawable.getClass();
                        d9Var = new d9(((BitmapDrawable) drawable).getBitmap());
                        go0Var.f0(d9Var);
                    } catch (Exception e) {
                        throw new pv("Error attempting to load resource: " + ((Object) charSequence), e);
                    }
                } else {
                    d9Var = objL2;
                    obj = null;
                }
                ykVar = new yk((d9) d9Var);
                go0Var.p(false);
            } else {
                go0Var.W(-1771798434);
                Resources.Theme theme = context2.getTheme();
                int i14 = typedValue.changingConfigurations;
                vx0 vx0Var = (vx0) go0Var.j(r7.d);
                ux0 ux0Var = new ux0(theme, iIntValue);
                WeakReference weakReference = (WeakReference) vx0Var.a.get(ux0Var);
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
                    if (!t11.l(xml.getName(), "vector")) {
                        s.j("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                        return;
                    }
                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                    yb ybVar = new yb(xml);
                    int[] iArr = ci0.b;
                    TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSetAsAttributeSet, iArr) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr, 0, 0);
                    ybVar.c(typedArrayObtainAttributes.getChangingConfigurations());
                    if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
                        typedArray = typedArrayObtainAttributes;
                        z2 = typedArray.getBoolean(5, false);
                    } else {
                        typedArray = typedArrayObtainAttributes;
                        z2 = false;
                    }
                    ybVar.c(typedArray.getChangingConfigurations());
                    float fB = ybVar.b(typedArray, "viewportWidth", 7, 0.0f);
                    float fB2 = ybVar.b(typedArray, "viewportHeight", 8, 0.0f);
                    if (fB <= 0.0f) {
                        throw new XmlPullParserException(typedArray.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
                    }
                    if (fB2 <= 0.0f) {
                        throw new XmlPullParserException(typedArray.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
                    }
                    float dimension = typedArray.getDimension(3, 0.0f);
                    ybVar.c(typedArray.getChangingConfigurations());
                    float dimension2 = typedArray.getDimension(2, 0.0f);
                    ybVar.c(typedArray.getChangingConfigurations());
                    if (typedArray.hasValue(1)) {
                        TypedValue typedValue2 = new TypedValue();
                        typedArray.getValue(1, typedValue2);
                        if (typedValue2.type == 2) {
                            jB = ju.g;
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
                                    ThreadLocal threadLocal = vu.a;
                                    try {
                                        colorStateListA = vu.a(resources2, resources2.getXml(resourceId), theme);
                                    } catch (Exception e2) {
                                        Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
                                        colorStateListA = null;
                                    }
                                } else {
                                    colorStateListA = ColorStateList.valueOf(typedValue3.data);
                                    i3 = i12;
                                }
                                ybVar.c(typedArray.getChangingConfigurations());
                                jB = colorStateListA == null ? sp0.b(colorStateListA.getDefaultColor()) : ju.g;
                            } else {
                                i3 = i12;
                            }
                            colorStateListA = null;
                            ybVar.c(typedArray.getChangingConfigurations());
                            if (colorStateListA == null) {
                            }
                        }
                    } else {
                        i3 = i12;
                        jB = ju.g;
                    }
                    long j3 = jB;
                    int i16 = typedArray.getInt(6, -1);
                    ybVar.c(typedArray.getChangingConfigurations());
                    if (i16 == -1) {
                        i4 = 5;
                        float f = dimension / resources.getDisplayMetrics().density;
                        float f2 = dimension2 / resources.getDisplayMetrics().density;
                        typedArray.recycle();
                        rx0 rx0Var = new rx0(null, f, f2, fB, fB2, j3, i4, z2, 1);
                        int i17 = 0;
                        while (true) {
                            if (xml.getEventType() == 1) {
                                z = (xml.getDepth() < 1 && xml.getEventType() == 3) ? true : true;
                                List listA = be0.h;
                                XmlPullParser xmlPullParser = ybVar.a;
                                j5 j5Var = ybVar.c;
                                int i18 = i17;
                                int eventType = xmlPullParser.getEventType();
                                XmlResourceParser xmlResourceParser = xml;
                                if (eventType != 2) {
                                    if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                                        int i19 = i18 + 1;
                                        for (int i20 = 0; i20 < i19; i20++) {
                                            ArrayList arrayList = rx0Var.i;
                                            if (rx0Var.k) {
                                                kz0.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                            }
                                            qx0 qx0Var = (qx0) arrayList.remove(arrayList.size() - 1);
                                            ((qx0) arrayList.get(arrayList.size() - 1)).j.add(new r93(qx0Var.a, qx0Var.b, qx0Var.c, qx0Var.d, qx0Var.e, qx0Var.f, qx0Var.g, qx0Var.h, qx0Var.i, qx0Var.j));
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
                                                int[] iArr2 = ci0.e;
                                                if (theme == null) {
                                                    typedArrayObtainStyledAttributes = resources.obtainAttributes(attributeSetAsAttributeSet, iArr2);
                                                    i6 = 0;
                                                } else {
                                                    i6 = 0;
                                                    typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr2, 0, 0);
                                                }
                                                ybVar.c(typedArrayObtainStyledAttributes.getChangingConfigurations());
                                                String string = typedArrayObtainStyledAttributes.getString(i6);
                                                ybVar.c(typedArrayObtainStyledAttributes.getChangingConfigurations());
                                                String str = string == null ? "" : string;
                                                String string2 = typedArrayObtainStyledAttributes.getString(1);
                                                ybVar.c(typedArrayObtainStyledAttributes.getChangingConfigurations());
                                                if (string2 == null) {
                                                    int i21 = s93.a;
                                                } else {
                                                    listA = j5.a(j5Var, string2);
                                                }
                                                List list = listA;
                                                typedArrayObtainStyledAttributes.recycle();
                                                if (rx0Var.k) {
                                                    kz0.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                                }
                                                rx0Var.i.add(new qx0(str, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, list, AIChatConfig.DefaultMaxTokens));
                                                i17 = i18 + 1;
                                            } else {
                                                i17 = i18;
                                            }
                                        } else if (iHashCode != 3433509) {
                                            if (iHashCode == 98629247 && name.equals("group")) {
                                                int[] iArr3 = ci0.c;
                                                TypedArray typedArrayObtainAttributes2 = theme == null ? resources.obtainAttributes(attributeSetAsAttributeSet, iArr3) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr3, 0, 0);
                                                ybVar.c(typedArrayObtainAttributes2.getChangingConfigurations());
                                                float fB3 = ybVar.b(typedArrayObtainAttributes2, "rotation", 5, 0.0f);
                                                float f3 = typedArrayObtainAttributes2.getFloat(1, 0.0f);
                                                ybVar.c(typedArrayObtainAttributes2.getChangingConfigurations());
                                                float f4 = typedArrayObtainAttributes2.getFloat(2, 0.0f);
                                                ybVar.c(typedArrayObtainAttributes2.getChangingConfigurations());
                                                float fB4 = ybVar.b(typedArrayObtainAttributes2, "scaleX", 3, 1.0f);
                                                float fB5 = ybVar.b(typedArrayObtainAttributes2, "scaleY", 4, 1.0f);
                                                float fB6 = ybVar.b(typedArrayObtainAttributes2, "translateX", 6, 0.0f);
                                                float fB7 = ybVar.b(typedArrayObtainAttributes2, "translateY", 7, 0.0f);
                                                String string3 = typedArrayObtainAttributes2.getString(0);
                                                ybVar.c(typedArrayObtainAttributes2.getChangingConfigurations());
                                                String str2 = string3 == null ? "" : string3;
                                                typedArrayObtainAttributes2.recycle();
                                                int i22 = s93.a;
                                                if (rx0Var.k) {
                                                    kz0.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                                }
                                                rx0Var.i.add(new qx0(str2, fB3, f3, f4, fB4, fB5, fB6, fB7, listA, AIChatConfig.DefaultMaxTokens));
                                                i17 = i18;
                                                c = '\t';
                                            }
                                        } else if (name.equals("path")) {
                                            int[] iArr4 = ci0.d;
                                            if (theme == null) {
                                                typedArrayObtainStyledAttributes2 = resources.obtainAttributes(attributeSetAsAttributeSet, iArr4);
                                                i7 = 0;
                                            } else {
                                                i7 = 0;
                                                typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr4, 0, 0);
                                            }
                                            ybVar.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) {
                                                s.j("No path data available");
                                                return;
                                            }
                                            String string4 = typedArrayObtainStyledAttributes2.getString(i7);
                                            ybVar.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                            String str3 = string4 == null ? "" : string4;
                                            String string5 = typedArrayObtainStyledAttributes2.getString(2);
                                            ybVar.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                            if (string5 == null) {
                                                int i23 = s93.a;
                                            } else {
                                                listA = j5.a(j5Var, string5);
                                            }
                                            List list2 = listA;
                                            dk dkVarA = ybVar.a(typedArrayObtainStyledAttributes2, theme, "fillColor", 1);
                                            float fB8 = ybVar.b(typedArrayObtainStyledAttributes2, "fillAlpha", 12, 1.0f);
                                            int i24 = !fd3.a(ybVar.a, "strokeLineCap") ? -1 : typedArrayObtainStyledAttributes2.getInt(8, -1);
                                            ybVar.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                            if (i24 == 0) {
                                                i8 = 0;
                                                i9 = fd3.a(ybVar.a, "strokeLineJoin") ? -1 : typedArrayObtainStyledAttributes2.getInt(9, -1);
                                                ybVar.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                                if (i9 != 0) {
                                                    if (i9 == 1) {
                                                        i10 = 1;
                                                    } else if (i9 == 2) {
                                                        i10 = 2;
                                                    }
                                                    float fB9 = ybVar.b(typedArrayObtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                                    dk dkVarA2 = ybVar.a(typedArrayObtainStyledAttributes2, theme, "strokeColor", 3);
                                                    float fB10 = ybVar.b(typedArrayObtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                                    float fB11 = ybVar.b(typedArrayObtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                                    float fB12 = ybVar.b(typedArrayObtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                                    float fB13 = ybVar.b(typedArrayObtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                                    float fB14 = ybVar.b(typedArrayObtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                                    int i25 = !fd3.a(ybVar.a, "fillType") ? 0 : typedArrayObtainStyledAttributes2.getInt(13, 0);
                                                    ybVar.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                                    typedArrayObtainStyledAttributes2.recycle();
                                                    Shader shader = (Shader) dkVarA.j;
                                                    int i26 = dkVarA.i;
                                                    an bnVar = (shader != null && i26 == 0) ? null : shader != null ? new bn(shader) : new ft2(sp0.b(i26));
                                                    Shader shader2 = (Shader) dkVarA2.j;
                                                    int i27 = dkVarA2.i;
                                                    an bnVar2 = (shader2 == null && i27 == 0) ? null : shader2 != null ? new bn(shader2) : new ft2(sp0.b(i27));
                                                    int i28 = i25 != 0 ? 0 : 1;
                                                    if (rx0Var.k) {
                                                        kz0.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                                    }
                                                    ((qx0) rx0Var.i.get(r0.size() - 1)).j.add(new w93(str3, list2, i28, bnVar, fB8, bnVar2, fB10, fB11, i8, i10, fB9, fB14, fB12, fB13));
                                                    i17 = i18;
                                                    c = '\t';
                                                }
                                                i10 = 0;
                                                float fB92 = ybVar.b(typedArrayObtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                                dk dkVarA22 = ybVar.a(typedArrayObtainStyledAttributes2, theme, "strokeColor", 3);
                                                float fB102 = ybVar.b(typedArrayObtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                                float fB112 = ybVar.b(typedArrayObtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                                float fB122 = ybVar.b(typedArrayObtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                                float fB132 = ybVar.b(typedArrayObtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                                float fB142 = ybVar.b(typedArrayObtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                                if (!fd3.a(ybVar.a, "fillType")) {
                                                }
                                                ybVar.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                                typedArrayObtainStyledAttributes2.recycle();
                                                Shader shader3 = (Shader) dkVarA.j;
                                                int i262 = dkVarA.i;
                                                if (shader3 != null) {
                                                    Shader shader22 = (Shader) dkVarA22.j;
                                                    int i272 = dkVarA22.i;
                                                    if (shader22 == null) {
                                                        if (i25 != 0) {
                                                        }
                                                        if (rx0Var.k) {
                                                        }
                                                        ((qx0) rx0Var.i.get(r0.size() - 1)).j.add(new w93(str3, list2, i28, bnVar, fB8, bnVar2, fB102, fB112, i8, i10, fB92, fB142, fB122, fB132));
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
                                                if (fd3.a(ybVar.a, "strokeLineJoin")) {
                                                }
                                                ybVar.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                                if (i9 != 0) {
                                                }
                                                i10 = 0;
                                                float fB922 = ybVar.b(typedArrayObtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                                dk dkVarA222 = ybVar.a(typedArrayObtainStyledAttributes2, theme, "strokeColor", 3);
                                                float fB1022 = ybVar.b(typedArrayObtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                                float fB1122 = ybVar.b(typedArrayObtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                                float fB1222 = ybVar.b(typedArrayObtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                                float fB1322 = ybVar.b(typedArrayObtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                                float fB1422 = ybVar.b(typedArrayObtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                                if (!fd3.a(ybVar.a, "fillType")) {
                                                }
                                                ybVar.c(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                                typedArrayObtainStyledAttributes2.recycle();
                                                Shader shader32 = (Shader) dkVarA.j;
                                                int i2622 = dkVarA.i;
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
                        rx0 rx0Var2 = new rx0(null, f5, f22, fB, fB2, j3, i4, z2, 1);
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
                ykVar = v93.c(tx0Var.a, go0Var);
                go0Var.p(false);
                obj = null;
            }
            boolean z3 = (i3 & 112) == 32 ? z : false;
            Object objL3 = go0Var.L();
            if (z3 || objL3 == nx.a) {
                if (j == 16) {
                    clVar = obj;
                    j2 = j;
                } else {
                    j2 = j;
                    clVar = new cl(j2, 5);
                }
                go0Var.f0(clVar);
            } else {
                clVar = objL3;
                j2 = j;
            }
            dm.a(xe1.Z(te.g0(rh1.a, o00.e), ykVar, (cl) clVar), go0Var, 0);
        } else {
            go0Var.R();
        }
        b62 b62VarR2 = go0Var.r();
        if (b62VarR2 != null) {
            final int i29 = 0;
            b62VarR2.d = new mn0() { // from class: i60
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.mn0
                public final Object g(Object obj22, Object obj3) {
                    int i142 = i29;
                    a83 a83Var = a83.a;
                    int i152 = i2;
                    long j32 = j2;
                    int i162 = i;
                    px pxVar2 = (px) obj22;
                    ((Integer) obj3).getClass();
                    switch (i142) {
                        case 0:
                            k60.b(i162, j32, pxVar2, pp0.N(i152 | 1));
                            break;
                        default:
                            k60.b(i162, j32, pxVar2, pp0.N(i152 | 1));
                            break;
                    }
                    return a83Var;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(cz2 cz2Var, ry2 ry2Var, xm0 xm0Var, px pxVar, int i) {
        int i2;
        go0 go0Var = (go0) pxVar;
        go0Var.X(-2040393164);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? go0Var.f(cz2Var) : go0Var.h(cz2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? go0Var.f(ry2Var) : go0Var.h(ry2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= go0Var.h(xm0Var) ? 256 : 128;
        }
        boolean z = false;
        if (go0Var.O(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && go0Var.f(ry2Var));
            Object objL = go0Var.L();
            eb ebVar = nx.a;
            if (z2 || objL == ebVar) {
                objL = new je1(new n4(7, new r1(13, ry2Var, xm0Var)));
                go0Var.f0(objL);
            }
            je1 je1Var = (je1) objL;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && go0Var.h(cz2Var))) {
                z = true;
            }
            Object objL2 = go0Var.L();
            if (z || objL2 == ebVar) {
                objL2 = new ta(6, cz2Var);
                go0Var.f0(objL2);
            }
            pa.a(je1Var, (xm0) objL2, a, xe1.i0(1315155414, new af(3, ry2Var, cz2Var), go0Var), go0Var, 3456, 0);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new va(cz2Var, ry2Var, xm0Var, i, 6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void d(uh1 uh1Var, kw kwVar, px pxVar, int i) {
        int i2;
        go0 go0Var = (go0) pxVar;
        go0Var.X(1392105195);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (go0Var.f(uh1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= go0Var.h(kwVar) ? 32 : 16;
        }
        if (go0Var.O(i2 & 1, (i2 & 19) != 18)) {
            rp0.I(uh1Var, az2.a, kwVar, go0Var, ((i2 << 6) & 7168) | (i2 & 14) | 432);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new ob(uh1Var, kwVar, i, i3);
        }
    }
}
