package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ab extends defpackage.gb {
    public static final void i0(java.util.Collection r1, java.lang.StringBuilder r2, java.lang.CharSequence r3, java.lang.CharSequence r4, java.lang.CharSequence r5, java.lang.CharSequence r6, defpackage.sm r7) {
            r2.append(r4)
            java.util.Iterator r1 = r1.iterator()
            r4 = 0
        L8:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L48
            java.lang.Object r6 = r1.next()
            r0 = 1
            int r4 = r4 + r0
            if (r4 <= r0) goto L19
            r2.append(r3)
        L19:
            if (r7 == 0) goto L25
            java.lang.Object r6 = r7.f(r6)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r2.append(r6)
            goto L8
        L25:
            if (r6 != 0) goto L28
            goto L2a
        L28:
            boolean r0 = r6 instanceof java.lang.CharSequence
        L2a:
            if (r0 == 0) goto L32
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r2.append(r6)
            goto L8
        L32:
            boolean r0 = r6 instanceof java.lang.Character
            if (r0 == 0) goto L40
            java.lang.Character r6 = (java.lang.Character) r6
            char r6 = r6.charValue()
            r2.append(r6)
            goto L8
        L40:
            java.lang.String r6 = r6.toString()
            r2.append(r6)
            goto L8
        L48:
            r2.append(r5)
            return
    }

    public static java.lang.String j0(java.util.Collection r7, java.lang.String r8, defpackage.sm r9, int r10) {
            r0 = r10 & 1
            if (r0 == 0) goto L6
            java.lang.String r8 = ", "
        L6:
            r2 = r8
            r8 = r10 & 2
            java.lang.String r0 = ""
            if (r8 == 0) goto Lf
            r3 = r0
            goto L12
        Lf:
            java.lang.String r8 = "["
            r3 = r8
        L12:
            r8 = r10 & 4
            if (r8 == 0) goto L18
        L16:
            r4 = r0
            goto L1b
        L18:
            java.lang.String r0 = "]"
            goto L16
        L1b:
            r8 = r10 & 32
            if (r8 == 0) goto L20
            r9 = 0
        L20:
            r6 = r9
            java.lang.String r8 = "separator"
            defpackage.ip.o(r8, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "..."
            r0 = r7
            i0(r0, r1, r2, r3, r4, r5, r6)
            java.lang.String r7 = r1.toString()
            return r7
    }

    public static java.lang.Comparable k0(java.util.ArrayList r3) {
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto Lc
            r3 = 0
            return r3
        Lc:
            java.lang.Object r0 = r3.next()
            java.lang.Comparable r0 = (java.lang.Comparable) r0
        L12:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r3.next()
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r2 = r0.compareTo(r1)
            if (r2 <= 0) goto L12
            r0 = r1
            goto L12
        L26:
            return r0
    }

    public static java.util.List l0(java.lang.Iterable r4) {
            java.lang.String r0 = "<this>"
            defpackage.ip.o(r0, r4)
            boolean r0 = r4 instanceof java.util.Collection
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L34
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0
            int r3 = r0.size()
            if (r3 == 0) goto L67
            if (r3 == r2) goto L1c
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            return r4
        L1c:
            boolean r2 = r4 instanceof java.util.List
            if (r2 == 0) goto L27
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r4 = r4.get(r1)
            goto L2f
        L27:
            java.util.Iterator r4 = r0.iterator()
            java.lang.Object r4 = r4.next()
        L2f:
            java.util.List r4 = defpackage.ip.C(r4)
            return r4
        L34:
            if (r0 == 0) goto L3e
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r4)
            goto L55
        L3e:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L47:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L55
            java.lang.Object r3 = r4.next()
            r0.add(r3)
            goto L47
        L55:
            int r4 = r0.size()
            if (r4 == 0) goto L67
            if (r4 == r2) goto L5e
            return r0
        L5e:
            java.lang.Object r4 = r0.get(r1)
            java.util.List r4 = defpackage.ip.C(r4)
            return r4
        L67:
            yi r4 = defpackage.yi.a
            return r4
    }
}
