// Decompiled by JEB v5.42.0.202606242140

package b.ـˏ;

import b.ʾᵢ.CLS27;
import b.יﹳ.CLS166;
import b.ᵔʾ.CLS1255;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS518.CLS516;
import b.ⁱᵔ.CLS518;
import java.util.HashMap;

public final class CLS885 implements CLS169 {
    public int FLD1588;
    public boolean FLD1589;
    public final HashMap FLD1590;

    // 此方法包含解密的字符串
    public CLS885(HashMap hashMap0) {
        this.FLD1588 = -1;
        this.FLD1589 = false;
        this.FLD1590 = hashMap0;
        if(hashMap0.containsKey("thumbUrl")) {
            CLS518.MTH7068(((String)hashMap0.get("thumbUrl")), ((CLS516)new CLS1255(this, hashMap0, 8)));
            return;
        }
        this.FLD1589 = true;
    }

    @Override  // b.ـˏ.CLS169
    public final int MTH3228() {
        return 11;
    }

    @Override  // b.ـˏ.CLS169
    public final int MTH3229() {
        return this.MTH3232() + 15000;
    }

    // 去混淆评级： 低(24)
    // 此方法包含解密的字符串
    @Override  // b.ـˏ.CLS169
    public final void MTH3230(String s) {
        try {
            HashMap hashMap0 = this.FLD1590;
            Class class0 = CLS27.MTH894("sendArticleClass");
            Class class1 = CLS27.MTH894("WXMusicObject");
            Class class2 = CLS27.MTH894("WXMediaMessage");
            if(class0 != null && class1 != null && class2 != null) {
                Object object0 = CLS166.MTH3188(class1, new Object[0]);
                CLS166.MTH3198(object0, "musicDataUrl", hashMap0.get("musicDataUrl"));
                CLS166.MTH3198(object0, "musicUrl", hashMap0.get("musicUrl"));
                Object object1 = CLS166.MTH3188(class2, new Object[0]);
                CLS166.MTH3198(object1, "mediaObject", object0);
                CLS166.MTH3198(object1, "title", hashMap0.get("title"));
                CLS166.MTH3198(object1, "description", hashMap0.get("description"));
                if(hashMap0.containsKey("thumbData")) {
                    CLS166.MTH3198(object1, "thumbData", hashMap0.get("thumbData"));
                }
                String s1 = hashMap0.containsKey("app_id") ? ((String)hashMap0.get("app_id")) : "";
                String s2 = hashMap0.containsKey("app_name") ? ((String)hashMap0.get("app_name")) : "";
                CLS166.MTH3192(class0, CLS27.MTH892("sendFileMethod6", "a"), new Object[]{object1, s1, s2, s, 2, null});
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    @Override  // b.ـˏ.CLS169
    public final boolean MTH3231() {
        return this.FLD1589;
    }

    // 此方法包含解密的字符串
    @Override  // b.ـˏ.CLS169
    public final int MTH3232() {
        int v = this.FLD1588;
        return v == -1 ? CLS412.MTH6005(3000, "send_delay_text") : v;
    }

    @Override  // b.ـˏ.CLS169
    public final void MTH3233(int v) {
        this.FLD1588 = v;
    }
}

