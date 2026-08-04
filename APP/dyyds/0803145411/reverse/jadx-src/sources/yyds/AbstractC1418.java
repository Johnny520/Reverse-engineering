package yyds;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: yyds.ᛶᲀᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1418 implements Iterator, InterfaceC0527 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f6703;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public Object f6704;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f6703;
        if (i == 0) {
            this.f6703 = 3;
            mo573();
            return this.f6703 == 1;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        C0188.m798("hasNext called when the iterator is in the FAILED state.");
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f6703;
        if (i == 1) {
            this.f6703 = 0;
            return this.f6704;
        }
        if (i != 2) {
            this.f6703 = 3;
            mo573();
            if (this.f6703 == 1) {
                this.f6703 = 0;
                return this.f6704;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public abstract void mo573();
}
