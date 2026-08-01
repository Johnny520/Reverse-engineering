// Decompiled by JEB v5.42.0.202606242140

package b.ˆʿ;

import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ᐧˉ.CLS182;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class CLS51 {
    public static final class CLS49 {
    }

    public static final class CLS50 {
    }

    public final ConcurrentHashMap FLD169;
    public static final CLS51 FLD170;

    static {
        CLS51.FLD170 = new CLS51();
    }

    public CLS51() {
        this.FLD169 = new ConcurrentHashMap();
    }

    // 此方法包含解密的字符串
    public static void MTH1218(String s, Map map0) {
        String s1 = CLS182.MTH3484(4100880885715096373L, new StringBuilder(), s);
        if(!map0.containsKey(s1)) {
            return;
        }
        StringBuilder stringBuilder0 = CLS182.MTH3483(s1);
        stringBuilder0.append(".$enc_idx");
        if(map0.containsKey(stringBuilder0.toString())) {
            StringBuilder stringBuilder1 = CLS182.MTH3483(s1);
            stringBuilder1.append(".$enc_idx");
            Integer.parseInt(((String)map0.get(stringBuilder1.toString())));
        }
        StringBuilder stringBuilder2 = CLS182.MTH3483(s1);
        stringBuilder2.append(".$key");
        String s2 = (String)map0.get(stringBuilder2.toString());
        StringBuilder stringBuilder3 = CLS182.MTH3483(s1);
        stringBuilder3.append(".$md5");
        if(map0.containsKey(stringBuilder3.toString())) {
            StringBuilder stringBuilder4 = CLS182.MTH3483(s1);
            stringBuilder4.append(".$md5");
            String s3 = (String)map0.get(stringBuilder4.toString());
        }
        StringBuilder stringBuilder5 = CLS182.MTH3483(s1);
        stringBuilder5.append(".$token");
        String s4 = (String)map0.get(stringBuilder5.toString());
        String s5 = (String)map0.get(s1);
    }

    // 此方法包含解密的字符串
    public final void MTH1219(Map map0) {
        CLS49 ˑٴ$ˆٴ0;
        if(!map0.containsKey(".TimelineObject.id")) {
            return;
        }
        String s = (String)map0.get(".TimelineObject.id");
        if(!TextUtils.isEmpty(s)) {
            ConcurrentHashMap concurrentHashMap0 = this.FLD169;
            if(!concurrentHashMap0.containsKey(s)) {
                try {
                    ˑٴ$ˆٴ0 = new CLS49();
                    String s1 = (String)map0.get(".TimelineObject.contentDesc");
                    String s2 = (String)map0.get(".TimelineObject.ContentObject.title");
                    String s3 = (String)map0.get(".TimelineObject.ContentObject.contentUrl");
                    if(TextUtils.isEmpty(s3) || s3.startsWith("https://support.weixin.qq.com")) {
                        new String("");
                    }
                    ArrayList arrayList0 = new ArrayList();
                label_14:
                    for(int v = 0; v < 10; ++v) {
                        CLS50 ˑٴ$ᵔʾ0 = CLS51.MTH1220(("media" + v), map0);
                        if(ˑٴ$ᵔʾ0 == null) {
                            break;
                        }
                        arrayList0.add(ˑٴ$ᵔʾ0);
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                    ˑٴ$ˆٴ0 = null;
                    if(true) {
                        goto label_24;
                    }
                    goto label_14;
                }
            label_24:
                if(ˑٴ$ˆٴ0 != null) {
                    concurrentHashMap0.put(s, ˑٴ$ˆٴ0);
                }
            }
        }
    }

    // 此方法包含解密的字符串
    public static CLS50 MTH1220(String s, Map map0) {
        if("media0".equals(s)) {
            return CLS51.MTH1220("media", map0);
        }
        String s1 = CLS182.MTH3484(4100881315211825973L, new StringBuilder(), s);
        if(!map0.containsKey(s1)) {
            return null;
        }
        CLS50 ˑٴ$ᵔʾ0 = new CLS50();
        StringBuilder stringBuilder0 = CLS182.MTH3483(s1);
        stringBuilder0.append(".type");
        if(!map0.containsKey(stringBuilder0.toString())) {
            return null;
        }
        StringBuilder stringBuilder1 = CLS182.MTH3483(s1);
        stringBuilder1.append(".type");
        String s2 = (String)map0.get(stringBuilder1.toString());
        if(TextUtils.isEmpty(s2)) {
            return null;
        }
        Integer.parseInt(s2);
        CLS51.MTH1218((s + ".url"), map0);
        CLS51.MTH1218((s + ".thumb"), map0);
        return ˑٴ$ᵔʾ0;
    }
}

