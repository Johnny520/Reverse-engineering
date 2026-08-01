package defpackage;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class fk implements Iterator {
    public int a;
    public File b;
    public final ArrayDeque c;
    public final /* synthetic */ gg d;

    public fk(gg r3) {
        this.d = r3;
        ArrayDeque r0 = new ArrayDeque();
        this.c = r0;
        File r32 = (File) r3.b;
        if (r32.isDirectory() == false) goto L7;
        r0.push(a(r32));
        return;
    L7:
        if (r32.isFile() == false) goto L10;
        r0.push(new dk(r32));
        return;
    L10:
        this.a = 2;
    }

    public final bk a(File r3) {
        int r0 = ((hk) this.d.c).ordinal();
        if (r0 == 0) goto L11;
        if (r0 != 1) goto L9;
        return new ck(r3);
    L9:
        throw new pb();
    L11:
        return new ek(r3);
    }

    public final boolean b() {
        this.a = 3;
    L3:
        ArrayDeque r0 = this.c;
        gk r1 = (gk) r0.peek();
        if (r1 == null) goto L5;
        File r2 = r1.a();
        if (r2 == null) goto L8;
        if (r2.equals(r1.a) == true) goto L17;
        if (r2.isDirectory() == false) goto L17;
        if (r0.size() >= Integer.MAX_VALUE) goto L17;
        r0.push(a(r2));
    L17:
        File r02 = r2;
    L19:
        if (r02 == null) goto L21;
        this.b = r02;
        this.a = 1;
    L23:
        if (this.a != 1) goto L25;
        return true;
    L25:
        return false;
    L21:
        this.a = 2;
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
        int r0 = this.a;
        if (r0 == 0) goto L14;
        if (r0 != 1) goto L7;
        return true;
    L7:
        if (r0 != 2) goto L11;
        return false;
    L11:
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    L14:
        return b();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int r0 = this.a;
        if (r0 != 1) goto L7;
        this.a = 0;
        return this.b;
    L7:
        if (r0 == 2) goto L13;
        if (b() == false) goto L13;
        this.a = 0;
        return this.b;
    L13:
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
