// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.text.TextUtils;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS36.CLS35;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˈˈ.CLS78;
import b.ˈˈ.CLS86;
import b.ˈˊ.CLS99;
import b.יﹳ.CLS167;
import b.ᐧˉ.CLS1019;
import b.ᐧˉ.CLS1030;
import b.ᐧˉ.CLS1063;
import b.ᐧˉ.CLS1078;
import b.ᐧˉ.CLS1105;
import b.ᐧˉ.CLS1112;
import b.ᐧˉ.CLS1173;
import b.ᐧˉ.CLS1198;
import b.ᐧˉ.CLS210;
import b.ᐧˉ.CLS219;
import b.ᐧˉ.CLS899;
import b.ᐧˉ.CLS946;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1635;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

public final class CLS820 implements CLS35 {
    public final int FLD1248;
    public final CLS824 FLD1249;

    public CLS820(CLS824 ᵔˊ0, int v) {
        this.FLD1248 = v;
        this.FLD1249 = ᵔˊ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS36$CLS35
    public final void MTH1102(Object[] arr_object) {
        int v = -1;
        boolean z = true;
        CLS824 ᵔˊ0 = this.FLD1249;
        int v1 = 0;
        switch(this.FLD1248) {
            case 0: {
                ᵔˊ0.getClass();
                String s = (String)arr_object[0];
                if(!TextUtils.isEmpty(s)) {
                    HashMap hashMap0 = ᵔˊ0.FLD1257;
                    if(hashMap0.containsKey(s)) {
                        String s1 = (String)arr_object[1];
                        Activity activity0 = (Activity)arr_object[2];
                        String s2 = "";
                        boolean z1 = arr_object.length <= 3 ? false : ((Boolean)arr_object[3]).booleanValue();
                        if(arr_object.length > 4) {
                            v1 = ((Boolean)arr_object[4]).booleanValue();
                        }
                        if(arr_object.length > 5) {
                            s2 = (String)arr_object[5];
                        }
                        CLS219 ˏʻ0 = (CLS219)hashMap0.get(s);
                        if(ˏʻ0 != null) {
                            ˏʻ0.FLD2157 = s1;
                            ˏʻ0.MTH3876(activity0);
                            ˏʻ0.MTH3874(z1, ((boolean)v1), s2);
                        }
                    }
                }
                return;
            }
            case 1: {
                ᵔˊ0.getClass();
                CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
                int v2 = (int)(((Integer)ᵔʾ0.MTH3204()[0]));
                ((Integer)ᵔʾ0.MTH3204()[1]).intValue();
                Intent intent0 = (Intent)ᵔʾ0.MTH3204()[2];
                HashMap hashMap1 = ᵔˊ0.FLD1257;
                CLS1105 ᐧˈ0 = (CLS1105)hashMap1.get("configure_redpackets");
                if(ᐧˈ0 != null && intent0 != null && (v2 == 1500 || v2 == 1501)) {
                    Uri uri0 = (Uri)intent0.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
                    if(uri0 != null) {
                        Activity activity1 = ((CLS219)ᐧˈ0).MTH3883();
                        Ringtone ringtone0 = RingtoneManager.getRingtone(activity1.getApplicationContext(), uri0);
                        ᐧˈ0.FLD2415.MTH7325(ringtone0.getTitle(activity1));
                        if(v2 == 1500) {
                            String s3 = CLS34.MTH1074(new StringBuilder(), ᐧˈ0.FLD2416, 4100591018372289333L);
                            ᐧˈ0.FLD2151.MTH922(uri0.toString(), s3);
                        }
                        else {
                            JSONObject jSONObject0 = ᐧˈ0.FLD2420;
                            if(jSONObject0 != null) {
                                try {
                                    jSONObject0.put("rp_sound_uri", uri0.toString());
                                }
                                catch(Throwable throwable0) {
                                    CLS27.MTH893(throwable0);
                                }
                            }
                        }
                    }
                }
                CLS946 ʿ0 = (CLS946)hashMap1.get("config_misc");
                if(ʿ0 != null && v2 == 0x200) {
                    ᵔʾ0.MTH3207(null);
                    if(intent0 != null) {
                        try {
                            String s4 = CLS404.MTH5906(("" + intent0.getParcelableExtra("key_pick_addr")));
                            ʿ0.FLD2151.MTH922(s4, "fake_gps");
                            ʿ0.FLD1803.MTH7277(s4);
                        }
                        catch(Throwable throwable1) {
                            CLS27.MTH893(throwable1);
                        }
                    }
                }
                CLS899 ʻʼ0 = (CLS899)hashMap1.get("configure_contacts");
                if(ʻʼ0 != null && v2 == 0x202) {
                    ᵔʾ0.MTH3207(null);
                    if(intent0 != null) {
                        try {
                            String s5 = CLS404.MTH5906(("" + intent0.getParcelableExtra("key_pick_addr")));
                            ʻʼ0.FLD2151.MTH922(s5, "auto_shake_gps");
                            ʻʼ0.FLD1661.MTH7277(s5);
                        }
                        catch(Throwable throwable2) {
                            CLS27.MTH893(throwable2);
                        }
                    }
                }
                CLS1173 ᵢᵢ0 = (CLS1173)hashMap1.get("custom_notification");
                if(ᵢᵢ0 != null && intent0 != null && (v2 == 4000 || v2 == 4001)) {
                    Uri uri1 = (Uri)intent0.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
                    if(uri1 != null) {
                        Activity activity2 = ((CLS219)ᵢᵢ0).MTH3883();
                        if(ᵢᵢ0.FLD2719 != null) {
                            Ringtone ringtone1 = RingtoneManager.getRingtone(activity2.getApplicationContext(), uri1);
                            ᵢᵢ0.FLD2719.MTH7325(ringtone1.getTitle(activity2));
                        }
                        if(v2 == 4000) {
                            String s6 = CLS34.MTH1074(new StringBuilder(), ᵢᵢ0.FLD2721, 4101086481504588597L);
                            ᵢᵢ0.FLD2151.MTH922(uri1.toString(), s6);
                            return;
                        }
                        if(v2 == 4001) {
                            JSONObject jSONObject1 = ᵢᵢ0.FLD2723;
                            if(jSONObject1 != null) {
                                try {
                                    jSONObject1.put("ringtone", uri1.toString());
                                    return;
                                }
                                catch(Throwable throwable3) {
                                    CLS27.MTH893(throwable3);
                                }
                            }
                        }
                    }
                }
                return;
            }
            case 2: {
                ᵔˊ0.getClass();
                String s7 = (String)arr_object[0];
                String s8 = (String)arr_object[1];
                switch(s7) {
                    case "autoreply": {
                        v = 2;
                        break;
                    }
                    case "notifications": {
                        v = 1;
                        break;
                    }
                    case "redpackets": {
                        v = 0;
                    }
                }
                HashMap hashMap2 = ᵔˊ0.FLD1257;
                CLS371 ʻ0 = ᵔˊ0.FLD1444;
                switch(v) {
                    case 0: {
                        CLS1105 ᐧˈ1 = (CLS1105)hashMap2.get("configure_redpackets");
                        if(ᐧˈ1 != null) {
                            ᐧˈ1.FLD2157 = CLS27.MTH904();
                            ((CLS219)ᐧˈ1).MTH3876(((CLS140)ᵔˊ0).MTH3042());
                            ᐧˈ1.MTH4174(s8, ʻ0.MTH5311(s8));
                            return;
                        }
                        break;
                    }
                    case 1: {
                        CLS1173 ᵢᵢ1 = (CLS1173)hashMap2.get("custom_notification");
                        if(ᵢᵢ1 != null) {
                            ᵢᵢ1.FLD2157 = CLS27.MTH904();
                            ((CLS219)ᵢᵢ1).MTH3876(((CLS140)ᵔˊ0).MTH3042());
                            ᵢᵢ1.MTH4448(s8);
                            return;
                        }
                        break;
                    }
                    case 2: {
                        CLS1030 ˎᵢ0 = (CLS1030)hashMap2.get("configure_autoreply");
                        if(ˎᵢ0 != null) {
                            ˎᵢ0.FLD2157 = CLS27.MTH904();
                            ((CLS219)ˎᵢ0).MTH3876(((CLS140)ᵔˊ0).MTH3042());
                            String s9 = ʻ0.MTH5311(s8);
                            Activity activity3 = ((CLS219)ˎᵢ0).MTH3883();
                            CLS523.MTH7133(activity3, s9, ((CLS379)new CLS1063(ˎᵢ0, s8, activity3, 0)), null, null);
                            return;
                        }
                        break;
                    }
                    default: {
                        return;
                    }
                }
                return;
            }
            case 3: {
                CLS1173 ᵢᵢ2 = (CLS1173)ᵔˊ0.FLD1257.get("custom_notification");
                if(ᵢᵢ2 != null) {
                    ((CLS219)ᵢᵢ2).MTH3876(((CLS140)ᵔˊ0).MTH3042());
                    ᵢᵢ2.MTH4446("_secret", CLS27.MTH889("secret_notification"));
                }
                return;
            }
            case 4: {
                CLS210 ˋʼ0 = new CLS210(((CLS140)ᵔˊ0).MTH3042(), CLS27.MTH904());
                String s10 = (String)arr_object[0];
                ArrayList arrayList0 = new ArrayList();
                String[] arr_s = s10.split(",");
                while(v1 < arr_s.length) {
                    String s11 = arr_s[v1];
                    arrayList0.add(new CLS78(s11, ᵔˊ0.FLD1444.MTH5311(s11)));
                    ++v1;
                }
                CLS387.MTH5590(((CLS140)ᵔˊ0).MTH3042(), arrayList0, ((CLS2)new CLS823(ˋʼ0)), "", null);
                return;
            }
            case 5: {
                CLS1112 ᐧˏ0 = (CLS1112)ᵔˊ0.FLD1257.get("configure_filterchat");
                if(ᐧˏ0 != null) {
                    ᐧˏ0.FLD2157 = CLS27.MTH904();
                    ((CLS219)ᐧˏ0).MTH3876(((CLS140)ᵔˊ0).MTH3042());
                    String s12 = (String)arr_object[0];
                    String s13 = (String)arr_object[1];
                    ᐧˏ0.FLD2463 = s12;
                    CLS1198 ﹳﹳ0 = new CLS1198(ᐧˏ0, 2);
                    CLS40.FLD157.MTH1124(((CLS39)ﹳﹳ0));
                    try {
                        ᐧˏ0.FLD2454 = ᐧˏ0.FLD2466.MTH1266();
                    }
                    catch(Throwable throwable4) {
                        CLS27.MTH893(throwable4);
                    }
                    int v3 = 0;
                    while(true) {
                        if(v3 < ᐧˏ0.FLD2454.size()) {
                            CLS86 ٴـ0 = (CLS86)ᐧˏ0.FLD2454.get(v3);
                            if(ٴـ0.FLD346.equals(s12)) {
                                ᐧˏ0.MTH4198(ٴـ0, CLS27.MTH889("modify"));
                                if(TextUtils.isEmpty(s13) || !CLS426.MTH6126(s12)) {
                                    break;
                                }
                                ᐧˏ0.FLD2464 = ٴـ0.FLD345;
                                if(!TextUtils.isEmpty(ٴـ0.FLD345)) {
                                    s13 = ᐧˏ0.FLD2464 + "," + s13;
                                }
                                ᐧˏ0.FLD2464 = s13;
                                return;
                            }
                            ++v3;
                        }
                        else {
                            try {
                                ᐧˏ0.MTH4198(null, CLS27.MTH889("add_member"));
                                ᐧˏ0.FLD2470.MTH798(ᐧˏ0.FLD2472.MTH5316(s12));
                                int v4 = ᐧˏ0.MTH4203(ᐧˏ0.FLD2463);
                                if(v4 == -1) {
                                    ᐧˏ0.FLD2464 = s13;
                                }
                                else {
                                    CLS86 ٴـ1 = (CLS86)ᐧˏ0.FLD2454.get(v4);
                                    ᐧˏ0.FLD2464 = ٴـ1.FLD345;
                                    if(!TextUtils.isEmpty(s13)) {
                                        if(!TextUtils.isEmpty(ᐧˏ0.FLD2464)) {
                                            s13 = ᐧˏ0.FLD2464 + "," + s13;
                                        }
                                        ᐧˏ0.FLD2464 = s13;
                                    }
                                    CLS1635 ﾞᵎ0 = ᐧˏ0.FLD2476;
                                    if(ٴـ1.FLD344 != 1) {
                                        z = false;
                                    }
                                    ﾞᵎ0.MTH7437(z);
                                    ᐧˏ0.MTH4204(ٴـ1.FLD349);
                                }
                                if(CLS426.MTH6126(ᐧˏ0.FLD2463)) {
                                    ᐧˏ0.FLD2479.MTH801(0);
                                    ᐧˏ0.FLD2480.MTH801(8);
                                    return;
                                }
                                ᐧˏ0.FLD2479.MTH801(8);
                                ᐧˏ0.FLD2480.MTH801(0);
                                return;
                            }
                            catch(Throwable throwable5) {
                                CLS27.MTH893(throwable5);
                                break;
                            }
                        }
                    }
                }
                return;
            }
            case 6: {
                CLS1019 ˎʻ0 = (CLS1019)ᵔˊ0.FLD1257.get("chatroom_management");
                if(ˎʻ0 != null) {
                    ˎʻ0.FLD2157 = CLS27.MTH904();
                    ((CLS219)ˎʻ0).MTH3876(((CLS140)ᵔˊ0).MTH3042());
                    String s14 = (String)arr_object[0];
                    ˎʻ0.MTH3824(new CLS78(s14, ᵔˊ0.FLD1444.MTH5316(s14)));
                }
                return;
            }
            default: {
                CLS1078 ـˆ0 = (CLS1078)ᵔˊ0.FLD1257.get("scheduled_task");
                if(ـˆ0 != null) {
                    ـˆ0.FLD2157 = CLS27.MTH904();
                    ((CLS219)ـˆ0).MTH3876(((CLS140)ᵔˊ0).MTH3042());
                    ـˆ0.MTH4070(((CLS99)arr_object[0]), null);
                }
            }
        }
    }
}

