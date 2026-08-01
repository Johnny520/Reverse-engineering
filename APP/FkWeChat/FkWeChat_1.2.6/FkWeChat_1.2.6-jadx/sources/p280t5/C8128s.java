package p280t5;

import bsh.C1193i2;
import bsh.C1271v2;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p239q5.AbstractC6257h;
import p239q5.AbstractC6273x;
import p239q5.C6249b;
import p239q5.C6251c;
import p239q5.C6258i;
import p239q5.C6265p;
import p239q5.C6267r;
import p239q5.C6268s;
import p239q5.C6270u;
import p239q5.C6271v;
import p239q5.C6274y;
import p280t5.AbstractC8131v;
import p280t5.C8123n;
import p309v5.AbstractC8826h;
import p309v5.C8829k;
import p309v5.InterfaceC8830l;
import p376zd.C10010p0;
import p376zd.C9987e;

/* JADX INFO: renamed from: t5.s */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8128s {

    /* JADX INFO: renamed from: n */
    public static final Comparator f27158n = new a();

    /* JADX INFO: renamed from: b */
    public BitSet f27160b;

    /* JADX INFO: renamed from: c */
    public BitSet f27161c;

    /* JADX INFO: renamed from: f */
    public final int f27164f;

    /* JADX INFO: renamed from: g */
    public final C8132w f27165g;

    /* JADX INFO: renamed from: h */
    public final int f27166h;

    /* JADX INFO: renamed from: l */
    public InterfaceC8830l f27170l;

    /* JADX INFO: renamed from: m */
    public InterfaceC8830l f27171m;

    /* JADX INFO: renamed from: e */
    public int f27163e = -1;

    /* JADX INFO: renamed from: j */
    public int f27168j = 0;

    /* JADX INFO: renamed from: k */
    public int f27169k = 0;

    /* JADX INFO: renamed from: a */
    public final ArrayList f27159a = new ArrayList();

    /* JADX INFO: renamed from: d */
    public C8829k f27162d = new C8829k();

    /* JADX INFO: renamed from: i */
    public final ArrayList f27167i = new ArrayList();

    /* JADX INFO: renamed from: t5.s$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C8128s c8128s, C8128s c8128s2) {
            int i10 = c8128s.f27164f;
            int i11 = c8128s2.f27164f;
            if (i10 < i11) {
                return -1;
            }
            return i10 > i11 ? 1 : 0;
        }
    }

    /* JADX INFO: renamed from: t5.s$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo31359a(C8128s c8128s, C8128s c8128s2);
    }

    public C8128s(int i10, int i11, C8132w c8132w) {
        this.f27165g = c8132w;
        this.f27166h = i10;
        this.f27164f = i11;
        this.f27160b = new BitSet(c8132w.m31549m().size());
        this.f27161c = new BitSet(c8132w.m31549m().size());
    }

    /* JADX INFO: renamed from: G */
    public static C8128s m31462G(C6271v c6271v, int i10, C8132w c8132w) {
        C6251c c6251cM24804b = c6271v.m24804b();
        C6249b c6249bM24673L = c6251cM24804b.m24673L(i10);
        C8128s c8128s = new C8128s(i10, c6249bM24673L.mo6715a(), c8132w);
        C6258i c6258iM24665d = c6249bM24673L.m24665d();
        c8128s.f27159a.ensureCapacity(c6258iM24665d.size());
        int size = c6258iM24665d.size();
        for (int i11 = 0; i11 < size; i11++) {
            c8128s.f27159a.add(new C8121l(c6258iM24665d.m24704G(i11), c8128s));
        }
        c8128s.f27160b = C8132w.m31524c(c6251cM24804b, c6271v.m24806d(c6249bM24673L.mo6715a()));
        c8128s.f27161c = C8132w.m31524c(c6251cM24804b, c6249bM24673L.m24669h());
        C8829k c8829kM31526x = C8132w.m31526x(c6251cM24804b, c6249bM24673L.m24669h());
        c8128s.f27162d = c8829kM31526x;
        if (c8829kM31526x.size() != 0) {
            int iM24667f = c6249bM24673L.m24667f();
            c8128s.f27163e = iM24667f < 0 ? -1 : c6251cM24804b.m33923G(iM24667f);
        }
        return c8128s;
    }

    /* JADX INFO: renamed from: N */
    public static void m31463N(BitSet bitSet, C6267r c6267r) {
        bitSet.set(c6267r.m24754t());
        if (c6267r.m24751n() > 1) {
            bitSet.set(c6267r.m24754t() + 1);
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m31465j(BitSet bitSet, C6267r c6267r) {
        int iM24754t = c6267r.m24754t();
        return bitSet.get(iM24754t) || (c6267r.m24751n() == 2 && bitSet.get(iM24754t + 1));
    }

    /* JADX INFO: renamed from: A */
    public C8829k m31466A() {
        C8829k c8829k = new C8829k(this.f27162d.size());
        int size = this.f27162d.size();
        for (int i10 = 0; i10 < size; i10++) {
            c8829k.m33917w(this.f27165g.m31540d(this.f27162d.m33920z(i10)));
        }
        return c8829k;
    }

    /* JADX INFO: renamed from: B */
    public C8829k m31467B() {
        return this.f27162d;
    }

    /* JADX INFO: renamed from: C */
    public BitSet m31468C() {
        return this.f27161c;
    }

    /* JADX INFO: renamed from: D */
    public C8128s m31469D() {
        C8128s c8128sM31527A = this.f27165g.m31527A();
        c8128sM31527A.f27160b = this.f27160b;
        c8128sM31527A.f27161c.set(this.f27166h);
        c8128sM31527A.f27162d.m33917w(this.f27166h);
        c8128sM31527A.f27163e = this.f27166h;
        BitSet bitSet = new BitSet(this.f27165g.m31549m().size());
        this.f27160b = bitSet;
        bitSet.set(c8128sM31527A.f27166h);
        for (int iNextSetBit = c8128sM31527A.f27160b.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = c8128sM31527A.f27160b.nextSetBit(iNextSetBit + 1)) {
            ((C8128s) this.f27165g.m31549m().get(iNextSetBit)).m31475K(this.f27166h, c8128sM31527A.f27166h);
        }
        return c8128sM31527A;
    }

    /* JADX INFO: renamed from: E */
    public C8128s m31470E(C8128s c8128s) {
        C8128s c8128sM31527A = this.f27165g.m31527A();
        if (!this.f27161c.get(c8128s.f27166h)) {
            C1271v2.m5124a("Block ", c8128s.m31501z(), " not successor of ", m31501z());
            return null;
        }
        c8128sM31527A.f27160b.set(this.f27166h);
        c8128sM31527A.f27161c.set(c8128s.f27166h);
        c8128sM31527A.f27162d.m33917w(c8128s.f27166h);
        c8128sM31527A.f27163e = c8128s.f27166h;
        for (int size = this.f27162d.size() - 1; size >= 0; size--) {
            if (this.f27162d.m33920z(size) == c8128s.f27166h) {
                this.f27162d.m33913I(size, c8128sM31527A.f27166h);
            }
        }
        int i10 = this.f27163e;
        int i11 = c8128s.f27166h;
        if (i10 == i11) {
            this.f27163e = c8128sM31527A.f27166h;
        }
        this.f27161c.clear(i11);
        this.f27161c.set(c8128sM31527A.f27166h);
        c8128s.f27160b.set(c8128sM31527A.f27166h);
        c8128s.f27160b.set(this.f27166h, this.f27161c.get(c8128s.f27166h));
        return c8128sM31527A;
    }

    /* JADX INFO: renamed from: F */
    public boolean m31471F() {
        return this.f27166h == this.f27165g.m31554r();
    }

    /* JADX INFO: renamed from: H */
    public void m31472H() {
        this.f27159a.subList(0, m31489n()).clear();
    }

    /* JADX INFO: renamed from: I */
    public void m31473I(int i10) {
        int size = this.f27162d.size() - 1;
        int i11 = 0;
        while (true) {
            C8829k c8829k = this.f27162d;
            if (size < 0) {
                c8829k.m33912H(i11);
                this.f27161c.clear(i10);
                ((C8128s) this.f27165g.m31549m().get(i10)).f27160b.clear(this.f27166h);
                return;
            } else {
                if (c8829k.m33920z(size) == i10) {
                    i11 = size;
                } else {
                    this.f27163e = this.f27162d.m33920z(size);
                }
                size--;
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public void m31474J(AbstractC6257h abstractC6257h) {
        if (abstractC6257h.m24695j().m24796b() == 1) {
            C9987e.m38645a("last insn must branch");
            return;
        }
        ArrayList arrayList = this.f27159a;
        AbstractC8131v abstractC8131v = (AbstractC8131v) arrayList.get(arrayList.size() - 1);
        AbstractC8131v abstractC8131vM31513v = AbstractC8131v.m31513v(abstractC6257h, this);
        ArrayList arrayList2 = this.f27159a;
        arrayList2.set(arrayList2.size() - 1, abstractC8131vM31513v);
        this.f27165g.m31531F(abstractC8131v);
        this.f27165g.m31530E(abstractC8131vM31513v);
    }

    /* JADX INFO: renamed from: K */
    public void m31475K(int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        this.f27161c.set(i11);
        if (this.f27163e == i10) {
            this.f27163e = i11;
        }
        for (int size = this.f27162d.size() - 1; size >= 0; size--) {
            if (this.f27162d.m33920z(size) == i10) {
                this.f27162d.m33913I(size, i11);
            }
        }
        this.f27161c.clear(i10);
        ((C8128s) this.f27165g.m31549m().get(i11)).f27160b.set(this.f27166h);
        ((C8128s) this.f27165g.m31549m().get(i10)).f27160b.clear(this.f27166h);
    }

    /* JADX INFO: renamed from: L */
    public void m31476L() {
        int i10 = this.f27169k;
        if (i10 > 1) {
            m31477M(this.f27159a.subList(0, i10));
            if (((AbstractC8131v) this.f27159a.get(this.f27169k)).mo31420q()) {
                C1193i2.m4438a("Unexpected: moves from phis before move-exception");
                return;
            }
        }
        if (this.f27168j > 1) {
            ArrayList arrayList = this.f27159a;
            m31477M(arrayList.subList((arrayList.size() - this.f27168j) - 1, this.f27159a.size() - 1));
        }
        this.f27165g.m31536K();
    }

    /* JADX INFO: renamed from: M */
    public final void m31477M(List list) {
        AbstractC8131v abstractC8131v;
        BitSet bitSet = new BitSet(this.f27165g.m31556u());
        BitSet bitSet2 = new BitSet(this.f27165g.m31556u());
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            for (int i11 = i10; i11 < size; i11++) {
                m31463N(bitSet, ((AbstractC8131v) list.get(i11)).mo31418o().m24769G(0));
                m31463N(bitSet2, ((AbstractC8131v) list.get(i11)).m31516n());
            }
            int i12 = i10;
            int i13 = i12;
            while (i12 < size) {
                if (!m31465j(bitSet, ((AbstractC8131v) list.get(i12)).m31516n())) {
                    Collections.swap(list, i12, i13);
                    i13++;
                }
                i12++;
            }
            if (i10 == i13) {
                int i14 = i13;
                while (true) {
                    if (i14 >= size) {
                        abstractC8131v = null;
                        break;
                    }
                    abstractC8131v = (AbstractC8131v) list.get(i14);
                    if (m31465j(bitSet, abstractC8131v.m31516n()) && m31465j(bitSet2, abstractC8131v.mo31418o().m24769G(0))) {
                        Collections.swap(list, i13, i14);
                        break;
                    }
                    i14++;
                }
                C6267r c6267rM31516n = abstractC8131v.m31516n();
                C6267r c6267rM24745J = c6267rM31516n.m24745J(this.f27165g.m31541e(c6267rM31516n.m24751n()));
                C6270u c6270uM24808A = AbstractC6273x.m24808A(c6267rM31516n.getType());
                C6274y c6274y = C6274y.f19672d;
                C8121l c8121l = new C8121l(new C6265p(c6270uM24808A, c6274y, c6267rM24745J, abstractC8131v.mo31418o()), this);
                int i15 = i13 + 1;
                list.add(i13, c8121l);
                list.set(i15, new C8121l(new C6265p(AbstractC6273x.m24808A(c6267rM31516n.getType()), c6274y, c6267rM31516n, C6268s.m24767J(c6267rM24745J)), this));
                size = list.size();
                i10 = i15;
            } else {
                i10 = i13;
            }
            bitSet.clear();
            bitSet2.clear();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m31478b(C8128s c8128s) {
        this.f27167i.add(c8128s);
    }

    /* JADX INFO: renamed from: c */
    public void m31479c(AbstractC6257h abstractC6257h) {
        AbstractC8131v abstractC8131vM31513v = AbstractC8131v.m31513v(abstractC6257h, this);
        this.f27159a.add(m31489n(), abstractC8131vM31513v);
        this.f27165g.m31530E(abstractC8131vM31513v);
    }

    /* JADX INFO: renamed from: d */
    public void m31480d(int i10) {
        if (this.f27170l == null) {
            this.f27170l = AbstractC8127r.m31461c(this.f27165g.m31556u());
        }
        this.f27170l.add(i10);
    }

    /* JADX INFO: renamed from: e */
    public void m31481e(int i10) {
        if (this.f27171m == null) {
            this.f27171m = AbstractC8127r.m31461c(this.f27165g.m31556u());
        }
        this.f27171m.add(i10);
    }

    /* JADX INFO: renamed from: f */
    public void m31482f(C6267r c6267r, C6267r c6267r2) {
        if (c6267r.m24754t() == c6267r2.m24754t()) {
            return;
        }
        this.f27159a.add(m31489n(), new C8121l(new C6265p(AbstractC6273x.m24808A(c6267r.getType()), C6274y.f19672d, c6267r, C6268s.m24767J(c6267r2)), this));
        this.f27169k++;
    }

    /* JADX INFO: renamed from: g */
    public void m31483g(C6267r c6267r, C6267r c6267r2) {
        if (this.f27161c.cardinality() > 1) {
            C10010p0.m38820a("Inserting a move to a block with multiple successors");
            return;
        }
        if (c6267r.m24754t() == c6267r2.m24754t()) {
            return;
        }
        ArrayList arrayList = this.f27159a;
        C8121l c8121l = (C8121l) arrayList.get(arrayList.size() - 1);
        if (c8121l.m31516n() != null || c8121l.mo31418o().size() > 0) {
            int iNextSetBit = this.f27161c.nextSetBit(0);
            while (iNextSetBit >= 0) {
                ((C8128s) this.f27165g.m31549m().get(iNextSetBit)).m31482f(c6267r, c6267r2);
                iNextSetBit = this.f27161c.nextSetBit(iNextSetBit + 1);
            }
            return;
        }
        C8121l c8121l2 = new C8121l(new C6265p(AbstractC6273x.m24808A(c6267r.getType()), C6274y.f19672d, c6267r, C6268s.m24767J(c6267r2)), this);
        ArrayList arrayList2 = this.f27159a;
        arrayList2.add(arrayList2.size() - 1, c8121l2);
        this.f27168j++;
    }

    /* JADX INFO: renamed from: h */
    public void m31484h(int i10) {
        this.f27159a.add(0, new C8123n(i10, this));
    }

    /* JADX INFO: renamed from: i */
    public void m31485i(C6267r c6267r) {
        this.f27159a.add(0, new C8123n(c6267r, this));
    }

    /* JADX INFO: renamed from: k */
    public void m31486k(C8128s c8128s) {
        if (this != c8128s && this.f27162d.size() == 0) {
            this.f27161c.set(c8128s.f27166h);
            this.f27162d.m33917w(c8128s.f27166h);
            this.f27163e = c8128s.f27166h;
            c8128s.f27160b.set(this.f27166h);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m31487l(AbstractC8131v.a aVar) {
        int size = this.f27159a.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC8131v) this.f27159a.get(i10)).mo31412a(aVar);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m31488m(C8123n.b bVar) {
        int size = this.f27159a.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC8131v abstractC8131v = (AbstractC8131v) this.f27159a.get(i10);
            if (!(abstractC8131v instanceof C8123n)) {
                return;
            }
            bVar.mo31439a((C8123n) abstractC8131v);
        }
    }

    /* JADX INFO: renamed from: n */
    public final int m31489n() {
        int size = this.f27159a.size();
        int i10 = 0;
        while (i10 < size && (((AbstractC8131v) this.f27159a.get(i10)) instanceof C8123n)) {
            i10++;
        }
        return i10;
    }

    /* JADX INFO: renamed from: o */
    public ArrayList m31490o() {
        return this.f27167i;
    }

    /* JADX INFO: renamed from: p */
    public int m31491p() {
        return this.f27166h;
    }

    /* JADX INFO: renamed from: q */
    public ArrayList m31492q() {
        return this.f27159a;
    }

    /* JADX INFO: renamed from: r */
    public InterfaceC8830l m31493r() {
        if (this.f27171m == null) {
            this.f27171m = AbstractC8127r.m31461c(this.f27165g.m31556u());
        }
        return this.f27171m;
    }

    /* JADX INFO: renamed from: s */
    public C8132w m31494s() {
        return this.f27165g;
    }

    /* JADX INFO: renamed from: t */
    public List m31495t() {
        return this.f27159a.subList(0, m31489n());
    }

    public String toString() {
        return "{" + this.f27166h + ":" + AbstractC8826h.m33898g(this.f27164f) + '}';
    }

    /* JADX INFO: renamed from: u */
    public BitSet m31496u() {
        return this.f27160b;
    }

    /* JADX INFO: renamed from: v */
    public C8128s m31497v() {
        if (this.f27163e < 0) {
            return null;
        }
        return (C8128s) this.f27165g.m31549m().get(this.f27163e);
    }

    /* JADX INFO: renamed from: w */
    public int m31498w() {
        return this.f27163e;
    }

    /* JADX INFO: renamed from: x */
    public int m31499x() {
        return this.f27165g.m31540d(this.f27163e);
    }

    /* JADX INFO: renamed from: y */
    public int m31500y() {
        return this.f27164f;
    }

    /* JADX INFO: renamed from: z */
    public String m31501z() {
        return AbstractC8826h.m33898g(this.f27164f);
    }
}
