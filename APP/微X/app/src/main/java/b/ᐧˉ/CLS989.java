// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.content.ContentValues;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS18;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.ˈˈ.CLS78;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS380.CLS378;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1635;
import b.ﾞˎ.CLS525;
import b.ﾞˎ.CLS530;
import b.ﾞˎ.CLS536;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONObject;

public final class CLS989 implements CLS17, CLS39, CLS378 {
    public final int FLD1966;
    public final CLS1173 FLD1967;

    public CLS989(CLS1173 ᵢᵢ0, int v) {
        this.FLD1966 = v;
        this.FLD1967 = ᵢᵢ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        CLS1173 ᵢᵢ0 = this.FLD1967;
        ᵢᵢ0.getClass();
        ArrayList arrayList0 = new ArrayList();
        CLS371.FLD3470.MTH5293(ᵢᵢ0.FLD2157, arrayList0);
        HashSet hashSet0 = new HashSet();
        for(Object object0: arrayList0) {
            CLS78 ˊﾞ0 = (CLS78)object0;
            if(!hashSet0.contains("")) {
                hashSet0.add("");
                ᵢᵢ0.FLD2722.add(ˊﾞ0);
            }
        }
    }

    @Override  // b.ⁱᵔ.CLS380$CLS378
    public final void MTH5452(CLS525 ʻˑ0) {
        this.FLD1967.getClass();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        CLS1173 ᵢᵢ0 = this.FLD1967;
        if(this.FLD1966 == 2) {
            ᵢᵢ0.getClass();
            JSONObject jSONObject0 = (JSONObject)arr_object[0];
            LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
            ᵢᵢ0.FLD2723 = jSONObject0;
            int v = CLS523.MTH7137(10);
            Activity activity0 = ((CLS219)ᵢᵢ0).MTH3883();
            CLS1635 ﾞᵎ0 = new CLS1635(activity0);
            ﾞᵎ0.MTH800(CLS27.MTH889("enable"));
            ﾞᵎ0.MTH7437(jSONObject0.optBoolean("notification_enable", false));
            ﾞᵎ0.MTH7438(new CLS205(ᵢᵢ0, jSONObject0, "notif_"));
            CLS523.MTH7147(linearLayout0, ((CLS18)ﾞᵎ0), true);
            CLS1623 יᐧ0 = new CLS1623(activity0);
            CLS1635 ﾞᵎ1 = new CLS1635(activity0);
            ﾞᵎ1.MTH800(CLS27.MTH889("mute_enable"));
            ﾞᵎ1.MTH7437(jSONObject0.optBoolean("mute_enable", false));
            ﾞᵎ1.MTH7438(new CLS184(jSONObject0, 0));
            יᐧ0.MTH7296(ﾞᵎ1);
            if(CLS502.MTH6943("notif_", new String[]{"new_comment", "recall", "moments_notification", "keyword"})) {
                ﾞᵎ1.MTH801(8);
            }
            CLS1635 ﾞᵎ2 = new CLS1635(activity0);
            ﾞᵎ2.MTH800(CLS27.MTH889("enable_vibrate"));
            ﾞᵎ2.MTH7437(jSONObject0.optBoolean("vibrate_enable", false));
            ﾞᵎ2.MTH7438(new CLS236(ᵢᵢ0, jSONObject0, 0));
            יᐧ0.MTH7296(ﾞᵎ2);
            CLS1635 ﾞᵎ3 = new CLS1635(activity0);
            ﾞᵎ3.MTH800(CLS27.MTH889("enable_ringtone"));
            ﾞᵎ3.MTH7437(jSONObject0.optBoolean("ringtone_enable", false));
            ﾞᵎ3.MTH7438(new CLS236(ᵢᵢ0, jSONObject0, 1));
            יᐧ0.MTH7296(ﾞᵎ3);
            CLS1626 ـﹳ0 = new CLS1626(activity0);
            ᵢᵢ0.FLD2719 = ـﹳ0;
            ـﹳ0.MTH800(CLS27.MTH889("select_ringtone"));
            ᵢᵢ0.FLD2719.MTH7325(CLS27.MTH889("default_text"));
            ᵢᵢ0.FLD2719.MTH7324(new CLS530(jSONObject0, activity0, 13));
            יᐧ0.MTH7296(ᵢᵢ0.FLD2719);
            CLS1635 ﾞᵎ4 = new CLS1635(activity0);
            ᵢᵢ0.FLD2718 = ﾞᵎ4;
            ﾞᵎ4.MTH800(CLS27.MTH889("enable_heads_up_notification"));
            ᵢᵢ0.FLD2718.MTH7437(jSONObject0.optBoolean("headsup_enable", false));
            ᵢᵢ0.FLD2718.MTH7438(new CLS184(jSONObject0, 1));
            יᐧ0.MTH7296(ᵢᵢ0.FLD2718);
            CLS1635 ﾞᵎ5 = new CLS1635(activity0);
            ﾞᵎ5.MTH800(CLS27.MTH889("mute_notifications_enable"));
            ﾞᵎ5.MTH7437(jSONObject0.optBoolean("ignore_mute_enable", false));
            ﾞᵎ5.MTH7438(new CLS184(jSONObject0, 2));
            יᐧ0.MTH7296(ﾞᵎ5);
            CLS1635 ﾞᵎ6 = new CLS1635(activity0);
            ﾞᵎ6.MTH800(CLS27.MTH889("notif_detail"));
            ﾞᵎ6.MTH7437(jSONObject0.optBoolean("show_notif_detail", true));
            ﾞᵎ6.MTH7438(new CLS184(jSONObject0, 3));
            יᐧ0.MTH7296(ﾞᵎ6);
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), v);
            String s = jSONObject0.optString("not_disturb_start", "23:0");
            String s1 = jSONObject0.optString("not_disturb_end", "8:0");
            String[] arr_s = s.split(":");
            String[] arr_s1 = s1.split(":");
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("startH", arr_s[0]);
            contentValues0.put("startM", arr_s[1]);
            contentValues0.put("endH", arr_s1[0]);
            contentValues0.put("endM", arr_s1[1]);
            CLS536 ˉˏ0 = new CLS536(activity0, contentValues0, ((CLS12)new CLS936(jSONObject0, 0)), ((CLS12)new CLS936(jSONObject0, 1)));
            CLS1635 ﾞᵎ7 = new CLS1635(activity0);
            ﾞᵎ7.MTH800(CLS27.MTH889("do_not_disturb"));
            ﾞᵎ7.MTH7437(jSONObject0.optBoolean("do_not_disturb", false));
            ﾞᵎ7.MTH7438(new CLS217(jSONObject0, 29));
            CLS1623 יᐧ1 = new CLS1623(activity0);
            יᐧ1.MTH7296(ﾞᵎ7);
            ˉˏ0.MTH7234(יᐧ1);
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ1), v);
            String s2 = jSONObject0.optString("ringtone", "");
            if(TextUtils.isEmpty(s2)) {
                ᵢᵢ0.FLD2719.MTH7325(CLS27.MTH889("default_text"));
            }
            else {
                Ringtone ringtone0 = RingtoneManager.getRingtone(activity0.getApplicationContext(), Uri.parse(s2));
                ᵢᵢ0.FLD2719.MTH7325(ringtone0.getTitle(activity0));
            }
            if(CLS502.MTH6943("notif_", new String[]{"new_comment", "comment_recall", "moments", "keyword"})) {
                ﾞᵎ5.MTH801(8);
            }
            if(CLS1173.MTH4443() && (jSONObject0.optBoolean("ringtone_enable", false) || jSONObject0.optBoolean("vibrate_enable", false))) {
                ᵢᵢ0.FLD2718.MTH801(0);
                return;
            }
            ᵢᵢ0.FLD2718.MTH801(8);
            return;
        }
        ᵢᵢ0.getClass();
        String s3 = (String)arr_object[0];
        JSONObject jSONObject1 = (JSONObject)arr_object[1];
        String s4 = CLS182.MTH3475(4101076044734059317L, CLS182.MTH3483(("notif_" + s3)));
        Boolean boolean0 = Boolean.valueOf(jSONObject1.optBoolean("notification_enable", false));
        ᵢᵢ0.FLD2151.MTH922(boolean0, s4);
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("notif_" + s3);
        String s5 = CLS182.MTH3475(4101075671071904565L, stringBuilder0);
        String s6 = CLS182.MTH3475(4101075778446086965L, CLS182.MTH3494(4101075726906479413L, jSONObject1, false, ᵢᵢ0.FLD2151, s5, "notif_" + s3));
        String s7 = CLS182.MTH3475(0x38E9F3502B3CD335L, CLS182.MTH3494(0x38E9F3412B3CD335L, jSONObject1, false, ᵢᵢ0.FLD2151, s6, "notif_" + s3));
        String s8 = CLS182.MTH3475(4101076603079807797L, CLS182.MTH3494(4101076534360331061L, jSONObject1, false, ᵢᵢ0.FLD2151, s7, "notif_" + s3));
        String s9 = CLS182.MTH3475(4101076186467980085L, CLS182.MTH3494(4101076122043470645L, jSONObject1, false, ᵢᵢ0.FLD2151, s8, "notif_" + s3));
        String s10 = CLS182.MTH3475(4101076353971704629L, CLS182.MTH3494(4101076272367326005L, jSONObject1, false, ᵢᵢ0.FLD2151, s9, "notif_" + s3));
        String s11 = CLS182.MTH3475(4101077062641308469L, CLS182.MTH3494(0x38E9F3CA2B3CD335L, jSONObject1, true, ᵢᵢ0.FLD2151, s10, "notif_" + s3));
        String s12 = jSONObject1.optString("not_disturb_start", "23:0");
        ᵢᵢ0.FLD2151.MTH922(s12, s11);
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("notif_" + s3);
        String s13 = CLS182.MTH3475(4101076693274121013L, stringBuilder1);
        String s14 = jSONObject1.optString("not_disturb_end", "8:0");
        ᵢᵢ0.FLD2151.MTH922(s14, s13);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("notif_" + s3);
        String s15 = CLS182.MTH3475(4101076852187910965L, stringBuilder2);
        String s16 = CLS182.MTH3475(0x38E9F04A2B3CD335L, CLS182.MTH3494(4101076920907387701L, jSONObject1, false, ᵢᵢ0.FLD2151, s15, "notif_" + s3));
        String s17 = jSONObject1.optString("ringtone", "");
        ᵢᵢ0.FLD2151.MTH922(s17, s16);
    }
}

