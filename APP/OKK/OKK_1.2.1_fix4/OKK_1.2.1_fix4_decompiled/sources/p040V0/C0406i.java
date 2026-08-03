package p040V0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p001A0.AbstractC0040p;
import p007D0.C0146l;
import p014H0.C0206e;
import p014H0.InterfaceC0202a;
import p014H0.InterfaceC0205d;
import p016I0.EnumC0209a;
import p031Q0.AbstractC0307g;
import p033R0.InterfaceC0319a;

/* JADX INFO: renamed from: V0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0406i implements Iterator, InterfaceC0202a, InterfaceC0319a {

    /* JADX INFO: renamed from: a */
    public int f905a;

    /* JADX INFO: renamed from: b */
    public Object f906b;

    /* JADX INFO: renamed from: c */
    public Iterator f907c;

    /* JADX INFO: renamed from: d */
    public InterfaceC0202a f908d;

    @Override // p014H0.InterfaceC0202a
    /* JADX INFO: renamed from: a */
    public final void mo587a(Object obj) throws Throwable {
        AbstractC0040p.m97b0(obj);
        this.f905a = 4;
    }

    /* JADX INFO: renamed from: b */
    public final RuntimeException m990b() {
        int i2 = this.f905a;
        if (i2 == 4) {
            return new NoSuchElementException();
        }
        if (i2 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f905a);
    }

    @Override // p014H0.InterfaceC0202a
    /* JADX INFO: renamed from: c */
    public final InterfaceC0205d mo588c() {
        return C0206e.f423a;
    }

    /* JADX INFO: renamed from: d */
    public final void m991d(Object obj, InterfaceC0202a interfaceC0202a) {
        this.f906b = obj;
        this.f905a = 3;
        this.f908d = interfaceC0202a;
        AbstractC0307g.m703e(interfaceC0202a, "frame");
    }

    /* JADX INFO: renamed from: e */
    public final Object m992e(InterfaceC0405h interfaceC0405h, InterfaceC0202a interfaceC0202a) {
        Object obj;
        Iterator it = interfaceC0405h.iterator();
        boolean zHasNext = it.hasNext();
        C0146l c0146l = C0146l.f339a;
        EnumC0209a enumC0209a = EnumC0209a.f425a;
        if (zHasNext) {
            this.f907c = it;
            this.f905a = 2;
            this.f908d = interfaceC0202a;
            AbstractC0307g.m703e(interfaceC0202a, "frame");
            obj = enumC0209a;
        } else {
            obj = c0146l;
        }
        return obj == enumC0209a ? obj : c0146l;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i2 = this.f905a;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2 || i2 == 3) {
                        return true;
                    }
                    if (i2 == 4) {
                        return false;
                    }
                    throw m990b();
                }
                Iterator it = this.f907c;
                AbstractC0307g.m700b(it);
                if (it.hasNext()) {
                    this.f905a = 2;
                    return true;
                }
                this.f907c = null;
            }
            this.f905a = 5;
            InterfaceC0202a interfaceC0202a = this.f908d;
            AbstractC0307g.m700b(interfaceC0202a);
            this.f908d = null;
            interfaceC0202a.mo587a(C0146l.f339a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.f905a;
        if (i2 == 0 || i2 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i2 == 2) {
            this.f905a = 1;
            Iterator it = this.f907c;
            AbstractC0307g.m700b(it);
            return it.next();
        }
        if (i2 != 3) {
            throw m990b();
        }
        this.f905a = 0;
        Object obj = this.f906b;
        this.f906b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
