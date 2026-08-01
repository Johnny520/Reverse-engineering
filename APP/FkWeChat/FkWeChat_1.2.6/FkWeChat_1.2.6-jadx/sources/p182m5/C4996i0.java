package p182m5;

import bsh.C1259t2;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;
import p254r5.AbstractC6487a;
import p254r5.C6519x;
import p376zd.C9987e;

/* JADX INFO: renamed from: m5.i0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4996i0 extends AbstractC5028y0 {

    /* JADX INFO: renamed from: f */
    public final TreeMap f15187f;

    public C4996i0(C5009p c5009p) {
        super("method_handles", c5009p, 8);
        this.f15187f = new TreeMap();
    }

    @Override // p182m5.AbstractC5012q0
    /* JADX INFO: renamed from: g */
    public Collection mo20137g() {
        return this.f15187f.values();
    }

    @Override // p182m5.AbstractC5028y0
    /* JADX INFO: renamed from: q */
    public void mo20135q() {
        Iterator it = this.f15187f.values().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            ((C4994h0) it.next()).m20101m(i10);
            i10++;
        }
    }

    /* JADX INFO: renamed from: r */
    public AbstractC4979a0 m20154r(AbstractC6487a abstractC6487a) {
        if (abstractC6487a == null) {
            C1259t2.m5095a("cst == null");
            return null;
        }
        m20278k();
        AbstractC4979a0 abstractC4979a0 = (AbstractC4979a0) this.f15187f.get((C6519x) abstractC6487a);
        if (abstractC4979a0 != null) {
            return abstractC4979a0;
        }
        C9987e.m38645a("not found");
        return null;
    }

    /* JADX INFO: renamed from: s */
    public int m20155s(C6519x c6519x) {
        return ((C4994h0) this.f15187f.get(c6519x)).m20098j();
    }

    /* JADX INFO: renamed from: t */
    public synchronized void m20156t(C6519x c6519x) {
        if (c6519x == null) {
            throw new NullPointerException("methodHandle == null");
        }
        m20279l();
        if (((C4994h0) this.f15187f.get(c6519x)) == null) {
            this.f15187f.put(c6519x, new C4994h0(c6519x));
        }
    }
}
