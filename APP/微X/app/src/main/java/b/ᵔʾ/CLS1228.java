// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.app.Activity;
import android.text.TextUtils;
import android.webkit.WebView;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS25;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS54;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS78;
import b.ˈˈ.CLS82;
import b.ˊﾞ.CLS101;
import b.ˑٴ.CLS731;
import b.ˑٴ.CLS770;
import b.ˑٴ.CLS789;
import b.ˑٴ.CLS881;
import b.יﹳ.CLS166;
import b.ᐧˉ.CLS1019;
import b.ᐧˉ.CLS1173;
import b.ᐧˉ.CLS182;
import b.ᐧˉ.CLS989;
import b.ⁱʾ.CLS326;
import b.ⁱᵔ.CLS380;
import b.ⁱᵔ.CLS403;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS462;
import b.ﾞˎ.CLS1626;
import b.ﾞᐧ.CLS557;
import b.ﾞᐧ.CLS559;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import org.json.JSONObject;

public final class CLS1228 implements CLS12 {
    public final int FLD2934;
    public final Object FLD2935;
    public final Object FLD2936;
    public final Object FLD2937;

    public CLS1228(CLS1237 יʼ$ˆʿ0, CLS298 יʼ0, CLS1237 יʼ$ˆʿ1) {
        this.FLD2934 = 0;
        super();
        this.FLD2936 = יʼ$ˆʿ0;
        this.FLD2937 = יʼ0;
        this.FLD2935 = יʼ$ˆʿ1;
    }

    public CLS1228(Object object0, Object object1, Object object2, int v) {
        this.FLD2934 = v;
        this.FLD2936 = object0;
        this.FLD2935 = object1;
        this.FLD2937 = object2;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        Object object1 = this.FLD2935;
        Object object2 = this.FLD2937;
        Object object3 = this.FLD2936;
        switch(this.FLD2934) {
            case 0: {
                ((CLS1237)object3).getClass();
                int v = (int)(((Integer)object0));
                if(v != -1 && v != 0) {
                    long v1 = System.currentTimeMillis();
                    CLS1236 יʼ$ʻˑ0 = new CLS1236(v);
                    יʼ$ʻˑ0.FLD3059 = ((CLS1237)object3).FLD3069 + v1;
                    ((CLS298)object2).MTH4850(((CLS296)יʼ$ʻˑ0));
                    --((CLS1237)object3).FLD3070;
                    if(((CLS1237)object3).MTH4803()) {
                        ((CLS1237)object3).FLD3061 = v1 + ((CLS1237)object3).FLD3065;
                        ((CLS298)object2).MTH4851(((CLS296)(((CLS1237)object1))));
                    }
                }
                return;
            }
            case 1: {
                CLS27.MTH895().MTH922(((File)object0).getAbsolutePath(), "settings_save_dir");
                String s = CLS31.MTH1030(new File(((File)object0), ((String)object3)), ((String)object1));
                if(!TextUtils.isEmpty(s)) {
                    CLS412.MTH6013(((Activity)object2), CLS27.MTH889("file_written_to") + s);
                }
                return;
            }
            case 2: {
                ((Set)object3).remove(((String)object1));
                if(((byte[])object0) != null) {
                    String s1 = CLS31.MTH1013(CLS27.MTH900());
                    if(CLS31.MTH1033(new File(s1), ((byte[])object0))) {
                        CLS31.MTH996(s1);
                    }
                }
                ((CLS3)object2).MTH774();
                return;
            }
            case 3: {
                ((CLS731)object3).getClass();
                CLS31.MTH1033(((File)object1), ((byte[])object0));
                String s2 = ((File)object1).getAbsolutePath();
                CLS881 ﾞˏ0 = ((CLS731)object3).FLD901;
                ﾞˏ0.FLD1488 = s2;
                CLS31.MTH990(((File)object1), CLS25.MTH865(15, ((String)object2), CLS31.MTH986(((File)object1))));
                WebView webView0 = ﾞˏ0.FLD1515;
                if(webView0 != null) {
                    webView0.loadUrl("file://" + ﾞˏ0.FLD1488);
                }
                Object object4 = ﾞˏ0.FLD1513;
                if(object4 != null) {
                    CLS166.MTH3195(object4, CLS27.MTH897("MMAnimateViewClassSetImageFilePathMethod"), new Object[]{ﾞˏ0.FLD1488});
                }
                return;
            }
            case 4: {
                ((CLS770)object3).getClass();
                CLS31.MTH1033(((File)object1), ((byte[])object0));
                if(CLS404.MTH5905()) {
                    CLS66.MTH1385(((String)object2), ((File)object1).getAbsolutePath());
                }
                else {
                    CLS66.MTH1406(CLS27.MTH904(), ((String)object2), ((File)object1).getAbsolutePath());
                }
                ((File)object1).getClass();
                CLS789 ᴵ0 = new CLS789(0, ((File)object1));
                CLS40.FLD157.MTH1123(((CLS39)ᴵ0), 10000L);
                return;
            }
            case 5: {
                ((CLS1019)object3).getClass();
                ((CLS1019)object3).MTH3822("", ((JSONObject)object0));
                ((CLS380[])object2)[0].dismiss();
                ((CLS1019)object3).MTH3824(((CLS78)object1));
                return;
            }
            case 6: {
                ((CLS1173)object3).getClass();
                CLS403.MTH5861(((Activity)object1), "WxPersonalNotificationTempl_", ((String)object0), ((ArrayList)object2), ((CLS17)new CLS989(((CLS1173)object3), 2)), ((CLS17)new CLS989(((CLS1173)object3), 3)));
                return;
            }
            case 7: {
                File file0 = (File)object3;
                CLS8 ـˏ0 = (CLS8)object2;
                CLS31.MTH1033(file0, ((byte[])object0));
                CLS31.MTH990(file0, CLS25.MTH865(15, ((String)object1), CLS31.MTH986(file0)));
                if(ـˏ0 != null) {
                    try {
                        ـˏ0.MTH786(file0.getAbsolutePath());
                        return;
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
                return;
            }
            case 8: {
                for(Object object5: ((ArrayList)object0)) {
                    File file1 = (File)object5;
                    CLS557 ˆٴ0 = CLS101.MTH1943(file1.getAbsolutePath());
                    if(ˆٴ0 == null) {
                        CLS412.MTH6013(((Activity)object3), file1.getAbsolutePath() + " " + CLS27.MTH889("failed"));
                    }
                    else {
                        CLS82 יﹳ0 = new CLS82();
                        יﹳ0.FLD317 = file1.getName();
                        int v2 = ˆٴ0.MTH7474();
                        CLS54.FLD172.MTH1243(יﹳ0, file1, v2);
                        ((ArrayList)object1).add(יﹳ0);
                        ((CLS326)object2).notifyDataSetChanged();
                    }
                }
                return;
            }
            case 9: {
                String s3 = new File(((File)object0), CLS182.MTH3475(0x38EACA102B3CD335L, CLS182.MTH3483(((String)object3)))).getAbsolutePath();
                if(((CLS559)object1).MTH7485(s3)) {
                    CLS412.MTH6013(((Activity)object2), CLS27.MTH889("file_written_to") + s3);
                }
                return;
            }
            case 10: {
                String s4 = new File(((File)object0), ((String)object3)).getAbsolutePath();
                CLS101.MTH1946(CLS462.FLD4511, CLS462.FLD4513, ((String[])object1)[0], s4);
                CLS412.MTH6013(((Activity)object2), CLS27.MTH889("file_written_to") + s4);
                return;
            }
            default: {
                if(((HashMap)object0) != null && !((HashMap)object0).isEmpty()) {
                    ((HashMap)object3).put("poiAddress", ((String)((HashMap)object0).get("address")));
                    ((HashMap)object3).put("city", ((String)((HashMap)object0).get("locality")));
                    ((HashMap)object3).put("poiName", ((String)((HashMap)object0).get("poi_name")));
                    ((HashMap)object3).put("lat", ((String)((HashMap)object0).get("lat")));
                    ((HashMap)object3).put("lng", ((String)((HashMap)object0).get("lng")));
                    ((HashMap)object3).put("poiid", ((String)((HashMap)object0).get("poiid")));
                    ((CLS1626)object1).MTH800(((String)((HashMap)object3).get("city")));
                    ((CLS1626)object2).MTH800(((String)((HashMap)object3).get("poiName")));
                }
            }
        }
    }
}

