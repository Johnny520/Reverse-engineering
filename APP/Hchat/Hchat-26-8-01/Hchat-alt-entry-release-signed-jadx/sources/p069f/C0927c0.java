package p069f;

import java.util.List;
import java.util.ListIterator;
import p114hg.InterfaceC1711a;

/* JADX INFO: renamed from: f.c0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0927c0 implements ListIterator, InterfaceC1711a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2904g;

    /* JADX INFO: renamed from: h */
    public final Object f2905h;

    /* JADX INFO: renamed from: i */
    public int f2906i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0927c0(List list, int i9, int i10) {
        this.f2904g = i10;
        switch (i10) {
            case 1:
                this.f2905h = list;
                this.f2906i = i9;
                break;
            default:
                this.f2905h = list;
                this.f2906i = i9 - 1;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f2904g) {
            case 0:
                int i9 = this.f2906i + 1;
                this.f2906i = i9;
                this.f2905h.add(i9, obj);
                break;
            default:
                this.f2905h.add(this.f2906i, obj);
                this.f2906i++;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2904g) {
            case 0:
                return this.f2906i < this.f2905h.size() - 1;
            default:
                return this.f2906i < this.f2905h.size();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f2904g) {
            case 0:
                if (this.f2906i >= 0) {
                }
                break;
            default:
                if (this.f2906i > 0) {
                }
                break;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f2904g) {
            case 0:
                int i9 = this.f2906i + 1;
                this.f2906i = i9;
                return this.f2905h.get(i9);
            default:
                int i10 = this.f2906i;
                this.f2906i = i10 + 1;
                return this.f2905h.get(i10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f2904g) {
            case 0:
                return this.f2906i + 1;
            default:
                return this.f2906i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f2904g) {
            case 0:
                int i9 = this.f2906i;
                this.f2906i = i9 - 1;
                return this.f2905h.get(i9);
            default:
                int i10 = this.f2906i - 1;
                this.f2906i = i10;
                return this.f2905h.get(i10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f2904g) {
            case 0:
                return this.f2906i;
            default:
                return this.f2906i - 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f2904g) {
            case 0:
                this.f2905h.remove(this.f2906i);
                this.f2906i--;
                break;
            default:
                int i9 = this.f2906i - 1;
                this.f2906i = i9;
                this.f2905h.remove(i9);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f2904g) {
            case 0:
                this.f2905h.set(this.f2906i, obj);
                break;
            default:
                this.f2905h.set(this.f2906i, obj);
                break;
        }
    }
}
