package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class pn1 {
    private volatile java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> array;

    public pn1(int r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
            r0.<init>(r2)
            r1.array = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public final int m4556() {
            r0 = this;
            java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r0 = r0.array
            int r0 = r0.length()
            return r0
    }

    /* JADX INFO: renamed from: β */
    public final java.lang.Object m4557(int r2) {
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

    /* JADX INFO: renamed from: γ */
    public final void m4558(int r6, p000.C1029yp r7) {
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
