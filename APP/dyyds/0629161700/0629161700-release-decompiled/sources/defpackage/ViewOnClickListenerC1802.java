package defpackage;

/* JADX INFO: renamed from: ᲁᛱᲀᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC1802 implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1315 f7898;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f7899;

    public /* synthetic */ ViewOnClickListenerC1802(defpackage.C1315 r1, int r2) {
            r0 = this;
            r0.f7899 = r2
            r0.f7898 = r1
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r4) {
            r3 = this;
            int r0 = r3.f7899
            r1 = 0
            ᛷᛷᛸᛱ r3 = r3.f7898
            switch(r0) {
                case 0: goto L70;
                case 1: goto L3e;
                case 2: goto Lc;
                default: goto L8;
            }
        L8:
            r3.m2441(r4)
            return
        Lc:
            java.lang.Object r0 = r3.f5821
            ᛱᲁᲀᲁ r0 = (defpackage.C0185) r0
            android.widget.EditText r2 = r3.f5817
            if (r2 == 0) goto L17
            r0.m268(r2, r1)
        L17:
            com.kongzue.dialogx.interfaces.AbstractC0008.m249(r4)
            ᛱᲁᲀᲁ r1 = r0.f1238
            ᲁᲁᛱᛱ r0 = r0.f1246
            if (r0 == 0) goto L3a
            boolean r2 = r0 instanceof defpackage.InterfaceC1770
            if (r2 == 0) goto L30
            ᲀᲇᛸ r0 = (defpackage.InterfaceC1770) r0
            boolean r0 = r0.mo1227(r1)
            if (r0 != 0) goto L3d
            r3.m2441(r4)
            goto L3d
        L30:
            boolean r0 = r0.mo479(r1)
            if (r0 != 0) goto L3d
            r3.m2441(r4)
            goto L3d
        L3a:
            r3.m2441(r4)
        L3d:
            return
        L3e:
            java.lang.Object r0 = r3.f5821
            ᛱᲁᲀᲁ r0 = (defpackage.C0185) r0
            android.widget.EditText r2 = r3.f5817
            if (r2 == 0) goto L49
            r0.m268(r2, r1)
        L49:
            com.kongzue.dialogx.interfaces.AbstractC0008.m249(r4)
            ᛱᲁᲀᲁ r1 = r0.f1238
            ᛴᛴᛲᛵ r0 = r0.f1250
            if (r0 == 0) goto L6c
            boolean r2 = r0 instanceof defpackage.InterfaceC1770
            if (r2 == 0) goto L62
            ᲀᲇᛸ r0 = (defpackage.InterfaceC1770) r0
            boolean r0 = r0.mo1227(r1)
            if (r0 != 0) goto L6f
            r3.m2441(r4)
            goto L6f
        L62:
            boolean r0 = r0.mo479(r1)
            if (r0 != 0) goto L6f
            r3.m2441(r4)
            goto L6f
        L6c:
            r3.m2441(r4)
        L6f:
            return
        L70:
            java.lang.Object r0 = r3.f5821
            ᛱᲁᲀᲁ r0 = (defpackage.C0185) r0
            android.widget.EditText r2 = r3.f5817
            if (r2 == 0) goto L7b
            r0.m268(r2, r1)
        L7b:
            com.kongzue.dialogx.interfaces.AbstractC0008.m249(r4)
            ᛱᲁᲀᲁ r1 = r0.f1238
            ᛷᛵᛱᛶ r0 = r0.f1237
            if (r0 == 0) goto La4
            boolean r2 = r0 instanceof defpackage.InterfaceC0646
            if (r2 == 0) goto L94
            ᛴᛴᛲᛵ r0 = (defpackage.InterfaceC0646) r0
            boolean r0 = r0.mo479(r1)
            if (r0 != 0) goto La7
            r3.m2441(r4)
            goto La7
        L94:
            boolean r2 = r0 instanceof defpackage.InterfaceC1770
            if (r2 == 0) goto La7
            ᲀᲇᛸ r0 = (defpackage.InterfaceC1770) r0
            boolean r0 = r0.mo1227(r1)
            if (r0 != 0) goto La7
            r3.m2441(r4)
            goto La7
        La4:
            r3.m2441(r4)
        La7:
            return
    }
}
