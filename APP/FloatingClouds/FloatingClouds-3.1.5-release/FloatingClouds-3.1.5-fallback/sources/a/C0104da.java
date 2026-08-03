package a;

/* JADX INFO: renamed from: a.da, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0104da implements a.InterfaceC0369s7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f435a;
    public final /* synthetic */ a.C0354ra b;

    public /* synthetic */ C0104da(a.C0354ra r1, int r2) {
            r0 = this;
            r0.f435a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // a.InterfaceC0369s7
    public final java.lang.Object a() {
            r14 = this;
            int r0 = r14.f435a
            switch(r0) {
                case 0: goto L138;
                case 1: goto L130;
                case 2: goto L102;
                case 3: goto Lfa;
                case 4: goto Lf2;
                case 5: goto Lbb;
                case 6: goto L8a;
                case 7: goto L53;
                case 8: goto L19;
                default: goto L5;
            }
        L5:
            a.m0 r0 = a.C0255m0.f569a
            a.ra r1 = r14.b
            android.app.Activity r1 = r1.f669a
            r0.getClass()
            boolean r0 = a.C0255m0.c
            if (r0 == 0) goto L13
            goto L16
        L13:
            a.C0255m0.c(r1)
        L16:
            a.Wf r0 = a.Wf.f330a
            return r0
        L19:
            a.ra r0 = r14.b
            r0.getClass()
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            android.app.Activity r2 = r0.f669a
            r1.<init>(r2)
            java.lang.String r2 = "重启微信"
            android.app.AlertDialog$Builder r1 = r1.setTitle(r2)
            java.lang.String r2 = "将关闭并重新启动微信。"
            android.app.AlertDialog$Builder r1 = r1.setMessage(r2)
            a.pa r2 = new a.pa
            r3 = 4
            r2.<init>(r0, r3)
            java.lang.String r3 = "立即重启"
            android.app.AlertDialog$Builder r1 = r1.setPositiveButton(r3, r2)
            java.lang.String r2 = "取消"
            r3 = 0
            android.app.AlertDialog$Builder r1 = r1.setNegativeButton(r2, r3)
            android.app.AlertDialog r1 = r1.create()
            if (r1 == 0) goto L50
            r1.show()
            r0.o(r1)
        L50:
            a.Wf r0 = a.Wf.f330a
            return r0
        L53:
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            a.ra r1 = r14.b
            android.app.Activity r2 = r1.f669a
            r0.<init>(r2)
            java.lang.String r2 = "确认清空"
            android.app.AlertDialog$Builder r0 = r0.setTitle(r2)
            java.lang.String r2 = "将清空全部开关选项、配置名单、已隐藏朋友圈、拦截记录与解析缓存，随后重启微信。\n\n注意：仅重启主进程，微信后台进程可能残留旧配置，建议重启后手动结束微信全部后台进程或重启手机。"
            android.app.AlertDialog$Builder r0 = r0.setMessage(r2)
            a.pa r2 = new a.pa
            r3 = 5
            r2.<init>(r1, r3)
            java.lang.String r3 = "确认清空并重启"
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r3, r2)
            java.lang.String r2 = "取消"
            r3 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r2, r3)
            android.app.AlertDialog r0 = r0.create()
            if (r0 == 0) goto L87
            r0.show()
            r1.o(r0)
        L87:
            a.Wf r0 = a.Wf.f330a
            return r0
        L8a:
            a.ra r0 = r14.b
            r0.getClass()
            java.lang.ClassLoader r1 = a.C0435w1.g
            if (r1 != 0) goto La9
            java.lang.String r1 = "[SimulateHotUpdate] ClassLoader not ready"
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            a.C0453x1.e(r1)
            android.app.Activity r0 = r0.f669a
            java.lang.String r1 = "ClassLoader 未就绪"
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
            goto Lb8
        La9:
            java.lang.Thread r2 = new java.lang.Thread
            a.P0 r3 = new a.P0
            r4 = 10
            r3.<init>(r0, r4, r1)
            r2.<init>(r3)
            r2.start()
        Lb8:
            a.Wf r0 = a.Wf.f330a
            return r0
        Lbb:
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            a.ra r1 = r14.b
            android.app.Activity r2 = r1.f669a
            r0.<init>(r2)
            java.lang.String r2 = "确认清零"
            android.app.AlertDialog$Builder r0 = r0.setTitle(r2)
            java.lang.String r2 = "清零热更新拦截统计数据？"
            android.app.AlertDialog$Builder r0 = r0.setMessage(r2)
            a.pa r2 = new a.pa
            r3 = 3
            r2.<init>(r1, r3)
            java.lang.String r3 = "确认"
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r3, r2)
            java.lang.String r2 = "取消"
            r3 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r2, r3)
            android.app.AlertDialog r0 = r0.create()
            if (r0 == 0) goto Lef
            r0.show()
            r1.o(r0)
        Lef:
            a.Wf r0 = a.Wf.f330a
            return r0
        Lf2:
            a.ra r0 = r14.b
            r0.m()
            a.Wf r0 = a.Wf.f330a
            return r0
        Lfa:
            a.ra r0 = r14.b
            r0.e()
            a.Wf r0 = a.Wf.f330a
            return r0
        L102:
            a.ra r0 = r14.b
            r0.getClass()
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            android.app.Activity r2 = r0.f669a
            r1.<init>(r2)
            java.lang.String r2 = "隐藏朋友圈教程"
            android.app.AlertDialog$Builder r1 = r1.setTitle(r2)
            java.lang.String r2 = "1. 开启「隐藏我的朋友圈」\n2. 进入自己朋友圈相册\n3. 长按任意朋友圈顶部「详情」2秒\n4. 点击「加入隐藏」或「复制」snsId"
            android.app.AlertDialog$Builder r1 = r1.setMessage(r2)
            java.lang.String r2 = "知道了"
            r3 = 0
            android.app.AlertDialog$Builder r1 = r1.setPositiveButton(r2, r3)
            android.app.AlertDialog r1 = r1.create()
            if (r1 == 0) goto L12d
            r1.show()
            r0.o(r1)
        L12d:
            a.Wf r0 = a.Wf.f330a
            return r0
        L130:
            a.ra r0 = r14.b
            r0.f()
            a.Wf r0 = a.Wf.f330a
            return r0
        L138:
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            a.K3.a.i()
            a.ra$b r1 = new a.ra$b
            a.fa r0 = new a.fa
            a.ra r2 = r14.b
            r3 = 5
            r0.<init>(r2, r3)
            java.lang.String r3 = "基础设置"
            java.lang.String r4 = "总开关、配置名单"
            r1.<init>(r3, r4, r0)
            r0 = r2
            a.ra$b r2 = new a.ra$b
            a.fa r3 = new a.fa
            r4 = 7
            r3.<init>(r0, r4)
            java.lang.String r4 = "列表隐藏"
            java.lang.String r5 = "会话、通讯录、标签"
            r2.<init>(r4, r5, r3)
            a.ra$b r3 = new a.ra$b
            a.fa r4 = new a.fa
            r5 = 8
            r4.<init>(r0, r5)
            java.lang.String r5 = "搜索"
            java.lang.String r6 = "主页搜索过滤"
            r3.<init>(r5, r6, r4)
            a.ra$b r4 = new a.ra$b
            a.fa r5 = new a.fa
            r6 = 9
            r5.<init>(r0, r6)
            java.lang.String r6 = "访问拦截"
            java.lang.String r7 = "聊天、资料页"
            r4.<init>(r6, r7, r5)
            a.ra$b r5 = new a.ra$b
            a.fa r6 = new a.fa
            r7 = 10
            r6.<init>(r0, r7)
            java.lang.String r7 = "社交隐藏"
            java.lang.String r8 = "朋友圈、发现页、转发"
            r5.<init>(r7, r8, r6)
            a.ra$b r6 = new a.ra$b
            a.fa r7 = new a.fa
            r8 = 0
            r7.<init>(r0, r8)
            java.lang.String r8 = "消息与通知"
            java.lang.String r9 = "免打扰、震动、加粗、圆点"
            r6.<init>(r8, r9, r7)
            a.ra$b r7 = new a.ra$b
            a.fa r8 = new a.fa
            r9 = 1
            r8.<init>(r0, r9)
            java.lang.String r9 = "临时解除与恢复"
            java.lang.String r10 = "多击、长按、恢复隐藏"
            r7.<init>(r9, r10, r8)
            a.ra$b r8 = new a.ra$b
            a.fa r9 = new a.fa
            r10 = 2
            r9.<init>(r0, r10)
            java.lang.String r10 = "添加密友"
            java.lang.String r11 = "长按添加菜单"
            r8.<init>(r10, r11, r9)
            a.ra$b r9 = new a.ra$b
            a.fa r10 = new a.fa
            r11 = 3
            r10.<init>(r0, r11)
            java.lang.String r11 = "提示自定义"
            java.lang.String r12 = "操作提示开关与文字"
            r9.<init>(r11, r12, r10)
            a.ra$b r10 = new a.ra$b
            a.fa r11 = new a.fa
            r12 = 4
            r11.<init>(r0, r12)
            java.lang.String r12 = "指令与适配"
            java.lang.String r13 = "搜索指令、DexKit"
            r10.<init>(r12, r13, r11)
            a.ra$b r11 = new a.ra$b
            a.fa r12 = new a.fa
            r13 = 6
            r12.<init>(r0, r13)
            java.lang.String r0 = "开发者"
            java.lang.String r13 = "数据库、重启"
            r11.<init>(r0, r13, r12)
            a.ra$b[] r0 = new a.C0354ra.b[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
            java.util.List r0 = a.C0294o3.d0(r0)
            return r0
    }
}
