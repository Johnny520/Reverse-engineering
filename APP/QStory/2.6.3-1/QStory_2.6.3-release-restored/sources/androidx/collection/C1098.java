package androidx.collection;

import java.util.List;
import java.util.ListIterator;
import p070.InterfaceC7396;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1098 implements ListIterator, InterfaceC7396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final List f1255;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f1256;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1257;

    public C1098(List list, int i, int i2) {
        this.f1257 = i2;
        switch (i2) {
            case 1:
                this.f1255 = list;
                this.f1256 = i;
                break;
            default:
                this.f1255 = list;
                this.f1256 = i - 1;
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.f1257;
        List list = this.f1255;
        switch (i) {
            case 0:
                int i2 = this.f1256 + 1;
                this.f1256 = i2;
                list.add(i2, obj);
                break;
            default:
                list.add(this.f1256, obj);
                this.f1256++;
                break;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.f1257;
        List list = this.f1255;
        switch (i) {
            case 0:
                if (this.f1256 < list.size() - 1) {
                }
                break;
            default:
                if (this.f1256 < list.size()) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f1257) {
            case 0:
                if (this.f1256 >= 0) {
                }
                break;
            default:
                if (this.f1256 > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.f1257;
        List list = this.f1255;
        switch (i) {
            case 0:
                int i2 = this.f1256 + 1;
                this.f1256 = i2;
                return list.get(i2);
            default:
                int i3 = this.f1256;
                this.f1256 = i3 + 1;
                return list.get(i3);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f1257) {
            case 0:
                return this.f1256 + 1;
            default:
                return this.f1256;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f1257;
        List list = this.f1255;
        switch (i) {
            case 0:
                int i2 = this.f1256;
                this.f1256 = i2 - 1;
                return list.get(i2);
            default:
                int i3 = this.f1256 - 1;
                this.f1256 = i3;
                return list.get(i3);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f1257) {
            case 0:
                return this.f1256;
            default:
                return this.f1256 - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.f1257;
        List list = this.f1255;
        switch (i) {
            case 0:
                list.remove(this.f1256);
                this.f1256--;
                break;
            default:
                int i2 = this.f1256 - 1;
                this.f1256 = i2;
                list.remove(i2);
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.f1257;
        List list = this.f1255;
        switch (i) {
            case 0:
                list.set(this.f1256, obj);
                break;
            default:
                list.set(this.f1256, obj);
                break;
        }
    }
}
