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
public final class C4695 extends AbstractList implements RandomAccess, InterfaceC4718 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4714 f13740;

    public C4695(C4714 c4714) {
        this.f13740 = c4714;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.f13740.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        C4702 c4702 = new C4702();
        c4702.f13754 = this.f13740.iterator();
        return c4702;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        C4703 c4703 = new C4703();
        c4703.f13755 = this.f13740.listIterator(i);
        return c4703;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13740.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4718
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final void mo9336(C4716 c4716) {
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4718
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final AbstractC4710 mo9337(int i) {
        return this.f13740.mo9337(i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4718
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List mo9339() {
        return Collections.unmodifiableList(this.f13740.f13782);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4718
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C4695 mo9338() {
        return this;
    }
}
