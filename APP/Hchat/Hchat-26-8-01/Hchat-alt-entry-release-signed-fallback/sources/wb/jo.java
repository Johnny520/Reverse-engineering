package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jo implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17102g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f17103h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17104i;

    public /* synthetic */ jo(android.content.SharedPreferences r1, i0.a1 r2, int r3) {
            r0 = this;
            r0.f17102g = r3
            r0.f17103h = r1
            r0.f17104i = r2
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f17102g
            switch(r0) {
                case 0: goto L126;
                case 1: goto L11c;
                case 2: goto L112;
                case 3: goto L108;
                case 4: goto Lf3;
                case 5: goto Le9;
                case 6: goto Ld4;
                case 7: goto Lca;
                case 8: goto Lb5;
                case 9: goto Lab;
                case 10: goto L7d;
                case 11: goto L69;
                case 12: goto L17;
                default: goto L5;
            }
        L5:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "comment_self"
        Ld:
            i0.a1 r2 = r4.f17104i
            android.content.SharedPreferences r3 = r4.f17103h
            wb.en.m(r2, r5, r3, r1, r0)
        L14:
            sf.n r5 = sf.n.f12433a
            return r5
        L17:
            java.lang.String r0 = "yyyy-MM-dd HH:mm:ss"
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            i0.a1 r1 = r4.f17104i
            r1.setValue(r5)
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L3c
            java.lang.CharSequence r2 = og.m.R0(r5)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L3c
            boolean r3 = og.m.t0(r2)     // Catch: java.lang.Throwable -> L3c
            if (r3 == 0) goto L34
            r2 = r0
        L34:
            java.util.Locale r3 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L3c
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L3c
            goto L43
        L3c:
            r1 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r1)
            r1 = r2
        L43:
            boolean r1 = r1 instanceof sf.f
            if (r1 != 0) goto L66
            android.content.SharedPreferences r1 = r4.f17103h
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.CharSequence r5 = og.m.R0(r5)
            java.lang.String r5 = r5.toString()
            boolean r2 = og.m.t0(r5)
            if (r2 == 0) goto L5c
            goto L5d
        L5c:
            r0 = r5
        L5d:
            java.lang.String r5 = "comment_time_format"
            android.content.SharedPreferences$Editor r5 = r1.putString(r5, r0)
            r5.apply()
        L66:
            sf.n r5 = sf.n.f12433a
            return r5
        L69:
            java.lang.String r5 = (java.lang.String) r5
            i0.a1 r0 = r4.f17104i
            android.content.SharedPreferences r1 = r4.f17103h
            android.content.SharedPreferences$Editor r0 = wb.en.b(r5, r0, r5, r1)
            java.lang.String r1 = "comment_content"
            android.content.SharedPreferences$Editor r5 = r0.putString(r1, r5)
            r5.apply()
            goto L14
        L7d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            i0.a1 r1 = r4.f17104i
            r1.setValue(r5)
            android.content.SharedPreferences r5 = r4.f17103h
            android.content.SharedPreferences$Editor r5 = r5.edit()
            java.lang.String r1 = "comment_enable"
            android.content.SharedPreferences$Editor r5 = r5.putBoolean(r1, r0)
            if (r0 == 0) goto L9e
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            goto La0
        L9e:
            r0 = 0
        La0:
            java.lang.String r2 = "comment_enabled_at_seconds"
            android.content.SharedPreferences$Editor r5 = r5.putLong(r2, r0)
            r5.apply()
            goto L14
        Lab:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "comment_log_enable"
            goto Ld
        Lb5:
            java.lang.String r5 = (java.lang.String) r5
            i0.a1 r0 = r4.f17104i
            android.content.SharedPreferences r1 = r4.f17103h
            android.content.SharedPreferences$Editor r0 = wb.en.b(r5, r0, r5, r1)
            java.lang.String r1 = "comment_exclude_keywords_video_text"
            android.content.SharedPreferences$Editor r5 = r0.putString(r1, r5)
            r5.apply()
            goto L14
        Lca:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "comment_keyword_video"
            goto Ld
        Ld4:
            java.lang.String r5 = (java.lang.String) r5
            i0.a1 r0 = r4.f17104i
            android.content.SharedPreferences r1 = r4.f17103h
            android.content.SharedPreferences$Editor r0 = wb.en.b(r5, r0, r5, r1)
            java.lang.String r1 = "comment_exclude_keywords_image_text"
            android.content.SharedPreferences$Editor r5 = r0.putString(r1, r5)
            r5.apply()
            goto L14
        Le9:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "comment_keyword_image"
            goto Ld
        Lf3:
            java.lang.String r5 = (java.lang.String) r5
            i0.a1 r0 = r4.f17104i
            android.content.SharedPreferences r1 = r4.f17103h
            android.content.SharedPreferences$Editor r0 = wb.en.b(r5, r0, r5, r1)
            java.lang.String r1 = "comment_exclude_keywords_text"
            android.content.SharedPreferences$Editor r5 = r0.putString(r1, r5)
            r5.apply()
            goto L14
        L108:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "comment_keyword_text"
            goto Ld
        L112:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "comment_allow_video"
            goto Ld
        L11c:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "comment_allow_image"
            goto Ld
        L126:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "comment_allow_text"
            goto Ld
    }
}
