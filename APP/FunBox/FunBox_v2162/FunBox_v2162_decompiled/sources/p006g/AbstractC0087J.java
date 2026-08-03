package p006g;

import java.util.Collection;
import java.util.Iterator;
import p013n.C0202d;

/* JADX INFO: renamed from: g.J */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0087J extends AbstractC0082E {
    @Override // p006g.AbstractC0082E
    /* JADX INFO: renamed from: a */
    public final int mo224a(AbstractC0108s abstractC0108s) {
        AbstractC0107r abstractC0107r = (AbstractC0107r) abstractC0108s;
        return m244b(abstractC0107r.mo232c() * abstractC0107r.m317e());
    }

    @Override // p006g.AbstractC0082E
    /* JADX INFO: renamed from: h */
    protected final void mo226h() {
        C0100k c0100kM246d = m246d();
        mo255o();
        Iterator it = mo225f().iterator();
        while (it.hasNext()) {
            ((AbstractC0108s) it.next()).mo242a(c0100kM246d);
        }
    }

    @Override // p006g.AbstractC0082E
    /* JADX INFO: renamed from: l */
    public final int mo227l() {
        Collection collectionMo225f = mo225f();
        int size = collectionMo225f.size();
        if (size == 0) {
            return 0;
        }
        return ((AbstractC0108s) collectionMo225f.iterator().next()).mo232c() * size;
    }

    @Override // p006g.AbstractC0082E
    /* JADX INFO: renamed from: n */
    protected final void mo228n(C0202d c0202d) {
        C0100k c0100kM246d = m246d();
        int iM245c = m245c();
        Iterator it = mo225f().iterator();
        while (it.hasNext()) {
            ((AbstractC0108s) it.next()).mo233d(c0100kM246d, c0202d);
            c0202d.m483a(iM245c);
        }
    }

    /* JADX INFO: renamed from: o */
    protected abstract void mo255o();
}
