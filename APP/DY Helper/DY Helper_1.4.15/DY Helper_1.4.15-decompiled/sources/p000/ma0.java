package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ma0 implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f7044;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.app.Activity f7045;

    public /* synthetic */ ma0(android.app.Activity r1, int r2) {
            r0 = this;
            r0.f7044 = r2
            r0.f7045 = r1
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r8) {
            r7 = this;
            int r8 = r7.f7044
            r0 = 1
            r1 = 0
            android.app.Activity r7 = r7.f7045
            switch(r8) {
                case 0: goto Lfb;
                case 1: goto Lf7;
                case 2: goto L24;
                default: goto L9;
            }
        L9:
            android.app.AlertDialog$Builder r8 = new android.app.AlertDialog$Builder
            r8.<init>(r7)
            java.lang.String r7 = "人员续火与火星任务教程"
            android.app.AlertDialog$Builder r7 = r8.setTitle(r7)
            java.lang.String r8 = "人员续火与小火人设置说明\n\n1. 入口\n在自定义续火人员页面点击某个人员，会打开当前“续火与火星任务”弹窗。\n\n2. 消息来源\n跟随全局：不为该人员单独指定内容。发送续火消息时会继续使用分组配置；如果没有分组配置，再使用全局配置。\n固定文本：只给该人员使用输入框里的文字。保存时固定文本不能为空，最多保存 80 个字符。\n一言：给该人员发送时从一言接口获取一句话。\n今日诗词：给该人员发送时从今日诗词接口获取诗句。\n\n3. 输入框\n只有选择“固定文本”时，输入框内容才会作为该人员的专属续火文案保存。\n点击“输入该人员专属固定文本”输入框后会自动获取焦点并弹出键盘；如果键盘被宿主 App 拦截，可再次点击输入框。\n\n4. 个人续火规则\n跟随默认规则：该人员是否参与续火由全局开关、分组规则和待续状态决定。\n加入自定义续火：即使全局自定义人员续火列表中原本没有该人员，也会把他纳入自定义续火目标。\n自定义续火时排除：当执行自定义续火时，明确跳过该人员。\n\n5. 保存与清除\n点击“保存”会同时保存消息来源、固定文本、个人续火规则、火星任务、自动投喂和营地动作覆盖项。\n点击“清除”会删除该人员的专属配置，并把续火、火星任务、自动投喂与营地动作恢复为跟随分组或全局。\n点击“取消”不会保存本次修改。\n\n6. 测试发送续火消息\n“测试发送续火消息”会立刻按当前弹窗里的选择生成一次消息并尝试发送给该人员。\n测试发送用于验证内容和发送链路，不等同于保存；测试前未保存的内容只在本次测试中临时生效。\n如果发送能力未激活，需要先在聊天里手动发送一条消息，让模块捕获发送入口。\n\n7. 完成火星任务\n“完成火星任务”只处理当前弹窗对应的人员，不会遍历或触发其他人员。\n执行时采用弹窗当前选择的“参与每日火星任务”“自动完成互发消息”“自动发送任务图片”和互发消息内容；即使尚未点击保存，本次执行也会临时采用这些选择。\n互发消息内容留空时先跟随分组任务文本，再跟随设置页中的全局默认内容；图片任务使用分组或设置页选择的规则。\n执行过程会显示顶部进度通知，并依次读取该人员任务、提交允许的消息或图片，最后检查并领取可领取奖励。\n若该人员被设为不参与、没有符合条件的任务、发送能力尚未激活或已有火星任务正在运行，结果弹窗会给出相应说明。\n\n8. 自动投喂\n“自动投喂小火人”可设置为跟随分组/全局、开启或关闭；全局总开关关闭时不会自动投喂任何人员。\n“投喂食物”可跟随分组/设置页默认值，也可为当前人员单独选择。缓存价格只用于展示，实际投喂前仍会读取该会话实时目录并执行设置页的价格上限。\n“更新该人员食物列表”会优先使用当前会话刷新目录，不会执行投喂。\n\n9. 营地动作\n营地自动收获、自动种植和自动浇水均可设置为跟随分组/全局、开启或关闭。\n营地种子策略和智能种子排除名单仍在营地管理页面按人员或全局设置；个人营地动作覆盖不会修改这些细粒度配置。\n\n10. 伪装火花天数\n开启设置页里的“伪装火花天数”后，可在本弹窗输入 1~9999 的天数。\n留空表示不伪装该人员。该功能只改本地展示用的火花数据，不会改变服务端真实天数。\n保存或清除后，建议返回消息列表重新进入，让会话数据重新刷新。\n\n11. 优先级\n人员专属配置优先级最高。\n没有人员专属配置时使用人员所在分组配置。\n没有分组配置时使用全局火花续期配置。\nAPI 获取失败时会回退到全局固定文本，避免续火消息为空。\n\n火星互发任务消息与续火消息相互独立：人员未设置专属任务消息时先跟随分组，再跟随火星任务全局默认内容。\n\n12. 常见问题\n如果选择固定文本但留空，保存会被拒绝。\n如果选择一言或今日诗词，输入框里的文字不会参与发送。\n如果对同一人员同时配置了分组规则和个人规则，个人规则覆盖分组规则。"
            android.app.AlertDialog$Builder r7 = r7.setMessage(r8)
            java.lang.String r8 = "知道了"
            android.app.AlertDialog$Builder r7 = r7.setPositiveButton(r8, r1)
            r7.show()
            return
        L24:
            bv1 r8 = p000.bv1.f1853
            r8 = 0
            java.util.List r0 = p000.C0888ux.m5967(r1, r0, r1)     // Catch: java.lang.Throwable -> L3c
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L3f
            java.lang.String r0 = "没有可导出的日志"
            android.widget.Toast r0 = android.widget.Toast.makeText(r7, r0, r8)     // Catch: java.lang.Throwable -> L3c
            r0.show()     // Catch: java.lang.Throwable -> L3c
            goto Lf6
        L3c:
            r0 = move-exception
            goto Ld6
        L3f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r1.<init>()     // Catch: java.lang.Throwable -> L3c
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r2 = p000.bv1.m1069(r7, r2)     // Catch: java.lang.Throwable -> L3c
            r1.append(r2)     // Catch: java.lang.Throwable -> L3c
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3c
        L53:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L6c
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L3c
            ux$α r2 = (p000.C0888ux.C1157) r2     // Catch: java.lang.Throwable -> L3c
            java.lang.String r2 = p000.C0888ux.m5982(r2)     // Catch: java.lang.Throwable -> L3c
            r1.append(r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r2 = "\n\n"
            r1.append(r2)     // Catch: java.lang.Throwable -> L3c
            goto L53
        L6c:
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L3c
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L3c
            java.lang.String r2 = "android.intent.action.CREATE_DOCUMENT"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r2 = "android.intent.category.OPENABLE"
            r1.addCategory(r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r2 = "text/plain"
            r1.setType(r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r2 = "android.intent.extra.TITLE"
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L3c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r5.<init>()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r6 = "dylog_"
            r5.append(r6)     // Catch: java.lang.Throwable -> L3c
            r5.append(r3)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = ".txt"
            r5.append(r3)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L3c
            r1.putExtra(r2, r3)     // Catch: java.lang.Throwable -> L3c
            ju1 r2 = new ju1     // Catch: java.lang.Throwable -> L3c
            r2.<init>()     // Catch: java.lang.Throwable -> L3c
            r2.f5587 = r0     // Catch: java.lang.Throwable -> L3c
            it1 r0 = new it1     // Catch: java.lang.Throwable -> L3c
            r3 = 5
            r0.<init>(r7, r3)     // Catch: java.lang.Throwable -> L3c
            r2.f5588 = r0     // Catch: java.lang.Throwable -> L3c
            android.app.FragmentManager r0 = r7.getFragmentManager()     // Catch: java.lang.Throwable -> L3c
            android.app.FragmentTransaction r0 = r0.beginTransaction()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = "export_log_fragment"
            android.app.FragmentTransaction r0 = r0.add(r2, r3)     // Catch: java.lang.Throwable -> L3c
            r0.commitAllowingStateLoss()     // Catch: java.lang.Throwable -> L3c
            android.os.Handler r0 = new android.os.Handler     // Catch: java.lang.Throwable -> L3c
            android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L3c
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L3c
            ii0 r3 = new ii0     // Catch: java.lang.Throwable -> L3c
            r4 = 23
            r3.<init>(r2, r4, r1)     // Catch: java.lang.Throwable -> L3c
            r1 = 100
            r0.postDelayed(r3, r1)     // Catch: java.lang.Throwable -> L3c
            goto Lf6
        Ld6:
            java.lang.String r1 = "DYHelper"
            java.lang.String r2 = "导出日志失败"
            p000.C0888ux.m5977(r1, r2, r0)
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "导出失败: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.widget.Toast r7 = android.widget.Toast.makeText(r7, r0, r8)
            r7.show()
        Lf6:
            return
        Lf7:
            p000.mi0.m3829(r7)
            return
        Lfb:
            r7.getClass()
            ja0 r8 = new ja0
            r8.<init>(r7, r0)
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L115
            r8.invoke()
            goto L11f
        L115:
            ν r0 = new ν
            r1 = 16
            r0.<init>(r1, r8)
            r7.runOnUiThread(r0)
        L11f:
            return
    }
}
