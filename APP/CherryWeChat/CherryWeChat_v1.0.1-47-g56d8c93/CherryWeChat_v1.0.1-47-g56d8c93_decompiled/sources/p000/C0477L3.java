package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Xml;
import android.widget.ImageView;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: L3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0477L3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1573a;

    /* JADX INFO: renamed from: b */
    public int f1574b;

    /* JADX INFO: renamed from: c */
    public Object f1575c;

    /* JADX INFO: renamed from: d */
    public Object f1576d;

    public /* synthetic */ C0477L3() {
        this.f1573a = 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f5, code lost:
    
        if (r11 == 1) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f8, code lost:
    
        if (r11 == 2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01fa, code lost:
    
        r16 = (int[]) r0.f2089b;
        r17 = (float[]) r0.f2090c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0208, code lost:
    
        if (r10 == 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x020a, code lost:
    
        if (r10 == 2) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x020c, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0219, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x021c, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x021f, code lost:
    
        r11 = new android.graphics.LinearGradient(r21, r22, r26, r27, r16, r17, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0223, code lost:
    
        r11 = new android.graphics.SweepGradient(r8, r9, (int[]) r0.f2089b, (float[]) r0.f2090c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0235, code lost:
    
        if (r25 <= 0.0f) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0237, code lost:
    
        r20 = (int[]) r0.f2089b;
        r21 = (float[]) r0.f2090c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0246, code lost:
    
        if (r10 == 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0249, code lost:
    
        if (r10 == 2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x024b, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0256, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0259, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x025c, code lost:
    
        r11 = new android.graphics.RadialGradient(r8, r9, r25, r20, r21, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0268, code lost:
    
        return new p000.C0477L3(r11, null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0270, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01da, code lost:
    
        if (r13.size() <= 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01dc, code lost:
    
        r0 = new p000.C0649P3(r13, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e2, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e3, code lost:
    
        if (r0 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e7, code lost:
    
        if (r20 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e9, code lost:
    
        r0 = new p000.C0649P3(r6, r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ef, code lost:
    
        r0 = new p000.C0649P3(r6, r12);
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0477L3 m932b(Resources resources, int i, Resources.Theme theme) {
        int next;
        float f;
        int color;
        float f2;
        int i2;
        float f3;
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
                ColorStateList colorStateListM5335b = AbstractC2754ya.m5335b(resources, xml, attributeSetAsAttributeSet, theme);
                return new C0477L3(null, colorStateListM5335b, colorStateListM5335b.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayM1471B = AbstractC0714Qj.m1471B(resources, theme, attributeSetAsAttributeSet, AbstractC0725Qu.f2314e);
        float f4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? typedArrayM1471B.getFloat(8, 0.0f) : 0.0f;
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayM1471B.getFloat(9, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayM1471B.getFloat(10, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayM1471B.getFloat(11, 0.0f) : 0.0f;
        float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArrayM1471B.getFloat(3, 0.0f) : 0.0f;
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayM1471B.getFloat(4, 0.0f) : 0.0f;
        int i3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? typedArrayM1471B.getInt(2, 0) : 0;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayM1471B.getColor(0, 0) : 0;
        boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayM1471B.getColor(7, 0) : 0;
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null) {
            f = f4;
            color = typedArrayM1471B.getColor(1, 0);
        } else {
            f = f4;
            color = 0;
        }
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null) {
            f2 = f5;
            i2 = typedArrayM1471B.getInt(6, 0);
        } else {
            f2 = f5;
            i2 = 0;
        }
        float f10 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayM1471B.getFloat(5, 0.0f) : 0.0f;
        typedArrayM1471B.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f11 = f10;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            float f12 = f6;
            if (next2 == 1) {
                f3 = f7;
                break;
            }
            int depth2 = xml.getDepth();
            f3 = f7;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayM1471B2 = AbstractC0714Qj.m1471B(resources, theme, attributeSetAsAttributeSet, AbstractC0725Qu.f2315f);
                boolean zHasValue = typedArrayM1471B2.hasValue(0);
                boolean zHasValue2 = typedArrayM1471B2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    break;
                }
                int color4 = typedArrayM1471B2.getColor(0, 0);
                float f13 = typedArrayM1471B2.getFloat(1, 0.0f);
                typedArrayM1471B2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f13));
            }
            f6 = f12;
            f7 = f3;
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
    }

    /* JADX INFO: renamed from: a */
    public void m933a() {
        C2090jB c2090jB;
        ImageView imageView = (ImageView) this.f1575c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC0107Ce.m159a(drawable);
        }
        if (drawable == null || (c2090jB = (C2090jB) this.f1576d) == null) {
            return;
        }
        C0262G3.m542e(drawable, c2090jB, imageView.getDrawableState());
    }

    /* JADX INFO: renamed from: c */
    public String m934c() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.f1574b + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.f1575c)[i2];
            if (obj instanceof InterfaceC0126Cx) {
                InterfaceC0126Cx interfaceC0126Cx = (InterfaceC0126Cx) obj;
                if (!AbstractC0585Nj.m1134a(interfaceC0126Cx.mo204c(), C0128Cz.f299h)) {
                    int i3 = ((int[]) this.f1576d)[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(interfaceC0126Cx.mo206e(i3));
                    }
                } else if (((int[]) this.f1576d)[i2] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.f1576d)[i2]);
                    sb.append("]");
                }
            } else if (obj != C1456gf.f5163g) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public boolean m935d() {
        ColorStateList colorStateList;
        return ((Shader) this.f1575c) == null && (colorStateList = (ColorStateList) this.f1576d) != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: e */
    public void m936e(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.f1575c;
        Context context = imageView.getContext();
        int[] iArr = AbstractC0982Wu.f3071f;
        C2656w4 c2656w4M5186A = C2656w4.m5186A(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c2656w4M5186A.f9196b;
        AbstractC2185lE.m4398k(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) c2656w4M5186A.f9196b, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC1406fG.m2695U(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC0107Ce.m159a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(c2656w4M5186A.m5209p(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(AbstractC0107Ce.m161c(typedArray.getInt(3, -1), null));
            }
            c2656w4M5186A.m5195E();
        } catch (Throwable th) {
            c2656w4M5186A.m5195E();
            throw th;
        }
    }

    public String toString() {
        switch (this.f1573a) {
            case 3:
                return m934c();
            default:
                return super.toString();
        }
    }

    public C0477L3(ImageView imageView) {
        this.f1573a = 0;
        this.f1574b = 0;
        this.f1575c = imageView;
    }

    public C0477L3(Shader shader, ColorStateList colorStateList, int i) {
        this.f1573a = 1;
        this.f1575c = shader;
        this.f1576d = colorStateList;
        this.f1574b = i;
    }

    public C0477L3(C0061Bb c0061Bb) {
        this.f1573a = 2;
        this.f1576d = AbstractC0714Qj.m1478I(150, new C0132D2(21, this));
        this.f1575c = c0061Bb;
    }
}
