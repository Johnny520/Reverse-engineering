package p000;

/* JADX INFO: renamed from: rj */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0763rj implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f9383;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog f9384;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ android.widget.EditText f9385;

    public /* synthetic */ ViewOnClickListenerC0763rj(android.widget.EditText r2, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog r3) {
            r1 = this;
            r0 = 0
            r1.f9383 = r0
            r1.<init>()
            r1.f9385 = r2
            r1.f9384 = r3
            return
    }

    public /* synthetic */ ViewOnClickListenerC0763rj(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog r2, android.widget.EditText r3) {
            r1 = this;
            r0 = 1
            r1.f9383 = r0
            r1.<init>()
            r1.f9384 = r2
            r1.f9385 = r3
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r2) {
            r1 = this;
            int r0 = r1.f9383
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog r0 = r1.f9384
            android.widget.EditText r1 = r1.f9385
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog.m1407(r1, r0, r2)
            return
        Ld:
            android.widget.EditText r0 = r1.f9385
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog r1 = r1.f9384
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog.m1404(r0, r1, r2)
            return
    }
}
