package defpackage;

/* JADX INFO: renamed from: ᛵᛴᛳᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0865 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0060 f3919;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f3920;

    public /* synthetic */ RunnableC0865(defpackage.C0060 r1, int r2) {
            r0 = this;
            r0.f3920 = r2
            r0.f3919 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            int r0 = r4.f3920
            ᛱᛳᲀᛷ r1 = r4.f3919
            switch(r0) {
                case 0: goto L28;
                default: goto L7;
            }
        L7:
            ᛳᛸᛳᛸ r0 = r1.f701
            ᛲᛵᛲ r2 = r0.f2585
            if (r2 != 0) goto L15
            ᛲᛵᛲ r2 = new ᛲᛵᛲ
            r3 = 2
            r2.<init>(r3, r1)
            r0.f2585 = r2
        L15:
            r2.m951(r0)
            ᛳᛳᛵᛲ r0 = new ᛳᛳᛵᛲ
            r2 = 19
            r0.<init>(r2, r4)
            r4 = 0
            long r1 = r1.m478(r4)
            com.kongzue.dialogx.interfaces.AbstractC0008.m248(r0, r1)
            return
        L28:
            ᛳᛸᛳᛸ r4 = r1.f701
            int r4 = r4.f2584
            ᛵᛵᛱᛸ r0 = new ᛵᛵᛱᛸ
            r0.<init>(r1, r4)
            com.kongzue.dialogx.interfaces.AbstractC0008.m257(r0)
            return
    }
}
