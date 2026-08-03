package p000a;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: a.Gf */
/* JADX INFO: loaded from: classes.dex */
public final class C0126Gf<T> implements Iterator<T>, InterfaceC0783q9 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f424a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public Iterator<? extends T> f425b;

    public C0126Gf(C0112G1 c0112g1) {
        this.f425b = c0112g1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f425b.hasNext();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Iterator
    public final T next() {
        T next = this.f425b.next();
        View view = (View) next;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        C0112G1 c0112g1 = viewGroup != null ? new C0112G1(viewGroup) : null;
        ArrayList arrayList = this.f424a;
        if (c0112g1 != null && c0112g1.hasNext()) {
            arrayList.add(this.f425b);
            this.f425b = c0112g1;
            return next;
        }
        while (!this.f425b.hasNext() && !arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            this.f425b = (Iterator) arrayList.get(C0739o3.m1756c0(arrayList));
            if (arrayList.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            arrayList.remove(C0739o3.m1756c0(arrayList));
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
