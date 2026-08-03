package p006g;

import java.util.Collection;
import java.util.TreeMap;
import p000a.AbstractC0001b;
import p010k.AbstractC0171a;
import p010k.AbstractC0174d;
import p013n.C0202d;

/* JADX INFO: renamed from: g.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0115z extends AbstractC0112w {

    /* JADX INFO: renamed from: f */
    private final TreeMap f433f;

    public C0115z(C0100k c0100k) {
        super("method_ids", c0100k);
        this.f433f = new TreeMap();
    }

    @Override // p006g.AbstractC0082E
    /* JADX INFO: renamed from: f */
    public final Collection mo225f() {
        return this.f433f.values();
    }

    /* JADX INFO: renamed from: p */
    public final AbstractC0107r m337p(AbstractC0171a abstractC0171a) {
        if (abstractC0171a == null) {
            throw new NullPointerException("cst == null");
        }
        m250j();
        AbstractC0107r abstractC0107r = (AbstractC0107r) this.f433f.get((AbstractC0174d) abstractC0171a);
        if (abstractC0107r != null) {
            return abstractC0107r;
        }
        throw new IllegalArgumentException("not found");
    }

    /* JADX INFO: renamed from: q */
    public final int m338q(AbstractC0174d abstractC0174d) {
        if (abstractC0174d == null) {
            throw new NullPointerException("ref == null");
        }
        m250j();
        C0114y c0114y = (C0114y) this.f433f.get(abstractC0174d);
        if (c0114y != null) {
            return c0114y.m317e();
        }
        throw new IllegalArgumentException("not found");
    }

    /* JADX INFO: renamed from: r */
    public final synchronized void m339r(AbstractC0174d abstractC0174d) {
        if (abstractC0174d == null) {
            throw new NullPointerException("method == null");
        }
        m251k();
        if (((C0114y) this.f433f.get(abstractC0174d)) == null) {
            this.f433f.put(abstractC0174d, new C0114y(abstractC0174d));
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m340s(C0202d c0202d) {
        m250j();
        int size = this.f433f.size();
        int iM247e = size == 0 ? 0 : m247e();
        if (c0202d.m486d()) {
            c0202d.m484b(4, "method_ids_size: ".concat(AbstractC0001b.m13s(size)));
            c0202d.m484b(4, "method_ids_off:  ".concat(AbstractC0001b.m13s(iM247e)));
        }
        c0202d.m497q(size);
        c0202d.m497q(iM247e);
    }
}
