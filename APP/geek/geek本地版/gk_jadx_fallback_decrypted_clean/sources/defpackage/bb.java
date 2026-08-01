package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class bb extends defpackage.ip {
    public static java.util.List f0(java.lang.Object... r1) {
            int r0 = r1.length
            if (r0 <= 0) goto Ld
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.lang.String r0 = "asList(...)"
            defpackage.ip.n(r0, r1)
            return r1
        Ld:
            yi r1 = defpackage.yi.a
            return r1
    }

    public static void g0() {
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "Index overflow has happened."
            r0.<init>(r1)
            throw r0
    }
}
