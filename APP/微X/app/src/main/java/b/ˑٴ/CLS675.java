// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.util.Pair;
import b.ʻˑ.CLS0;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS573;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS87;
import b.יﹳ.CLS166;
import b.ـˏ.CLS894;
import b.ᐧˉ.CLS1191;
import b.ᐧˉ.CLS182;
import b.ⁱᵔ.CLS1525;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS392;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS443;
import b.ⁱᵔ.CLS466;
import b.ⁱᵔ.CLS476;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public final class CLS675 implements CLS7 {
    public final String FLD719;
    public final long FLD720;
    public final long FLD721;
    public final CLS629 FLD722;
    public final int FLD723;
    public final String FLD724;
    public final int FLD725;
    public final Object FLD726;
    public final String FLD727;
    public final String FLD728;
    public final int FLD729;

    public CLS675(CLS629 ʻˋ0, Object object0, int v, String s, String s1, int v1, String s2, long v2, long v3, String s3, int v4) {
        this.FLD722 = ʻˋ0;
        this.FLD726 = object0;
        this.FLD725 = v;
        this.FLD727 = s;
        this.FLD724 = s1;
        this.FLD729 = v1;
        this.FLD728 = s2;
        this.FLD720 = v2;
        this.FLD721 = v3;
        this.FLD719 = s3;
        this.FLD723 = v4;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS7
    public final void MTH784(Object object0) {
        CLS664 ʿˊ0;
        Activity activity1;
        CLS642 ʼᴵ0;
        Activity activity0;
        int v4;
        int v = this.FLD725;
        String s = this.FLD727;
        String s1 = this.FLD724;
        int v1 = this.FLD729;
        String s2 = this.FLD728;
        long v2 = this.FLD720;
        long v3 = this.FLD721;
        CLS629 ʻˋ0 = this.FLD722;
        ʻˋ0.getClass();
        switch(CLS182.MTH3489(0x38EDB0FA2B3CD335L, new StringBuilder(), object0)) {
            case "export": {
                v4 = 4;
                break;
            }
            case "extract_audio": {
                v4 = 5;
                break;
            }
            case "forward_chat_to_friends": {
                v4 = 0;
                break;
            }
            case "forward_chat_to_sns": {
                v4 = 1;
                break;
            }
            case "forward_link": {
                v4 = 10;
                break;
            }
            case "friendcard_forward": {
                v4 = 3;
                break;
            }
            case "mass_send": {
                v4 = 6;
                break;
            }
            case "send_external_video": {
                v4 = 11;
                break;
            }
            case "share_link": {
                v4 = 9;
                break;
            }
            case "tag_forward": {
                v4 = 7;
                break;
            }
            case "voice_forward_to_friends": {
                v4 = 2;
                break;
            }
            case "voice_manager": {
                v4 = 8;
                break;
            }
            default: {
                v4 = -1;
            }
        }
        Object object1 = this.FLD726;
        String s3 = this.FLD719;
        switch(v4) {
            case 0: {
                try {
                    switch(v) {
                        case 1: {
                            activity0 = ((CLS140)ʻˋ0).MTH3042();
                            ʼᴵ0 = new CLS642(ʻˋ0, s1, s, v1);
                            break;
                        }
                        case 3: {
                            CLS466.MTH6539(v1, CLS166.MTH3185(object1, "field_msgId"), v2, ((CLS0)new CLS679(ʻˋ0, 7)), s2);
                            return;
                        }
                        case 43: 
                        case 62: {
                            CLS466.MTH6507(s2, ((CLS12)new CLS764(ʻˋ0, s2, v3, 1)), true, 0);
                            return;
                        }
                        case 0x1000031: 
                        case 0x31000031: {
                            String s4 = (String)CLS392.MTH5633(s1, "msg").get(".msg.appmsg.title");
                            CLS387.MTH5601(false, ((CLS140)ʻˋ0).MTH3042(), ((CLS2)new CLS869(ʻˋ0, s4)), -1);
                            return;
                        }
                        case 49: 
                        case 0x2D000031: 
                        case 0x3A000031: 
                        case 0x3E000031: 
                        case 0x41000031: 
                        case 0x54000031: 
                        case 0x55000031: {
                            String s5 = CLS426.MTH6106(v1, s1, s);
                            byte[] arr_b = CLS466.MTH6532(s2);
                            activity0 = ((CLS140)ʻˋ0).MTH3042();
                            ʼᴵ0 = new CLS768(ʻˋ0, s5, arr_b, v3);
                            break;
                        }
                        default: {
                            return;
                        }
                    }
                    CLS387.MTH5601(false, activity0, ((CLS2)ʼᴵ0), -1);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 1: {
                if(v == 1) {
                    goto label_78;
                }
                else {
                    switch(v) {
                        case 3: {
                            try {
                                CLS466.MTH6539(v1, CLS166.MTH3185(object1, "field_msgId"), v2, ((CLS0)new CLS679(ʻˋ0, 8)), s2);
                                return;
                                try {
                                label_65:
                                    CLS466.MTH6507(s2, ((CLS12)new CLS1525(1, s2)), true, 0);
                                }
                                catch(Throwable throwable2) {
                                    CLS27.MTH893(throwable2);
                                }
                                return;
                            label_70:
                                CLS466.MTH6519(CLS66.MTH1509(s2), CLS502.MTH6942(CLS426.MTH6106(v1, s1, s)));
                                return;
                            label_72:
                                CLS466.MTH6508(s1, "");
                                return;
                            label_74:
                                CLS466.MTH6501(s1, "");
                                return;
                            label_76:
                                String s6 = (String)CLS392.MTH5633(s1, "msg").get(".msg.appmsg.title");
                                break;
                            label_78:
                                s6 = CLS426.MTH6106(v1, s1, s);
                            label_79:
                                CLS466.MTH6504(s6);
                            }
                            catch(Throwable throwable1) {
                                CLS27.MTH893(throwable1);
                            }
                            return;
                        }
                        case 49: {
                            goto label_70;
                        }
                        case 43: 
                        case 62: {
                            goto label_65;
                        }
                        case 0x2D000031: {
                            goto label_72;
                        }
                        case 0x1000031: 
                        case 0x31000031: {
                            goto label_76;
                        }
                        case 0x3A000031: {
                            goto label_74;
                        }
                        default: {
                            return;
                        }
                    }
                }
                goto label_79;
            }
            case 2: {
                try {
                    CLS894 ﾞˎ0 = new CLS894(s1, s2);
                    CLS387.MTH5601(false, ((CLS140)ʻˋ0).MTH3042(), ((CLS2)new CLS776(ʻˋ0, ﾞˎ0)), CLS404.MTH5907());
                }
                catch(Throwable throwable3) {
                    CLS27.MTH893(throwable3);
                }
                return;
            }
            case 3: {
                try {
                    CLS387.MTH5601(false, ((CLS140)ʻˋ0).MTH3042(), ((CLS2)new CLS722(s1, s, v1)), -1);
                }
                catch(Throwable throwable4) {
                    CLS27.MTH893(throwable4);
                }
                return;
            }
            case 4: {
                try {
                    switch(v) {
                        case 1: {
                            CLS466.MTH6512(s3);
                            return;
                        }
                        case 3: {
                            CLS466.MTH6503(CLS66.MTH1410(CLS371.FLD3470.MTH5319(v2)), "image/jpeg");
                            return;
                        }
                        case 34: {
                            CLS476.MTH6644(((CLS140)ʻˋ0).MTH3042(), s2);
                            return;
                        }
                        case 43: 
                        case 62: {
                            CLS466.MTH6507(s2, ((CLS12)new CLS1191(1)), true, 0);
                            return;
                        }
                        case 0x1000031: 
                        case 0x31000031: {
                            CLS466.MTH6512(((String)CLS392.MTH5633(s3, "msg").get(".msg.appmsg.title")));
                            return;
                        }
                        default: {
                            return;
                        }
                    }
                }
                catch(Throwable throwable5) {
                    CLS27.MTH893(throwable5);
                    return;
                }
            }
            case 5: {
                CLS466.MTH6507(s2, ((CLS12)new CLS573(2, ʻˋ0)), true, 0);
                return;
            }
            case 6: {
                try {
                    ArrayList arrayList0 = ʻˋ0.FLD554;
                    arrayList0.clear();
                    CLS29 ˎᵢ0 = ʻˋ0.FLD1445;
                    switch(v) {
                        case 1: {
                            if(ˎᵢ0.MTH938("multi_broadcast_forward_native", true)) {
                                arrayList0.add(new CLS87(1, CLS426.MTH6106(v1, s1, s)));
                                ʻˋ0.MTH2038();
                                return;
                            }
                            String s7 = CLS426.MTH6106(v1, s1, s);
                            activity1 = ((CLS140)ʻˋ0).MTH3042();
                            ʿˊ0 = new CLS664(ʻˋ0, s7);
                            break;
                        }
                        case 3: {
                            String s8 = CLS66.MTH1410(ʻˋ0.FLD1444.MTH5319(v2));
                            long v5 = CLS166.MTH3185(object1, "field_msgId");
                            arrayList0.add(new CLS87(3, CLS166.MTH3181(object1, "field_isSend"), v2, v5, s8, s2));
                            ʻˋ0.MTH2038();
                            return;
                        }
                        case 34: {
                            arrayList0.add(new CLS87(34, Integer.parseInt(s1.split(":")[1]), s2));
                            ʻˋ0.MTH2038();
                            return;
                        }
                        case 49: {
                            String s9 = CLS426.MTH6106(v1, s1, s);
                            activity1 = ((CLS140)ʻˋ0).MTH3042();
                            ʿˊ0 = new CLS837(ʻˋ0, s2, s9, v3);
                            break;
                        }
                        case 43: 
                        case 62: {
                            arrayList0.add(new CLS87(43, 1, s2));
                            ʻˋ0.MTH2038();
                            return;
                        }
                        case 0x1000031: 
                        case 0x31000031: {
                            String s10 = (String)CLS392.MTH5633(s1, "msg").get(".msg.appmsg.title");
                            if(ˎᵢ0.MTH938("multi_broadcast_forward_native", true)) {
                                arrayList0.add(new CLS87(1, s10));
                                ʻˋ0.MTH2038();
                                return;
                            }
                            activity1 = ((CLS140)ʻˋ0).MTH3042();
                            ʿˊ0 = new CLS701(ʻˋ0, s10);
                            break;
                        }
                        default: {
                            ʻˋ0.MTH2038();
                            return;
                        }
                    }
                    CLS387.MTH5601(false, activity1, ((CLS2)ʿˊ0), -1);
                }
                catch(Throwable throwable6) {
                    CLS27.MTH893(throwable6);
                }
                return;
            }
            case 7: {
                if(ʻˋ0.FLD1447.FLD1438.MTH6895("contact_tags")) {
                    LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                    linkedHashMap0.put(CLS27.MTH889("chatroom_tags"), "chatroom_tags");
                    linkedHashMap0.put(CLS27.MTH889("contact_tags"), "contact_tags");
                    linkedHashMap0.put(CLS27.MTH889("chatcontainer"), "chat_container");
                    CLS523.MTH7159(((CLS140)ʻˋ0).MTH3042(), null, linkedHashMap0, ((CLS7)new CLS740(ʻˋ0, v, s, s1, v1, s2, v2, v3)));
                    return;
                }
                ʻˋ0.MTH2051(v, v1, v2, v3, s, s1, s2);
                return;
            }
            case 8: {
                try {
                    Activity activity2 = ((CLS140)ʻˋ0).MTH3042();
                    int v6 = Integer.parseInt(s1.split(":")[1]);
                    ArrayList arrayList1 = new ArrayList();
                    arrayList1.add(Pair.create(s2, v6));
                    CLS476.MTH6643(activity2, arrayList1);
                }
                catch(Throwable throwable7) {
                    CLS27.MTH893(throwable7);
                }
                return;
            }
            case 9: {
                if(this.FLD723 == 6) {
                    CLS66.MTH1411(CLS392.MTH5633(s1, "msg"), v3, ((CLS12)new CLS1191(2)));
                    return;
                }
                HashMap hashMap0 = CLS392.MTH5633(s1, "appmsg");
                String s11 = (String)hashMap0.get(".appmsg.url");
                CLS466.MTH6514(((String)hashMap0.get(".appmsg.title")), s11);
                return;
            }
            case 10: {
                String s12 = (String)CLS392.MTH5633(s1, "appmsg").get(".appmsg.url");
                CLS387.MTH5601(false, ((CLS140)ʻˋ0).MTH3042(), ((CLS2)new CLS660(ʻˋ0, s12)), -1);
                return;
            }
            case 11: {
                CLS443.MTH6308(((CLS140)ʻˋ0).MTH3042(), s3);
            }
        }
    }
}

