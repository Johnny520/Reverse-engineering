// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.os.Environment;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ˈˈ.CLS78;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS476;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import java.util.ArrayList;
import java.util.HashSet;

public final class CLS991 implements CLS3 {
    public final int FLD1969;
    public final Activity FLD1970;
    public final CLS244 FLD1971;

    public CLS991(CLS244 ᴵʻ0, Activity activity0, int v) {
        this.FLD1969 = v;
        this.FLD1971 = ᴵʻ0;
        this.FLD1970 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        Activity activity0 = this.FLD1970;
        CLS244 ᴵʻ0 = this.FLD1971;
        switch(this.FLD1969) {
            case 0: {
                ᴵʻ0.getClass();
                CLS523.MTH7142(activity0, ((CLS11)new CLS1149(ᴵʻ0)));
                return;
            }
            case 1: {
                ᴵʻ0.getClass();
                CLS476.MTH6645(activity0, ((CLS7)new CLS939(ᴵʻ0, 9)), null);
                return;
            }
            case 2: {
                ᴵʻ0.getClass();
                CLS523.MTH7165(activity0, CLS27.MTH889("input_url"), "", "", 1, ((CLS16)new CLS939(ᴵʻ0, 6)));
                return;
            }
            case 3: {
                ᴵʻ0.getClass();
                CLS523.MTH7165(activity0, CLS27.MTH889("input_url"), "", "", 1, ((CLS16)new CLS939(ᴵʻ0, 4)));
                return;
            }
            case 4: {
                ᴵʻ0.getClass();
                CLS523.MTH7165(activity0, CLS27.MTH889("input_url"), "", "", 1, ((CLS16)new CLS939(ᴵʻ0, 7)));
                return;
            }
            case 5: {
                ᴵʻ0.getClass();
                CLS476.MTH6640(activity0, ((CLS7)new CLS939(ᴵʻ0, 5)));
                return;
            }
            case 6: {
                ᴵʻ0.getClass();
                CLS523.MTH7165(activity0, CLS27.MTH889("tts"), "", "", 1, ((CLS16)new CLS939(ᴵʻ0, 11)));
                return;
            }
            case 7: {
                ᴵʻ0.getClass();
                try {
                    ArrayList arrayList0 = new ArrayList();
                    ᴵʻ0.FLD2541.MTH5313(ᴵʻ0.FLD2546, arrayList0);
                    HashSet hashSet0 = new HashSet();
                    ArrayList arrayList1 = new ArrayList();
                    String s = ᴵʻ0.FLD2540.MTH7285();
                    if(CLS426.MTH6126(s.trim())) {
                        s = s + "|";
                    }
                    for(Object object0: arrayList0) {
                        CLS78 ˊﾞ0 = (CLS78)object0;
                        if(!hashSet0.contains("") && !CLS502.MTH6934(s, new String[]{""})) {
                            hashSet0.add("");
                            arrayList1.add(ˊﾞ0);
                        }
                    }
                    CLS372.MTH5405(arrayList1);
                    CLS387.MTH5600(true, activity0, arrayList1, ((CLS2)new CLS1174(ᴵʻ0, s)));
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 8: {
                try {
                    CLS371 ʻ0 = ᴵʻ0.FLD2541;
                    ArrayList arrayList2 = ʻ0.MTH5341("");
                    ArrayList arrayList3 = new ArrayList();
                    for(Object object1: arrayList2) {
                        arrayList3.add(new CLS78(((String)object1), ʻ0.MTH5311(((String)object1))));
                    }
                    CLS387.MTH5600(true, activity0, arrayList3, ((CLS2)new CLS1143(ᴵʻ0)));
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 9: {
                ᴵʻ0.getClass();
                CLS31.MTH1014(activity0, ((CLS12)new CLS1162(ᴵʻ0, 0)), ((CLS12)new CLS1162(ᴵʻ0, 1)), Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
                return;
            }
            case 10: {
                ᴵʻ0.getClass();
                CLS523.MTH7165(activity0, CLS27.MTH889("input_url"), "", "", 1, ((CLS16)new CLS939(ᴵʻ0, 8)));
                return;
            }
            default: {
                ᴵʻ0.getClass();
                CLS523.MTH7165(activity0, CLS27.MTH889("input_url"), "", "", 1, ((CLS16)new CLS939(ᴵʻ0, 10)));
            }
        }
    }
}

