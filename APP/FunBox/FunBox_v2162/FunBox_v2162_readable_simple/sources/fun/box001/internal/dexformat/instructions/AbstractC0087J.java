package fun.box001.internal.dexformat.instructions;

import fun.box001.internal.dexformat.output.C0202d;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: g.J */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0087J extends AbstractC0082E {
    @Override // fun.box001.internal.dexformat.instructions.AbstractC0082E
    /* JADX INFO: renamed from: a */
    public final int mo224a(AbstractC0108s r2) {
        AbstractC0107r r22 = (AbstractC0107r) r2;
        int r0 = r22.m317e();
        return m244b(r22.mo232c() * r0);
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0082E
    /* JADX INFO: renamed from: h */
    protected final void mo226h() {
        C0100k r0 = m246d();
        mo255o();
        Iterator r1 = mo225f().iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        ((AbstractC0108s) r1.next()).mo242a(r0);
        goto L4
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0082E
    /* JADX INFO: renamed from: l */
    public final int mo227l() {
        Collection r0 = mo225f();
        int r1 = r0.size();
        if (r1 != 0) goto L7;
        return 0;
    L7:
        return ((AbstractC0108s) r0.iterator().next()).mo232c() * r1;
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0082E
    /* JADX INFO: renamed from: n */
    protected final void mo228n(C0202d r5) {
        C0100k r0 = m246d();
        int r1 = m245c();
        Iterator r2 = mo225f().iterator();
    L4:
        if (r2.hasNext() == false) goto L6;
        ((AbstractC0108s) r2.next()).mo233d(r0, r5);
        r5.m483a(r1);
        goto L4
    }

    /* JADX INFO: renamed from: o */
    protected abstract void mo255o();
}
