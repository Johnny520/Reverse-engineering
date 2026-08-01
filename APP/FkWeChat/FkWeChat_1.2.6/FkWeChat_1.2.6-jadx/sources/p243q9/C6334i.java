package p243q9;

import java.util.Iterator;
import java.util.List;
import p213oa.C5692c;
import p243q9.InterfaceC6333h;

/* JADX INFO: renamed from: q9.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6334i implements InterfaceC6333h {

    /* JADX INFO: renamed from: q */
    public final List f19876q;

    public C6334i(List list) {
        list.getClass();
        this.f19876q = list;
    }

    @Override // p243q9.InterfaceC6333h
    /* JADX INFO: renamed from: b */
    public InterfaceC6328c mo3926b(C5692c c5692c) {
        return InterfaceC6333h.b.m25005a(this, c5692c);
    }

    @Override // p243q9.InterfaceC6333h
    /* JADX INFO: renamed from: i */
    public boolean mo3927i(C5692c c5692c) {
        return InterfaceC6333h.b.m25006b(this, c5692c);
    }

    @Override // p243q9.InterfaceC6333h
    public boolean isEmpty() {
        return this.f19876q.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f19876q.iterator();
    }

    public String toString() {
        return this.f19876q.toString();
    }
}
