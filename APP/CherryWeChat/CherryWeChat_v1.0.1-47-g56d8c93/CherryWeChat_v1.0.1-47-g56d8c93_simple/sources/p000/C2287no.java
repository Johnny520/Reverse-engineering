package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: no */
/* JADX INFO: loaded from: classes.dex */
public final class C2287no implements Iterator, InterfaceC0545Mm {

    /* JADX INFO: renamed from: a */
    public final CharSequence f8023a;

    /* JADX INFO: renamed from: b */
    public int f8024b;

    /* JADX INFO: renamed from: c */
    public int f8025c;

    /* JADX INFO: renamed from: d */
    public int f8026d;

    /* JADX INFO: renamed from: e */
    public int f8027e;

    public C2287no(String r1) {
        this.f8023a = r1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int r0 = this.f8024b;
        if (r0 == 0) goto L7;
        if (r0 != 1) goto L6;
        return true;
    L6:
        return false;
    L7:
        int r3 = 2;
        if (this.f8027e >= 0) goto L11;
        this.f8024b = 2;
        return false;
    L11:
        CharSequence r02 = this.f8023a;
        int r1 = r02.length();
        int r4 = this.f8025c;
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
        this.f8024b = 1;
        this.f8027e = r3;
        this.f8026d = r1;
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
        this.f8024b = 0;
        int r0 = this.f8026d;
        int r1 = this.f8025c;
        this.f8025c = this.f8027e + r0;
        return this.f8023a.subSequence(r1, r0).toString();
    L7:
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
