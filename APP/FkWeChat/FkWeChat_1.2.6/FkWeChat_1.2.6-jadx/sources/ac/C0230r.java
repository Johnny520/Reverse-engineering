package ac;

import java.util.Iterator;
import p185m8.AbstractC5066b;
import p360yb.InterfaceC9659b;

/* JADX INFO: renamed from: ac.r */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0230r extends AbstractC5066b implements InterfaceC9659b {

    /* JADX INFO: renamed from: q */
    public final C0216d f579q;

    public C0230r(C0216d c0216d) {
        c0216d.getClass();
        this.f579q = c0216d;
    }

    @Override // p185m8.AbstractC5066b
    /* JADX INFO: renamed from: c */
    public int mo31c() {
        return this.f579q.size();
    }

    @Override // p185m8.AbstractC5066b, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f579q.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C0231s(this.f579q.m462t());
    }
}
