package defpackage;

/* JADX INFO: renamed from: ᛷᛱᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1212 extends defpackage.AbstractC0758 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f5458;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.AbstractC0758 f5459;

    public /* synthetic */ C1212(defpackage.AbstractC0758 r1, int r2) {
            r0 = this;
            r0.f5458 = r2
            r0.f5459 = r1
            r0.<init>()
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo561(defpackage.C0353 r5, java.lang.Object r6) {
            r4 = this;
            int r0 = r4.f5458
            ᛴᲀᲈᛴ r4 = r4.f5459
            switch(r0) {
                case 0: goto L15;
                default: goto L7;
            }
        L7:
            java.util.concurrent.atomic.AtomicLong r6 = (java.util.concurrent.atomic.AtomicLong) r6
            long r0 = r6.get()
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            r4.mo561(r5, r6)
            return
        L15:
            java.util.concurrent.atomic.AtomicLongArray r6 = (java.util.concurrent.atomic.AtomicLongArray) r6
            r5.m1082()
            int r0 = r6.length()
            r1 = 0
        L1f:
            if (r1 >= r0) goto L2f
            long r2 = r6.get(r1)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r4.mo561(r5, r2)
            int r1 = r1 + 1
            goto L1f
        L2f:
            r5.m1068()
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final java.lang.Object mo562(defpackage.C1103 r5) {
            r4 = this;
            int r0 = r4.f5458
            ᛴᲀᲈᛴ r4 = r4.f5459
            switch(r0) {
                case 0: goto L17;
                default: goto L7;
            }
        L7:
            java.lang.Object r4 = r4.mo562(r5)
            java.lang.Number r4 = (java.lang.Number) r4
            java.util.concurrent.atomic.AtomicLong r5 = new java.util.concurrent.atomic.AtomicLong
            long r0 = r4.longValue()
            r5.<init>(r0)
            return r5
        L17:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.m2101()
        L1f:
            boolean r1 = r5.m2082()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r4.mo562(r5)
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.add(r1)
            goto L1f
        L37:
            r5.m2083()
            int r4 = r0.size()
            java.util.concurrent.atomic.AtomicLongArray r5 = new java.util.concurrent.atomic.AtomicLongArray
            r5.<init>(r4)
            r1 = 0
        L44:
            if (r1 >= r4) goto L56
            java.lang.Object r2 = r0.get(r1)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r5.set(r1, r2)
            int r1 = r1 + 1
            goto L44
        L56:
            return r5
    }
}
