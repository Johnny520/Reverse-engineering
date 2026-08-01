package defpackage;

/* JADX INFO: renamed from: ᲀᲁᛸᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1759 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ androidx.appcompat.widget.SearchView f7775;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f7776;

    public /* synthetic */ RunnableC1759(androidx.appcompat.widget.SearchView r1, int r2) {
            r0 = this;
            r0.f7776 = r2
            r0.f7775 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            int r0 = r1.f7776
            androidx.appcompat.widget.SearchView r1 = r1.f7775
            switch(r0) {
                case 0: goto L12;
                default: goto L7;
            }
        L7:
            ᛱᛷᲇᛳ r1 = r1.f126
            boolean r0 = r1 instanceof defpackage.ViewOnClickListenerC2050
            if (r0 == 0) goto L11
            r0 = 0
            r1.mo650(r0)
        L11:
            return
        L12:
            r1.m56()
            return
    }
}
