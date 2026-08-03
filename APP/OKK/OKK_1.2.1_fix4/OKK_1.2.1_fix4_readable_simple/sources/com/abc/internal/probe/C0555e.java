package com.abc.internal.probe;

import com.abc.core.features.C0588G;
import com.abc.ui.FloatingBottomTabView;
import de.robv.android.xposed.C0760b;
import p001A0.AbstractC0040p;
import p007D0.C0140f;
import p007D0.C0146l;
import p009E0.AbstractC0179j;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;
import p042W0.AbstractC0425j;

/* JADX INFO: renamed from: b0.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0555e implements InterfaceC0286l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1651a;

    public /* synthetic */ C0555e(int r1) {
        this.f1651a = r1;
    }

    @Override // p029P0.InterfaceC0286l
    public final Object invoke(Object r21) {
        switch(this.f1651a) {
            case 0: goto L351;
            case 1: goto L343;
            case 2: goto L333;
            case 3: goto L331;
            case 4: goto L322;
            case 5: goto L312;
            case 6: goto L299;
            case 7: goto L289;
            case 8: goto L271;
            case 9: goto L256;
            case 10: goto L254;
            case 11: goto L244;
            case 12: goto L210;
            case 13: goto L200;
            case 14: goto L180;
            case 15: goto L151;
            case 16: goto L139;
            case 17: goto L129;
            case 18: goto L121;
            case 19: goto L104;
            case 20: goto L94;
            case 21: goto L84;
            case 22: goto L72;
            case 23: goto L62;
            case 24: goto L60;
            case 25: goto L54;
            case 26: goto L48;
            case 27: goto L46;
            case 28: goto L20;
            default: goto L4;
        };
    L4:
        C0760b r02 = (C0760b) r21;
        AbstractC0307g.m703e(r02, "param");
        Object[] r03 = r02.f2670c;
        AbstractC0307g.m702d(r03, "args");
        Object r04 = AbstractC0179j.m537n0(0, r03);
        if ((r04 instanceof Number) == false) goto L7;
        Number r14 = (Number) r04;
    L8:
        if (r14 == null) goto L19;
        int r05 = r14.intValue();
        if (C0588G.f1774g == true) goto L14;
        FloatingBottomTabView r1 = C0588G.f1770c;
        if (r1 == null) goto L14;
        r1.m1942e(r05, true);
    L14:
        FloatingBottomTabView r12 = C0588G.f1770c;
        if (r12 == null) goto L17;
        r12.m1943f();
    L17:
        C0588G r13 = C0588G.f1768a;
        C0588G.m1417d(r05);
    L19:
        return C0146l.f339a;
    L7:
        r14 = null;
        goto L8
    L20:
        C0760b r06 = (C0760b) r21;
        AbstractC0307g.m703e(r06, "param");
        Object[] r15 = r06.f2670c;
        AbstractC0307g.m702d(r15, "args");
        Object r16 = AbstractC0179j.m537n0(0, r15);
        if ((r16 instanceof Number) == false) goto L23;
        Number r17 = (Number) r16;
    L24:
        if (r17 == null) goto L45;
        int r18 = r17.intValue();
        Object[] r07 = r06.f2670c;
        AbstractC0307g.m702d(r07, "args");
        Object r08 = AbstractC0179j.m537n0(1, r07);
        if ((r08 instanceof Number) == false) goto L28;
        Number r142 = (Number) r08;
    L30:
        if (r142 == null) goto L32;
        float r2 = r142.floatValue();
    L34:
        if (C0588G.f1774g == false) goto L39;
        FloatingBottomTabView r3 = C0588G.f1770c;
        if (r3 == null) goto L39;
        r3.setScrollProgress(r18 + r2);
    L39:
        if (r2 != 0.0f) goto L45;
        FloatingBottomTabView r09 = C0588G.f1770c;
        if (r09 == null) goto L43;
        r09.m1942e(r18, false);
    L43:
        C0588G r010 = C0588G.f1768a;
        C0588G.m1417d(r18);
        goto L45
    L32:
        r2 = 0.0f;
        goto L34
    L28:
        r142 = null;
    L45:
        return C0146l.f339a;
    L23:
        r17 = null;
        goto L24
    L46:
        boolean r011 = ((Boolean) r21).booleanValue();
        C0588G r19 = C0588G.f1768a;
        C0588G.f1781n = r011;
        C0588G.m1416c();
        return C0146l.f339a;
    L48:
        int r012 = ((Integer) r21).intValue();
        C0588G r110 = C0588G.f1768a;
        if (r012 >= 0) goto L51;
        int r111 = 0;
    L52:
        C0588G.f1780m = r111;
        C0588G.m1416c();
        return C0146l.f339a;
    L51:
        r111 = r012;
        goto L52
    L54:
        int r013 = ((Integer) r21).intValue();
        C0588G r112 = C0588G.f1768a;
        if (r013 >= 0) goto L57;
        int r113 = 0;
    L58:
        C0588G.f1779l = r113;
        C0588G.m1416c();
        return C0146l.f339a;
    L57:
        r113 = r013;
        goto L58
    L60:
        String r014 = (String) r21;
        AbstractC0307g.m703e(r014, "it");
        return AbstractC0425j.m1021Z0(r014, 20);
    L62:
        C0562l r015 = (C0562l) r21;
        AbstractC0307g.m703e(r015, "ctx");
        if (r015.m1374c(new String[]{"MicroMsg.MMNeatTextView"}) == true) goto L71;
        if (r015.m1373b("com.tencent.mm.ui.widget.MMNeat7extView") == true) goto L71;
        if (r015.m1372a(new String[]{"MicroMsg.MMNeatTextView"}) == true) goto L71;
        return new C0557g("无文本控件");
    L71:
        return new C0558h("文本控件");
    L72:
        C0562l r016 = (C0562l) r21;
        AbstractC0307g.m703e(r016, "ctx");
        if (r016.m1374c(new String[]{"MicroMsg.MMNeatTextView"}) == true) goto L83;
        if (r016.m1373b("com.tencent.mm.ui.widget.MMNeat7extView") == true) goto L83;
        if (r016.m1373b("com.tencent.mm.pluginsdk.ui.chat.ChatFooter") == true) goto L83;
        if (r016.m1372a(new String[]{"MicroMsg.MMNeatTextView"}) == true) goto L83;
        return new C0557g("无聊天锚点");
    L83:
        return new C0558h("聊天文本");
    L84:
        C0562l r017 = (C0562l) r21;
        AbstractC0307g.m703e(r017, "ctx");
        if (r017.m1374c(new String[]{"MicroMsg.ContactInfoUI"}) == true) goto L93;
        if (r017.m1373b("com.tencent.mm.plugin.profile.ui.ContactInfoUI") == true) goto L93;
        if (r017.m1372a(new String[]{"MicroMsg.ContactInfoUI"}) == true) goto L93;
        return new C0557g("无 ContactInfoUI");
    L93:
        return new C0558h("ContactInfoUI");
    L94:
        C0562l r018 = (C0562l) r21;
        AbstractC0307g.m703e(r018, "ctx");
        if (r018.m1372a(new String[]{"MicroMsg.SnsInfoStorage"}) == true) goto L103;
        if (r018.m1374c(new String[]{"MicroMsg.LauncherUI"}) == true) goto L103;
        if (r018.m1373b("com.tencent.mm.ui.LauncherUI") == true) goto L103;
        return new C0557g("无锚点");
    L103:
        return new C0558h("朋友圈/主界面锚点");
    L104:
        C0562l r019 = (C0562l) r21;
        AbstractC0307g.m703e(r019, "ctx");
        if (r019.m1374c(new String[]{"deleteComment", "MicroMsg.SnsInfoStorageLogic"}) == true) goto L120;
        if (r019.m1374c(new String[]{"commentUsername:%s, actionUsername:%s, removeComment:%s"}) == true) goto L120;
        if (r019.m1372a(new String[]{"MicroMsg.SnsCommentStorage"}) == true) goto L376;
        if (r019.m1374c(new String[]{"set sns del"}) == true) goto L376;
        if (r019.m1372a(new String[]{"MicroMsg.SnsInfoStorage"}) == false) goto L375;
        return new C0559i("仅朋友圈存储，装载时再验证评论点");
    L375:
        return new C0557g("无评论防撤锚点");
    L376:
        return new C0558h("SnsComment 特征");
    L120:
        return new C0558h("deleteComment 特征");
    L121:
        C0562l r020 = (C0562l) r21;
        AbstractC0307g.m703e(r020, "ctx");
        if (r020.m1374c(new String[]{"MicroMsg.SnsInfoStorage"}) == true) goto L128;
        if (r020.m1372a(new String[]{"MicroMsg.SnsInfoStorage"}) == true) goto L128;
        return new C0557g("无朋友圈存储特征");
    L128:
        return new C0558h("SnsInfoStorage");
    L129:
        C0562l r021 = (C0562l) r21;
        AbstractC0307g.m703e(r021, "ctx");
        if (r021.m1374c(new String[]{"MicroMsg.ChatFooter"}) == true) goto L138;
        if (r021.m1373b("com.tencent.mm.pluginsdk.ui.chat.ChatFooter") == true) goto L138;
        if (r021.m1372a(new String[]{"MicroMsg.ChatFooter"}) == true) goto L138;
        return new C0557g("无 ChatFooter");
    L138:
        return new C0558h("ChatFooter");
    L139:
        C0562l r022 = (C0562l) r21;
        AbstractC0307g.m703e(r022, "ctx");
        if (r022.m1374c(new String[]{"MicroMsg.MMNeatTextView"}) == true) goto L150;
        if (r022.m1373b("com.tencent.mm.ui.widget.MMNeat7extView") == true) goto L150;
        if (r022.m1373b("com.tencent.mm.pluginsdk.ui.chat.ChatFooter") == true) goto L150;
        if (r022.m1372a(new String[]{"MicroMsg.MMNeatTextView"}) == true) goto L150;
        return new C0557g("无聊天锚点");
    L150:
        return new C0558h("聊天区");
    L151:
        C0562l r023 = (C0562l) r21;
        AbstractC0307g.m703e(r023, "ctx");
        if (r023.m1374c(new String[]{"MicroMsg.ChatFooter"}) == false) goto L154;
    L159:
        boolean r114 = true;
    L161:
        if (r023.m1374c(new String[]{"MicroMsg.MMNeatTextView"}) == false) goto L163;
    L170:
        boolean r143 = true;
    L171:
        if (r114 == false) goto L174;
        if (r143 == false) goto L174;
        return new C0558h("ChatFooter + 文本");
    L174:
        if (r114 == true) goto L179;
        if (r143 == true) goto L179;
        return new C0557g("无聊天锚点");
    L179:
        return new C0559i("聊天控件不完整");
    L163:
        if (r023.m1373b("com.tencent.mm.ui.widget.MMNeat7extView") == true) goto L170;
        if (r023.m1373b("com.tencent.mm.view.x2c.X2CTextView") == true) goto L170;
        if (r023.m1372a(new String[]{"MicroMsg.MMNeatTextView"}) == true) goto L170;
        r143 = false;
        goto L171
    L154:
        if (r023.m1373b("com.tencent.mm.pluginsdk.ui.chat.ChatFooter") == true) goto L159;
        if (r023.m1372a(new String[]{"MicroMsg.ChatFooter"}) == true) goto L159;
        r114 = false;
        goto L161
    L180:
        C0562l r024 = (C0562l) r21;
        AbstractC0307g.m703e(r024, "ctx");
        if (r024.m1374c(new String[]{"doRevokeMsg xmlSrvMsgId="}) == true) goto L199;
        if (r024.m1374c(new String[]{"doRevokeMsg xmlSrvMsgId=%d talker=%s isGet=%s"}) == true) goto L199;
        ClassLoader r025 = r024.f1660a;
        AbstractC0307g.m703e(r025, "cl");
        Object r026 = Class.forName("iy0.u", false, r025);     // Catch: Throwable -> L188
    L191:
        if ((r026 instanceof C0140f) == false) goto L193;
        Object r144 = null;
    L195:
        if (((Class) r144) == null) goto L383;
        return new C0559i("仅混淆兜底类");
    L383:
        return new C0557g("未找到撤回入口");
    L193:
        r144 = r026;
    L188:
        th = move-exception;
        r026 = AbstractC0040p.m116u(th);
    L199:
        return new C0558h("doRevokeMsg 特征");
    L200:
        C0562l r027 = (C0562l) r21;
        AbstractC0307g.m703e(r027, "ctx");
        if (r027.m1374c(new String[]{"MicroMsg.LauncherUI"}) == true) goto L209;
        if (r027.m1373b("com.tencent.mm.ui.LauncherUI") == true) goto L209;
        if (r027.m1372a(new String[]{"MicroMsg.LauncherUI"}) == true) goto L209;
        return new C0557g("无 LauncherUI");
    L209:
        return new C0558h("LauncherUI");
    L210:
        C0562l r32 = (C0562l) r21;
        AbstractC0307g.m703e(r32, "ctx");
        if (r32.m1374c(new String[]{"MicroMsg.LauncherUI"}) == false) goto L213;
    L218:
        boolean r115 = true;
    L220:
        if (r32.m1372a(new String[]{"MicroMsg.ConfigStorageLogic"}) == true) goto L236;
        ClassLoader r4 = r32.f1660a;
        AbstractC0307g.m703e(r4, "cl");
        Object r028 = Class.forName("iy0.z1", false, r4);     // Catch: Throwable -> L224
    L227:
        if ((r028 instanceof C0140f) == false) goto L229;
        Object r145 = null;
    L231:
        if (((Class) r145) != null) goto L236;
        if (r32.m1372a(new String[]{"get userinfo fail"}) == true) goto L236;
        boolean r146 = false;
    L237:
        if (r115 == false) goto L240;
        if (r146 == false) goto L240;
        return new C0558h("LauncherUI + 用户信息");
    L240:
        if (r115 == false) goto L243;
        return new C0559i("有主界面，用户信息特征弱");
    L243:
        return new C0557g("无主界面");
    L229:
        r145 = r028;
    L224:
        th = move-exception;
        r028 = AbstractC0040p.m116u(th);
    L236:
        r146 = true;
        goto L237
    L213:
        if (r32.m1373b("com.tencent.mm.ui.LauncherUI") == true) goto L218;
        if (r32.m1372a(new String[]{"MicroMsg.LauncherUI"}) == true) goto L218;
        r115 = false;
        goto L220
    L244:
        C0562l r029 = (C0562l) r21;
        AbstractC0307g.m703e(r029, "ctx");
        if (r029.m1374c(new String[]{"MicroMsg.ChatFooter"}) == true) goto L253;
        if (r029.m1373b("com.tencent.mm.pluginsdk.ui.chat.ChatFooter") == true) goto L253;
        if (r029.m1372a(new String[]{"MicroMsg.ChatFooter"}) == true) goto L253;
        return new C0557g("无 ChatFooter");
    L253:
        return new C0558h("ChatFooter");
    L254:
        AbstractC0307g.m703e((C0562l) r21, "<unused var>");
        return new C0558h("通用 Bitmap 路径");
    L256:
        C0562l r030 = (C0562l) r21;
        AbstractC0307g.m703e(r030, "ctx");
        if (r030.m1374c(new String[]{"updateMainTabUnread", "MicroMsg.LauncherUITabView"}) == true) goto L270;
        if (r030.m1374c(new String[]{"[updateFriendTabUnread]"}) == true) goto L270;
        if (r030.m1373b("com.tencent.mm.ui.MainTabUI") == true) goto L270;
        if (r030.m1373b("com.tencent.mm.ui.LauncherUI") == true) goto L270;
        if (r030.m1374c(new String[]{"MicroMsg.LauncherUI"}) == false) goto L389;
        return new C0559i("仅 LauncherUI 特征");
    L389:
        return new C0557g("无主界面锚点");
    L270:
        return new C0558h("主界面");
    L271:
        C0562l r031 = (C0562l) r21;
        AbstractC0307g.m703e(r031, "ctx");
        if (r031.m1374c(new String[]{"MicroMsg.LauncherUIBottomTabView"}) == true) goto L288;
        if (r031.m1372a(new String[]{"MicroMsg.LauncherUIBottomTabView"}) == true) goto L288;
        if (r031.m1373b("com.tencent.mm.ui.LauncherUIBottomTabView") == true) goto L288;
        if (r031.m1373b("com.tencent.mm.ui.MainTabUI") == true) goto L288;
        if (r031.m1374c(new String[]{"MicroMsg.LauncherUI"}) == true) goto L391;
        if (r031.m1373b("com.tencent.mm.ui.LauncherUI") == true) goto L391;
        return new C0557g("无底栏锚点");
    L391:
        return new C0559i("仅 LauncherUI");
    L288:
        return new C0558h("底栏类");
    L289:
        C0562l r032 = (C0562l) r21;
        AbstractC0307g.m703e(r032, "ctx");
        if (r032.m1374c(new String[]{"MicroMsg.LauncherUI"}) == true) goto L298;
        if (r032.m1373b("com.tencent.mm.ui.LauncherUI") == true) goto L298;
        if (r032.m1372a(new String[]{"MicroMsg.LauncherUI"}) == true) goto L298;
        return new C0557g("无 LauncherUI");
    L298:
        return new C0558h("LauncherUI");
    L299:
        C0562l r033 = (C0562l) r21;
        AbstractC0307g.m703e(r033, "ctx");
        if (r033.m1374c(new String[]{"summerbig initDownloadAttach msgLocalId[%d], msgXml[%s], downloadPath[%s]"}) == false) goto L305;
        if (r033.m1374c(new String[]{"summerbig initDownloadAttach ret[%b], rowid[%d], field_totalLen[%d], type[%d], isLargeFile[%d], destFile[%s], msgLocalId[%s], stack[%s]"}) == false) goto L305;
        return new C0558h("init/insert DownloadAttach 特征");
    L305:
        if (r033.m1374c(new String[]{"summerbig initDownloadAttach"}) == true) goto L311;
        if (r033.m1374c(new String[]{"VFS.VFSStrategy"}) == true) goto L311;
        return new C0557g("无下载附件锚点");
    L311:
        return new C0559i("仅部分下载锚点");
    L312:
        C0562l r034 = (C0562l) r21;
        AbstractC0307g.m703e(r034, "ctx");
        if (r034.m1374c(new String[]{"MicroMsg.LauncherUI"}) == true) goto L321;
        if (r034.m1373b("com.tencent.mm.ui.LauncherUI") == true) goto L321;
        if (r034.m1372a(new String[]{"MicroMsg.LauncherUI"}) == true) goto L321;
        return new C0558h("选点桥接");
    L321:
        return new C0558h("主界面 + 选点桥接");
    L322:
        int r22 = 0;
        C0562l r035 = (C0562l) r21;
        AbstractC0307g.m703e(r035, "ctx");
        String[] r116 = {"com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI", "com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI2"};
    L324:
        if (r22 >= 2) goto L330;
        if (r035.m1373b(r116[r22]) == true) goto L396;
        r22 = r22 + 1;
        goto L324
    L396:
        return new C0558h("登录页");
    L330:
        return new C0558h("登录页（动态解析）");
    L331:
        AbstractC0307g.m703e((C0562l) r21, "<unused var>");
        return new C0558h("系统定位接口");
    L333:
        C0562l r036 = (C0562l) r21;
        AbstractC0307g.m703e(r036, "ctx");
        if (r036.m1374c(new String[]{"MicroMsg.LauncherUI"}) == true) goto L342;
        if (r036.m1373b("com.tencent.mm.ui.LauncherUI") == true) goto L342;
        if (r036.m1372a(new String[]{"MicroMsg.LauncherUI"}) == true) goto L342;
        return new C0557g("无 LauncherUI");
    L342:
        return new C0558h("LauncherUI");
    L343:
        C0562l r037 = (C0562l) r21;
        AbstractC0307g.m703e(r037, "ctx");
        if (r037.m1373b("com.tencent.tinker.loader.shareutil.ShareTinkerInternals") == true) goto L350;
        if (r037.m1372a(new String[]{"Tinker.TinkerInternals"}) == true) goto L350;
        return new C0558h("热更新拦截（通用路径）");
    L350:
        return new C0558h("Tinker");
    L351:
        C0562l r038 = (C0562l) r21;
        AbstractC0307g.m703e(r038, "ctx");
        if (r038.m1373b("com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupPersonalInfo") == false) goto L357;
        if (r038.m1373b("com.tencent.mm.plugin.setting.ui.setting_new.MainSettingsUI") == false) goto L357;
        return new C0558h("MainSettingsUI + PersonalInfo");
    L357:
        if (r038.m1373b("com.tencent.mm.plugin.setting.ui.setting_new.MainSettingsUI") == true) goto L363;
        if (r038.m1373b("com.tencent.mm.plugin.setting.ui.setting.SettingsUI") == true) goto L363;
        return new C0557g("未找到设置页类");
    L363:
        return new C0559i("仅部分设置页类");
    }
}
