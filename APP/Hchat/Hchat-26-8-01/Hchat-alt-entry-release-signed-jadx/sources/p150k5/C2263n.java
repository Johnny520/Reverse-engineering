package p150k5;

import androidx.lifecycle.C0119x;
import okhttp3.HttpUrl;
import p005a5.C0016a;
import p035c8.C0412a;
import p068eh.AbstractC0921a;
import p077f8.AbstractC1089i;
import p100h0.C1548s;
import p119i2.AbstractC1923e0;
import p119i2.C1926g;
import p119i2.C1939m0;
import p136j8.C2104o;
import p204o2.AbstractC3042a;
import p207o5.C3049d;
import p207o5.InterfaceC3048c;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: k5.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2263n implements InterfaceC3048c {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f7505g;

    /* JADX INFO: renamed from: h */
    public int f7506h;

    /* JADX INFO: renamed from: i */
    public int f7507i;

    /* JADX INFO: renamed from: j */
    public int f7508j;

    /* JADX INFO: renamed from: k */
    public int f7509k;

    /* JADX INFO: renamed from: l */
    public final Object f7510l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2263n(C1926g c1926g, long j3) {
        this.f7505g = 1;
        String str = c1926g.f6529h;
        C0412a c0412a = new C0412a();
        c0412a.f1127d = str;
        c0412a.f1125b = -1;
        c0412a.f1126c = -1;
        this.f7510l = c0412a;
        this.f7506h = C1939m0.m4816f(j3);
        this.f7507i = C1939m0.m4815e(j3);
        this.f7508j = -1;
        this.f7509k = -1;
        int iM4816f = C1939m0.m4816f(j3);
        int iM4815e = C1939m0.m4815e(j3);
        if (iM4816f < 0 || iM4816f > str.length()) {
            C2104o.m5280e(str.length(), AbstractC0921a.m2257t(iM4816f, "start (", ") offset is outside of text region "));
            throw null;
        }
        if (iM4815e < 0 || iM4815e > str.length()) {
            C2104o.m5280e(str.length(), AbstractC0921a.m2257t(iM4815e, "end (", ") offset is outside of text region "));
            throw null;
        }
        if (iM4816f <= iM4815e) {
            return;
        }
        C2104o.m5294t(AbstractC3199a.m6837j(iM4816f, "Do not set reversed range: ", " > ", iM4815e));
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public void m5504a(int i9, int i10) {
        long jM4784b = AbstractC1923e0.m4784b(i9, i10);
        ((C0412a) this.f7510l).m1382k(i9, i10, HttpUrl.FRAGMENT_ENCODE_SET);
        long jM2746Q0 = AbstractC1089i.m2746Q0(AbstractC1923e0.m4784b(this.f7506h, this.f7507i), jM4784b);
        m5513j(C1939m0.m4816f(jM2746Q0));
        m5512i(C1939m0.m4815e(jM2746Q0));
        int i11 = this.f7508j;
        if (i11 != -1) {
            long jM2746Q02 = AbstractC1089i.m2746Q0(AbstractC1923e0.m4784b(i11, this.f7509k), jM4784b);
            if (C1939m0.m4813c(jM2746Q02)) {
                this.f7508j = -1;
                this.f7509k = -1;
            } else {
                this.f7508j = C1939m0.m4816f(jM2746Q02);
                this.f7509k = C1939m0.m4815e(jM2746Q02);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public char m5505b(int i9) {
        C0412a c0412a = (C0412a) this.f7510l;
        C1548s c1548s = (C1548s) c0412a.f1128e;
        if (c1548s == null) {
            return ((String) c0412a.f1127d).charAt(i9);
        }
        if (i9 < c0412a.f1125b) {
            return ((String) c0412a.f1127d).charAt(i9);
        }
        int iM4047b = c1548s.f5161b - c1548s.m4047b();
        int i10 = c0412a.f1125b;
        if (i9 >= iM4047b + i10) {
            return ((String) c0412a.f1127d).charAt(i9 - ((iM4047b - c0412a.f1126c) + i10));
        }
        int i11 = i9 - i10;
        int i12 = c1548s.f5162c;
        char[] cArr = (char[]) c1548s.f5164e;
        return i11 < i12 ? cArr[i11] : cArr[(i11 - i12) + c1548s.f5163d];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public C1939m0 m5506c() {
        int i9 = this.f7508j;
        if (i9 != -1) {
            return new C1939m0(AbstractC1923e0.m4784b(i9, this.f7509k));
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public int m5507d() {
        C2264o c2264o = (C2264o) this.f7510l;
        if (this.f7508j == 0) {
            C0119x c0119x = c2264o.f7511j.f7532b;
            int iM5508e = m5508e();
            c0119x.getClass();
            C0016a c0016a = new C0016a(iM5508e, 5, c0119x);
            for (int i9 = 0; i9 < c2264o.f7519r; i9++) {
                c0016a.m211o(false);
            }
            this.f7508j = c0016a.f55h;
        }
        return this.f7508j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public int m5508e() {
        C2264o c2264o = (C2264o) this.f7510l;
        if (this.f7507i == 0) {
            C0119x c0119x = c2264o.f7511j.f7532b;
            int i9 = this.f7506h;
            c0119x.getClass();
            C0016a c0016a = new C0016a(i9, 5, c0119x);
            for (int i10 = 0; i10 < c2264o.f7518q; i10++) {
                c0016a.m211o(false);
            }
            this.f7507i = c0016a.f55h;
        }
        return this.f7507i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public void m5509f(int i9, int i10, String str) {
        C0412a c0412a = (C0412a) this.f7510l;
        if (i9 < 0 || i9 > c0412a.m1373b()) {
            C2104o.m5280e(c0412a.m1373b(), AbstractC0921a.m2257t(i9, "start (", ") offset is outside of text region "));
            return;
        }
        if (i10 < 0 || i10 > c0412a.m1373b()) {
            C2104o.m5280e(c0412a.m1373b(), AbstractC0921a.m2257t(i10, "end (", ") offset is outside of text region "));
        } else {
            if (i9 > i10) {
                C2104o.m5294t(AbstractC3199a.m6837j(i9, "Do not set reversed range: ", " > ", i10));
                return;
            }
            c0412a.m1382k(i9, i10, str);
            m5513j(str.length() + i9);
            m5512i(str.length() + i9);
            this.f7508j = -1;
            this.f7509k = -1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public void m5510g(int i9, int i10) {
        C0412a c0412a = (C0412a) this.f7510l;
        if (i9 < 0 || i9 > c0412a.m1373b()) {
            C2104o.m5280e(c0412a.m1373b(), AbstractC0921a.m2257t(i9, "start (", ") offset is outside of text region "));
        } else if (i10 < 0 || i10 > c0412a.m1373b()) {
            C2104o.m5280e(c0412a.m1373b(), AbstractC0921a.m2257t(i10, "end (", ") offset is outside of text region "));
        } else if (i9 >= i10) {
            C2104o.m5294t(AbstractC3199a.m6837j(i9, "Do not set reversed or empty range: ", " > ", i10));
        } else {
            this.f7508j = i9;
            this.f7509k = i10;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public void m5511h(int i9, int i10) {
        C0412a c0412a = (C0412a) this.f7510l;
        if (i9 < 0 || i9 > c0412a.m1373b()) {
            C2104o.m5280e(c0412a.m1373b(), AbstractC0921a.m2257t(i9, "start (", ") offset is outside of text region "));
        } else if (i10 < 0 || i10 > c0412a.m1373b()) {
            C2104o.m5280e(c0412a.m1373b(), AbstractC0921a.m2257t(i10, "end (", ") offset is outside of text region "));
        } else if (i9 > i10) {
            C2104o.m5294t(AbstractC3199a.m6837j(i9, "Do not set reversed range: ", " > ", i10));
        } else {
            m5513j(i9);
            m5512i(i10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public void m5512i(int i9) {
        if (!(i9 >= 0)) {
            AbstractC3042a.m6486a("Cannot set selectionEnd to a negative value: " + i9);
        }
        this.f7507i = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public void m5513j(int i9) {
        if (!(i9 >= 0)) {
            AbstractC3042a.m6486a("Cannot set selectionStart to a negative value: " + i9);
        }
        this.f7506h = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p207o5.InterfaceC3048c
    public int seekTo(int i9) {
        int i10;
        int i11;
        int i12 = this.f7506h;
        C2270u c2270u = ((C3049d) this.f7510l).f9871b;
        while (true) {
            i10 = this.f7509k;
            if (i10 >= i9 || (i11 = this.f7508j + 1) >= this.f7507i) {
                break;
            }
            this.f7508j = i11;
            this.f7509k = c2270u.f7532b.m583N((i11 * 8) + i12);
        }
        if (i10 == i9) {
            return c2270u.f7532b.m583N((this.f7508j * 8) + i12 + 4);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f7505g) {
            case 1:
                return ((C0412a) this.f7510l).toString();
            default:
                return super.toString();
        }
    }

    public C2263n(C3049d c3049d, int i9, int i10) {
        this.f7505g = 2;
        this.f7510l = c3049d;
        this.f7506h = i9;
        this.f7507i = i10;
        this.f7509k = c3049d.f9871b.f7532b.m583N(i9);
        this.f7508j = 0;
    }

    public C2263n(C2264o c2264o, int i9) {
        this.f7505g = 0;
        this.f7510l = c2264o;
        this.f7506h = i9;
    }
}
