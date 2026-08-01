package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class oj0 extends p000.m01 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f8118;

    public /* synthetic */ oj0(int r1) {
            r0 = this;
            r0.f8118 = r1
            r0.<init>()
            return
    }

    public /* synthetic */ oj0(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f8118 = r1
            r0.<init>()
            return
    }

    @Override // p000.m01
    public void afterHookedMethod(p000.k01 r23) {
            r22 = this;
            r0 = r22
            r1 = r23
            int r2 = r0.f8118
            r3 = 4
            r4 = -1
            r5 = 1
            r6 = 0
            r7 = 0
            switch(r2) {
                case 1: goto L892;
                case 2: goto L858;
                case 3: goto L839;
                case 4: goto L833;
                case 5: goto L810;
                case 6: goto L7f4;
                case 7: goto L7d7;
                case 8: goto L7ba;
                case 9: goto L782;
                case 10: goto L768;
                case 11: goto L6cb;
                case 12: goto L6a0;
                case 13: goto L3d6;
                case 14: goto L3ae;
                case 15: goto L39b;
                case 16: goto Le;
                case 17: goto L35b;
                case 18: goto L33a;
                case 19: goto L255;
                case 20: goto Lbd;
                case 21: goto L99;
                case 22: goto Le;
                case 23: goto L12;
                default: goto Le;
            }
        Le:
            super.afterHookedMethod(r23)
            return
        L12:
            r1.getClass()
            boolean r0 = p000.jx0.f5633
            if (r0 != 0) goto L1b
            goto L98
        L1b:
            java.lang.Object[] r0 = r1.f5692
            r0.getClass()
            java.lang.Object r0 = p000.AbstractC0312g7.m2253(r6, r0)
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L2b
            r7 = r0
            android.view.View r7 = (android.view.View) r7
        L2b:
            if (r7 != 0) goto L33
            java.lang.String r0 = "[ui] skipped reason=root_missing"
            p000.m41.m3727(r0)
            goto L98
        L33:
            int r1 = p000.jx0.f5634
            java.lang.String r0 = "offline_cache_applied_count"
            android.content.SharedPreferences r2 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L3f
            int r4 = r2.getInt(r0, r4)     // Catch: java.lang.Throwable -> L3f
        L3f:
            java.lang.Integer r0 = p000.xn0.f12232
            if (r4 != r1) goto L4d
            if (r0 == 0) goto L4c
            int r0 = r0.intValue()
            if (r0 == r1) goto L4c
            goto L4d
        L4c:
            r5 = r6
        L4d:
            boolean r0 = p000.n41.m3951(r7, r1, r5)     // Catch: java.lang.Throwable -> L56
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L56
            goto L5d
        L56:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L5d:
            boolean r2 = r0 instanceof p000.eo1
            if (r2 != 0) goto L8b
            r2 = r0
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            java.util.concurrent.atomic.AtomicBoolean r3 = p000.m41.f6932
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "[ui] updated="
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = " count="
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = " pending_rebuild="
            r3.append(r1)
            r3.append(r5)
            java.lang.String r1 = r3.toString()
            p000.m41.m3727(r1)
        L8b:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L98
            java.lang.String r1 = "DYH-OfflineCache"
            java.lang.String r2 = "[ui] hint_failed"
            p000.C0888ux.m5977(r1, r2, r0)
        L98:
            return
        L99:
            r1.getClass()
            java.lang.Object r0 = r1.f5694
            boolean r2 = r0 instanceof java.lang.Integer
            if (r2 == 0) goto La5
            r7 = r0
            java.lang.Integer r7 = (java.lang.Integer) r7
        La5:
            if (r7 == 0) goto Lbc
            int r0 = r7.intValue()
            if (r0 <= 0) goto Laf
            p000.xn0.f12232 = r7
        Laf:
            boolean r0 = p000.jx0.f5633
            if (r0 == 0) goto Lbc
            int r0 = p000.jx0.f5634
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.m3107(r0)
        Lbc:
            return
        Lbd:
            r1.getClass()
            java.util.concurrent.atomic.AtomicReference r0 = p000.f31.f3740
            java.lang.Object r0 = r1.f5694
            if (r0 != 0) goto Lc8
            goto L254
        Lc8:
            java.util.concurrent.atomic.AtomicReference r1 = p000.f31.f3740
            java.lang.String r2 = "DYHelper: [COMMENT-NET] url="
            java.lang.String r3 = "request"
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L252
            java.lang.Object r3 = p000.qe0.m4869(r0, r3, r4)     // Catch: java.lang.Throwable -> L252
            if (r3 != 0) goto Ld8
            goto L254
        Ld8:
            java.lang.String r4 = "url"
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L252
            java.lang.Object r4 = p000.qe0.m4869(r3, r4, r7)     // Catch: java.lang.Throwable -> L252
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L252
            p000.f31.m2016(r3, r4)     // Catch: java.lang.Throwable -> L252
            java.lang.String r3 = "/aweme/v1/feed"
            boolean r3 = p000.q02.m4654(r4, r3, r6)     // Catch: java.lang.Throwable -> L252
            if (r3 != 0) goto Lfa
            java.lang.String r3 = "/aweme/v2/feed"
            boolean r3 = p000.q02.m4654(r4, r3, r6)     // Catch: java.lang.Throwable -> L252
            if (r3 == 0) goto Lf8
            goto Lfa
        Lf8:
            r3 = r6
            goto Lfb
        Lfa:
            r3 = r5
        Lfb:
            java.lang.String r7 = "/aweme/v1/aweme/detail"
            boolean r7 = p000.q02.m4654(r4, r7, r6)     // Catch: java.lang.Throwable -> L252
            java.lang.String r8 = "/aweme/v1/aweme/post/"
            boolean r8 = p000.q02.m4654(r4, r8, r6)     // Catch: java.lang.Throwable -> L252
            if (r8 != 0) goto L114
            java.lang.String r8 = "/aweme/v2/aweme/post/"
            boolean r8 = p000.q02.m4654(r4, r8, r6)     // Catch: java.lang.Throwable -> L252
            if (r8 == 0) goto L112
            goto L114
        L112:
            r8 = r6
            goto L115
        L114:
            r8 = r5
        L115:
            java.lang.String r9 = "/aweme/v1/user/profile/other"
            boolean r9 = p000.q02.m4654(r4, r9, r6)     // Catch: java.lang.Throwable -> L252
            if (r9 != 0) goto L130
            java.lang.String r9 = "/aweme/v1/user/profile/self"
            boolean r9 = p000.q02.m4654(r4, r9, r6)     // Catch: java.lang.Throwable -> L252
            if (r9 != 0) goto L130
            java.lang.String r9 = "/aweme/v1/user/"
            boolean r9 = p000.q02.m4654(r4, r9, r6)     // Catch: java.lang.Throwable -> L252
            if (r9 == 0) goto L12e
            goto L130
        L12e:
            r9 = r6
            goto L131
        L130:
            r9 = r5
        L131:
            java.lang.String r10 = "comment"
            boolean r10 = p000.q02.m4654(r4, r10, r5)     // Catch: java.lang.Throwable -> L252
            if (r10 != 0) goto L151
            java.lang.String r10 = "aweme/detail"
            boolean r10 = p000.q02.m4654(r4, r10, r5)     // Catch: java.lang.Throwable -> L252
            if (r10 != 0) goto L151
            java.lang.String r10 = "aweme/v1/comment"
            boolean r10 = p000.q02.m4654(r4, r10, r5)     // Catch: java.lang.Throwable -> L252
            if (r10 != 0) goto L151
            java.lang.String r10 = "aweme/v2/comment"
            boolean r5 = p000.q02.m4654(r4, r10, r5)     // Catch: java.lang.Throwable -> L252
            if (r5 == 0) goto L158
        L151:
            java.lang.String r2 = r2.concat(r4)     // Catch: java.lang.Throwable -> L252
            p000.C0888ux.m5985(r2)     // Catch: java.lang.Throwable -> L252
        L158:
            if (r3 != 0) goto L162
            if (r7 != 0) goto L162
            if (r8 != 0) goto L162
            if (r9 != 0) goto L162
            goto L254
        L162:
            java.lang.String r0 = p000.f31.m2031(r0)     // Catch: java.lang.Throwable -> L252
            if (r0 != 0) goto L16a
            goto L254
        L16a:
            int r2 = r0.length()     // Catch: java.lang.Throwable -> L252
            r3 = 100
            if (r2 >= r3) goto L174
            goto L254
        L174:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L252
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L252
            if (r9 == 0) goto L181
            p000.f31.m2025(r2)     // Catch: java.lang.Throwable -> L252
            p000.f31.m2015(r2)     // Catch: java.lang.Throwable -> L252
        L181:
            java.lang.String r0 = "aweme_list"
            if (r8 == 0) goto L219
            int r3 = com.example.dyhelper.MainHook.f2222     // Catch: java.lang.Throwable -> L252
            java.lang.String r3 = "cursor"
            r7 = -1
            long r9 = r2.optLong(r3, r7)     // Catch: java.lang.Throwable -> L252
            java.lang.String r3 = "max_cursor"
            long r7 = r2.optLong(r3, r7)     // Catch: java.lang.Throwable -> L252
            r11 = 0
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L1a7
            int r3 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r3 == 0) goto L1a7
            java.lang.String r3 = "max_cursor=0"
            boolean r3 = p000.q02.m4654(r4, r3, r6)     // Catch: java.lang.Throwable -> L252
            if (r3 == 0) goto L1ac
        L1a7:
            java.util.LinkedHashMap r3 = p000.d72.f2936     // Catch: java.lang.Throwable -> L252
            r3.clear()     // Catch: java.lang.Throwable -> L252
        L1ac:
            org.json.JSONArray r3 = r2.optJSONArray(r0)     // Catch: java.lang.Throwable -> L252
            if (r3 == 0) goto L219
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L252
            if (r4 <= 0) goto L219
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L252
            r4.<init>()     // Catch: java.lang.Throwable -> L252
            int r5 = r3.length()     // Catch: java.lang.Throwable -> L252
            r7 = r6
        L1c2:
            if (r7 >= r5) goto L1d7
            org.json.JSONObject r8 = r3.getJSONObject(r7)     // Catch: java.lang.Throwable -> L252
            r8.getClass()     // Catch: java.lang.Throwable -> L252
            f8 r8 = p000.f31.m2030(r8)     // Catch: java.lang.Throwable -> L252
            if (r8 == 0) goto L1d4
            r4.add(r8)     // Catch: java.lang.Throwable -> L252
        L1d4:
            int r7 = r7 + 1
            goto L1c2
        L1d7:
            java.util.LinkedHashMap r3 = p000.d72.f2936     // Catch: java.lang.Throwable -> L252
            java.util.Iterator r3 = r4.iterator()     // Catch: java.lang.Throwable -> L252
        L1dd:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L252
            if (r5 == 0) goto L1f3
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Throwable -> L252
            f8 r5 = (p000.C0276f8) r5     // Catch: java.lang.Throwable -> L252
            java.lang.String r7 = r5.f3800     // Catch: java.lang.Throwable -> L252
            if (r7 == 0) goto L1dd
            java.util.LinkedHashMap r8 = p000.d72.f2936     // Catch: java.lang.Throwable -> L252
            r8.put(r7, r5)     // Catch: java.lang.Throwable -> L252
            goto L1dd
        L1f3:
            int r3 = r4.size()     // Catch: java.lang.Throwable -> L252
            java.util.LinkedHashMap r4 = p000.d72.f2936     // Catch: java.lang.Throwable -> L252
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L252
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L252
            r5.<init>()     // Catch: java.lang.Throwable -> L252
            java.lang.String r7 = "DYHelper: 主页作品 "
            r5.append(r7)     // Catch: java.lang.Throwable -> L252
            r5.append(r3)     // Catch: java.lang.Throwable -> L252
            java.lang.String r3 = " 条，共 "
            r5.append(r3)     // Catch: java.lang.Throwable -> L252
            r5.append(r4)     // Catch: java.lang.Throwable -> L252
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L252
            p000.C0888ux.m5985(r3)     // Catch: java.lang.Throwable -> L252
        L219:
            org.json.JSONArray r0 = r2.optJSONArray(r0)     // Catch: java.lang.Throwable -> L252
            if (r0 == 0) goto L23d
            int r3 = r0.length()     // Catch: java.lang.Throwable -> L252
        L223:
            if (r6 >= r3) goto L23d
            org.json.JSONObject r4 = r0.getJSONObject(r6)     // Catch: java.lang.Throwable -> L252
            r4.getClass()     // Catch: java.lang.Throwable -> L252
            p000.f31.m2019(r4)     // Catch: java.lang.Throwable -> L252
            if (r6 != 0) goto L23a
            f8 r4 = p000.f31.m2030(r4)     // Catch: java.lang.Throwable -> L252
            if (r4 == 0) goto L23a
            r1.set(r4)     // Catch: java.lang.Throwable -> L252
        L23a:
            int r6 = r6 + 1
            goto L223
        L23d:
            java.lang.String r0 = "aweme_detail"
            org.json.JSONObject r0 = r2.optJSONObject(r0)     // Catch: java.lang.Throwable -> L252
            if (r0 == 0) goto L254
            p000.f31.m2019(r0)     // Catch: java.lang.Throwable -> L252
            f8 r0 = p000.f31.m2030(r0)     // Catch: java.lang.Throwable -> L252
            if (r0 == 0) goto L254
            r1.set(r0)     // Catch: java.lang.Throwable -> L252
            goto L254
        L252:
            int r0 = com.example.dyhelper.MainHook.f2222
        L254:
            return
        L255:
            r1.getClass()
            an1 r0 = p000.an1.f334
            boolean r2 = p000.an1.f337
            if (r2 == 0) goto L260
            goto L339
        L260:
            java.lang.Object r1 = r1.f5691
            r1.getClass()
            android.app.Application r1 = (android.app.Application) r1
            java.lang.Class<com.example.dyhelper.MainHook> r2 = com.example.dyhelper.MainHook.class
            java.lang.String r4 = "region_codes.json"
            java.lang.String r5 = "DYHelper"
            r6 = 8192(0x2000, float:1.148E-41)
            java.lang.String r8 = "com.example.dyhelper"
            r9 = 2
            android.content.Context r8 = r1.createPackageContext(r8, r9)     // Catch: java.lang.Throwable -> L2a2
            android.content.res.AssetManager r8 = r8.getAssets()     // Catch: java.lang.Throwable -> L2a2
            java.io.InputStream r8 = r8.open(r4)     // Catch: java.lang.Throwable -> L2a2
            r8.getClass()     // Catch: java.lang.Throwable -> L2a2
            java.nio.charset.Charset r9 = p000.AbstractC0547mf.f7105     // Catch: java.lang.Throwable -> L2a2
            java.io.InputStreamReader r10 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L2a2
            r10.<init>(r8, r9)     // Catch: java.lang.Throwable -> L2a2
            java.io.BufferedReader r8 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L2a2
            r8.<init>(r10, r6)     // Catch: java.lang.Throwable -> L2a2
            java.lang.String r9 = p000.i81.m2672(r8)     // Catch: java.lang.Throwable -> L2a4
            r8.close()     // Catch: java.lang.Throwable -> L2a2
            r0.m187(r9)     // Catch: java.lang.Throwable -> L2a2
            boolean r0 = p000.an1.f337     // Catch: java.lang.Throwable -> L2a2
            if (r0 == 0) goto L2b1
            java.lang.String r0 = "✅ 方案1 createPackageContext 成功"
            p000.C0888ux.m5988(r5, r0, r7, r3, r7)     // Catch: java.lang.Throwable -> L2a2
            goto L339
        L2a2:
            r0 = move-exception
            goto L2ac
        L2a4:
            r0 = move-exception
            r9 = r0
            throw r9     // Catch: java.lang.Throwable -> L2a7
        L2a7:
            r0 = move-exception
            p000.AbstractC0978xb.m6584(r8, r9)     // Catch: java.lang.Throwable -> L2a2
            throw r0     // Catch: java.lang.Throwable -> L2a2
        L2ac:
            java.lang.String r8 = "方案1 失败"
            p000.C0888ux.m5977(r5, r8, r0)
        L2b1:
            java.lang.ClassLoader r0 = r2.getClassLoader()     // Catch: java.lang.Throwable -> L2eb
            if (r0 != 0) goto L2b9
            goto L339
        L2b9:
            java.lang.String r8 = "assets/"
            java.lang.String r4 = r8.concat(r4)     // Catch: java.lang.Throwable -> L2eb
            java.io.InputStream r0 = r0.getResourceAsStream(r4)     // Catch: java.lang.Throwable -> L2eb
            if (r0 != 0) goto L2c7
            r0 = r7
            goto L2da
        L2c7:
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L2eb
            java.nio.charset.Charset r8 = p000.AbstractC0547mf.f7105     // Catch: java.lang.Throwable -> L2eb
            r4.<init>(r0, r8)     // Catch: java.lang.Throwable -> L2eb
            java.io.BufferedReader r8 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L2eb
            r8.<init>(r4, r6)     // Catch: java.lang.Throwable -> L2eb
            java.lang.String r0 = p000.i81.m2672(r8)     // Catch: java.lang.Throwable -> L2f3
            r8.close()     // Catch: java.lang.Throwable -> L2eb
        L2da:
            if (r0 == 0) goto L2ed
            an1 r4 = p000.an1.f334     // Catch: java.lang.Throwable -> L2eb
            r4.m187(r0)     // Catch: java.lang.Throwable -> L2eb
            boolean r0 = p000.an1.f337     // Catch: java.lang.Throwable -> L2eb
            if (r0 == 0) goto L300
            java.lang.String r0 = "✅ 方案2 ClassLoader 成功"
            p000.C0888ux.m5988(r5, r0, r7, r3, r7)     // Catch: java.lang.Throwable -> L2eb
            goto L339
        L2eb:
            r0 = move-exception
            goto L2fb
        L2ed:
            java.lang.String r0 = "方案2 stream 为 null"
            p000.C0888ux.m5988(r5, r0, r7, r3, r7)     // Catch: java.lang.Throwable -> L2eb
            goto L300
        L2f3:
            r0 = move-exception
            r4 = r0
            throw r4     // Catch: java.lang.Throwable -> L2f6
        L2f6:
            r0 = move-exception
            p000.AbstractC0978xb.m6584(r8, r4)     // Catch: java.lang.Throwable -> L2eb
            throw r0     // Catch: java.lang.Throwable -> L2eb
        L2fb:
            java.lang.String r4 = "方案2 失败"
            p000.C0888ux.m5977(r5, r4, r0)
        L300:
            java.security.ProtectionDomain r0 = r2.getProtectionDomain()     // Catch: java.lang.Throwable -> L317
            if (r0 == 0) goto L319
            java.security.CodeSource r0 = r0.getCodeSource()     // Catch: java.lang.Throwable -> L317
            if (r0 == 0) goto L319
            java.net.URL r0 = r0.getLocation()     // Catch: java.lang.Throwable -> L317
            if (r0 == 0) goto L319
            java.lang.String r0 = r0.getPath()     // Catch: java.lang.Throwable -> L317
            goto L31a
        L317:
            r0 = move-exception
            goto L32f
        L319:
            r0 = r7
        L31a:
            if (r0 == 0) goto L334
            java.lang.String r0 = p000.pd2.m4464(r1, r0)     // Catch: java.lang.Throwable -> L317
            an1 r1 = p000.an1.f334     // Catch: java.lang.Throwable -> L317
            r1.m187(r0)     // Catch: java.lang.Throwable -> L317
            boolean r0 = p000.an1.f337     // Catch: java.lang.Throwable -> L317
            if (r0 == 0) goto L334
            java.lang.String r0 = "✅ 方案3 AssetManager 成功"
            p000.C0888ux.m5988(r5, r0, r7, r3, r7)     // Catch: java.lang.Throwable -> L317
            goto L339
        L32f:
            java.lang.String r1 = "方案3 失败"
            p000.C0888ux.m5977(r5, r1, r0)
        L334:
            java.lang.String r0 = "⚠️ 所有方案均失败，区域代码将显示原始数字"
            p000.C0888ux.m5988(r5, r0, r7, r3, r7)
        L339:
            return
        L33a:
            r1.getClass()
            java.lang.Object[] r1 = r1.f5692
            r1.getClass()
            java.lang.Object r1 = p000.AbstractC0312g7.m2250(r1)
            boolean r2 = r1 instanceof android.view.View
            if (r2 == 0) goto L34d
            r7 = r1
            android.view.View r7 = (android.view.View) r7
        L34d:
            if (r7 != 0) goto L350
            goto L35a
        L350:
            jb r1 = new jb
            r2 = 28
            r1.<init>(r2, r7, r0)
            r7.post(r1)
        L35a:
            return
        L35b:
            r1.getClass()
            be0 r0 = p000.be0.f1670
            boolean r0 = r0.m939()
            if (r0 != 0) goto L367
            goto L39a
        L367:
            java.lang.Object r0 = r1.f5694     // Catch: java.lang.Throwable -> L382
            boolean r2 = r0 instanceof java.util.List     // Catch: java.lang.Throwable -> L382
            if (r2 == 0) goto L370
            r7 = r0
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L382
        L370:
            if (r7 != 0) goto L373
            goto L39a
        L373:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L382
            java.util.ArrayList r2 = p000.vd0.m6176(r7)     // Catch: java.lang.Throwable -> L382
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L382
            r1.m3107(r0)     // Catch: java.lang.Throwable -> L382
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L382
            goto L389
        L382:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L389:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L39a
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "session build callback failed: "
            java.lang.String r2 = "r1e0d2867edbb56e0"
            p000.AbstractC0602nx.m4143(r1, r0, r2)
        L39a:
            return
        L39b:
            r1.getClass()
            java.lang.Object r0 = r1.f5691
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L3a7
            r7 = r0
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
        L3a7:
            if (r7 != 0) goto L3aa
            goto L3ad
        L3aa:
            p000.ht0.m2535(r7)
        L3ad:
            return
        L3ae:
            r1.getClass()
            java.lang.Object r0 = r1.f5691
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L3ba
            r7 = r0
            android.app.Activity r7 = (android.app.Activity) r7
        L3ba:
            if (r7 != 0) goto L3bd
            goto L3d5
        L3bd:
            java.lang.Class r0 = r7.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "~793C911F02B4DC5CCCA55B8C6F59F423EC7383D78869998D7000C6ADBCAD99044D3E8549548CF07CFE2D"
            java.lang.String r1 = p000.jf0.m2957(r1)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3d2
            goto L3d5
        L3d2:
            p000.ht0.m2532(r7)
        L3d5:
            return
        L3d6:
            r1.getClass()
            java.lang.Object r1 = r1.f5691
            if (r1 != 0) goto L3df
            goto L69f
        L3df:
            boolean r0 = p000.ui1.m5894()
            if (r0 != 0) goto L3e7
            goto L69f
        L3e7:
            java.lang.String r2 = "color_ring"
            boolean r0 = p000.ui1.m5904(r2)
            if (r0 == 0) goto L69f
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.tq0.f10430
            java.lang.String r0 = "j"
            java.lang.String r8 = "k"
            java.lang.String r9 = "h"
            java.lang.String r10 = "i"
            java.lang.String[] r0 = new java.lang.String[]{r9, r10, r0, r8}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.Iterator r8 = r0.iterator()
        L405:
            boolean r0 = r8.hasNext()
            java.lang.String r9 = "b"
            java.lang.String r11 = "a"
            java.lang.String r12 = "FeedRightControlsHideLegacy"
            java.lang.String r13 = "ColorRing"
            if (r0 == 0) goto L5d2
            java.lang.Object r0 = r8.next()
            r14 = r0
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Class r0 = r1.getClass()
            java.lang.reflect.Field r0 = r0.getDeclaredField(r14)     // Catch: java.lang.Throwable -> L423
            goto L42a
        L423:
            r0 = move-exception
            eo1 r15 = new eo1
            r15.<init>(r0)
            r0 = r15
        L42a:
            boolean r15 = r0 instanceof p000.eo1
            if (r15 == 0) goto L42f
            r0 = r7
        L42f:
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            if (r0 != 0) goto L439
        L433:
            r22 = r2
            r16 = r4
            goto L5c8
        L439:
            r0.setAccessible(r5)     // Catch: java.lang.Throwable -> L449
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L449
            boolean r15 = p000.h62.m2433(r0)     // Catch: java.lang.Throwable -> L449
            if (r15 == 0) goto L44b
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L449
            goto L453
        L449:
            r0 = move-exception
            goto L44d
        L44b:
            r0 = r7
            goto L453
        L44d:
            eo1 r15 = new eo1
            r15.<init>(r0)
            r0 = r15
        L453:
            boolean r15 = r0 instanceof p000.eo1
            if (r15 == 0) goto L458
            r0 = r7
        L458:
            r15 = r0
            java.util.List r15 = (java.util.List) r15
            if (r15 != 0) goto L45e
            goto L433
        L45e:
            r16 = r4
            int r4 = r15.size()
            int r0 = r15.size()
            int r0 = r0 + (-1)
            if (r0 < 0) goto L5a0
            r6 = r0
        L46d:
            int r18 = r6 + (-1)
            java.lang.Object r0 = r15.get(r6)
            java.lang.String r3 = "getFirst"
            if (r0 != 0) goto L47b
            r22 = r2
            r0 = r7
            goto L4d8
        L47b:
            java.lang.Class r19 = r0.getClass()     // Catch: java.lang.Throwable -> L4b7
            java.lang.reflect.Method[] r7 = r19.getMethods()     // Catch: java.lang.Throwable -> L4b7
            r7.getClass()     // Catch: java.lang.Throwable -> L4b7
            int r5 = r7.length     // Catch: java.lang.Throwable -> L4b7
            r22 = r2
            r2 = 0
        L48a:
            if (r2 >= r5) goto L4aa
            r21 = r7[r2]     // Catch: java.lang.Throwable -> L4b9
            r23 = r2
            java.lang.String r2 = r21.getName()     // Catch: java.lang.Throwable -> L4b9
            boolean r2 = p000.ln0.m3626(r2, r3)     // Catch: java.lang.Throwable -> L4b9
            if (r2 == 0) goto L4a7
            java.lang.Class[] r2 = r21.getParameterTypes()     // Catch: java.lang.Throwable -> L4b9
            r2.getClass()     // Catch: java.lang.Throwable -> L4b9
            int r2 = r2.length     // Catch: java.lang.Throwable -> L4b9
            if (r2 != 0) goto L4a7
            r2 = r21
            goto L4ab
        L4a7:
            int r2 = r23 + 1
            goto L48a
        L4aa:
            r2 = 0
        L4ab:
            if (r2 == 0) goto L4b9
            r5 = 1
            r2.setAccessible(r5)     // Catch: java.lang.Throwable -> L4b9
            r5 = 0
            java.lang.Object r0 = r2.invoke(r0, r5)     // Catch: java.lang.Throwable -> L4b9
            goto L4d8
        L4b7:
            r22 = r2
        L4b9:
            java.lang.String r2 = "first"
            java.lang.Object r0 = p000.qe0.m4879(r0, r2)     // Catch: java.lang.Throwable -> L4c0
            goto L4d8
        L4c0:
            java.lang.Object r0 = p000.qe0.m4879(r0, r11)     // Catch: java.lang.Throwable -> L4c5
            goto L4d8
        L4c5:
            java.lang.Class<l91> r2 = p000.l91.class
            boolean r5 = r2.isInstance(r0)     // Catch: java.lang.Throwable -> L4d7
            if (r5 == 0) goto L4d7
            r5 = 0
            java.lang.reflect.Method r2 = r2.getMethod(r3, r5)     // Catch: java.lang.Throwable -> L4d7
            java.lang.Object r0 = r2.invoke(r0, r5)     // Catch: java.lang.Throwable -> L4d7
            goto L4d8
        L4d7:
            r0 = 0
        L4d8:
            if (r0 == 0) goto L4df
            java.lang.String r0 = r0.toString()
            goto L4e0
        L4df:
            r0 = 0
        L4e0:
            boolean r0 = p000.ln0.m3626(r0, r13)
            if (r0 == 0) goto L594
            r15.remove(r6)
            boolean r0 = p000.ln0.m3626(r14, r10)
            if (r0 == 0) goto L594
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.tq0.f10430
            java.lang.Class r0 = r1.getClass()
            java.lang.reflect.Field r0 = p000.tq0.m5729(r0, r11)
            if (r0 != 0) goto L4fd
            goto L594
        L4fd:
            java.lang.Class r2 = r1.getClass()
            java.lang.reflect.Field r2 = p000.tq0.m5729(r2, r9)
            r5 = 1
            r0.setAccessible(r5)     // Catch: java.lang.Throwable -> L516
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L516
            boolean r3 = p000.h62.m2433(r0)     // Catch: java.lang.Throwable -> L516
            if (r3 == 0) goto L518
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L516
            goto L520
        L516:
            r0 = move-exception
            goto L51a
        L518:
            r0 = 0
            goto L520
        L51a:
            eo1 r3 = new eo1
            r3.<init>(r0)
            r0 = r3
        L520:
            boolean r3 = r0 instanceof p000.eo1
            if (r3 == 0) goto L525
            r0 = 0
        L525:
            r3 = r0
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L52c
            goto L594
        L52c:
            if (r2 == 0) goto L535
            r5 = 1
            r2.setAccessible(r5)     // Catch: java.lang.Throwable -> L533
            goto L535
        L533:
            r0 = move-exception
            goto L548
        L535:
            if (r2 == 0) goto L53c
            java.lang.Object r0 = r2.get(r1)     // Catch: java.lang.Throwable -> L533
            goto L53d
        L53c:
            r0 = 0
        L53d:
            boolean r2 = p000.h62.m2433(r0)     // Catch: java.lang.Throwable -> L533
            if (r2 == 0) goto L546
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L533
            goto L54e
        L546:
            r0 = 0
            goto L54e
        L548:
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L54e:
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto L553
            r0 = 0
        L553:
            java.util.List r0 = (java.util.List) r0
            if (r6 < 0) goto L594
            int r2 = r3.size()
            if (r6 < r2) goto L55e
            goto L594
        L55e:
            java.lang.Object r2 = r3.remove(r6)
            if (r0 == 0) goto L56d
            int r3 = r0.size()
            if (r6 >= r3) goto L56d
            r0.remove(r6)
        L56d:
            if (r2 == 0) goto L578
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            goto L579
        L578:
            r0 = 0
        L579:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "已同步移除头像 Presenter index="
            r2.<init>(r3)
            r2.append(r6)
            java.lang.String r3 = " presenter="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r2 = 4
            r5 = 0
            p000.C0888ux.m5988(r12, r0, r5, r2, r5)
        L594:
            if (r18 >= 0) goto L597
            goto L5a2
        L597:
            r2 = r22
            r6 = r18
            r3 = 4
            r5 = 1
            r7 = 0
            goto L46d
        L5a0:
            r22 = r2
        L5a2:
            int r0 = r15.size()
            if (r4 == r0) goto L5c8
            int r0 = r15.size()
            int r4 = r4 - r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "已移除头像扩展 ColorRing, field="
            r0.<init>(r2)
            r0.append(r14)
            java.lang.String r2 = ", removed="
            r0.append(r2)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r2 = 4
            r5 = 0
            p000.C0888ux.m5988(r12, r0, r5, r2, r5)
        L5c8:
            r2 = r22
            r4 = r16
            r3 = 4
            r5 = 1
            r6 = 0
            r7 = 0
            goto L405
        L5d2:
            r22 = r2
            r16 = r4
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.tq0.f10430
            java.lang.Class r0 = r1.getClass()
            java.lang.reflect.Field r0 = p000.tq0.m5729(r0, r11)
            if (r0 != 0) goto L5e4
            goto L69f
        L5e4:
            java.lang.Class r2 = r1.getClass()
            java.lang.reflect.Field r2 = p000.tq0.m5729(r2, r9)
            r5 = 1
            r0.setAccessible(r5)     // Catch: java.lang.Throwable -> L5fd
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L5fd
            boolean r3 = p000.h62.m2433(r0)     // Catch: java.lang.Throwable -> L5fd
            if (r3 == 0) goto L5ff
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L5fd
            goto L607
        L5fd:
            r0 = move-exception
            goto L601
        L5ff:
            r0 = 0
            goto L607
        L601:
            eo1 r3 = new eo1
            r3.<init>(r0)
            r0 = r3
        L607:
            boolean r3 = r0 instanceof p000.eo1
            if (r3 == 0) goto L60c
            r0 = 0
        L60c:
            r3 = r0
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L613
            goto L69f
        L613:
            if (r2 == 0) goto L61c
            r5 = 1
            r2.setAccessible(r5)     // Catch: java.lang.Throwable -> L61a
            goto L61c
        L61a:
            r0 = move-exception
            goto L62f
        L61c:
            if (r2 == 0) goto L623
            java.lang.Object r0 = r2.get(r1)     // Catch: java.lang.Throwable -> L61a
            goto L624
        L623:
            r0 = 0
        L624:
            boolean r1 = p000.h62.m2433(r0)     // Catch: java.lang.Throwable -> L61a
            if (r1 == 0) goto L62d
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L61a
            goto L635
        L62d:
            r0 = 0
            goto L635
        L62f:
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L635:
            boolean r1 = r0 instanceof p000.eo1
            if (r1 == 0) goto L63a
            r0 = 0
        L63a:
            java.util.List r0 = (java.util.List) r0
            int r1 = r3.size()
            int r2 = r3.size()
            int r2 = r2 + (-1)
            if (r2 < 0) goto L689
        L648:
            int r4 = r2 + (-1)
            java.lang.Object r5 = r3.get(r2)
            if (r5 != 0) goto L651
            goto L684
        L651:
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            boolean r6 = p000.ui1.m5904(r22)
            if (r6 == 0) goto L684
            r6 = 1
            boolean r7 = p000.q02.m4654(r5, r13, r6)
            if (r7 != 0) goto L676
            java.lang.String r7 = "Story"
            boolean r7 = p000.q02.m4654(r5, r7, r6)
            if (r7 != 0) goto L676
            java.lang.String r7 = "AvatarRing"
            boolean r5 = p000.q02.m4654(r5, r7, r6)
            if (r5 == 0) goto L684
        L676:
            r3.remove(r2)
            if (r0 == 0) goto L684
            int r5 = r0.size()
            if (r2 >= r5) goto L684
            r0.remove(r2)
        L684:
            if (r4 >= 0) goto L687
            goto L689
        L687:
            r2 = r4
            goto L648
        L689:
            int r0 = r3.size()
            if (r1 == r0) goto L69f
            int r0 = r3.size()
            int r1 = r1 - r0
            java.lang.String r0 = "已移除头像已注册 Presenter removed="
            java.lang.String r0 = p000.a12.m17(r0, r1)
            r2 = 4
            r5 = 0
            p000.C0888ux.m5988(r12, r0, r5, r2, r5)
        L69f:
            return
        L6a0:
            r1.getClass()
            java.lang.Object r0 = r1.f5694
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L6ad
            r7 = r0
            android.view.View r7 = (android.view.View) r7
            goto L6ae
        L6ad:
            r7 = 0
        L6ae:
            if (r7 != 0) goto L6b1
            goto L6ca
        L6b1:
            p000.cp0.m1602(r7)
            jb r0 = new jb
            r1 = 25
            r0.<init>(r7, r1)
            r7.post(r0)
            jb r0 = new jb
            r1 = 26
            r0.<init>(r7, r1)
            r1 = 120(0x78, double:5.93E-322)
            r7.postDelayed(r0, r1)
        L6ca:
            return
        L6cb:
            r1.getClass()
            java.lang.Object r0 = r1.f5691
            r0.getClass()
            android.app.Dialog r0 = (android.app.Dialog) r0
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getName()
            android.os.Handler r2 = p000.in0.f5135
            java.lang.String r2 = "SharePanel"
            r5 = 1
            boolean r2 = p000.q02.m4654(r1, r2, r5)
            if (r2 != 0) goto L6ea
            goto L767
        L6ea:
            p000.in0.m2770()
            boolean r2 = p000.in0.f5136
            if (r2 != 0) goto L6f3
            goto L767
        L6f3:
            java.lang.String r2 = "DYHelper: 分享面板打开: "
            java.lang.String r1 = r2.concat(r1)
            p000.C0888ux.m5985(r1)
            boolean r1 = r0.isShowing()
            if (r1 != 0) goto L703
            goto L767
        L703:
            boolean r1 = p000.in0.m2775(r0)
            if (r1 == 0) goto L70f
            java.lang.String r0 = "DYHelper: 分享面板已同步注入快捷操作"
            p000.C0888ux.m5985(r0)
            goto L767
        L70f:
            android.view.Window r1 = r0.getWindow()
            if (r1 == 0) goto L71a
            android.view.View r5 = r1.getDecorView()
            goto L71b
        L71a:
            r5 = 0
        L71b:
            if (r5 != 0) goto L722
            r1 = 0
            p000.in0.m2771(r0, r1)
            goto L767
        L722:
            r1 = 0
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r2.<init>(r1)
            um1 r3 = new um1
            r3.<init>()
            xb0 r4 = new xb0
            r4.<init>(r2, r5, r3, r0)
            dn0 r2 = new dn0
            r2.<init>(r1, r4)
            r3.f10912 = r2
            android.view.ViewTreeObserver r1 = r5.getViewTreeObserver()
            boolean r2 = r1.isAlive()
            if (r2 == 0) goto L763
            java.lang.Object r0 = r3.f10912
            if (r0 == 0) goto L75b
            android.view.ViewTreeObserver$OnPreDrawListener r0 = (android.view.ViewTreeObserver.OnPreDrawListener) r0
            r1.addOnPreDrawListener(r0)
            android.os.Handler r0 = p000.in0.f5135
            ν r1 = new ν
            r2 = 21
            r1.<init>(r2, r4)
            r2 = 32
            r0.postDelayed(r1, r2)
            goto L767
        L75b:
            java.lang.String r0 = "firstFrameListener"
            p000.ln0.m3650(r0)
            r20 = 0
            throw r20
        L763:
            r1 = 0
            p000.in0.m2771(r0, r1)
        L767:
            return
        L768:
            r20 = r7
            r1.getClass()
            java.lang.Object r0 = r1.f5691
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L777
            r7 = r0
            android.app.Activity r7 = (android.app.Activity) r7
            goto L779
        L777:
            r7 = r20
        L779:
            if (r7 != 0) goto L77c
            goto L781
        L77c:
            java.util.Set r0 = p000.il0.f5109
            r0.remove(r7)
        L781:
            return
        L782:
            r20 = r7
            r1.getClass()
            java.lang.Object[] r0 = r1.f5692
            r17 = 0
            r0 = r0[r17]
            boolean r2 = r0 instanceof java.lang.Boolean
            if (r2 == 0) goto L795
            r5 = r0
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            goto L797
        L795:
            r5 = r20
        L797:
            if (r5 == 0) goto L79e
            boolean r6 = r5.booleanValue()
            goto L79f
        L79e:
            r6 = 0
        L79f:
            if (r6 != 0) goto L7a2
            goto L7b9
        L7a2:
            java.lang.Object r0 = r1.f5691
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L7ac
            r7 = r0
            android.app.Activity r7 = (android.app.Activity) r7
            goto L7ae
        L7ac:
            r7 = r20
        L7ae:
            if (r7 != 0) goto L7b1
            goto L7b9
        L7b1:
            java.util.Set r0 = p000.il0.f5109
            r0.add(r7)
            p000.il0.m2760(r7)
        L7b9:
            return
        L7ba:
            r20 = r7
            r1.getClass()
            java.lang.Object r0 = r1.f5691
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L7c9
            r7 = r0
            android.app.Activity r7 = (android.app.Activity) r7
            goto L7cb
        L7c9:
            r7 = r20
        L7cb:
            if (r7 != 0) goto L7ce
            goto L7d6
        L7ce:
            java.util.Set r0 = p000.il0.f5109
            r0.add(r7)
            p000.il0.m2760(r7)
        L7d6:
            return
        L7d7:
            r20 = r7
            r1.getClass()
            java.lang.Object r0 = r1.f5691
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L7e6
            r7 = r0
            android.app.Activity r7 = (android.app.Activity) r7
            goto L7e8
        L7e6:
            r7 = r20
        L7e8:
            if (r7 != 0) goto L7eb
            goto L7f3
        L7eb:
            java.util.Set r0 = p000.il0.f5109
            r0.add(r7)
            p000.il0.m2760(r7)
        L7f3:
            return
        L7f4:
            r20 = r7
            r1.getClass()
            java.lang.Object[] r0 = r1.f5692
            r17 = 0
            r0 = r0[r17]
            boolean r1 = r0 instanceof android.graphics.Bitmap
            if (r1 == 0) goto L807
            r7 = r0
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            goto L809
        L807:
            r7 = r20
        L809:
            if (r7 != 0) goto L80c
            goto L80f
        L80c:
            p000.xk0.m6678(r7)
        L80f:
            return
        L810:
            r20 = r7
            r1.getClass()
            java.lang.Object r0 = r1.f5691
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L81f
            r7 = r0
            android.view.View r7 = (android.view.View) r7
            goto L821
        L81f:
            r7 = r20
        L821:
            if (r7 != 0) goto L824
            goto L832
        L824:
            java.util.concurrent.CopyOnWriteArrayList r0 = p000.xk0.f12197
            wk0 r1 = new wk0
            r2 = 0
            r1.<init>(r7, r2)
            p000.AbstractC0984xh.m6653(r0, r1)
            r0.isEmpty()
        L832:
            return
        L833:
            r1.getClass()
            java.util.concurrent.CopyOnWriteArrayList r0 = p000.xk0.f12197
            return
        L839:
            r20 = r7
            r1.getClass()
            java.lang.Object r0 = r1.f5691
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L848
            r7 = r0
            android.view.View r7 = (android.view.View) r7
            goto L84a
        L848:
            r7 = r20
        L84a:
            if (r7 != 0) goto L84d
            goto L857
        L84d:
            java.util.concurrent.CopyOnWriteArrayList r0 = p000.xk0.f12197
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r7)
            r0.add(r1)
        L857:
            return
        L858:
            r20 = r7
            r1.getClass()
            java.lang.Object r0 = r1.f5691
            if (r0 != 0) goto L862
            goto L891
        L862:
            zj0 r1 = p000.zj0.f13118
            boolean r1 = p000.zj0.m7151(r0)
            if (r1 != 0) goto L86b
            goto L891
        L86b:
            java.lang.ref.WeakReference r1 = p000.zj0.f13119
            if (r1 == 0) goto L874
            java.lang.Object r7 = r1.get()
            goto L876
        L874:
            r7 = r20
        L876:
            if (r7 != r0) goto L879
            goto L891
        L879:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            p000.zj0.f13119 = r1
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "DYHelperIMMarkAllReadHelper: 捕获消息底栏 Helper 实例: constructor -> "
            java.lang.String r0 = r1.concat(r0)
            p000.C0888ux.m5985(r0)
        L891:
            return
        L892:
            r1.getClass()
            java.lang.Object r0 = r1.f5691
            if (r0 != 0) goto L89a
            goto L89f
        L89a:
            java.lang.String r1 = "constructor"
            p000.zj0.m7142(r0, r1)
        L89f:
            return
    }

    @Override // p000.m01
    public void beforeHookedMethod(p000.k01 r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            int r2 = r0.f8118
            r3 = 4
            r4 = 1
            r5 = 0
            switch(r2) {
                case 0: goto L2e9;
                case 16: goto L193;
                case 22: goto L168;
                case 24: goto L113;
                case 25: goto Lee;
                case 26: goto Lba;
                case 27: goto L6f;
                case 28: goto L35;
                case 29: goto L10;
                default: goto Lc;
            }
        Lc:
            super.beforeHookedMethod(r20)
            return
        L10:
            r1.getClass()
            java.util.Set r0 = p000.bd1.f1661     // Catch: java.lang.Throwable -> L20
            java.lang.Object[] r0 = r1.f5692     // Catch: java.lang.Throwable -> L20
            r0.getClass()     // Catch: java.lang.Throwable -> L20
            p000.bd1.m911(r0)     // Catch: java.lang.Throwable -> L20
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L20
            goto L27
        L20:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L27:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L34
            java.lang.String r1 = "rc2954fec18baf260"
            java.lang.String r2 = "观察营地响应失败"
            p000.C0888ux.m5977(r1, r2, r0)
        L34:
            return
        L35:
            r1.getClass()
            java.util.Set r0 = p000.bd1.f1661     // Catch: java.lang.Throwable -> L5a
            ym1 r0 = p000.he1.f4708     // Catch: java.lang.Throwable -> L5a
            java.lang.Object[] r0 = r1.f5692     // Catch: java.lang.Throwable -> L5a
            r0.getClass()     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r0 = p000.AbstractC0312g7.m2253(r5, r0)     // Catch: java.lang.Throwable -> L5a
            boolean r1 = r0 instanceof java.util.Map     // Catch: java.lang.Throwable -> L5a
            if (r1 == 0) goto L4d
            r6 = r0
            java.util.Map r6 = (java.util.Map) r6     // Catch: java.lang.Throwable -> L5a
            goto L4e
        L4d:
            r6 = 0
        L4e:
            ee1 r0 = p000.he1.m2498(r6)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r1 = "common_params"
            p000.bd1.m914(r0, r1)     // Catch: java.lang.Throwable -> L5a
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L5a
            goto L61
        L5a:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L61:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L6e
            java.lang.String r1 = "rc2954fec18baf260"
            java.lang.String r2 = "观察世界公共参数失败"
            p000.C0888ux.m5977(r1, r2, r0)
        L6e:
            return
        L6f:
            r1.getClass()
            java.lang.Object[] r0 = r1.f5692
            java.util.Set r2 = p000.bd1.f1661     // Catch: java.lang.Throwable -> La5
            java.lang.Object r1 = r1.f5691     // Catch: java.lang.Throwable -> La5
            r0.getClass()     // Catch: java.lang.Throwable -> La5
            java.lang.Object r2 = p000.AbstractC0312g7.m2253(r5, r0)     // Catch: java.lang.Throwable -> La5
            boolean r3 = r2 instanceof java.lang.Number     // Catch: java.lang.Throwable -> La5
            if (r3 == 0) goto L86
            java.lang.Number r2 = (java.lang.Number) r2     // Catch: java.lang.Throwable -> La5
            goto L87
        L86:
            r2 = 0
        L87:
            if (r2 == 0) goto L92
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> La5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> La5
            goto L93
        L92:
            r2 = 0
        L93:
            java.lang.Object r0 = p000.AbstractC0312g7.m2253(r4, r0)     // Catch: java.lang.Throwable -> La5
            if (r0 == 0) goto L9e
            java.lang.String r6 = r0.toString()     // Catch: java.lang.Throwable -> La5
            goto L9f
        L9e:
            r6 = 0
        L9f:
            p000.bd1.m909(r1, r2, r6)     // Catch: java.lang.Throwable -> La5
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> La5
            goto Lac
        La5:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        Lac:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto Lb9
            java.lang.String r1 = "rc2954fec18baf260"
            java.lang.String r2 = "观察营地桥接失败回调失败"
            p000.C0888ux.m5977(r1, r2, r0)
        Lb9:
            return
        Lba:
            r1.getClass()
            java.util.Set r0 = p000.bd1.f1661     // Catch: java.lang.Throwable -> Ld9
            java.lang.Object r0 = r1.f5691     // Catch: java.lang.Throwable -> Ld9
            java.lang.Object[] r1 = r1.f5692     // Catch: java.lang.Throwable -> Ld9
            r1.getClass()     // Catch: java.lang.Throwable -> Ld9
            java.lang.Object r1 = p000.AbstractC0312g7.m2253(r5, r1)     // Catch: java.lang.Throwable -> Ld9
            boolean r2 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Throwable -> Ld9
            if (r2 == 0) goto Ld2
            r6 = r1
            org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch: java.lang.Throwable -> Ld9
            goto Ld3
        Ld2:
            r6 = 0
        Ld3:
            p000.bd1.m910(r0, r6)     // Catch: java.lang.Throwable -> Ld9
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> Ld9
            goto Le0
        Ld9:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        Le0:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto Led
            java.lang.String r1 = "rc2954fec18baf260"
            java.lang.String r2 = "观察营地桥接成功回调失败"
            p000.C0888ux.m5977(r1, r2, r0)
        Led:
            return
        Lee:
            r1.getClass()
            java.util.Set r0 = p000.bd1.f1661     // Catch: java.lang.Throwable -> Lfe
            java.lang.Object[] r0 = r1.f5692     // Catch: java.lang.Throwable -> Lfe
            r0.getClass()     // Catch: java.lang.Throwable -> Lfe
            p000.bd1.m908(r0)     // Catch: java.lang.Throwable -> Lfe
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> Lfe
            goto L105
        Lfe:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L105:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L112
            java.lang.String r1 = "rc2954fec18baf260"
            java.lang.String r2 = "观察营地请求失败"
            p000.C0888ux.m5977(r1, r2, r0)
        L112:
            return
        L113:
            r1.getClass()
            boolean r0 = p000.jx0.f5633
            if (r0 != 0) goto L11b
            goto L167
        L11b:
            int r0 = p000.jx0.f5634
            java.util.Set r2 = p000.n41.f7384
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L12a
            goto L167
        L12a:
            java.lang.Object[] r2 = r1.f5692
            r2.getClass()
            java.lang.Object r2 = p000.AbstractC0312g7.m2253(r5, r2)
            boolean r3 = r2 instanceof java.lang.Integer
            if (r3 == 0) goto L13b
            r6 = r2
            java.lang.Integer r6 = (java.lang.Integer) r6
            goto L13c
        L13b:
            r6 = 0
        L13c:
            if (r6 == 0) goto L167
            int r2 = r6.intValue()
            if (r2 == r0) goto L145
            goto L167
        L145:
            java.lang.Object[] r1 = r1.f5692
            r2 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r5] = r2
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.m41.f6932
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[ui] selection_alias custom="
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " native_slot=200"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            p000.m41.m3727(r0)
        L167:
            return
        L168:
            r1.getClass()
            boolean r0 = p000.jx0.f5633
            if (r0 != 0) goto L170
            goto L18f
        L170:
            xn0 r2 = p000.xn0.f12231
            int r0 = p000.jx0.f5634
            java.lang.String r1 = "[rebuild] panel_adjust_requested count="
            monitor-enter(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L190
            p000.xn0.f12233 = r3     // Catch: java.lang.Throwable -> L190
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L190
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L190
            r3.append(r0)     // Catch: java.lang.Throwable -> L190
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L190
            java.lang.String r1 = "DYH-OfflineCache"
            p000.C0888ux.m5975(r1, r0)     // Catch: java.lang.Throwable -> L190
            monitor-exit(r2)
        L18f:
            return
        L190:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L190
            throw r0
        L193:
            java.lang.String r0 = "^\\d+(\\.\\d+)?万\\+?$"
            r1.getClass()
            java.util.concurrent.atomic.AtomicBoolean r2 = p000.tu0.f10462
            java.lang.String r2 = ""
            java.lang.Object[] r1 = r1.f5692
            if (r1 != 0) goto L1a2
            goto L2e8
        L1a2:
            int r7 = r1.length
            if (r7 >= r3) goto L1a7
            goto L2e8
        L1a7:
            r3 = r1[r5]
            boolean r7 = r3 instanceof java.lang.Number
            if (r7 == 0) goto L1b0
            java.lang.Number r3 = (java.lang.Number) r3
            goto L1b1
        L1b0:
            r3 = 0
        L1b1:
            if (r3 == 0) goto L2e8
            long r7 = r3.longValue()
            r9 = 10000(0x2710, double:4.9407E-320)
            int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r3 > 0) goto L2e8
            r11 = 100000001(0x5f5e101, double:4.9406565E-316)
            int r3 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r3 >= 0) goto L2e8
            r3 = r1[r4]
            if (r3 == 0) goto L1cd
            java.lang.String r3 = r3.toString()
            goto L1ce
        L1cd:
            r3 = 0
        L1ce:
            if (r3 != 0) goto L1d1
            r3 = r2
        L1d1:
            java.lang.String r3 = p000.tu0.m5743(r3)
            int r11 = r3.length()
            if (r11 != 0) goto L1dd
            goto L2e8
        L1dd:
            java.lang.String r11 = java.lang.String.valueOf(r7)
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L1e9
            goto L2e8
        L1e9:
            java.lang.String r11 = "+"
            java.lang.String r12 = p000.tu0.m5743(r3)
            java.util.regex.Pattern r13 = java.util.regex.Pattern.compile(r0)
            r13.getClass()
            r12.getClass()
            java.util.regex.Matcher r13 = r13.matcher(r12)
            boolean r13 = r13.matches()
            r14 = 2
            if (r13 != 0) goto L20b
        L204:
            r16 = r4
            r17 = r7
            r5 = 0
            goto L28e
        L20b:
            boolean r13 = p000.x02.m6479(r12, r11, r5)
            java.lang.String r11 = p000.q02.m4679(r12, r11)
            java.lang.String r12 = "万"
            java.lang.String r11 = p000.q02.m4679(r11, r12)
            java.lang.CharSequence r11 = p000.q02.m4660(r11)
            java.lang.String r11 = r11.toString()
            java.lang.Double r12 = p000.w02.m6298(r11)
            if (r12 == 0) goto L204
            double r15 = r12.doubleValue()
            r17 = 4666723172467343360(0x40c3880000000000, double:10000.0)
            r19 = r9
            double r9 = r15 * r17
            long r9 = (long) r9
            if (r13 == 0) goto L246
            su0 r5 = new su0
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r5.<init>(r9, r11)
            r16 = r4
            r17 = r7
            goto L28e
        L246:
            r12 = 46
            r13 = 6
            int r12 = p000.q02.m4668(r11, r12, r5, r13)
            if (r12 < 0) goto L283
            int r11 = r11.length()
            int r11 = r11 - r12
            int r11 = r11 - r4
            r12 = 3
            int r11 = p000.j81.m2906(r11, r4, r12)
            r12 = r19
        L25c:
            if (r5 >= r11) goto L26b
            r15 = 10
            r16 = r4
            r17 = r5
            long r4 = (long) r15
            long r12 = r12 / r4
            int r5 = r17 + 1
            r4 = r16
            goto L25c
        L26b:
            r16 = r4
            r4 = 0
            int r4 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r4 > 0) goto L275
            r12 = 1
        L275:
            su0 r5 = new su0
            r17 = r7
            long r6 = (long) r14
            long r6 = r12 / r6
            long r6 = r9 - r6
            long r9 = r9 + r12
            r5.<init>(r6, r9)
            goto L28e
        L283:
            r16 = r4
            r17 = r7
            su0 r5 = new su0
            long r6 = r9 + r19
            r5.<init>(r9, r6)
        L28e:
            if (r5 != 0) goto L291
            goto L2e8
        L291:
            long r6 = r5.f10046
            int r6 = (r17 > r6 ? 1 : (r17 == r6 ? 0 : -1))
            if (r6 < 0) goto L2e8
            long r5 = r5.f10047
            int r5 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            if (r5 >= 0) goto L2e8
            java.lang.String r5 = java.lang.String.valueOf(r17)
            r6 = r1[r16]
            if (r6 == 0) goto L2aa
            java.lang.String r6 = r6.toString()
            goto L2ab
        L2aa:
            r6 = 0
        L2ab:
            boolean r6 = p000.ln0.m3626(r6, r5)
            if (r6 == 0) goto L2b2
            goto L2e8
        L2b2:
            r1[r16] = r5
            r6 = r1[r14]
            if (r6 == 0) goto L2bd
            java.lang.String r6 = r6.toString()
            goto L2be
        L2bd:
            r6 = 0
        L2be:
            if (r6 != 0) goto L2c1
            goto L2c2
        L2c1:
            r2 = r6
        L2c2:
            java.lang.String r2 = p000.tu0.m5743(r2)
            boolean r3 = p000.ln0.m3626(r2, r3)
            if (r3 != 0) goto L2e6
            boolean r3 = p000.ln0.m3626(r2, r5)
            if (r3 != 0) goto L2e6
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r0.getClass()
            r2.getClass()
            java.util.regex.Matcher r0 = r0.matcher(r2)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L2e8
        L2e6:
            r1[r14] = r5
        L2e8:
            return
        L2e9:
            r1.getClass()
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.pj0.f8581
            boolean r0 = p000.pj0.m4547()
            if (r0 != 0) goto L2f5
            goto L318
        L2f5:
            java.util.concurrent.atomic.AtomicInteger r0 = p000.pj0.f8582
            int r0 = r0.incrementAndGet()
            r2 = 20
            if (r0 <= r2) goto L306
            int r2 = r0 % 50
            if (r2 != 0) goto L304
            goto L306
        L304:
            r4 = 0
            goto L312
        L306:
            java.lang.String r2 = "DYHelper"
            java.lang.String r5 = "勿扰模式拦截消息Tab角标上屏 LIZ #"
            java.lang.String r0 = p000.a12.m17(r5, r0)
            r4 = 0
            p000.C0888ux.m5988(r2, r0, r4, r3, r4)
        L312:
            p000.pj0.m4546()
            r1.m3107(r4)
        L318:
            return
    }
}
