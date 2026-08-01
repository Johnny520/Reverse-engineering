package p137j4;

import java.util.Map;
import p024b9.AbstractC1043k;
import p137j4.AbstractC3594a;

/* JADX INFO: renamed from: j4.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3595b extends AbstractC3594a {
    public C3595b(Map map) {
        map.getClass();
        m13449b().putAll(map);
    }

    @Override // p137j4.AbstractC3594a
    /* JADX INFO: renamed from: a */
    public Object mo13448a(AbstractC3594a.c cVar) {
        cVar.getClass();
        return m13449b().get(cVar);
    }

    /* JADX INFO: renamed from: c */
    public final void m13450c(AbstractC3594a.c cVar, Object obj) {
        cVar.getClass();
        m13449b().put(cVar, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3595b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3595b(AbstractC3594a abstractC3594a) {
        this(abstractC3594a.m13449b());
        abstractC3594a.getClass();
    }

    public /* synthetic */ C3595b(AbstractC3594a abstractC3594a, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? AbstractC3594a.b.f9991c : abstractC3594a);
    }
}
