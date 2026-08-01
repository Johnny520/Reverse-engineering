package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class br implements Iterator {
    public final CharSequence a;
    public int b;
    public int c;
    public int d;
    public int e;

    public br(CharSequence r2) {
        ip.o("string", r2);
        this.a = r2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int r0 = this.b;
        if (r0 == 0) goto L7;
        if (r0 != 1) goto L6;
        return true;
    L6:
        return false;
    L7:
        int r3 = 2;
        if (this.e >= 0) goto L11;
        this.b = 2;
        return false;
    L11:
        CharSequence r02 = this.a;
        int r1 = r02.length();
        int r4 = this.c;
        int r5 = r02.length();
    L12:
        if (r4 >= r5) goto L25;
        char r6 = r02.charAt(r4);
        if (r6 == '\n') goto L17;
        if (r6 == '\r') goto L17;
        r4 = r4 + 1;
    L17:
        if (r6 != '\r') goto L23;
        int r12 = r4 + 1;
        if (r12 >= r02.length()) goto L23;
        if (r02.charAt(r12) != '\n') goto L23;
    L24:
        r1 = r4;
    L26:
        this.b = 1;
        this.e = r3;
        this.d = r1;
        return true;
    L23:
        r3 = 1;
        goto L24
    L25:
        r3 = -1;
        goto L26
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext() == false) goto L7;
        this.b = 0;
        int r0 = this.d;
        int r1 = this.c;
        this.c = this.e + r0;
        return this.a.subSequence(r1, r0).toString();
    L7:
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
