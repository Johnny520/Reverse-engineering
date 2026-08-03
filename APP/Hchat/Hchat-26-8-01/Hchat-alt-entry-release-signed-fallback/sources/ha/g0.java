package ha;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r8.g f5206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.content.SharedPreferences f5207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.content.SharedPreferences f5208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f5209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f5210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile java.lang.reflect.Method f5211f;

    public g0(r8.g r2) {
            r1 = this;
            r2.getClass()
            r1.<init>()
            r1.f5206a = r2
            android.content.Context r2 = r2.f11620a
            java.lang.String r0 = "Hchat_original_moments_upload_config"
            android.content.SharedPreferences r0 = ub.b.c(r2, r0)
            r1.f5207b = r0
            java.lang.String r0 = "Hchat_original_moments_upload_method_cache"
            android.content.SharedPreferences r2 = ub.b.c(r2, r0)
            r1.f5208c = r2
            return
    }

    public static boolean c(java.lang.reflect.Method r4) {
            java.lang.Class[] r0 = r4.getParameterTypes()
            java.lang.Class r1 = r4.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            boolean r1 = gg.l.a(r1, r2)
            r2 = 0
            if (r1 == 0) goto L44
            java.lang.Class r4 = r4.getDeclaringClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r1 = "com.tencent.mm.plugin.gallery.ui.ImagePreviewUI"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L44
            int r4 = r0.length
            r1 = 3
            if (r4 != r1) goto L44
            r4 = r0[r2]
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            boolean r4 = gg.l.a(r4, r1)
            if (r4 == 0) goto L44
            r4 = 1
            r1 = r0[r4]
            java.lang.Class r3 = java.lang.Boolean.TYPE
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L44
            r1 = 2
            r0 = r0[r1]
            boolean r0 = gg.l.a(r0, r3)
            if (r0 == 0) goto L44
            return r4
        L44:
            return r2
    }

    public static boolean d(java.lang.reflect.Method r4) {
            java.lang.Class[] r0 = r4.getParameterTypes()
            int r1 = r4.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            r2 = 0
            if (r1 == 0) goto L3b
            java.lang.Class r1 = r4.getReturnType()
            java.lang.Class r3 = java.lang.Boolean.TYPE
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L3b
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage."
            boolean r4 = eh.a.A(r4, r2, r1)
            if (r4 == 0) goto L3b
            int r4 = r0.length
            r1 = 2
            if (r4 != r1) goto L3b
            r4 = r0[r2]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            boolean r4 = gg.l.a(r4, r1)
            if (r4 == 0) goto L3b
            r4 = 1
            r0 = r0[r4]
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L3b
            return r4
        L3b:
            return r2
    }

    public static boolean e(java.lang.reflect.Method r5) {
            java.lang.Class[] r0 = r5.getParameterTypes()
            java.lang.Class r1 = r5.getReturnType()
            java.lang.Class r2 = java.lang.Boolean.TYPE
            boolean r1 = gg.l.a(r1, r2)
            r3 = 0
            if (r1 == 0) goto L43
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage."
            boolean r5 = eh.a.A(r5, r3, r1)
            if (r5 == 0) goto L43
            int r5 = r0.length
            r1 = 4
            if (r5 < r1) goto L43
            r5 = r0[r3]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            boolean r5 = gg.l.a(r5, r1)
            if (r5 == 0) goto L43
            r5 = 1
            r4 = r0[r5]
            boolean r4 = gg.l.a(r4, r1)
            if (r4 == 0) goto L43
            r4 = 2
            r4 = r0[r4]
            boolean r1 = gg.l.a(r4, r1)
            if (r1 == 0) goto L43
            r1 = 3
            r0 = r0[r1]
            boolean r0 = gg.l.a(r0, r2)
            if (r0 == 0) goto L43
            return r5
        L43:
            return r3
    }

    public final java.util.List a(java.lang.String... r6) {
            r5 = this;
            r8.g r0 = r5.f5206a
            org.luckypray.dexkit.DexKitBridge r1 = r0.f11623d     // Catch: java.lang.Throwable -> L3d
            ch.e r2 = new ch.e     // Catch: java.lang.Throwable -> L3d
            r2.<init>()     // Catch: java.lang.Throwable -> L3d
            fh.k r3 = new fh.k     // Catch: java.lang.Throwable -> L3d
            r3.<init>()     // Catch: java.lang.Throwable -> L3d
            int r4 = r6.length     // Catch: java.lang.Throwable -> L3d
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r6, r4)     // Catch: java.lang.Throwable -> L3d
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch: java.lang.Throwable -> L3d
            r3.r0(r4)     // Catch: java.lang.Throwable -> L3d
            r2.f1666h = r3     // Catch: java.lang.Throwable -> L3d
            hh.p r1 = r1.findMethod(r2)     // Catch: java.lang.Throwable -> L3d
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3d
            r2.<init>()     // Catch: java.lang.Throwable -> L3d
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L3d
        L27:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L3d
            if (r3 == 0) goto L43
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L3d
            hh.o r3 = (hh.o) r3     // Catch: java.lang.Throwable -> L3d
            java.lang.ClassLoader r4 = r0.f11622c     // Catch: java.lang.Throwable -> L3d
            java.lang.reflect.Method r3 = r3.r(r4)     // Catch: java.lang.Throwable -> L3d
            r2.add(r3)     // Catch: java.lang.Throwable -> L3d
            goto L27
        L3d:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
        L43:
            java.lang.Throwable r0 = sf.g.b(r2)
            if (r0 != 0) goto L4a
            goto L5e
        L4a:
            r1 = 0
            r2 = 63
            java.lang.String r6 = tf.l.F0(r6, r1, r2)
            java.lang.String r1 = r0.getMessage()
            java.lang.String r2 = "[Hchat:OriginalMomentsUpload] DexKit 精确定位失败("
            java.lang.String r3 = "): "
            eh.a.w(r2, r6, r3, r1, r0)
            tf.t r2 = tf.t.f13167g
        L5e:
            java.util.List r2 = (java.util.List) r2
            return r2
    }

    public final synchronized boolean b(boolean r8) {
            r7 = this;
            java.lang.String r0 = "[Hchat:OriginalMomentsUpload] 安装朋友圈图片压缩 Hook 失败: "
            java.lang.String r1 = "[Hchat:OriginalMomentsUpload] 安装图库返回 Hook 失败: "
            monitor-enter(r7)
            java.lang.reflect.Method r2 = r7.g(r8)     // Catch: java.lang.Throwable -> Le
            if (r2 == 0) goto L10
            r7.f5211f = r2     // Catch: java.lang.Throwable -> Le
            goto L10
        Le:
            r8 = move-exception
            goto L79
        L10:
            boolean r2 = r7.f5209d     // Catch: java.lang.Throwable -> Le
            r3 = 1
            if (r2 != 0) goto L3d
            java.lang.reflect.Method r2 = r7.f(r8)     // Catch: java.lang.Throwable -> Le
            if (r2 == 0) goto L3d
            r8.i r4 = r8.i.f11631b     // Catch: java.lang.Throwable -> L29
            ha.f0 r5 = new ha.f0     // Catch: java.lang.Throwable -> L29
            r6 = 0
            r5.<init>(r7, r6)     // Catch: java.lang.Throwable -> L29
            r4.b(r2, r5)     // Catch: java.lang.Throwable -> L29
            r7.f5209d = r3     // Catch: java.lang.Throwable -> L29
            goto L3d
        L29:
            r2 = move-exception
            java.lang.String r4 = r2.getMessage()     // Catch: java.lang.Throwable -> Le
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le
            r5.<init>(r1)     // Catch: java.lang.Throwable -> Le
            r5.append(r4)     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> Le
            fb.v0.n(r1, r2)     // Catch: java.lang.Throwable -> Le
        L3d:
            boolean r1 = r7.f5210e     // Catch: java.lang.Throwable -> Le
            if (r1 != 0) goto L69
            java.lang.reflect.Method r8 = r7.h(r8)     // Catch: java.lang.Throwable -> Le
            if (r8 == 0) goto L69
            r8.i r1 = r8.i.f11631b     // Catch: java.lang.Throwable -> L55
            ha.f0 r2 = new ha.f0     // Catch: java.lang.Throwable -> L55
            r4 = 1
            r2.<init>(r7, r4)     // Catch: java.lang.Throwable -> L55
            r1.b(r8, r2)     // Catch: java.lang.Throwable -> L55
            r7.f5210e = r3     // Catch: java.lang.Throwable -> L55
            goto L69
        L55:
            r8 = move-exception
            java.lang.String r1 = r8.getMessage()     // Catch: java.lang.Throwable -> Le
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le
            r2.<init>(r0)     // Catch: java.lang.Throwable -> Le
            r2.append(r1)     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> Le
            fb.v0.n(r0, r8)     // Catch: java.lang.Throwable -> Le
        L69:
            boolean r8 = r7.f5209d     // Catch: java.lang.Throwable -> Le
            if (r8 == 0) goto L76
            boolean r8 = r7.f5210e     // Catch: java.lang.Throwable -> Le
            if (r8 == 0) goto L76
            java.lang.reflect.Method r8 = r7.f5211f     // Catch: java.lang.Throwable -> Le
            if (r8 == 0) goto L76
            goto L77
        L76:
            r3 = 0
        L77:
            monitor-exit(r7)
            return r3
        L79:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Le
            throw r8
    }

    public final java.lang.reflect.Method f(boolean r10) {
            r9 = this;
            java.lang.String r0 = r9.i()
            r8.g r1 = r9.f5206a
            java.lang.ClassLoader r2 = r1.f11622c
            android.content.SharedPreferences r3 = r9.f5208c
            java.lang.String r4 = "image_preview_send"
            java.lang.reflect.Method r2 = e8.b.c(r3, r0, r2, r4)
            r5 = 0
            if (r2 == 0) goto L1e
            boolean r6 = c(r2)
            if (r6 == 0) goto L1a
            goto L1b
        L1a:
            r2 = r5
        L1b:
            if (r2 == 0) goto L1e
            return r2
        L1e:
            if (r10 != 0) goto L21
            return r5
        L21:
            java.lang.String r10 = "CropImage_OutputPath_List"
            java.lang.String r2 = "key_select_video_list"
            java.lang.String[] r10 = new java.lang.String[]{r10, r2}
            org.luckypray.dexkit.DexKitBridge r2 = r1.f11623d     // Catch: java.lang.Throwable -> L61
            ch.e r6 = new ch.e     // Catch: java.lang.Throwable -> L61
            r6.<init>()     // Catch: java.lang.Throwable -> L61
            fh.k r7 = new fh.k     // Catch: java.lang.Throwable -> L61
            r7.<init>()     // Catch: java.lang.Throwable -> L61
            java.util.List r8 = tf.l.L0(r10)     // Catch: java.lang.Throwable -> L61
            fh.k.u0(r7, r8)     // Catch: java.lang.Throwable -> L61
            r6.f1666h = r7     // Catch: java.lang.Throwable -> L61
            hh.p r2 = r2.findMethod(r6)     // Catch: java.lang.Throwable -> L61
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L61
            r6.<init>()     // Catch: java.lang.Throwable -> L61
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L61
        L4b:
            boolean r7 = r2.hasNext()     // Catch: java.lang.Throwable -> L61
            if (r7 == 0) goto L67
            java.lang.Object r7 = r2.next()     // Catch: java.lang.Throwable -> L61
            hh.o r7 = (hh.o) r7     // Catch: java.lang.Throwable -> L61
            java.lang.ClassLoader r8 = r1.f11622c     // Catch: java.lang.Throwable -> L61
            java.lang.reflect.Method r7 = r7.r(r8)     // Catch: java.lang.Throwable -> L61
            r6.add(r7)     // Catch: java.lang.Throwable -> L61
            goto L4b
        L61:
            r1 = move-exception
            sf.f r6 = new sf.f
            r6.<init>(r1)
        L67:
            java.lang.Throwable r1 = sf.g.b(r6)
            if (r1 != 0) goto L6e
            goto L81
        L6e:
            r2 = 63
            java.lang.String r10 = tf.l.F0(r10, r5, r2)
            java.lang.String r2 = r1.getMessage()
            java.lang.String r6 = "[Hchat:OriginalMomentsUpload] DexKit 定位失败("
            java.lang.String r7 = "): "
            eh.a.w(r6, r10, r7, r2, r1)
            tf.t r6 = tf.t.f13167g
        L81:
            java.util.List r6 = (java.util.List) r6
            java.util.Iterator r10 = r6.iterator()
        L87:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L9b
            java.lang.Object r1 = r10.next()
            r2 = r1
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            boolean r2 = c(r2)
            if (r2 == 0) goto L87
            r5 = r1
        L9b:
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            if (r5 == 0) goto La3
            e8.b.h(r3, r0, r4, r5)
            goto Lc3
        La3:
            java.lang.String r10 = "cache.key"
            android.content.SharedPreferences$Editor r1 = r3.edit()     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r2 = ""
            java.lang.String r2 = r3.getString(r10, r2)     // Catch: java.lang.Throwable -> Lc3
            boolean r2 = gg.l.a(r2, r0)     // Catch: java.lang.Throwable -> Lc3
            if (r2 != 0) goto Lbc
            android.content.SharedPreferences$Editor r2 = r1.clear()     // Catch: java.lang.Throwable -> Lc3
            r2.putString(r10, r0)     // Catch: java.lang.Throwable -> Lc3
        Lbc:
            android.content.SharedPreferences$Editor r10 = r1.remove(r4)     // Catch: java.lang.Throwable -> Lc3
            r10.apply()     // Catch: java.lang.Throwable -> Lc3
        Lc3:
            return r5
    }

    public final java.lang.reflect.Method g(boolean r7) {
            r6 = this;
            java.lang.String r0 = r6.i()
            r8.g r1 = r6.f5206a
            java.lang.ClassLoader r1 = r1.f11622c
            android.content.SharedPreferences r2 = r6.f5208c
            java.lang.String r3 = "sns_convert_img_without_zip"
            java.lang.reflect.Method r1 = e8.b.c(r2, r0, r1, r3)
            r4 = 0
            if (r1 == 0) goto L1e
            boolean r5 = d(r1)
            if (r5 == 0) goto L1a
            goto L1b
        L1a:
            r1 = r4
        L1b:
            if (r1 == 0) goto L1e
            return r1
        L1e:
            if (r7 != 0) goto L21
            return r4
        L21:
            java.lang.String r7 = "MicroMsg.snsMediaStorage"
            java.lang.String r1 = "convertImg2WxamWithoutZip origPath:%s OutOfMemoryError! rollback"
            java.lang.String[] r7 = new java.lang.String[]{r7, r1}
            java.util.List r7 = r6.a(r7)
            java.util.Iterator r7 = r7.iterator()
        L31:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L45
            java.lang.Object r1 = r7.next()
            r5 = r1
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            boolean r5 = d(r5)
            if (r5 == 0) goto L31
            r4 = r1
        L45:
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            if (r4 == 0) goto L4d
            e8.b.h(r2, r0, r3, r4)
            return r4
        L4d:
            java.lang.String r7 = "cache.key"
            android.content.SharedPreferences$Editor r1 = r2.edit()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r5 = ""
            java.lang.String r2 = r2.getString(r7, r5)     // Catch: java.lang.Throwable -> L6d
            boolean r2 = gg.l.a(r2, r0)     // Catch: java.lang.Throwable -> L6d
            if (r2 != 0) goto L66
            android.content.SharedPreferences$Editor r2 = r1.clear()     // Catch: java.lang.Throwable -> L6d
            r2.putString(r7, r0)     // Catch: java.lang.Throwable -> L6d
        L66:
            android.content.SharedPreferences$Editor r7 = r1.remove(r3)     // Catch: java.lang.Throwable -> L6d
            r7.apply()     // Catch: java.lang.Throwable -> L6d
        L6d:
            return r4
    }

    public final java.lang.reflect.Method h(boolean r9) {
            r8 = this;
            java.lang.String r0 = r8.i()
            r8.g r1 = r8.f5206a
            java.lang.ClassLoader r1 = r1.f11622c
            android.content.SharedPreferences r2 = r8.f5208c
            java.lang.String r3 = "sns_create_pic"
            java.lang.reflect.Method r1 = e8.b.c(r2, r0, r1, r3)
            r4 = 0
            if (r1 == 0) goto L1e
            boolean r5 = e(r1)
            if (r5 == 0) goto L1a
            goto L1b
        L1a:
            r1 = r4
        L1b:
            if (r1 == 0) goto L1e
            return r1
        L1e:
            if (r9 != 0) goto L21
            return r4
        L21:
            java.lang.String r9 = "SnsCompressResolutionFor4G"
            java.lang.String r1 = "SnsCompressResolutionForWifi"
            java.lang.String r5 = "MicroMsg.snsMediaStorage"
            java.lang.String r6 = "SnsCompressResolutionFor2G"
            java.lang.String r7 = "SnsCompressResolutionFor3G"
            java.lang.String[] r9 = new java.lang.String[]{r5, r6, r7, r9, r1}
            java.util.List r9 = r8.a(r9)
            java.util.Iterator r9 = r9.iterator()
        L37:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L4b
            java.lang.Object r1 = r9.next()
            r5 = r1
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            boolean r5 = e(r5)
            if (r5 == 0) goto L37
            r4 = r1
        L4b:
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            if (r4 == 0) goto L53
            e8.b.h(r2, r0, r3, r4)
            return r4
        L53:
            java.lang.String r9 = "cache.key"
            android.content.SharedPreferences$Editor r1 = r2.edit()     // Catch: java.lang.Throwable -> L73
            java.lang.String r5 = ""
            java.lang.String r2 = r2.getString(r9, r5)     // Catch: java.lang.Throwable -> L73
            boolean r2 = gg.l.a(r2, r0)     // Catch: java.lang.Throwable -> L73
            if (r2 != 0) goto L6c
            android.content.SharedPreferences$Editor r2 = r1.clear()     // Catch: java.lang.Throwable -> L73
            r2.putString(r9, r0)     // Catch: java.lang.Throwable -> L73
        L6c:
            android.content.SharedPreferences$Editor r9 = r1.remove(r3)     // Catch: java.lang.Throwable -> L73
            r9.apply()     // Catch: java.lang.Throwable -> L73
        L73:
            return r4
    }

    public final java.lang.String i() {
            r3 = this;
            r8.g r0 = r3.f5206a
            android.content.Context r1 = r0.f11620a
            java.lang.ClassLoader r0 = r0.f11622c
            r0.getClass()
            l8.i r0 = o8.k.a(r1, r0)
            java.lang.String r0 = r0.f7933h
            boolean r1 = og.m.t0(r0)
            r2 = 0
            if (r1 != 0) goto L17
            goto L18
        L17:
            r0 = r2
        L18:
            if (r0 == 0) goto L20
            java.lang.String r1 = "|original_moments_upload_v2"
            java.lang.String r2 = r0.concat(r1)
        L20:
            if (r2 != 0) goto L25
            java.lang.String r0 = ""
            return r0
        L25:
            return r2
    }
}
