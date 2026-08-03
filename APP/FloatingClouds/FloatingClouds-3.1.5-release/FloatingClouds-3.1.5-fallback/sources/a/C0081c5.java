package a;

/* JADX INFO: renamed from: a.c5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0081c5 {
    public static final java.lang.String[] f = null;
    public static volatile boolean g;
    public static volatile java.lang.String h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.app.Activity f416a;
    public final java.lang.String b;
    public final android.content.SharedPreferences c;
    public final java.util.List<a.C0081c5.a> d;
    public final int e;

    /* JADX INFO: renamed from: a.c5$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.String f417a;
        public final java.lang.String b;
        public final int c;
        public final a.InterfaceC0369s7<org.json.JSONObject> d;

        public a(java.lang.String r1, java.lang.String r2, int r3, a.InterfaceC0369s7<? extends org.json.JSONObject> r4) {
                r0 = this;
                r0.<init>()
                r0.f417a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                return
        }

        public final boolean equals(java.lang.Object r3) {
                r2 = this;
                if (r2 != r3) goto L3
                goto L33
            L3:
                boolean r0 = r3 instanceof a.C0081c5.a
                if (r0 != 0) goto L8
                goto L31
            L8:
                a.c5$a r3 = (a.C0081c5.a) r3
                java.lang.String r0 = r3.f417a
                java.lang.String r1 = r2.f417a
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L15
                goto L31
            L15:
                java.lang.String r0 = r2.b
                java.lang.String r1 = r3.b
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L20
                goto L31
            L20:
                int r0 = r2.c
                int r1 = r3.c
                if (r0 == r1) goto L27
                goto L31
            L27:
                a.s7<org.json.JSONObject> r0 = r2.d
                a.s7<org.json.JSONObject> r3 = r3.d
                boolean r3 = r0.equals(r3)
                if (r3 != 0) goto L33
            L31:
                r3 = 0
                return r3
            L33:
                r3 = 1
                return r3
        }

        public final int hashCode() {
                r3 = this;
                java.lang.String r0 = r3.f417a
                int r0 = r0.hashCode()
                r1 = 31
                int r0 = r0 * r1
                java.lang.String r2 = r3.b
                int r0 = a.C0487z.b(r2, r0, r1)
                int r2 = r3.c
                int r2 = java.lang.Integer.hashCode(r2)
                int r2 = r2 + r0
                int r2 = r2 * r1
                a.s7<org.json.JSONObject> r0 = r3.d
                int r0 = r0.hashCode()
                int r0 = r0 + r2
                return r0
        }

        public final java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "ScanTask(name="
                r0.<init>(r1)
                java.lang.String r1 = r2.f417a
                r0.append(r1)
                java.lang.String r1 = ", key="
                r0.append(r1)
                java.lang.String r1 = r2.b
                r0.append(r1)
                java.lang.String r1 = ", weight="
                r0.append(r1)
                int r1 = r2.c
                r0.append(r1)
                java.lang.String r1 = ", execute="
                r0.append(r1)
                a.s7<org.json.JSONObject> r1 = r2.d
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            java.lang.String r0 = "va5"
            java.lang.String r1 = "kc5"
            java.lang.String r2 = "com.tencent.mm"
            java.lang.String r3 = "sd5"
            java.lang.String r4 = "yf5"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1, r3, r4}
            a.C0081c5.f = r0
            return
    }

    public C0081c5(android.app.Activity r33, java.lang.String r34) {
            r32 = this;
            r0 = r32
            r1 = r33
            r2 = r34
            java.lang.String r3 = "apkPath"
            a.C0193i9.e(r2, r3)
            r0.<init>()
            r0.f416a = r1
            r0.b = r2
            java.lang.String r2 = "dexkit_scan_cache"
            r3 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)
            java.lang.String r2 = "getSharedPreferences(...)"
            a.C0193i9.d(r1, r2)
            r0.c = r1
            a.c5$a r4 = new a.c5$a
            a.b5 r1 = new a.b5
            r2 = 0
            r1.<init>(r0, r2)
            java.lang.String r2 = "conversation_mvvm_list_v3"
            r5 = 25
            java.lang.String r6 = "会话MVVM列表"
            r4.<init>(r6, r2, r5, r1)
            a.c5$a r5 = new a.c5$a
            a.b5 r1 = new a.b5
            r2 = 2
            r1.<init>(r0, r2)
            java.lang.String r2 = "quick_add_menu_v10"
            r6 = 20
            java.lang.String r7 = "快捷加入菜单"
            r5.<init>(r7, r2, r6, r1)
            a.c5$a r6 = new a.c5$a
            a.b5 r1 = new a.b5
            r2 = 12
            r1.<init>(r0, r2)
            java.lang.String r2 = "通讯录列表"
            java.lang.String r7 = "contact_mvvm_address_v2"
            r8 = 15
            r6.<init>(r2, r7, r8, r1)
            a.c5$a r7 = new a.c5$a
            a.b5 r1 = new a.b5
            r2 = 13
            r1.<init>(r0, r2)
            java.lang.String r2 = "搜索框"
            java.lang.String r9 = "search_command_v2"
            r7.<init>(r2, r9, r8, r1)
            a.c5$a r1 = new a.c5$a
            a.b5 r2 = new a.b5
            r9 = 14
            r2.<init>(r0, r9)
            java.lang.String r9 = "转发列表"
            java.lang.String r10 = "recent_forward_v2"
            r1.<init>(r9, r10, r8, r2)
            a.c5$a r9 = new a.c5$a
            a.b5 r2 = new a.b5
            r2.<init>(r0, r8)
            java.lang.String r8 = "会话存储类"
            java.lang.String r10 = "conv_storage_class_v1"
            r11 = 8
            r9.<init>(r8, r10, r11, r2)
            a.c5$a r10 = new a.c5$a
            a.b5 r2 = new a.b5
            r8 = 16
            r2.<init>(r0, r8)
            java.lang.String r8 = "存储辅助类"
            java.lang.String r12 = "conv_storage_helper_v1"
            r10.<init>(r8, r12, r11, r2)
            a.c5$a r2 = new a.c5$a
            a.b5 r8 = new a.b5
            r12 = 17
            r8.<init>(r0, r12)
            java.lang.String r12 = "Flutter通话类"
            java.lang.String r13 = "flutter_voip_class_v1"
            r14 = 6
            r2.<init>(r12, r13, r14, r8)
            a.c5$a r12 = new a.c5$a
            a.b5 r8 = new a.b5
            r13 = 18
            r8.<init>(r0, r13)
            java.lang.String r13 = "VoipMgr"
            java.lang.String r15 = "voip_mgr_class_v1"
            r12.<init>(r13, r15, r14, r8)
            a.c5$a r13 = new a.c5$a
            a.b5 r8 = new a.b5
            r15 = 19
            r8.<init>(r0, r15)
            java.lang.String r15 = "IncomingCallMgr"
            java.lang.String r3 = "incoming_call_mgr_v1"
            r13.<init>(r15, r3, r14, r8)
            a.c5$a r3 = new a.c5$a
            a.b5 r8 = new a.b5
            r15 = 11
            r8.<init>(r0, r15)
            java.lang.String r15 = "搜索结果RecyclerView"
            java.lang.String r11 = "search_recycler_bind_v1"
            r3.<init>(r15, r11, r14, r8)
            a.c5$a r15 = new a.c5$a
            a.b5 r8 = new a.b5
            r11 = 20
            r8.<init>(r0, r11)
            java.lang.String r11 = "会话存储接口(F010)"
            r16 = r1
            java.lang.String r1 = "conv_storage_iface"
            r15.<init>(r11, r1, r14, r8)
            a.c5$a r1 = new a.c5$a
            a.b5 r8 = new a.b5
            r11 = 21
            r8.<init>(r0, r11)
            java.lang.String r11 = "全量j1候选(F010)"
            r17 = r2
            java.lang.String r2 = "all_j1_classes"
            r1.<init>(r11, r2, r14, r8)
            a.c5$a r2 = new a.c5$a
            a.b5 r8 = new a.b5
            r11 = 22
            r8.<init>(r0, r11)
            java.lang.String r11 = "gm-j1候选(F010)"
            r18 = r1
            java.lang.String r1 = "gm_j1_candidates"
            r2.<init>(r11, r1, r14, r8)
            a.c5$a r1 = new a.c5$a
            a.b5 r8 = new a.b5
            r11 = 23
            r8.<init>(r0, r11)
            java.lang.String r11 = "会话隐藏方法(F010)"
            r19 = r2
            java.lang.String r2 = "conv_hide_method"
            r1.<init>(r11, r2, r14, r8)
            a.c5$a r2 = new a.c5$a
            a.b5 r8 = new a.b5
            r11 = 24
            r8.<init>(r0, r11)
            java.lang.String r11 = "n方法类(F010)"
            r20 = r1
            java.lang.String r1 = "n_method_classes"
            r2.<init>(r11, r1, r14, r8)
            a.c5$a r1 = new a.c5$a
            a.b5 r8 = new a.b5
            r11 = 25
            r8.<init>(r0, r11)
            java.lang.String r11 = "P方法(F010)"
            r21 = r2
            java.lang.String r2 = "p_method"
            r1.<init>(r11, r2, r14, r8)
            a.c5$a r2 = new a.c5$a
            a.b5 r8 = new a.b5
            r11 = 26
            r8.<init>(r0, r11)
            java.lang.String r11 = "Sns时间线适配器"
            r22 = r1
            java.lang.String r1 = "sns_timeline_v1"
            r2.<init>(r11, r1, r14, r8)
            a.c5$a r1 = new a.c5$a
            a.b5 r8 = new a.b5
            r11 = 27
            r8.<init>(r0, r11)
            java.lang.String r11 = "Sns时间线适配器(h2)"
            r23 = r2
            java.lang.String r2 = "sns_timeline_adapter_v1"
            r1.<init>(r11, r2, r14, r8)
            a.c5$a r2 = new a.c5$a
            a.b5 r8 = new a.b5
            r11 = 1
            r8.<init>(r0, r11)
            java.lang.String r11 = "Sns消息适配器"
            r24 = r1
            java.lang.String r1 = "sns_msg_adapter_v1"
            r2.<init>(r11, r1, r14, r8)
            a.c5$a r1 = new a.c5$a
            a.b5 r8 = new a.b5
            r11 = 3
            r8.<init>(r0, r11)
            java.lang.String r11 = "Sns消息关联"
            r25 = r2
            java.lang.String r2 = "sns_msg_relevance_v1"
            r1.<init>(r11, r2, r14, r8)
            a.c5$a r2 = new a.c5$a
            a.b5 r8 = new a.b5
            r11 = 4
            r8.<init>(r0, r11)
            java.lang.String r11 = "Sns回收适配器"
            r26 = r1
            java.lang.String r1 = "sns_recycler_adapter_v1"
            r2.<init>(r11, r1, r14, r8)
            a.c5$a r1 = new a.c5$a
            a.b5 r8 = new a.b5
            r11 = 5
            r8.<init>(r0, r11)
            java.lang.String r11 = "conv_hide_write_v1"
            r14 = 10
            r28 = r2
            java.lang.String r2 = "会话隐藏写方法(Phase E1)"
            r1.<init>(r2, r11, r14, r8)
            a.c5$a r2 = new a.c5$a
            a.b5 r8 = new a.b5
            r11 = 6
            r8.<init>(r0, r11)
            java.lang.String r11 = "通讯录加密友菜单(Phase F)"
            java.lang.String r14 = "contact_menu_v1"
            r29 = r1
            r1 = 6
            r2.<init>(r11, r14, r1, r8)
            a.c5$a r1 = new a.c5$a
            a.b5 r8 = new a.b5
            r11 = 7
            r8.<init>(r0, r11)
            java.lang.String r11 = "conv_adapter_structural_v1"
            r14 = 12
            r27 = r2
            java.lang.String r2 = "会话Adapter结构扫描"
            r1.<init>(r2, r11, r14, r8)
            a.c5$a r2 = new a.c5$a
            a.b5 r8 = new a.b5
            r11 = 8
            r8.<init>(r0, r11)
            java.lang.String r11 = "通讯录加密友菜单定位"
            java.lang.String r14 = "contact_add_mask_v1"
            r30 = r1
            r1 = 8
            r2.<init>(r11, r14, r1, r8)
            a.c5$a r8 = new a.c5$a
            a.b5 r11 = new a.b5
            r14 = 9
            r11.<init>(r0, r14)
            java.lang.String r14 = "消息存储定位(Phase3-B)"
            r33 = r2
            java.lang.String r2 = "msg_storage_v1"
            r8.<init>(r14, r2, r1, r11)
            a.c5$a r1 = new a.c5$a
            a.b5 r2 = new a.b5
            r11 = 10
            r2.<init>(r0, r11)
            java.lang.String r11 = "version_info_v1"
            r14 = 4
            r31 = r3
            java.lang.String r3 = "版本信息类定位"
            r1.<init>(r3, r11, r14, r2)
            r11 = r17
            r17 = r19
            r19 = r21
            r21 = r23
            r23 = r25
            r25 = r28
            r28 = r30
            r14 = r31
            r31 = r1
            r30 = r8
            r8 = r16
            r16 = r18
            r18 = r20
            r20 = r22
            r22 = r24
            r24 = r26
            r26 = r29
            r29 = r33
            a.c5$a[] r1 = new a.C0081c5.a[]{r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31}
            java.util.List r1 = a.C0294o3.d0(r1)
            r0.d = r1
            java.util.Iterator r1 = r1.iterator()
            r3 = 0
        L23c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L24c
            java.lang.Object r2 = r1.next()
            a.c5$a r2 = (a.C0081c5.a) r2
            int r2 = r2.c
            int r3 = r3 + r2
            goto L23c
        L24c:
            r0.e = r3
            return
    }

    public static final int b(java.lang.String r9) {
            java.lang.String r0 = "com.tencent.mm.ui.contact.address"
            r1 = 0
            boolean r0 = a.Ae.H(r9, r0, r1)
            java.lang.String r2 = "conversation"
            if (r0 == 0) goto Ld
            r0 = 3
            goto L1e
        Ld:
            java.lang.String r0 = "com.tencent.mm.ui.contact"
            boolean r0 = a.Ae.H(r9, r0, r1)
            if (r0 == 0) goto L1d
            boolean r0 = a.Be.I(r9, r2, r1)
            if (r0 != 0) goto L1d
            r0 = 2
            goto L1e
        L1d:
            r0 = r1
        L1e:
            java.lang.String r3 = "tf5."
            boolean r3 = a.Ae.H(r9, r3, r1)
            if (r3 == 0) goto L28
            int r0 = r0 + 2
        L28:
            boolean r2 = a.Be.I(r9, r2, r1)
            if (r2 == 0) goto L30
            int r0 = r0 + (-5)
        L30:
            java.lang.String r5 = "fts"
            java.lang.String r6 = "room"
            java.lang.String r2 = "label"
            java.lang.String r3 = "sns"
            java.lang.String r4 = "plugin"
            java.lang.String r7 = "fav"
            java.lang.String r8 = "emoji"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8}
            java.util.List r2 = a.C0294o3.d0(r2)
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L4d
            goto L65
        L4d:
            java.util.Iterator r2 = r2.iterator()
        L51:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L65
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = a.Be.I(r9, r3, r1)
            if (r3 == 0) goto L51
            int r0 = r0 + (-5)
        L65:
            return r0
    }

    public static final void c(java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r1, java.lang.String r2, java.lang.String r3) {
            java.lang.Object r0 = r1.get(r2)
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.put(r2, r0)
        Le:
            java.util.List r0 = (java.util.List) r0
            r0.add(r3)
            return
    }

    public static final void d(java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r1, java.lang.String r2, java.lang.String r3) {
            java.lang.Object r0 = r1.get(r2)
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.put(r2, r0)
        Le:
            java.util.List r0 = (java.util.List) r0
            r0.add(r3)
            return
    }

    public static org.json.JSONObject e(java.lang.String r3, java.lang.String[] r4, java.util.List r5) {
            org.luckypray.dexkit.DexKitBridge r0 = a.C0435w1.l
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            r1 = 0
            if (r0 != 0) goto Lb
            return r1
        Lb:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L14:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L28
            java.lang.Object r2 = r5.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.List r2 = a.C0435w1.o(r2, r4)
            r0.addAll(r2)
            goto L14
        L28:
            boolean r4 = r0.isEmpty()
            java.lang.String r5 = "DexKit: "
            if (r4 == 0) goto L3e
            java.lang.String r4 = " found 0"
            java.lang.String r3 = a.C0487z.g(r5, r3, r4)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            a.C0453x1.e(r3)
            return r1
        L3e:
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            org.json.JSONArray r1 = new org.json.JSONArray
            java.util.List r2 = a.C0383t3.w0(r0)
            r1.<init>(r2)
            java.lang.String r2 = "classNames"
            org.json.JSONObject r4 = r4.put(r2, r1)
            int r0 = r0.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            r1.append(r3)
            java.lang.String r3 = " → "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = " classes"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            a.C0453x1.b(r3)
            return r4
    }

    public static int f(java.lang.String r3) {
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.String r2 = "java.lang.String"
            java.util.List r3 = a.C0435w1.t(r3, r2, r0, r1)
            int r3 = r3.size()
            return r3
    }

    public final void a(java.lang.String r3, org.json.JSONObject r4) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.c
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = r4.toString()
            android.content.SharedPreferences$Editor r0 = r0.putString(r3, r1)
            r0.apply()
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "toString(...)"
            a.C0193i9.d(r4, r0)
            r0 = 100
            java.lang.String r4 = a.Ce.X(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DexKit: saved "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = " ("
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = "...)"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            a.C0453x1.b(r3)
            return
    }
}
