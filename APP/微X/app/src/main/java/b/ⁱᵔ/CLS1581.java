// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.os.Environment;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS7;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ˈˈ.CLS78;
import b.ᐧˉ.CLS1207;
import b.ⁱʾ.CLS359;
import java.util.ArrayList;
import java.util.HashSet;

public final class CLS1581 implements CLS3 {
    public final int FLD4951;
    public final ArrayList FLD4952;
    public final Activity FLD4953;
    public final CLS359 FLD4954;

    public CLS1581(Activity activity0, ArrayList arrayList0, CLS359 ⁱˉ0, int v) {
        this.FLD4951 = v;
        this.FLD4953 = activity0;
        this.FLD4952 = arrayList0;
        this.FLD4954 = ⁱˉ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        Activity activity0 = this.FLD4953;
        CLS359 ⁱˉ0 = this.FLD4954;
        ArrayList arrayList0 = this.FLD4952;
        switch(this.FLD4951) {
            case 0: {
                CLS523.MTH7165(activity0, CLS27.MTH889("input_url"), "", "", 1, ((CLS16)new CLS1565(arrayList0, ⁱˉ0, 5)));
                return;
            }
            case 1: {
                CLS462.MTH6490(activity0, ((CLS12)new CLS1283(((CLS12)new CLS1207(arrayList0, ⁱˉ0, 8)), 0)));
                return;
            }
            case 2: {
                CLS395.MTH5728(activity0, ((CLS8)new CLS1350(ⁱˉ0, arrayList0)));
                return;
            }
            case 3: {
                try {
                    ArrayList arrayList1 = CLS371.FLD3470.MTH5341("");
                    ArrayList arrayList2 = new ArrayList();
                    for(Object object0: arrayList1) {
                        arrayList2.add(new CLS78(((String)object0), CLS371.FLD3470.MTH5311(((String)object0))));
                    }
                    CLS387.MTH5600(false, activity0, arrayList2, ((CLS2)new CLS1344(ⁱˉ0, arrayList0)));
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 4: {
                CLS395.MTH5727(activity0, null, ((CLS12)new CLS1207(arrayList0, ⁱˉ0, 7)));
                return;
            }
            case 5: {
                CLS31.MTH1014(activity0, ((CLS12)new CLS1207(arrayList0, ⁱˉ0, 9)), ((CLS12)new CLS1207(arrayList0, ⁱˉ0, 10)), Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
                return;
            }
            case 6: {
                CLS523.MTH7165(activity0, CLS27.MTH889("text"), "", "", 1, ((CLS16)new CLS1565(arrayList0, ⁱˉ0, 11)));
                return;
            }
            case 7: {
                CLS523.MTH7165(activity0, CLS27.MTH889("input_url"), "", "", 1, ((CLS16)new CLS1565(arrayList0, ⁱˉ0, 10)));
                return;
            }
            case 8: {
                CLS523.MTH7165(activity0, CLS27.MTH889("input_url"), "", "", 1, ((CLS16)new CLS1565(arrayList0, ⁱˉ0, 7)));
                return;
            }
            case 9: {
                CLS523.MTH7165(activity0, CLS27.MTH889("input_url"), "", "", 1, ((CLS16)new CLS1565(arrayList0, ⁱˉ0, 8)));
                return;
            }
            case 10: {
                CLS523.MTH7165(activity0, CLS27.MTH889("input_url"), "", "", 1, ((CLS16)new CLS1565(arrayList0, ⁱˉ0, 9)));
                return;
            }
            case 11: {
                CLS523.MTH7165(activity0, CLS27.MTH889("input_url"), "", "", 1, ((CLS16)new CLS1565(arrayList0, ⁱˉ0, 13)));
                return;
            }
            case 12: {
                CLS395.MTH5728(activity0, ((CLS8)new CLS1590(ⁱˉ0, arrayList0)));
                return;
            }
            case 13: {
                ArrayList arrayList3 = CLS371.FLD3470.MTH5341("");
                ArrayList arrayList4 = new ArrayList();
                for(Object object1: arrayList3) {
                    arrayList4.add(new CLS78(((String)object1), CLS371.FLD3470.MTH5311(((String)object1))));
                }
                CLS387.MTH5600(false, activity0, arrayList4, ((CLS2)new CLS1608(ⁱˉ0, arrayList0)));
                return;
            }
            case 14: {
                CLS395.MTH5740(activity0, ((CLS7)new CLS1565(arrayList0, ⁱˉ0, 12)), new HashSet());
                return;
            }
            case 15: {
                CLS31.MTH1014(activity0, ((CLS12)new CLS1207(arrayList0, ⁱˉ0, 11)), ((CLS12)new CLS1207(arrayList0, ⁱˉ0, 12)), Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
                return;
            }
            case 16: {
                CLS476.MTH6640(activity0, ((CLS7)new CLS1565(arrayList0, ⁱˉ0, 14)));
                return;
            }
            default: {
                CLS523.MTH7165(activity0, CLS27.MTH889("tts"), "", "", 1, ((CLS16)new CLS1565(arrayList0, ⁱˉ0, 6)));
            }
        }
    }
}

