package androidx.compose.runtime.snapshots;

import java.util.List;
import java.util.ListIterator;
import kotlin.collections.AbstractC5176;
import kotlin.collections.C5160;
import kotlin.collections.C5161;
import kotlin.jvm.internal.Ref$IntRef;
import p070.InterfaceC7396;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2099 implements ListIterator, InterfaceC7396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f4021;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f4022;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f4023 = 2;

    public C2099(C5160 c5160, int i) {
        this.f4022 = c5160;
        this.f4021 = ((List) c5160.f13255).listIterator(AbstractC5176.m9373(i, c5160));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f4023) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            case 1:
                ListIterator listIterator = (ListIterator) this.f4021;
                listIterator.add(obj);
                listIterator.previous();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.f4023;
        Object obj = this.f4021;
        switch (i) {
            case 0:
                if (((Ref$IntRef) obj).element < ((C2098) this.f4022).f4017 - 1) {
                }
                break;
        }
        return ((ListIterator) obj).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int i = this.f4023;
        Object obj = this.f4021;
        switch (i) {
            case 0:
                if (((Ref$IntRef) obj).element >= 0) {
                }
                break;
        }
        return ((ListIterator) obj).hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.f4023;
        Object obj = this.f4021;
        switch (i) {
            case 0:
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj;
                int i2 = ref$IntRef.element + 1;
                C2098 c2098 = (C2098) this.f4022;
                AbstractC2109.m2795(i2, c2098.f4017);
                ref$IntRef.element = i2;
                break;
        }
        return ((ListIterator) obj).previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int iPreviousIndex;
        int size;
        int i = this.f4023;
        Object obj = this.f4022;
        Object obj2 = this.f4021;
        switch (i) {
            case 0:
                return ((Ref$IntRef) obj2).element + 1;
            case 1:
                iPreviousIndex = ((ListIterator) obj2).previousIndex();
                size = ((C5161) obj).size();
                break;
            default:
                iPreviousIndex = ((ListIterator) obj2).previousIndex();
                size = ((C5160) obj).size();
                break;
        }
        return (size - 1) - iPreviousIndex;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f4023;
        Object obj = this.f4021;
        switch (i) {
            case 0:
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj;
                int i2 = ref$IntRef.element;
                C2098 c2098 = (C2098) this.f4022;
                AbstractC2109.m2795(i2, c2098.f4017);
                ref$IntRef.element = i2 - 1;
                break;
        }
        return ((ListIterator) obj).next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int iNextIndex;
        int size;
        int i = this.f4023;
        Object obj = this.f4022;
        Object obj2 = this.f4021;
        switch (i) {
            case 0:
                return ((Ref$IntRef) obj2).element;
            case 1:
                iNextIndex = ((ListIterator) obj2).nextIndex();
                size = ((C5161) obj).size();
                break;
            default:
                iNextIndex = ((ListIterator) obj2).nextIndex();
                size = ((C5160) obj).size();
                break;
        }
        return (size - 1) - iNextIndex;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f4023) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            case 1:
                ((ListIterator) this.f4021).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f4023) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            case 1:
                ((ListIterator) this.f4021).set(obj);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C2099(C5161 c5161, int i) {
        this.f4022 = c5161;
        this.f4021 = c5161.f13257.listIterator(AbstractC5176.m9373(i, c5161));
    }

    public C2099(Ref$IntRef ref$IntRef, C2098 c2098) {
        this.f4021 = ref$IntRef;
        this.f4022 = c2098;
    }
}
