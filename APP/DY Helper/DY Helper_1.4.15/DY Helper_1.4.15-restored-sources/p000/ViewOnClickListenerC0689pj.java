package p000;

/* JADX INFO: renamed from: pj */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0689pj implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f8579;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.widget.Spinner f8580;

    public /* synthetic */ ViewOnClickListenerC0689pj(android.widget.Spinner r1, int r2) {
            r0 = this;
            r0.f8579 = r2
            r0.f8580 = r1
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r2) {
            r1 = this;
            int r0 = r1.f8579
            android.widget.Spinner r1 = r1.f8580
            switch(r0) {
                case 0: goto Lb;
                default: goto L7;
            }
        L7:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAddDialog.m1443(r1, r2)
            return
        Lb:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog.m1405(r1, r2)
            return
    }
}
