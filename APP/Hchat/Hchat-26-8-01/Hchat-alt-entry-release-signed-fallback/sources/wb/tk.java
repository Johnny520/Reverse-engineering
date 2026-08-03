package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tk implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19276g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f19277h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f19278i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19279j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19280k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19281l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19282m;

    public /* synthetic */ tk(android.content.Context r2, android.content.SharedPreferences r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, i0.a1 r7) {
            r1 = this;
            r0 = 1
            r1.f19276g = r0
            r1.<init>()
            r1.f19277h = r2
            r1.f19278i = r3
            r1.f19279j = r4
            r1.f19280k = r5
            r1.f19281l = r6
            r1.f19282m = r7
            return
    }

    public /* synthetic */ tk(android.content.SharedPreferences r2, android.content.Context r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, i0.a1 r7) {
            r1 = this;
            r0 = 0
            r1.f19276g = r0
            r1.<init>()
            r1.f19278i = r2
            r1.f19277h = r3
            r1.f19279j = r4
            r1.f19280k = r5
            r1.f19281l = r6
            r1.f19282m = r7
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r11 = this;
            int r0 = r11.f19276g
            switch(r0) {
                case 0: goto Le8;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = "yyyy-MM-dd HH:mm:ss"
            java.lang.String r1 = ""
            i0.a1 r2 = r11.f19279j
            java.lang.Object r3 = r2.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L2b
            if (r3 != 0) goto L16
            r3 = r1
        L16:
            java.lang.CharSequence r3 = og.m.R0(r3)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L2b
            boolean r5 = og.m.t0(r3)     // Catch: java.lang.Throwable -> L2b
            if (r5 == 0) goto L25
            r3 = r0
        L25:
            java.util.Locale r5 = java.util.Locale.CHINA     // Catch: java.lang.Throwable -> L2b
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> L2b
            goto L31
        L2b:
            r3 = move-exception
            sf.f r4 = new sf.f
            r4.<init>(r3)
        L31:
            boolean r3 = r4 instanceof sf.f
            i0.a1 r4 = r11.f19280k
            java.lang.Object r5 = r4.getValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            android.content.Context r6 = r11.f19277h
            r7 = 0
            if (r5 == 0) goto L51
            if (r3 == 0) goto L51
            java.lang.String r0 = "时间格式无效"
            android.widget.Toast r0 = android.widget.Toast.makeText(r6, r0, r7)
            r0.show()
            goto Le5
        L51:
            i0.a1 r5 = r11.f19281l
            java.lang.Object r8 = r5.getValue()
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L5c
            r8 = r1
        L5c:
            java.lang.CharSequence r8 = og.m.R0(r8)
            java.lang.String r8 = r8.toString()
            boolean r9 = og.m.t0(r8)
            if (r9 == 0) goto L6c
            java.lang.String r8 = "${originalText} | ${time}"
        L6c:
            android.content.SharedPreferences r9 = r11.f19278i
            java.lang.String r10 = "moments_bottom_detail_time_format"
            if (r3 != 0) goto L8d
            java.lang.Object r3 = r2.getValue()
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L7b
            goto L7c
        L7b:
            r1 = r3
        L7c:
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            boolean r3 = og.m.t0(r1)
            if (r3 == 0) goto L8b
            goto La3
        L8b:
            r0 = r1
            goto La3
        L8d:
            java.lang.String r3 = r9.getString(r10, r0)
            if (r3 != 0) goto L94
            goto L95
        L94:
            r1 = r3
        L95:
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            boolean r3 = og.m.t0(r1)
            if (r3 == 0) goto L8b
        La3:
            r5.setValue(r8)
            r2.setValue(r0)
            android.content.SharedPreferences$Editor r1 = r9.edit()
            java.lang.Object r2 = r4.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            java.lang.String r3 = "moments_bottom_detail_enable"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r3, r2)
            java.lang.String r2 = "moments_bottom_detail_text_format"
            android.content.SharedPreferences$Editor r1 = r1.putString(r2, r8)
            android.content.SharedPreferences$Editor r0 = r1.putString(r10, r0)
            i0.a1 r1 = r11.f19282m
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.String r2 = "moments_bottom_detail_hide_group_icon"
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r2, r1)
            r0.apply()
            java.lang.String r0 = "设置已保存"
            android.widget.Toast r0 = android.widget.Toast.makeText(r6, r0, r7)
            r0.show()
        Le5:
            sf.n r0 = sf.n.f12433a
            return r0
        Le8:
            i0.a1 r0 = r11.f19279j
            java.lang.Object r1 = r0.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = ac.p.m(r1)
            int r2 = r1.length()
            java.lang.String r3 = "#FF000000"
            if (r2 != 0) goto Lfd
            r1 = r3
        Lfd:
            i0.a1 r2 = r11.f19280k
            java.lang.Object r4 = r2.getValue()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = ac.p.m(r4)
            int r5 = r4.length()
            if (r5 != 0) goto L110
            r4 = r3
        L110:
            i0.a1 r5 = r11.f19281l
            java.lang.Object r6 = r5.getValue()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = ac.p.m(r6)
            int r7 = r6.length()
            if (r7 != 0) goto L124
            java.lang.String r6 = "#FFFFFFFF"
        L124:
            i0.a1 r7 = r11.f19282m
            java.lang.Object r8 = r7.getValue()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r8 = ac.p.m(r8)
            int r9 = r8.length()
            if (r9 != 0) goto L137
            goto L138
        L137:
            r3 = r8
        L138:
            android.content.SharedPreferences r8 = r11.f19278i
            android.content.SharedPreferences$Editor r8 = r8.edit()
            java.lang.String r9 = "message_text_color_left_light"
            android.content.SharedPreferences$Editor r8 = r8.putString(r9, r1)
            java.lang.String r9 = "message_text_color_right_light"
            android.content.SharedPreferences$Editor r8 = r8.putString(r9, r4)
            java.lang.String r9 = "message_text_color_left_dark"
            android.content.SharedPreferences$Editor r8 = r8.putString(r9, r6)
            java.lang.String r9 = "message_text_color_right_dark"
            android.content.SharedPreferences$Editor r8 = r8.putString(r9, r3)
            r8.apply()
            r0.setValue(r1)
            r2.setValue(r4)
            r5.setValue(r6)
            r7.setValue(r3)
            java.lang.String r0 = "设置已保存"
            r1 = 0
            android.content.Context r2 = r11.f19277h
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)
            r0.show()
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
