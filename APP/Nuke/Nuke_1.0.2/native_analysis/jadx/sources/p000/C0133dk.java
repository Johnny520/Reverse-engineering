package p000;

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
import nuke.module.wechat.p002ai.AIChatConfig;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: dk */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0133dk implements n92, z93 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2080h;

    /* JADX INFO: renamed from: i */
    public int f2081i;

    /* JADX INFO: renamed from: j */
    public Object f2082j;

    public C0133dk(byte[] bArr) {
        this.f2080h = 2;
        int length = bArr.length;
        if (length < 0) {
            C0676s.m4651j("end < start");
            throw null;
        }
        if (length > bArr.length) {
            C0676s.m4651j("end > bytes.length");
            throw null;
        }
        this.f2082j = bArr;
        this.f2081i = length;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1031c(C0133dk c0133dk, z40 z40Var, AbstractC0658rj abstractC0658rj) {
        n41 n41Var;
        LinkedHashMap linkedHashMap;
        z40 z40Var2;
        byte bM4119f;
        C0133dk c0133dk2;
        qb2 qb2Var = (qb2) c0133dk.f2082j;
        if (abstractC0658rj instanceof n41) {
            n41Var = (n41) abstractC0658rj;
            int i = n41Var.f6992r;
            if ((i & Integer.MIN_VALUE) != 0) {
                n41Var.f6992r = i - Integer.MIN_VALUE;
            } else {
                n41Var = new n41(c0133dk, abstractC0658rj);
            }
        }
        Object obj = n41Var.f6990p;
        int i2 = n41Var.f6992r;
        int i3 = 0;
        if (i2 == 0) {
            fg1.m1627T(obj);
            byte bM4120g = qb2Var.m4120g((byte) 6);
            if (qb2Var.m4128p() == 4) {
                qb2.m4114m(qb2Var, "Unexpected leading comma", 0, 6);
                throw null;
            }
            linkedHashMap = new LinkedHashMap();
            z40Var2 = z40Var;
            bM4119f = bM4120g;
        } else {
            if (i2 != 1) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i4 = n41Var.f6989o;
            String str = n41Var.f6988n;
            linkedHashMap = n41Var.f6987m;
            c0133dk2 = n41Var.f6986l;
            z40Var2 = n41Var.f6985k;
            fg1.m1627T(obj);
            linkedHashMap.put(str, (j31) obj);
            bM4119f = ((qb2) c0133dk2.f2082j).m4119f();
            if (bM4119f != 4) {
                if (bM4119f != 7) {
                    qb2.m4114m((qb2) c0133dk2.f2082j, "Expected end of the object or comma", 0, 6);
                    throw null;
                }
                qb2 qb2Var2 = (qb2) c0133dk2.f2082j;
                if (bM4119f != 6) {
                    qb2Var2.m4120g((byte) 7);
                } else if (bM4119f == 4) {
                    AbstractC0570p7.m3788x(qb2Var2, "object");
                    throw null;
                }
                return new d41(linkedHashMap);
            }
            i3 = i4;
            c0133dk = c0133dk2;
        }
        qb2 qb2Var3 = (qb2) c0133dk.f2082j;
        if (!qb2Var3.m4116c()) {
            c0133dk2 = c0133dk;
            qb2 qb2Var22 = (qb2) c0133dk2.f2082j;
            if (bM4119f != 6) {
            }
            return new d41(linkedHashMap);
        }
        String strM4123j = qb2Var3.m4123j();
        qb2Var3.m4120g((byte) 5);
        n41Var.f6985k = z40Var2;
        n41Var.f6986l = c0133dk;
        n41Var.f6987m = linkedHashMap;
        n41Var.f6988n = strM4123j;
        n41Var.f6989o = i3;
        n41Var.f6992r = 1;
        z40Var2.getClass();
        z40Var2.f13718i = n41Var;
        return k20.f5323h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01e5, code lost:
    
        if (r8.size() <= 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01e7, code lost:
    
        r0 = new p000.C0780uo(r8, r7);
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
    
        r0 = new p000.C0780uo(r6, r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01fa, code lost:
    
        r0 = new p000.C0780uo(r6, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0200, code lost:
    
        if (r10 == 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0203, code lost:
    
        if (r10 == 2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0205, code lost:
    
        r1 = r0.f11383a;
        r0 = r0.f11384b;
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
    
        r13 = new android.graphics.SweepGradient(r11, r13, r0.f11383a, r0.f11384b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0235, code lost:
    
        if (r23 <= 0.0f) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0237, code lost:
    
        r1 = r0.f11383a;
        r0 = r0.f11384b;
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
    
        return new p000.C0133dk(0, 3, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x026c, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0133dk m1032h(Resources resources, int i, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                return new C0133dk(AbstractC0823vu.m5799b(resources, xml, attributeSetAsAttributeSet, theme).getDefaultColor(), i3, obj);
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        int[] iArr = g52.f3315b;
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
                int[] iArr2 = g52.f3316c;
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

    /* JADX INFO: renamed from: d */
    public void m1033d(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        int i = this.f2081i + 7;
        float[] fArr = (float[]) this.f2082j;
        if (i > fArr.length) {
            this.f2082j = Arrays.copyOf(fArr, Math.max(fArr.length * 2, i));
        }
        float[] fArr2 = (float[]) this.f2082j;
        int i2 = this.f2081i;
        int i3 = i2 + 1;
        this.f2081i = i3;
        fArr2[i2] = f;
        int i4 = i2 + 2;
        this.f2081i = i4;
        fArr2[i3] = f2;
        int i5 = i2 + 3;
        this.f2081i = i5;
        fArr2[i4] = f3;
        int i6 = i2 + 4;
        this.f2081i = i6;
        fArr2[i5] = f4;
        int i7 = i2 + 5;
        this.f2081i = i7;
        fArr2[i6] = f5;
        int i8 = i2 + 6;
        this.f2081i = i8;
        fArr2[i7] = f6;
        this.f2081i = i2 + 7;
        fArr2[i8] = f7;
    }

    /* JADX INFO: renamed from: e */
    public void m1034e(long j) {
        if (m1036g(j)) {
            return;
        }
        int i = this.f2081i;
        long[] jArrCopyOf = (long[]) this.f2082j;
        if (i >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i + 1, jArrCopyOf.length * 2));
            this.f2082j = jArrCopyOf;
        }
        jArrCopyOf[i] = j;
        if (i >= this.f2081i) {
            this.f2081i = i + 1;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m1035f(int i, int i2) {
        v01 v01Var = (v01) this.f2082j;
        int i3 = v01Var.f11588j;
        if (i >= i3) {
            for (int i4 = i - i3; i4 >= 0; i4--) {
                v01Var.m5597e(-1);
            }
        }
        v01Var.m5599g(i, i2);
        int i5 = i2 + 1;
        if (this.f2081i < i5) {
            this.f2081i = i5;
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m1036g(long j) {
        int i = this.f2081i;
        for (int i2 = 0; i2 < i; i2++) {
            if (((long[]) this.f2082j)[i2] == j) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.n92
    /* JADX INFO: renamed from: i */
    public d92 mo422i(d92 d92Var, ov1 ov1Var) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) d92Var.get()).compress((Bitmap.CompressFormat) this.f2082j, this.f2081i, byteArrayOutputStream);
        d92Var.mo192e();
        return new C0842wc(byteArrayOutputStream.toByteArray());
    }

    /* JADX INFO: renamed from: j */
    public void m1037j(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.f2082j;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.f2082j = Arrays.copyOf(cArr, i3);
        }
    }

    @Override // p000.z93
    /* JADX INFO: renamed from: k */
    public int mo736k() {
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public void m1038l(int i, C0846wg c0846wg) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            C0846wg c0846wg2 = ((C0846wg[]) this.f2082j)[i2];
            c0846wg2.getClass();
            if (t11.m5090p(0L, c0846wg.f12503g - c0846wg2.f12503g) <= 0) {
                break;
            }
            c0846wg2.f12502f = i;
            ((C0846wg[]) this.f2082j)[i] = c0846wg2;
            i = i2;
        }
        ((C0846wg[]) this.f2082j)[i] = c0846wg;
        c0846wg.f12502f = i;
    }

    /* JADX INFO: renamed from: m */
    public j31 m1039m() {
        j31 d41Var;
        Object obj;
        qb2 qb2Var = (qb2) this.f2082j;
        byte bM4128p = qb2Var.m4128p();
        if (bM4128p == 1) {
            return m1041o(true);
        }
        if (bM4128p == 0) {
            return m1041o(false);
        }
        if (bM4128p != 6) {
            if (bM4128p == 8) {
                return m1040n();
            }
            qb2.m4114m(qb2Var, "Cannot read Json element because of unexpected ".concat(AbstractC0179eu.m1453d0(bM4128p)), 0, 6);
            throw null;
        }
        int i = this.f2081i + 1;
        this.f2081i = i;
        if (i == 200) {
            m41 m41Var = new m41(this, null);
            z40 z40Var = new z40();
            z40Var.f13717h = m41Var;
            z40Var.f13718i = z40Var;
            k20 k20Var = AbstractC0570p7.f7994c;
            z40Var.f13719j = k20Var;
            while (true) {
                obj = z40Var.f13719j;
                t00 t00Var = z40Var.f13718i;
                if (t00Var == null) {
                    break;
                }
                if (t11.m5086l(k20Var, obj)) {
                    try {
                        m41 m41Var2 = z40Var.f13717h;
                        xe1.m6119f(3, m41Var2);
                        m41 m41Var3 = new m41(m41Var2.f6471l, t00Var);
                        m41Var3.f6470k = z40Var;
                        Object objMo7r = m41Var3.mo7r(a83.f116a);
                        if (objMo7r != k20.f5323h) {
                            t00Var.mo2509h(objMo7r);
                        }
                    } catch (Throwable th) {
                        t00Var.mo2509h(new x92(th));
                    }
                } else {
                    z40Var.f13719j = k20Var;
                    t00Var.mo2509h(obj);
                }
            }
            fg1.m1627T(obj);
            d41Var = (j31) obj;
        } else {
            byte bM4120g = qb2Var.m4120g((byte) 6);
            if (qb2Var.m4128p() == 4) {
                qb2.m4114m(qb2Var, "Unexpected leading comma", 0, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!qb2Var.m4116c()) {
                    break;
                }
                String strM4123j = qb2Var.m4123j();
                qb2Var.m4120g((byte) 5);
                linkedHashMap.put(strM4123j, m1039m());
                bM4120g = qb2Var.m4119f();
                if (bM4120g != 4) {
                    if (bM4120g != 7) {
                        qb2.m4114m(qb2Var, "Expected end of the object or comma", 0, 6);
                        throw null;
                    }
                }
            }
            if (bM4120g == 6) {
                qb2Var.m4120g((byte) 7);
            } else if (bM4120g == 4) {
                AbstractC0570p7.m3788x(qb2Var, "object");
                throw null;
            }
            d41Var = new d41(linkedHashMap);
        }
        this.f2081i--;
        return d41Var;
    }

    /* JADX INFO: renamed from: n */
    public z21 m1040n() {
        qb2 qb2Var = (qb2) this.f2082j;
        byte bM4119f = qb2Var.m4119f();
        if (qb2Var.m4128p() == 4) {
            qb2.m4114m(qb2Var, "Unexpected leading comma", 0, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (qb2Var.m4116c()) {
            arrayList.add(m1039m());
            bM4119f = qb2Var.m4119f();
            if (bM4119f != 4) {
                boolean z = bM4119f == 9;
                int i = qb2Var.f8874b;
                if (!z) {
                    qb2.m4114m(qb2Var, "Expected end of the array or comma", i, 4);
                    throw null;
                }
            }
        }
        if (bM4119f == 8) {
            qb2Var.m4120g((byte) 9);
        } else if (bM4119f == 4) {
            AbstractC0570p7.m3788x(qb2Var, "array");
            throw null;
        }
        return new z21(arrayList);
    }

    /* JADX INFO: renamed from: o */
    public i41 m1041o(boolean z) {
        qb2 qb2Var = (qb2) this.f2082j;
        String strM4124k = !z ? qb2Var.m4124k() : qb2Var.m4123j();
        return (z || !t11.m5086l(strM4124k, "null")) ? new w31(strM4124k, z) : z31.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public void m1042p() {
        C0665rq c0665rq = C0665rq.f9697c;
        char[] cArr = (char[]) this.f2082j;
        c0665rq.getClass();
        cArr.getClass();
        synchronized (c0665rq) {
            int i = c0665rq.f9699b;
            if (cArr.length + i < AbstractC0312ig.f4602a) {
                c0665rq.f9699b = i + cArr.length;
                c0665rq.f9698a.addLast(cArr);
            }
        }
    }

    @Override // p000.x93
    /* JADX INFO: renamed from: q */
    public AbstractC0494nd mo737q(long j, AbstractC0494nd abstractC0494nd, AbstractC0494nd abstractC0494nd2, AbstractC0494nd abstractC0494nd3) {
        return ((kj1) this.f2082j).mo737q(j, abstractC0494nd, abstractC0494nd2, abstractC0494nd3);
    }

    @Override // p000.z93
    /* JADX INFO: renamed from: r */
    public int mo738r() {
        return this.f2081i;
    }

    @Override // p000.x93
    /* JADX INFO: renamed from: s */
    public AbstractC0494nd mo739s(long j, AbstractC0494nd abstractC0494nd, AbstractC0494nd abstractC0494nd2, AbstractC0494nd abstractC0494nd3) {
        return ((kj1) this.f2082j).mo739s(j, abstractC0494nd, abstractC0494nd2, abstractC0494nd3);
    }

    public String toString() {
        switch (this.f2080h) {
            case AIChatConfig.DefaultContextRounds /* 6 */:
                return new String((char[]) this.f2082j, 0, this.f2081i);
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m1043u(long j) {
        int i = this.f2081i;
        int i2 = 0;
        while (i2 < i) {
            if (j == ((long[]) this.f2082j)[i2]) {
                int i3 = this.f2081i - 1;
                while (i2 < i3) {
                    long[] jArr = (long[]) this.f2082j;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.f2081i--;
                return;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: v */
    public void m1044v(C0846wg c0846wg) {
        C0846wg c0846wg2;
        int i = c0846wg.f12502f;
        if (i == -1) {
            C0676s.m4651j("Failed requirement.");
            return;
        }
        int i2 = this.f2081i;
        C0846wg c0846wg3 = ((C0846wg[]) this.f2082j)[i2];
        c0846wg3.getClass();
        c0846wg.f12502f = -1;
        ((C0846wg[]) this.f2082j)[i2] = null;
        this.f2081i = i2 - 1;
        if (c0846wg == c0846wg3) {
            return;
        }
        int iM5090p = t11.m5090p(0L, c0846wg3.f12503g - c0846wg.f12503g);
        if (iM5090p == 0) {
            ((C0846wg[]) this.f2082j)[i] = c0846wg3;
            c0846wg3.f12502f = i;
            return;
        }
        if (iM5090p >= 0) {
            m1038l(i, c0846wg3);
            return;
        }
        while (true) {
            int i3 = i << 1;
            int i4 = i3 + 1;
            int i5 = this.f2081i;
            if (i4 > i5) {
                if (i3 > i5) {
                    break;
                }
                c0846wg2 = ((C0846wg[]) this.f2082j)[i3];
                c0846wg2.getClass();
            } else {
                c0846wg2 = ((C0846wg[]) this.f2082j)[i3];
                c0846wg2.getClass();
                C0846wg c0846wg4 = ((C0846wg[]) this.f2082j)[i4];
                c0846wg4.getClass();
                if (t11.m5090p(0L, c0846wg4.f12503g - c0846wg2.f12503g) >= 0) {
                    c0846wg2 = c0846wg4;
                }
            }
            if (t11.m5090p(0L, c0846wg2.f12503g - c0846wg3.f12503g) <= 0) {
                break;
            }
            int i6 = c0846wg2.f12502f;
            c0846wg2.f12502f = i;
            ((C0846wg[]) this.f2082j)[i] = c0846wg2;
            i = i6;
        }
        ((C0846wg[]) this.f2082j)[i] = c0846wg3;
        c0846wg3.f12502f = i;
    }

    /* JADX INFO: renamed from: w */
    public void m1045w(String str) {
        str.getClass();
        int length = str.length();
        if (length == 0) {
            return;
        }
        m1037j(this.f2081i, length);
        str.getChars(0, str.length(), (char[]) this.f2082j, this.f2081i);
        this.f2081i += length;
    }

    public /* synthetic */ C0133dk(int i, int i2, Object obj) {
        this.f2080h = i2;
        this.f2082j = obj;
        this.f2081i = i;
    }

    public C0133dk(f31 f31Var, qb2 qb2Var) {
        this.f2080h = 7;
        this.f2082j = qb2Var;
    }

    public C0133dk() {
        this.f2080h = 1;
        this.f2082j = Bitmap.CompressFormat.JPEG;
        this.f2081i = 100;
    }

    public C0133dk(int i) {
        this.f2080h = 0;
        this.f2082j = new v01(i);
    }

    public /* synthetic */ C0133dk(byte b, int i) {
        this.f2080h = i;
    }

    public C0133dk(ArrayList arrayList) {
        this.f2080h = 12;
        this.f2082j = arrayList;
    }

    public C0133dk(int i, gd0 gd0Var) {
        this.f2080h = 14;
        this.f2081i = i;
        this.f2082j = new kj1(new xj0(i, gd0Var));
    }

    public C0133dk(String str, int i) {
        this.f2080h = 9;
        this.f2081i = i;
        this.f2082j = str;
    }
}
