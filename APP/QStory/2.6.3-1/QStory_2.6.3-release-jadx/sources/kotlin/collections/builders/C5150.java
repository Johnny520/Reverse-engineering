package kotlin.collections.builders;

import androidx.collection.C1123;
import bsh.C3466;
import java.util.AbstractList;
import java.util.ListIterator;
import kotlin.collections.builders.ListBuilder;
import p070.InterfaceC7396;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlin.collections.builders.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5150 implements ListIterator, InterfaceC7396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f13241;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f13242;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f13243 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ListBuilder.BuilderSubList f13244;

    public C5150(ListBuilder.BuilderSubList builderSubList, int i) {
        this.f13244 = builderSubList;
        this.f13242 = i;
        this.f13241 = ((AbstractList) builderSubList).modCount;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        m9316();
        int i = this.f13242;
        this.f13242 = i + 1;
        ListBuilder.BuilderSubList builderSubList = this.f13244;
        builderSubList.add(i, obj);
        this.f13243 = -1;
        this.f13241 = ((AbstractList) builderSubList).modCount;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f13242 < this.f13244.length;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f13242 > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        m9316();
        int i = this.f13242;
        ListBuilder.BuilderSubList builderSubList = this.f13244;
        if (i >= builderSubList.length) {
            C3466.m5896();
            return null;
        }
        int i2 = this.f13242;
        this.f13242 = i2 + 1;
        this.f13243 = i2;
        return builderSubList.backing[builderSubList.offset + this.f13243];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f13242;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m9316();
        int i = this.f13242;
        if (i <= 0) {
            C3466.m5896();
            return null;
        }
        int i2 = i - 1;
        this.f13242 = i2;
        this.f13243 = i2;
        ListBuilder.BuilderSubList builderSubList = this.f13244;
        return builderSubList.backing[builderSubList.offset + this.f13243];
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f13242 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        m9316();
        int i = this.f13243;
        if (i == -1) {
            C6755.m11870("Call next() or previous() before removing element from the iterator.");
            return;
        }
        ListBuilder.BuilderSubList builderSubList = this.f13244;
        builderSubList.removeAt(i);
        this.f13242 = this.f13243;
        this.f13243 = -1;
        this.f13241 = ((AbstractList) builderSubList).modCount;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m9316();
        int i = this.f13243;
        if (i != -1) {
            this.f13244.set(i, obj);
        } else {
            C6755.m11870("Call next() or previous() before replacing element from the iterator.");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m9316() {
        if (((AbstractList) this.f13244.root).modCount == this.f13241) {
            return;
        }
        C1123.m1400();
    }
}
