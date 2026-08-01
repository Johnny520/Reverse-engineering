package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dj1 implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f3188;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.widget.EditText f3189;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAddDialog f3190;

    public /* synthetic */ dj1(android.widget.EditText r2, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAddDialog r3) {
            r1 = this;
            r0 = 1
            r1.f3188 = r0
            r1.<init>()
            r1.f3189 = r2
            r1.f3190 = r3
            return
    }

    public /* synthetic */ dj1(com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAddDialog r2, android.widget.EditText r3) {
            r1 = this;
            r0 = 0
            r1.f3188 = r0
            r1.<init>()
            r1.f3190 = r2
            r1.f3189 = r3
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r2) {
            r1 = this;
            int r0 = r1.f3188
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            android.widget.EditText r0 = r1.f3189
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAddDialog r1 = r1.f3190
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAddDialog.m1440(r0, r1, r2)
            return
        Ld:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAddDialog r0 = r1.f3190
            android.widget.EditText r1 = r1.f3189
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAddDialog.m1448(r1, r0, r2)
            return
    }
}
