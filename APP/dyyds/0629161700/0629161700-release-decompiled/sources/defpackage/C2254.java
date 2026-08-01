package defpackage;

/* JADX INFO: renamed from: ᲈᛶᛱᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2254 extends defpackage.AbstractC1533 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ java.util.concurrent.ThreadPoolExecutor f9580;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.AbstractC1533 f9581;

    public C2254(defpackage.AbstractC1533 r1, java.util.concurrent.ThreadPoolExecutor r2) {
            r0 = this;
            r0.<init>()
            r0.f9581 = r1
            r0.f9580 = r2
            return
    }

    @Override // defpackage.AbstractC1533
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public final void mo1878(java.lang.Throwable r2) {
            r1 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = r1.f9580
            ᛸᛷᲀᲈ r1 = r1.f9581     // Catch: java.lang.Throwable -> Lb
            r1.mo1878(r2)     // Catch: java.lang.Throwable -> Lb
            r0.shutdown()
            return
        Lb:
            r1 = move-exception
            r0.shutdown()
            throw r1
    }

    @Override // defpackage.AbstractC1533
    /* JADX INFO: renamed from: ᛶᛷᛱᲀ */
    public final void mo1879(defpackage.C0302 r2) {
            r1 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = r1.f9580
            ᛸᛷᲀᲈ r1 = r1.f9581     // Catch: java.lang.Throwable -> Lb
            r1.mo1879(r2)     // Catch: java.lang.Throwable -> Lb
            r0.shutdown()
            return
        Lb:
            r1 = move-exception
            r0.shutdown()
            throw r1
    }
}
