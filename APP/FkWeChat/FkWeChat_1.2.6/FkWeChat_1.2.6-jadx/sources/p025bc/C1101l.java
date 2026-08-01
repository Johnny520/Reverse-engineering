package p025bc;

import java.util.Iterator;
import java.util.Map;
import p052dc.C1947e;
import p185m8.AbstractC5092m;
import p360yb.InterfaceC9662e;

/* JADX INFO: renamed from: bc.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1101l extends AbstractC5092m implements InterfaceC9662e {

    /* JADX INFO: renamed from: r */
    public final C1092c f3328r;

    public C1101l(C1092c c1092c) {
        c1092c.getClass();
        this.f3328r = c1092c;
    }

    @Override // p185m8.AbstractC5066b
    /* JADX INFO: renamed from: c */
    public int mo31c() {
        return this.f3328r.size();
    }

    @Override // p185m8.AbstractC5066b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return m4003e((Map.Entry) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public boolean m4003e(Map.Entry entry) {
        entry.getClass();
        return C1947e.f5423a.m7056a(this.f3328r, entry);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new C1102m(this.f3328r);
    }
}
