package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l90 implements android.content.DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f6497;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.app.Activity f6498;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f6499;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.Object f6500;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ java.lang.Object f6501;

    public /* synthetic */ l90(android.widget.EditText r2, android.widget.EditText r3, android.app.Activity r4, p000.C0276f8 r5) {
            r1 = this;
            r0 = 1
            r1.f6497 = r0
            r1.<init>()
            r1.f6499 = r2
            r1.f6500 = r3
            r1.f6498 = r4
            r1.f6501 = r5
            return
    }

    public /* synthetic */ l90(p000.s90[] r2, p000.um1 r3, android.widget.TextView r4, android.app.Activity r5) {
            r1 = this;
            r0 = 0
            r1.f6497 = r0
            r1.<init>()
            r1.f6499 = r2
            r1.f6500 = r3
            r1.f6501 = r4
            r1.f6498 = r5
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r30, int r31) {
            r29 = this;
            r0 = r29
            int r1 = r0.f6497
            r2 = 0
            java.lang.Object r3 = r0.f6501
            android.app.Activity r4 = r0.f6498
            java.lang.Object r5 = r0.f6500
            java.lang.Object r0 = r0.f6499
            switch(r1) {
                case 0: goto Le5;
                default: goto L10;
            }
        L10:
            android.widget.EditText r0 = (android.widget.EditText) r0
            android.widget.EditText r5 = (android.widget.EditText) r5
            f8 r3 = (p000.C0276f8) r3
            android.text.Editable r0 = r0.getText()
            r1 = 0
            if (r0 == 0) goto L2c
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L2c
            java.lang.CharSequence r0 = p000.q02.m4660(r0)
            java.lang.String r0 = r0.toString()
            goto L2d
        L2c:
            r0 = r1
        L2d:
            java.lang.String r6 = ""
            if (r0 != 0) goto L32
            r0 = r6
        L32:
            android.text.Editable r5 = r5.getText()
            if (r5 == 0) goto L47
            java.lang.String r5 = r5.toString()
            if (r5 == 0) goto L47
            java.lang.CharSequence r5 = p000.q02.m4660(r5)
            java.lang.String r5 = r5.toString()
            goto L48
        L47:
            r5 = r1
        L48:
            if (r5 != 0) goto L4b
            r5 = r6
        L4b:
            java.lang.String r7 = r3.f3793
            java.lang.String r8 = "未知"
            boolean r8 = p000.ln0.m3626(r7, r8)
            if (r8 != 0) goto L56
            goto L57
        L56:
            r7 = r1
        L57:
            java.lang.String r3 = r3.f3803
            r4.getClass()
            java.lang.CharSequence r0 = p000.q02.m4660(r0)
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L68
            r9 = r6
            goto L69
        L68:
            r9 = r0
        L69:
            java.lang.CharSequence r0 = p000.q02.m4660(r5)
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L75
            r10 = r6
            goto L76
        L75:
            r10 = r0
        L76:
            boolean r0 = p000.q02.m4671(r9)
            if (r0 == 0) goto L94
            boolean r0 = p000.q02.m4671(r10)
            if (r0 == 0) goto L94
            java.lang.String r0 = "未识别到作者UID"
            android.widget.Toast r0 = android.widget.Toast.makeText(r4, r0, r2)
            r0.show()
            java.lang.String r0 = "OperationDialog jumpToUserProfile failed: uid/secUid empty"
            r2 = 4
            java.lang.String r3 = "DYHelper"
            p000.C0888ux.m5988(r3, r0, r1, r2, r1)
            goto Le4
        L94:
            com.example.dyhelper.hook.comment.bookmark.BookmarkNativeJump r0 = com.example.dyhelper.hook.comment.bookmark.BookmarkNativeJump.INSTANCE
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r8 = new com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord
            if (r7 == 0) goto La3
            java.lang.CharSequence r5 = p000.q02.m4660(r7)
            java.lang.String r5 = r5.toString()
            goto La4
        La3:
            r5 = r1
        La4:
            if (r5 != 0) goto La8
            r11 = r6
            goto La9
        La8:
            r11 = r5
        La9:
            if (r3 == 0) goto Lb3
            java.lang.CharSequence r1 = p000.q02.m4660(r3)
            java.lang.String r1 = r1.toString()
        Lb3:
            if (r1 != 0) goto Lb7
            r12 = r6
            goto Lb8
        Lb7:
            r12 = r1
        Lb8:
            r27 = 65520(0xfff0, float:9.1813E-41)
            r28 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            boolean r0 = r0.jumpToProfile(r4, r8)
            if (r0 != 0) goto Le4
            java.lang.String r0 = "打开主页失败"
            android.widget.Toast r0 = android.widget.Toast.makeText(r4, r0, r2)
            r0.show()
        Le4:
            return
        Le5:
            s90[] r0 = (p000.s90[]) r0
            um1 r5 = (p000.um1) r5
            android.widget.TextView r3 = (android.widget.TextView) r3
            r1 = r31
            java.lang.Object r0 = p000.AbstractC0312g7.m2253(r1, r0)
            s90 r0 = (p000.s90) r0
            if (r0 != 0) goto Lf6
            goto L11a
        Lf6:
            r5.f10912 = r0
            java.lang.String r1 = r0.f9771
            r3.setText(r1)
            long[] r1 = p000.u90.f10651
            r4.getClass()
            java.lang.String r1 = "geonames_database"
            android.content.SharedPreferences r1 = r4.getSharedPreferences(r1, r2)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r2 = "download_source"
            java.lang.String r0 = r0.f9770
            android.content.SharedPreferences$Editor r0 = r1.putString(r2, r0)
            r0.apply()
            r30.dismiss()
        L11a:
            return
    }
}
