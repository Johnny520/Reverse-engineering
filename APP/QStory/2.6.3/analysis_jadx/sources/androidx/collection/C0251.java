package androidx.collection;

import java.util.List;
import java.util.ListIterator;
import p054.InterfaceC6567;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0251 implements ListIterator, InterfaceC6567 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final List f910;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f911;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f912;

    public C0251(List list, int i, int i2) {
        this.f912 = i2;
        switch (i2) {
            case 1:
                this.f910 = list;
                this.f911 = i;
                break;
            default:
                this.f910 = list;
                this.f911 = i - 1;
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.f912;
        List list = this.f910;
        switch (i) {
            case 0:
                int i2 = this.f911 + 1;
                this.f911 = i2;
                list.add(i2, obj);
                break;
            default:
                list.add(this.f911, obj);
                this.f911++;
                break;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.f912;
        List list = this.f910;
        switch (i) {
            case 0:
                if (this.f911 < list.size() - 1) {
                }
                break;
            default:
                if (this.f911 < list.size()) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f912) {
            case 0:
                if (this.f911 >= 0) {
                }
                break;
            default:
                if (this.f911 > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.f912;
        List list = this.f910;
        switch (i) {
            case 0:
                int i2 = this.f911 + 1;
                this.f911 = i2;
                return list.get(i2);
            default:
                int i3 = this.f911;
                this.f911 = i3 + 1;
                return list.get(i3);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f912) {
            case 0:
                return this.f911 + 1;
            default:
                return this.f911;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f912;
        List list = this.f910;
        switch (i) {
            case 0:
                int i2 = this.f911;
                this.f911 = i2 - 1;
                return list.get(i2);
            default:
                int i3 = this.f911 - 1;
                this.f911 = i3;
                return list.get(i3);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f912) {
            case 0:
                return this.f911;
            default:
                return this.f911 - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.f912;
        List list = this.f910;
        switch (i) {
            case 0:
                list.remove(this.f911);
                this.f911--;
                break;
            default:
                int i2 = this.f911 - 1;
                this.f911 = i2;
                list.remove(i2);
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.f912;
        List list = this.f910;
        switch (i) {
            case 0:
                list.set(this.f911, obj);
                break;
            default:
                list.set(this.f911, obj);
                break;
        }
    }
}
