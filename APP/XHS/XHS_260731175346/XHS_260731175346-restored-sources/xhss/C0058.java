package xhss;

/* JADX INFO: renamed from: xhss.ᛱᛷᛳᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0058 {
    private volatile java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> array;

    public C0058(int r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
            r0.<init>(r2)
            r1.array = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.Object m176(int r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r1 = r1.array
            int r0 = r1.length()
            if (r2 >= r0) goto Ld
            java.lang.Object r1 = r1.get(r2)
            return r1
        Ld:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final void m177(int r6, xhss.C0650 r7) {
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

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final int m178() {
            r0 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r0 = r0.array
            int r0 = r0.length()
            return r0
    }
}
