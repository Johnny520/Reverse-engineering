package kotlin.collections.builders;

import androidx.collection.C0276;
import bsh.C2633;
import java.util.AbstractList;
import java.util.ListIterator;
import kotlin.collections.builders.ListBuilder;
import p054.InterfaceC6567;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlin.collections.builders.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4318 implements ListIterator, InterfaceC6567 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f12896;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f12897;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f12898 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ListBuilder.BuilderSubList f12899;

    public C4318(ListBuilder.BuilderSubList builderSubList, int i) {
        this.f12899 = builderSubList;
        this.f12897 = i;
        this.f12896 = ((AbstractList) builderSubList).modCount;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        m8757();
        int i = this.f12897;
        this.f12897 = i + 1;
        ListBuilder.BuilderSubList builderSubList = this.f12899;
        builderSubList.add(i, obj);
        this.f12898 = -1;
        this.f12896 = ((AbstractList) builderSubList).modCount;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f12897 < this.f12899.length;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f12897 > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        m8757();
        int i = this.f12897;
        ListBuilder.BuilderSubList builderSubList = this.f12899;
        if (i >= builderSubList.length) {
            C2633.m5336();
            return null;
        }
        int i2 = this.f12897;
        this.f12897 = i2 + 1;
        this.f12898 = i2;
        return builderSubList.backing[builderSubList.offset + this.f12898];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f12897;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m8757();
        int i = this.f12897;
        if (i <= 0) {
            C2633.m5336();
            return null;
        }
        int i2 = i - 1;
        this.f12897 = i2;
        this.f12898 = i2;
        ListBuilder.BuilderSubList builderSubList = this.f12899;
        return builderSubList.backing[builderSubList.offset + this.f12898];
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f12897 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        m8757();
        int i = this.f12898;
        if (i == -1) {
            C5925.m11311("Call next() or previous() before removing element from the iterator.");
            return;
        }
        ListBuilder.BuilderSubList builderSubList = this.f12899;
        builderSubList.removeAt(i);
        this.f12897 = this.f12898;
        this.f12898 = -1;
        this.f12896 = ((AbstractList) builderSubList).modCount;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m8757();
        int i = this.f12898;
        if (i != -1) {
            this.f12899.set(i, obj);
        } else {
            C5925.m11311("Call next() or previous() before replacing element from the iterator.");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8757() {
        if (((AbstractList) this.f12899.root).modCount == this.f12896) {
            return;
        }
        C0276.m840();
    }
}
