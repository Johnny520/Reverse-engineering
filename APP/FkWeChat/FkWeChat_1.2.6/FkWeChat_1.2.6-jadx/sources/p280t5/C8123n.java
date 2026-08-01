package p280t5;

import java.util.ArrayList;
import java.util.List;
import p239q5.AbstractC6257h;
import p239q5.C6260k;
import p239q5.C6267r;
import p239q5.C6268s;
import p239q5.C6270u;
import p239q5.C6274y;
import p269s5.C7188c;
import p269s5.InterfaceC7189d;
import p280t5.AbstractC8131v;
import p309v5.AbstractC8826h;

/* JADX INFO: renamed from: t5.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8123n extends AbstractC8131v {

    /* JADX INFO: renamed from: s */
    public final int f27140s;

    /* JADX INFO: renamed from: t */
    public final ArrayList f27141t;

    /* JADX INFO: renamed from: u */
    public C6268s f27142u;

    /* JADX INFO: renamed from: t5.n$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a {

        /* JADX INFO: renamed from: a */
        public C6267r f27143a;

        /* JADX INFO: renamed from: b */
        public final int f27144b;

        /* JADX INFO: renamed from: c */
        public final int f27145c;

        public a(C6267r c6267r, int i10, int i11) {
            this.f27143a = c6267r;
            this.f27144b = i10;
            this.f27145c = i11;
        }
    }

    /* JADX INFO: renamed from: t5.n$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo31439a(C8123n c8123n);
    }

    public C8123n(int i10, C8128s c8128s) {
        super(C6267r.m24732A(i10, C7188c.f23828G), c8128s);
        this.f27141t = new ArrayList();
        this.f27140s = i10;
    }

    @Override // p280t5.AbstractC8131v
    /* JADX INFO: renamed from: A */
    public AbstractC6257h mo31407A() {
        throw new IllegalArgumentException("Cannot convert phi insns to rop form");
    }

    /* JADX INFO: renamed from: B */
    public void m31430B(C6267r c6267r, C8128s c8128s) {
        this.f27141t.add(new a(c6267r, c8128s.m31491p(), c8128s.m31500y()));
        this.f27142u = null;
    }

    /* JADX INFO: renamed from: C */
    public void m31431C(InterfaceC7189d interfaceC7189d, C6260k c6260k) {
        m31519y(C6267r.m24734C(m31516n().m24754t(), interfaceC7189d, c6260k));
    }

    @Override // p280t5.AbstractC8131v
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C8123n mo31414d() {
        throw new UnsupportedOperationException("can't clone phi");
    }

    /* JADX INFO: renamed from: E */
    public int m31433E() {
        return this.f27140s;
    }

    /* JADX INFO: renamed from: F */
    public int m31434F(int i10) {
        return ((a) this.f27141t.get(i10)).f27144b;
    }

    /* JADX INFO: renamed from: G */
    public List m31435G(int i10, C8132w c8132w) {
        ArrayList arrayList = new ArrayList();
        for (a aVar : this.f27141t) {
            if (aVar.f27143a.m24754t() == i10) {
                arrayList.add(c8132w.m31549m().get(aVar.f27144b));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: H */
    public void m31436H(C6267r c6267r) {
        ArrayList arrayList = new ArrayList();
        for (a aVar : this.f27141t) {
            if (aVar.f27143a.m24754t() == c6267r.m24754t()) {
                arrayList.add(aVar);
            }
        }
        this.f27141t.removeAll(arrayList);
        this.f27142u = null;
    }

    /* JADX INFO: renamed from: I */
    public final String m31437I(String str) {
        StringBuilder sb2 = new StringBuilder(80);
        sb2.append(C6274y.f19672d);
        sb2.append(": phi");
        if (str != null) {
            sb2.append("(");
            sb2.append(str);
            sb2.append(")");
        }
        C6267r c6267rM31516n = m31516n();
        if (c6267rM31516n == null) {
            sb2.append(" .");
        } else {
            sb2.append(" ");
            sb2.append(c6267rM31516n.mo6828g());
        }
        sb2.append(" <-");
        int size = mo31418o().size();
        if (size == 0) {
            sb2.append(" .");
        } else {
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append(" ");
                sb2.append(this.f27142u.m24769G(i10).mo6828g() + "[b=" + AbstractC8826h.m33898g(((a) this.f27141t.get(i10)).f27145c) + "]");
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: J */
    public void m31438J(C8132w c8132w) {
        for (a aVar : this.f27141t) {
            aVar.f27143a = aVar.f27143a.m24747L(c8132w.m31550n(aVar.f27143a.m24754t()).m31516n().getType());
        }
        this.f27142u = null;
    }

    @Override // p280t5.AbstractC8131v
    /* JADX INFO: renamed from: a */
    public void mo31412a(AbstractC8131v.a aVar) {
        aVar.mo31346a(this);
    }

    @Override // p280t5.AbstractC8131v
    /* JADX INFO: renamed from: b */
    public boolean mo31413b() {
        return false;
    }

    @Override // p309v5.InterfaceC8837s
    /* JADX INFO: renamed from: g */
    public String mo6828g() {
        return m31437I(null);
    }

    @Override // p280t5.AbstractC8131v
    /* JADX INFO: renamed from: j */
    public C6270u mo31416j() {
        return null;
    }

    @Override // p280t5.AbstractC8131v
    /* JADX INFO: renamed from: k */
    public AbstractC6257h mo31417k() {
        return null;
    }

    @Override // p280t5.AbstractC8131v
    /* JADX INFO: renamed from: o */
    public C6268s mo31418o() {
        C6268s c6268s = this.f27142u;
        if (c6268s != null) {
            return c6268s;
        }
        if (this.f27141t.size() == 0) {
            return C6268s.f19445s;
        }
        int size = this.f27141t.size();
        this.f27142u = new C6268s(size);
        for (int i10 = 0; i10 < size; i10++) {
            this.f27142u.m24772L(i10, ((a) this.f27141t.get(i10)).f27143a);
        }
        this.f27142u.mo6829t();
        return this.f27142u;
    }

    @Override // p280t5.AbstractC8131v
    /* JADX INFO: renamed from: p */
    public boolean mo31419p() {
        return AbstractC8122m.m31425b() && mo31415h() != null;
    }

    @Override // p280t5.AbstractC8131v
    /* JADX INFO: renamed from: t */
    public boolean mo31422t() {
        return true;
    }

    @Override // p280t5.AbstractC8131v
    /* JADX INFO: renamed from: x */
    public final void mo31423x(AbstractC8125p abstractC8125p) {
        for (a aVar : this.f27141t) {
            C6267r c6267r = aVar.f27143a;
            C6267r c6267rMo31331b = abstractC8125p.mo31331b(c6267r);
            aVar.f27143a = c6267rMo31331b;
            if (c6267r != c6267rMo31331b) {
                m31515f().m31494s().m31533H(this, c6267r, aVar.f27143a);
            }
        }
        this.f27142u = null;
    }

    public C8123n(C6267r c6267r, C8128s c8128s) {
        super(c6267r, c8128s);
        this.f27141t = new ArrayList();
        this.f27140s = c6267r.m24754t();
    }
}
