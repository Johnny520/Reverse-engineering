// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.ContentValues;
import android.text.TextUtils;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS43;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS502;
import java.util.ArrayList;
import java.util.Iterator;

public final class CLS862 implements CLS39 {
    public final long FLD1370;
    public final String FLD1371;
    public final long FLD1372;
    public final int FLD1373;
    public final String FLD1374;
    public final String FLD1375;
    public final CLS629 FLD1376;
    public final int FLD1377;
    public final int FLD1378;
    public final String FLD1379;

    public CLS862(CLS629 ʻˋ0, String s, int v, String s1, String s2, int v1, String s3, long v2, long v3, int v4) {
        this.FLD1373 = v4;
        this.FLD1376 = ʻˋ0;
        this.FLD1375 = s;
        this.FLD1377 = v;
        this.FLD1374 = s1;
        this.FLD1379 = s2;
        this.FLD1378 = v1;
        this.FLD1371 = s3;
        this.FLD1372 = v2;
        this.FLD1370 = v3;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        String s = this.FLD1375;
        CLS629 ʻˋ0 = this.FLD1376;
        switch(this.FLD1373) {
            case 0: {
                int v4 = this.FLD1377;
                String s4 = this.FLD1374;
                String s5 = this.FLD1379;
                int v5 = this.FLD1378;
                String s6 = this.FLD1371;
                long v6 = this.FLD1372;
                long v7 = this.FLD1370;
                ʻˋ0.getClass();
                String s7 = ((CLS43)CLS40.FLD157.MTH1118(CLS43.class)).MTH1162(s);
                if(!TextUtils.isEmpty(s7)) {
                    String[] arr_s = CLS502.MTH6941(s7);
                    ArrayList arrayList1 = new ArrayList();
                    for(int v8 = 0; v8 < arr_s.length; ++v8) {
                        String s8 = arr_s[v8];
                        if(ʻˋ0.FLD1444.MTH5383(s8)) {
                            arrayList1.add(s8);
                        }
                    }
                    ʻˋ0.MTH2044(v4, v5, v6, v7, s4, s5, s6, TextUtils.join(",", arrayList1));
                }
                return;
            }
            case 1: {
                int v9 = this.FLD1377;
                String s9 = this.FLD1374;
                String s10 = this.FLD1379;
                int v10 = this.FLD1378;
                String s11 = this.FLD1371;
                long v11 = this.FLD1372;
                long v12 = this.FLD1370;
                CLS371 ʻ1 = ʻˋ0.FLD1444;
                ArrayList arrayList2 = ʻ1.MTH5328(s);
                Iterator iterator1 = arrayList2.iterator();
                while(iterator1.hasNext()) {
                    Object object1 = iterator1.next();
                    if(!ʻ1.MTH5382(((String)object1))) {
                        iterator1.remove();
                    }
                }
                ContentValues contentValues0 = ʻˋ0.MTH2057(v9, v10, v11, v12, s9, s10, s11);
                String s12 = TextUtils.join(",", arrayList2);
                if(contentValues0 != null) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(contentValues0);
                    ʻˋ0.MTH2061(s12, arrayList3);
                }
                return;
            }
            default: {
                int v = this.FLD1377;
                String s1 = this.FLD1374;
                String s2 = this.FLD1379;
                int v1 = this.FLD1378;
                String s3 = this.FLD1371;
                long v2 = this.FLD1372;
                long v3 = this.FLD1370;
                CLS371 ʻ0 = ʻˋ0.FLD1444;
                ArrayList arrayList0 = ʻ0.MTH5328(s);
                Iterator iterator0 = arrayList0.iterator();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    if(!ʻ0.MTH5382(((String)object0))) {
                        iterator0.remove();
                    }
                }
                ʻˋ0.MTH2044(v, v1, v2, v3, s1, s2, s3, TextUtils.join(",", arrayList0));
            }
        }
    }
}

