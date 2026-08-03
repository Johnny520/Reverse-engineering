package s9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r8.g f12395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.content.SharedPreferences f12396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.content.SharedPreferences f12397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f12398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap.KeySetView f12399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.Map f12400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f12401g;

    public b(r8.g r2) {
            r1 = this;
            r2.getClass()
            r1.<init>()
            r1.f12395a = r2
            android.content.Context r2 = r2.f11620a
            java.lang.String r0 = "Hchat_hide_chat_avatar_config"
            android.content.SharedPreferences r0 = ub.b.c(r2, r0)
            r1.f12396b = r0
            java.lang.String r0 = "Hchat_hide_chat_avatar_method_cache"
            android.content.SharedPreferences r2 = ub.b.c(r2, r0)
            r1.f12397c = r2
            java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap
            r2.<init>()
            r1.f12398d = r2
            java.util.concurrent.ConcurrentHashMap$KeySetView r2 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            r1.f12399e = r2
            java.util.Map r2 = p.a.p()
            r1.f12400f = r2
            return
    }

    public static java.lang.Boolean d(java.lang.Object r3) {
            boolean r0 = r3 instanceof java.lang.Boolean
            if (r0 == 0) goto L7
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            return r3
        L7:
            boolean r0 = r3 instanceof java.lang.Number
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1b
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r3 != r2) goto L16
            r1 = r2
        L16:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            return r3
        L1b:
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L3b
            java.lang.String r3 = (java.lang.String) r3
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            java.lang.Integer r3 = og.t.f0(r3)
            if (r3 == 0) goto L3b
            int r3 = r3.intValue()
            if (r3 != r2) goto L36
            r1 = r2
        L36:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            return r3
        L3b:
            r3 = 0
            return r3
    }

    public final s9.a a(java.lang.Class r12) {
            r11 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r11.f12398d
            java.lang.Object r1 = r0.get(r12)
            s9.a r1 = (s9.a) r1
            if (r1 == 0) goto Lb
            return r1
        Lb:
            java.util.concurrent.ConcurrentHashMap$KeySetView r1 = r11.f12399e
            boolean r2 = r1.contains(r12)
            r3 = 0
            if (r2 == 0) goto L15
            return r3
        L15:
            r2 = r12
            r4 = r3
            r5 = r4
        L18:
            if (r2 == 0) goto L7c
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto L7c
            java.util.List r6 = h.Hchat.utils.KavaReflector.declaredFields(r2)
            java.util.Iterator r6 = r6.iterator()
        L2a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L77
            java.lang.Object r7 = r6.next()
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            if (r4 != 0) goto L57
            java.lang.String r8 = r7.getName()
            java.lang.String r9 = "avatarIV"
            boolean r8 = gg.l.a(r8, r9)
            if (r8 != 0) goto L55
            java.lang.Class r8 = r7.getType()
            java.lang.String r8 = r8.getName()
            java.lang.String r9 = ".ChattingAvatarImageView"
            r10 = 0
            boolean r8 = og.t.W(r8, r9, r10)
            if (r8 == 0) goto L57
        L55:
            r4 = r7
            goto L2a
        L57:
            if (r5 != 0) goto L2a
            java.lang.String r8 = r7.getName()
            java.lang.String r9 = "avatarMask"
            boolean r8 = gg.l.a(r8, r9)
            if (r8 != 0) goto L75
            java.lang.Class r8 = r7.getType()
            java.lang.String r8 = r8.getName()
            java.lang.String r9 = "com.tencent.mm.ui.base.MaskLayout"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L2a
        L75:
            r5 = r7
            goto L2a
        L77:
            java.lang.Class r2 = r2.getSuperclass()
            goto L18
        L7c:
            if (r4 == 0) goto L83
            s9.a r3 = new s9.a
            r3.<init>(r4, r5)
        L83:
            if (r3 != 0) goto L89
            r1.add(r12)
            return r3
        L89:
            r0.put(r12, r3)
            return r3
    }

    public final boolean b(java.lang.reflect.Method r6) {
            r5 = this;
            java.lang.Class[] r0 = r6.getParameterTypes()
            java.lang.Class r6 = r6.getReturnType()
            java.lang.Class r1 = java.lang.Void.TYPE
            boolean r6 = gg.l.a(r6, r1)
            r1 = 0
            if (r6 == 0) goto L42
            int r6 = r0.length
            r2 = 4
            if (r6 != r2) goto L42
            r6 = 2
            r6 = r0[r6]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            boolean r6 = gg.l.a(r6, r2)
            if (r6 == 0) goto L42
            r6 = r0[r1]
            r6.getClass()
            s9.a r6 = r5.a(r6)
            if (r6 == 0) goto L42
            int r6 = r0.length
            r2 = r1
        L2d:
            if (r2 >= r6) goto L42
            r3 = r0[r2]
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = "com.tencent.mm.storage."
            boolean r3 = og.t.d0(r3, r4, r1)
            if (r3 == 0) goto L3f
            r6 = 1
            return r6
        L3f:
            int r2 = r2 + 1
            goto L2d
        L42:
            return r1
    }

    public final java.lang.reflect.Method c() {
            r10 = this;
            r8.g r0 = r10.f12395a
            android.content.Context r1 = r0.f11620a
            java.lang.ClassLoader r2 = r0.f11622c
            r2.getClass()
            l8.i r1 = o8.k.a(r1, r2)
            java.lang.String r1 = r1.f7933h
            boolean r3 = og.m.t0(r1)
            r4 = 0
            if (r3 != 0) goto L17
            goto L18
        L17:
            r1 = r4
        L18:
            if (r1 == 0) goto L21
            java.lang.String r3 = "|hide_chat_avatar_v1"
            java.lang.String r1 = r1.concat(r3)
            goto L22
        L21:
            r1 = r4
        L22:
            java.lang.String r3 = ""
            if (r1 != 0) goto L27
            r1 = r3
        L27:
            android.content.SharedPreferences r5 = r10.f12397c
            java.lang.String r6 = "avatar_bind"
            java.lang.reflect.Method r7 = e8.b.c(r5, r1, r2, r6)
            if (r7 == 0) goto L3c
            boolean r8 = r10.b(r7)
            if (r8 == 0) goto L38
            goto L39
        L38:
            r7 = r4
        L39:
            if (r7 == 0) goto L3c
            return r7
        L3c:
            java.lang.String r7 = "MicroMsg.ChattingItem"
            java.lang.String r8 = "attachAvatarClickListener: getBizKfWorker:%s"
            java.lang.String[] r7 = new java.lang.String[]{r7, r8}
            org.luckypray.dexkit.DexKitBridge r0 = r0.f11623d     // Catch: java.lang.Throwable -> L8c
            ch.e r8 = new ch.e     // Catch: java.lang.Throwable -> L8c
            r8.<init>()     // Catch: java.lang.Throwable -> L8c
            fh.k r9 = new fh.k     // Catch: java.lang.Throwable -> L8c
            r9.<init>()     // Catch: java.lang.Throwable -> L8c
            java.util.List r7 = tf.l.L0(r7)     // Catch: java.lang.Throwable -> L8c
            fh.k.u0(r9, r7)     // Catch: java.lang.Throwable -> L8c
            r8.f1666h = r9     // Catch: java.lang.Throwable -> L8c
            hh.p r0 = r0.findMethod(r8)     // Catch: java.lang.Throwable -> L8c
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8c
            r7.<init>()     // Catch: java.lang.Throwable -> L8c
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L8c
        L66:
            boolean r8 = r0.hasNext()     // Catch: java.lang.Throwable -> L8c
            if (r8 == 0) goto L92
            java.lang.Object r8 = r0.next()     // Catch: java.lang.Throwable -> L8c
            hh.o r8 = (hh.o) r8     // Catch: java.lang.Throwable -> L8c
            java.lang.reflect.Method r8 = r8.r(r2)     // Catch: java.lang.Throwable -> L77
            goto L7e
        L77:
            r8 = move-exception
            sf.f r9 = new sf.f     // Catch: java.lang.Throwable -> L8c
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L8c
            r8 = r9
        L7e:
            boolean r9 = r8 instanceof sf.f     // Catch: java.lang.Throwable -> L8c
            if (r9 == 0) goto L84
            r8 = r4
        L84:
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8     // Catch: java.lang.Throwable -> L8c
            if (r8 == 0) goto L66
            r7.add(r8)     // Catch: java.lang.Throwable -> L8c
            goto L66
        L8c:
            r0 = move-exception
            sf.f r7 = new sf.f
            r7.<init>(r0)
        L92:
            java.lang.Throwable r0 = sf.g.b(r7)
            if (r0 != 0) goto L99
            goto La4
        L99:
            java.lang.String r2 = r0.getMessage()
            java.lang.String r7 = "[Hchat:HideChatAvatar] 定位聊天头像绑定方法异常: "
            eh.a.x(r7, r2, r0)
            tf.t r7 = tf.t.f13167g
        La4:
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r0 = r7.iterator()
        Laa:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lbe
            java.lang.Object r2 = r0.next()
            r7 = r2
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            boolean r7 = r10.b(r7)
            if (r7 == 0) goto Laa
            r4 = r2
        Lbe:
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            if (r4 == 0) goto Lc6
            e8.b.h(r5, r1, r6, r4)
            goto Le4
        Lc6:
            java.lang.String r0 = "cache.key"
            android.content.SharedPreferences$Editor r2 = r5.edit()     // Catch: java.lang.Throwable -> Le4
            java.lang.String r3 = r5.getString(r0, r3)     // Catch: java.lang.Throwable -> Le4
            boolean r3 = gg.l.a(r3, r1)     // Catch: java.lang.Throwable -> Le4
            if (r3 != 0) goto Ldd
            android.content.SharedPreferences$Editor r3 = r2.clear()     // Catch: java.lang.Throwable -> Le4
            r3.putString(r0, r1)     // Catch: java.lang.Throwable -> Le4
        Ldd:
            android.content.SharedPreferences$Editor r0 = r2.remove(r6)     // Catch: java.lang.Throwable -> Le4
            r0.apply()     // Catch: java.lang.Throwable -> Le4
        Le4:
            return r4
    }
}
