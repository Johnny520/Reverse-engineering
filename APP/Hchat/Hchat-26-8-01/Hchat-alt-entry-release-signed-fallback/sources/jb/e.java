package jb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r8.g f6858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ia.t f6859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.content.SharedPreferences f6860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.Set f6861d;

    public e(r8.g r1, ia.t r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f6858a = r1
            r0.f6859b = r2
            android.content.Context r1 = r1.f11620a
            java.lang.String r2 = "Hchat_finder_media_download_method_cache"
            android.content.SharedPreferences r1 = ub.b.c(r1, r2)
            r0.f6860c = r1
            java.util.Set r1 = j8.b.o()
            r0.f6861d = r1
            return
    }

    public static java.lang.Object b(java.lang.Object r6) {
            if (r6 != 0) goto L3
            goto L51
        L3:
            boolean r0 = e(r6)
            if (r0 == 0) goto La
            return r6
        La:
            java.lang.Class r0 = r6.getClass()
        Le:
            if (r0 == 0) goto L51
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L51
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredFields(r0)
            java.util.Iterator r1 = r1.iterator()
        L20:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4c
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            java.lang.Class r3 = r2.getType()
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = "com.tencent.mm.plugin.finder.model.BaseFinderFeed"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L45
            java.lang.String r4 = "BaseFinderFeed"
            r5 = 0
            boolean r3 = og.m.h0(r3, r4, r5)
            if (r3 == 0) goto L20
        L45:
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r2, r6)
            if (r2 == 0) goto L20
            return r2
        L4c:
            java.lang.Class r0 = r0.getSuperclass()
            goto Le
        L51:
            r6 = 0
            return r6
    }

    public static java.lang.String d(org.json.JSONObject r2) {
            if (r2 != 0) goto L3
            goto L25
        L3:
            java.lang.String r0 = i(r2)
            boolean r1 = og.m.t0(r0)
            if (r1 != 0) goto Le
            return r0
        Le:
            java.lang.String r0 = "url"
            java.lang.String r0 = r2.optString(r0)
            java.lang.String r1 = "url_token"
            java.lang.String r2 = r2.optString(r1)
            java.lang.String r2 = bc.e.i(r0, r2)
            boolean r0 = og.m.t0(r2)
            if (r0 != 0) goto L25
            return r2
        L25:
            r2 = 0
            return r2
    }

    public static boolean e(java.lang.Object r2) {
            r0 = 0
            if (r2 == 0) goto L1d
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r1 = "com.tencent.mm.plugin.finder.model.BaseFinderFeed"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L1b
            java.lang.String r1 = "BaseFinderFeed"
            boolean r2 = og.m.h0(r2, r1, r0)
            if (r2 == 0) goto L1d
        L1b:
            r2 = 1
            return r2
        L1d:
            return r0
    }

    public static boolean f(java.lang.reflect.Method r5) {
            java.lang.Class[] r5 = r5.getParameterTypes()
            r5.getClass()
            int r0 = r5.length
            r1 = 0
            r2 = r1
        La:
            if (r2 >= r0) goto L1b
            r3 = r5[r2]
            java.lang.Class<android.view.MenuItem> r4 = android.view.MenuItem.class
            boolean r3 = r4.isAssignableFrom(r3)
            if (r3 == 0) goto L18
            r5 = 1
            return r5
        L18:
            int r2 = r2 + 1
            goto La
        L1b:
            return r1
    }

    public static boolean g(java.lang.reflect.Method r5) {
            java.lang.Class[] r5 = r5.getParameterTypes()
            r5.getClass()
            int r0 = r5.length
            r1 = 0
            r2 = r1
        La:
            if (r2 >= r0) goto L1b
            r3 = r5[r2]
            java.lang.Class<android.view.ContextMenu> r4 = android.view.ContextMenu.class
            boolean r3 = r4.isAssignableFrom(r3)
            if (r3 == 0) goto L18
            r5 = 1
            return r5
        L18:
            int r2 = r2 + 1
            goto La
        L1b:
            return r1
    }

    public static java.lang.String h(org.json.JSONObject r5, java.lang.String... r6) {
            int r0 = r6.length
            r1 = 0
        L2:
            r2 = 0
            if (r1 >= r0) goto L1b
            r3 = r6[r1]
            java.lang.String r3 = r5.optString(r3)
            r3.getClass()
            boolean r4 = og.m.t0(r3)
            if (r4 != 0) goto L15
            r2 = r3
        L15:
            if (r2 == 0) goto L18
            goto L1b
        L18:
            int r1 = r1 + 1
            goto L2
        L1b:
            if (r2 != 0) goto L20
            java.lang.String r5 = ""
            return r5
        L20:
            return r2
    }

    public static java.lang.String i(org.json.JSONObject r4) {
            java.lang.String r0 = ""
            if (r4 != 0) goto L5
            goto L24
        L5:
            java.lang.String r1 = "media_cdn_info"
            org.json.JSONObject r1 = r4.optJSONObject(r1)
            java.lang.String r2 = "pcdn_url"
            if (r1 == 0) goto L14
            java.lang.String r1 = r1.optString(r2)
            goto L15
        L14:
            r1 = 0
        L15:
            if (r1 != 0) goto L18
            r1 = r0
        L18:
            boolean r3 = og.m.t0(r1)
            if (r3 == 0) goto L26
            java.lang.String r4 = r4.optString(r2)
            if (r4 != 0) goto L25
        L24:
            return r0
        L25:
            return r4
        L26:
            return r1
    }

    public final void a(android.view.ContextMenu r9, int r10, java.lang.String r11, int r12) {
            r8 = this;
            int r0 = r9.size()
            r1 = 0
            r2 = r1
        L6:
            r3 = 0
            if (r2 < r0) goto Lb
            r4 = r3
            goto L15
        Lb:
            android.view.MenuItem r4 = r9.getItem(r2)
            int r5 = r4.getItemId()
            if (r5 != r10) goto Ld6
        L15:
            if (r4 == 0) goto L19
            goto Ld5
        L19:
            r8.g r0 = r8.f6858a
            android.content.Context r2 = r0.f11621b     // Catch: java.lang.Throwable -> L40
            android.graphics.drawable.Drawable r12 = r2.getDrawable(r12)     // Catch: java.lang.Throwable -> L40
            if (r12 == 0) goto L42
            android.graphics.drawable.Drawable r12 = r12.mutate()     // Catch: java.lang.Throwable -> L40
            if (r12 == 0) goto L42
            android.content.Context r0 = r0.f11620a     // Catch: java.lang.Throwable -> L40
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Throwable -> L40
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch: java.lang.Throwable -> L40
            float r0 = r0.density     // Catch: java.lang.Throwable -> L40
            r2 = 1107296256(0x42000000, float:32.0)
            float r0 = r0 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r2
            int r0 = (int) r0     // Catch: java.lang.Throwable -> L40
            r12.setBounds(r1, r1, r0, r0)     // Catch: java.lang.Throwable -> L40
            goto L4a
        L40:
            r12 = move-exception
            goto L44
        L42:
            r12 = r3
            goto L4a
        L44:
            sf.f r0 = new sf.f
            r0.<init>(r12)
            r12 = r0
        L4a:
            boolean r0 = r12 instanceof sf.f
            if (r0 == 0) goto L50
            r12 = r3
        L50:
            android.graphics.drawable.Drawable r12 = (android.graphics.drawable.Drawable) r12
            java.lang.Class r0 = r9.getClass()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L5b:
            if (r0 == 0) goto L71
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L71
            java.util.List r4 = h.Hchat.utils.KavaReflector.declaredMethods(r0)
            tf.r.h1(r2, r4)
            java.lang.Class r0 = r0.getSuperclass()
            goto L5b
        L71:
            java.util.Iterator r0 = r2.iterator()
        L75:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lbb
            java.lang.Object r2 = r0.next()
            r4 = r2
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.Class[] r5 = r4.getParameterTypes()
            int r5 = r5.length
            r6 = 3
            if (r5 != r6) goto Lb7
            java.lang.Class[] r5 = r4.getParameterTypes()
            r5 = r5[r1]
            java.lang.Class r6 = java.lang.Integer.TYPE
            boolean r5 = gg.l.a(r5, r6)
            if (r5 == 0) goto Lb7
            java.lang.Class[] r5 = r4.getParameterTypes()
            r6 = 1
            r5 = r5[r6]
            java.lang.Class<java.lang.CharSequence> r7 = java.lang.CharSequence.class
            boolean r5 = r7.isAssignableFrom(r5)
            if (r5 == 0) goto Lb7
            java.lang.Class[] r4 = r4.getParameterTypes()
            r5 = 2
            r4 = r4[r5]
            java.lang.Class<android.graphics.drawable.Drawable> r5 = android.graphics.drawable.Drawable.class
            boolean r4 = r5.isAssignableFrom(r4)
            if (r4 == 0) goto Lb7
            goto Lb8
        Lb7:
            r6 = r1
        Lb8:
            if (r6 == 0) goto L75
            r3 = r2
        Lbb:
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r11, r12}
            boolean r0 = h.Hchat.utils.KavaReflector.invokeSuccessfully(r3, r9, r0)
            if (r0 == 0) goto Lcc
            goto Ld5
        Lcc:
            android.view.MenuItem r9 = r9.add(r1, r10, r1, r11)
            if (r12 == 0) goto Ld5
            r9.setIcon(r12)
        Ld5:
            return
        Ld6:
            int r2 = r2 + 1
            goto L6
    }

    public final java.util.List c(java.lang.String... r5) {
            r4 = this;
            r8.g r0 = r4.f6858a
            org.luckypray.dexkit.DexKitBridge r1 = r0.f11623d     // Catch: java.lang.Throwable -> L4c
            ch.e r2 = new ch.e     // Catch: java.lang.Throwable -> L4c
            r2.<init>()     // Catch: java.lang.Throwable -> L4c
            fh.k r3 = new fh.k     // Catch: java.lang.Throwable -> L4c
            r3.<init>()     // Catch: java.lang.Throwable -> L4c
            java.util.List r5 = tf.l.L0(r5)     // Catch: java.lang.Throwable -> L4c
            fh.k.u0(r3, r5)     // Catch: java.lang.Throwable -> L4c
            r2.f1666h = r3     // Catch: java.lang.Throwable -> L4c
            hh.p r5 = r1.findMethod(r2)     // Catch: java.lang.Throwable -> L4c
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4c
            r1.<init>()     // Catch: java.lang.Throwable -> L4c
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L4c
        L24:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Throwable -> L4c
            if (r2 == 0) goto L4e
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Throwable -> L4c
            hh.o r2 = (hh.o) r2     // Catch: java.lang.Throwable -> L4c
            java.lang.ClassLoader r3 = r0.f11622c     // Catch: java.lang.Throwable -> L37
            java.lang.reflect.Method r2 = r2.r(r3)     // Catch: java.lang.Throwable -> L37
            goto L3e
        L37:
            r2 = move-exception
            sf.f r3 = new sf.f     // Catch: java.lang.Throwable -> L4c
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L4c
            r2 = r3
        L3e:
            boolean r3 = r2 instanceof sf.f     // Catch: java.lang.Throwable -> L4c
            if (r3 == 0) goto L44
            r2 = 0
        L44:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Throwable -> L4c
            if (r2 == 0) goto L24
            r1.add(r2)     // Catch: java.lang.Throwable -> L4c
            goto L24
        L4c:
            r5 = move-exception
            goto L77
        L4e:
            java.util.HashSet r5 = new java.util.HashSet     // Catch: java.lang.Throwable -> L4c
            r5.<init>()     // Catch: java.lang.Throwable -> L4c
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4c
            r0.<init>()     // Catch: java.lang.Throwable -> L4c
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L4c
        L5c:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L4c
            if (r2 == 0) goto L7c
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L4c
            r3 = r2
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch: java.lang.Throwable -> L4c
            java.lang.String r3 = r3.toGenericString()     // Catch: java.lang.Throwable -> L4c
            boolean r3 = r5.add(r3)     // Catch: java.lang.Throwable -> L4c
            if (r3 == 0) goto L5c
            r0.add(r2)     // Catch: java.lang.Throwable -> L4c
            goto L5c
        L77:
            sf.f r0 = new sf.f
            r0.<init>(r5)
        L7c:
            java.lang.Throwable r5 = sf.g.b(r0)
            if (r5 != 0) goto L83
            goto L8c
        L83:
            ia.t r0 = r4.f6859b
            java.lang.String r1 = "视频号菜单DexKit定位失败"
            r0.invoke(r1, r5)
            tf.t r0 = tf.t.f13167g
        L8c:
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    public final void j(java.lang.String r4, java.lang.String r5, java.util.List r6) {
            r3 = this;
            boolean r0 = r6.isEmpty()
            android.content.SharedPreferences r1 = r3.f6860c
            if (r0 != 0) goto Le
            e8.b r0 = e8.b.f2358a
            r0.j(r1, r4, r5, r6)
            return
        Le:
            java.lang.String r6 = "cache.key"
            r1.getClass()
            android.content.SharedPreferences$Editor r0 = r1.edit()     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = ""
            java.lang.String r1 = r1.getString(r6, r2)     // Catch: java.lang.Throwable -> L31
            boolean r1 = gg.l.a(r1, r4)     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto L2a
            android.content.SharedPreferences$Editor r1 = r0.clear()     // Catch: java.lang.Throwable -> L31
            r1.putString(r6, r4)     // Catch: java.lang.Throwable -> L31
        L2a:
            android.content.SharedPreferences$Editor r4 = r0.remove(r5)     // Catch: java.lang.Throwable -> L31
            r4.apply()     // Catch: java.lang.Throwable -> L31
        L31:
            return
    }

    public final void k(java.lang.String r4) {
            r3 = this;
            i8.e r0 = h.Hchat.hooks.api.core.WeChatApis.runtime()
            r0.getClass()
            o8.j r0 = h.Hchat.hooks.api.core.WeChatApis.p()
            if (r0 == 0) goto L17
            jb.b r1 = new jb.b
            r2 = 0
            r1.<init>(r3, r4, r2)
            r0.e(r1)
            return
        L17:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            jb.b r1 = new jb.b
            r2 = 1
            r1.<init>(r3, r4, r2)
            r0.post(r1)
            return
    }
}
