package p280t5;

import bsh.C1259t2;
import p239q5.AbstractC6257h;
import p239q5.C6260k;
import p239q5.C6267r;
import p239q5.C6268s;
import p239q5.C6270u;
import p309v5.InterfaceC8837s;

/* JADX INFO: renamed from: t5.v */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8131v implements InterfaceC8837s, Cloneable {

    /* JADX INFO: renamed from: q */
    public final C8128s f27172q;

    /* JADX INFO: renamed from: r */
    public C6267r f27173r;

    /* JADX INFO: renamed from: t5.v$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo31346a(C8123n c8123n);

        /* JADX INFO: renamed from: b */
        void mo31347b(C8121l c8121l);

        /* JADX INFO: renamed from: c */
        void mo31348c(C8121l c8121l);
    }

    public AbstractC8131v(C6267r c6267r, C8128s c8128s) {
        if (c8128s == null) {
            C1259t2.m5095a("block == null");
            throw null;
        }
        this.f27172q = c8128s;
        this.f27173r = c6267r;
    }

    /* JADX INFO: renamed from: v */
    public static AbstractC8131v m31513v(AbstractC6257h abstractC6257h, C8128s c8128s) {
        return new C8121l(abstractC6257h, c8128s);
    }

    /* JADX INFO: renamed from: A */
    public abstract AbstractC6257h mo31407A();

    /* JADX INFO: renamed from: a */
    public abstract void mo31412a(a aVar);

    /* JADX INFO: renamed from: b */
    public abstract boolean mo31413b();

    /* JADX INFO: renamed from: c */
    public void m31514c(int i10) {
        C6267r c6267r = this.f27173r;
        if (c6267r != null) {
            this.f27173r = c6267r.m24745J(i10);
        }
    }

    /* JADX INFO: renamed from: d */
    public AbstractC8131v mo31414d() {
        try {
            return (AbstractC8131v) super.clone();
        } catch (CloneNotSupportedException e10) {
            C8130u.m31512a("unexpected", e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public C8128s m31515f() {
        return this.f27172q;
    }

    /* JADX INFO: renamed from: h */
    public C6267r mo31415h() {
        C6267r c6267r = this.f27173r;
        if (c6267r == null || c6267r.m24752p() == null) {
            return null;
        }
        return this.f27173r;
    }

    /* JADX INFO: renamed from: j */
    public abstract C6270u mo31416j();

    /* JADX INFO: renamed from: k */
    public abstract AbstractC6257h mo31417k();

    /* JADX INFO: renamed from: n */
    public C6267r m31516n() {
        return this.f27173r;
    }

    /* JADX INFO: renamed from: o */
    public abstract C6268s mo31418o();

    /* JADX INFO: renamed from: p */
    public abstract boolean mo31419p();

    /* JADX INFO: renamed from: q */
    public boolean mo31420q() {
        return false;
    }

    /* JADX INFO: renamed from: s */
    public boolean mo31421s() {
        return false;
    }

    /* JADX INFO: renamed from: t */
    public abstract boolean mo31422t();

    /* JADX INFO: renamed from: u */
    public boolean m31517u(int i10) {
        C6267r c6267r = this.f27173r;
        return c6267r != null && c6267r.m24754t() == i10;
    }

    /* JADX INFO: renamed from: w */
    public final void m31518w(AbstractC8125p abstractC8125p) {
        C6267r c6267r = this.f27173r;
        this.f27173r = abstractC8125p.mo31331b(c6267r);
        this.f27172q.m31494s().m31539N(this, c6267r);
        mo31423x(abstractC8125p);
    }

    /* JADX INFO: renamed from: x */
    public abstract void mo31423x(AbstractC8125p abstractC8125p);

    /* JADX INFO: renamed from: y */
    public void m31519y(C6267r c6267r) {
        if (c6267r != null) {
            this.f27173r = c6267r;
        } else {
            C1259t2.m5095a("result == null");
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m31520z(C6260k c6260k) {
        if (c6260k != this.f27173r.m24752p()) {
            if (c6260k == null || !c6260k.equals(this.f27173r.m24752p())) {
                this.f27173r = C6267r.m24734C(this.f27173r.m24754t(), this.f27173r.getType(), c6260k);
            }
        }
    }
}
