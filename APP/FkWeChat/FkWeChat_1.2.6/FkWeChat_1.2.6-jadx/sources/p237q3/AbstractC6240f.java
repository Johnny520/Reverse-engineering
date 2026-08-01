package p237q3;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p206o3.AbstractC5633c;

/* JADX INFO: renamed from: q3.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6240f {
    /* JADX INFO: renamed from: a */
    public static a m24611a(a aVar, int i10, int i11, boolean z10, int i12) {
        return aVar != null ? aVar : z10 ? new a(i10, i12, i11) : new a(i10, i11);
    }

    /* JADX INFO: renamed from: b */
    public static Shader m24612b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayM24626i = AbstractC6242h.m24626i(resources, theme, attributeSet, AbstractC5633c.f17692g);
        float fM24623f = AbstractC6242h.m24623f(typedArrayM24626i, xmlPullParser, "startX", AbstractC5633c.f17701p, 0.0f);
        float fM24623f2 = AbstractC6242h.m24623f(typedArrayM24626i, xmlPullParser, "startY", AbstractC5633c.f17702q, 0.0f);
        float fM24623f3 = AbstractC6242h.m24623f(typedArrayM24626i, xmlPullParser, "endX", AbstractC5633c.f17703r, 0.0f);
        float fM24623f4 = AbstractC6242h.m24623f(typedArrayM24626i, xmlPullParser, "endY", AbstractC5633c.f17704s, 0.0f);
        float fM24623f5 = AbstractC6242h.m24623f(typedArrayM24626i, xmlPullParser, "centerX", AbstractC5633c.f17696k, 0.0f);
        float fM24623f6 = AbstractC6242h.m24623f(typedArrayM24626i, xmlPullParser, "centerY", AbstractC5633c.f17697l, 0.0f);
        int iM24624g = AbstractC6242h.m24624g(typedArrayM24626i, xmlPullParser, "type", AbstractC5633c.f17695j, 0);
        int iM24619b = AbstractC6242h.m24619b(typedArrayM24626i, xmlPullParser, "startColor", AbstractC5633c.f17693h, 0);
        boolean zM24625h = AbstractC6242h.m24625h(xmlPullParser, "centerColor");
        int iM24619b2 = AbstractC6242h.m24619b(typedArrayM24626i, xmlPullParser, "centerColor", AbstractC5633c.f17700o, 0);
        int iM24619b3 = AbstractC6242h.m24619b(typedArrayM24626i, xmlPullParser, "endColor", AbstractC5633c.f17694i, 0);
        int iM24624g2 = AbstractC6242h.m24624g(typedArrayM24626i, xmlPullParser, "tileMode", AbstractC5633c.f17699n, 0);
        float fM24623f7 = AbstractC6242h.m24623f(typedArrayM24626i, xmlPullParser, "gradientRadius", AbstractC5633c.f17698m, 0.0f);
        typedArrayM24626i.recycle();
        a aVarM24611a = m24611a(m24613c(resources, xmlPullParser, attributeSet, theme), iM24619b, iM24619b3, zM24625h, iM24619b2);
        if (iM24624g != 1) {
            return iM24624g != 2 ? new LinearGradient(fM24623f, fM24623f2, fM24623f3, fM24623f4, aVarM24611a.f19371a, aVarM24611a.f19372b, m24614d(iM24624g2)) : new SweepGradient(fM24623f5, fM24623f6, aVarM24611a.f19371a, aVarM24611a.f19372b);
        }
        if (fM24623f7 > 0.0f) {
            return new RadialGradient(fM24623f5, fM24623f6, fM24623f7, aVarM24611a.f19371a, aVarM24611a.f19372b, m24614d(iM24624g2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (r4.size() <= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
    
        return new p237q3.AbstractC6240f.a(r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
    
        return null;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p237q3.AbstractC6240f.a m24613c(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r9.next()
            if (r3 == r1) goto L85
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L85
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = p206o3.AbstractC5633c.f17705t
            android.content.res.TypedArray r3 = p237q3.AbstractC6242h.m24626i(r8, r11, r10, r3)
            int r5 = p206o3.AbstractC5633c.f17706u
            boolean r5 = r3.hasValue(r5)
            int r6 = p206o3.AbstractC5633c.f17707v
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L6a
            if (r6 == 0) goto L6a
            int r5 = p206o3.AbstractC5633c.f17706u
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = p206o3.AbstractC5633c.f17707v
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L6a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r9 = r9.getPositionDescription()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L85:
            int r8 = r4.size()
            if (r8 <= 0) goto L91
            q3.f$a r8 = new q3.f$a
            r8.<init>(r4, r2)
            return r8
        L91:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p237q3.AbstractC6240f.m24613c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):q3.f$a");
    }

    /* JADX INFO: renamed from: d */
    public static Shader.TileMode m24614d(int i10) {
        return i10 != 1 ? i10 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    /* JADX INFO: renamed from: q3.f$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int[] f19371a;

        /* JADX INFO: renamed from: b */
        public final float[] f19372b;

        public a(List list, List list2) {
            int size = list.size();
            this.f19371a = new int[size];
            this.f19372b = new float[size];
            for (int i10 = 0; i10 < size; i10++) {
                this.f19371a[i10] = ((Integer) list.get(i10)).intValue();
                this.f19372b[i10] = ((Float) list2.get(i10)).floatValue();
            }
        }

        public a(int i10, int i11) {
            this.f19371a = new int[]{i10, i11};
            this.f19372b = new float[]{0.0f, 1.0f};
        }

        public a(int i10, int i11, int i12) {
            this.f19371a = new int[]{i10, i11, i12};
            this.f19372b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
