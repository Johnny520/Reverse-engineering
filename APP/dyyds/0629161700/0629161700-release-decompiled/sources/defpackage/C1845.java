package defpackage;

/* JADX INFO: renamed from: ᲁᛴᛵᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1845 extends defpackage.AbstractC0397 {
    @Override // defpackage.AbstractC0397
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final boolean mo1154(defpackage.AbstractFutureC2017 r1, defpackage.C2246 r2, defpackage.C2246 r3) {
            r0 = this;
            monitor-enter(r1)
            ᲈᛵᲀᛱ r0 = r1.f8716     // Catch: java.lang.Throwable -> La
            if (r0 != r2) goto Lc
            r1.f8716 = r3     // Catch: java.lang.Throwable -> La
            r0 = 1
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            return r0
        La:
            r0 = move-exception
            goto Lf
        Lc:
            r0 = 0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            return r0
        Lf:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            throw r0
    }

    @Override // defpackage.AbstractC0397
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final boolean mo1155(defpackage.AbstractFutureC2017 r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            monitor-enter(r1)
            java.lang.Object r0 = r1.f8718     // Catch: java.lang.Throwable -> La
            if (r0 != r2) goto Lc
            r1.f8718 = r3     // Catch: java.lang.Throwable -> La
            r0 = 1
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            return r0
        La:
            r0 = move-exception
            goto Lf
        Lc:
            r0 = 0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            return r0
        Lf:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            throw r0
    }

    @Override // defpackage.AbstractC0397
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final boolean mo1156(defpackage.AbstractFutureC2017 r2, defpackage.C1317 r3) {
            r1 = this;
            ᛷᛷᲀᛴ r1 = defpackage.C1317.f5828
            monitor-enter(r2)
            ᛷᛷᲀᛴ r0 = r2.f8717     // Catch: java.lang.Throwable -> Lc
            if (r0 != r3) goto Le
            r2.f8717 = r1     // Catch: java.lang.Throwable -> Lc
            r1 = 1
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            return r1
        Lc:
            r1 = move-exception
            goto L11
        Le:
            r1 = 0
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            return r1
        L11:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    @Override // defpackage.AbstractC0397
    /* JADX INFO: renamed from: ᲁᲈᲇᲁ */
    public final void mo1157(defpackage.C2246 r1, java.lang.Thread r2) {
            r0 = this;
            r1.f9563 = r2
            return
    }

    @Override // defpackage.AbstractC0397
    /* JADX INFO: renamed from: ᲇᲀᛲᛱ */
    public final void mo1158(defpackage.C2246 r1, defpackage.C2246 r2) {
            r0 = this;
            r1.f9564 = r2
            return
    }
}
