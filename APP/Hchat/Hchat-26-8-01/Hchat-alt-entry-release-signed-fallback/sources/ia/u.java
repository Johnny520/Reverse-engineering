package ia;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends r8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ia.a0 f6632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ia.h f6633f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p8.o f6634g;

    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "moments_fake_interaction"
            return r0
    }

    @Override // r8.a
    public final void f(r8.g r5) {
            r4 = this;
            r5.getClass()
            ha.k0 r5 = new ha.k0
            java.lang.String r0 = "moments_fake_like"
            java.lang.String r1 = "朋友圈伪集赞"
            java.lang.String r2 = "长按朋友圈选择或凭空生成本地点赞"
            java.lang.String r3 = "practical"
            r5.<init>(r0, r1, r2, r3)
            r4.h(r5)
            ha.k0 r5 = new ha.k0
            java.lang.String r0 = "朋友圈伪评论"
            java.lang.String r1 = "长按朋友圈添加带时间和顺序的本地评论"
            java.lang.String r2 = "moments_fake_comment"
            r5.<init>(r2, r0, r1, r3)
            r4.h(r5)
            return
    }

    @Override // r8.a
    public final void g(r8.g r28) {
            r27 = this;
            r9 = r28
            r9.getClass()
            b5.c r10 = new b5.c
            android.content.Context r0 = r9.f11620a
            r1 = 7
            r10.<init>(r0, r1)
            ia.h r11 = new ia.h
            ab.b r0 = new ab.b
            java.lang.Class<ia.u> r12 = ia.u.class
            java.lang.Class r3 = eh.a.i(r12)
            r7 = 0
            r8 = 26
            r1 = 2
            java.lang.String r4 = "logFeatureError"
            java.lang.String r5 = "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r6 = 0
            r2 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r11.<init>(r9, r0)
            ia.a0 r13 = new ia.a0
            ab.b r0 = new ab.b
            java.lang.Class r3 = eh.a.i(r12)
            r8 = 29
            java.lang.String r4 = "logFeatureError"
            java.lang.String r5 = "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r13.<init>(r9, r10, r11, r0)
            ia.q r14 = new ia.q
            android.content.Context r15 = r9.f11620a
            ab.b r0 = new ab.b
            java.lang.Class r3 = eh.a.i(r12)
            r8 = 27
            java.lang.String r4 = "logFeatureError"
            java.lang.String r5 = "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r14.<init>(r15, r10, r13, r0)
            p8.o r10 = new p8.o
            ab.b r0 = new ab.b
            java.lang.Class r3 = eh.a.i(r12)
            r8 = 28
            java.lang.String r4 = "logFeatureError"
            java.lang.String r5 = "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.<init>(r9, r0)
            r2.f6633f = r11
            r2.f6632e = r13
            r2.f6634g = r10
            ac.p.f216b = r13
            p8.d0 r0 = h.Hchat.hooks.api.core.WeChatApis.snsApi()
            if (r0 == 0) goto L7d
            ha.c r1 = new ha.c
            r3 = 4
            r1.<init>(r13, r3)
            r0.n(r1)
        L7d:
            java.util.Set r1 = r13.f6543f
            java.lang.String r0 = "com.tencent.mm.plugin.sns.storage.SnsInfo"
            java.lang.ClassLoader r3 = r9.f11622c
            java.lang.Class r0 = h.Hchat.utils.KavaReflector.loadClass(r0, r3)
            r10 = 0
            r11 = 1
            r15 = 0
            if (r0 == 0) goto L160
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredMethods(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L99:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto Le9
            java.lang.Object r4 = r0.next()
            r5 = r4
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            int r6 = r5.getModifiers()
            boolean r6 = java.lang.reflect.Modifier.isStatic(r6)
            if (r6 != 0) goto L99
            int r6 = r5.getModifiers()
            boolean r6 = java.lang.reflect.Modifier.isAbstract(r6)
            if (r6 == 0) goto Lbb
            goto L99
        Lbb:
            java.lang.String r6 = r5.getName()
            java.lang.String r7 = "convertFrom"
            boolean r6 = gg.l.a(r6, r7)
            if (r6 == 0) goto L99
            java.lang.Class[] r6 = r5.getParameterTypes()
            int r6 = r6.length
            if (r6 == r11) goto Lcf
            goto L99
        Lcf:
            java.lang.Class[] r5 = r5.getParameterTypes()
            r5 = r5[r10]
            java.lang.Class<android.database.Cursor> r6 = android.database.Cursor.class
            boolean r6 = r6.isAssignableFrom(r5)
            if (r6 != 0) goto Le5
            java.lang.Class<android.content.ContentValues> r6 = android.content.ContentValues.class
            boolean r5 = r6.isAssignableFrom(r5)
            if (r5 == 0) goto L99
        Le5:
            r3.add(r4)
            goto L99
        Le9:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto Lf2
            r4 = r10
            goto L15c
        Lf2:
            java.util.Iterator r3 = r3.iterator()
            r4 = r10
        Lf7:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L15c
            java.lang.Object r0 = r3.next()
            r5 = r0
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            boolean r0 = r1.add(r5)
            if (r0 != 0) goto L10c
            r0 = r11
            goto L151
        L10c:
            r8.i r0 = r8.i.f11631b     // Catch: java.lang.Throwable -> L121
            java.lang.reflect.Method r6 = h.Hchat.utils.KavaReflector.accessible(r5)     // Catch: java.lang.Throwable -> L121
            if (r6 == 0) goto L115
            goto L116
        L115:
            r6 = r5
        L116:
            ia.z r7 = new ia.z     // Catch: java.lang.Throwable -> L121
            r7.<init>(r13, r11)     // Catch: java.lang.Throwable -> L121
            r0.b(r6, r7)     // Catch: java.lang.Throwable -> L121
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L121
            goto L128
        L121:
            r0 = move-exception
            sf.f r6 = new sf.f
            r6.<init>(r0)
            r0 = r6
        L128:
            java.lang.Throwable r6 = sf.g.b(r0)
            if (r6 != 0) goto L12f
            goto L14b
        L12f:
            r1.remove(r5)
            ab.b r0 = r13.f6541d
            java.lang.String r5 = r5.toGenericString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "安装朋友圈伪互动记录Hook失败: "
            r7.<init>(r8)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r0.invoke(r5, r6)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L14b:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
        L151:
            if (r0 == 0) goto Lf7
            int r4 = r4 + 1
            if (r4 < 0) goto L158
            goto Lf7
        L158:
            a.a.P0()
            throw r15
        L15c:
            if (r4 <= 0) goto L160
            r0 = r11
            goto L161
        L160:
            r0 = r10
        L161:
            if (r0 != 0) goto L168
            java.lang.String r0 = "朋友圈伪互动记录Hook未安装"
            r2.e(r0, r15)
        L168:
            android.content.Context r0 = r9.f11620a
            java.lang.String r1 = "Hchat_moments_fake_interaction_config"
            android.content.SharedPreferences r0 = ub.b.c(r0, r1)
            p8.j r1 = p8.j.f10380a
            c0.f r24 = new c0.f
            java.lang.Class r3 = eh.a.i(r12)
            r7 = 0
            r8 = 22
            r1 = 1
            java.lang.String r4 = "isNormalMomentsPost"
            java.lang.String r5 = "isNormalMomentsPost(Lh/Hchat/hooks/api/sns/SnsContextMenuTarget;)Z"
            r6 = 0
            r11 = r0
            r0 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            ab.b r25 = new ab.b
            java.lang.Class<ia.q> r26 = ia.q.class
            java.lang.Class r17 = eh.a.i(r26)
            r21 = 0
            r22 = 24
            r1 = r15
            r15 = 2
            java.lang.String r18 = "showFakeLikes"
            java.lang.String r19 = "showFakeLikes(Landroid/app/Activity;Lh/Hchat/hooks/api/sns/SnsContextMenuTarget;)V"
            r20 = 0
            r16 = r14
            r14 = r25
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            r14 = r16
            p8.i r16 = new p8.i
            ia.r r3 = new ia.r
            r3.<init>(r2, r11, r10)
            ia.s r4 = new ia.s
            r4.<init>(r13, r11, r10)
            java.lang.String r17 = "moments_fake_like"
            r18 = 1212368460(0x4843464c, float:199961.19)
            java.lang.String r19 = "伪集赞[H]"
            r20 = 20
            java.lang.String r22 = "icons_filled_like"
            r21 = r3
            r23 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r0 = r16
            r3 = r17
            java.util.concurrent.ConcurrentHashMap r10 = p8.j.f10381b
            r10.put(r3, r0)
            c0.f r0 = new c0.f
            java.lang.Class r3 = eh.a.i(r12)
            r8 = 23
            r4 = r1
            r1 = 1
            r5 = r4
            java.lang.String r4 = "isNormalMomentsPost"
            r6 = r5
            java.lang.String r5 = "isNormalMomentsPost(Lh/Hchat/hooks/api/sns/SnsContextMenuTarget;)Z"
            r12 = r6
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            ab.b r24 = new ab.b
            java.lang.Class r17 = eh.a.i(r26)
            r21 = 0
            r22 = 25
            java.lang.String r18 = "showFakeComments"
            java.lang.String r19 = "showFakeComments(Landroid/app/Activity;Lh/Hchat/hooks/api/sns/SnsContextMenuTarget;)V"
            r20 = 0
            r16 = r14
            r14 = r24
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            p8.i r15 = new p8.i
            ia.r r1 = new ia.r
            r3 = 1
            r1.<init>(r2, r11, r3)
            ia.s r4 = new ia.s
            r4.<init>(r13, r11, r3)
            java.lang.String r16 = "moments_fake_comment"
            r17 = 1212368451(0x48434643, float:199961.05)
            java.lang.String r18 = "伪评论[H]"
            r19 = 30
            java.lang.String r21 = "icons_filled_comment"
            r23 = r0
            r20 = r1
            r22 = r4
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r0 = r16
            r10.put(r0, r15)
            aa.c r0 = new aa.c
            r1 = 18
            r0.<init>(r2, r1, r9)
            r1 = 12
            java.lang.String r3 = "moments_fake_interaction_sns_menu"
            java.lang.String r4 = "朋友圈伪互动"
            r8.e.f(r1, r0, r3, r4, r12)
            e9.a r0 = new e9.a
            r3 = 1
            r0.<init>(r2, r3, r9)
            java.lang.Class<f8.e> r1 = f8.e.class
            r2.i(r1, r0)
            return
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "朋友圈伪互动"
            return r0
    }
}
