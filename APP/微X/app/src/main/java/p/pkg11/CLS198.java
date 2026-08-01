// Decompiled by JEB v5.42.0.202606242140

package p.pkg11;

import android.text.TextUtils;
import java.net.URLDecoder;
import java.util.Iterator;
import org.json.JSONObject;
import p.pkg1.CLS4;
import p.pkg10.CLS65;
import p.pkg12.CLS76;
import p.pkg5.CLS24;
import p.pkg8.CLS44;
import p.pkg9.CLS192;
import p.pkg9.CLS207;
import p.pkg9.CLS57;

public final class CLS198 extends CLS73 {
    public final int FLD446;

    public CLS198(int v) {
        this.FLD446 = v;
        super();
    }

    // 去混淆评级： 低(31)
    // 此方法包含解密的字符串
    @Override  // p.pkg11.CLS73
    public final boolean MTH1146(String s, CLS76 ﾞᵢ0) {
        switch(this.FLD446) {
            case 0: {
                ((CLS73)this).super.MTH1146(s, ﾞᵢ0);
                CLS207 ﾞˈ1 = CLS65.MTH1117(s);
                if(ﾞˈ1 != null) {
                    ((CLS192)ﾞˈ1).MTH1038("video");
                }
                return ((CLS73)this).MTH1144(ﾞᵢ0);
            }
            case 1: {
                ((CLS73)this).super.MTH1146(s, ﾞᵢ0);
                CLS207 ﾞˈ2 = CLS65.MTH1117(s);
                if(ﾞˈ2 != null) {
                    ((CLS192)ﾞˈ2).MTH1038("video");
                }
                return ((CLS73)this).MTH1144(ﾞᵢ0);
            }
            case 2: {
                ((CLS73)this).super.MTH1146(s, ﾞᵢ0);
                CLS207 ﾞˈ3 = CLS65.MTH1117(s);
                if(ﾞˈ3 == null || ((CLS192)ﾞˈ3).MTH1038("video").isEmpty() || ((CLS192)ﾞˈ3).MTH1038("source").isEmpty()) {
                    return ((CLS73)this).MTH1144(ﾞᵢ0);
                }
                CLS73.MTH1145(ﾞᵢ0, "", "");
                return true;
            }
            case 3: {
                ((CLS73)this).super.MTH1146(s, ﾞᵢ0);
                if(s.contains("RENDER_DATA")) {
                    String s1 = s.substring(s.indexOf("RENDER_DATA"));
                    String s2 = s1.substring(s1.indexOf(">") + 1, s1.indexOf("</script>"));
                    try {
                        JSONObject jSONObject0 = new JSONObject(URLDecoder.decode(s2, "UTF-8"));
                        Iterator iterator0 = jSONObject0.keys();
                        while(iterator0.hasNext()) {
                            Object object0 = iterator0.next();
                            String s3 = (String)object0;
                            if(!"_location".equals(s3) && !"app".equals(s3)) {
                                try {
                                    JSONObject jSONObject1 = jSONObject0.getJSONObject(s3);
                                    if(jSONObject1 == null || !jSONObject1.has("aweme")) {
                                        continue;
                                    }
                                    JSONObject jSONObject2 = jSONObject1.getJSONObject("aweme").getJSONObject("detail").getJSONObject("video");
                                    CLS73.MTH1145(ﾞᵢ0, "https:" + jSONObject2.getString("playApi"), "https:" + jSONObject2.getString("cover"));
                                    return true;
                                }
                                catch(Throwable throwable1) {
                                    CLS44.MTH897(throwable1);
                                }
                            }
                        }
                    }
                    catch(Throwable throwable0) {
                        CLS44.MTH897(throwable0);
                    }
                }
                try {
                    CLS207 ﾞˈ4 = CLS65.MTH1117(s);
                    if(ﾞˈ4 == null) {
                        return ((CLS73)this).MTH1144(ﾞᵢ0);
                    }
                    CLS4 ﾞᵢ1 = ((CLS192)ﾞˈ4).MTH1038("video");
                    String s4 = "";
                    CLS4 ﾞᵢ2 = ((CLS192)(ﾞᵢ1.isEmpty() ? null : ((CLS192)ﾞᵢ1.get(0))).FLD373).MTH1038("source");
                    if(!ﾞᵢ2.isEmpty()) {
                        s4 = ((CLS57)(((CLS192)ﾞᵢ2.get(0)))).MTH984("src");
                    }
                    if(TextUtils.isEmpty(s4)) {
                        return ((CLS73)this).MTH1144(ﾞᵢ0);
                    }
                    String s5 = s4.replace("playwm", "play");
                    if(s5.startsWith("//")) {
                        s5 = "https:" + s5;
                    }
                    else if(s5.startsWith("/")) {
                        s5 = "https://www.douyin.com" + s5;
                    }
                    String s6 = CLS24.MTH813(s5);
                    if(TextUtils.isEmpty(s6)) {
                        return ((CLS73)this).MTH1144(ﾞᵢ0);
                    }
                    try {
                        if(!ﾞᵢ1.isEmpty()) {
                            CLS192 יٴ0 = (CLS192)ﾞᵢ1.get(0);
                        }
                    }
                    catch(Throwable throwable3) {
                        CLS44.MTH897(throwable3);
                    }
                    CLS73.MTH1145(ﾞᵢ0, s6, "");
                    return true;
                }
                catch(Throwable throwable2) {
                    CLS44.MTH897(throwable2);
                    return ((CLS73)this).MTH1144(ﾞᵢ0);
                }
            }
            case 4: {
                ((CLS73)this).super.MTH1146(s, ﾞᵢ0);
                boolean z = CLS65.MTH1117(s) == null;
                return ((CLS73)this).MTH1144(ﾞᵢ0);
            }
            default: {
                ((CLS73)this).super.MTH1146(s, ﾞᵢ0);
                CLS207 ﾞˈ0 = CLS65.MTH1117(s);
                if(ﾞˈ0 != null) {
                    ((CLS192)ﾞˈ0).MTH1038("video");
                }
                return ((CLS73)this).MTH1144(ﾞᵢ0);
            }
        }
    }
}

