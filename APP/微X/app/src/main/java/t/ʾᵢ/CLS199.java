// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.content.ContentValues;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import t.ˆʿ.CLS41;
import t.ˆʿ.CLS46;
import t.ˆٴ.CLS73;
import t.ˊﾞ.CLS100;
import t.ˊﾞ.CLS290;
import t.ᵔʾ.CLS133;
import t.ᵔʾ.CLS137.CLS136;
import t.ᵔʾ.CLS137;
import t.ᵔʾ.CLS300;
import t.ⁱʾ.CLS143;
import t.ﾞᐧ.CLS332;

public final class CLS199 implements CLS143 {
    public final int FLD168;
    public final Object FLD169;
    public final Object FLD170;
    public final Object FLD171;
    public final Object FLD172;

    public CLS199(Object object0, Object object1, Object object2, Object object3, int v) {
        this.FLD168 = v;
        this.FLD171 = object0;
        this.FLD170 = object1;
        this.FLD172 = object2;
        this.FLD169 = object3;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // t.ⁱʾ.CLS143
    public final void MTH2169() {
        Object object0 = this.FLD169;
        Object object1 = this.FLD172;
        Object object2 = this.FLD170;
        Object object3 = this.FLD171;
        switch(this.FLD168) {
            case 0: {
                ((CLS216)object3).getClass();
                CLS300 ـˏ0 = new CLS300(((CLS216)object3), ((ArrayList)object2), ((ArrayList)object1), ((CLS73)object0), 2);
                CLS137.FLD972.MTH2141(((CLS136)ـˏ0));
                return;
            }
            case 1: {
                CLS216 ˎﾞ0 = (CLS216)object3;
                ArrayList arrayList0 = (ArrayList)object2;
                ArrayList arrayList1 = (ArrayList)object1;
                CLS73 ﾞᐧ0 = (CLS73)object0;
                ˎﾞ0.getClass();
                try {
                    arrayList0.clear();
                    Collections.sort(arrayList1, Comparator.comparingInt(new CLS100(2)));
                    for(Object object4: arrayList1) {
                        CLS290 ˊﾞ0 = (CLS290)object4;
                        ContentValues contentValues0 = new ContentValues();
                        contentValues0.put("desc", "<b>" + ˊﾞ0.FLD755 + "</b> " + ˊﾞ0.FLD756);
                        contentValues0.put("enabled", Boolean.valueOf(ˊﾞ0.FLD752));
                        if(!TextUtils.isEmpty(ˊﾞ0.FLD757)) {
                            contentValues0.put("img_uri", ˎﾞ0.FLD236.MTH1825(ˊﾞ0.FLD757).toString());
                            contentValues0.put("img_color", (ˊﾞ0.FLD758 ? ˊﾞ0.FLD751 : ""));
                        }
                        arrayList0.add(contentValues0);
                    }
                    ﾞᐧ0.MTH1561();
                }
                catch(Throwable throwable1) {
                    CLS133.MTH2113(throwable1);
                }
                return;
            }
            default: {
                String[] arr_s = (String[])object3;
                CLS332 ʻᵎ0 = (CLS332)object2;
                String[] arr_s1 = (String[])object1;
                ImageView imageView0 = (ImageView)object0;
                try {
                    if(!TextUtils.isEmpty(arr_s[0])) {
                        Bitmap bitmap0 = CLS41.MTH1398(arr_s[0]);
                        if(bitmap0 != null) {
                            if((ʻᵎ0.FLD1101 == null ? ʻᵎ0.FLD1104 : ʻᵎ0.FLD1101.isChecked()) && !TextUtils.isEmpty(arr_s1[0])) {
                                bitmap0 = CLS41.MTH1404(bitmap0, CLS46.MTH1447(arr_s1[0]));
                            }
                            imageView0.setImageBitmap(bitmap0);
                        }
                    }
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                }
            }
        }
    }
}

