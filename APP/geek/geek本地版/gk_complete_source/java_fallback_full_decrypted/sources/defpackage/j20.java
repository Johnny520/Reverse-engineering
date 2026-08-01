package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class j20 extends defpackage.k20 {
    public static java.util.List I(defpackage.i20 r2) {
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto Ld
            yi r2 = defpackage.yi.a
            return r2
        Ld:
            java.lang.Object r0 = r2.next()
            boolean r1 = r2.hasNext()
            if (r1 != 0) goto L1c
            java.util.List r2 = defpackage.ip.C(r0)
            return r2
        L1c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r0)
        L24:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r2.next()
            r1.add(r0)
            goto L24
        L32:
            return r1
    }
}
