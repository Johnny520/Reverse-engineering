package vg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    private volatile java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> array;

    public o(int r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
            r0.<init>(r2)
            r1.array = r0
            return
    }

    public final int a() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r0 = r1.array
            int r0 = r0.length()
            return r0
    }

    public final java.lang.Object b(int r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r0 = r2.array
            int r1 = r0.length()
            if (r3 >= r1) goto Ld
            java.lang.Object r3 = r0.get(r3)
            return r3
        Ld:
            r3 = 0
            return r3
    }

    public final void c(int r6, xg.a r7) {
            r5 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r0 = r5.array
            int r1 = r0.length()
            if (r6 >= r1) goto Lc
            r0.set(r6, r7)
            return
        Lc:
            java.util.concurrent.atomic.AtomicReferenceArray r2 = new java.util.concurrent.atomic.AtomicReferenceArray
            int r3 = r6 + 1
            int r4 = r1 * 2
            if (r3 >= r4) goto L15
            r3 = r4
        L15:
            r2.<init>(r3)
            r3 = 0
        L19:
            if (r3 >= r1) goto L25
            java.lang.Object r4 = r0.get(r3)
            r2.set(r3, r4)
            int r3 = r3 + 1
            goto L19
        L25:
            r2.set(r6, r7)
            r5.array = r2
            return
    }
}
