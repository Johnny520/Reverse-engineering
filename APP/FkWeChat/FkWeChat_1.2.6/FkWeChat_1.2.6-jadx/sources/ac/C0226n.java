package ac;

import java.util.Iterator;
import java.util.Map;
import p052dc.C1947e;
import p185m8.AbstractC5092m;
import p360yb.InterfaceC9662e;

/* JADX INFO: renamed from: ac.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0226n extends AbstractC5092m implements InterfaceC9662e {

    /* JADX INFO: renamed from: r */
    public final C0216d f577r;

    public C0226n(C0216d c0216d) {
        c0216d.getClass();
        this.f577r = c0216d;
    }

    @Override // p185m8.AbstractC5066b
    /* JADX INFO: renamed from: c */
    public int mo31c() {
        return this.f577r.size();
    }

    @Override // p185m8.AbstractC5066b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return m505e((Map.Entry) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public boolean m505e(Map.Entry entry) {
        entry.getClass();
        return C1947e.f5423a.m7056a(this.f577r, entry);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new C0227o(this.f577r.m462t());
    }
}
