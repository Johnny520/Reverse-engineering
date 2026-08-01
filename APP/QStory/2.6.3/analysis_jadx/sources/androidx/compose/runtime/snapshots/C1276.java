package androidx.compose.runtime.snapshots;

import androidx.collection.C0244;
import androidx.collection.C0276;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.C1780;
import bsh.C2633;
import java.util.AbstractList;
import java.util.ListIterator;
import kotlin.collections.builders.ListBuilder;
import p054.InterfaceC6567;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1276 implements ListIterator, InterfaceC6567 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Object f3718;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f3719;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f3720;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f3721;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3722;

    public C1276(SnapshotStateList snapshotStateList, int i) {
        this.f3722 = 0;
        this.f3718 = snapshotStateList;
        this.f3720 = i - 1;
        this.f3721 = -1;
        this.f3719 = AbstractC1274.m2242(snapshotStateList);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.f3722;
        Object obj2 = this.f3718;
        switch (i) {
            case 0:
                m2249();
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj2;
                snapshotStateList.add(this.f3720 + 1, obj);
                this.f3721 = -1;
                this.f3720++;
                this.f3719 = AbstractC1274.m2242(snapshotStateList);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                m2250();
                ListBuilder listBuilder = (ListBuilder) obj2;
                int i2 = this.f3720;
                this.f3720 = i2 + 1;
                listBuilder.add(i2, obj);
                this.f3721 = -1;
                this.f3719 = ((AbstractList) listBuilder).modCount;
                return;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.f3722;
        Object obj = this.f3718;
        switch (i) {
            case 0:
                if (this.f3720 < ((SnapshotStateList) obj).size() - 1) {
                }
                break;
            case 1:
                if (this.f3720 < this.f3719) {
                }
                break;
            default:
                if (this.f3720 < ((ListBuilder) obj).length) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f3722) {
            case 0:
                if (this.f3720 >= 0) {
                }
                break;
            case 1:
                if (this.f3720 > this.f3721) {
                }
                break;
            default:
                if (this.f3720 > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.f3722;
        Object obj = this.f3718;
        switch (i) {
            case 0:
                m2249();
                int i2 = this.f3720 + 1;
                this.f3721 = i2;
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj;
                AbstractC1274.m2235(i2, snapshotStateList.size());
                Object obj2 = snapshotStateList.get(i2);
                this.f3720 = i2;
                return obj2;
            case 1:
                C0244 c0244 = ((C1780) obj).f5221;
                int i3 = this.f3720;
                this.f3720 = i3 + 1;
                Object objM881 = c0244.m881(i3);
                objM881.getClass();
                return (AbstractC2128) objM881;
            default:
                m2250();
                ListBuilder listBuilder = (ListBuilder) obj;
                if (this.f3720 >= listBuilder.length) {
                    C2633.m5336();
                    return null;
                }
                int i4 = this.f3720;
                this.f3720 = i4 + 1;
                this.f3721 = i4;
                return listBuilder.backing[this.f3721];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f3722) {
            case 0:
                return this.f3720 + 1;
            case 1:
                return this.f3720 - this.f3721;
            default:
                return this.f3720;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f3722;
        Object obj = this.f3718;
        switch (i) {
            case 0:
                m2249();
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj;
                AbstractC1274.m2235(this.f3720, snapshotStateList.size());
                int i2 = this.f3720;
                this.f3721 = i2;
                this.f3720--;
                return snapshotStateList.get(i2);
            case 1:
                C0244 c0244 = ((C1780) obj).f5221;
                int i3 = this.f3720 - 1;
                this.f3720 = i3;
                Object objM881 = c0244.m881(i3);
                objM881.getClass();
                return (AbstractC2128) objM881;
            default:
                m2250();
                int i4 = this.f3720;
                if (i4 <= 0) {
                    C2633.m5336();
                    return null;
                }
                int i5 = i4 - 1;
                this.f3720 = i5;
                this.f3721 = i5;
                return ((ListBuilder) obj).backing[this.f3721];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f3722) {
            case 0:
                return this.f3720;
            case 1:
                return (this.f3720 - this.f3721) - 1;
            default:
                return this.f3720 - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.f3722;
        Object obj = this.f3718;
        switch (i) {
            case 0:
                m2249();
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj;
                snapshotStateList.remove(this.f3721);
                this.f3720--;
                this.f3721 = -1;
                this.f3719 = AbstractC1274.m2242(snapshotStateList);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ListBuilder listBuilder = (ListBuilder) obj;
                m2250();
                int i2 = this.f3721;
                if (i2 == -1) {
                    C5925.m11311("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                listBuilder.removeAt(i2);
                this.f3720 = this.f3721;
                this.f3721 = -1;
                this.f3719 = ((AbstractList) listBuilder).modCount;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.f3722;
        Object obj2 = this.f3718;
        switch (i) {
            case 0:
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj2;
                m2249();
                int i2 = this.f3721;
                if (i2 < 0) {
                    C5925.m11311("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                    return;
                } else {
                    snapshotStateList.set(i2, obj);
                    this.f3719 = AbstractC1274.m2242(snapshotStateList);
                    return;
                }
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                m2250();
                int i3 = this.f3721;
                if (i3 != -1) {
                    ((ListBuilder) obj2).set(i3, obj);
                    return;
                } else {
                    C5925.m11311("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m2249() {
        if (AbstractC1274.m2242((SnapshotStateList) this.f3718) == this.f3719) {
            return;
        }
        C0276.m840();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m2250() {
        if (((AbstractList) ((ListBuilder) this.f3718)).modCount == this.f3719) {
            return;
        }
        C0276.m840();
    }

    public C1276(ListBuilder listBuilder, int i) {
        this.f3722 = 2;
        this.f3718 = listBuilder;
        this.f3720 = i;
        this.f3721 = -1;
        this.f3719 = ((AbstractList) listBuilder).modCount;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1276(C1780 c1780, int i, int i2) {
        this(c1780, (i2 & 1) != 0 ? 0 : i, 0, c1780.f5221.f1004);
        this.f3722 = 1;
    }

    public C1276(C1780 c1780, int i, int i2, int i3) {
        this.f3722 = 1;
        this.f3718 = c1780;
        this.f3720 = i;
        this.f3721 = i2;
        this.f3719 = i3;
    }
}
