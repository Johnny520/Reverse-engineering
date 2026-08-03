package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
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

    /* JADX INFO: renamed from: b */
    public static C0477L3 m932b(Resources r30, int r31, Resources.Theme r32) {
        XmlResourceParser r2 = r30.getXml(r31);
        AttributeSet r3 = Xml.asAttributeSet(r2);
    L3:
        int r4 = r2.next();
        if (r4 == 2) goto L7;
        if (r4 != 1) goto L3;
    L7:
        if (r4 != 2) goto L130;
        String r42 = r2.getName();
        r42.getClass();
        if (r42.equals("gradient") == false) goto L11;
        String r43 = r2.getName();
        if (r43.equals("gradient") == false) goto L128;
        TypedArray r44 = AbstractC0714Qj.m1471B(r30, r32, r3, AbstractC0725Qu.f2314e);
        if (r2.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") == null) goto L21;
        float r12 = r44.getFloat(8, 0.0f);
    L23:
        if (r2.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") == null) goto L25;
        float r13 = r44.getFloat(9, 0.0f);
    L27:
        if (r2.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") == null) goto L29;
        float r14 = r44.getFloat(10, 0.0f);
    L31:
        if (r2.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") == null) goto L33;
        float r15 = r44.getFloat(11, 0.0f);
    L35:
        if (r2.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") == null) goto L37;
        float r8 = r44.getFloat(3, 0.0f);
    L39:
        if (r2.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") == null) goto L41;
        float r9 = r44.getFloat(4, 0.0f);
    L43:
        if (r2.getAttributeValue("http://schemas.android.com/apk/res/android", "type") == null) goto L45;
        int r11 = r44.getInt(2, 0);
    L47:
        if (r2.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") == null) goto L49;
        int r6 = r44.getColor(0, 0);
    L51:
        if (r2.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") == null) goto L53;
        boolean r20 = true;
    L55:
        if (r2.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") == null) goto L57;
        int r5 = r44.getColor(7, 0);
    L59:
        if (r2.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") == null) goto L61;
        float r21 = r12;
        int r122 = r44.getColor(1, 0);
    L63:
        if (r2.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") == null) goto L65;
        float r22 = r13;
        int r10 = r44.getInt(6, 0);
    L67:
        if (r2.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") == null) goto L69;
        float r132 = r44.getFloat(5, 0.0f);
    L70:
        r44.recycle();
        int r45 = r2.getDepth() + 1;
        ArrayList r7 = new ArrayList(20);
        float r25 = r132;
        ArrayList r133 = new ArrayList(20);
    L71:
        int r23 = r2.next();
        float r26 = r14;
        if (r23 == 1) goto L90;
        int r142 = r2.getDepth();
        float r27 = r15;
        if (r142 >= r45) goto L78;
        if (r23 != 3) goto L78;
    L92:
        if (r133.size() <= 0) goto L94;
        C0649P3 r0 = new C0649P3(r133, r7);
    L95:
        if (r0 != null) goto L100;
        if (r20 == false) goto L99;
        r0 = new C0649P3(r6, r5, r122);
        goto L100
    L99:
        r0 = new C0649P3(r6, r122);
    L100:
        if (r11 == 1) goto L113;
        if (r11 == 2) goto L111;
        int[] r16 = (int[]) r0.f2089b;
        float[] r17 = (float[]) r0.f2090c;
        if (r10 == 1) goto L109;
        if (r10 == 2) goto L108;
        Shader.TileMode r02 = Shader.TileMode.CLAMP;
    L110:
        Shader r112 = new LinearGradient(r21, r22, r26, r27, r16, r17, r02);
    L124:
        return new C0477L3(r112, null, 0);
    L108:
        r02 = Shader.TileMode.MIRROR;
        goto L110
    L109:
        r02 = Shader.TileMode.REPEAT;
        goto L110
    L111:
        r112 = new SweepGradient(r8, r9, (int[]) r0.f2089b, (float[]) r0.f2090c);
        goto L124
    L113:
        if (r25 <= 0.0f) goto L126;
        int[] r202 = (int[]) r0.f2089b;
        float[] r212 = (float[]) r0.f2090c;
        if (r10 != 1) goto L117;
        Shader.TileMode r03 = Shader.TileMode.REPEAT;
    L122:
        r112 = new RadialGradient(r8, r9, r25, r202, r212, r03);
        goto L124
    L117:
        if (r10 == 2) goto L120;
        r03 = Shader.TileMode.CLAMP;
        goto L122
    L120:
        r03 = Shader.TileMode.MIRROR;
        goto L122
    L126:
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    L94:
        r0 = null;
    L78:
        if (r23 != 2) goto L79;
        if (r142 > r45) goto L79;
        if (r2.getName().equals("item") == false) goto L79;
        TypedArray r24 = AbstractC0714Qj.m1471B(r30, r32, r3, AbstractC0725Qu.f2315f);
        boolean r152 = r24.hasValue(0);
        boolean r19 = r24.hasValue(1);
        if (r152 == false) goto L89;
        if (r19 == false) goto L89;
        int r28 = r24.getColor(0, 0);
        float r29 = r24.getFloat(1, 0.0f);
        r24.recycle();
        r133.add(Integer.valueOf(r28));
        r7.add(Float.valueOf(r29));
    L89:
        throw new XmlPullParserException(r2.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
    L79:
        r14 = r26;
        r15 = r27;
        goto L71
    L90:
        r27 = r15;
        goto L92
    L69:
        r132 = 0.0f;
        goto L70
    L65:
        r22 = r13;
        r10 = 0;
        goto L67
    L61:
        r21 = r12;
        r122 = 0;
        goto L63
    L57:
        r5 = 0;
        goto L59
    L53:
        r20 = false;
        goto L55
    L49:
        r6 = 0;
        goto L51
    L45:
        r11 = 0;
        goto L47
    L41:
        r9 = 0.0f;
        goto L43
    L37:
        r8 = 0.0f;
        goto L39
    L33:
        r15 = 0.0f;
        goto L35
    L29:
        r14 = 0.0f;
        goto L31
    L25:
        r13 = 0.0f;
        goto L27
    L21:
        r12 = 0.0f;
        goto L23
    L128:
        throw new XmlPullParserException(r2.getPositionDescription() + ": invalid gradient color tag " + r43);
    L11:
        if (r42.equals("selector") == false) goto L15;
        ColorStateList r04 = AbstractC2754ya.m5335b(r30, r2, r3, r32);
        return new C0477L3(null, r04, r04.getDefaultColor());
    L15:
        throw new XmlPullParserException(r2.getPositionDescription() + ": unsupported complex color tag " + r42);
    L130:
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX INFO: renamed from: a */
    public void m933a() {
        ImageView r0 = (ImageView) this.f1575c;
        Drawable r1 = r0.getDrawable();
        if (r1 == null) goto L5;
        AbstractC0107Ce.m159a(r1);
    L5:
        if (r1 == null) goto L10;
        C2090jB r2 = (C2090jB) this.f1576d;
        if (r2 == null) goto L11;
        C0262G3.m542e(r1, r2, r0.getDrawableState());
        return;
    L11:
        return;
    }

    /* JADX INFO: renamed from: c */
    public String m934c() {
        StringBuilder r0 = new StringBuilder("$");
        int r1 = this.f1574b + 1;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L19;
        Object r3 = ((Object[]) this.f1575c)[r2];
        if ((r3 instanceof InterfaceC0126Cx) == false) goto L15;
        InterfaceC0126Cx r32 = (InterfaceC0126Cx) r3;
        if (AbstractC0585Nj.m1134a(r32.mo204c(), C0128Cz.f299h) == true) goto L9;
        int r4 = ((int[]) this.f1576d)[r2];
        if (r4 < 0) goto L17;
        r0.append(".");
        r0.append(r32.mo206e(r4));
    L17:
        r2 = r2 + 1;
        goto L3
    L9:
        if (((int[]) this.f1576d)[r2] == (-1)) goto L17;
        r0.append("[");
        r0.append(((int[]) this.f1576d)[r2]);
        r0.append("]");
        goto L17
    L15:
        if (r3 == C1456gf.f5163g) goto L17;
        r0.append("['");
        r0.append(r3);
        r0.append("']");
        goto L17
    L19:
        return r0.toString();
    }

    /* JADX INFO: renamed from: d */
    public boolean m935d() {
        if (((Shader) this.f1575c) != null) goto L10;
        ColorStateList r0 = (ColorStateList) this.f1576d;
        if (r0 != null) goto L7;
        return false;
    L7:
        if (r0.isStateful() == false) goto L13;
        return true;
    L13:
        return false;
    L10:
        return false;
    }

    /* JADX INFO: renamed from: e */
    public void m936e(AttributeSet r9, int r10) {
        ImageView r1 = (ImageView) this.f1575c;
        Context r0 = r1.getContext();
        int[] r3 = AbstractC0982Wu.f3071f;
        C2656w4 r7 = C2656w4.m5186A(r0, r9, r3, r10);
        TypedArray r02 = (TypedArray) r7.f9196b;
        AbstractC2185lE.m4398k(r1, r1.getContext(), r3, r9, (TypedArray) r7.f9196b, r10);
        Drawable r92 = r1.getDrawable();     // Catch: Throwable -> L10
        if (r92 != null) goto L12;
        int r2 = r02.getResourceId(1, -1);     // Catch: Throwable -> L10
        if (r2 == (-1)) goto L12;
        r92 = AbstractC1406fG.m2695U(r1.getContext(), r2);     // Catch: Throwable -> L10
        if (r92 == null) goto L12;
        r1.setImageDrawable(r92);     // Catch: Throwable -> L10
    L12:
        if (r92 == null) goto L15;
        AbstractC0107Ce.m159a(r92);     // Catch: Throwable -> L10
    L15:
        if (r02.hasValue(2) == false) goto L18;
        r1.setImageTintList(r7.m5209p(2));     // Catch: Throwable -> L10
    L18:
        if (r02.hasValue(3) == false) goto L20;
        r1.setImageTintMode(AbstractC0107Ce.m161c(r02.getInt(3, -1), null));     // Catch: Throwable -> L10
    L20:
        r7.m5195E();
        return;
    L10:
        th = move-exception;
        r7.m5195E();
        throw th;
    }

    public String toString() {
        switch(this.f1573a) {
            case 3: goto L7;
            default: goto L5;
        };
    L5:
        return super.toString();
    L7:
        return m934c();
    }

    public C0477L3(ImageView r2) {
        this.f1573a = 0;
        this.f1574b = 0;
        this.f1575c = r2;
    }

    public C0477L3(Shader r2, ColorStateList r3, int r4) {
        this.f1573a = 1;
        this.f1575c = r2;
        this.f1576d = r3;
        this.f1574b = r4;
    }

    public C0477L3(C0061Bb r3) {
        this.f1573a = 2;
        this.f1576d = AbstractC0714Qj.m1478I(150, new C0132D2(21, this));
        this.f1575c = r3;
    }
}
