// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.Pair;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS38.CLS37;
import b.ˈˈ.CLS86;
import b.יﹳ.CLS166;
import b.ⁱᵔ.CLS392;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS502;
import b.ﾞˎ.CLS528;
import java.util.HashMap;

public final class CLS704 implements CLS37 {
    public final int FLD819;
    public final CLS658 FLD820;

    public CLS704(CLS658 ʾᵢ0, int v) {
        this.FLD819 = v;
        this.FLD820 = ʾᵢ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS38$CLS37
    public final Object MTH1108(Object[] arr_object) {
        String s4;
        CLS658 ʾᵢ0 = this.FLD820;
        switch(this.FLD819) {
            case 0: {
                ʾᵢ0.getClass();
                Object object0 = arr_object[0];
                int v1 = CLS166.MTH3181(object0, "field_type");
                int v2 = CLS166.MTH3181(object0, "field_isSend");
                String s2 = (String)CLS166.MTH3194(object0, "field_talker");
                CLS528 ʽי0 = new CLS528();
                ʽי0.FLD5167 = "8";
                ʽי0.FLD5166 = "icons_outlined_no_effect";
                boolean z = CLS426.MTH6126(s2);
                CLS29 ˎᵢ0 = ʾᵢ0.FLD1445;
                if(!z && !s2.equals(CLS27.MTH904())) {
                    if(ˎᵢ0.MTH938("blacklist_enable", CLS412.MTH6002())) {
                        if(ʾᵢ0.FLD668.MTH1275(s2) != null) {
                            CLS86 ٴـ0 = ʾᵢ0.FLD668.MTH1275(s2);
                            if(ٴـ0 != null && ٴـ0.FLD344 == 1) {
                                ʽי0.FLD5165 = "unblock_user";
                                return Pair.create(CLS27.MTH889("unblock_user"), "");
                            }
                        }
                        ʽי0.FLD5165 = "auto_block_chat";
                        return Pair.create(CLS27.MTH889("auto_block_chat"), "");
                    }
                }
                else if(v2 != 1) {
                    String s3 = (String)CLS166.MTH3194(object0, "field_content");
                    if(v1 == 0x13000031) {
                        try {
                            HashMap hashMap0 = CLS392.MTH5633(s3, "msg");
                            s4 = null;
                            s4 = hashMap0.containsKey(".msg.appmsg.fromusername") ? ((String)hashMap0.get(".msg.appmsg.fromusername")) : CLS426.MTH6109(s3);
                            if(TextUtils.isEmpty(s4)) {
                                int v3 = s3.indexOf("<fromusername>");
                                if(v3 != -1) {
                                    s4 = s3.substring(v3 + 14, s3.indexOf("</fromusername>"));
                                    goto label_46;
                                }
                            }
                            else {
                                goto label_46;
                            }
                        }
                        catch(Throwable throwable0) {
                            CLS27.MTH893(throwable0);
                            goto label_46;
                        }
                    }
                    else {
                        s4 = CLS426.MTH6109(s3);
                    label_46:
                        if(!TextUtils.isEmpty(s4) && !CLS27.MTH904().equals(s4) && ˎᵢ0.MTH938("blacklist_enable", CLS412.MTH6002())) {
                            CLS86 ٴـ1 = ʾᵢ0.FLD668.MTH1275(s2);
                            if(ٴـ1 != null && CLS502.MTH6934(ٴـ1.FLD345, new String[]{s4})) {
                                CLS86 ٴـ2 = ʾᵢ0.FLD668.MTH1275(s2);
                                if(ٴـ2 != null && CLS502.MTH6934(ٴـ2.FLD345, new String[]{s4}) && ٴـ2.FLD344 == 1) {
                                    ʽי0.FLD5165 = "unblock_user_chatroom";
                                    return Pair.create(CLS27.MTH889("unblock_user"), "");
                                }
                            }
                            ʽי0.FLD5165 = "auto_block_chatroom_member";
                            return Pair.create(CLS27.MTH889("auto_block_chat"), "");
                        }
                    }
                }
                return null;
            }
            case 1: {
                ʾᵢ0.getClass();
                return ʾᵢ0.MTH2154(((ContentValues)arr_object[0])) ? true : null;
            }
            case 2: {
                if(!ʾᵢ0.FLD1447.FLD1407.MTH5947("_config_blacklistchat")) {
                    boolean z1 = CLS412.MTH6002();
                    if(ʾᵢ0.FLD1445.MTH938("blacklist_enable", z1)) {
                        String s5 = (String)arr_object[0];
                        if(!s5.equals(CLS27.MTH904()) && (CLS426.MTH6126(s5) || ʾᵢ0.FLD1444.MTH5302(s5))) {
                            return Pair.create(CLS27.MTH889("filterchat"), "filterchat");
                        }
                    }
                }
                return null;
            }
            default: {
                ʾᵢ0.getClass();
                String s = (String)arr_object[0];
                String s1 = (String)arr_object[1];
                int v = (int)(((Integer)arr_object[2]));
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("isSend", 0);
                contentValues0.put("talker", s);
                contentValues0.put("content", s1);
                contentValues0.put("type", v);
                return Boolean.valueOf(ʾᵢ0.MTH2154(contentValues0));
            }
        }
    }
}

