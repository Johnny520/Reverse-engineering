package okhttp3.internal.cache;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class DiskLruCache$newJournalWriter$faultHidingSink$1 extends gg.m implements fg.l {
    final /* synthetic */ okhttp3.internal.cache.DiskLruCache this$0;

    public DiskLruCache$newJournalWriter$faultHidingSink$1(okhttp3.internal.cache.DiskLruCache r1) {
            r0 = this;
            r0.this$0 = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // fg.l
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
            r0 = this;
            java.io.IOException r1 = (java.io.IOException) r1
            r0.invoke(r1)
            sf.n r1 = sf.n.f12433a
            return r1
    }

    public final void invoke(java.io.IOException r3) {
            r2 = this;
            r3.getClass()
            okhttp3.internal.cache.DiskLruCache r3 = r2.this$0
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L1e
            boolean r0 = java.lang.Thread.holdsLock(r3)
            if (r0 == 0) goto L10
            goto L1e
        L10:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = " MUST hold lock on "
            j8.o.i(r0, r1, r3)
            return
        L1e:
            okhttp3.internal.cache.DiskLruCache r3 = r2.this$0
            r0 = 1
            okhttp3.internal.cache.DiskLruCache.access$setHasJournalErrors$p(r3, r0)
            return
    }
}
