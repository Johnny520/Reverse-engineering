package defpackage;

/* JADX INFO: renamed from: ᲇᛵᲀᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2053 extends defpackage.AbstractC0606 {

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray f8847;

    public C2053(long r1, defpackage.C2053 r3, int r4) {
            r0 = this;
            r0.<init>(r1, r3, r4)
            java.util.concurrent.atomic.AtomicReferenceArray r1 = new java.util.concurrent.atomic.AtomicReferenceArray
            int r2 = defpackage.AbstractC2031.f8757
            r1.<init>(r2)
            r0.f8847 = r1
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SemaphoreSegment[id="
            r0.<init>(r1)
            long r1 = r3.f2995
            r0.append(r1)
            java.lang.String r1 = ", hashCode="
            r0.append(r1)
            int r3 = r3.hashCode()
            r0.append(r3)
            r3 = 93
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @Override // defpackage.AbstractC0606
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final int mo1402() {
            r0 = this;
            int r0 = defpackage.AbstractC2031.f8757
            return r0
    }

    @Override // defpackage.AbstractC0606
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public final void mo1404(int r3) {
            r2 = this;
            ᛳᛴᛵᛱ r0 = defpackage.AbstractC2031.f8752
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r2.f8847
            r1.set(r3, r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = defpackage.AbstractC0606.f2994
            int r3 = r3.incrementAndGet(r2)
            int r0 = defpackage.AbstractC2031.f8757
            if (r3 != r0) goto L14
            r2.m1061()
        L14:
            return
    }
}
