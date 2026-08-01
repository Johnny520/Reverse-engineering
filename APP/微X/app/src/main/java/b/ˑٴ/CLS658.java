// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.ContentValues;
import android.text.TextUtils;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS36.CLS35;
import b.ʾᵢ.CLS38.CLS37;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS56;
import b.ᐧˉ.CLS182;
import b.ⁱᵔ.CLS392;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS502;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS658 extends CLS140 {
    public CLS56 FLD668;

    public CLS658(CLS139 ﹶʼ0) {
        super(ﹶʼ0);
    }

    public final boolean MTH2147(int v, String s) {
        String s1 = this.MTH2153(s);
        if(TextUtils.isEmpty(s1)) {
            return false;
        }
        String[] arr_s = CLS502.MTH6941(s1);
        HashSet hashSet0 = new HashSet();
        for(int v1 = 0; v1 < arr_s.length; ++v1) {
            hashSet0.add(Integer.parseInt(arr_s[v1]));
        }
        if(hashSet0.contains(-1)) {
            return true;
        }
        switch(v) {
            case 1: {
                return hashSet0.contains(0);
            }
            case 3: {
                return hashSet0.contains(1);
            }
            case 34: {
                return hashSet0.contains(2);
            }
            case 42: {
                return hashSet0.contains(5);
            }
            case 0x2F: {
                return hashSet0.contains(6);
            }
            case 0x30: {
                return hashSet0.contains(10);
            }
            case 49: {
                return hashSet0.contains(4);
            }
            case 50: {
                return hashSet0.contains(9);
            }
            case 43: 
            case 62: {
                return hashSet0.contains(3);
            }
            case 10000: 
            case 10002: {
                return hashSet0.contains(11);
            }
            case 0x1000031: {
                return hashSet0.contains(12);
            }
            case 99900001: {
                return hashSet0.contains(15);
            }
            case 99900003: {
                return hashSet0.contains(16);
            }
            case 0x19000031: {
                return hashSet0.contains(8);
            }
            case 0x1A000031: {
                return hashSet0.contains(7);
            }
            case 0x1A000032: {
                return hashSet0.contains(13);
            }
            case 0x30000031: {
                return hashSet0.contains(18);
            }
            case 0x2D000031: 
            case 0x3A000031: {
                return hashSet0.contains(19);
            }
            default: {
                return false;
            }
        }
    }

    // 去混淆评级： 低(38)
    // 此方法包含解密的字符串
    public final boolean MTH2148(int v, String s) {
        CLS29 ˎᵢ0 = this.FLD1445;
        if(ˎᵢ0.MTH938("all_chatroom_chat_blacklist", false) && !CLS502.MTH6934(ˎᵢ0.MTH925("all_chatroom_chat_blacklist_exclude", ""), new String[]{s})) {
            String s1 = ˎᵢ0.MTH925("all_chatroom_chat_blacklist_template", "");
            return !TextUtils.isEmpty(s1) && (this.FLD1447.FLD1438.MTH6895("all_chatroom_chat_blacklist") && this.MTH2147(v, s1));
        }
        return false;
    }

    // 去混淆评级： 低(33)
    // 此方法包含解密的字符串
    public final boolean MTH2149(int v, String s) {
        if(!"fmessage".equals(s)) {
            CLS29 ˎᵢ0 = this.FLD1445;
            if(ˎᵢ0.MTH938("all_friends_chat_blacklist", false) && !CLS502.MTH6934(ˎᵢ0.MTH925("all_friends_chat_blacklist_exclude", ""), new String[]{s})) {
                String s1 = ˎᵢ0.MTH925("all_friends_chat_blacklist_template", "");
                return !TextUtils.isEmpty(s1) && (this.FLD1447.FLD1438.MTH6895("all_friends_chat_blacklist") && this.MTH2147(v, s1));
            }
        }
        return false;
    }

    // 此方法包含解密的字符串
    public static void MTH2150(String s, String s1) {
        CLS21.FLD76.MTH818("showBlacklistAddMemberDialog", new Object[]{s, s1});
    }

    // 此方法包含解密的字符串
    @Override  // b.ˑٴ.CLS140
    public final void MTH3040(CLS21 ʾᵢ0) {
        ʾᵢ0.MTH828("b.conversation.menu.oncreate", ((CLS35)new CLS842(this, 0)));
        ʾᵢ0.MTH833("onincomingdata", ((CLS37)new CLS704(this, 1)));
        ʾᵢ0.MTH828("b.sqldb.insert", ((CLS35)new CLS842(this, 8)));
        ʾᵢ0.MTH828("import_settings", ((CLS35)new CLS842(this, 9)));
        ʾᵢ0.MTH828("export_settings", ((CLS35)new CLS842(this, 10)));
        ʾᵢ0.MTH833("b.chatroominfoui.menu.options,b.contactinfoui.menu.options,b.singlechatinfoui.menu.options", ((CLS37)new CLS704(this, 2)));
        ʾᵢ0.MTH828("b.chatroominfoui.menu.config,b.contactinfoui.menu.config,b.singlechatinfoui.menu.config", ((CLS35)new CLS842(this, 11)));
        ʾᵢ0.MTH833("isBlocked", ((CLS37)new CLS704(this, 3)));
        ʾᵢ0.MTH828("b.sqldb.update", ((CLS35)new CLS842(this, 12)));
        ʾᵢ0.MTH828("new_chatroom_member", ((CLS35)new CLS842(this, 13)));
        ʾᵢ0.MTH828("new_contact", ((CLS35)new CLS842(this, 1)));
        ʾᵢ0.MTH828("new_chatroom", ((CLS35)new CLS842(this, 2)));
        ʾᵢ0.MTH828("new_chatroom", ((CLS35)new CLS842(this, 3)));
        ʾᵢ0.MTH828("chat.menu.config", ((CLS35)new CLS842(this, 4)));
        ʾᵢ0.MTH833("chat.menu.options", ((CLS37)new CLS704(this, 0)));
        ʾᵢ0.MTH828("on_voipClass_call", ((CLS35)new CLS842(this, 5)));
        ʾᵢ0.MTH828("on_voipClass_call2", ((CLS35)new CLS842(this, 6)));
        ʾᵢ0.MTH828("on_voipVideoActivity_onCreate", ((CLS35)new CLS842(this, 7)));
    }

    @Override  // b.ˑٴ.CLS140
    public final void MTH3043() {
        if(this.FLD668 != null) {
            return;
        }
        CLS56 ᵔʾ0 = new CLS56(CLS27.MTH900());
        this.FLD668 = ᵔʾ0;
        CLS40.FLD157.MTH1115(ᵔʾ0);
    }

    // 此方法包含解密的字符串
    public final String MTH2153(String s) {
        String s1 = this.FLD1445.MTH925("block_templates", "");
        if(!TextUtils.isEmpty(s1) && !TextUtils.isEmpty(s)) {
            try {
                JSONArray jSONArray0 = new JSONArray(s1);
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    JSONObject jSONObject0 = jSONArray0.getJSONObject(v);
                    if(s.equals(jSONObject0.optString("n"))) {
                        return jSONObject0.getString("t");
                    }
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            return "";
        }
        return "";
    }

    // 此方法包含解密的字符串
    public final boolean MTH2154(ContentValues contentValues0) {
        if((contentValues0.containsKey("isSend") ? CLS182.MTH3474(0x38EB03412B3CD335L, contentValues0) : 0) != 1 && contentValues0.containsKey("talker") && contentValues0.containsKey("type")) {
            int v = CLS182.MTH3474(0x38EB03542B3CD335L, contentValues0);
            String s = contentValues0.getAsString("talker");
            String s1 = contentValues0.containsKey("content") ? contentValues0.getAsString("content") : "";
            CLS29 ˎᵢ0 = this.FLD1445;
            if(((v != 10000 || !CLS502.MTH6934(s1, new String[]{CLS182.MTH3473(0x38EB03092B3CD335L, ˎᵢ0, "custom_nudging_original")}) || !s1.endsWith(CLS27.MTH882("you")) && !s1.toLowerCase().endsWith("you") ? 0 : 1) | (v != 10002 && v != 0x31000031 || !CLS502.MTH6934(s1, new String[]{"<pat>"}) ? 0 : 1)) != 0) {
                if(ˎᵢ0.MTH938("block_nudging_enable", false)) {
                    return true;
                }
                v = 99800001;
            }
            if(this.FLD668 != null && ˎᵢ0.MTH938("blacklist_enable", CLS412.MTH6002())) {
                try {
                    if(v == 0x1000031) {
                        if(CLS502.MTH6934(s1, new String[]{CLS27.MTH882("zombie_check")})) {
                            return true;
                        }
                    }
                    else if(v == 1 && s1.endsWith("￀￀￀​￀")) {
                        return true;
                    }
                    int v1 = 0x1A000032;
                    int v2 = 0x2F;
                    if(v == 49 && !TextUtils.isEmpty(s1)) {
                        if(CLS502.MTH6934(s1, new String[]{CLS27.MTH882("rp_url")})) {
                            v = 0x1A000031;
                        }
                        else if(!CLS502.MTH6934(s1, new String[]{CLS27.MTH882("transfer_url")})) {
                            HashMap hashMap0 = CLS392.MTH5633(s1, "appmsg");
                            if(hashMap0 != null && hashMap0.containsKey(".appmsg.type")) {
                                switch(Integer.parseInt(((String)hashMap0.get(".appmsg.type")))) {
                                    case 3: {
                                        v = 99900003;
                                        break;
                                    }
                                    case 8: {
                                        v = 0x2F;
                                        break;
                                    }
                                    case 33: 
                                    case 36: {
                                        v = 99900001;
                                        break;
                                    }
                                    case 57: {
                                        v = 1;
                                        break;
                                    }
                                    case 2000: {
                                        v = 0x1A000032;
                                    }
                                }
                            }
                        }
                        else {
                            v = 0x1A000032;
                        }
                    }
                    if(v != 0x100031) {
                        v2 = v;
                    }
                    if(v2 != 0x1A000031 || !CLS502.MTH6934(s1, new String[]{CLS27.MTH882("transfer_url")})) {
                        v1 = v2;
                    }
                    if(CLS426.MTH6126(s)) {
                        String s2 = CLS426.MTH6109(s1);
                        if(v1 == 0x1000031) {
                            s2 = s1.substring(s1.indexOf("<fromusername>") + 14, s1.indexOf("</fromusername>"));
                        }
                        return this.FLD668.MTH1273(v1, s, s2) || this.MTH2148(v1, s);
                    }
                    return this.FLD668.MTH1268(v1, s) || this.MTH2149(v1, s);
                }
                catch(Throwable throwable0) {
                }
                CLS27.MTH893(throwable0);
                return false;
            }
        }
        return false;
    }
}

