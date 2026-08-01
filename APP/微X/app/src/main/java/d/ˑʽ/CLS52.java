// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.text.TextUtils;
import d.יʻ.CLS58;
import d.יʻ.CLS63;
import d.יʻ.CLS66;
import d.יʻ.CLS68;
import d.יʻ.CLS69;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

public final class CLS52 {
    public static long FLD270;
    public static String FLD271;
    public static final HashMap FLD272;
    public static String FLD273;
    public static String FLD274;

    static {
        CLS52.FLD272 = new HashMap();
        CLS52.FLD270 = 0L;
    }

    // 此方法包含解密的字符串
    public static void MTH704(JSONObject jSONObject0) {
        if(jSONObject0 != null) {
            try {
                Iterator iterator0 = jSONObject0.keys();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    String s = jSONObject0.getString(((String)object0));
                    if(s.contains("#N")) {
                        s = s.replace("#N", CLS52.FLD273);
                    }
                    else if(s.contains("#B")) {
                        s = s.replace("#B", CLS52.FLD271);
                    }
                    CLS52.FLD272.put(((String)object0), s);
                }
            }
            catch(Throwable throwable0) {
                CLS69.MTH797(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    public static JSONObject MTH705() {
        if(CLS52.FLD274 == null) {
            CLS52.FLD274 = new File(CLS69.FLD336, "739440c5d87b2b8095b99f9d2a1bbf9").getAbsolutePath();
        }
        File file0 = new File(CLS52.FLD274);
        if(!file0.exists()) {
            return null;
        }
        if(CLS52.FLD270 != 0L && file0.lastModified() <= CLS52.FLD270) {
            return null;
        }
        CLS52.FLD270 = file0.lastModified();
        String s = CLS63.MTH765(file0);
        try {
            String s1 = CLS66.MTH780(CLS37.MTH601((((CLS58)CLS68.FLD326.MTH786(CLS58.class)).MTH725() + "9n4hZkF_2019")), s);
            return TextUtils.isEmpty(s1) ? null : new JSONObject(s1);
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
            return null;
        }
    }
}

