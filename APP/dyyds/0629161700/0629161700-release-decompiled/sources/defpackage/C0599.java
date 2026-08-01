package defpackage;

/* JADX INFO: renamed from: ᛳᲈᲇᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0599 implements android.widget.AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0033 f2980;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1311 f2981;

    public C0599(defpackage.C0033 r1, defpackage.C1311 r2) {
            r0 = this;
            r0.<init>()
            r0.f2980 = r1
            r0.f2981 = r2
            return
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            ᛱᛲᛴᲇ r1 = r0.f2980
            android.content.DialogInterface$OnClickListener r2 = r1.f521
            ᛷᛷᛳᛶ r0 = r0.f2981
            ᛸᛶᛵᲀ r4 = r0.f5801
            r2.onClick(r4, r3)
            boolean r1 = r1.f522
            if (r1 != 0) goto L14
            ᛸᛶᛵᲀ r0 = r0.f5801
            r0.dismiss()
        L14:
            return
    }
}
