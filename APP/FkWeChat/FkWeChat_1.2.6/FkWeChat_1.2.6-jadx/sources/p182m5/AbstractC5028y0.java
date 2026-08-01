package p182m5;

import java.util.Collection;
import java.util.Iterator;
import p309v5.InterfaceC8819a;

/* JADX INFO: renamed from: m5.y0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5028y0 extends AbstractC5012q0 {
    public AbstractC5028y0(String str, C5009p c5009p, int i10) {
        super(str, c5009p, i10);
    }

    @Override // p182m5.AbstractC5012q0
    /* JADX INFO: renamed from: b */
    public final int mo20186b(AbstractC4982b0 abstractC4982b0) {
        AbstractC4979a0 abstractC4979a0 = (AbstractC4979a0) abstractC4982b0;
        return m20272c(abstractC4979a0.m20098j() * abstractC4979a0.mo20111h());
    }

    @Override // p182m5.AbstractC5012q0
    /* JADX INFO: renamed from: i */
    public final void mo20187i() {
        C5009p c5009pM20274e = m20274e();
        mo20135q();
        Iterator it = mo20137g().iterator();
        while (it.hasNext()) {
            ((AbstractC4982b0) it.next()).mo20090a(c5009pM20274e);
        }
    }

    @Override // p182m5.AbstractC5012q0
    /* JADX INFO: renamed from: n */
    public final int mo20188n() {
        Collection collectionMo20137g = mo20137g();
        int size = collectionMo20137g.size();
        if (size == 0) {
            return 0;
        }
        return size * ((AbstractC4982b0) collectionMo20137g.iterator().next()).mo20111h();
    }

    @Override // p182m5.AbstractC5012q0
    /* JADX INFO: renamed from: p */
    public final void mo20189p(InterfaceC8819a interfaceC8819a) {
        C5009p c5009pM20274e = m20274e();
        int iM20273d = m20273d();
        Iterator it = mo20137g().iterator();
        while (it.hasNext()) {
            ((AbstractC4982b0) it.next()).mo20112i(c5009pM20274e, interfaceC8819a);
            interfaceC8819a.mo33869l(iM20273d);
        }
    }

    /* JADX INFO: renamed from: q */
    public abstract void mo20135q();
}
