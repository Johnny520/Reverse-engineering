package hb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r8.g f5400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ab.b f5401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.os.Handler f5402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final android.content.SharedPreferences f5403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.Set f5404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final android.content.SharedPreferences f5405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final hb.r f5406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final hb.c f5407h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final hb.k f5408i;

    public i0(r8.g r4, ab.b r5) {
            r3 = this;
            r4.getClass()
            r3.<init>()
            r3.f5400a = r4
            r3.f5401b = r5
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r3.f5402c = r0
            android.content.Context r0 = r4.f11620a
            java.lang.String r1 = "Hchat_selected_messages_config"
            android.content.SharedPreferences r1 = ub.b.c(r0, r1)
            r3.f5403d = r1
            java.util.Set r1 = j8.b.o()
            r3.f5404e = r1
            java.lang.String r1 = "Hchat_selected_message_method_cache"
            android.content.SharedPreferences r0 = ub.b.c(r0, r1)
            r3.f5405f = r0
            hb.r r0 = new hb.r
            r0.<init>(r4, r5)
            r3.f5406g = r0
            hb.c r0 = new hb.c
            r0.<init>()
            r0.f5338g = r5
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            r0.f5339h = r1
            c9.q r1 = new c9.q
            r2 = 15
            r1.<init>(r2)
            java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newSingleThreadExecutor(r1)
            r0.f5340i = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.f5341j = r1
            r3.f5407h = r0
            hb.k r0 = new hb.k
            r0.<init>(r4, r5)
            r3.f5408i = r0
            return
    }

    public static void a(java.lang.Object r3, java.lang.String r4, int r5) {
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "findItem"
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invokeMethod(r3, r2, r1)
            if (r1 == 0) goto L16
            goto L46
        L16:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r1, r0, r4}
            java.lang.String r2 = "add"
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invokeMethod(r3, r2, r1)
            if (r1 == 0) goto L27
            goto L46
        L27:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r0, r4}
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invokeMethod(r3, r2, r0)
            if (r0 == 0) goto L36
            goto L46
        L36:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r4}
            java.lang.String r1 = "f"
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invokeMethod(r3, r1, r0)
            if (r0 == 0) goto L47
        L46:
            return
        L47:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r4 = new java.lang.Object[]{r5, r4}
            h.Hchat.utils.KavaReflector.invokeMethod(r3, r1, r4)
            return
    }

    public static boolean c(java.lang.reflect.Method r2) {
            java.lang.Class r0 = r2.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "com.tencent.mm.ui.transmit.MsgRetransmitUI"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2e
            java.lang.Class r0 = r2.getReturnType()
            java.lang.Class r1 = java.lang.Void.TYPE
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L2e
            java.lang.Class[] r2 = r2.getParameterTypes()
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            boolean r2 = java.util.Arrays.equals(r2, r0)
            if (r2 == 0) goto L2e
            r2 = 1
            return r2
        L2e:
            r2 = 0
            return r2
    }

    public final boolean b(java.lang.reflect.Method r4, de.robv.android.xposed.XC_MethodHook r5) {
            r3 = this;
            java.util.Set r0 = r3.f5404e
            boolean r1 = r0.add(r4)
            if (r1 != 0) goto La
            r4 = 1
            return r4
        La:
            r8.i r1 = r8.i.f11631b     // Catch: java.lang.Throwable -> L1a
            java.lang.reflect.Method r2 = h.Hchat.utils.KavaReflector.accessible(r4)     // Catch: java.lang.Throwable -> L1a
            if (r2 == 0) goto L13
            goto L14
        L13:
            r2 = r4
        L14:
            r1.b(r2, r5)     // Catch: java.lang.Throwable -> L1a
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1a
            goto L21
        L1a:
            r5 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r5)
            r5 = r1
        L21:
            java.lang.Throwable r1 = sf.g.b(r5)
            if (r1 == 0) goto L41
            r0.remove(r4)
            java.lang.String r4 = r4.toGenericString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "群发助手Hook安装失败: "
            r0.<init>(r2)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            ab.b r0 = r3.f5401b
            r0.invoke(r4, r1)
        L41:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            boolean r0 = r5 instanceof sf.f
            if (r0 == 0) goto L48
            r5 = r4
        L48:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r4 = r5.booleanValue()
            return r4
    }

    public final void d(android.app.Activity r10, fg.l r11, java.lang.String r12, java.lang.String r13, boolean r14) {
            r9 = this;
            hb.x r0 = new hb.x
            r2 = r9
            r1 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r2 = r6
            hb.l r10 = hb.m.f5433a
            java.util.List r10 = hb.m.a(r2)
            if (r10 == 0) goto L18
            r0.invoke(r10)
            return
        L18:
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
            r10 = 0
            r3.<init>(r10)
            r11 = r4
            java.util.concurrent.atomic.AtomicBoolean r4 = new java.util.concurrent.atomic.AtomicBoolean
            r4.<init>(r10)
            c9.h r10 = new c9.h
            r12 = 4
            r10.<init>(r4, r3, r12)
            java.lang.String r12 = "正在载入联系人..."
            wb.kv r5 = wb.y2.X1(r1, r10, r11, r12)
            java.lang.Thread r10 = new java.lang.Thread
            r7 = r0
            c9.p r0 = new c9.p
            r8 = 2
            r6 = r1
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r11 = "Hchat-SelectedMessageContacts"
            r10.<init>(r0, r11)
            r10.start()
            return
    }

    public final void e(android.app.Activity r3, java.lang.String r4) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto Le
            boolean r1 = r3.isFinishing()
            if (r1 != 0) goto La
            goto Lb
        La:
            r3 = r0
        Lb:
            if (r3 == 0) goto Le
            goto L2a
        Le:
            q8.o r3 = h.Hchat.hooks.api.core.WeChatApis.currentActivity()
            if (r3 == 0) goto L19
            android.app.Activity r3 = r3.a()
            goto L1a
        L19:
            r3 = r0
        L1a:
            if (r3 == 0) goto L1d
            goto L1e
        L1d:
            r3 = r0
        L1e:
            if (r3 == 0) goto L27
            boolean r1 = r3.isFinishing()
            if (r1 != 0) goto L27
            r0 = r3
        L27:
            if (r0 == 0) goto L35
            r3 = r0
        L2a:
            c9.t r0 = new c9.t
            r1 = 6
            r0.<init>(r3, r4, r1)
            android.os.Handler r3 = r2.f5402c
            r3.post(r0)
        L35:
            return
    }
}
