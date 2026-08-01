package p037T;

import p051b0.C0493b;
import p051b0.C0494c;

/* JADX INFO: renamed from: T.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0260k extends AbstractC0274y {

    /* JADX INFO: renamed from: a */
    public AbstractC0274y f611a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p037T.AbstractC0274y
    /* JADX INFO: renamed from: a */
    public final Object mo476a(C0493b c0493b) {
        AbstractC0274y abstractC0274y = this.f611a;
        if (abstractC0274y != null) {
            return abstractC0274y.mo476a(c0493b);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p037T.AbstractC0274y
    /* JADX INFO: renamed from: b */
    public final void mo477b(C0494c c0494c, Object obj) {
        AbstractC0274y abstractC0274y = this.f611a;
        if (abstractC0274y == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        abstractC0274y.mo477b(c0494c, obj);
    }
}
