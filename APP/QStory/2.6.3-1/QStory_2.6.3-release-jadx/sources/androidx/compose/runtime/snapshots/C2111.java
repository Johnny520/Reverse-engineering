package androidx.compose.runtime.snapshots;

import androidx.collection.C1091;
import androidx.collection.C1123;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.C2615;
import bsh.C3466;
import java.util.AbstractList;
import java.util.ListIterator;
import kotlin.collections.builders.ListBuilder;
import p070.InterfaceC7396;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2111 implements ListIterator, InterfaceC7396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Object f4063;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f4064;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f4065;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f4066;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f4067;

    public C2111(SnapshotStateList snapshotStateList, int i) {
        this.f4067 = 0;
        this.f4063 = snapshotStateList;
        this.f4065 = i - 1;
        this.f4066 = -1;
        this.f4064 = AbstractC2109.m2802(snapshotStateList);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.f4067;
        Object obj2 = this.f4063;
        switch (i) {
            case 0:
                m2809();
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj2;
                snapshotStateList.add(this.f4065 + 1, obj);
                this.f4066 = -1;
                this.f4065++;
                this.f4064 = AbstractC2109.m2802(snapshotStateList);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                m2810();
                ListBuilder listBuilder = (ListBuilder) obj2;
                int i2 = this.f4065;
                this.f4065 = i2 + 1;
                listBuilder.add(i2, obj);
                this.f4066 = -1;
                this.f4064 = ((AbstractList) listBuilder).modCount;
                return;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.f4067;
        Object obj = this.f4063;
        switch (i) {
            case 0:
                if (this.f4065 < ((SnapshotStateList) obj).size() - 1) {
                }
                break;
            case 1:
                if (this.f4065 < this.f4064) {
                }
                break;
            default:
                if (this.f4065 < ((ListBuilder) obj).length) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f4067) {
            case 0:
                if (this.f4065 >= 0) {
                }
                break;
            case 1:
                if (this.f4065 > this.f4066) {
                }
                break;
            default:
                if (this.f4065 > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.f4067;
        Object obj = this.f4063;
        switch (i) {
            case 0:
                m2809();
                int i2 = this.f4065 + 1;
                this.f4066 = i2;
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj;
                AbstractC2109.m2795(i2, snapshotStateList.size());
                Object obj2 = snapshotStateList.get(i2);
                this.f4065 = i2;
                return obj2;
            case 1:
                C1091 c1091 = ((C2615) obj).f5566;
                int i3 = this.f4065;
                this.f4065 = i3 + 1;
                Object objM1441 = c1091.m1441(i3);
                objM1441.getClass();
                return (AbstractC2961) objM1441;
            default:
                m2810();
                ListBuilder listBuilder = (ListBuilder) obj;
                if (this.f4065 >= listBuilder.length) {
                    C3466.m5896();
                    return null;
                }
                int i4 = this.f4065;
                this.f4065 = i4 + 1;
                this.f4066 = i4;
                return listBuilder.backing[this.f4066];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f4067) {
            case 0:
                return this.f4065 + 1;
            case 1:
                return this.f4065 - this.f4066;
            default:
                return this.f4065;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f4067;
        Object obj = this.f4063;
        switch (i) {
            case 0:
                m2809();
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj;
                AbstractC2109.m2795(this.f4065, snapshotStateList.size());
                int i2 = this.f4065;
                this.f4066 = i2;
                this.f4065--;
                return snapshotStateList.get(i2);
            case 1:
                C1091 c1091 = ((C2615) obj).f5566;
                int i3 = this.f4065 - 1;
                this.f4065 = i3;
                Object objM1441 = c1091.m1441(i3);
                objM1441.getClass();
                return (AbstractC2961) objM1441;
            default:
                m2810();
                int i4 = this.f4065;
                if (i4 <= 0) {
                    C3466.m5896();
                    return null;
                }
                int i5 = i4 - 1;
                this.f4065 = i5;
                this.f4066 = i5;
                return ((ListBuilder) obj).backing[this.f4066];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f4067) {
            case 0:
                return this.f4065;
            case 1:
                return (this.f4065 - this.f4066) - 1;
            default:
                return this.f4065 - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.f4067;
        Object obj = this.f4063;
        switch (i) {
            case 0:
                m2809();
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj;
                snapshotStateList.remove(this.f4066);
                this.f4065--;
                this.f4066 = -1;
                this.f4064 = AbstractC2109.m2802(snapshotStateList);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ListBuilder listBuilder = (ListBuilder) obj;
                m2810();
                int i2 = this.f4066;
                if (i2 == -1) {
                    C6755.m11870("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                listBuilder.removeAt(i2);
                this.f4065 = this.f4066;
                this.f4066 = -1;
                this.f4064 = ((AbstractList) listBuilder).modCount;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.f4067;
        Object obj2 = this.f4063;
        switch (i) {
            case 0:
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj2;
                m2809();
                int i2 = this.f4066;
                if (i2 < 0) {
                    C6755.m11870("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                    return;
                } else {
                    snapshotStateList.set(i2, obj);
                    this.f4064 = AbstractC2109.m2802(snapshotStateList);
                    return;
                }
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                m2810();
                int i3 = this.f4066;
                if (i3 != -1) {
                    ((ListBuilder) obj2).set(i3, obj);
                    return;
                } else {
                    C6755.m11870("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m2809() {
        if (AbstractC2109.m2802((SnapshotStateList) this.f4063) == this.f4064) {
            return;
        }
        C1123.m1400();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m2810() {
        if (((AbstractList) ((ListBuilder) this.f4063)).modCount == this.f4064) {
            return;
        }
        C1123.m1400();
    }

    public C2111(ListBuilder listBuilder, int i) {
        this.f4067 = 2;
        this.f4063 = listBuilder;
        this.f4065 = i;
        this.f4066 = -1;
        this.f4064 = ((AbstractList) listBuilder).modCount;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2111(C2615 c2615, int i, int i2) {
        this(c2615, (i2 & 1) != 0 ? 0 : i, 0, c2615.f5566.f1349);
        this.f4067 = 1;
    }

    public C2111(C2615 c2615, int i, int i2, int i3) {
        this.f4067 = 1;
        this.f4063 = c2615;
        this.f4065 = i;
        this.f4066 = i2;
        this.f4064 = i3;
    }
}
