// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.Pair;
import android.widget.ImageView;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS38.CLS37;
import b.ˆʿ.CLS47;
import b.ˆٴ.CLS66;
import b.ˊﾞ.CLS101;
import b.יﹳ.CLS166;
import b.ᵔʾ.CLS283;
import b.ᵔʾ.CLS290;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS392;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import b.ﾞˎ.CLS528;
import b.ﾞᐧ.CLS557;
import b.ﾞᐧ.CLS559;
import java.io.File;

public final class CLS787 implements CLS37 {
    public final int FLD1132;

    public CLS787(int v) {
        this.FLD1132 = v;
        super();
    }

    // 去混淆评级： 低(22)
    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS38$CLS37
    public final Object MTH1108(Object[] arr_object) {
        boolean z = true;
        switch(this.FLD1132) {
            case 0: {
                return CLS27.MTH902("memberslist") ? Pair.create(CLS27.MTH889("memberslist"), "memberslist") : null;
            }
            case 1: {
                return Pair.create(CLS27.MTH889("view_id"), "copy_chatroomid");
            }
            case 2: {
                return CLS290.FLD3007.MTH4759(((String)arr_object[0]));
            }
            case 3: {
                String s1 = (String)arr_object[0];
                String s2 = ((File)arr_object[1]).getAbsolutePath();
                CLS557 ˆٴ0 = CLS101.MTH1943(s1);
                if(ˆٴ0 != null) {
                    new CLS559(ˆٴ0).MTH7485(s2);
                }
                return true;
            }
            case 4: {
                CLS47 ˈˊ0 = CLS47.FLD167;
                if(!ˈˊ0.FLD166) {
                    ˈˊ0.MTH1196();
                }
                return ˈˊ0.FLD164.isEmpty() ? null : Pair.create(CLS27.MTH889("send_mp3"), "send_mp3");
            }
            case 5: {
                if(CLS500.FLD4928.MTH6895("voice_manager")) {
                    Object object0 = arr_object[0];
                    if(CLS166.MTH3181(object0, "field_type") == 0x41000031 && Integer.parseInt(((String)CLS392.MTH5633(((String)CLS166.MTH3194(object0, "field_content")), "msg").get(".msg.appmsg.type"))) == 6) {
                        CLS528 ʽי0 = new CLS528();
                        ʽי0.FLD5167 = "17";
                        ʽי0.FLD5165 = "transcode";
                        ʽי0.FLD5166 = "icons_outlined_share";
                        return Pair.create(CLS27.MTH889("transcode"), "");
                    }
                }
                return null;
            }
            case 6: {
                if(CLS27.MTH895().MTH938("show_groupnote_members", false) && CLS27.MTH890("PluginGroupSolitaireClass")) {
                    Object object1 = arr_object[0];
                    if(CLS166.MTH3181(object1, "field_type") == 0x30000031 && CLS426.MTH6126(((String)CLS166.MTH3194(object1, "field_talker"))) && CLS502.MTH6934(((String)CLS166.MTH3194(object1, "field_content")), new String[]{"<type>53</type>"})) {
                        CLS528 ʽי1 = new CLS528();
                        ʽי1.FLD5167 = "15";
                        ʽי1.FLD5165 = "show_groupnote_members";
                        ʽי1.FLD5166 = "icons_filled_group_detail";
                        return Pair.create(CLS27.MTH889("show_groupnote_members"), "");
                    }
                }
                return null;
            }
            case 7: {
                return CLS412.MTH6002() ? null : Pair.create(CLS27.MTH889("pre_config_dice"), "pre_config_dice");
            }
            case 8: {
                return Pair.create(CLS27.MTH889("appname"), "config_app#0");
            }
            case 9: {
                return CLS372.MTH5411(((String)arr_object[0]));
            }
            case 10: {
                return Boolean.valueOf(CLS426.MTH6126(((String)arr_object[0])));
            }
            case 11: {
                return CLS66.MTH1491(((Context)arr_object[0]), ((File)arr_object[1]));
            }
            case 12: {
                return Boolean.valueOf(CLS372.MTH5403(((ImageView)arr_object[0]), ((String)arr_object[1])));
            }
            case 13: {
                return CLS66.MTH1452(((String)arr_object[0]), ((String)arr_object[1]));
            }
            case 14: {
                return Pair.create(CLS27.MTH889("filterchat"), "configure_filterchat#13");
            }
            case 15: {
                return Pair.create(CLS27.MTH889("chatroom_management"), "chatroom_management#10");
            }
            case 16: {
                return Pair.create(CLS27.MTH889("config_contacts"), "configure_contacts#7");
            }
            case 17: {
                return Pair.create(CLS27.MTH889("transcode"), "config_transcode#17");
            }
            case 18: {
                return Pair.create(CLS27.MTH889("configure_forwarding_settings"), "config_forward#6");
            }
            case 19: {
                return Pair.create(CLS27.MTH889("config_misc"), "config_misc#18");
            }
            case 20: {
                return Pair.create(CLS27.MTH889("configure_experimental_settings"), "config_experimental#19");
            }
            case 21: {
                return Pair.create(CLS27.MTH889("unrecalled"), "config_unrecall#14");
            }
            case 22: {
                return Pair.create(CLS27.MTH889("configure_chatfilter_settings"), "configure_chatfilter_settings#11");
            }
            case 23: {
                return Pair.create(CLS27.MTH889("moments"), "moments#8");
            }
            case 24: {
                return Build.VERSION.SDK_INT < 16 ? null : Pair.create(CLS27.MTH889("custom_notification"), "custom_notification#15");
            }
            case 25: {
                return Pair.create(CLS27.MTH889("configure_redpackets"), "configure_redpackets#9");
            }
            case 26: {
                return Pair.create(CLS27.MTH889("configure_tts_settings"), "config_tts#16");
            }
            case 27: {
                return Pair.create(CLS27.MTH889("config_autoreply"), "configure_autoreply#12");
            }
            default: {
                CLS283 ʾˏ0 = CLS283.FLD2946;
                String s = (String)arr_object[0];
                ʾˏ0.getClass();
                if(CLS426.MTH6126(s)) {
                    return false;
                }
                if(!ʾˏ0.FLD2948.contains(s)) {
                    z = CLS502.MTH6934(CLS27.MTH895().MTH925("zombies", ""), new String[]{s});
                }
                return Boolean.valueOf(z);
            }
        }
    }
}

