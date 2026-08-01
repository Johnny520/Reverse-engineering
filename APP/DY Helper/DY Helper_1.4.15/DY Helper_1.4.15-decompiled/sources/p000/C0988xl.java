package p000;

/* JADX INFO: renamed from: xl */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0988xl extends p000.m01 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f12205;

    public /* synthetic */ C0988xl(int r2) {
            r1 = this;
            r0 = 29
            r1.f12205 = r0
            r1.<init>(r2)
            return
    }

    public /* synthetic */ C0988xl(int r1, byte r2) {
            r0 = this;
            r0.f12205 = r1
            r0.<init>()
            return
    }

    @Override // p000.m01
    public void afterHookedMethod(p000.k01 r12) {
            r11 = this;
            int r0 = r11.f12205
            java.lang.String r1 = "hide_comment_input_bar_enabled"
            java.lang.String r2 = "force_legacy_comment_panel_enabled"
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            java.lang.String r4 = "DYHelper:DurationAlert"
            r5 = 4
            r6 = 0
            r8 = 1
            r9 = 0
            r10 = 0
            switch(r0) {
                case 0: goto L666;
                case 1: goto L610;
                case 2: goto L5d2;
                case 3: goto L4ca;
                case 4: goto L4a5;
                case 5: goto L476;
                case 6: goto L465;
                case 7: goto L13;
                case 8: goto L13;
                case 9: goto L411;
                case 10: goto L3de;
                case 11: goto L38b;
                case 12: goto L347;
                case 13: goto L301;
                case 14: goto L2cf;
                case 15: goto L214;
                case 16: goto L13;
                case 17: goto L13;
                case 18: goto L1fb;
                case 19: goto L1f2;
                case 20: goto L13;
                case 21: goto L13;
                case 22: goto L7e;
                case 23: goto L67;
                case 24: goto L48;
                case 25: goto L38;
                case 26: goto L30;
                case 27: goto L24;
                case 28: goto L17;
                default: goto L13;
            }
        L13:
            super.afterHookedMethod(r12)
            return
        L17:
            r12.getClass()
            java.util.LinkedHashMap r11 = p000.d72.f2936
            r11.clear()
            java.util.concurrent.atomic.AtomicReference r11 = p000.b10.f1403
            p000.b10.f1405 = r10
            return
        L24:
            r12.getClass()
            java.util.concurrent.atomic.AtomicReference r11 = p000.b10.f1403
            p000.b10.f1404 = r9
            java.util.concurrent.atomic.AtomicReference r11 = p000.b10.f1403
            p000.b10.f1405 = r10
            return
        L30:
            r12.getClass()
            java.util.concurrent.atomic.AtomicReference r11 = p000.b10.f1403
            p000.b10.f1404 = r9
            return
        L38:
            r12.getClass()
            java.util.concurrent.atomic.AtomicReference r11 = p000.b10.f1403
            p000.b10.f1404 = r8
            java.lang.Object r11 = r12.f5691
            r11.getClass()
            p000.b10.m654(r11)
            return
        L48:
            r12.getClass()
            java.lang.Object[] r11 = r12.f5692
            r11 = r11[r9]
            r11.getClass()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            java.util.concurrent.atomic.AtomicReference r0 = p000.b10.f1403
            p000.b10.f1404 = r11
            if (r11 == 0) goto L66
            java.lang.Object r11 = r12.f5691
            r11.getClass()
            p000.b10.m654(r11)
        L66:
            return
        L67:
            r12.getClass()
            java.lang.Object[] r11 = r12.f5692
            r11 = r11[r9]
            if (r11 != 0) goto L71
            goto L7d
        L71:
            java.util.concurrent.atomic.AtomicReference r12 = p000.b10.f1403
            r12.set(r11)
            pq r12 = p000.C0696pq.f8651
            java.lang.String r0 = "profile_aweme_change"
            r12.m4568(r0, r11, r11, r10)
        L7d:
            return
        L7e:
            r12.getClass()
            java.lang.Object r11 = r12.f5694
            if (r11 == 0) goto L1f1
            java.util.concurrent.atomic.AtomicReference r12 = p000.b10.f1403
            java.lang.Class r12 = r11.getClass()
            java.lang.String r12 = r12.getName()
            java.lang.String r0 = "Aweme"
            boolean r12 = p000.q02.m4654(r12, r0, r9)
            if (r12 == 0) goto L99
            r12 = r8
            goto Lce
        L99:
            java.lang.String r12 = "aid"
            java.lang.String r12 = p000.b10.m671(r11, r12)     // Catch: java.lang.Throwable -> Lb2
            if (r12 != 0) goto Lb5
            java.lang.String r12 = "awemeId"
            java.lang.String r12 = p000.b10.m671(r11, r12)     // Catch: java.lang.Throwable -> Lb2
            if (r12 != 0) goto Lb5
            java.lang.String r12 = "video"
            java.lang.Object r12 = p000.qe0.m4879(r11, r12)     // Catch: java.lang.Throwable -> Lb2
            if (r12 == 0) goto Lb6
            goto Lb5
        Lb2:
            r0 = move-exception
            r12 = r0
            goto Lbb
        Lb5:
            r9 = r8
        Lb6:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> Lb2
            goto Lc1
        Lbb:
            eo1 r0 = new eo1
            r0.<init>(r12)
            r12 = r0
        Lc1:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r1 = r12 instanceof p000.eo1
            if (r1 == 0) goto Lc8
            r12 = r0
        Lc8:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
        Lce:
            if (r12 == 0) goto Ld1
            goto Ld2
        Ld1:
            r11 = r10
        Ld2:
            if (r11 == 0) goto L1f1
            java.util.concurrent.atomic.AtomicReference r12 = p000.b10.f1403
            r12.set(r11)
            pq r12 = p000.C0696pq.f8651
            java.lang.String r0 = "detail_getter"
            r12.m4568(r0, r11, r11, r10)
            boolean r12 = p000.b10.f1406
            if (r12 == 0) goto Le6
            goto L1f1
        Le6:
            p000.b10.f1406 = r8
            java.lang.String r12 = "music"
            java.lang.Object r11 = p000.qe0.m4879(r11, r12)     // Catch: java.lang.Throwable -> L1dc
            if (r11 != 0) goto Lf4
            java.lang.String r11 = "music=null"
            goto L1e8
        Lf4:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1dc
            java.lang.String r0 = "Music fields:\n"
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L1dc
            java.lang.Class r0 = r11.getClass()     // Catch: java.lang.Throwable -> L1dc
        Lff:
            if (r0 == 0) goto L1d7
            boolean r1 = r0.equals(r3)     // Catch: java.lang.Throwable -> L1dc
            if (r1 != 0) goto L1d7
            java.lang.reflect.Field[] r1 = r0.getDeclaredFields()     // Catch: java.lang.Throwable -> L1dc
            τ r1 = p000.h62.m2434(r1)     // Catch: java.lang.Throwable -> L1dc
        L10f:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1dc
            if (r2 == 0) goto L1d1
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L1dc
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2     // Catch: java.lang.Throwable -> L1dc
            r2.setAccessible(r8)     // Catch: java.lang.Throwable -> L1dc
            java.lang.Object r4 = r2.get(r11)     // Catch: java.lang.Throwable -> L1dc
            if (r4 != 0) goto L128
            java.lang.String r4 = "null"
            goto L19e
        L128:
            boolean r5 = r4 instanceof java.util.List     // Catch: java.lang.Throwable -> L1dc
            if (r5 == 0) goto L154
            r5 = r4
            java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Throwable -> L1dc
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L1dc
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch: java.lang.Throwable -> L1dc
            r6 = 2
            java.util.List r4 = p000.AbstractC0984xh.m6662(r4, r6)     // Catch: java.lang.Throwable -> L1dc
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1dc
            r6.<init>()     // Catch: java.lang.Throwable -> L1dc
            java.lang.String r7 = "List("
            r6.append(r7)     // Catch: java.lang.Throwable -> L1dc
            r6.append(r5)     // Catch: java.lang.Throwable -> L1dc
            java.lang.String r5 = ")"
            r6.append(r5)     // Catch: java.lang.Throwable -> L1dc
            r6.append(r4)     // Catch: java.lang.Throwable -> L1dc
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L1dc
            goto L19e
        L154:
            boolean r5 = r4 instanceof java.lang.String     // Catch: java.lang.Throwable -> L1dc
            if (r5 == 0) goto L17e
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L1dc
            int r5 = r5.length()     // Catch: java.lang.Throwable -> L1dc
            r6 = 80
            if (r5 <= r6) goto L17b
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L1dc
            java.lang.String r4 = p000.q02.m4693(r4, r6)     // Catch: java.lang.Throwable -> L1dc
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1dc
            r5.<init>()     // Catch: java.lang.Throwable -> L1dc
            r5.append(r4)     // Catch: java.lang.Throwable -> L1dc
            java.lang.String r4 = "..."
            r5.append(r4)     // Catch: java.lang.Throwable -> L1dc
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L1dc
            goto L19e
        L17b:
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L1dc
            goto L19e
        L17e:
            java.lang.Class r5 = r4.getClass()     // Catch: java.lang.Throwable -> L1dc
            java.lang.String r5 = r5.getSimpleName()     // Catch: java.lang.Throwable -> L1dc
            int r4 = java.lang.System.identityHashCode(r4)     // Catch: java.lang.Throwable -> L1dc
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1dc
            r6.<init>()     // Catch: java.lang.Throwable -> L1dc
            r6.append(r5)     // Catch: java.lang.Throwable -> L1dc
            java.lang.String r5 = "@"
            r6.append(r5)     // Catch: java.lang.Throwable -> L1dc
            r6.append(r4)     // Catch: java.lang.Throwable -> L1dc
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L1dc
        L19e:
            java.lang.String r5 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L1dc
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L1dc
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1dc
            r6.<init>()     // Catch: java.lang.Throwable -> L1dc
            java.lang.String r7 = "  "
            r6.append(r7)     // Catch: java.lang.Throwable -> L1dc
            r6.append(r5)     // Catch: java.lang.Throwable -> L1dc
            java.lang.String r5 = "."
            r6.append(r5)     // Catch: java.lang.Throwable -> L1dc
            r6.append(r2)     // Catch: java.lang.Throwable -> L1dc
            java.lang.String r2 = " = "
            r6.append(r2)     // Catch: java.lang.Throwable -> L1dc
            r6.append(r4)     // Catch: java.lang.Throwable -> L1dc
            java.lang.String r2 = r6.toString()     // Catch: java.lang.Throwable -> L1dc
            r12.append(r2)     // Catch: java.lang.Throwable -> L1dc
            r2 = 10
            r12.append(r2)     // Catch: java.lang.Throwable -> L1dc
            goto L10f
        L1d1:
            java.lang.Class r0 = r0.getSuperclass()     // Catch: java.lang.Throwable -> L1dc
            goto Lff
        L1d7:
            java.lang.String r11 = r12.toString()     // Catch: java.lang.Throwable -> L1dc
            goto L1e8
        L1dc:
            r0 = move-exception
            r11 = r0
            java.lang.String r11 = r11.getMessage()
            java.lang.String r12 = "dump failed: "
            java.lang.String r11 = p000.lz1.m3687(r12, r11)
        L1e8:
            java.lang.String r12 = "DYHelper: "
            java.lang.String r11 = r12.concat(r11)
            p000.C0888ux.m5985(r11)
        L1f1:
            return
        L1f2:
            r12.getClass()
            java.util.concurrent.atomic.AtomicLong r11 = p000.d00.f2829
            r11.set(r6)
            return
        L1fb:
            r12.getClass()
            java.util.concurrent.atomic.AtomicLong r11 = p000.d00.f2829
            boolean r11 = p000.d00.m1636()
            if (r11 == 0) goto L213
            java.util.concurrent.atomic.AtomicLong r11 = p000.d00.f2829
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2 = 300000(0x493e0, double:1.482197E-318)
            long r0 = r0 + r2
            r11.set(r0)
        L213:
            return
        L214:
            r12.getClass()
            java.util.concurrent.atomic.AtomicLong r11 = p000.d00.f2829
            boolean r11 = p000.d00.m1636()
            if (r11 == 0) goto L2ce
            java.util.concurrent.atomic.AtomicLong r11 = p000.d00.f2829
            long r0 = r11.get()
            int r11 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r11 <= 0) goto L2ce
            long r2 = android.os.SystemClock.elapsedRealtime()
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r11 > 0) goto L2ce
            java.lang.Object r11 = r12.f5694
            boolean r0 = r11 instanceof java.lang.Number
            if (r0 == 0) goto L23a
            java.lang.Number r11 = (java.lang.Number) r11
            goto L23b
        L23a:
            r11 = r10
        L23b:
            if (r11 != 0) goto L23f
            goto L2ce
        L23f:
            java.lang.Object r0 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L252
            java.lang.Object r0 = r12.f5691     // Catch: java.lang.Throwable -> L252
            java.lang.String r1 = "getInspireTime"
            java.lang.Object[] r2 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L252
            java.lang.Object r0 = p000.qe0.m4869(r0, r1, r2)     // Catch: java.lang.Throwable -> L252
            boolean r1 = r0 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L252
            if (r1 == 0) goto L254
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L252
            goto L25c
        L252:
            r0 = move-exception
            goto L256
        L254:
            r0 = r10
            goto L25c
        L256:
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L25c:
            boolean r1 = r0 instanceof p000.eo1
            if (r1 == 0) goto L261
            goto L262
        L261:
            r10 = r0
        L262:
            java.lang.Number r10 = (java.lang.Number) r10
            if (r10 != 0) goto L268
            goto L2ce
        L268:
            long r0 = r11.longValue()
            long r2 = r10.longValue()
            r4 = 1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L277
            r2 = r4
        L277:
            long r0 = java.lang.Math.max(r0, r2)
            java.util.concurrent.atomic.AtomicLong r2 = p000.d00.f2829
            boolean r2 = r11 instanceof java.lang.Integer
            if (r2 == 0) goto L28f
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 <= 0) goto L289
            r0 = r2
        L289:
            int r11 = (int) r0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L2cb
        L28f:
            boolean r2 = r11 instanceof java.lang.Short
            if (r2 == 0) goto L2a1
            r2 = 32767(0x7fff, double:1.6189E-319)
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 <= 0) goto L29a
            r0 = r2
        L29a:
            int r11 = (int) r0
            short r11 = (short) r11
            java.lang.Short r11 = java.lang.Short.valueOf(r11)
            goto L2cb
        L2a1:
            boolean r2 = r11 instanceof java.lang.Byte
            if (r2 == 0) goto L2b3
            r2 = 127(0x7f, double:6.27E-322)
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 <= 0) goto L2ac
            r0 = r2
        L2ac:
            int r11 = (int) r0
            byte r11 = (byte) r11
            java.lang.Byte r11 = java.lang.Byte.valueOf(r11)
            goto L2cb
        L2b3:
            boolean r2 = r11 instanceof java.lang.Float
            if (r2 == 0) goto L2bd
            float r11 = (float) r0
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            goto L2cb
        L2bd:
            boolean r11 = r11 instanceof java.lang.Double
            if (r11 == 0) goto L2c7
            double r0 = (double) r0
            java.lang.Double r11 = java.lang.Double.valueOf(r0)
            goto L2cb
        L2c7:
            java.lang.Long r11 = java.lang.Long.valueOf(r0)
        L2cb:
            r12.m3107(r11)
        L2ce:
            return
        L2cf:
            r12.getClass()
            java.lang.Object r11 = r12.f5691
            r11.getClass()
            android.app.Activity r11 = (android.app.Activity) r11
            android.os.Handler r12 = p000.C1036yw.f12843
            boolean r11 = p000.C1036yw.m7034(r11)
            if (r11 != 0) goto L2e2
            goto L300
        L2e2:
            long r11 = p000.C1036yw.f12850
            long r0 = java.lang.System.currentTimeMillis()
            p000.C1036yw.f12850 = r0
            boolean r0 = p000.C1036yw.f12851
            if (r0 == 0) goto L2f7
            java.lang.String r11 = "[触摸] 用户操作，取消空闲退出倒计时"
            p000.C0888ux.m5988(r4, r11, r10, r5, r10)
            p000.C1036yw.m7036()
            goto L300
        L2f7:
            int r11 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r11 != 0) goto L300
            java.lang.String r11 = "[触摸] 首次触摸，空闲计时开始"
            p000.C0888ux.m5988(r4, r11, r10, r5, r10)
        L300:
            return
        L301:
            r12.getClass()
            java.lang.Object r11 = r12.f5691
            r11.getClass()
            android.app.Activity r11 = (android.app.Activity) r11
            android.os.Handler r12 = p000.C1036yw.f12843
            java.lang.Class r11 = r11.getClass()
            java.lang.String r11 = r11.getName()
            java.lang.String r12 = "MainActivity"
            boolean r12 = p000.q02.m4654(r11, r12, r8)
            if (r12 != 0) goto L32d
            java.lang.String r12 = "MainTabActivity"
            boolean r12 = p000.q02.m4654(r11, r12, r8)
            if (r12 != 0) goto L32d
            java.lang.String r12 = "HomePageActivity"
            boolean r11 = p000.q02.m4654(r11, r12, r8)
            if (r11 == 0) goto L346
        L32d:
            java.lang.String r11 = "[onDestroy] 主Activity销毁，重置计时"
            p000.C0888ux.m5988(r4, r11, r10, r5, r10)
            p000.C1036yw.f12844 = r6
            p000.C1036yw.f12845 = r6
            p000.C1036yw.f12846 = r6
            p000.C1036yw.f12848 = r9
            p000.C1036yw.f12849 = r9
            p000.C1036yw.f12850 = r6
            p000.C1036yw.f12847 = r9
            p000.C1036yw.m7036()
            p000.C1036yw.m7039()
        L346:
            return
        L347:
            r12.getClass()
            java.lang.Object r11 = r12.f5691
            r11.getClass()
            android.app.Activity r11 = (android.app.Activity) r11
            android.os.Handler r12 = p000.C1036yw.f12843
            boolean r12 = p000.C1036yw.m7034(r11)
            if (r12 != 0) goto L35a
            goto L38a
        L35a:
            java.lang.Class r11 = r11.getClass()
            java.lang.String r11 = r11.getSimpleName()
            java.lang.String r12 = "[onPause] "
            java.lang.String r11 = r12.concat(r11)
            p000.C0888ux.m5988(r4, r11, r10, r5, r10)
            boolean r11 = p000.C1036yw.f12847
            if (r11 != 0) goto L370
            goto L38a
        L370:
            long r11 = java.lang.System.currentTimeMillis()
            long r0 = p000.C1036yw.f12846
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 <= 0) goto L382
            long r0 = p000.C1036yw.f12845
            long r2 = p000.C1036yw.f12846
            long r11 = r11 - r2
            long r11 = r11 + r0
            p000.C1036yw.f12845 = r11
        L382:
            p000.C1036yw.f12847 = r9
            p000.C1036yw.m7036()
            p000.C1036yw.m7039()
        L38a:
            return
        L38b:
            r12.getClass()
            java.lang.Object r11 = r12.f5691
            r11.getClass()
            android.app.Activity r11 = (android.app.Activity) r11
            android.os.Handler r12 = p000.C1036yw.f12843
            boolean r12 = p000.C1036yw.m7034(r11)
            if (r12 != 0) goto L39e
            goto L3dd
        L39e:
            java.lang.Class r12 = r11.getClass()
            java.lang.String r12 = r12.getSimpleName()
            java.lang.String r0 = "[onResume] "
            java.lang.String r12 = r0.concat(r12)
            p000.C0888ux.m5988(r4, r12, r10, r5, r10)
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = p000.C1036yw.f12844
            int r12 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r12 != 0) goto L3c6
            p000.C1036yw.f12844 = r0
            p000.C1036yw.f12845 = r6
            p000.C1036yw.f12848 = r9
            p000.C1036yw.f12849 = r9
            java.lang.String r12 = "新会话开始"
            p000.C0888ux.m5988(r4, r12, r10, r5, r10)
        L3c6:
            p000.C1036yw.f12846 = r0
            p000.C1036yw.f12850 = r0
            p000.C1036yw.f12847 = r8
            p000.C1036yw.m7039()
            d1 r12 = new d1
            r12.<init>(r5, r11)
            p000.C1036yw.f12854 = r12
            android.os.Handler r11 = p000.C1036yw.f12843
            r0 = 10000(0x2710, double:4.9407E-320)
            r11.postDelayed(r12, r0)
        L3dd:
            return
        L3de:
            r12.getClass()
            java.lang.ThreadLocal r11 = p000.C0436jm.f5524
            java.lang.Object r11 = r11.get()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r11 = p000.ln0.m3626(r11, r0)
            if (r11 != 0) goto L410
            jm r11 = p000.C0436jm.f5518
            boolean r11 = p000.C0436jm.m2968()
            if (r11 != 0) goto L3f8
            goto L410
        L3f8:
            java.lang.Object r11 = r12.f5691
            boolean r12 = r11 instanceof android.view.View
            if (r12 == 0) goto L401
            r10 = r11
            android.view.View r10 = (android.view.View) r10
        L401:
            if (r10 != 0) goto L404
            goto L410
        L404:
            java.util.Map r11 = p000.C0436jm.f5523
            boolean r11 = r11.containsKey(r10)
            if (r11 != 0) goto L40d
            goto L410
        L40d:
            p000.C0436jm.m2966(r10)
        L410:
            return
        L411:
            r12.getClass()
            jm r11 = p000.C0436jm.f5518
            boolean r11 = p000.C0436jm.m2968()
            if (r11 != 0) goto L420
            p000.C0436jm.m2969()
            goto L464
        L420:
            java.lang.Object r11 = r12.f5691
            if (r11 != 0) goto L425
            goto L464
        L425:
            java.lang.Class r12 = r11.getClass()
            java.lang.reflect.Field[] r12 = r12.getDeclaredFields()
            r12.getClass()
            ss1 r12 = p000.AbstractC0312g7.m2232(r12)
            hm r0 = new hm
            r0.<init>(r8)
            y30 r1 = new y30
            r1.<init>(r12, r8, r0)
            ef r12 = new ef
            r12.<init>(r5, r11)
            y30 r11 = p000.us1.m5943(r1, r12)
            cu r11 = p000.us1.m5952(r11)
            java.util.Iterator r11 = r11.iterator()
        L44f:
            r12 = r11
            σ r12 = (p000.AbstractC1095) r12
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L464
            java.lang.Object r12 = r12.next()
            android.widget.FrameLayout r12 = (android.widget.FrameLayout) r12
            jm r0 = p000.C0436jm.f5518
            p000.C0436jm.m2966(r12)
            goto L44f
        L464:
            return
        L465:
            r12.getClass()
            dm r11 = p000.C0217dm.f3216
            boolean r11 = p000.C0217dm.m1777(r2)
            if (r11 == 0) goto L475
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r12.m3107(r11)
        L475:
            return
        L476:
            r12.getClass()
            dm r11 = p000.C0217dm.f3216
            boolean r11 = p000.C0217dm.m1777(r2)
            if (r11 != 0) goto L482
            goto L4a4
        L482:
            java.lang.Object[] r11 = r12.f5692
            r11.getClass()
            java.lang.Object r11 = p000.AbstractC0312g7.m2253(r8, r11)
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L492
            r10 = r11
            java.lang.String r10 = (java.lang.String) r10
        L492:
            if (r10 != 0) goto L495
            goto L4a4
        L495:
            java.lang.String r11 = "comment_kmp_panel_exp_key"
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L4a4
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r12.m3107(r11)
        L4a4:
            return
        L4a5:
            r12.getClass()
            dm r11 = p000.C0217dm.f3216
            boolean r11 = p000.C0217dm.m1777(r1)
            if (r11 != 0) goto L4b1
            goto L4c9
        L4b1:
            java.lang.Object r11 = r12.f5691
            boolean r12 = r11 instanceof android.view.View
            if (r12 == 0) goto L4ba
            r10 = r11
            android.view.View r10 = (android.view.View) r10
        L4ba:
            if (r10 != 0) goto L4bd
            goto L4c9
        L4bd:
            java.util.Map r11 = p000.AbstractC0327gm.f4416
            boolean r11 = r11.containsKey(r10)
            if (r11 != 0) goto L4c6
            goto L4c9
        L4c6:
            p000.AbstractC0327gm.m2312(r10)
        L4c9:
            return
        L4ca:
            r12.getClass()
            dm r11 = p000.C0217dm.f3216
            boolean r11 = p000.C0217dm.m1777(r1)
            if (r11 != 0) goto L4d7
            goto L5d1
        L4d7:
            java.lang.Object r11 = r12.f5691
            if (r11 != 0) goto L4dd
            goto L5d1
        L4dd:
            java.util.Map r12 = p000.AbstractC0327gm.f4416
            java.lang.Class r12 = r11.getClass()
        L4e3:
            if (r12 == 0) goto L52f
            boolean r0 = r12.equals(r3)
            if (r0 != 0) goto L52f
            java.lang.reflect.Field[] r0 = r12.getDeclaredFields()
            r0.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0.length
            r4 = r9
        L4f9:
            if (r4 >= r2) goto L50f
            r5 = r0[r4]
            java.lang.Class<android.view.ViewGroup> r6 = android.view.ViewGroup.class
            java.lang.Class r7 = r5.getType()
            boolean r6 = r6.isAssignableFrom(r7)
            if (r6 == 0) goto L50c
            r1.add(r5)
        L50c:
            int r4 = r4 + 1
            goto L4f9
        L50f:
            java.util.Iterator r0 = r1.iterator()
        L513:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L523
            java.lang.Object r2 = r0.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            r2.setAccessible(r8)
            goto L513
        L523:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L52a
            goto L531
        L52a:
            java.lang.Class r12 = r12.getSuperclass()
            goto L4e3
        L52f:
            jz r1 = p000.C0450jz.f5672
        L531:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r1 = r1.iterator()
        L53a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L568
            java.lang.Object r0 = r1.next()
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            java.lang.Object r0 = r0.get(r11)     // Catch: java.lang.Throwable -> L551
            boolean r2 = r0 instanceof android.view.ViewGroup     // Catch: java.lang.Throwable -> L551
            if (r2 == 0) goto L553
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch: java.lang.Throwable -> L551
            goto L55b
        L551:
            r0 = move-exception
            goto L555
        L553:
            r0 = r10
            goto L55b
        L555:
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L55b:
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto L560
            r0 = r10
        L560:
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L53a
            r12.add(r0)
            goto L53a
        L568:
            java.util.Set r12 = p000.AbstractC0984xh.m6670(r12)
            java.util.List r12 = p000.AbstractC0984xh.m6666(r12)
            java.lang.Object r0 = p000.AbstractC0984xh.m6656(r12)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L5ce
            java.util.Iterator r0 = r12.iterator()
        L57c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5b5
            java.lang.Object r1 = r0.next()
            r2 = r1
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            boolean r3 = r12.isEmpty()
            if (r3 == 0) goto L590
            goto L5b4
        L590:
            java.util.Iterator r3 = r12.iterator()
        L594:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L5b4
            java.lang.Object r4 = r3.next()
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            if (r4 == r2) goto L594
            android.view.ViewParent r5 = r2.getParent()
        L5a6:
            boolean r6 = r5 instanceof android.view.View
            if (r6 == 0) goto L594
            if (r5 != r4) goto L5ad
            goto L57c
        L5ad:
            android.view.View r5 = (android.view.View) r5
            android.view.ViewParent r5 = r5.getParent()
            goto L5a6
        L5b4:
            r10 = r1
        L5b5:
            r0 = r10
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L5ce
            java.lang.Class r11 = r11.getClass()
            java.lang.String r11 = r11.getName()
            java.lang.String r12 = "comment input container structure mismatch: "
            java.lang.String r11 = r12.concat(r11)
            java.lang.String r12 = "rd44bdb4944a23356"
            p000.C0888ux.m5975(r12, r11)
            goto L5d1
        L5ce:
            p000.AbstractC0327gm.m2312(r0)
        L5d1:
            return
        L5d2:
            r12.getClass()
            java.lang.ThreadLocal r11 = p000.C1025yl.f12677
            java.lang.Object r11 = r11.get()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r11 = p000.ln0.m3626(r11, r0)
            if (r11 != 0) goto L60f
            yl r11 = p000.C1025yl.f12669
            boolean r11 = p000.C1025yl.m6927()
            if (r11 != 0) goto L5ec
            goto L60f
        L5ec:
            java.lang.Object r11 = r12.f5691
            boolean r12 = r11 instanceof android.view.View
            if (r12 == 0) goto L5f5
            r10 = r11
            android.view.View r10 = (android.view.View) r10
        L5f5:
            if (r10 != 0) goto L5f8
            goto L60f
        L5f8:
            java.util.Map r11 = p000.C1025yl.f12676
            boolean r11 = r11.containsKey(r10)
            if (r11 != 0) goto L601
            goto L60f
        L601:
            int r11 = r10.getVisibility()
            r12 = 8
            if (r11 != r12) goto L60a
            goto L60f
        L60a:
            java.lang.String r11 = "visibility guard"
            p000.C1025yl.m6926(r10, r11)
        L60f:
            return
        L610:
            r12.getClass()
            yl r11 = p000.C1025yl.f12669
            boolean r11 = p000.C1025yl.m6927()
            if (r11 != 0) goto L61f
            p000.C1025yl.m6935()
            goto L665
        L61f:
            java.lang.Throwable r11 = new java.lang.Throwable
            r11.<init>()
            java.lang.StackTraceElement[] r11 = r11.getStackTrace()
            r11.getClass()
            int r0 = r11.length
        L62c:
            if (r9 >= r0) goto L665
            r1 = r11[r9]
            java.lang.String r2 = r1.getClassName()
            java.lang.String r3 = "~78BF3716A2F49FBB709742322D9206C6AF9F18144C2A2123893F917FD9A67DE75E87F835F5066DD2C20FA2028DA408323F4FAF162C0F9F8650E8E7270A57AFBA395C73DBE2F9D1A4C5B8"
            java.lang.String r3 = p000.jf0.m2957(r3)
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L654
            java.lang.String r1 = r1.getClassName()
            java.lang.String r2 = "~78DF588B0EC79FAF9E614C08184F8649CB64E2954C8C7DAB572EB9CAA062808381972FC64C3DABAEB2071701EBE921AE26D62D7F00E3C85643E31111547B42BE1A7D660631EA17BD042F86CB05D259E1A595"
            java.lang.String r2 = p000.jf0.m2957(r2)
            boolean r1 = p000.ln0.m3626(r1, r2)
            if (r1 == 0) goto L651
            goto L654
        L651:
            int r9 = r9 + 1
            goto L62c
        L654:
            java.lang.Object r11 = r12.f5694
            boolean r12 = r11 instanceof android.view.View
            if (r12 == 0) goto L65d
            r10 = r11
            android.view.View r10 = (android.view.View) r10
        L65d:
            if (r10 != 0) goto L660
            goto L665
        L660:
            java.lang.String r11 = "ViewStub.inflate"
            p000.C1025yl.m6923(r10, r11)
        L665:
            return
        L666:
            r12.getClass()
            java.lang.ThreadLocal r11 = p000.C1025yl.f12677
            java.lang.Object r0 = r11.get()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L7d7
            yl r0 = p000.C1025yl.f12669
            boolean r0 = p000.C1025yl.m6927()
            if (r0 != 0) goto L681
            goto L7d7
        L681:
            java.lang.Object r12 = r12.f5691
            if (r12 != 0) goto L687
            goto L7d7
        L687:
            java.lang.Class r0 = r12.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L690:
            if (r0 == 0) goto L69d
            boolean r2 = r0.equals(r3)
            if (r2 != 0) goto L69d
            java.lang.Class r0 = p000.lz1.m3684(r0, r1)
            goto L690
        L69d:
            java.util.Iterator r0 = r1.iterator()
        L6a1:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L6b1
            java.lang.Object r2 = r0.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            r2.setAccessible(r8)
            goto L6a1
        L6b1:
            java.util.Iterator r2 = r1.iterator()
        L6b5:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L706
            java.lang.Object r0 = r2.next()
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            java.lang.Object r0 = r0.get(r12)     // Catch: java.lang.Throwable -> L6cc
            boolean r3 = r0 instanceof android.view.View     // Catch: java.lang.Throwable -> L6cc
            if (r3 == 0) goto L6ce
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> L6cc
            goto L6d6
        L6cc:
            r0 = move-exception
            goto L6d0
        L6ce:
            r0 = r10
            goto L6d6
        L6d0:
            eo1 r3 = new eo1
            r3.<init>(r0)
            r0 = r3
        L6d6:
            boolean r3 = r0 instanceof p000.eo1
            if (r3 == 0) goto L6db
            r0 = r10
        L6db:
            r7 = r0
            android.view.View r7 = (android.view.View) r7
            if (r7 == 0) goto L702
            boolean r0 = r7 instanceof android.widget.LinearLayout
            if (r0 == 0) goto L702
            um1 r0 = new um1
            r0.<init>()
            vl r6 = new vl
            r6.<init>(r0, r9)
            sm1 r3 = new sm1
            r3.<init>()
            r8 = 0
            r4 = 512(0x200, float:7.17E-43)
            r5 = 12
            p000.C1025yl.m6936(r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r0.f10912
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L702
            goto L703
        L702:
            r7 = r10
        L703:
            if (r7 == 0) goto L6b5
            goto L707
        L706:
            r7 = r10
        L707:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r1.iterator()
        L710:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L73e
            java.lang.Object r0 = r3.next()
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            java.lang.Object r0 = r0.get(r12)     // Catch: java.lang.Throwable -> L727
            boolean r4 = r0 instanceof android.widget.LinearLayout     // Catch: java.lang.Throwable -> L727
            if (r4 == 0) goto L729
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0     // Catch: java.lang.Throwable -> L727
            goto L731
        L727:
            r0 = move-exception
            goto L72b
        L729:
            r0 = r10
            goto L731
        L72b:
            eo1 r4 = new eo1
            r4.<init>(r0)
            r0 = r4
        L731:
            boolean r4 = r0 instanceof p000.eo1
            if (r4 == 0) goto L736
            r0 = r10
        L736:
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            if (r0 == 0) goto L710
            r2.add(r0)
            goto L710
        L73e:
            java.util.Iterator r1 = r1.iterator()
        L742:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L777
            java.lang.Object r0 = r1.next()
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            java.lang.Object r0 = r0.get(r12)     // Catch: java.lang.Throwable -> L759
            boolean r3 = r0 instanceof android.view.View     // Catch: java.lang.Throwable -> L759
            if (r3 == 0) goto L75b
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> L759
            goto L763
        L759:
            r0 = move-exception
            goto L75d
        L75b:
            r0 = r10
            goto L763
        L75d:
            eo1 r3 = new eo1
            r3.<init>(r0)
            r0 = r3
        L763:
            boolean r3 = r0 instanceof p000.eo1
            if (r3 == 0) goto L768
            r0 = r10
        L768:
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L773
            boolean r3 = p000.C1025yl.m6929(r0)
            if (r3 == 0) goto L773
            goto L774
        L773:
            r0 = r10
        L774:
            if (r0 == 0) goto L742
            r10 = r0
        L777:
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            r11.set(r12)
            if (r10 == 0) goto L7a2
            boolean r12 = r10 instanceof android.widget.Checkable     // Catch: java.lang.Throwable -> L7a8
            if (r12 == 0) goto L789
            r12 = r10
            android.widget.Checkable r12 = (android.widget.Checkable) r12     // Catch: java.lang.Throwable -> L7a8
            r12.setChecked(r9)     // Catch: java.lang.Throwable -> L7a8
            goto L7a2
        L789:
            java.lang.Class r12 = r10.getClass()     // Catch: java.lang.Throwable -> L7a2
            java.lang.String r0 = "setChecked"
            java.lang.Class r1 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L7a2
            java.lang.Class[] r1 = new java.lang.Class[]{r1}     // Catch: java.lang.Throwable -> L7a2
            java.lang.reflect.Method r12 = r12.getMethod(r0, r1)     // Catch: java.lang.Throwable -> L7a2
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L7a2
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L7a2
            r12.invoke(r10, r0)     // Catch: java.lang.Throwable -> L7a2
        L7a2:
            if (r10 == 0) goto L7ae
            r10.setSelected(r9)     // Catch: java.lang.Throwable -> L7a8
            goto L7ae
        L7a8:
            r0 = move-exception
            r12 = r0
            r11.remove()
            throw r12
        L7ae:
            r11.remove()
            java.util.List r11 = p000.AbstractC1021yh.m6898(r7)
            java.util.ArrayList r11 = p000.AbstractC0984xh.m6651(r2, r11)
            java.util.Set r11 = p000.AbstractC0984xh.m6670(r11)
            java.util.List r11 = p000.AbstractC0984xh.m6666(r11)
            java.util.Iterator r11 = r11.iterator()
        L7c5:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L7d7
            java.lang.Object r12 = r11.next()
            android.view.View r12 = (android.view.View) r12
            java.lang.String r0 = "publish preview method"
            p000.C1025yl.m6926(r12, r0)
            goto L7c5
        L7d7:
            return
    }

    @Override // p000.m01
    public void beforeHookedMethod(p000.k01 r11) {
            r10 = this;
            int r0 = r10.f12205
            java.lang.String r1 = "hide_comment_related_search_enabled"
            r2 = 300000(0x493e0, double:1.482197E-318)
            r4 = 4
            java.lang.String r5 = "re42d48bb5ac13a6f"
            r6 = 1
            r7 = 0
            r8 = 0
            switch(r0) {
                case 7: goto L1d2;
                case 8: goto L1c3;
                case 16: goto L140;
                case 17: goto Le5;
                case 20: goto L75;
                case 21: goto L38;
                case 29: goto L14;
                default: goto L10;
            }
        L10:
            super.beforeHookedMethod(r11)
            return
        L14:
            r11.getClass()
            java.lang.Object[] r10 = r11.f5692
            r10.getClass()
            java.lang.Object r10 = p000.AbstractC0312g7.m2253(r7, r10)
            boolean r0 = r10 instanceof android.view.MotionEvent
            if (r0 == 0) goto L27
            android.view.MotionEvent r10 = (android.view.MotionEvent) r10
            goto L28
        L27:
            r10 = r8
        L28:
            java.util.concurrent.CopyOnWriteArrayList r0 = p000.g10.f4192
            java.lang.Object r0 = r11.f5691
            java.lang.String r1 = "primary"
            boolean r10 = p000.g10.m2221(r0, r10, r1, r7)
            if (r10 == 0) goto L37
            r11.m3107(r8)
        L37:
            return
        L38:
            r11.getClass()
            java.lang.Object[] r10 = r11.f5692
            boolean r11 = p000.d00.m1636()
            if (r11 == 0) goto L58
            java.util.concurrent.atomic.AtomicLong r11 = p000.d00.f2829
            long r0 = r11.get()
            r2 = 0
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 <= 0) goto L58
            long r2 = android.os.SystemClock.elapsedRealtime()
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r11 > 0) goto L58
            goto L61
        L58:
            java.lang.String r11 = "key_ads_force_reward"
            boolean r11 = p000.ui1.m5887(r11, r7)
            if (r11 != 0) goto L61
            goto L74
        L61:
            r10.getClass()
            java.lang.Object r11 = p000.AbstractC0312g7.m2250(r10)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r11 = p000.ln0.m3626(r11, r0)
            if (r11 == 0) goto L74
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r10[r7] = r11
        L74:
            return
        L75:
            java.lang.String r10 = "LJI"
            java.lang.String r0 = "LIZLLL"
            r11.getClass()
            java.util.concurrent.atomic.AtomicLong r1 = p000.d00.f2829
            java.lang.String r1 = "key_ads_forge_more_reward"
            boolean r1 = p000.ui1.m5887(r1, r7)
            if (r1 != 0) goto L87
            goto Le4
        L87:
            java.lang.Object[] r11 = r11.f5692
            r11.getClass()
            java.lang.Object r11 = p000.AbstractC0312g7.m2253(r6, r11)
            if (r11 != 0) goto L93
            goto Le4
        L93:
            java.lang.Object r1 = p000.qe0.f8982     // Catch: java.lang.Throwable -> Lad
            java.lang.String r1 = "LIZ"
            java.lang.Class r2 = r11.getClass()     // Catch: java.lang.Throwable -> Lad
            java.lang.reflect.Field r1 = p000.qe0.m4878(r2, r1)     // Catch: java.lang.Throwable -> Lad
            r1.setBoolean(r11, r6)     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r1 = p000.qe0.m4879(r11, r0)     // Catch: java.lang.Throwable -> Lad
            boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> Lad
            if (r2 == 0) goto Laf
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Lad
            goto Lb0
        Lad:
            r10 = move-exception
            goto Ld7
        Laf:
            r1 = r8
        Lb0:
            if (r1 == 0) goto Lb8
            int r1 = r1.length()     // Catch: java.lang.Throwable -> Lad
            if (r1 != 0) goto Lbd
        Lb8:
            java.lang.String r1 = "额外金币奖励"
            p000.qe0.m4882(r0, r11, r1)     // Catch: java.lang.Throwable -> Lad
        Lbd:
            java.lang.Object r0 = p000.qe0.m4879(r11, r10)     // Catch: java.lang.Throwable -> Lad
            boolean r1 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> Lad
            if (r1 == 0) goto Lc8
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> Lad
            goto Lc9
        Lc8:
            r0 = r8
        Lc9:
            if (r0 == 0) goto Ld1
            int r0 = r0.length()     // Catch: java.lang.Throwable -> Lad
            if (r0 != 0) goto Le4
        Ld1:
            java.lang.String r0 = "恭喜获得翻倍权益"
            p000.qe0.m4882(r10, r11, r0)     // Catch: java.lang.Throwable -> Lad
            goto Le4
        Ld7:
            java.lang.String r10 = r10.getMessage()
            java.lang.String r11 = "下一阶段奖励参数保持原值: "
            java.lang.String r10 = p000.lz1.m3687(r11, r10)
            p000.C0888ux.m5988(r5, r10, r8, r4, r8)
        Le4:
            return
        Le5:
            r11.getClass()
            java.lang.Object[] r10 = r11.f5692
            java.util.concurrent.atomic.AtomicLong r11 = p000.d00.f2829
            boolean r11 = p000.d00.m1636()
            if (r11 != 0) goto Lf3
            goto L13f
        Lf3:
            r10.getClass()
            java.lang.Object r11 = p000.AbstractC0312g7.m2253(r7, r10)
            boolean r0 = r11 instanceof java.lang.Integer
            if (r0 == 0) goto L101
            java.lang.Integer r11 = (java.lang.Integer) r11
            goto L102
        L101:
            r11 = r8
        L102:
            if (r11 == 0) goto L13f
            int r11 = r11.intValue()
            java.lang.Object r0 = p000.AbstractC0312g7.m2253(r6, r10)
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L113
            r8 = r0
            java.lang.Integer r8 = (java.lang.Integer) r8
        L113:
            if (r8 == 0) goto L13f
            int r0 = r8.intValue()
            java.util.concurrent.atomic.AtomicLong r1 = p000.d00.f2829
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r4 = r4 + r2
            r1.set(r4)
            long r1 = (long) r11
            long r3 = (long) r0
            r5 = 1
            int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r11 >= 0) goto L12c
            r3 = r5
        L12c:
            long r0 = java.lang.Math.max(r1, r3)
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 <= 0) goto L138
            r0 = r2
        L138:
            int r11 = (int) r0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10[r7] = r11
        L13f:
            return
        L140:
            r11.getClass()
            java.util.concurrent.atomic.AtomicLong r10 = p000.d00.f2829
            boolean r10 = p000.d00.m1636()
            if (r10 != 0) goto L14d
            goto L1c2
        L14d:
            java.util.concurrent.atomic.AtomicLong r10 = p000.d00.f2829
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 + r2
            r10.set(r0)
            java.lang.Object[] r10 = r11.f5692
            r10.getClass()
            java.lang.Object r10 = p000.AbstractC0312g7.m2250(r10)
            java.util.Set r11 = p000.d00.f2830
            java.lang.String r0 = "RewardCompleteParams getter Hook 已安装: "
            java.lang.String r1 = "RewardCompleteParams 缺少 getWatchTime: "
            if (r10 != 0) goto L169
            goto L1c2
        L169:
            java.lang.Class r10 = r10.getClass()
            java.lang.String r2 = r10.getName()
            boolean r2 = r11.add(r2)
            if (r2 != 0) goto L178
            goto L1c2
        L178:
            xq0 r2 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L1a0
            java.lang.String r3 = "getWatchTime"
            xl r6 = new xl     // Catch: java.lang.Throwable -> L1a0
            r9 = 15
            r6.<init>(r9, r7)     // Catch: java.lang.Throwable -> L1a0
            java.util.Set r2 = r2.m6774(r10, r3, r6)     // Catch: java.lang.Throwable -> L1a0
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L1a0
            if (r2 == 0) goto L1a2
            java.lang.String r0 = r10.getName()     // Catch: java.lang.Throwable -> L1a0
            r11.remove(r0)     // Catch: java.lang.Throwable -> L1a0
            java.lang.String r0 = r10.getName()     // Catch: java.lang.Throwable -> L1a0
            java.lang.String r0 = r1.concat(r0)     // Catch: java.lang.Throwable -> L1a0
            p000.C0888ux.m5988(r5, r0, r8, r4, r8)     // Catch: java.lang.Throwable -> L1a0
            goto L1c2
        L1a0:
            r0 = move-exception
            goto L1ae
        L1a2:
            java.lang.String r1 = r10.getName()     // Catch: java.lang.Throwable -> L1a0
            java.lang.String r0 = r0.concat(r1)     // Catch: java.lang.Throwable -> L1a0
            p000.C0888ux.m5988(r5, r0, r8, r4, r8)     // Catch: java.lang.Throwable -> L1a0
            goto L1c2
        L1ae:
            java.lang.String r10 = r10.getName()
            r11.remove(r10)
            java.lang.String r10 = r0.getMessage()
            java.lang.String r11 = "RewardCompleteParams getter Hook 跳过: "
            java.lang.String r10 = p000.lz1.m3687(r11, r10)
            p000.C0888ux.m5988(r5, r10, r8, r4, r8)
        L1c2:
            return
        L1c3:
            r11.getClass()
            dm r10 = p000.C0217dm.f3216
            boolean r10 = p000.C0217dm.m1777(r1)
            if (r10 == 0) goto L1d1
            r11.m3107(r8)
        L1d1:
            return
        L1d2:
            r11.getClass()
            dm r10 = p000.C0217dm.f3216
            boolean r10 = p000.C0217dm.m1777(r1)
            if (r10 == 0) goto L1e2
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r11.m3107(r10)
        L1e2:
            return
    }
}
