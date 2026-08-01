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
import b.ʾᵢ.CLS573;
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

public final class CLS1054 implements CLS3 {
    public final int FLD2250;
    public final Activity FLD2251;
    public final CLS210 FLD2252;

    public CLS1054(int v, Activity activity0, CLS210 ˋʼ0) {
        this.FLD2250 = v;
        this.FLD2252 = ˋʼ0;
        this.FLD2251 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        Activity activity0 = this.FLD2251;
        CLS210 ˋʼ0 = this.FLD2252;
        switch(this.FLD2250) {
            case 0: {
                ˋʼ0.getClass();
                CLS523.MTH7142(activity0, ((CLS11)new CLS1073(ˋʼ0)));
                return;
            }
            case 1: {
                ˋʼ0.getClass();
                CLS476.MTH6645(activity0, ((CLS7)new CLS968(ˋʼ0, 11)), null);
                return;
            }
            case 2: {
                ˋʼ0.getClass();
                CLS523.MTH7165(activity0, CLS27.MTH889("input_url"), "", "", 1, ((CLS16)new CLS968(ˋʼ0, 9)));
                return;
            }
            case 3: {
                ˋʼ0.getClass();
                CLS523.MTH7165(activity0, CLS27.MTH889("input_url"), "", "", 1, ((CLS16)new CLS968(ˋʼ0, 10)));
                return;
            }
            case 4: {
                ˋʼ0.getClass();
                CLS523.MTH7165(activity0, CLS27.MTH889("input_url"), "", "", 1, ((CLS16)new CLS968(ˋʼ0, 6)));
                return;
            }
            case 5: {
                ˋʼ0.getClass();
                CLS476.MTH6640(activity0, ((CLS7)new CLS968(ˋʼ0, 4)));
                return;
            }
            case 6: {
                ˋʼ0.getClass();
                CLS523.MTH7165(activity0, CLS27.MTH889("tts"), "", "", 1, ((CLS16)new CLS968(ˋʼ0, 7)));
                return;
            }
            case 7: {
                ˋʼ0.getClass();
                try {
                    ArrayList arrayList0 = new ArrayList();
                    ˋʼ0.FLD2006.MTH5313(ˋʼ0.FLD2015, arrayList0);
                    HashSet hashSet0 = new HashSet();
                    ArrayList arrayList1 = new ArrayList();
                    String s = ˋʼ0.FLD2007.MTH7285();
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
                    CLS387.MTH5600(true, activity0, arrayList1, ((CLS2)new CLS1206(ˋʼ0, s)));
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 8: {
                try {
                    CLS371 ʻ0 = ˋʼ0.FLD2006;
                    ArrayList arrayList2 = ʻ0.MTH5341("");
                    ArrayList arrayList3 = new ArrayList();
                    for(Object object1: arrayList2) {
                        arrayList3.add(new CLS78(((String)object1), ʻ0.MTH5311(((String)object1))));
                    }
                    CLS387.MTH5600(true, activity0, arrayList3, ((CLS2)new CLS904(ˋʼ0)));
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 9: {
                ˋʼ0.getClass();
                CLS31.MTH1014(activity0, ((CLS12)new CLS573(5, ˋʼ0)), ((CLS12)new CLS1114(ˋʼ0)), Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
                return;
            }
            case 10: {
                ˋʼ0.getClass();
                CLS523.MTH7165(activity0, CLS27.MTH889("input_url"), "", "", 1, ((CLS16)new CLS968(ˋʼ0, 8)));
                return;
            }
            default: {
                ˋʼ0.getClass();
                CLS523.MTH7165(activity0, CLS27.MTH889("input_url"), "", "", 1, ((CLS16)new CLS968(ˋʼ0, 5)));
            }
        }
    }
}

