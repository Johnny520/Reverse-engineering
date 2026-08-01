package defpackage;

/* JADX INFO: renamed from: ᛲᛶᛷᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0310 implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f1639;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f1640;

    public /* synthetic */ ViewOnClickListenerC0310(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f1640 = r1
            r0.f1639 = r2
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r2) {
            r1 = this;
            int r2 = r1.f1640
            java.lang.Object r1 = r1.f1639
            switch(r2) {
                case 0: goto L26;
                case 1: goto L17;
                default: goto L7;
            }
        L7:
            androidx.appcompat.widget.Toolbar r1 = (androidx.appcompat.widget.Toolbar) r1
            ᛸᛲᲁᲈ r1 = r1.f207
            if (r1 != 0) goto Lf
            r1 = 0
            goto L11
        Lf:
            ᛲᛲᛶᲁ r1 = r1.f6344
        L11:
            if (r1 == 0) goto L16
            r1.collapseActionView()
        L16:
            return
        L17:
            ᛷᛷᛳᛶ r1 = (defpackage.C1311) r1
            ᛳᛴᲈᲁ r2 = r1.f5793
            r0 = 1
            ᛸᛶᛵᲀ r1 = r1.f5801
            android.os.Message r1 = r2.obtainMessage(r0, r1)
            r1.sendToTarget()
            return
        L26:
            ᛶᛷᛸᲈ r1 = (defpackage.AbstractC1115) r1
            r1.mo2071()
            return
    }
}
