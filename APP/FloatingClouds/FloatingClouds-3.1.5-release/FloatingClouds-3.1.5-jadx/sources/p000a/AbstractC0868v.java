package p000a;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p000a.C0875v6;

/* JADX INFO: renamed from: a.v */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0868v<T> implements Iterator<T>, InterfaceC0783q9 {

    /* JADX INFO: renamed from: a */
    public int f3410a;

    /* JADX INFO: renamed from: b */
    public File f3411b;

    /* JADX INFO: renamed from: a */
    public final boolean m2081a() {
        File file;
        File fileMo2102a;
        this.f3410a = 3;
        C0875v6.b bVar = (C0875v6.b) this;
        while (true) {
            ArrayDeque<C0875v6.c> arrayDeque = bVar.f3429c;
            C0875v6.c cVarPeek = arrayDeque.peek();
            if (cVarPeek == null) {
                file = null;
                break;
            }
            fileMo2102a = cVarPeek.mo2102a();
            if (fileMo2102a == null) {
                arrayDeque.pop();
            } else {
                if (fileMo2102a.equals(cVarPeek.f3441a) || !fileMo2102a.isDirectory()) {
                    break;
                }
                int size = arrayDeque.size();
                C0875v6.this.getClass();
                if (size >= Integer.MAX_VALUE) {
                    break;
                }
                arrayDeque.push(bVar.m2101b(fileMo2102a));
            }
        }
        file = fileMo2102a;
        if (file != null) {
            bVar.f3411b = file;
            bVar.f3410a = 1;
        } else {
            bVar.f3410a = 2;
        }
        return this.f3410a == 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f3410a;
        if (i == 0) {
            return m2081a();
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final T next() {
        int i = this.f3410a;
        if (i == 1) {
            this.f3410a = 0;
            return (T) this.f3411b;
        }
        if (i == 2 || !m2081a()) {
            throw new NoSuchElementException();
        }
        this.f3410a = 0;
        return (T) this.f3411b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
