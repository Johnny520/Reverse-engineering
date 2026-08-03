package ia;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6626g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f6627h;

    public /* synthetic */ r(android.content.SharedPreferences r2) {
            r1 = this;
            r0 = 2
            r1.f6626g = r0
            r1.<init>()
            r1.f6627h = r2
            return
    }

    public /* synthetic */ r(ia.u r1, android.content.SharedPreferences r2, int r3) {
            r0 = this;
            r0.f6626g = r3
            r0.f6627h = r2
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r3 = this;
            int r0 = r3.f6626g
            switch(r0) {
                case 0: goto L37;
                case 1: goto L18;
                default: goto L5;
            }
        L5:
            android.content.SharedPreferences r0 = r3.f6627h
            java.lang.String r1 = "audio_transform_last_talker"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 != 0) goto L12
            goto L13
        L12:
            r2 = r0
        L13:
            i0.j1 r0 = i0.r.u(r2)
            return r0
        L18:
            android.content.SharedPreferences r0 = r3.f6627h
            java.lang.String r1 = "fake_comment_menu_text"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 != 0) goto L25
            goto L26
        L25:
            r2 = r0
        L26:
            java.lang.CharSequence r0 = og.m.R0(r2)
            java.lang.String r0 = r0.toString()
            int r1 = r0.length()
            if (r1 != 0) goto L36
            java.lang.String r0 = "伪评论[H]"
        L36:
            return r0
        L37:
            android.content.SharedPreferences r0 = r3.f6627h
            java.lang.String r1 = "fake_like_menu_text"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 != 0) goto L44
            goto L45
        L44:
            r2 = r0
        L45:
            java.lang.CharSequence r0 = og.m.R0(r2)
            java.lang.String r0 = r0.toString()
            int r1 = r0.length()
            if (r1 != 0) goto L55
            java.lang.String r0 = "伪集赞[H]"
        L55:
            return r0
    }
}
