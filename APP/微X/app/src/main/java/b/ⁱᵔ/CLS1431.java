// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ˆٴ.CLS66;
import b.ⁱʾ.CLS359;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public final class CLS1431 implements CLS2 {
    public final String[] FLD4225;
    public final CLS396 FLD4226;
    public final String[] FLD4227;
    public final SimpleDateFormat FLD4228;
    public final ArrayList FLD4229;
    public final CLS359 FLD4230;

    public CLS1431(String[] arr_s, SimpleDateFormat simpleDateFormat0, String[] arr_s1, ArrayList arrayList0, CLS396 ʿʽ0, CLS359 ⁱˉ0) {
        this.FLD4225 = arr_s;
        this.FLD4228 = simpleDateFormat0;
        this.FLD4227 = arr_s1;
        this.FLD4229 = arrayList0;
        this.FLD4226 = ʿʽ0;
        this.FLD4230 = ⁱˉ0;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        try {
            ArrayList arrayList1 = this.FLD4229;
            boolean z = TextUtils.isEmpty(s);
            String[] arr_s = this.FLD4225;
            arr_s[0] = z || s.contains("_ALL_") ? "" : s;
            Date date0 = this.FLD4228.parse(this.FLD4227[0]);
            arrayList1.clear();
            long v = CLS481.MTH6689(date0).getTime();
            long v1 = CLS481.MTH6695(date0).getTime();
            for(Object object0: this.FLD4226.MTH5760(v / 1000L, v1 / 1000L, arr_s[0])) {
                ContentValues contentValues0 = (ContentValues)object0;
                if(!CLS66.MTH1479(((long)contentValues0.getAsLong("id")))) {
                    arrayList1.add(contentValues0);
                }
            }
            this.FLD4230.MTH5235(arrayList1);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

