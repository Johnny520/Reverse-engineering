package defpackage;

/* JADX INFO: renamed from: ᛱᲀᛱᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0157 extends defpackage.C0763 {
    @Override // defpackage.C0763
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void mo685(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            ᛴᲁᛴᲇ r1 = (defpackage.C0765) r1
            r1.getClass()
            java.util.ArrayDeque r0 = defpackage.C0765.f3558
            monitor-enter(r0)
            r0.offer(r1)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }
}
