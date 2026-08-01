package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5527 extends AbstractList implements RandomAccess, InterfaceC5550 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C5546 f14085;

    public C5527(C5546 c5546) {
        this.f14085 = c5546;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.f14085.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        C5534 c5534 = new C5534();
        c5534.f14099 = this.f14085.iterator();
        return c5534;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        C5535 c5535 = new C5535();
        c5535.f14100 = this.f14085.listIterator(i);
        return c5535;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14085.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5550
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final void mo9895(C5548 c5548) {
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5550
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final AbstractC5542 mo9896(int i) {
        return this.f14085.mo9896(i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5550
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List mo9898() {
        return Collections.unmodifiableList(this.f14085.f14127);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5550
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C5527 mo9897() {
        return this;
    }
}
