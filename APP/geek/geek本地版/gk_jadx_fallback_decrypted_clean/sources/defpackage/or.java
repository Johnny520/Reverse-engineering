package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class or {
    public final defpackage.l0 a;
    public boolean b;
    public int c;
    public final /* synthetic */ androidx.lifecycle.b d;

    public or(androidx.lifecycle.b r1, defpackage.l0 r2) {
            r0 = this;
            r0.<init>()
            r0.d = r1
            r1 = -1
            r0.c = r1
            r0.a = r2
            return
    }

    public final void c(boolean r4) {
            r3 = this;
            boolean r0 = r3.b
            if (r4 != r0) goto L5
            goto L2b
        L5:
            r3.b = r4
            r0 = 1
            if (r4 == 0) goto Lc
            r4 = r0
            goto Ld
        Lc:
            r4 = -1
        Ld:
            androidx.lifecycle.b r1 = r3.d
            int r2 = r1.c
            int r4 = r4 + r2
            r1.c = r4
            boolean r4 = r1.d
            if (r4 == 0) goto L19
            goto L24
        L19:
            r1.d = r0
        L1b:
            r4 = 0
            int r0 = r1.c     // Catch: java.lang.Throwable -> L2c
            if (r2 == r0) goto L22
            r2 = r0
            goto L1b
        L22:
            r1.d = r4
        L24:
            boolean r4 = r3.b
            if (r4 == 0) goto L2b
            r1.c(r3)
        L2b:
            return
        L2c:
            r0 = move-exception
            r1.d = r4
            throw r0
    }

    public void d() {
            r0 = this;
            return
    }

    public abstract boolean e();
}
