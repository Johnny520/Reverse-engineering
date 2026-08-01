package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kv0 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f6121;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.content.Context f6122;

    public /* synthetic */ kv0(android.content.Context r1, int r2) {
            r0 = this;
            r0.f6121 = r2
            r0.f6122 = r1
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f6121
            r1 = 100
            r2 = 0
            s62 r3 = p000.s62.f9751
            android.content.Context r4 = r4.f6122
            switch(r0) {
                case 0: goto Lc8;
                case 1: goto Lbb;
                case 2: goto La9;
                case 3: goto L87;
                case 4: goto L65;
                case 5: goto L43;
                case 6: goto L31;
                default: goto Lc;
            }
        Lc:
            a80 r5 = (p000.a80) r5
            r5.getClass()
            bv1 r0 = p000.bv1.f1853
            java.lang.String r0 = "voice_replace_mp3_uri"
            p000.ui1.m5876(r0)
            java.lang.String r0 = "voice_replace_mp3_name"
            p000.ui1.m5876(r0)
            java.lang.String r0 = "voice_replace_audio_list"
            p000.ui1.m5876(r0)
            java.lang.String r0 = "未选择"
            r5.invoke(r0)
            java.lang.String r5 = "已清除替换音频"
            android.widget.Toast r4 = android.widget.Toast.makeText(r4, r5, r2)
            r4.show()
            return r3
        L31:
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            bv1 r0 = p000.bv1.f1853
            r0 = 1
            if (r5 >= r0) goto L3d
            r5 = r0
        L3d:
            java.lang.String r0 = "idle_auto_exit_minutes"
            p000.bv1.m1040(r5, r4, r0)
            return r3
        L43:
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            bv1 r0 = p000.bv1.f1853
            int r5 = p000.j81.m2906(r5, r2, r1)
            r4.getClass()
            boolean r0 = p000.i81.m2670(r4)
            if (r0 != 0) goto L5c
            p000.i81.m2648(r4)
            goto L64
        L5c:
            java.lang.String r4 = "clean_top_bar_alpha"
            p000.ui1.m5873(r4, r5)
            p000.bv1.m1036(r4)
        L64:
            return r3
        L65:
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            bv1 r0 = p000.bv1.f1853
            int r5 = p000.j81.m2906(r5, r2, r1)
            r4.getClass()
            boolean r0 = p000.i81.m2670(r4)
            if (r0 != 0) goto L7e
            p000.i81.m2648(r4)
            goto L86
        L7e:
            java.lang.String r4 = "clean_bottom_info_alpha"
            p000.ui1.m5873(r4, r5)
            p000.bv1.m1036(r4)
        L86:
            return r3
        L87:
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            bv1 r0 = p000.bv1.f1853
            int r5 = p000.j81.m2906(r5, r2, r1)
            r4.getClass()
            boolean r0 = p000.i81.m2670(r4)
            if (r0 != 0) goto La0
            p000.i81.m2648(r4)
            goto La8
        La0:
            java.lang.String r4 = "clean_right_panel_alpha"
            p000.ui1.m5873(r4, r5)
            p000.bv1.m1036(r4)
        La8:
            return r3
        La9:
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            bv1 r0 = p000.bv1.f1853
            java.lang.String r0 = "bottom_bar_text_alpha"
            int r5 = p000.j81.m2906(r5, r2, r1)
            p000.bv1.m1040(r5, r4, r0)
            return r3
        Lbb:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            qy0 r0 = p000.qy0.f9157
            r0 = 0
            java.lang.String r4 = p000.qy0.m5011(r4, r5, r0)
            return r4
        Lc8:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r5 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord) r5
            s62 r4 = com.example.dyhelper.hook.comment.bookmark.LongPressBookmarkActions.m1427(r4, r5)
            return r4
    }
}
