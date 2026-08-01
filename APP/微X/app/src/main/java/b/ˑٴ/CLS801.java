// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.text.TextUtils;
import android.util.Pair;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS27;
import b.ᐧˉ.CLS182;
import b.ⁱᵔ.CLS523;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

public final class CLS801 implements CLS3 {
    public final CLS139 FLD1187;
    public final long FLD1188;
    public final ArrayList FLD1189;

    public CLS801(CLS139 ﹶʼ0, ArrayList arrayList0, long v) {
        this.FLD1187 = ﹶʼ0;
        this.FLD1189 = arrayList0;
        this.FLD1188 = v;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS139 ﹶʼ0 = this.FLD1187;
        ﹶʼ0.getClass();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        Iterator iterator0 = this.FLD1189.iterator();
        while(iterator0.hasNext()) {
            String s = "";
            Object object0 = iterator0.next();
            String s1 = (String)((Pair)object0).second;
            String s2 = "";
            new String("");
            new String("");
            new String("");
            if(!TextUtils.isEmpty(s1)) {
                if(s1.contains("[[") && s1.contains("]]")) {
                    int v = s1.indexOf("[[");
                    int v1 = s1.lastIndexOf("]]");
                    s = s1.substring(v + 2, v1);
                    s1 = CLS182.MTH3495(s1, 0, v, new StringBuilder(), v1, 2);
                }
                String s3 = s1;
                String s4 = "";
                if(s3.contains("{") && s3.contains("}")) {
                    int v2 = s3.indexOf("{");
                    int v3 = s3.lastIndexOf("}");
                    s4 = s3.substring(v2 + 1, v3);
                    s3 = CLS182.MTH3495(s3, 0, v2, new StringBuilder(), v3, 1);
                }
                String s5 = "";
                if(s3.contains("((") && s3.contains("))")) {
                    int v4 = s3.indexOf("((");
                    int v5 = s3.lastIndexOf("))");
                    s5 = s3.substring(v4 + 2, v5);
                    s3 = CLS182.MTH3495(s3, 0, v4, new StringBuilder(), v5, 2);
                }
                s4.getClass();
                s.getClass();
                s5.getClass();
                s2 = s3.trim();
            }
            linkedHashMap0.put(((String)((Pair)object0).first), s2);
        }
        CLS523.MTH7159(ﹶʼ0.MTH3026(), CLS27.MTH889("appname"), linkedHashMap0, ((CLS7)new CLS640(this.FLD1188)));
    }
}

