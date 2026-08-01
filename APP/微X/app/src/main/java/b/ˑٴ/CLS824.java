// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS36.CLS35;
import b.ʾᵢ.CLS38.CLS37;
import b.ᐧˉ.CLS1019;
import b.ᐧˉ.CLS1030;
import b.ᐧˉ.CLS1062;
import b.ᐧˉ.CLS1065;
import b.ᐧˉ.CLS1078;
import b.ᐧˉ.CLS1105;
import b.ᐧˉ.CLS1112;
import b.ᐧˉ.CLS1145;
import b.ᐧˉ.CLS1173;
import b.ᐧˉ.CLS210;
import b.ᐧˉ.CLS899;
import b.ᐧˉ.CLS911;
import b.ᐧˉ.CLS928;
import b.ᐧˉ.CLS931;
import b.ᐧˉ.CLS946;
import b.ᐧˉ.CLS952;
import b.ᐧˉ.CLS997;
import java.util.ArrayList;
import java.util.HashMap;

public final class CLS824 extends CLS140 {
    public final HashMap FLD1257;

    public CLS824(CLS139 ﹶʼ0) {
        super(ﹶʼ0);
        this.FLD1257 = new HashMap();
    }

    // 此方法包含解密的字符串
    @Override  // b.ˑٴ.CLS140
    public final void MTH3040(CLS21 ʾᵢ0) {
        public final class CLS823 implements CLS2 {
            public final CLS210 FLD1256;

            public CLS823(CLS210 ˋʼ0) {
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                String s2 = CLS27.MTH889("config_responses");
                this.FLD1256.MTH3749(s2, "hc_block_video_call_" + s, true);
            }
        }

        ʾᵢ0.MTH828("settings.config", ((CLS35)new CLS820(this, 0)));
        ʾᵢ0.MTH833("settings.keywords", ((CLS37)new CLS688(this, 1)));
        ʾᵢ0.MTH828("b.settingsui.onactivityresult,b.launcherui.onactivityresult,b.mmactivity.onactivityresult,b.chattingui.onactivityresult,b.fragmentactivity.onactivityresult", ((CLS35)new CLS820(this, 1)));
        ʾᵢ0.MTH828("b.chatroominfoui.menu.config,b.contactinfoui.menu.config,b.singlechatinfoui.menu.config", ((CLS35)new CLS820(this, 2)));
        ʾᵢ0.MTH828("secret_notification", ((CLS35)new CLS820(this, 3)));
        ʾᵢ0.MTH828("showSfBlockVidResponse", ((CLS35)new CLS820(this, 4)));
        ʾᵢ0.MTH828("showBlacklistAddMemberDialog", ((CLS35)new CLS820(this, 5)));
        ʾᵢ0.MTH828("showChatroomManagementDialog", ((CLS35)new CLS820(this, 6)));
        ʾᵢ0.MTH828("showAddTaskScheduleDialog", ((CLS35)new CLS820(this, 7)));
        ʾᵢ0.MTH833(CLS34.MTH1068(16, ʾᵢ0, CLS34.MTH1068(15, ʾᵢ0, CLS34.MTH1068(14, ʾᵢ0, CLS34.MTH1068(27, ʾᵢ0, "settings.options", 4101712378498700085L), 0x38EC35BE2B3CD335L), 4101708676236890933L), 0x38EC32602B3CD335L), ((CLS37)new CLS688(this, 0)));
        ʾᵢ0.MTH833(CLS34.MTH1068(22, ʾᵢ0, CLS34.MTH1068(21, ʾᵢ0, CLS34.MTH1068(20, ʾᵢ0, CLS34.MTH1068(19, ʾᵢ0, CLS34.MTH1068(18, ʾᵢ0, CLS34.MTH1068(17, ʾᵢ0, "settings.options", 4101708345524409141L), 4101708418538853173L), 4101708491553297205L), 4101708564567741237L), 4101709187337999157L), 4101709260352443189L), ((CLS37)new CLS688(this, 2)));
        ʾᵢ0.MTH833(CLS34.MTH1068(25, ʾᵢ0, CLS34.MTH1068(24, ʾᵢ0, CLS34.MTH1068(23, ʾᵢ0, "settings.options", 4101709406381331253L), 4101708929639961397L), 4101709002654405429L), ((CLS37)new CLS787(26)));
    }

    // 去混淆评级： 低(21)
    // 此方法包含解密的字符串
    @Override  // b.ˑٴ.CLS140
    public final void MTH3043() {
        CLS1078 ـˆ0 = new CLS1078(CLS27.MTH889("scheduled_task_list"), "scheduled_task");
        this.FLD1257.put("scheduled_task", ـˆ0);
        CLS931 ʼﹳ0 = new CLS931(CLS27.MTH889("configure_forwarding_settings"), "config_forward");
        this.FLD1257.put("config_forward", ʼﹳ0);
        CLS899 ʻʼ0 = new CLS899(CLS27.MTH889("config_contacts"), "configure_contacts");
        this.FLD1257.put("configure_contacts", ʻʼ0);
        CLS997 ˋ0 = new CLS997(CLS27.MTH889("moments"), "moments");
        this.FLD1257.put("moments", ˋ0);
        CLS1105 ᐧˈ0 = new CLS1105(CLS27.MTH889("configure_redpackets"), "configure_redpackets");
        this.FLD1257.put("configure_redpackets", ᐧˈ0);
        CLS1019 ˎʻ0 = new CLS1019(CLS27.MTH889("chatroom_management"), "chatroom_management");
        this.FLD1257.put("chatroom_management", ˎʻ0);
        CLS928 ʼᴵ0 = new CLS928(CLS27.MTH889("configure_chatfilter_settings"), "configure_chatfilter_settings");
        this.FLD1257.put("configure_chatfilter_settings", ʼᴵ0);
        CLS1030 ˎᵢ0 = new CLS1030(CLS27.MTH889("config_autoreply"), "configure_autoreply");
        this.FLD1257.put("configure_autoreply", ˎᵢ0);
        CLS1112 ᐧˏ0 = new CLS1112(CLS27.MTH889("filterchat"), "configure_filterchat");
        this.FLD1257.put("configure_filterchat", ᐧˏ0);
        CLS1065 יᴵ0 = new CLS1065(CLS27.MTH889("unrecalled"), "config_unrecall");
        this.FLD1257.put("config_unrecall", יᴵ0);
        CLS1173 ᵢᵢ0 = new CLS1173(CLS27.MTH889("custom_notification"), "custom_notification");
        this.FLD1257.put("custom_notification", ᵢᵢ0);
        CLS952 ʿˏ0 = new CLS952(CLS27.MTH889("configure_tts_settings"), "config_tts");
        this.FLD1257.put("config_tts", ʿˏ0);
        CLS946 ʿ0 = new CLS946(CLS27.MTH889("config_misc"), "config_misc");
        this.FLD1257.put("config_misc", ʿ0);
        CLS1145 ᵎˉ0 = new CLS1145(CLS27.MTH889("configure_experimental_settings"), "config_experimental");
        this.FLD1257.put("config_experimental", ᵎˉ0);
        CLS911 ʼ0 = new CLS911(CLS27.MTH889("config_custom"), "config_custom");
        this.FLD1257.put("config_custom", ʼ0);
        CLS1062 יٴ0 = new CLS1062(CLS27.MTH889("transcode"), "config_transcode");
        this.FLD1257.put("config_transcode", יٴ0);
    }
}

