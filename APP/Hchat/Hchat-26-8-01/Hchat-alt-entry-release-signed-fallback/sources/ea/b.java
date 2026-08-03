package ea;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f2481b;

    public b(android.content.Context r1, int r2) {
            r0 = this;
            r0.f2480a = r2
            switch(r2) {
                case 3: goto Ld;
                default: goto L5;
            }
        L5:
            java.util.HashSet r2 = ga.a.f4403e
            r0.f2481b = r1
            r0.<init>()
            return
        Ld:
            java.util.HashSet r2 = ha.h0.f5225e
            r0.f2481b = r1
            r0.<init>()
            return
    }

    public /* synthetic */ b(android.content.Context r1, int r2, boolean r3) {
            r0 = this;
            r0.f2480a = r2
            r0.f2481b = r1
            r0.<init>()
            return
    }

    public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r6) {
            r5 = this;
            int r0 = r5.f2480a
            switch(r0) {
                case 4: goto L9;
                default: goto L5;
            }
        L5:
            super.afterHookedMethod(r6)
            return
        L9:
            r6.getClass()
            java.lang.String r0 = "Hchat_status_text_limit_config"
            android.content.Context r1 = r5.f2481b
            android.content.SharedPreferences r0 = ub.b.c(r1, r0)
            java.lang.String r1 = "status_text_limit_enable"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 != 0) goto L1e
            goto L6e
        L1e:
            java.lang.Object r6 = r6.thisObject
            if (r6 != 0) goto L23
            goto L6e
        L23:
            java.lang.Class r0 = r6.getClass()
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredFields(r0)
            dg.n r0 = tf.m.m1(r0)
            i2.z r1 = new i2.z
            r3 = 19
            r1.<init>(r3)
            ng.i r3 = new ng.i
            r4 = 1
            r3.<init>(r0, r4, r1)
            c9.k1 r0 = new c9.k1
            r1 = 9
            r0.<init>(r6, r1)
            ng.i r1 = new ng.i
            r1.<init>(r3, r4, r0)
            ng.h r0 = new ng.h
            r0.<init>(r1)
        L4d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L67
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            r3 = 2000(0x7d0, float:2.803E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r1 = h.Hchat.utils.KavaReflector.writeField(r1, r6, r3)
            if (r1 == 0) goto L4d
            r2 = r4
            goto L4d
        L67:
            if (r2 != 0) goto L6e
            java.lang.String r6 = "[Hchat:StatusTextLimit] 未找到可修改的状态词长度字段"
            fb.v0.m(r6)
        L6e:
            return
    }

    public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r15) {
            r14 = this;
            int r0 = r14.f2480a
            java.lang.String r1 = ""
            r2 = 1
            r3 = 0
            android.content.Context r4 = r14.f2481b
            r5 = 0
            switch(r0) {
                case 0: goto L20a;
                case 1: goto L1f1;
                case 2: goto L18d;
                case 3: goto L175;
                case 4: goto Lc;
                case 5: goto L10;
                default: goto Lc;
            }
        Lc:
            super.beforeHookedMethod(r15)
            return
        L10:
            r15.getClass()
            java.lang.Object[] r0 = r15.args
            if (r0 == 0) goto L1c
            java.lang.Object r0 = tf.l.C0(r5, r0)
            goto L1d
        L1c:
            r0 = r3
        L1d:
            boolean r6 = r0 instanceof java.lang.CharSequence
            if (r6 == 0) goto L24
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            goto L25
        L24:
            r0 = r3
        L25:
            if (r0 == 0) goto L174
            java.lang.String r6 = r0.toString()
            java.lang.String r7 = "<sysmsg"
            boolean r8 = og.m.h0(r6, r7, r2)
            if (r8 == 0) goto L6d
            java.lang.String r8 = "tmpl_type_profile"
            boolean r8 = og.m.h0(r6, r8, r2)
            if (r8 == 0) goto L6d
            java.lang.String r8 = " 退出了群聊"
            java.lang.CharSequence r9 = og.m.R0(r8)
            java.lang.String r9 = r9.toString()
            boolean r9 = og.m.h0(r6, r9, r5)
            if (r9 != 0) goto L4c
            goto L6d
        L4c:
            java.lang.String r9 = "username"
            java.lang.String r9 = o9.c.h(r6, r9)
            java.lang.String r10 = "nickname"
            java.lang.String r10 = o9.c.h(r6, r10)
            boolean r11 = og.m.t0(r10)
            if (r11 == 0) goto L5f
            r10 = r9
        L5f:
            java.lang.CharSequence r10 = og.m.R0(r10)
            java.lang.String r10 = r10.toString()
            int r11 = r10.length()
            if (r11 != 0) goto L70
        L6d:
            r1 = r3
            goto Ld7
        L70:
            boolean r11 = og.m.t0(r9)
            if (r11 == 0) goto L89
            java.lang.String r9 = r10.concat(r8)
            o9.b r9 = o9.c.e(r9)
            if (r9 == 0) goto L83
            java.lang.String r9 = r9.f9617a
            goto L84
        L83:
            r9 = r3
        L84:
            if (r9 != 0) goto L87
            goto L88
        L87:
            r1 = r9
        L88:
            r9 = r1
        L89:
            java.lang.String r1 = "("
            boolean r11 = og.m.h0(r10, r1, r5)
            java.lang.String r12 = ")"
            if (r11 == 0) goto L9a
            boolean r11 = og.m.h0(r10, r12, r5)
            if (r11 == 0) goto L9a
            goto Ld3
        L9a:
            java.lang.String r11 = "["
            boolean r11 = og.m.h0(r10, r11, r5)
            if (r11 == 0) goto Lc9
            java.lang.String r11 = "]"
            boolean r11 = og.m.h0(r10, r11, r5)
            if (r11 == 0) goto Lc9
            java.lang.String r9 = r10.concat(r8)
            o9.b r9 = o9.c.e(r9)
            if (r9 == 0) goto Ld3
            int r11 = r9.f9618b
            int r11 = r11 - r2
            int r13 = r9.f9619c
            int r13 = r13 + r2
            java.lang.String r9 = r9.f9617a
            java.lang.String r1 = eh.a.n(r1, r9, r12)
            java.lang.StringBuilder r1 = og.m.C0(r10, r11, r13, r1)
            java.lang.String r10 = r1.toString()
            goto Ld3
        Lc9:
            boolean r11 = og.m.t0(r9)
            if (r11 != 0) goto Ld3
            java.lang.String r10 = wb.en.i(r10, r1, r9, r12)
        Ld3:
            java.lang.String r1 = r10.concat(r8)
        Ld7:
            if (r1 != 0) goto Le9
            java.lang.String r8 = "<_wc_custom_link_"
            boolean r8 = og.m.h0(r6, r8, r2)
            if (r8 != 0) goto L16e
            boolean r2 = og.m.h0(r6, r7, r2)
            if (r2 == 0) goto Le9
            goto L16e
        Le9:
            if (r1 == 0) goto Lec
            r6 = r1
        Lec:
            java.lang.String r2 = "退出了群聊"
            r7 = 6
            int r2 = og.m.v0(r7, r6, r2)
            if (r2 > 0) goto Lf7
            r7 = r3
            goto L10a
        Lf7:
            r7 = 40
            r8 = 41
            o9.b r7 = o9.c.a(r6, r2, r7, r8)
            if (r7 == 0) goto L102
            goto L10a
        L102:
            r7 = 91
            r8 = 93
            o9.b r7 = o9.c.a(r6, r2, r7, r8)
        L10a:
            if (r7 == 0) goto L16e
            java.lang.String r2 = "Hchat_group_leave_monitor_config"
            android.content.SharedPreferences r2 = ub.b.c(r4, r2)
            java.lang.String r4 = "group_leave_monitor_enable"
            boolean r4 = r2.getBoolean(r4, r5)
            if (r4 != 0) goto L11b
            goto L16e
        L11b:
            java.lang.String r4 = "group_leave_monitor_wxid_color"
            java.lang.String r6 = "#576B95"
            java.lang.String r2 = r2.getString(r4, r6)
            java.lang.Integer r2 = o9.c.g(r2)
            if (r2 == 0) goto L12e
        L129:
            int r2 = r2.intValue()
            goto L135
        L12e:
            java.lang.Integer r2 = o9.c.g(r6)
            if (r2 == 0) goto L16e
            goto L129
        L135:
            if (r1 == 0) goto L13e
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r1)
            r3 = r0
            goto L144
        L13e:
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>(r0)
            r3 = r1
        L144:
            int r0 = r3.length()
            java.lang.Class<android.text.style.ForegroundColorSpan> r1 = android.text.style.ForegroundColorSpan.class
            java.lang.Object[] r0 = r3.getSpans(r5, r0, r1)
            r0.getClass()
            int r1 = r0.length
            r4 = r5
        L153:
            if (r4 >= r1) goto L15f
            r6 = r0[r4]
            android.text.style.ForegroundColorSpan r6 = (android.text.style.ForegroundColorSpan) r6
            r3.removeSpan(r6)
            int r4 = r4 + 1
            goto L153
        L15f:
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r2)
            int r1 = r7.f9618b
            int r2 = r7.f9619c
            r4 = 16711713(0xff0021, float:2.3418098E-38)
            r3.setSpan(r0, r1, r2, r4)
        L16e:
            if (r3 == 0) goto L174
            java.lang.Object[] r15 = r15.args
            r15[r5] = r3
        L174:
            return
        L175:
            r15.getClass()
            java.util.HashSet r0 = ha.h0.f5225e
            java.lang.String r0 = "Hchat_remove_moments_ads_config"
            android.content.SharedPreferences r0 = ub.b.c(r4, r0)
            java.lang.String r1 = "remove_moments_ads_enable"
            boolean r0 = r0.getBoolean(r1, r5)
            if (r0 != 0) goto L189
            goto L18c
        L189:
            r15.setResult(r3)
        L18c:
            return
        L18d:
            r15.getClass()
            java.util.HashSet r0 = ga.a.f4403e
            java.lang.String r0 = "Hchat_skip_mini_program_video_ads_config"
            android.content.SharedPreferences r0 = ub.b.c(r4, r0)
            java.lang.String r1 = "skip_mini_program_video_ads_enable"
            boolean r0 = r0.getBoolean(r1, r5)
            if (r0 != 0) goto L1a1
            goto L1f0
        L1a1:
            java.lang.Object[] r0 = r15.args
            r0.getClass()
            java.lang.Object r0 = tf.l.C0(r5, r0)
            java.lang.String r1 = "onVideoTimeUpdate"
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L1b3
            goto L1f0
        L1b3:
            java.lang.Object[] r0 = r15.args
            r0.getClass()
            java.lang.Object r0 = tf.l.C0(r2, r0)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L1c3
            java.lang.String r0 = (java.lang.String) r0
            goto L1c4
        L1c3:
            r0 = r3
        L1c4:
            if (r0 == 0) goto L1f0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1cc
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1cc
            goto L1d2
        L1cc:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
        L1d2:
            boolean r0 = r1 instanceof sf.f
            if (r0 == 0) goto L1d7
            goto L1d8
        L1d7:
            r3 = r1
        L1d8:
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            if (r3 == 0) goto L1f0
            java.lang.String r0 = "position"
            r1 = 60
            r3.put(r0, r1)
            java.lang.String r0 = "duration"
            r3.put(r0, r2)
            java.lang.Object[] r15 = r15.args
            java.lang.String r0 = r3.toString()
            r15[r2] = r0
        L1f0:
            return
        L1f1:
            r15.getClass()
            java.util.HashSet r0 = fa.a.f3384f
            java.lang.String r0 = "Hchat_skip_global_mini_program_splash_ads_config"
            android.content.SharedPreferences r0 = ub.b.c(r4, r0)
            java.lang.String r1 = "skip_global_mini_program_splash_ads_enable"
            boolean r0 = r0.getBoolean(r1, r5)
            if (r0 == 0) goto L209
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r15.setResult(r0)
        L209:
            return
        L20a:
            r15.getClass()
            java.lang.String r0 = "Hchat_fake_mini_program_base_lib_config"
            android.content.SharedPreferences r0 = ub.b.c(r4, r0)
            java.lang.String r4 = "fake_mini_program_base_lib_enable"
            boolean r0 = r0.getBoolean(r4, r5)
            if (r0 != 0) goto L21c
            goto L25a
        L21c:
            java.lang.Object[] r15 = r15.args
            r15.getClass()
            java.lang.Object r15 = tf.l.C0(r2, r15)
            boolean r0 = r15 instanceof org.json.JSONObject
            if (r0 == 0) goto L22c
            r3 = r15
            org.json.JSONObject r3 = (org.json.JSONObject) r3
        L22c:
            if (r3 == 0) goto L25a
            java.lang.String r15 = "url"
            java.lang.String r0 = r3.optString(r15)
            r0.getClass()
            java.lang.String r2 = "https://support.weixin.qq.com/update"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L257
            java.lang.String r2 = "https://support.weixin.qq.com/update/"
            boolean r2 = og.t.d0(r0, r2, r5)
            if (r2 != 0) goto L257
            java.lang.String r2 = "https://szsupport.weixin.qq.com/update"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L257
            java.lang.String r2 = "https://szsupport.weixin.qq.com/update/"
            boolean r0 = og.t.d0(r0, r2, r5)
            if (r0 == 0) goto L25a
        L257:
            r3.put(r15, r1)
        L25a:
            return
    }
}
