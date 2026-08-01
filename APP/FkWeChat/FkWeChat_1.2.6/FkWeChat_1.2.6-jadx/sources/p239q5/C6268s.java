package p239q5;

import java.util.BitSet;
import p269s5.C7188c;
import p269s5.InterfaceC7190e;
import p309v5.AbstractC8824f;

/* JADX INFO: renamed from: q5.s */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6268s extends AbstractC8824f implements InterfaceC7190e {

    /* JADX INFO: renamed from: s */
    public static final C6268s f19445s = new C6268s(0);

    /* JADX INFO: renamed from: q5.s$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final BitSet f19446a;

        /* JADX INFO: renamed from: b */
        public final C6268s f19447b;

        /* JADX INFO: renamed from: c */
        public int f19448c;

        /* JADX INFO: renamed from: d */
        public final C6268s f19449d;

        /* JADX INFO: renamed from: e */
        public boolean f19450e;

        public b(C6268s c6268s, BitSet bitSet, int i10, boolean z10) {
            this.f19447b = c6268s;
            this.f19446a = bitSet;
            this.f19448c = i10;
            this.f19449d = new C6268s(c6268s.size());
            this.f19450e = z10;
        }

        /* JADX INFO: renamed from: c */
        public final void m24781c(int i10) {
            m24782d(i10, (C6267r) this.f19447b.m33887w(i10));
        }

        /* JADX INFO: renamed from: d */
        public final void m24782d(int i10, C6267r c6267r) {
            BitSet bitSet = this.f19446a;
            if (bitSet == null || !bitSet.get(i10)) {
                c6267r = c6267r.m24745J(this.f19448c);
                if (!this.f19450e) {
                    this.f19448c += c6267r.m24751n();
                }
            }
            this.f19450e = false;
            this.f19449d.m33889y(i10, c6267r);
        }

        /* JADX INFO: renamed from: e */
        public final C6268s m24783e() {
            if (this.f19447b.m33928s()) {
                this.f19449d.mo6829t();
            }
            return this.f19449d;
        }
    }

    public C6268s(int i10) {
        super(i10);
    }

    /* JADX INFO: renamed from: J */
    public static C6268s m24767J(C6267r c6267r) {
        C6268s c6268s = new C6268s(1);
        c6268s.m24772L(0, c6267r);
        return c6268s;
    }

    /* JADX INFO: renamed from: K */
    public static C6268s m24768K(C6267r c6267r, C6267r c6267r2) {
        C6268s c6268s = new C6268s(2);
        c6268s.m24772L(0, c6267r);
        c6268s.m24772L(1, c6267r2);
        return c6268s;
    }

    /* JADX INFO: renamed from: G */
    public C6267r m24769G(int i10) {
        return (C6267r) m33887w(i10);
    }

    /* JADX INFO: renamed from: H */
    public int m24770H() {
        int size = size();
        int iM28416j = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iM28416j += getType(i10).m28416j();
        }
        return iM28416j;
    }

    /* JADX INFO: renamed from: I */
    public int m24771I(int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (m24769G(i11).m24754t() == i10) {
                return i11;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: L */
    public void m24772L(int i10, C6267r c6267r) {
        m33889y(i10, c6267r);
    }

    /* JADX INFO: renamed from: M */
    public C6268s m24773M(BitSet bitSet) {
        int size = size() - bitSet.cardinality();
        if (size == 0) {
            return f19445s;
        }
        C6268s c6268s = new C6268s(size);
        int i10 = 0;
        for (int i11 = 0; i11 < size(); i11++) {
            if (!bitSet.get(i11)) {
                c6268s.m33889y(i10, m33887w(i11));
                i10++;
            }
        }
        if (m33928s()) {
            c6268s.mo6829t();
        }
        return c6268s;
    }

    /* JADX INFO: renamed from: N */
    public C6268s m24774N(int i10, boolean z10, BitSet bitSet) {
        int size = size();
        if (size == 0) {
            return this;
        }
        b bVar = new b(bitSet, i10, z10);
        for (int i11 = 0; i11 < size; i11++) {
            bVar.m24781c(i11);
        }
        return bVar.m24783e();
    }

    /* JADX INFO: renamed from: O */
    public C6268s m24775O(C6267r c6267r) {
        int size = size();
        C6268s c6268s = new C6268s(size + 1);
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            c6268s.m33889y(i11, m33887w(i10));
            i10 = i11;
        }
        c6268s.m33889y(0, c6267r);
        if (m33928s()) {
            c6268s.mo6829t();
        }
        return c6268s;
    }

    /* JADX INFO: renamed from: P */
    public C6268s m24776P(int i10) {
        int size = size();
        if (size == 0) {
            return this;
        }
        C6268s c6268s = new C6268s(size);
        for (int i11 = 0; i11 < size; i11++) {
            C6267r c6267r = (C6267r) m33887w(i11);
            if (c6267r != null) {
                c6268s.m33889y(i11, c6267r.m24744I(i10));
            }
        }
        if (m33928s()) {
            c6268s.mo6829t();
        }
        return c6268s;
    }

    /* JADX INFO: renamed from: Q */
    public C6268s m24777Q() {
        int size = size() - 1;
        if (size == 0) {
            return f19445s;
        }
        C6268s c6268s = new C6268s(size);
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            c6268s.m33889y(i10, m33887w(i11));
            i10 = i11;
        }
        if (m33928s()) {
            c6268s.mo6829t();
        }
        return c6268s;
    }

    /* JADX INFO: renamed from: R */
    public C6268s m24778R() {
        int size = size() - 1;
        if (size == 0) {
            return f19445s;
        }
        C6268s c6268s = new C6268s(size);
        for (int i10 = 0; i10 < size; i10++) {
            c6268s.m33889y(i10, m33887w(i10));
        }
        if (m33928s()) {
            c6268s.mo6829t();
        }
        return c6268s;
    }

    @Override // p269s5.InterfaceC7190e
    public C7188c getType(int i10) {
        return m24769G(i10).getType().getType();
    }

    @Override // p269s5.InterfaceC7190e
    /* JADX INFO: renamed from: h */
    public InterfaceC7190e mo8384h(C7188c c7188c) {
        throw new UnsupportedOperationException("unsupported");
    }
}
