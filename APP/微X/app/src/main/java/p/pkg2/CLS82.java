// Decompiled by JEB v5.42.0.202606242140

package p.pkg2;

import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;
import org.json.JSONObject;
import p.pkg11.CLS74;
import p.pkg5.CLS24;
import p.pkg8.CLS44;
import p.pkg8.CLS47.CLS46;

public final class CLS82 implements CLS46 {
    public final CLS83 FLD21;

    public CLS82(CLS83 ﾞˈ0) {
        this.FLD21 = ﾞˈ0;
    }

    // 此方法包含解密的字符串
    @Override  // p.pkg8.CLS47$CLS46
    public final Boolean MTH905(Object[] arr_object) {
        byte[] arr_b2;
        InputStream inputStream0;
        byte[] arr_b;
        this.FLD21.getClass();
        String s = CLS24.MTH815(((String)arr_object[0]));
        if(!TextUtils.isEmpty(s) && this.FLD21.FLD22.FLD24.FLD287) {
            for(int v = 0; true; ++v) {
                boolean z = false;
                if(v >= 7) {
                    break;
                }
                String s1 = new String[]{"v.douyin.com", "v.kuaishou.com", "v.kuaishouapp.com", "v.ixigua.com", "b23.tv", "bilibili.com", "pipix.com"}[v];
                if(!TextUtils.isEmpty(s1) && s.contains(s1)) {
                    z = true;
                    break;
                }
            }
            if(!z) {
                if(s.startsWith("http")) {
                    if(!CLS24.MTH814(s)) {
                        try {
                            arr_b = null;
                            URL uRL0 = new URL(s);
                            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                            try {
                                byte[] arr_b1 = new byte[0x1000];
                                inputStream0 = uRL0.openStream();
                                int v1;
                                while((v1 = inputStream0.read(arr_b1)) > 0) {
                                    byteArrayOutputStream0.write(arr_b1, 0, v1);
                                }
                                arr_b2 = byteArrayOutputStream0.toByteArray();
                            }
                            catch(Throwable throwable1) {
                                arr_b2 = null;
                                goto label_34;
                            }
                            try {
                                byteArrayOutputStream0.close();
                                inputStream0.close();
                                goto label_39;
                            }
                            catch(Throwable throwable1) {
                            }
                        label_34:
                            CLS44.MTH897(throwable1);
                        }
                        catch(Throwable throwable0) {
                            CLS44.MTH897(throwable0);
                            goto label_40;
                        }
                    label_39:
                        arr_b = arr_b2;
                    label_40:
                        if(arr_b != null) {
                            try {
                                JSONObject jSONObject0 = new JSONObject(new String(arr_b));
                                if(jSONObject0.optInt("code") == 200) {
                                    JSONObject jSONObject1 = jSONObject0.getJSONObject("data");
                                    CLS74 ﾞˈ0 = new CLS74();
                                    ﾞˈ0.FLD444 = jSONObject1.getString("url");
                                    ﾞˈ0.FLD445 = jSONObject1.getString("cover");
                                    CLS24.FLD280.put(s, ﾞˈ0);
                                    return true;
                                }
                            }
                            catch(Throwable throwable2) {
                                CLS44.MTH897(throwable2);
                            }
                            return false;
                        }
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
}

