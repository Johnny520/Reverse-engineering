package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class o50 implements Serializable {
    public sw a;
    public volatile Object b;
    public final Object c;

    public o50(sw r1) {
        this.a = r1;
        this.b = vh.m;
        this.c = this;
    }

    public final Object a() {
        Object r0 = this.b;
        vh r1 = vh.m;
        if (r0 == r1) goto L5;
        return r0;
    L5:
        Object r02 = this.c;
        monitor-enter(r02);
        Object r2 = this.b;     // Catch: Throwable -> L13
        if (r2 != r1) goto L11;
        sw r12 = this.a;     // Catch: Throwable -> L13
        ip.l(r12);     // Catch: Throwable -> L13
        r2 = r12.a();     // Catch: Throwable -> L13
        this.b = r2;     // Catch: Throwable -> L13
        this.a = null;     // Catch: Throwable -> L13
    L11:
        monitor-exit(r02);
        return r2;
    L13:
        th = move-exception;
        throw th;
    }

    public final String toString() {
        if (this.b != vh.m) goto L5;
        return "Lazy value not initialized yet.";
    L5:
        return String.valueOf(a());
    }
}
