package xhss;

/* JADX INFO: renamed from: xhss.ᲈᛱᛳᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1114 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f3592;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C0891 f3593;

    public /* synthetic */ RunnableC1114(xhss.C0891 r1, int r2) {
            r0 = this;
            r0.f3592 = r2
            r0.f3593 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            int r0 = r4.f3592
            xhss.ᲀᲀ r1 = r4.f3593
            switch(r0) {
                case 0: goto L28;
                default: goto L7;
            }
        L7:
            xhss.ᛳᛴᛵ r0 = r1.f2877
            xhss.ᛶᲈᛴᛲ r2 = r0.f952
            if (r2 != 0) goto L15
            xhss.ᛶᲈᛴᛲ r2 = new xhss.ᛶᲈᛴᛲ
            r3 = 2
            r2.<init>(r3, r1)
            r0.f952 = r2
        L15:
            r2.m1079(r0)
            xhss.ᛴᲈᲀᲇ r0 = new xhss.ᛴᲈᲀᲇ
            r2 = 8
            r0.<init>(r2, r4)
            r4 = 0
            long r1 = r1.m1454(r4)
            com.kongzue.dialogx.interfaces.AbstractC0001.m36(r0, r1)
            return
        L28:
            xhss.ᛳᛴᛵ r4 = r1.f2877
            int r4 = r4.f957
            xhss.ᛵᛶᛲᛳ r0 = new xhss.ᛵᛶᛲᛳ
            r0.<init>(r1, r4)
            com.kongzue.dialogx.interfaces.AbstractC0001.m43(r0)
            return
    }
}
