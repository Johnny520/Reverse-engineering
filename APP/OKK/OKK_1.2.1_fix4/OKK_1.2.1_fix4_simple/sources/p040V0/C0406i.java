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
    public final void mo587a(Object r1) {
        AbstractC0040p.m97b0(r1);
        this.f905a = 4;
    }

    /* JADX INFO: renamed from: b */
    public final RuntimeException m990b() {
        int r02 = this.f905a;
        if (r02 == 4) goto L9;
        if (r02 == 5) goto L11;
        return new IllegalStateException("Unexpected state of the iterator: " + this.f905a);
    L11:
        return new IllegalStateException("Iterator has failed.");
    L9:
        return new NoSuchElementException();
    }

    @Override // p014H0.InterfaceC0202a
    /* JADX INFO: renamed from: c */
    public final InterfaceC0205d mo588c() {
        return C0206e.f423a;
    }

    /* JADX INFO: renamed from: d */
    public final void m991d(Object r1, InterfaceC0202a r2) {
        this.f906b = r1;
        this.f905a = 3;
        this.f908d = r2;
        AbstractC0307g.m703e(r2, "frame");
    }

    /* JADX INFO: renamed from: e */
    public final Object m992e(InterfaceC0405h r4, InterfaceC0202a r5) {
        Iterator r42 = r4.iterator();
        boolean r02 = r42.hasNext();
        C0146l r1 = C0146l.f339a;
        EnumC0209a r2 = EnumC0209a.f425a;
        if (r02 == true) goto L5;
        Object r43 = r1;
    L6:
        if (r43 != r2) goto L8;
        return r43;
    L8:
        return r1;
    L5:
        this.f907c = r42;
        this.f905a = 2;
        this.f908d = r5;
        AbstractC0307g.m703e(r5, "frame");
        r43 = r2;
        goto L6
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
    L2:
        int r02 = this.f905a;
        if (r02 == 0) goto L21;
        if (r02 != 1) goto L6;
        Iterator r03 = this.f907c;
        AbstractC0307g.m700b(r03);
        if (r03.hasNext() == true) goto L18;
        this.f907c = null;
        goto L21
    L18:
        this.f905a = 2;
        return true;
    L6:
        if (r02 != 2) goto L8;
    L15:
        return true;
    L8:
        if (r02 == 3) goto L15;
        if (r02 != 4) goto L14;
        return false;
    L14:
        throw m990b();
    L21:
        this.f905a = 5;
        InterfaceC0202a r04 = this.f908d;
        AbstractC0307g.m700b(r04);
        this.f908d = null;
        r04.mo587a(C0146l.f339a);
        goto L2
    }

    @Override // java.util.Iterator
    public final Object next() {
        int r02 = this.f905a;
        if (r02 == 0) goto L17;
        if (r02 == 1) goto L17;
        if (r02 != 2) goto L9;
        this.f905a = 1;
        Iterator r03 = this.f907c;
        AbstractC0307g.m700b(r03);
        return r03.next();
    L9:
        if (r02 != 3) goto L13;
        this.f905a = 0;
        Object r04 = this.f906b;
        this.f906b = null;
        return r04;
    L13:
        throw m990b();
    L17:
        if (hasNext() == false) goto L21;
        return next();
    L21:
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
