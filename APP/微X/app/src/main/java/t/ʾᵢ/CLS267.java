// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.content.ContentValues;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.json.JSONObject;
import t.ˆٴ.CLS73;
import t.ᵔʾ.CLS133;
import t.ⁱʾ.CLS143;

public final class CLS267 implements CLS143 {
    public final int FLD401;
    public final ArrayList FLD402;
    public final ArrayList FLD403;
    public final CLS73 FLD404;

    public CLS267(ArrayList arrayList0, ArrayList arrayList1, CLS73 ﾞᐧ0, int v) {
        this.FLD401 = v;
        this.FLD403 = arrayList0;
        this.FLD402 = arrayList1;
        this.FLD404 = ﾞᐧ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // t.ⁱʾ.CLS143
    public final void MTH2169() {
        CLS73 ﾞᐧ0 = this.FLD404;
        ArrayList arrayList0 = this.FLD402;
        ArrayList arrayList1 = this.FLD403;
        switch(this.FLD401) {
            case 0: {
                try {
                    arrayList1.clear();
                    for(Object object1: arrayList0) {
                        JSONObject jSONObject1 = (JSONObject)object1;
                        ContentValues contentValues1 = new ContentValues();
                        if(jSONObject1.has("p")) {
                            contentValues1.put("desc", jSONObject1.getString("p"));
                            contentValues1.put("img", jSONObject1.getString("p"));
                        }
                        contentValues1.put("enabled", jSONObject1.getString("e"));
                        arrayList1.add(contentValues1);
                    }
                    ﾞᐧ0.MTH1561();
                }
                catch(Throwable throwable1) {
                    CLS133.MTH2113(throwable1);
                }
                return;
            }
            case 1: {
                try {
                    arrayList1.clear();
                    Collections.sort(arrayList0, Comparator.comparing(new CLS21(0)));
                    for(Object object2: arrayList0) {
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("desc", "<b>" + ((JSONObject)object2).optString("t") + "</b> " + ((JSONObject)object2).optString("n"));
                        contentValues2.put("theme", ((JSONObject)object2).optString("n"));
                        contentValues2.put("time", ((JSONObject)object2).optString("t"));
                        arrayList1.add(contentValues2);
                    }
                    ﾞᐧ0.notifyDataSetChanged();
                }
                catch(Throwable throwable2) {
                    CLS133.MTH2113(throwable2);
                }
                return;
            }
            default: {
                try {
                    arrayList1.clear();
                    for(Object object0: arrayList0) {
                        JSONObject jSONObject0 = (JSONObject)object0;
                        ContentValues contentValues0 = new ContentValues();
                        if(jSONObject0.has("p")) {
                            contentValues0.put("desc", new File(jSONObject0.getString("p")).getName());
                            contentValues0.put("img", jSONObject0.getString("p"));
                        }
                        contentValues0.put("enabled", jSONObject0.getString("e"));
                        arrayList1.add(contentValues0);
                    }
                    ﾞᐧ0.MTH1561();
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                }
            }
        }
    }
}

