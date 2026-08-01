package xhss;

/* JADX INFO: renamed from: xhss.ᲇᛶᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1051 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f3377;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C0036 f3378;

    public /* synthetic */ RunnableC1051(xhss.C0036 r1, int r2) {
            r0 = this;
            r0.f3377 = r2
            r0.f3378 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            int r0 = r1.f3377
            xhss.ᛱᛴᛳᛴ r1 = r1.f3378
            switch(r0) {
                case 0: goto L12;
                default: goto L7;
            }
        L7:
            xhss.ᲁᛳᛵᛷ r1 = r1.f226
            if (r1 != 0) goto Lc
            goto L11
        Lc:
            com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r1.f3023
            r1.m1536(r0)
        L11:
            return
        L12:
            xhss.ᲁᛳᛵᛷ r1 = r1.f226
            if (r1 == 0) goto L19
            r1.m1535()
        L19:
            return
    }
}
