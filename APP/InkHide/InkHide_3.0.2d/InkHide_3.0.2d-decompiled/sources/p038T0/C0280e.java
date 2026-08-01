package p038T0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p029O0.InterfaceC0233a;

/* JADX INFO: renamed from: T0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0280e implements Iterator, InterfaceC0233a {

    /* JADX INFO: renamed from: a */
    public final Iterator f647a;

    /* JADX INFO: renamed from: b */
    public int f648b = -1;

    /* JADX INFO: renamed from: c */
    public Object f649c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0281f f650d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0280e(C0281f c0281f) {
        this.f650d = c0281f;
        this.f647a = c0281f.f651a.iterator();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m495a() {
        Object next;
        C0281f c0281f;
        do {
            Iterator it = this.f647a;
            if (!it.hasNext()) {
                this.f648b = 0;
                return;
            } else {
                next = it.next();
                c0281f = this.f650d;
            }
        } while (((Boolean) c0281f.f653c.mo8c(next)).booleanValue() != c0281f.f652b);
        this.f649c = next;
        this.f648b = 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f648b == -1) {
            m495a();
        }
        return this.f648b == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        if (this.f648b == -1) {
            m495a();
        }
        if (this.f648b == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f649c;
        this.f649c = null;
        this.f648b = -1;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
