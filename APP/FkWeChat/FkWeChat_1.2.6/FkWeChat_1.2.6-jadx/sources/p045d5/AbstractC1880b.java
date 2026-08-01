package p045d5;

import bsh.C1259t2;
import java.util.ArrayList;
import p239q5.C6260k;
import p239q5.C6267r;
import p254r5.AbstractC6487a;
import p269s5.C7186a;
import p269s5.C7187b;
import p269s5.C7188c;
import p269s5.InterfaceC7189d;
import p376zd.C9987e;

/* JADX INFO: renamed from: d5.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1880b implements InterfaceC1896r {

    /* JADX INFO: renamed from: a */
    public final C7186a f5212a;

    /* JADX INFO: renamed from: b */
    public InterfaceC7189d[] f5213b;

    /* JADX INFO: renamed from: c */
    public int f5214c;

    /* JADX INFO: renamed from: d */
    public C7188c f5215d;

    /* JADX INFO: renamed from: e */
    public int f5216e;

    /* JADX INFO: renamed from: f */
    public AbstractC6487a f5217f;

    /* JADX INFO: renamed from: g */
    public int f5218g;

    /* JADX INFO: renamed from: h */
    public C1904z f5219h;

    /* JADX INFO: renamed from: i */
    public ArrayList f5220i;

    /* JADX INFO: renamed from: j */
    public int f5221j;

    /* JADX INFO: renamed from: k */
    public boolean f5222k;

    /* JADX INFO: renamed from: l */
    public C6267r f5223l;

    /* JADX INFO: renamed from: m */
    public InterfaceC7189d[] f5224m;

    /* JADX INFO: renamed from: n */
    public int f5225n;

    public AbstractC1880b(C7186a c7186a) {
        if (c7186a == null) {
            C1259t2.m5095a("prototype == null");
            throw null;
        }
        this.f5212a = c7186a;
        this.f5213b = new InterfaceC7189d[10];
        this.f5224m = new InterfaceC7189d[6];
        mo6670b();
    }

    /* JADX INFO: renamed from: H */
    public static void m6661H(InterfaceC7189d interfaceC7189d, InterfaceC7189d interfaceC7189d2) {
        throw new C1902x("local variable type mismatch: attempt to set or access a value of type " + interfaceC7189d.mo6828g() + " using a local variable of type " + interfaceC7189d2.mo6828g() + ". This is symptomatic of .class transformation tools that ignore local variable information.");
    }

    /* JADX INFO: renamed from: A */
    public final ArrayList m6662A() {
        return this.f5220i;
    }

    /* JADX INFO: renamed from: B */
    public final int m6663B() {
        return this.f5221j;
    }

    /* JADX INFO: renamed from: C */
    public final C6267r m6664C(boolean z10) {
        if (this.f5223l == null) {
            return null;
        }
        if (this.f5225n != 1) {
            StringBuilder sb2 = new StringBuilder("local target with ");
            sb2.append(this.f5225n == 0 ? "no" : "multiple");
            sb2.append(" results");
            throw new C1902x(sb2.toString());
        }
        InterfaceC7189d interfaceC7189d = this.f5224m[0];
        C7188c type = interfaceC7189d.getType();
        C7188c type2 = this.f5223l.getType();
        if (type == type2) {
            C6267r c6267r = this.f5223l;
            return z10 ? c6267r.m24747L(interfaceC7189d) : c6267r;
        }
        if (!AbstractC1897s.m6830a(type2, type)) {
            m6661H(type, type2);
            return null;
        }
        if (type2 == C7188c.f23837P) {
            this.f5223l = this.f5223l.m24747L(interfaceC7189d);
        }
        return this.f5223l;
    }

    /* JADX INFO: renamed from: D */
    public final InterfaceC7189d m6665D(int i10) {
        if (i10 >= this.f5225n) {
            C9987e.m38645a("n >= resultCount");
            return null;
        }
        try {
            return this.f5224m[i10];
        } catch (ArrayIndexOutOfBoundsException unused) {
            C9987e.m38645a("n < 0");
            return null;
        }
    }

    /* JADX INFO: renamed from: E */
    public final int m6666E() {
        int i10 = this.f5225n;
        if (i10 >= 0) {
            return i10;
        }
        throw new C1902x("results never set");
    }

    /* JADX INFO: renamed from: F */
    public final void m6667F(InterfaceC7189d interfaceC7189d) {
        if (interfaceC7189d == null) {
            C1259t2.m5095a("result == null");
        } else {
            this.f5224m[0] = interfaceC7189d;
            this.f5225n = 1;
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m6668G(C1891m c1891m) {
        int i10 = this.f5225n;
        if (i10 < 0) {
            throw new C1902x("results never set");
        }
        if (i10 == 0) {
            return;
        }
        if (this.f5223l != null) {
            c1891m.m6780d().mo6817E(m6664C(false));
            return;
        }
        C1890l c1890lM6781e = c1891m.m6781e();
        for (int i11 = 0; i11 < this.f5225n; i11++) {
            if (this.f5222k) {
                c1890lM6781e.m6772H();
            }
            c1890lM6781e.m6771G(this.f5224m[i11]);
        }
    }

    @Override // p045d5.InterfaceC1896r
    /* JADX INFO: renamed from: a */
    public final void mo6669a(C1891m c1891m, int i10) {
        mo6670b();
        this.f5213b[0] = c1891m.m6780d().mo6820y(i10);
        this.f5214c = 1;
        this.f5221j = i10;
    }

    @Override // p045d5.InterfaceC1896r
    /* JADX INFO: renamed from: b */
    public final void mo6670b() {
        this.f5214c = 0;
        this.f5215d = null;
        this.f5216e = 0;
        this.f5217f = null;
        this.f5218g = 0;
        this.f5219h = null;
        this.f5220i = null;
        this.f5221j = -1;
        this.f5222k = false;
        this.f5223l = null;
        this.f5225n = -1;
    }

    @Override // p045d5.InterfaceC1896r
    /* JADX INFO: renamed from: c */
    public C7186a mo6671c() {
        return this.f5212a;
    }

    @Override // p045d5.InterfaceC1896r
    /* JADX INFO: renamed from: d */
    public final void mo6672d(int i10) {
        this.f5218g = i10;
    }

    @Override // p045d5.InterfaceC1896r
    /* JADX INFO: renamed from: e */
    public final void mo6673e(C1904z c1904z) {
        if (c1904z != null) {
            this.f5219h = c1904z;
        } else {
            C1259t2.m5095a("cases == null");
        }
    }

    @Override // p045d5.InterfaceC1896r
    /* JADX INFO: renamed from: f */
    public void mo6674f(C1891m c1891m, C7186a c7186a) {
        C7187b c7187bM28387i = c7186a.m28387i();
        int size = c7187bM28387i.size();
        mo6683o(c1891m, size);
        for (int i10 = 0; i10 < size; i10++) {
            if (!AbstractC1897s.m6830a(c7187bM28387i.getType(i10), this.f5213b[i10])) {
                throw new C1902x("at stack depth " + ((size - 1) - i10) + ", expected type " + c7187bM28387i.getType(i10).mo6828g() + " but found " + this.f5213b[i10].getType().mo6828g());
            }
        }
    }

    @Override // p045d5.InterfaceC1896r
    /* JADX INFO: renamed from: g */
    public final void mo6675g(C7188c c7188c) {
        this.f5215d = c7188c;
    }

    @Override // p045d5.InterfaceC1896r
    /* JADX INFO: renamed from: h */
    public final void mo6676h(C1891m c1891m, C7188c c7188c, C7188c c7188c2, C7188c c7188c3) {
        mo6683o(c1891m, 3);
        if (!AbstractC1897s.m6830a(c7188c, this.f5213b[0])) {
            C1878a.m6659a(c7188c.mo6828g(), this.f5213b[0].getType().mo6828g());
        } else if (!AbstractC1897s.m6830a(c7188c2, this.f5213b[1])) {
            C1878a.m6659a(c7188c2.mo6828g(), this.f5213b[1].getType().mo6828g());
        } else {
            if (AbstractC1897s.m6830a(c7188c3, this.f5213b[2])) {
                return;
            }
            C1878a.m6659a(c7188c3.mo6828g(), this.f5213b[2].getType().mo6828g());
        }
    }

    @Override // p045d5.InterfaceC1896r
    /* JADX INFO: renamed from: i */
    public final void mo6677i(ArrayList arrayList) {
        this.f5220i = arrayList;
    }

    @Override // p045d5.InterfaceC1896r
    /* JADX INFO: renamed from: j */
    public final void mo6678j(boolean z10) {
        this.f5222k = z10;
    }

    @Override // p045d5.InterfaceC1896r
    /* JADX INFO: renamed from: k */
    public final void mo6679k(AbstractC6487a abstractC6487a) {
        if (abstractC6487a != null) {
            this.f5217f = abstractC6487a;
        } else {
            C1259t2.m5095a("cst == null");
        }
    }

    @Override // p045d5.InterfaceC1896r
    /* JADX INFO: renamed from: l */
    public final void mo6680l(C1891m c1891m, C7188c c7188c, C7188c c7188c2) {
        mo6683o(c1891m, 2);
        if (!AbstractC1897s.m6830a(c7188c, this.f5213b[0])) {
            C1878a.m6659a(c7188c.mo6828g(), this.f5213b[0].getType().mo6828g());
        } else {
            if (AbstractC1897s.m6830a(c7188c2, this.f5213b[1])) {
                return;
            }
            C1878a.m6659a(c7188c2.mo6828g(), this.f5213b[1].getType().mo6828g());
        }
    }

    @Override // p045d5.InterfaceC1896r
    /* JADX INFO: renamed from: m */
    public final void mo6681m(C1891m c1891m, C7188c c7188c) {
        mo6683o(c1891m, 1);
        if (AbstractC1897s.m6830a(c7188c, this.f5213b[0])) {
            return;
        }
        C1878a.m6659a(c7188c.mo6828g(), this.f5213b[0].getType().mo6828g());
    }

    @Override // p045d5.InterfaceC1896r
    /* JADX INFO: renamed from: n */
    public final void mo6682n(int i10, C7188c c7188c, C6260k c6260k) {
        this.f5223l = C6267r.m24734C(i10, c7188c, c6260k);
    }

    @Override // p045d5.InterfaceC1896r
    /* JADX INFO: renamed from: o */
    public final void mo6683o(C1891m c1891m, int i10) {
        C1890l c1890lM6781e = c1891m.m6781e();
        mo6670b();
        if (i10 > this.f5213b.length) {
            this.f5213b = new InterfaceC7189d[i10 + 10];
        }
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            this.f5213b[i11] = c1890lM6781e.m6770F();
        }
        this.f5214c = i10;
    }

    @Override // p045d5.InterfaceC1896r
    /* JADX INFO: renamed from: p */
    public final void mo6684p(int i10) {
        this.f5216e = i10;
    }

    /* JADX INFO: renamed from: r */
    public final void m6685r(InterfaceC7189d interfaceC7189d) {
        if (interfaceC7189d == null) {
            C1259t2.m5095a("result == null");
            return;
        }
        InterfaceC7189d[] interfaceC7189dArr = this.f5224m;
        int i10 = this.f5225n;
        interfaceC7189dArr[i10] = interfaceC7189d;
        this.f5225n = i10 + 1;
    }

    /* JADX INFO: renamed from: s */
    public final InterfaceC7189d m6686s(int i10) {
        if (i10 >= this.f5214c) {
            C9987e.m38645a("n >= argCount");
            return null;
        }
        try {
            return this.f5213b[i10];
        } catch (ArrayIndexOutOfBoundsException unused) {
            C9987e.m38645a("n < 0");
            return null;
        }
    }

    /* JADX INFO: renamed from: t */
    public final int m6687t() {
        return this.f5214c;
    }

    /* JADX INFO: renamed from: u */
    public final void m6688u() {
        this.f5225n = 0;
    }

    /* JADX INFO: renamed from: v */
    public final C1904z m6689v() {
        return this.f5219h;
    }

    /* JADX INFO: renamed from: w */
    public final AbstractC6487a m6690w() {
        return this.f5217f;
    }

    /* JADX INFO: renamed from: x */
    public final int m6691x() {
        return this.f5216e;
    }

    /* JADX INFO: renamed from: y */
    public final int m6692y() {
        return this.f5218g;
    }

    /* JADX INFO: renamed from: z */
    public final C7188c m6693z() {
        return this.f5215d;
    }
}
