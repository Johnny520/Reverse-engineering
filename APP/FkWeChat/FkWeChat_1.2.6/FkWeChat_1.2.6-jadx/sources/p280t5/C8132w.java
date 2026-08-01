package p280t5;

import bsh.C1193i2;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import p239q5.AbstractC6257h;
import p239q5.AbstractC6273x;
import p239q5.C6251c;
import p239q5.C6265p;
import p239q5.C6267r;
import p239q5.C6268s;
import p239q5.C6271v;
import p239q5.C6274y;
import p280t5.AbstractC8131v;
import p280t5.C8128s;
import p309v5.C8829k;

/* JADX INFO: renamed from: t5.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8132w {

    /* JADX INFO: renamed from: a */
    public ArrayList f27174a;

    /* JADX INFO: renamed from: b */
    public int f27175b;

    /* JADX INFO: renamed from: c */
    public int f27176c;

    /* JADX INFO: renamed from: d */
    public int f27177d;

    /* JADX INFO: renamed from: e */
    public int f27178e;

    /* JADX INFO: renamed from: f */
    public int f27179f;

    /* JADX INFO: renamed from: g */
    public int f27180g;

    /* JADX INFO: renamed from: h */
    public final int f27181h;

    /* JADX INFO: renamed from: i */
    public final boolean f27182i;

    /* JADX INFO: renamed from: j */
    public AbstractC8131v[] f27183j;

    /* JADX INFO: renamed from: k */
    public ArrayList[] f27184k;

    /* JADX INFO: renamed from: l */
    public List[] f27185l;

    /* JADX INFO: renamed from: m */
    public boolean f27186m = false;

    /* JADX INFO: renamed from: t5.w$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class a implements AbstractC8131v.a {
        public a() {
        }

        @Override // p280t5.AbstractC8131v.a
        /* JADX INFO: renamed from: a */
        public void mo31346a(C8123n c8123n) {
            C8132w.this.f27183j[c8123n.m31516n().m24754t()] = c8123n;
        }

        @Override // p280t5.AbstractC8131v.a
        /* JADX INFO: renamed from: b */
        public void mo31347b(C8121l c8121l) {
            if (c8121l.m31516n() != null) {
                C8132w.this.f27183j[c8121l.m31516n().m24754t()] = c8121l;
            }
        }

        @Override // p280t5.AbstractC8131v.a
        /* JADX INFO: renamed from: c */
        public void mo31348c(C8121l c8121l) {
            C8132w.this.f27183j[c8121l.m31516n().m24754t()] = c8121l;
        }
    }

    /* JADX INFO: renamed from: t5.w$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class b implements AbstractC8131v.a {
        public b() {
        }

        @Override // p280t5.AbstractC8131v.a
        /* JADX INFO: renamed from: a */
        public void mo31346a(C8123n c8123n) {
            m31561d(c8123n);
        }

        @Override // p280t5.AbstractC8131v.a
        /* JADX INFO: renamed from: b */
        public void mo31347b(C8121l c8121l) {
            m31561d(c8121l);
        }

        @Override // p280t5.AbstractC8131v.a
        /* JADX INFO: renamed from: c */
        public void mo31348c(C8121l c8121l) {
            m31561d(c8121l);
        }

        /* JADX INFO: renamed from: d */
        public final void m31561d(AbstractC8131v abstractC8131v) {
            C6268s c6268sMo31418o = abstractC8131v.mo31418o();
            int size = c6268sMo31418o.size();
            for (int i10 = 0; i10 < size; i10++) {
                C8132w.this.f27184k[c6268sMo31418o.m24769G(i10).m24754t()].add(abstractC8131v);
            }
        }
    }

    public C8132w(C6271v c6271v, int i10, boolean z10) {
        this.f27181h = i10;
        this.f27182i = z10;
        this.f27180g = c6271v.m24804b().m33922F();
        int iM24677P = c6271v.m24804b().m24677P();
        this.f27177d = iM24677P;
        this.f27178e = iM24677P;
    }

    /* JADX INFO: renamed from: D */
    public static C8132w m31521D(C6271v c6271v, int i10, boolean z10) {
        C8132w c8132w = new C8132w(c6271v, i10, z10);
        c8132w.m31544h(c6271v);
        return c8132w;
    }

    /* JADX INFO: renamed from: c */
    public static BitSet m31524c(C6251c c6251c, C8829k c8829k) {
        BitSet bitSet = new BitSet(c6251c.size());
        int size = c8829k.size();
        for (int i10 = 0; i10 < size; i10++) {
            bitSet.set(c6251c.m33923G(c8829k.m33920z(i10)));
        }
        return bitSet;
    }

    /* JADX INFO: renamed from: s */
    public static AbstractC8131v m31525s(C8128s c8128s) {
        return new C8121l(new C6265p(AbstractC6273x.f19640s, C6274y.f19672d, (C6267r) null, C6268s.f19445s), c8128s);
    }

    /* JADX INFO: renamed from: x */
    public static C8829k m31526x(C6251c c6251c, C8829k c8829k) {
        C8829k c8829k2 = new C8829k(c8829k.size());
        int size = c8829k.size();
        for (int i10 = 0; i10 < size; i10++) {
            c8829k2.m33917w(c6251c.m33923G(c8829k.m33920z(i10)));
        }
        return c8829k2;
    }

    /* JADX INFO: renamed from: A */
    public C8128s m31527A() {
        int size = this.f27174a.size();
        int i10 = this.f27180g;
        this.f27180g = i10 + 1;
        C8128s c8128s = new C8128s(size, i10, this);
        c8128s.m31492q().add(m31525s(c8128s));
        this.f27174a.add(c8128s);
        return c8128s;
    }

    /* JADX INFO: renamed from: B */
    public int m31528B() {
        int i10 = this.f27177d;
        int i11 = i10 + 1;
        this.f27177d = i11;
        this.f27178e = i11;
        m31532G();
        return i10;
    }

    /* JADX INFO: renamed from: C */
    public void m31529C(AbstractC8125p abstractC8125p) {
        Iterator it = m31549m().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((C8128s) it.next()).m31492q().iterator();
            while (it2.hasNext()) {
                ((AbstractC8131v) it2.next()).m31518w(abstractC8125p);
            }
        }
        int iMo31330a = abstractC8125p.mo31330a();
        this.f27177d = iMo31330a;
        this.f27178e = iMo31330a;
    }

    /* JADX INFO: renamed from: E */
    public void m31530E(AbstractC8131v abstractC8131v) {
        m31534I(abstractC8131v, null);
        m31539N(abstractC8131v, null);
    }

    /* JADX INFO: renamed from: F */
    public void m31531F(AbstractC8131v abstractC8131v) {
        if (this.f27184k != null) {
            m31535J(abstractC8131v, abstractC8131v.mo31418o());
        }
        C6267r c6267rM31516n = abstractC8131v.m31516n();
        AbstractC8131v[] abstractC8131vArr = this.f27183j;
        if (abstractC8131vArr == null || c6267rM31516n == null) {
            return;
        }
        abstractC8131vArr[c6267rM31516n.m24754t()] = null;
    }

    /* JADX INFO: renamed from: G */
    public void m31532G() {
        this.f27183j = null;
        this.f27184k = null;
        this.f27185l = null;
    }

    /* JADX INFO: renamed from: H */
    public void m31533H(AbstractC8131v abstractC8131v, C6267r c6267r, C6267r c6267r2) {
        if (this.f27184k == null) {
            return;
        }
        if (c6267r != null) {
            this.f27184k[c6267r.m24754t()].remove(abstractC8131v);
        }
        int iM24754t = c6267r2.m24754t();
        ArrayList[] arrayListArr = this.f27184k;
        if (arrayListArr.length <= iM24754t) {
            this.f27184k = null;
        } else {
            arrayListArr[iM24754t].add(abstractC8131v);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m31534I(AbstractC8131v abstractC8131v, C6268s c6268s) {
        if (this.f27184k == null) {
            return;
        }
        if (c6268s != null) {
            m31535J(abstractC8131v, c6268s);
        }
        C6268s c6268sMo31418o = abstractC8131v.mo31418o();
        int size = c6268sMo31418o.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f27184k[c6268sMo31418o.m24769G(i10).m24754t()].add(abstractC8131v);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m31535J(AbstractC8131v abstractC8131v, C6268s c6268s) {
        if (c6268s == null) {
            return;
        }
        int size = c6268s.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.f27184k[c6268s.m24769G(i10).m24754t()].remove(abstractC8131v)) {
                C1193i2.m4438a("use not found");
                return;
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public void m31536K() {
        this.f27179f = 0;
    }

    /* JADX INFO: renamed from: L */
    public void m31537L() {
        this.f27186m = true;
        this.f27184k = null;
        this.f27183j = null;
    }

    /* JADX INFO: renamed from: M */
    public void m31538M(int i10) {
        this.f27177d = i10;
        this.f27178e = i10;
        m31532G();
    }

    /* JADX INFO: renamed from: N */
    public void m31539N(AbstractC8131v abstractC8131v, C6267r c6267r) {
        if (this.f27183j == null) {
            return;
        }
        if (c6267r != null) {
            this.f27183j[c6267r.m24754t()] = null;
        }
        C6267r c6267rM31516n = abstractC8131v.m31516n();
        if (c6267rM31516n != null) {
            int iM24754t = c6267rM31516n.m24754t();
            AbstractC8131v[] abstractC8131vArr = this.f27183j;
            if (abstractC8131vArr[iM24754t] == null) {
                abstractC8131vArr[c6267rM31516n.m24754t()] = abstractC8131v;
            } else {
                C1193i2.m4438a("Duplicate add of insn");
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public int m31540d(int i10) {
        if (i10 < 0) {
            return -1;
        }
        return ((C8128s) this.f27174a.get(i10)).m31500y();
    }

    /* JADX INFO: renamed from: e */
    public int m31541e(int i10) {
        int i11 = this.f27178e;
        int i12 = this.f27179f;
        int i13 = i11 + i12;
        this.f27179f = i12 + i10;
        this.f27177d = Math.max(this.f27177d, i10 + i13);
        return i13;
    }

    /* JADX INFO: renamed from: f */
    public final void m31542f() {
        if (this.f27186m) {
            C1193i2.m4438a("No use list in back mode");
            return;
        }
        this.f27184k = new ArrayList[this.f27177d];
        for (int i10 = 0; i10 < this.f27177d; i10++) {
            this.f27184k[i10] = new ArrayList();
        }
        m31548l(new b());
        this.f27185l = new List[this.f27177d];
        for (int i11 = 0; i11 < this.f27177d; i11++) {
            this.f27185l[i11] = Collections.unmodifiableList(this.f27184k[i11]);
        }
    }

    /* JADX INFO: renamed from: g */
    public BitSet m31543g() {
        int size = this.f27174a.size();
        BitSet bitSet = new BitSet(size);
        BitSet bitSet2 = new BitSet(size);
        bitSet.set(m31551o().m31491p());
        while (true) {
            int iNextSetBit = bitSet.nextSetBit(0);
            if (iNextSetBit == -1) {
                return bitSet2;
            }
            bitSet2.set(iNextSetBit);
            bitSet.or(((C8128s) this.f27174a.get(iNextSetBit)).m31468C());
            bitSet.andNot(bitSet2);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m31544h(C6271v c6271v) {
        int size = c6271v.m24804b().size();
        this.f27174a = new ArrayList(size + 2);
        for (int i10 = 0; i10 < size; i10++) {
            this.f27174a.add(C8128s.m31462G(c6271v, i10, this));
        }
        this.f27175b = ((C8128s) this.f27174a.get(c6271v.m24804b().m33923G(c6271v.m24805c()))).m31469D().m31491p();
        this.f27176c = -1;
    }

    /* JADX INFO: renamed from: i */
    public void m31545i(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AbstractC8131v abstractC8131v = (AbstractC8131v) it.next();
            C8128s c8128sM31515f = abstractC8131v.m31515f();
            ArrayList arrayListM31492q = c8128sM31515f.m31492q();
            int size = arrayListM31492q.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                AbstractC8131v abstractC8131v2 = (AbstractC8131v) arrayListM31492q.get(size);
                if (abstractC8131v == abstractC8131v2) {
                    m31531F(abstractC8131v2);
                    arrayListM31492q.remove(size);
                    break;
                }
                size--;
            }
            int size2 = arrayListM31492q.size();
            AbstractC8131v abstractC8131v3 = size2 == 0 ? null : (AbstractC8131v) arrayListM31492q.get(size2 - 1);
            if (c8128sM31515f != m31553q() && (size2 == 0 || abstractC8131v3.mo31417k() == null || abstractC8131v3.mo31417k().m24695j().m24796b() == 1)) {
                arrayListM31492q.add(AbstractC8131v.m31513v(new C6265p(AbstractC6273x.f19640s, C6274y.f19672d, (C6267r) null, C6268s.f19445s), c8128sM31515f));
                BitSet bitSetM31468C = c8128sM31515f.m31468C();
                for (int iNextSetBit = bitSetM31468C.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSetM31468C.nextSetBit(iNextSetBit + 1)) {
                    if (iNextSetBit != c8128sM31515f.m31498w()) {
                        c8128sM31515f.m31473I(iNextSetBit);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m31546j(boolean z10, C8128s.b bVar) {
        BitSet bitSet = new BitSet(this.f27174a.size());
        Stack stack = new Stack();
        C8128s c8128sM31553q = z10 ? m31553q() : m31551o();
        if (c8128sM31553q == null) {
            return;
        }
        stack.add(null);
        stack.add(c8128sM31553q);
        while (stack.size() > 0) {
            C8128s c8128s = (C8128s) stack.pop();
            C8128s c8128s2 = (C8128s) stack.pop();
            if (!bitSet.get(c8128s.m31491p())) {
                BitSet bitSetM31496u = z10 ? c8128s.m31496u() : c8128s.m31468C();
                for (int iNextSetBit = bitSetM31496u.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSetM31496u.nextSetBit(iNextSetBit + 1)) {
                    stack.add(c8128s);
                    stack.add(this.f27174a.get(iNextSetBit));
                }
                bitSet.set(c8128s.m31491p());
                bVar.mo31359a(c8128s, c8128s2);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m31547k(C8128s.b bVar) {
        BitSet bitSet = new BitSet(m31549m().size());
        Stack stack = new Stack();
        stack.add(m31551o());
        while (stack.size() > 0) {
            C8128s c8128s = (C8128s) stack.pop();
            ArrayList arrayListM31490o = c8128s.m31490o();
            if (!bitSet.get(c8128s.m31491p())) {
                for (int size = arrayListM31490o.size() - 1; size >= 0; size--) {
                    stack.add((C8128s) arrayListM31490o.get(size));
                }
                bitSet.set(c8128s.m31491p());
                bVar.mo31359a(c8128s, null);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m31548l(AbstractC8131v.a aVar) {
        Iterator it = this.f27174a.iterator();
        while (it.hasNext()) {
            ((C8128s) it.next()).m31487l(aVar);
        }
    }

    /* JADX INFO: renamed from: m */
    public ArrayList m31549m() {
        return this.f27174a;
    }

    /* JADX INFO: renamed from: n */
    public AbstractC8131v m31550n(int i10) {
        if (this.f27186m) {
            C1193i2.m4438a("No def list in back mode");
            return null;
        }
        AbstractC8131v[] abstractC8131vArr = this.f27183j;
        if (abstractC8131vArr != null) {
            return abstractC8131vArr[i10];
        }
        this.f27183j = new AbstractC8131v[m31556u()];
        m31548l(new a());
        return this.f27183j[i10];
    }

    /* JADX INFO: renamed from: o */
    public C8128s m31551o() {
        return (C8128s) this.f27174a.get(this.f27175b);
    }

    /* JADX INFO: renamed from: p */
    public int m31552p() {
        return this.f27175b;
    }

    /* JADX INFO: renamed from: q */
    public C8128s m31553q() {
        int i10 = this.f27176c;
        if (i10 < 0) {
            return null;
        }
        return (C8128s) this.f27174a.get(i10);
    }

    /* JADX INFO: renamed from: r */
    public int m31554r() {
        return this.f27176c;
    }

    /* JADX INFO: renamed from: t */
    public int m31555t() {
        return this.f27181h;
    }

    /* JADX INFO: renamed from: u */
    public int m31556u() {
        return this.f27177d;
    }

    /* JADX INFO: renamed from: v */
    public ArrayList[] m31557v() {
        if (this.f27184k == null) {
            m31542f();
        }
        ArrayList[] arrayListArr = new ArrayList[this.f27177d];
        for (int i10 = 0; i10 < this.f27177d; i10++) {
            arrayListArr[i10] = new ArrayList(this.f27184k[i10]);
        }
        return arrayListArr;
    }

    /* JADX INFO: renamed from: w */
    public List m31558w(int i10) {
        if (this.f27185l == null) {
            m31542f();
        }
        return this.f27185l[i10];
    }

    /* JADX INFO: renamed from: y */
    public boolean m31559y(C6267r c6267r) {
        AbstractC8131v abstractC8131vM31550n = m31550n(c6267r.m24754t());
        if (abstractC8131vM31550n == null) {
            return false;
        }
        if (abstractC8131vM31550n.mo31415h() != null) {
            return true;
        }
        Iterator it = m31558w(c6267r.m24754t()).iterator();
        while (it.hasNext()) {
            AbstractC6257h abstractC6257hMo31417k = ((AbstractC8131v) it.next()).mo31417k();
            if (abstractC6257hMo31417k != null && abstractC6257hMo31417k.m24695j().m24798d() == 54) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: z */
    public void m31560z() {
        if (this.f27176c >= 0) {
            C1193i2.m4438a("must be called at most once");
            return;
        }
        this.f27176c = this.f27174a.size();
        int i10 = this.f27176c;
        int i11 = this.f27180g;
        this.f27180g = i11 + 1;
        C8128s c8128s = new C8128s(i10, i11, this);
        this.f27174a.add(c8128s);
        Iterator it = this.f27174a.iterator();
        while (it.hasNext()) {
            ((C8128s) it.next()).m31486k(c8128s);
        }
        if (c8128s.m31496u().cardinality() == 0) {
            this.f27174a.remove(this.f27176c);
            this.f27176c = -1;
            this.f27180g--;
        }
    }
}
