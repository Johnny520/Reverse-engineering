// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ⁱʾ.CLS1274;
import b.ﾞˎ.CLS1622;
import java.util.ArrayList;
import org.json.JSONObject;

public final class CLS1561 implements CLS11 {
    public final JSONObject FLD4860;
    public final ArrayList FLD4861;
    public final boolean FLD4862;
    public final CLS1622 FLD4863;
    public final ArrayList FLD4864;
    public final CLS3 FLD4865;

    public CLS1561(JSONObject jSONObject0, CLS1622 ˑٴ0, boolean z, ArrayList arrayList0, ArrayList arrayList1, CLS1274 ﾞˎ0) {
        this.FLD4860 = jSONObject0;
        this.FLD4863 = ˑٴ0;
        this.FLD4862 = z;
        this.FLD4864 = arrayList0;
        this.FLD4861 = arrayList1;
        this.FLD4865 = ﾞˎ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        String s1;
        String s;
        try {
            ArrayList arrayList0 = this.FLD4861;
            ArrayList arrayList1 = this.FLD4864;
            JSONObject jSONObject0 = this.FLD4860;
            jSONObject0.put("content", this.FLD4863.MTH7285());
            if(!this.FLD4862) {
                ArrayList arrayList2 = new ArrayList();
                if(!arrayList1.isEmpty()) {
                    for(Object object0: arrayList1) {
                        ContentValues contentValues0 = (ContentValues)object0;
                        if(contentValues0.containsKey("img")) {
                            s = contentValues0.getAsString("img");
                        }
                        else {
                            if(!contentValues0.containsKey("url")) {
                                continue;
                            }
                            s = "url:" + contentValues0.getAsString("url");
                        }
                        arrayList2.add(s);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                if(!arrayList0.isEmpty()) {
                    for(Object object1: arrayList0) {
                        ContentValues contentValues1 = (ContentValues)object1;
                        if(contentValues1.containsKey("vid")) {
                            s1 = contentValues1.getAsString("vid");
                        }
                        else {
                            if(!contentValues1.containsKey("url")) {
                                continue;
                            }
                            s1 = "url:" + contentValues1.getAsString("url");
                        }
                        arrayList3.add(s1);
                    }
                }
                jSONObject0.put("imgPaths", TextUtils.join(",", arrayList2));
                jSONObject0.put("vidPath", TextUtils.join(",", arrayList3));
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        CLS3 ˆٴ0 = this.FLD4865;
        if(ˆٴ0 != null) {
            ˆٴ0.MTH774();
        }
    }
}

