// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import d.ˎˏ.CLS1;
import d.יʻ.CLS69;
import d.ᐧˈ.CLS195;
import d.ᐧי.CLS110;
import d.ⁱٴ.CLS120;
import d.ⁱٴ.CLS121;
import java.util.LinkedHashMap;

public final class CLS23 implements AdapterView.OnItemClickListener {
    public final CLS110 FLD89;
    public final int FLD90;
    public final Object FLD91;
    public final LinkedHashMap FLD92;

    public CLS23(CLS110 ٴˑ0, CLS121 יʻ0, LinkedHashMap linkedHashMap0) {
        this.FLD90 = 1;
        super();
        this.FLD89 = ٴˑ0;
        this.FLD91 = יʻ0;
        this.FLD92 = linkedHashMap0;
    }

    public CLS23(CLS110 ٴˑ0, LinkedHashMap linkedHashMap0, Activity activity0) {
        this.FLD90 = 0;
        super();
        this.FLD89 = ٴˑ0;
        this.FLD92 = linkedHashMap0;
        this.FLD91 = activity0;
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        String s2;
        String s1;
        Object object0 = this.FLD91;
        LinkedHashMap linkedHashMap0 = this.FLD92;
        CLS110 ٴˑ0 = this.FLD89;
        if(this.FLD90 == 0) {
            Activity activity0 = (Activity)object0;
            try {
                String s = (String)linkedHashMap0.get(((String)ٴˑ0.getItem(v)));
                if(s.startsWith("#")) {
                    CLS1.MTH362(activity0, Uri.parse(s.substring(1)));
                    return;
                }
                if(s.startsWith("$wechatpay")) {
                    CLS28.MTH537(activity0, s.substring(s.indexOf("#") + 1), "wxpay", true);
                    return;
                }
                boolean z = false;
                if(s.startsWith("$alipay")) {
                    z = true;
                    s1 = s.substring(s.indexOf("#") + 1);
                    s2 = "alipay";
                }
                else if(s.startsWith("$qqpay")) {
                    z = true;
                    s1 = s.substring(s.indexOf("#") + 1);
                    s2 = "qqpay";
                }
                if(z) {
                    CLS28.MTH537(activity0, s1, s2, false);
                    return;
                }
                if(!s.startsWith("*")) {
                    CLS1.MTH363(activity0, s);
                    return;
                }
                LinkedHashMap linkedHashMap1 = new LinkedHashMap();
                switch(s.substring(1)) {
                    case "key": {
                        CLS28.MTH535(activity0, 1);
                        return;
                    }
                    case "lookup": {
                        if(!TextUtils.isEmpty(CLS69.MTH806("keycard_lookups"))) {
                            String[] arr_s = CLS69.MTH806("keycard_lookups").split(";");
                            linkedHashMap1.clear();
                            for(int v2 = 0; v2 < arr_s.length; ++v2) {
                                String[] arr_s1 = arr_s[v2].split(",");
                                linkedHashMap1.put(arr_s1[0].trim(), arr_s1[1].trim());
                            }
                            CLS45.MTH656(false, activity0, CLS69.MTH795("keycard_lookup"), linkedHashMap1, true, ((CLS120)new CLS195(activity0, 13)), new CLS110(activity0, linkedHashMap1.keySet()));
                            return;
                        }
                        break;
                    }
                    default: {
                        return;
                    }
                }
                if(!TextUtils.isEmpty(CLS69.MTH806("keycard_lookup"))) {
                    s = CLS69.MTH806("keycard_lookup");
                    CLS1.MTH363(activity0, s);
                    return;
                }
            }
            catch(Throwable throwable0) {
                CLS69.MTH797(throwable0);
            }
            return;
        }
        CLS121 יʻ0 = (CLS121)object0;
        try {
            יʻ0.MTH1171(linkedHashMap0.get(((String)ٴˑ0.getItem(v))));
        }
        catch(Throwable throwable1) {
            CLS69.MTH797(throwable1);
        }
    }
}

