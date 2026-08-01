package p239q5;

import p239q5.AbstractC6257h;
import p309v5.AbstractC8826h;
import p309v5.AbstractC8832n;
import p309v5.C8829k;
import p376zd.C9993h;

/* JADX INFO: renamed from: q5.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6251c extends AbstractC8832n {

    /* JADX INFO: renamed from: t */
    public int f19392t;

    /* JADX INFO: renamed from: q5.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a implements AbstractC6257h.b {

        /* JADX INFO: renamed from: a */
        public int f19393a = 0;

        @Override // p239q5.AbstractC6257h.b
        /* JADX INFO: renamed from: a */
        public void mo15698a(C6263n c6263n) {
            m24683j(c6263n);
        }

        @Override // p239q5.AbstractC6257h.b
        /* JADX INFO: renamed from: b */
        public void mo15704b(C6259j c6259j) {
            m24683j(c6259j);
        }

        @Override // p239q5.AbstractC6257h.b
        /* JADX INFO: renamed from: c */
        public void mo15699c(C6265p c6265p) {
            m24683j(c6265p);
        }

        @Override // p239q5.AbstractC6257h.b
        /* JADX INFO: renamed from: d */
        public void mo15705d(C6256g c6256g) {
            m24683j(c6256g);
        }

        @Override // p239q5.AbstractC6257h.b
        /* JADX INFO: renamed from: e */
        public void mo15700e(C6250b0 c6250b0) {
            m24683j(c6250b0);
        }

        @Override // p239q5.AbstractC6257h.b
        /* JADX INFO: renamed from: f */
        public void mo15701f(C6248a0 c6248a0) {
            m24683j(c6248a0);
        }

        @Override // p239q5.AbstractC6257h.b
        /* JADX INFO: renamed from: g */
        public void mo15702g(C6275z c6275z) {
            m24683j(c6275z);
        }

        /* JADX INFO: renamed from: h */
        public int m24681h() {
            return this.f19393a;
        }

        /* JADX INFO: renamed from: i */
        public final void m24682i(C6267r c6267r) {
            int iM24753s = c6267r.m24753s();
            if (iM24753s > this.f19393a) {
                this.f19393a = iM24753s;
            }
        }

        /* JADX INFO: renamed from: j */
        public final void m24683j(AbstractC6257h abstractC6257h) {
            C6267r c6267rM24697n = abstractC6257h.m24697n();
            if (c6267rM24697n != null) {
                m24682i(c6267rM24697n);
            }
            C6268s c6268sM24698o = abstractC6257h.m24698o();
            int size = c6268sM24698o.size();
            for (int i10 = 0; i10 < size; i10++) {
                m24682i(c6268sM24698o.m24769G(i10));
            }
        }
    }

    public C6251c(C6251c c6251c) {
        super(c6251c);
        this.f19392t = c6251c.f19392t;
    }

    /* JADX INFO: renamed from: K */
    public void m24672K(AbstractC6257h.b bVar) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            m24673L(i10).m24665d().m24703F(bVar);
        }
    }

    /* JADX INFO: renamed from: L */
    public C6249b m24673L(int i10) {
        return (C6249b) m33887w(i10);
    }

    /* JADX INFO: renamed from: M */
    public int m24674M() {
        int size = size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            C6249b c6249b = (C6249b) m33888x(i11);
            if (c6249b != null) {
                C6258i c6258iM24665d = c6249b.m24665d();
                int size2 = c6258iM24665d.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    if (c6258iM24665d.m24704G(i12).m24695j().m24798d() != 54) {
                        i10++;
                    }
                }
            }
        }
        return i10;
    }

    /* JADX INFO: renamed from: N */
    public int m24675N() {
        int size = size();
        int size2 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            C6249b c6249b = (C6249b) m33888x(i10);
            if (c6249b != null) {
                size2 += c6249b.m24665d().size();
            }
        }
        return size2;
    }

    /* JADX INFO: renamed from: O */
    public C6251c m24676O() {
        return new C6251c(this);
    }

    /* JADX INFO: renamed from: P */
    public int m24677P() {
        if (this.f19392t == -1) {
            a aVar = new a();
            m24672K(aVar);
            this.f19392t = aVar.m24681h();
        }
        return this.f19392t;
    }

    /* JADX INFO: renamed from: Q */
    public C6249b m24678Q(int i10) {
        int iM33923G = m33923G(i10);
        if (iM33923G >= 0) {
            return m24673L(iM33923G);
        }
        C9993h.m38666a("no such label: ", AbstractC8826h.m33898g(i10));
        return null;
    }

    /* JADX INFO: renamed from: R */
    public C6249b m24679R(C6249b c6249b) {
        int iM24667f = c6249b.m24667f();
        C8829k c8829kM24669h = c6249b.m24669h();
        int size = c8829kM24669h.size();
        if (size != 0) {
            return size != 1 ? iM24667f != -1 ? m24678Q(iM24667f) : m24678Q(c8829kM24669h.m33920z(0)) : m24678Q(c8829kM24669h.m33920z(0));
        }
        return null;
    }

    /* JADX INFO: renamed from: S */
    public void m24680S(int i10, C6249b c6249b) {
        super.m33926J(i10, c6249b);
        this.f19392t = -1;
    }

    public C6251c(int i10) {
        super(i10);
        this.f19392t = -1;
    }
}
