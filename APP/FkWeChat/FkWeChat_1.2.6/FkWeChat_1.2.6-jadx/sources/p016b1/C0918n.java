package p016b1;

import java.util.Iterator;
import java.util.Map;
import p024b9.AbstractC1061t;
import p185m8.AbstractC5092m;
import p364z0.InterfaceC9826d;

/* JADX INFO: renamed from: b1.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0918n extends AbstractC5092m implements InterfaceC9826d {

    /* JADX INFO: renamed from: r */
    public final C0908d f2878r;

    public C0918n(C0908d c0908d) {
        this.f2878r = c0908d;
    }

    @Override // p185m8.AbstractC5066b
    /* JADX INFO: renamed from: c */
    public int mo31c() {
        return this.f2878r.size();
    }

    @Override // p185m8.AbstractC5066b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return m3353e((Map.Entry) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public boolean m3353e(Map.Entry entry) {
        if (entry == null) {
            return false;
        }
        Object obj = this.f2878r.get(entry.getKey());
        return obj != null ? AbstractC1061t.m3842c(obj, entry.getValue()) : entry.getValue() == null && this.f2878r.containsKey(entry.getKey());
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new C0919o(this.f2878r.m3327t());
    }
}
