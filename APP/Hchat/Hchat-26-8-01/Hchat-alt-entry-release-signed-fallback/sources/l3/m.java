package l3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            java.lang.String r0 = "EmojiCompat.EmojiCompatInitializer.run"
            int r1 = d3.c.f1974a     // Catch: java.lang.Throwable -> L15
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L15
            boolean r0 = l3.i.d()     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L17
            l3.i r0 = l3.i.a()     // Catch: java.lang.Throwable -> L15
            r0.e()     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r0 = move-exception
            goto L1b
        L17:
            android.os.Trace.endSection()
            return
        L1b:
            int r1 = d3.c.f1974a
            android.os.Trace.endSection()
            throw r0
    }
}
