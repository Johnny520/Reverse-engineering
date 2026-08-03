package p009E0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p031Q0.AbstractC0307g;
import p033R0.InterfaceC0319a;
import p040V0.C0412o;

/* JADX INFO: renamed from: E0.c */
/* JADX INFO: loaded from: classes.dex */
public class C0172c implements Iterator, InterfaceC0319a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f384a;

    /* JADX INFO: renamed from: b */
    public int f385b;

    /* JADX INFO: renamed from: c */
    public final Object f386c;

    public C0172c(long[] r2) {
        this.f384a = 2;
        AbstractC0307g.m703e(r2, "array");
        this.f386c = r2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch(this.f384a) {
            case 0: goto L22;
            case 1: goto L17;
            case 2: goto L12;
            default: goto L5;
        };
    L5:
        if (this.f385b > 0) goto L7;
    L9:
        return false;
    L7:
        if (((Iterator) this.f386c).hasNext() == false) goto L9;
        return true;
    L12:
        if (this.f385b >= ((long[]) this.f386c).length) goto L14;
        return true;
    L14:
        return false;
    L17:
        if (this.f385b >= ((Object[]) this.f386c).length) goto L19;
        return true;
    L19:
        return false;
    L22:
        if (this.f385b >= ((AbstractC0175f) this.f386c).mo516a()) goto L24;
        return true;
    L24:
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch(this.f384a) {
            case 0: goto L22;
            case 1: goto L27;
            case 2: goto L29;
            default: goto L4;
        };
    L4:
        int r02 = this.f385b;
        if (r02 == 0) goto L9;
        this.f385b = r02 - 1;
        return ((Iterator) this.f386c).next();
    L9:
        throw new NoSuchElementException();
    L27:
        Object[] r03 = (Object[]) this.f386c;     // Catch: ArrayIndexOutOfBoundsException -> L18
        int r1 = this.f385b;     // Catch: ArrayIndexOutOfBoundsException -> L18
        this.f385b = r1 + 1;     // Catch: ArrayIndexOutOfBoundsException -> L18
        return r03[r1];
    L18:
        e = move-exception;
        this.f385b--;
        throw new NoSuchElementException(e.getMessage());
    L29:
        long[] r04 = (long[]) this.f386c;     // Catch: ArrayIndexOutOfBoundsException -> L13
        int r12 = this.f385b;     // Catch: ArrayIndexOutOfBoundsException -> L13
        this.f385b = r12 + 1;     // Catch: ArrayIndexOutOfBoundsException -> L13
        return Long.valueOf(r04[r12]);
    L13:
        e = move-exception;
        this.f385b--;
        throw new NoSuchElementException(e.getMessage());
    L22:
        if (hasNext() == false) goto L26;
        int r05 = this.f385b;
        this.f385b = r05 + 1;
        return ((AbstractC0175f) this.f386c).get(r05);
    L26:
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch(this.f384a) {
            case 0: goto L11;
            case 1: goto L9;
            case 2: goto L7;
            default: goto L5;
        };
    L5:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    L7:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    L9:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    L11:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C0172c(Object[] r2) {
        this.f384a = 1;
        AbstractC0307g.m703e(r2, "array");
        this.f386c = r2;
    }

    public C0172c(AbstractC0175f r2) {
        this.f384a = 0;
        this.f386c = r2;
    }

    public C0172c(C0412o r2) {
        this.f384a = 3;
        this.f385b = r2.f913b;
        this.f386c = r2.f912a.iterator();
    }
}
