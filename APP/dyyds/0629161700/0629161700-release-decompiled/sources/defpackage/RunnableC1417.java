package defpackage;

/* JADX INFO: renamed from: ᛸᛱᛳᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1417 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1069 f6205;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f6206;

    public /* synthetic */ RunnableC1417(defpackage.C1069 r1, int r2) {
            r0 = this;
            r0.f6206 = r2
            r0.f6205 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            int r0 = r1.f6206
            ᛶᛵᛳᛸ r1 = r1.f6205
            switch(r0) {
                case 0: goto L11;
                default: goto L7;
            }
        L7:
            ᛳᛳᛴᛸ r1 = r1.f4767
            if (r1 != 0) goto Lc
            goto L10
        Lc:
            r0 = 0
            r1.m1220(r0)
        L10:
            return
        L11:
            ᛳᛳᛴᛸ r1 = r1.f4767
            if (r1 == 0) goto L18
            r1.m1219()
        L18:
            return
    }
}
