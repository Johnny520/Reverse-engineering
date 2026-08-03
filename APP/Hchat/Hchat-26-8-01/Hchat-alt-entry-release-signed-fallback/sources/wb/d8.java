package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d8 implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f15639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f15640h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15641i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15642j;

    public /* synthetic */ d8(android.content.SharedPreferences r1, java.lang.String r2, java.lang.String r3, int r4) {
            r0 = this;
            r0.f15639g = r4
            r0.f15640h = r1
            r0.f15641i = r2
            r0.f15642j = r3
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r4 = this;
            int r0 = r4.f15639g
            switch(r0) {
                case 0: goto Lc6;
                case 1: goto Lb5;
                case 2: goto La4;
                case 3: goto L93;
                case 4: goto L82;
                case 5: goto L71;
                case 6: goto L56;
                case 7: goto L3b;
                case 8: goto L20;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = r4.f15641i
            r0.getClass()
            java.lang.String r1 = "group_rename_card_desc_"
            java.lang.String r0 = r1.concat(r0)
            android.content.SharedPreferences r1 = r4.f15640h
            java.lang.String r2 = r4.f15642j
            java.lang.String r0 = r1.getString(r0, r2)
            if (r0 == 0) goto L1b
            r2 = r0
        L1b:
            i0.j1 r0 = i0.r.u(r2)
            return r0
        L20:
            java.lang.String r0 = r4.f15641i
            r0.getClass()
            java.lang.String r1 = "group_rename_card_title_"
            java.lang.String r0 = r1.concat(r0)
            android.content.SharedPreferences r1 = r4.f15640h
            java.lang.String r2 = r4.f15642j
            java.lang.String r0 = r1.getString(r0, r2)
            if (r0 == 0) goto L36
            r2 = r0
        L36:
            i0.j1 r0 = i0.r.u(r2)
            return r0
        L3b:
            java.lang.String r0 = r4.f15641i
            r0.getClass()
            java.lang.String r1 = "group_rename_text_"
            java.lang.String r0 = r1.concat(r0)
            android.content.SharedPreferences r1 = r4.f15640h
            java.lang.String r2 = r4.f15642j
            java.lang.String r0 = r1.getString(r0, r2)
            if (r0 == 0) goto L51
            r2 = r0
        L51:
            i0.j1 r0 = i0.r.u(r2)
            return r0
        L56:
            java.lang.String r0 = r4.f15641i
            r0.getClass()
            java.lang.String r1 = "group_rename_both_order_"
            java.lang.String r0 = r1.concat(r0)
            android.content.SharedPreferences r1 = r4.f15640h
            java.lang.String r2 = r4.f15642j
            java.lang.String r0 = r1.getString(r0, r2)
            if (r0 == 0) goto L6c
            r2 = r0
        L6c:
            i0.j1 r0 = i0.r.u(r2)
            return r0
        L71:
            java.lang.String r0 = r4.f15642j
            java.lang.String r1 = "group_member_reply_left_card_desc"
            android.content.SharedPreferences r2 = r4.f15640h
            java.lang.String r3 = r4.f15641i
            java.lang.String r0 = wb.ho.Q5(r2, r1, r3, r0)
            i0.j1 r0 = i0.r.u(r0)
            return r0
        L82:
            java.lang.String r0 = r4.f15642j
            java.lang.String r1 = "group_member_reply_left_card_title"
            android.content.SharedPreferences r2 = r4.f15640h
            java.lang.String r3 = r4.f15641i
            java.lang.String r0 = wb.ho.Q5(r2, r1, r3, r0)
            i0.j1 r0 = i0.r.u(r0)
            return r0
        L93:
            java.lang.String r0 = r4.f15642j
            java.lang.String r1 = "group_member_reply_join_card_desc"
            android.content.SharedPreferences r2 = r4.f15640h
            java.lang.String r3 = r4.f15641i
            java.lang.String r0 = wb.ho.Q5(r2, r1, r3, r0)
            i0.j1 r0 = i0.r.u(r0)
            return r0
        La4:
            java.lang.String r0 = r4.f15642j
            java.lang.String r1 = "group_member_reply_join_card_title"
            android.content.SharedPreferences r2 = r4.f15640h
            java.lang.String r3 = r4.f15641i
            java.lang.String r0 = wb.ho.Q5(r2, r1, r3, r0)
            i0.j1 r0 = i0.r.u(r0)
            return r0
        Lb5:
            java.lang.String r0 = r4.f15642j
            java.lang.String r1 = "group_member_reply_left_text"
            android.content.SharedPreferences r2 = r4.f15640h
            java.lang.String r3 = r4.f15641i
            java.lang.String r0 = wb.ho.Q5(r2, r1, r3, r0)
            i0.j1 r0 = i0.r.u(r0)
            return r0
        Lc6:
            java.lang.String r0 = r4.f15642j
            java.lang.String r1 = "group_member_reply_join_text"
            android.content.SharedPreferences r2 = r4.f15640h
            java.lang.String r3 = r4.f15641i
            java.lang.String r0 = wb.ho.Q5(r2, r1, r3, r0)
            i0.j1 r0 = i0.r.u(r0)
            return r0
    }
}
