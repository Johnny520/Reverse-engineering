// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.text.TextUtils;
import android.util.Pair;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS38.CLS37;
import b.יﹳ.CLS166;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS500;
import b.ﾞˎ.CLS528;

public final class CLS667 implements CLS37 {
    public final int FLD695;
    public final CLS629 FLD696;

    public CLS667(CLS629 ʻˋ0, int v) {
        this.FLD695 = v;
        this.FLD696 = ʻˋ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS38$CLS37
    public final Object MTH1108(Object[] arr_object) {
        int v = 0;
        CLS629 ʻˋ0 = this.FLD696;
        int v1 = 1;
        switch(this.FLD695) {
            case 0: {
                ʻˋ0.getClass();
                if(ʻˋ0.FLD1445.MTH938("play_voice_enable", false) && CLS166.MTH3181(arr_object[0], "field_type") == 34) {
                    CLS528 ʽי0 = new CLS528();
                    ʽי0.FLD5167 = "1";
                    ʽי0.FLD5165 = "play_voice";
                    ʽי0.FLD5166 = "icons_outlined_play";
                    return Pair.create(CLS27.MTH889("play_voice"), "");
                }
                return null;
            }
            case 1: {
                ʻˋ0.getClass();
                if(ʻˋ0.FLD1445.MTH938("repeat_msg_send", false)) {
                    int v2 = CLS166.MTH3181(arr_object[0], "field_type");
                    if(v2 != 1 && v2 != 3 && v2 != 0x1000031 && v2 != 0x31000031 && (v2 != 34 && v2 != 43 && v2 != 0x30 && v2 != 49 && v2 != 62)) {
                        switch(v2) {
                            case 0x2F: 
                            case 0x100031: 
                            case 0x2D000031: 
                            case 0x30000031: 
                            case 0x3A000031: 
                            case 0x3E000031: 
                            case 0x41000031: 
                            case 0x54000031: 
                            case 0x55000031: {
                                break;
                            }
                            default: {
                                return null;
                            }
                        }
                    }
                    CLS528 ʽי1 = new CLS528();
                    ʽי1.FLD5167 = "0";
                    ʽי1.FLD5165 = "repeat_msg_send";
                    ʽי1.FLD5166 = "icons_filled_message";
                    return Pair.create(CLS27.MTH889("repeat_msg_send"), "");
                }
                return null;
            }
            case 2: {
                if(ʻˋ0.FLD1447.FLD1438.MTH6895("chat_schedule_forward") && ʻˋ0.FLD1445.MTH938("chat_schedule_forward", false)) {
                    switch(CLS166.MTH3181(arr_object[0], "field_type")) {
                        case 1: 
                        case 3: 
                        case 34: 
                        case 43: 
                        case 0x2F: 
                        case 0x30: 
                        case 49: 
                        case 62: 
                        case 0x1000031: 
                        case 0x2D000031: 
                        case 0x30000031: 
                        case 0x31000031: 
                        case 0x3A000031: 
                        case 0x3E000031: 
                        case 0x41000031: 
                        case 0x54000031: 
                        case 0x55000031: {
                            CLS528 ʽי2 = new CLS528();
                            ʽי2.FLD5167 = "13";
                            ʽי2.FLD5165 = "schedule_forward";
                            ʽי2.FLD5166 = "icons_outlined_share";
                            return Pair.create(CLS27.MTH889("schedule_forward"), "");
                        }
                        default: {
                            return null;
                        }
                    }
                }
                return null;
            }
            case 3: {
                ʻˋ0.getClass();
                Object object0 = arr_object[0];
                int v3 = CLS166.MTH3181(object0, "field_type");
                String s = (String)CLS166.MTH3194(object0, "field_content");
                CLS29 ˎᵢ0 = ʻˋ0.FLD1445;
                switch(v3) {
                    case 1: 
                    case 3: 
                    case 43: 
                    case 49: 
                    case 62: 
                    case 0x1000031: 
                    case 0x31000031: {
                        if(ˎᵢ0.MTH938("forward_chat2sns", true)) {
                            v = 1;
                        }
                    }
                }
                if(v == 0 && v3 == 34 && ˎᵢ0.MTH938("voice_forward_enable", true)) {
                    v = 1;
                }
                if(v == 0 && v3 == 42 && ˎᵢ0.MTH938("friendcard_forward_enable", true) && !TextUtils.isEmpty(s)) {
                    v = 1;
                }
                if(v == 0) {
                    switch(v3) {
                        case 1: 
                        case 3: 
                        case 34: 
                        case 43: 
                        case 62: 
                        case 0x1000031: 
                        case 0x31000031: {
                        label_54:
                            if(ˎᵢ0.MTH938("forward_chat2chat", true)) {
                                v = 1;
                            }
                            break;
                        }
                        default: {
                            if(v3 == 0x3E000031 || v3 == 0x41000031 || v3 == 0x54000031 || v3 == 0x55000031) {
                                goto label_54;
                            }
                        }
                    }
                }
                if(v == 0 && (v3 == 0x2D000031 || v3 == 0x3A000031) && (ˎᵢ0.MTH938("forward_chat2chat", true) || ˎᵢ0.MTH938("forward_chat2sns", true))) {
                    v = 1;
                }
                CLS139 ﹶʼ0 = ʻˋ0.FLD1447;
                if(v == 0) {
                    if(v3 == 42 || v3 == 49) {
                    label_63:
                        if(ﹶʼ0.FLD1438.MTH6895("tag_forward") && ˎᵢ0.MTH938("forward_chat2chat", true)) {
                            v = 1;
                        }
                    }
                    else {
                        switch(v3) {
                            case 0x2D000031: 
                            case 0x3A000031: 
                            case 0x3E000031: 
                            case 0x41000031: 
                            case 0x54000031: 
                            case 0x55000031: {
                                goto label_63;
                            }
                        }
                    }
                }
                if(v == 0 && v3 == 49 && (ˎᵢ0.MTH938("forward_chat2chat", true) || ˎᵢ0.MTH938("share_chat", true))) {
                    v = 1;
                }
                if(v != 0 || v3 != 43 && v3 != 62 || (!ﹶʼ0.FLD1438.MTH6895("extract_vid_audio") || !ˎᵢ0.MTH938("forward_vid_audio", true))) {
                    v1 = v;
                }
                if(v1 != 0) {
                    CLS528 ʽי3 = new CLS528();
                    ʽי3.FLD5167 = "2";
                    ʽי3.FLD5165 = "forward";
                    ʽי3.FLD5166 = "icons_outlined_share";
                    return Pair.create((CLS27.MTH889("forward") + " (" + CLS27.MTH889("appname") + ")"), "");
                }
                return null;
            }
            case 4: {
                ʻˋ0.getClass();
                if(ʻˋ0.FLD1445.MTH938("forward_chat2chat", true) && (CLS500.FLD4928.MTH6895("multi_select") && ʻˋ0.FLD1445.MTH938("multi_select", true))) {
                    CLS528 ʽי4 = new CLS528();
                    ʽי4.FLD5167 = "16";
                    ʽי4.FLD5165 = "multi_select";
                    ʽי4.FLD5166 = "icons_outlined_share";
                    return Pair.create(CLS27.MTH889("multi_select"), "");
                }
                return null;
            }
            case 5: {
                ʻˋ0.getClass();
                return TextUtils.isEmpty(CLS27.MTH897("flipviewClass2b")) && ʻˋ0.FLD1445.MTH938("forward_sns2sns", true) ? "FlipView" : null;
            }
            case 6: {
                ʻˋ0.getClass();
                return TextUtils.isEmpty(CLS27.MTH897("imgGalleryClass3")) && (ʻˋ0.FLD1445.MTH938("forward_chat2sns", true) || ʻˋ0.FLD1445.MTH938("share_chat", false)) ? "ImageGalleryUI" : null;
            }
            case 7: {
                ʻˋ0.getClass();
                return ʻˋ0.FLD1445.MTH938("record_forward_enable", true) ? "RecordMsgImageUI" : null;
            }
            case 8: {
                ʻˋ0.getClass();
                if(ʻˋ0.FLD1445.MTH938("forward_sns2sns", true)) {
                    int v4 = ʻˋ0.FLD1446.MTH5755(((long)(((Long)arr_object[0]))));
                    switch(v4) {
                        case 1: 
                        case 2: 
                        case 3: 
                        case 4: 
                        case 15: 
                        case 42: {
                        label_101:
                            CLS528 ʽי5 = new CLS528();
                            ʽי5.FLD5167 = "2";
                            ʽי5.FLD5165 = "forward_chat_to_sns";
                            return Pair.create(CLS27.MTH889("forward_chat_to_sns"), "");
                        }
                        default: {
                            if(v4 == 28 || v4 == 34) {
                                goto label_101;
                            }
                        }
                    }
                }
                return null;
            }
            case 9: {
                ʻˋ0.getClass();
                if(ʻˋ0.FLD1445.MTH938("sns_save", false)) {
                    switch(ʻˋ0.FLD1446.MTH5755(((long)(((Long)arr_object[0]))))) {
                        case 1: 
                        case 15: {
                            CLS528 ʽי6 = new CLS528();
                            ʽי6.FLD5167 = "12";
                            ʽי6.FLD5165 = "sns_save";
                            return Pair.create(CLS27.MTH889("save"), "");
                        }
                        default: {
                            return null;
                        }
                    }
                }
                return null;
            }
            case 10: {
                ʻˋ0.getClass();
                if(ʻˋ0.FLD1445.MTH938("share_sns", true)) {
                    switch(ʻˋ0.FLD1446.MTH5755(((long)(((Long)arr_object[0]))))) {
                        case 1: 
                        case 2: 
                        case 3: 
                        case 15: {
                            CLS528 ʽי7 = new CLS528();
                            ʽי7.FLD5167 = "13";
                            ʽי7.FLD5165 = "sns_share";
                            return Pair.create(CLS27.MTH889("share"), "");
                        }
                        default: {
                            return null;
                        }
                    }
                }
                return null;
            }
            case 11: {
                ʻˋ0.getClass();
                if(ʻˋ0.FLD1445.MTH938("img_to_friend_forward_enable", false) && ʻˋ0.FLD1446.MTH5755(((long)(((Long)arr_object[0])))) == 1) {
                    CLS528 ʽי8 = new CLS528();
                    ʽי8.FLD5167 = "4";
                    ʽי8.FLD5165 = "forward_img_to_friends";
                    return Pair.create(CLS27.MTH889("forward_img_to_friends"), "");
                }
                return null;
            }
            case 12: {
                ʻˋ0.getClass();
                if(ʻˋ0.FLD1445.MTH938("broadcast_forward_enable", true)) {
                    switch(ʻˋ0.FLD1446.MTH5755(((long)(((Long)arr_object[0]))))) {
                        case 1: 
                        case 15: {
                            CLS528 ʽי9 = new CLS528();
                            ʽי9.FLD5167 = "6";
                            ʽי9.FLD5165 = "mass_send";
                            return Pair.create(CLS27.MTH889("mass_send"), "");
                        }
                        default: {
                            return null;
                        }
                    }
                }
                return null;
            }
            case 13: {
                ʻˋ0.getClass();
                if(ʻˋ0.FLD1445.MTH938("moment_img_screenshot", true) && ʻˋ0.FLD1446.MTH5755(((long)(((Long)arr_object[0])))) == 1) {
                    CLS528 ʽי10 = new CLS528();
                    ʽי10.FLD5167 = "5";
                    ʽי10.FLD5165 = "moment_img_screenshot";
                    return Pair.create(CLS27.MTH889("moment_img_screenshot"), "");
                }
                return null;
            }
            case 14: {
                if(ʻˋ0.FLD1447.FLD1438.MTH6895("sns_export") && ʻˋ0.FLD1445.MTH938("sns_export_enable", true)) {
                    switch(ʻˋ0.FLD1446.MTH5755(((long)(((Long)arr_object[0]))))) {
                        case 1: 
                        case 2: 
                        case 3: 
                        case 4: 
                        case 15: 
                        case 42: {
                            CLS528 ʽי11 = new CLS528();
                            ʽי11.FLD5167 = "14";
                            ʽי11.FLD5165 = "sns_export";
                            return Pair.create(CLS27.MTH889("export_"), "");
                        }
                        default: {
                            return null;
                        }
                    }
                }
                return null;
            }
            case 15: {
                ʻˋ0.getClass();
                boolean z1 = CLS412.MTH6002();
                return ʻˋ0.FLD1445.MTH938("voice_manager", z1) && ʻˋ0.FLD1447.FLD1438.MTH6895("voice_manager") ? Pair.create(CLS27.MTH889("voice_manager"), "voice_manager") : null;
            }
            default: {
                ʻˋ0.getClass();
                boolean z = CLS412.MTH6002();
                return ʻˋ0.FLD1445.MTH938("fast_send", !z) && ʻˋ0.FLD1447.FLD1438.MTH6895("fast_send") ? Pair.create(CLS27.MTH889("send"), "send") : null;
            }
        }
    }
}

