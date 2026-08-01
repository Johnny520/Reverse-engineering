package defpackage;

/* JADX INFO: renamed from: ᛱᲇᛷᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C0200 extends defpackage.AbstractC0758 {
    public C0200() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo561(defpackage.C0353 r3, java.lang.Object r4) {
            r2 = this;
            java.util.concurrent.atomic.AtomicInteger r4 = (java.util.concurrent.atomic.AtomicInteger) r4
            int r2 = r4.get()
            long r0 = (long) r2
            r3.m1070(r0)
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final java.lang.Object mo562(defpackage.C1103 r1) {
            r0 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger     // Catch: java.lang.NumberFormatException -> La
            int r1 = r1.m2099()     // Catch: java.lang.NumberFormatException -> La
            r0.<init>(r1)     // Catch: java.lang.NumberFormatException -> La
            return r0
        La:
            r0 = move-exception
            ᛲᛱᛶᲀ r1 = new ᛲᛱᛶᲀ
            r1.<init>(r0)
            throw r1
    }
}
