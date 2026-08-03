package Yue;

import Yue.C6989;
import Yue.InterfaceC7144;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public final class C5192 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f1331 = 0;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f1332 = 1;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f12282 = 2;

    /* JADX INFO: renamed from: ۥ */
    public static C0663 m1967(@InterfaceC6490 C0663 c0663, @InterfaceC3897 int i, @InterfaceC3897 int i2, boolean z, @InterfaceC3897 int i3) {
        return c0663 != null ? c0663 : z ? new C0663(i, i3, i2) : new C0663(i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static Shader m1968(@InterfaceC6391 Resources resources, @InterfaceC6391 XmlPullParser xmlPullParser, @InterfaceC6490 Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m15896(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Shader m15896(@InterfaceC6391 Resources resources, @InterfaceC6391 XmlPullParser xmlPullParser, @InterfaceC6391 AttributeSet attributeSet, @InterfaceC6490 Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayM25330 = C8021.m25330(resources, theme, attributeSet, C6989.C6997.f21125);
        float fM25321 = C8021.m25321(typedArrayM25330, xmlPullParser, "startX", C6989.C6997.f21134, 0.0f);
        float fM253212 = C8021.m25321(typedArrayM25330, xmlPullParser, "startY", C6989.C6997.f21135, 0.0f);
        float fM253213 = C8021.m25321(typedArrayM25330, xmlPullParser, "endX", C6989.C6997.f21136, 0.0f);
        float fM253214 = C8021.m25321(typedArrayM25330, xmlPullParser, "endY", C6989.C6997.f21137, 0.0f);
        float fM253215 = C8021.m25321(typedArrayM25330, xmlPullParser, "centerX", C6989.C6997.f21129, 0.0f);
        float fM253216 = C8021.m25321(typedArrayM25330, xmlPullParser, "centerY", C6989.C6997.f21130, 0.0f);
        int iM25322 = C8021.m25322(typedArrayM25330, xmlPullParser, "type", C6989.C6997.f21128, 0);
        int iM25317 = C8021.m25317(typedArrayM25330, xmlPullParser, "startColor", C6989.C6997.f21126, 0);
        boolean zM25329 = C8021.m25329(xmlPullParser, "centerColor");
        int iM253172 = C8021.m25317(typedArrayM25330, xmlPullParser, "centerColor", C6989.C6997.f21133, 0);
        int iM253173 = C8021.m25317(typedArrayM25330, xmlPullParser, "endColor", C6989.C6997.f21127, 0);
        int iM253222 = C8021.m25322(typedArrayM25330, xmlPullParser, "tileMode", C6989.C6997.f21132, 0);
        float fM253217 = C8021.m25321(typedArrayM25330, xmlPullParser, "gradientRadius", C6989.C6997.f21131, 0.0f);
        typedArrayM25330.recycle();
        C0663 c0663M1967 = m1967(m15897(resources, xmlPullParser, attributeSet, theme), iM25317, iM253173, zM25329, iM253172);
        if (iM25322 != 1) {
            return iM25322 != 2 ? new LinearGradient(fM25321, fM253212, fM253213, fM253214, c0663M1967.f1333, c0663M1967.f1334, m15898(iM253222)) : new SweepGradient(fM253215, fM253216, c0663M1967.f1333, c0663M1967.f1334);
        }
        if (fM253217 > 0.0f) {
            return new RadialGradient(fM253215, fM253216, fM253217, c0663M1967.f1333, c0663M1967.f1334, m15898(iM253222));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (r4.size() <= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
    
        return new Yue.C5192.C0663(r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
    
        return null;
     */
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0663 m15897(@InterfaceC6391 Resources resources, @InterfaceC6391 XmlPullParser xmlPullParser, @InterfaceC6391 AttributeSet attributeSet, @InterfaceC6490 Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int depth2 = xmlPullParser.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayM25330 = C8021.m25330(resources, theme, attributeSet, C6989.C6997.f21138);
                boolean zHasValue = typedArrayM25330.hasValue(C6989.C6997.f21139);
                boolean zHasValue2 = typedArrayM25330.hasValue(C6989.C6997.f21140);
                if (!zHasValue || !zHasValue2) {
                    break;
                }
                int color = typedArrayM25330.getColor(C6989.C6997.f21139, 0);
                float f = typedArrayM25330.getFloat(C6989.C6997.f21140, 0.0f);
                typedArrayM25330.recycle();
                arrayList2.add(Integer.valueOf(color));
                arrayList.add(Float.valueOf(f));
            }
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static Shader.TileMode m15898(int i) {
        return i != 1 ? i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۧۡ$ۥ */
    public static final class C0663 {

        /* JADX INFO: renamed from: ۥ */
        public final int[] f1333;

        /* JADX INFO: renamed from: ۥ۟ */
        public final float[] f1334;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C0663(@InterfaceC6391 List<Integer> list, @InterfaceC6391 List<Float> list2) {
            int size = list.size();
            this.f1333 = new int[size];
            this.f1334 = new float[size];
            for (int i = 0; i < size; i++) {
                this.f1333[i] = list.get(i).intValue();
                this.f1334[i] = list2.get(i).floatValue();
            }
        }

        public C0663(@InterfaceC3897 int i, @InterfaceC3897 int i2) {
            this.f1333 = new int[]{i, i2};
            this.f1334 = new float[]{0.0f, 1.0f};
        }

        public C0663(@InterfaceC3897 int i, @InterfaceC3897 int i2, @InterfaceC3897 int i3) {
            this.f1333 = new int[]{i, i2, i3};
            this.f1334 = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
