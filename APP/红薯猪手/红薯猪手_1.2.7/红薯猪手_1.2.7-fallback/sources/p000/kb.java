package p000;

/* JADX INFO: loaded from: classes.dex */
public final class kb<T> implements java.io.Serializable {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public p000.f3<? extends T> f666;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public volatile java.lang.Object f667;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final java.lang.Object f668;

    public kb(p000.f3 r1) {
            r0 = this;
            r0.<init>()
            r0.f666 = r1
            ۟.jb r1 = p000.jb.f532
            r0.f667 = r1
            r0.f668 = r0
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.Object r0 = r2.f667
            ۟.jb r1 = p000.jb.f532
            if (r0 == r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto L14
            java.lang.Object r0 = r2.m238()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L16
        L14:
            java.lang.String r0 = "Lazy value not initialized yet."
        L16:
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final T m238() {
            r3 = this;
            java.lang.Object r0 = r3.f667
            ۟.jb r1 = p000.jb.f532
            if (r0 == r1) goto L7
            return r0
        L7:
            java.lang.Object r0 = r3.f668
            monitor-enter(r0)
            java.lang.Object r2 = r3.f667     // Catch: java.lang.Throwable -> L1f
            if (r2 == r1) goto Lf
            goto L1d
        Lf:
            ۟.f3<? extends T> r1 = r3.f666     // Catch: java.lang.Throwable -> L1f
            p000.h4.m186(r1)     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r2 = r1.mo11()     // Catch: java.lang.Throwable -> L1f
            r3.f667 = r2     // Catch: java.lang.Throwable -> L1f
            r1 = 0
            r3.f666 = r1     // Catch: java.lang.Throwable -> L1f
        L1d:
            monitor-exit(r0)
            return r2
        L1f:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }
}
