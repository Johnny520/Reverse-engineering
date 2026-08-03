package p000a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: a.Qd */
/* JADX INFO: loaded from: classes.dex */
public final class C0304Qd<T> extends AbstractC0321Rd<T> implements Iterator<T>, InterfaceC0474a4<C0413Wf>, InterfaceC0783q9 {

    /* JADX INFO: renamed from: a */
    public int f1098a;

    /* JADX INFO: renamed from: b */
    public T f1099b;

    /* JADX INFO: renamed from: c */
    public Iterator<? extends T> f1100c;

    /* JADX INFO: renamed from: d */
    public InterfaceC0474a4<? super C0413Wf> f1101d;

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000a.AbstractC0321Rd
    /* JADX INFO: renamed from: a */
    public final void mo844a(Object obj, C0055Cg c0055Cg) {
        this.f1099b = obj;
        this.f1098a = 3;
        this.f1101d = c0055Cg;
    }

    @Override // p000a.AbstractC0321Rd
    /* JADX INFO: renamed from: b */
    public final Object mo845b(Iterator it, C0055Cg c0055Cg) {
        if (!it.hasNext()) {
            return C0413Wf.f1577a;
        }
        this.f1100c = it;
        this.f1098a = 2;
        this.f1101d = c0055Cg;
        return EnumC0930y4.f3540a;
    }

    @Override // p000a.InterfaceC0474a4
    /* JADX INFO: renamed from: c */
    public final InterfaceC0911x4 mo846c() {
        return C0403W5.f1543a;
    }

    @Override // p000a.InterfaceC0474a4
    /* JADX INFO: renamed from: d */
    public final void mo847d(Object obj) throws Throwable {
        C0920xd.m2207b(obj);
        this.f1098a = 4;
    }

    /* JADX INFO: renamed from: e */
    public final RuntimeException m848e() {
        int i = this.f1098a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f1098a);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f1098a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw m848e();
                }
                Iterator<? extends T> it = this.f1100c;
                C0631i9.m1479b(it);
                if (it.hasNext()) {
                    this.f1098a = 2;
                    return true;
                }
                this.f1100c = null;
            }
            this.f1098a = 5;
            InterfaceC0474a4<? super C0413Wf> interfaceC0474a4 = this.f1101d;
            C0631i9.m1479b(interfaceC0474a4);
            this.f1101d = null;
            interfaceC0474a4.mo847d(C0413Wf.f1577a);
        }
    }

    @Override // java.util.Iterator
    public final T next() {
        int i = this.f1098a;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.f1098a = 1;
            Iterator<? extends T> it = this.f1100c;
            C0631i9.m1479b(it);
            return it.next();
        }
        if (i != 3) {
            throw m848e();
        }
        this.f1098a = 0;
        T t = this.f1099b;
        this.f1099b = null;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
