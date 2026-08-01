package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class o10 implements java.lang.Iterable {
    public defpackage.l10 a;
    public defpackage.l10 b;
    public final java.util.WeakHashMap c;
    public int d;

    public o10() {
            r1 = this;
            r1.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r1.c = r0
            r0 = 0
            r1.d = r0
            return
    }

    public defpackage.l10 a(java.lang.Object r3) {
            r2 = this;
            l10 r0 = r2.a
        L2:
            if (r0 == 0) goto L10
            java.lang.Object r1 = r0.a
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Ld
            goto L10
        Ld:
            l10 r0 = r0.c
            goto L2
        L10:
            return r0
    }

    public java.lang.Object b(java.lang.Object r4) {
            r3 = this;
            l10 r4 = r3.a(r4)
            r0 = 0
            if (r4 != 0) goto L8
            return r0
        L8:
            int r1 = r3.d
            int r1 = r1 + (-1)
            r3.d = r1
            java.util.WeakHashMap r1 = r3.c
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L2e
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L1e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r1.next()
            n10 r2 = (defpackage.n10) r2
            r2.a(r4)
            goto L1e
        L2e:
            l10 r1 = r4.d
            if (r1 == 0) goto L37
            l10 r2 = r4.c
            r1.c = r2
            goto L3b
        L37:
            l10 r2 = r4.c
            r3.a = r2
        L3b:
            l10 r2 = r4.c
            if (r2 == 0) goto L42
            r2.d = r1
            goto L44
        L42:
            r3.b = r1
        L44:
            r4.c = r0
            r4.d = r0
            java.lang.Object r4 = r4.b
            return r4
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof defpackage.o10
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            o10 r7 = (defpackage.o10) r7
            int r1 = r6.d
            int r3 = r7.d
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            k10 r3 = (defpackage.k10) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            k10 r4 = (defpackage.k10) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            k10 r7 = (defpackage.k10) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            return r0
        L53:
            return r2
    }

    public final int hashCode() {
            r4 = this;
            java.util.Iterator r0 = r4.iterator()
            r1 = 0
        L5:
            r2 = r0
            k10 r2 = (defpackage.k10) r2
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1a
            java.lang.Object r2 = r2.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            int r2 = r2.hashCode()
            int r1 = r1 + r2
            goto L5
        L1a:
            return r1
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r4 = this;
            k10 r0 = new k10
            l10 r1 = r4.a
            l10 r2 = r4.b
            r3 = 0
            r0.<init>(r1, r2, r3)
            java.util.WeakHashMap r1 = r4.c
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.put(r0, r2)
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            java.util.Iterator r1 = r4.iterator()
        Lb:
            r2 = r1
            k10 r2 = (defpackage.k10) r2
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            boolean r2 = r2.hasNext()
            if (r2 == 0) goto Lb
            java.lang.String r2 = ", "
            r0.append(r2)
            goto Lb
        L2d:
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
