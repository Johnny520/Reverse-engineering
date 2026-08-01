package re;

import be.AbstractC1113a;
import be.C1116d;
import java.util.List;
import okhttp3.internal.url._UrlKt;
import p080f9.C2363j;
import p175le.C4752a;
import p175le.C4756e;
import p185m8.AbstractC5081g0;

/* JADX INFO: renamed from: re.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6630i {

    /* JADX INFO: renamed from: re.i$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class a {

        /* JADX INFO: renamed from: a */
        public final int f20761a;

        public a(int i10) {
            this.f20761a = i10;
        }

        /* JADX INFO: renamed from: a */
        public a mo26266a() {
            return AbstractC6630i.this.new a(this.f20761a + 1);
        }

        /* JADX INFO: renamed from: b */
        public char m26267b(int i10) {
            if (i10 == 0) {
                return AbstractC6630i.this.m26264e(m26272g());
            }
            if (i10 == -1) {
                return AbstractC6630i.this.m26264e(m26272g() - 1);
            }
            if (i10 != 1) {
                return AbstractC6630i.this.m26264e(i10 > 0 ? m26276k(i10) : m26276k(i10 + 1) - 1);
            }
            return AbstractC6630i.this.m26264e(m26268c());
        }

        /* JADX INFO: renamed from: c */
        public final int m26268c() {
            return m26274i(0).m19025c();
        }

        /* JADX INFO: renamed from: d */
        public final char m26269d() {
            return AbstractC6630i.this.m26264e(m26274i(0).m19026d());
        }

        /* JADX INFO: renamed from: e */
        public final int m26270e() {
            return this.f20761a;
        }

        /* JADX INFO: renamed from: f */
        public final int m26271f() {
            return m26274i(0).m19025c() - m26274i(0).m19026d();
        }

        /* JADX INFO: renamed from: g */
        public final int m26272g() {
            return m26274i(0).m19026d();
        }

        /* JADX INFO: renamed from: h */
        public final AbstractC1113a m26273h() {
            return m26274i(0).m19027e();
        }

        /* JADX INFO: renamed from: i */
        public final C4756e m26274i(int i10) {
            int i11 = this.f20761a;
            AbstractC6630i abstractC6630i = AbstractC6630i.this;
            if (i11 < 0) {
                return new C4756e(null, abstractC6630i.mo26244d().m8560o(), AbstractC6630i.this.mo26244d().m8560o(), 0, 0);
            }
            if (i11 > abstractC6630i.mo26242b().size()) {
                return new C4756e(null, AbstractC6630i.this.mo26244d().m8561p() + 1, AbstractC6630i.this.mo26244d().m8561p() + 1, 0, 0);
            }
            int i12 = this.f20761a;
            int size = AbstractC6630i.this.mo26242b().size();
            AbstractC6630i abstractC6630i2 = AbstractC6630i.this;
            int iM19024b = (i12 < size ? ((C4756e) abstractC6630i2.mo26242b().get(this.f20761a)).m19024b() : abstractC6630i2.mo26241a().size()) + i10;
            AbstractC6630i abstractC6630i3 = AbstractC6630i.this;
            if (iM19024b < 0) {
                return new C4756e(null, abstractC6630i3.mo26244d().m8560o(), AbstractC6630i.this.mo26244d().m8560o(), 0, 0);
            }
            int size2 = abstractC6630i3.mo26241a().size();
            AbstractC6630i abstractC6630i4 = AbstractC6630i.this;
            return iM19024b >= size2 ? new C4756e(null, abstractC6630i4.mo26244d().m8561p() + 1, AbstractC6630i.this.mo26244d().m8561p() + 1, 0, 0) : (C4756e) abstractC6630i4.mo26241a().get(iM19024b);
        }

        /* JADX INFO: renamed from: j */
        public AbstractC1113a mo26275j(int i10) {
            return m26274i(i10).m19027e();
        }

        /* JADX INFO: renamed from: k */
        public final int m26276k(int i10) {
            return m26274i(i10).m19026d();
        }

        public String toString() {
            return "Iterator: " + this.f20761a + ": " + m26273h();
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract List mo26241a();

    /* JADX INFO: renamed from: b */
    public abstract List mo26242b();

    /* JADX INFO: renamed from: c */
    public abstract CharSequence mo26243c();

    /* JADX INFO: renamed from: d */
    public abstract C2363j mo26244d();

    /* JADX INFO: renamed from: e */
    public final char m26264e(int i10) {
        if (i10 >= mo26244d().m8560o() && i10 <= mo26244d().m8561p()) {
            return mo26243c().charAt(i10);
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: f */
    public final void m26265f() {
        int size = mo26241a().size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                int size2 = mo26242b().size();
                int i11 = 0;
                while (i11 < size2) {
                    C4752a c4752a = C4752a.f14072a;
                    if (!(((C4756e) mo26242b().get(i11)).m19023a() == i11)) {
                        throw new C1116d(_UrlKt.FRAGMENT_ENCODE_SET);
                    }
                    i11++;
                }
                return;
            }
            C4752a c4752a2 = C4752a.f14072a;
            if (!(((C4756e) mo26241a().get(i10)).m19024b() == i10)) {
                throw new C1116d(_UrlKt.FRAGMENT_ENCODE_SET);
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: re.i$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public final class b extends a {

        /* JADX INFO: renamed from: c */
        public final List f20763c;

        /* JADX INFO: renamed from: d */
        public final int f20764d;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(AbstractC6630i abstractC6630i, List list) {
            list.getClass();
            C2363j c2363j = (C2363j) AbstractC5081g0.m20578l0(list);
            this(list, 0, c2363j != null ? c2363j.m8568v().intValue() : -1);
        }

        @Override // re.AbstractC6630i.a
        /* JADX INFO: renamed from: j */
        public AbstractC1113a mo26275j(int i10) {
            C2363j c2363j = (C2363j) AbstractC5081g0.m20579m0(this.f20763c, this.f20764d);
            if (c2363j == null) {
                return null;
            }
            int iM8560o = c2363j.m8560o();
            int iM8561p = c2363j.m8561p();
            int iM26270e = m26270e() + i10;
            if (iM8560o > iM26270e || iM26270e > iM8561p) {
                return null;
            }
            return super.mo26275j(i10);
        }

        @Override // re.AbstractC6630i.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public b mo26266a() {
            if (this.f20764d >= this.f20763c.size()) {
                return this;
            }
            int iM26270e = m26270e();
            int iM8561p = ((C2363j) this.f20763c.get(this.f20764d)).m8561p();
            AbstractC6630i abstractC6630i = AbstractC6630i.this;
            if (iM26270e != iM8561p) {
                return abstractC6630i.new b(this.f20763c, this.f20764d, m26270e() + 1);
            }
            List list = this.f20763c;
            int i10 = this.f20764d;
            int i11 = i10 + 1;
            C2363j c2363j = (C2363j) AbstractC5081g0.m20579m0(list, i10 + 1);
            return abstractC6630i.new b(list, i11, c2363j != null ? c2363j.m8568v().intValue() : AbstractC6630i.this.mo26242b().size());
        }

        public b(List list, int i10, int i11) {
            super(i11);
            this.f20763c = list;
            this.f20764d = i10;
        }
    }
}
