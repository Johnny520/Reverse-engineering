package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: I4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0349I4 implements Iterator, InterfaceC0545Mm {

    /* JADX INFO: renamed from: a */
    public int f1170a;

    /* JADX INFO: renamed from: b */
    public int f1171b;

    /* JADX INFO: renamed from: c */
    public boolean f1172c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1173d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f1174e;

    public C0349I4(int r1) {
        this.f1170a = r1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f1171b >= this.f1170a) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext() == false) goto L12;
        int r0 = this.f1171b;
        switch(this.f1173d) {
            case 0: goto L8;
            case 1: goto L7;
            default: goto L6;
        };
    L6:
        Object r02 = ((C0607O4) this.f1174e).f1946b[r0];
    L9:
        this.f1171b++;
        this.f1172c = true;
        return r02;
    L7:
        r02 = ((C0521M4) this.f1174e).m5003j(r0);
        goto L9
    L8:
        r02 = ((C0521M4) this.f1174e).m5002f(r0);
        goto L9
    L12:
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f1172c == false) goto L12;
        int r0 = this.f1171b - 1;
        this.f1171b = r0;
        switch(this.f1173d) {
            case 0: goto L8;
            case 1: goto L7;
            default: goto L6;
        };
    L6:
        ((C0607O4) this.f1174e).m1186a(r0);
    L9:
        this.f1170a--;
        this.f1172c = false;
        return;
    L7:
        ((C0521M4) this.f1174e).mo4h(r0);
        goto L9
    L8:
        ((C0521M4) this.f1174e).mo4h(r0);
        goto L9
    L12:
        throw new IllegalStateException("Call next() before removing an element.");
    }

    public C0349I4(C0607O4 r2) {
        this.f1173d = 2;
        this.f1174e = r2;
        this(r2.f1947c);
    }

    public C0349I4(C0521M4 r1, int r2) {
        this.f1173d = r2;
        switch(r2) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        this.f1174e = r1;
        this(r1.f8818c);
        return;
    L6:
        this.f1174e = r1;
        this(r1.f8818c);
    }
}
