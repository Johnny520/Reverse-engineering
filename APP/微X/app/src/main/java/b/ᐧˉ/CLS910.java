// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS40.CLS39;
import b.ˆʿ.CLS47;
import b.ˆʿ.CLS54;
import b.ˈˈ.CLS81;
import b.ˈˈ.CLS82;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;

public final class CLS910 implements CLS39 {
    public final int FLD1696;
    public final ArrayList FLD1697;
    public final File FLD1698;
    public final Activity FLD1699;

    public CLS910(File file0, ArrayList arrayList0, Activity activity0, int v) {
        this.FLD1696 = v;
        this.FLD1698 = file0;
        this.FLD1697 = arrayList0;
        this.FLD1699 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        Activity activity0 = this.FLD1699;
        ArrayList arrayList0 = this.FLD1697;
        File file0 = this.FLD1698;
        if(this.FLD1696 == 0) {
            CLS31.MTH1026(file0);
            for(Object object0: arrayList0) {
                CLS81 יᐧ0 = (CLS81)object0;
                CLS47 ˈˊ0 = CLS47.FLD167;
                if(ˈˊ0.FLD165.MTH856(יᐧ0.FLD310 + "_amr")) {
                    String s = CLS34.MTH1074(new StringBuilder(), יᐧ0.FLD310, 4100894960322925365L);
                    CLS31.MTH1037(ˈˊ0.FLD165.MTH857(s), new File(file0, CLS31.MTH979(s, "amr")));
                }
                else {
                    ArrayList arrayList1 = יᐧ0.FLD306;
                    for(int v = 0; v < arrayList1.size(); ++v) {
                        String s1 = יᐧ0.FLD310 + "_p" + v + "_amr";
                        InputStream inputStream0 = ˈˊ0.FLD165.MTH856(s1) ? ˈˊ0.FLD165.MTH857(s1) : null;
                        if(inputStream0 != null) {
                            CLS31.MTH1037(inputStream0, new File(file0, CLS31.MTH979(s1, "amr")));
                        }
                    }
                }
                CLS31.MTH1030(new File(file0, CLS31.MTH979(יᐧ0.FLD310, "json")), יᐧ0.MTH1664().toString());
            }
            CLS31.MTH981(activity0, ((CLS12)new CLS1190(0, activity0, file0)), ((CLS3)new CLS1202(0, activity0, file0)), CLS31.MTH1008().getAbsolutePath(), null);
            return;
        }
        CLS31.MTH1026(file0);
        for(Object object1: arrayList0) {
            CLS82 יﹳ0 = (CLS82)object1;
            CLS54 ᐧˉ0 = CLS54.FLD172;
            ᐧˉ0.getClass();
            if(יﹳ0 != null) {
                for(int v1 = 0; v1 < יﹳ0.MTH1678(); ++v1) {
                    String s2 = יﹳ0.MTH1674(v1);
                    InputStream inputStream1 = ᐧˉ0.FLD175.MTH857(s2);
                    if(inputStream1 != null) {
                        CLS31.MTH1037(inputStream1, new File(file0, s2));
                    }
                }
                CLS31.MTH1030(new File(file0, CLS31.MTH979(יﹳ0.FLD314, "json")), יﹳ0.MTH1671().toString());
            }
        }
        CLS31.MTH981(activity0, ((CLS12)new CLS1190(2, activity0, file0)), ((CLS3)new CLS1202(1, activity0, file0)), CLS31.MTH1008().getAbsolutePath(), null);
    }
}

