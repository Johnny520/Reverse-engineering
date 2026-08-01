// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.app.Activity;
import android.app.Dialog;
import android.database.Cursor;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import java.util.ArrayList;
import org.json.JSONArray;
import t.ˆʿ.CLS270;
import t.ˆʿ.CLS29;
import t.ˆʿ.CLS348;
import t.ˆʿ.CLS34;
import t.ˆʿ.CLS43;
import t.ˆʿ.CLS55.CLS53;
import t.ˆʿ.CLS55.CLS54;
import t.ˆٴ.CLS64;
import t.ˊﾞ.CLS107;
import t.ᵔʾ.CLS133;
import t.ᵔʾ.CLS303;
import t.ⁱʾ.CLS141;
import t.ⁱʾ.CLS144;

public final class CLS22 implements View.OnClickListener {
    public final int FLD305;
    public final Activity FLD306;
    public final CLS216 FLD307;

    public CLS22(CLS216 ˎﾞ0, Activity activity0, int v) {
        this.FLD305 = v;
        this.FLD307 = ˎﾞ0;
        this.FLD306 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Activity activity0 = this.FLD306;
        CLS216 ˎﾞ0 = this.FLD307;
        switch(this.FLD305) {
            case 0: {
                if(!ˎﾞ0.MTH1137() && ˎﾞ0.FLD236 != null) {
                    CLS43.MTH1435(activity0, CLS133.MTH2099("enable_fab"), new CLS200(ˎﾞ0, activity0, 4));
                }
                return;
            }
            case 1: {
                if(!ˎﾞ0.MTH1137() && ˎﾞ0.FLD236 != null) {
                    CLS43.MTH1435(activity0, CLS133.MTH2099("recent_chat_fab"), new CLS200(ˎﾞ0, activity0, 2));
                }
                return;
            }
            case 2: {
                if(!ˎﾞ0.MTH1137() && ˎﾞ0.FLD236 != null) {
                    CLS43.MTH1435(activity0, CLS133.MTH2099("enable_drawer"), new CLS200(ˎﾞ0, activity0, 0));
                }
                return;
            }
            case 3: {
                ˎﾞ0.getClass();
                ˎﾞ0.MTH1134(activity0, "");
                return;
            }
            case 4: {
                ˎﾞ0.getClass();
                ArrayList arrayList1 = new ArrayList();
                CLS34 ˊⁱ0 = CLS34.FLD463;
                String s = CLS133.MTH2112();
                ˊⁱ0.getClass();
                String s1 = CLS133.MTH2116("q_db48");
                if(!TextUtils.isEmpty(s1)) {
                    Cursor cursor0 = ˊⁱ0.MTH1364(String.format(s1, s), null);
                    if(cursor0 != null) {
                        if(cursor0.moveToFirst()) {
                            while(true) {
                                String s2 = cursor0.getString(cursor0.getColumnIndex("username"));
                                String s3 = cursor0.getString(cursor0.getColumnIndex("conRemark"));
                                String s4 = cursor0.getString(cursor0.getColumnIndex("alias"));
                                String s5 = cursor0.getString(cursor0.getColumnIndex("encryptUsername"));
                                if(TextUtils.isEmpty(s3)) {
                                    s3 = cursor0.getString(cursor0.getColumnIndex("nickname"));
                                }
                                CLS107 ᵔʾ0 = new CLS107(s2, CLS34.MTH1366(s3));
                                if(!TextUtils.isEmpty(s4)) {
                                    ᵔʾ0.FLD803 = s4;
                                }
                                if(!TextUtils.isEmpty(s5) && s5.endsWith("@stranger")) {
                                    ᵔʾ0.FLD800 = s5;
                                }
                                if(!CLS29.MTH1326(s2) || ˊⁱ0.MTH1369(s2)) {
                                    arrayList1.add(ᵔʾ0);
                                }
                                if(!cursor0.moveToNext()) {
                                    break;
                                }
                            }
                        }
                        cursor0.close();
                    }
                }
                CLS249 ᵔⁱ0 = new CLS249(ˎﾞ0, activity0);
                String s6 = ˎﾞ0.FLD135.MTH2134("rndbg_list", "");
                if(!arrayList1.isEmpty()) {
                    CLS64 ˆٴ0 = new CLS64(activity0, arrayList1, s6);
                    Dialog[] arr_dialog = {null};
                    arr_dialog[0] = CLS43.MTH1426(activity0, CLS133.MTH2099("select"), ((CLS54)new CLS270(activity0, ˆٴ0, arrayList1, arr_dialog, new int[]{-1}, ᵔⁱ0)), ((CLS53)new CLS303(null, activity0, ˆٴ0, 10)), ((CLS141)new CLS348(ᵔⁱ0)));
                }
                return;
            }
            case 5: {
                ˎﾞ0.getClass();
                ˎﾞ0.MTH1136(activity0, CLS133.MTH2099("setSplashImage"), "SplashImage");
                return;
            }
            case 6: {
                ˎﾞ0.getClass();
                ˎﾞ0.MTH1136(activity0, CLS133.MTH2099("setMainFragmentBackground"), "MainFragmentBackground");
                return;
            }
            case 7: {
                ˎﾞ0.getClass();
                ˎﾞ0.MTH1136(activity0, CLS133.MTH2099("setContactFragmentBackground"), "ContactFragmentBackground");
                return;
            }
            case 8: {
                ˎﾞ0.getClass();
                ˎﾞ0.MTH1136(activity0, CLS133.MTH2099("setDiscoverFragmentBackground"), "DiscoverFragmentBackground");
                return;
            }
            case 9: {
                ˎﾞ0.getClass();
                ˎﾞ0.MTH1136(activity0, CLS133.MTH2099("setMeFragmentBackground"), "MeFragmentBackground");
                return;
            }
            case 10: {
                ˎﾞ0.getClass();
                CLS43.MTH1433(activity0, CLS133.MTH2099("TabLayoutWechatIconSelect"), ((CLS144)new CLS303(activity0, new CLS226(ˎﾞ0, 9), new CLS226(ˎﾞ0, 10))), null, "");
                return;
            }
            case 11: {
                ˎﾞ0.getClass();
                CLS43.MTH1433(activity0, CLS133.MTH2099("TabLayoutContactsIconSelect"), ((CLS144)new CLS303(activity0, new CLS226(ˎﾞ0, 3), new CLS226(ˎﾞ0, 4))), null, "");
                return;
            }
            case 12: {
                ˎﾞ0.getClass();
                CLS43.MTH1433(activity0, CLS133.MTH2099("TabLayoutDiscoverIconSelect"), ((CLS144)new CLS303(activity0, new CLS226(ˎﾞ0, 5), new CLS226(ˎﾞ0, 6))), null, "");
                return;
            }
            case 13: {
                ˎﾞ0.getClass();
                CLS43.MTH1433(activity0, CLS133.MTH2099("TabLayoutMeIconSelect"), ((CLS144)new CLS303(activity0, new CLS226(ˎﾞ0, 7), new CLS226(ˎﾞ0, 8))), null, "");
                return;
            }
            default: {
                ˎﾞ0.getClass();
                ArrayList arrayList0 = new ArrayList();
                JSONArray jSONArray0 = ˎﾞ0.FLD236.MTH1812("ChatFooterHintArray", new JSONArray());
                for(int v = 0; true; ++v) {
                    try {
                        if(v >= jSONArray0.length()) {
                            break;
                        }
                        arrayList0.add(jSONArray0.getString(v));
                    }
                    catch(Throwable throwable0) {
                        CLS133.MTH2113(throwable0);
                        break;
                    }
                }
                CLS43.MTH1425(activity0, CLS133.MTH2099("config_chatfooter_hint"), ((CLS144)new CLS303(ˎﾞ0, activity0, arrayList0, 7)), ((CLS141)new CLS252(ˎﾞ0, arrayList0)));
            }
        }
    }
}

