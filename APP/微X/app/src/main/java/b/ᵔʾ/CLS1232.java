// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.app.Activity;
import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ˈˈ.CLS69;
import b.ᐧˉ.CLS1028;
import b.ᐧˉ.CLS1190;
import b.ᐧˉ.CLS1192;
import b.ᐧˉ.CLS182;
import b.ᐧˉ.CLS974;
import b.ⁱᵔ.CLS1281;
import b.ⁱᵔ.CLS1383;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS395;
import b.ⁱᵔ.CLS462;
import b.ⁱᵔ.CLS466;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS528;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;

public final class CLS1232 implements CLS3 {
    public final int FLD3004;
    public final Activity FLD3005;
    public final ContentValues FLD3006;

    public CLS1232(Activity activity0, ContentValues contentValues0, int v) {
        this.FLD3004 = v;
        this.FLD3005 = activity0;
        this.FLD3006 = contentValues0;
        super();
    }

    public CLS1232(ContentValues contentValues0, Activity activity0, int v) {
        this.FLD3004 = v;
        this.FLD3006 = contentValues0;
        this.FLD3005 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        String s7;
        String s4;
        String s1;
        int v = 0;
        Activity activity0 = this.FLD3005;
        int v1 = 1000;
        ContentValues contentValues0 = this.FLD3006;
        switch(this.FLD3004) {
            case 0: {
                try {
                    if(contentValues0.containsKey("img")) {
                        CLS462.MTH6489(activity0, contentValues0.getAsString("img"));
                        return;
                    }
                    if(contentValues0.containsKey("vid")) {
                        CLS462.MTH6486(activity0, contentValues0.getAsString("vid"));
                        return;
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 1: {
                CLS528 ʽי0 = new CLS528(contentValues0.getAsString("msg"));
                String s = ʽי0.FLD5167;
                if(TextUtils.isEmpty(s)) {
                    s1 = "";
                }
                else {
                    try {
                        s1 = new JSONObject(s).optString("reason");
                    }
                    catch(Throwable throwable1) {
                        CLS27.MTH893(throwable1);
                        s1 = "";
                    }
                }
                CLS523.MTH7165(activity0, CLS27.MTH889("reason"), "", s1, 1, ((CLS16)new CLS974(s, ʽי0, contentValues0, 1)));
                return;
            }
            case 2: {
                ArrayList arrayList0 = new ArrayList();
                arrayList0.add(CLS27.MTH889("radio_order_up"));
                arrayList0.add(CLS27.MTH889("random"));
                arrayList0.add(CLS27.MTH889("order_least"));
                arrayList0.add(CLS27.MTH889("order_most"));
                CLS69 ʾᵢ0 = new CLS69();
                ʾᵢ0.MTH1560(CLS27.MTH889("radio_order_up"), 0);
                ʾᵢ0.MTH1560(CLS27.MTH889("random"), 1);
                ʾᵢ0.MTH1560(CLS27.MTH889("order_least"), 2);
                ʾᵢ0.MTH1560(CLS27.MTH889("order_most"), 3);
                CLS528 ʽי1 = new CLS528(contentValues0.getAsString("msg"));
                String s2 = ʽי1.FLD5167;
                if(!TextUtils.isEmpty(s2)) {
                    try {
                        v = new JSONObject(s2).optInt("orderType", 0);
                    }
                    catch(Throwable throwable2) {
                        CLS27.MTH893(throwable2);
                    }
                }
                CLS395.MTH5732(activity0, CLS27.MTH889("order"), arrayList0, ((String)ʾᵢ0.MTH1559(v)), ((CLS12)new CLS1028(ʾᵢ0, s2, ʽי1, contentValues0, 0)));
                return;
            }
            case 3: {
                CLS528 ʽי2 = new CLS528(contentValues0.getAsString("msg"));
                String s3 = ʽי2.FLD5167;
                if(TextUtils.isEmpty(s3)) {
                    s4 = "";
                }
                else {
                    try {
                        s4 = new JSONObject(s3).optString("reason");
                    }
                    catch(Throwable throwable3) {
                        CLS27.MTH893(throwable3);
                        s4 = "";
                    }
                }
                CLS523.MTH7165(activity0, CLS27.MTH889("reason"), "", s4, 1, ((CLS16)new CLS974(s3, ʽי2, contentValues0, 0)));
                return;
            }
            case 4: {
                if(contentValues0.containsKey("delay")) {
                    v1 = CLS182.MTH3474(4100666137350296373L, contentValues0);
                }
                CLS395.MTH5726(activity0, ((long)v1), ((CLS12)new CLS1192(contentValues0, 0)), true, true, true);
                return;
            }
            case 5: {
                ArrayList arrayList1 = new ArrayList();
                arrayList1.add(CLS27.MTH889("radio_order_up"));
                arrayList1.add(CLS27.MTH889("random"));
                arrayList1.add(CLS27.MTH889("order_least"));
                arrayList1.add(CLS27.MTH889("order_most"));
                CLS69 ʾᵢ1 = new CLS69();
                ʾᵢ1.MTH1560(CLS27.MTH889("radio_order_up"), 0);
                ʾᵢ1.MTH1560(CLS27.MTH889("random"), 1);
                ʾᵢ1.MTH1560(CLS27.MTH889("order_least"), 2);
                ʾᵢ1.MTH1560(CLS27.MTH889("order_most"), 3);
                CLS528 ʽי3 = new CLS528(contentValues0.getAsString("msg"));
                String s5 = ʽי3.FLD5167;
                if(!TextUtils.isEmpty(s5)) {
                    try {
                        v = new JSONObject(s5).optInt("orderType", 0);
                    }
                    catch(Throwable throwable4) {
                        CLS27.MTH893(throwable4);
                    }
                }
                CLS395.MTH5732(activity0, CLS27.MTH889("order"), arrayList1, ((String)ʾᵢ1.MTH1559(v)), ((CLS12)new CLS1028(ʾᵢ1, s5, ʽי3, contentValues0, 1)));
                return;
            }
            case 6: {
                CLS528 ʽי4 = new CLS528(contentValues0.getAsString("msg"));
                String s6 = ʽי4.FLD5167;
                if(TextUtils.isEmpty(s6)) {
                    s7 = "";
                }
                else {
                    try {
                        s7 = new JSONObject(s6).optString("reason");
                    }
                    catch(Throwable throwable5) {
                        CLS27.MTH893(throwable5);
                        s7 = "";
                    }
                }
                CLS523.MTH7165(activity0, CLS27.MTH889("reason"), "", s7, 1, ((CLS16)new CLS974(s6, ʽי4, contentValues0, 2)));
                return;
            }
            case 7: {
                if(contentValues0.containsKey("delay")) {
                    v1 = CLS182.MTH3474(0x38E85FC72B3CD335L, contentValues0);
                }
                CLS395.MTH5726(activity0, ((long)v1), ((CLS12)new CLS1192(contentValues0, 1)), true, true, true);
                return;
            }
            case 8: {
                CLS462.MTH6486(activity0, contentValues0.getAsString("vid"));
                return;
            }
            case 9: {
                CLS387.MTH5601(false, activity0, ((CLS2)new CLS1383(contentValues0)), -1);
                return;
            }
            case 10: {
                CLS466.MTH6533(activity0, contentValues0.getAsString("vid"), "", "");
                return;
            }
            default: {
                File file0 = new File(contentValues0.getAsString("vid"));
                CLS31.MTH995(activity0, ((CLS12)new CLS1190(1, activity0, file0)), ((CLS3)new CLS1281(file0)), CLS31.MTH1008().getAbsolutePath(), null);
            }
        }
    }
}

