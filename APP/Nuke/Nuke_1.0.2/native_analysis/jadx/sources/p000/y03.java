package p000;

import android.graphics.RectF;
import android.text.Layout;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class y03 {

    /* JADX INFO: renamed from: a */
    public final x03 f13266a;

    /* JADX INFO: renamed from: b */
    public final lj1 f13267b;

    /* JADX INFO: renamed from: c */
    public final long f13268c;

    /* JADX INFO: renamed from: d */
    public final float f13269d;

    /* JADX INFO: renamed from: e */
    public final float f13270e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f13271f;

    public y03(x03 x03Var, lj1 lj1Var, long j) {
        this.f13266a = x03Var;
        this.f13267b = lj1Var;
        this.f13268c = j;
        ArrayList arrayList = lj1Var.f6153h;
        float fM5817d = 0.0f;
        this.f13269d = arrayList.isEmpty() ? 0.0f : ((rw1) arrayList.get(0)).f9775a.f10616d.m5817d(0);
        if (!arrayList.isEmpty()) {
            rw1 rw1Var = (rw1) AbstractC0142du.m1166v0(arrayList);
            fM5817d = rw1Var.f9775a.f10616d.m5817d(r4.f12247g - 1) + rw1Var.f9780f;
        }
        this.f13270e = fM5817d;
        this.f13271f = lj1Var.f6152g;
    }

    /* JADX INFO: renamed from: a */
    public final c92 m6201a(int i) {
        lj1 lj1Var = this.f13267b;
        lj1Var.m2923k(i);
        int length = ((C0690sd) lj1Var.f6146a.f1579a).f10051i.length();
        ArrayList arrayList = lj1Var.f6153h;
        rw1 rw1Var = (rw1) arrayList.get(i == length ? AbstractC0179eu.m1431L(arrayList) : AbstractC0179eu.m1426G(i, arrayList));
        return rw1Var.f9775a.f10616d.f12246f.isRtlCharAt(rw1Var.m4623d(i)) ? c92.f1252i : c92.f1251h;
    }

    /* JADX INFO: renamed from: b */
    public final o62 m6202b(int i) {
        float fM5823j;
        float fM5823j2;
        float fM5822i;
        float fM5822i2;
        lj1 lj1Var = this.f13267b;
        lj1Var.m2922j(i);
        ArrayList arrayList = lj1Var.f6153h;
        rw1 rw1Var = (rw1) arrayList.get(AbstractC0179eu.m1426G(i, arrayList));
        C0726t9 c0726t9 = rw1Var.f9775a;
        int iM4623d = rw1Var.m4623d(i);
        CharSequence charSequence = c0726t9.f10617e;
        if (iM4623d < 0 || iM4623d >= charSequence.length()) {
            StringBuilder sbM5695n = vi0.m5695n(iM4623d, "offset(", ") is out of bounds [0,");
            sbM5695n.append(charSequence.length());
            sbM5695n.append(')');
            lz0.m2988a(sbM5695n.toString());
        }
        w03 w03Var = c0726t9.f10616d;
        int iM5820g = w03Var.m5820g(iM4623d);
        float fM5821h = w03Var.m5821h(iM5820g);
        float fM5818e = w03Var.m5818e(iM5820g);
        Layout layout = w03Var.f12246f;
        boolean z = layout.getParagraphDirection(iM5820g) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iM4623d);
        if (!z || zIsRtlCharAt) {
            if (z && zIsRtlCharAt) {
                fM5822i = w03Var.m5823j(iM4623d, false);
                fM5822i2 = w03Var.m5823j(iM4623d + 1, true);
            } else if (zIsRtlCharAt) {
                fM5822i = w03Var.m5822i(iM4623d, false);
                fM5822i2 = w03Var.m5822i(iM4623d + 1, true);
            } else {
                fM5823j = w03Var.m5823j(iM4623d, false);
                fM5823j2 = w03Var.m5823j(iM4623d + 1, true);
            }
            float f = fM5822i;
            fM5823j = fM5822i2;
            fM5823j2 = f;
        } else {
            fM5823j = w03Var.m5822i(iM4623d, false);
            fM5823j2 = w03Var.m5822i(iM4623d + 1, true);
        }
        RectF rectF = new RectF(fM5823j, fM5821h, fM5823j2, fM5818e);
        return rw1Var.m4620a(new o62(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    /* JADX INFO: renamed from: c */
    public final o62 m6203c(int i) {
        lj1 lj1Var = this.f13267b;
        lj1Var.m2923k(i);
        int length = ((C0690sd) lj1Var.f6146a.f1579a).f10051i.length();
        ArrayList arrayList = lj1Var.f6153h;
        rw1 rw1Var = (rw1) arrayList.get(i == length ? AbstractC0179eu.m1431L(arrayList) : AbstractC0179eu.m1426G(i, arrayList));
        C0726t9 c0726t9 = rw1Var.f9775a;
        int iM4623d = rw1Var.m4623d(i);
        CharSequence charSequence = c0726t9.f10617e;
        w03 w03Var = c0726t9.f10616d;
        if (iM4623d < 0 || iM4623d > charSequence.length()) {
            StringBuilder sbM5695n = vi0.m5695n(iM4623d, "offset(", ") is out of bounds [0,");
            sbM5695n.append(charSequence.length());
            sbM5695n.append(']');
            lz0.m2988a(sbM5695n.toString());
        }
        float fM5822i = w03Var.m5822i(iM4623d, false);
        int iM5820g = w03Var.m5820g(iM4623d);
        return rw1Var.m4620a(new o62(fM5822i, w03Var.m5821h(iM5820g), fM5822i, w03Var.m5818e(iM5820g)));
    }

    /* JADX INFO: renamed from: d */
    public final float m6204d(int i) {
        lj1 lj1Var = this.f13267b;
        lj1Var.m2924l(i);
        ArrayList arrayList = lj1Var.f6153h;
        rw1 rw1Var = (rw1) arrayList.get(AbstractC0179eu.m1427H(i, arrayList));
        C0726t9 c0726t9 = rw1Var.f9775a;
        int i2 = i - rw1Var.f9778d;
        w03 w03Var = c0726t9.f10616d;
        return w03Var.f12246f.getLineLeft(i2) + (i2 == w03Var.f12247g + (-1) ? w03Var.f12250j : 0.0f);
    }

    /* JADX INFO: renamed from: e */
    public final float m6205e(int i) {
        lj1 lj1Var = this.f13267b;
        lj1Var.m2924l(i);
        ArrayList arrayList = lj1Var.f6153h;
        rw1 rw1Var = (rw1) arrayList.get(AbstractC0179eu.m1427H(i, arrayList));
        C0726t9 c0726t9 = rw1Var.f9775a;
        int i2 = i - rw1Var.f9778d;
        w03 w03Var = c0726t9.f10616d;
        return w03Var.f12246f.getLineRight(i2) + (i2 == w03Var.f12247g + (-1) ? w03Var.f12251k : 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y03) {
            y03 y03Var = (y03) obj;
            if (t11.m5086l(this.f13266a, y03Var.f13266a) && this.f13267b == y03Var.f13267b && h11.m2041a(this.f13268c, y03Var.f13268c) && this.f13269d == y03Var.f13269d && this.f13270e == y03Var.f13270e && t11.m5086l(this.f13271f, y03Var.f13271f)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final int m6206f(int i) {
        lj1 lj1Var = this.f13267b;
        lj1Var.m2924l(i);
        ArrayList arrayList = lj1Var.f6153h;
        rw1 rw1Var = (rw1) arrayList.get(AbstractC0179eu.m1427H(i, arrayList));
        C0726t9 c0726t9 = rw1Var.f9775a;
        return c0726t9.f10616d.f12246f.getLineStart(i - rw1Var.f9778d) + rw1Var.f9776b;
    }

    /* JADX INFO: renamed from: g */
    public final c92 m6207g(int i) {
        lj1 lj1Var = this.f13267b;
        lj1Var.m2923k(i);
        int length = ((C0690sd) lj1Var.f6146a.f1579a).f10051i.length();
        ArrayList arrayList = lj1Var.f6153h;
        rw1 rw1Var = (rw1) arrayList.get(i == length ? AbstractC0179eu.m1431L(arrayList) : AbstractC0179eu.m1426G(i, arrayList));
        C0726t9 c0726t9 = rw1Var.f9775a;
        int iM4623d = rw1Var.m4623d(i);
        w03 w03Var = c0726t9.f10616d;
        return w03Var.f12246f.getParagraphDirection(w03Var.m5820g(iM4623d)) == 1 ? c92.f1251h : c92.f1252i;
    }

    /* JADX INFO: renamed from: h */
    public final C0915y9 m6208h(int i, int i2) {
        lj1 lj1Var = this.f13267b;
        C0690sd c0690sd = (C0690sd) lj1Var.f6146a.f1579a;
        if (i < 0 || i > i2 || i2 > c0690sd.f10051i.length()) {
            StringBuilder sbM2212k = hk1.m2212k("Start(", i, i2, ") or End(", ") is out of range [0..");
            sbM2212k.append(c0690sd.f10051i.length());
            sbM2212k.append("), or start > end!");
            lz0.m2988a(sbM2212k.toString());
        }
        if (i == i2) {
            return AbstractC0011aa.m117a();
        }
        C0915y9 c0915y9M117a = AbstractC0011aa.m117a();
        AbstractC0179eu.m1429J(lj1Var.f6153h, fg1.m1636i(i, i2), new e01(i, i2, 2, c0915y9M117a));
        return c0915y9M117a;
    }

    public final int hashCode() {
        return this.f13271f.hashCode() + vi0.m5684c(this.f13270e, vi0.m5684c(this.f13269d, hk1.m2204c((this.f13267b.hashCode() + (this.f13266a.hashCode() * 31)) * 31, 31, this.f13268c), 31), 31);
    }

    /* JADX INFO: renamed from: i */
    public final long m6209i(int i) {
        int iM5017j;
        int iM5016i;
        int iM5016i2;
        lj1 lj1Var = this.f13267b;
        lj1Var.m2923k(i);
        int length = ((C0690sd) lj1Var.f6146a.f1579a).f10051i.length();
        ArrayList arrayList = lj1Var.f6153h;
        rw1 rw1Var = (rw1) arrayList.get(i == length ? AbstractC0179eu.m1431L(arrayList) : AbstractC0179eu.m1426G(i, arrayList));
        C0726t9 c0726t9 = rw1Var.f9775a;
        int iM4623d = rw1Var.m4623d(i);
        sx1 sx1VarM5824k = c0726t9.f10616d.m5824k();
        if (sx1VarM5824k.m5015h(sx1VarM5824k.m5017j(iM4623d))) {
            sx1VarM5824k.m5008a(iM4623d);
            iM5017j = iM4623d;
            while (iM5017j != -1 && (!sx1VarM5824k.m5015h(iM5017j) || sx1VarM5824k.m5011d(iM5017j))) {
                iM5017j = sx1VarM5824k.m5017j(iM5017j);
            }
        } else {
            sx1VarM5824k.m5008a(iM4623d);
            iM5017j = sx1VarM5824k.m5014g(iM4623d) ? (!sx1VarM5824k.m5012e(iM4623d) || sx1VarM5824k.m5010c(iM4623d)) ? sx1VarM5824k.m5017j(iM4623d) : iM4623d : sx1VarM5824k.m5010c(iM4623d) ? sx1VarM5824k.m5017j(iM4623d) : -1;
        }
        if (iM5017j == -1) {
            iM5017j = iM4623d;
        }
        if (sx1VarM5824k.m5011d(sx1VarM5824k.m5016i(iM4623d))) {
            sx1VarM5824k.m5008a(iM4623d);
            iM5016i = iM4623d;
            while (iM5016i != -1 && (sx1VarM5824k.m5015h(iM5016i) || !sx1VarM5824k.m5011d(iM5016i))) {
                iM5016i = sx1VarM5824k.m5016i(iM5016i);
            }
        } else {
            sx1VarM5824k.m5008a(iM4623d);
            if (sx1VarM5824k.m5010c(iM4623d)) {
                if (!sx1VarM5824k.m5012e(iM4623d) || sx1VarM5824k.m5014g(iM4623d)) {
                    iM5016i2 = sx1VarM5824k.m5016i(iM4623d);
                    iM5016i = iM5016i2;
                } else {
                    iM5016i = iM4623d;
                }
            } else if (sx1VarM5824k.m5014g(iM4623d)) {
                iM5016i2 = sx1VarM5824k.m5016i(iM4623d);
                iM5016i = iM5016i2;
            } else {
                iM5016i = -1;
            }
        }
        if (iM5016i != -1) {
            iM4623d = iM5016i;
        }
        return rw1Var.m4621b(fg1.m1636i(iM5017j, iM4623d), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f13266a + ", multiParagraph=" + this.f13267b + ", size=" + ((Object) h11.m2042b(this.f13268c)) + ", firstBaseline=" + this.f13269d + ", lastBaseline=" + this.f13270e + ", placeholderRects=" + this.f13271f + ')';
    }
}
