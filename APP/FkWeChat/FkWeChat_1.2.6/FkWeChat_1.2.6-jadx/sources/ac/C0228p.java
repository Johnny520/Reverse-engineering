package ac;

import java.util.Iterator;
import p185m8.AbstractC5092m;
import p360yb.InterfaceC9662e;

/* JADX INFO: renamed from: ac.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0228p extends AbstractC5092m implements InterfaceC9662e {

    /* JADX INFO: renamed from: r */
    public final C0216d f578r;

    public C0228p(C0216d c0216d) {
        c0216d.getClass();
        this.f578r = c0216d;
    }

    @Override // p185m8.AbstractC5066b
    /* JADX INFO: renamed from: c */
    public int mo31c() {
        return this.f578r.size();
    }

    @Override // p185m8.AbstractC5066b, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f578r.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new C0229q(this.f578r.m462t());
    }
}
