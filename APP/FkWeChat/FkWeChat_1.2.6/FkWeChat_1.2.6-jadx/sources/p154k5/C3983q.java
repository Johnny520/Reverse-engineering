package p154k5;

import bsh.C1193i2;
import bsh.C1259t2;
import java.util.ArrayList;
import java.util.Arrays;
import p239q5.C6267r;
import p239q5.C6269t;
import p254r5.C6492c0;
import p254r5.C6496e0;
import p269s5.C7188c;
import p309v5.AbstractC8824f;
import p376zd.C9987e;

/* JADX INFO: renamed from: k5.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3983q extends AbstractC8824f {

    /* JADX INFO: renamed from: s */
    public static final C3983q f11718s = new C3983q(0);

    /* JADX INFO: renamed from: k5.q$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public enum a {
        START,
        END_SIMPLY,
        END_REPLACED,
        END_MOVED,
        END_CLOBBERED_BY_PREV,
        END_CLOBBERED_BY_NEXT
    }

    /* JADX INFO: renamed from: k5.q$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class b implements Comparable {

        /* JADX INFO: renamed from: q */
        public final int f11726q;

        /* JADX INFO: renamed from: r */
        public final a f11727r;

        /* JADX INFO: renamed from: s */
        public final C6267r f11728s;

        /* JADX INFO: renamed from: t */
        public final C6496e0 f11729t;

        public b(int i10, a aVar, C6267r c6267r) {
            if (i10 < 0) {
                C9987e.m38645a("address < 0");
                throw null;
            }
            if (aVar == null) {
                C1259t2.m5095a("disposition == null");
                throw null;
            }
            try {
                if (c6267r.m24752p() == null) {
                    throw new NullPointerException("spec.getLocalItem() == null");
                }
                this.f11726q = i10;
                this.f11727r = aVar;
                this.f11728s = c6267r;
                this.f11729t = C6496e0.m25758u(c6267r.getType());
            } catch (NullPointerException unused) {
                C1259t2.m5095a("spec == null");
                throw null;
            }
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            int i10 = this.f11726q;
            int i11 = bVar.f11726q;
            if (i10 < i11) {
                return -1;
            }
            if (i10 > i11) {
                return 1;
            }
            boolean zM15847m = m15847m();
            return zM15847m != bVar.m15847m() ? zM15847m ? 1 : -1 : this.f11728s.compareTo(bVar.f11728s);
        }

        /* JADX INFO: renamed from: c */
        public int m15840c() {
            return this.f11726q;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && compareTo((b) obj) == 0;
        }

        /* JADX INFO: renamed from: g */
        public a m15841g() {
            return this.f11727r;
        }

        /* JADX INFO: renamed from: h */
        public C6492c0 m15842h() {
            return this.f11728s.m24752p().m24715g();
        }

        /* JADX INFO: renamed from: i */
        public int m15843i() {
            return this.f11728s.m24754t();
        }

        /* JADX INFO: renamed from: j */
        public C6267r m15844j() {
            return this.f11728s;
        }

        /* JADX INFO: renamed from: k */
        public C6492c0 m15845k() {
            return this.f11728s.m24752p().m24716h();
        }

        /* JADX INFO: renamed from: l */
        public C6496e0 m15846l() {
            return this.f11729t;
        }

        /* JADX INFO: renamed from: m */
        public boolean m15847m() {
            return this.f11727r == a.START;
        }

        /* JADX INFO: renamed from: n */
        public boolean m15848n(b bVar) {
            return m15849p(bVar.f11728s);
        }

        /* JADX INFO: renamed from: p */
        public boolean m15849p(C6267r c6267r) {
            return this.f11728s.m24750k(c6267r);
        }

        /* JADX INFO: renamed from: r */
        public b m15850r(a aVar) {
            return aVar == this.f11727r ? this : new b(this.f11726q, aVar, this.f11728s);
        }

        public String toString() {
            return Integer.toHexString(this.f11726q) + " " + this.f11727r + " " + this.f11728s;
        }
    }

    /* JADX INFO: renamed from: k5.q$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final ArrayList f11730a;

        /* JADX INFO: renamed from: b */
        public int f11731b = 0;

        /* JADX INFO: renamed from: c */
        public C6269t f11732c = null;

        /* JADX INFO: renamed from: d */
        public int[] f11733d = null;

        /* JADX INFO: renamed from: e */
        public final int f11734e = 0;

        public c(int i10) {
            this.f11730a = new ArrayList(i10);
        }

        /* JADX INFO: renamed from: g */
        public static C6267r m15851g(C6267r c6267r) {
            return (c6267r == null || c6267r.getType() != C7188c.f23829H) ? c6267r : c6267r.m24747L(C7188c.f23837P);
        }

        /* JADX INFO: renamed from: a */
        public final void m15852a(int i10, int i11) {
            int[] iArr = this.f11733d;
            boolean z10 = iArr == null;
            int i12 = this.f11734e;
            if (i10 != i12 || z10) {
                if (i10 < i12) {
                    C1193i2.m4438a("shouldn't happen");
                    return;
                }
                if (z10 || i11 >= iArr.length) {
                    int i13 = i11 + 1;
                    C6269t c6269t = new C6269t(i13);
                    int[] iArr2 = new int[i13];
                    Arrays.fill(iArr2, -1);
                    if (!z10) {
                        c6269t.m24788E(this.f11732c);
                        int[] iArr3 = this.f11733d;
                        System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
                    }
                    this.f11732c = c6269t;
                    this.f11733d = iArr2;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m15853b(int i10, a aVar, C6267r c6267r) {
            int iM24754t = c6267r.m24754t();
            this.f11730a.add(new b(i10, aVar, c6267r));
            a aVar2 = a.START;
            C6269t c6269t = this.f11732c;
            if (aVar == aVar2) {
                c6269t.m24787D(c6267r);
                this.f11733d[iM24754t] = -1;
            } else {
                c6269t.m24789F(c6267r);
                this.f11733d[iM24754t] = this.f11730a.size() - 1;
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m15854c(int i10, a aVar, C6267r c6267r) {
            if (aVar == a.START) {
                C1193i2.m4438a("shouldn't happen");
                return;
            }
            int i11 = this.f11733d[c6267r.m24754t()];
            if (i11 >= 0) {
                b bVar = (b) this.f11730a.get(i11);
                if (bVar.m15840c() == i10 && bVar.m15844j().equals(c6267r)) {
                    this.f11730a.set(i11, bVar.m15850r(aVar));
                    this.f11732c.m24789F(c6267r);
                    return;
                }
            }
            m15857f(i10, c6267r, aVar);
        }

        /* JADX INFO: renamed from: d */
        public final boolean m15855d(int i10, C6267r c6267r) {
            boolean z10;
            int size = this.f11730a.size() - 1;
            while (true) {
                z10 = false;
                if (size < 0) {
                    break;
                }
                b bVar = (b) this.f11730a.get(size);
                if (bVar != null) {
                    if (bVar.m15840c() != i10) {
                        return false;
                    }
                    if (bVar.m15849p(c6267r)) {
                        break;
                    }
                }
                size--;
            }
            this.f11732c.m24789F(c6267r);
            b bVar2 = null;
            this.f11730a.set(size, null);
            this.f11731b++;
            int iM24754t = c6267r.m24754t();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                bVar2 = (b) this.f11730a.get(size);
                if (bVar2 != null && bVar2.m15844j().m24754t() == iM24754t) {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                this.f11733d[iM24754t] = size;
                if (bVar2.m15840c() == i10) {
                    this.f11730a.set(size, bVar2.m15850r(a.END_SIMPLY));
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: e */
        public void m15856e(int i10, C6267r c6267r) {
            m15857f(i10, c6267r, a.END_SIMPLY);
        }

        /* JADX INFO: renamed from: f */
        public void m15857f(int i10, C6267r c6267r, a aVar) {
            int iM24754t = c6267r.m24754t();
            C6267r c6267rM15851g = m15851g(c6267r);
            m15852a(i10, iM24754t);
            if (this.f11733d[iM24754t] < 0 && !m15855d(i10, c6267rM15851g)) {
                m15853b(i10, aVar, c6267rM15851g);
            }
        }

        /* JADX INFO: renamed from: h */
        public C3983q m15858h() {
            m15852a(Integer.MAX_VALUE, 0);
            int size = this.f11730a.size();
            int i10 = size - this.f11731b;
            if (i10 == 0) {
                return C3983q.f11718s;
            }
            b[] bVarArr = new b[i10];
            ArrayList<b> arrayList = this.f11730a;
            if (size == i10) {
                arrayList.toArray(bVarArr);
            } else {
                int i11 = 0;
                for (b bVar : arrayList) {
                    if (bVar != null) {
                        bVarArr[i11] = bVar;
                        i11++;
                    }
                }
            }
            Arrays.sort(bVarArr);
            C3983q c3983q = new C3983q(i10);
            for (int i12 = 0; i12 < i10; i12++) {
                c3983q.m15838G(i12, bVarArr[i12]);
            }
            c3983q.mo6829t();
            return c3983q;
        }

        /* JADX INFO: renamed from: i */
        public void m15859i(int i10, C6269t c6269t) {
            int iM24794z = c6269t.m24794z();
            m15852a(i10, iM24794z - 1);
            for (int i11 = 0; i11 < iM24794z; i11++) {
                C6267r c6267rM24792x = this.f11732c.m24792x(i11);
                C6267r c6267rM15851g = m15851g(c6269t.m24792x(i11));
                if (c6267rM24792x == null) {
                    if (c6267rM15851g != null) {
                        m15860j(i10, c6267rM15851g);
                    }
                } else if (c6267rM15851g == null) {
                    m15856e(i10, c6267rM24792x);
                } else if (!c6267rM15851g.m24750k(c6267rM24792x)) {
                    m15856e(i10, c6267rM24792x);
                    m15860j(i10, c6267rM15851g);
                }
            }
        }

        /* JADX INFO: renamed from: j */
        public void m15860j(int i10, C6267r c6267r) {
            C6267r c6267rM24792x;
            C6267r c6267rM24792x2;
            int iM24754t = c6267r.m24754t();
            C6267r c6267rM15851g = m15851g(c6267r);
            m15852a(i10, iM24754t);
            C6267r c6267rM24792x3 = this.f11732c.m24792x(iM24754t);
            if (c6267rM15851g.m24750k(c6267rM24792x3)) {
                return;
            }
            C6267r c6267rM24791w = this.f11732c.m24791w(c6267rM15851g);
            if (c6267rM24791w != null) {
                m15854c(i10, a.END_MOVED, c6267rM24791w);
            }
            int i11 = this.f11733d[iM24754t];
            if (c6267rM24792x3 != null) {
                m15853b(i10, a.END_REPLACED, c6267rM24792x3);
            } else if (i11 >= 0) {
                b bVar = (b) this.f11730a.get(i11);
                if (bVar.m15840c() == i10) {
                    if (bVar.m15849p(c6267rM15851g)) {
                        this.f11730a.set(i11, null);
                        this.f11731b++;
                        this.f11732c.m24787D(c6267rM15851g);
                        this.f11733d[iM24754t] = -1;
                        return;
                    }
                    this.f11730a.set(i11, bVar.m15850r(a.END_REPLACED));
                }
            }
            if (iM24754t > 0 && (c6267rM24792x2 = this.f11732c.m24792x(iM24754t - 1)) != null && c6267rM24792x2.m24757y()) {
                m15854c(i10, a.END_CLOBBERED_BY_NEXT, c6267rM24792x2);
            }
            if (c6267rM15851g.m24757y() && (c6267rM24792x = this.f11732c.m24792x(iM24754t + 1)) != null) {
                m15854c(i10, a.END_CLOBBERED_BY_PREV, c6267rM24792x);
            }
            m15853b(i10, a.START, c6267rM15851g);
        }
    }

    public C3983q(int i10) {
        super(i10);
    }

    /* JADX INFO: renamed from: F */
    public static C3983q m15836F(C3977k c3977k) {
        int size = c3977k.size();
        c cVar = new c(size);
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC3976j abstractC3976jM15787F = c3977k.m15787F(i10);
            if (abstractC3976jM15787F instanceof C3984r) {
                cVar.m15859i(abstractC3976jM15787F.m15772h(), ((C3984r) abstractC3976jM15787F).m15861A());
            } else if (abstractC3976jM15787F instanceof C3985s) {
                cVar.m15860j(abstractC3976jM15787F.m15772h(), ((C3985s) abstractC3976jM15787F).m15863A());
            }
        }
        return cVar.m15858h();
    }

    /* JADX INFO: renamed from: E */
    public b m15837E(int i10) {
        return (b) m33887w(i10);
    }

    /* JADX INFO: renamed from: G */
    public void m15838G(int i10, b bVar) {
        m33889y(i10, bVar);
    }
}
