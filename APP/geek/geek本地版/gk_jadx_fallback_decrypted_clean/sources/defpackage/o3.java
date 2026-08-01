package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class o3 {
    public java.lang.Object a;
    public java.lang.Object b;

    public o3(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public o3(defpackage.g40 r1, defpackage.k8 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public o3(defpackage.r3 r1) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            return
    }

    public void c() {
            r2 = this;
            java.lang.Object r0 = r2.a
            n3 r0 = (defpackage.n3) r0
            if (r0 == 0) goto L12
            java.lang.Object r1 = r2.b     // Catch: java.lang.IllegalArgumentException -> Lf
            r3 r1 = (defpackage.r3) r1     // Catch: java.lang.IllegalArgumentException -> Lf
            android.content.Context r1 = r1.k     // Catch: java.lang.IllegalArgumentException -> Lf
            r1.unregisterReceiver(r0)     // Catch: java.lang.IllegalArgumentException -> Lf
        Lf:
            r0 = 0
            r2.a = r0
        L12:
            return
    }

    public void d() {
            r3 = this;
            java.lang.Object r0 = r3.a
            g40 r0 = (defpackage.g40) r0
            java.lang.Object r1 = r3.b
            k8 r1 = (defpackage.k8) r1
            java.util.HashSet r2 = r0.e
            boolean r1 = r2.remove(r1)
            if (r1 == 0) goto L19
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L19
            r0.b()
        L19:
            return
    }

    public abstract android.content.IntentFilter e();

    public abstract int f();

    public android.view.MenuItem g(android.view.MenuItem r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.l50
            if (r0 == 0) goto L31
            l50 r3 = (defpackage.l50) r3
            java.lang.Object r0 = r2.b
            u30 r0 = (defpackage.u30) r0
            if (r0 != 0) goto L13
            u30 r0 = new u30
            r0.<init>()
            r2.b = r0
        L13:
            java.lang.Object r0 = r2.b
            u30 r0 = (defpackage.u30) r0
            r1 = 0
            java.lang.Object r0 = r0.getOrDefault(r3, r1)
            android.view.MenuItem r0 = (android.view.MenuItem) r0
            if (r0 != 0) goto L30
            su r0 = new su
            java.lang.Object r1 = r2.a
            android.content.Context r1 = (android.content.Context) r1
            r0.<init>(r1, r3)
            java.lang.Object r1 = r2.b
            u30 r1 = (defpackage.u30) r1
            r1.put(r3, r0)
        L30:
            return r0
        L31:
            return r3
    }

    public abstract void h();

    public void i() {
            r3 = this;
            r3.c()
            android.content.IntentFilter r0 = r3.e()
            int r1 = r0.countActions()
            if (r1 != 0) goto Le
            return
        Le:
            java.lang.Object r1 = r3.a
            n3 r1 = (defpackage.n3) r1
            if (r1 != 0) goto L1b
            n3 r1 = new n3
            r1.<init>(r3)
            r3.a = r1
        L1b:
            java.lang.Object r1 = r3.b
            r3 r1 = (defpackage.r3) r1
            android.content.Context r1 = r1.k
            java.lang.Object r2 = r3.a
            n3 r2 = (defpackage.n3) r2
            r1.registerReceiver(r2, r0)
            return
    }
}
