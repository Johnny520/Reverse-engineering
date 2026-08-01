package p000;

/* JADX INFO: renamed from: q */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0706q implements android.widget.AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ p000.C0854u f8766;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.C0743r f8767;

    public C0706q(p000.C0743r r1, p000.C0854u r2) {
            r0 = this;
            r0.<init>()
            r0.f8767 = r1
            r0.f8766 = r2
            return
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            r r1 = r0.f8767
            android.content.DialogInterface$OnClickListener r2 = r1.f9183
            u r0 = r0.f8766
            w r4 = r0.f10521
            r2.onClick(r4, r3)
            boolean r1 = r1.f9184
            if (r1 != 0) goto L14
            w r0 = r0.f10521
            r0.dismiss()
        L14:
            return
    }
}
