package defpackage;

/* JADX INFO: renamed from: ᛵᛶᛵᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0910 extends defpackage.AbstractC1533 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0281 f4142;

    public C0910(defpackage.C0281 r1) {
            r0 = this;
            r0.<init>()
            r0.f4142 = r1
            return
    }

    @Override // defpackage.AbstractC1533
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final void mo1878(java.lang.Throwable r1) {
            r0 = this;
            ᛲᛴᛴᛵ r0 = r0.f4142
            java.lang.Object r0 = r0.f1563
            ᛴᲁᛶᲈ r0 = (defpackage.C0766) r0
            r0.m1698(r1)
            return
    }

    @Override // defpackage.AbstractC1533
    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public final void mo1879(defpackage.C0302 r4) {
            r3 = this;
            ᛲᛴᛴᛵ r3 = r3.f4142
            r3.f1562 = r4
            ᛴᛵᲇᲇ r4 = new ᛴᛵᲇᲇ
            java.lang.Object r0 = r3.f1562
            ᛲᛶᛲᲁ r0 = (defpackage.C0302) r0
            ᲀᛴᛱᛱ r1 = new ᲀᛴᛱᛱ
            r2 = 20
            r1.<init>(r2)
            java.lang.Object r2 = r3.f1563
            ᛴᲁᛶᲈ r2 = (defpackage.C0766) r2
            ᲈᲀᛲᛴ r2 = r2.f3562
            r4.<init>(r0, r1, r2)
            r3.f1564 = r4
            java.lang.Object r3 = r3.f1563
            ᛴᲁᛶᲈ r3 = (defpackage.C0766) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r3.f3566
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.lock()
            r0 = 1
            r3.f3565 = r0     // Catch: java.lang.Throwable -> L52
            ᲇᛵᛲᛲ r0 = r3.f3567     // Catch: java.lang.Throwable -> L52
            r4.addAll(r0)     // Catch: java.lang.Throwable -> L52
            ᲇᛵᛲᛲ r0 = r3.f3567     // Catch: java.lang.Throwable -> L52
            r0.clear()     // Catch: java.lang.Throwable -> L52
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r3.f3566
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            android.os.Handler r0 = r3.f3564
            ᛵᛵᛱᛸ r1 = new ᛵᛵᛱᛸ
            int r3 = r3.f3565
            r2 = 0
            r1.<init>(r4, r3, r2)
            r0.post(r1)
            return
        L52:
            r4 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = r3.f3566
            java.util.concurrent.locks.Lock r3 = r3.writeLock()
            r3.unlock()
            throw r4
    }
}
