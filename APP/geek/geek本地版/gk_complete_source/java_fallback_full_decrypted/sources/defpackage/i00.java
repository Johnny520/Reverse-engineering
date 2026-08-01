package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i00 implements java.io.Serializable {
    public final /* synthetic */ int a;
    public java.lang.Object b;

    public /* synthetic */ i00() {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.<init>()
            return
    }

    public i00(java.lang.String r2) {
            r1 = this;
            r0 = 1
            r1.a = r0
            java.lang.String r0 = "pattern"
            defpackage.ip.o(r0, r2)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(...)"
            defpackage.ip.n(r0, r2)
            r1.<init>()
            r1.b = r2
            return
    }

    public static defpackage.d4 a(defpackage.i00 r1, java.lang.String r2) {
            r1.getClass()
            java.lang.String r0 = "input"
            defpackage.ip.o(r0, r2)
            java.lang.Object r1 = r1.b
            java.util.regex.Pattern r1 = (java.util.regex.Pattern) r1
            java.util.regex.Matcher r1 = r1.matcher(r2)
            java.lang.String r0 = "matcher(...)"
            defpackage.ip.n(r0, r1)
            r0 = 0
            boolean r0 = r1.find(r0)
            if (r0 != 0) goto L1e
            r1 = 0
            return r1
        L1e:
            d4 r0 = new d4
            r0.<init>(r1, r2)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 0: goto L13;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r2.b
            java.util.regex.Pattern r0 = (java.util.regex.Pattern) r0
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "toString(...)"
            defpackage.ip.n(r1, r0)
            return r0
        L13:
            java.lang.Object r0 = r2.b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }
}
