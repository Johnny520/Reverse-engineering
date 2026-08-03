package p049b0;

import de.robv.android.xposed.C0760b;
import p001A0.AbstractC0040p;
import p007D0.C0140f;
import p007D0.C0146l;
import p009E0.AbstractC0179j;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;
import p050c0.C0588G;
import p052d0.C0758s;

/* JADX INFO: renamed from: b0.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0555e implements InterfaceC0286l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1651a;

    public /* synthetic */ C0555e(int i2) {
        this.f1651a = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:236:0x042b  */
    @Override // p029P0.InterfaceC0286l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z2;
        Object objM116u;
        Object objM116u2;
        C0758s c0758s;
        C0758s c0758s2;
        switch (this.f1651a) {
            case 0:
                C0562l c0562l = (C0562l) obj;
                AbstractC0307g.m703e(c0562l, "ctx");
                if (!c0562l.m1373b("com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupPersonalInfo") || !c0562l.m1373b("com.tencent.mm.plugin.setting.ui.setting_new.MainSettingsUI")) {
                    if (!c0562l.m1373b("com.tencent.mm.plugin.setting.ui.setting_new.MainSettingsUI") && !c0562l.m1373b("com.tencent.mm.plugin.setting.ui.setting.SettingsUI")) {
                    }
                }
                break;
            case 1:
                C0562l c0562l2 = (C0562l) obj;
                AbstractC0307g.m703e(c0562l2, "ctx");
                if (!c0562l2.m1373b("com.tencent.tinker.loader.shareutil.ShareTinkerInternals") && !c0562l2.m1372a("Tinker.TinkerInternals")) {
                }
                break;
            case 2:
                C0562l c0562l3 = (C0562l) obj;
                AbstractC0307g.m703e(c0562l3, "ctx");
                if (!c0562l3.m1374c("MicroMsg.LauncherUI") && !c0562l3.m1373b("com.tencent.mm.ui.LauncherUI") && !c0562l3.m1372a("MicroMsg.LauncherUI")) {
                }
                break;
            case 3:
                AbstractC0307g.m703e((C0562l) obj, "<unused var>");
                break;
            case 4:
                C0562l c0562l4 = (C0562l) obj;
                AbstractC0307g.m703e(c0562l4, "ctx");
                String[] strArr = {"com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI", "com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI2"};
                for (int i2 = 0; i2 < 2; i2++) {
                    if (c0562l4.m1373b(strArr[i2])) {
                    }
                    break;
                }
                break;
            case 5:
                C0562l c0562l5 = (C0562l) obj;
                AbstractC0307g.m703e(c0562l5, "ctx");
                if (!c0562l5.m1374c("MicroMsg.LauncherUI") && !c0562l5.m1373b("com.tencent.mm.ui.LauncherUI") && !c0562l5.m1372a("MicroMsg.LauncherUI")) {
                }
                break;
            case 6:
                C0562l c0562l6 = (C0562l) obj;
                AbstractC0307g.m703e(c0562l6, "ctx");
                if (!c0562l6.m1374c("summerbig initDownloadAttach msgLocalId[%d], msgXml[%s], downloadPath[%s]") || !c0562l6.m1374c("summerbig initDownloadAttach ret[%b], rowid[%d], field_totalLen[%d], type[%d], isLargeFile[%d], destFile[%s], msgLocalId[%s], stack[%s]")) {
                    if (!c0562l6.m1374c("summerbig initDownloadAttach") && !c0562l6.m1374c("VFS.VFSStrategy")) {
                    }
                }
                break;
            case 7:
                C0562l c0562l7 = (C0562l) obj;
                AbstractC0307g.m703e(c0562l7, "ctx");
                if (!c0562l7.m1374c("MicroMsg.LauncherUI") && !c0562l7.m1373b("com.tencent.mm.ui.LauncherUI") && !c0562l7.m1372a("MicroMsg.LauncherUI")) {
                }
                break;
            case 8:
                C0562l c0562l8 = (C0562l) obj;
                AbstractC0307g.m703e(c0562l8, "ctx");
                if (!c0562l8.m1374c("MicroMsg.LauncherUIBottomTabView") && !c0562l8.m1372a("MicroMsg.LauncherUIBottomTabView") && !c0562l8.m1373b("com.tencent.mm.ui.LauncherUIBottomTabView") && !c0562l8.m1373b("com.tencent.mm.ui.MainTabUI")) {
                    if (!c0562l8.m1374c("MicroMsg.LauncherUI") && !c0562l8.m1373b("com.tencent.mm.ui.LauncherUI")) {
                    }
                }
                break;
            case 9:
                C0562l c0562l9 = (C0562l) obj;
                AbstractC0307g.m703e(c0562l9, "ctx");
                if (!c0562l9.m1374c("updateMainTabUnread", "MicroMsg.LauncherUITabView") && !c0562l9.m1374c("[updateFriendTabUnread]") && !c0562l9.m1373b("com.tencent.mm.ui.MainTabUI") && !c0562l9.m1373b("com.tencent.mm.ui.LauncherUI")) {
                    if (c0562l9.m1374c("MicroMsg.LauncherUI")) {
                    }
                }
                break;
            case 10:
                AbstractC0307g.m703e((C0562l) obj, "<unused var>");
                break;
            case 11:
                C0562l c0562l10 = (C0562l) obj;
                AbstractC0307g.m703e(c0562l10, "ctx");
                if (!c0562l10.m1374c("MicroMsg.ChatFooter") && !c0562l10.m1373b("com.tencent.mm.pluginsdk.ui.chat.ChatFooter") && !c0562l10.m1372a("MicroMsg.ChatFooter")) {
                }
                break;
            case 12:
                C0562l c0562l11 = (C0562l) obj;
                AbstractC0307g.m703e(c0562l11, "ctx");
                boolean z3 = c0562l11.m1374c("MicroMsg.LauncherUI") || c0562l11.m1373b("com.tencent.mm.ui.LauncherUI") || c0562l11.m1372a("MicroMsg.LauncherUI");
                if (!c0562l11.m1372a("MicroMsg.ConfigStorageLogic")) {
                    ClassLoader classLoader = c0562l11.f1660a;
                    AbstractC0307g.m703e(classLoader, "cl");
                    try {
                        objM116u = Class.forName("iy0.z1", false, classLoader);
                    } catch (Throwable th) {
                        objM116u = AbstractC0040p.m116u(th);
                    }
                    z2 = ((Class) (objM116u instanceof C0140f ? null : objM116u)) != null || c0562l11.m1372a("get userinfo fail");
                    break;
                }
                if (!z3 || !z2) {
                    if (z3) {
                    }
                }
                break;
            case 13:
                C0562l c0562l12 = (C0562l) obj;
                AbstractC0307g.m703e(c0562l12, "ctx");
                if (!c0562l12.m1374c("MicroMsg.LauncherUI") && !c0562l12.m1373b("com.tencent.mm.ui.LauncherUI") && !c0562l12.m1372a("MicroMsg.LauncherUI")) {
                }
                break;
            case 14:
                C0562l c0562l13 = (C0562l) obj;
                AbstractC0307g.m703e(c0562l13, "ctx");
                if (!c0562l13.m1374c("doRevokeMsg xmlSrvMsgId=") && !c0562l13.m1374c("doRevokeMsg xmlSrvMsgId=%d talker=%s isGet=%s")) {
                    ClassLoader classLoader2 = c0562l13.f1660a;
                    AbstractC0307g.m703e(classLoader2, "cl");
                    try {
                        objM116u2 = Class.forName("iy0.u", false, classLoader2);
                    } catch (Throwable th2) {
                        objM116u2 = AbstractC0040p.m116u(th2);
                    }
                    if (((Class) (objM116u2 instanceof C0140f ? null : objM116u2)) != null) {
                    }
                }
                break;
            case 15:
                C0562l c0562l14 = (C0562l) obj;
                AbstractC0307g.m703e(c0562l14, "ctx");
                boolean z4 = c0562l14.m1374c("MicroMsg.ChatFooter") || c0562l14.m1373b("com.tencent.mm.pluginsdk.ui.chat.ChatFooter") || c0562l14.m1372a("MicroMsg.ChatFooter");
                boolean z5 = c0562l14.m1374c("MicroMsg.MMNeatTextView") || c0562l14.m1373b("com.tencent.mm.ui.widget.MMNeat7extView") || c0562l14.m1373b("com.tencent.mm.view.x2c.X2CTextView") || c0562l14.m1372a("MicroMsg.MMNeatTextView");
                if (!z4 || !z5) {
                    if (!z4 && !z5) {
                    }
                }
                break;
            case 16:
                C0562l c0562l15 = (C0562l) obj;
                AbstractC0307g.m703e(c0562l15, "ctx");
                if (!c0562l15.m1374c("MicroMsg.MMNeatTextView") && !c0562l15.m1373b("com.tencent.mm.ui.widget.MMNeat7extView") && !c0562l15.m1373b("com.tencent.mm.pluginsdk.ui.chat.ChatFooter") && !c0562l15.m1372a("MicroMsg.MMNeatTextView")) {
                }
                break;
            case 17:
                C0562l c0562l16 = (C0562l) obj;
                AbstractC0307g.m703e(c0562l16, "ctx");
                if (!c0562l16.m1374c("MicroMsg.ChatFooter") && !c0562l16.m1373b("com.tencent.mm.pluginsdk.ui.chat.ChatFooter") && !c0562l16.m1372a("MicroMsg.ChatFooter")) {
                }
                break;
            case 18:
                C0562l c0562l17 = (C0562l) obj;
                AbstractC0307g.m703e(c0562l17, "ctx");
                if (!c0562l17.m1374c("MicroMsg.SnsInfoStorage") && !c0562l17.m1372a("MicroMsg.SnsInfoStorage")) {
                }
                break;
            case 19:
                C0562l c0562l18 = (C0562l) obj;
                AbstractC0307g.m703e(c0562l18, "ctx");
                if (!c0562l18.m1374c("deleteComment", "MicroMsg.SnsInfoStorageLogic") && !c0562l18.m1374c("commentUsername:%s, actionUsername:%s, removeComment:%s")) {
                    if (!c0562l18.m1372a("MicroMsg.SnsCommentStorage") && !c0562l18.m1374c("set sns del")) {
                        if (c0562l18.m1372a("MicroMsg.SnsInfoStorage")) {
                        }
                    }
                }
                break;
            case 20:
                C0562l c0562l19 = (C0562l) obj;
                AbstractC0307g.m703e(c0562l19, "ctx");
                if (!c0562l19.m1372a("MicroMsg.SnsInfoStorage") && !c0562l19.m1374c("MicroMsg.LauncherUI") && !c0562l19.m1373b("com.tencent.mm.ui.LauncherUI")) {
                }
                break;
            case 21:
                C0562l c0562l20 = (C0562l) obj;
                AbstractC0307g.m703e(c0562l20, "ctx");
                if (!c0562l20.m1374c("MicroMsg.ContactInfoUI") && !c0562l20.m1373b("com.tencent.mm.plugin.profile.ui.ContactInfoUI") && !c0562l20.m1372a("MicroMsg.ContactInfoUI")) {
                }
                break;
            case 22:
                C0562l c0562l21 = (C0562l) obj;
                AbstractC0307g.m703e(c0562l21, "ctx");
                if (!c0562l21.m1374c("MicroMsg.MMNeatTextView") && !c0562l21.m1373b("com.tencent.mm.ui.widget.MMNeat7extView") && !c0562l21.m1373b("com.tencent.mm.pluginsdk.ui.chat.ChatFooter") && !c0562l21.m1372a("MicroMsg.MMNeatTextView")) {
                }
                break;
            case 23:
                C0562l c0562l22 = (C0562l) obj;
                AbstractC0307g.m703e(c0562l22, "ctx");
                if (!c0562l22.m1374c("MicroMsg.MMNeatTextView") && !c0562l22.m1373b("com.tencent.mm.ui.widget.MMNeat7extView") && !c0562l22.m1372a("MicroMsg.MMNeatTextView")) {
                }
                break;
            case 24:
                String str = (String) obj;
                AbstractC0307g.m703e(str, "it");
                break;
            case 25:
                int iIntValue = ((Integer) obj).intValue();
                C0588G c0588g = C0588G.f1768a;
                C0588G.f1779l = iIntValue < 0 ? 0 : iIntValue;
                C0588G.m1416c();
                break;
            case 26:
                int iIntValue2 = ((Integer) obj).intValue();
                C0588G c0588g2 = C0588G.f1768a;
                C0588G.f1780m = iIntValue2 < 0 ? 0 : iIntValue2;
                C0588G.m1416c();
                break;
            case 27:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C0588G c0588g3 = C0588G.f1768a;
                C0588G.f1781n = zBooleanValue;
                C0588G.m1416c();
                break;
            case 28:
                C0760b c0760b = (C0760b) obj;
                AbstractC0307g.m703e(c0760b, "param");
                Object[] objArr = c0760b.f2670c;
                AbstractC0307g.m702d(objArr, "args");
                Object objM537n0 = AbstractC0179j.m537n0(0, objArr);
                Number number = objM537n0 instanceof Number ? (Number) objM537n0 : null;
                if (number != null) {
                    int iIntValue3 = number.intValue();
                    Object[] objArr2 = c0760b.f2670c;
                    AbstractC0307g.m702d(objArr2, "args");
                    Object objM537n02 = AbstractC0179j.m537n0(1, objArr2);
                    Number number2 = objM537n02 instanceof Number ? (Number) objM537n02 : null;
                    float fFloatValue = number2 != null ? number2.floatValue() : 0.0f;
                    if (C0588G.f1774g && (c0758s = C0588G.f1770c) != null) {
                        c0758s.setScrollProgress(iIntValue3 + fFloatValue);
                    }
                    if (fFloatValue == 0.0f) {
                        C0758s c0758s3 = C0588G.f1770c;
                        if (c0758s3 != null) {
                            c0758s3.m1942e(iIntValue3, false);
                        }
                        C0588G c0588g4 = C0588G.f1768a;
                        C0588G.m1417d(iIntValue3);
                    }
                }
                break;
            default:
                C0760b c0760b2 = (C0760b) obj;
                AbstractC0307g.m703e(c0760b2, "param");
                Object[] objArr3 = c0760b2.f2670c;
                AbstractC0307g.m702d(objArr3, "args");
                Object objM537n03 = AbstractC0179j.m537n0(0, objArr3);
                Number number3 = objM537n03 instanceof Number ? (Number) objM537n03 : null;
                if (number3 != null) {
                    int iIntValue4 = number3.intValue();
                    if (!C0588G.f1774g && (c0758s2 = C0588G.f1770c) != null) {
                        c0758s2.m1942e(iIntValue4, true);
                    }
                    C0758s c0758s4 = C0588G.f1770c;
                    if (c0758s4 != null) {
                        c0758s4.m1943f();
                    }
                    C0588G c0588g5 = C0588G.f1768a;
                    C0588G.m1417d(iIntValue4);
                }
                break;
        }
        return C0146l.f339a;
    }
}
