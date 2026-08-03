package p119i2;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import be.C0289k;
import gg.C1422r;
import gg.C1423s;
import java.util.ArrayList;
import java.util.List;
import okio.C3193a;
import p000a.AbstractC0000a;
import p057e1.C0808c;
import p068eh.AbstractC0921a;
import p071f1.AbstractC1022p0;
import p071f1.AbstractC1027s;
import p071f1.C1024q0;
import p071f1.C1029t;
import p071f1.C1030t0;
import p071f1.InterfaceC1031u;
import p089g1.C1275d;
import p101h1.AbstractC1566c;
import p109hb.C1672c0;
import p133j2.AbstractC2062l;
import p133j2.C2061k;
import p204o2.AbstractC3042a;
import p237q2.AbstractC3436j;
import p237q2.C3430d;
import p280t2.C4096l;
import p293u2.AbstractC4232b;
import p293u2.C4231a;
import tf.AbstractC4166m;
import tf.AbstractC4171r;

/* JADX INFO: renamed from: i2.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1942o {

    /* JADX INFO: renamed from: a */
    public final C0289k f6583a;

    /* JADX INFO: renamed from: b */
    public final int f6584b;

    /* JADX INFO: renamed from: c */
    public final boolean f6585c;

    /* JADX INFO: renamed from: d */
    public final float f6586d;

    /* JADX INFO: renamed from: e */
    public final float f6587e;

    /* JADX INFO: renamed from: f */
    public final int f6588f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f6589g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f6590h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public C1942o(C0289k c0289k, long j3, int i9, int i10) {
        int i11;
        boolean z9;
        int i12;
        int iM8503g;
        int i13;
        this.f6583a = c0289k;
        this.f6584b = i9;
        if (C4231a.m8506j(j3) != 0 || C4231a.m8505i(j3) != 0) {
            AbstractC3042a.m6486a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) c0289k.f838a;
        int size = arrayList2.size();
        float f3 = 0.0f;
        int i14 = 0;
        int i15 = 0;
        while (i14 < size) {
            C1948s c1948s = (C1948s) arrayList2.get(i14);
            C3430d c3430d = c1948s.f6603a;
            int iM8504h = C4231a.m8504h(j3);
            if (C4231a.m8499c(j3)) {
                i12 = i14;
                iM8503g = C4231a.m8503g(j3) - ((int) Math.ceil(f3));
                if (iM8503g < 0) {
                    iM8503g = 0;
                }
            } else {
                i12 = i14;
                iM8503g = C4231a.m8503g(j3);
            }
            i11 = 0;
            C1914a c1914a = new C1914a(c3430d, this.f6584b - i15, i10, AbstractC4232b.m8509b(0, iM8504h, 0, iM8503g, 5));
            float fM4767b = c1914a.m4767b() + f3;
            C2061k c2061k = c1914a.f6459d;
            int i16 = i15 + c2061k.f6921g;
            arrayList.add(new C1947r(c1914a, c1948s.f6604b, c1948s.f6605c, i15, i16, f3, fM4767b));
            if (!c2061k.f6918d) {
                if (i16 == this.f6584b) {
                    i13 = i12;
                    if (i13 != AbstractC0000a.m54b0((ArrayList) this.f6583a.f838a)) {
                    }
                } else {
                    i13 = i12;
                }
                i14 = i13 + 1;
                i15 = i16;
                f3 = fM4767b;
            }
            z9 = true;
            i15 = i16;
            f3 = fM4767b;
            break;
        }
        i11 = 0;
        z9 = false;
        this.f6587e = f3;
        this.f6588f = i15;
        this.f6585c = z9;
        this.f6590h = arrayList;
        this.f6586d = C4231a.m8504h(j3);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i17 = i11; i17 < size2; i17++) {
            C1947r c1947r = (C1947r) arrayList.get(i17);
            ?? r82 = c1947r.f6596a.f6461f;
            ArrayList arrayList4 = new ArrayList(r82.size());
            int size3 = r82.size();
            for (int i18 = i11; i18 < size3; i18++) {
                C0808c c0808c = (C0808c) r82.get(i18);
                arrayList4.add(c0808c != null ? c1947r.m4835a(c0808c) : null);
            }
            AbstractC4171r.m8432h1(arrayList3, arrayList4);
        }
        if (arrayList3.size() < ((List) this.f6583a.f840c).size()) {
            int size4 = ((List) this.f6583a.f840c).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i19 = i11; i19 < size4; i19++) {
                arrayList5.add(null);
            }
            arrayList3 = AbstractC4166m.m8397F1(arrayList3, arrayList5);
        }
        this.f6589g = arrayList3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m4822i(C1942o c1942o, InterfaceC1031u interfaceC1031u, long j3, C1024q0 c1024q0, C4096l c4096l, AbstractC1566c abstractC1566c) {
        interfaceC1031u.mo2487e();
        ArrayList arrayList = c1942o.f6590h;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            C1947r c1947r = (C1947r) arrayList.get(i9);
            c1947r.f6596a.m4771f(interfaceC1031u, j3, c1024q0, c4096l, abstractC1566c);
            interfaceC1031u.mo2494m(0.0f, c1947r.f6596a.m4767b());
        }
        interfaceC1031u.mo2497p();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static void m4823j(C1942o c1942o, InterfaceC1031u interfaceC1031u, AbstractC1027s abstractC1027s, float f3, C1024q0 c1024q0, C4096l c4096l, AbstractC1566c abstractC1566c) {
        interfaceC1031u.mo2487e();
        ArrayList arrayList = c1942o.f6590h;
        if (arrayList.size() <= 1 || (abstractC1027s instanceof C1030t0)) {
            AbstractC3436j.m7210b(c1942o, interfaceC1031u, abstractC1027s, f3, c1024q0, c4096l, abstractC1566c);
        } else {
            if (!(abstractC1027s instanceof AbstractC1022p0)) {
                C3193a.m6822k();
                return;
            }
            int size = arrayList.size();
            float fMax = 0.0f;
            float fM4767b = 0.0f;
            for (int i9 = 0; i9 < size; i9++) {
                C1947r c1947r = (C1947r) arrayList.get(i9);
                fM4767b += c1947r.f6596a.m4767b();
                fMax = Math.max(fMax, c1947r.f6596a.m4769d());
            }
            Shader shaderMo2592b = ((AbstractC1022p0) abstractC1027s).mo2592b((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fM4767b)) & 4294967295L));
            Matrix matrix = new Matrix();
            shaderMo2592b.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i10 = 0; i10 < size2; i10++) {
                C1914a c1914a = ((C1947r) arrayList.get(i10)).f6596a;
                c1914a.m4772g(interfaceC1031u, new C1029t(shaderMo2592b), f3, c1024q0, c4096l, abstractC1566c);
                interfaceC1031u.mo2494m(0.0f, c1914a.m4767b());
                matrix.setTranslate(0.0f, -c1914a.m4767b());
                shaderMo2592b.setLocalMatrix(matrix);
            }
        }
        interfaceC1031u.mo2497p();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m4824a(long j3, float[] fArr) {
        m4832k(C1939m0.m4816f(j3));
        m4833l(C1939m0.m4815e(j3));
        C1423s c1423s = new C1423s();
        c1423s.f4736g = 0;
        AbstractC1923e0.m4789g(this.f6590h, j3, new C1672c0(j3, fArr, c1423s, new C1422r()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final float m4825b(int i9) {
        m4834m(i9);
        ArrayList arrayList = this.f6590h;
        C1947r c1947r = (C1947r) arrayList.get(AbstractC1923e0.m4787e(i9, arrayList));
        C1914a c1914a = c1947r.f6596a;
        return c1914a.f6459d.m5113e(i9 - c1947r.f6599d) + c1947r.f6601f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final int m4826c(int i9, boolean z9) {
        int iM5114f;
        m4834m(i9);
        ArrayList arrayList = this.f6590h;
        C1947r c1947r = (C1947r) arrayList.get(AbstractC1923e0.m4787e(i9, arrayList));
        C1914a c1914a = c1947r.f6596a;
        int i10 = i9 - c1947r.f6599d;
        C2061k c2061k = c1914a.f6459d;
        if (z9) {
            Layout layout = c2061k.f6920f;
            ThreadLocal threadLocal = AbstractC2062l.f6932a;
            if (layout.getEllipsisCount(i10) <= 0 || c2061k.f6916b != TextUtils.TruncateAt.END) {
                C0289k c0289kM5111c = c2061k.m5111c();
                Layout layout2 = (Layout) c0289kM5111c.f839b;
                iM5114f = c0289kM5111c.m1203l(layout2.getLineEnd(i10), layout2.getLineStart(i10));
            } else {
                iM5114f = layout.getEllipsisStart(i10) + layout.getLineStart(i10);
            }
        } else {
            iM5114f = c2061k.m5114f(i10);
        }
        return iM5114f + c1947r.f6597b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final int m4827d(int i9) {
        int length = ((C1926g) this.f6583a.f839b).f6529h.length();
        ArrayList arrayList = this.f6590h;
        C1947r c1947r = (C1947r) arrayList.get(i9 >= length ? AbstractC0000a.m54b0(arrayList) : i9 < 0 ? 0 : AbstractC1923e0.m4786d(i9, arrayList));
        return c1947r.f6596a.f6459d.f6920f.getLineForOffset(c1947r.m4838d(i9)) + c1947r.f6599d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final int m4828e(float f3) {
        ArrayList arrayList = this.f6590h;
        C1947r c1947r = (C1947r) arrayList.get(AbstractC1923e0.m4788f(arrayList, f3));
        int i9 = c1947r.f6598c - c1947r.f6597b;
        int i10 = c1947r.f6599d;
        if (i9 == 0) {
            return i10;
        }
        C1914a c1914a = c1947r.f6596a;
        float f10 = f3 - c1947r.f6601f;
        C2061k c2061k = c1914a.f6459d;
        return c2061k.f6920f.getLineForVertical(((int) f10) - c2061k.f6922h) + i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final float m4829f(int i9) {
        m4834m(i9);
        ArrayList arrayList = this.f6590h;
        C1947r c1947r = (C1947r) arrayList.get(AbstractC1923e0.m4787e(i9, arrayList));
        C1914a c1914a = c1947r.f6596a;
        return c1914a.f6459d.m5115g(i9 - c1947r.f6599d) + c1947r.f6601f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final int m4830g(long j3) {
        int i9 = (int) (j3 & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i9);
        ArrayList arrayList = this.f6590h;
        C1947r c1947r = (C1947r) arrayList.get(AbstractC1923e0.m4788f(arrayList, fIntBitsToFloat));
        int i10 = c1947r.f6598c;
        int i11 = c1947r.f6597b;
        if (i10 - i11 == 0) {
            return i11;
        }
        C1914a c1914a = c1947r.f6596a;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i9) - c1947r.f6601f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32);
        C2061k c2061k = c1914a.f6459d;
        int lineForVertical = c2061k.f6920f.getLineForVertical(((int) Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits))) - c2061k.f6922h);
        return c2061k.f6920f.getOffsetForHorizontal(lineForVertical, (c2061k.m5110b(lineForVertical) * (-1)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))) + i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final long m4831h(C0808c c0808c, int i9, C1275d c1275d) {
        long jM4836b;
        long j3;
        float f3 = c0808c.f2417b;
        ArrayList arrayList = this.f6590h;
        int iM4788f = AbstractC1923e0.m4788f(arrayList, f3);
        float f10 = ((C1947r) arrayList.get(iM4788f)).f6602g;
        float f11 = c0808c.f2419d;
        if (f10 >= f11 || iM4788f == AbstractC0000a.m54b0(arrayList)) {
            C1947r c1947r = (C1947r) arrayList.get(iM4788f);
            return c1947r.m4836b(c1947r.f6596a.m4768c(c1947r.m4837c(c0808c), i9, c1275d), true);
        }
        int iM4788f2 = AbstractC1923e0.m4788f(arrayList, f11);
        long jM4836b2 = C1939m0.f6573b;
        while (true) {
            jM4836b = C1939m0.f6573b;
            if (!C1939m0.m4812b(jM4836b2, jM4836b) || iM4788f > iM4788f2) {
                break;
            }
            C1947r c1947r2 = (C1947r) arrayList.get(iM4788f);
            jM4836b2 = c1947r2.m4836b(c1947r2.f6596a.m4768c(c1947r2.m4837c(c0808c), i9, c1275d), true);
            iM4788f++;
        }
        if (C1939m0.m4812b(jM4836b2, jM4836b)) {
            return jM4836b;
        }
        while (true) {
            j3 = C1939m0.f6573b;
            if (!C1939m0.m4812b(jM4836b, j3) || iM4788f > iM4788f2) {
                break;
            }
            C1947r c1947r3 = (C1947r) arrayList.get(iM4788f2);
            jM4836b = c1947r3.m4836b(c1947r3.f6596a.m4768c(c1947r3.m4837c(c0808c), i9, c1275d), true);
            iM4788f2--;
        }
        return C1939m0.m4812b(jM4836b, j3) ? jM4836b2 : AbstractC1923e0.m4784b((int) (jM4836b2 >> 32), (int) (4294967295L & jM4836b));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m4832k(int i9) {
        C1926g c1926g = (C1926g) this.f6583a.f839b;
        if (i9 < 0 || i9 >= c1926g.f6529h.length()) {
            StringBuilder sbM2257t = AbstractC0921a.m2257t(i9, "offset(", ") is out of bounds [0, ");
            sbM2257t.append(c1926g.f6529h.length());
            sbM2257t.append(')');
            AbstractC3042a.m6486a(sbM2257t.toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m4833l(int i9) {
        C1926g c1926g = (C1926g) this.f6583a.f839b;
        if (i9 < 0 || i9 > c1926g.f6529h.length()) {
            StringBuilder sbM2257t = AbstractC0921a.m2257t(i9, "offset(", ") is out of bounds [0, ");
            sbM2257t.append(c1926g.f6529h.length());
            sbM2257t.append(']');
            AbstractC3042a.m6486a(sbM2257t.toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m4834m(int i9) {
        boolean z9 = false;
        int i10 = this.f6588f;
        if (i9 >= 0 && i9 < i10) {
            z9 = true;
        }
        if (z9) {
            return;
        }
        AbstractC3042a.m6486a("lineIndex(" + i9 + ") is out of bounds [0, " + i10 + ')');
    }
}
