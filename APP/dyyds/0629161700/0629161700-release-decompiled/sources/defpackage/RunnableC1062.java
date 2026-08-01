package defpackage;

/* JADX INFO: renamed from: ᛶᛴᲀᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1062 extends defpackage.C0818 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final long f4699;

    public RunnableC1062(long r2, defpackage.C1369 r4) {
            r1 = this;
            ᛳᛵᲈᛵ r0 = r4.f4527
            r1.<init>(r0, r4)
            r1.f4699 = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            ᛳᛵᲈᛵ r0 = r3.f1569
            defpackage.AbstractC0729.m1637(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Timed out waiting for "
            r0.<init>(r1)
            long r1 = r3.f4699
            r0.append(r1)
            java.lang.String r1 = " ms"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            ᲀᲀᛶᲇ r1 = new ᲀᲀᛶᲇ
            r1.<init>(r0, r3)
            r3.m1435(r1)
            return
    }

    @Override // defpackage.AbstractC0624
    /* JADX INFO: renamed from: ᛷᛵᲇᛶ */
    public final java.lang.String mo1446() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = super.mo1446()
            r0.<init>(r1)
            java.lang.String r1 = "(timeMillis="
            r0.append(r1)
            long r1 = r3.f4699
            r0.append(r1)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
