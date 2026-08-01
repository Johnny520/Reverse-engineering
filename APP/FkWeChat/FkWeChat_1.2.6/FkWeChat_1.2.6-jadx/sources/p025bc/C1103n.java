package p025bc;

import java.util.Iterator;
import p185m8.AbstractC5092m;
import p360yb.InterfaceC9662e;

/* JADX INFO: renamed from: bc.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1103n extends AbstractC5092m implements InterfaceC9662e {

    /* JADX INFO: renamed from: r */
    public final C1092c f3330r;

    public C1103n(C1092c c1092c) {
        c1092c.getClass();
        this.f3330r = c1092c;
    }

    @Override // p185m8.AbstractC5066b
    /* JADX INFO: renamed from: c */
    public int mo31c() {
        return this.f3330r.size();
    }

    @Override // p185m8.AbstractC5066b, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f3330r.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new C1104o(this.f3330r);
    }
}
