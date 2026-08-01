package defpackage;

import androidx.lifecycle.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class or {
    public final l0 a;
    public boolean b;
    public int c;
    public final /* synthetic */ b d;

    public or(b r1, l0 r2) {
        this.d = r1;
        this.c = -1;
        this.a = r2;
    }

    public final void c(boolean r4) {
        if (r4 == this.b) goto L29;
        this.b = r4;
        if (r4 == false) goto L8;
        int r42 = 1;
    L9:
        b r1 = this.d;
        int r2 = r1.c;
        r1.c = r42 + r2;
        if (r1.d == true) goto L19;
        r1.d = true;
    L25:
        int r0 = r1.c;     // Catch: Throwable -> L22
        if (r2 == r0) goto L17;
        r2 = r0;
        goto L25
    L17:
        r1.d = false;
    L22:
        th = move-exception;
        r1.d = false;
        throw th;
    L19:
        if (this.b == false) goto L28;
        r1.c(this);
        return;
    L28:
        return;
    L8:
        r42 = -1;
        goto L9
    }

    public abstract boolean e();

    public void d() {
    }
}
