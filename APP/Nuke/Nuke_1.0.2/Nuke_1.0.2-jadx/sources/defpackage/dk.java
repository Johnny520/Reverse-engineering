package defpackage;

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
import java.util.LinkedHashMap;
import nuke.module.wechat.ai.AIChatConfig;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class dk implements n92, z93 {
    public final /* synthetic */ int h;
    public int i;
    public Object j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public dk(byte[] bArr) {
        this.h = 2;
        int length = bArr.length;
        if (length < 0) {
            s.j("end < start");
            throw null;
        }
        if (length > bArr.length) {
            s.j("end > bytes.length");
            throw null;
        }
        this.j = bArr;
        this.i = length;
    }

    /* JADX DEBUG: Class process forced to load method for inline: qb2.m(qb2, java.lang.String, int, int):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(dk dkVar, z40 z40Var, rj rjVar) {
        n41 n41Var;
        LinkedHashMap linkedHashMap;
        z40 z40Var2;
        byte bF;
        dk dkVar2;
        qb2 qb2Var = (qb2) dkVar.j;
        if (rjVar instanceof n41) {
            n41Var = (n41) rjVar;
            int i = n41Var.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                n41Var.r = i - Integer.MIN_VALUE;
            } else {
                n41Var = new n41(dkVar, rjVar);
            }
        }
        Object obj = n41Var.p;
        int i2 = n41Var.r;
        int i3 = 0;
        if (i2 == 0) {
            fg1.T(obj);
            byte bG = qb2Var.g((byte) 6);
            if (qb2Var.p() == 4) {
                qb2.m(qb2Var, "Unexpected leading comma", 0, 6);
                throw null;
            }
            linkedHashMap = new LinkedHashMap();
            z40Var2 = z40Var;
            bF = bG;
        } else {
            if (i2 != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i4 = n41Var.o;
            String str = n41Var.n;
            linkedHashMap = n41Var.m;
            dkVar2 = n41Var.l;
            z40Var2 = n41Var.k;
            fg1.T(obj);
            linkedHashMap.put(str, (j31) obj);
            bF = ((qb2) dkVar2.j).f();
            if (bF != 4) {
                if (bF != 7) {
                    qb2.m((qb2) dkVar2.j, "Expected end of the object or comma", 0, 6);
                    throw null;
                }
                qb2 qb2Var2 = (qb2) dkVar2.j;
                if (bF != 6) {
                    qb2Var2.g((byte) 7);
                } else if (bF == 4) {
                    p7.x(qb2Var2, "object");
                    throw null;
                }
                return new d41(linkedHashMap);
            }
            i3 = i4;
            dkVar = dkVar2;
        }
        qb2 qb2Var3 = (qb2) dkVar.j;
        if (!qb2Var3.c()) {
            dkVar2 = dkVar;
            qb2 qb2Var22 = (qb2) dkVar2.j;
            if (bF != 6) {
            }
            return new d41(linkedHashMap);
        }
        String strJ = qb2Var3.j();
        qb2Var3.g((byte) 5);
        n41Var.k = z40Var2;
        n41Var.l = dkVar;
        n41Var.m = linkedHashMap;
        n41Var.n = strJ;
        n41Var.o = i3;
        n41Var.r = 1;
        z40Var2.getClass();
        z40Var2.i = n41Var;
        return k20.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01e5, code lost:
    
        if (r8.size() <= 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01e7, code lost:
    
        r0 = new defpackage.uo(r8, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01ed, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ee, code lost:
    
        if (r0 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01f2, code lost:
    
        if (r19 == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01f4, code lost:
    
        r0 = new defpackage.uo(r6, r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01fa, code lost:
    
        r0 = new defpackage.uo(r6, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0200, code lost:
    
        if (r10 == 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0203, code lost:
    
        if (r10 == 2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0205, code lost:
    
        r1 = r0.a;
        r0 = r0.b;
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
    
        r13 = new android.graphics.LinearGradient(r24, r25, r16, r17, r1, r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0226, code lost:
    
        r13 = new android.graphics.SweepGradient(r11, r13, r0.a, r0.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0235, code lost:
    
        if (r23 <= 0.0f) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0237, code lost:
    
        r1 = r0.a;
        r0 = r0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x023f, code lost:
    
        if (r5 == 1) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0241, code lost:
    
        if (r5 == 2) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0243, code lost:
    
        r2 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0252, code lost:
    
        r2 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0255, code lost:
    
        r2 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0258, code lost:
    
        r13 = new android.graphics.RadialGradient(r11, r13, r23, r1, r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0264, code lost:
    
        return new defpackage.dk(0, 3, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x026c, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static dk h(Resources resources, int i, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        float f;
        int i2;
        TypedArray typedArrayObtainStyledAttributes;
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
        int i3 = 3;
        Object obj = null;
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                return new dk(vu.b(resources, xml, attributeSetAsAttributeSet, theme).getDefaultColor(), i3, obj);
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        int[] iArr = g52.b;
        TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSetAsAttributeSet, iArr) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr, 0, 0);
        float f2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? typedArrayObtainAttributes.getFloat(8, 0.0f) : 0.0f;
        float f3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayObtainAttributes.getFloat(9, 0.0f) : 0.0f;
        float f4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayObtainAttributes.getFloat(10, 0.0f) : 0.0f;
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayObtainAttributes.getFloat(11, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArrayObtainAttributes.getFloat(3, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayObtainAttributes.getFloat(4, 0.0f) : 0.0f;
        int i4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? typedArrayObtainAttributes.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayObtainAttributes.getColor(0, 0) : 0;
        boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayObtainAttributes.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArrayObtainAttributes.getColor(1, 0) : 0;
        int i5 = 1;
        int i6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayObtainAttributes.getInt(6, 0) : 0;
        float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayObtainAttributes.getFloat(5, 0.0f) : 0.0f;
        typedArrayObtainAttributes.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f9 = f8;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            float f10 = f2;
            if (next2 == i5) {
                f = f3;
                break;
            }
            int depth2 = xml.getDepth();
            f = f3;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                int[] iArr2 = g52.c;
                if (theme == null) {
                    typedArrayObtainStyledAttributes = resources.obtainAttributes(attributeSetAsAttributeSet, iArr2);
                    i2 = 0;
                } else {
                    i2 = 0;
                    typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr2, 0, 0);
                }
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i2);
                boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    break;
                }
                int color4 = typedArrayObtainStyledAttributes.getColor(0, 0);
                float f11 = typedArrayObtainStyledAttributes.getFloat(1, 0.0f);
                typedArrayObtainStyledAttributes.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f11));
            }
            f2 = f10;
            f3 = f;
            i5 = 1;
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void d(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        int i = this.i + 7;
        float[] fArr = (float[]) this.j;
        if (i > fArr.length) {
            this.j = Arrays.copyOf(fArr, Math.max(fArr.length * 2, i));
        }
        float[] fArr2 = (float[]) this.j;
        int i2 = this.i;
        int i3 = i2 + 1;
        this.i = i3;
        fArr2[i2] = f;
        int i4 = i2 + 2;
        this.i = i4;
        fArr2[i3] = f2;
        int i5 = i2 + 3;
        this.i = i5;
        fArr2[i4] = f3;
        int i6 = i2 + 4;
        this.i = i6;
        fArr2[i5] = f4;
        int i7 = i2 + 5;
        this.i = i7;
        fArr2[i6] = f5;
        int i8 = i2 + 6;
        this.i = i8;
        fArr2[i7] = f6;
        this.i = i2 + 7;
        fArr2[i8] = f7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void e(long j) {
        if (g(j)) {
            return;
        }
        int i = this.i;
        long[] jArrCopyOf = (long[]) this.j;
        if (i >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i + 1, jArrCopyOf.length * 2));
            this.j = jArrCopyOf;
        }
        jArrCopyOf[i] = j;
        if (i >= this.i) {
            this.i = i + 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void f(int i, int i2) {
        v01 v01Var = (v01) this.j;
        int i3 = v01Var.j;
        if (i >= i3) {
            for (int i4 = i - i3; i4 >= 0; i4--) {
                v01Var.e(-1);
            }
        }
        v01Var.g(i, i2);
        int i5 = i2 + 1;
        if (this.i < i5) {
            this.i = i5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean g(long j) {
        int i = this.i;
        for (int i2 = 0; i2 < i; i2++) {
            if (((long[]) this.j)[i2] == j) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.n92
    public d92 i(d92 d92Var, ov1 ov1Var) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) d92Var.get()).compress((Bitmap.CompressFormat) this.j, this.i, byteArrayOutputStream);
        d92Var.e();
        return new wc(byteArrayOutputStream.toByteArray());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void j(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.j;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.j = Arrays.copyOf(cArr, i3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.z93
    public int k() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void l(int i, wg wgVar) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            wg wgVar2 = ((wg[]) this.j)[i2];
            wgVar2.getClass();
            if (t11.p(0L, wgVar.g - wgVar2.g) <= 0) {
                break;
            }
            wgVar2.f = i;
            ((wg[]) this.j)[i] = wgVar2;
            i = i2;
        }
        ((wg[]) this.j)[i] = wgVar;
        wgVar.f = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j31 m() {
        j31 d41Var;
        Object obj;
        qb2 qb2Var = (qb2) this.j;
        byte bP = qb2Var.p();
        if (bP == 1) {
            return o(true);
        }
        if (bP == 0) {
            return o(false);
        }
        if (bP != 6) {
            if (bP == 8) {
                return n();
            }
            qb2.m(qb2Var, "Cannot read Json element because of unexpected ".concat(eu.d0(bP)), 0, 6);
            throw null;
        }
        int i = this.i + 1;
        this.i = i;
        if (i == 200) {
            m41 m41Var = new m41(this, null);
            z40 z40Var = new z40();
            z40Var.h = m41Var;
            z40Var.i = z40Var;
            k20 k20Var = p7.c;
            z40Var.j = k20Var;
            while (true) {
                obj = z40Var.j;
                t00 t00Var = z40Var.i;
                if (t00Var == null) {
                    break;
                }
                if (t11.l(k20Var, obj)) {
                    try {
                        m41 m41Var2 = z40Var.h;
                        xe1.f(3, m41Var2);
                        m41 m41Var3 = new m41(m41Var2.l, t00Var);
                        m41Var3.k = z40Var;
                        Object objR = m41Var3.r(a83.a);
                        if (objR != k20.h) {
                            t00Var.h(objR);
                        }
                    } catch (Throwable th) {
                        t00Var.h(new x92(th));
                    }
                } else {
                    z40Var.j = k20Var;
                    t00Var.h(obj);
                }
            }
            fg1.T(obj);
            d41Var = (j31) obj;
        } else {
            byte bG = qb2Var.g((byte) 6);
            if (qb2Var.p() == 4) {
                qb2.m(qb2Var, "Unexpected leading comma", 0, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!qb2Var.c()) {
                    break;
                }
                String strJ = qb2Var.j();
                qb2Var.g((byte) 5);
                linkedHashMap.put(strJ, m());
                bG = qb2Var.f();
                if (bG != 4) {
                    if (bG != 7) {
                        qb2.m(qb2Var, "Expected end of the object or comma", 0, 6);
                        throw null;
                    }
                }
            }
            if (bG == 6) {
                qb2Var.g((byte) 7);
            } else if (bG == 4) {
                p7.x(qb2Var, "object");
                throw null;
            }
            d41Var = new d41(linkedHashMap);
        }
        this.i--;
        return d41Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public z21 n() {
        qb2 qb2Var = (qb2) this.j;
        byte bF = qb2Var.f();
        if (qb2Var.p() == 4) {
            qb2.m(qb2Var, "Unexpected leading comma", 0, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (qb2Var.c()) {
            arrayList.add(m());
            bF = qb2Var.f();
            if (bF != 4) {
                boolean z = bF == 9;
                int i = qb2Var.b;
                if (!z) {
                    qb2.m(qb2Var, "Expected end of the array or comma", i, 4);
                    throw null;
                }
            }
        }
        if (bF == 8) {
            qb2Var.g((byte) 9);
        } else if (bF == 4) {
            p7.x(qb2Var, "array");
            throw null;
        }
        return new z21(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i41 o(boolean z) {
        qb2 qb2Var = (qb2) this.j;
        String strK = !z ? qb2Var.k() : qb2Var.j();
        return (z || !t11.l(strK, "null")) ? new w31(strK, z) : z31.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void p() {
        rq rqVar = rq.c;
        char[] cArr = (char[]) this.j;
        rqVar.getClass();
        cArr.getClass();
        synchronized (rqVar) {
            int i = rqVar.b;
            if (cArr.length + i < ig.a) {
                rqVar.b = i + cArr.length;
                rqVar.a.addLast(cArr);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.x93
    public nd q(long j, nd ndVar, nd ndVar2, nd ndVar3) {
        return ((kj1) this.j).q(j, ndVar, ndVar2, ndVar3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.z93
    public int r() {
        return this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.x93
    public nd s(long j, nd ndVar, nd ndVar2, nd ndVar3) {
        return ((kj1) this.j).s(j, ndVar, ndVar2, ndVar3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.h) {
            case AIChatConfig.DefaultContextRounds /* 6 */:
                return new String((char[]) this.j, 0, this.i);
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void u(long j) {
        int i = this.i;
        int i2 = 0;
        while (i2 < i) {
            if (j == ((long[]) this.j)[i2]) {
                int i3 = this.i - 1;
                while (i2 < i3) {
                    long[] jArr = (long[]) this.j;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.i--;
                return;
            }
            i2++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void v(wg wgVar) {
        wg wgVar2;
        int i = wgVar.f;
        if (i == -1) {
            s.j("Failed requirement.");
            return;
        }
        int i2 = this.i;
        wg wgVar3 = ((wg[]) this.j)[i2];
        wgVar3.getClass();
        wgVar.f = -1;
        ((wg[]) this.j)[i2] = null;
        this.i = i2 - 1;
        if (wgVar == wgVar3) {
            return;
        }
        int iP = t11.p(0L, wgVar3.g - wgVar.g);
        if (iP == 0) {
            ((wg[]) this.j)[i] = wgVar3;
            wgVar3.f = i;
            return;
        }
        if (iP >= 0) {
            l(i, wgVar3);
            return;
        }
        while (true) {
            int i3 = i << 1;
            int i4 = i3 + 1;
            int i5 = this.i;
            if (i4 > i5) {
                if (i3 > i5) {
                    break;
                }
                wgVar2 = ((wg[]) this.j)[i3];
                wgVar2.getClass();
            } else {
                wgVar2 = ((wg[]) this.j)[i3];
                wgVar2.getClass();
                wg wgVar4 = ((wg[]) this.j)[i4];
                wgVar4.getClass();
                if (t11.p(0L, wgVar4.g - wgVar2.g) >= 0) {
                    wgVar2 = wgVar4;
                }
            }
            if (t11.p(0L, wgVar2.g - wgVar3.g) <= 0) {
                break;
            }
            int i6 = wgVar2.f;
            wgVar2.f = i;
            ((wg[]) this.j)[i] = wgVar2;
            i = i6;
        }
        ((wg[]) this.j)[i] = wgVar3;
        wgVar3.f = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void w(String str) {
        str.getClass();
        int length = str.length();
        if (length == 0) {
            return;
        }
        j(this.i, length);
        str.getChars(0, str.length(), (char[]) this.j, this.i);
        this.i += length;
    }

    public /* synthetic */ dk(int i, int i2, Object obj) {
        this.h = i2;
        this.j = obj;
        this.i = i;
    }

    public dk(f31 f31Var, qb2 qb2Var) {
        this.h = 7;
        this.j = qb2Var;
    }

    public dk() {
        this.h = 1;
        this.j = Bitmap.CompressFormat.JPEG;
        this.i = 100;
    }

    public dk(int i) {
        this.h = 0;
        this.j = new v01(i);
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [pg3.onSurfaceChanged(javax.microedition.khronos.opengles.GL10, int, int):void, u21.b(w41, java.lang.Object):java.lang.String, wg.<clinit>():void] */
    public /* synthetic */ dk(byte b, int i) {
        this.h = i;
    }

    public dk(ArrayList arrayList) {
        this.h = 12;
        this.j = arrayList;
    }

    public dk(int i, gd0 gd0Var) {
        this.h = 14;
        this.i = i;
        this.j = new kj1(new xj0(i, gd0Var));
    }

    public dk(String str, int i) {
        this.h = 9;
        this.i = i;
        this.j = str;
    }
}
