package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ck extends defpackage.bk {
    public boolean b;
    public java.io.File[] c;
    public int d;
    public boolean e;

    @Override // defpackage.gk
    public final java.io.File a() {
            r5 = this;
            boolean r0 = r5.e
            java.io.File r1 = r5.a
            r2 = 1
            if (r0 != 0) goto L15
            java.io.File[] r0 = r5.c
            if (r0 != 0) goto L15
            java.io.File[] r0 = r1.listFiles()
            r5.c = r0
            if (r0 != 0) goto L15
            r5.e = r2
        L15:
            java.io.File[] r0 = r5.c
            if (r0 == 0) goto L2a
            int r3 = r5.d
            int r4 = r0.length
            if (r3 >= r4) goto L2a
            defpackage.ip.l(r0)
            int r1 = r5.d
            int r2 = r1 + 1
            r5.d = r2
            r0 = r0[r1]
            return r0
        L2a:
            boolean r0 = r5.b
            if (r0 != 0) goto L31
            r5.b = r2
            return r1
        L31:
            r0 = 0
            return r0
    }
}
