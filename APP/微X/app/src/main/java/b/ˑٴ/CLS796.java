// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ᐧˉ.CLS182;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS1511;
import b.ⁱᵔ.CLS373;
import b.ⁱᵔ.CLS375;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS522;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1622.CLS539;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1629;
import b.ﾞˎ.CLS1635;
import org.json.JSONObject;

public final class CLS796 implements CLS7, CLS16, CLS17, CLS539 {
    public final int FLD1167;
    public final Activity FLD1168;

    public CLS796(Activity activity0, int v) {
        this.FLD1167 = v;
        this.FLD1168 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1622$CLS539
    public final void MTH7273(String s) {
        if(CLS502.MTH6934(s, new String[]{".mp4"})) {
            String s1 = CLS27.MTH889("sns_external_thumb_wrong_format");
            CLS412.MTH6013(this.FLD1168, s1);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        Activity activity0 = this.FLD1168;
        switch(this.FLD1167) {
            case 1: {
                LinearLayout linearLayout1 = (LinearLayout)arr_object[1];
                CLS29 ˎᵢ0 = CLS27.MTH895();
                CLS1635 ﾞᵎ0 = new CLS1635(activity0);
                ﾞᵎ0.MTH800(CLS27.MTH889("tts_enable"));
                ﾞᵎ0.MTH7437(ˎᵢ0.MTH938("tts_enable", true));
                ﾞᵎ0.MTH7438(new CLS373(ˎᵢ0, 0));
                CLS1635 ﾞᵎ1 = new CLS1635(activity0);
                ﾞᵎ1.MTH800(CLS27.MTH889("auto_tts_enable"));
                ﾞᵎ1.MTH7437(ˎᵢ0.MTH938("auto_tts_enable", false));
                ﾞᵎ1.MTH7438(new CLS373(ˎᵢ0, 1));
                CLS1623 יᐧ1 = new CLS1623(activity0);
                CLS182.MTH3498(יᐧ1, new Object[]{ﾞᵎ0, ﾞᵎ1}, 10, linearLayout1, יᐧ1);
                return;
            }
            case 2: {
                LinearLayout linearLayout2 = (LinearLayout)arr_object[1];
                TextView textView0 = new TextView(activity0);
                textView0.setText(CLS27.MTH889("stop_requests"));
                textView0.setTextSize(30.0f);
                textView0.setGravity(17);
                textView0.setTextColor(CLS522.MTH7109());
                CLS523.MTH7158(linearLayout2, textView0, true);
                return;
            }
            default: {
                LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
                CLS1626 ـﹳ0 = new CLS1626(activity0);
                ـﹳ0.MTH800(CLS27.MTH895().MTH925("moment_sig", ""));
                ـﹳ0.FLD5295 = false;
                CLS1625 ـˏ0 = new CLS1625(activity0);
                ـˏ0.MTH800(CLS27.MTH889("select"));
                ـˏ0.MTH7320(new CLS375(activity0, ـﹳ0, 1));
                CLS1629 ⁱˉ0 = new CLS1629(activity0);
                ⁱˉ0.MTH7381("none");
                ⁱˉ0.MTH7381("prepend");
                ⁱˉ0.MTH7381("append");
                int v = CLS27.MTH895().MTH927(0, "moment_sig_type");
                if(v == 1) {
                    ⁱˉ0.MTH7375(CLS370.MTH5289(0x38EA8CF92B3CD335L));
                }
                else if(v == 2) {
                    ⁱˉ0.MTH7375(CLS370.MTH5289(4101244897078334261L));
                }
                else if(v == 0) {
                    ⁱˉ0.MTH7375(CLS370.MTH5289(4101244927143105333L));
                }
                ⁱˉ0.FLD5356 = new CLS1511(6);
                CLS1623 יᐧ0 = new CLS1623(activity0);
                יᐧ0.MTH7289(new Object[]{ـﹳ0, ـˏ0, ⁱˉ0});
                יᐧ0.MTH7290(linearLayout0, 0);
            }
        }
    }

    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        if(!TextUtils.isEmpty(s)) {
            JSONObject jSONObject0 = CLS27.MTH895().MTH921("invite_key_tags");
            String s1 = CLS31.MTH979(s, "json");
            CLS31.MTH999(this.FLD1168, jSONObject0.toString(), s1);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS7
    public final void MTH784(Object object0) {
        CLS412.MTH6017(this.FLD1168, ((String)object0));
        String s = CLS27.MTH889("copy_to_clipboard");
        CLS412.MTH6014(this.FLD1168, s);
    }
}

