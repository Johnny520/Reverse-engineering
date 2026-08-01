package p000;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class iv0 implements ListIterator, p40 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2629d = 0;

    /* JADX INFO: renamed from: e */
    public final Object f2630e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f2631f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public iv0(nd0 nd0Var, int i) {
        this.f2631f = nd0Var;
        List list = (List) nd0Var.f4245e;
        if (i >= 0 && i <= nd0Var.mo6a()) {
            this.f2630e = list.listIterator(nd0Var.mo6a() - i);
            return;
        }
        throw new IndexOutOfBoundsException("Position index " + i + " must be in range [" + new z20(0, nd0Var.mo6a(), 1) + "].");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f2629d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.f2629d;
        Object obj = this.f2630e;
        switch (i) {
            case 0:
                return ((ListIterator) obj).hasPrevious();
            default:
                return ((xt0) obj).f7423d < ((t41) this.f2631f).f5912g - 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int i = this.f2629d;
        Object obj = this.f2630e;
        switch (i) {
            case 0:
                return ((ListIterator) obj).hasNext();
            default:
                return ((xt0) obj).f7423d >= 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.f2629d;
        Object obj = this.f2630e;
        switch (i) {
            case 0:
                return ((ListIterator) obj).previous();
            default:
                xt0 xt0Var = (xt0) obj;
                int i2 = xt0Var.f7423d + 1;
                t41 t41Var = (t41) this.f2631f;
                p30.m3000j(i2, t41Var.f5912g);
                xt0Var.f7423d = i2;
                return t41Var.get(i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final int nextIndex() {
        int i = this.f2629d;
        Object obj = this.f2630e;
        switch (i) {
            case 0:
                nd0 nd0Var = (nd0) this.f2631f;
                return (nd0Var.size() - 1) - ((ListIterator) obj).previousIndex();
            default:
                return ((xt0) obj).f7423d + 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f2629d;
        Object obj = this.f2630e;
        switch (i) {
            case 0:
                return ((ListIterator) obj).next();
            default:
                xt0 xt0Var = (xt0) obj;
                int i2 = xt0Var.f7423d;
                t41 t41Var = (t41) this.f2631f;
                p30.m3000j(i2, t41Var.f5912g);
                xt0Var.f7423d = i2 - 1;
                return t41Var.get(i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i = this.f2629d;
        Object obj = this.f2630e;
        switch (i) {
            case 0:
                nd0 nd0Var = (nd0) this.f2631f;
                return (nd0Var.size() - 1) - ((ListIterator) obj).nextIndex();
            default:
                return ((xt0) obj).f7423d;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f2629d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f2629d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public iv0(xt0 xt0Var, t41 t41Var) {
        this.f2630e = xt0Var;
        this.f2631f = t41Var;
    }
}
