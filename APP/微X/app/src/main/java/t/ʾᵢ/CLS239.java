// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import t.ˆʿ.CLS38.CLS37;
import t.ˊﾞ.CLS290;
import t.ˊﾞ.CLS295;
import t.ᵔʾ.CLS133;
import t.ⁱʾ.CLS143;
import t.ⁱʾ.CLS144;

public final class CLS239 implements CLS37, CLS144 {
    public final int FLD300;
    public final CLS143 FLD301;
    public final ArrayList FLD302;

    public CLS239(ArrayList arrayList0, CLS143 ˆٴ0, int v) {
        this.FLD300 = v;
        this.FLD302 = arrayList0;
        this.FLD301 = ˆٴ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // t.ˆʿ.CLS38$CLS37
    public final void MTH1382(File file0) {
        CLS143 ˆٴ0 = this.FLD301;
        ArrayList arrayList0 = this.FLD302;
        if(this.FLD300 == 0) {
            if(file0.isFile()) {
                file0 = file0.getParentFile();
            }
            if(file0 != null && file0.isDirectory()) {
                File[] arr_file = file0.listFiles();
                if(arr_file != null && arr_file.length > 0) {
                    for(int v = 0; v < arr_file.length; ++v) {
                        File file1 = arr_file[v];
                        String s = file1.getName();
                        if(s.endsWith("jpg") || s.endsWith("png") || s.endsWith("jpeg")) {
                            try {
                                JSONObject jSONObject0 = new JSONObject();
                                jSONObject0.put("e", true);
                                jSONObject0.put("p", file1.getAbsolutePath());
                                jSONObject0.put("b", 0);
                                jSONObject0.put("c", "#00FFFFFF");
                                arrayList0.add(jSONObject0);
                            }
                            catch(Throwable throwable0) {
                                CLS133.MTH2113(throwable0);
                            }
                        }
                    }
                    ˆٴ0.MTH2169();
                }
            }
            return;
        }
        if(file0.isFile()) {
            file0 = file0.getParentFile();
        }
        if(file0 != null && file0.isDirectory()) {
            File[] arr_file1 = file0.listFiles();
            if(arr_file1 != null && arr_file1.length > 0) {
                for(int v1 = 0; v1 < arr_file1.length; ++v1) {
                    File file2 = arr_file1[v1];
                    String s1 = file2.getName();
                    if(s1.endsWith("jpg") || s1.endsWith("png") || s1.endsWith("jpeg")) {
                        try {
                            JSONObject jSONObject1 = new JSONObject();
                            jSONObject1.put("e", true);
                            jSONObject1.put("p", file2.getAbsolutePath());
                            jSONObject1.put("b", 0);
                            jSONObject1.put("c", "#00FFFFFF");
                            arrayList0.add(jSONObject1);
                        }
                        catch(Throwable throwable1) {
                            CLS133.MTH2113(throwable1);
                        }
                    }
                }
                ˆٴ0.MTH2169();
            }
        }
    }

    @Override  // t.ⁱʾ.CLS144
    public final void MTH2170(Object[] arr_object) {
        CLS143 ˆٴ0 = this.FLD301;
        ArrayList arrayList0 = this.FLD302;
        if(this.FLD300 == 1) {
            try {
                int v = (int)(((Integer)arr_object[0]));
                int v1 = Math.max(0, ((int)(((Integer)arr_object[1]))));
                CLS295 ﾞˎ0 = (CLS295)arrayList0.get(v);
                arrayList0.remove(v);
                arrayList0.add(Math.min(v1, arrayList0.size() - 1), ﾞˎ0);
                ˆٴ0.MTH2169();
            }
            catch(Throwable throwable0) {
                CLS133.MTH2113(throwable0);
            }
            return;
        }
        try {
            int v2 = (int)(((Integer)arr_object[0]));
            int v3 = Math.max(0, ((int)(((Integer)arr_object[1]))));
            CLS290 ˊﾞ0 = (CLS290)arrayList0.get(v2);
            arrayList0.remove(v2);
            arrayList0.add(Math.min(v3, arrayList0.size() - 1), ˊﾞ0);
            ˆٴ0.MTH2169();
        }
        catch(Throwable throwable1) {
            CLS133.MTH2113(throwable1);
        }
    }
}

