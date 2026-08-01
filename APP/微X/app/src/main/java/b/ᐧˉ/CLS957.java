// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˈˈ.CLS82;
import b.ⁱᵔ.CLS1605;
import b.ⁱᵔ.CLS395;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS442.CLS441;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS957 implements CLS39, CLS441 {
    public final int FLD1850;
    public final File FLD1851;
    public final Activity FLD1852;
    public final CLS3 FLD1853;

    public CLS957(Activity activity0, File file0, CLS3 ˆٴ0, int v) {
        this.FLD1850 = v;
        this.FLD1852 = activity0;
        this.FLD1851 = file0;
        this.FLD1853 = ˆٴ0;
        super();
    }

    public CLS957(File file0, Activity activity0, CLS3 ˆٴ0) {
        this.FLD1850 = 2;
        super();
        this.FLD1851 = file0;
        this.FLD1852 = activity0;
        this.FLD1853 = ˆٴ0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        HashMap hashMap0 = new HashMap();
        File file0 = this.FLD1851;
        File file1 = new File(file0, "voice_db_export");
        int v = 0;
        if(CLS31.MTH1001(file1)) {
            String s = CLS31.MTH977(file1);
            if(!TextUtils.isEmpty(s)) {
                try {
                    JSONArray jSONArray0 = new JSONArray(s);
                    while(true) {
                        if(v >= jSONArray0.length()) {
                            goto label_30;
                        }
                        CLS82 יﹳ0 = new CLS82(jSONArray0.getJSONObject(v));
                        hashMap0.put(יﹳ0.FLD314, יﹳ0);
                        ++v;
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                    goto label_30;
                }
            }
        }
        else {
            File[] arr_file = file0.listFiles(new CLS214(1));
            if(arr_file != null && arr_file.length != 0) {
                while(v < arr_file.length) {
                    File file2 = arr_file[v];
                    if(file2.canRead()) {
                        String s1 = CLS31.MTH977(file2);
                        if(!TextUtils.isEmpty(s1)) {
                            try {
                                CLS82 יﹳ1 = new CLS82(new JSONObject(s1));
                                hashMap0.put(יﹳ1.FLD314, יﹳ1);
                            }
                            catch(Throwable throwable1) {
                                CLS27.MTH893(throwable1);
                            }
                        }
                    }
                    ++v;
                }
            label_30:
                Activity activity0 = this.FLD1852;
                if(hashMap0.isEmpty()) {
                    CLS412.MTH6013(activity0, CLS27.MTH889("import_failed"));
                    return;
                }
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: hashMap0.values()) {
                    String s2 = ((CLS82)object0).FLD317;
                    HashSet hashSet0 = ((CLS82)object0).FLD316;
                    if(!hashSet0.isEmpty() != 0) {
                        StringBuilder stringBuilder0 = CLS182.MTH3483(s2);
                        stringBuilder0.append("<br>");
                        stringBuilder0.append(CLS27.MTH889("tags"));
                        stringBuilder0.append(": ");
                        stringBuilder0.append(TextUtils.join(",", hashSet0));
                        s2 = stringBuilder0.toString();
                    }
                    ContentValues contentValues0 = new ContentValues();
                    contentValues0.put(CLS182.MTH3496(0x38EAC8F72B3CD335L, contentValues0, s2, 0x38EAC8FC2B3CD335L), ((CLS82)object0).FLD314);
                    arrayList0.add(contentValues0);
                }
                String s3 = CLS27.MTH889("import_");
                CLS395.MTH5722(activity0, ((CLS8)new CLS1605(hashMap0, file0, activity0, this.FLD1853)), s3, arrayList0);
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS442$CLS441
    public final void MTH6222(InputStream inputStream0) {
        CLS3 ˆٴ0 = this.FLD1853;
        File file0 = this.FLD1851;
        Activity activity0 = this.FLD1852;
        if(this.FLD1850 == 0) {
            CLS412.MTH6013(activity0, CLS27.MTH889("extracting_wait"));
            CLS1023 ˎˆ0 = new CLS1023(inputStream0, file0, ˆٴ0, 0);
            CLS40.FLD157.MTH1124(((CLS39)ˎˆ0));
            return;
        }
        CLS412.MTH6013(activity0, CLS27.MTH889("extracting_wait"));
        CLS1023 ˎˆ1 = new CLS1023(inputStream0, file0, ˆٴ0, 1);
        CLS40.FLD157.MTH1124(((CLS39)ˎˆ1));
    }
}

