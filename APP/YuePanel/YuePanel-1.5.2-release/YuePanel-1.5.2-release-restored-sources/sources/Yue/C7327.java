package Yue;

import Yue.C7148;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Yue.ۥۡۨۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7327<T> extends AbstractC7328<T> implements Iterator<T>, InterfaceC4199<C8107>, InterfaceC5591 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public int f22145;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6489
    public T f22146;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6489
    public Iterator<? extends T> f22147;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6489
    public InterfaceC4199<? super C8107> f22148;

    @Override // Yue.InterfaceC4199
    @InterfaceC6399
    public InterfaceC4225 getContext() {
        return C4629.f9940;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws Throwable {
        while (true) {
            int i = this.f22145;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw m22862();
                }
                Iterator<? extends T> it = this.f22147;
                C5499.m17100(it);
                if (it.hasNext()) {
                    this.f22145 = 2;
                    return true;
                }
                this.f22147 = null;
            }
            this.f22145 = 5;
            InterfaceC4199<? super C8107> interfaceC4199 = this.f22148;
            C5499.m17100(interfaceC4199);
            this.f22148 = null;
            C7148.C1189 c1189 = C7148.f21560;
            interfaceC4199.resumeWith(C7148.m3438(C8107.f3222));
        }
    }

    @Override // java.util.Iterator
    public T next() throws Throwable {
        int i = this.f22145;
        if (i == 0 || i == 1) {
            return m22864();
        }
        if (i == 2) {
            this.f22145 = 1;
            Iterator<? extends T> it = this.f22147;
            C5499.m17100(it);
            return it.next();
        }
        if (i != 3) {
            throw m22862();
        }
        this.f22145 = 0;
        T t = this.f22146;
        this.f22146 = null;
        return t;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // Yue.InterfaceC4199
    public void resumeWith(@InterfaceC6399 Object obj) {
        C7149.m22422(obj);
        this.f22145 = 4;
    }

    @Override // Yue.AbstractC7328
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public Object mo3574(T t, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        this.f22146 = t;
        this.f22145 = 3;
        this.f22148 = interfaceC4199;
        Object objM17142 = C5508.m17142();
        if (objM17142 == C5508.m17142()) {
            C4324.m12513(interfaceC4199);
        }
        return objM17142 == C5508.m17142() ? objM17142 : C8107.f3222;
    }

    @Override // Yue.AbstractC7328
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public Object mo22861(@InterfaceC6399 Iterator<? extends T> it, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        if (!it.hasNext()) {
            return C8107.f3222;
        }
        this.f22147 = it;
        this.f22145 = 2;
        this.f22148 = interfaceC4199;
        Object objM17142 = C5508.m17142();
        if (objM17142 == C5508.m17142()) {
            C4324.m12513(interfaceC4199);
        }
        return objM17142 == C5508.m17142() ? objM17142 : C8107.f3222;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final Throwable m22862() {
        int i = this.f22145;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f22145);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ>, Yue.ۥ۟ۧۤۢ<Yue.ۥۣۢ۠ۤ> */
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final InterfaceC4199<C8107> m22863() {
        return this.f22148;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final T m22864() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final void m22865(@InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
        this.f22148 = interfaceC4199;
    }
}
