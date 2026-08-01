package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ek extends defpackage.bk {
    public boolean b;
    public java.io.File[] c;
    public int d;

    @Override // defpackage.gk
    public final java.io.File a() {
            r5 = this;
            boolean r0 = r5.b
            java.io.File r1 = r5.a
            if (r0 != 0) goto La
            r0 = 1
            r5.b = r0
            return r1
        La:
            java.io.File[] r0 = r5.c
            r2 = 0
            if (r0 == 0) goto L16
            int r3 = r5.d
            int r4 = r0.length
            if (r3 >= r4) goto L15
            goto L16
        L15:
            return r2
        L16:
            if (r0 != 0) goto L24
            java.io.File[] r0 = r1.listFiles()
            r5.c = r0
            if (r0 == 0) goto L23
            int r0 = r0.length
            if (r0 != 0) goto L24
        L23:
            return r2
        L24:
            java.io.File[] r0 = r5.c
            defpackage.ip.l(r0)
            int r1 = r5.d
            int r2 = r1 + 1
            r5.d = r2
            r0 = r0[r1]
            return r0
    }
}
