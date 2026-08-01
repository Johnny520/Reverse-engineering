package defpackage;

/* JADX INFO: renamed from: ᛸᛸᛵᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1540 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ androidx.appcompat.widget.Toolbar f6836;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f6837;

    public /* synthetic */ RunnableC1540(androidx.appcompat.widget.Toolbar r1, int r2) {
            r0 = this;
            r0.f6837 = r2
            r0.f6836 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            int r0 = r1.f6837
            androidx.appcompat.widget.Toolbar r1 = r1.f6836
            switch(r0) {
                case 0: goto Lb;
                default: goto L7;
            }
        L7:
            r1.m67()
            return
        Lb:
            ᛸᛲᲁᲈ r1 = r1.f207
            if (r1 != 0) goto L11
            r1 = 0
            goto L13
        L11:
            ᛲᛲᛶᲁ r1 = r1.f6344
        L13:
            if (r1 == 0) goto L18
            r1.collapseActionView()
        L18:
            return
    }
}
