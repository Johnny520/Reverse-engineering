// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.ImageView;
import java.util.ArrayList;
import t.ˆʿ.CLS41;
import t.ˆʿ.CLS43;
import t.ˆʿ.CLS46;
import t.ˆٴ.CLS73;
import t.ᵔʾ.CLS133;
import t.ⁱʾ.CLS141;
import t.ⁱʾ.CLS143;

public final class CLS259 implements CLS143 {
    public final int FLD365;
    public final Object FLD366;
    public final Activity FLD367;
    public final Object FLD368;
    public final Object FLD369;
    public final Object FLD370;

    public CLS259(int v, Activity activity0, CLS73 ﾞᐧ0, CLS216 ˎﾞ0, ArrayList arrayList0, ArrayList arrayList1) {
        this.FLD365 = v;
        this.FLD368 = ˎﾞ0;
        this.FLD367 = activity0;
        this.FLD369 = arrayList0;
        this.FLD366 = arrayList1;
        this.FLD370 = ﾞᐧ0;
        super();
    }

    public CLS259(String[] arr_s, String[] arr_s1, Activity activity0, int[] arr_v, ImageView imageView0) {
        this.FLD365 = 5;
        super();
        this.FLD368 = arr_s;
        this.FLD369 = arr_s1;
        this.FLD367 = activity0;
        this.FLD366 = arr_v;
        this.FLD370 = imageView0;
    }

    @Override  // t.ⁱʾ.CLS143
    public final void MTH2169() {
        Object object0 = this.FLD366;
        Object object1 = this.FLD369;
        Activity activity0 = this.FLD367;
        Object object2 = this.FLD370;
        Object object3 = this.FLD368;
        switch(this.FLD365) {
            case 0: {
                ((CLS216)object3).getClass();
                CLS43.MTH1416(activity0, ((CLS141)new CLS205(((ArrayList)object1), ((ArrayList)object0), ((CLS73)object2))));
                return;
            }
            case 1: {
                ((CLS216)object3).getClass();
                CLS43.MTH1416(activity0, ((CLS141)new CLS261(((ArrayList)object1), ((ArrayList)object0), ((CLS73)object2))));
                return;
            }
            case 2: {
                ((CLS216)object3).getClass();
                CLS43.MTH1416(activity0, ((CLS141)new CLS209(((CLS216)object3), ((ArrayList)object1), ((ArrayList)object0), ((CLS73)object2))));
                return;
            }
            case 3: {
                ((CLS216)object3).getClass();
                CLS43.MTH1416(activity0, ((CLS141)new CLS231(((ArrayList)object1), ((ArrayList)object0), ((CLS73)object2))));
                return;
            }
            case 4: {
                ((CLS216)object3).getClass();
                CLS43.MTH1416(activity0, ((CLS141)new CLS247(((ArrayList)object1), ((ArrayList)object0), ((CLS73)object2))));
                return;
            }
            default: {
                String[] arr_s = (String[])object3;
                String[] arr_s1 = (String[])object1;
                int[] arr_v = (int[])object0;
                ImageView imageView0 = (ImageView)object2;
                try {
                    if(!TextUtils.isEmpty(arr_s[0])) {
                        imageView0.setImageBitmap(CLS41.MTH1408(activity0, CLS41.MTH1397(CLS41.MTH1402(CLS41.MTH1393(arr_s[0]), 0.2f), CLS46.MTH1447(arr_s1[0])), arr_v[0]));
                    }
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                }
            }
        }
    }
}

