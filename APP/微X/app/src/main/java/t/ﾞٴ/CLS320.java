// Decompiled by JEB v5.42.0.202606242140

package t.ﾞٴ;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Pair;
import java.util.HashMap;
import org.json.JSONObject;
import t.ˆʿ.CLS41;
import t.ˊﾞ.CLS102;
import t.ٴـ.CLS117;
import t.ᵔʾ.CLS127.CLS126;
import t.ᵔʾ.CLS133;

public final class CLS320 implements CLS126 {
    public final int FLD1054;

    public CLS320(int v) {
        this.FLD1054 = v;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // t.ᵔʾ.CLS127$CLS126
    public final Object MTH2043(Object[] arr_object) {
        switch(this.FLD1054) {
            case 0: {
                return Pair.create(CLS133.MTH2099("themes_settings"), "themes_settings#4");
            }
            case 1: {
                CLS117 ˆٴ1 = CLS117.FLD842;
                ˆٴ1.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ1 = ˆٴ1.MTH1905();
                    return יﹳ1 == null || יﹳ1.MTH1819() ? false : Boolean.valueOf(יﹳ1.MTH1818(((String)arr_object[0]), false));
                }
                return false;
            }
            case 2: {
                CLS117 ˆٴ2 = CLS117.FLD842;
                ˆٴ2.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ2 = ˆٴ2.MTH1905();
                    return יﹳ2 == null || יﹳ2.MTH1819() ? null : יﹳ2.MTH1804(((String)arr_object[0]), "");
                }
                return null;
            }
            default: {
                CLS117 ˆٴ0 = CLS117.FLD842;
                ˆٴ0.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ0 = ˆٴ0.MTH1905();
                    if(יﹳ0 != null && !יﹳ0.MTH1819()) {
                        String s = (String)arr_object[0];
                        int v = (int)(((Integer)arr_object[1]));
                        int v1 = (int)(((Integer)arr_object[2]));
                        boolean z = ((Boolean)arr_object[3]).booleanValue();
                        Context context0 = CLS133.MTH2108();
                        try {
                            JSONObject jSONObject0 = יﹳ0.MTH1824(s);
                            if(jSONObject0 != null) {
                                Uri uri0 = יﹳ0.MTH1803(jSONObject0.optString("p", ""));
                                if(uri0 != null) {
                                    HashMap hashMap0 = יﹳ0.FLD771;
                                    if(z && hashMap0.containsKey(uri0.toString())) {
                                        return (Bitmap)hashMap0.get(uri0.toString());
                                    }
                                    Bitmap bitmap0 = CLS41.MTH1399(context0, jSONObject0, CLS41.MTH1396(uri0, v, v1));
                                    if(z) {
                                        hashMap0.put(uri0.toString(), bitmap0);
                                    }
                                    return bitmap0;
                                }
                            }
                        }
                        catch(Throwable throwable0) {
                            CLS133.MTH2113(throwable0);
                        }
                    }
                }
                return null;
            }
        }
    }
}

