package p000;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ik1 implements ListIterator, q41 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f4661h;

    /* JADX INFO: renamed from: i */
    public final List f4662i;

    /* JADX INFO: renamed from: j */
    public int f4663j;

    public ik1(List list, int i, int i2) {
        this.f4661h = i2;
        switch (i2) {
            case 1:
                this.f4662i = list;
                this.f4663j = i;
                break;
            default:
                this.f4662i = list;
                this.f4663j = i - 1;
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.f4661h;
        List list = this.f4662i;
        switch (i) {
            case 0:
                int i2 = this.f4663j + 1;
                this.f4663j = i2;
                list.add(i2, obj);
                break;
            default:
                list.add(this.f4663j, obj);
                this.f4663j++;
                break;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.f4661h;
        List list = this.f4662i;
        switch (i) {
            case 0:
                if (this.f4663j < list.size() - 1) {
                }
                break;
            default:
                if (this.f4663j < list.size()) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f4661h) {
            case 0:
                if (this.f4663j >= 0) {
                }
                break;
            default:
                if (this.f4663j > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.f4661h;
        List list = this.f4662i;
        switch (i) {
            case 0:
                int i2 = this.f4663j + 1;
                this.f4663j = i2;
                return list.get(i2);
            default:
                int i3 = this.f4663j;
                this.f4663j = i3 + 1;
                return list.get(i3);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f4661h) {
            case 0:
                return this.f4663j + 1;
            default:
                return this.f4663j;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f4661h;
        List list = this.f4662i;
        switch (i) {
            case 0:
                int i2 = this.f4663j;
                this.f4663j = i2 - 1;
                return list.get(i2);
            default:
                int i3 = this.f4663j - 1;
                this.f4663j = i3;
                return list.get(i3);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f4661h) {
            case 0:
                return this.f4663j;
            default:
                return this.f4663j - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.f4661h;
        List list = this.f4662i;
        switch (i) {
            case 0:
                list.remove(this.f4663j);
                this.f4663j--;
                break;
            default:
                int i2 = this.f4663j - 1;
                this.f4663j = i2;
                list.remove(i2);
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.f4661h;
        List list = this.f4662i;
        switch (i) {
            case 0:
                list.set(this.f4663j, obj);
                break;
            default:
                list.set(this.f4663j, obj);
                break;
        }
    }
}
