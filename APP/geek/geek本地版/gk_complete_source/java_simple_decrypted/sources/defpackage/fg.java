package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class fg implements Iterator {
    public int a;
    public int b;
    public int c;
    public hp d;
    public final /* synthetic */ gg e;

    public fg(gg r2) {
        this.e = r2;
        this.a = -1;
        int r22 = gt.e(0, ((CharSequence) r2.b).length());
        this.b = r22;
        this.c = r22;
    }

    public final void a() {
        gg r0 = this.e;
        CharSequence r1 = (CharSequence) r0.b;
        int r2 = this.c;
        int r3 = 0;
        if (r2 >= 0) goto L7;
        this.a = 0;
        this.d = null;
        return;
    L7:
        if (r2 <= r1.length()) goto L9;
        this.d = new hp(this.b, b50.D(r1), 1);
        this.c = -1;
    L20:
        this.a = 1;
        return;
    L9:
        kx r02 = (kx) ((oh) r0.c).e(r1, Integer.valueOf(this.c));
        if (r02 != null) goto L12;
        this.d = new hp(this.b, b50.D(r1), 1);
        this.c = -1;
        goto L20
    L12:
        int r12 = ((Number) r02.a).intValue();
        int r03 = ((Number) r02.b).intValue();
        int r22 = this.b;
        if (r12 > Integer.MIN_VALUE) goto L15;
        hp r23 = hp.d;
    L16:
        this.d = r23;
        int r13 = r12 + r03;
        this.b = r13;
        if (r03 != 0) goto L19;
        r3 = 1;
    L19:
        this.c = r13 + r3;
        goto L20
    L15:
        r23 = new hp(r22, r12 - 1, 1);
        goto L16
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a != (-1)) goto L6;
        a();
    L6:
        if (this.a != 1) goto L8;
        return true;
    L8:
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a != (-1)) goto L6;
        a();
    L6:
        if (this.a == 0) goto L10;
        hp r0 = this.d;
        ip.m("null cannot be cast to non-null type kotlin.ranges.IntRange", r0);
        this.d = null;
        this.a = -1;
        return r0;
    L10:
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
