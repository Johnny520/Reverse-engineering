package p000;

/* JADX INFO: renamed from: rx */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0777rx {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.ConcurrentHashMap f9562 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.ConcurrentHashMap f9563 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.atomic.AtomicBoolean f9564 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.concurrent.atomic.AtomicBoolean f9565 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.util.Set f9566 = null;

    /* JADX INFO: renamed from: ζ */
    public static final java.util.concurrent.atomic.AtomicLong f9567 = null;

    /* JADX INFO: renamed from: η */
    public static volatile long f9568;

    /* JADX INFO: renamed from: θ */
    public static volatile java.lang.ClassLoader f9569;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.C0777rx.f9562 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.C0777rx.f9563 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.C0777rx.f9564 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.C0777rx.f9565 = r0
            java.lang.String r17 = "comment_precise_time_template_render_methods"
            java.lang.String r18 = "comment_precise_time_compose_formatter_methods"
            java.lang.String r2 = "feed_current_playback_selected_methods"
            java.lang.String r3 = "feed_current_playback_unselected_methods"
            java.lang.String r4 = "feed_auto_scroll_text_mode_field"
            java.lang.String r5 = "feed_auto_scroll_new_text_mode_field"
            java.lang.String r6 = "bottom_tab_visibility_control_methods"
            java.lang.String r7 = "home_tab_showing_bottom_tab_ids_methods"
            java.lang.String r8 = "home_tab_data_source_provider_methods"
            java.lang.String r9 = "home_tab_data_source_classes"
            java.lang.String r10 = "home_tab_data_source_list_methods"
            java.lang.String r11 = "im_stranger_list_model_factory_methods"
            java.lang.String r12 = "im_quick_share_contact_adapter_classes_v2"
            java.lang.String r13 = "spark_official_send_factory_class"
            java.lang.String r14 = "spark_official_send_callback_class"
            java.lang.String r15 = "spark_official_msg_sender_class"
            java.lang.String r16 = "comment_precise_time_template_component_classes"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18}
            java.util.Set r0 = p000.AbstractC0312g7.m2263(r0)
            p000.C0777rx.f9566 = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            p000.C0777rx.f9567 = r0
            r0 = -1
            p000.C0777rx.f9568 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.util.LinkedHashMap m5174(java.lang.ClassLoader r7) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.concurrent.ConcurrentHashMap r1 = p000.C0777rx.f9562
            java.util.Set r2 = r1.keySet()
            r2.getClass()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r2 = p000.AbstractC0984xh.m6657(r2)
            java.util.Iterator r2 = r2.iterator()
        L18:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L81
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r1.get(r3)
            a80 r4 = (p000.a80) r4
            if (r4 != 0) goto L2d
            goto L18
        L2d:
            java.lang.Object r4 = r4.invoke(r7)     // Catch: java.lang.Throwable -> L34
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L34
            goto L3b
        L34:
            r4 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r4)
            r4 = r5
        L3b:
            java.lang.Throwable r5 = p000.fo1.m2190(r4)
            if (r5 != 0) goto L42
            goto L5d
        L42:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "provider failed: "
            r4.<init>(r6)
            r4.append(r3)
            java.lang.String r3 = ", err="
            r4.append(r3)
            r4.append(r5)
            java.lang.String r3 = r4.toString()
            m5175(r3)
            jz r4 = p000.C0450jz.f5672
        L5d:
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r3 = r4.iterator()
        L63:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L18
            java.lang.Object r4 = r3.next()
            qx r4 = (p000.C0740qx) r4
            java.lang.String r5 = r4.f9152
            boolean r6 = p000.q02.m4671(r5)
            if (r6 != 0) goto L63
            boolean r6 = r0.containsKey(r5)
            if (r6 != 0) goto L63
            r0.put(r5, r4)
            goto L63
        L81:
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static void m5175(java.lang.String r1) {
            java.lang.String r0 = "r32cd1d4d47390a2e"
            p000.C0888ux.m5975(r0, r1)
            return
    }

    /* JADX INFO: renamed from: γ */
    public static void m5176(java.lang.ClassLoader r3) {
            java.util.concurrent.atomic.AtomicLong r0 = p000.C0777rx.f9567
            long r0 = r0.get()
            p000.C0777rx.f9568 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.C0777rx.f9565
            r1 = 1
            r0.set(r1)
            p000.C0777rx.f9569 = r3
            java.util.concurrent.ConcurrentHashMap r0 = p000.C0777rx.f9563
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            a80 r1 = (p000.a80) r1
            m5181(r2, r1, r3)
            goto L1a
        L36:
            return
    }

    /* JADX INFO: renamed from: δ */
    public static void m5177(java.lang.String r2, p000.a80 r3) {
            java.util.concurrent.ConcurrentHashMap r0 = p000.C0777rx.f9563
            r0.put(r2, r3)
            java.lang.ClassLoader r0 = p000.C0777rx.f9569
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.C0777rx.f9565
            boolean r1 = r1.get()
            if (r1 == 0) goto L14
            if (r0 == 0) goto L14
            m5181(r2, r3, r0)
        L14:
            return
    }

    /* JADX INFO: renamed from: ε */
    public static void m5178(java.lang.String r1, p000.a80 r2) {
            java.util.concurrent.ConcurrentHashMap r0 = p000.C0777rx.f9562
            java.lang.Object r0 = r0.put(r1, r2)
            a80 r0 = (p000.a80) r0
            if (r0 == 0) goto Lc
            if (r0 == r2) goto L17
        Lc:
            java.util.concurrent.atomic.AtomicLong r2 = p000.C0777rx.f9567
            r2.incrementAndGet()
            java.util.concurrent.atomic.AtomicBoolean r2 = p000.C0777rx.f9565
            r0 = 0
            r2.set(r0)
        L17:
            java.lang.String r2 = "provider registered: "
            java.lang.String r1 = r2.concat(r1)
            m5175(r1)
            return
    }

    /* JADX INFO: renamed from: ζ */
    public static void m5179() {
            java.lang.String r0 = "user_clear_from_settings"
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.C0777rx.f9564
            r2 = 0
            r1.set(r2)
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.C0777rx.f9565
            r1.set(r2)
            r1 = 0
            p000.C0777rx.f9569 = r1
            r3 = -1
            p000.C0777rx.f9568 = r3
            java.lang.String r1 = "dexkit_prewarm_done_v3"
            p000.ui1.m5876(r1)
            java.lang.String r1 = "dexkit_module_version"
            p000.ui1.m5876(r1)
            java.lang.String r1 = "dexkit_dy_version"
            p000.ui1.m5876(r1)
            java.lang.String r1 = "dexkit_device_model"
            p000.ui1.m5876(r1)
            x r1 = p000.C0966x.f11923     // Catch: java.lang.Throwable -> L50
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L50
            android.content.Context r3 = p000.C0966x.m6441()     // Catch: java.lang.Throwable -> L4d
            if (r3 != 0) goto L33
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L50
            goto L50
        L33:
            java.lang.String r4 = "dyhelper_dexkit_unsupported_tasks"
            android.content.SharedPreferences r2 = r3.getSharedPreferences(r4, r2)     // Catch: java.lang.Throwable -> L4d
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L4d
            android.content.SharedPreferences$Editor r2 = r2.clear()     // Catch: java.lang.Throwable -> L4d
            r2.commit()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r2 = "r40ce95f0770b9235"
            java.lang.String r3 = "clear all unsupported tasks"
            p000.C0888ux.m5975(r2, r3)     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L50
            goto L50
        L4d:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4d
            throw r2     // Catch: java.lang.Throwable -> L50
        L50:
            java.lang.String r1 = "reset, reason="
            java.lang.String r0 = r1.concat(r0)
            m5175(r0)
            return
    }

    /* JADX INFO: renamed from: η */
    public static void m5180(java.lang.ClassLoader r18, java.util.LinkedHashMap r19) {
            java.util.Collection r0 = r19.values()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            qx r1 = (p000.C0740qx) r1
            android.os.Handler r2 = p000.C0661os.f8210
            java.lang.String r2 = r1.f9152
            java.lang.String r1 = r1.f9153
            p000.C0661os.m4285(r2, r1)
            goto Ld
        L23:
            java.util.Collection r0 = r19.values()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r1 = r0.iterator()
            r2 = 0
            r3 = r2
            r4 = r3
            r5 = r4
        L34:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L18a
            java.lang.Object r0 = r1.next()
            r6 = r0
            qx r6 = (p000.C0740qx) r6
            android.os.Handler r0 = p000.C0661os.f8210
            java.lang.String r0 = r6.f9152
            java.lang.String r7 = r6.f9153
            p000.C0661os.m4262(r0, r7)
            p70 r0 = r6.f9154     // Catch: java.lang.Throwable -> L52
            r0.invoke()     // Catch: java.lang.Throwable -> L52
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L52
            goto L59
        L52:
            r0 = move-exception
            eo1 r7 = new eo1
            r7.<init>(r0)
            r0 = r7
        L59:
            java.lang.Throwable r7 = p000.fo1.m2190(r0)
            if (r7 == 0) goto L7a
            java.lang.String r8 = r6.f9152
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "task failed: "
            r9.<init>(r10)
            r9.append(r8)
            java.lang.String r8 = ", err="
            r9.append(r8)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            m5175(r7)
        L7a:
            boolean r0 = r0 instanceof p000.eo1
            r7 = r0 ^ 1
            java.lang.Object r8 = p000.C0666ox.f8297
            java.lang.String r8 = r6.f9152
            boolean r8 = p000.C0666ox.m4318(r8)
            java.lang.String r9 = r6.f9152
            java.lang.String r10 = ""
            r11 = 58
            java.lang.String r9 = p000.q02.m4685(r9, r11, r10)
            r11 = 64
            java.lang.String r9 = p000.q02.m4689(r9, r11, r10)
            java.lang.CharSequence r9 = p000.q02.m4660(r9)
            java.lang.String r9 = r9.toString()
            java.util.Set r10 = p000.C0777rx.f9566
            boolean r9 = r10.contains(r9)
            r10 = 1
            if (r0 != 0) goto Lad
            if (r8 != 0) goto Lab
            if (r9 == 0) goto Lad
        Lab:
            r0 = r10
            goto Lae
        Lad:
            r0 = r2
        Lae:
            if (r0 == 0) goto Lb3
            int r3 = r3 + 1
            goto Lb5
        Lb3:
            int r4 = r4 + 1
        Lb5:
            if (r8 != 0) goto L180
            if (r9 != 0) goto Lbb
            int r5 = r5 + 1
        Lbb:
            x r8 = p000.C0966x.f11923
            java.lang.String r11 = r6.f9152
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "prewarm finished without usable cache, actionOk="
            r12.<init>(r13)
            r12.append(r7)
            java.lang.String r7 = ", optional="
            r12.append(r7)
            r12.append(r9)
            java.lang.String r7 = r12.toString()
            java.lang.String r9 = "mark unsupported: "
            java.lang.String r12 = "markUnsupported skipped, context is null, taskId="
            monitor-enter(r8)
            android.content.Context r13 = p000.C0966x.m6441()     // Catch: java.lang.Throwable -> Lec
            if (r13 != 0) goto Lef
            java.lang.String r7 = "r40ce95f0770b9235"
            java.lang.String r9 = r12.concat(r11)     // Catch: java.lang.Throwable -> Lec
            p000.C0888ux.m5975(r7, r9)     // Catch: java.lang.Throwable -> Lec
            monitor-exit(r8)
            goto L180
        Lec:
            r0 = move-exception
            goto L17e
        Lef:
            java.lang.String r12 = "dyhelper_dexkit_unsupported_tasks"
            android.content.SharedPreferences r12 = r13.getSharedPreferences(r12, r2)     // Catch: java.lang.Throwable -> Lec
            r12.getClass()     // Catch: java.lang.Throwable -> Lec
            p000.C0966x.m6444(r13, r12)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r13 = "@"
            java.lang.String r13 = p000.q02.m4690(r11, r13, r11)     // Catch: java.lang.Throwable -> Lec
            java.lang.CharSequence r13 = p000.q02.m4660(r13)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> Lec
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lec
            r14.<init>()     // Catch: java.lang.Throwable -> Lec
            java.lang.String r15 = "unsupported"
            org.json.JSONObject r14 = r14.put(r15, r10)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r15 = "taskId"
            org.json.JSONObject r14 = r14.put(r15, r13)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r15 = "reason"
            r2 = 800(0x320, float:1.121E-42)
            java.lang.String r2 = p000.q02.m4693(r7, r2)     // Catch: java.lang.Throwable -> Lec
            org.json.JSONObject r2 = r14.put(r15, r2)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r14 = "writtenAt"
            r17 = r11
            long r10 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lec
            org.json.JSONObject r2 = r2.put(r14, r10)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r10 = "unsupportedSchema"
            r15 = 1
            org.json.JSONObject r2 = r2.put(r10, r15)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r10 = "dexkitCacheSchema"
            r11 = 4
            org.json.JSONObject r2 = r2.put(r10, r11)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r10 = "moduleVersionCode"
            r11 = 60
            org.json.JSONObject r2 = r2.put(r10, r11)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r10 = "moduleVersionName"
            java.lang.String r11 = "1.4.15"
            org.json.JSONObject r2 = r2.put(r10, r11)     // Catch: java.lang.Throwable -> Lec
            android.content.SharedPreferences$Editor r10 = r12.edit()     // Catch: java.lang.Throwable -> Lec
            java.lang.String r11 = p000.C0966x.m6454(r17)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lec
            android.content.SharedPreferences$Editor r2 = r10.putString(r11, r2)     // Catch: java.lang.Throwable -> Lec
            r2.commit()     // Catch: java.lang.Throwable -> Lec
            java.lang.String r2 = "r40ce95f0770b9235"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lec
            r10.<init>(r9)     // Catch: java.lang.Throwable -> Lec
            r10.append(r13)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r9 = ", reason="
            r10.append(r9)     // Catch: java.lang.Throwable -> Lec
            r10.append(r7)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r7 = r10.toString()     // Catch: java.lang.Throwable -> Lec
            p000.C0888ux.m5975(r2, r7)     // Catch: java.lang.Throwable -> Lec
            monitor-exit(r8)
            goto L180
        L17e:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lec
            throw r0
        L180:
            android.os.Handler r2 = p000.C0661os.f8210
            java.lang.String r2 = r6.f9152
            p000.C0661os.m4261(r2, r0)
            r2 = 0
            goto L34
        L18a:
            m5182()
            int r0 = r19.size()
            java.lang.String r1 = "prewarm finished, scanned="
            java.lang.String r2 = ", ok="
            java.lang.String r6 = ", fail="
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4136(r1, r0, r2, r3, r6)
            r0.append(r4)
            java.lang.String r1 = ", unsupported="
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            m5175(r0)
            android.os.Handler r0 = p000.C0661os.f8210
            java.lang.Object r1 = p000.C0661os.f8206
            monitor-enter(r1)
            p000.C0661os.m4275()     // Catch: java.lang.Throwable -> L1ce
            java.util.LinkedHashMap r0 = p000.C0661os.f8207     // Catch: java.lang.Throwable -> L1ce
            boolean r2 = r0.isEmpty()     // Catch: java.lang.Throwable -> L1ce
            if (r2 == 0) goto L1d1
            java.lang.String r2 = "legacy_finish"
            ms r3 = new ms     // Catch: java.lang.Throwable -> L1ce
            java.lang.String r4 = "legacy_finish"
            java.lang.String r5 = "适配完成"
            ns r6 = p000.EnumC0597ns.f7714     // Catch: java.lang.Throwable -> L1ce
            r3.<init>(r4, r5, r6)     // Catch: java.lang.Throwable -> L1ce
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L1ce
            goto L1f5
        L1ce:
            r0 = move-exception
            goto L2a4
        L1d1:
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L1ce
            r0.getClass()     // Catch: java.lang.Throwable -> L1ce
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L1ce
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1ce
        L1de:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L1ce
            if (r2 == 0) goto L1f5
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L1ce
            ms r2 = (p000.C0560ms) r2     // Catch: java.lang.Throwable -> L1ce
            ns r3 = r2.f7261     // Catch: java.lang.Throwable -> L1ce
            ns r4 = p000.EnumC0597ns.f7715     // Catch: java.lang.Throwable -> L1ce
            if (r3 == r4) goto L1de
            ns r3 = p000.EnumC0597ns.f7714     // Catch: java.lang.Throwable -> L1ce
            r2.f7261 = r3     // Catch: java.lang.Throwable -> L1ce
            goto L1de
        L1f5:
            android.os.Handler r0 = p000.C0661os.f8210     // Catch: java.lang.Throwable -> L1ce
            java.util.LinkedHashMap r0 = p000.C0661os.f8207     // Catch: java.lang.Throwable -> L1ce
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L1ce
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L1ce
            r0.getClass()     // Catch: java.lang.Throwable -> L1ce
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L1ce
            boolean r3 = r0 instanceof java.util.Collection     // Catch: java.lang.Throwable -> L1ce
            if (r3 == 0) goto L215
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3     // Catch: java.lang.Throwable -> L1ce
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L1ce
            if (r3 == 0) goto L215
            r0 = 0
            goto L239
        L215:
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1ce
            r16 = 0
        L21b:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L1ce
            if (r3 == 0) goto L237
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L1ce
            ms r3 = (p000.C0560ms) r3     // Catch: java.lang.Throwable -> L1ce
            ns r3 = r3.f7261     // Catch: java.lang.Throwable -> L1ce
            ns r4 = p000.EnumC0597ns.f7715     // Catch: java.lang.Throwable -> L1ce
            if (r3 != r4) goto L21b
            int r16 = r16 + 1
            if (r16 < 0) goto L232
            goto L21b
        L232:
            p000.AbstractC1021yh.m6916()     // Catch: java.lang.Throwable -> L1ce
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> L1ce
        L237:
            r0 = r16
        L239:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1ce
            r3.<init>()     // Catch: java.lang.Throwable -> L1ce
            java.lang.String r4 = "finishProgress called, taskCount="
            r3.append(r4)     // Catch: java.lang.Throwable -> L1ce
            r3.append(r2)     // Catch: java.lang.Throwable -> L1ce
            java.lang.String r2 = ", failed="
            r3.append(r2)     // Catch: java.lang.Throwable -> L1ce
            r3.append(r0)     // Catch: java.lang.Throwable -> L1ce
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L1ce
            p000.C0661os.m4293(r0)     // Catch: java.lang.Throwable -> L1ce
            monitor-exit(r1)
            boolean r0 = p000.C0661os.m4290()
            if (r0 == 0) goto L27f
            java.lang.String r0 = "finishProgress: restart already acked, dismissing dialog"
            p000.C0661os.m4293(r0)
            java.lang.Object r1 = p000.C0661os.f8206
            monitor-enter(r1)
            android.os.Handler r0 = p000.C0661os.f8210     // Catch: java.lang.Throwable -> L27c
            p000.C0661os.m4277()     // Catch: java.lang.Throwable -> L27c
            java.util.LinkedHashMap r0 = p000.C0661os.f8207     // Catch: java.lang.Throwable -> L27c
            r0.clear()     // Catch: java.lang.Throwable -> L27c
            monitor-exit(r1)
            android.os.Handler r0 = p000.C0661os.f8210
            s0 r1 = new s0
            r2 = 12
            r1.<init>(r2)
            r0.post(r1)
            goto L2a0
        L27c:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L27f:
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L29a
            android.os.Handler r0 = p000.C0661os.f8210
            s0 r1 = new s0
            r2 = 17
            r1.<init>(r2)
            r0.post(r1)
            goto L2a0
        L29a:
            p000.C0661os.m4286()
            p000.C0661os.m4272()
        L2a0:
            m5176(r18)
            return
        L2a4:
            monitor-exit(r1)
            throw r0
    }

    /* JADX INFO: renamed from: θ */
    public static void m5181(java.lang.String r1, p000.a80 r2, java.lang.ClassLoader r3) {
            r2.invoke(r3)     // Catch: java.lang.Throwable -> L6
            s62 r2 = p000.s62.f9751     // Catch: java.lang.Throwable -> L6
            goto Ld
        L6:
            r2 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r2)
            r2 = r3
        Ld:
            java.lang.Throwable r2 = p000.fo1.m2190(r2)
            if (r2 == 0) goto L2c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "finish listener failed: "
            r3.<init>(r0)
            r3.append(r1)
            java.lang.String r1 = ", err="
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            m5175(r1)
        L2c:
            return
    }

    /* JADX INFO: renamed from: ι */
    public static void m5182() {
            java.lang.String r0 = "dexkit_prewarm_done_v3"
            r1 = 1
            p000.ui1.m5871(r0, r1)
            java.lang.String r0 = "dexkit_module_version"
            r1 = 60
            p000.ui1.m5873(r0, r1)
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "SDK_"
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "dexkit_dy_version"
            p000.ui1.m5875(r3, r1)
            java.lang.String r1 = android.os.Build.MODEL
            r1.getClass()
            java.lang.String r3 = "dexkit_device_model"
            p000.ui1.m5875(r3, r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "version info saved: module=60, dy="
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = ", device="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            m5175(r0)
            return
    }

    /* JADX INFO: renamed from: κ */
    public static void m5183(java.lang.ClassLoader r11) {
            java.lang.String r0 = "dexkit_module_version"
            java.util.concurrent.atomic.AtomicLong r1 = p000.C0777rx.f9567
            long r1 = r1.get()
            java.util.concurrent.atomic.AtomicBoolean r3 = p000.C0777rx.f9565
            boolean r3 = r3.get()
            if (r3 == 0) goto L20
            long r3 = p000.C0777rx.f9568
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L20
            java.lang.ClassLoader r1 = p000.C0777rx.f9569
            if (r1 != r11) goto L20
            java.lang.String r11 = "prewarm already finished for this generation and classloader, skip"
            m5175(r11)
            return
        L20:
            r1 = -1
            android.content.SharedPreferences r2 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L2a
            int r2 = r2.getInt(r0, r1)     // Catch: java.lang.Throwable -> L2a
            goto L2b
        L2a:
            r2 = r1
        L2b:
            java.lang.String r3 = "dexkit_dy_version"
            java.lang.String r4 = ""
            java.lang.String r5 = p000.ui1.m5893(r3, r4)
            java.lang.String r6 = "dexkit_device_model"
            java.lang.String r4 = p000.ui1.m5893(r6, r4)
            int r7 = android.os.Build.VERSION.SDK_INT
            java.lang.String r8 = "SDK_"
            java.lang.String r7 = p000.a12.m17(r8, r7)
            java.lang.String r8 = android.os.Build.MODEL
            if (r2 == r1) goto L87
            boolean r1 = p000.q02.m4671(r5)
            if (r1 != 0) goto L87
            r1 = 60
            if (r2 != r1) goto L5b
            boolean r1 = r5.equals(r7)
            if (r1 == 0) goto L5b
            boolean r1 = r4.equals(r8)
            if (r1 != 0) goto L87
        L5b:
            java.lang.String r1 = "version mismatch detected, forcing re-prewarm: module(saved="
            java.lang.String r9 = ", current=60), dy(saved="
            java.lang.String r10 = ", current="
            java.lang.StringBuilder r1 = p000.a12.m20(r2, r1, r9, r5, r10)
            java.lang.String r2 = "), device(saved="
            p000.AbstractC0602nx.m4119(r1, r7, r2, r4, r10)
            r1.append(r8)
            java.lang.String r2 = ")"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            m5175(r1)
            java.lang.String r1 = "dexkit_prewarm_done_v3"
            p000.ui1.m5876(r1)
            p000.ui1.m5876(r0)
            p000.ui1.m5876(r3)
            p000.ui1.m5876(r6)
        L87:
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.C0777rx.f9564
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 != 0) goto L97
            java.lang.String r11 = "prewarm already running, skip"
            m5175(r11)
            return
        L97:
            java.lang.Thread r0 = new java.lang.Thread
            oj r1 = new oj
            r3 = 3
            r1.<init>(r11, r3)
            java.lang.String r11 = "r32cd1d4d47390a2e"
            r0.<init>(r1, r11)
            r0.setDaemon(r2)
            r0.start()
            return
    }
}
