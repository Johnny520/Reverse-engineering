package p016b1;

import java.util.Iterator;
import java.util.Map;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: b1.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0912h extends AbstractC0905a {

    /* JADX INFO: renamed from: q */
    public final C0910f f2874q;

    public C0912h(C0910f c0910f) {
        this.f2874q = c0910f;
    }

    @Override // p185m8.AbstractC5090l
    /* JADX INFO: renamed from: a */
    public int mo500a() {
        return this.f2874q.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f2874q.clear();
    }

    @Override // p016b1.AbstractC0905a
    /* JADX INFO: renamed from: e */
    public boolean mo3319e(Map.Entry entry) {
        Object obj = this.f2874q.get(entry.getKey());
        return obj != null ? AbstractC1061t.m3842c(obj, entry.getValue()) : entry.getValue() == null && this.f2874q.containsKey(entry.getKey());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new C0913i(this.f2874q);
    }

    @Override // p016b1.AbstractC0905a
    /* JADX INFO: renamed from: o */
    public boolean mo3321o(Map.Entry entry) {
        return this.f2874q.remove(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry entry) {
        throw new UnsupportedOperationException();
    }
}
