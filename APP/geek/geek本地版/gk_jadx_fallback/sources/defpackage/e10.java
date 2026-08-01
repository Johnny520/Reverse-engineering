package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e10 implements java.io.Serializable {
    public final java.lang.Throwable a;

    public e10(java.lang.Throwable r2) {
            r1 = this;
            java.lang.String r0 = "exception"
            defpackage.ip.o(r0, r2)
            r1.<init>()
            r1.a = r2
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.e10
            if (r0 == 0) goto L12
            e10 r2 = (defpackage.e10) r2
            java.lang.Throwable r2 = r2.a
            java.lang.Throwable r0 = r1.a
            boolean r2 = defpackage.ip.i(r0, r2)
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.Throwable r0 = r1.a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failure("
            r0.<init>(r1)
            java.lang.Throwable r1 = r2.a
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
