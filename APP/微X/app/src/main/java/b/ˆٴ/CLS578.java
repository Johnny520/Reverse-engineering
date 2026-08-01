// Decompiled by JEB v5.42.0.202606242140

package b.ˆٴ;

import android.text.TextUtils;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.יﹳ.CLS166;
import java.util.HashMap;
import java.util.Map;

public final class CLS578 implements CLS3 {
    public final String FLD200;
    public final byte[] FLD201;
    public final Class FLD202;
    public final String FLD203;
    public final Map FLD204;
    public final Class FLD205;
    public final Class FLD206;
    public final Object FLD207;
    public final Object FLD208;

    public CLS578(Class class0, Class class1, HashMap hashMap0, Class class2, String s, Object object0, Object object1, String s1, byte[] arr_b) {
        this.FLD202 = class0;
        this.FLD205 = class1;
        this.FLD204 = hashMap0;
        this.FLD206 = class2;
        this.FLD203 = s;
        this.FLD208 = object0;
        this.FLD207 = object1;
        this.FLD200 = s1;
        this.FLD201 = arr_b;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        String s1;
        try {
            Map map0 = this.FLD204;
            Object object0 = this.FLD208;
            Object object1 = this.FLD207;
            String s = this.FLD200;
            byte[] arr_b = this.FLD201;
            boolean z = CLS27.MTH890("sendFileMethod4_b");
            Class class0 = this.FLD202;
            if(z) {
                s1 = (String)CLS166.MTH3192(class0, CLS27.MTH897("sendFileMethod4_b"), new Object[0]);
            }
            else {
                Class class1 = this.FLD205;
                if(class1 != null) {
                    s1 = (String)CLS166.MTH3192(class1, CLS27.MTH897("sendFileMethod4"), new Object[0]);
                }
                else if(!TextUtils.isEmpty(CLS27.MTH897("sendFileMethod5"))) {
                    s1 = (String)CLS166.MTH3195(CLS166.MTH3192(CLS27.MTH894("dbClass1"), CLS27.MTH897("sendFileMethod5"), new Object[0]), CLS27.MTH897("sendFileMethod4"), new Object[0]);
                }
                else {
                    s1 = null;
                }
            }
            if(!TextUtils.isEmpty(s1)) {
                String s2 = (String)map0.get(".msg.appmsg.title");
                String s3 = (String)map0.get(".msg.appmsg.appattach.fileext");
                String s4 = (String)CLS166.MTH3192(class0, CLS27.MTH897("sendFileMethod2"), new Object[]{s1, s2, s3});
                boolean z1 = TextUtils.isEmpty(CLS27.MTH897("fileOpCopyMethod_c"));
                Class class2 = this.FLD206;
                String s5 = this.FLD203;
                if(!z1) {
                    CLS166.MTH3192(class2, CLS27.MTH897("fileOpCopyMethod_c"), new Object[]{s5, s4});
                }
                else if(TextUtils.isEmpty(CLS27.MTH897("fileOpCopyMethod_b"))) {
                    CLS166.MTH3192(class2, CLS27.MTH897("fileOpCopyMethod"), new Object[]{s5, s4});
                }
                else {
                    CLS166.MTH3192(class2, CLS27.MTH897("fileOpCopyMethod_b"), new Object[]{s5, s4, Boolean.FALSE});
                }
                CLS166.MTH3192(class0, CLS27.MTH892("sendArticleMethod", "a"), new Object[]{object0, CLS166.MTH3194(object1, CLS27.MTH892("sendArticleClass1_appIdField", "appId")), CLS166.MTH3194(object1, CLS27.MTH892("sendArticleClass1_appNameField", "appName")), s, s4, arr_b, ""});
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

