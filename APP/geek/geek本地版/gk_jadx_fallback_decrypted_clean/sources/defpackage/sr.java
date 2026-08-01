package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sr {
    public static final defpackage.sr b = null;
    public final defpackage.tr a;

    static {
            r0 = 0
            java.util.Locale[] r0 = new java.util.Locale[r0]
            android.os.LocaleList r0 = defpackage.rr.a(r0)
            sr r1 = new sr
            tr r2 = new tr
            r2.<init>(r0)
            r1.<init>(r2)
            defpackage.sr.b = r1
            return
    }

    public sr(defpackage.tr r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static defpackage.sr a(java.lang.String r4) {
            if (r4 == 0) goto L30
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L9
            goto L30
        L9:
            java.lang.String r0 = ","
            r1 = -1
            java.lang.String[] r4 = r4.split(r0, r1)
            int r0 = r4.length
            java.util.Locale[] r1 = new java.util.Locale[r0]
            r2 = 0
        L14:
            if (r2 >= r0) goto L21
            r3 = r4[r2]
            java.util.Locale r3 = defpackage.qr.a(r3)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L14
        L21:
            android.os.LocaleList r4 = defpackage.rr.a(r1)
            sr r0 = new sr
            tr r1 = new tr
            r1.<init>(r4)
            r0.<init>(r1)
            return r0
        L30:
            sr r4 = defpackage.sr.b
            return r4
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.sr
            if (r0 == 0) goto L12
            sr r2 = (defpackage.sr) r2
            tr r2 = r2.a
            tr r0 = r1.a
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            tr r0 = r1.a
            android.os.LocaleList r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            tr r0 = r1.a
            android.os.LocaleList r0 = r0.a
            java.lang.String r0 = r0.toString()
            return r0
    }
}
