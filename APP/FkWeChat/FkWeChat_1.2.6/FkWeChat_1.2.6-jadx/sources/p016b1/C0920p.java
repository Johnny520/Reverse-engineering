package p016b1;

import java.util.Iterator;
import p185m8.AbstractC5092m;
import p364z0.InterfaceC9826d;

/* JADX INFO: renamed from: b1.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0920p extends AbstractC5092m implements InterfaceC9826d {

    /* JADX INFO: renamed from: r */
    public final C0908d f2879r;

    public C0920p(C0908d c0908d) {
        this.f2879r = c0908d;
    }

    @Override // p185m8.AbstractC5066b
    /* JADX INFO: renamed from: c */
    public int mo31c() {
        return this.f2879r.size();
    }

    @Override // p185m8.AbstractC5066b, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f2879r.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new C0921q(this.f2879r.m3327t());
    }
}
