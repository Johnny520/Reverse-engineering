package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class k10 extends n10 implements Iterator {
    public l10 a;
    public l10 b;
    public final /* synthetic */ int c;

    public k10(l10 r1, l10 r2, int r3) {
        this.c = r3;
        this.a = r2;
        this.b = r1;
    }

    @Override // defpackage.n10
    public final void a(l10 r4) {
        l10 r1 = null;
        if (this.a == r4) goto L5;
    L7:
        l10 r0 = this.a;
        if (r0 == r4) goto L10;
    L14:
        l10 r02 = this.b;
        if (r02 != r4) goto L23;
        l10 r42 = this.a;
        if (r02 == r42) goto L21;
        if (r42 == null) goto L21;
        r1 = b(r02);
    L21:
        this.b = r1;
        return;
    L23:
        return;
    L10:
        switch(this.c) {
            case 0: goto L12;
            default: goto L11;
        };
    L11:
        l10 r03 = r0.c;
    L13:
        this.a = r03;
        goto L14
    L12:
        r03 = r0.d;
        goto L13
    L5:
        if (r4 != this.b) goto L7;
        this.b = null;
        this.a = null;
        goto L7
    }

    public final l10 b(l10 r2) {
        switch(this.c) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return r2.d;
    L7:
        return r2.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b == null) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        l10 r0 = this.b;
        l10 r1 = this.a;
        if (r0 == r1) goto L7;
        if (r1 == null) goto L7;
        l10 r12 = b(r0);
    L8:
        this.b = r12;
        return r0;
    L7:
        r12 = null;
        goto L8
    }
}
