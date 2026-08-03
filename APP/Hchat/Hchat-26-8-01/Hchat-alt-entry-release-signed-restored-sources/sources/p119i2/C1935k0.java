package p119i2;

import android.graphics.RectF;
import android.text.Layout;
import gg.AbstractC1416l;
import java.util.ArrayList;
import p000a.AbstractC0000a;
import p035c8.C0412a;
import p057e1.C0808c;
import p068eh.AbstractC0921a;
import p071f1.AbstractC1013l;
import p071f1.C1009j;
import p133j2.C2061k;
import p204o2.AbstractC3042a;
import p280t2.EnumC4094j;
import p293u2.C4242l;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: i2.k0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1935k0 {

    /* JADX INFO: renamed from: a */
    public final C1933j0 f6561a;

    /* JADX INFO: renamed from: b */
    public final C1942o f6562b;

    /* JADX INFO: renamed from: c */
    public final long f6563c;

    /* JADX INFO: renamed from: d */
    public final float f6564d;

    /* JADX INFO: renamed from: e */
    public final float f6565e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f6566f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1935k0(C1933j0 c1933j0, C1942o c1942o, long j3) {
        this.f6561a = c1933j0;
        this.f6562b = c1942o;
        this.f6563c = j3;
        ArrayList arrayList = c1942o.f6590h;
        float fM5112d = 0.0f;
        this.f6564d = arrayList.isEmpty() ? 0.0f : ((C1947r) arrayList.get(0)).f6596a.f6459d.m5112d(0);
        if (!arrayList.isEmpty()) {
            C1947r c1947r = (C1947r) AbstractC4166m.m8393B1(arrayList);
            fM5112d = c1947r.f6596a.f6459d.m5112d(r4.f6921g - 1) + c1947r.f6601f;
        }
        this.f6565e = fM5112d;
        this.f6566f = c1942o.f6589g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final EnumC4094j m4801a(int i9) {
        C1942o c1942o = this.f6562b;
        c1942o.m4833l(i9);
        int length = ((C1926g) c1942o.f6583a.f839b).f6529h.length();
        ArrayList arrayList = c1942o.f6590h;
        C1947r c1947r = (C1947r) arrayList.get(i9 == length ? AbstractC0000a.m54b0(arrayList) : AbstractC1923e0.m4786d(i9, arrayList));
        return c1947r.f6596a.f6459d.f6920f.isRtlCharAt(c1947r.m4838d(i9)) ? EnumC4094j.f13555h : EnumC4094j.f13554g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C0808c m4802b(int i9) {
        float fM5117i;
        float fM5117i2;
        float fM5116h;
        float fM5116h2;
        C1942o c1942o = this.f6562b;
        c1942o.m4832k(i9);
        ArrayList arrayList = c1942o.f6590h;
        C1947r c1947r = (C1947r) arrayList.get(AbstractC1923e0.m4786d(i9, arrayList));
        C1914a c1914a = c1947r.f6596a;
        int iM4838d = c1947r.m4838d(i9);
        CharSequence charSequence = c1914a.f6460e;
        if (iM4838d < 0 || iM4838d >= charSequence.length()) {
            StringBuilder sbM2257t = AbstractC0921a.m2257t(iM4838d, "offset(", ") is out of bounds [0,");
            sbM2257t.append(charSequence.length());
            sbM2257t.append(')');
            AbstractC3042a.m6486a(sbM2257t.toString());
        }
        C2061k c2061k = c1914a.f6459d;
        Layout layout = c2061k.f6920f;
        int lineForOffset = layout.getLineForOffset(iM4838d);
        float fM5115g = c2061k.m5115g(lineForOffset);
        float fM5113e = c2061k.m5113e(lineForOffset);
        boolean z9 = layout.getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iM4838d);
        if (!z9 || zIsRtlCharAt) {
            if (z9 && zIsRtlCharAt) {
                fM5116h = c2061k.m5117i(iM4838d, false);
                fM5116h2 = c2061k.m5117i(iM4838d + 1, true);
            } else if (zIsRtlCharAt) {
                fM5116h = c2061k.m5116h(iM4838d, false);
                fM5116h2 = c2061k.m5116h(iM4838d + 1, true);
            } else {
                fM5117i = c2061k.m5117i(iM4838d, false);
                fM5117i2 = c2061k.m5117i(iM4838d + 1, true);
            }
            float f3 = fM5116h;
            fM5117i = fM5116h2;
            fM5117i2 = f3;
        } else {
            fM5117i = c2061k.m5116h(iM4838d, false);
            fM5117i2 = c2061k.m5116h(iM4838d + 1, true);
        }
        RectF rectF = new RectF(fM5117i, fM5115g, fM5117i2, fM5113e);
        return c1947r.m4835a(new C0808c(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final C0808c m4803c(int i9) {
        C1942o c1942o = this.f6562b;
        c1942o.m4833l(i9);
        int length = ((C1926g) c1942o.f6583a.f839b).f6529h.length();
        ArrayList arrayList = c1942o.f6590h;
        C1947r c1947r = (C1947r) arrayList.get(i9 == length ? AbstractC0000a.m54b0(arrayList) : AbstractC1923e0.m4786d(i9, arrayList));
        C1914a c1914a = c1947r.f6596a;
        int iM4838d = c1947r.m4838d(i9);
        CharSequence charSequence = c1914a.f6460e;
        C2061k c2061k = c1914a.f6459d;
        if (iM4838d < 0 || iM4838d > charSequence.length()) {
            StringBuilder sbM2257t = AbstractC0921a.m2257t(iM4838d, "offset(", ") is out of bounds [0,");
            sbM2257t.append(charSequence.length());
            sbM2257t.append(']');
            AbstractC3042a.m6486a(sbM2257t.toString());
        }
        float fM5116h = c2061k.m5116h(iM4838d, false);
        int lineForOffset = c2061k.f6920f.getLineForOffset(iM4838d);
        return c1947r.m4835a(new C0808c(fM5116h, c2061k.m5115g(lineForOffset), fM5116h, c2061k.m5113e(lineForOffset)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m4804d() {
        long j3 = this.f6563c;
        float f3 = (int) (j3 >> 32);
        C1942o c1942o = this.f6562b;
        return f3 < c1942o.f6586d || c1942o.f6585c || ((float) ((int) (j3 & 4294967295L))) < c1942o.f6587e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final float m4805e(int i9) {
        C1942o c1942o = this.f6562b;
        c1942o.m4834m(i9);
        ArrayList arrayList = c1942o.f6590h;
        C1947r c1947r = (C1947r) arrayList.get(AbstractC1923e0.m4787e(i9, arrayList));
        C1914a c1914a = c1947r.f6596a;
        int i10 = i9 - c1947r.f6599d;
        C2061k c2061k = c1914a.f6459d;
        return c2061k.f6920f.getLineLeft(i10) + (i10 == c2061k.f6921g + (-1) ? c2061k.f6924j : 0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1935k0)) {
            return false;
        }
        C1935k0 c1935k0 = (C1935k0) obj;
        return AbstractC1416l.m3825a(this.f6561a, c1935k0.f6561a) && this.f6562b.equals(c1935k0.f6562b) && C4242l.m8534a(this.f6563c, c1935k0.f6563c) && this.f6564d == c1935k0.f6564d && this.f6565e == c1935k0.f6565e && AbstractC1416l.m3825a(this.f6566f, c1935k0.f6566f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final float m4806f(int i9) {
        C1942o c1942o = this.f6562b;
        c1942o.m4834m(i9);
        ArrayList arrayList = c1942o.f6590h;
        C1947r c1947r = (C1947r) arrayList.get(AbstractC1923e0.m4787e(i9, arrayList));
        C1914a c1914a = c1947r.f6596a;
        int i10 = i9 - c1947r.f6599d;
        C2061k c2061k = c1914a.f6459d;
        return c2061k.f6920f.getLineRight(i10) + (i10 == c2061k.f6921g + (-1) ? c2061k.f6925k : 0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final int m4807g(int i9) {
        C1942o c1942o = this.f6562b;
        c1942o.m4834m(i9);
        ArrayList arrayList = c1942o.f6590h;
        C1947r c1947r = (C1947r) arrayList.get(AbstractC1923e0.m4787e(i9, arrayList));
        C1914a c1914a = c1947r.f6596a;
        return c1914a.f6459d.f6920f.getLineStart(i9 - c1947r.f6599d) + c1947r.f6597b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final EnumC4094j m4808h(int i9) {
        C1942o c1942o = this.f6562b;
        c1942o.m4833l(i9);
        int length = ((C1926g) c1942o.f6583a.f839b).f6529h.length();
        ArrayList arrayList = c1942o.f6590h;
        C1947r c1947r = (C1947r) arrayList.get(i9 == length ? AbstractC0000a.m54b0(arrayList) : AbstractC1923e0.m4786d(i9, arrayList));
        C1914a c1914a = c1947r.f6596a;
        int iM4838d = c1947r.m4838d(i9);
        C2061k c2061k = c1914a.f6459d;
        return c2061k.f6920f.getParagraphDirection(c2061k.f6920f.getLineForOffset(iM4838d)) == 1 ? EnumC4094j.f13554g : EnumC4094j.f13555h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f6566f.hashCode() + AbstractC0921a.m2241d(this.f6565e, AbstractC0921a.m2241d(this.f6564d, AbstractC0921a.m2243f((this.f6562b.hashCode() + (this.f6561a.hashCode() * 31)) * 31, 31, this.f6563c), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final C1009j m4809i(int i9, int i10) {
        C1942o c1942o = this.f6562b;
        C1926g c1926g = (C1926g) c1942o.f6583a.f839b;
        if (i9 < 0 || i9 > i10 || i10 > c1926g.f6529h.length()) {
            StringBuilder sbM2256s = AbstractC0921a.m2256s(i9, i10, "Start(", ") or End(", ") is out of range [0..");
            sbM2256s.append(c1926g.f6529h.length());
            sbM2256s.append("), or start > end!");
            AbstractC3042a.m6486a(sbM2256s.toString());
        }
        if (i9 == i10) {
            return AbstractC1013l.m2609a();
        }
        C1009j c1009jM2609a = AbstractC1013l.m2609a();
        AbstractC1923e0.m4789g(c1942o.f6590h, AbstractC1923e0.m4784b(i9, i10), new C1940n(c1009jM2609a, i9, i10));
        return c1009jM2609a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final long m4810j(int i9) {
        int iM1381j;
        int iM1380i;
        int iM1380i2;
        C1942o c1942o = this.f6562b;
        c1942o.m4833l(i9);
        int length = ((C1926g) c1942o.f6583a.f839b).f6529h.length();
        ArrayList arrayList = c1942o.f6590h;
        C1947r c1947r = (C1947r) arrayList.get(i9 == length ? AbstractC0000a.m54b0(arrayList) : AbstractC1923e0.m4786d(i9, arrayList));
        C1914a c1914a = c1947r.f6596a;
        int iM4838d = c1947r.m4838d(i9);
        C0412a c0412aM5118j = c1914a.f6459d.m5118j();
        if (c0412aM5118j.m1379h(c0412aM5118j.m1381j(iM4838d))) {
            c0412aM5118j.m1372a(iM4838d);
            iM1381j = iM4838d;
            while (iM1381j != -1 && (!c0412aM5118j.m1379h(iM1381j) || c0412aM5118j.m1375d(iM1381j))) {
                iM1381j = c0412aM5118j.m1381j(iM1381j);
            }
        } else {
            c0412aM5118j.m1372a(iM4838d);
            iM1381j = c0412aM5118j.m1378g(iM4838d) ? (!c0412aM5118j.m1376e(iM4838d) || c0412aM5118j.m1374c(iM4838d)) ? c0412aM5118j.m1381j(iM4838d) : iM4838d : c0412aM5118j.m1374c(iM4838d) ? c0412aM5118j.m1381j(iM4838d) : -1;
        }
        if (iM1381j == -1) {
            iM1381j = iM4838d;
        }
        if (c0412aM5118j.m1375d(c0412aM5118j.m1380i(iM4838d))) {
            c0412aM5118j.m1372a(iM4838d);
            iM1380i = iM4838d;
            while (iM1380i != -1 && (c0412aM5118j.m1379h(iM1380i) || !c0412aM5118j.m1375d(iM1380i))) {
                iM1380i = c0412aM5118j.m1380i(iM1380i);
            }
        } else {
            c0412aM5118j.m1372a(iM4838d);
            if (c0412aM5118j.m1374c(iM4838d)) {
                if (!c0412aM5118j.m1376e(iM4838d) || c0412aM5118j.m1378g(iM4838d)) {
                    iM1380i2 = c0412aM5118j.m1380i(iM4838d);
                    iM1380i = iM1380i2;
                } else {
                    iM1380i = iM4838d;
                }
            } else if (c0412aM5118j.m1378g(iM4838d)) {
                iM1380i2 = c0412aM5118j.m1380i(iM4838d);
                iM1380i = iM1380i2;
            } else {
                iM1380i = -1;
            }
        }
        if (iM1380i != -1) {
            iM4838d = iM1380i;
        }
        return c1947r.m4836b(AbstractC1923e0.m4784b(iM1381j, iM4838d), false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f6561a + ", multiParagraph=" + this.f6562b + ", size=" + ((Object) C4242l.m8535b(this.f6563c)) + ", firstBaseline=" + this.f6564d + ", lastBaseline=" + this.f6565e + ", placeholderRects=" + this.f6566f + ')';
    }
}
