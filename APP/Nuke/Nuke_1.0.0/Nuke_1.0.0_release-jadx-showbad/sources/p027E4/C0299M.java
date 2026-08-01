package p027E4;

import p014C1.C0240b;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1676u;
import p128a.AbstractC1785a;

/* JADX INFO: renamed from: E4.M */
/* JADX INFO: loaded from: classes.dex */
public final class C0299M extends AbstractC0315b0 {

    /* JADX INFO: renamed from: d */
    public final Class f959d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0299M(Class cls) {
        this.f959d = cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p027E4.AbstractC0315b0
    /* JADX INFO: renamed from: a */
    public final void mo515a(C0303Q c0303q, Object obj) {
        C0240b c0240b = c0303q.f972e;
        c0240b.getClass();
        Class cls = this.f959d;
        AbstractC1665j.m2985e(cls, "type");
        c0240b.f812e = ((AbstractC1785a) c0240b.f812e).mo3156p(AbstractC1676u.m2995a(cls), obj);
    }
}
