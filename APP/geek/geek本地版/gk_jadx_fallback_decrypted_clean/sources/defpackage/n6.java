package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n6 extends defpackage.u30 implements java.util.Map {
    public defpackage.m6 h;

    public n6(defpackage.u30 r5) {
            r4 = this;
            r4.<init>()
            int r0 = r5.c
            r4.b(r0)
            int r1 = r4.c
            r2 = 0
            if (r1 != 0) goto L22
            if (r0 <= 0) goto L32
            int[] r1 = r5.a
            int[] r3 = r4.a
            java.lang.System.arraycopy(r1, r2, r3, r2, r0)
            java.lang.Object[] r5 = r5.b
            java.lang.Object[] r1 = r4.b
            int r3 = r0 << 1
            java.lang.System.arraycopy(r5, r2, r1, r2, r3)
            r4.c = r0
            return
        L22:
            if (r2 >= r0) goto L32
            java.lang.Object r1 = r5.h(r2)
            java.lang.Object r3 = r5.j(r2)
            r4.put(r1, r3)
            int r2 = r2 + 1
            goto L22
        L32:
            return
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
            r3 = this;
            m6 r0 = r3.h
            if (r0 != 0) goto Lc
            m6 r0 = new m6
            r1 = 0
            r0.<init>(r1, r3)
            r3.h = r0
        Lc:
            m6 r0 = r3.h
            ts r1 = r0.a
            if (r1 != 0) goto L1a
            ts r1 = new ts
            r2 = 0
            r1.<init>(r0, r2)
            r0.a = r1
        L1a:
            ts r0 = r0.a
            return r0
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
            r3 = this;
            m6 r0 = r3.h
            if (r0 != 0) goto Lc
            m6 r0 = new m6
            r1 = 0
            r0.<init>(r1, r3)
            r3.h = r0
        Lc:
            m6 r0 = r3.h
            ts r1 = r0.b
            if (r1 != 0) goto L1a
            ts r1 = new ts
            r2 = 1
            r1.<init>(r0, r2)
            r0.b = r1
        L1a:
            ts r0 = r0.b
            return r0
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map r3) {
            r2 = this;
            int r0 = r2.c
            int r1 = r3.size()
            int r1 = r1 + r0
            r2.b(r1)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L12:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r2.put(r1, r0)
            goto L12
        L2a:
            return
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
            r2 = this;
            m6 r0 = r2.h
            if (r0 != 0) goto Lc
            m6 r0 = new m6
            r1 = 0
            r0.<init>(r1, r2)
            r2.h = r0
        Lc:
            m6 r0 = r2.h
            vs r1 = r0.c
            if (r1 != 0) goto L19
            vs r1 = new vs
            r1.<init>(r0)
            r0.c = r1
        L19:
            vs r0 = r0.c
            return r0
    }
}
