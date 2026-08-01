package xhss;

/* JADX INFO: renamed from: xhss.ᛶᛷᛶᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class C0575 extends xhss.AbstractC0121 {
    public C0575() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final java.lang.Object mo119(xhss.C0385 r4) {
            r3 = this;
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4.m735()
        L8:
            boolean r0 = r4.m744()
            if (r0 == 0) goto L21
            int r0 = r4.m741()     // Catch: java.lang.NumberFormatException -> L1a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L1a
            r3.add(r0)     // Catch: java.lang.NumberFormatException -> L1a
            goto L8
        L1a:
            r3 = move-exception
            xhss.ᛱᲈᛲᛷ r4 = new xhss.ᛱᲈᛲᛷ
            r4.<init>(r3)
            throw r4
        L21:
            r4.m752()
            int r4 = r3.size()
            java.util.concurrent.atomic.AtomicIntegerArray r0 = new java.util.concurrent.atomic.AtomicIntegerArray
            r0.<init>(r4)
            r1 = 0
        L2e:
            if (r1 >= r4) goto L40
            java.lang.Object r2 = r3.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.set(r1, r2)
            int r1 = r1 + 1
            goto L2e
        L40:
            return r0
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final void mo120(xhss.C0827 r4, java.lang.Object r5) {
            r3 = this;
            java.util.concurrent.atomic.AtomicIntegerArray r5 = (java.util.concurrent.atomic.AtomicIntegerArray) r5
            r4.m1395()
            int r3 = r5.length()
            r0 = 0
        La:
            if (r0 >= r3) goto L17
            int r1 = r5.get(r0)
            long r1 = (long) r1
            r4.m1397(r1)
            int r0 = r0 + 1
            goto La
        L17:
            r4.m1401()
            return
    }
}
