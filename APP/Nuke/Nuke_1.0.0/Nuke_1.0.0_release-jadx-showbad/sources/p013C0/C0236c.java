package p013C0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;
import p061L2.C0971k;
import p078P1.C1147i;
import p088R1.InterfaceC1194D;
import p117X2.AbstractC1665j;
import p121Y1.C1736D;
import p148d2.InterfaceC1970a;
import p188k1.AbstractC2450a;
import p199m1.AbstractC2597b;
import p208n4.C2703b;
import p248u3.AbstractC3337a;
import p248u3.C3338b;

/* JADX INFO: renamed from: C0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0236c implements InterfaceC1970a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f792d;

    /* JADX INFO: renamed from: e */
    public int f793e;

    /* JADX INFO: renamed from: f */
    public Object f794f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [C3.b.d(java.lang.String, java.lang.Object, o3.a):void, n4.b.<clinit>():void] */
    public /* synthetic */ C0236c(int i5) {
        this.f792d = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01e5, code lost:
    
        if (r8.size() <= 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01e7, code lost:
    
        r0 = new p047I0.C0735i0(r8, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01ed, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ee, code lost:
    
        if (r0 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01f2, code lost:
    
        if (r20 == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01f4, code lost:
    
        r0 = new p047I0.C0735i0(r6, r13, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01fa, code lost:
    
        r0 = new p047I0.C0735i0(r6, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0200, code lost:
    
        if (r9 == 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0203, code lost:
    
        if (r9 == 2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0205, code lost:
    
        r1 = r0.f2312a;
        r0 = r0.f2313b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x020b, code lost:
    
        if (r5 == 1) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x020d, code lost:
    
        if (r5 == 2) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x020f, code lost:
    
        r2 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x021c, code lost:
    
        r2 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x021f, code lost:
    
        r2 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0222, code lost:
    
        r13 = new android.graphics.LinearGradient(r25, r26, r16, r17, r1, r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0226, code lost:
    
        r13 = new android.graphics.SweepGradient(r11, r10, r0.f2312a, r0.f2313b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0234, code lost:
    
        if (r24 <= 0.0f) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0236, code lost:
    
        r1 = r0.f2312a;
        r0 = r0.f2313b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x023e, code lost:
    
        if (r5 == 1) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0240, code lost:
    
        if (r5 == 2) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0242, code lost:
    
        r2 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0251, code lost:
    
        r2 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0254, code lost:
    
        r2 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0257, code lost:
    
        r13 = new android.graphics.RadialGradient(r11, r10, r24, r1, r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0263, code lost:
    
        return new p013C0.C0236c(0, 4, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x026b, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0236c m413d(Resources resources, int i5, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        float f2;
        int i6;
        TypedArray typedArrayObtainStyledAttributes;
        XmlResourceParser xml = resources.getXml(i5);
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
        int i7 = 4;
        Object obj = null;
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                return new C0236c(AbstractC2597b.m4546b(resources, xml, attributeSetAsAttributeSet, theme).getDefaultColor(), i7, obj);
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        int[] iArr = AbstractC2450a.f7913b;
        TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSetAsAttributeSet, iArr) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr, 0, 0);
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? typedArrayObtainAttributes.getFloat(8, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayObtainAttributes.getFloat(9, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayObtainAttributes.getFloat(10, 0.0f) : 0.0f;
        float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayObtainAttributes.getFloat(11, 0.0f) : 0.0f;
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArrayObtainAttributes.getFloat(3, 0.0f) : 0.0f;
        float f10 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayObtainAttributes.getFloat(4, 0.0f) : 0.0f;
        int i8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? typedArrayObtainAttributes.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayObtainAttributes.getColor(0, 0) : 0;
        boolean z5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayObtainAttributes.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArrayObtainAttributes.getColor(1, 0) : 0;
        int i9 = 1;
        int i10 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayObtainAttributes.getInt(6, 0) : 0;
        float f11 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayObtainAttributes.getFloat(5, 0.0f) : 0.0f;
        typedArrayObtainAttributes.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f12 = f11;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            float f13 = f5;
            if (next2 == i9) {
                f2 = f6;
                break;
            }
            int depth2 = xml.getDepth();
            f2 = f6;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                int[] iArr2 = AbstractC2450a.f7914c;
                if (theme == null) {
                    typedArrayObtainStyledAttributes = resources.obtainAttributes(attributeSetAsAttributeSet, iArr2);
                    i6 = 0;
                } else {
                    i6 = 0;
                    typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr2, 0, 0);
                }
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i6);
                boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    break;
                }
                int color4 = typedArrayObtainStyledAttributes.getColor(0, 0);
                float f14 = typedArrayObtainStyledAttributes.getFloat(1, 0.0f);
                typedArrayObtainStyledAttributes.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f14));
            }
            f5 = f13;
            f6 = f2;
            i9 = 1;
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public void m414a(long j5) {
        if (m415c(j5)) {
            return;
        }
        int i5 = this.f793e;
        long[] jArrCopyOf = (long[]) this.f794f;
        if (i5 >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i5 + 1, jArrCopyOf.length * 2));
            AbstractC1665j.m2984d(jArrCopyOf, "copyOf(...)");
            this.f794f = jArrCopyOf;
        }
        jArrCopyOf[i5] = j5;
        if (i5 >= this.f793e) {
            this.f793e = i5 + 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p148d2.InterfaceC1970a
    /* JADX INFO: renamed from: b */
    public InterfaceC1194D mo98b(InterfaceC1194D interfaceC1194D, C1147i c1147i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) interfaceC1194D.get()).compress((Bitmap.CompressFormat) this.f794f, this.f793e, byteArrayOutputStream);
        interfaceC1194D.mo2256e();
        return new C1736D(byteArrayOutputStream.toByteArray());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public boolean m415c(long j5) {
        int i5 = this.f793e;
        for (int i6 = 0; i6 < i5; i6++) {
            if (((long[]) this.f794f)[i6] == j5) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public void m416e(int i5, int i6) {
        int i7 = i6 + i5;
        char[] cArr = (char[]) this.f794f;
        if (cArr.length <= i7) {
            int i8 = i5 * 2;
            if (i7 < i8) {
                i7 = i8;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i7);
            AbstractC1665j.m2984d(cArrCopyOf, "copyOf(...)");
            this.f794f = cArrCopyOf;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public void m417f(int i5, C2703b c2703b) {
        while (true) {
            int i6 = i5 >> 1;
            if (i6 == 0) {
                break;
            }
            C2703b c2703b2 = ((C2703b[]) this.f794f)[i6];
            AbstractC1665j.m2982b(c2703b2);
            if (AbstractC1665j.m2988h(0L, c2703b.f8624g - c2703b2.f8624g) <= 0) {
                break;
            }
            c2703b2.f8623f = i5;
            ((C2703b[]) this.f794f)[i5] = c2703b2;
            i5 = i6;
        }
        ((C2703b[]) this.f794f)[i5] = c2703b;
        c2703b.f8623f = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public void m418g() {
        C3338b c3338b = C3338b.f10383f;
        char[] cArr = (char[]) this.f794f;
        c3338b.getClass();
        AbstractC1665j.m2985e(cArr, "array");
        synchronized (c3338b) {
            int i5 = c3338b.f9813d;
            if (cArr.length + i5 < AbstractC3337a.f10382a) {
                c3338b.f9813d = i5 + cArr.length;
                ((C0971k) c3338b.f9814e).addLast(cArr);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public void m419h(long j5) {
        int i5 = this.f793e;
        int i6 = 0;
        while (i6 < i5) {
            if (j5 == ((long[]) this.f794f)[i6]) {
                int i7 = this.f793e - 1;
                while (i6 < i7) {
                    long[] jArr = (long[]) this.f794f;
                    int i8 = i6 + 1;
                    jArr[i6] = jArr[i8];
                    i6 = i8;
                }
                this.f793e--;
                return;
            }
            i6++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public void m420i(C2703b c2703b) {
        C2703b c2703b2;
        int i5 = c2703b.f8623f;
        if (i5 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i6 = this.f793e;
        C2703b c2703b3 = ((C2703b[]) this.f794f)[i6];
        AbstractC1665j.m2982b(c2703b3);
        c2703b.f8623f = -1;
        ((C2703b[]) this.f794f)[i6] = null;
        this.f793e = i6 - 1;
        if (c2703b == c2703b3) {
            return;
        }
        int iM2988h = AbstractC1665j.m2988h(0L, c2703b3.f8624g - c2703b.f8624g);
        if (iM2988h == 0) {
            ((C2703b[]) this.f794f)[i5] = c2703b3;
            c2703b3.f8623f = i5;
            return;
        }
        if (iM2988h >= 0) {
            m417f(i5, c2703b3);
            return;
        }
        while (true) {
            int i7 = i5 << 1;
            int i8 = i7 + 1;
            int i9 = this.f793e;
            if (i8 > i9) {
                if (i7 > i9) {
                    break;
                }
                c2703b2 = ((C2703b[]) this.f794f)[i7];
                AbstractC1665j.m2982b(c2703b2);
            } else {
                c2703b2 = ((C2703b[]) this.f794f)[i7];
                AbstractC1665j.m2982b(c2703b2);
                C2703b c2703b4 = ((C2703b[]) this.f794f)[i8];
                AbstractC1665j.m2982b(c2703b4);
                if (AbstractC1665j.m2988h(0L, c2703b4.f8624g - c2703b2.f8624g) >= 0) {
                    c2703b2 = c2703b4;
                }
            }
            if (AbstractC1665j.m2988h(0L, c2703b2.f8624g - c2703b3.f8624g) <= 0) {
                break;
            }
            int i10 = c2703b2.f8623f;
            c2703b2.f8623f = i5;
            ((C2703b[]) this.f794f)[i5] = c2703b2;
            i5 = i10;
        }
        ((C2703b[]) this.f794f)[i5] = c2703b3;
        c2703b3.f8623f = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public void m421j(String str) {
        AbstractC1665j.m2985e(str, "text");
        int length = str.length();
        if (length == 0) {
            return;
        }
        m416e(this.f793e, length);
        str.getChars(0, str.length(), (char[]) this.f794f, this.f793e);
        this.f793e += length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f792d) {
            case 6:
                return new String((char[]) this.f794f, 0, this.f793e);
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C0236c(int i5, int i6, Object obj) {
        this.f792d = i6;
        this.f794f = obj;
        this.f793e = i5;
    }

    public C0236c() {
        this.f792d = 3;
        this.f794f = Bitmap.CompressFormat.JPEG;
        this.f793e = 100;
    }
}
