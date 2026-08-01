package defpackage;

/* JADX INFO: renamed from: ᛳᛸᲁᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0534 extends defpackage.AbstractC1191 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C2080 f2652;

    public AbstractC0534(defpackage.AbstractC2346 r7) {
            r6 = this;
            r6.<init>()
            ᲈᛲᲁᛸ r0 = new ᲈᛲᲁᛸ
            r0.<init>(r6)
            ᲇᛶᲇᲀ r1 = new ᲇᛶᲇᲀ
            ᛸᲈᛸᲈ r2 = new ᛸᲈᛸᲈ
            r3 = 4
            r2.<init>(r3, r6)
            java.lang.Object r3 = defpackage.AbstractC0397.f2038
            monitor-enter(r3)
            java.util.concurrent.ExecutorService r4 = defpackage.AbstractC0397.f2039     // Catch: java.lang.Throwable -> L1f
            if (r4 != 0) goto L21
            r4 = 2
            java.util.concurrent.ExecutorService r4 = java.util.concurrent.Executors.newFixedThreadPool(r4)     // Catch: java.lang.Throwable -> L1f
            defpackage.AbstractC0397.f2039 = r4     // Catch: java.lang.Throwable -> L1f
            goto L21
        L1f:
            r6 = move-exception
            goto L33
        L21:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1f
            ᛴᛵᲇᲇ r3 = new ᛴᛵᲇᲇ
            r5 = 7
            r3.<init>(r4, r5, r7)
            r1.<init>(r2, r3)
            r6.f2652 = r1
            java.util.concurrent.CopyOnWriteArrayList r6 = r1.f8918
            r6.add(r0)
            return
        L33:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1f
            throw r6
    }

    @Override // defpackage.AbstractC1191
    public final int getItemCount() {
            r0 = this;
            ᲇᛶᲇᲀ r0 = r0.f2652
            java.util.List r0 = r0.f8922
            int r0 = r0.size()
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m1327(java.util.List r5) {
            r4 = this;
            ᲇᛶᲇᲀ r4 = r4.f2652
            ᛸᲈᛸᲈ r0 = r4.f8920
            int r1 = r4.f8923
            int r1 = r1 + 1
            r4.f8923 = r1
            java.util.List r2 = r4.f8917
            if (r5 != r2) goto Lf
            return
        Lf:
            r3 = 0
            if (r5 != 0) goto L24
            int r5 = r2.size()
            r1 = 0
            r4.f8917 = r1
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            r4.f8922 = r1
            r0.m2896(r3, r5)
            r4.m3504()
            return
        L24:
            if (r2 != 0) goto L39
            r4.f8917 = r5
            java.util.List r1 = java.util.Collections.unmodifiableList(r5)
            r4.f8922 = r1
            int r5 = r5.size()
            r0.m2895(r3, r5)
            r4.m3504()
            return
        L39:
            ᛴᛵᲇᲇ r0 = r4.f8921
            java.lang.Object r0 = r0.f3286
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            ᛲᛱᲀᲇ r3 = new ᛲᛱᲀᲇ
            r3.<init>(r4, r2, r5, r1)
            r0.execute(r3)
            return
    }
}
