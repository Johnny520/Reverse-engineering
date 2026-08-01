package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w50 extends defpackage.u50 {
    public final java.lang.Runnable c;

    public w50(java.lang.Runnable r1, long r2, defpackage.v50 r4) {
            r0 = this;
            r0.<init>(r2, r4)
            r0.c = r1
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            java.lang.Runnable r0 = r2.c     // Catch: java.lang.Throwable -> Lb
            r0.run()     // Catch: java.lang.Throwable -> Lb
            v50 r0 = r2.b
            r0.getClass()
            return
        Lb:
            r0 = move-exception
            v50 r1 = r2.b
            r1.getClass()
            throw r0
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Task["
            r0.<init>(r1)
            java.lang.Runnable r1 = r4.c
            java.lang.Class r2 = r1.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r0.append(r2)
            r2 = 64
            r0.append(r2)
            java.lang.String r1 = defpackage.ff.s(r1)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            long r2 = r4.a
            r0.append(r2)
            r0.append(r1)
            v50 r1 = r4.b
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
