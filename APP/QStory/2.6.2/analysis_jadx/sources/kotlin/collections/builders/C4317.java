package kotlin.collections.builders;

import androidx.collection.C0276;
import bsh.C2632;
import java.util.AbstractList;
import java.util.ListIterator;
import kotlin.collections.builders.ListBuilder;
import p054.InterfaceC6566;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlin.collections.builders.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4317 implements ListIterator, InterfaceC6566 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f12892;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f12893;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f12894 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ListBuilder.BuilderSubList f12895;

    public C4317(ListBuilder.BuilderSubList builderSubList, int i) {
        this.f12895 = builderSubList;
        this.f12893 = i;
        this.f12892 = ((AbstractList) builderSubList).modCount;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        m8767();
        int i = this.f12893;
        this.f12893 = i + 1;
        ListBuilder.BuilderSubList builderSubList = this.f12895;
        builderSubList.add(i, obj);
        this.f12894 = -1;
        this.f12892 = ((AbstractList) builderSubList).modCount;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f12893 < this.f12895.length;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f12893 > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        m8767();
        int i = this.f12893;
        ListBuilder.BuilderSubList builderSubList = this.f12895;
        if (i >= builderSubList.length) {
            C2632.m5291();
            return null;
        }
        int i2 = this.f12893;
        this.f12893 = i2 + 1;
        this.f12894 = i2;
        return builderSubList.backing[builderSubList.offset + this.f12894];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f12893;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m8767();
        int i = this.f12893;
        if (i <= 0) {
            C2632.m5291();
            return null;
        }
        int i2 = i - 1;
        this.f12893 = i2;
        this.f12894 = i2;
        ListBuilder.BuilderSubList builderSubList = this.f12895;
        return builderSubList.backing[builderSubList.offset + this.f12894];
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f12893 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        m8767();
        int i = this.f12894;
        if (i == -1) {
            C5919.m11250("Call next() or previous() before removing element from the iterator.");
            return;
        }
        ListBuilder.BuilderSubList builderSubList = this.f12895;
        builderSubList.removeAt(i);
        this.f12893 = this.f12894;
        this.f12894 = -1;
        this.f12892 = ((AbstractList) builderSubList).modCount;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m8767();
        int i = this.f12894;
        if (i != -1) {
            this.f12895.set(i, obj);
        } else {
            C5919.m11250("Call next() or previous() before replacing element from the iterator.");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8767() {
        if (((AbstractList) this.f12895.root).modCount == this.f12892) {
            return;
        }
        C0276.m839();
    }
}
