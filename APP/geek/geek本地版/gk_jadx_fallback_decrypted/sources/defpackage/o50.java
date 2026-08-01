package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o50 implements java.io.Serializable {
    public defpackage.sw a;
    public volatile java.lang.Object b;
    public final java.lang.Object c;

    public o50(defpackage.sw r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            vh r1 = defpackage.vh.m
            r0.b = r1
            r0.c = r0
            return
    }

    public final java.lang.Object a() {
            r3 = this;
            java.lang.Object r0 = r3.b
            vh r1 = defpackage.vh.m
            if (r0 == r1) goto L7
            return r0
        L7:
            java.lang.Object r0 = r3.c
            monitor-enter(r0)
            java.lang.Object r2 = r3.b     // Catch: java.lang.Throwable -> L1f
            if (r2 == r1) goto Lf
            goto L1d
        Lf:
            sw r1 = r3.a     // Catch: java.lang.Throwable -> L1f
            defpackage.ip.l(r1)     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r2 = r1.a()     // Catch: java.lang.Throwable -> L1f
            r3.b = r2     // Catch: java.lang.Throwable -> L1f
            r1 = 0
            r3.a = r1     // Catch: java.lang.Throwable -> L1f
        L1d:
            monitor-exit(r0)
            return r2
        L1f:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.Object r0 = r2.b
            vh r1 = defpackage.vh.m
            if (r0 == r1) goto Lf
            java.lang.Object r0 = r2.a()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        Lf:
            java.lang.String r0 = "Lazy value not initialized yet."
            return r0
    }
}
