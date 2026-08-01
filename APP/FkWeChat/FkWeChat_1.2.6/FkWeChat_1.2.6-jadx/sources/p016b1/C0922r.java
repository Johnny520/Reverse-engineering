package p016b1;

import java.util.Iterator;
import p185m8.AbstractC5066b;
import p364z0.InterfaceC9824b;

/* JADX INFO: renamed from: b1.r */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0922r extends AbstractC5066b implements InterfaceC9824b {

    /* JADX INFO: renamed from: q */
    public final C0908d f2880q;

    public C0922r(C0908d c0908d) {
        this.f2880q = c0908d;
    }

    @Override // p185m8.AbstractC5066b
    /* JADX INFO: renamed from: c */
    public int mo31c() {
        return this.f2880q.size();
    }

    @Override // p185m8.AbstractC5066b, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f2880q.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C0923s(this.f2880q.m3327t());
    }
}
