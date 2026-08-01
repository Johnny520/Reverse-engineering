// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import d.ˎˏ.CLS1;
import d.יʻ.CLS173;
import d.יʻ.CLS62;
import d.יʻ.CLS69;
import d.ᐧˈ.CLS195;
import d.ᐧˏ.CLS108;
import d.ⁱٴ.CLS121;

public final class CLS158 implements CLS121 {
    public final Activity FLD212;

    public CLS158(Activity activity0) {
        this.FLD212 = activity0;
    }

    // 此方法包含解密的字符串
    @Override  // d.ⁱٴ.CLS121
    public final void MTH1171(Object object0) {
        long v1;
        String s3;
        int v;
        switch(((String)object0).hashCode()) {
            case -2029660015: {
                v = ((String)object0).equals("donate_crypto") ? 3 : -1;
                break;
            }
            case -1551662660: {
                v = ((String)object0).equals("epay_qq") ? 6 : -1;
                break;
            }
            case -1414960566: {
                v = ((String)object0).equals("alipay") ? 0 : -1;
                break;
            }
            case 0xC4AE5EF3: {
                v = ((String)object0).equals("paypal") ? 1 : -1;
                break;
            }
            case -357440481: {
                v = ((String)object0).equals("donate_keycard") ? 2 : -1;
                break;
            }
            case 0x32D1AFE6: {
                v = ((String)object0).equals("epay_alipay") ? 5 : -1;
                break;
            }
            case 0x57F6D0C2: {
                v = ((String)object0).equals("epay_wechat") ? 4 : -1;
                break;
            }
            default: {
                v = -1;
            }
        }
        Activity activity0 = this.FLD212;
        switch(v) {
            case 0: {
                Intent intent0 = new Intent();
                intent0.setAction("android.intent.action.VIEW");
                String s = CLS69.MTH806("alipay_url");
                if(TextUtils.isEmpty(s)) {
                    s = CLS69.MTH806("alipay_url_b");
                }
                intent0.setData(Uri.parse((CLS69.MTH806("alipay_url2") + s)));
                if(intent0.resolveActivity(activity0.getPackageManager()) == null) {
                    intent0.setData(Uri.parse(s));
                }
                activity0.startActivity(intent0);
                return;
            }
            case 1: {
                CLS45.MTH661(activity0, CLS69.MTH795("paypal"), ((CLS8)new CLS195(activity0, 10)), ((CLS9)new CLS195(activity0, 11)), null);
                return;
            }
            case 2: {
                Object[] arr_object = {"config_donate_key", CLS1.MTH369(), activity0, Boolean.FALSE, Boolean.FALSE, ""};
                CLS62.FLD317.MTH758("settings.config", arr_object);
                return;
            }
            case 3: {
                String s1 = CLS69.MTH795("donate_crypto");
                String s2 = CLS69.MTH806("donate_crypto");
                if(!TextUtils.isEmpty(s2)) {
                    CLS45.MTH661(activity0, s1, ((CLS8)new CLS173(s2, activity0, 10)), ((CLS9)new CLS195(activity0, 9)), null);
                    return;
                }
                return;
            }
            case 4: {
                CLS28.MTH532(activity0, CLS69.MTH795("epay_wechat"), "wxpay", true);
                return;
            }
            case 5: {
                s3 = CLS69.MTH795("epay_alipay");
                v1 = 0xFFFF30072DFB3E45L;
                break;
            }
            case 6: {
                s3 = CLS69.MTH795("epay_qq");
                v1 = 0xFFFF30342DFB3E45L;
                break;
            }
            default: {
                return;
            }
        }
        CLS28.MTH532(activity0, s3, CLS108.MTH1103(v1), false);
    }
}

