package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yg {
    public final android.view.DisplayCutout a;

    public yg(android.view.DisplayCutout r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1a
            java.lang.Class<yg> r0 = defpackage.yg.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            yg r3 = (defpackage.yg) r3
            android.view.DisplayCutout r0 = r2.a
            android.view.DisplayCutout r3 = r3.a
            boolean r3 = defpackage.pw.a(r0, r3)
            return r3
        L1a:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r1 = this;
            android.view.DisplayCutout r0 = r1.a
            int r0 = defpackage.c0.c(r0)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DisplayCutoutCompat{"
            r0.<init>(r1)
            android.view.DisplayCutout r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
