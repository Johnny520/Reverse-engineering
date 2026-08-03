package p000a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.core.C1066R;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: a.z3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0948z3 {

    /* JADX INFO: renamed from: a */
    public final Shader f3559a;

    /* JADX INFO: renamed from: b */
    public final ColorStateList f3560b;

    /* JADX INFO: renamed from: c */
    public int f3561c;

    public C0948z3(Shader shader, ColorStateList colorStateList, int i) {
        this.f3559a = shader;
        this.f3560b = colorStateList;
        this.f3561c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f6, code lost:
    
        if (r3.size() <= 0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01f8, code lost:
    
        r0 = new p000a.C0459Z7(r3, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01fe, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01ff, code lost:
    
        if (r0 == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0203, code lost:
    
        if (r19 == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0205, code lost:
    
        r0 = new p000a.C0459Z7(r6, r7, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x020b, code lost:
    
        r0 = new p000a.C0459Z7(r6, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0211, code lost:
    
        if (r8 == 1) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0214, code lost:
    
        if (r8 == 2) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0218, code lost:
    
        if (r11 == 1) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x021a, code lost:
    
        if (r11 == 2) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x021c, code lost:
    
        r1 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0221, code lost:
    
        r1 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0224, code lost:
    
        r1 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0227, code lost:
    
        r13 = new android.graphics.LinearGradient(r22, r25, r16, r17, (int[]) r0.f1726a, (float[]) r0.f1727b, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x023b, code lost:
    
        r13 = new android.graphics.SweepGradient(r5, r10, (int[]) r0.f1726a, (float[]) r0.f1727b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x024d, code lost:
    
        if (r24 <= 0.0f) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0253, code lost:
    
        if (r11 == 1) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0255, code lost:
    
        if (r11 == 2) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0257, code lost:
    
        r1 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x025a, code lost:
    
        r1 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x025d, code lost:
    
        r1 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x025f, code lost:
    
        r13 = new android.graphics.RadialGradient(r5, r10, r24, (int[]) r0.f1726a, (float[]) r0.f1727b, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x027f, code lost:
    
        return new p000a.C0948z3(r13, null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0287, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0948z3 m2238a(Resources resources, int i, Resources.Theme theme) {
        int next;
        int i2;
        boolean z;
        float f;
        Resources resources2 = resources;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListM1978b = C0853u3.m1978b(resources2, xml, attributeSetAsAttributeSet, theme);
                return new C0948z3(null, colorStateListM1978b, colorStateListM1978b.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayM594c = C0216Lf.m594c(resources2, theme, attributeSetAsAttributeSet, C1066R.styleable.GradientColor);
        float f2 = !(xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null) ? 0.0f : typedArrayM594c.getFloat(C1066R.styleable.GradientColor_android_startX, 0.0f);
        float f3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayM594c.getFloat(C1066R.styleable.GradientColor_android_startY, 0.0f) : 0.0f;
        float f4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayM594c.getFloat(C1066R.styleable.GradientColor_android_endX, 0.0f) : 0.0f;
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayM594c.getFloat(C1066R.styleable.GradientColor_android_endY, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArrayM594c.getFloat(C1066R.styleable.GradientColor_android_centerX, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayM594c.getFloat(C1066R.styleable.GradientColor_android_centerY, 0.0f) : 0.0f;
        int i3 = !(xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null) ? 0 : typedArrayM594c.getInt(C1066R.styleable.GradientColor_android_type, 0);
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayM594c.getColor(C1066R.styleable.GradientColor_android_startColor, 0) : 0;
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null) {
            z = true;
            i2 = 1;
        } else {
            i2 = 1;
            z = false;
        }
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayM594c.getColor(C1066R.styleable.GradientColor_android_centerColor, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArrayM594c.getColor(C1066R.styleable.GradientColor_android_endColor, 0) : 0;
        int i4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayM594c.getInt(C1066R.styleable.GradientColor_android_tileMode, 0) : 0;
        float f8 = f2;
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayM594c.getFloat(C1066R.styleable.GradientColor_android_gradientRadius, 0.0f) : 0.0f;
        typedArrayM594c.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            float f10 = f9;
            if (next2 == i2) {
                f = f3;
                break;
            }
            int depth2 = xml.getDepth();
            f = f3;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2) {
                if (depth2 > depth) {
                    resources2 = resources;
                } else if (xml.getName().equals("item")) {
                    TypedArray typedArrayM594c2 = C0216Lf.m594c(resources2, theme, attributeSetAsAttributeSet, C1066R.styleable.GradientColorItem);
                    boolean zHasValue = typedArrayM594c2.hasValue(C1066R.styleable.GradientColorItem_android_color);
                    boolean zHasValue2 = typedArrayM594c2.hasValue(C1066R.styleable.GradientColorItem_android_offset);
                    if (!zHasValue || !zHasValue2) {
                        break;
                    }
                    int color4 = typedArrayM594c2.getColor(C1066R.styleable.GradientColorItem_android_color, 0);
                    float f11 = typedArrayM594c2.getFloat(C1066R.styleable.GradientColorItem_android_offset, 0.0f);
                    typedArrayM594c2.recycle();
                    arrayList2.add(Integer.valueOf(color4));
                    arrayList.add(Float.valueOf(f11));
                    resources2 = resources;
                } else {
                    continue;
                }
            }
            f9 = f10;
            f3 = f;
            i2 = 1;
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2239b() {
        ColorStateList colorStateList;
        return this.f3559a == null && (colorStateList = this.f3560b) != null && colorStateList.isStateful();
    }
}
