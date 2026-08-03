package p009E0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p033R0.InterfaceC0319a;

/* JADX INFO: renamed from: E0.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0171b implements Iterator, InterfaceC0319a {

    /* JADX INFO: renamed from: a */
    public int f382a;

    /* JADX INFO: renamed from: b */
    public Object f383b;

    /* JADX INFO: renamed from: a */
    public abstract void mo515a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.f382a;
        if (i2 == 0) {
            this.f382a = 3;
            mo515a();
            if (this.f382a != 1) {
                return false;
            }
        } else if (i2 != 1) {
            if (i2 == 2) {
                return false;
            }
            throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.f382a;
        if (i2 == 1) {
            this.f382a = 0;
            return this.f383b;
        }
        if (i2 != 2) {
            this.f382a = 3;
            mo515a();
            if (this.f382a == 1) {
                this.f382a = 0;
                return this.f383b;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
