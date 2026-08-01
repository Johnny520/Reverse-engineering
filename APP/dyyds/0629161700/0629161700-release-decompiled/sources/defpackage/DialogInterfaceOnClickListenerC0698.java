package defpackage;

/* JADX INFO: renamed from: ᛴᛶᲁᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0698 implements defpackage.InterfaceC1739, android.content.DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public java.lang.CharSequence f3345;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public defpackage.C0072 f3346;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public defpackage.DialogC1507 f3347;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0616 f3348;

    public DialogInterfaceOnClickListenerC0698(defpackage.C0616 r1) {
            r0 = this;
            r0.<init>()
            r0.f3348 = r1
            return
    }

    @Override // defpackage.InterfaceC1739
    public final void dismiss() {
            r1 = this;
            ᛸᛶᛵᲀ r0 = r1.f3347
            if (r0 == 0) goto La
            r0.dismiss()
            r0 = 0
            r1.f3347 = r0
        La:
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r4, int r5) {
            r3 = this;
            ᛴᛱᲀᛸ r4 = r3.f3348
            r4.setSelection(r5)
            android.widget.AdapterView$OnItemClickListener r0 = r4.getOnItemClickListener()
            if (r0 == 0) goto L15
            ᛱᛴᛴᛲ r0 = r3.f3346
            long r0 = r0.getItemId(r5)
            r2 = 0
            r4.performItemClick(r2, r5, r0)
        L15:
            r3.dismiss()
            return
    }

    @Override // defpackage.InterfaceC1739
    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final void mo1579(int r1) {
            r0 = this;
            java.lang.String r0 = "AppCompatSpinner"
            java.lang.String r1 = "Cannot set horizontal offset for MODE_DIALOG, ignoring"
            android.util.Log.e(r0, r1)
            return
    }

    @Override // defpackage.InterfaceC1739
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final void mo1580(int r5, int r6) {
            r4 = this;
            ᛱᛴᛴᛲ r0 = r4.f3346
            if (r0 != 0) goto L5
            return
        L5:
            ᲇᛶᲀᛸ r0 = new ᲇᛶᲀᛸ
            ᛴᛱᲀᛸ r1 = r4.f3348
            android.content.Context r2 = r1.getPopupContext()
            r0.<init>(r2)
            java.lang.Object r2 = r0.f8900
            ᛱᛲᛴᲇ r2 = (defpackage.C0033) r2
            java.lang.CharSequence r3 = r4.f3345
            if (r3 == 0) goto L1a
            r2.f524 = r3
        L1a:
            ᛱᛴᛴᛲ r3 = r4.f3346
            int r1 = r1.getSelectedItemPosition()
            r2.f530 = r3
            r2.f521 = r4
            r2.f527 = r1
            r1 = 1
            r2.f522 = r1
            ᛸᛶᛵᲀ r0 = r0.m3500()
            r4.f3347 = r0
            ᛷᛷᛳᛶ r0 = r0.f6660
            androidx.appcompat.app.AlertController$RecycleListView r0 = r0.f5790
            defpackage.AbstractC0044.m384(r0, r5)
            defpackage.AbstractC0044.m385(r0, r6)
            ᛸᛶᛵᲀ r4 = r4.f3347
            r4.show()
            return
    }

    @Override // defpackage.InterfaceC1739
    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public final void mo1581(android.widget.ListAdapter r1) {
            r0 = this;
            ᛱᛴᛴᛲ r1 = (defpackage.C0072) r1
            r0.f3346 = r1
            return
    }

    @Override // defpackage.InterfaceC1739
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final void mo1582(android.graphics.drawable.Drawable r1) {
            r0 = this;
            java.lang.String r0 = "AppCompatSpinner"
            java.lang.String r1 = "Cannot set popup background for MODE_DIALOG, ignoring"
            android.util.Log.e(r0, r1)
            return
    }

    @Override // defpackage.InterfaceC1739
    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public final int mo1583() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.InterfaceC1739
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final void mo1584(java.lang.CharSequence r1) {
            r0 = this;
            r0.f3345 = r1
            return
    }

    @Override // defpackage.InterfaceC1739
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final android.graphics.drawable.Drawable mo1585() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.InterfaceC1739
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final boolean mo1586() {
            r0 = this;
            ᛸᛶᛵᲀ r0 = r0.f3347
            if (r0 == 0) goto L9
            boolean r0 = r0.isShowing()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // defpackage.InterfaceC1739
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final void mo1587(int r1) {
            r0 = this;
            java.lang.String r0 = "AppCompatSpinner"
            java.lang.String r1 = "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring"
            android.util.Log.e(r0, r1)
            return
    }

    @Override // defpackage.InterfaceC1739
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public final java.lang.CharSequence mo1588() {
            r0 = this;
            java.lang.CharSequence r0 = r0.f3345
            return r0
    }

    @Override // defpackage.InterfaceC1739
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final int mo1589() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.InterfaceC1739
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final void mo1590(int r1) {
            r0 = this;
            java.lang.String r0 = "AppCompatSpinner"
            java.lang.String r1 = "Cannot set vertical offset for MODE_DIALOG, ignoring"
            android.util.Log.e(r0, r1)
            return
    }
}
