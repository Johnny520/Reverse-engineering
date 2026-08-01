package p092S0;

import android.graphics.RectF;
import android.text.Layout;
import java.util.ArrayList;
import p011B4.AbstractC0231b;
import p061L2.AbstractC0973m;
import p076P.C1063I;
import p096T0.C1410j;
import p101U0.C1470e;
import p117X2.AbstractC1665j;
import p120Y0.AbstractC1732a;
import p147d1.EnumC1960j;
import p153e1.C2016l;
import p179i4.AbstractC2352g;
import p204n0.C2684c;
import p211o0.AbstractC2752k;
import p211o0.C2750i;

/* JADX INFO: renamed from: S0.J */
/* JADX INFO: loaded from: classes.dex */
public final class C1257J {

    /* JADX INFO: renamed from: a */
    public final C1256I f4526a;

    /* JADX INFO: renamed from: b */
    public final C1277o f4527b;

    /* JADX INFO: renamed from: c */
    public final long f4528c;

    /* JADX INFO: renamed from: d */
    public final float f4529d;

    /* JADX INFO: renamed from: e */
    public final float f4530e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f4531f;

    public C1257J(C1256I c1256i, C1277o c1277o, long j5) {
        this.f4526a = c1256i;
        this.f4527b = c1277o;
        this.f4528c = j5;
        ArrayList arrayList = c1277o.f4592h;
        float fM2708d = 0.0f;
        this.f4529d = arrayList.isEmpty() ? 0.0f : ((C1279q) arrayList.get(0)).f4595a.f4548d.m2708d(0);
        if (!arrayList.isEmpty()) {
            C1279q c1279q = (C1279q) AbstractC0973m.m2017X(arrayList);
            fM2708d = c1279q.f4595a.f4548d.m2708d(r4.f5045g - 1) + c1279q.f4600f;
        }
        this.f4530e = fM2708d;
        this.f4531f = c1277o.f4591g;
    }

    /* JADX INFO: renamed from: a */
    public final EnumC1960j m2324a(int i5) {
        C1277o c1277o = this.f4527b;
        ArrayList arrayList = c1277o.f4592h;
        c1277o.m2369k(i5);
        C1279q c1279q = (C1279q) arrayList.get(i5 == ((C1269g) c1277o.f4585a.f808a).f4563e.length() ? AbstractC2352g.m4208u(arrayList) : AbstractC1251D.m2315d(i5, arrayList));
        return c1279q.f4595a.f4548d.f5044f.isRtlCharAt(c1279q.m2374d(i5)) ? EnumC1960j.f6637e : EnumC1960j.f6636d;
    }

    /* JADX INFO: renamed from: b */
    public final C2684c m2325b(int i5) {
        float fM2713i;
        float fM2713i2;
        float fM2712h;
        float fM2712h2;
        C1277o c1277o = this.f4527b;
        c1277o.m2368j(i5);
        ArrayList arrayList = c1277o.f4592h;
        C1279q c1279q = (C1279q) arrayList.get(AbstractC1251D.m2315d(i5, arrayList));
        C1263a c1263a = c1279q.f4595a;
        int iM2374d = c1279q.m2374d(i5);
        CharSequence charSequence = c1263a.f4549e;
        if (iM2374d < 0 || iM2374d >= charSequence.length()) {
            StringBuilder sbM404o = AbstractC0231b.m404o(iM2374d, "offset(", ") is out of bounds [0,");
            sbM404o.append(charSequence.length());
            sbM404o.append(')');
            AbstractC1732a.m3085a(sbM404o.toString());
        }
        C1410j c1410j = c1263a.f4548d;
        Layout layout = c1410j.f5044f;
        int lineForOffset = layout.getLineForOffset(iM2374d);
        float fM2711g = c1410j.m2711g(lineForOffset);
        float fM2709e = c1410j.m2709e(lineForOffset);
        boolean z5 = layout.getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iM2374d);
        if (!z5 || zIsRtlCharAt) {
            if (z5 && zIsRtlCharAt) {
                fM2712h = c1410j.m2713i(iM2374d, false);
                fM2712h2 = c1410j.m2713i(iM2374d + 1, true);
            } else if (zIsRtlCharAt) {
                fM2712h = c1410j.m2712h(iM2374d, false);
                fM2712h2 = c1410j.m2712h(iM2374d + 1, true);
            } else {
                fM2713i = c1410j.m2713i(iM2374d, false);
                fM2713i2 = c1410j.m2713i(iM2374d + 1, true);
            }
            float f2 = fM2712h;
            fM2713i = fM2712h2;
            fM2713i2 = f2;
        } else {
            fM2713i = c1410j.m2712h(iM2374d, false);
            fM2713i2 = c1410j.m2712h(iM2374d + 1, true);
        }
        RectF rectF = new RectF(fM2713i, fM2711g, fM2713i2, fM2709e);
        return c1279q.m2371a(new C2684c(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    /* JADX INFO: renamed from: c */
    public final C2684c m2326c(int i5) {
        C1277o c1277o = this.f4527b;
        ArrayList arrayList = c1277o.f4592h;
        c1277o.m2369k(i5);
        C1279q c1279q = (C1279q) arrayList.get(i5 == ((C1269g) c1277o.f4585a.f808a).f4563e.length() ? AbstractC2352g.m4208u(arrayList) : AbstractC1251D.m2315d(i5, arrayList));
        C1263a c1263a = c1279q.f4595a;
        int iM2374d = c1279q.m2374d(i5);
        CharSequence charSequence = c1263a.f4549e;
        C1410j c1410j = c1263a.f4548d;
        if (iM2374d < 0 || iM2374d > charSequence.length()) {
            StringBuilder sbM404o = AbstractC0231b.m404o(iM2374d, "offset(", ") is out of bounds [0,");
            sbM404o.append(charSequence.length());
            sbM404o.append(']');
            AbstractC1732a.m3085a(sbM404o.toString());
        }
        float fM2712h = c1410j.m2712h(iM2374d, false);
        int lineForOffset = c1410j.f5044f.getLineForOffset(iM2374d);
        return c1279q.m2371a(new C2684c(fM2712h, c1410j.m2711g(lineForOffset), fM2712h, c1410j.m2709e(lineForOffset)));
    }

    /* JADX INFO: renamed from: d */
    public final float m2327d(int i5) {
        C1277o c1277o = this.f4527b;
        c1277o.m2370l(i5);
        ArrayList arrayList = c1277o.f4592h;
        C1279q c1279q = (C1279q) arrayList.get(AbstractC1251D.m2316e(i5, arrayList));
        C1263a c1263a = c1279q.f4595a;
        int i6 = i5 - c1279q.f4598d;
        C1410j c1410j = c1263a.f4548d;
        return c1410j.f5044f.getLineLeft(i6) + (i6 == c1410j.f5045g + (-1) ? c1410j.f5048j : 0.0f);
    }

    /* JADX INFO: renamed from: e */
    public final float m2328e(int i5) {
        C1277o c1277o = this.f4527b;
        c1277o.m2370l(i5);
        ArrayList arrayList = c1277o.f4592h;
        C1279q c1279q = (C1279q) arrayList.get(AbstractC1251D.m2316e(i5, arrayList));
        C1263a c1263a = c1279q.f4595a;
        int i6 = i5 - c1279q.f4598d;
        C1410j c1410j = c1263a.f4548d;
        return c1410j.f5044f.getLineRight(i6) + (i6 == c1410j.f5045g + (-1) ? c1410j.f5049k : 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1257J)) {
            return false;
        }
        C1257J c1257j = (C1257J) obj;
        return AbstractC1665j.m2981a(this.f4526a, c1257j.f4526a) && this.f4527b.equals(c1257j.f4527b) && C2016l.m3704a(this.f4528c, c1257j.f4528c) && this.f4529d == c1257j.f4529d && this.f4530e == c1257j.f4530e && AbstractC1665j.m2981a(this.f4531f, c1257j.f4531f);
    }

    /* JADX INFO: renamed from: f */
    public final int m2329f(int i5) {
        C1277o c1277o = this.f4527b;
        c1277o.m2370l(i5);
        ArrayList arrayList = c1277o.f4592h;
        C1279q c1279q = (C1279q) arrayList.get(AbstractC1251D.m2316e(i5, arrayList));
        C1263a c1263a = c1279q.f4595a;
        return c1263a.f4548d.f5044f.getLineStart(i5 - c1279q.f4598d) + c1279q.f4596b;
    }

    /* JADX INFO: renamed from: g */
    public final EnumC1960j m2330g(int i5) {
        C1277o c1277o = this.f4527b;
        ArrayList arrayList = c1277o.f4592h;
        c1277o.m2369k(i5);
        C1279q c1279q = (C1279q) arrayList.get(i5 == ((C1269g) c1277o.f4585a.f808a).f4563e.length() ? AbstractC2352g.m4208u(arrayList) : AbstractC1251D.m2315d(i5, arrayList));
        C1263a c1263a = c1279q.f4595a;
        int iM2374d = c1279q.m2374d(i5);
        C1410j c1410j = c1263a.f4548d;
        return c1410j.f5044f.getParagraphDirection(c1410j.f5044f.getLineForOffset(iM2374d)) == 1 ? EnumC1960j.f6636d : EnumC1960j.f6637e;
    }

    /* JADX INFO: renamed from: h */
    public final C2750i m2331h(int i5, int i6) {
        C1277o c1277o = this.f4527b;
        C1269g c1269g = (C1269g) c1277o.f4585a.f808a;
        if (i5 < 0 || i5 > i6 || i6 > c1269g.f4563e.length()) {
            AbstractC1732a.m3085a("Start(" + i5 + ") or End(" + i6 + ") is out of range [0.." + c1269g.f4563e.length() + "), or start > end!");
        }
        if (i5 == i6) {
            return AbstractC2752k.m4885a();
        }
        C2750i c2750iM4885a = AbstractC2752k.m4885a();
        AbstractC1251D.m2318g(c1277o.f4592h, AbstractC1251D.m2313b(i5, i6), new C1063I(i5, i6, 3, c2750iM4885a));
        return c2750iM4885a;
    }

    public final int hashCode() {
        return this.f4531f.hashCode() + AbstractC0231b.m390a(this.f4530e, AbstractC0231b.m390a(this.f4529d, AbstractC0231b.m392c((this.f4527b.hashCode() + (this.f4526a.hashCode() * 31)) * 31, 31, this.f4528c), 31), 31);
    }

    /* JADX INFO: renamed from: i */
    public final long m2332i(int i5) {
        int iM2746j;
        int iM2745i;
        int iM2745i2;
        C1277o c1277o = this.f4527b;
        ArrayList arrayList = c1277o.f4592h;
        c1277o.m2369k(i5);
        C1279q c1279q = (C1279q) arrayList.get(i5 == ((C1269g) c1277o.f4585a.f808a).f4563e.length() ? AbstractC2352g.m4208u(arrayList) : AbstractC1251D.m2315d(i5, arrayList));
        C1263a c1263a = c1279q.f4595a;
        int iM2374d = c1279q.m2374d(i5);
        C1470e c1470eM2714j = c1263a.f4548d.m2714j();
        if (c1470eM2714j.m2744h(c1470eM2714j.m2746j(iM2374d))) {
            c1470eM2714j.m2737a(iM2374d);
            iM2746j = iM2374d;
            while (iM2746j != -1 && (!c1470eM2714j.m2744h(iM2746j) || c1470eM2714j.m2740d(iM2746j))) {
                iM2746j = c1470eM2714j.m2746j(iM2746j);
            }
        } else {
            c1470eM2714j.m2737a(iM2374d);
            iM2746j = c1470eM2714j.m2743g(iM2374d) ? (!c1470eM2714j.m2741e(iM2374d) || c1470eM2714j.m2739c(iM2374d)) ? c1470eM2714j.m2746j(iM2374d) : iM2374d : c1470eM2714j.m2739c(iM2374d) ? c1470eM2714j.m2746j(iM2374d) : -1;
        }
        if (iM2746j == -1) {
            iM2746j = iM2374d;
        }
        if (c1470eM2714j.m2740d(c1470eM2714j.m2745i(iM2374d))) {
            c1470eM2714j.m2737a(iM2374d);
            iM2745i = iM2374d;
            while (iM2745i != -1 && (c1470eM2714j.m2744h(iM2745i) || !c1470eM2714j.m2740d(iM2745i))) {
                iM2745i = c1470eM2714j.m2745i(iM2745i);
            }
        } else {
            c1470eM2714j.m2737a(iM2374d);
            if (c1470eM2714j.m2739c(iM2374d)) {
                if (!c1470eM2714j.m2741e(iM2374d) || c1470eM2714j.m2743g(iM2374d)) {
                    iM2745i2 = c1470eM2714j.m2745i(iM2374d);
                    iM2745i = iM2745i2;
                } else {
                    iM2745i = iM2374d;
                }
            } else if (c1470eM2714j.m2743g(iM2374d)) {
                iM2745i2 = c1470eM2714j.m2745i(iM2374d);
                iM2745i = iM2745i2;
            } else {
                iM2745i = -1;
            }
        }
        if (iM2745i != -1) {
            iM2374d = iM2745i;
        }
        return c1279q.m2372b(AbstractC1251D.m2313b(iM2746j, iM2374d), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f4526a + ", multiParagraph=" + this.f4527b + ", size=" + ((Object) C2016l.m3705b(this.f4528c)) + ", firstBaseline=" + this.f4529d + ", lastBaseline=" + this.f4530e + ", placeholderRects=" + this.f4531f + ')';
    }
}
