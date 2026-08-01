package xhss;

/* JADX INFO: renamed from: xhss.ᛴᛲᲀᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0342 extends xhss.AbstractC0007 {

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C0220 f1268;

    public C0342(xhss.C0220 r1) {
            r0 = this;
            r0.<init>()
            r0.f1268 = r1
            return
    }

    @Override // xhss.AbstractC0007
    /* JADX INFO: renamed from: ᛸᛲᲀᛵ */
    public final void mo105(xhss.C1068 r6) {
            r5 = this;
            xhss.ᛲᲈᛱᛳ r5 = r5.f1268
            r5.f806 = r6
            xhss.ᛷᛱᛳᲁ r6 = new xhss.ᛷᛱᛳᲁ
            java.lang.Object r0 = r5.f806
            xhss.ᲇᛸᛶ r0 = (xhss.C1068) r0
            java.lang.Object r1 = r5.f807
            xhss.ᛵᲁᛱᲁ r1 = (xhss.C0514) r1
            xhss.ᛳᛴᲀᲁ r2 = r1.f1876
            xhss.ᛶᛸᲀᲁ r1 = r1.f1874
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 34
            if (r3 < r4) goto L1d
            java.util.Set r3 = xhss.AbstractC1089.m1775()
            goto L21
        L1d:
            java.util.Set r3 = xhss.AbstractC0561.m1015()
        L21:
            r6.<init>(r0, r2, r1, r3)
            r5.f805 = r6
            java.lang.Object r5 = r5.f807
            xhss.ᛵᲁᛱᲁ r5 = (xhss.C0514) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r5.f1873
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.lock()
            r0 = 1
            r5.f1871 = r0     // Catch: java.lang.Throwable -> L5c
            xhss.ᛴᛲᛴᲇ r0 = r5.f1870     // Catch: java.lang.Throwable -> L5c
            r6.addAll(r0)     // Catch: java.lang.Throwable -> L5c
            xhss.ᛴᛲᛴᲇ r0 = r5.f1870     // Catch: java.lang.Throwable -> L5c
            r0.clear()     // Catch: java.lang.Throwable -> L5c
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r5.f1873
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            android.os.Handler r0 = r5.f1877
            xhss.ᛵᛶᛲᛳ r1 = new xhss.ᛵᛶᛲᛳ
            int r5 = r5.f1871
            r2 = 0
            r1.<init>(r6, r5, r2)
            r0.post(r1)
            return
        L5c:
            r6 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r5 = r5.f1873
            java.util.concurrent.locks.Lock r5 = r5.writeLock()
            r5.unlock()
            throw r6
    }

    @Override // xhss.AbstractC0007
    /* JADX INFO: renamed from: ᛸᛴᛶᛳ */
    public final void mo106(java.lang.Throwable r1) {
            r0 = this;
            xhss.ᛲᲈᛱᛳ r0 = r0.f1268
            java.lang.Object r0 = r0.f807
            xhss.ᛵᲁᛱᲁ r0 = (xhss.C0514) r0
            r0.m925(r1)
            return
    }
}
