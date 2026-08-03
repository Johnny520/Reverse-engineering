package ha;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ha.g0 f5198b;

    public /* synthetic */ f0(ha.g0 r1, int r2) {
            r0 = this;
            r0.f5197a = r2
            r0.f5198b = r1
            r0.<init>()
            return
    }

    public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r4) {
            r3 = this;
            int r0 = r3.f5197a
            switch(r0) {
                case 0: goto L9;
                default: goto L5;
            }
        L5:
            super.afterHookedMethod(r4)
            return
        L9:
            r4.getClass()
            ha.g0 r0 = r3.f5198b
            android.content.SharedPreferences r0 = r0.f5207b
            java.lang.String r1 = "original_moments_upload_enable"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 != 0) goto L1a
            goto L38
        L1a:
            java.lang.Object[] r4 = r4.args
            r0 = 0
            if (r4 == 0) goto L24
            java.lang.Object r4 = tf.l.z0(r4)
            goto L25
        L24:
            r4 = r0
        L25:
            boolean r1 = r4 instanceof android.content.Intent
            if (r1 == 0) goto L2c
            r0 = r4
            android.content.Intent r0 = (android.content.Intent) r0
        L2c:
            if (r0 == 0) goto L38
            java.lang.String r4 = "CropImage_Compress_Img"
            r0.putExtra(r4, r2)
            java.lang.String r4 = "key_delete_origin_file"
            r0.putExtra(r4, r2)
        L38:
            return
    }

    public final void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r13) {
            r12 = this;
            int r0 = r12.f5197a
            r13.getClass()
            switch(r0) {
                case 0: goto L153;
                default: goto L8;
            }
        L8:
            ha.g0 r0 = r12.f5198b
            android.content.SharedPreferences r0 = r0.f5207b
            java.lang.String r1 = "original_moments_upload_enable"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 != 0) goto L17
            goto L152
        L17:
            ha.g0 r0 = r12.f5198b
            java.lang.Object[] r1 = r13.args
            if (r1 == 0) goto L152
            int r3 = r1.length
            r4 = 3
            if (r3 >= r4) goto L23
            goto L152
        L23:
            r3 = r1[r2]
            boolean r4 = r3 instanceof java.lang.String
            r5 = 0
            if (r4 == 0) goto L2d
            java.lang.String r3 = (java.lang.String) r3
            goto L2e
        L2d:
            r3 = r5
        L2e:
            if (r3 == 0) goto L152
            r4 = 1
            r6 = r1[r4]
            boolean r7 = r6 instanceof java.lang.String
            if (r7 == 0) goto L3a
            java.lang.String r6 = (java.lang.String) r6
            goto L3b
        L3a:
            r6 = r5
        L3b:
            if (r6 == 0) goto L152
            r7 = 2
            r1 = r1[r7]
            boolean r7 = r1 instanceof java.lang.String
            if (r7 == 0) goto L47
            java.lang.String r1 = (java.lang.String) r1
            goto L48
        L47:
            r1 = r5
        L48:
            if (r1 == 0) goto L152
            boolean r7 = og.m.t0(r3)
            if (r7 != 0) goto L152
            boolean r7 = og.m.t0(r6)
            if (r7 != 0) goto L152
            boolean r7 = og.m.t0(r1)
            if (r7 == 0) goto L5e
            goto L152
        L5e:
            java.lang.String r7 = r3.concat(r1)
            java.lang.reflect.Method r8 = r0.f5211f     // Catch: java.lang.Throwable -> L79
            if (r8 == 0) goto L7b
            java.lang.Object[] r7 = new java.lang.Object[]{r6, r7}     // Catch: java.lang.Throwable -> L79
            java.lang.Object r7 = h.Hchat.utils.KavaReflector.invoke(r8, r5, r7)     // Catch: java.lang.Throwable -> L79
            java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L79
            boolean r7 = gg.l.a(r7, r8)     // Catch: java.lang.Throwable -> L79
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L79
            goto L83
        L79:
            r7 = move-exception
            goto L7d
        L7b:
            r7 = r2
            goto L9b
        L7d:
            sf.f r8 = new sf.f
            r8.<init>(r7)
            r7 = r8
        L83:
            java.lang.Throwable r8 = sf.g.b(r7)
            if (r8 != 0) goto L8a
            goto L95
        L8a:
            java.lang.String r7 = r8.getMessage()
            java.lang.String r9 = "[Hchat:OriginalMomentsUpload] 原图无压缩转换失败: "
            eh.a.x(r9, r7, r8)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
        L95:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
        L9b:
            if (r7 == 0) goto La4
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r13.setResult(r0)
            goto L152
        La4:
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r8.g r0 = r0.f5206a     // Catch: java.lang.Throwable -> L117
            java.lang.ClassLoader r0 = r0.f11622c     // Catch: java.lang.Throwable -> L117
            java.lang.String r8 = "com.tencent.mm.vfs.w6"
            java.lang.Class r0 = h.Hchat.utils.KavaReflector.loadClass(r8, r0)     // Catch: java.lang.Throwable -> L117
            if (r0 == 0) goto L14b
            java.lang.String r8 = "j"
            java.lang.Class[] r9 = new java.lang.Class[]{r7}     // Catch: java.lang.Throwable -> L117
            java.lang.reflect.Method r8 = h.Hchat.utils.KavaReflector.findDeclaredMethod(r0, r8, r9)     // Catch: java.lang.Throwable -> L117
            java.lang.String r9 = "u"
            java.lang.Class[] r10 = new java.lang.Class[]{r7}     // Catch: java.lang.Throwable -> L117
            java.lang.reflect.Method r9 = h.Hchat.utils.KavaReflector.findDeclaredMethod(r0, r9, r10)     // Catch: java.lang.Throwable -> L117
            java.lang.String r10 = "c"
            java.lang.Class[] r11 = new java.lang.Class[]{r7, r7}     // Catch: java.lang.Throwable -> L117
            java.lang.reflect.Method r10 = h.Hchat.utils.KavaReflector.findDeclaredMethod(r0, r10, r11)     // Catch: java.lang.Throwable -> L117
            java.lang.String r11 = "k"
            java.lang.Class[] r7 = new java.lang.Class[]{r7}     // Catch: java.lang.Throwable -> L117
            java.lang.reflect.Method r0 = h.Hchat.utils.KavaReflector.findDeclaredMethod(r0, r11, r7)     // Catch: java.lang.Throwable -> L117
            if (r8 == 0) goto L14b
            if (r9 == 0) goto L14b
            if (r10 == 0) goto L14b
            if (r0 != 0) goto Le4
            goto L14b
        Le4:
            java.lang.Object[] r7 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L117
            java.lang.Object r7 = h.Hchat.utils.KavaReflector.invoke(r8, r5, r7)     // Catch: java.lang.Throwable -> L117
            java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L117
            boolean r7 = gg.l.a(r7, r8)     // Catch: java.lang.Throwable -> L117
            if (r7 != 0) goto Lf5
            goto L14b
        Lf5:
            java.lang.Object[] r7 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L117
            h.Hchat.utils.KavaReflector.invoke(r9, r5, r7)     // Catch: java.lang.Throwable -> L117
            java.lang.String r1 = r3.concat(r1)     // Catch: java.lang.Throwable -> L117
            java.lang.Object[] r3 = new java.lang.Object[]{r6, r1}     // Catch: java.lang.Throwable -> L117
            h.Hchat.utils.KavaReflector.invoke(r10, r5, r3)     // Catch: java.lang.Throwable -> L117
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L117
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invoke(r0, r5, r1)     // Catch: java.lang.Throwable -> L117
            boolean r1 = r0 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L117
            if (r1 == 0) goto L119
            r5 = r0
            java.lang.Number r5 = (java.lang.Number) r5     // Catch: java.lang.Throwable -> L117
            goto L119
        L117:
            r0 = move-exception
            goto L12d
        L119:
            r0 = 0
            if (r5 == 0) goto L122
            long r5 = r5.longValue()     // Catch: java.lang.Throwable -> L117
            goto L123
        L122:
            r5 = r0
        L123:
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L128
            r2 = r4
        L128:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L117
            goto L133
        L12d:
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L133:
            java.lang.Throwable r1 = sf.g.b(r0)
            if (r1 != 0) goto L13a
            goto L145
        L13a:
            java.lang.String r0 = r1.getMessage()
            java.lang.String r2 = "[Hchat:OriginalMomentsUpload] 原图复制失败: "
            eh.a.x(r2, r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L145:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r2 = r0.booleanValue()
        L14b:
            if (r2 == 0) goto L152
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r13.setResult(r0)
        L152:
            return
        L153:
            ha.g0 r0 = r12.f5198b
            android.content.SharedPreferences r0 = r0.f5207b
            java.lang.String r1 = "original_moments_upload_enable"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 != 0) goto L161
            goto L194
        L161:
            java.lang.Object[] r13 = r13.args
            if (r13 == 0) goto L194
            int r0 = r13.length
            r1 = 3
            if (r0 >= r1) goto L16a
            goto L194
        L16a:
            r0 = r13[r2]
            boolean r0 = r0 instanceof android.content.Intent
            if (r0 != 0) goto L171
            goto L194
        L171:
            r0 = 1
            r1 = r13[r0]
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L183
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r13[r0] = r1
            r0 = 2
            r13[r0] = r1
        L183:
            r13 = r13[r2]
            boolean r0 = r13 instanceof android.content.Intent
            if (r0 == 0) goto L18c
            android.content.Intent r13 = (android.content.Intent) r13
            goto L18d
        L18c:
            r13 = 0
        L18d:
            if (r13 == 0) goto L194
            java.lang.String r0 = "CropImage_Compress_Img"
            r13.putExtra(r0, r2)
        L194:
            return
    }
}
