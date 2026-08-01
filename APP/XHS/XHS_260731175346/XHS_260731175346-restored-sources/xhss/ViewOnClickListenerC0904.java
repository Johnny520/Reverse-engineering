package xhss;

/* JADX INFO: renamed from: xhss.ᲀᲀᲈᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0904 implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C0158 f2933;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2934;

    public /* synthetic */ ViewOnClickListenerC0904(xhss.C0158 r1, int r2) {
            r0 = this;
            r0.f2934 = r2
            r0.f2933 = r1
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r2) {
            r1 = this;
            int r0 = r1.f2934
            xhss.ᛲᛵᛶᲁ r1 = r1.f2933
            switch(r0) {
                case 0: goto L33;
                case 1: goto L2a;
                case 2: goto L11;
                case 3: goto Ld;
                default: goto L7;
            }
        L7:
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r1 = r1.f638
            r1.callOnClick()
            return
        Ld:
            r1.m404(r2)
            return
        L11:
            com.kongzue.dialogx.interfaces.AbstractC0001.m34(r2)
            xhss.ᛵᲇᲀᛳ r1 = r1.f654
            xhss.ᛲᛱᛷᛲ r2 = r1.f1911
            if (r2 == 0) goto L26
            xhss.ᛵᲇᲀᛳ r0 = r1.f1903
            boolean r2 = r2.mo360(r0)
            if (r2 != 0) goto L29
            r1.m932()
            goto L29
        L26:
            r1.m932()
        L29:
            return
        L2a:
            com.kongzue.dialogx.interfaces.AbstractC0001.m34(r2)
            xhss.ᛵᲇᲀᛳ r1 = r1.f654
            r1.m932()
            return
        L33:
            com.kongzue.dialogx.interfaces.AbstractC0001.m34(r2)
            xhss.ᛵᲇᲀᛳ r1 = r1.f654
            r1.m932()
            return
    }
}
