package defpackage;

/* JADX INFO: renamed from: ᲈᛷᲀᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2294 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0185 f9708;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f9709;

    public /* synthetic */ RunnableC2294(defpackage.C0185 r1, int r2) {
            r0 = this;
            r0.f9709 = r2
            r0.f9708 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            int r0 = r1.f9709
            ᛱᲁᲀᲁ r1 = r1.f9708
            switch(r0) {
                case 0: goto L14;
                default: goto L7;
            }
        L7:
            ᛷᛷᛸᛱ r1 = r1.f1241
            if (r1 != 0) goto Lc
            goto L13
        Lc:
            android.view.View r0 = r1.f5822
            com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = (com.kongzue.dialogx.util.views.MaxRelativeLayout) r0
            r1.m2441(r0)
        L13:
            return
        L14:
            ᛷᛷᛸᛱ r1 = r1.f1241
            if (r1 == 0) goto L1b
            r1.m2440()
        L1b:
            return
    }
}
