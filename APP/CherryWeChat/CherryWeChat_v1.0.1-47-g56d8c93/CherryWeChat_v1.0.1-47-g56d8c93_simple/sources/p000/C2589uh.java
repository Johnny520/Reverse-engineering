package p000;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: uh */
/* JADX INFO: loaded from: classes.dex */
public final class C2589uh implements Iterator, InterfaceC0545Mm {

    /* JADX INFO: renamed from: a */
    public int f8960a;

    /* JADX INFO: renamed from: b */
    public File f8961b;

    /* JADX INFO: renamed from: c */
    public final ArrayDeque f8962c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2499sd f8963d;

    public C2589uh(C2499sd r3) {
        this.f8963d = r3;
        ArrayDeque r0 = new ArrayDeque();
        this.f8962c = r0;
        File r32 = (File) r3.f8787d;
        if (r32.isDirectory() == false) goto L7;
        r0.push(m5098a(r32));
        return;
    L7:
        if (r32.isFile() == false) goto L10;
        r0.push(new C2503sh(r32));
        return;
    L10:
        this.f8960a = 2;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC2417qh m5098a(File r3) {
        int r0 = AbstractC0213Ey.m424v(this.f8963d.f8785b);
        if (r0 == 0) goto L11;
        if (r0 != 1) goto L9;
        return new C2460rh(this, r3);
    L9:
        throw new C0232Fa();
    L11:
        return new C2546th(this, r3);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5099b() {
        this.f8960a = 3;
    L3:
        ArrayDeque r0 = this.f8962c;
        AbstractC2632vh r1 = (AbstractC2632vh) r0.peek();
        if (r1 == null) goto L5;
        File r2 = r1.mo4952a();
        if (r2 == null) goto L8;
        if (r2.equals(r1.f9142a) == true) goto L17;
        if (r2.isDirectory() == false) goto L17;
        if (r0.size() >= Integer.MAX_VALUE) goto L17;
        r0.push(m5098a(r2));
    L17:
        File r02 = r2;
    L19:
        if (r02 == null) goto L21;
        this.f8961b = r02;
        this.f8960a = 1;
    L23:
        if (this.f8960a != 1) goto L25;
        return true;
    L25:
        return false;
    L21:
        this.f8960a = 2;
        goto L23
    L8:
        r0.pop();
        goto L3
    L5:
        r02 = null;
        goto L19
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int r0 = this.f8960a;
        if (r0 == 0) goto L14;
        if (r0 != 1) goto L7;
        return true;
    L7:
        if (r0 != 2) goto L11;
        return false;
    L11:
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    L14:
        return m5099b();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int r0 = this.f8960a;
        if (r0 != 1) goto L7;
        this.f8960a = 0;
        return this.f8961b;
    L7:
        if (r0 == 2) goto L13;
        if (m5099b() == false) goto L13;
        this.f8960a = 0;
        return this.f8961b;
    L13:
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
