package defpackage;

/* JADX INFO: renamed from: ᛳᲈᛴᲀ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0591 extends defpackage.AbstractC0183 {
    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public static java.lang.String m1391(defpackage.InterfaceC1152 r5, java.lang.String r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            java.util.Iterator r5 = r5.iterator()
            r2 = 0
        Lf:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L25
            java.lang.Object r3 = r5.next()
            r4 = 1
            int r2 = r2 + r4
            if (r2 <= r4) goto L20
            r0.append(r6)
        L20:
            r4 = 0
            defpackage.AbstractC1171.m2264(r0, r3, r4)
            goto Lf
        L25:
            r0.append(r1)
            java.lang.String r5 = r0.toString()
            return r5
    }

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public static java.util.List m1392(defpackage.InterfaceC1152 r2) {
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto Ld
            ᲀᛶᲇ r2 = defpackage.C1698.f7558
            return r2
        Ld:
            java.lang.Object r0 = r2.next()
            boolean r1 = r2.hasNext()
            if (r1 != 0) goto L1c
            java.util.List r2 = java.util.Collections.singletonList(r0)
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
