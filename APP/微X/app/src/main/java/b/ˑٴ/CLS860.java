// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.text.TextUtils;
import android.util.Pair;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS38.CLS37;
import b.יﹳ.CLS166;
import b.ᐧˉ.CLS182;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS500;
import b.ﾞˎ.CLS528;

public final class CLS860 implements CLS37 {
    public final int FLD1366;
    public final CLS770 FLD1367;

    public CLS860(CLS770 ٴʿ0, int v) {
        this.FLD1366 = v;
        this.FLD1367 = ٴʿ0;
        super();
    }

    // 去混淆评级： 低(32)
    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS38$CLS37
    public final Object MTH1108(Object[] arr_object) {
        CLS770 ٴʿ0 = this.FLD1367;
        switch(this.FLD1366) {
            case 0: {
                if(!ٴʿ0.FLD1447.FLD1407.MTH5947("other") && (ٴʿ0.FLD1445.MTH938("float_video_enable", false) && ٴʿ0.FLD1446.MTH5755(((long)(((Long)arr_object[0])))) == 15)) {
                    CLS528 ʽי0 = new CLS528();
                    ʽי0.FLD5167 = "8";
                    ʽי0.FLD5165 = "float_video";
                    return Pair.create(CLS27.MTH889("float_video"), "");
                }
                return null;
            }
            case 1: {
                ٴʿ0.getClass();
                return TextUtils.isEmpty(CLS27.MTH897("AppPanel3")) || !ٴʿ0.FLD1445.MTH938("sight_use_front_camera_enable", false) ? null : Pair.create(CLS27.MTH889("change_camera"), "config_change_camera");
            }
            case 2: {
                return ٴʿ0.FLD1447.FLD1407.MTH5947("other") || !ٴʿ0.FLD1445.MTH938("show_mark_read_enable", true) ? null : Pair.create(CLS27.MTH889("mark_read"), "config_mark_read");
            }
            case 3: {
                ٴʿ0.getClass();
                return ٴʿ0.FLD1445.MTH938("mass_delete_msg_shortcut", true) ? Pair.create(CLS27.MTH889("mass_delete_msg"), "config_mass_delete_msg") : null;
            }
            case 4: {
                ٴʿ0.getClass();
                if(ٴʿ0.FLD1445.MTH938("mass_delete_conversation_shortcut", false)) {
                    return CLS182.MTH3470(0x38EC5DFF2B3CD335L) ? Pair.create(CLS27.MTH889("mass_delete_conversation"), "mass_delete_conversation") : Pair.create(CLS27.MTH889("mass_hide_conversation"), "mass_delete_conversation");
                }
                return null;
            }
            case 5: {
                ٴʿ0.getClass();
                return !ٴʿ0.FLD1445.MTH938("mass_delete_conversation_shortcut", false) || CLS182.MTH3470(4101755719013684021L) ? null : Pair.create(CLS27.MTH889("mass_unhide_conversation"), "mass_unhide_conversation");
            }
            case 6: {
                return ٴʿ0.FLD1067 == null || !ٴʿ0.FLD1067.FLD379 || !ٴʿ0.FLD1445.MTH938("float_video_enable", false) ? null : Pair.create(CLS27.MTH889("close_floating_video"), "config_close_floating_video");
            }
            case 7: {
                ٴʿ0.getClass();
                return !ٴʿ0.FLD1445.MTH938("fast_switch_enable", false) || CLS182.MTH3470(0x38EC5CFB2B3CD335L) ? null : Pair.create(CLS27.MTH889("fast_switch_account"), "fast_switch_account");
            }
            case 8: {
                ٴʿ0.getClass();
                boolean z = CLS412.MTH6002();
                return !ٴʿ0.FLD1445.MTH938("mass_remove_stickytop_shortcut", !z) || !CLS27.MTH902("mass_remove_stickytop_shortcut") ? null : Pair.create(CLS27.MTH889("mass_remove_stickytop"), "mass_remove_stickytop");
            }
            case 9: {
                if(!ٴʿ0.FLD1447.FLD1407.MTH5947("_config_selective_copy")) {
                    switch(CLS166.MTH3181(arr_object[0], "field_type")) {
                        case 1: 
                        case 0x1000031: 
                        case 0x31000031: {
                            boolean z1 = CLS412.MTH6002();
                            if(ٴʿ0.FLD1445.MTH938("selective_copy_enable", z1)) {
                                CLS528 ʽי1 = new CLS528();
                                ʽי1.FLD5167 = "4";
                                ʽי1.FLD5165 = "selective_copy";
                                ʽי1.FLD5166 = "icons_outlined_copy";
                                return Pair.create(CLS27.MTH889("selective_copy"), "");
                            }
                            break;
                        }
                        default: {
                            return null;
                        }
                    }
                }
                return null;
            }
            case 10: {
                ٴʿ0.getClass();
                switch(CLS166.MTH3181(arr_object[0], "field_type")) {
                    case 43: 
                    case 62: {
                        if(ٴʿ0.FLD1445.MTH938("float_video_enable", false)) {
                            CLS528 ʽי2 = new CLS528();
                            ʽי2.FLD5167 = "5";
                            ʽי2.FLD5165 = "float_video";
                            ʽי2.FLD5166 = "icons_filled_float_window_on";
                            return Pair.create(CLS27.MTH889("float_video"), "");
                        }
                        return null;
                    }
                    default: {
                        return null;
                    }
                }
            }
            case 11: {
                if(!ٴʿ0.FLD1447.FLD1407.MTH5947("_config_quote") && ٴʿ0.FLD1445.MTH938("quote_enable", false)) {
                    switch(CLS166.MTH3181(arr_object[0], "field_type")) {
                        case 1: 
                        case 0x1000031: 
                        case 0x31000031: {
                            CLS528 ʽי3 = new CLS528();
                            ʽי3.FLD5167 = "3";
                            ʽי3.FLD5165 = "quote";
                            ʽי3.FLD5166 = "icons_filled_quote";
                            return Pair.create((CLS27.MTH889("quote") + "(" + CLS27.MTH889("appname") + ")"), "");
                        }
                        default: {
                            return null;
                        }
                    }
                }
                return null;
            }
            case 12: {
                ٴʿ0.getClass();
                if(ٴʿ0.FLD1445.MTH938("export_emoji_as_gif", false) && !CLS182.MTH3470(4101749890743063349L) && (CLS500.FLD4928.MTH6895("export_emoji_gif") && CLS166.MTH3181(arr_object[0], "field_type") == 0x2F)) {
                    CLS528 ʽי4 = new CLS528();
                    ʽי4.FLD5167 = "11";
                    ʽי4.FLD5165 = "export_emoji_as_gif";
                    ʽי4.FLD5166 = "icons_outlined_emoji";
                    return Pair.create(CLS27.MTH889("export_emoji_as_gif"), "");
                }
                return null;
            }
            case 13: {
                ٴʿ0.getClass();
                if(CLS27.MTH895().MTH938("set_fake_transfer_amount_enable", false) && (ٴʿ0.FLD1447.FLD1438.MTH6895("fake_transfer_amount") && CLS166.MTH3181(arr_object[0], "field_type") == 0x19000031)) {
                    CLS528 ʽי5 = new CLS528();
                    ʽי5.FLD5167 = "12";
                    ʽי5.FLD5165 = "set_fake_amount";
                    ʽי5.FLD5166 = "icons_outlined_pay_transfer";
                    return Pair.create(CLS27.MTH889("set_fake_transfer_amount"), "");
                }
                return null;
            }
            case 14: {
                if(ٴʿ0.FLD1447.FLD1438.MTH6895("modifyMessage") && CLS27.MTH895().MTH938("modify_message", true)) {
                    CLS528 ʽי6 = new CLS528();
                    ʽי6.FLD5167 = "100";
                    ʽי6.FLD5165 = "modify_message";
                    ʽי6.FLD5166 = "icons_filled_group_detail";
                    return Pair.create(CLS27.MTH889("modify_message"), "");
                }
                return null;
            }
            case 15: {
                ٴʿ0.getClass();
                boolean z2 = CLS412.MTH6002();
                return ٴʿ0.FLD1445.MTH938("send_search_image", z2) ? Pair.create(CLS27.MTH889("send_search_image"), "send_search_image") : null;
            }
            case 16: {
                ٴʿ0.getClass();
                boolean z3 = CLS412.MTH6002();
                return !ٴʿ0.FLD1445.MTH938("search_chat_history_enable", z3) || !CLS27.MTH902("search_chat_history_shortcut") || !CLS27.MTH890("FTSChattingConvUI") ? null : Pair.create(CLS27.MTH889("search_chat_history"), "search_chat_history");
            }
            case 17: {
                ٴʿ0.getClass();
                return !ٴʿ0.FLD1445.MTH938("send_as_gif_enable", false) || (!CLS500.FLD4928.MTH6895("send_as_gif") || CLS182.MTH3470(4101756741215900469L) || !CLS27.MTH899(new String[]{"MMAnimateViewClass", "MMAnimateViewClass_b", "MMAnimateViewClass_c"})) ? null : Pair.create(CLS27.MTH889("send_img_as_gif"), "send_img_as_gif");
            }
            case 18: {
                ٴʿ0.getClass();
                return CLS412.MTH6002() || !ٴʿ0.FLD1445.MTH938("send_external_video_shortcut", false) || !ٴʿ0.FLD1447.FLD1438.MTH6895("sns_external_video") || !CLS21.FLD76.MTH830("has_vid_url_parser", new Object[0]) ? null : Pair.create(CLS27.MTH889("extract_url"), "extract_url");
            }
            case 19: {
                ٴʿ0.getClass();
                if(!CLS412.MTH6002() && (ٴʿ0.FLD1445.MTH938("send_wear_yo_shortcut", false) && (CLS27.MTH890("sendWearYoClass") || CLS27.MTH890("sendWearYoClass_b")))) {
                    String s1 = (String)arr_object[0];
                    return CLS372.MTH5410(s1) || CLS372.MTH5400(s1) || CLS404.MTH5909(s1) || CLS426.MTH6126(s1) ? null : Pair.create(CLS27.MTH889("send_wear_yo"), "send_wear_yo");
                }
                return null;
            }
            default: {
                ٴʿ0.getClass();
                if(!CLS412.MTH6002() && (ٴʿ0.FLD1447.FLD1438.MTH6895("modifyMessage") && CLS27.MTH895().MTH938("modify_message", true))) {
                    String s = (String)arr_object[0];
                    return CLS372.MTH5410(s) || CLS372.MTH5400(s) || CLS404.MTH5909(s) ? null : Pair.create(CLS27.MTH889("insert_fake_message"), "insert_fake_message");
                }
                return null;
            }
        }
    }
}

