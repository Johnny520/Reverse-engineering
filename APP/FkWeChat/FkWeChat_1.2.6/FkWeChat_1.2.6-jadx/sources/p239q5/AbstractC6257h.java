package p239q5;

import bsh.C1259t2;
import p269s5.C7187b;
import p269s5.C7188c;
import p269s5.InterfaceC7190e;
import p309v5.InterfaceC8837s;

/* JADX INFO: renamed from: q5.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6257h implements InterfaceC8837s {

    /* JADX INFO: renamed from: q */
    public final C6270u f19416q;

    /* JADX INFO: renamed from: r */
    public final C6274y f19417r;

    /* JADX INFO: renamed from: s */
    public final C6267r f19418s;

    /* JADX INFO: renamed from: t */
    public final C6268s f19419t;

    /* JADX INFO: renamed from: q5.h$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo15698a(C6263n c6263n);

        /* JADX INFO: renamed from: b */
        void mo15704b(C6259j c6259j);

        /* JADX INFO: renamed from: c */
        void mo15699c(C6265p c6265p);

        /* JADX INFO: renamed from: d */
        void mo15705d(C6256g c6256g);

        /* JADX INFO: renamed from: e */
        void mo15700e(C6250b0 c6250b0);

        /* JADX INFO: renamed from: f */
        void mo15701f(C6248a0 c6248a0);

        /* JADX INFO: renamed from: g */
        void mo15702g(C6275z c6275z);
    }

    public AbstractC6257h(C6270u c6270u, C6274y c6274y, C6267r c6267r, C6268s c6268s) {
        if (c6270u == null) {
            C1259t2.m5095a("opcode == null");
            throw null;
        }
        if (c6274y == null) {
            C1259t2.m5095a("position == null");
            throw null;
        }
        if (c6268s == null) {
            C1259t2.m5095a("sources == null");
            throw null;
        }
        this.f19416q = c6270u;
        this.f19417r = c6274y;
        this.f19418s = c6267r;
        this.f19419t = c6268s;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m24692d(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo24658a(b bVar);

    /* JADX INFO: renamed from: b */
    public final boolean m24693b() {
        return this.f19416q.m24795a();
    }

    /* JADX INFO: renamed from: c */
    public boolean mo24687c(AbstractC6257h abstractC6257h) {
        return this.f19416q == abstractC6257h.m24695j() && this.f19417r.equals(abstractC6257h.m24696k()) && getClass() == abstractC6257h.getClass() && m24692d(this.f19418s, abstractC6257h.m24697n()) && m24692d(this.f19419t, abstractC6257h.m24698o()) && C7187b.m28391F(mo24659e(), abstractC6257h.mo24659e());
    }

    /* JADX INFO: renamed from: e */
    public abstract InterfaceC7190e mo24659e();

    public final boolean equals(Object obj) {
        return this == obj;
    }

    /* JADX INFO: renamed from: f */
    public String mo24660f() {
        return null;
    }

    @Override // p309v5.InterfaceC8837s
    /* JADX INFO: renamed from: g */
    public String mo6828g() {
        return m24699p(mo24660f());
    }

    /* JADX INFO: renamed from: h */
    public final C6267r m24694h() {
        C6267r c6267rM24769G = this.f19416q.m24798d() == 54 ? this.f19419t.m24769G(0) : this.f19418s;
        if (c6267rM24769G == null || c6267rM24769G.m24752p() == null) {
            return null;
        }
        return c6267rM24769G;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    /* JADX INFO: renamed from: j */
    public final C6270u m24695j() {
        return this.f19416q;
    }

    /* JADX INFO: renamed from: k */
    public final C6274y m24696k() {
        return this.f19417r;
    }

    /* JADX INFO: renamed from: n */
    public final C6267r m24697n() {
        return this.f19418s;
    }

    /* JADX INFO: renamed from: o */
    public final C6268s m24698o() {
        return this.f19419t;
    }

    /* JADX INFO: renamed from: p */
    public final String m24699p(String str) {
        StringBuilder sb2 = new StringBuilder(80);
        sb2.append(this.f19417r);
        sb2.append(": ");
        sb2.append(this.f19416q.m24797c());
        if (str != null) {
            sb2.append("(");
            sb2.append(str);
            sb2.append(")");
        }
        if (this.f19418s == null) {
            sb2.append(" .");
        } else {
            sb2.append(" ");
            sb2.append(this.f19418s.mo6828g());
        }
        sb2.append(" <-");
        int size = this.f19419t.size();
        if (size == 0) {
            sb2.append(" .");
        } else {
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append(" ");
                sb2.append(this.f19419t.m24769G(i10).mo6828g());
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: q */
    public final String m24700q(String str) {
        StringBuilder sb2 = new StringBuilder(80);
        sb2.append("Insn{");
        sb2.append(this.f19417r);
        sb2.append(' ');
        sb2.append(this.f19416q);
        if (str != null) {
            sb2.append(' ');
            sb2.append(str);
        }
        sb2.append(" :: ");
        C6267r c6267r = this.f19418s;
        if (c6267r != null) {
            sb2.append(c6267r);
            sb2.append(" <- ");
        }
        sb2.append(this.f19419t);
        sb2.append('}');
        return sb2.toString();
    }

    /* JADX INFO: renamed from: s */
    public abstract AbstractC6257h mo24661s(C7188c c7188c);

    /* JADX INFO: renamed from: t */
    public abstract AbstractC6257h mo24662t(C6267r c6267r, C6268s c6268s);

    public String toString() {
        return m24700q(mo24660f());
    }

    /* JADX INFO: renamed from: u */
    public AbstractC6257h mo24701u() {
        return this;
    }

    /* JADX INFO: renamed from: q5.h$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a implements b {
        @Override // p239q5.AbstractC6257h.b
        /* JADX INFO: renamed from: b */
        public void mo15704b(C6259j c6259j) {
        }

        @Override // p239q5.AbstractC6257h.b
        /* JADX INFO: renamed from: c */
        public void mo15699c(C6265p c6265p) {
        }

        @Override // p239q5.AbstractC6257h.b
        /* JADX INFO: renamed from: d */
        public void mo15705d(C6256g c6256g) {
        }

        @Override // p239q5.AbstractC6257h.b
        /* JADX INFO: renamed from: e */
        public void mo15700e(C6250b0 c6250b0) {
        }

        @Override // p239q5.AbstractC6257h.b
        /* JADX INFO: renamed from: f */
        public void mo15701f(C6248a0 c6248a0) {
        }

        @Override // p239q5.AbstractC6257h.b
        /* JADX INFO: renamed from: g */
        public void mo15702g(C6275z c6275z) {
        }
    }
}
