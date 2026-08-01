package ac;

import java.util.Map;
import p052dc.AbstractC1943a;

/* JADX INFO: renamed from: ac.y */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0237y extends AbstractC0233u {

    /* JADX INFO: renamed from: t */
    public final C0221i f591t;

    public C0237y(C0221i c0221i) {
        c0221i.getClass();
        this.f591t = c0221i;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        AbstractC1943a.m7049a(m569x());
        m564D(m568v() + 2);
        return new C0215c(this.f591t, m567o()[m568v() - 2], m567o()[m568v() - 1]);
    }
}
