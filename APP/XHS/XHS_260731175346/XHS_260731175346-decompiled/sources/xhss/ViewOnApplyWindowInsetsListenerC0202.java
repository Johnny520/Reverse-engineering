package xhss;

/* JADX INFO: renamed from: xhss.ᛲᲀᛳᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0202 implements android.view.View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final /* synthetic */ xhss.InterfaceC0725 f766;

    public ViewOnApplyWindowInsetsListenerC0202(android.view.View r1, xhss.InterfaceC0725 r2) {
            r0 = this;
            r0.f766 = r2
            r0.<init>()
            return
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public android.view.WindowInsets onApplyWindowInsets(android.view.View r2, android.view.WindowInsets r3) {
            r1 = this;
            xhss.ᲀᛳᛲᛶ r2 = xhss.C0847.m1430(r2, r3)
            xhss.ᛸᛱᛷᛴ r1 = r1.f766
            xhss.ᛳᛲᲈᛵ r1 = (xhss.C0247) r1
            xhss.ᛷᛴᛱᲀ r3 = r1.f922
            xhss.ᲇᲇᛱ r1 = r1.f921
            boolean r0 = r3.f2205
            if (r0 == 0) goto L11
            goto L19
        L11:
            xhss.ᲇᲇᛱ r0 = new xhss.ᲇᲇᛱ
            r0.<init>(r1)
            r3.m1126(r2, r0)
        L19:
            android.view.WindowInsets r1 = r2.m1431()
            return r1
    }
}
