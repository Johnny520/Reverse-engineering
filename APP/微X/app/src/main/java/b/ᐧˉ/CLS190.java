// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS78;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public final class CLS190 implements View.OnClickListener {
    public final int FLD1811;
    public final Activity FLD1812;
    public final CLS997 FLD1813;

    public CLS190(CLS997 ˋ0, Activity activity0, int v) {
        this.FLD1811 = v;
        this.FLD1813 = ˋ0;
        this.FLD1812 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS997 ˋ0 = this.FLD1813;
        switch(this.FLD1811) {
            case 0: {
                CLS994 ˋ$ˆٴ0 = new CLS994(ˋ0);
                String s = ˋ0.FLD2151.MTH925("sns_auto_export_list", "");
                CLS387.MTH5585(true, this.FLD1812, ˋ0.FLD1996, ((CLS2)ˋ$ˆٴ0), s, -1);
                return;
            }
            case 1: {
                Activity activity1 = this.FLD1812;
                ˋ0.getClass();
                HashSet hashSet0 = new HashSet(Arrays.asList(CLS502.MTH6941(ˋ0.FLD2151.MTH925("moments_post_message_exclude", ""))));
                HashSet hashSet1 = new HashSet();
                ArrayList arrayList0 = ˋ0.FLD1996;
                for(Object object0: arrayList0) {
                    CLS78 ˊﾞ0 = (CLS78)object0;
                    if(!hashSet0.contains("")) {
                        hashSet1.add("");
                    }
                }
                CLS387.MTH5585(true, activity1, arrayList0, ((CLS2)new CLS996(ˋ0)), TextUtils.join(",", hashSet1), -1);
                return;
            }
            case 2: {
                ˋ0.getClass();
                String s1 = ˋ0.FLD2151.MTH925("moments_post_message_exclude", "");
                CLS995 ˋ$ٴـ0 = new CLS995(ˋ0);
                CLS387.MTH5585(true, this.FLD1812, ˋ0.FLD1996, ((CLS2)ˋ$ٴـ0), s1, -1);
                return;
            }
            case 3: {
                ˋ0.getClass();
                ArrayList arrayList1 = new ArrayList();
                CLS371.FLD3470.MTH5381(ˋ0.FLD2157, arrayList1);
                CLS1070 יﹶ0 = new CLS1070(ˋ0);
                String s2 = ˋ0.FLD2151.MTH925("moments_filter_exclude", "");
                CLS387.MTH5585(true, this.FLD1812, arrayList1, ((CLS2)יﹶ0), s2, -1);
                return;
            }
            case 4: {
                Activity activity2 = this.FLD1812;
                ˋ0.getClass();
                CLS371 ʻ0 = CLS371.FLD3470;
                ArrayList arrayList2 = ʻ0.MTH5341("");
                ArrayList arrayList3 = new ArrayList();
                for(Object object1: arrayList2) {
                    arrayList3.add(new CLS78(((String)object1), ʻ0.MTH5311(((String)object1))));
                }
                CLS387.MTH5585(true, activity2, arrayList3, ((CLS2)new CLS973(ˋ0)), ˋ0.FLD2151.MTH925("fake_excl", ""), -1);
                return;
            }
            case 5: {
                CLS933 ʽˈ0 = new CLS933(ˋ0);
                String s3 = ˋ0.FLD2151.MTH925("like_only_list", "");
                CLS387.MTH5585(true, this.FLD1812, ˋ0.FLD1996, ((CLS2)ʽˈ0), s3, -1);
                return;
            }
            case 6: {
                CLS1199 ﹶ0 = new CLS1199(ˋ0);
                String s4 = ˋ0.FLD2151.MTH925("like_excl_list", "");
                CLS387.MTH5585(true, this.FLD1812, ˋ0.FLD1996, ((CLS2)ﹶ0), s4, -1);
                return;
            }
            case 7: {
                CLS979 ˉˎ0 = new CLS979(ˋ0);
                String s5 = ˋ0.FLD2151.MTH925("auto_comment_only_list", "");
                CLS387.MTH5585(true, this.FLD1812, ˋ0.FLD1996, ((CLS2)ˉˎ0), s5, -1);
                return;
            }
            case 8: {
                CLS1131 ᴵʼ0 = new CLS1131(ˋ0);
                String s6 = ˋ0.FLD2151.MTH925("auto_comment_excl_list", "");
                CLS387.MTH5585(true, this.FLD1812, ˋ0.FLD1996, ((CLS2)ᴵʼ0), s6, -1);
                return;
            }
            default: {
                ˋ0.getClass();
                CLS1030 ˎᵢ0 = new CLS1030(CLS27.MTH889("config_autoreply"), "configure_autoreply");
                ((CLS219)ˎᵢ0).MTH3876(this.FLD1812);
                ˎᵢ0.FLD2157 = ˋ0.FLD2157;
                Activity activity0 = ((CLS219)ˎᵢ0).MTH3883();
                CLS523.MTH7133(activity0, CLS27.MTH889("config_robot"), ((CLS379)new CLS1063(ˎᵢ0, "sns", activity0, 1)), null, null);
            }
        }
    }
}

