package p025bc;

import java.util.Iterator;
import p185m8.AbstractC5066b;
import p360yb.InterfaceC9659b;

/* JADX INFO: renamed from: bc.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1106q extends AbstractC5066b implements InterfaceC9659b {

    /* JADX INFO: renamed from: q */
    public final C1092c f3335q;

    public C1106q(C1092c c1092c) {
        c1092c.getClass();
        this.f3335q = c1092c;
    }

    @Override // p185m8.AbstractC5066b
    /* JADX INFO: renamed from: c */
    public int mo31c() {
        return this.f3335q.size();
    }

    @Override // p185m8.AbstractC5066b, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f3335q.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C1107r(this.f3335q);
    }
}
