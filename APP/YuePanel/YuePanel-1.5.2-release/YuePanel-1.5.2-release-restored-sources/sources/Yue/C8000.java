package Yue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۢۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C8000<T> implements Iterator<T>, InterfaceC5591 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC5124<T, Iterator<T>> f23790;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final List<Iterator<T>> f23791 = new ArrayList();

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public Iterator<? extends T> f23792;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۡ۟<? super T, ? extends java.util.Iterator<? extends T>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C8000(@InterfaceC6399 Iterator<? extends T> it, @InterfaceC6399 InterfaceC5124<? super T, ? extends Iterator<? extends T>> interfaceC5124) {
        this.f23790 = interfaceC5124;
        this.f23792 = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f23792.hasNext();
    }

    @Override // java.util.Iterator
    public T next() {
        T next = this.f23792.next();
        m4011(next);
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: ۥ */
    public final void m4011(T t) {
        Iterator<T> itInvoke = this.f23790.invoke(t);
        if (itInvoke != null && itInvoke.hasNext()) {
            this.f23791.add((Iterator<T>) this.f23792);
            this.f23792 = itInvoke;
        } else {
            while (!this.f23792.hasNext() && (!this.f23791.isEmpty())) {
                this.f23792 = (Iterator) C3888.m10926(this.f23791);
                C3885.m10795(this.f23791);
            }
        }
    }
}
