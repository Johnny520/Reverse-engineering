package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ik1 implements ListIterator, q41 {
    public final /* synthetic */ int h;
    public final List i;
    public int j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ik1(List list, int i, int i2) {
        this.h = i2;
        switch (i2) {
            case 1:
                this.i = list;
                this.j = i;
                break;
            default:
                this.i = list;
                this.j = i - 1;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.h;
        List list = this.i;
        switch (i) {
            case 0:
                int i2 = this.j + 1;
                this.j = i2;
                list.add(i2, obj);
                break;
            default:
                list.add(this.j, obj);
                this.j++;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.h;
        List list = this.i;
        switch (i) {
            case 0:
                if (this.j < list.size() - 1) {
                }
                break;
            default:
                if (this.j < list.size()) {
                }
                break;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.h) {
            case 0:
                if (this.j >= 0) {
                }
                break;
            default:
                if (this.j > 0) {
                }
                break;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.h;
        List list = this.i;
        switch (i) {
            case 0:
                int i2 = this.j + 1;
                this.j = i2;
                return list.get(i2);
            default:
                int i3 = this.j;
                this.j = i3 + 1;
                return list.get(i3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.h) {
            case 0:
                return this.j + 1;
            default:
                return this.j;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.h;
        List list = this.i;
        switch (i) {
            case 0:
                int i2 = this.j;
                this.j = i2 - 1;
                return list.get(i2);
            default:
                int i3 = this.j - 1;
                this.j = i3;
                return list.get(i3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.h) {
            case 0:
                return this.j;
            default:
                return this.j - 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.h;
        List list = this.i;
        switch (i) {
            case 0:
                list.remove(this.j);
                this.j--;
                break;
            default:
                int i2 = this.j - 1;
                this.j = i2;
                list.remove(i2);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.h;
        List list = this.i;
        switch (i) {
            case 0:
                list.set(this.j, obj);
                break;
            default:
                list.set(this.j, obj);
                break;
        }
    }
}
