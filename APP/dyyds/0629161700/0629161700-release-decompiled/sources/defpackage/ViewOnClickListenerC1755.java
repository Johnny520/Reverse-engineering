package defpackage;

/* JADX INFO: renamed from: ᲀᲁᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC1755 implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0438 f7749;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f7750;

    public /* synthetic */ ViewOnClickListenerC1755(defpackage.C0438 r1, int r2) {
            r0 = this;
            r0.f7750 = r2
            r0.f7749 = r1
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r3) {
            r2 = this;
            int r0 = r2.f7750
            ᛳᛳᛴᛸ r2 = r2.f7749
            switch(r0) {
                case 0: goto L7e;
                case 1: goto L4d;
                case 2: goto L18;
                case 3: goto Ld;
                default: goto L7;
            }
        L7:
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r2 = r2.f2164
            r2.callOnClick()
            return
        Ld:
            ᛶᛵᛳᛸ r0 = r2.f2151
            ᛱᛵᛲᲁ r0 = r0.f4769
            if (r0 == 0) goto L14
            goto L17
        L14:
            r2.m1220(r3)
        L17:
            return
        L18:
            ᛶᛵᛳᛸ r2 = r2.f2151
            r2.getClass()
            com.kongzue.dialogx.interfaces.AbstractC0008.m249(r3)
            r3 = 2
            r2.f4773 = r3
            ᛶᛵᛳᛸ r3 = r2.f4761
            ᛷᛵᛱᛶ r0 = r2.f4770
            if (r0 == 0) goto L49
            boolean r1 = r0 instanceof defpackage.InterfaceC0646
            if (r1 == 0) goto L39
            ᛴᛴᛲᛵ r0 = (defpackage.InterfaceC0646) r0
            boolean r3 = r0.mo479(r3)
            if (r3 != 0) goto L4c
            r2.m2040()
            goto L4c
        L39:
            boolean r1 = r0 instanceof defpackage.InterfaceC1770
            if (r1 == 0) goto L4c
            ᲀᲇᛸ r0 = (defpackage.InterfaceC1770) r0
            boolean r3 = r0.mo1227(r3)
            if (r3 != 0) goto L4c
            r2.m2040()
            goto L4c
        L49:
            r2.m2040()
        L4c:
            return
        L4d:
            ᛶᛵᛳᛸ r2 = r2.f2151
            r2.getClass()
            com.kongzue.dialogx.interfaces.AbstractC0008.m249(r3)
            r3 = 4
            r2.f4773 = r3
            ᲀᲇᛸ r3 = r2.f4759
            if (r3 == 0) goto L7a
            boolean r0 = r3 instanceof defpackage.InterfaceC0646
            if (r0 == 0) goto L6e
            ᛴᛴᛲᛵ r3 = (defpackage.InterfaceC0646) r3
            ᛶᛵᛳᛸ r0 = r2.f4761
            boolean r3 = r3.mo479(r0)
            if (r3 != 0) goto L7d
            r2.m2040()
            goto L7d
        L6e:
            ᛶᛵᛳᛸ r0 = r2.f4761
            boolean r3 = r3.mo1227(r0)
            if (r3 != 0) goto L7d
            r2.m2040()
            goto L7d
        L7a:
            r2.m2040()
        L7d:
            return
        L7e:
            ᛶᛵᛳᛸ r2 = r2.f2151
            r2.getClass()
            com.kongzue.dialogx.interfaces.AbstractC0008.m249(r3)
            r3 = 3
            r2.f4773 = r3
            ᲀᲇᛸ r3 = r2.f4778
            if (r3 == 0) goto Lab
            boolean r0 = r3 instanceof defpackage.InterfaceC0646
            if (r0 == 0) goto L9f
            ᛴᛴᛲᛵ r3 = (defpackage.InterfaceC0646) r3
            ᛶᛵᛳᛸ r0 = r2.f4761
            boolean r3 = r3.mo479(r0)
            if (r3 != 0) goto Lae
            r2.m2040()
            goto Lae
        L9f:
            ᛶᛵᛳᛸ r0 = r2.f4761
            boolean r3 = r3.mo1227(r0)
            if (r3 != 0) goto Lae
            r2.m2040()
            goto Lae
        Lab:
            r2.m2040()
        Lae:
            return
    }
}
