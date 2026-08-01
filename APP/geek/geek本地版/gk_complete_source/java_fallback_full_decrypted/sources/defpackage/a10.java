package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a10 {
    public final android.content.res.Resources a;
    public final android.content.res.Resources.Theme b;

    public a10(android.content.res.Resources r1, android.content.res.Resources.Theme r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L27
            java.lang.Class<a10> r2 = defpackage.a10.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L27
        L10:
            a10 r5 = (defpackage.a10) r5
            android.content.res.Resources r2 = r4.a
            android.content.res.Resources r3 = r5.a
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L27
            android.content.res.Resources$Theme r2 = r4.b
            android.content.res.Resources$Theme r5 = r5.b
            boolean r5 = defpackage.pw.a(r2, r5)
            if (r5 == 0) goto L27
            return r0
        L27:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            android.content.res.Resources r0 = r2.a
            android.content.res.Resources$Theme r1 = r2.b
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            int r0 = defpackage.pw.b(r0)
            return r0
    }
}
