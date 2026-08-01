package defpackage;

/* JADX INFO: renamed from: ᛲᲁᛲᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnDismissListenerC0357 implements android.content.DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f1850;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f1851;

    public /* synthetic */ DialogInterfaceOnDismissListenerC0357(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f1851 = r1
            r0.f1850 = r2
            r0.<init>()
            return
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface r1) {
            r0 = this;
            int r1 = r0.f1851
            java.lang.Object r0 = r0.f1850
            switch(r1) {
                case 0: goto L1a;
                case 1: goto L13;
                case 2: goto Ld;
                default: goto L7;
            }
        L7:
            ᛱᛵᛴᛲ r0 = (defpackage.C0089) r0
            r0.m565()
            return
        Ld:
            ᛳᲁᛳᛴ r0 = (defpackage.C0554) r0
            defpackage.AbstractC1628.m2976(r0)
            return
        L13:
            android.app.Activity r0 = (android.app.Activity) r0
            r1 = 0
            defpackage.AbstractC2093.m3512(r0, r1)
            return
        L1a:
            ᲀᛲᛶᲈ r0 = (defpackage.C1630) r0
            r0.m2983()
            ᛵᲈᲇᛵ r0 = r0.f7238
            if (r0 == 0) goto L26
            defpackage.AbstractC1193.m2333(r0)
        L26:
            return
    }
}
