// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS2;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS78;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS387;
import java.util.ArrayList;

public final class CLS193 implements View.OnClickListener {
    public final int FLD1858;
    public final Activity FLD1859;
    public final CLS928 FLD1860;

    public CLS193(CLS928 ʼᴵ0, Activity activity0, int v) {
        this.FLD1858 = v;
        this.FLD1860 = ʼᴵ0;
        this.FLD1859 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS928 ʼᴵ0 = this.FLD1860;
        switch(this.FLD1858) {
            case 0: {
                CLS927 ʼᴵ$ﾞᐧ0 = new CLS927(ʼᴵ0);
                String s1 = ʼᴵ0.FLD2151.MTH925("custom_tailmode_list", "");
                CLS387.MTH5590(this.FLD1859, ʼᴵ0.FLD1725, ((CLS2)ʼᴵ$ﾞᐧ0), s1, null);
                return;
            }
            case 1: {
                CLS926 ʼᴵ$ﾞٴ0 = new CLS926(ʼᴵ0);
                String s2 = ʼᴵ0.FLD2151.MTH925("auto_download_chat_vid_incl", "");
                CLS387.MTH5585(true, this.FLD1859, ʼᴵ0.FLD1725, ((CLS2)ʼᴵ$ﾞٴ0), s2, -1);
                return;
            }
            case 2: {
                CLS917 ʼᴵ$ʾᵢ0 = new CLS917(ʼᴵ0);
                String s3 = ʼᴵ0.FLD2151.MTH925("auto_download_chat_vid_excl", "");
                CLS387.MTH5585(true, this.FLD1859, ʼᴵ0.FLD1725, ((CLS2)ʼᴵ$ʾᵢ0), s3, -1);
                return;
            }
            case 3: {
                CLS918 ʼᴵ$ˆʿ0 = new CLS918(ʼᴵ0);
                String s4 = ʼᴵ0.FLD2151.MTH925("auto_download_chat_img_incl2", "");
                CLS387.MTH5585(true, this.FLD1859, ʼᴵ0.FLD1725, ((CLS2)ʼᴵ$ˆʿ0), s4, -1);
                return;
            }
            case 4: {
                CLS916 ʼᴵ$ʻˑ0 = new CLS916(ʼᴵ0);
                String s5 = ʼᴵ0.FLD2151.MTH925("auto_download_chat_img_excl2", "");
                CLS387.MTH5585(true, this.FLD1859, ʼᴵ0.FLD1725, ((CLS2)ʼᴵ$ʻˑ0), s5, -1);
                return;
            }
            case 5: {
                CLS920 ʼᴵ$ˈˈ0 = new CLS920(ʼᴵ0);
                String s6 = ʼᴵ0.FLD2151.MTH925("auto_download_chat_file_incl", "");
                CLS387.MTH5585(true, this.FLD1859, ʼᴵ0.FLD1725, ((CLS2)ʼᴵ$ˈˈ0), s6, -1);
                return;
            }
            case 6: {
                CLS923 ʼᴵ$ᐧⁱ0 = new CLS923(ʼᴵ0);
                String s7 = ʼᴵ0.FLD2151.MTH925("auto_download_chat_file_excl", "");
                CLS387.MTH5585(true, this.FLD1859, ʼᴵ0.FLD1725, ((CLS2)ʼᴵ$ᐧⁱ0), s7, -1);
                return;
            }
            case 7: {
                CLS919 ʼᴵ$ˆٴ0 = new CLS919(ʼᴵ0);
                String s8 = ʼᴵ0.FLD2151.MTH925("bomb_prevention_list", "");
                CLS387.MTH5585(true, this.FLD1859, ʼᴵ0.FLD1725, ((CLS2)ʼᴵ$ˆٴ0), s8, -1);
                return;
            }
            case 8: {
                Activity activity0 = this.FLD1859;
                ʼᴵ0.getClass();
                ArrayList arrayList0 = CLS371.FLD3470.MTH5377();
                ArrayList arrayList1 = new ArrayList();
                for(Object object0: arrayList0) {
                    String s9 = (String)object0;
                    if(!CLS66.MTH1364(s9)) {
                        arrayList1.add(new CLS78(s9, CLS371.FLD3470.MTH5316(s9)));
                    }
                }
                CLS387.MTH5585(true, activity0, arrayList1, ((CLS2)new CLS924()), "", -1);
                return;
            }
            case 9: {
                Activity activity1 = this.FLD1859;
                ʼᴵ0.getClass();
                ArrayList arrayList2 = CLS371.FLD3470.MTH5377();
                ArrayList arrayList3 = new ArrayList();
                for(Object object1: arrayList2) {
                    String s10 = (String)object1;
                    if(CLS66.MTH1364(s10)) {
                        arrayList3.add(new CLS78(s10, CLS371.FLD3470.MTH5316(s10)));
                    }
                }
                CLS387.MTH5585(true, activity1, arrayList3, ((CLS2)new CLS922()), "", -1);
                return;
            }
            default: {
                CLS925 ʼᴵ$ⁱʾ0 = new CLS925(ʼᴵ0);
                String s = ʼᴵ0.FLD2151.MTH925("chat_filter_exclude", "");
                CLS387.MTH5585(true, this.FLD1859, ʼᴵ0.FLD1725, ((CLS2)ʼᴵ$ⁱʾ0), s, -1);
            }
        }
    }
}

