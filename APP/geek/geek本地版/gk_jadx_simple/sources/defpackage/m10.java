package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class m10 extends n10 implements Iterator {
    public l10 a;
    public boolean b;
    public final /* synthetic */ o10 c;

    public m10(o10 r1) {
        this.c = r1;
        this.b = true;
    }

    @Override // defpackage.n10
    public final void a(l10 r2) {
        l10 r0 = this.a;
        if (r2 != r0) goto L10;
        l10 r22 = r0.d;
        this.a = r22;
        if (r22 != null) goto L7;
        boolean r23 = true;
    L8:
        this.b = r23;
        return;
    L7:
        r23 = false;
        goto L8
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b == true) goto L5;
        l10 r0 = this.a;
        if (r0 != null) goto L11;
    L13:
        return false;
    L11:
        if (r0.c == null) goto L13;
        return true;
    L5:
        if (this.c.a == null) goto L7;
        return true;
    L7:
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b == false) goto L5;
        this.b = false;
        this.a = this.c.a;
    L11:
        return this.a;
    L5:
        l10 r0 = this.a;
        if (r0 == null) goto L8;
        l10 r02 = r0.c;
    L9:
        this.a = r02;
        goto L11
    L8:
        r02 = null;
        goto L9
    }
}
