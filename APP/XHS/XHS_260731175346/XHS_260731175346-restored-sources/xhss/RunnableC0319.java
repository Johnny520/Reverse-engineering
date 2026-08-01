package xhss;

/* JADX INFO: renamed from: xhss.ᛳᲁᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0319 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f1200;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C0158 f1201;

    public /* synthetic */ RunnableC0319(xhss.C0158 r1, int r2) {
            r0 = this;
            r0.f1200 = r2
            r0.f1201 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            int r0 = r4.f1200
            r1 = 0
            xhss.ᛲᛵᛶᲁ r4 = r4.f1201
            switch(r0) {
                case 0: goto L4f;
                case 1: goto L1b;
                default: goto L8;
            }
        L8:
            xhss.ᛷᛶᲀᛲ r0 = new xhss.ᛷᛶᲀᛲ
            xhss.ᛵᲇᲀᛳ r2 = r4.f654
            xhss.ᛵᲇᲀᛳ r3 = r2.f1903
            xhss.ᛲᛵᛶᲁ r2 = r2.f1897
            r0.<init>()
            r0.f2278 = r1
            r0.m1147(r3, r2)
            r4.f645 = r0
            return
        L1b:
            xhss.ᛵᲇᲀᛳ r0 = r4.f654
            xhss.ᛶᲈᛴᛲ r2 = r0.f1904
            if (r2 != 0) goto L28
            xhss.ᛶᲈᛴᛲ r2 = new xhss.ᛶᲈᛴᛲ
            r2.<init>(r1, r4)
            r0.f1904 = r2
        L28:
            r2.m1078(r0)
            xhss.ᛶᛵᲇᛸ r0 = r0.f95
            r0.getClass()
            java.util.ArrayList r4 = r4.f642
            if (r4 == 0) goto L4e
            java.util.Iterator r4 = r4.iterator()
            boolean r0 = r4.hasNext()
            if (r0 != 0) goto L3f
            goto L4e
        L3f:
            java.lang.Object r4 = r4.next()
            android.view.View r4 = (android.view.View) r4
            r4.getClass()
            java.lang.ClassCastException r4 = new java.lang.ClassCastException
            r4.<init>()
            throw r4
        L4e:
            return
        L4f:
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r4.f638
            if (r0 == 0) goto L58
            r1 = 8
            r0.setVisibility(r1)
        L58:
            xhss.ᛵᲇᲀᛳ r4 = r4.f654
            android.view.View r4 = r4.m59()
            com.kongzue.dialogx.interfaces.AbstractC0001.m42(r4)
            return
    }
}
