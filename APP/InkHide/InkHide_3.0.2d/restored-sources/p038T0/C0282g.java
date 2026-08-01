package p038T0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p021K0.C0169h;
import p025M0.InterfaceC0204l;
import p027N0.AbstractC0223g;
import p027N0.AbstractC0224h;
import p029O0.InterfaceC0233a;

/* JADX INFO: renamed from: T0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0282g implements Iterator, InterfaceC0233a {

    /* JADX INFO: renamed from: a */
    public Object f654a;

    /* JADX INFO: renamed from: b */
    public int f655b = -2;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0169h f656c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0282g(C0169h c0169h) {
        this.f656c = c0169h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v9, types: [M0.a, N0.h] */
    /* JADX INFO: renamed from: a */
    public final void m496a() {
        Object objMo8c;
        int i2 = this.f655b;
        C0169h c0169h = this.f656c;
        if (i2 == -2) {
            objMo8c = ((AbstractC0224h) c0169h.f489b).mo7b();
        } else {
            InterfaceC0204l interfaceC0204l = (InterfaceC0204l) c0169h.f490c;
            Object obj = this.f654a;
            AbstractC0223g.m415b(obj);
            objMo8c = interfaceC0204l.mo8c(obj);
        }
        this.f654a = objMo8c;
        this.f655b = objMo8c == null ? 0 : 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f655b < 0) {
            m496a();
        }
        return this.f655b == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        if (this.f655b < 0) {
            m496a();
        }
        if (this.f655b == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f654a;
        AbstractC0223g.m416c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f655b = -1;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
