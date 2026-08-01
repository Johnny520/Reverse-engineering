package defpackage;

import android.util.SparseArray;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class oi {
    public int a;
    public final xv b;
    public xv c;
    public xv d;
    public int e;
    public int f;

    public oi(xv r2) {
        this.a = 1;
        this.b = r2;
        this.c = r2;
    }

    public final int a(int r5) {
        SparseArray r0 = this.c.a;
        if (r0 != null) goto L5;
        xv r02 = null;
    L6:
        int r2 = 1;
        int r3 = 2;
        if (this.a == 2) goto L12;
        if (r02 != null) goto L10;
        b();
    L30:
        this.e = r5;
        return r2;
    L10:
        this.a = 2;
        this.c = r02;
        this.f = 1;
    L11:
        r2 = r3;
        goto L30
    L12:
        if (r02 == null) goto L15;
        this.c = r02;
        this.f++;
        goto L11
    L15:
        if (r5 != 65038) goto L18;
        b();
        goto L30
    L18:
        if (r5 == 65039) goto L11;
        xv r03 = this.c;
        if (r03.b == null) goto L29;
        r3 = 3;
        if (this.f == 1) goto L25;
        this.d = r03;
        b();
        goto L11
    L25:
        if (c() == false) goto L27;
        this.d = this.c;
        b();
        goto L11
    L27:
        b();
        goto L30
    L29:
        b();
        goto L30
    L5:
        r02 = (xv) r0.get(r5);
        goto L6
    }

    public final void b() {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean c() {
        vv r0 = this.c.b.b();
        int r1 = r0.a(6);
        if (r1 == 0) goto L8;
        if (((ByteBuffer) r0.d).get(r1 + r0.a) == 0) goto L8;
        return true;
    L8:
        if (this.e != 65039) goto L10;
        return true;
    L10:
        return false;
    }
}
