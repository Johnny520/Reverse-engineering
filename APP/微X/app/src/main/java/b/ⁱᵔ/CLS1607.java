// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS78;
import b.ˈˈ.CLS79;
import java.util.ArrayList;
import java.util.HashSet;

public final class CLS1607 implements CLS3 {
    public final int FLD5094;
    public final Activity FLD5095;
    public final CLS425 FLD5096;

    public CLS1607(CLS425 ˊﹳ0, Activity activity0, int v) {
        this.FLD5094 = v;
        this.FLD5096 = ˊﹳ0;
        this.FLD5095 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        Activity activity0 = this.FLD5095;
        CLS425 ˊﹳ0 = this.FLD5096;
        switch(this.FLD5094) {
            case 0: {
                ˊﹳ0.getClass();
                ArrayList arrayList1 = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for(Object object1: ˊﹳ0.FLD4096.MTH5051()) {
                    arrayList2.add(new CLS78(((String)object1), CLS371.FLD3470.MTH5311(((String)object1))));
                    arrayList1.add(((String)object1));
                }
                CLS387.MTH5585(false, activity0, arrayList2, ((CLS2)new CLS1323(ˊﹳ0, arrayList1)), "", -1);
                return;
            }
            case 1: {
                ˊﹳ0.getClass();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for(Object object2: ˊﹳ0.FLD4096.MTH5051()) {
                    arrayList4.add(new CLS78(((String)object2), CLS371.FLD3470.MTH5311(((String)object2))));
                    arrayList3.add(((String)object2));
                }
                CLS387.MTH5585(false, activity0, arrayList4, ((CLS2)new CLS1509(ˊﹳ0, activity0, arrayList3)), "", -1);
                return;
            }
            case 2: {
                CLS387.MTH5600(false, activity0, ˊﹳ0.FLD4096.FLD3290, ((CLS2)new CLS1575(ˊﹳ0)));
                return;
            }
            case 3: {
                CLS403.MTH5871(activity0, ˊﹳ0.FLD4088);
                return;
            }
            case 4: {
                ˊﹳ0.getClass();
                ArrayList arrayList5 = new ArrayList(ˊﹳ0.FLD4096.MTH5051());
                CLS395.MTH5744(false, activity0, arrayList5, ((CLS3)new CLS1471(ˊﹳ0, arrayList5, 7)));
                return;
            }
            case 5: {
                ArrayList arrayList6 = ˊﹳ0.FLD4096.MTH5051();
                ArrayList arrayList7 = new ArrayList();
                for(Object object3: arrayList6) {
                    String s2 = (String)object3;
                    if(!CLS372.MTH5396(s2)) {
                        arrayList7.add(new CLS78(s2, ˊﹳ0.FLD4110.MTH5316(s2)));
                    }
                }
                CLS387.MTH5585(false, activity0, arrayList7, ((CLS2)new CLS1482(ˊﹳ0)), null, -1);
                return;
            }
            case 6: {
                ArrayList arrayList8 = ˊﹳ0.FLD4096.MTH5051();
                ArrayList arrayList9 = new ArrayList();
                for(Object object4: arrayList8) {
                    String s3 = (String)object4;
                    if(CLS372.MTH5396(s3)) {
                        arrayList9.add(new CLS78(s3, ˊﹳ0.FLD4110.MTH5316(s3)));
                    }
                }
                CLS387.MTH5585(false, activity0, arrayList9, ((CLS2)new CLS1512(ˊﹳ0)), null, -1);
                return;
            }
            case 7: {
                ˊﹳ0.getClass();
                CLS395.MTH5736(CLS27.MTH889("send"), activity0, ((CLS8)new CLS1288(ˊﹳ0)), new HashSet(), false);
                return;
            }
            case 8: {
                ˊﹳ0.getClass();
                ArrayList arrayList10 = new ArrayList();
                String s4 = CLS27.MTH904();
                ˊﹳ0.FLD4110.MTH5313(s4, arrayList10);
                CLS372.MTH5405(arrayList10);
                HashSet hashSet1 = new HashSet();
                ArrayList arrayList11 = new ArrayList();
                for(Object object5: arrayList10) {
                    CLS78 ˊﾞ0 = (CLS78)object5;
                    if(!hashSet1.contains("") && CLS502.MTH6941("").length != 500) {
                        hashSet1.add("");
                        arrayList11.add(ˊﾞ0);
                    }
                }
                CLS387.MTH5600(false, activity0, arrayList11, ((CLS2)new CLS1483(ˊﹳ0)));
                return;
            }
            default: {
                ˊﹳ0.getClass();
                HashSet hashSet0 = new HashSet();
                CLS79 ˎᵢ0 = ˊﹳ0.FLD4091;
                String[] arr_s = CLS502.MTH6941(ˎᵢ0.MTH1624());
                for(int v = 0; v < arr_s.length; ++v) {
                    String s = arr_s[v];
                    if(s.startsWith("wx__c_")) {
                        hashSet0.addAll(ˎᵢ0.MTH1655(s));
                    }
                }
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: ˊﹳ0.FLD4110.MTH5377()) {
                    String s1 = (String)object0;
                    if(!hashSet0.contains(s1) && !s1.equals(ˊﹳ0.FLD4089)) {
                        arrayList0.add(new CLS78(s1, CLS371.FLD3470.MTH5311(s1)));
                    }
                }
                CLS387.MTH5585(false, activity0, arrayList0, ((CLS2)new CLS1546(ˊﹳ0)), "", -1);
            }
        }
    }
}

