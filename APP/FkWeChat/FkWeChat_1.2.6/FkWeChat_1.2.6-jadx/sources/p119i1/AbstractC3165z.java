package p119i1;

import java.util.Set;
import p024b9.AbstractC1041j;
import p036c9.InterfaceC1405f;

/* JADX INFO: renamed from: i1.z */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3165z implements Set, InterfaceC1405f {

    /* JADX INFO: renamed from: q */
    public final C3128g0 f8444q;

    public AbstractC3165z(C3128g0 c3128g0) {
        this.f8444q = c3128g0;
    }

    /* JADX INFO: renamed from: a */
    public final C3128g0 m11949a() {
        return this.f8444q;
    }

    /* JADX INFO: renamed from: c */
    public int m11950c() {
        return this.f8444q.size();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f8444q.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f8444q.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return m11950c();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return AbstractC1041j.m3803a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return AbstractC1041j.m3804b(this, objArr);
    }
}
