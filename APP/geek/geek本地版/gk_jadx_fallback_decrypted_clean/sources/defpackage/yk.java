package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yk {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ yk(int r1, java.lang.Object r2) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    public final void a(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.a
            switch(r0) {
                case 0: goto L3b;
                default: goto L5;
            }
        L5:
            zk r5 = (defpackage.zk) r5
            java.lang.Object r0 = defpackage.al.c
            monitor-enter(r0)
            u30 r1 = defpackage.al.d     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r2 = r4.b     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L1b
            r3 = 0
            java.lang.Object r2 = r1.getOrDefault(r2, r3)     // Catch: java.lang.Throwable -> L1b
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> L1b
            if (r2 != 0) goto L1d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            goto L38
        L1b:
            r5 = move-exception
            goto L39
        L1d:
            java.lang.Object r3 = r4.b     // Catch: java.lang.Throwable -> L1b
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L1b
            r1.remove(r3)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            r0 = 0
        L26:
            int r1 = r2.size()
            if (r0 >= r1) goto L38
            java.lang.Object r1 = r2.get(r0)
            yk r1 = (defpackage.yk) r1
            r1.a(r5)
            int r0 = r0 + 1
            goto L26
        L38:
            return
        L39:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r5
        L3b:
            zk r5 = (defpackage.zk) r5
            if (r5 != 0) goto L45
            zk r5 = new zk
            r0 = -3
            r5.<init>(r0)
        L45:
            java.lang.Object r0 = r4.b
            d4 r0 = (defpackage.d4) r0
            r0.F(r5)
            return
    }
}
