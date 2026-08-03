package okhttp3.internal.cache;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class DiskLruCache$Editor$newSink$1$1 extends gg.m implements fg.l {
    final /* synthetic */ okhttp3.internal.cache.DiskLruCache this$0;
    final /* synthetic */ okhttp3.internal.cache.DiskLruCache.Editor this$1;

    public DiskLruCache$Editor$newSink$1$1(okhttp3.internal.cache.DiskLruCache r1, okhttp3.internal.cache.DiskLruCache.Editor r2) {
            r0 = this;
            r0.this$0 = r1
            r0.this$1 = r2
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

    public final void invoke(java.io.IOException r2) {
            r1 = this;
            r2.getClass()
            okhttp3.internal.cache.DiskLruCache r2 = r1.this$0
            okhttp3.internal.cache.DiskLruCache$Editor r0 = r1.this$1
            monitor-enter(r2)
            r0.detach$okhttp()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return
        Ld:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }
}
