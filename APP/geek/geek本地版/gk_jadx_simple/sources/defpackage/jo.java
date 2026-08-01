package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class jo extends ke implements eg {
    private volatile jo _immediate;
    public final Handler c;
    public final boolean d;
    public final jo e;

    public jo(Handler r2, boolean r3) {
        this.c = r2;
        this.d = r3;
        if (r3 == false) goto L5;
        jo r32 = this;
    L6:
        this._immediate = r32;
        jo r33 = this._immediate;
        if (r33 != null) goto L9;
        r33 = new jo(r2, true);
        this._immediate = r33;
    L9:
        this.e = r33;
        return;
    L5:
        r32 = null;
        goto L6
    }

    @Override // defpackage.eg
    public final void c(long r5, i8 r7) {
        h1 r0 = new h1(r7, this, 6, false);
        if (r5 <= 4611686018427387903L) goto L6;
        r5 = 4611686018427387903L;
    L6:
        if (this.c.postDelayed(r0, r5) == false) goto L9;
        r7.n(new io(this, r0));
        return;
    L9:
        f(r7.e, r0);
    }

    @Override // defpackage.ke
    public final void d(ge r2, Runnable r3) {
        if (this.c.post(r3) == true) goto L6;
        f(r2, r3);
        return;
    }

    @Override // defpackage.ke
    public final boolean e() {
        if (this.d == true) goto L5;
        return true;
    L5:
        if (ip.i(Looper.myLooper(), this.c.getLooper()) == false) goto L11;
        return false;
    L11:
        return true;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof jo) == true) goto L5;
        return false;
    L5:
        if (((jo) r2).c != this.c) goto L10;
        return true;
    L10:
        return false;
    }

    public final void f(ge r4, Runnable r5) {
        CancellationException r0 = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        mp r1 = (mp) r4.b(vh.h);
        if (r1 == null) goto L5;
        ((wp) r1).m(r0);
    L5:
        wg.b.d(r4, r5);
    }

    public final int hashCode() {
        return System.identityHashCode(this.c);
    }

    @Override // defpackage.ke
    public final String toString() {
        xf r0 = wg.a;
        jo r02 = ls.a;
        if (this != r02) goto L17;
        String r03 = "Dispatchers.Main";
    L12:
        if (r03 != null) goto L19;
        String r04 = this.c.toString();
        if (this.d == true) goto L16;
        return r04;
    L16:
        return z30.i(r04, ".immediate");
    L19:
        return r03;
    L17:
        jo r05 = r02.e;     // Catch: UnsupportedOperationException -> L8
    L9:
        if (this != r05) goto L11;
        r03 = "Dispatchers.Main.immediate";
        goto L12
    L11:
        r03 = null;
    L8:
        r05 = null;
        goto L9
    }
}
