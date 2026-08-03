package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a8 implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f14960g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f14961h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f14962i;

    public /* synthetic */ a8(android.content.SharedPreferences r1, java.lang.String r2, int r3) {
            r0 = this;
            r0.f14960g = r3
            r0.f14961h = r1
            r0.f14962i = r2
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r5 = this;
            int r0 = r5.f14960g
            switch(r0) {
                case 0: goto L281;
                case 1: goto L26b;
                case 2: goto L253;
                case 3: goto L23b;
                case 4: goto L222;
                case 5: goto L209;
                case 6: goto L1f0;
                case 7: goto L1d7;
                case 8: goto L1be;
                case 9: goto L1a5;
                case 10: goto L18c;
                case 11: goto L169;
                case 12: goto L150;
                case 13: goto L137;
                case 14: goto L11e;
                case 15: goto L105;
                case 16: goto Lec;
                case 17: goto Ld6;
                case 18: goto Lc6;
                case 19: goto Lb5;
                case 20: goto La4;
                case 21: goto L93;
                case 22: goto L7b;
                case 23: goto L6a;
                case 24: goto L59;
                case 25: goto L48;
                case 26: goto L20;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = r5.f14962i
            r0.getClass()
            java.lang.String r1 = "group_rename_prompt_type_"
            java.lang.String r0 = r1.concat(r0)
            android.content.SharedPreferences r1 = r5.f14961h
            java.lang.String r2 = "global"
            java.lang.String r0 = r1.getString(r0, r2)
            if (r0 == 0) goto L1b
            r2 = r0
        L1b:
            i0.j1 r0 = i0.r.u(r2)
            return r0
        L20:
            java.lang.String r0 = "group_member_reply_both_order"
            java.lang.String r1 = r5.f14962i
            java.lang.String r1 = wb.ho.N5(r0, r1)
            android.content.SharedPreferences r2 = r5.f14961h
            java.lang.String r3 = "text_first"
            java.lang.String r4 = r2.getString(r0, r3)
            if (r4 == 0) goto L33
            goto L34
        L33:
            r4 = r3
        L34:
            java.lang.String r1 = r2.getString(r1, r4)
            if (r1 == 0) goto L3b
            goto L43
        L3b:
            java.lang.String r0 = r2.getString(r0, r3)
            if (r0 == 0) goto L42
            r3 = r0
        L42:
            r1 = r3
        L43:
            i0.j1 r0 = i0.r.u(r1)
            return r0
        L48:
            java.lang.String r0 = "group_member_reply_favorite_delay_ms"
            r1 = 100
            android.content.SharedPreferences r2 = r5.f14961h
            java.lang.String r3 = r5.f14962i
            java.lang.String r0 = wb.ho.O5(r2, r0, r3, r1)
            i0.j1 r0 = i0.r.u(r0)
            return r0
        L59:
            java.lang.String r0 = "group_member_reply_file_delay_ms"
            r1 = 100
            android.content.SharedPreferences r2 = r5.f14961h
            java.lang.String r3 = r5.f14962i
            java.lang.String r0 = wb.ho.O5(r2, r0, r3, r1)
            i0.j1 r0 = i0.r.u(r0)
            return r0
        L6a:
            java.lang.String r0 = "group_member_reply_video_delay_ms"
            r1 = 100
            android.content.SharedPreferences r2 = r5.f14961h
            java.lang.String r3 = r5.f14962i
            java.lang.String r0 = wb.ho.O5(r2, r0, r3, r1)
            i0.j1 r0 = i0.r.u(r0)
            return r0
        L7b:
            java.lang.String r0 = r5.f14962i
            java.lang.String r1 = "group_member_reply_prompt_type"
            java.lang.String r0 = wb.ho.N5(r1, r0)
            android.content.SharedPreferences r1 = r5.f14961h
            java.lang.String r2 = "global"
            java.lang.String r0 = r1.getString(r0, r2)
            if (r0 == 0) goto L8e
            r2 = r0
        L8e:
            i0.j1 r0 = i0.r.u(r2)
            return r0
        L93:
            java.lang.String r0 = "group_member_reply_emoji_delay_ms"
            r1 = 100
            android.content.SharedPreferences r2 = r5.f14961h
            java.lang.String r3 = r5.f14962i
            java.lang.String r0 = wb.ho.O5(r2, r0, r3, r1)
            i0.j1 r0 = i0.r.u(r0)
            return r0
        La4:
            java.lang.String r0 = "group_member_reply_voice_delay_ms"
            r1 = 100
            android.content.SharedPreferences r2 = r5.f14961h
            java.lang.String r3 = r5.f14962i
            java.lang.String r0 = wb.ho.O5(r2, r0, r3, r1)
            i0.j1 r0 = i0.r.u(r0)
            return r0
        Lb5:
            java.lang.String r0 = "group_member_reply_image_delay_ms"
            r1 = 100
            android.content.SharedPreferences r2 = r5.f14961h
            java.lang.String r3 = r5.f14962i
            java.lang.String r0 = wb.ho.O5(r2, r0, r3, r1)
            i0.j1 r0 = i0.r.u(r0)
            return r0
        Lc6:
            java.lang.String r0 = "group_member_reply_prompt_delay_ms"
            r1 = 0
            android.content.SharedPreferences r2 = r5.f14961h
            java.lang.String r3 = r5.f14962i
            java.lang.String r0 = wb.ho.O5(r2, r0, r3, r1)
            i0.j1 r0 = i0.r.u(r0)
            return r0
        Ld6:
            java.lang.String r0 = r5.f14962i
            java.lang.String r0 = wb.ho.L5(r0)
            android.content.SharedPreferences r1 = r5.f14961h
            java.lang.String r2 = "global"
            java.lang.String r0 = r1.getString(r0, r2)
            if (r0 == 0) goto Le7
            r2 = r0
        Le7:
            i0.j1 r0 = i0.r.u(r2)
            return r0
        Lec:
            java.lang.String r0 = r5.f14962i
            java.lang.String r1 = "group_member_reply_left_favorite_paths"
            java.lang.String r0 = wb.ho.N5(r1, r0)
            android.content.SharedPreferences r1 = r5.f14961h
            java.lang.String r2 = ""
            java.lang.String r0 = r1.getString(r0, r2)
            if (r0 != 0) goto Lff
            goto L100
        Lff:
            r2 = r0
        L100:
            i0.j1 r0 = i0.r.u(r2)
            return r0
        L105:
            java.lang.String r0 = r5.f14962i
            java.lang.String r1 = "group_member_reply_join_favorite_paths"
            java.lang.String r0 = wb.ho.N5(r1, r0)
            android.content.SharedPreferences r1 = r5.f14961h
            java.lang.String r2 = ""
            java.lang.String r0 = r1.getString(r0, r2)
            if (r0 != 0) goto L118
            goto L119
        L118:
            r2 = r0
        L119:
            i0.j1 r0 = i0.r.u(r2)
            return r0
        L11e:
            java.lang.String r0 = r5.f14962i
            java.lang.String r1 = "group_member_reply_left_file_paths"
            java.lang.String r0 = wb.ho.N5(r1, r0)
            android.content.SharedPreferences r1 = r5.f14961h
            java.lang.String r2 = ""
            java.lang.String r0 = r1.getString(r0, r2)
            if (r0 != 0) goto L131
            goto L132
        L131:
            r2 = r0
        L132:
            i0.j1 r0 = i0.r.u(r2)
            return r0
        L137:
            java.lang.String r0 = r5.f14962i
            java.lang.String r1 = "group_member_reply_join_file_paths"
            java.lang.String r0 = wb.ho.N5(r1, r0)
            android.content.SharedPreferences r1 = r5.f14961h
            java.lang.String r2 = ""
            java.lang.String r0 = r1.getString(r0, r2)
            if (r0 != 0) goto L14a
            goto L14b
        L14a:
            r2 = r0
        L14b:
            i0.j1 r0 = i0.r.u(r2)
            return r0
        L150:
            java.lang.String r0 = r5.f14962i
            java.lang.String r1 = "group_member_reply_left_video_paths"
            java.lang.String r0 = wb.ho.N5(r1, r0)
            android.content.SharedPreferences r1 = r5.f14961h
            java.lang.String r2 = ""
            java.lang.String r0 = r1.getString(r0, r2)
            if (r0 != 0) goto L163
            goto L164
        L163:
            r2 = r0
        L164:
            i0.j1 r0 = i0.r.u(r2)
            return r0
        L169:
            android.content.SharedPreferences r0 = r5.f14961h
            java.lang.String r1 = "group_member_reply_left_disabled_groups"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 != 0) goto L176
            goto L177
        L176:
            r2 = r0
        L177:
            java.util.Set r0 = wb.ho.y6(r2)
            java.lang.String r1 = r5.f14962i
            boolean r0 = r0.contains(r1)
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            i0.j1 r0 = i0.r.u(r0)
            return r0
        L18c:
            java.lang.String r0 = r5.f14962i
            java.lang.String r1 = "group_member_reply_join_video_paths"
            java.lang.String r0 = wb.ho.N5(r1, r0)
            android.content.SharedPreferences r1 = r5.f14961h
            java.lang.String r2 = ""
            java.lang.String r0 = r1.getString(r0, r2)
            if (r0 != 0) goto L19f
            goto L1a0
        L19f:
            r2 = r0
        L1a0:
            i0.j1 r0 = i0.r.u(r2)
            return r0
        L1a5:
            java.lang.String r0 = r5.f14962i
            java.lang.String r1 = "group_member_reply_left_emoji_paths"
            java.lang.String r0 = wb.ho.N5(r1, r0)
            android.content.SharedPreferences r1 = r5.f14961h
            java.lang.String r2 = ""
            java.lang.String r0 = r1.getString(r0, r2)
            if (r0 != 0) goto L1b8
            goto L1b9
        L1b8:
            r2 = r0
        L1b9:
            i0.j1 r0 = i0.r.u(r2)
            return r0
        L1be:
            java.lang.String r0 = r5.f14962i
            java.lang.String r1 = "group_member_reply_join_emoji_paths"
            java.lang.String r0 = wb.ho.N5(r1, r0)
            android.content.SharedPreferences r1 = r5.f14961h
            java.lang.String r2 = ""
            java.lang.String r0 = r1.getString(r0, r2)
            if (r0 != 0) goto L1d1
            goto L1d2
        L1d1:
            r2 = r0
        L1d2:
            i0.j1 r0 = i0.r.u(r2)
            return r0
        L1d7:
            java.lang.String r0 = r5.f14962i
            java.lang.String r1 = "group_member_reply_left_voice_paths"
            java.lang.String r0 = wb.ho.N5(r1, r0)
            android.content.SharedPreferences r1 = r5.f14961h
            java.lang.String r2 = ""
            java.lang.String r0 = r1.getString(r0, r2)
            if (r0 != 0) goto L1ea
            goto L1eb
        L1ea:
            r2 = r0
        L1eb:
            i0.j1 r0 = i0.r.u(r2)
            return r0
        L1f0:
            java.lang.String r0 = r5.f14962i
            java.lang.String r1 = "group_member_reply_join_voice_paths"
            java.lang.String r0 = wb.ho.N5(r1, r0)
            android.content.SharedPreferences r1 = r5.f14961h
            java.lang.String r2 = ""
            java.lang.String r0 = r1.getString(r0, r2)
            if (r0 != 0) goto L203
            goto L204
        L203:
            r2 = r0
        L204:
            i0.j1 r0 = i0.r.u(r2)
            return r0
        L209:
            java.lang.String r0 = r5.f14962i
            java.lang.String r1 = "group_member_reply_left_image_paths"
            java.lang.String r0 = wb.ho.N5(r1, r0)
            android.content.SharedPreferences r1 = r5.f14961h
            java.lang.String r2 = ""
            java.lang.String r0 = r1.getString(r0, r2)
            if (r0 != 0) goto L21c
            goto L21d
        L21c:
            r2 = r0
        L21d:
            i0.j1 r0 = i0.r.u(r2)
            return r0
        L222:
            java.lang.String r0 = r5.f14962i
            java.lang.String r1 = "group_member_reply_join_image_paths"
            java.lang.String r0 = wb.ho.N5(r1, r0)
            android.content.SharedPreferences r1 = r5.f14961h
            java.lang.String r2 = ""
            java.lang.String r0 = r1.getString(r0, r2)
            if (r0 != 0) goto L235
            goto L236
        L235:
            r2 = r0
        L236:
            i0.j1 r0 = i0.r.u(r2)
            return r0
        L23b:
            android.content.SharedPreferences r0 = r5.f14961h
            java.lang.String r1 = "group_member_reply_media_sequence"
            java.lang.String r2 = "image,voice,emoji,video,file,favorite"
            java.lang.String r3 = r0.getString(r1, r2)
            if (r3 == 0) goto L248
            r2 = r3
        L248:
            java.lang.String r3 = r5.f14962i
            java.lang.String r0 = wb.ho.Q5(r0, r1, r3, r2)
            i0.j1 r0 = i0.r.u(r0)
            return r0
        L253:
            android.content.SharedPreferences r0 = r5.f14961h
            java.lang.String r1 = "group_member_reply_media_order"
            java.lang.String r2 = "none"
            java.lang.String r3 = r0.getString(r1, r2)
            if (r3 == 0) goto L260
            r2 = r3
        L260:
            java.lang.String r3 = r5.f14962i
            java.lang.String r0 = wb.ho.Q5(r0, r1, r3, r2)
            i0.j1 r0 = i0.r.u(r0)
            return r0
        L26b:
            java.lang.String r0 = r5.f14962i
            java.lang.String r0 = wb.ho.P5(r0)
            android.content.SharedPreferences r1 = r5.f14961h
            java.lang.String r2 = "global"
            java.lang.String r0 = r1.getString(r0, r2)
            if (r0 == 0) goto L27c
            r2 = r0
        L27c:
            i0.j1 r0 = i0.r.u(r2)
            return r0
        L281:
            android.content.SharedPreferences r0 = r5.f14961h
            java.lang.String r1 = "group_member_reply_join_disabled_groups"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 != 0) goto L28e
            goto L28f
        L28e:
            r2 = r0
        L28f:
            java.util.Set r0 = wb.ho.y6(r2)
            java.lang.String r1 = r5.f14962i
            boolean r0 = r0.contains(r1)
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            i0.j1 r0 = i0.r.u(r0)
            return r0
    }
}
