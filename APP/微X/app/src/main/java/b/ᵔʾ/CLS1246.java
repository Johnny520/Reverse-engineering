// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.app.Activity;
import android.app.ProgressDialog;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import b.ʻˑ.CLS13;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.ˆʿ.CLS61;
import b.ˆٴ.CLS66;
import b.ˑٴ.CLS140;
import b.ˑٴ.CLS794;
import b.יﹳ.CLS166;
import b.ᐧˉ.CLS1152;
import b.ᐧˉ.CLS1165;
import b.ᐧˉ.CLS182;
import b.ᐧˉ.CLS210;
import b.ᐧˉ.CLS913;
import b.ᐧˉ.CLS983;
import b.ⁱʾ.CLS359;
import b.ⁱᵔ.CLS1568;
import b.ⁱᵔ.CLS380.CLS378;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS403;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS454;
import b.ⁱᵔ.CLS466;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS525;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public final class CLS1246 implements CLS7, CLS39, CLS378, CLS379 {
    public final int FLD3111;
    public final Object FLD3112;
    public final Object FLD3113;
    public final Object FLD3114;
    public final boolean FLD3115;
    public final Object FLD3116;

    public CLS1246(Activity activity0, BaseAdapter baseAdapter0, CLS7 יᐧ0, LinkedHashMap linkedHashMap0) {
        this.FLD3111 = 3;
        super();
        this.FLD3112 = activity0;
        this.FLD3114 = baseAdapter0;
        this.FLD3115 = true;
        this.FLD3113 = יᐧ0;
        this.FLD3116 = linkedHashMap0;
    }

    public CLS1246(CLS794 ᴵʽ0, CLS61 ﾞٴ0, String s, String s1, boolean z) {
        this.FLD3111 = 1;
        super();
        this.FLD3112 = ᴵʽ0;
        this.FLD3116 = ﾞٴ0;
        this.FLD3114 = s;
        this.FLD3113 = s1;
        this.FLD3115 = z;
    }

    public CLS1246(CLS210 ˋʼ0, Activity activity0, ArrayList arrayList0, CLS359 ⁱˉ0, boolean z) {
        this.FLD3111 = 2;
        super();
        this.FLD3112 = ˋʼ0;
        this.FLD3114 = activity0;
        this.FLD3113 = arrayList0;
        this.FLD3116 = ⁱˉ0;
        this.FLD3115 = z;
    }

    public CLS1246(CLS301 ᐧי0, String s, String s1, boolean z, byte[] arr_b) {
        this.FLD3111 = 0;
        super();
        this.FLD3112 = ᐧי0;
        this.FLD3114 = s;
        this.FLD3116 = arr_b;
        this.FLD3113 = s1;
        this.FLD3115 = z;
    }

    public CLS1246(boolean z, Object object0, ProgressDialog progressDialog0, CLS13 ⁱʽ0, String s) {
        this.FLD3111 = 4;
        super();
        this.FLD3115 = z;
        this.FLD3112 = object0;
        this.FLD3113 = progressDialog0;
        this.FLD3116 = ⁱʽ0;
        this.FLD3114 = s;
    }

    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        boolean z = this.FLD3115;
        Object object0 = this.FLD3113;
        Object object1 = this.FLD3116;
        Object object2 = this.FLD3114;
        Object object3 = this.FLD3112;
        if(this.FLD3111 == 0) {
            ((CLS301)object3).getClass();
            Object object4 = CLS66.MTH1516(((String)object2));
            if(object4 != null) {
                CLS466.MTH6517(((LinkedList)CLS166.MTH3194(CLS166.MTH3194(CLS166.MTH3195(object4, CLS27.MTH897("snsSightMethod5"), new Object[0]), CLS27.MTH897("snsContentLinkField")), CLS27.MTH897("snsSightField3"))).get(0), ((String)object2), ((CLS13)new CLS1257(((CLS301)object3), ((byte[])object1), ((String)object0), z)), false);
            }
            return;
        }
        if(z) {
            CLS466.MTH6523(new File(CLS66.MTH1451(object3)), ((CLS3)new CLS1568(((ProgressDialog)object0), ((CLS13)object1), ((String)object2), 5)), 15000L);
            return;
        }
        if(((ProgressDialog)object0) != null) {
            ((ProgressDialog)object0).dismiss();
        }
        if(((CLS13)object1) != null) {
            ((CLS13)object1).MTH770(((String)object2));
        }
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS378
    public final void MTH5452(CLS525 ʻˑ0) {
        CLS210 ˋʼ0 = (CLS210)this.FLD3112;
        Activity activity0 = (Activity)this.FLD3114;
        ArrayList arrayList0 = (ArrayList)this.FLD3113;
        CLS359 ⁱˉ0 = (CLS359)this.FLD3116;
        ˋʼ0.getClass();
        ʻˑ0.MTH7187("text", ((CLS3)new CLS1165(0, activity0, ⁱˉ0, ˋʼ0, arrayList0)));
        if(!ˋʼ0.FLD2016) {
            boolean z = this.FLD3115;
            if(!ˋʼ0.FLD2022.FLD164.isEmpty() && !z) {
                ʻˑ0.MTH7187("mp3_response", ((CLS3)new CLS1165(1, activity0, ⁱˉ0, ˋʼ0, arrayList0)));
            }
            ʻˑ0.MTH7187("img_response", ((CLS3)new CLS983(ˋʼ0, arrayList0, ⁱˉ0, 0)));
            ʻˑ0.MTH7187("multi_img", ((CLS3)new CLS983(ˋʼ0, arrayList0, ⁱˉ0, 1)));
            ʻˑ0.MTH7187("vid_response", ((CLS3)new CLS983(ˋʼ0, arrayList0, ⁱˉ0, 2)));
            if(!z) {
                if(CLS404.MTH5905()) {
                    ʻˑ0.MTH7187("gif_response", ((CLS3)new CLS983(ˋʼ0, arrayList0, ⁱˉ0, 3)));
                }
                ʻˑ0.MTH7187("fav_item", ((CLS3)new CLS1165(2, activity0, ⁱˉ0, ˋʼ0, arrayList0)));
                if(!ˋʼ0.FLD2009 || (CLS502.MTH6934(ˋʼ0.FLD1998, new String[]{"_REDPACKETS_"}) || CLS502.MTH6934(ˋʼ0.FLD1998, new String[]{"_MONEYTRANSFER_"})) && ˋʼ0.FLD2011.MTH6895("rp_keyword")) {
                    ʻˑ0.MTH7187("chatroom_invite", ((CLS3)new CLS1165(3, activity0, ⁱˉ0, ˋʼ0, arrayList0)));
                }
                ʻˑ0.MTH7187("friendcard", ((CLS3)new CLS1165(activity0, ⁱˉ0, ˋʼ0, arrayList0)));
                if(CLS27.MTH902("WXFileObject") && !CLS182.MTH3470(4100623149022630709L)) {
                    ʻˑ0.MTH7187("file", ((CLS3)new CLS1152(activity0, arrayList0, ⁱˉ0, 23)));
                }
                if(CLS27.MTH902("web_response")) {
                    ʻˑ0.MTH7187("web_text", ((CLS3)new CLS1152(activity0, arrayList0, ⁱˉ0, 16)));
                    ʻˑ0.MTH7187("web_img", ((CLS3)new CLS1152(activity0, arrayList0, ⁱˉ0, 17)));
                    ʻˑ0.MTH7187("web_gif", ((CLS3)new CLS1152(activity0, arrayList0, ⁱˉ0, 18)));
                    ʻˑ0.MTH7187("web_vid", ((CLS3)new CLS1152(activity0, arrayList0, ⁱˉ0, 19)));
                    if(CLS27.MTH902("WXFileObject") && !CLS182.MTH3470(4100624029490926389L)) {
                        ʻˑ0.MTH7187("web_file", ((CLS3)new CLS1152(activity0, arrayList0, ⁱˉ0, 20)));
                    }
                }
                if(CLS500.FLD4928.MTH6895("voice_manager")) {
                    ʻˑ0.MTH7187("voice_manager", ((CLS3)new CLS1152(activity0, arrayList0, ⁱˉ0, 21)));
                }
                if(CLS21.FLD76.MTH830("hasTTS", new Object[0])) {
                    ʻˑ0.MTH7187("tts", ((CLS3)new CLS1152(activity0, arrayList0, ⁱˉ0, 22)));
                }
                if(CLS27.MTH890("sendPatClass1")) {
                    ʻˑ0.MTH7187("patmsg", ((CLS3)new CLS913(arrayList0, ⁱˉ0, 2)));
                }
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS7
    public final void MTH784(Object object0) {
        String s2;
        CLS794 ᴵʽ0 = (CLS794)this.FLD3112;
        CLS61 ﾞٴ0 = (CLS61)this.FLD3116;
        String s = (String)this.FLD3114;
        String s1 = (String)this.FLD3113;
        ᴵʽ0.getClass();
        switch(object0.toString()) {
            case "add_permaban": {
                ᴵʽ0.MTH2702(s1);
                return;
            }
            case "add_whitelist": {
                ﾞٴ0.MTH1333(s, s1);
                s2 = CLS426.MTH6125(s, s1) + CLS27.MTH889("add_to_whitelist");
                break;
            }
            case "ban": {
                ﾞٴ0.MTH1310(s, s1);
                CLS412.MTH6014(((CLS140)ᴵʽ0).MTH3042(), CLS27.MTH889("added_to_blacklist"));
                return;
            }
            case "delete_member": {
                if(ﾞٴ0.FLD186) {
                    Activity activity0 = ((CLS140)ᴵʽ0).MTH3042();
                    ArrayList arrayList0 = new ArrayList();
                    arrayList0.add(s);
                    CLS403.MTH5869(activity0, arrayList0, s1, false, null);
                    return;
                }
                CLS426.MTH6132(s, s1, true);
                return;
            }
            case "downgrade_mod": {
                CLS66.MTH1393(s, String.format(CLS27.MTH889("downgrade_moderator"), CLS426.MTH6125(s, s1)), s1);
                ﾞٴ0.MTH1318(0, s, s1);
                return;
            }
            case "remove_permaban": {
                ﾞٴ0.MTH1317(s1);
                return;
            }
            case "remove_whitelist": {
                ﾞٴ0.MTH1318(2, s, s1);
                CLS794.MTH2689(s, String.format(CLS27.MTH889("removed_from_whitelist"), CLS66.MTH1452(s, s1)));
                return;
            }
            case "unban": {
                if(this.FLD3115) {
                    ﾞٴ0.MTH1315(s, s1);
                    CLS794.MTH2689(s, String.format(CLS27.MTH889("unbanned"), CLS66.MTH1452(s, s1)));
                }
                CLS426.MTH6120(s, s1, true, null);
                return;
            }
            case "upgrade_mod": {
                ﾞٴ0.MTH1340(s, s1);
                s2 = String.format(CLS27.MTH889("upgrade_to_moderator"), CLS426.MTH6125(s, s1));
                break;
            }
            default: {
                return;
            }
        }
        CLS66.MTH1393(s, s2, s1);
    }

    @Override  // b.ⁱᵔ.CLS380$CLS379
    public final void MTH5453(LinearLayout linearLayout0) {
        CLS1624 יﹳ0 = new CLS1624(((Activity)this.FLD3112));
        יﹳ0.MTH7303(((ListAdapter)this.FLD3114));
        יﹳ0.MTH7301(new CLS454(this.FLD3115, ((CLS7)this.FLD3113), ((ListAdapter)this.FLD3114), ((LinkedHashMap)this.FLD3116)));
        CLS1623 יᐧ0 = new CLS1623(((Activity)this.FLD3112));
        יᐧ0.MTH7296(יﹳ0);
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), CLS523.MTH7137(3));
    }
}

